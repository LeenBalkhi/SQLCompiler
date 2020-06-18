package Rules.AST.Java.Logic.Conditional;

import Rules.AST.Java.Utils.BooleanExpression;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class IfStmt extends Node {
    public Node condition;
    public Node body;

    public Scope scope;
}
