package Rules.AST.Java.Logic.Loop;

import Rules.AST.Java.Utils.Variable;
import Rules.AST.Node;

public class ForEachLoop extends Node {
    public Variable variable;
    public String arrayName;
    public Node block;
}
