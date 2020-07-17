package Rules.Utils;

import Rules.AST.Java.Logic.JsonObject;
import Rules.SymbolTableMu.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParse {
    public String filePath;
    public JSONParse(String path){
        filePath = path;
    }
    public void getTableFromFile(SqlType sqlType , SymbolTable symbolTable,TableSymbol tableSymbol)
    {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(filePath))
        {
            Object obj = jsonParser.parse(reader);
            JSONArray table = (JSONArray) obj;
            table.forEach( row -> parseObject((JSONObject)row , sqlType,symbolTable,tableSymbol));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseObject(JSONObject object , SqlType sqlType , SymbolTable symbolTable,TableSymbol tableSymbol)
    {
        for(int i=0;i<sqlType.entries.size();i++){
            if(symbolTable.sqlTypes.containsKey(sqlType.entries.get(i).type)
                    && symbolTable.scopeStack.peek().findSymbol(sqlType.entries.get(i).type)!=null &&
                    symbolTable.scopeStack.peek().findSymbol(sqlType.entries.get(i).type) instanceof TableSymbol){
                JSONArray array = ((JSONArray)object.get(sqlType.entries.get(i).name));
                TableSymbol innerTableSymbol1 = new TableSymbol();
                ColumnSymbol columnSymbol = tableSymbol.values.get(sqlType.entries.get(i).name);
                innerTableSymbol1.name = columnSymbol.type;
                innerTableSymbol1.type = columnSymbol.type;
                SqlType temp = symbolTable.sqlTypes.get(columnSymbol.type);
                for(int j=0;j<temp.entries.size();j++){
                    ColumnSymbol newColumnSymbol = new ColumnSymbol();
                    newColumnSymbol.name = temp.entries.get(j).name;
                    newColumnSymbol.type = temp.entries.get(j).type;
                    innerTableSymbol1.values.put(newColumnSymbol.name,newColumnSymbol);
                }
                array.forEach(row ->{
                    parseObject((JSONObject) row,temp,symbolTable,innerTableSymbol1);
                });
                columnSymbol.values.add(innerTableSymbol1);
            }
            else if(symbolTable.sqlTypes.containsKey(sqlType.entries.get(i).type)){
                SqlType temp = symbolTable.sqlTypes.get(sqlType.entries.get(i).type);
                ColumnSymbol columnSymbol = tableSymbol.values.get(sqlType.entries.get(i).name);
                JSONObject type= ((JSONObject)object.get(sqlType.entries.get(i).name));
                TypeSymbol typeSymbol = new TypeSymbol();
                typeSymbol.type = columnSymbol.type;
                typeSymbol.name = columnSymbol.type;
                parseTypeSymbol(type,temp,symbolTable,typeSymbol);
                columnSymbol.values.add(typeSymbol);
            }
            else{
                ColumnSymbol columnSymbol = tableSymbol.values.get(sqlType.entries.get(i).name);
                if(columnSymbol.type.equals("String"))
                    columnSymbol.values.add( object.get((sqlType.entries.get(i).name)));
                else if(columnSymbol.type.equals("Boolean")){
                    if( object.get((sqlType.entries.get(i).name)).equals("true") ){
                        columnSymbol.values.add(true);
                    }
                    else if(object.get((sqlType.entries.get(i).name)).equals("false")){
                        columnSymbol.values.add(false);
                    }
                }else{
                    columnSymbol.values.add(Double.parseDouble((String) object.get((sqlType.entries.get(i).name))));
                }
            }
        }
    }
    private static void parseTypeSymbol(JSONObject object , SqlType sqlType , SymbolTable symbolTable,TypeSymbol typeSymbol){
        for(SqlTypeEntry entry : sqlType.entries){
            if(symbolTable.sqlTypes.containsKey(entry.type) &&
                    symbolTable.scopeStack.peek().findSymbol(entry.type)!=null &&
                    symbolTable.scopeStack.peek().findSymbol(entry.type) instanceof TableSymbol){
                SqlType temp = symbolTable.sqlTypes.get(entry.type);
                JSONArray array = ((JSONArray)object.get(entry.name));
                TableSymbol innerTableSymbol = new TableSymbol();
                innerTableSymbol.name = entry.type;
                innerTableSymbol.type = entry.type;
                for (SqlTypeEntry innerEntry : temp.entries){
                    ColumnSymbol columnSymbol = new ColumnSymbol();
                    columnSymbol.name = innerEntry.type;
                    columnSymbol.type = innerEntry.type;
                    innerTableSymbol.values.put(columnSymbol.name,columnSymbol);
                }
                array.forEach(obj->{
                    parseObject((JSONObject) obj,temp,symbolTable,innerTableSymbol);
                });
                typeSymbol.values.put(innerTableSymbol.name,innerTableSymbol);
            }else if(symbolTable.sqlTypes.containsKey(entry.type)){
                SqlType innerType = symbolTable.sqlTypes.get(entry.type);
                TypeSymbol innerTypeSymbol = new TypeSymbol();
                innerTypeSymbol.name = entry.type;
                innerTypeSymbol.type = entry.type;
                parseTypeSymbol(object,innerType,symbolTable,innerTypeSymbol);
                typeSymbol.values.put(innerTypeSymbol.name,innerTypeSymbol);
            }else {
                //ColumnSymbol columnSymbol = tableSymbol.values.get(sqlType.entries.get(i).name);
                Symbol symbol = new Symbol();
                symbol.name = entry.name;
                symbol.type = entry.type;
                if(symbol.type.equals("String"))
                    symbol.value = ( object.get((entry.name)));
                else if(symbol.type.equals("Boolean")){
                    if( object.get((entry.name)).equals("true") ){
                        symbol.value = true;
                    }
                    else if(object.get((entry)).equals("false")){
                        symbol.value = false;
                    }
                }else{
                    symbol.value = Double.parseDouble((String) object.get((entry.name)));
                }
                typeSymbol.values.put(symbol.name,symbol);
            }
        }
    }
}
