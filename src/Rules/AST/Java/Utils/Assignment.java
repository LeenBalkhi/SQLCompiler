package Rules.AST.Java.Utils;

import Rules.AST.Java.Logic.VariableAssignmentValue;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class Assignment extends Node {
    public Node variableAssignmentValue;
    public Node assignmentOperator;

    public Object getValue(Scope scope){

    }
}
