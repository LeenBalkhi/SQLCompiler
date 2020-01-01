package Rules.Base;

import Rules.AST.Parse;
import Rules.AST.QueryStmt.Statement;
import Rules.generated.SqlParser;

import java.util.List;

public class ParseVisitor extends BaseVisitor {
    @Override public Parse visitParse(SqlParser.ParseContext ctx) {
        System.out.println("visitParse");
        Parse p = new Parse();
        List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
        p.setSqlStmts(sqlStmts);
        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number

        return p;
    }
}
