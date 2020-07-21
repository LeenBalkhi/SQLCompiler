package CodeGen;

import java.io.*;

import Rules.AST.SQL.DDL.CreateTableStatement;
import Rules.SymbolTableMu.SqlType;
import Rules.SymbolTableMu.SqlTypeEntry;
import Rules.SymbolTableMu.SymbolTable;
import Rules.SymbolTableMu.TableSymbol;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {

    Writer output;

    public CreateTableStatement cr_table;
    public SqlType sqlType;
    public JsonParser(CreateTableStatement temp){
        cr_table = temp;
        sqlType = cr_table.sqlType;
    }

    public void WriteFile(){
        try {
            OpenFile(cr_table.tableName.name);
            output.append("package CodeGen.CreatedClasses;\n\n");
            output.append("import org.json.simple.JSONArray;;\n" +
                    "import com.google.gson.*;\n" +
                    "import com.google.gson.stream.JsonReader;\n"+
                    "import java.io.*;\n" +
                    "import java.util.*;\n"+
                    "import java.lang.reflect.Field;\n"+
                    "import Rules.SymbolTableMu.*;\n");
            output.append("public class " + cr_table.tableName.name + " {\n\n");
            for(SqlTypeEntry entry : sqlType.entries){
                if(entry.type.equalsIgnoreCase("number")){
                    output.append("\tpublic double " + entry.name +";\n");
                }else if(entry.type.equalsIgnoreCase("string")){
                    output.append("\tpublic String " + entry.name+ ";\n");
                }else if(entry.type.equalsIgnoreCase("boolean")){
                    output.append("\tpublic boolean " + entry.name+ ";\n");
                }else {
                    if(entry.isTable){
                        output.append("\tpublic "+ entry.type +"[] "+ entry.name+";\n");
                    }else if(entry.isType){
                        output.append("\tpublic "+ entry.type +" "+ entry.name+";\n");
                    }
                }
            }
            output.append("\tpublic static ArrayList<" + cr_table.tableName.name + "> My" + cr_table.tableName.name + " = new ArrayList<>();\n\n");

            output.append("private ArrayList<"+ cr_table.tableName.name +"> load() throws IOException { \n");
            output.append("Gson gson = new Gson();\n");
            output.append("JsonReader reader = new JsonReader(new FileReader(\"" + cr_table.path + "\"));\n");
            output.append("JsonObject jsonObject = gson.fromJson(reader,JsonObject.class);\n");
            output.append("JsonElement jsonElement = jsonObject.get(\"" + cr_table.tableName.name+ "\");\n");
            output.append(cr_table.tableName.name + " [] data = gson.fromJson(jsonElement," + cr_table.tableName.name + "[].class);\n");
            output.append("for(int i=0;i<data.length;i++){\n");
            output.append("My" + cr_table.tableName.name + ".add(data[i]);\n");
            output.append("}\n"); // End of for
            output.append("return My" + cr_table.tableName.name +";\n");
            output.append("}\n"); // End of load

//            output.append("\tpublic void getTableFromFile(SqlType sqlType , SymbolTable symbolTable) {\n");
//
//            output.append("\t\tJSONParser jsonParser = new JSONParser();\n");
//
//            output.append("\t\ttry (FileReader reader = new FileReader(\""+cr_table.path+"\"))\n" +
//                    "        {\n" +
//                    "            Object obj = jsonParser.parse(reader);\n" +
//                    "            JSONArray table = (JSONArray) obj;\n" +
//                    "            table.forEach( row -> parseObject((JSONObject)row , sqlType,symbolTable));\n" +
//                    "\n" +
//                    "        } catch (FileNotFoundException e) {\n" +
//                    "            e.printStackTrace();\n" +
//                    "        } catch (IOException e) {\n" +
//                    "            e.printStackTrace();\n" +
//                    "        } catch (ParseException e) {\n" +
//                    "            e.printStackTrace();\n" +
//                    "        }   \n" );
//            output.append("\t}\n"); // End of Function getTableFromFile
//
//            output.append("\tpublic static void parseObject(JSONObject object ,SqlType sqlType , SymbolTable symbolTable) {\n");


//            output.append("\t"+cr_table.tableName.name+" my"+cr_table.tableName.name+" = new "+cr_table.tableName.name+"();\n"+
//                    "\tfor(SqlTypeEntry entry : sqlType.entries){\n" +
//                    "            if(symbolTable.sqlTypes.containsKey(entry.type)\n" +
//                    "                    && symbolTable.scopeStack.peek().findSymbol(entry.type)!=null &&\n" +
//                    "                    symbolTable.scopeStack.peek().findSymbol(entry.type) instanceof TableSymbol){\n"+
//                    "                "+
//                    "                JSONArray array = ((JSONArray)object.get(entry.name));"+
//                    "                Field f = null;\n"+
//                    "                try {\n" +
//                    "                    f = "+ cr_table.tableName.name+".class.getField(entry.name);\n" +
//                    "                } catch (NoSuchFieldException e) {\n" +
//                    "                    e.printStackTrace();\n" +
//                    "                }\n"+
//
//                    "                try {\n" +
//                    "                     f.set(my"+cr_table.tableName.name+",object.get((entry.name)));\n" +
//                    "                 } catch (IllegalAccessException e) {\n" +
//                    "                     e.printStackTrace();\n" +
//                    "                array.forEach(row ->{\n" +
//                    "                    parseObject((JSONObject) row,temp,symbolTable,innerTableSymbol1);\n" +
//                    "                });"+
//                    "            else{\n" +
//                    "                   Field f = null;\n"+
//                    "                   try {\n" +
//                    "                       f = "+ cr_table.tableName.name+".class.getField(entry.name);\n" +
//                    "                   } catch (NoSuchFieldException e) {\n" +
//                    "                       e.printStackTrace();\n" +
//                    "                   }\n"+
//                    "                   if(entry.type.equals(\"String\"))\n" +
//                    "                       try {\n" +
//                    "                           f.set(my"+cr_table.tableName.name+",object.get((entry.name)));\n" +
//                    "                       } catch (IllegalAccessException e) {\n" +
//                    "                           e.printStackTrace();\n" +
//                    "                       }\n"+
//                    "                   if(entry.type.equals(\"Number\"))\n" +
//                    "                       try {\n" +
//                    "                           f.set(my"+cr_table.tableName.name+",Double.parseDouble(object.get((entry.name)).toString()));\n" +
//                    "                       } catch (IllegalAccessException e) {\n" +
//                    "                           e.printStackTrace();\n" +
//                    "                       }\n"+
//                    "                   if(entry.type.equals(\"Boolean\"))\n" +
//                    "                       try {\n" +
//                    "                           f.set(my"+cr_table.tableName.name+",Double.parseDouble(object.get((entry.name)).toString()));\n" +
//                    "                       } catch (IllegalAccessException e) {\n" +
//                    "                           e.printStackTrace();\n" +
//                    "                       }\n"+
//                    "                My"+cr_table.tableName.name+".add(my"+cr_table.tableName.name+");\n"+
//                    "            }\n"+
//                    "         }\n   ");

//            output.append("\t}\n"); // End of Function parseObject

            output.append("public List<" + cr_table.tableName.name + "> getData() {\n");
            output.append("try{\n" +
                    "return load();\n}"
            +"catch(Exception e){\n" +
            "return null;}\n");
            output.append("}\n"); // End of get data

            output.append("\n}\n"); // End of Class

            output.close();
        }catch (IOException e) {
            System.out.println("IOException in FileWriter");
        }
    }

    public void OpenFile(String table_name) {
        try {
            String name = "C:\\Users\\Dell\\Documents\\GitHub\\SQLCompiler\\src\\CodeGen\\CreatedClasses\\" + table_name + ".java";
            output = new BufferedWriter(new FileWriter(name));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }


}
