package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class AddColumn extends Node {
    public String columnName;
    public ArrayList<Node> columnConstraintTypeNames;
}
