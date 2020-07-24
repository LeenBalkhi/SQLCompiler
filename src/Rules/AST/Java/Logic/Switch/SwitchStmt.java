package Rules.AST.Java.Logic.Switch;

import Rules.AST.Node;

import java.util.ArrayList;

public class SwitchStmt extends Node {
    public ArrayList<Node> cases = new ArrayList<>();
    public Node def;
    public Node var;
    public String type;

    public Boolean catched = false;
}
