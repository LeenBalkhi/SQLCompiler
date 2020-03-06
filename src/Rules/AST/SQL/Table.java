package Rules.AST.SQL;

import Rules.AST.SQL.Database.ColumnAlias;

import java.util.ArrayList;

public class Table  extends  SqlStatment{
    String TableName;
    ArrayList<ColumnAlias> cloumns = new ArrayList<>();
}
