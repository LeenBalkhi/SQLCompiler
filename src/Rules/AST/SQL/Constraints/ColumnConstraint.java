package Rules.AST.SQL.Constraints;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

public class ColumnConstraint extends SqlStatment {
    public AnyName name;
    public Node constraint;

}
