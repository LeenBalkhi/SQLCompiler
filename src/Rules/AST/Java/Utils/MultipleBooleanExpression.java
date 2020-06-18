package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class MultipleBooleanExpression extends Node {
    public Node left;
    public Node right;
    public String op;

    public Boolean getValue(Scope scope){
        if(op == "||")
            return ( ((BooleanExpression)left).getValue(scope) || ((BooleanExpression)left).getValue(scope) );
        else
            return ( ((BooleanExpression)left).getValue(scope) && ((BooleanExpression)left).getValue(scope) );
    }

    public String getType(Scope scope){
        if(((BooleanExpression)left).getType(scope)=="ERROR" || ((BooleanExpression)right).getType(scope)=="ERROR")
            return "ERROR";
        return "Boolean";
    }
}
