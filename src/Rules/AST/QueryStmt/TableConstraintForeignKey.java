package Rules.AST.QueryStmt;

import Rules.AST.Node;

import java.util.ArrayList;

public class TableConstraintForeignKey extends Node {
    public ArrayList<String> fks=new ArrayList<>();
    public Node foreignKeyClause;
}
