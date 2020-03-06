package Rules.AST.SQL.Constraints;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class TableConstraintUnique extends SqlStatment {
    public ArrayList<Node> indexedColumns = new ArrayList<>();
    public AnyName name;
}
