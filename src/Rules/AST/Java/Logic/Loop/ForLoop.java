package Rules.AST.Java.Logic.Loop;

import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Java.JavaBody.OneLineBlock;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class ForLoop extends Node {
    public Node variableDeclaration;
    public Node booleanExpression;
    public Node mathExpresion;
    public Node block;
    public Scope scope;

    public String getType(Scope scope)throws Error {
        if(block instanceof Block)
            return ((Block)block).getType(scope);
        if(block instanceof OneLineBlock)
            return ((OneLineBlock)block).getType(scope);
        return null;
    }
}
