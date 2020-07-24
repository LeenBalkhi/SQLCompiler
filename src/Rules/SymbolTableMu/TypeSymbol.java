package Rules.SymbolTableMu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TypeSymbol extends Symbol{
    public LinkedHashMap<String , Symbol> values = new LinkedHashMap<>();

    public void printType(SymbolTable symbolTable){
        System.out.println("Type "+type+":");
        for(Symbol symbol : values.values()){
            if(symbol instanceof TableSymbol)
                ((TableSymbol)symbol).printTable(symbolTable);
            else if(symbol instanceof TypeSymbol)
                printType(symbolTable);
            else{
                System.out.println(symbol.name + " "+ symbol.value);
            }
        }
    }
}
