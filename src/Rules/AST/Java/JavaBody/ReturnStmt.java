package Rules.AST.Java.JavaBody;

import Rules.AST.Java.Utils.Expression;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class ReturnStmt extends Node {
    public Node returnValue ;

    public String getType(Scope scope)throws Error {
        if(returnValue instanceof Expression)
            return ((Expression)returnValue).getType(scope);
        return null;
    }
}
