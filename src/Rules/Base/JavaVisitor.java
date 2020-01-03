package Rules.Base;
import Rules.AST.Java.*;
import Rules.AST.Java.JavaBody.*;
import Rules.AST.Java.Logic.*;
import Rules.AST.Java.Logic.Conditional.ConditionalStmt;
import Rules.AST.Java.Logic.Conditional.ElseIfStmt;
import Rules.AST.Java.Logic.Conditional.ElseStmt;
import Rules.AST.Java.Logic.Conditional.IfStmt;
import Rules.AST.Java.Logic.Loop.*;
import Rules.AST.Java.Utils.*;
import Rules.AST.Node;
import Rules.generated.SqlBaseVisitor;
import Rules.generated.SqlParser;

import java.awt.image.LookupOp;
import java.rmi.server.LoaderHandler;
import java.util.ArrayList;
import java.util.jar.JarFile;

public class JavaVisitor extends SqlBaseVisitor<Node> {

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
        //functionCall.functionName = ctx.method_ID().getText();
      //  functionCall.argumentList = visitArgument_list(ctx.argument_list());
        return functionDeclaration;
    }
    @Override
    public HigherOrderFunctionCall visitHigher_order_java_function_call(SqlParser.Higher_order_java_function_callContext ctx)
    {
        HigherOrderFunctionCall higherOrderFunctionCall = new HigherOrderFunctionCall();
        for(int i=0 ; i < ctx.argument_list().size() ; i ++)
        {
            higherOrderFunctionCall.argumentLists.add(visitArgument_list(ctx.argument_list().get(i)));
        }
        higherOrderFunctionCall.higherOrderFunction = visitHo_java_function(ctx.ho_java_function());
        return higherOrderFunctionCall;
    }
    @Override
    public HigherOrderFunction visitHo_java_function(SqlParser.Ho_java_functionContext ctx)
    {
        HigherOrderFunction higherOrderFunction = new HigherOrderFunction();
        higherOrderFunction.argumentList = visitArgument_list(ctx.argument_list());
        for(int i=0 ; i < ctx.block().size(); i ++)
        {
            higherOrderFunction.blocks.add(visitBlock(ctx.block().get(i)));
        }
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
        for (int i=0;i<ctx.expression().size();i++)
        {
            argumentList.argumentList.add(visitExpression(ctx.expression().get(i)));
        }
        return argumentList;
    }

    @Override
    public DefaultParameter visitDefault_parameter(SqlParser.Default_parameterContext ctx)
    {
        DefaultParameter defaultParameter = new DefaultParameter();
        defaultParameter.variable = ctx.variable().any_name().IDENTIFIER().getSymbol().getText();
        defaultParameter.expression = visitExpression(ctx.expression());
        return defaultParameter;
    }
    @Override
    public VariableDeclaration visitVariable_declaration(SqlParser.Variable_declarationContext ctx)
    {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        for(int i=0 ; i <ctx.variable_assignment().size(); i ++)
        {
           // variableDeclaration.variableAssignments.add();
        }
        return variableDeclaration;
    }
    @Override
    public VariableAssignment visitVariable_assignment(SqlParser.Variable_assignmentContext ctx)
    {
        VariableAssignment variableAssignment = new VariableAssignment();
        variableAssignment.operator = ctx.variable().getText();
       // variableAssignment.variableAssignmentValue =
        return variableAssignment;
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
        for(int i=0; i < ctx.java_body().size() ; i++)
            block.javaBodies.add(visitJava_body(ctx.java_body().get(i)));
        if(ctx.return_stmt() != null)
            block.returnStmt = visitReturn_stmt(ctx.return_stmt());
        return block;
    }
    @Override
    public OneLineBlock visitOne_line_block(SqlParser.One_line_blockContext ctx)
    {
        //fix grammar
        OneLineBlock oneLineBlock = new OneLineBlock();
        oneLineBlock.javaBodies = visitJava_body(ctx.java_body());
        oneLineBlock.returnStmt = visitReturn_stmt(ctx.return_stmt());
        return oneLineBlock;
    }
    @Override
    public JavaBody visitJava_body(SqlParser.Java_bodyContext ctx)
    {
        JavaBody javaBody = new JavaBody();
        if(ctx.conditional_stmt()!= null)
            javaBody.command = visitConditional_stmt(ctx.conditional_stmt());
        if(ctx.increment() != null)
            javaBody.command = visitIncrement(ctx.increment());
        if(ctx.java_function_call() != null)
            javaBody.command = visitJava_function_call(ctx.java_function_call());
        if(ctx.increment() != null)
            javaBody.command = visitIncrement(ctx.increment());
        if(ctx.loop_stmt() != null)
            javaBody.command = visitLoop_stmt(ctx.loop_stmt());
        if(ctx.print() != null)
            javaBody.command = visitPrint(ctx.print());
        if(ctx.switch_stmt() != null)
            javaBody.command = visitSwitch_stmt(ctx.switch_stmt());
        for(int i=0 ; i < ctx.java_body().size() ; i ++)
            javaBody.bodyInScopes.add(visitJava_body(ctx.java_body().get(i)));
        if(ctx.variable_assignment() != null)
            javaBody.command = visitVariable_assignment(ctx.variable_assignment());
        if(ctx.variable_declaration() != null)
            javaBody.command = visitVariable_declaration(ctx.variable_declaration());
        if(ctx.K_BREAK() != null)
            javaBody.suddenCommand = ctx.K_BREAK().getSymbol().getText();
        if(ctx.K_CONTINUE() != null)
            javaBody.suddenCommand = ctx.K_CONTINUE().getSymbol().getText();
        return javaBody;
    }
    @Override
    public Increment visitIncrement (SqlParser.IncrementContext ctx)
    {
        Increment increment = new Increment();

        return increment;
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
            javaString.string+= visitExpression(ctx.expression().get(i));
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
        for(int i=0 ; i < ctx.string().size(); i ++)
            print.strings.add(visitString(ctx.string().get(i)));
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
        for( int i=0 ; i < ctx.else_if_stmt().size(); i++)
            conditionalStmt.elseifs.add(visitElse_if_stmt(ctx.else_if_stmt().get(i)));
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

        return forLoop;
    }
    @Override
    public ForEachLoop visitFor_each_loop(SqlParser.For_each_loopContext ctx)
    {
        ForEachLoop  forEachLoop = new ForEachLoop();

        return forEachLoop;
    }
    @Override
    public WhileLoop visitWhile_loop(SqlParser.While_loopContext ctx)
    {
        WhileLoop  whileLoop = new WhileLoop();

        return whileLoop;
    }
    @Override
    public DoWhileLoop visitDo_while_loop(SqlParser.Do_while_loopContext ctx)
    {
        DoWhileLoop  doWhileLoop = new DoWhileLoop();

        return doWhileLoop;
    }
    @Override
    public LogicalCondition visitLogical_condition (SqlParser.Logical_conditionContext ctx)
    {
        LogicalCondition logicalCondition = new LogicalCondition();
        logicalCondition.condition = visitBooleanExpression(ctx.boolean_expression());
        ///Might need to fix grammar;
        if(ctx.logical_condition()!= null)
            logicalCondition.ifTrue = visitLogical_condition(ctx.logical_condition().get(0));
        else if(ctx.expression()!= null)
            logicalCondition.ifTrue = visitExpression(ctx.expression().get(0));
        if(ctx.logical_condition()!= null)
            logicalCondition.ifFalse = visitLogical_condition(ctx.logical_condition().get(1));
        else if(ctx.expression()!= null)
            logicalCondition.ifFalse = visitExpression(ctx.expression().get(1));
        return logicalCondition;
    }
    public Expression visitExpression(SqlParser.ExpressionContext ctx) {
        Expression expression = new Expression();
        if(ctx.value()!=null)
            expression.expression = visitValue(ctx.value());
        if(ctx.boolean_expression()!=null)
            expression.expression = visitBooleanExpression(ctx.boolean_expression());
        if(ctx.math_expression()!=null)
            expression.expression = visitMathExpression(ctx.math_expression());
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
            s.VariableName=ctx.any_name().getText();
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
        arrayCall.expression = visitMathExpression(ctx.math_expression());
        return arrayCall;
    }
    @Override
    public ArrayIdentification visitArray_identification(SqlParser.Array_identificationContext ctx)
    {
        ArrayIdentification arrayIdentification = new ArrayIdentification();
        for( int i=0 ; i < ctx.expression().size() ; i ++)
            arrayIdentification.arrayElementasExpr.add(visitExpression(ctx.expression().get(i)));
        for (int i=0 ; i < ctx.array_identification().size(); i++)
            arrayIdentification.arrayElementasArray.add(visitArray_identification(ctx.array_identification().get(i)));
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


