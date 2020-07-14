package Rules.Base;
import Rules.AST.AnyName;
import Rules.AST.Java.*;
import Rules.AST.Java.JavaBody.*;
import Rules.AST.Java.Logic.*;
import Rules.AST.Java.Logic.Conditional.ConditionalStmt;
import Rules.AST.Java.Logic.Conditional.ElseIfStmt;
import Rules.AST.Java.Logic.Conditional.ElseStmt;
import Rules.AST.Java.Logic.Conditional.IfStmt;
import Rules.AST.Java.Logic.Loop.*;
import Rules.AST.Java.Logic.Switch.SwitchCase;
import Rules.AST.Java.Logic.Switch.SwitchDefault;
import Rules.AST.Java.Logic.Switch.SwitchStmt;
import Rules.AST.Java.Utils.*;
import Rules.AST.Node;
import Rules.AST.SQL.*;
import Rules.AST.SQL.DDL.CreateTableStatement;
import Rules.AST.SQL.DQL.*;
import Rules.AST.SQL.Database.ColumnDef;
import Rules.AST.SQL.Database.ResultColumn;
import Rules.AST.SQL.Database.TypeName;
import Rules.AST.SQL.Expression.*;
import Rules.SymbolTableMu.FunctionSymbol;
import Rules.SymbolTableMu.*;
import Rules.SymbolTableMu.Scope;
import Rules.SymbolTableMu.SymbolTable;
import Rules.Utils.*;
import Rules.Utils.Error;
import Rules.generated.*;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class SqlJavaVisitor extends SqlBaseVisitor<Node> {
    public SymbolTable symbolTable = new SymbolTable();
    public ArrayList<Error> errors = new ArrayList<>();

    @Override
    public Print visitPrintBody(SqlParser.PrintBodyContext ctx) {
        return visitPrint(ctx.print());
    }

    @Override
    public JavaStatment visitJava_stmt(SqlParser.Java_stmtContext ctx) {
        JavaStatment javaStatment=new JavaStatment();
        if(ctx.variable_declaration() != null) {
            javaStatment.javaStatment = visitVariable_declaration(ctx.variable_declaration());
            if(ctx.java_stmt()!=null)
                javaStatment.javaStatement2 = visitJava_stmt(ctx.java_stmt());
        }
        else if(ctx.java_function_call()!=null){
            javaStatment.javaStatment=visitJava_function_call(ctx.java_function_call());
            if(ctx.java_stmt()!=null)
                javaStatment.javaStatement2 = visitJava_stmt(ctx.java_stmt());
        }
        else if(ctx.java_function_declaration()!= null){
            javaStatment.javaStatment=visitJava_function_declaration(ctx.java_function_declaration());
            if(ctx.java_stmt()!=null)
                javaStatment.javaStatement2 = visitJava_stmt(ctx.java_stmt());
        }
        else if(ctx.sql_stmt()!=null){
            javaStatment.javaStatment = visitSql_stmt(ctx.sql_stmt());
            if(ctx.java_stmt()!=null)
                javaStatment.javaStatement2 = visitJava_stmt(ctx.java_stmt());
        }
        return javaStatment;
    }

    @Override
    public FunctionCall visitJava_function_call(SqlParser.Java_function_callContext ctx) {
        boolean err = true;
        FunctionCall functionCall = new FunctionCall();
        functionCall.functionName = ctx.method_ID().getText();
        functionCall.argumentList = visitArgument_list(ctx.argument_list());
        for(int i=0;i<symbolTable.functionSymbols.size();i++){
            if(symbolTable.functionSymbols.get(i).name.equals(functionCall.functionName)) {
                err = false;
                break;
            }
        }
        if(err){
            int line = ctx.method_ID().start.getLine();
            int col = ctx.method_ID().start.getCharPositionInLine();
            String des = "Function "+functionCall.functionName+" Does Not Exist";
            Error error = new Error(line,col,des);
            errors.add(error);
        }
        else {
            FunctionSymbol functionSymbol = new FunctionSymbol();
            for(int i=0;i<symbolTable.functionSymbols.size();i++){
                if(symbolTable.functionSymbols.get(i).name.equals(functionCall.functionName)) {
                    functionSymbol = symbolTable.functionSymbols.get(i);
                    break;
                }
            }
            if(functionSymbol.parameters.size() != ((ArgumentList)functionCall.argumentList).argumentList.size()){
                int line = ctx.argument_list().start.getLine();
                int col = ctx.argument_list().start.getCharPositionInLine();
                String des = "Size Of Argument List Of Call Does Not Match The Number Of Parameters The Function Takes";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
        }
        return functionCall;
    }
    @Override
    public FunctionDeclaration visitJava_function_declaration(SqlParser.Java_function_declarationContext ctx) {
        boolean err = false;
        FunctionSymbol functionSymbol = new FunctionSymbol();
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        functionDeclaration.functionName = ctx.method_ID().getText();
        functionDeclaration.pl = visitParameter_list(ctx.parameter_list());
        for(int i=0;i<symbolTable.functionSymbols.size();i++){
            if(functionDeclaration.functionName.equals(symbolTable.functionSymbols.get(i).name)){
                err = true;
                int line = ctx.start.getLine();
                int col = ctx.start.getCharPositionInLine();
                String des = "Function "+ functionDeclaration.functionName + " Already Exists";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
        }
        if(!err){
            if( !(ctx.parameter_list().any_name().size()!=0 && ((ParameterList)functionDeclaration.pl).list.size()==0) ){
                symbolTable.pushScope();
                functionSymbol.name = functionDeclaration.functionName;
                for(int i=0;i<((ParameterList)functionDeclaration.pl).list.size();i++) {
                    Symbol symbol = new Symbol();
                    symbol.name = ((ParameterList)functionDeclaration.pl).list.get(i);
                    functionSymbol.parameters.add(symbol);
                    symbolTable.scopeStack.peek().symbolMap.put(symbol.name,symbol);
                }
                functionDeclaration.block = visitBlock(ctx.block());
                functionSymbol.value = functionDeclaration;
                functionDeclaration.scope = symbolTable.scopeStack.peek();
                try {
                    functionSymbol.type = ((Block)functionDeclaration.block).getType(functionDeclaration.scope);
                } catch (Error error) {
                    error.line = ctx.start.getLine();
                    error.col = ctx.start.getCharPositionInLine();
                    errors.add(error);
                }
                symbolTable.popScope();
                symbolTable.scopeStack.peek().symbolMap.put(functionSymbol.name,functionSymbol);
                symbolTable.functionSymbols.add(functionSymbol);
            }
        }
        return functionDeclaration;
    }


    @Override
    public ParameterList visitParameter_list(SqlParser.Parameter_listContext ctx)
    {
        ParameterList parameterList = new ParameterList();
        Boolean err = false;
        for (int i=0;i<ctx.any_name().size();i++) {
            if(parameterList.list.size()!=0){
                for(int j=0;j<parameterList.list.size();j++){
                    if(parameterList.list.get(j).equals(ctx.any_name().get(i).getText())){
                        err = true;
                        int line = ctx.any_name().get(j).start.getLine();
                        int col = ctx.any_name().get(j).start.getCharPositionInLine();
                        String des = "Parameter "+ ctx.any_name().get(i).getText() +" Is Defined More Than Once";
                        Error error = new Error(line,col,des);
                        errors.add(error);
                        break;
                    }
                }
            }
            if(err){
                parameterList.list.clear();
            }
            else
                parameterList.list.add(ctx.any_name(i).getText());
        }
        for(int i=0 ; i <ctx.default_parameter().size();i++)
        {
            parameterList.defaultParameters.add(visitDefault_parameter(ctx.default_parameter().get(i)));
        }
        return parameterList;
    }

    @Override
    public ArgumentList visitArgument_list(SqlParser.Argument_listContext ctx) {
        ArgumentList argumentList = new ArgumentList();
        if(ctx.expression().size()!=0)
        {
            for (int i=0;i<ctx.expression().size();i++)
            {
                argumentList.argumentList.add(visitExpression(ctx.expression().get(i)));
                try {
                    ((Expression)argumentList.argumentList.get(i)).getType(symbolTable.scopeStack.peek());
                } catch (Error error) {
                    error.line = ctx.expression().get(i).start.getLine();
                    error.col = ctx.expression().get(i).start.getCharPositionInLine();
                    errors.add(error);
                }
            }
        }
        return argumentList;
    }

    @Override
    public DefaultParameter visitDefault_parameter(SqlParser.Default_parameterContext ctx)
    {
        DefaultParameter defaultParameter = new DefaultParameter();
        defaultParameter.variable = visitVariable(ctx.variable());
        defaultParameter.expression = visitExpression(ctx.expression());
        return defaultParameter;
    }


    public VariableDeclaration visitVariable_declaration(SqlParser.Variable_declarationContext ctx)
    {
        boolean fix = false;
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        for(int i=0 ; i <ctx.variable_assignment().size(); i ++) {
            //
            variableDeclaration.variableAssignments.add(visitVariable_assignment(ctx.variable_assignment(i),true));
            //
            VariableAssignment variableAssignment = ((VariableAssignment)variableDeclaration.variableAssignments.get(i));
            Symbol symbol = new Symbol();
            symbol.name = ((SimpleVariable)((Variable)variableAssignment.variable).variable).VariableName.get(0);
            for(int j=0;j < variableAssignment.assignments.size();j++) {
                if( ((VariableAssignmentValue)(((Assignment)variableAssignment.assignments.get(j))).variableAssignmentValue).Value
                        instanceof FactoredSelectStatement ){
                    fix = true;
                    FactoredSelectStatement factoredSelectStatement = ((FactoredSelectStatement)((VariableAssignmentValue)(((Assignment)variableAssignment.assignments.get(0)))
                            .variableAssignmentValue).Value);
                    TableSymbol tableSymbol = new TableSymbol();
                    tableSymbol.name = ((SimpleVariable)((Variable)variableAssignment.variable).variable).VariableName.get(0);
                    if(symbolTable.sqlTypes.containsKey(tableSymbol.name)){
                        Error error = new Error(ctx.variable_assignment(i).start.getLine(),
                                ctx.variable_assignment(i).start.getCharPositionInLine(),
                                "Table " + tableSymbol.name + " Already Exists");
                        errors.add(error);
                    }
                    else {
                        if(factoredSelectStatement.sqlType!=null){
                            factoredSelectStatement.sqlType.name = tableSymbol.name;
                            symbolTable.sqlTypes.put(factoredSelectStatement.sqlType.name,factoredSelectStatement.sqlType);
                            tableSymbol.type = tableSymbol.name;
                            symbolTable.scopeStack.peek().symbolMap.put(tableSymbol.name,tableSymbol);
                        }
                    }
                }
                else{
                    try {
                        symbol.type = ((VariableAssignmentValue)
                                ((Assignment)variableAssignment.assignments.get(j))
                                        .variableAssignmentValue).getType(symbolTable.scopeStack.peek());
                    } catch (Error error) {
                        error.line = ctx.variable_assignment().get(j).start.getLine();
                        error.col = ctx.variable_assignment().get(j).start.getCharPositionInLine();
                        errors.add(error);
                    }
                }
            }
            if(!fix){
                if(!symbolTable.scopeStack.peek().symbolMap.containsKey(symbol.name))
                    symbolTable.scopeStack.peek().symbolMap.put(symbol.name,symbol);
                else {
                    Error error = new Error(ctx.variable_assignment(i).start.getLine(),
                            ctx.variable_assignment(i).start.getCharPositionInLine(),
                            "Variable " + symbol.name + " Already Defined In This Scope");
                    errors.add(error);
                }
            }
        }
        return variableDeclaration;
    }

    public VariableAssignment visitVariable_assignment(SqlParser.Variable_assignmentContext ctx, boolean fromVarDec)
    {
        VariableAssignment variableAssignment = new VariableAssignment();
        variableAssignment.variable = visitVariable(ctx.variable());
        if(fromVarDec == false){
            if( symbolTable.getSymbol(((SimpleVariable)((Variable)variableAssignment.variable).variable).VariableName.get(0)) == null ){
                Error error = new Error(ctx.start.getLine(),
                    ctx.start.getCharPositionInLine(),
                        "Variable " +
                                ((SimpleVariable)((Variable)variableAssignment.variable).variable).VariableName.get(0) +
                                " Does Not Exist");
                errors.add(error);
            }
        }
        if(ctx.assginment().size()!=0)
        {
            for(int i=0;i<ctx.assginment().size();i++) {
                variableAssignment.assignments.add(visitAssginment(ctx.assginment(i)));
                if(fromVarDec == false){
                    Symbol symbol = symbolTable.getSymbol(((SimpleVariable)((Variable)variableAssignment.variable).variable).VariableName.get(0));
                    if(symbol!=null)
                        try {
                            String temp = ((VariableAssignmentValue)((Assignment)variableAssignment.assignments.get(i)).variableAssignmentValue)
                                    .getType(symbolTable.scopeStack.peek());
                            if(symbol.type!=null && !symbol.type.equals(temp)){
                                Error error = new Error(ctx.assginment(i).variable_assignment_value().start.getLine(),
                                        ctx.assginment(i).variable_assignment_value().start.getCharPositionInLine(),
                                        "Variable " + symbol.name + " Already Has Type " + symbol.type + " And Cannot Be Assigned To A " + temp);
                                errors.add(error);
                            }
                        } catch (Error error) {
                            error.line = ctx.assginment(i).variable_assignment_value().start.getLine();
                            error.col = ctx.assginment(i).variable_assignment_value().start.getCharPositionInLine();
                            errors.add(error);
                        }
                }
            }
        }
        return variableAssignment;
    }

    @Override
    public JavaString visitStr(SqlParser.StrContext ctx)
    {
        JavaString string = new JavaString();
        string = visitString(ctx.string());
        return string;
    }

    @Override
    public Assignment visitAssginment(SqlParser.AssginmentContext ctx) {
        Assignment assignment = new Assignment();
        assignment.assignmentOperator = visitAssignment_operator(ctx.assignment_operator());
        assignment.variableAssignmentValue = visitVariable_assignment_value(ctx.variable_assignment_value());

        return assignment;
    }

    @Override  public AssignmentOperator visitAssignment_operator(SqlParser.Assignment_operatorContext ctx) {
        AssignmentOperator assignmentOperator = new AssignmentOperator();
        assignmentOperator.op=ctx.getText();
        return assignmentOperator;
    }

    @Override
    public VariableAssignmentValue visitVariable_assignment_value(SqlParser.Variable_assignment_valueContext ctx)
    {
        VariableAssignmentValue variableAssignmentValue = new VariableAssignmentValue();
        if(ctx.expression()!= null)
            variableAssignmentValue.Value = visitExpression(ctx.expression());
        if(ctx.logical_condition() != null)
            variableAssignmentValue.Value = visitLogical_condition(ctx.logical_condition());
        if(ctx.factored_select_stmt()!=null){
            variableAssignmentValue.Value = visitFactored_select_stmt(ctx.factored_select_stmt());
        }
        return variableAssignmentValue;
    }
    @Override
    public Block visitBlock(SqlParser.BlockContext ctx)
    {
        Block block = new Block();
        if(ctx.java_body().size()!=0)
        {
            for(int i=0; i < ctx.java_body().size() ; i++)
                block.javaBodies.add(visitJava_body(ctx.java_body().get(i)));
        }
        if(ctx.return_stmt() != null)
            block.returnStmt = visitReturn_stmt(ctx.return_stmt());
        return block;
    }
    @Override
    public OneLineBlock visitOne_line_block(SqlParser.One_line_blockContext ctx)
    {
        OneLineBlock oneLineBlock = new OneLineBlock();
        if(ctx.java_body()!=null)
            oneLineBlock.line = visitJava_body(ctx.java_body());
        if(ctx.return_stmt()!=null)
            oneLineBlock.line = visitReturn_stmt(ctx.return_stmt());
        return oneLineBlock;
    }

    public JavaBody visitJava_body(SqlParser.Java_bodyContext ctx)
    {
        JavaBody javaBody = new JavaBody();
        if(ctx.children.get(0) instanceof SqlParser.Variable_assignmentContext) {
            javaBody.command = visitVariable_assignment((SqlParser.Variable_assignmentContext) ctx.children.get(0),false);
        }
        else{
            Node temp = visit(ctx);
            if(temp instanceof ConditionalStmt)
                javaBody.command=(ConditionalStmt)temp;
            if(temp instanceof Comment)
                javaBody.command=(Comment)temp;
            if(temp instanceof Increment)
                javaBody.command=(Increment)temp;
            if(temp instanceof FunctionCall)
                javaBody.command=(FunctionCall)temp;
            if(temp instanceof LoopStmt)
                javaBody.command =(LoopStmt)temp;
            if(temp instanceof Print)
                javaBody.command = (Print)temp;
            if(temp instanceof SwitchStmt)
                javaBody.command = (SwitchStmt)temp;
            if(temp instanceof Rules.AST.Java.Utils.Scope)
                javaBody.command = (Rules.AST.Java.Utils.Scope)temp;
            if(temp instanceof VariableDeclaration)
                javaBody.command = (VariableDeclaration)temp;
            if(temp instanceof Break)
                javaBody.command = (Break)temp;
            if(temp instanceof Continue)
                javaBody.command = (Continue)temp;
            if(temp instanceof SqlStatment)
                javaBody.command = (SqlStatment)temp;
        }
        return javaBody;
    }

    @Override
    public SqlStatment visitSqlstmt(SqlParser.SqlstmtContext ctx) {
        return visitSql_stmt(ctx.sql_stmt());
    }

    @Override
    public ConditionalStmt visitCondBody(SqlParser.CondBodyContext ctx) {
        return visitConditional_stmt(ctx.conditional_stmt());
    }

    @Override
    public Continue visitContimueBody(SqlParser.ContimueBodyContext ctx) {
       return new Continue();
    }

    @Override
    public Break visitBreakBody(SqlParser.BreakBodyContext ctx) {
        return new Break();
    }

    @Override
    public VariableDeclaration visitVarDecBody(SqlParser.VarDecBodyContext ctx) {
        return visitVariable_declaration(ctx.variable_declaration());
    }

    @Override
    public VariableAssignment visitVarAssignBody(SqlParser.VarAssignBodyContext ctx) {
        return visitVariable_assignment(ctx.variable_assignment(),false);
    }

    @Override
    public Rules.AST.Java.Utils.Scope visitScopeBody(SqlParser.ScopeBodyContext ctx) {
        Rules.AST.Java.Utils.Scope scope = new Rules.AST.Java.Utils.Scope();
        if(ctx.java_body()!=null)
        {
           // scope.body=visitJava_body(ctx.java_body());
        }
        return scope;
    }

    @Override
    public SwitchStmt visitSwitchBody(SqlParser.SwitchBodyContext ctx) {
        return visitSwitch_stmt(ctx.switch_stmt());
    }

    @Override
    public SwitchStmt visitSwitch_stmt(SqlParser.Switch_stmtContext ctx) {
        SwitchStmt switchStmt= new SwitchStmt();
        switchStmt.var = visitVariable(ctx.variable());
        try {
            switchStmt.type = ((Variable)switchStmt.var).getType(symbolTable.scopeStack.peek());
        } catch (Error error) {
            error.line = ctx.variable().start.getLine();
            error.col = ctx.variable().start.getCharPositionInLine();
            errors.add(error);
        }
        for(int i=0;i<ctx.switch_case().size();i++)
        {
            switchStmt.cases.add(visitSwitch_case(ctx.switch_case(i)));
            if(!((SwitchCase)switchStmt.cases.get(i)).type.equals(switchStmt.type)){
                int line = ctx.switch_case().get(i).value().start.getLine();
                int col = ctx.switch_case().get(i).value().start.getCharPositionInLine();
                String des = "Type Of The Value Of The Case Statement Has To Be The Same As The Type Of The Switch Statement";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
        }
        if(ctx.switch_default()!=null)
            switchStmt.def = visitSwitch_default(ctx.switch_default());
        return switchStmt;
    }

    @Override
    public SwitchCase visitSwitch_case(SqlParser.Switch_caseContext ctx) {
        symbolTable.pushScope();
        SwitchCase switchCase = new SwitchCase();
        switchCase.value = visitValue(ctx.value());
        try {
            switchCase.type = ((Value)switchCase.value).getType(symbolTable.scopeStack.peek());
        } catch (Error error) {
            error.line = ctx.value().start.getLine();
            error.col = ctx.value().start.getCharPositionInLine();
            errors.add(error);
        }
        if(ctx.block()!=null)
            switchCase.block = visitBlock(ctx.block());
        else
            switchCase.block = visitOne_line_block(ctx.one_line_block());
        switchCase.scope = symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return switchCase;
    }

    @Override
    public SwitchDefault visitSwitch_default(SqlParser.Switch_defaultContext ctx) {
        symbolTable.pushScope();
        SwitchDefault switchDefault = new SwitchDefault();
        if(ctx.block()!=null)
            switchDefault.block = visitBlock(ctx.block());
        else
            switchDefault.block = visitOne_line_block(ctx.one_line_block());
        switchDefault.scope = symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return switchDefault;
    }

    @Override
    public LoopStmt visitLoopBody(SqlParser.LoopBodyContext ctx)
    {
        return visitLoop_stmt(ctx.loop_stmt());
    }

    @Override
    public FunctionCall visitJfcBody(SqlParser.JfcBodyContext ctx) {
        return visitJava_function_call(ctx.java_function_call());
    }

    @Override
    public Increment visitIncremetBody(SqlParser.IncremetBodyContext ctx) {
        return visitIncrement(ctx.increment());
    }

    public Increment visitIncrement(SqlParser.IncrementContext ctx)
    {
        Increment increment=new Increment();
        Node temp = visit(ctx);
        if(temp instanceof PostIncrement)
            increment.increment=(PostIncrement)temp;
        if(temp instanceof PostDecrement)
            increment.increment=(PostDecrement)temp;
        if(temp instanceof PreIncrement)
            increment.increment=(PreIncrement)temp;
        if(temp instanceof PreDecrement)
            increment.increment=(PreDecrement)temp;
        return increment;
    }

    @Override
    public PostIncrement visitPostInc(SqlParser.PostIncContext ctx) {
        PostIncrement postIncrement = new PostIncrement();
        postIncrement.variable = visitVariable(ctx.variable());
        postIncrement.op=ctx.op.getText();
        return postIncrement;
    }

    @Override
    public PostDecrement visitPostDec(SqlParser.PostDecContext ctx) {
        PostDecrement postDecrement= new PostDecrement();
        postDecrement.variable = visitVariable(ctx.variable());
        postDecrement.op = ctx.op.getText();
        return postDecrement;
    }

    @Override
    public PreIncrement visitPreInc(SqlParser.PreIncContext ctx) {
        PreIncrement preIncrement = new PreIncrement();
        preIncrement.variable = visitVariable(ctx.variable());
        preIncrement.op = ctx.op.getText();
        return preIncrement;
    }

    @Override
    public PreDecrement visitPreDec(SqlParser.PreDecContext ctx) {
        PreDecrement preDecrement = new PreDecrement();
        preDecrement.variable = visitVariable(ctx.variable());
        preDecrement.op = ctx.op.getText();
        return preDecrement;
    }

    @Override
    public ReturnStmt visitReturn_stmt(SqlParser.Return_stmtContext ctx)
    {
        ReturnStmt returnStmt = new ReturnStmt();
        returnStmt.returnValue = visitReturn_value(ctx.return_value());
        return returnStmt;
    }
    @Override
    public ReturnValue visitReturn_value(SqlParser.Return_valueContext ctx) {
        ReturnValue returnValue = new ReturnValue();
        if(ctx.expression() != null){
            returnValue.value = visitExpression(ctx.expression());
            try {
                ((Expression)returnValue.value).getType(symbolTable.scopeStack.peek());
            } catch (Error error) {
                error.line = ctx.expression().start.getLine();
                error.col = ctx.expression().start.getCharPositionInLine();
                errors.add(error);
            }
        }
        if(ctx.logical_condition() != null)
            returnValue.value = visitLogical_condition(ctx.logical_condition());
        if(ctx.string() != null)
            returnValue.value = visitString(ctx.string());
        return  returnValue;
    }
    @Override
    public JavaString visitString(SqlParser.StringContext ctx)
    {
        JavaString javaString = new JavaString();
        javaString.string ="";
        for(int i=0 ; i < ctx.expression().size(); i ++)
            javaString.string+= ctx.expression().get(i).getText();
        for(int i=0 ; i < ctx.any_name().size(); i ++)
            javaString.string+=ctx.any_name().get(i).getText();
//        for(int i=0 ; i < ctx.SPACES().size() ; i++)
//            javaString.string+=" ";
        System.out.println(javaString.string);
        return  javaString;
    }
    @Override
    public Print visitPrint(SqlParser.PrintContext ctx)
    {
        Print print = new Print();
        for(int i=0 ; i < ctx.expression().size(); i ++){
            print.expressions.add(visitExpression(ctx.expression().get(i)));
            try {
                (print.expressions.get(i)).getType(symbolTable.scopeStack.peek());
            } catch (Error error) {
                error.line = ctx.expression().get(i).start.getLine();
                error.col = ctx.expression().get(i).start.getCharPositionInLine();
                errors.add(error);
            }
        }

        return print;
    }

    @Override
    public ConditionalStmt visitConditional_stmt(SqlParser.Conditional_stmtContext ctx)
    {
        ConditionalStmt conditionalStmt = new ConditionalStmt();
        for( int i=0 ; i < ctx.if_stmt().size() ; i++)
            conditionalStmt.ifs.add(visitIf_stmt(ctx.if_stmt().get(i)));
        if(ctx.else_if_stmt().size()!=0)
        {
            for( int i=0 ; i < ctx.else_if_stmt().size(); i++)
                conditionalStmt.elseifs.add(visitElse_if_stmt(ctx.else_if_stmt().get(i)));
        }
        if(ctx.else_stmt() != null)
            conditionalStmt.elseStmt = visitElse_stmt(ctx.else_stmt());
        return conditionalStmt;
    }

    @Override
    public IfStmt visitIf_stmt(SqlParser.If_stmtContext ctx)
    {
        symbolTable.pushScope();
        IfStmt ifStmt = new IfStmt();
        ifStmt.condition = visitBooleanExpression(ctx.boolean_expression());
        try {
            ((BooleanExpression)ifStmt.condition).getType(symbolTable.scopeStack.peek());
        } catch (Error error) {
            error.line = ctx.boolean_expression().start.getLine();
            error.col = ctx.boolean_expression().start.getCharPositionInLine();
            errors.add(error);
        }
        if(ctx.one_line_block() != null )
            ifStmt.body = visitOne_line_block(ctx.one_line_block());
        if(ctx.block() != null)
            ifStmt.body = visitBlock(ctx.block());
        ifStmt.scope = symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return ifStmt;
    }
    @Override
    public ElseIfStmt visitElse_if_stmt(SqlParser.Else_if_stmtContext ctx)
    {
        ElseIfStmt elseIfStmt = new ElseIfStmt();
        symbolTable.pushScope();
        elseIfStmt.condition = visitBooleanExpression(ctx.boolean_expression());
        try {
            ((BooleanExpression)elseIfStmt.condition).getType(symbolTable.scopeStack.peek());
        } catch (Error error) {
            error.line = ctx.boolean_expression().start.getLine();
            error.col = ctx.boolean_expression().start.getCharPositionInLine();
            errors.add(error);
        }
        if(ctx.one_line_block() != null )
            elseIfStmt.body = visitOne_line_block(ctx.one_line_block());
        if(ctx.block() != null)
            elseIfStmt.body = visitBlock(ctx.block());
        elseIfStmt.scope = symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return elseIfStmt;
    }

    @Override
    public ElseStmt visitElse_stmt(SqlParser.Else_stmtContext ctx)
    {
        ElseStmt elseStmt = new ElseStmt();
        symbolTable.pushScope();
        if(ctx.one_line_block() != null )
            elseStmt.body = visitOne_line_block(ctx.one_line_block());
        if(ctx.block() != null)
            elseStmt.body = visitBlock(ctx.block());
        elseStmt.scope=symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return elseStmt;
    }

    @Override
    public LoopStmt visitLoop_stmt(SqlParser.Loop_stmtContext ctx)
    {
        LoopStmt loopStmt = new LoopStmt();
        if(ctx.for_loop() != null)
            loopStmt.loop = visitFor_loop(ctx.for_loop());
        if(ctx.for_each_loop() != null)
            loopStmt.loop = visitFor_each_loop(ctx.for_each_loop());
        if(ctx.while_loop() != null)
            loopStmt.loop = visitWhile_loop(ctx.while_loop());
        if(ctx.do_while_loop() != null)
            loopStmt.loop = visitDo_while_loop(ctx.do_while_loop());
        return loopStmt;
    }

    @Override
    public ForLoop visitFor_loop(SqlParser.For_loopContext ctx)
    {
        symbolTable.pushScope();
        ForLoop  forLoop = new ForLoop();
        forLoop.variableDeclaration = visitVariable_declaration(ctx.variable_declaration());
        forLoop.booleanExpression = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.increment()!=null)
            forLoop.mathExpresion = visitIncrement(ctx.increment());
        else
            forLoop.mathExpresion = visitVariable_assignment(ctx.variable_assignment());
        if(ctx.block()!=null)
            forLoop.block = visitBlock(ctx.block());
        else
            forLoop.block = visitOne_line_block(ctx.one_line_block());
        forLoop.scope = symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return forLoop;
    }

    @Override
    public ForEachLoop visitFor_each_loop(SqlParser.For_each_loopContext ctx)
    {
        ForEachLoop forEachLoop = new ForEachLoop();
        forEachLoop.variable = visitVariable(ctx.variable());
        forEachLoop.arrayName = ctx.array_name().getText();
        if(ctx.block()!=null)
            forEachLoop.block=visitBlock(ctx.block());
        else
            forEachLoop.block=visitOne_line_block(ctx.one_line_block());
        return forEachLoop;
    }

    @Override
    public WhileLoop visitWhile_loop(SqlParser.While_loopContext ctx)
    {
        symbolTable.pushScope();
        WhileLoop  whileLoop = new WhileLoop();
        whileLoop.booleanExpression = visitBooleanExpression(ctx.boolean_expression());
        try {
            ((BooleanExpression)whileLoop.booleanExpression).getType(symbolTable.scopeStack.peek());
        } catch (Error error) {
            error.line = ctx.boolean_expression().start.getLine();
            error.col = ctx.boolean_expression().start.getCharPositionInLine();
            errors.add(error);
        }
        if(ctx.block()!=null)
            whileLoop.block = visitBlock(ctx.block());
        else
            whileLoop.block = visitOne_line_block(ctx.one_line_block());
        whileLoop.scope = symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return whileLoop;
    }

    @Override
    public DoWhileLoop visitDo_while_loop(SqlParser.Do_while_loopContext ctx)
    {
        symbolTable.pushScope();
        DoWhileLoop  doWhileLoop = new DoWhileLoop();
        doWhileLoop.booleanExpression = visitBooleanExpression(ctx.boolean_expression());
        try {
            ((BooleanExpression)doWhileLoop.booleanExpression).getType(symbolTable.scopeStack.peek());
        } catch (Error error) {
            error.line = ctx.boolean_expression().start.getLine();
            error.col = ctx.boolean_expression().start.getCharPositionInLine();
            errors.add(error);
        }
        if(ctx.block()!=null)
            doWhileLoop.block = visitBlock(ctx.block());
        else
            doWhileLoop.block = visitOne_line_block(ctx.one_line_block());
        doWhileLoop.scope = symbolTable.scopeStack.peek();
        symbolTable.popScope();
        return doWhileLoop;
    }

    public LogicalCondition visitLogical_condition (SqlParser.Logical_conditionContext ctx)
    {
        LogicalCondition logicalCondition = new LogicalCondition();
        Node temp = visit(ctx);
        if(temp instanceof LogicalConditionNormal)
            logicalCondition.logicalCondition = (LogicalConditionNormal)temp;
        if(temp instanceof LogicalConditionInParenth)
            logicalCondition.logicalCondition = (LogicalConditionInParenth)temp;
        return logicalCondition;
    }

    @Override
    public LogicalConditionNormal visitNormalLog(SqlParser.NormalLogContext ctx) {
        LogicalConditionNormal logicalConditionNormal = new LogicalConditionNormal();
        logicalConditionNormal.condition = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.expression(0)!=null)
            logicalConditionNormal.ifTrue = visitExpression(ctx.expression(0));
        if(ctx.logical_condition(0)!=null)
            logicalConditionNormal.ifTrue = visitLogical_condition(ctx.logical_condition(0));
        if(ctx.expression(1)!=null)
            logicalConditionNormal.ifFalse = visitExpression(ctx.expression(1));
        if(ctx.logical_condition(1)!=null)
            logicalConditionNormal.ifFalse = visitLogical_condition(ctx.logical_condition(1));
        return logicalConditionNormal;
    }

    @Override
    public Node visitParenthLog(SqlParser.ParenthLogContext ctx) {
        LogicalConditionInParenth logicalConditionInParenth = new LogicalConditionInParenth();
        logicalConditionInParenth.logicalCondition = visitLogical_condition(ctx.logical_condition());
        return logicalConditionInParenth;
    }

    public Expression visitExpression(SqlParser.ExpressionContext ctx) {
        Expression expression = new Expression();
        if(ctx.value()!=null)
            expression.expression = visitValue(ctx.value());
        if(ctx.boolean_expression()!=null)
            expression.expression = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.math_expression()!=null)
            expression.expression = visitMathExpression(ctx.math_expression());
        if(ctx.increment()!=null)
            expression.expression = visitIncrement(ctx.increment());
        return expression;
    }

    public BooleanExpression visitBooleanExpression(SqlParser.Boolean_expressionContext ctx)
    {
        BooleanExpression booleanExpression = new BooleanExpression();
        Node temp = visit(ctx);
        if(temp instanceof Value)
            booleanExpression.booleanExpression=(Value)temp;
        if(temp instanceof MultipleBooleanExpression)
            booleanExpression.booleanExpression = (MultipleBooleanExpression)temp;
        if(temp instanceof Compare)
            booleanExpression.booleanExpression =(Compare)temp;
        if(temp instanceof BooleanInParenth)
            booleanExpression.booleanExpression = (BooleanInParenth)temp;
        if(temp instanceof True)
            booleanExpression.booleanExpression=(True)temp;
        if(temp instanceof False)
            booleanExpression.booleanExpression=(False)temp;
        return booleanExpression;
    }

    @Override
    public Value visitValBool(SqlParser.ValBoolContext ctx) {
        return visitValue(ctx.value());
    }

    @Override
    public Compare visitCompareBool(SqlParser.CompareBoolContext ctx) {
        Compare compare = new Compare();
        compare.left = visitMathExpression(ctx.math_expression(0));
        compare.right = visitMathExpression(ctx.math_expression(1));
        compare.op = ctx.op.getText();
        return compare;
    }

    @Override
    public MultipleBooleanExpression visitMultipleBool(SqlParser.MultipleBoolContext ctx) {
        MultipleBooleanExpression multipleBooleanExpression = new MultipleBooleanExpression();
        multipleBooleanExpression.left = visitBooleanExpression(ctx.boolean_expression(0));
        multipleBooleanExpression.right = visitBooleanExpression(ctx.boolean_expression(1));
        multipleBooleanExpression.op = ctx.op.getText();
        return multipleBooleanExpression;
    }

    @Override
    public BooleanInParenth visitParenthBool(SqlParser.ParenthBoolContext ctx) {
        BooleanInParenth booleanInParenth = new BooleanInParenth();
        booleanInParenth.value = visitBooleanExpression(ctx.boolean_expression());
        return booleanInParenth;
    }

    @Override
    public True visitTrueBool(SqlParser.TrueBoolContext ctx) {
        return new True();
    }

    @Override
    public False visitFalseBool(SqlParser.FalseBoolContext ctx) {
        return new False();
    }

    public MathExpression visitMathExpression(SqlParser.Math_expressionContext ctx)
    {
        MathExpression mathExpression = new MathExpression();
        Node temp = visit(ctx);
        if(temp instanceof Value)
            mathExpression.expression = (Value)temp;
        if(temp instanceof ArithmeticOperation)
            mathExpression.expression = (ArithmeticOperation)temp;
        if(temp instanceof MathInParenth)
            mathExpression.expression = (MathInParenth)temp;
        return mathExpression;
    }

    @Override
    public Value visitValueMath(SqlParser.ValueMathContext ctx) {
        return visitValue(ctx.value());
    }

    @Override
    public ArithmeticOperation visitArithmeticMath(SqlParser.ArithmeticMathContext ctx) {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.left = visitMathExpression(ctx.math_expression(0));
        arithmeticOperation.right = visitMathExpression(ctx.math_expression(1));
        arithmeticOperation.op = ctx.op.getText();
        return arithmeticOperation;
    }

    @Override
    public MathInParenth visitParenthMath(SqlParser.ParenthMathContext ctx) {
        MathInParenth mathInParenth = new MathInParenth();
        mathInParenth.expression = visitMathExpression(ctx.math_expression());
        return mathInParenth;
    }

    public Value visitValue(SqlParser.ValueContext ctx)
    {
        Value value=new Value();
        Node temp = visit(ctx);
        if(temp instanceof Variable)
            value.value = (Variable)temp;
        if(temp instanceof JavaString)
            value.value = (JavaString) temp;
        if(temp instanceof FunctionCall)
            value.value = (FunctionCall)temp;
        if(temp instanceof SimpleLiteralValue)
            value.value = (SimpleLiteralValue)temp;
        if(temp instanceof ValueInParenth)
            value.value = (ValueInParenth)temp;
        return value;
    }

    @Override
    public ValueInParenth visitParenthVal(SqlParser.ParenthValContext ctx) {
        ValueInParenth valueInParenth = new ValueInParenth();
        valueInParenth.value = visitValue(ctx.value());
        return valueInParenth;
    }

    @Override
    public SimpleLiteralValue visitLvVal(SqlParser.LvValContext ctx) {
        return visitLiteral_value(ctx.literal_value());
    }

    @Override
    public SimpleLiteralValue visitLiteral_value(SqlParser.Literal_valueContext ctx) {
        SimpleLiteralValue simpleLiteralValue = new SimpleLiteralValue();
        simpleLiteralValue.value = ctx.getText();
        return simpleLiteralValue;
    }

    @Override
    public FunctionCall visitJfcVal(SqlParser.JfcValContext ctx) {
        return visitJava_function_call(ctx.java_function_call());
    }

    @Override
    public Variable visitVarVal(SqlParser.VarValContext ctx) {
        return visitVariable(ctx.variable());
    }

    @Override
    public Variable visitVariable(SqlParser.VariableContext ctx) {
        Variable variable = new Variable();
        if(ctx.any_name()!=null)
        {
            SimpleVariable s = new SimpleVariable();
            for(int i=0 ; i < ctx.any_name().size(); i++)
                s.VariableName.add(ctx.any_name().get(i).getText());
            variable.variable = s;
        }
        return variable;
    }





///////////////////////////////////////////////////////////////////////////////////////////////////////





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
            sqlExpression.parseObject = sqlExpression.type;
        }
        if(temp instanceof SqlExpressionCase2)
        {
            sqlExpression.expression = (SqlExpressionCase2)temp;
            sqlExpression.type = ((SqlExpressionCase2)temp).type;
            sqlExpression.parseObject = ((SqlExpressionCase2) temp).parseObject;
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
            sqlExpression.parseObject = ((SqlExpressionCase5) temp).parseObject;
        }
        if(temp instanceof SqlExpressionCase6)
        {
            sqlExpression.expression = (SqlExpressionCase6)temp;
            sqlExpression.type = ((SqlExpressionCase6)temp).type;
            sqlExpression.parseObject = ((SqlExpressionCase6) temp).parseObject;
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
            sqlExpression.type = ((SqlExpressionCase9)temp).type;
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
            sqlExpression.type = ((SqlExpressionCase14)temp).type;
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
        if(ctx.literal_value()!=null){
            sqlExpressionCase1.literalValue = ctx.literal_value().getText();
            try {
                sqlExpressionCase1.type = NumberFormat.getInstance().parse(sqlExpressionCase1.literalValue).getClass().getSimpleName();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else if(ctx.string()!=null){
            sqlExpressionCase1.literalValue = visitString(ctx.string()).string;
            sqlExpressionCase1.type = "String";
        }
        else if(ctx.K_TRUE()!=null){
            sqlExpressionCase1.bool = true;
            sqlExpressionCase1.type = "Boolean";
        }
        else {
            sqlExpressionCase1.bool = false;
            sqlExpressionCase1.type = "Boolean";
        }
        return sqlExpressionCase1;
    }

    @Override
    public SqlExpressionCase2 visitCase2(SqlParser.Case2Context ctx) {
        boolean err = true;
        SqlExpressionCase2 sqlExpressionCase2 = new SqlExpressionCase2();
        sqlExpressionCase2.columnName =visitAny_name(ctx.column_name().any_name());
        if(symbolTable.queryManager.values.containsKey(sqlExpressionCase2.columnName.name)){
            err = false;
            sqlExpressionCase2.type = symbolTable.queryManager.values.get(sqlExpressionCase2.columnName.name).type;
            sqlExpressionCase2.parseObject = symbolTable.queryManager.values.get(sqlExpressionCase2.columnName.name).clone();
        }
        if(err){
            int line = ctx.start.getLine();
            int col = ctx.start.getCharPositionInLine();
            String des = sqlExpressionCase2.columnName.name +" Does Not Exist In Current Context";
            Error error = new Error(line,col,des);
            errors.add(error);
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
            else{
                sqlExpressionCase5.type = ((SqlExpression)sqlExpressionCase5.SqlExpression1).type;
                if( ((SqlExpression) sqlExpressionCase5.SqlExpression1).parseObject instanceof ColumnSymbol){
                    sqlExpressionCase5.parseObject = ((SqlExpression) sqlExpressionCase5.SqlExpression1).parseObject;
                }else if( ((SqlExpression) sqlExpressionCase5.SqlExpression1).parseObject instanceof ColumnSymbol ){
                    sqlExpressionCase5.parseObject = ((SqlExpression) sqlExpressionCase5.SqlExpression1).parseObject;
                } else{
                    sqlExpressionCase5.parseObject = ((SqlExpression) sqlExpressionCase5.SqlExpression1).parseObject;
                }
            }
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
            else{
                sqlExpressionCase6.type = ((SqlExpression)sqlExpressionCase6.SqlExpression1).type;
                if( ((SqlExpression) sqlExpressionCase6.SqlExpression1).parseObject instanceof ColumnSymbol){
                    sqlExpressionCase6.parseObject = ((SqlExpression) sqlExpressionCase6.SqlExpression1).parseObject;
                }else if( ((SqlExpression) sqlExpressionCase6.SqlExpression1).parseObject instanceof ColumnSymbol ){
                    sqlExpressionCase6.parseObject = ((SqlExpression) sqlExpressionCase6.SqlExpression1).parseObject;
                } else{
                    sqlExpressionCase6.parseObject = ((SqlExpression) sqlExpressionCase6.SqlExpression1).parseObject;
                }
            }
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
        if(ctx.op != null){
            sqlExpressionCase9.op = ctx.op.getText();
        }
        else if(ctx.K_IS()!=null && ctx.K_NOT()!=null)
            sqlExpressionCase9.op = "IS NOT";
        else if(ctx.K_IS()!=null)
            sqlExpressionCase9.op = "IS";
        else if(ctx.K_LIKE()!=null)
            sqlExpressionCase9.op = "LIKE";
        else if(ctx.K_GLOB()!=null)
            sqlExpressionCase9.op = "GLOB";
        else if(ctx.K_MATCH()!=null)
            sqlExpressionCase9.op = "MATCH";
        else if(ctx.K_REGEXP()!=null)
            sqlExpressionCase9.op = "REGEXP";
        sqlExpressionCase9.SqlExpression2 = visitExpr(ctx.expr(1));
        if(!((SqlExpression)sqlExpressionCase9.SqlExpression2).type.equals(((SqlExpression)sqlExpressionCase9.SqlExpression1).type)){
            int line = ctx.start.getLine();
            int col = ctx.start.getCharPositionInLine();
            String des = "The Operation "+ sqlExpressionCase9.op +" Has To Take In 2 Expressions Of The Same Type";
            Error error = new Error(line,col,des);
            errors.add(error);
        }
        else
            sqlExpressionCase9.type = "Boolean";
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
//        if(ctx.K_NOT() != null)
//            sqlExpressionCase14.not = true;
//        sqlExpressionCase14.mainExpression = visitExpr(ctx.exp1);
//        if(ctx.select_stmt() != null)
//            sqlExpressionCase14.selectStmt = visitSelect_stmt(ctx.select_stmt());
//        if(((SelectStmt)sqlExpressionCase14.selectStmt).types.size() == 0){
//            int line = ctx.select_stmt().start.getLine();
//            int col = ctx.select_stmt().start.getCharPositionInLine();
//            String des = "Select Statement Does Not Have Any Type";
//            Error error = new Error(line,col,des);
//            errors.add(error);
//        }else {
//            if( ((SelectStmt)sqlExpressionCase14.selectStmt).types.size() > 1 ){
//                int line = ctx.select_stmt().start.getLine();
//                int col = ctx.select_stmt().start.getCharPositionInLine();
//                String des = "Select Statement Has More Than One Type";
//                Error error = new Error(line,col,des);
//                errors.add(error);
//            }
//            else {
//                if( sqlExpressionCase14.mainExpression.type.equals("String")
//                        || sqlExpressionCase14.mainExpression.type.equals("Boolean")
//                        || sqlExpressionCase14.mainExpression.type.equals("Double")
//                        || sqlExpressionCase14.mainExpression.type.equals("Long")){
//                    if( (((SelectStmt)sqlExpressionCase14.selectStmt).types.get(0).sqlType.entries.size()>1) ){
//                        int line = ctx.select_stmt().start.getLine();
//                        int col = ctx.select_stmt().start.getCharPositionInLine();
//                        String des = "Select Statement Has More Than One Type";
//                        Error error = new Error(line,col,des);
//                        errors.add(error);
//                    }else {
//                        if( !((SelectStmt)sqlExpressionCase14.selectStmt).types.get(0).sqlType.entries.get(0).type.equals(sqlExpressionCase14.mainExpression.type) ){
//                            int line = ctx.select_stmt().start.getLine();
//                            int col = ctx.select_stmt().start.getCharPositionInLine();
//                            String des = "Select Statement Is Not Of The Same Type As The Expression Before In";
//                            Error error = new Error(line,col,des);
//                            errors.add(error);
//                        }
//                        else
//                            sqlExpressionCase14.type = "Boolean";
//                    }
//                }else {
//                    if(!((SelectStmt)sqlExpressionCase14.selectStmt).types.get(0).sqlType.name.equals(sqlExpressionCase14.mainExpression.type)) {
//                        int line = ctx.select_stmt().start.getLine();
//                        int col = ctx.select_stmt().start.getCharPositionInLine();
//                        String des = "Select Statement Is Not Of The Same Type As The Expression Before In";
//                        Error error = new Error(line,col,des);
//                        errors.add(error);
//                    }
//                    else
//                        sqlExpressionCase14.type = "Boolean";
//                }
//            }
//        }
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
        sqlExpressionCase22.expression1 = visitExpr(ctx.expr().get(0));
        sqlExpressionCase22.anyname = visitAny_name(ctx.any_name());
        if(((SqlExpression)sqlExpressionCase22.expression1).type != null){
            if(symbolTable.sqlTypes.containsKey(((SqlExpression)(sqlExpressionCase22.expression1)).type)){
                if(!symbolTable.sqlTypes.get(((SqlExpression)(sqlExpressionCase22.expression1)).type).entryExists(sqlExpressionCase22.anyname.name)){
                    int line = ctx.any_name().start.getLine();
                    int col = ctx.any_name().start.getCharPositionInLine();
                    String des = sqlExpressionCase22.anyname.name + " Does Not Exist In "+ ((SqlExpression)(sqlExpressionCase22.expression1)).type;
                    Error error = new Error(line,col,des);
                    errors.add(error);
                }
                else {
                    TableSymbol store = symbolTable.queryManager.clone();
                    if((((SqlExpression)sqlExpressionCase22.expression1).parseObject) instanceof ColumnSymbol){
                        ColumnSymbol col = ((ColumnSymbol)((SqlExpression)sqlExpressionCase22.expression1).parseObject);
                        store.printTable(symbolTable);
                        if(symbolTable.sqlTypes.containsKey(col.type) &&
                                symbolTable.scopeStack.peek().findSymbol(col.type) instanceof TableSymbol){
                            for(Object obj : col.values){
                                TableSymbol temp = ((TableSymbol)obj);
                                symbolTable.queryManager = temp.clone();
                                sqlExpressionCase22.expression2 = visitExpr(ctx.expr(1));
                            }
                        }
                    }
                    symbolTable.queryManager = store.clone();
                }
            }
            else {
                int line = ctx.expr().get(0).start.getLine();
                int col = ctx.expr().get(0).start.getCharPositionInLine();
                String des = ((SqlExpression)(sqlExpressionCase22.expression1)).type + " Does Not Exist In This Context";
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
        boolean err = false;
        boolean colExists = false;
        SqlType sqlType = new SqlType();
        sqlType.name = visitType_name(ctx.type_name()).name.name;
        if(symbolTable.sqlTypes.containsKey(sqlType.name))
        {
            int line = ctx.type_name().start.getLine();
            int col = ctx.type_name().start.getCharPositionInLine();
            String des = "Type " + sqlType.name +" Already Exists";
            Error error = new Error(line,col,des);
            errors.add(error);
        } else {
            for (int i = 0 ; i < ctx.type().size() ; i++){
                SqlTypeEntry sqlTypeEntry = new SqlTypeEntry();
                sqlTypeEntry.type = ctx.type(i).getText();
                sqlTypeEntry.name = visitAny_name(ctx.any_name(i)).name;
                if (sqlType.entries.size() != 0) {
                    for(int j = 0; j < sqlType.entries.size(); j++){
                        if(sqlType.entries.get(j).name.equals(sqlTypeEntry.name)){
                            colExists = true;
                            break;
                        }
                    }
                    if(colExists){
                        err = true;
                        int line = ctx.any_name().get(i).start.getLine();
                        int col = ctx.any_name().get(i).start.getCharPositionInLine();
                        String des = "Column "+ sqlTypeEntry.name + " Is Defined More Than Once";
                        Error error = new Error(line,col,des);
                        errors.add(error);
                        break;
                    }
                }
                if(symbolTable.sqlTypes.containsKey(sqlTypeEntry.type)
                        || sqlTypeEntry.type.equals("String")
                        || sqlTypeEntry.type.equals("Long")
                        || sqlTypeEntry.type.equals("Boolean")
                        || sqlTypeEntry.type.equals("Double")
                        || (symbolTable.getSymbol(sqlTypeEntry.type)!=null
                        && symbolTable.getSymbol(sqlTypeEntry.type) instanceof TableSymbol)) {
                    sqlType.entries.add(sqlTypeEntry);
                }
                else {
                    err = true;
                    sqlType = null;
                    int line = ctx.type().get(i).start.getLine();
                    int col = ctx.type().get(i).start.getCharPositionInLine();
                    String des = "Type "+ sqlTypeEntry.type +" Doesn't Exist";
                    Error error = new Error(line,col,des);
                    errors.add(error);
                    break;
                }
            }
            if(!err){
                symbolTable.sqlTypes.put(sqlType.name , sqlType);
            }
        }
        return null;
    }

    @Override
    public CreateTableStatement visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx)
    {
        boolean err = false;
        boolean colExists = false;
        TableSymbol tableSymbol = new TableSymbol();
        CreateTableStatement createTableStatement = new CreateTableStatement();
        if(ctx.K_IF()!= null)
            createTableStatement.ifNotExists = true;
        if(ctx.table_name() != null)
        {
            createTableStatement.tableName = visitAny_name(ctx.table_name().any_name());
            tableSymbol.name = createTableStatement.tableName.name;
            if(symbolTable.sqlTypes.containsKey(tableSymbol.name)) {
                int line = ctx.table_name().start.getLine();
                int col = ctx.table_name().start.getCharPositionInLine();
                String des = "Table "+ tableSymbol.name+" Already Exists";
                Error error = new Error(line,col,des);
                errors.add(error);
            }else {
                for(int i=0 ; i < ctx.column_def().size() ; i++){
                    createTableStatement.columnDefs.add(visitColumn_def(ctx.column_def().get(i)));
                    ColumnDef columnDef = ((ColumnDef)createTableStatement.columnDefs.get(i));
                    ColumnSymbol columnSymbol = new ColumnSymbol();
                    columnSymbol.name = columnDef.name.name;
                    if(tableSymbol.values.size()!=0){
                        if(tableSymbol.values.containsKey(columnSymbol.name))
                            colExists = true;
                        if(colExists){
                            err = true;
                            int line = ctx.column_def().get(i).start.getLine();
                            int col = ctx.column_def().get(i).start.getCharPositionInLine();
                            String des = "Column "+ columnSymbol.name + " Is Defined More Than Once";
                            Error error = new Error(line,col,des);
                            errors.add(error);
                            break;
                        }
                    }
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
                        int line = ctx.column_def().get(i).start.getLine();
                        int col = ctx.column_def().get(i).start.getCharPositionInLine();
                        String des = "Type "+ type +" Doesn't Exist";
                        Error error = new Error(line, col, des);
                        errors.add(error);
                        break;
                    }
                }
                if(!err){
                    SqlType sqlType = tableSymbol.getSqlTypeFromTableSymbol(symbolTable);
                    tableSymbol.type = sqlType.name;
                    symbolTable.scopeStack.peek().symbolMap.put(tableSymbol.name , tableSymbol);
                    if(tableSymbol.name.equals("libraries"))
                        new JSONParse("C:\\Users\\Dell\\Desktop\\sample.txt").getTableFromFile(sqlType,symbolTable,tableSymbol);
                    if(tableSymbol.name.equals("lib"))
                        new JSONParse("C:\\Users\\Dell\\Desktop\\sample2.txt").getTableFromFile(sqlType,symbolTable,tableSymbol);
                }
            }
        }
        return createTableStatement;
    }

    ////

    @Override
    public FactoredSelectStatement visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx)
    {
        FactoredSelectStatement factoredSelectStatement= new FactoredSelectStatement();
        factoredSelectStatement.selectCore = visitSelect_core(ctx.select_core());
//        ArrayList<TableOrSubQueryTypeEntry> types = ((SelectCore)factoredSelectStatement.selectCore).types;
//        for(int i=0;i<types.size();i++){
//            if(types.get(i).sqlType.name == null){
//                for(int j=0;j<types.get(i).sqlType.entries.size();j++){
//                    SqlTypeEntry sqlTypeEntry = new SqlTypeEntry();
//                    sqlTypeEntry.type = types.get(i).sqlType.entries.get(j).type;
//                    sqlTypeEntry.name = types.get(i).as;
//                    factoredSelectStatement.sqlType.entries.add(sqlTypeEntry);
//                }
//            } else {
//                SqlTypeEntry sqlTypeEntry = new SqlTypeEntry();
//                sqlTypeEntry.type = types.get(i).sqlType.name;
//                sqlTypeEntry.name = types.get(i).as;
//                factoredSelectStatement.sqlType.entries.add(sqlTypeEntry);
//            }
//        }
        //((SelectCore)factoredSelectStatement.selectCore).sqlType.printType();
//        for(int i=0 ; i <ctx.ordering_term().size() ; i++)
//            factoredSelectStatement.orderingterms.add(visitOrdering_term(ctx.ordering_term().get(i)));
//        for(int i=0 ; i < ctx.expr().size(); i++)
//            factoredSelectStatement.expression.add(visitExpr(ctx.expr().get(i)));
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
        }
        TableSymbol current = new TableSymbol();
        for(int i=0;i<selectCore.tableOrSubQueries.size();i++) {
            if (i == 0) {
                current = ((TableOrSubquery) selectCore.tableOrSubQueries.get(i)).type;
                symbolTable.queryManager = current.clone();
            } else {
                current = cartProduct(current
                        , ((TableOrSubquery) selectCore.tableOrSubQueries.get(i)).type);
                symbolTable.queryManager = current.clone();
            }
        }
        for(ColumnSymbol col : current.values.values()){
            System.out.println(col.name);
        }
        if(current.values.size()!=0)
        {
            symbolTable.queryManager = current.clone();
            if( ctx.where!=null){
                SqlExpression sqlExpression = visitExpr(ctx.where);
                selectCore.whereExpression = sqlExpression;
                if (sqlExpression.type ==null ||!sqlExpression.type.equals("Boolean")){
                    int line = ctx.where.start.getLine();
                    int col = ctx.where.start.getCharPositionInLine();
                    String des = "Expression Inside Where Is Not Of Type Boolean";
                    Error error = new Error(line,col,des);
                    errors.add(error);
                }
            }
            for(int i=0 ; i < ctx.result_column().size(); i++){
                selectCore.resultColumns.add(visitResult_column(ctx.result_column().get(i)));
            }
            if( ctx.join_clause() !=null){
                selectCore.joinClause = visitJoin_clause(ctx.join_clause());
            }
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
            if(symbolTable.getSymbol(tableOrSubquery.tableName.name) ==null ||
                    ! (symbolTable.getSymbol(tableOrSubquery.tableName.name) instanceof TableSymbol)){
                int line = ctx.table_name().start.getLine();
                int col = ctx.table_name().start.getCharPositionInLine();
                String des = "Table "+ tableOrSubquery.tableName.name +" Does Not Exist";
                Error error = new Error(line,col,des);
                errors.add(error);
            }
            else {
                tableOrSubquery.type = (((TableSymbol)(symbolTable.getSymbol(tableOrSubquery.tableName.name)))).clone();
            }
        }
        else {
            tableOrSubquery.selectStatment = visitSelect_stmt(ctx.select_stmt());
            if(ctx.table_alias()!=null)
                tableOrSubquery.tableAlias = ctx.table_alias().getText();
            else {
                tableOrSubquery.type = ((SelectStmt)tableOrSubquery.selectStatment).type;
            }
        }
        return tableOrSubquery;
    }


    public TableSymbol cartProduct(TableSymbol table1 , TableSymbol table2){
        TableSymbol tableSymbol = new TableSymbol();
        table1.values.values().forEach(val->{
            ColumnSymbol columnSymbol = new ColumnSymbol();
            columnSymbol.name = val.name;
            columnSymbol.type = val.type;
            tableSymbol.values.put(columnSymbol.name,columnSymbol);
        });
        table2.values.values().forEach(val->{
            ColumnSymbol columnSymbol = new ColumnSymbol();
            columnSymbol.name = val.name;
            columnSymbol.type = val.type;
            tableSymbol.values.put(columnSymbol.name,columnSymbol);
        });
        int count1 = table1.getColumnWithLeastValues();
        int count2 = table2.getColumnWithLeastValues();
        for(int i = 0;i<count1;i++){
            for(int j=0;j<count2;j++){
                for (ColumnSymbol col1 : table1.values.values()) {
                    tableSymbol.values.get(col1.name).values.add(col1.values.get(i));
                }
            }
            for(int j=0; j<count2;j++){
                for (ColumnSymbol col2 : table2.values.values()){
                    System.out.println();
                    tableSymbol.values.get(col2.name).values.add(col2.values.get(j));
                }
            }
        }
        return tableSymbol;
    }


    @Override
    public SelectStmt visitSelect_stmt(SqlParser.Select_stmtContext ctx)
    {
        SelectStmt selectStmt = new SelectStmt();
        selectStmt.selectorval = visitSelect_or_values(ctx.select_or_values());
        selectStmt.type = ((SelectOrValue)selectStmt.selectorval).type;
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
        for(int i=0 ; i < ctx.table_or_subquery().size(); i++){
            selectOrValue.tablesorSbqueries.add(visitTable_or_subquery(ctx.table_or_subquery().get(i)));
        }
        TableSymbol current = new TableSymbol();
        for(int i=0;i<selectOrValue.tablesorSbqueries.size();i++){
            if(i==0){
                current = ((TableOrSubquery)selectOrValue.tablesorSbqueries.get(i)).type;
                symbolTable.queryManager = current.clone();
            }
            else{
                current = cartProduct(current
                        , ((TableOrSubquery)selectOrValue.tablesorSbqueries.get(i)).type);
                symbolTable.queryManager = current.clone();
            }
        }
        if(current.values.size()!=0) {
            symbolTable.queryManager = current.clone();
            if (ctx.where != null) {
                SqlExpression sqlExpression = visitExpr(ctx.where);
                selectOrValue.whereExpression = sqlExpression;
                if (sqlExpression.type == null || !sqlExpression.type.equals("Boolean")) {
                    int line = ctx.where.start.getLine();
                    int col = ctx.where.start.getCharPositionInLine();
                    String des = "Expression Inside Where Is Not Of Type Boolean";
                    Error error = new Error(line, col, des);
                    errors.add(error);
                }
            }
            TableSymbol tableSymbol = symbolTable.queryManager.clone();
            tableSymbol.values.clear();
            for (int i = 0; i < ctx.result_column().size(); i++) {
                selectOrValue.resColumns.add(visitResult_column(ctx.result_column().get(i)));
                ResultColumn resultColumn = ((ResultColumn)selectOrValue.resColumns.get(i));
                SqlExpression expr = ((SqlExpression)resultColumn.expression);
                if(expr.parseObject==null){
                    System.out.println("ok");
                }
                else{
                    if(expr.parseObject instanceof ColumnSymbol){
                        ColumnSymbol col = ((ColumnSymbol)expr.parseObject);
                        tableSymbol.values.put(col.name,col);
                    }else if(expr.parseObject instanceof String){
                        ColumnSymbol col = new ColumnSymbol();
                        col.name = RandomNameGenerator.generateNewRandomName();
                        col.type = (String) expr.parseObject;
                        tableSymbol.values.put(col.name,col);
                    }
                }
            }
            selectOrValue.type = tableSymbol;
        }
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




















