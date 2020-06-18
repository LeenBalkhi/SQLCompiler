package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class MathExpression extends Node {
    public Node expression;

    public Object getValue(Scope scope){
        return null;
    }


    public String getType(Scope scope){
        if(expression instanceof Value)
            return ((Value)expression).getType(scope);
        if(expression instanceof ArithmeticOperation)
            return ((ArithmeticOperation)expression).getType(scope);
        if(expression instanceof MathInParenth)
            return ((MathInParenth)expression).getType(scope);
        return null;
    }
}