package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class MultipleBooleanExpression extends Node {
    public Node left;
    public Node right;
    public String op;

    public Boolean getValue(Scope scope) throws Error {
        if(op == "||")
            return ( ((BooleanExpression)left).getValue(scope) || ((BooleanExpression)left).getValue(scope) );
        else
            return ( ((BooleanExpression)left).getValue(scope) && ((BooleanExpression)left).getValue(scope) );
    }

    public String getType(Scope scope) throws Error {
        if(((BooleanExpression)left).getType(scope)!="Boolean" || ((BooleanExpression)right).getType(scope)!="Boolean")
            throw new Error(0,0,"Expressions Are Not Of Type Boolean");
        return "Boolean";
    }
}
