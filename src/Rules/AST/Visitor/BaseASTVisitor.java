package Rules.AST.Visitor;

import Rules.AST.Java.*;
import Rules.AST.Java.JavaBody.*;
import Rules.AST.Java.Logic.*;
import Rules.AST.Java.Logic.Conditional.*;
import Rules.AST.Java.Logic.Loop.*;
import Rules.AST.Java.Logic.Switch.*;
import Rules.AST.Java.Utils.*;


import Rules.AST.Node;
import Rules.AST.Parse;
import Rules.AST.QueryStmt.SelectStmt;
import Rules.AST.QueryStmt.Statement;

public class BaseASTVisitor implements ASTVisitor {

    @Override
    public void visit(Continue c) {
        System.out.println("ast Continue");
    }

    @Override
    public void visit(Break b) {
        System.out.println("ast Break" );
    }


    @Override
    public void visit(Scope scope) {
        System.out.println("ast Scope");
        if(scope.body!=null)
        {
            visit((JavaBody)scope.body);
        }
    }

    @Override
    public void visit(PostIncrement postIncrement) {
        System.out.println("as PostIncrement");
        visit((Variable) postIncrement.variable);
        System.out.println(postIncrement.op);
    }

    @Override
    public void visit(PostDecrement postDecrement) {
        System.out.println("ast PostDecrement");
        visit((Variable)postDecrement.variable);
        System.out.println(postDecrement.op);
    }

    @Override
    public void visit(PreIncrement preIncrement) {
        System.out.println("ast PreIncrement");
        System.out.println(preIncrement.op);
        visit((Variable)preIncrement.variable);
    }

    @Override
    public void visit(PreDecrement preDecrement) {
        System.out.println("ast PreDecrement");
        System.out.println(preDecrement.op);
        visit((Variable)preDecrement.variable);
    }

    @Override
    public void visit(LogicalConditionNormal logicalConditionNormal) {
        System.out.println("ast LogicalConditionNormal");
        visit((BooleanExpression)logicalConditionNormal.condition);
        if(logicalConditionNormal.ifTrue instanceof Expression)
            visit((Expression)logicalConditionNormal.ifTrue);
        if(logicalConditionNormal.ifTrue instanceof LogicalCondition)
            visit((LogicalCondition)logicalConditionNormal.ifTrue);
        if(logicalConditionNormal.ifFalse instanceof Expression)
            visit((Expression)logicalConditionNormal.ifFalse);
        if(logicalConditionNormal.ifFalse instanceof LogicalCondition)
            visit((LogicalCondition)logicalConditionNormal.ifFalse);
    }

    @Override
    public void visit(LogicalConditionInParenth logicalConditionInParenth) {
        System.out.println("ast LogicalConditionInParenth");
        visit((LogicalCondition)logicalConditionInParenth.logicalCondition);
    }

    @Override
    public void visit(VariableAssignmentValue variableAssignmentValue) {
        System.out.println("ast VariableAssignmentValue");
        if(variableAssignmentValue.Value instanceof Expression)
            visit((Expression)variableAssignmentValue.Value);
        if(variableAssignmentValue.Value instanceof ArrayIdentification)
            visit((ArrayIdentification)variableAssignmentValue.Value);
        if(variableAssignmentValue.Value instanceof JsonObject)
            visit((JsonObject) variableAssignmentValue.Value);
        if(variableAssignmentValue.Value instanceof LogicalCondition)
            visit((LogicalCondition)variableAssignmentValue.Value);
    }

    @Override
    public void visit(Assignment assignment) {
        System.out.println("ast Assignment");
        visit((AssignmentOperator)assignment.assignmentOperator);
        visit((VariableAssignmentValue)assignment.variableAssignmentValue);
    }

    @Override
    public void visit(True t) {
        System.out.println("ast True");
    }

    @Override
    public void visit(MathExpression mathExpression) {
        System.out.println("ast MathExpression");
        if(mathExpression.expression instanceof Value)
            visit((Value)mathExpression.expression);
        if(mathExpression.expression instanceof ArithmeticOperation)
            visit((ArithmeticOperation)mathExpression.expression);
        if(mathExpression.expression instanceof MathInParenth)
            visit((MathInParenth)mathExpression.expression);
    }

    @Override
    public void visit(False f) {
        System.out.println("ast False");
    }

