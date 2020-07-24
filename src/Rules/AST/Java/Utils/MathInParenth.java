package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class MathInParenth extends Node {
    public Node expression;

    public Object getValue (Scope scope) throws Error {
        return ((MathExpression)expression).getValue(scope);
    }

    public String getType(Scope scope)throws Error {
        return((MathExpression)expression).getType(scope);
    }
}
