package Rules.SymbolTableMu;

import java.util.ArrayList;

public class TableOrSubQueryTypeEntry {
    public ArrayList<TableOrSubQueryInnerTypeEntry> types = new ArrayList<>();
    public String as;

//    public String findType(String name) {
//        for(int i=0;i<sqlType.entries.size();i++){
//            if(sqlType.entries.get(i).name.equals(name))
//                return sqlType.entries.get(i).type;
//        }
//        return null;
//    }

    public void printType(){
        System.out.println("Outer Type "+as+":");
        for(int i=0;i<types.size();i++){
            System.out.println("Inner Type "+types.get(i).as+":");
            types.get(i).sqlType.printType();
        }
    }
}
