package Rules.AST.SQL.DQL;

import Rules.AST.Node;
import Rules.SymbolTableMu.TableSymbol;

import java.util.ArrayList;

public class FactoredSelectStatement extends Node {
    public Node selectCore;
    public ArrayList<Node> orderingterms=new ArrayList<>();
    public ArrayList<Node> expression=new ArrayList<>();
    public TableSymbol type;
}
