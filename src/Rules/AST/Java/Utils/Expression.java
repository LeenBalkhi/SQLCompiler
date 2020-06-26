package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class Expression extends Node{
    public Node expression;

    public Object getValue(Scope scope) throws Error{
        if(expression instanceof Value)
            return ((Value)expression).getValue(scope);
        if(expression instanceof BooleanExpression)
            return ((BooleanExpression)expression).getValue(scope);
        if(expression instanceof MathExpression)
            return ((MathExpression)expression).getValue(scope);
        if(expression instanceof Increment)
            return ((Increment)expression).getValue(scope);
        //Delete
        return null;
    }

    public String getType(Scope scope) throws Error {
        if(expression instanceof MathExpression)
            return ((MathExpression)expression).getType(scope);
        if(expression instanceof BooleanExpression)
            return ((BooleanExpression)expression).getType(scope);
        if(expression instanceof Increment)
            return ((Increment)expression).getType(scope);
        if(expression instanceof Value)
            return ((Value)expression).getType(scope);
        return null;
    }

}
