package Rules.AST.QueryStmt;

import Rules.AST.Node;

public class DeleteStatement extends Node
{
    public Node qualifiedTableName;
    public Node expression;
}
