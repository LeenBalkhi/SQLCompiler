package Rules.AST.SQL.Database;

import Rules.AST.AnyName;
import Rules.AST.SQL.SqlStatment;

public class ColumnDef extends SqlStatment {
    public AnyName name;
    public TypeName typeName;
}
