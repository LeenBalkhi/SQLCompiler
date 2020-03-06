package Rules.AST.Visitor;

import Rules.AST.AnyName;
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
import Rules.AST.SQL.*;
import Rules.AST.SQL.Constraints.*;
import Rules.AST.SQL.DDL.*;
import Rules.AST.SQL.DQL.*;
import Rules.AST.SQL.Database.ColumnDef;
import Rules.AST.SQL.Database.QualifiedTableName;
import Rules.AST.SQL.Database.ResultColumn;
import Rules.AST.SQL.Database.TypeName;
import Rules.AST.SQL.Expression.*;

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
    public void visit(JavaString string);
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
    public void visit(SqlStatment sqlStatment);
    public void visit(AnyName anyName);
    public void visit(AlterTableStatement alterTableStatement);
    public void visit(AlterTableAdd alterTableAdd);
    public void visit(TableConstraint tableConstraint);
    public void visit(TableConstraintKey tableConstraintKey);
    public void visit(TableConstraintUnique tableConstraintUnique);
    public void visit(TableConstraintForeignKey tableConstraintForeignKey);
    public void visit(TableConstraintPrimaryKey tableConstraintPrimaryKey);
    public void visit(indexedColumn indexedColumn);
    public void visit(ColumnDef columnDef);
    public void visit(ColumnConstraint columnConstraint);
    public void visit(ColumnConstraintPrimaryKey columnConstraintPrimaryKey);
    public void visit(ColumnConstraintForeignKey columnConstraintForeignKey);
    public void visit(ColumnConstraintNotNull columnConstraintNotNull);
    public void visit(ColumnConstraintNull columnConstraintNull);
    public void visit(foreignKeyClause foreignKeyClause);
    public void visit(SqlExpression sqlExpression);
    public void visit(SqlExpressionCase1 sqlExpressionCase1);
    public void visit(SqlExpressionCase2 sqlExpressionCase2);
    public void visit(SqlExpressionCase3 sqlExpressionCase3);
    public void visit(SqlExpressionCase4 sqlExpressionCase4);
    public void visit(SqlExpressionCase5 sqlExpressionCase5);
    public void visit(SqlExpressionCase6 sqlExpressionCase6);
    public void visit(SqlExpressionCase7 sqlExpressionCase7);
    public void visit(SqlExpressionCase8 sqlExpressionCase8);
    public void visit(SqlExpressionCase9 sqlExpressionCase9);
    public void visit(SqlExpressionCase10 sqlExpressionCase10);
    public void visit(SqlExpressionCase11 sqlExpressionCase11);
    public void visit(SqlExpressionCase12 sqlExpressionCase12);
    public void visit(SqlExpressionCase13 sqlExpressionCase13);
    public void visit(SqlExpressionCase14 sqlExpressionCase14);
    public void visit(SqlExpressionCase15 sqlExpressionCase15);
    public void visit(TypeName typeName);
    public void visit(CreateTableStatement createTableStatement);
    public void visit(DeleteStatement deleteStatement);
    public void visit(QualifiedTableName qualifiedTableName);
    public void visit(DropTableStatement dropTableStatement);
    public void visit(FactoredSelectStatement factoredSelectStatement);
    public void visit(SelectCore selectCore);
    public void visit(JoinClause joinClause);
    public void visit(JoinConstraint joinConstraint);
    public void visit(JoinOperator joinOperator);
    public void visit(TableOrSubquery tableOrSubquery);
    public void visit(OrderingTerm orderingTerm);
    public void visit(SelectOrValue selectOrValue);
    public void visit(ResultColumn resultColumn);
    public void visit(InsertStatement insertStatement);
    public void visit(UpdateStatement updateStatement);


}
