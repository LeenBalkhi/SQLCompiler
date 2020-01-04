package Rules.AST.Java.Logic;

import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Node;

import java.util.ArrayList;

public class VariableDeclaration extends Node {
    public ArrayList<Node> variableAssignments = new ArrayList<>();
}
