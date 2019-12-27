package Rules.AST.QueryStmt;

import Rules.AST.Node;
import Rules.AST.Visitor.ASTVisitor;

public class Statement extends Node {

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ASTVisitor astVisitor){}
}
