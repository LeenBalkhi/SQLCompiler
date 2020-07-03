package Rules.AST.SQL.DQL;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;
import Rules.SymbolTableMu.SqlType;

import java.util.ArrayList;

public class FactoredSelectStatement extends Node {
    public Node selectCore;
    public ArrayList<Node> orderingterms=new ArrayList<>();
    public ArrayList<Node> expression=new ArrayList<>();
    public SqlType sqlType = new SqlType();
}
