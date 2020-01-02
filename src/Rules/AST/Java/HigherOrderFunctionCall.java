package Rules.AST.Java;

import Rules.AST.Node;

import java.util.ArrayList;

public class HigherOrderFunctionCall extends JavaStatment {
    public ArrayList<ArgumentList> argumentLists = new ArrayList<>();
    public HigherOrderFunction higherOrderFunction = new HigherOrderFunction();
}
