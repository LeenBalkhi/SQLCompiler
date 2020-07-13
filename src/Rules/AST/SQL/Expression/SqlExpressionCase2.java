package Rules.AST.SQL.Expression;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.SymbolTableMu.SqlType;

public class SqlExpressionCase2 extends Node {
    public AnyName dataBaseName;
    public AnyName tableName;
    public AnyName columnName;
    public String type;
    public Object parseObject;
}
