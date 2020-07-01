package Rules.SymbolTableMu;

import java.util.LinkedHashMap;

public class TableSymbol extends Symbol {
    public LinkedHashMap<String,ColumnSymbol> values = new LinkedHashMap<>();

    public void printTable(SymbolTable symbolTable){
        System.out.println("Table Name: "+ name);
        values.entrySet().forEach(entry -> {
            System.out.println("Column :" + entry.getValue().name + " - " + entry.getValue().type);
            if (symbolTable.sqlTypes.containsKey(entry.getValue().type)) {
                SqlType sqlType = symbolTable.sqlTypes.get(entry.getValue().type);
                sqlType.printType();
            }
        });
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
}
