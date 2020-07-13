package Rules.Utils;

import Rules.AST.Java.Logic.JsonObject;
import Rules.SymbolTableMu.ColumnSymbol;
import Rules.SymbolTableMu.SqlType;
import Rules.SymbolTableMu.SymbolTable;
import Rules.SymbolTableMu.TableSymbol;

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
                    try {
                        columnSymbol.values.add(NumberFormat.getInstance().parse((String) object.get((sqlType.entries.get(i).name))));
                    } catch (java.text.ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
