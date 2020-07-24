package Rules.AST.Java.Logic.Conditional;


import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class ElseStmt extends Node {
    public Node body;
    public Scope scope;
}
