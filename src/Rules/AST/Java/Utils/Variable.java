package Rules.AST.Java.Utils;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;


public class Variable extends Node {
    public Node variable;

    public Object getValue(Scope scope){
        if(variable instanceof SimpleVariable){
            return scope.findSymbol(((SimpleVariable)variable).VariableName.get(0)).value;
        }
        return null;
    }

    public String getType(Scope scope){
        if(variable instanceof SimpleVariable)
            return scope.findSymbol(((SimpleVariable)variable).VariableName.get(0)).type;
        return null;
    }
}
