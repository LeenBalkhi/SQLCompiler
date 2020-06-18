package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class BooleanExpression extends Node {
    public Node booleanExpression;

    public Boolean getValue(Scope scope){
        if(booleanExpression instanceof MultipleBooleanExpression)
            return ((MultipleBooleanExpression)booleanExpression).getValue(scope);
        if(booleanExpression instanceof Compare)
            return ((Compare)booleanExpression).getValue(scope);
        if(booleanExpression instanceof BooleanInParenth)
            return ((BooleanInParenth) booleanExpression).getValue(scope);
        if(booleanExpression instanceof Value)
            return (boolean) ((Value) booleanExpression).getValue(scope);
        if(booleanExpression instanceof True)
            return true;
        if(booleanExpression instanceof False)
            return false;
        return null;
    }

    public String getType(Scope scope){
        if(booleanExpression instanceof MultipleBooleanExpression)
            return ((MultipleBooleanExpression)booleanExpression).getType(scope);
        if(booleanExpression instanceof Compare)
            return (((Compare) booleanExpression).getType(scope));
        if(booleanExpression instanceof BooleanInParenth)
            return ((BooleanInParenth) booleanExpression).getType(scope);
        if(booleanExpression instanceof Value){
            if( ((Value)booleanExpression).getType(scope)!="Boolean" )
                return "ERROR";
            return "Boolean";
        }
        if(booleanExpression instanceof True)
            return "Boolean";
        if(booleanExpression instanceof False)
            return "Boolean";
        return null;
    }
}