    @Override
    public void visit(Compare compare) {
       System.out.println("ast Compare");
       visit((MathExpression)compare.left);
       System.out.println(compare.op);
       visit((MathExpression)compare.right);
    }

    @Override
    public void visit(MathInParenth mathInParenth) {
        System.out.println("ast MathInParenth");
        visit((MathExpression)mathInParenth.expression);
    }

    @Override
    public void visit(ValueInParenth valueInParenth) {
        System.out.println("ast ValueInParenth");
        visit((Value)valueInParenth.value);
    }

    @Override
    public void visit(BooleanInParenth booleanInParenth) {
        System.out.println("ast BooleanInParenth");
        visit((BooleanExpression)booleanInParenth.value);
    }

    @Override
    public void visit(SimpleLiteralValue simpleLiteralValue) {
        System.out.println("ast SimpleLiteralValue");
        System.out.println(simpleLiteralValue.value);
    }

    @Override
    public void visit(ArithmeticOperation arithmeticOperation) {
        System.out.println("ast ArithmeticOperation");
        visit((MathExpression)arithmeticOperation.left);
        System.out.println(arithmeticOperation.op);
        visit((MathExpression)arithmeticOperation.right);
    }

    @Override
    public void visit(MultipleBooleanExpression multipleBooleanExpression) {
        System.out.println("ast MultipleBooleanExpression");
        visit((BooleanExpression)multipleBooleanExpression.left);
        System.out.println(multipleBooleanExpression.op);
        visit((BooleanExpression)multipleBooleanExpression.right);
    }

    @Override
    public void visit(SimpleVariable simpleVariable) {
        System.out.println("ast SimpleVariable");
        System.out.println(simpleVariable.VariableName);
    }

