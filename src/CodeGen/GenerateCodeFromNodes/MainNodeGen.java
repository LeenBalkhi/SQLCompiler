package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Node;
import Rules.AST.Parse;

import java.io.*;

public class MainNodeGen {
    Writer output;

    public Node mainNode;
    public MainNodeGen(Node n){
        mainNode = n;
    }

    public void geClasses(){
        OpenFile();
        try {
            output.append("package CodeGen.CreatedClasses;\n");
            output.append("public class Main{\n");
            Parse p = (Parse)mainNode;
            output.close();
            ParseGen parseGen = new ParseGen(p);
            parseGen.genParse();
            OpenFile();
            output.append("}\n"); // End of Class Main
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void OpenFile() {
        try {
            String name = "C:\\Users\\Dell\\Documents\\GitHub\\SQLCompiler\\src\\CodeGen\\CreatedClasses\\Main.java";
            output = new BufferedWriter(new FileWriter(name,true));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }
}
