package Rules.AST.Java.Logic.Conditional;

import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Java.JavaBody.OneLineBlock;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

import java.util.ArrayList;

public class ConditionalStmt extends Node {
    public ArrayList<Node> ifs = new ArrayList<>();
    public ArrayList<Node> elseifs = new ArrayList<>();
    public Node elseStmt;
    public Boolean catched = false;

    public String getType(Scope scope)throws Error {
        String finalType = null;
        for(int i = 0; i < ifs.size(); i++){
            if(((IfStmt)ifs.get(i)).body instanceof Block)
                finalType = ((Block)((IfStmt)ifs.get(i)).body).getType( ((IfStmt)ifs.get(i)).scope );
            if(((IfStmt)ifs.get(i)).body instanceof OneLineBlock)
                finalType = ((OneLineBlock)((IfStmt)ifs.get(i)).body).getType(((IfStmt)ifs.get(i)).scope);
            if(finalType != null)
                return finalType;
        }
        for(int i = 0; i < elseifs.size(); i++){
            if(((ElseIfStmt)elseifs.get(i)).body instanceof Block)
                finalType = ((Block)((ElseIfStmt)elseifs.get(i)).body).getType(((ElseIfStmt)elseifs.get(i)).scope);
            if(((ElseIfStmt)elseifs.get(i)).body instanceof OneLineBlock)
                finalType = ((OneLineBlock)((ElseIfStmt)elseifs.get(i)).body).getType(((ElseIfStmt)elseifs.get(i)).scope);
            if(finalType != null)
                return finalType;
        }if(elseStmt !=null){
            if(((ElseStmt)elseStmt).body instanceof Block)
                finalType = ((Block)((ElseStmt)elseStmt).body).getType(((ElseStmt)elseStmt).scope);
            if(((ElseStmt)elseStmt).body instanceof OneLineBlock)
                finalType = ((OneLineBlock)((ElseStmt)elseStmt).body).getType(((ElseStmt)elseStmt).scope);
        }
        return finalType;
    }
}
