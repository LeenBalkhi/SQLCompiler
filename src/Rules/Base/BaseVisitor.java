package Rules.Base;
import Rules.AST.Parse;
import Rules.AST.SQL.*;
import Rules.AST.SQL.DQL.SelectStmt;
import Rules.generated.*;
import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends SqlBaseVisitor {


        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Parse visitParse(SqlParser.ParseContext ctx) {
//                System.out.println("visitParse");
//                Parse p = new Parse();
//                List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
//             //   p.setSqlStmts(sqlStmts);
//                p.setLine(ctx.getStart().getLine()); //get line number
//                p.setCol(ctx.getStart().getCharPositionInLine()); // get col number
//
//                return p;
//        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        @Override public  Object visitError(SqlParser.ErrorContext ctx) { return visitChildren(ctx); }



        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
//        @Override public List<Statement> visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx) {
//
//                System.out.println("visitSql_stmt_list");
//
//                List<Statement> sqlStmt = new ArrayList<Statement>();
//                for (int i =0; i < ctx.sql_stmt().size() ; i++){
//                        sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
//                }
//
//                return sqlStmt;
////        return visitChildren(ctx);
//
//        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        @Override public Statement visitSql_stmt(SqlParser.Sql_stmtContext ctx) {

                System.out.println("visitSql_stmt   ");
                Statement s = new Statement();
                if(ctx.factored_select_stmt() != null){
                      //  s = visitFactored_select_stmt(ctx.factored_select_stmt());
                }

                return s;
//        return visitChildren(ctx);
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        @Override public  Object visitSelect_stmt(SqlParser.Select_stmtContext ctx) {
                System.out.println("visitSelect_stmt");

                return visitChildren(ctx); }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        @Override public SelectStmt visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx)
        {
                System.out.println("visitFactored_select_stmt");

                SelectStmt select = new SelectStmt();
                //select.setFromItem( visitTable_or_subquery(ctx.select_core().table_or_subquery(0)));
               // select.setName("Select");
                return select;
//        return visitChildren(ctx);

        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        @Override public  Object visitSelect_or_values(SqlParser.Select_or_valuesContext ctx) {
                return visitChildren(ctx);
        }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        @Override public  Object visitOrdering_term(SqlParser.Ordering_termContext ctx) { return visitChildren(ctx); }
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation returns the result of calling
         * {@link #visitChildren} on {@code ctx}.</p>
         */
//        @Override public  Parse visitParse(SqlParser.ParseContext ctx) {
//                System.out.println("visitParse");
//                Parse p = new Parse();
//                List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
//                p.setSqlStmts(sqlStmts);
//                p.setLine(ctx.getStart().getLine()); //get line number
//                p.setCol(ctx.getStart().getCharPositionInLine()); // get col number
//
//                return p;
//        }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitError(SqlParser.ErrorContext ctx) { return visitChildren(ctx); }
//
//        @Override
//        public Object visitIncrement(SqlParser.IncrementContext ctx) {
//                return visitChildren(ctx);
//        }
//
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public List<Statement> visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx) {
//
//                System.out.println("visitSql_stmt_list");
//
//                List<Statement> sqlStmt = new ArrayList<Statement>();
//                for (int i =0; i < ctx.sql_stmt().size() ; i++){
//                        sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
//                }
//
//                return sqlStmt;
////        return visitChildren(ctx);
//
//        }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public Statement visitSql_stmt(SqlParser.Sql_stmtContext ctx) {
//
//                System.out.println("visitSql_stmt   ");
//                Statement s = new Statement();
//                if(ctx.factored_select_stmt() != null){
//                        s = visitFactored_select_stmt(ctx.factored_select_stmt());
//                }
//
//                return s;
////        return visitChildren(ctx);
//        }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitSelect_stmt(SqlParser.Select_stmtContext ctx) {
//                System.out.println("visitSelect_stmt");
//
//                return visitChildren(ctx); }
//
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public SelectStmt visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx)
//        {
//                System.out.println("visitFactored_select_stmt");
//
//                SelectStmt select = new SelectStmt();
//                select.setFromItem( visitTable_or_subquery(ctx.select_core().table_or_subquery(0)));
//                select.setName("Select");
//                return select;
////        return visitChildren(ctx);
//
//        }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitCommon_table_expression(SqlParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitSelect_or_values(SqlParser.Select_or_valuesContext ctx) {
//                return visitChildren(ctx);
//        }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitOrdering_term(SqlParser.Ordering_termContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitExpr(SqlParser.ExprContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitResult_column(SqlParser.Result_columnContext ctx) { return visitChildren(ctx); }
//
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public String visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx) {
//
//                System.out.println("visitTable_or_subquery");
//                String tableName = "";
//
//                if(ctx.table_name() != null){
//                        tableName = ctx.table_name().any_name().IDENTIFIER().getSymbol().getText();
//                }
//                return tableName;
//        }
//
//
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitColumn_alias(SqlParser.Column_aliasContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitColumn_name(SqlParser.Column_nameContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitTable_name(SqlParser.Table_nameContext ctx) {
//                System.out.println(ctx.any_name().IDENTIFIER().getText());
//                return visitChildren(ctx);
//        }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitDatabase_name(SqlParser.Database_nameContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitCollation_name(SqlParser.Collation_nameContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitLiteral_value(SqlParser.Literal_valueContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitAny_name(SqlParser.Any_nameContext ctx) { return visitChildren(ctx); }
//        /**
//         * {@inheritDoc}
//         *
//         * <p>The default implementation returns the result of calling
//         * {@link #visitChildren} on {@code ctx}.</p>
//         */
//        @Override public  Object visitKeyword(SqlParser.KeywordContext ctx) { return visitChildren(ctx); }
//}
}