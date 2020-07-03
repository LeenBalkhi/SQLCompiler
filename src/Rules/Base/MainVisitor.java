package Rules.Base;

import Rules.AST.Parse;
import Rules.generated.*;

public class MainVisitor extends SqlJavaVisitor {
    @Override public Parse visitParse(SqlParser.ParseContext ctx) {
        Parse p = new Parse();
        if(ctx.java_stmt() != null)
            p.Java = visitJava_stmt(ctx.java_stmt());
        return p;
    }
}
