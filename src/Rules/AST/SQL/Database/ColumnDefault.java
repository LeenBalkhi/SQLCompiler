package Rules.AST.SQL.Database;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class ColumnDefault extends SqlStatment {
    public String value=null;
    public Node exression;
    public String anyname1=null;
    public ArrayList<String> anyNames=new ArrayList<>();
}
