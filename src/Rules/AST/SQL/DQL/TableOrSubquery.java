package Rules.AST.SQL.DQL;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.TableSymbol;

//import Rules.SymbolTableMu.TableOrSubQueryTypeEntry;

public class TableOrSubquery extends SqlStatment {
    public AnyName tableName;
    public AnyName databaseName;
    public String tableAlias;
    public AnyName indexName;
    public Node joinClause;
    public Node selectStatment;
    public TableSymbol tableSymbol;

    public TableSymbol type;
}
