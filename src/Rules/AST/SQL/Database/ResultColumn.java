package Rules.AST.SQL.Database;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

public class ResultColumn extends SqlStatment {
    public AnyName tableName;
    public Node expression;
    public String cloumnForExpr;
    public Object res;
}
