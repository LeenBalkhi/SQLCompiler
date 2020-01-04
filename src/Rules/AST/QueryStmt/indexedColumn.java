package Rules.AST.QueryStmt;

import Rules.AST.Node;

public class indexedColumn extends Node {
    public String columnName;
    public String collationName=null;
    public String desc=null;
}
