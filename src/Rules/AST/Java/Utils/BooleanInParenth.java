package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class BooleanInParenth extends Node {
    public Node value;

    public Boolean getValue(Scope scope) throws Error {
        return ((BooleanExpression)value).getValue(scope);
    }

    public String getType(Scope scope) throws Error {
        return ((BooleanExpression) value).getType(scope);
    }

}
