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
import Rules.SymbolTableMu.ColumnSymbol;
import Rules.SymbolTableMu.SqlType;
import Rules.SymbolTableMu.SqlTypeEntry;
import Rules.SymbolTableMu.TableSymbol;
import Rules.generated.*;
import Rules.Main;


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
        if(ctx.alter_table_stmt()!= null)
            sqlStatment.stmt = visitAlter_table_stmt(ctx.alter_table_stmt());
        if(ctx.create_table_stmt() != null)
            sqlStatment.stmt = visitCreate_table_stmt(ctx.create_table_stmt());
        if(ctx.delete_stmt() != null)
            sqlStatment.stmt = visitDelete_stmt(ctx.delete_stmt());
        if(ctx.drop_table_stmt()!= null)
            sqlStatment.stmt = visitDrop_table_stmt(ctx.drop_table_stmt());
        if(ctx.factored_select_stmt() != null)
            sqlStatment.stmt = visitFactored_select_stmt(ctx.factored_select_stmt());
        if(ctx.insert_stmt() != null)
            sqlStatment.stmt = visitInsert_stmt(ctx.insert_stmt());
        if(ctx.update_stmt() != null)
            sqlStatment.stmt = visitUpdate_stmt(ctx.update_stmt());
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
    public AlterTableStatement visitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx)
    {
        AlterTableStatement alterTableStatement = new AlterTableStatement();
        if(ctx.database_name()!= null)
           alterTableStatement.dataBaseName = visitAny_name(ctx.database_name().any_name());
        if(ctx.source_table_name() != null)
            alterTableStatement.sourceTableName = visitAny_name(ctx.source_table_name().any_name());
        if(ctx.alter_table_add()!= null)
            alterTableStatement.alteration = visitAlter_table_add(ctx.alter_table_add());
        if(ctx.alter_table_add_constraint() != null)
            alterTableStatement.alteration = visitAlter_table_add_constraint(ctx.alter_table_add_constraint());
         if(ctx.new_table_name() != null)
             alterTableStatement.newTableName = visitAny_name(ctx.new_table_name().any_name());
         if(ctx.column_def() != null)
             alterTableStatement.newcolumn = visitColumn_def(ctx.column_def());
        return alterTableStatement;
    }

    @Override
    public  AlterTableAdd visitAlter_table_add(SqlParser.Alter_table_addContext ctx)
    {
        AlterTableAdd alterTableAdd = new AlterTableAdd();
        alterTableAdd.tableConstraint = visitTable_constraint(ctx.table_constraint());
        return  alterTableAdd;
    }
    @Override
    public TableConstraint visitTable_constraint(SqlParser.Table_constraintContext ctx)
    {
        TableConstraint tableConstraint = new TableConstraint();
        if(ctx.name() != null)
            tableConstraint.name = ctx.name().getText();
        if(ctx.table_constraint_foreign_key() != null)
            tableConstraint.constraint = visitTable_constraint_foreign_key(ctx.table_constraint_foreign_key());
        if(ctx.table_constraint_key() != null)
            tableConstraint.constraint = visitTable_constraint_key(ctx.table_constraint_key());
        if(ctx.table_constraint_unique() != null)
            tableConstraint.constraint = visitTable_constraint_unique(ctx.table_constraint_unique());
        if(ctx.table_constraint_primary_key() != null)
            tableConstraint.constraint = visitTable_constraint_primary_key(ctx.table_constraint_primary_key());
        return tableConstraint;
    }
    @Override
    public TableConstraintForeignKey visitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx)
    {
        TableConstraintForeignKey tableConstraintForeignKey = new TableConstraintForeignKey();
        for(int i=0 ; i < ctx.fk_origin_column_name().size(); i++)
            tableConstraintForeignKey.fks.add(visitAny_name(ctx.fk_origin_column_name().get(i).column_name().any_name()));
        tableConstraintForeignKey.foreignKeyClause = visitForeign_key_clause(ctx.foreign_key_clause());
        return tableConstraintForeignKey;
    }
    @Override
    public TableConstraintKey visitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx)
    {
        TableConstraintKey tableConstraintKey = new TableConstraintKey();
        if(ctx.name()!= null)
            tableConstraintKey.Name = visitAny_name(ctx.name().any_name());
        for(int i=0 ; i < ctx.indexed_column().size(); i++)
            tableConstraintKey.indexedColumns.add(visitIndexed_column(ctx.indexed_column().get(i)));
        return tableConstraintKey;
    }
    @Override
    public TableConstraintUnique visitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx)
    {
        TableConstraintUnique tableConstraintForeignKey = new TableConstraintUnique();
        if(ctx.name()!= null)
            tableConstraintForeignKey.name = visitAny_name(ctx.name().any_name());
        for(int i=0 ; i < ctx.indexed_column().size(); i++)
            tableConstraintForeignKey.indexedColumns.add(visitIndexed_column(ctx.indexed_column().get(i)));
        return tableConstraintForeignKey;
    }
    @Override
    public TableConstraintPrimaryKey visitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx)
    {
        TableConstraintPrimaryKey tableConstraintPrimaryKey = new TableConstraintPrimaryKey();
        for(int i=0 ; i < ctx.indexed_column().size(); i++)
            tableConstraintPrimaryKey.indexedColumns.add(visitIndexed_column(ctx.indexed_column().get(i)));
        return tableConstraintPrimaryKey;
    }
    @Override
    public indexedColumn visitIndexed_column(SqlParser.Indexed_columnContext ctx)
    {
        indexedColumn inxColumn = new indexedColumn();
        inxColumn.columnName = visitAny_name(ctx.column_name().any_name());
        if(ctx.collation_name()!= null)
            inxColumn.collationName = visitAny_name(ctx.collation_name().any_name());
        if(ctx.K_DESC()!=null)
            inxColumn.desc = ctx.desc.getText();
        return inxColumn;
    }
     @Override
     public ColumnDef visitColumn_def(SqlParser.Column_defContext ctx)
     {
         ColumnDef columnDef = new ColumnDef();
         columnDef.name = visitAny_name(ctx.column_name().any_name());
         for(int i=0 ; i < ctx.column_constraint().size() ; i++)
             columnDef.columnConstraintsTypeNames.add(visitColumn_constraint(ctx.column_constraint().get(i)));
         for(int i=0; i < ctx.type_name().size() ; i ++)
             columnDef.columnConstraintsTypeNames.add(visitType_name(ctx.type_name().get(i)));
         return columnDef;
     }
     @Override
     public ColumnConstraint visitColumn_constraint(SqlParser.Column_constraintContext ctx)
     {
         ColumnConstraint columnConstraint = new ColumnConstraint();
         if(ctx.name()!= null)
             columnConstraint.name = visitAny_name(ctx.name().any_name());
         if(ctx.column_constraint_foreign_key()!= null)
             columnConstraint.constraint = visitColumn_constraint_foreign_key(ctx.column_constraint_foreign_key());
         if(ctx.column_constraint_not_null() != null)
              columnConstraint.constraint  = visitColumn_constraint_not_null(ctx.column_constraint_not_null());
         if(ctx.column_constraint_null() != null)
             columnConstraint.constraint = visitColumn_constraint_null(ctx.column_constraint_null());
         if(ctx.column_constraint_primary_key() != null)
             columnConstraint.constraint  = visitColumn_constraint_primary_key(ctx.column_constraint_primary_key());
         if(ctx.K_UNIQUE()!= null)
             columnConstraint.Unique = true;
         if(ctx.K_CHECK() != null)
              columnConstraint.constraint = visitExpr(ctx.expr());
         if(ctx.column_default() != null)
             columnConstraint.constraint = visitColumn_default(ctx.column_default());
         if(ctx.collation_name() != null)
             columnConstraint.constraint = visitAny_name(ctx.collation_name().any_name());

         return columnConstraint;
     }
    @Override
    public ColumnConstraintPrimaryKey visitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx)
    {
        ColumnConstraintPrimaryKey columnConstraintPrimaryKey = new ColumnConstraintPrimaryKey();
        if(ctx.K_DESC() != null)
            columnConstraintPrimaryKey.order = ctx.K_DESC().getSymbol().getText();
        if(ctx.K_ASC() != null)
            columnConstraintPrimaryKey.order = ctx.K_ASC().getSymbol().getText();
        if(ctx.K_AUTOINCREMENT() != null)
            columnConstraintPrimaryKey.autoIncrement = true;
        return columnConstraintPrimaryKey;
    }
     @Override
     public ColumnConstraintForeignKey visitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx)
     {
         ColumnConstraintForeignKey columnConstraintForeignKey = new ColumnConstraintForeignKey();
         columnConstraintForeignKey.foreignKeyClause = visitForeign_key_clause(ctx.foreign_key_clause());
         return columnConstraintForeignKey;
     }
     @Override
     public foreignKeyClause visitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx)
     {
         foreignKeyClause FK_Clause = new foreignKeyClause();
         if(ctx.database_name()!=null)
             FK_Clause.dataBaseName = visitAny_name(ctx.database_name().any_name());
         FK_Clause.foreignTableName = visitAny_name(ctx.foreign_table().any_name());
         for(int i=0 ; i < ctx.fk_target_column_name().size() ; i++)
             FK_Clause.foreignTableColumnNames.add(visitAny_name(ctx.fk_target_column_name().get(i).name().any_name()));
         for(int i=0 ; i < ctx.name().size() ; i++)
             FK_Clause.matchOnNodes.add(visitAny_name(ctx.name().get(i).any_name()));
         return FK_Clause;
     }

    @Override
    public ColumnConstraintNotNull visitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx)
    {
      ColumnConstraintNotNull columnConstraintNotNull = new ColumnConstraintNotNull();
      columnConstraintNotNull.notnull = true;
      return columnConstraintNotNull;
    }

    @Override
    public ColumnConstraintNull visitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx)
    {
        ColumnConstraintNull columnConstraintNull = new ColumnConstraintNull();
        columnConstraintNull.Null = true;
        return columnConstraintNull;
    }
    public SqlExpression visitExpr(SqlParser.ExprContext ctx)
     {
         SqlExpression sqlExpression = new SqlExpression();
         Node temp = visit(ctx);
         if(temp instanceof SqlExpressionCase1)
         {
             sqlExpression.expression = (SqlExpressionCase1)temp;
         }
         if(temp instanceof SqlExpressionCase2)
         {
             sqlExpression.expression = (SqlExpressionCase2)temp;
         }
         if(temp instanceof SqlExpressionCase3)
         {
             sqlExpression.expression = (SqlExpressionCase3)temp;
         }
         if(temp instanceof SqlExpressionCase4)
         {
             sqlExpression.expression = (SqlExpressionCase4)temp;
         }
         if(temp instanceof SqlExpressionCase5)
         {
             sqlExpression.expression = (SqlExpressionCase5)temp;
         }
         if(temp instanceof SqlExpressionCase5)
         {
             sqlExpression.expression = (SqlExpressionCase5)temp;
         }
         if(temp instanceof SqlExpressionCase6)
         {
             sqlExpression.expression = (SqlExpressionCase6)temp;
         }
         if(temp instanceof SqlExpressionCase7)
         {
             sqlExpression.expression = (SqlExpressionCase7)temp;
         }
         if(temp instanceof SqlExpressionCase8)
         {
             sqlExpression.expression = (SqlExpressionCase8)temp;
         }
         if(temp instanceof SqlExpressionCase9)
         {
             sqlExpression.expression = (SqlExpressionCase9)temp;
         }
         if(temp instanceof SqlExpressionCase10)
         {
             sqlExpression.expression = (SqlExpressionCase10)temp;
         }
         if(temp instanceof SqlExpressionCase11)
         {
             sqlExpression.expression = (SqlExpressionCase11)temp;
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
         return sqlExpression;
     }

    @Override
    public SqlExpressionCase1 visitCase1(SqlParser.Case1Context ctx)
    {
        SqlExpressionCase1 sqlExpressionCase1 = new SqlExpressionCase1();
        sqlExpressionCase1.literalValue = ctx.literal_value().getText();
        return sqlExpressionCase1;
    }

    @Override
    public SqlExpressionCase2 visitCase2(SqlParser.Case2Context ctx) {
       SqlExpressionCase2 sqlExpressionCase2 = new SqlExpressionCase2();
       if(ctx.database_name()  != null)
           sqlExpressionCase2.dataBaseName = visitAny_name(ctx.database_name().any_name());
       if(ctx.table_name()!= null)
           sqlExpressionCase2.tableName = visitAny_name(ctx.table_name().any_name());
       sqlExpressionCase2.columnName =visitAny_name(ctx.column_name().any_name());
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
        return sqlExpressionCase4;
    }

    @Override
    public SqlExpressionCase5 visitCase5(SqlParser.Case5Context ctx) {
        SqlExpressionCase5 sqlExpressionCase5 = new SqlExpressionCase5();
        sqlExpressionCase5.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase5.op = ctx.op.getText();
        sqlExpressionCase5.SqlExpression2 = visitExpr(ctx.expr(1));
        return sqlExpressionCase5;
    }

    @Override
    public SqlExpressionCase6 visitCase6(SqlParser.Case6Context ctx) {
        SqlExpressionCase6 sqlExpressionCase6 = new SqlExpressionCase6();
        sqlExpressionCase6.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase6.op = ctx.op.getText();
        sqlExpressionCase6.SqlExpression2 = visitExpr(ctx.expr(1));
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
        return sqlExpressionCase10;
    }

    @Override
    public SqlExpressionCase11 visitCase11(SqlParser.Case11Context ctx) {
        SqlExpressionCase11 sqlExpressionCase11 = new SqlExpressionCase11();
        sqlExpressionCase11.SqlExpression1 = visitExpr(ctx.expr(0));
        sqlExpressionCase11.op =ctx.K_OR().getSymbol().getText();
        sqlExpressionCase11.SqlExpression2 = visitExpr(ctx.expr(1));
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
     public TypeName visitType_name(SqlParser.Type_nameContext ctx)
     {
         TypeName typeName = new TypeName();
         typeName.name = visitAny_name(ctx.name().any_name());
         for(int i=0 ; i < ctx.signed_number().size(); i++)
             typeName.names.put(ctx.signed_number().get(i).getText(), visitAny_name(ctx.any_name().get(i)));
         return typeName;
     }

    @Override
    public Node visitCreate_type(SqlParser.Create_typeContext ctx) {
        SqlType sqlType = new SqlType();
        boolean err = false;
        sqlType.name = ctx.any_name(0).getText();
        for (int i = 0 ; i < ctx.type().size() ; i++){
            SqlTypeEntry sqlTypeEntry = new SqlTypeEntry();
            sqlTypeEntry.type = ctx.type(i).getText();
            sqlTypeEntry.name = ctx.any_name(i+1).getText();
            if(symbolTable.sqlTypes.containsKey(sqlTypeEntry.type)
                    || sqlTypeEntry.type.equals("String")
                    || sqlTypeEntry.type.equals("Long")
                    || sqlTypeEntry.type.equals("Boolean")
                    || sqlTypeEntry.type.equals("Double") ){
                sqlType.entries.add(sqlTypeEntry);
            }
            else {
                err = true;
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
        TableSymbol tableSymbol = new TableSymbol();
        CreateTableStatement createTableStatement = new CreateTableStatement();
        if(ctx.K_IF()!= null)
        createTableStatement.ifNotExists = true;
        if(ctx.table_name() != null)
        {
            if(ctx.database_name()!=null)
                createTableStatement.dataBaseName = visitAny_name(ctx.database_name().any_name());
            createTableStatement.tableName = visitAny_name(ctx.table_name().any_name());
            for(int i=0 ; i < ctx.column_def().size() ; i++){
                createTableStatement.columnDefs.add(visitColumn_def(ctx.column_def().get(i)));
                ColumnDef columnDef = ((ColumnDef)createTableStatement.columnDefs.get(i));
                ColumnSymbol columnSymbol = new ColumnSymbol();
                columnSymbol.name = columnDef.name.name;
                String type = ((TypeName)columnDef.columnConstraintsTypeNames.get(0)).name.name;
                if(symbolTable.sqlTypes.containsKey(type)
                || type.equals("String")
                || type.equals("Long")
                || type.equals("Boolean")
                || type.equals("Double")
                || (symbolTable.scopeStack.peek().symbolMap.containsKey(type)
                        && symbolTable.scopeStack.peek().symbolMap.get(type) instanceof TableSymbol) ){
                    columnSymbol.type = type;
                }
                ((ArrayList<ColumnSymbol>)tableSymbol.value).add(columnSymbol);
            }
            for(int i=0 ; i < ctx.table_constraint().size(); i++)
                createTableStatement.tableConstraintsColumnDefs.add(visitTable_constraint(ctx.table_constraint().get(i)));
        }
        if(ctx.select_stmt()!= null)
            createTableStatement.selectStmt = visitSelect_stmt(ctx.select_stmt());
        symbolTable.scopeStack.peek().symbolMap.put(tableSymbol.name,tableSymbol);
        return createTableStatement;
    }
    @Override
    public DeleteStatement visitDelete_stmt(SqlParser.Delete_stmtContext ctx)
    {
        DeleteStatement deleteStatement = new DeleteStatement();
        deleteStatement.qualifiedTableName = visitQualified_table_name(ctx.qualified_table_name());
        if(ctx.expr() != null)
            deleteStatement.expression = visitExpr(ctx.expr());
        return deleteStatement;
    }
    ////
    @Override
    public QualifiedTableName visitQualified_table_name(SqlParser.Qualified_table_nameContext ctx)
    {
        QualifiedTableName qualifiedTableName = new QualifiedTableName();
        if(ctx.database_name() != null)
            qualifiedTableName.dataBaseName = visitAny_name(ctx.database_name().any_name());
        qualifiedTableName.tableName = visitAny_name(ctx.table_name().any_name());
        if(ctx.K_INDEXED() != null)
        {
            qualifiedTableName.notIndexed=false;
            qualifiedTableName.indexName = visitAny_name(ctx.index_name().any_name());
        }
        if(ctx.K_NOT() != null)
            qualifiedTableName.notIndexed=true;

        return qualifiedTableName;
    }
    @Override
    public DropTableStatement visitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx)
    {
        DropTableStatement dropTableStatement = new DropTableStatement();
        if(ctx.K_IF()!= null)
            dropTableStatement.ifExists = true;
        if(ctx.database_name()!= null)
            dropTableStatement.dataBaseName = visitAny_name(ctx.database_name().any_name());
        dropTableStatement.tableName = visitAny_name(ctx.table_name().any_name());
        return dropTableStatement;
    }
    @Override
    public FactoredSelectStatement visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx)
    {
        FactoredSelectStatement factoredSelectStatement= new FactoredSelectStatement();
        factoredSelectStatement.selectCore = visitSelect_core(ctx.select_core());
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
        for(int i=0 ; i < ctx.result_column().size(); i++)
            selectCore.resultColumns.add(visitResult_column(ctx.result_column().get(i)));
        for(int i=0 ; i < ctx.table_or_subquery().size(); i++)
            selectCore.tableOrSubQueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
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
        if(ctx.database_name()!= null)
            tableOrSubquery.databaseName = visitAny_name(ctx.database_name().any_name());
        if(ctx.table_name()!= null)
            tableOrSubquery.tableName = visitAny_name(ctx.table_name().any_name());
        if(ctx.table_alias() != null)
            tableOrSubquery.tableAlias = ctx.table_alias().getText();
        if(ctx.index_name() != null)
            tableOrSubquery.indexName = visitAny_name(ctx.index_name().any_name());
        for(int i=0 ; i < ctx.table_or_subquery().size(); i++)
            tableOrSubquery.tableOrSubqueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
        if(ctx.join_clause() != null)
            tableOrSubquery.joinClause = visitJoin_clause(ctx.join_clause());
        if(ctx.table_alias()!= null)
            tableOrSubquery.tableAlias2 = ctx.table_alias().getText();
        if(ctx.select_stmt() != null)
        {
            tableOrSubquery.selectStatment = visitSelect_stmt(ctx.select_stmt());
            if(ctx.table_alias()!=null)
            tableOrSubquery.tableAlias3 = ctx.table_alias().getText();
        }

        return tableOrSubquery;
    }
    @Override
    public SelectStmt visitSelect_stmt(SqlParser.Select_stmtContext ctx)
    {
        SelectStmt selectStmt = new SelectStmt();
        selectStmt.selectorval = visitSelect_or_values(ctx.select_or_values());
        for(int i=0 ; i < ctx.ordering_term().size(); i++)
            selectStmt.ordering.add(visitOrdering_term(ctx.ordering_term().get(i)));
        for(int i=0 ; i < ctx.expr().size(); i++)
            selectStmt.expressions.add(visitExpr(ctx.expr().get(i)));
        if(ctx.K_LIMIT() != null)
            selectStmt.limit=true;
        if(ctx.K_OFFSET()!= null)
            selectStmt.offset = true;
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
//        if(ctx.result_column() != null)
//        {
            for(int i=0 ; i < ctx.result_column().size() ;i++)
                selectOrValue.resColumns.add(visitResult_column(ctx.result_column().get(i)));
//        }
        for(int i=0 ; i < ctx.table_or_subquery().size(); i++)
            selectOrValue.tablesorSbqueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
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
        if(ctx.table_name()!= null)
            resultColumn.tableName = visitAny_name(ctx.table_name().any_name());
        if(ctx.expr() != null)
        {
            resultColumn.expression = visitExpr(ctx.expr());
            if(ctx.column_alias()!= null)
            resultColumn.cloumnForExpr = ctx.column_alias().IDENTIFIER()!= null
                    ? ctx.column_alias().IDENTIFIER().getText() :  ctx.column_alias().STRING_LITERAL().getText();
        }
        return resultColumn;
    }
    @Override
    public InsertStatement visitInsert_stmt(SqlParser.Insert_stmtContext ctx)
    {
        InsertStatement insertStatement = new InsertStatement();
        if(ctx.database_name()!= null)
            insertStatement.dataBaseName = visitAny_name(ctx.database_name().any_name());
        insertStatement.tableName = visitAny_name(ctx.table_name().any_name());
        for(int i=0; i < ctx.column_name().size(); i++)
            insertStatement.columnNamse.add(visitAny_name(ctx.column_name().get(i).any_name()));
        for(int i=0 ; i < ctx.expr().size(); i++)
            insertStatement.expressions.add(visitExpr(ctx.expr().get(i)));
        if(ctx.select_stmt() != null)
            insertStatement.selectStatement = visitSelect_stmt(ctx.select_stmt());
        if(ctx.K_DEFAULT()!= null)
            insertStatement.defaultValues = true;
        return insertStatement;
    }
    //select statment
    @Override
    public UpdateStatement visitUpdate_stmt(SqlParser.Update_stmtContext ctx)
    {
        UpdateStatement updateStatement = new UpdateStatement();
        updateStatement.qualifiedTableName = visitQualified_table_name(ctx.qualified_table_name());
        for(int i=0 ; i < ctx.column_name().size() ; i++)
            updateStatement.columnNames.add(visitAny_name(ctx.column_name().get(i).any_name()));
        for(int i=0 ; i < ctx.expr().size(); i++)
            updateStatement.expressions.add(visitExpr(ctx.expr().get(i)));
        return updateStatement;
    }
}
