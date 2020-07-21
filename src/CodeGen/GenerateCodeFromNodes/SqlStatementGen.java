package CodeGen.GenerateCodeFromNodes;

import CodeGen.JsonParser;
import Rules.AST.SQL.DDL.CreateAggregationFunction;
import Rules.AST.SQL.DDL.CreateTableStatement;
import Rules.AST.SQL.SqlStatment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SqlStatementGen {
    Writer aggFunOutput;

    public SqlStatment sqlStatment;

    public SqlStatementGen(SqlStatment s){
        sqlStatment = s;
    }

    public void genSqlStatement(){
        if(sqlStatment.stmt instanceof CreateTableStatement){
            JsonParser jsonParser = new JsonParser((CreateTableStatement) sqlStatment.stmt);
            jsonParser.WriteFile();
        }else if(sqlStatment.stmt instanceof CreateAggregationFunction){
            CreateAggregationFunction crF = (CreateAggregationFunction)sqlStatment.stmt;
            OpenFile(crF.funName);
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
                aggFunOutput.append("public class "+crF.funName+"{\n");
                aggFunOutput.append("public static ");
                if(crF.returnType.equals("Number"))
                    aggFunOutput.append("Double ");
                aggFunOutput.append("call(ArrayList<");
                if(crF.paramType.equals("Number")){
                    aggFunOutput.append("Double> list)");
                }
                aggFunOutput.append("{\n");
                aggFunOutput.append("String JARPath = \"" + crF.path+ "\";\n" +
                        "String ClassName = \""+ crF.className +"\";");
                aggFunOutput.append("String MethodName = \""+crF.methodName+"\";\n");

                aggFunOutput.append("try {\n" +
                        "URLClassLoader myClassLoader = new URLClassLoader(\n" +
                        "new URL[]{new File(JARPath).toURI().toURL()},\n" +
                        crF.funName+".class.getClassLoader());\n" +
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
    }

    public void OpenFile(String name) {
        try {
            String name1 = "C:\\Users\\Dell\\Documents\\GitHub\\SQLCompiler\\src\\CodeGen\\CreatedClasses\\"+ name +".java";
            aggFunOutput = new BufferedWriter(new FileWriter(name1,true));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }
}
