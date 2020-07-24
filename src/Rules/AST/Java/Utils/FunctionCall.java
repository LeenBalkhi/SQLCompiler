package Rules.AST.Java.Utils;

import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.SymbolTableMu.Symbol;
import Rules.Utils.Error;
import Rules.Utils.Warning;

public class FunctionCall extends Node {
    public String functionName;
    public Node argumentList;

    public String getType(Scope scope)throws Error {
            Symbol symbol = scope.findSymbol(functionName);
            if( symbol == null)
                throw new Error(0,0,"Function " + functionName + " Does Not Exist");
            else if(symbol.type == null){
                throw new Warning(0,0,"Function " + functionName + " Has Not Been Given A Value Yet");
            }
            else return symbol.type;
        }
    }
