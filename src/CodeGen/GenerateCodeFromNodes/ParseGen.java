package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Java.JavaStatment;
import Rules.AST.Parse;

import java.io.IOException;

public class ParseGen {
    Parse parse = new Parse();


    public ParseGen(Parse p){
        parse.Java = p.Java;
    }

    public void genParse() throws IOException {
        if(parse.Java!=null){
            JavaStatementGen javaStatementGen = new JavaStatementGen((JavaStatment) parse.Java);
            javaStatementGen.genJavaStatement();
        }
    }
}
