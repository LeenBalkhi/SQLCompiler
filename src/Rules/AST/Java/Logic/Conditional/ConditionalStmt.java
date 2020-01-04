package Rules.AST.Java.Logic.Conditional;

import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Node;

import java.util.ArrayList;

public class ConditionalStmt extends Node {
    public ArrayList<Node> ifs = new ArrayList<>();
    public ArrayList<Node> elseifs = new ArrayList<>();
    public Node elseStmt;
}
