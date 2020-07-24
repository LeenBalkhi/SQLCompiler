package Rules.AST.Java.Logic.Conditional;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class ElseIfStmt extends Node {
    public Node condition;
    public Node body;
    public Scope scope;

}
