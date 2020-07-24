package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Java.FunctionDeclaration;
import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Java.Logic.Print;
import Rules.AST.Java.Logic.VariableAssignment;
import Rules.AST.Java.Logic.VariableDeclaration;
import Rules.AST.Java.Utils.SimpleVariable;
import Rules.AST.Java.Utils.Variable;
import Rules.AST.Node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

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
            output.append("\n\tpublic static void main(String[] args){\n");
            for(Node j: block.javaBodies){
                JavaBody javaBody = (JavaBody)j;
                if(javaBody.command instanceof VariableDeclaration){
                    VariableDeclaration variableDeclaration = (VariableDeclaration) javaBody.command;
                    VariableDeclarationGen variableDeclarationGen = new VariableDeclarationGen(variableDeclaration);
                    String name = ((SimpleVariable)((Variable)((VariableAssignment)variableDeclaration.variableAssignments.get(0)).variable).variable).VariableName.get(0);
                    output.append("\n\t"+name+" instanceOf"+name+" = new "+name+"();\n");
                    variableDeclarationGen.genVariableDeclaration();
                }
                if(javaBody.command instanceof Print){
                    Print print = (Print) javaBody.command;
                    PrintGen printGen = new PrintGen( output, (Print)javaBody.command);
                    printGen.genPrint();
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
            String name = "src\\CodeGen\\CreatedClasses\\Main.java";
            output = new BufferedWriter(new FileWriter(name,true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
