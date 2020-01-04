package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class foreignKeyClause extends Node {
    public String dataBaseName=null;
    public String foreignTableName=null;
    public ArrayList<String> foreignTableColumnNames=new ArrayList<>();
    public ArrayList<Node> matchOnNodes;
    public Node defferableNode;
}
