package Rules.AST.Java.JavaBody;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class OneLineBlock extends Node {
    public Node line;

    public String getType(Scope scope){
//        if(line instanceof JavaBody)
//            return ((JavaBody)line).getType(scope);
//        if(line instanceof ReturnStmt)
//            return ;
        return null;
    }
}
