package Rules.AST.SQL.DQL;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class SelectOrValue extends SqlStatment {
    public String id;
    public ArrayList<Node> resColumns = new ArrayList<>();
    public ArrayList<Node> tablesorSbqueries = new ArrayList<>();
    public Node join;
    public ArrayList<Node> expressions = new ArrayList<>();
}
