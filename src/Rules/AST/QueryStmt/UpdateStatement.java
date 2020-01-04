package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class UpdateStatement extends Node {
    public Node qualifiedTableName;
    public ArrayList<String> columnNames=new ArrayList<>();
    public ArrayList<Node> expressions =new ArrayList<>();
    public Node whereExpression;
}
