package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Java.Logic.Print;
import Rules.AST.Java.Utils.Increment;
import Rules.AST.Java.Utils.SimpleVariable;
import Rules.AST.Java.Utils.Value;
import Rules.AST.Java.Utils.Variable;
import Rules.AST.Node;
import Rules.AST.SQL.Table;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class PrintGen {

    Writer output;
    Print print = new Print();
    PrintGen(Writer output , Print print)
    {
        for(int i=0; i<print.expressions.size() ;i++)
        this.print.expressions.add(print.expressions.get(i));
        this.output = output;
    }
    public void genPrint()
    {
        Node temp = print.expressions.get(0).expression;
         if(temp instanceof Value)
         {
            Node n= ((Value) temp).value;
            if(n instanceof Variable) {
                Node m = ((Variable) n).variable;
                if(m instanceof SimpleVariable){
                  //  OpenFile();
                    try {
                        for (String s : ((SimpleVariable) m).VariableName) {
                            output.append("\tfor("+s+" var : instanceOf"+s+".getData()){\n");
                            output.append("\t\tSystem.out.println(var);\n");
                            output.append("\t}\n");
                    }

                   // output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                }
            }
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
