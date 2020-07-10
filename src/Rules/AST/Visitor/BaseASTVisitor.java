package Rules.AST.Visitor;

import Rules.AST.AnyName;
import Rules.AST.Java.*;
import Rules.AST.Java.JavaBody.*;
import Rules.AST.Java.Logic.*;
import Rules.AST.Java.Logic.Conditional.*;
import Rules.AST.Java.Logic.Loop.*;
import Rules.AST.Java.Logic.Switch.*;
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
import Rules.SymbolTableMu.FunctionSymbol;
import Rules.SymbolTableMu.Symbol;
import Rules.SymbolTableMu.SymbolTable;
import Rules.Utils.Error;

import java.sql.SQLSyntaxErrorException;
import java.text.NumberFormat;
import java.text.ParseException;

public class BaseASTVisitor implements ASTVisitor {

    public SymbolTable symbolTable;


    public BaseASTVisitor( SymbolTable symbolTable){
        this.symbolTable = symbolTable;
    }

    public Rules.SymbolTableMu.Scope currentScope(){
        return symbolTable.scopeStack.peek();
    }


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
    public Object visit(PostIncrement postIncrement) {
        String type="";
        try {
            type = ((Variable)postIncrement.variable).getType(currentScope());
        } catch (Error error) {
            error.printStackTrace();
        }
        Symbol symbol = symbolTable.getSymbol( ((SimpleVariable)(((Variable)postIncrement.variable).variable)).VariableName.get(0) );
        if( type.equals("Long") ){
            symbol.value = ((long)visit((Variable)postIncrement.variable))-1;
            return symbol.value;
        }
        if( type.equals("Double") ) {
            symbol.value = ((double)visit((Variable)postIncrement.variable))-1;
            return symbol.value;
        }
        return null;
    }

    @Override
    public Object visit(PostDecrement postDecrement) {
        String type="";
        try {
            type = ((Variable)postDecrement.variable).getType(currentScope());
        } catch (Error error) {
            error.printStackTrace();
        }
        Symbol symbol = symbolTable.getSymbol( ((SimpleVariable)(((Variable)postDecrement.variable).variable)).VariableName.get(0) );
        if( type.equals("Long") ){
            symbol.value = ((long)visit((Variable)postDecrement.variable))-1;
            return symbol.value;
        }
        if( type.equals("Double") ){
            symbol.value = ((double)visit((Variable)postDecrement.variable))-1;
            return symbol.value;
        }
        return null;
    }

    @Override
    public Object visit(PreIncrement preIncrement) {
        String type="";
        try {
            type = ((Variable)preIncrement.variable).getType(currentScope());
        } catch (Error error) {
            error.printStackTrace();
        }
        Symbol symbol = symbolTable.getSymbol( ((SimpleVariable)(((Variable)preIncrement.variable).variable)).VariableName.get(0) );
        if( type.equals("Long") ){
            symbol.value = ((long)visit((Variable)preIncrement.variable))+1;
            return symbol.value;
        }
        if( type.equals("Double") ){
            symbol.value = ((double)visit((Variable)preIncrement.variable))+1;
            return symbol.value;
        }
        return null;
    }

    @Override
    public Object visit(PreDecrement preDecrement) {
        String type="";
        try {
            type = ((Variable)preDecrement.variable).getType(currentScope());
        } catch (Error error) {
            error.printStackTrace();
        }
        Symbol symbol = symbolTable.getSymbol( ((SimpleVariable)(((Variable)preDecrement.variable).variable)).VariableName.get(0) );
        if( type.equals("Long") ){
            symbol.value = ((long)visit((Variable)preDecrement.variable))-1;
            return symbol.value;
        }
        if( type.equals("Double") ){
            symbol.value = ((double)visit((Variable)preDecrement.variable))-1;
            return symbol.value;
        }
        return null;
    }

