package Rules.AST.SQL.Database;

import Rules.AST.AnyName;
import Rules.AST.SQL.SqlStatment;

public class QualifiedTableName extends SqlStatment {
    public AnyName dataBaseName;
    public AnyName tableName;
    public AnyName indexName;
    public boolean notIndexed;
}
