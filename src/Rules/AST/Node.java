package Rules.AST;

import Rules.AST.Visitor.ASTVisitor;

public class Node {

    private int line;
    private int col;

    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public void accept(ASTVisitor astVisitor)
    {
        astVisitor.visit(this);
    }
}
