package Rules.SymbolTableMu;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TableSymbol extends Symbol {
    public LinkedHashMap<String,ColumnSymbol> values = new LinkedHashMap<>();

    public void printTable(SymbolTable symbolTable){
        for(int i = 0;i<this.getColumnWithLeastValues();i++){
            System.out.println("Row "+i+": ");
            for(ColumnSymbol col : values.values()){
                if(symbolTable.sqlTypes.containsKey(col.type)
                        && symbolTable.scopeStack.peek().findSymbol(col.type) != null
                        && symbolTable.scopeStack.peek().findSymbol(col.type) instanceof TableSymbol){
                    System.out.println("Table "+col.type+": ");
                    ((TableSymbol)col.values.get(i)).printTable(symbolTable);
                }else if( symbolTable.sqlTypes.containsKey(col.type) ){
                    ((TypeSymbol)col.values.get(i)).printType(symbolTable);
                }
                else {
                    System.out.println(col.name + " "+ col.values.get(i));
                }
                System.out.println();
            }
        }
    }

    public SqlType getSqlTypeFromTableSymbol(SymbolTable symbolTable){
        LinkedHashMap<String,SqlType> sqlTypes = symbolTable.sqlTypes;
        SqlType newSqlType = new SqlType();
        newSqlType.name = name;
        values.entrySet().forEach(entry ->{
            SqlTypeEntry sqlTypeEntry = new SqlTypeEntry();
            sqlTypeEntry.name = entry.getValue().name;
            sqlTypeEntry.type = entry.getValue().type;
            newSqlType.entries.add(sqlTypeEntry);
        });
        sqlTypes.put(newSqlType.name,newSqlType);
        return newSqlType;
    }

    public int getColumnWithLeastValues(){
        int count = 10000000;
        ArrayList<Integer> sizes = new ArrayList<Integer>();
        values.values().forEach(val->{
            sizes.add(val.values.size());
        });
        for(int i=0;i<sizes.size();i++){
            if(count> sizes.get(i))
                count = sizes.get(i);
        }
        return count;
    }

    public TableSymbol clone(){
        TableSymbol tableSymbol = new TableSymbol();
        tableSymbol.name = name;
        tableSymbol.type = type;
        for(ColumnSymbol columnSymbol : values.values()){
            ColumnSymbol col = columnSymbol.clone();
            tableSymbol.values.put(col.name,col);
        }
        return tableSymbol;
    }

    public static TableSymbol combineTables(TableSymbol table1, TableSymbol table2){
        TableSymbol tableSymbol = table1.clone();
        int count1 = table1.getColumnWithLeastValues();
        int count2 = table2.getColumnWithLeastValues();
        boolean add,dup;
        for(int i=0;i<count2;i++){
            add = true;
            for(int j=0;j<count1;j++){
                dup = true;
                for(ColumnSymbol col : tableSymbol.values.values()){
                    if(!(col.values.get(i) instanceof TableSymbol)){
                        if(!table2.values.get(col.name).values.get(i).equals(col.values.get(j))){
                            dup = false;
                            break;
                        }
                    }
                }
                if(dup == true){
                    add = false;
                }
            }
            if(add){
                for(ColumnSymbol col : tableSymbol.values.values()){
                    col.values.add(table2.values.get(col.name).values.get(i));
                }
            }
        }
        return tableSymbol;
    }
}