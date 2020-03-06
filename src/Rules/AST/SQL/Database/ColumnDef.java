package Rules.AST.SQL.Database;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class ColumnDef extends SqlStatment {
    public AnyName name;
    public ArrayList<Node> columnConstraintsTypeNames = new ArrayList<>();
}
