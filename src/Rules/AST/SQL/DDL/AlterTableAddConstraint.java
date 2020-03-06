package Rules.AST.SQL.DDL;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

public class AlterTableAddConstraint extends SqlStatment {
    public String name;
    public Node tableConstraint;
}
