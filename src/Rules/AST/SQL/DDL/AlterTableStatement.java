package Rules.AST.SQL.DDL;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.Database.ColumnDef;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class AlterTableStatement extends SqlStatment {
    public AnyName dataBaseName = new AnyName();
    public AnyName sourceTableName;
    public Node alteration;
    public AnyName newTableName;
    public ColumnDef newcolumn;
}
