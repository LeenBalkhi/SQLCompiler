package Rules.AST.SQL.DDL;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class InsertStatement extends SqlStatment {
    public AnyName dataBaseName;
    public AnyName tableName;
    public ArrayList<AnyName> columnNamse = new ArrayList<>();
    public ArrayList<Node> expressions = new ArrayList<>();
    public Node selectStatement;
    public boolean defaultValues=false;
}
