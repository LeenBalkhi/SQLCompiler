package Rules.AST.Visitor;

import Rules.AST.Java.ArgumentList;
import Rules.AST.Java.FunctionDeclaration;
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
import Rules.AST.Parse;
import Rules.AST.QueryStmt.SelectStmt;
import Rules.AST.QueryStmt.Statement;

public interface ASTVisitor {
    //Java
    public void visit(Continue c);
    public void visit(Break b);
    public void visit(Scope scope);
    public void visit(PreIncrement preIncrement);
    public void visit(PreDecrement preDecrement);
    public void visit(PostIncrement postIncrement);
    public void visit(PostDecrement postDecrement);
    public void visit(LogicalConditionInParenth logicalConditionInParenth);
    public void visit(LogicalConditionNormal logicalConditionNormal);
    public void visit(VariableAssignmentValue variableAssignmentValue);
    public void visit(Assignment assignment);
    public void visit(MathExpression mathExpression);
    public void visit(False f);
    public void visit(True t);
    public void visit(BooleanInParenth booleanInParenth);
    public void visit(MultipleBooleanExpression multipleBooleanExpression);
    public void visit(Compare compare);
    public void visit(ArithmeticOperation arithmeticOperation);
    public void visit(MathInParenth mathInParenth);
    public void visit(ValueInParenth valueInParenth);
    public void visit(SimpleLiteralValue simpleLiteralValue);
    public void visit(SimpleVariable simpleVariable);
    public void visit(Parse p);
    public void visit(Node n);
    public void visit(Value value);
    public void visit(JavaStatment javaStmt);
    public void visit(ArgumentList argumentList);
    public void visit(Comment comment);
    public void visit(DefaultParameter defaultParameter);
    public void visit(FunctionCall funcCall);
    public void visit(FunctionDeclaration funcDec);
    public void visit(HigherOrderFunction HOfunc);
    public void visit(HigherOrderFunctionCall HOfuncCall);
    public void visit(ParameterList ParamList);

    //JavaBody
    public void visit(Block block);
    public void visit(JavaBody javaBody);
    public void visit(OneLineBlock oneLineBlock);
    public void visit(ReturnStmt returnStmt);

    //JavaLogic
    public void visit(ArrayCall arrayCall);
    public void visit(ArrayIdentification arrayIdentification);
    public void visit(JsonObject jsonObject);
    public void visit(Print print);
    public void visit(VariableAssignment variableAssignment);
    public void visit(VariableDeclaration variableIdentification);

    //javaLogicConditional
    public void visit(ConditionalStmt conditionalStmt);
    public void visit(ElseIfStmt elseIfStmt);
    public void visit(ElseStmt elseStmt);
    public void visit(IfStmt ifStmt);

    //javaLogicLoop
    public void visit(DoWhileLoop doWhileLoop);
    public void visit(ForEachLoop forEachLoop);
    public void visit(ForLoop forLoop);
    public void visit(LoopStmt loopStmt);
    public void visit(WhileLoop whileLoop);

    //javaLogicSwitch
    public void visit(SwitchCase switchCase);
    public void visit(SwitchDefault switchDefault);
    public void visit(SwitchStmt switchStmt);

    //javaUtils
    public void visit(AssignmentOperator assignmentOperator);
    public void visit(BooleanExpression booleanExpression);
    public void visit(Element element);
    public void visit(Expression expression);
    public void visit(Increment increment);
    public void visit(JavaObj javaObj);
    public void visit(LiteralValue literalValue);
    public void visit(LogicalCondition logicalCondition);
    //public void visit(MathExpression mathExpression);
    public void visit(Variable variable);


    //sql
    public void visit(Statement stmt);
    public void visit(SelectStmt selectStmt);
}
