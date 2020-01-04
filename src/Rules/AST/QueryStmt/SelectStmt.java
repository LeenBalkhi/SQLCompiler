package Rules.AST.QueryStmt;

import Rules.AST.Visitor.ASTVisitor;

public class SelectStmt extends Statement {

    public String fromItem;


    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
