package Rules.AST.SQL;

import Rules.AST.Node;

public class SqlStatment extends Node {
    public Boolean Unique=false;
    public String order; //might change later to enum
    public Node stmt;
}
