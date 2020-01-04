package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class TableConstraintUnique extends Node {
    public ArrayList<Node> indexedColumns;
    public String name;
}
