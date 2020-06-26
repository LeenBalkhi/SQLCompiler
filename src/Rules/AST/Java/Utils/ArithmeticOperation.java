package Rules.AST.Java.Utils;

import Rules.AST.Java.Logic.Switch.SwitchCase;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class ArithmeticOperation extends MathExpression {
    public MathExpression left;
    public MathExpression right;
    public String op;

    public Object getValue(Scope scope) throws Error{
        switch (left.getType(scope)){
            case "Long":{
                long valueLeft = (long)left.getValue(scope);
                long valueRight = (long)right.getValue(scope);
                switch (op){
                    case "*":
                        return valueLeft * valueRight;
                    case "/":
                        return valueLeft / valueRight;
                    case "%":
                        return valueLeft % valueRight;
                    case "+":
                        return valueLeft + valueRight;
                    case "-":
                        return valueLeft - valueRight;
                }
            }
            case "Double":{
                double valueLeft = (double)left.getValue(scope);
                double valueRight = (double)right.getValue(scope);
                switch (op){
                    case "*":
                        return valueLeft * valueRight;
                    case "/":
                        return valueLeft / valueRight;
                    case "%":
                        return valueLeft % valueRight;
                    case "+":
                        return valueLeft + valueRight;
                    case "-":
                        return valueLeft - valueRight;
                }
            }
        }
        return null;
    }

    public String getType(Scope scope)throws Error {
        if( (left.getType(scope) != right.getType(scope)) || left.getType(scope)== null || left.getType(scope)=="Boolean" )
            throw new Error(0,0,
                    "Arithmetic Operation " + op + "Cannot Be Done Between " + left.getType(scope) + " And " + right.getType(scope));
        else return left.getType(scope);
    }
}