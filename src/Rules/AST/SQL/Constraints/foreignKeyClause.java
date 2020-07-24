package Rules.AST.SQL.Constraints;

import Rules.AST.AnyName;
import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;

import java.util.ArrayList;

public class foreignKeyClause extends SqlStatment {
    public AnyName dataBaseName;
    public AnyName foreignTableName;
    public ArrayList<AnyName> foreignTableColumnNames=new ArrayList<>();
    //might change later to one entity of Data
    public ArrayList<Node> matchOnNodes = new ArrayList<>();
}
