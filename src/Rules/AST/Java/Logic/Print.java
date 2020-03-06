package Rules.AST.Java.Logic;

import Rules.AST.Java.Utils.Expression;
import Rules.AST.Java.Utils.JavaString;
import Rules.AST.Node;
import Rules.generated.*;

import java.util.ArrayList;

public class Print extends Node {
    public ArrayList<Expression> expressions = new ArrayList<>();
}
