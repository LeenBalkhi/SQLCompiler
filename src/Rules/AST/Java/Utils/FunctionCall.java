package Rules.AST.Java.Utils;

import Rules.AST.Java.ArgumentList;
import Rules.AST.Node;
import Rules.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class FunctionCall extends Node {
    public String functionName;
    public Node argumentList;
}
