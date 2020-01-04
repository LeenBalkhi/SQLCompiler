package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class InsertStatement extends Node {
    public String dataBaseName;
    public String tableName;
    public ArrayList<String> columnNamse = new ArrayList<>();
    public ArrayList<Node> expressions = new ArrayList<>();
    public Node selectStatement;
}
