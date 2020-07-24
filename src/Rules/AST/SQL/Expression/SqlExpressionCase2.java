package Rules.AST.SQL.Expression;

import Rules.AST.AnyName;
import Rules.AST.Node;

public class SqlExpressionCase2 extends Node {
    public AnyName columnName;
    public AnyName tableName;
    public String type;
    public Object parseObject;
}
