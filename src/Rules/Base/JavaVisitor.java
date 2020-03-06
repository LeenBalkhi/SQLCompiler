package Rules.Base;
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
import Rules.generated.*;

public class JavaVisitor extends SqlBaseVisitor<Node> {

    @Override
    public Print visitPrintBody(SqlParser.PrintBodyContext ctx) {
        return visitPrint(ctx.print());
    }

    @Override
    public JavaStatment visitJava_stmt(SqlParser.Java_stmtContext ctx) {
        JavaStatment javaStatment=new JavaStatment();

        if(ctx.variable_declaration() != null)
            javaStatment.javaStatment=visitVariable_declaration(ctx.variable_declaration());
         if (ctx.higher_order_java_function_call()!= null)
            javaStatment.javaStatment=visitHigher_order_java_function_call(ctx.higher_order_java_function_call());
        else if(ctx.java_function_call()!=null)
            javaStatment.javaStatment=visitJava_function_call(ctx.java_function_call());
        else if(ctx.java_function_declaration()!= null)
            javaStatment.javaStatment=visitJava_function_declaration(ctx.java_function_declaration());
        return javaStatment;
    }

    @Override
    public FunctionCall visitJava_function_call(SqlParser.Java_function_callContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        functionCall.functionName = ctx.method_ID().getText();
        functionCall.argumentList = visitArgument_list(ctx.argument_list());
        return functionCall;
    }
    @Override
    public FunctionDeclaration visitJava_function_declaration(SqlParser.Java_function_declarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        functionDeclaration.functionName = ctx.method_ID().getText();
        functionDeclaration.pl = visitParameter_list(ctx.parameter_list());
        functionDeclaration.block = visitBlock(ctx.block());
        return functionDeclaration;
    }
    @Override
    public HigherOrderFunctionCall visitHigher_order_java_function_call(SqlParser.Higher_order_java_function_callContext ctx)
    {
        HigherOrderFunctionCall higherOrderFunctionCall = new HigherOrderFunctionCall();
        higherOrderFunctionCall.funcName=ctx.method_ID().getText();
        if(ctx.argument_list().size()!=0)
        {
            for(int i=0 ; i < ctx.argument_list().size() ; i ++)
            {
                higherOrderFunctionCall.argumentLists.add(visitArgument_list(ctx.argument_list().get(i)));
            }
        }
        higherOrderFunctionCall.higherOrderFunction = visitHo_java_function(ctx.ho_java_function());
        return higherOrderFunctionCall;
    }
    @Override
    public HigherOrderFunction visitHo_java_function(SqlParser.Ho_java_functionContext ctx)
    {
        HigherOrderFunction higherOrderFunction = new HigherOrderFunction();
        higherOrderFunction.argumentList = visitArgument_list(ctx.argument_list());
        higherOrderFunction.block = visitBlock(ctx.block());
        return higherOrderFunction;
    }
    @Override
    public ParameterList visitParameter_list(SqlParser.Parameter_listContext ctx)
    {
        ParameterList parameterList = new ParameterList();
        for (int i=0;i<ctx.any_name().size();i++)
        {
            parameterList.list.add(ctx.any_name(i).IDENTIFIER().getSymbol().getText());
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
    @Override
    public VariableDeclaration visitVariable_declaration(SqlParser.Variable_declarationContext ctx)
    {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        for(int i=0 ; i <ctx.variable_assignment().size(); i ++)
        {
           variableDeclaration.variableAssignments.add(visitVariable_assignment(ctx.variable_assignment(i)));
        }
        return variableDeclaration;
    }

    @Override
    public VariableAssignment visitVariable_assignment(SqlParser.Variable_assignmentContext ctx)
    {
        VariableAssignment variableAssignment = new VariableAssignment();
        variableAssignment.variable = visitVariable(ctx.variable());
        if(ctx.assginment().size()!=0)
        {
            for(int i=0;i<ctx.assginment().size();i++)
            {
                variableAssignment.assignments.add(visitAssginment(ctx.assginment(i)));
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
        if(ctx.array_identification()!= null)
            variableAssignmentValue.Value = visitArray_identification(ctx.array_identification());
        if(ctx.json_object()!=null)
            variableAssignmentValue.Value = visitJson_object(ctx.json_object());
        if(ctx.logical_condition() != null)
            variableAssignmentValue.Value = visitLogical_condition(ctx.logical_condition());
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
        if(temp instanceof Scope)
            javaBody.command = (Scope)temp;
        if(temp instanceof VariableAssignment)
            javaBody.command = (VariableAssignment)temp;
        if(temp instanceof VariableDeclaration)
            javaBody.command = (VariableDeclaration)temp;
        if(temp instanceof Break)
            javaBody.command = (Break)temp;
        if(temp instanceof Continue)
            javaBody.command = (Continue)temp;
        return javaBody;
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
        return visitVariable_assignment(ctx.variable_assignment());
    }

    @Override
    public Scope visitScopeBody(SqlParser.ScopeBodyContext ctx) {
        Scope scope = new Scope();
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
        for(int i=0;i<ctx.switch_case().size();i++)
        {
            switchStmt.cases.add(visitSwitch_case(ctx.switch_case(i)));
        }
        if(ctx.switch_default()!=null)
            switchStmt.def = visitSwitch_default(ctx.switch_default());
        return switchStmt;
    }

    @Override
    public SwitchCase visitSwitch_case(SqlParser.Switch_caseContext ctx) {
        SwitchCase switchCase = new SwitchCase();
        switchCase.value = visitValue(ctx.value());
        if(ctx.block()!=null)
            switchCase.block = visitBlock(ctx.block());
        else
            switchCase.block = visitOne_line_block(ctx.one_line_block());
        return switchCase;
    }

    @Override
    public SwitchDefault visitSwitch_default(SqlParser.Switch_defaultContext ctx) {
        SwitchDefault switchDefault = new SwitchDefault();
        if(ctx.block()!=null)
            switchDefault.block = visitBlock(ctx.block());
        else
            switchDefault.block = visitOne_line_block(ctx.one_line_block());
        return switchDefault;
    }

    @Override
    public LoopStmt visitLoopBody(SqlParser.LoopBodyContext ctx) {
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
    public ReturnValue visitReturn_value(SqlParser.Return_valueContext ctx)
    {
        ReturnValue returnValue = new ReturnValue();
        if(ctx.expression() != null)
            returnValue.value = visitExpression(ctx.expression());
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
        ////fix grammar
        for(int i=0 ; i < ctx.expression().size(); i ++)
            javaString.string+= ctx.expression().get(i).getText();
        for(int i=0 ; i < ctx.any_name().size(); i ++)
            javaString.string+=ctx.any_name().get(i).getText();
        for(int i=0 ; i < ctx.SPACES().size() ; i++)
            javaString.string+=ctx.SPACES().get(i).getSymbol().getText();
        return  javaString;
    }
    @Override
    public Print visitPrint(SqlParser.PrintContext ctx)
    {
        Print print = new Print();
        for(int i=0 ; i < ctx.expression().size(); i ++)
            print.expressions.add(visitExpression(ctx.expression().get(i)));
        return print;
    }
    @Override
    public JsonObject visitJson_object(SqlParser.Json_objectContext ctx)
    {
        JsonObject jsonObject = new JsonObject();
        for(int i=0 ; i < ctx.element().size(); i++)
        jsonObject.element.add(visitElement(ctx.element().get(i)));
        return jsonObject;
    }
    @Override
    public Element visitElement(SqlParser.ElementContext ctx)
    {
        Element element = new Element();
        element.objName = ctx.IDENTIFIER().getSymbol().getText();
        if(ctx.array_identification() != null)
            element.obj = visitArray_identification(ctx.array_identification());
        if(ctx.json_object() != null)
            element.obj = visitJson_object(ctx.json_object());
        if(ctx.value() != null)
            element.obj = visitValue(ctx.value());
        return element;
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
        IfStmt ifStmt = new IfStmt();
        ifStmt.condition = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.one_line_block() != null )
            ifStmt.body = visitOne_line_block(ctx.one_line_block());
        if(ctx.block() != null)
            ifStmt.body = visitBlock(ctx.block());
        return ifStmt;
    }
    @Override
    public ElseIfStmt visitElse_if_stmt(SqlParser.Else_if_stmtContext ctx)
    {
        ElseIfStmt elseIfStmt = new ElseIfStmt();
        elseIfStmt.condition = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.one_line_block() != null )
            elseIfStmt.body = visitOne_line_block(ctx.one_line_block());
        if(ctx.block() != null)
            elseIfStmt.body = visitBlock(ctx.block());
        return elseIfStmt;
    }

    @Override
    public ElseStmt visitElse_stmt(SqlParser.Else_stmtContext ctx)
    {
        ElseStmt elseStmt = new ElseStmt();
        if(ctx.one_line_block() != null )
            elseStmt.body = visitOne_line_block(ctx.one_line_block());
        if(ctx.block() != null)
            elseStmt.body = visitBlock(ctx.block());
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
        WhileLoop  whileLoop = new WhileLoop();
        whileLoop.booleanExpression = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.block()!=null)
            whileLoop.block = visitBlock(ctx.block());
        else
            whileLoop.block = visitOne_line_block(ctx.one_line_block());
        return whileLoop;
    }

    @Override
    public DoWhileLoop visitDo_while_loop(SqlParser.Do_while_loopContext ctx)
    {
        DoWhileLoop  doWhileLoop = new DoWhileLoop();
        doWhileLoop.booleanExpression = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.block()!=null)
            doWhileLoop.block = visitBlock(ctx.block());
        else
            doWhileLoop.block = visitOne_line_block(ctx.one_line_block());
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
        else
            variable.variable = visitArray_call(ctx.array_call());
        return variable;
    }

    @Override
    public ArrayCall visitArray_call(SqlParser.Array_callContext ctx) {
        ArrayCall arrayCall = new ArrayCall();
        arrayCall.arrayName = ctx.array_name().getText();
        if(ctx.math_expression()!=null)
            arrayCall.expression = visitMathExpression(ctx.math_expression());
        return arrayCall;
    }
    @Override
    public ArrayIdentification visitArray_identification(SqlParser.Array_identificationContext ctx)
    {
        ArrayIdentification arrayIdentification = new ArrayIdentification();
        if(ctx.expression().size()!=0)
        {
            for( int i=0 ; i < ctx.expression().size() ; i ++)
                arrayIdentification.arrayElementasExpr.add(visitExpression(ctx.expression().get(i)));
        }
        if(ctx.array_identification().size()!=0)
        {
            for (int i=0 ; i < ctx.array_identification().size(); i++)
                arrayIdentification.arrayElementasArray.add(visitArray_identification(ctx.array_identification().get(i)));
        }
        return arrayIdentification;
    }
    /*

    @Override
    public FunctionDeclaration visitJava_function_declaration(SqlParser.Java_function_declarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        functionDeclaration.functionName=ctx.method_ID().getText();
        functionDeclaration.pl=visitParameter_list(ctx.parameter_list());
        return functionDeclaration;
    }

    @Override
    public ParameterList visitParameter_list(SqlParser.Parameter_listContext ctx) {
        ParameterList pln =new ParameterList();
        for(int i=0;i<ctx.any_name().size();i++)
        {
            pln.list.add(ctx.any_name(i).getText());
        }
        return pln;
    }

    @Override
    public Block visitBlock(SqlParser.BlockContext ctx) {
        Block block=new Block();
        if(ctx.java_body().size()!=0)
            for (int i=0;i<ctx.java_body().size();i++)
            {
                block.javaBodies.add(visitJava_body(ctx.java_body(i)));
            }
        if(ctx.return_stmt()!=null)
            block.returnStmt=visitReturn_stmt(ctx.return_stmt());
        return block;
    }

    @Override
    public JavaBody visitJava_body(SqlParser.Java_bodyContext ctx) {
        Node temp = visit(ctx);
        if(temp instanceof ConditionalStmt)
            return (ConditionalStmt)temp;
        if(temp instanceof Comment)
            return (Comment)temp;
        if(temp instanceof FunctionCallBody)
            return (JavaBody) temp;
        if(temp instanceof LoopStmt)
            return (LoopStmt)temp;
        if(temp instanceof Increment)




            return (Increment)temp;
        if(temp instanceof VariableDeclaration)
            return (VariableDeclaration)temp;
        if(temp instanceof VariableAssignment)
            return (VariableAssignment)temp;
        if(temp instanceof Break)
            return (Break)temp;
        else
            return (Continue)temp;
    }

    @Override
    public ReturnStmt visitReturn_stmt(SqlParser.Return_stmtContext ctx) {
        ReturnStmt returnStmt = new ReturnStmt();
        if(ctx.expression()!=null)
            returnStmt.expression = visitExpression(ctx.expression());
        return returnStmt;
    }

    @Override
    public Expression visitExpression(SqlParser.ExpressionContext ctx) {
        if(ctx.boolean_expr()!=null)
            return visitBooleanExpression(ctx.boolean_expr());
        else
            return visitNonBooleanExpression(ctx.non_boolean_expression());
    }

    //Non Boolean Expression
    public MathExpression visitNonBooleanExpression(SqlParser.Non_boolean_expressionContext ctx)
    {
        return (MathExpression)visit(ctx);
    }

    @Override
    public Value visitNbeVal(SqlParser.NbeValContext ctx)
    {
        return visitValue(ctx.value());
    }

    @Override
    public ArithmeticOperation visitNbeDoubleNonBool(SqlParser.NbeDoubleNonBoolContext ctx) {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        arithmeticOperation.left = visitNonBooleanExpression(ctx.non_boolean_expression(0));
        arithmeticOperation.right = visitNonBooleanExpression(ctx.non_boolean_expression(1));
        arithmeticOperation.op = ctx.op.getText();
        return arithmeticOperation;
    }

    @Override
    public ParanthesesMath visitNbeParenth(SqlParser.NbeParenthContext ctx)
    {
        ParanthesesMath paranthesesNonBoolean= new ParanthesesMath();
        paranthesesNonBoolean.mathExpression = visitNonBooleanExpression(ctx.non_boolean_expression());
        return paranthesesNonBoolean;
    }

    //Boolean Expression
    public BooleanExpression visitBooleanExpression(SqlParser.Boolean_exprContext ctx)
    {
        return (BooleanExpression) visit(ctx);
    }

    @Override
    public BooleanValue visitVal(SqlParser.ValContext ctx)
    {
        Node temp = visit(ctx);
        if(temp instanceof VariableCall)
        {
            BooleanVariableCall booleanVariableCall= new BooleanVariableCall();
            booleanVariableCall.variableName=((VariableCall)temp).variableName;
            return booleanVariableCall;
        }
        if(temp instanceof ArrayCall)
        {
            BooleanArrayCall booleanArrayCall = new BooleanArrayCall();
            booleanArrayCall.arrayName=((ArrayCall)temp).arrayName;
            booleanArrayCall.expression=((ArrayCall)temp).expression;
            return booleanArrayCall;
        }
        if(temp instanceof FunctionCall)
        {
            BooleanFunctionCall booleanFunctionCall=new BooleanFunctionCall();
            booleanFunctionCall.functionName=((FunctionCall)temp).functionName;
            booleanFunctionCall.argumentList=((FunctionCall)temp).argumentList;
            return booleanFunctionCall;
        }
        return null;
    }

    @Override
    public ParenthesesBoolean visitParenth(SqlParser.ParenthContext ctx) {
        ParenthesesBoolean parenthesesBoolean = new ParenthesesBoolean();
        parenthesesBoolean.booleanExpression=visitBooleanExpression(ctx.boolean_expr());
        return parenthesesBoolean;
    }

    @Override
    public MultipleBooleanExpression visitDoubleBool(SqlParser.DoubleBoolContext ctx) {
        MultipleBooleanExpression multipleExpressions=new MultipleBooleanExpression();
        multipleExpressions.left=visitBooleanExpression(ctx.boolean_expr(0));
        multipleExpressions.right=visitBooleanExpression(ctx.boolean_expr(1));
        multipleExpressions.op=ctx.op.getText();
        return multipleExpressions;
    }

    @Override
    public Compare visitDoubleNonBool(SqlParser.DoubleNonBoolContext ctx) {
        Compare compare= new Compare();
        return compare;
    }


    //Value
    public Value visitValue(SqlParser.ValueContext ctx)
    {
        Node temp = visit(ctx);
        if(temp instanceof Variable)
            return (Variable)temp;
        if(temp instanceof FunctionCall)
            return (FunctionCall)temp;
        else
            return (LiteralValue)temp;
    }

    @Override
    public Variable visitVar(SqlParser.VarContext ctx)
    {
        return visitVariable(ctx.variable());
    }

    @Override
    public FunctionCall visitJavaFunc(SqlParser.JavaFuncContext ctx) {
        return visitJava_function_call_as_value(ctx.java_function_call_as_non_bool_value());
    }

    @Override
    public LiteralValue visitLiteral_value(SqlParser.Literal_valueContext ctx)
    {
        LiteralValue literalValue=new LiteralValue();
        literalValue.literalValue=ctx.getText();
        return literalValue;
    }

    @Override
    public FunctionCall visitJava_function_call_as_value(SqlParser.Java_function_call_as_non_bool_valueContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        functionCall.functionName=ctx.method_ID().getText();
        functionCall.argumentList=visitArgument_list(ctx.argument_list());
        return functionCall;
    }

    //Variable
    @Override
    public Variable visitVariable(SqlParser.VariableContext ctx) {
        if(ctx.any_name()!=null)
        {
            VariableCall variableCall = new VariableCall();
            variableCall.variableName=ctx.getText();
            return variableCall;
        }
        return visitArray_call(ctx.array_call());
    }
    @Override
    public ArrayCall visitArray_call(SqlParser.Array_callContext ctx) {
        ArrayCall arrayCall =new ArrayCall();
        arrayCall.arrayName=ctx.array_name().getText();
        //arrayCall.expression=visitExpression(ctx.expression());
        return arrayCall;
    }
*/
}


