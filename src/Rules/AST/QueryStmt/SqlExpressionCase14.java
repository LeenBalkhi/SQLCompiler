package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class SqlExpressionCase14 extends Node {
    public boolean not;
    public Node selectStmt;
    public ArrayList<Node>  expressions;
    public String dataBaseName;
    public String tableName;
}
