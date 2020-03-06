package Rules.AST.SQL;

import Rules.AST.Node;
import Rules.AST.Visitor.ASTVisitor;

import java.util.ArrayList;

public class Statement extends SqlStatment {

    public ArrayList<Node > stmts = new ArrayList<>();

}
