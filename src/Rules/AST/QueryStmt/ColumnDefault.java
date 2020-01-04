package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class ColumnDefault extends Node {
    public String value=null;
    public Node exression;
    public String anyname1=null;
    public ArrayList<String> anyNames=new ArrayList<>();
}
