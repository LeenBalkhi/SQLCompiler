package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class SqlExpressionCase12 extends Node {
    public String functionName;
    public ArrayList<Node> expressions=new ArrayList<>();
    public boolean distinct;
    public String op;
}
