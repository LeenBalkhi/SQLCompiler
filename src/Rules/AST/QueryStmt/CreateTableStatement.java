package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class CreateTableStatement extends Node {
    public boolean ifNotExists;
    public String dataBaseName;
    public String tableName;
    public ArrayList<Node> columnDefs = new ArrayList<>();
    public ArrayList<Node> tableConstraintsColumnDefs= new ArrayList<>();
    public Node selectStmt;
}
