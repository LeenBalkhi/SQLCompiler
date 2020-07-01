package Rules.SymbolTableMu;

import java.util.ArrayList;

public class SqlType{
    public String name;
    public ArrayList <SqlTypeEntry> entries = new ArrayList<>();

    public void printType(){
        System.out.println("SqlType " + name + ":");
        for(int i=0 ; i < entries.size();i++){
            System.out.println("Name: " + entries.get(i).name + " - Type: "+ entries.get(i).type);
        }
    }

    public boolean entryExists(String name){
        for(int i=0;i<entries.size();i++){
            if(entries.get(i).name.equals(name)){
                return true;
            }
        }
        return false;
    }
}
