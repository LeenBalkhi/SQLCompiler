package Rules.SymbolTableMu;

import java.util.ArrayList;
import java.util.HashMap;

public class TypeSymbol extends Symbol{
    public HashMap<String , Symbol> values = new HashMap<>();


    public TypeSymbol getTypeSymbolFromType(SqlType sqlType , HashMap<String,SqlType> sqlTypes){
        TypeSymbol typeSymbol = new TypeSymbol();
        typeSymbol.type = sqlType.name;
        for(int i = 0 ; i < sqlType.entries.size() ; i++){
            if(sqlTypes.containsKey(sqlType.entries.get(i).type)){
                TypeSymbol symbol = getTypeSymbolFromType(sqlTypes.get(sqlType.entries.get(i).type) , sqlTypes);
                symbol.name = sqlType.entries.get(i).name;
                typeSymbol.values.put(sqlType.entries.get(i).name , symbol);
            }
            else {
                Symbol symbol = new Symbol();
                symbol.name = sqlType.entries.get(i).name;
                symbol.type = sqlType.entries.get(i).type;
                typeSymbol.values.put(sqlType.entries.get(i).name , symbol);
            }
        }
        return typeSymbol;
    }
}
