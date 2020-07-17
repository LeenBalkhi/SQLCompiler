package Rules.AST.SQL.Expression;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.DQL.SelectStmt;

import java.util.ArrayList;

public class SqlExpressionCase14 extends Node {
    public SelectStmt selectStmt;
    public String type;
    public SqlExpression mainExpression;
    public ArrayList<SqlExpressionCase1> sqlExpressionCase1s = new ArrayList<>();
}
