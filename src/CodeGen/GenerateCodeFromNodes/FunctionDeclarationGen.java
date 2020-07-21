package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Java.FunctionDeclaration;
import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Java.Logic.VariableDeclaration;
import Rules.AST.Node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FunctionDeclarationGen {

    FunctionDeclaration functionDeclaration;

    Writer output;

    public FunctionDeclarationGen(FunctionDeclaration f){
        functionDeclaration = f;
    }

    public void genFunctionDeclaration(){
        Block block = (Block) functionDeclaration.block;
        try {
            OpenFile();
            output.append("public static void main(String[] args){\n");
            for(Node j: block.javaBodies){
                JavaBody javaBody = (JavaBody)j;
                if(javaBody.command instanceof VariableDeclaration){
                    VariableDeclaration variableDeclaration = (VariableDeclaration) javaBody.command;
                    VariableDeclarationGen variableDeclarationGen = new VariableDeclarationGen(variableDeclaration);
                    variableDeclarationGen.genVariableDeclaration();
                }
            }
            output.append("}\n"); // End Of Function main
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void OpenFile(){
        try {
            String name = "C:\\Users\\Dell\\Documents\\GitHub\\SQLCompiler\\src\\CodeGen\\CreatedClasses\\Main.java";
            output = new BufferedWriter(new FileWriter(name,true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
