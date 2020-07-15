package Rules.AST.SQL.Expression;

import Rules.AST.AnyName;
import Rules.AST.Node;

import java.util.ArrayList;

public class SqlExpressionCase12 extends Node {
    public AnyName functionName;
    public Node expression;
    public boolean distinct;
    public String op;
    public Object parseObject;
    public String type;
}
