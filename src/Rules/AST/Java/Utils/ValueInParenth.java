package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class ValueInParenth extends Node {
    public Node value;

    public Object getValue(Scope scope){
        return ((Value)value).getValue(scope);
    }

    public String getType(Scope scope){
        return ((Value)value).getType(scope);
    }
}
