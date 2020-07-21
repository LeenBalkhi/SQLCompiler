package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Java.JavaStatment;
import Rules.AST.Parse;
import Rules.AST.SQL.DDL.CreateTableStatement;

import java.io.Writer;

public class ParseGen {
    Parse parse;


    public ParseGen(Parse p){
        parse = p;
    }

    public void genParse(){
        if(parse.Java!=null){
            JavaStatementGen javaStatementGen = new JavaStatementGen((JavaStatment) parse.Java);
            javaStatementGen.genJavaStatement();
        }
    }
}
