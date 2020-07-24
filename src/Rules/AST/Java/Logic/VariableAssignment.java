package Rules.AST.Java.Logic;

import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Node;

import java.util.ArrayList;

public class VariableAssignment extends JavaBody {
    public Node variable;
    public ArrayList<Node> assignments=new ArrayList<>();
}
