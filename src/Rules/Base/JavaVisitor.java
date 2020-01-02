package Rules.Base;
import Rules.AST.Java.*;
import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Java.JavaBody.ReturnStmt;
import Rules.AST.Java.Logic.Conditional.ConditionalStmt;
import Rules.AST.Java.Logic.Loop.LoopStmt;
import Rules.AST.Java.Logic.VariableAssignment;
import Rules.AST.Java.Logic.VariableDeclaration;
import Rules.AST.Java.Utils.*;
import Rules.AST.Node;
import Rules.generated.SqlBaseVisitor;
import Rules.generated.SqlParser;

public class JavaVisitor extends SqlBaseVisitor<Node> {

    @Override
    public JavaStatment visitJava_stmt(SqlParser.Java_stmtContext ctx) {
        JavaStatment javaStatment=new JavaStatment();
        if(ctx.java_function_call()!=null)
            javaStatment.javaStatment=visitJava_function_call(ctx.java_function_call());
        return javaStatment;
    }

    @Override
    public FunctionCall visitJava_function_call(SqlParser.Java_function_callContext ctx) {
        return new FunctionCall();
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
    public NonBooleanExpression visitNonBooleanExpression(SqlParser.Non_boolean_expressionContext ctx)
    {
        return (NonBooleanExpression)visit(ctx);
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
    public ParanthesesNonBoolean visitNbeParenth(SqlParser.NbeParenthContext ctx)
    {
        ParanthesesNonBoolean paranthesesNonBoolean= new ParanthesesNonBoolean();
        paranthesesNonBoolean.nonBooleanExpression = visitNonBooleanExpression(ctx.non_boolean_expression());
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
    public MultipleExpressions visitDoubleBool(SqlParser.DoubleBoolContext ctx) {
        MultipleExpressions multipleExpressions=new MultipleExpressions();
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


