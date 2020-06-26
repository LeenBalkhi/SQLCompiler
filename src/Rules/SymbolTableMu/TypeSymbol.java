package Rules.SymbolTableMu;

import java.util.ArrayList;

public class TypeSymbol extends Symbol{
    public TypeSymbol(){
        value = new ArrayList<Symbol>();
    }
}
