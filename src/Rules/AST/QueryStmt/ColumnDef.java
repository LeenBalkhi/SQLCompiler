package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class ColumnDef extends Node {
    public String name;
    public ArrayList<Node> columnConstraintsTypeNames = new ArrayList<>();
}
