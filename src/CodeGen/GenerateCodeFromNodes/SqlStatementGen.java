package CodeGen.GenerateCodeFromNodes;

import CodeGen.CsvParser;
import CodeGen.JsonParser;
import Rules.AST.SQL.DDL.CreateTableStatement;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.AggregationFunction;
import Rules.SymbolTableMu.SqlType;
import Rules.SymbolTableMu.SqlTypeEntry;

import java.io.*;
import java.util.Map;

//import Rules.AST.SQL.DDL.CreateAggregationFunction;

public class SqlStatementGen {
    Writer aggFunOutput;
    Writer output;
    public SqlStatment sqlStatment;

    public SqlStatementGen(SqlStatment s){
        sqlStatment = s;
    }

    public void genSqlStatement() throws IOException {
        if(sqlStatment.stmt instanceof CreateTableStatement){
          if(((CreateTableStatement) sqlStatment.stmt).type.equals("json"))
          {
              JsonParser jsonParser = new JsonParser((CreateTableStatement) sqlStatment.stmt);
              jsonParser.WriteFile();
          }
          else
          {
              CsvParser csvParser = new CsvParser((CreateTableStatement) sqlStatment.stmt);
              csvParser.WriteFile();
          }
        }else if(sqlStatment.stmt instanceof AggregationFunction){
            AggregationFunction crF = (AggregationFunction) sqlStatment.stmt;
            OpenFile(crF.getMethodName());
            try {
                aggFunOutput.append("package CodeGen.CreatedClasses;\n");
                aggFunOutput.append("import java.io.File;\n" +
                        "import java.lang.reflect.InvocationTargetException;\n" +
                        "import java.lang.reflect.Method;\n" +
                        "import java.net.MalformedURLException;\n" +
                        "import java.net.URL;\n" +
                        "import java.net.URLClassLoader;\n" +
                        "import java.util.ArrayList;\n" +
                        "import java.util.List;\n");
                aggFunOutput.append("public class "+crF.getMethodName()+"{\n");
                aggFunOutput.append("public static ");
                if(crF.getReturnType().equals("Number"))
                    aggFunOutput.append("Double ");
                aggFunOutput.append("call(ArrayList<");
                if(crF.getParams().equals("Number")){
                    aggFunOutput.append("Double> list)");
                }
                aggFunOutput.append("{\n");
                aggFunOutput.append("String JARPath = \"" + crF.getJarPath()+ "\";\n" +
                        "String ClassName = \""+ crF.getClassName() +"\";");
                aggFunOutput.append("String MethodName = \""+crF.getMethodName()+"\";\n");

                aggFunOutput.append("try {\n" +
                        "URLClassLoader myClassLoader = new URLClassLoader(\n" +
                        "new URL[]{new File(JARPath).toURI().toURL()},\n" +
                        crF.getMethodName()+".class.getClassLoader());\n" +
                        "Class<?> myClass = Class.forName(ClassName, true, myClassLoader);\n" +
                        "Method mySingeltonGetterMethod = myClass.getMethod(\"get\" + ClassName, null);\n" +
                        "Object myObject = mySingeltonGetterMethod.invoke(null);\n" +
                        "var myValue = myObject.getClass().getMethod(MethodName, List.class).invoke(myObject, list);\n" +
                        "return (double)myValue;\n" +
                        "}catch (Exception e){\n" +
                        "return null;\n" +
                        "}");

                aggFunOutput.append("}"); //End of Call

                aggFunOutput.append("}"); //End of Class
                aggFunOutput.close();
            }catch (IOException e){

            }
        }
        for(Map.Entry<String , SqlType> entry1: SymbolTableHolder.symbolTable.sqlTypes.entrySet()) {

            File file = new File("src\\CodeGen\\CreatedClasses\\" + entry1.getValue().name + ".java");
            if (!file.exists()) {
            OpenTypeFile(entry1.getValue().name);
            output.append("package CodeGen.CreatedClasses;\n\n");
            output.append("import org.json.simple.JSONArray;;\n" +
                    "import CodeGen.DBTable;\n" +
                    "import Rules.AST.SQL.DDL.CreateTableStatement;\n" +
                    "import com.google.gson.*;\n" +
                    "import com.google.gson.stream.JsonReader;\n" +
                    "import java.io.*;\n" +
                    "import java.util.*;\n" +
                    "import java.lang.reflect.Field;\n" +
                    "import Rules.SymbolTableMu.*;\n" +
                    "import java.lang.annotation.*;\n");
            output.append("public class " + entry1.getValue().name + " {\n\n");
            for (SqlTypeEntry entry2 : entry1.getValue().entries) {
                if (entry2.type.equalsIgnoreCase("string"))
                    output.append("\tpublic String " + entry2.name + ";\n");
                else if (entry2.type.equalsIgnoreCase("double"))
                    output.append("\tpublic double " + entry2.name + ";\n");
                else if (entry2.type.equalsIgnoreCase("boolean"))
                    output.append("\tpublic boolean " + entry2.name + ";\n");
                else {
                    output.append("\tpublic " + entry2.type + " " + entry2.name + ";\n");
                }

            }

            output.append("\t@Override\n" +
                    "\tpublic String toString(){\n");
            output.append("\tStringBuilder stringBuilder = new StringBuilder();\n");
            for (SqlTypeEntry entry3 : entry1.getValue().entries) {
                output.append("\tstringBuilder.append(" + entry3.name + "+\"  \");\n");
            }
            output.append("\treturn stringBuilder.toString();");
            output.append("\t}");
            output.append("\n}\n"); // End of Class
            output.close();

        }
        }
      //  iterate sqltypes and create a class for each type
    }

    public void OpenFile(String name) {
        try {
            String name1 = "src\\CodeGen\\CreatedClasses\\"+ name +".java";
            aggFunOutput = new BufferedWriter(new FileWriter(name1,true));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }
    public void OpenTypeFile(String name) {
        try {
            String name1 = "src\\CodeGen\\CreatedClasses\\"+ name +".java";
            output = new BufferedWriter(new FileWriter(name1,true));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }
}
