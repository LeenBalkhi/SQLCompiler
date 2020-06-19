package Rules.AST.Java.Logic.Loop;

import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

import java.util.ArrayList;

public class LoopStmt extends Node {
    public Node loop;

    public String getType(Scope scope){
        if(loop instanceof ForLoop)
            return ((ForLoop)loop).getType(scope);
        if(loop instanceof WhileLoop)
            return ((WhileLoop)loop).getType(scope);
        if(loop instanceof DoWhileLoop)
            return ((DoWhileLoop)loop).getType(scope);
        return null;
    }
}