    @Override
    public void visit(LogicalConditionNormal logicalConditionNormal) {
        System.out.println("ast LogicalConditionNormal");
        visit((BooleanExpression)logicalConditionNormal.condition);
        if(logicalConditionNormal.ifTrue instanceof Expression)
           // visit((Expression)logicalConditionNormal.ifTrue);
        if(logicalConditionNormal.ifTrue instanceof LogicalCondition)
            visit((LogicalCondition)logicalConditionNormal.ifTrue);
        if(logicalConditionNormal.ifFalse instanceof Expression)
           // visit((Expression)logicalConditionNormal.ifFalse);
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
            //visit((Expression)variableAssignmentValue.Value);
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
    public Object visit(MathExpression mathExpression) {
        if(mathExpression.expression instanceof Value)
            return visit((Value)mathExpression.expression);
        if(mathExpression.expression instanceof ArithmeticOperation)
            return visit((ArithmeticOperation)mathExpression.expression);
        if(mathExpression.expression instanceof MathInParenth)
            return visit((MathInParenth)mathExpression.expression);
        return null;
    }

    @Override
    public void visit(False f) {
        System.out.println("ast False");
    }

    @Override
    public Boolean visit(Compare compare) {

        String left = "";
        try {
            left = ((MathExpression)compare.left).getType(currentScope());
        } catch (Error error) {
            error.printStackTrace();
        }
        switch ( left ){
            case "Long":{
                long valueLeft = ((long)(visit((MathExpression)(compare.left)))) ;
                long valueRight = ((long)(visit((MathExpression)(compare.right)))) ;
                if(compare.op.equals("<"))
                    return valueLeft < valueRight;
                if(compare.op.equals("<="))
                    return valueLeft <= valueRight;
                if(compare.op.equals(">"))
                    return valueLeft > valueRight;
                if(compare.op.equals(">="))
                    return valueLeft >= valueRight;
                if(compare.op.equals("=="))
                    return valueLeft == valueRight;
                if(compare.op.equals("!="))
                    return valueLeft != valueRight;
                break;
            }
            case "Double":{
                double valueLeft = ((double)(visit((MathExpression)(compare.left)))) ;
                double valueRight = ((double)(visit((MathExpression)(compare.right)))) ;
                if(compare.op.equals("<"))
                    return valueLeft < valueRight;
                if(compare.op.equals("<="))
                    return valueLeft <= valueRight;
                if(compare.op.equals(">"))
                    return valueLeft > valueRight;
                if(compare.op.equals(">="))
                    return valueLeft >= valueRight;
                if(compare.op.equals("=="))
                    return valueLeft == valueRight;
                if(compare.op.equals("!="))
                    return valueLeft != valueRight;
                break;
            }
            case "String":{
                String valueLeft = ((String)(visit((MathExpression)(compare.left)))) ;
                String valueRight = ((String)(visit((MathExpression)(compare.right)))) ;
                if(compare.op.equals("=="))
                    return valueLeft == valueRight;
                if(compare.op.equals("!="))
                    return valueLeft != valueRight;
                break;
            }
        }
        return null;
    }

    @Override
    public Object visit(MathInParenth mathInParenth) {
        return visit((MathExpression)mathInParenth.expression);
    }

    @Override
    public Object visit(ValueInParenth valueInParenth) {
        System.out.println("ast ValueInParenth");
        return visit((Value)valueInParenth.value);
    }

    @Override
    public Boolean visit(BooleanInParenth booleanInParenth) {
        System.out.println("ast BooleanInParenth");
        return visit((BooleanExpression)booleanInParenth.value);
    }

    @Override
    public Object visit(SimpleLiteralValue simpleLiteralValue) {
        System.out.println("ast SimpleLiteralValue");
        try {
            return NumberFormat.getInstance().parse( simpleLiteralValue.value ) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object visit(ArithmeticOperation arithmeticOperation) {

        String left = "";

        try {
            left = arithmeticOperation.left.getType(currentScope());
        } catch (Error error) {
            error.printStackTrace();
        }

        switch (left){
            case "Long":{
                long valueLeft = (long)visit(arithmeticOperation.left);
                long valueRight = (long)visit(arithmeticOperation.right);
                switch (arithmeticOperation.op){
                    case "*":
                        return valueLeft * valueRight;
                    case "/":
                        return valueLeft / valueRight;
                    case "%":
                        return valueLeft % valueRight;
                    case "+":
                        return valueLeft + valueRight;
                    case "-":
                        return valueLeft - valueRight;
                }
            }
            case "Double":{
                double valueLeft = (double)visit(arithmeticOperation.left);
                double valueRight = (double)visit(arithmeticOperation.right);
                switch (arithmeticOperation.op){
                    case "*":
                        return valueLeft * valueRight;
                    case "/":
                        return valueLeft / valueRight;
                    case "%":
                        return valueLeft % valueRight;
                    case "+":
                        return valueLeft + valueRight;
                    case "-":
                        return valueLeft - valueRight;
                }
            }
        }
        return null;

    }

    @Override
    public Boolean visit(MultipleBooleanExpression multipleBooleanExpression) {

        if(multipleBooleanExpression.op == "||")
            return ( visit((BooleanExpression)multipleBooleanExpression.left) || visit((BooleanExpression)multipleBooleanExpression.right) );
        else
            return ( visit((BooleanExpression)multipleBooleanExpression.left) && visit((BooleanExpression)multipleBooleanExpression.right) );
    }

    @Override
    public void visit(SimpleVariable simpleVariable) {
        System.out.println("ast SimpleVariable");
        System.out.println(simpleVariable.VariableName);
    }

    @Override
    public String visit(JavaString string)
    {
        return string.string;
    }


    @Override
    public Object visit(Value value) {
        System.out.println("ast Value");
        if(value.value instanceof Variable)
            return visit((Variable)value.value);
        if(value.value instanceof JavaString)
            return visit((JavaString)value.value);
        if(value.value instanceof FunctionCall)
            return visit((FunctionCall)value.value);
        if(value.value instanceof SimpleLiteralValue)
            return visit((SimpleLiteralValue)value.value);
        if(value.value instanceof ValueInParenth)
            return visit((ValueInParenth)value.value);
        return null;
    }

    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
        for(int i=0;i<p.sqlStmts.size();i++)
        {
            visit((Statement)p.sqlStmts.get(i));
        }
        if(p.Java!=null)
            visit((JavaStatment)p.Java);
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
        if(javaStmt.javaStatment instanceof FunctionCall){
            visit((FunctionCall)javaStmt.javaStatment);
            if(javaStmt.javaStatement2!=null)
                visit((JavaStatment)javaStmt.javaStatement2);
        }
        if(javaStmt.javaStatment instanceof  FunctionDeclaration){
            visit((FunctionDeclaration) javaStmt.javaStatment);
            if(javaStmt.javaStatement2!=null)
                visit((JavaStatment)javaStmt.javaStatement2);
        }
        if(javaStmt.javaStatment instanceof HigherOrderFunctionCall){
            visit((HigherOrderFunctionCall) javaStmt.javaStatment);
            if(javaStmt.javaStatement2!=null)
                visit((JavaStatment)javaStmt.javaStatement2);
        }
        if(javaStmt.javaStatment instanceof VariableDeclaration){
            visit((VariableDeclaration) javaStmt.javaStatment);
            if(javaStmt.javaStatement2!=null)
                visit((JavaStatment)javaStmt.javaStatement2);
        }
    }

    @Override
    public void visit(ArgumentList argumentList) {
        System.out.println("ast ArgumentList ");
        for (int i=0;i<argumentList.argumentList.size();i++){
            //visit((Expression)argumentList.argumentList.get(i));
        }
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
        //visit((Expression)defaultParameter.expression);
    }

    @Override
    public Object visit(FunctionCall funcCall)
    {
        System.out.println("ast FunctionCall ");
        System.out.println(funcCall.functionName);
        FunctionSymbol functionSymbol = (FunctionSymbol) symbolTable.getSymbol(funcCall.functionName);
        for(int i = 0 ; i < ((ArgumentList)funcCall.argumentList).argumentList.size() ; i++){
            try {
                functionSymbol.parameters.get(i).type = ((Expression)((ArgumentList)funcCall.argumentList)
                        .argumentList.get(i)).getType(currentScope());
            } catch (Error error) {
                error.printStackTrace();
            }
            functionSymbol.parameters.get(i).value = visit((Expression)((ArgumentList)funcCall.argumentList)
                    .argumentList.get(i));
        }
        symbolTable.pushScope( ((FunctionDeclaration)functionSymbol.value).scope );
        Object object = visit(((Block)((FunctionDeclaration)functionSymbol.value).block));
//        if(funcCall.argumentList!=null)
//            visit((ArgumentList)funcCall.argumentList);
        symbolTable.popScope();
        return object;
    }

    @Override
    public void visit(FunctionDeclaration funcDec) {
//        System.out.println("ast FunctionDeclaration ");
//        System.out.println(funcDec.functionName);
        //symbolTable.pushScope( funcDec.scope );
//        if(funcDec.pl!=null)
//            visit((ParameterList) funcDec.pl);
       // visit((Block)funcDec.block);
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
        for(int i=0;i<ParamList.defaultParameters.size();i++)
        {
            visit((DefaultParameter)ParamList.defaultParameters.get(i));
        }
    }

    @Override
    public Object visit(Block block)
    {
        System.out.println("ast Block ");
        Object object = null;
        if(block.javaBodies.size()!=0)
        {
            for(int i=0;i<block.javaBodies.size();i++){
                object = visit((JavaBody)block.javaBodies.get(i));
                if(object!=null)
                    break;
            }
        }
        if(block.returnStmt!=null && object==null){
            object = visit((ReturnStmt)block.returnStmt);
        }
        return object;
    }

    @Override
    public Object visit(JavaBody javaBody)
    {
        System.out.println("ast JavaBody");
        if(javaBody.command instanceof ConditionalStmt)
            return visit((ConditionalStmt)javaBody.command);
        if(javaBody.command instanceof Increment)
            visit((Increment)javaBody.command);
        if(javaBody.command instanceof FunctionCall)
            visit((FunctionCall)javaBody.command);
        if(javaBody.command instanceof LoopStmt)
            return visit((LoopStmt)javaBody.command);
        if(javaBody.command instanceof SwitchStmt)
             visit((SwitchStmt)javaBody.command);
        if(javaBody.command instanceof Scope) {
            visit((Scope) javaBody.command);
        }
        if(javaBody.command instanceof Print)
            visit((Print)javaBody.command);
        if(javaBody.command instanceof VariableAssignment)
            visit((VariableAssignment)javaBody.command);
        if(javaBody.command instanceof VariableDeclaration)
            visit((VariableDeclaration)javaBody.command);
        if(javaBody.command instanceof Break)
            visit((Break)javaBody.command);
        if(javaBody.command instanceof Continue)
            visit((Continue)javaBody.command);
        return null;
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
    public Object visit(ReturnStmt returnStmt)
    {
        System.out.println("ast ReturnStmt");
        if(((ReturnValue)returnStmt.returnValue).value instanceof Expression){
            return ( visit((Expression)((ReturnValue)returnStmt.returnValue).value) );
        }
        if(((ReturnValue)returnStmt.returnValue).value instanceof LogicalCondition)
            visit((LogicalCondition)((ReturnValue)returnStmt.returnValue).value);
        return null;
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
                //visit((Expression)arrayIdentification.arrayElementasExpr.get(i));
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
        for(int i=0;i<jsonObject.element.size();i++) {
            visit((Element)jsonObject.element.get(i));
        }
    }

    @Override
    public void visit(Print print) {
        System.out.println("ast Print");
        for(int i=0 ; i < print.expressions.size();i++) {
            System.out.print(visit(print.expressions.get(i)));
        }
    }

    @Override
    public void visit(VariableAssignment variableAssignment)
    {
        Symbol symbol = currentScope().findSymbol(((SimpleVariable)
                ((Variable)variableAssignment.variable).variable).VariableName.get(0));
        Object assignmentValue = visit((Expression)((VariableAssignmentValue)((Assignment)variableAssignment.assignments.get(0))
                .variableAssignmentValue).Value);
        String op = ((AssignmentOperator)((Assignment)variableAssignment.assignments.get(0)).assignmentOperator).op;
        switch (op){
            case "=": {
                symbol.value = assignmentValue;
                System.out.println( symbol.value );
                break;
            }
            case "+=": {
                switch (symbol.type){
                    case "Long":{
                        assignmentValue = (long)symbol.value + (long)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                    case "Double":{
                        assignmentValue = (double)symbol.value + (double)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                    case "Stirng":{
                        assignmentValue = (String)symbol.value + (String) assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                }
                break;
            }
            case "-=": {
                switch (symbol.type){
                    case "Long":{
                        assignmentValue = (long)symbol.value - (long)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                    case "Double":{
                        assignmentValue = (double)symbol.value - (double)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                }
                break;
            }
            case "*=": {
                switch (symbol.type){
                    case "Long":{
                        assignmentValue = (long)symbol.value * (long)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                    case "Double":{
                        assignmentValue = (double)symbol.value * (double)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                }
                break;
            }
            case "/=": {
                switch (symbol.type){
                    case "Long":{
                        assignmentValue = (long)symbol.value / (long)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                    case "Double":{
                        assignmentValue = (double)symbol.value / (double)assignmentValue;
                        symbol.value = assignmentValue;
                        break;
                    }
                }
                break;
            }
        }
    }

    @Override
    public void visit(VariableDeclaration variableDeclaration)
    {
        for(int i=0;i<variableDeclaration.variableAssignments.size();i++) {
            visit((VariableAssignment)variableDeclaration.variableAssignments.get(i));
        }
    }

    @Override
    public Object visit(ConditionalStmt conditionalStmt) {
        Object object = null;
        for (int i = 0; i < conditionalStmt.ifs.size(); i++)
            object = visit((IfStmt) conditionalStmt.ifs.get(i), conditionalStmt.catched);
        if (conditionalStmt.elseifs.size() != 0 && object ==null) {
            for (int i = 0; i < conditionalStmt.elseifs.size(); i++) {
                if (conditionalStmt.catched == true)
                    break;
                visit((ElseIfStmt) conditionalStmt.elseifs.get(i), conditionalStmt.catched);
            }
        }
        if (conditionalStmt.elseStmt != null && object == null) {
            if (conditionalStmt.catched == false) {
                visit((ElseStmt) conditionalStmt.elseStmt, conditionalStmt.catched);
            }
        }
        return object;
    }

    @Override
    public Object visit(ElseIfStmt elseIfStmt , Boolean bool) {
        Object object = null;
        if(visit((BooleanExpression)elseIfStmt.condition)) {
            bool = true;
            if (elseIfStmt.body instanceof Block)
                object = visit((Block) elseIfStmt.body);
            if (elseIfStmt.body instanceof OneLineBlock)
                visit((OneLineBlock) elseIfStmt.body);
        }
        return object;
    }

    @Override
    public Object visit(ElseStmt elseStmt , Boolean bool) {
        Object object = null;
        if(elseStmt.body instanceof Block)
          object = visit((Block)elseStmt.body);
        if(elseStmt.body instanceof OneLineBlock)
            visit((OneLineBlock)elseStmt.body);
        return object;
    }

    @Override
    public Object visit(IfStmt ifStmt , Boolean bool) {
        Object object = null;
        symbolTable.pushScope( ifStmt.scope );
        if(visit(((BooleanExpression)ifStmt.condition))) {
            bool = true;
            if (ifStmt.body instanceof Block)
                object = visit((Block) ifStmt.body);
            if (ifStmt.body instanceof OneLineBlock)
                visit((OneLineBlock) ifStmt.body);
        }
        symbolTable.popScope();
        return object;
    }

    @Override
    public Object visit(DoWhileLoop doWhileLoop) {
        Object object = null;
        symbolTable.pushScope( doWhileLoop.scope );
        do {
            if (doWhileLoop.block instanceof OneLineBlock)
                visit((OneLineBlock) doWhileLoop.block);
            if (doWhileLoop.block instanceof Block)
                object = visit((Block) doWhileLoop.block);
        } while (visit((BooleanExpression)(doWhileLoop.booleanExpression)) && object==null);
        symbolTable.popScope();
        return object;
    }

    @Override
    public void visit(ForEachLoop forEachLoop) {
        System.out.println("ast ForEachLoop");
        visit((Variable)forEachLoop.variable);
        System.out.println(forEachLoop.arrayName);
        if(forEachLoop.block instanceof OneLineBlock)
            visit((OneLineBlock)forEachLoop.block);
        if(forEachLoop.block instanceof Block)
            visit((Block)forEachLoop.block);
    }

    @Override
    public Object visit(ForLoop forLoop) {
        Object object = null;
        symbolTable.pushScope( forLoop.scope );
        while (true){
            if (!visit((BooleanExpression)forLoop.booleanExpression)) break;
            if(forLoop.block instanceof OneLineBlock)
                visit((OneLineBlock) forLoop.block);
            if(forLoop.block instanceof Block)
                object = visit((Block)forLoop.block);
            if(forLoop.mathExpresion instanceof VariableAssignment)
                visit((VariableAssignment)forLoop.mathExpresion);
            if(forLoop.mathExpresion instanceof Increment)
                visit((Increment)forLoop.mathExpresion);
            if (object!=null) break;
        }
        symbolTable.popScope();
        return object;
    }

    @Override
    public Object visit(LoopStmt loopStmt) {
        Object object = null;
        if(loopStmt.loop instanceof ForLoop)
             object = visit((ForLoop)loopStmt.loop);
        if(loopStmt.loop instanceof WhileLoop)
             object = visit((WhileLoop)loopStmt.loop);
        if(loopStmt.loop instanceof ForEachLoop)
              visit((ForEachLoop)loopStmt.loop);
        if(loopStmt.loop instanceof DoWhileLoop)
             object = visit((DoWhileLoop)loopStmt.loop);
        return object;
    }

    @Override
    public Object visit(WhileLoop whileLoop) {
        Object object = null;
        symbolTable.pushScope( whileLoop.scope );
        //visit((BooleanExpression)whileLoop.booleanExpression);
        while (visit((BooleanExpression)whileLoop.booleanExpression) && object==null){
            System.out.println("In while");
            if(whileLoop.block instanceof OneLineBlock)
                visit((OneLineBlock)whileLoop.block);
            if(whileLoop.block instanceof Block)
                object = visit((Block)whileLoop.block);
        }
        symbolTable.popScope();
        return object;
    }

    @Override
    public void visit(SwitchCase switchCase) {
        System.out.println("ast SwitchCase ");
        symbolTable.pushScope( switchCase.scope );

        visit((Value)switchCase.value);
        if(switchCase.block instanceof Block)
            visit((Block)switchCase.block);
        if(switchCase.block instanceof OneLineBlock)
            visit((OneLineBlock)switchCase.block);

        symbolTable.popScope();
    }

    @Override
    public void visit(SwitchDefault switchDefault) {
        System.out.println("ast SwitchDefault ");
        symbolTable.pushScope( switchDefault.scope );

        if (switchDefault.block instanceof Block)
            visit((Block)switchDefault.block);
        if(switchDefault.block instanceof OneLineBlock)
            visit((OneLineBlock)switchDefault.block);

        symbolTable.popScope();
    }

    @Override
    public void visit(SwitchStmt switchStmt) {
        System.out.println("ast SwitchStmt ");
        String varName = ((SimpleVariable)((Variable)switchStmt.var).variable).VariableName.get(0);
        visit((Variable)switchStmt.var);
        for(int i=0;i<switchStmt.cases.size();i++) {
            if(currentScope().symbolMap.get(varName).value ==
                    ((Value)(((SwitchCase)switchStmt.cases.get(i)).value)).getValue(currentScope())){
                visit((SwitchCase)switchStmt.cases.get(i));
                switchStmt.catched = true;
                break;
            }
        }
        if(switchStmt.def!=null) {
            if(switchStmt.catched == false)
                visit((SwitchDefault)switchStmt.def);
        }
    }

    @Override
    public void visit(AssignmentOperator assignmentOperator) {
        System.out.println("ast AssignmentOperator ");
        System.out.println(assignmentOperator.op);
    }

    @Override
    public Boolean visit(BooleanExpression booleanExpression) {
        System.out.println("ast BooleanExpression ");
        if(booleanExpression.booleanExpression instanceof Value)
            return (Boolean) visit((Value)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof Compare)
            return visit((Compare)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof MultipleBooleanExpression)
            return visit((MultipleBooleanExpression)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof BooleanInParenth)
            visit((BooleanInParenth)booleanExpression.booleanExpression);
        if(booleanExpression.booleanExpression instanceof True)
            return true;
        if(booleanExpression.booleanExpression instanceof False)
            return false;
        return null;
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
    public Object visit(Expression expression) {
        System.out.println("ast Expression ");
        if(expression.expression instanceof Value)
            return visit((Value)expression.expression);
        else if(expression.expression instanceof BooleanExpression)
            return visit((BooleanExpression) expression.expression);
        else if(expression.expression instanceof MathExpression)
            return visit((MathExpression)expression.expression);
        else if(expression.expression instanceof Increment)
            return visit((Increment)expression.expression);
        return null;
    }

    @Override
    public Object visit(Increment increment) {
        System.out.println("ast Increment ");
        if(increment.increment instanceof PreIncrement)
            return visit((PreIncrement) increment.increment);
        if(increment.increment instanceof PreDecrement)
            return visit((PreDecrement)increment.increment);
        if(increment.increment instanceof PostIncrement)
            return visit((PostIncrement)increment.increment);
        if(increment.increment instanceof PostDecrement)
            return visit((PostDecrement)increment.increment);
        return null;
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

    @Override
    public Object visit(Variable variable)
    {
        System.out.println("ast Variable ");
        if(variable.variable instanceof SimpleVariable){
            return currentScope().findSymbol(((SimpleVariable)variable.variable).VariableName.get(0)).value;
        }
        return null;
    }

    @Override
    public void visit(Statement stmt) {
        System.out.println("AST Statement");
        for(int i=0; i < stmt.stmts.size(); i++)
            visit((SqlStatment) stmt.stmts.get(i));
    }

    @Override
    public void visit(SqlStatment sqlStatment) {

        System.out.println("ast sql statement");
        if(sqlStatment.Unique)
            System.out.println("Unique");
        if(sqlStatment.order!= null)
            System.out.println(sqlStatment.order);
        if(sqlStatment.stmt instanceof AlterTableStatement)
            visit((AlterTableStatement) sqlStatment.stmt);

        if(sqlStatment.stmt instanceof CreateTableStatement)
            visit((CreateTableStatement) sqlStatment.stmt);

        if(sqlStatment.stmt instanceof DeleteStatement)
            visit((DeleteStatement) sqlStatment.stmt);

        if(sqlStatment.stmt instanceof DropTableStatement)
            visit((DropTableStatement) sqlStatment.stmt);

        if(sqlStatment.stmt instanceof FactoredSelectStatement)
        {
            visit((FactoredSelectStatement) sqlStatment.stmt);

        }

        if(sqlStatment.stmt instanceof InsertStatement)
            visit((InsertStatement) sqlStatment.stmt);

        if(sqlStatment.stmt instanceof UpdateStatement)
            visit((UpdateStatement) sqlStatment.stmt);
    }

    @Override
    public void visit(SelectStmt selectStmt) {

        System.out.println("AST SelectStmt");
        if(selectStmt.selectorval != null)
            visit((SelectOrValue) selectStmt.selectorval);
        for(int i=0 ; i < selectStmt.expressions.size(); i++)
            visit((SqlExpression) selectStmt.expressions.get(i));
        for(int i=0 ; i < selectStmt.ordering.size();i++)
            visit((OrderingTerm) selectStmt.ordering.get(i));
        if(selectStmt.limit)
            System.out.println("is limited");
        if(selectStmt.expr1!= null)
            visit((SqlExpression) selectStmt.expr1);

        if(selectStmt.offset)
            System.out.println("There exists an offset");

        if(selectStmt.expr2!= null)
            visit((SqlExpression) selectStmt.expr2);

    }


    @Override
    public void visit(AnyName anyName) {
        System.out.println("AST AnyName");
//        System.out.println(anyName.id);
        if(anyName.name != null)
            System.out.println(anyName.name);
    }

    @Override
    public void visit(AlterTableStatement alterTableStatement) {

        System.out.println("Ast ALterTableStmt");
        if(alterTableStatement.dataBaseName != null)
            visit((AnyName) alterTableStatement.dataBaseName);
        if(alterTableStatement.sourceTableName != null)
            visit((AnyName) alterTableStatement.sourceTableName);

        if(alterTableStatement.alteration instanceof AlterTableAdd)
            visit((AlterTableAdd) alterTableStatement.alteration);

        if(alterTableStatement.alteration instanceof AlterTableAddConstraint)
            visit((AlterTableAddConstraint) alterTableStatement.alteration);
        if(alterTableStatement.newTableName != null)
            visit((AnyName) alterTableStatement.newTableName);
        if(alterTableStatement.newcolumn != null)
            visit((ColumnDef) alterTableStatement.newcolumn);
    }

    @Override
    public void visit(AlterTableAdd alterTableAdd) {
        System.out.println("AST AlterTableAdd");
        if(alterTableAdd.tableConstraint != null)
            visit((TableConstraint) alterTableAdd.tableConstraint);
    }

    @Override
    public void visit(TableConstraint tableConstraint) {
        System.out.println("AST TableConstraint");
        if(tableConstraint.name != null)
            System.out.println(tableConstraint.name);
        if(tableConstraint.constraint instanceof TableConstraintPrimaryKey)
            visit((TableConstraintPrimaryKey)tableConstraint.constraint);
        if(tableConstraint.constraint instanceof TableConstraintForeignKey)
            visit((TableConstraintForeignKey) tableConstraint.constraint);
        if(tableConstraint.constraint instanceof TableConstraintKey)
            visit((TableConstraintKey) tableConstraint.constraint);
        if(tableConstraint.constraint instanceof TableConstraintUnique)
            visit((TableConstraintUnique) tableConstraint.constraint);
    }

    @Override
    public void visit(TableConstraintKey tableConstraintKey) {
        System.out.println("AST TableConstraintKey");
        if(tableConstraintKey.Name != null)
            visit((AnyName) tableConstraintKey.Name);
        for(int i=0 ; i < tableConstraintKey.indexedColumns.size() ; i++)
            visit((indexedColumn) tableConstraintKey.indexedColumns.get(i));
    }

    @Override
    public void visit(TableConstraintUnique tableConstraintUnique) {
        System.out.println("AST TableConstraintUnique");
        if(tableConstraintUnique.name != null)
            visit((AnyName) tableConstraintUnique.name);
        for(int i=0 ; i < tableConstraintUnique.indexedColumns.size() ; i++)
            visit((indexedColumn) tableConstraintUnique.indexedColumns.get(i));
    }

    @Override
    public void visit(TableConstraintForeignKey tableConstraintForeignKey) {
        System.out.println("AST TableConstraintForeignKey");
        for(int i=0 ; i < tableConstraintForeignKey.fks.size(); i++)
            visit((AnyName) tableConstraintForeignKey.fks.get(i));
        if(tableConstraintForeignKey.foreignKeyClause!= null)
            visit((foreignKeyClause) tableConstraintForeignKey.foreignKeyClause);
    }

    @Override
    public void visit(TableConstraintPrimaryKey tableConstraintPrimaryKey) {
        System.out.println("AST TableConstraintPrimaryKey");
        for(int i=0 ; i < tableConstraintPrimaryKey.indexedColumns.size(); i++)
            visit((indexedColumn) tableConstraintPrimaryKey.indexedColumns.get(i));
    }

    @Override
    public void visit(indexedColumn indexedColumn) {
        System.out.println("AST indexedColumn");
        if(indexedColumn.columnName!= null)
            visit((AnyName)indexedColumn.columnName);
        if(indexedColumn.collationName != null)
            visit((AnyName) indexedColumn.collationName);
        if(indexedColumn.desc != null)
            System.out.println("is descending");
    }

    @Override
    public void visit(ColumnDef columnDef) {
        System.out.println("AST ColumnDef");
//        if(columnDef.name != null)
//            visit((AnyName) columnDef.name);
//        for(int i=0 ; i <columnDef.columnConstraintsTypeNames.size(); i++)
//        {
//            if(columnDef.columnConstraintsTypeNames.get(i) instanceof ColumnConstraint)
//                visit((ColumnConstraint) columnDef.columnConstraintsTypeNames.get(i) );
//            if(columnDef.columnConstraintsTypeNames.get(i) instanceof TypeName)
//                visit((TypeName) columnDef.columnConstraintsTypeNames.get(i) );
//        }
    }

    @Override
    public void visit(ColumnConstraint columnConstraint) {
        System.out.println("AST ColumnConstraint");
        if(columnConstraint.name != null)
            visit((AnyName) columnConstraint.name);
        if(columnConstraint.constraint instanceof ColumnConstraintNull)
            visit((ColumnConstraintNull) columnConstraint.constraint);
        if(columnConstraint.constraint instanceof ColumnConstraintNotNull)
            visit((ColumnConstraintNotNull) columnConstraint.constraint);
        if(columnConstraint.constraint instanceof ColumnConstraintForeignKey)
            visit((ColumnConstraintForeignKey) columnConstraint.constraint);
        if(columnConstraint.constraint instanceof ColumnConstraintPrimaryKey)
            visit((ColumnConstraintPrimaryKey) columnConstraint.constraint);
        if(columnConstraint.constraint instanceof SqlExpression)
            visit((SqlExpression) columnConstraint.constraint);
        if(columnConstraint.constraint instanceof ColumnDef)
            visit((ColumnDef) columnConstraint.constraint);
        if(columnConstraint.constraint instanceof AnyName)
            visit((AnyName) columnConstraint.constraint);

        if(columnConstraint.Unique)
            System.out.println("is unique");
    }

    @Override
    public void visit(ColumnConstraintPrimaryKey columnConstraintPrimaryKey) {
        System.out.println("AST ColumnConstraintPrimaryKey");
        if(columnConstraintPrimaryKey.order != null)
            System.out.println(columnConstraintPrimaryKey.order);
        if(columnConstraintPrimaryKey.autoIncrement)
            System.out.println("is on auto increment");
    }

    @Override
    public void visit(ColumnConstraintForeignKey columnConstraintForeignKey) {
        System.out.println("AST ColumnConstraintForeignKey");
        if(columnConstraintForeignKey.foreignKeyClause != null)
            visit((foreignKeyClause) columnConstraintForeignKey.foreignKeyClause);
    }

    @Override
    public void visit(ColumnConstraintNotNull columnConstraintNotNull) {
        System.out.println("AST ColumnConstraintNotNull");

        if(columnConstraintNotNull.notnull)
            System.out.println("Constraint not null");
    }

    @Override
    public void visit(ColumnConstraintNull columnConstraintNull) {
        System.out.println("AST ColumnConstraintNull");

        if(columnConstraintNull.Null)
            System.out.println("Constraint null");
    }

    @Override
    public void visit(foreignKeyClause foreignKeyClause) {
        System.out.println("AST foreignKeyClause");
        if(foreignKeyClause.dataBaseName != null)
            visit((AnyName) foreignKeyClause.dataBaseName);
        if(foreignKeyClause.foreignTableName != null)
            visit((AnyName) foreignKeyClause.foreignTableName);
        for(int i=0; i < foreignKeyClause.foreignTableColumnNames.size(); i++)
            visit((AnyName) foreignKeyClause.foreignTableColumnNames.get(i));
        for(int i=0 ; i<foreignKeyClause.matchOnNodes.size(); i++)
            visit((AnyName) foreignKeyClause.matchOnNodes.get(i));
    }
    @Override
    public void visit(SqlExpression sqlExpression) {
        if(sqlExpression.expression instanceof SqlExpressionCase1)
            visit((SqlExpressionCase1)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase2)
            visit((SqlExpressionCase2)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase3)
            visit((SqlExpressionCase3)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase4)
            visit((SqlExpressionCase4)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase5)
            visit((SqlExpressionCase5)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase6)
            visit((SqlExpressionCase6)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase7)
            visit((SqlExpressionCase7)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase8)
            visit((SqlExpressionCase8)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase9)
            visit((SqlExpressionCase9)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase10)
            visit((SqlExpressionCase10)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase11)
            visit((SqlExpressionCase11)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase12)
            visit((SqlExpressionCase12)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase13)
            visit((SqlExpressionCase13)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase14)
            visit((SqlExpressionCase14)sqlExpression.expression);
        if(sqlExpression.expression instanceof SqlExpressionCase15)
            visit((SqlExpressionCase15)sqlExpression.expression);

    }


    @Override
    public void visit(SqlExpressionCase1 sqlExpressionCase1) {
        System.out.println("ast SqlExpressionCase1");
        System.out.println(sqlExpressionCase1.literalValue);
    }

    @Override
    public void visit(SqlExpressionCase2 sqlExpressionCase2) {
        System.out.println("ast SqlExpressionCase2");
        if(sqlExpressionCase2.dataBaseName!=null)
            visit(sqlExpressionCase2.dataBaseName);
        if(sqlExpressionCase2.tableName!=null)
            visit(sqlExpressionCase2.tableName);
        visit(sqlExpressionCase2.columnName);
    }

    @Override
    public void visit(SqlExpressionCase3 sqlExpressionCase3) {
        System.out.println("ast SqlExpressionCase3");
        System.out.println(sqlExpressionCase3.unaryOperator);
        visit((SqlExpression)sqlExpressionCase3.SqlExpression);
    }

    @Override
    public void visit(SqlExpressionCase4 sqlExpressionCase4) {
        System.out.print("ast SqlExpressionCase4");
        visit((SqlExpression)sqlExpressionCase4.SqlExpression1);
        System.out.println(sqlExpressionCase4.op);
        visit((SqlExpression)sqlExpressionCase4.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase5 sqlExpressionCase5) {
        System.out.println("ast SqlExpressionCase5");
        visit((SqlExpression)sqlExpressionCase5.SqlExpression1);
        System.out.println(sqlExpressionCase5.op);
        visit((SqlExpression)sqlExpressionCase5.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase6 sqlExpressionCase6) {
        System.out.println("ast SqlExpressionCase6");
        visit((SqlExpression)sqlExpressionCase6.SqlExpression1);
        System.out.println(sqlExpressionCase6.op);
        visit((SqlExpression)sqlExpressionCase6.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase7 sqlExpressionCase7) {
        System.out.println("ast SqlExpressionCase7");
        visit((SqlExpression)sqlExpressionCase7.SqlExpression1);
        System.out.println(sqlExpressionCase7.op);
        visit((SqlExpression)sqlExpressionCase7.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase8 sqlExpressionCase8) {
        System.out.println("ast SqlExpressinoCase8");
        visit((SqlExpression)sqlExpressionCase8.SqlExpression1);
        System.out.println(sqlExpressionCase8.op);
        visit((SqlExpression)sqlExpressionCase8.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase9 sqlExpressionCase9) {
        System.out.println("ast SqlExpressionCase9");
        visit((SqlExpression)sqlExpressionCase9.SqlExpression1);
        System.out.println(sqlExpressionCase9.op);
        visit((SqlExpression)sqlExpressionCase9.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase10 sqlExpressionCase10) {
        System.out.println("ast SqlExpressionCase10");
        visit((SqlExpression)sqlExpressionCase10.SqlExpression1);
        System.out.println(sqlExpressionCase10.op);
        visit((SqlExpression)sqlExpressionCase10.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase11 sqlExpressionCase11) {
        System.out.println("ast SqlExpressionCase11");
        visit((SqlExpression)sqlExpressionCase11.SqlExpression1);
        System.out.println(sqlExpressionCase11.op);
        visit((SqlExpression)sqlExpressionCase11.SqlExpression2);
    }

    @Override
    public void visit(SqlExpressionCase12 sqlExpressionCase12) {
        System.out.println("ast SqlExpressionCase12");
        visit(sqlExpressionCase12.functionName);
        if(sqlExpressionCase12.distinct!=false)
            System.out.println("DISTINCT");
        for(int i=0;i<sqlExpressionCase12.expressions.size();i++)
            visit((SqlExpression)sqlExpressionCase12.expressions.get(i));
        if(sqlExpressionCase12.op!=null)
            System.out.println(sqlExpressionCase12.op);
    }

    @Override
    public void visit(SqlExpressionCase13 sqlExpressionCase13) {
        System.out.println("ast SqlExpressionCase13");
        visit((SqlExpression)sqlExpressionCase13.expression);
    }

    @Override
    public void visit(SqlExpressionCase14 sqlExpressionCase14) {
        System.out.println("ast SqlExpressionCase14");
        if(sqlExpressionCase14.not!=false)
            System.out.println("not");
        if(sqlExpressionCase14.selectStmt!=null)
            visit((SelectStmt)sqlExpressionCase14.selectStmt);
        for(int i=0;i<sqlExpressionCase14.expressions.size();i++)
            visit((SqlExpression)sqlExpressionCase14.expressions.get(i));
        if(sqlExpressionCase14.dataBaseName!=null)
            visit(sqlExpressionCase14.dataBaseName);
        if(sqlExpressionCase14.tableName!=null)
            visit(sqlExpressionCase14.tableName);
    }

    @Override
    public void visit(SqlExpressionCase15 sqlExpressionCase15) {
        System.out.println("ast SqlExpressionCase15");
        if(sqlExpressionCase15.not!=false)
            System.out.println("NOT");
        if(sqlExpressionCase15.exists!=false)
            System.out.println("EXISTS");
        visit((SelectStmt)sqlExpressionCase15.selectStmt);
    }

    @Override
    public void visit(TypeName typeName) {
        System.out.println("ast TypeName");
        visit(typeName.name);
    }

    @Override
    public void visit(CreateTableStatement createTableStatement) {
        System.out.println("ast CreateTableStatement");
        if(createTableStatement.ifNotExists!=false)
            System.out.println("IF NOT EXISTS");
        if(createTableStatement.dataBaseName!=null)
            visit(createTableStatement.dataBaseName);
        if(createTableStatement.tableName!=null)
            visit(createTableStatement.tableName);
        for(int i=0;i<createTableStatement.columnDefs.size();i++)
            visit((ColumnDef)createTableStatement.columnDefs.get(i));
        for(int i=0;i<createTableStatement.tableConstraintsColumnDefs.size();i++)
            visit((TableConstraint)createTableStatement.tableConstraintsColumnDefs.get(i));
        if(createTableStatement.selectStmt!=null)
            visit((SelectStmt)createTableStatement.selectStmt);
    }

    @Override
    public void visit(DeleteStatement deleteStatement) {
        System.out.println("ast DeleteStatement");
        visit((QualifiedTableName)deleteStatement.qualifiedTableName);
        if(deleteStatement.expression!=null)
            visit((SqlExpression)deleteStatement.expression);
    }

    @Override
    public void visit(QualifiedTableName qualifiedTableName) {
        System.out.println("ast QualifiedTableName");
        if(qualifiedTableName.dataBaseName!=null)
            visit(qualifiedTableName.dataBaseName);
        visit(qualifiedTableName.tableName);
        if(qualifiedTableName.indexName!=null)
            visit(qualifiedTableName.indexName);
    }

    @Override
    public void visit(DropTableStatement dropTableStatement) {
        System.out.println("ast DropTableStatement");
        if(dropTableStatement.dataBaseName!=null)
            visit(dropTableStatement.dataBaseName);
        visit(dropTableStatement.tableName);
    }

    @Override
    public void visit(FactoredSelectStatement factoredSelectStatement) {
        System.out.println("ast FactoredSelectStatement");
        visit((SelectCore)factoredSelectStatement.selectCore);
        for(int i=0;i<factoredSelectStatement.orderingterms.size();i++)
            visit((OrderingTerm)factoredSelectStatement.orderingterms.get(i));
        for(int i=0;i<factoredSelectStatement.expression.size();i++)
            visit((SqlExpression)factoredSelectStatement.expression.get(i));
    }

    @Override
    public void visit(SelectCore selectCore) {
        System.out.println("ast SelectCore");
        if(selectCore.all!=false)
            System.out.println("ALL");
        if(selectCore.distinct!=false)
            System.out.println("DISTINCT");
        for(int i=0;i<selectCore.resultColumns.size();i++)
            visit((ResultColumn)selectCore.resultColumns.get(i));
        for(int i=0;i<selectCore.tableOrSubQueries.size();i++)
            visit((TableOrSubquery)selectCore.tableOrSubQueries.get(i));
        if(selectCore.joinClause!=null)
            visit((JoinClause)selectCore.joinClause);
        for(int i=0;i<selectCore.groupByexpressions.size();i++)
            visit((SqlExpression)selectCore.groupByexpressions.get(i));
        for(int i=0;i<selectCore.valuesExpression.size();i++)
            visit((SqlExpression)selectCore.valuesExpression.get(i));
    }

    @Override
    public void visit(JoinClause joinClause) {
        System.out.println("ast JoinClause");
        for(int i=0;i<joinClause.tableOrSubQueries.size();i++)
            visit((TableOrSubquery)joinClause.tableOrSubQueries.get(i));
        for(int i=0;i<joinClause.joinOperators.size();i++)
            visit((JoinOperator)joinClause.joinOperators.get(i));
        for(int i=0;i<joinClause.joinConstraints.size();i++)
            visit((JoinConstraint)joinClause.joinConstraints.get(i));
    }

    @Override
    public void visit(JoinConstraint joinConstraint) {
        System.out.println("ast JoinConstraint");
        visit((SqlExpression)joinConstraint.expression);
    }

    @Override
    public void visit(JoinOperator joinOperator) {
        System.out.println("ast JoinOperator");
        System.out.println(joinOperator.op);
    }

    @Override
    public void visit(TableOrSubquery tableOrSubquery) {
        System.out.println("ast TableOrSubquery");
        if(tableOrSubquery.databaseName!=null)
            visit(tableOrSubquery.databaseName);
        if(tableOrSubquery.tableName!=null)
            visit(tableOrSubquery.tableName);
        if(tableOrSubquery.indexName!=null)
            visit(tableOrSubquery.indexName);
        for(int i=0;i<tableOrSubquery.tableOrSubqueries.size();i++)
            visit((TableOrSubquery)tableOrSubquery.tableOrSubqueries.get(i));
        if(tableOrSubquery.joinClause!=null)
            visit((JoinClause) tableOrSubquery.joinClause);
        if(tableOrSubquery.selectStatment!=null)
            visit((SelectStmt)tableOrSubquery.selectStatment);
    }

    @Override
    public void visit(OrderingTerm orderingTerm) {
        System.out.println("ast OrderingTerm");
        visit((SqlExpression)orderingTerm.expression);
        System.out.println(orderingTerm.order);
    }

    @Override
    public void visit(SelectOrValue selectOrValue) {
        System.out.println("ast SelectOrValue");
        System.out.println(selectOrValue.id);
        for(int i=0;i<selectOrValue.resColumns.size();i++)
            visit((ResultColumn)selectOrValue.resColumns.get(i));
        for(int i=0;i<selectOrValue.tablesorSbqueries.size();i++)
            visit((TableOrSubquery)selectOrValue.tablesorSbqueries.get(i));
        if(selectOrValue.join!=null)
            visit((JoinClause)selectOrValue.join);
        for(int i=0;i<selectOrValue.expressions.size();i++)
            visit((SqlExpression)selectOrValue.expressions.get(i));
    }

    @Override
    public void visit(ResultColumn resultColumn) {
        System.out.println("ast ResultColumn");
        if(resultColumn.tableName!=null)
            visit(resultColumn.tableName);
        if(resultColumn.expression!=null)
            visit((SqlExpression)resultColumn.expression);
        System.out.println(resultColumn.cloumnForExpr);
    }

    @Override
    public void visit(InsertStatement insertStatement) {

        System.out.println("AST InsertStmt");
        if(insertStatement.dataBaseName != null)
            visit((AnyName) insertStatement.dataBaseName);

        if(insertStatement.tableName != null)
            visit((AnyName) insertStatement.tableName);

        for(int i=0 ; i < insertStatement.columnNamse.size(); i++)
            visit((AnyName) insertStatement.columnNamse.get(i));

        for(int i=0 ; i < insertStatement.expressions.size(); i++)
            visit((SqlExpression) insertStatement.expressions.get(i));
        if(insertStatement.selectStatement != null)
            visit((SelectStmt) insertStatement.selectStatement);

        if(insertStatement.defaultValues)
            System.out.println("Default values");
    }

    @Override
    public void visit(UpdateStatement updateStatement) {

        System.out.println("AST UpdateStatement");
        if(updateStatement.qualifiedTableName != null)
            visit((QualifiedTableName) updateStatement.qualifiedTableName);
        for(int i=0 ; i < updateStatement.columnNames.size(); i++)
            visit((AnyName) updateStatement.columnNames.get(i));
        for(int i=0 ; i < updateStatement.expressions.size();i++)
            visit((SqlExpression) updateStatement.expressions.get(i));
    }


}
