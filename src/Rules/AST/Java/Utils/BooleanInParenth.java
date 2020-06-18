package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class BooleanInParenth extends Node {
    public Node value;

    public Boolean getValue(Scope scope){
        return ((BooleanExpression)value).getValue(scope);
    }

    public String getType(Scope scope){
        return ((BooleanExpression) value).getType(scope);
    }

}
