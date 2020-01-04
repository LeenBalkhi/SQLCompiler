package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class JoinClause extends Node {
    public Node tableOrSubQuery;
    public ArrayList<String> joinOperators = new ArrayList<>();
    public ArrayList<Node> tableOrSubQueries = new ArrayList<>();
    public ArrayList<Node> joinConstraints = new ArrayList<>();
}
