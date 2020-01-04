package Rules.AST.QueryStmt;

import Rules.AST.Node;

public class DropTableStatement extends Node {
    public boolean ifExists;
    public String dataBaseName;
    public String tableName;
}
