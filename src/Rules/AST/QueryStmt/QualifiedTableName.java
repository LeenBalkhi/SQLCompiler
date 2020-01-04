package Rules.AST.QueryStmt;

import Rules.AST.Node;

public class QualifiedTableName extends Node {
    public String dataBaseName;
    public String tableName;
    public String indexName;
    public boolean notIndexed;
}
