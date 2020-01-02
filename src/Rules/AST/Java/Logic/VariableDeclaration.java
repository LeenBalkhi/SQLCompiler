package Rules.AST.Java.Logic;

import Rules.AST.Java.JavaBody.JavaBody;

import java.util.ArrayList;

public class VariableDeclaration extends JavaBody {
    public ArrayList<VariableAssignment> variableAssignments = new ArrayList<>();
}
