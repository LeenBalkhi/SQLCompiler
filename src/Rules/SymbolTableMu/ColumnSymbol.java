package Rules.SymbolTableMu;


import java.util.ArrayList;

public class ColumnSymbol extends Symbol{
    public ArrayList<Object> values = new ArrayList<>();


    public ColumnSymbol clone(){
        ColumnSymbol col = new ColumnSymbol();
        col.name = this.name;
        col.type = this.type;
        for(int i=0;i<this.values.size();i++){
            col.values.add(this.values.get(i));
        }
        return col;
    }

}
