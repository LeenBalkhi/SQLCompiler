package Rules.AST.SQL.DDL;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class UpdateStatement extends SqlStatment {
    public Node qualifiedTableName;
    public ArrayList<AnyName> columnNames=new ArrayList<>();
    public ArrayList<Node> expressions =new ArrayList<>();
    public Node whereExpression;
}
