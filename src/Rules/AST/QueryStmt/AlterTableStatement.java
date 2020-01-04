package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class AlterTableStatement extends Node {
    public ArrayList<String> dataBaseName = new ArrayList<>();
    public String sourceTableName;
    public Node alteration;
}
