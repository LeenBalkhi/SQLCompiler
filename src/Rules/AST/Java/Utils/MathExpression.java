package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class MathExpression extends Node {
    public Node expression;

    public Object getValue(Scope scope)throws Error{
        if(expression instanceof Value)
        {
            return ((Value)expression).getValue(scope);
        }
        if(expression instanceof ArithmeticOperation)
            return ((ArithmeticOperation)expression).getValue(scope);
        if(expression instanceof MathInParenth)
            return ((MathInParenth)expression).getValue(scope);
        return null;
    }


    public String getType(Scope scope) throws Error {
        if(expression instanceof Value)
            return ((Value)expression).getType(scope);
        if(expression instanceof ArithmeticOperation)
            return ((ArithmeticOperation)expression).getType(scope);
        if(expression instanceof MathInParenth)
            return ((MathInParenth)expression).getType(scope);
        return null;
    }
}
