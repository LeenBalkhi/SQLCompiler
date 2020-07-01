package Rules.AST.SQL.DQL;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.TableOrSubQueryTypeEntry;

import java.util.ArrayList;

public class TableOrSubquery extends SqlStatment {
    public AnyName tableName;
    public AnyName databaseName;
    public String tableAlias;
    public AnyName indexName;
    public ArrayList<Node> tableOrSubqueries=new ArrayList<>();
    public Node joinClause;
    public String tableAlias2;
    public Node selectStatment;
    public String tableAlias3;

    public ArrayList<TableOrSubQueryTypeEntry> types = new ArrayList<>();
}
