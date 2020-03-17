package Rules.SymbolTablepkg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {

    public int genId;

    public ScopeType type;
    public Scope nextScope;
    protected Map<String, Symbol> symbolMap = new LinkedHashMap<String, Symbol>();

    public Scope(ScopeType type, final int genId, Scope nextScope) {
        this.type = type;
        this.genId = genId;
        this.nextScope = nextScope;
    }


    public void define(String name, Values values) {


        Symbol symbol = new Symbol(name, null ,values );
        define(symbol);
    }


    private void define(Symbol symbol) {
        symbol.setScope(this);
        symbolMap.put(symbol.name, symbol);
    }



    private Symbol resolve(String name) {
        Symbol symbol = symbolMap.get(name);
        if (symbol != null) return symbol;
        if (nextScope != null) return nextScope.resolve(name);
        return null; // not found
    }


    public Symbol resolve(String name, Values values) {
        return resolve(name);
    }



    public Scope NextScope() {
        return nextScope;
    }

    public String toString() {
        return symbolMap.keySet().toString();
    }
}


