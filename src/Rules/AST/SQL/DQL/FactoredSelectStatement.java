package Rules.AST.SQL.DQL;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class FactoredSelectStatement extends SqlStatment {
    public Node selectCore;
    public ArrayList<Node> orderingterms=new ArrayList<>();
    public ArrayList<Node> expression=new ArrayList<>();
}
