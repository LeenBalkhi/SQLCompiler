package Rules.AST.SQL.Database;

import Rules.AST.AnyName;
import Rules.AST.SQL.SqlStatment;

import java.util.HashMap;

public class TypeName extends SqlStatment {
   public AnyName name;
   public HashMap<String,AnyName> names = new HashMap();
}
