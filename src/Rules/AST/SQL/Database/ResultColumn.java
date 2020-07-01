package Rules.AST.SQL.Database;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.SqlType;

import java.util.ArrayList;

public class ResultColumn extends SqlStatment {
    public AnyName tableName;
    public Node expression;
    public String cloumnForExpr;
}
