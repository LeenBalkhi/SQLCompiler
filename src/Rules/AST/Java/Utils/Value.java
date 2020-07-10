package Rules.AST.Java.Utils;


import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.SymbolTableMu.SymbolTable;
import Rules.Utils.Error;

public class Value extends Node {
    public Node value;

    public Object getValue(Scope scope) {
        if(value instanceof SimpleLiteralValue)
            return ((SimpleLiteralValue)value).getValue();
        if(value instanceof Variable)
            return ((Variable)value).getValue(scope);
        return null;
    }

    public String getType(Scope scope)throws Error {
        if(value instanceof Variable)
            return ((Variable)value).getType(scope);
        if(value instanceof SimpleLiteralValue)
            return ((SimpleLiteralValue)value).getType();
        if(value instanceof JavaString)
            return "String";
        if(value instanceof FunctionCall)
            return ((FunctionCall)value).getType(scope);
        return null;
    }
}

