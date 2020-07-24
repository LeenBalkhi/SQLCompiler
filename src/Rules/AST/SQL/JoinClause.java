package Rules.AST.SQL;

import Rules.AST.Node;

import java.util.ArrayList;

public class JoinClause extends SqlStatment {
    public Node tableOrSubQuery;
    public ArrayList<Node> joinOperators = new ArrayList<>();
    public ArrayList<Node> tableOrSubQueries = new ArrayList<>();
    public ArrayList<Node> joinConstraints = new ArrayList<>();
}
