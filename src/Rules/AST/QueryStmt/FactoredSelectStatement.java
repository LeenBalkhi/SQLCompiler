package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class FactoredSelectStatement extends Node {
    public Node selectCore;
    public ArrayList<Node> orderingterms=new ArrayList<>();
    public ArrayList<Node> expression=new ArrayList<>();
}
