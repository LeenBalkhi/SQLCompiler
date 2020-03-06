package Rules.AST.SQL.Constraints;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class TableConstraintPrimaryKey extends SqlStatment {
    public ArrayList<Node> indexedColumns = new ArrayList<>();

}
