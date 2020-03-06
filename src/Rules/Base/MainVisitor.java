package Rules.Base;

import Rules.AST.Node;
import Rules.AST.Parse;
import Rules.AST.Visitor.ASTVisitor;
import Rules.AST.Visitor.BaseASTVisitor;
import Rules.generated.*;

public class MainVisitor extends sqlVisitor {
    @Override public Parse visitParse(SqlParser.ParseContext ctx) {
        Parse p = new Parse();
        if(ctx.java_stmt() != null)
            p.Java = visitJava_stmt(ctx.java_stmt());
        if(ctx.sql_stmt_list()!=null) {
            for (int i = 0; i < ctx.sql_stmt_list().size(); i++) {
                p.sqlStmts.add(visitSql_stmt_list(ctx.sql_stmt_list().get(i)));
            }
        }
        return p;
    }
}
