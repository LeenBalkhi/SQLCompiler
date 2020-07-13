package Rules.AST.SQL.DQL;

import Rules.AST.Node;
import Rules.AST.SQL.Expression.SqlExpression;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.TableOrSubQueryTypeEntry;

import java.util.ArrayList;

public class SelectOrValue extends SqlStatment {
    public String id;
    public ArrayList<Node> resColumns = new ArrayList<>();
    public ArrayList<Node> tablesorSbqueries = new ArrayList<>();
    public Node join;
    public ArrayList<Node> expressions = new ArrayList<>();
    public ArrayList<TableOrSubQueryTypeEntry> types = new ArrayList<>();
    public SqlExpression whereExpression;
}
