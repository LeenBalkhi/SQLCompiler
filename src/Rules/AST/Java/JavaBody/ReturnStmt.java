package Rules.AST.Java.JavaBody;

import Rules.AST.Java.Utils.Expression;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class ReturnStmt extends Node {
    public Node returnValue ;

    public String getType(Scope scope)throws Error {
        if(((ReturnValue)returnValue).value instanceof Expression){
            return ((Expression)((ReturnValue)returnValue).value).getType(scope);
        }
        return null;
    }

}
