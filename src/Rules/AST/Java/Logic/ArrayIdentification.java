package Rules.AST.Java.Logic;

import Rules.AST.Java.Utils.Expression;
import Rules.AST.Node;

import java.util.ArrayList;

public class ArrayIdentification extends Node {
   public ArrayList<Expression> arrayElementasExpr;
   public ArrayList<ArrayIdentification> arrayElementasArray;
}
