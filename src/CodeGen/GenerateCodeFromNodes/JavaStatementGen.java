package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Java.FunctionDeclaration;
import Rules.AST.Java.JavaStatment;
import Rules.AST.SQL.SqlStatment;

public class JavaStatementGen {
    public JavaStatment javaStatment;

    public JavaStatementGen(JavaStatment j){
        javaStatment = j;
    }

    public void genJavaStatement(){
        if(javaStatment.javaStatment instanceof SqlStatment){
            SqlStatment sqlStatment = (SqlStatment)javaStatment.javaStatment;
            SqlStatementGen sqlStatementGen = new SqlStatementGen(sqlStatment);
            sqlStatementGen.genSqlStatement();
        }
        if(javaStatment.javaStatment instanceof FunctionDeclaration){
            FunctionDeclaration functionDeclaration = (FunctionDeclaration)javaStatment.javaStatment;
            FunctionDeclarationGen functionDeclarationGen = new FunctionDeclarationGen(functionDeclaration);
            functionDeclarationGen.genFunctionDeclaration();
        }
        if(javaStatment.javaStatement2!=null){
            JavaStatementGen javaStatementGen2 = new JavaStatementGen((JavaStatment)javaStatment.javaStatement2);
            javaStatementGen2.genJavaStatement();
        }
    }
}
