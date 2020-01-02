package Rules.AST.Java.Utils;

import Rules.AST.Node;

public class LogicalCondition extends Node {
    public BooleanExpression condition = new BooleanExpression();
    public Node ifTrue;
    public Node ifFalse;
}
