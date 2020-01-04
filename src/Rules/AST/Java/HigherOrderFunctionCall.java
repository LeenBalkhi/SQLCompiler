package Rules.AST.Java;

import Rules.AST.Node;

import java.util.ArrayList;

public class HigherOrderFunctionCall extends JavaStatment {
    public ArrayList<Node> argumentLists = new ArrayList<>();
    public Node higherOrderFunction = new HigherOrderFunction();
}
