package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class PreIncrement extends Node {
    public Node variable;
    public String op;

    public Object getValue(Scope scope)throws Error {
        if( ((Variable)variable).getType(scope) == "Long" )
            return ((long)((Variable)variable).getValue(scope))+1;
        if( ((Variable)variable).getType(scope) == "Double" )
            return ((double)((Variable)variable).getValue(scope))+1;
        return null;
    }

    public String getType(Scope scope)throws Error {
        if( ((Variable)variable).getType(scope)== "Long" || ((Variable)variable).getType(scope)== "Double" )
            return ((Variable)variable).getType(scope);
        else
            throw new Error(0,0,"Cannot Increment A Variable Of Type" + ((Variable)variable).getType(scope));
    }
}
