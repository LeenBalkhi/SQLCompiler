package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class TableConstraintKey extends Node {
    public String Name;
    public ArrayList<Node> indexedColumns;
}
