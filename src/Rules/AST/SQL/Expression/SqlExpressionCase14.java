package Rules.AST.SQL.Expression;

import Rules.AST.AnyName;
import Rules.AST.Node;

import java.util.ArrayList;

public class SqlExpressionCase14 extends Node {
    public boolean not;
    public Node selectStmt;
    public ArrayList<Node>  expressions;
    public AnyName dataBaseName;
    public AnyName tableName;
}
