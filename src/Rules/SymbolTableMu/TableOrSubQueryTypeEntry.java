package Rules.SymbolTableMu;

public class TableOrSubQueryTypeEntry {
    public SqlType sqlType;
    public String as;

    public String findType(String name) {
        for(int i=0;i<sqlType.entries.size();i++){
            if(sqlType.entries.get(i).name.equals(name))
                return sqlType.entries.get(i).type;
        }
        return null;
    }
}
