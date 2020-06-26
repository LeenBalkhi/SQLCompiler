package Rules.SymbolTableMu;

import java.util.ArrayList;

public class TableSymbol extends Symbol{
    public TableSymbol(){
        value = new ArrayList<ColumnSymbol>();
    }
}
