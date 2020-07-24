package Rules.AST.Java.JavaBody;

import Rules.AST.Java.Logic.Conditional.ConditionalStmt;
import Rules.AST.Java.Logic.Loop.LoopStmt;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

import java.util.ArrayList;

public class Block extends Node {
    public ArrayList<Node> javaBodies = new ArrayList<>();
    public Node returnStmt;

    public String getType(Scope scope) throws Error {
        String finalType = null;
        for(int i = 0 ; i< javaBodies.size();i++){
            if(finalType!=null)
                break;
            if(((JavaBody)javaBodies.get(i)).command instanceof LoopStmt)
                finalType = ((LoopStmt)(((JavaBody)javaBodies.get(i)).command)).getType();
            if(((JavaBody)javaBodies.get(i)).command instanceof ConditionalStmt)
                finalType = ((ConditionalStmt)(((JavaBody)javaBodies.get(i)).command)).getType(scope);
            if(finalType != null)
                return finalType;
        }
        if(finalType == null){
            if(returnStmt!=null){
                return ((ReturnStmt)returnStmt).getType(scope);
            }
        }
        return null;
    }

}
