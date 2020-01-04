package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class TableOrSubquery extends Node {
    public String tableName;
    public String databaseName;
    public String tableAlias;
    public String indexName;
    public ArrayList<Node> tableOrSubqueries=new ArrayList<>();
    public Node joinClause;
    public String tableAlias2;
    public Node selectStatment;
    public String tableAlias3;
}