    @Override
    public void visit(Value value) {
        System.out.println("ast Value");
        if(value.value instanceof Variable)
            visit((Variable)value.value);
        if(value.value instanceof FunctionCall)
            visit((FunctionCall)value.value);
        if(value.value instanceof SimpleLiteralValue)
            visit((SimpleLiteralValue)value.value);
        if(value.value instanceof ValueInParenth)
            visit((ValueInParenth)value.value);
    }

    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
    }

    @Override
    public void visit(Node n) {
        if (n instanceof JavaStatment)
            visit((JavaStatment) n);
        //tbc
    }

    @Override
    public void visit(JavaStatment javaStmt)
    {
        System.out.println("ast JavaStatment ");
        if(javaStmt.javaStatment instanceof FunctionCall)
            visit((FunctionCall)javaStmt.javaStatment);
        if(javaStmt.javaStatment instanceof  FunctionDeclaration)
            visit((FunctionDeclaration) javaStmt.javaStatment);
        if(javaStmt.javaStatment instanceof HigherOrderFunctionCall)
            visit((HigherOrderFunctionCall) javaStmt.javaStatment);
        if(javaStmt.javaStatment instanceof VariableDeclaration)
            visit((VariableDeclaration) javaStmt.javaStatment);
    }

    @Override
    public void visit(ArgumentList argumentList) {
        System.out.println("ast ArgumentList ");
        for (int i=0;i<argumentList.argumentList.size();i++)
            visit((Expression)argumentList.argumentList.get(i));
    }

    @Override
    public void visit(Comment comment) {
        System.out.println("ast Comment ");
    }

    @Override
    public void visit(DefaultParameter defaultParameter)
    {
        System.out.println("ast DefaultParameter ");
        visit((Variable)defaultParameter.variable);
        visit((Expression)defaultParameter.expression);
    }

    @Override
    public void visit(FunctionCall funcCall)
    {
        System.out.println("ast FunctionCall ");
        System.out.println(funcCall.functionName);
        if(funcCall.argumentList!=null)
            visit((ArgumentList)funcCall.argumentList);
    }

    @Override
    public void visit(FunctionDeclaration funcDec) {
        System.out.println("ast FunctionDeclaration ");
        System.out.println(funcDec.functionName);
        if(funcDec.pl!=null)
            visit((ParameterList) funcDec.pl);
        visit((Block)funcDec.block);
    }

    @Override
    public void visit(HigherOrderFunction HOfunc)
    {
        System.out.println("ast HigherOrderFunction ");
        if(HOfunc.argumentList!=null)
            visit((ArgumentList) HOfunc.argumentList);
        visit((Block) HOfunc.block);
    }

    @Override
    public void visit(HigherOrderFunctionCall HOfuncCall)
    {
        System.out.println("ast HigherOrderFunctionCall");
        System.out.println(HOfuncCall.funcName);
        visit((HigherOrderFunction) HOfuncCall.higherOrderFunction);
        if(HOfuncCall.argumentLists.size()!=0)
        {
            for(int i=0;i<HOfuncCall.argumentLists.size();i++)
                visit((ArgumentList)HOfuncCall.argumentLists.get(i));
        }
    }

    @Override
    public void visit(ParameterList ParamList) {

        System.out.println("ast ParameterList ");
        for(int i=0 ; i < ParamList.list.size(); i ++)
        {
            System.out.println(ParamList.list.get(i));
        }
    }

    @Override
    public void visit(Block block)
    {
        System.out.println("ast Block ");
        if(block.javaBodies.size()!=0)
        {
            for(int i=0;i<block.javaBodies.size();i++)
                visit((JavaBody)block.javaBodies.get(i));
        }
        if(block.returnStmt!=null)
            visit((ReturnStmt)block.returnStmt);
    }

    @Override
    public void visit(JavaBody javaBody)
    {
        System.out.println("ast JavaBody");
        if(javaBody.command instanceof ConditionalStmt)
            visit((ConditionalStmt)javaBody.command);
        if(javaBody.command instanceof Increment)
            visit((Increment)javaBody.command);
        if(javaBody.command instanceof FunctionCall)
            visit((FunctionCall)javaBody.command);
        if(javaBody.command instanceof LoopStmt)
            visit((LoopStmt)javaBody.command);
        if(javaBody.command instanceof SwitchStmt)
            visit((SwitchStmt)javaBody.command);
        if(javaBody.command instanceof Scope) {
            System.out.println("jasa");
            visit((Scope) javaBody.command);
        }
        if(javaBody.command instanceof VariableAssignment)
            visit((VariableAssignment)javaBody.command);
        if(javaBody.command instanceof VariableDeclaration)
            visit((VariableDeclaration)javaBody.command);
        if(javaBody.command instanceof Break)
            visit((Break)javaBody.command);
        if(javaBody.command instanceof Continue)
            visit((Continue)javaBody.command);
    }

    @Override
    public void visit(OneLineBlock oneLineBlock) {
        System.out.println("ast OneLineBlock ");
        if(oneLineBlock.line instanceof JavaBody)
            visit((JavaBody)oneLineBlock.line);
        if(oneLineBlock.line instanceof ReturnStmt)
            visit((ReturnStmt)oneLineBlock.line);
    }

    @Override
    public void visit(ReturnStmt returnStmt)
    {
        System.out.println("ast ReturnStmt");
        if(((ReturnValue)returnStmt.returnValue).value instanceof Expression)
            visit((Expression)((ReturnValue)returnStmt.returnValue).value);
        if(((ReturnValue)returnStmt.returnValue).value instanceof LogicalCondition)
            visit((LogicalCondition)((ReturnValue)returnStmt.returnValue).value);
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        System.out.println("ast ArrayCall ");
        System.out.println(arrayCall.arrayName);
        if(arrayCall.expression!=null)
            visit((MathExpression) arrayCall.expression);
    }

    @Override
    public void visit(ArrayIdentification arrayIdentification) {
        System.out.println("ast ArrayIdentification ");
        if(arrayIdentification.arrayElementasExpr.size()!=0)
        {
            for(int i=0;i<arrayIdentification.arrayElementasExpr.size();i++)
            {
                visit((Expression)arrayIdentification.arrayElementasExpr.get(i));
            }
        }
        if(arrayIdentification.arrayElementasArray.size()!=0)
        {
            for(int i=0;i<arrayIdentification.arrayElementasArray.size();i++)
            {
                visit((ArrayIdentification)arrayIdentification.arrayElementasArray.get(i));
            }
        }
    }

    @Override
    public void visit(JsonObject jsonObject) {
        System.out.println("ast JsonObject ");
        for(int i=0;i<jsonObject.element.size();i++)
        {
            visit((Element)jsonObject.element.get(i));
        }
    }

    @Override
    public void visit(Print print) {
        System.out.println("ast Print ");
    }

    @Override
    public void visit(VariableAssignment variableAssignment)
    {
        System.out.println("ast VariableAssignment ");
        visit((Variable)variableAssignment.variable);
        if(variableAssignment.assignments.size()!=0)
            for(int i=0;i<variableAssignment.assignments.size();i++)
            {
                visit((Assignment)variableAssignment.assignments.get(i));
            }
    }

    @Override
    public void visit(VariableDeclaration variableDeclaration)
    {
        System.out.println("ast VariableDeclaration ");
        for(int i=0;i<variableDeclaration.variableAssignments.size();i++)
        {
            visit((VariableAssignment)variableDeclaration.variableAssignments.get(i));
        }
    }

    @Override
    public void visit(ConditionalStmt conditionalStmt) {
        System.out.println("ast ConditionalStmt ");
        for(int i=0;i<conditionalStmt.ifs.size();i++)
            visit((IfStmt)conditionalStmt.ifs.get(i));
        if(conditionalStmt.elseifs.size()!=0)
        {
            for(int i=0;i<conditionalStmt.elseifs.size();i++)
                visit((ElseIfStmt)conditionalStmt.elseifs.get(i));
        }
        if(conditionalStmt.elseStmt!=null)
            visit((ElseStmt)conditionalStmt.elseStmt);
    }

    @Override
    public void visit(ElseIfStmt elseIfStmt) {
        System.out.println("ast ElseIfStmt ");
        visit((BooleanExpression)elseIfStmt.condition);
        if(elseIfStmt.body instanceof Block)
            visit((Block)elseIfStmt.body);
        if(elseIfStmt.body instanceof OneLineBlock)
            visit((OneLineBlock)elseIfStmt.body);
    }

    @Override
    public void visit(ElseStmt elseStmt) {
        System.out.println("ast ElseStmt ");
        if(elseStmt.body instanceof Block)
            visit((Block)elseStmt.body);
        if(elseStmt.body instanceof OneLineBlock)
            visit((OneLineBlock)elseStmt.body);
    }

    @Override
    public void visit(IfStmt ifStmt) {
        System.out.println("ast IfStmt ");
        visit((BooleanExpression)ifStmt.condition);
        if(ifStmt.body instanceof Block)
            visit((Block)ifStmt.body);
        if(ifStmt.body instanceof OneLineBlock)
            visit((OneLineBlock)ifStmt.body);
    }

    @Override
    public void visit(DoWhileLoop doWhileLoop) {
        System.out.println("ast DoWhileLoop ");
        if(doWhileLoop.block instanceof OneLineBlock)
            visit((OneLineBlock)doWhileLoop.block);
        if(doWhileLoop.block instanceof Block)
            visit((Block)doWhileLoop.block);
        visit((BooleanExpression)doWhileLoop.booleanExpression);
    }

    @Override
    public void visit(ForEachLoop forEachLoop) {
        System.out.println("ast ForEachLoop ");
        visit((Variable)forEachLoop.variable);
        System.out.println(forEachLoop.arrayName);
        if(forEachLoop.block instanceof OneLineBlock)
            visit((OneLineBlock)forEachLoop.block);
        if(forEachLoop.block instanceof Block)
            visit((Block)forEachLoop.block);
    }

    @Override
    public void visit(ForLoop forLoop) {
        System.out.println("ast ForLoop");
        visit((VariableDeclaration)forLoop.variableDeclaration);
        visit((BooleanExpression)forLoop.booleanExpression);
        if(forLoop.mathExpresion instanceof Increment)
            visit((Increment)forLoop.mathExpresion);
        if(forLoop.mathExpresion instanceof VariableAssignment)
            visit((VariableAssignment)forLoop.mathExpresion);
        if(forLoop.block instanceof OneLineBlock)
            visit((OneLineBlock) forLoop.block);
        if(forLoop.block instanceof Block)
            visit((Block)forLoop.block);
    }

    @Override
    public void visit(LoopStmt loopStmt) {
        System.out.println("ast LoopStmt");
        if(loopStmt.loop instanceof ForLoop)
            visit((ForLoop)loopStmt.loop);
        if(loopStmt.loop instanceof WhileLoop)
            visit((WhileLoop)loopStmt.loop);
        if(loopStmt.loop instanceof ForEachLoop)
            visit((ForEachLoop)loopStmt.loop);
        if(loopStmt.loop instanceof DoWhileLoop)
            visit((DoWhileLoop)loopStmt.loop);
    }

    @Override
    public void visit(WhileLoop whileLoop) {
        System.out.println("ast WhileLoop ");
        visit((BooleanExpression)whileLoop.booleanExpression);
        if(whileLoop.block instanceof OneLineBlock)
            visit((OneLineBlock)whileLoop.block);
        if(whileLoop.block instanceof Block)
            visit((Block)whileLoop.block);
    }

    @Override
    public void visit(SwitchCase switchCase) {
        System.out.println("ast SwitchCase ");
        visit((Value)switchCase.value);
        if(switchCase.block instanceof Block)
            visit((Block)switchCase.block);
        if(switchCase.block instanceof OneLineBlock)
            visit((OneLineBlock)switchCase.block);
    }

    @Override
    public void visit(SwitchDefault switchDefault) {
        System.out.println("ast SwitchDefault ");
        if (switchDefault.block instanceof Block)
            visit((Block)switchDefault.block);
        if(switchDefault.block instanceof OneLineBlock)
            visit((OneLineBlock)switchDefault.block);
    }

    @Override
    public void visit(SwitchStmt switchStmt) {
        System.out.println("ast SwitchStmt ");
        visit((Variable)switchStmt.var);
        for(int i=0;i<switchStmt.cases.size();i++)
        {
            visit((SwitchCase)switchStmt.cases.get(i));
        }
        if(switchStmt.def!=null)
            visit((SwitchDefault)switchStmt.def);
    }

    @Override
    public void visit(AssignmentOperator assignmentOperator) {
        System.out.println("ast AssignmentOperator ");
        System.out.println(assignmentOperator.op);
    }

    @Override
    public void visit(BooleanExpression booleanExpression) {
        System.out.println("ast BooleanExpression ");
        if(booleanExpression.booleanExpression instanceof Value)
            visit((Value)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof Compare)
            visit((Compare)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof MultipleBooleanExpression)
            visit((MultipleBooleanExpression)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof BooleanInParenth)
            visit((BooleanInParenth)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof True)
            visit((True)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof False)
            visit((False)booleanExpression.booleanExpression);
    }

    @Override
    public void visit(Element element) {
        System.out.println("ast Element ");
        System.out.println(element.objName);
        if(element.obj instanceof Value)
            visit((Value)element.obj);
        if(element.obj instanceof ArrayIdentification)
            visit((ArrayIdentification)element.obj);
        if(element.obj instanceof JsonObject)
            visit((JsonObject)element.obj);
    }

    @Override
    public void visit(Expression expression) {
        System.out.println("ast Expression ");
        if(expression.expression instanceof Value)
            visit((Value)expression.expression);
        else if(expression.expression instanceof BooleanExpression)
            visit((BooleanExpression) expression.expression);
        else if(expression.expression instanceof MathExpression)
            visit((MathExpression)expression.expression);
        else if(expression.expression instanceof Increment)
            visit((Increment)expression.expression);
    }

    @Override
    public void visit(Increment increment) {
        System.out.println("ast Increment ");
        if(increment.increment instanceof PreIncrement)
            visit((PreIncrement) increment.increment);
        if(increment.increment instanceof PreDecrement)
            visit((PreDecrement)increment.increment);
        if(increment.increment instanceof PostIncrement)
            visit((PostIncrement)increment.increment);
        if(increment.increment instanceof PostDecrement)
            visit((PostDecrement)increment.increment);
    }

    @Override
    public void visit(JavaObj javaObj) {
        System.out.println("ast JavaObj ");
    }

    @Override
    public void visit(LiteralValue literalValue) {
        System.out.println("ast LiteralValue ");
    }

    @Override
    public void visit(LogicalCondition logicalCondition) {
        System.out.println("ast LogicalCondition ");
        if(logicalCondition.logicalCondition instanceof LogicalConditionNormal)
            visit((LogicalConditionNormal)logicalCondition.logicalCondition);
        if(logicalCondition.logicalCondition instanceof LogicalConditionInParenth)
            visit((LogicalConditionInParenth)logicalCondition.logicalCondition);
    }

//    @Override
//    public void visit(MathExpression mathExpression) {
//        System.out.println("ast MathExpression ");
//    }

    @Override
    public void visit(Variable variable)
    {
        System.out.println("ast Variable ");
        if (variable.variable instanceof SimpleVariable)
            visit((SimpleVariable)variable.variable);
        if(variable.variable instanceof ArrayCall)
            visit((ArrayCall)variable.variable);
    }

    @Override
    public void visit(Statement stmt) {
        System.out.println("ast Statement ");

    }

    @Override
    public void visit(SelectStmt selectStmt) {
        System.out.println("ast selectStmt ");

    }
}
