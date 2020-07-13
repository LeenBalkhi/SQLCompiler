package Rules.AST.SQL.DQL;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.TableOrSubQueryTypeEntry;
import Rules.SymbolTableMu.TableSymbol;

import java.util.ArrayList;

public class TableOrSubquery extends SqlStatment {
    public AnyName tableName;
    public AnyName databaseName;
    public String tableAlias;
    public AnyName indexName;
    public ArrayList<Node> tableOrSubqueries=new ArrayList<>();
    public Node joinClause;
    public Node selectStatment;
    public TableSymbol tableSymbol;

    public ArrayList<TableOrSubQueryTypeEntry> types = new ArrayList<>();
}
