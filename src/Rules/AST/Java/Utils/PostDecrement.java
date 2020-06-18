package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class PostDecrement extends Node {
    public Node variable;
    public String op;

    public Object getValue(Scope scope){
        if( ((Variable)variable).getType(scope) == "Long" )
            return ((long)((Variable)variable).getValue(scope))-1;
        if( ((Variable)variable).getType(scope) == "Double" )
            return ((double)((Variable)variable).getValue(scope))-1;
        return null;
    }

    public String getType(Scope scope){
        if( ((Variable)variable).getType(scope)== "Long" || ((Variable)variable).getType(scope)== "Double" )
            return ((Variable)variable).getType(scope);
        return "ERROR";
    }
}
