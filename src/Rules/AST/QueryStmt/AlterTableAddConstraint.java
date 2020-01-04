package Rules.AST.QueryStmt;

import Rules.AST.Node;

public class AlterTableAddConstraint extends Node {
    public String name;
    public Node tableConstraint;
}
