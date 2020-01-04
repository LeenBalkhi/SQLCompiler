package Rules.AST.Java.Logic.Conditional;

import Rules.AST.Java.Utils.BooleanExpression;
import Rules.AST.Node;

public class ElseIfStmt extends Node {
    public Node condition;
    public Node body;
}
