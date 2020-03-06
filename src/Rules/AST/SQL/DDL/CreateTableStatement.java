package Rules.AST.SQL.DDL;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class CreateTableStatement extends SqlStatment {
    public boolean ifNotExists;
    public AnyName dataBaseName;
    public AnyName tableName;
    public ArrayList<Node> columnDefs = new ArrayList<>();
    public ArrayList<Node> tableConstraintsColumnDefs= new ArrayList<>();
    public Node selectStmt;
}
