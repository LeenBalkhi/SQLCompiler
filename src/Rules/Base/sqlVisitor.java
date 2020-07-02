package Rules.Base;

import Rules.AST.AnyName;
import Rules.AST.Java.ArgumentList;
import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Node;
import Rules.AST.SQL.*;
import Rules.AST.SQL.DDL.*;
import Rules.AST.SQL.DQL.*;
import Rules.AST.SQL.Database.*;
import Rules.AST.SQL.Constraints.*;
import Rules.AST.SQL.Expression.*;
import Rules.SymbolTableMu.*;
import Rules.Utils.Error;
import Rules.Utils.Path;
import Rules.generated.*;
import Rules.Main;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class sqlVisitor extends JavaVisitor {

@Override
    public Statement visitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx)
    {
        Statement statement = new Statement();
        for(int i=0; i < ctx.sql_stmt().size(); i++)
            statement.stmts.add(visitSql_stmt(ctx.sql_stmt().get(i)));
        return statement;
    }
    @Override
    public SqlStatment visitSql_stmt(SqlParser.Sql_stmtContext ctx)
    {
        SqlStatment sqlStatment = new SqlStatment();
        if(ctx.create_type()!=null)
            sqlStatment.stmt = visitCreate_type(ctx.create_type());
        if(ctx.create_table_stmt() != null)
            sqlStatment.stmt = visitCreate_table_stmt(ctx.create_table_stmt());
        if(ctx.factored_select_stmt() != null)
            sqlStatment.stmt = visitFactored_select_stmt(ctx.factored_select_stmt());
        return sqlStatment;
    }
    @Override
    public AnyName visitAny_name(SqlParser.Any_nameContext ctx)
    {
        AnyName anyName = new AnyName();
        if(ctx.any_name()!= null)
            anyName.name = ctx.any_name().getText();
        if(ctx.IDENTIFIER() != null)
            anyName.name = ctx.IDENTIFIER().getSymbol().getText();
         if(ctx.STRING_LITERAL() != null)
             anyName.name = ctx.STRING_LITERAL().getSymbol().getText();
        return anyName;
    }

     @Override
     public ColumnDef visitColumn_def(SqlParser.Column_defContext ctx)
     {
         ColumnDef columnDef = new ColumnDef();
         columnDef.name = visitAny_name(ctx.column_name().any_name());
         for(int i=0; i < ctx.type_name().size() ; i ++)
             columnDef.typeName = visitType_name(ctx.type_name().get(i));
         return columnDef;
     }

    public SqlExpression visitExpr(SqlParser.ExprContext ctx)
     {
         SqlExpression sqlExpression = new SqlExpression();
         Node temp = visit(ctx);
         if(temp instanceof SqlExpressionCase1)
         {
             sqlExpression.expression = (SqlExpressionCase1)temp;
             sqlExpression.type = ((SqlExpressionCase1)temp).type;
         }
         if(temp instanceof SqlExpressionCase2)
         {
             sqlExpression.expression = (SqlExpressionCase2)temp;
             sqlExpression.type = ((SqlExpressionCase2)temp).type;
         }
         if(temp instanceof SqlExpressionCase3)
         {
             sqlExpression.expression = (SqlExpressionCase3)temp;
         }
         if(temp instanceof SqlExpressionCase4)
         {
             sqlExpression.expression = (SqlExpressionCase4)temp;
             sqlExpression.type = ((SqlExpressionCase4)temp).type;
         }
         if(temp instanceof SqlExpressionCase5)
         {
             sqlExpression.expression = (SqlExpressionCase5)temp;
             sqlExpression.type = ((SqlExpressionCase5)temp).type;
         }
         if(temp instanceof SqlExpressionCase6)
         {
             sqlExpression.expression = (SqlExpressionCase6)temp;
             sqlExpression.type = ((SqlExpressionCase6)temp).type;
         }
         if(temp instanceof SqlExpressionCase7)
         {
             sqlExpression.expression = (SqlExpressionCase7)temp;
         }
         if(temp instanceof SqlExpressionCase8)
         {
             sqlExpression.expression = (SqlExpressionCase8)temp;
             sqlExpression.type = ((SqlExpressionCase8)temp).type;
         }
         if(temp instanceof SqlExpressionCase9)
         {
             sqlExpression.expression = (SqlExpressionCase9)temp;
         }
         if(temp instanceof SqlExpressionCase10)
         {
             sqlExpression.expression = (SqlExpressionCase10)temp;
             sqlExpression.type = ((SqlExpressionCase10)temp).type;
         }
         if(temp instanceof SqlExpressionCase11)
         {
             sqlExpression.expression = (SqlExpressionCase11)temp;
             sqlExpression.type = ((SqlExpressionCase11)temp).type;
         }
         if(temp instanceof SqlExpressionCase12)
         {
             sqlExpression.expression = (SqlExpressionCase12)temp;
         }
         if(temp instanceof SqlExpressionCase13)
         {
             sqlExpression.expression = (SqlExpressionCase13)temp;
         }
         if(temp instanceof SqlExpressionCase14)
         {
             sqlExpression.expression = (SqlExpressionCase14)temp;
         }
         if(temp instanceof SqlExpressionCase15)
         {
             sqlExpression.expression = (SqlExpressionCase15)temp;
         }
         if(temp instanceof SqlExpressionCase16)
         {
             sqlExpression.expression = (SqlExpressionCase16)temp;
         }
         if(temp instanceof SqlExpressionCase22)
         {
             sqlExpression.expression = (SqlExpressionCase22)temp;
             sqlExpression.type = ((SqlExpressionCase22)temp).type;
         }
         return sqlExpression;
     }

    @Override
    public SqlExpressionCase1 visitCase1(SqlParser.Case1Context ctx)
    {
        SqlExpressionCase1 sqlExpressionCase1 = new SqlExpressionCase1();
        sqlExpressionCase1.literalValue = ctx.literal_value().getText();
        try {
            sqlExpressionCase1.type = NumberFormat.getInstance().parse(sqlExpressionCase1.literalValue).getClass().getSimpleName();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sqlExpressionCase1;
    }

    @Override
    public SqlExpressionCase2 visitCase2(SqlParser.Case2Context ctx) {
        boolean err = true;
        boolean useTable = false;
        SqlExpressionCase2 sqlExpressionCase2 = new SqlExpressionCase2();
        SqlType sqlType = new SqlType();
        System.out.println(symbolTable.queryManager.size()+"EXPR");
        if(ctx.table_name()!= null){
            sqlExpressionCase2.tableName = visitAny_name(ctx.table_name().any_name());
            for(int i=0;i<symbolTable.queryManager.size();i++){
                if(symbolTable.queryManager.get(i).as.equals(sqlExpressionCase2.tableName.name)){
                    sqlType = symbolTable.queryManager.get(i).sqlType;
                    err = false;
                    useTable = true;
                }
            }
            if(err){
                if(symbolTable.queryManager.size()==1){
                    for(int i=0;i<symbolTable.queryManager.get(0).sqlType.entries.size();i++){
                        if(symbolTable.queryManager.get(0).sqlType.entries.get(i).name.equals(sqlExpressionCase2.tableName.name)){
                            err = false;
                            sqlType.entries.add(symbolTable.queryManager.get(0).sqlType.entries.get(i));
                        }
                    }
                }
                if(err){
                    int line =  ctx.table_name().start.getLine();
                    int col = ctx.table_name().start.getCharPositionInLine();
                    String des = sqlExpressionCase2.tableName.name + " Does Not Exist In This Context";
                    Error error = new Error(line , col , des);
                    errors.add(error);
                }
            }
        }else
            err = false;
        sqlExpressionCase2.columnName =visitAny_name(ctx.column_name().any_name());
        if(!err){
            err = true;
            if(ctx.table_name()!=null){
                if(useTable){
                    for (int i=0;i<sqlType.entries.size();i++){
                        if(sqlType.entries.get(i).name.equals(sqlExpressionCase2.columnName.name)){
                            err = false;
                            sqlExpressionCase2.type = sqlType.entries.get(i).type;
                        }
                    }
                }
                else {
                    if(symbolTable.sqlTypes.containsKey(sqlType.entries.get(0).type)) {
                        for(int i=0; i < symbolTable.sqlTypes.get(sqlType.entries.get(0).type).entries.size();i++) {
                            if( symbolTable.sqlTypes.get(sqlType.entries.get(0).type).entries.get(i).name.equals(sqlExpressionCase2.columnName.name)){
                                err = false;
                                sqlExpressionCase2.type = symbolTable.sqlTypes.get(sqlType.entries.get(0).type).entries.get(i).type;
                            }
                        }
                    }
                }
            }
            else {
                for(int j=0;j<symbolTable.queryManager.get(0).sqlType.entries.size();j++){
                    if(symbolTable.queryManager.get(0).sqlType.entries.get(j).name.equals(sqlExpressionCase2.columnName.name)){
                        err=false;
                        sqlExpressionCase2.type = symbolTable.queryManager.get(0).sqlType.entries.get(j).type;
                    }
                }
            }
            if(err){
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = sqlExpressionCase2.columnName.name +" Does Not Exist In Current Context";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
        }
        return sqlExpressionCase2;
    }

    @Override
    public SqlExpressionCase3 visitCase3(SqlParser.Case3Context ctx) {
        SqlExpressionCase3 sqlExpressionCase3 = new SqlExpressionCase3();
        sqlExpressionCase3.unaryOperator = ctx.unary_operator().getText();
        sqlExpressionCase3.SqlExpression = visitExpr(ctx.expr());
        return sqlExpressionCase3;
    }

    @Override
    public SqlExpressionCase4 visitCase4(SqlParser.Case4Context ctx) {
        SqlExpressionCase4 sqlExpressionCase4 = new SqlExpressionCase4();
        sqlExpressionCase4.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase4.op = ctx.op.getText();
        sqlExpressionCase4.SqlExpression2 = visitExpr(ctx.expr(1));
        if(((SqlExpression)sqlExpressionCase4.SqlExpression1).type!= null &&((SqlExpression)sqlExpressionCase4.SqlExpression2).type!=null){
            if( !((SqlExpression)sqlExpressionCase4.SqlExpression1).type.equals("Boolean") || !((SqlExpression)sqlExpressionCase4.SqlExpression2).type.equals("Boolean")) {
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = "Operation || Has To Be Done Between Two Booleans";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else
                sqlExpressionCase4.type = "Boolean";
        }
        return sqlExpressionCase4;
    }

    @Override
    public SqlExpressionCase5 visitCase5(SqlParser.Case5Context ctx) {
        SqlExpressionCase5 sqlExpressionCase5 = new SqlExpressionCase5();
        sqlExpressionCase5.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase5.op = ctx.op.getText();
        sqlExpressionCase5.SqlExpression2 = visitExpr(ctx.expr(1));
        if(((SqlExpression)sqlExpressionCase5.SqlExpression1).type!=null && ((SqlExpression)sqlExpressionCase5.SqlExpression2).type!=null){
            if( !((SqlExpression)sqlExpressionCase5.SqlExpression1).type.equals(((SqlExpression)sqlExpressionCase5.SqlExpression2).type) ||
                    (!((SqlExpression)sqlExpressionCase5.SqlExpression1).type.equals("Long") && !((SqlExpression)sqlExpressionCase5.SqlExpression1).type.equals("Double")) ){
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = "Operation "+ sqlExpressionCase5.op +" Cannot Be Done Between "+ ((SqlExpression)sqlExpressionCase5.SqlExpression1).type +
                        " And "+ ((SqlExpression)sqlExpressionCase5.SqlExpression2).type;
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else
                sqlExpressionCase5.type = ((SqlExpression)sqlExpressionCase5.SqlExpression1).type;
        }
        return sqlExpressionCase5;
    }

    @Override
    public SqlExpressionCase6 visitCase6(SqlParser.Case6Context ctx) {
        SqlExpressionCase6 sqlExpressionCase6 = new SqlExpressionCase6();
        sqlExpressionCase6.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase6.op = ctx.op.getText();
        sqlExpressionCase6.SqlExpression2 = visitExpr(ctx.expr(1));
        if(((SqlExpression)sqlExpressionCase6.SqlExpression1).type!=null && ((SqlExpression)sqlExpressionCase6.SqlExpression2).type!=null){
            if( !((SqlExpression)sqlExpressionCase6.SqlExpression1).type.equals(((SqlExpression)sqlExpressionCase6.SqlExpression2).type) ||
                    (!((SqlExpression)sqlExpressionCase6.SqlExpression1).type.equals("Long") && !((SqlExpression)sqlExpressionCase6.SqlExpression1).type.equals("Double")) ){
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = "Operation "+ sqlExpressionCase6.op +" Cannot Be Done Between "+ ((SqlExpression)sqlExpressionCase6.SqlExpression1).type +
                        " And "+ ((SqlExpression)sqlExpressionCase6.SqlExpression2).type;
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else
                sqlExpressionCase6.type = ((SqlExpression)sqlExpressionCase6.SqlExpression1).type;
        }
        return sqlExpressionCase6;
    }

    @Override
    public SqlExpressionCase7 visitCase7(SqlParser.Case7Context ctx) {
        SqlExpressionCase7 sqlExpressionCase7 = new SqlExpressionCase7();
        sqlExpressionCase7.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase7.op = ctx.op.getText();
        sqlExpressionCase7.SqlExpression2 = visitExpr(ctx.expr(1));
        return sqlExpressionCase7;
    }

    @Override
    public SqlExpressionCase8 visitCase8(SqlParser.Case8Context ctx) {
        SqlExpressionCase8 sqlExpressionCase8 = new SqlExpressionCase8();
        sqlExpressionCase8.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase8.op = ctx.op.getText();
        sqlExpressionCase8.SqlExpression2 = visitExpr(ctx.expr(1));
        if(((SqlExpression)sqlExpressionCase8.SqlExpression1).type!=null && ((SqlExpression)sqlExpressionCase8.SqlExpression1).type!=null){
            if( !((SqlExpression)sqlExpressionCase8.SqlExpression1).type.equals(((SqlExpression)sqlExpressionCase8.SqlExpression2).type) ||
                    ( ( sqlExpressionCase8.op.equals(">") || sqlExpressionCase8.op.equals("<") || sqlExpressionCase8.op.equals(">=") ||
                            sqlExpressionCase8.op.equals("<=") ) && ( !((SqlExpression)sqlExpressionCase8.SqlExpression1).type.equals("Long") &&
                            !((SqlExpression)sqlExpressionCase8.SqlExpression1).type.equals("Double") ) )
            ){
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = "Operation "+ sqlExpressionCase8.op +" Cannot Be Done Between "+ ((SqlExpression)sqlExpressionCase8.SqlExpression1).type +
                        " And "+ ((SqlExpression)sqlExpressionCase8.SqlExpression2).type;
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else
                sqlExpressionCase8.type = "Boolean";
        }
        return sqlExpressionCase8;
    }

    @Override
    public SqlExpressionCase9 visitCase9(SqlParser.Case9Context ctx) {
        SqlExpressionCase9 sqlExpressionCase9 = new SqlExpressionCase9();
        sqlExpressionCase9.SqlExpression1 = visitExpr(ctx.expr(0));
        if(ctx.op != null)
            sqlExpressionCase9.op = ctx.op.getText();
        else if(ctx.K_IS()!=null && ctx.K_NOT()!=null)
            sqlExpressionCase9.op = "IS NOT";
        else if(ctx.K_IS()!=null)
            sqlExpressionCase9.op = "IS";
        else if(ctx.K_IN()!=null)
            sqlExpressionCase9.op = "IN";
        else if(ctx.K_LIKE()!=null)
            sqlExpressionCase9.op = "LIKE";
        else if(ctx.K_GLOB()!=null)
            sqlExpressionCase9.op = "GLOB";
        else if(ctx.K_MATCH()!=null)
            sqlExpressionCase9.op = "MATCH";
        else if(ctx.K_REGEXP()!=null)
            sqlExpressionCase9.op = "REGEXP";
        sqlExpressionCase9.SqlExpression2 = visitExpr(ctx.expr(1));
        return sqlExpressionCase9;
    }

    @Override
    public SqlExpressionCase10 visitCase10(SqlParser.Case10Context ctx) {
        SqlExpressionCase10 sqlExpressionCase10 = new SqlExpressionCase10();
        sqlExpressionCase10.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase10.op =ctx.K_AND().getSymbol().getText();
        sqlExpressionCase10.SqlExpression2 = visitExpr(ctx.expr(1));
        if(((SqlExpression)sqlExpressionCase10.SqlExpression1).type!=null && ((SqlExpression)sqlExpressionCase10.SqlExpression2).type!=null){
            if( !((SqlExpression)sqlExpressionCase10.SqlExpression1).type.equals("Boolean") || !((SqlExpression)sqlExpressionCase10.SqlExpression2).type.equals("Boolean")) {
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = "Operation || Has To Be Done Between Two Booleans";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else
                sqlExpressionCase10.type = "Boolean";
        }
        return sqlExpressionCase10;
    }

    @Override
    public SqlExpressionCase11 visitCase11(SqlParser.Case11Context ctx) {
        SqlExpressionCase11 sqlExpressionCase11 = new SqlExpressionCase11();
        sqlExpressionCase11.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase11.op =ctx.K_OR().getSymbol().getText();
        sqlExpressionCase11.SqlExpression2 = visitExpr(ctx.expr(1));
        if(((SqlExpression)sqlExpressionCase11.SqlExpression1).type!=null && ((SqlExpression)sqlExpressionCase11.SqlExpression2).type!=null){
            if( !((SqlExpression)sqlExpressionCase11.SqlExpression1).type.equals("Boolean") || !((SqlExpression)sqlExpressionCase11.SqlExpression2).type.equals("Boolean")) {
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = "Operation || Has To Be Done Between Two Booleans";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else
                sqlExpressionCase11.type = "Boolean";
        }
        return sqlExpressionCase11;
    }

    @Override
    public SqlExpressionCase12 visitCase12(SqlParser.Case12Context ctx) {
        SqlExpressionCase12 sqlExpressionCase12 = new SqlExpressionCase12();
        sqlExpressionCase12.functionName = visitAny_name(ctx.function_name().any_name());
        if(ctx.K_DISTINCT()!= null)
            sqlExpressionCase12.distinct = true;
        for(int i=0 ; i < ctx.expr().size(); i++)
            sqlExpressionCase12.expressions.add(visitExpr(ctx.expr().get(i)));
        if(ctx.op != null)
            sqlExpressionCase12.op = ctx.op.getText();
        return sqlExpressionCase12;
    }

    @Override
    public SqlExpressionCase13 visitCase13(SqlParser.Case13Context ctx) {
        SqlExpressionCase13 sqlExpressionCase13 = new SqlExpressionCase13();
        sqlExpressionCase13.expression = visitExpr(ctx.expr());
        sqlExpressionCase13.type = ((SqlExpression)sqlExpressionCase13.expression).type;
        return sqlExpressionCase13;
    }

    @Override
    public SqlExpressionCase14 visitCase14(SqlParser.Case14Context ctx) {
        SqlExpressionCase14 sqlExpressionCase14 = new SqlExpressionCase14();
        if(ctx.K_NOT() != null)
            sqlExpressionCase14.not = true;
        for(int i=1; i < ctx.expr().size(); i++)
            sqlExpressionCase14.expressions.add(visitExpr(ctx.expr().get(i)));
        if(ctx.select_stmt() != null)
            sqlExpressionCase14.selectStmt = visitSelect_stmt(ctx.select_stmt());
        if(ctx.database_name() != null)
            sqlExpressionCase14.dataBaseName = visitAny_name(ctx.database_name().any_name());
        sqlExpressionCase14.tableName = visitAny_name(ctx.table_name().any_name());
        return sqlExpressionCase14;
    }

    @Override
    public SqlExpressionCase15 visitCase15(SqlParser.Case15Context ctx) {
        SqlExpressionCase15 sqlExpressionCase15 = new SqlExpressionCase15();
        if(ctx.K_EXISTS()!= null)
            sqlExpressionCase15.exists = true;
        if(ctx.K_NOT() != null)
            sqlExpressionCase15.not = true;
        sqlExpressionCase15.selectStmt = visitSelect_stmt(ctx.select_stmt());
        return sqlExpressionCase15;
    }

    @Override
    public SqlExpressionCase16 visitCase16(SqlParser.Case16Context ctx) {
        SqlExpressionCase16 sqlExpressionCase16 = new SqlExpressionCase16();
        sqlExpressionCase16.expression = visitExpression(ctx.expression());
        try {
            sqlExpressionCase16.type = sqlExpressionCase16.expression.getType(symbolTable.scopeStack.peek());
        } catch (Error error) {
            error.line = ctx.expression().start.getLine();
            error.col = ctx.expression().start.getCharPositionInLine();
            errors.add(error);
        }
        return sqlExpressionCase16;
    }

    @Override
    public SqlExpressionCase22 visitCase22(SqlParser.Case22Context ctx) {
        SqlExpressionCase22 sqlExpressionCase22 = new SqlExpressionCase22();
        sqlExpressionCase22.expression = visitExpr(ctx.expr());
        sqlExpressionCase22.anyname = visitAny_name(ctx.any_name());
        if(((SqlExpression)sqlExpressionCase22.expression).type != null){
            if(symbolTable.sqlTypes.containsKey(((SqlExpression)(sqlExpressionCase22.expression)).type)){
                if(!symbolTable.sqlTypes.get(((SqlExpression)(sqlExpressionCase22.expression)).type).entryExists(sqlExpressionCase22.anyname.name)){
                    int line = ctx.any_name().start.getLine();
                    int col = ctx.any_name().start.getCharPositionInLine();
                    String des = sqlExpressionCase22.anyname.name + " Does Not Exist In "+ ((SqlExpression)(sqlExpressionCase22.expression)).type;
                    Error error = new Error(line,col,des);
                    errors.add(error);
                }
                else {
                    SqlType sqlType = symbolTable.sqlTypes.get(((SqlExpression)(sqlExpressionCase22.expression)).type);
                    for(int i=0;i < sqlType.entries.size();i++){
                        if(sqlExpressionCase22.anyname.name.equals(sqlType.entries.get(i).name))
                            sqlExpressionCase22.type = sqlType.entries.get(i).type;
                    }
                }
            }
            else {
                int line = ctx.expr().start.getLine();
                int col = ctx.expr().start.getCharPositionInLine();
                String des = ((SqlExpression)(sqlExpressionCase22.expression)).type + " Does Not Exist In This Context";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
        }
        return sqlExpressionCase22;
    }

    @Override
     public TypeName visitType_name(SqlParser.Type_nameContext ctx)
     {
         TypeName typeName = new TypeName();
         typeName.name = visitAny_name(ctx.name().any_name());
         return typeName;
     }

    @Override
    public Node visitCreate_type(SqlParser.Create_typeContext ctx) {

        SqlType sqlType = new SqlType();
        boolean err = false;
        sqlType.name = visitType_name(ctx.type_name()).name.name;
        for (int i = 0 ; i < ctx.type().size() ; i++){
            SqlTypeEntry sqlTypeEntry = new SqlTypeEntry();
            sqlTypeEntry.type = ctx.type(i).getText();
            sqlTypeEntry.name = visitAny_name(ctx.any_name(i)).name;
            if(symbolTable.sqlTypes.containsKey(sqlTypeEntry.type)
                    || sqlTypeEntry.type.equals("String")
                    || sqlTypeEntry.type.equals("Long")
                    || sqlTypeEntry.type.equals("Boolean")
                    || sqlTypeEntry.type.equals("Double")
                    || (symbolTable.scopeStack.peek().symbolMap.containsKey(sqlTypeEntry.type)
                    && symbolTable.scopeStack.peek().symbolMap.get(sqlTypeEntry.type) instanceof TableSymbol)) {
                sqlType.entries.add(sqlTypeEntry);
            }
            else {
                err = true;
                sqlType = null;
                break;
            }
        }
        if(!err)
            symbolTable.sqlTypes.put(sqlType.name , sqlType);
        return null;
    }

    @Override
    public CreateTableStatement visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx)
    {
        boolean err = false;
        TableSymbol tableSymbol = new TableSymbol();
        CreateTableStatement createTableStatement = new CreateTableStatement();
        if(ctx.K_IF()!= null)
        createTableStatement.ifNotExists = true;
        if(ctx.table_name() != null)
        {
            createTableStatement.tableName = visitAny_name(ctx.table_name().any_name());
            tableSymbol.name = createTableStatement.tableName.name;
            for(int i=0 ; i < ctx.column_def().size() ; i++){
                createTableStatement.columnDefs.add(visitColumn_def(ctx.column_def().get(i)));
                ColumnDef columnDef = ((ColumnDef)createTableStatement.columnDefs.get(i));
                ColumnSymbol columnSymbol = new ColumnSymbol();
                columnSymbol.name = columnDef.name.name;
                System.out.println( columnDef.name.name );
                String type = columnDef.typeName.name.name;
                if(symbolTable.sqlTypes.containsKey(type)
                || type.equals("String")
                || type.equals("Long")
                || type.equals("Boolean")
                || type.equals("Double")
                || (symbolTable.scopeStack.peek().symbolMap.containsKey(type)
                        && symbolTable.scopeStack.peek().symbolMap.get(type) instanceof TableSymbol)){
                    columnSymbol.type = type;
                    tableSymbol.values.put(columnSymbol.name , columnSymbol);
                }
                else {
                    err = true;
                    tableSymbol = null;
                    break;
                }
            }
        }
        if(!err){
            tableSymbol.type = tableSymbol.getSqlTypeFromTableSymbol(symbolTable).name;
            symbolTable.scopeStack.peek().symbolMap.put(tableSymbol.name , tableSymbol);
        }
        return createTableStatement;
    }

    ////

    @Override
    public FactoredSelectStatement visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx)
    {
        FactoredSelectStatement factoredSelectStatement= new FactoredSelectStatement();
        factoredSelectStatement.selectCore = visitSelect_core(ctx.select_core());
        //((SelectCore)factoredSelectStatement.selectCore).sqlType.printType();
        for(int i=0 ; i <ctx.ordering_term().size() ; i++)
            factoredSelectStatement.orderingterms.add(visitOrdering_term(ctx.ordering_term().get(i)));
        for(int i=0 ; i < ctx.expr().size(); i++)
            factoredSelectStatement.expression.add(visitExpr(ctx.expr().get(i)));
        return factoredSelectStatement;
    }
    @Override
    public SelectCore visitSelect_core(SqlParser.Select_coreContext ctx)
    {
        SelectCore selectCore = new SelectCore();
        if(ctx.K_ALL() != null)
            selectCore.all = true;
        if(ctx.K_DISTINCT() != null)
            selectCore.distinct = true;
        for(int i=0 ; i < ctx.table_or_subquery().size(); i++){
            selectCore.tableOrSubQueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
            for(int j=0;j<((TableOrSubquery)selectCore.tableOrSubQueries.get(i)).types.size();j++){
                selectCore.types.add(((TableOrSubquery)selectCore.tableOrSubQueries.get(i)).types.get(j));
            }
        }
        symbolTable.queryManager = selectCore.types;
        for(int i=0 ; i < ctx.result_column().size(); i++)
            selectCore.resultColumns.add(visitResult_column(ctx.result_column().get(i)));
        if( ctx.join_clause() !=null)
            selectCore.joinClause = visitJoin_clause(ctx.join_clause());
        if(ctx.K_GROUP() != null)
        {
            for(int i=0 ; i < ctx.expr().size(); i++)
                selectCore.groupByexpressions.add(visitExpr(ctx.expr().get(i)));
        }
        if(ctx.K_HAVING() != null)
        {
            for(int i=0 ; i < ctx.expr().size(); i++)
                selectCore.valuesExpression.add(visitExpr(ctx.expr().get(i)));
        }
        return selectCore;
    }

    @Override
    public JoinClause visitJoin_clause(SqlParser.Join_clauseContext ctx)
    {
        JoinClause joinClause= new JoinClause();
        for(int i=0 ; i < ctx.table_or_subquery().size(); i++)
            joinClause.tableOrSubQueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
        for( int i=0 ; i < ctx.join_operator().size(); i++)
            joinClause.joinOperators.add(visitJoin_operator(ctx.join_operator().get(i)));
        for(int i=0; i < ctx.join_constraint().size(); i++)
            joinClause.joinConstraints.add(visitJoin_constraint(ctx.join_constraint().get(i)));
        return joinClause;
    }
    @Override
    public JoinConstraint visitJoin_constraint(SqlParser.Join_constraintContext ctx)
    {
        JoinConstraint joinConstraint = new JoinConstraint();
        joinConstraint.expression = visitExpr(ctx.expr());
        return joinConstraint;
    }
    @Override
    public JoinOperator visitJoin_operator(SqlParser.Join_operatorContext ctx)
    {
        JoinOperator joinOperator = new JoinOperator();
        if(ctx.K_INNER() != null)
            joinOperator.op = ctx.K_INNER().getSymbol().getText();
        if(ctx.K_OUTER() != null)
            joinOperator.op = ctx.K_OUTER().getSymbol().getText();
        return joinOperator;
    }
    @Override
    public TableOrSubquery visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx)
    {
        TableOrSubquery tableOrSubquery = new TableOrSubquery();
        if(ctx.table_name()!= null){
            tableOrSubquery.tableName = visitAny_name(ctx.table_name().any_name());
            if(ctx.table_alias() != null)
                tableOrSubquery.tableAlias = ctx.table_alias().getText();
            if(ctx.index_name() != null)
                tableOrSubquery.indexName = visitAny_name(ctx.index_name().any_name());
            if(!symbolTable.scopeStack.peek().symbolMap.containsKey(tableOrSubquery.tableName.name) ||
                   ! (symbolTable.scopeStack.peek().symbolMap.get(tableOrSubquery.tableName.name) instanceof TableSymbol)){
                int line = ctx.table_name().start.getLine();
                int col = ctx.table_name().start.getCharPositionInLine();
                String des = "Table "+ tableOrSubquery.tableName.name +" Does Not Exist";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else {
                TableOrSubQueryTypeEntry temp = new TableOrSubQueryTypeEntry();
                temp.as = tableOrSubquery.tableName.name;
                temp.sqlType = symbolTable.sqlTypes.get(((TableSymbol)(symbolTable.scopeStack.peek().symbolMap.get(tableOrSubquery.tableName.name))).type);
                if(tableOrSubquery.tableAlias!=null)
                    temp.as = tableOrSubquery.tableAlias;
                tableOrSubquery.types.add(temp);
            }
        }

        else if(ctx.table_or_subquery().size()!=0) {
            for(int i=0 ; i < ctx.table_or_subquery().size(); i++)
                tableOrSubquery.tableOrSubqueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
            if(ctx.join_clause() != null)
                tableOrSubquery.joinClause = visitJoin_clause(ctx.join_clause());
            if(ctx.table_alias()!= null)
                tableOrSubquery.tableAlias = ctx.table_alias().getText();
            if(tableOrSubquery.tableAlias!=null){
                TableOrSubQueryTypeEntry temp = new TableOrSubQueryTypeEntry();
                for(int i=0;i<tableOrSubquery.tableOrSubqueries.size();i++){
                    for(int j=0;j<((TableOrSubquery)tableOrSubquery.tableOrSubqueries.get(i)).types.size();j++){
                        for (int n=0;n<((TableOrSubquery)tableOrSubquery.tableOrSubqueries.get(i)).types.get(j).sqlType.entries.size();n++){
                            temp.sqlType.entries.add(((TableOrSubquery)tableOrSubquery.tableOrSubqueries.get(i)).types.get(j).sqlType.entries.get(n));
                        }
                    }
                }
                temp.as = tableOrSubquery.tableAlias;
                tableOrSubquery.types.add(temp);
            }
            else{
                for(int i=0;i<tableOrSubquery.tableOrSubqueries.size();i++){
                    for(int j=0;j<((TableOrSubquery)tableOrSubquery.tableOrSubqueries.get(i)).types.size();j++) {
                        tableOrSubquery.types.add(((TableOrSubquery)tableOrSubquery.tableOrSubqueries.get(i)).types.get(j));
                    }
                }
            }
        }
        else {
            tableOrSubquery.selectStatment = visitSelect_stmt(ctx.select_stmt());
            if(ctx.table_alias()!=null)
                tableOrSubquery.tableAlias = ctx.table_alias().getText();
            if(tableOrSubquery.tableAlias == null){
                tableOrSubquery.types = ((SelectStmt)tableOrSubquery.selectStatment).types;
            }
            else {
                TableOrSubQueryTypeEntry temp = new TableOrSubQueryTypeEntry();
                for(int i=0;i<((SelectStmt)tableOrSubquery.selectStatment).types.size();i++){
                    for(int j=0;j<((SelectStmt)tableOrSubquery.selectStatment).types.get(i).sqlType.entries.size();j++){
                        temp.sqlType.entries.add( ((SelectStmt)tableOrSubquery.selectStatment).types.get(i).sqlType.entries.get(j));
                    }
                }
                temp.as = tableOrSubquery.tableAlias;
            }
        }
        return tableOrSubquery;
    }

    @Override
    public SelectStmt visitSelect_stmt(SqlParser.Select_stmtContext ctx)
    {
        SelectStmt selectStmt = new SelectStmt();
        selectStmt.selectorval = visitSelect_or_values(ctx.select_or_values());
        selectStmt.types = ((SelectOrValue)selectStmt.selectorval).types;
        for(int i=0;i<selectStmt.types.size();i++){
            selectStmt.types.get(i).sqlType.printType();
        }
        for(int i=0 ; i < ctx.ordering_term().size(); i++)
            selectStmt.ordering.add(visitOrdering_term(ctx.ordering_term().get(i)));
        return selectStmt;
    }
    @Override
    public OrderingTerm visitOrdering_term(SqlParser.Ordering_termContext ctx)
    {
        OrderingTerm orderingTerm= new OrderingTerm();
        orderingTerm.expression = visitExpr(ctx.expr());
        if(ctx.K_ASC() != null)
            orderingTerm.order = ctx.K_ASC().getSymbol().getText();
        if(ctx.K_DESC() != null)
            orderingTerm.order = ctx.K_DESC().getSymbol().getText();
        return orderingTerm;
    }
    @Override
    public SelectOrValue visitSelect_or_values(SqlParser.Select_or_valuesContext ctx)
    {
        SelectOrValue selectOrValue = new SelectOrValue();
        if(ctx.K_DISTINCT() != null)
            selectOrValue.id = ctx.K_DISTINCT().getSymbol().getText();
        if(ctx.K_ALL() != null)
            selectOrValue.id = ctx.K_ALL().getSymbol().getText();
        for(int i=0 ; i < ctx.table_or_subquery().size(); i++){
            selectOrValue.tablesorSbqueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
            for(int j=0;j<((TableOrSubquery)selectOrValue.tablesorSbqueries.get(i)).types.size();j++){
                selectOrValue.types.add(((TableOrSubquery)selectOrValue.tablesorSbqueries.get(i)).types.get(j));
            }
        }
        symbolTable.queryManager.clear();
        for(int i=0;i<selectOrValue.types.size();i++){
            symbolTable.queryManager.add(selectOrValue.types.get(i));
        }
        for(int i=0 ; i < ctx.result_column().size() ;i++){
            selectOrValue.resColumns.add(visitResult_column(ctx.result_column().get(i)));
            String type = ((SqlExpression)((ResultColumn)selectOrValue.resColumns.get(i)).expression).type;
            TableOrSubQueryTypeEntry temp = new TableOrSubQueryTypeEntry();
            if(!( type.equals("String") || type.equals("Boolean") || type.equals("Double") || type.equals("Long") )){
                temp.sqlType = symbolTable.sqlTypes.get(type);
                if(((ResultColumn)selectOrValue.resColumns.get(i)).cloumnForExpr!=null)
                    temp.as = ((ResultColumn)selectOrValue.resColumns.get(i)).cloumnForExpr;
                selectOrValue.types.add(temp);
            }
            else{
                SqlType sqlType = new SqlType();
                SqlTypeEntry sqlTypeEntry = new SqlTypeEntry();
                sqlTypeEntry.type = type;
                sqlType.entries.add(sqlTypeEntry);
                temp.sqlType=sqlType;
                if(((ResultColumn)selectOrValue.resColumns.get(i)).cloumnForExpr!=null)
                    temp.as = ((ResultColumn)selectOrValue.resColumns.get(i)).cloumnForExpr;
                selectOrValue.types.add(temp);
            }
        }
        if(ctx.join_clause() != null)
            selectOrValue.join = visitJoin_clause(ctx.join_clause());
        for(int i=0 ; i < ctx.expr().size(); i++)
            selectOrValue.expressions.add(visitExpr(ctx.expr().get(i)));
        return selectOrValue;
    }

    @Override
    public ResultColumn visitResult_column(SqlParser.Result_columnContext ctx)
    {
        ResultColumn resultColumn= new ResultColumn();
        if(ctx.table_name()!= null){
            resultColumn.tableName = visitAny_name(ctx.table_name().any_name());
            if( !(symbolTable.getSymbol(resultColumn.tableName.name)!=null
                    && symbolTable.getSymbol(resultColumn.tableName.name) instanceof TableSymbol) ){
                int line = ctx.table_name().start.getLine();
                int col = ctx.table_name().start.getCharPositionInLine();
                String des = "Table "+ resultColumn.tableName.name +" Does Not Exist";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
        }
        if(ctx.expr() != null)
        {
            resultColumn.expression = visitExpr(ctx.expr());
            if(ctx.column_alias()!= null)
                resultColumn.cloumnForExpr = ctx.column_alias().getText();
            if(resultColumn.cloumnForExpr!=null){
                System.out.println(resultColumn.cloumnForExpr);
            }
        }
        return resultColumn;
    }
    @Override
    public Path visitPath(SqlParser.PathContext ctx)
    {
        Path path = new Path();
        path.append(ctx.IDENTIFIER().toString());
        path.append(":");
        for(int i=0 ; i < ctx.any_name().size(); i++)
        {
            path.append("\\");
            path.append(visitAny_name(ctx.any_name().get(i)).id);
        }
        return path;
    }
    @Override
    public Path visitJar_path(SqlParser.Jar_pathContext ctx)
    {
        Path path = new Path();
        path.append(ctx.IDENTIFIER().toString());
        path.append(":");
        for(int i=0 ; i < ctx.any_name().size(); i++)
        {

            path.append("\\");
            if(i< ctx.any_name().size()-1)
                path.append(visitAny_name(ctx.any_name().get(i)).id);
            else
                path.setFilename(visitAny_name(ctx.any_name().get(i)).id+=".jar");
        }
        return path;
    }
    //    @Override public T visitType(SqlParser.TypeContext ctx)
//    {
//
//    }
//    @Override public T visitCreate_type(SqlParser.Create_typeContext ctx)
//    {
//
//    }
    @Override
    public AggregationFunction visitCreate_agg_fun(SqlParser.Create_agg_funContext ctx)
    {
        AggregationFunction aggregationFunction = new AggregationFunction();
        aggregationFunction.setAggregationFunctionName(visitAny_name(ctx.function_name().any_name()).id);
        aggregationFunction.setClassName(visitAny_name(ctx.class_name().any_name().any_name()).id);
        aggregationFunction.setMethodName(visitAny_name(ctx.method_name().any_name().any_name()).id);
            //aggregationFunction.setReturnType(visitAny_name(ctx.type().type_name().any_name().get(0)).id);
        aggregationFunction.setJarPath(visitJar_path(ctx.jar_path()).path);
        aggregationFunction.setJarName(visitJar_path(ctx.jar_path()).filename);

//param list
        return  aggregationFunction;
    }
}
