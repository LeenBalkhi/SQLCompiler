package Rules.AST.Java.Logic;

import Rules.AST.Java.Utils.Expression;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;
import Rules.Utils.Error;

public class VariableAssignmentValue extends Node {
  public Node Value;

  public Object getValue(Scope scope)throws Error {
    if(Value instanceof Expression)
      return ((Expression)Value).getValue(scope);
    return null;
  }

  public String getType(Scope scope)throws Error{
    if(Value instanceof Expression)
      return ((Expression)Value).getType(scope);
    return null;
  }
}
