package Rules.AST.SQL;

import Rules.AST.AnyName;

public class indexedColumn extends SqlStatment {
    public AnyName columnName;
    public AnyName collationName;
    public String desc=null;
}
