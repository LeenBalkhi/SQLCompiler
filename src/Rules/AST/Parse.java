package Rules.AST;

import Rules.AST.SQL.Statement;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node {

    public List<Statement> sqlStmts = new ArrayList<Statement>();
    public Node Java;

}
