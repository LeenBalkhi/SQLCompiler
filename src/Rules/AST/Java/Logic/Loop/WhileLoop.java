package Rules.AST.Java.Logic.Loop;

import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Java.JavaBody.OneLineBlock;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class WhileLoop extends Node {
    public Node booleanExpression;
    public Node block;
    public Scope scope;

    public String getType(Scope scope)throws Error {
        if(block instanceof OneLineBlock)
            return ((OneLineBlock)block).getType(scope);
        if(block instanceof Block)
            return ((Block)block).getType(scope);
        return null;
    }
}
