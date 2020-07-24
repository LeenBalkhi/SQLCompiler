package CodeGen.GenerateCodeFromNodes;

import CodeGen.CsvParser;
import CodeGen.JsonParser;
import Rules.AST.SQL.DDL.CreateTableStatement;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.AggregationFunction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//import Rules.AST.SQL.DDL.CreateAggregationFunction;

public class SqlStatementGen {
    Writer aggFunOutput;

    public SqlStatment sqlStatment;

    public SqlStatementGen(SqlStatment s){
        sqlStatment = s;
    }

    public void genSqlStatement(){
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
}
