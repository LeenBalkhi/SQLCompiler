package Rules.AST.Java;

import Rules.AST.Java.Utils.Expression;
import Rules.AST.Node;

public class DefaultParameter extends Node {
    public String variable = new String();
    public Expression expression = new Expression();
}
