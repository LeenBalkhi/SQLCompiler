package Rules.AST.Java;

import Rules.AST.Java.JavaBody.ReturnValue;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class FunctionDeclaration extends Rules.AST.Java.JavaStatment {
    public String functionName;
    public Node pl;
    public Node block;
    public Scope scope;

    public ReturnValue returnValue;

}
