package Rules.SymbolTableMu;



import java.util.HashMap;
import java.util.Map;

public class Scope {
    public Scope parent;
    public HashMap<String, Symbol> symbolMap = new HashMap<String, Symbol>();
    public Scope(Scope parent) {
        this.parent = parent;
    }
}


