package CodeGen;


import Rules.AST.SQL.DDL.CreateTableStatement;
import Rules.AST.SQL.Database.ColumnDef;
import Rules.SymbolTableMu.SqlType;
import Rules.SymbolTableMu.SqlTypeEntry;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CsvParser {

    Writer output;

    public CreateTableStatement cr_table;
    public SqlType sqlType;
    public CsvParser(CreateTableStatement temp){
        cr_table = temp;
        sqlType = cr_table.sqlType;
    }

    public void WriteFile(){
        try {
            OpenFile(cr_table.tableName.name);
            output.append("package CodeGen.CreatedClasses;\n\n");
            output.append("import org.json.simple.JSONArray;;\n" +
                    "import CodeGen.DBTable;\n"+
                    "import Rules.AST.SQL.DDL.CreateTableStatement;\n"+
                    "import com.google.gson.*;\n" +
                    "import com.google.gson.stream.JsonReader;\n"+
                    "import java.io.*;\n" +
                    "import java.util.*;\n"+
                    "import java.lang.reflect.Field;\n"+
                    "import Rules.SymbolTableMu.*;\n"+
                    "import java.lang.annotation.*;\n");
            output.append("public class " + cr_table.tableName.name + " {\n\n");
            for(SqlTypeEntry entry : sqlType.entries){
                if(entry.type.equalsIgnoreCase("number")){
                    output.append("\t@DBTable(columnName =\""+ entry.name +"\")\n");
                    output.append("\tpublic double " + entry.name +";\n");
                }else if(entry.type.equalsIgnoreCase("string")){
                    output.append("\t@DBTable(columnName =\""+ entry.name +"\")\n");
                    output.append("\tpublic String " + entry.name+ ";\n");
                }else if(entry.type.equalsIgnoreCase("boolean")){
                    output.append("\t@DBTable(columnName =\""+ entry.name +"\")\n");
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

            output.append("\tprivate ArrayList<"+ cr_table.tableName.name +"> load() throws IOException { \n");
            output.append(" \tBufferedReader csvReader = new BufferedReader(new FileReader(\""+cr_table.path+"\"));\n" +
                    "\tString row=\"\";\n"+
                    "\twhile ((row = csvReader.readLine()) != null) {\n" +
                    "\t\t"+cr_table.tableName.name + " temp = new "+ cr_table.tableName.name +"();\n" +
                    "\t\tint i=0;\n"+
                    " \t\tString[] data = row.split(\",\");\n" );
            int i=0;
            for(SqlTypeEntry entry : sqlType.entries){
                if(entry.type.equals("Number")){
                    output.append("\t\t\ttemp." + entry.name+ "= Double.parseDouble(data["+i+"]);\n");
                }
                else
                {

                    output.append("\t\t\ttemp." + entry.name+ "= data["+i+"];\n");
                }
                i++;
            }
//            for( i=1; i < cr_table.columnDefs.size() ; i++);
//            {
//                ColumnDef t = new ColumnDef();
//                t = (ColumnDef)cr_table.columnDefs.get(i-1);
//                output.append("\t\t\ttemp." + entry.name+ "= data["+i+"];\n");
//            }

            output.append("\t\t\tMy" + cr_table.tableName.name +".add(temp);\n"+
                    "\t\t}");
//            output.append("\tGson gson = new Gson();\n");
//            output.append("\tJsonReader reader = new JsonReader(new FileReader(\"" + cr_table.path + "\"));\n");
//            output.append("\tJsonObject jsonObject = gson.fromJson(reader,JsonObject.class);\n");
//            output.append("\tJsonElement jsonElement = jsonObject.get(\"" + cr_table.tableName.name+ "\");\n");
//            output.append("\t"+cr_table.tableName.name + " [] data = gson.fromJson(jsonElement," + cr_table.tableName.name + "[].class);\n");
//            output.append("\tfor(int i=0;i<data.length;i++){\n");
//            output.append("\t\tMy" + cr_table.tableName.name + ".add(data[i]);\n");
//            output.append("\t}\n"); // End of for
            output.append("\treturn My" + cr_table.tableName.name +";\n");
            output.append("}\n"); // End of load
///////////////////////////////////////////
            output.append("public List<" + cr_table.tableName.name + "> getData() {\n");
            output.append("\ttry{\n" +
                    "\t\treturn load();\n}"
                    +"\tcatch(Exception e){\n" +
                    "\treturn null;}\n");
            output.append("\t}\n"); // End of get data

            //to string
            output.append("\t@Override\n"+
                    "\tpublic String toString(){\n");
            output.append("\tStringBuilder stringBuilder = new StringBuilder();\n");
            for(SqlTypeEntry entry : sqlType.entries){
                output.append("\tstringBuilder.append("+entry.name+"+\"  \");\n");
            }
            output.append("\treturn stringBuilder.toString();");
            output.append("}");
            output.append("\n}\n"); // End of Class

            output.close();
        }catch (IOException e) {
            System.out.println("IOException in FileWriter");
        }
    }

    public void OpenFile(String table_name) {
        try {
            String name = "src\\CodeGen\\CreatedClasses\\" + table_name + ".java";
            output = new BufferedWriter(new FileWriter(name));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }


}
