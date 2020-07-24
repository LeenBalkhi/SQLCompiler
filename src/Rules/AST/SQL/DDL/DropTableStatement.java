package Rules.AST.SQL.DDL;

import Rules.AST.AnyName;
import Rules.AST.SQL.SqlStatment;

public class DropTableStatement extends SqlStatment {
    public boolean ifExists;
    public AnyName dataBaseName;
    public AnyName tableName;
}
