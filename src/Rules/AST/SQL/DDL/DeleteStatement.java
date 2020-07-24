package Rules.AST.SQL.DDL;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

public class DeleteStatement extends SqlStatment
{
    public Node qualifiedTableName;
    public Node expression;
}
