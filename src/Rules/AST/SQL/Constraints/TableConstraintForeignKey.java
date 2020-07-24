package Rules.AST.SQL.Constraints;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class TableConstraintForeignKey extends SqlStatment {
    public ArrayList<AnyName> fks=new ArrayList<>();
    public Node foreignKeyClause;
}
