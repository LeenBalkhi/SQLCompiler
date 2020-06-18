package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class MathInParenth extends Node {
    public Node expression;

    public Object getValue(Scope scope){
        return ((MathExpression)expression).getValue(scope);
    }

    public String getType(Scope scope){
        return((MathExpression)expression).getType(scope);
    }
}
