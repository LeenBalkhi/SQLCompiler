package Rules.AST;

import Rules.AST.Java.JavaStatment;
import Rules.AST.Node;
import Rules.AST.*;
import Rules.AST.SQL.Statement;
import Rules.AST.Visitor.ASTVisitor;
import Rules.AST.Java.FunctionDeclaration;
import java.util.ArrayList;
import java.util.List;

public class Parse extends Node {

    public List<Statement> sqlStmts = new ArrayList<Statement>();
    public Node Java;

}
