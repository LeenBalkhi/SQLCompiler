package Rules.AST.Java.Utils;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.SymbolTableMu.Symbol;
import Rules.Utils.Error;
import Rules.Utils.Warning;


public class Variable extends Node {
    public String varName;
    public Node variable;

    public Object getValue(Scope scope){
        if(variable instanceof SimpleVariable){
            return scope.findSymbol(((SimpleVariable)variable).VariableName.get(0)).value;
        }
        return null;
    }

    public String getType(Scope scope)throws Error {
        if(variable instanceof SimpleVariable){
            Symbol symbol = scope.findSymbol(((SimpleVariable)variable).VariableName.get(0));
            if( symbol == null)
                throw new Error(0,0,"Variable " + ((SimpleVariable)variable).VariableName.get(0) + " Does Not Exist");
            else if(symbol.type == null){
                throw new Warning(0,0,"Variable " + ((SimpleVariable)variable).VariableName.get(0) + " Has Not Been Given A Value Yet");
            }
            else return symbol.type;
        }
        return null;
    }
}
