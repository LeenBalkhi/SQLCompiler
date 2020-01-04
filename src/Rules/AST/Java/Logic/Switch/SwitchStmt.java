package Rules.AST.Java.Logic.Switch;

import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Node;

import java.util.ArrayList;

public class SwitchStmt extends Node {
    public ArrayList<Node> cases;
    public Node def;
    public Node var;
}
