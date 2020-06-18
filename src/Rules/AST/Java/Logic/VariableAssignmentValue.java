package Rules.AST.Java.Logic;

import Rules.AST.Java.Utils.Expression;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

public class VariableAssignmentValue extends Node {
  public Node Value;

  public Object getValue(Scope scope){
    if(Value instanceof Expression)
      return ((Expression)Value).getValue(scope);
    return null;
  }

  public String getType(Scope scope){
    if(Value instanceof Expression)
      return ((Expression)Value).getType(scope);
    return null;
  }
}
