package Rules.AST.Java.Utils;

import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class Increment extends Node {
    public Node increment;

    public Object getValue(Scope scope) {
        if(increment instanceof PostIncrement)
            return ((PostIncrement)increment).getValue(scope);
        if(increment instanceof PostDecrement)
            return ((PostDecrement)increment).getValue(scope);
        if(increment instanceof PreIncrement)
            return ((PreIncrement)increment).getValue(scope);
        if(increment instanceof PreDecrement)
            return ((PreDecrement)increment).getValue(scope);
        return null;
    }

    public String getType(Scope scope){
        if(increment instanceof PostIncrement)
            return ((PostIncrement)increment).getType(scope);
        if(increment instanceof PostDecrement)
            return ((PostDecrement)increment).getType(scope);
        if(increment instanceof PreIncrement)
            return ((PreIncrement)increment).getType(scope);
        if(increment instanceof PreDecrement)
            return ((PreDecrement)increment).getType(scope);
        return null;
    }
}
