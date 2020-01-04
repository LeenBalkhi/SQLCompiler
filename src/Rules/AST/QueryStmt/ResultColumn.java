package Rules.AST.QueryStmt;

import Rules.AST.Node;

public class ResultColumn extends Node {
    public String resColumn;
    public Node expression;
    public boolean as=false;
    public String columnAlias;
}
