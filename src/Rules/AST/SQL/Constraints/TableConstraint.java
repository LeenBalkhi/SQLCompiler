package Rules.AST.SQL.Constraints;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

public class TableConstraint extends SqlStatment {
    public String name=null;
    public Node constraint;
}
