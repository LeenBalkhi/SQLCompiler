package Rules.AST.Java.Logic;

import Rules.AST.Java.JavaBody.JavaBody;

public class VariableAssignment extends JavaBody {
    public String operator;
   public VariableAssignmentValue variableAssignmentValue = new VariableAssignmentValue();
}
