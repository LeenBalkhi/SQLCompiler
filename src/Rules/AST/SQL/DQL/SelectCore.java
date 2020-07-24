package Rules.AST.SQL.DQL;

import Rules.AST.Node;
import Rules.AST.SQL.Expression.SqlExpression;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.TableSymbol;

import java.util.ArrayList;

public class SelectCore extends SqlStatment {
    public boolean all;
    public boolean distinct;
    public boolean star;
    public ArrayList<Node> resultColumns=new ArrayList<>();
    public ArrayList <Node> tableOrSubQueries = new ArrayList<>();
    public Node joinClause;
    public Node expression;
    public SqlExpression whereExpression;
    public SqlExpression groupByExpression;
    public SqlExpression havingExpression;
    public ArrayList<Node> valuesExpression = new ArrayList<>();
    public TableSymbol type;

}
