package Rules.AST.SQL.Expression;

import Rules.AST.AnyName;
import Rules.AST.Node;

import java.util.ArrayList;

public class SqlExpressionCase12 extends Node {
    public AnyName functionName;
    public ArrayList<Node> expressions=new ArrayList<>();
    public boolean distinct;
    public String op;
}
