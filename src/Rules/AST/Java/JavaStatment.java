package Rules.AST.Java;

import Rules.AST.Node;
import Rules.AST.Visitor.ASTVisitor;

public class JavaStatment extends Node {
    @Override
    public void accept(ASTVisitor astVisitor){astVisitor.visit();}
}
