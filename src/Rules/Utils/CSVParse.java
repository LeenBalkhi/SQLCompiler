package Rules.Utils;

import Rules.SymbolTableMu.ColumnSymbol;
import Rules.SymbolTableMu.TableSymbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;

public class CSVParse {
    public String pathToCsv;
    public TableSymbol tableSymbol;

    public CSVParse(String path,TableSymbol temp){
        pathToCsv = path;
        tableSymbol = temp;
    }

    public void loadCsv() throws IOException {
        TableSymbol tableSymbol = new TableSymbol();
        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        while ((row = csvReader.readLine()) != null) {
            int i=0;
            String[] data = row.split(",");
            for (ColumnSymbol col : tableSymbol.values.values()){
                if(col.type.equals("Long")){
                    try {
                        col.values.add( NumberFormat.getInstance().parse(data[i]));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                else if(col.type.equals("Boolean")){
                    if(data[i].equals("true")){
                        col.values.add(true);
                    }else if(data[i].equals("false")){
                        col.values.add(false);
                    }
                }
                else if(col.type.equals("String")){
                    col.values.add(data[i]);
                }
                i++;
            }
        }
        csvReader.close();
    }
}
