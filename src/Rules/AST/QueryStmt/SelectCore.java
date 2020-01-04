package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class SelectCore extends Node {
    public boolean all;
    public boolean distinct;
    public ArrayList<Node> resultColumns=new ArrayList<>();
    public ArrayList <Node> tableOrSubQueries = new ArrayList<>();
    public Node joinClause;
    public Node expression;
    public ArrayList<Node> groupByexpressions=new ArrayList<>();
    public Node havingExpression;
    public ArrayList<Node> valuesExpression;
}
