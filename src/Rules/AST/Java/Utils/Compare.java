package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class Compare extends Node {
    public Node left;
    public Node right;
    public String op;

    public Boolean getValue(Scope scope) throws Error {
        switch ( ((MathExpression)left).getType(scope) ){
            case "Long":{
                long valueLeft = ((long)((MathExpression)left).getValue(scope)) ;
                long valueRight = ((long)((MathExpression)right).getValue(scope)) ;
                if(op.equals("<"))
                    return valueLeft < valueRight;
                if(op.equals("<="))
                    return valueLeft <= valueRight;
                if(op.equals(">"))
                    return valueLeft > valueRight;
                if(op.equals(">="))
                    return valueLeft >= valueRight;
                if(op.equals("=="))
                    return valueLeft == valueRight;
                if(op.equals("!="))
                    return valueLeft != valueRight;
                break;
            }
            case "Double":{
                double valueLeft = ((double)((MathExpression)left).getValue(scope)) ;
                double valueRight = ((double)((MathExpression)right).getValue(scope)) ;
                if(op.equals("<"))
                    return valueLeft < valueRight;
                if(op.equals("<="))
                    return valueLeft <= valueRight;
                if(op.equals(">"))
                    return valueLeft > valueRight;
                if(op.equals(">="))
                    return valueLeft >= valueRight;
                if(op.equals("=="))
                    return valueLeft == valueRight;
                if(op.equals("!="))
                    return valueLeft != valueRight;
                break;
            }
            case "String":{
                String valueLeft = ((String)((MathExpression)left).getValue(scope)) ;
                String valueRight = ((String)((MathExpression)right).getValue(scope)) ;
                if(op.equals("=="))
                    return valueLeft == valueRight;
                if(op.equals("!="))
                    return valueLeft != valueRight;
                break;
            }
        }
        return null;
    }

    public String getType(Scope scope)throws Error {
        if(((MathExpression)left).getType(scope) != ((MathExpression)right).getType(scope))
            throw new Error(0,0,"Cannot Compare " + ((MathExpression)left).getType(scope) + " With " + ((MathExpression)right).getType(scope));
        return "Boolean";
    }
}