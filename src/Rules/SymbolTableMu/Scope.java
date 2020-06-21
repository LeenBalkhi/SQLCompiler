package Rules.SymbolTableMu;



import java.util.HashMap;
import java.util.Map;

public class Scope {
    public Scope parent;
    public HashMap<String, Symbol> symbolMap = new HashMap<String, Symbol>();
    public Scope(Scope parent) {
        this.parent = parent;
    }

    public Symbol findSymbol(String name){
        Scope current = this;
        while (current != null){
            if(current.symbolMap.containsKey(name))
                return current.symbolMap.get(name);
            current = current.parent;
        }
        return null;
    }

}


