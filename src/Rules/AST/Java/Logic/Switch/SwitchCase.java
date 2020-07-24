package Rules.AST.Java.Logic.Switch;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class SwitchCase extends Node {
    public Node value;
    public Node block;
    public Scope scope;
    public String type;

//    public String getType(Scope scope){
//
//    }
}
