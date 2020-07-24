package Rules.AST.Java.Logic.Loop;

import Rules.AST.Node;
import Rules.Utils.Error;

public class LoopStmt extends Node {
    public Node loop;

    public String getType()throws Error {
        if(loop instanceof ForLoop)
            return ((ForLoop)loop).getType(((ForLoop)loop).scope);
        if(loop instanceof WhileLoop)
            return ((WhileLoop)loop).getType(((WhileLoop)loop).scope);
        if(loop instanceof DoWhileLoop)
            return ((DoWhileLoop)loop).getType(((DoWhileLoop)loop).scope);
        return null;
    }
}
