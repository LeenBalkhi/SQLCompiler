// Generated from C:/Users/Dell/Documents/GitHub/SQLCompiler\Sql.g4 by ANTLR 4.7.2
package Rules.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SqlParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SqlParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#java_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJava_stmt(SqlParser.Java_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#java_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJava_stmt(SqlParser.Java_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#default_parameter}.
	 * @param ctx the parse tree
	 */
	void enterDefault_parameter(SqlParser.Default_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#default_parameter}.
	 * @param ctx the parse tree
	 */
	void exitDefault_parameter(SqlParser.Default_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(SqlParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(SqlParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(SqlParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(SqlParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#java_function_call}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_call(SqlParser.Java_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#java_function_call}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_call(SqlParser.Java_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#higher_order_java_function_call}.
	 * @param ctx the parse tree
	 */
	void enterHigher_order_java_function_call(SqlParser.Higher_order_java_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#higher_order_java_function_call}.
	 * @param ctx the parse tree
	 */
	void exitHigher_order_java_function_call(SqlParser.Higher_order_java_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ho_java_function}.
	 * @param ctx the parse tree
	 */
	void enterHo_java_function(SqlParser.Ho_java_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ho_java_function}.
	 * @param ctx the parse tree
	 */
	void exitHo_java_function(SqlParser.Ho_java_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#return_value}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value(SqlParser.Return_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#return_value}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value(SqlParser.Return_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SqlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SqlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#java_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_declaration(SqlParser.Java_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#java_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_declaration(SqlParser.Java_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#one_line_block}.
	 * @param ctx the parse tree
	 */
	void enterOne_line_block(SqlParser.One_line_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#one_line_block}.
	 * @param ctx the parse tree
	 */
	void exitOne_line_block(SqlParser.One_line_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterCondBody(SqlParser.CondBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitCondBody(SqlParser.CondBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jfcBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterJfcBody(SqlParser.JfcBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jfcBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitJfcBody(SqlParser.JfcBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(SqlParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(SqlParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(SqlParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(SqlParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incremetBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterIncremetBody(SqlParser.IncremetBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incremetBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitIncremetBody(SqlParser.IncremetBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterVarDecBody(SqlParser.VarDecBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitVarDecBody(SqlParser.VarDecBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varAssignBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignBody(SqlParser.VarAssignBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAssignBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignBody(SqlParser.VarAssignBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterPrintBody(SqlParser.PrintBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitPrintBody(SqlParser.PrintBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scopeBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterScopeBody(SqlParser.ScopeBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scopeBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitScopeBody(SqlParser.ScopeBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterBreakBody(SqlParser.BreakBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitBreakBody(SqlParser.BreakBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contimueBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void enterContimueBody(SqlParser.ContimueBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contimueBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 */
	void exitContimueBody(SqlParser.ContimueBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(SqlParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(SqlParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SqlParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SqlParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(SqlParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(SqlParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(SqlParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(SqlParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assginment}.
	 * @param ctx the parse tree
	 */
	void enterAssginment(SqlParser.AssginmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assginment}.
	 * @param ctx the parse tree
	 */
	void exitAssginment(SqlParser.AssginmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#variable_assignment_value}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment_value(SqlParser.Variable_assignment_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#variable_assignment_value}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment_value(SqlParser.Variable_assignment_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#array_identification}.
	 * @param ctx the parse tree
	 */
	void enterArray_identification(SqlParser.Array_identificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#array_identification}.
	 * @param ctx the parse tree
	 */
	void exitArray_identification(SqlParser.Array_identificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#array_call}.
	 * @param ctx the parse tree
	 */
	void enterArray_call(SqlParser.Array_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#array_call}.
	 * @param ctx the parse tree
	 */
	void exitArray_call(SqlParser.Array_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(SqlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(SqlParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#json_object}.
	 * @param ctx the parse tree
	 */
	void enterJson_object(SqlParser.Json_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#json_object}.
	 * @param ctx the parse tree
	 */
	void exitJson_object(SqlParser.Json_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SqlParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SqlParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVarVal(SqlParser.VarValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVarVal(SqlParser.VarValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code str}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStr(SqlParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code str}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStr(SqlParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jfcVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterJfcVal(SqlParser.JfcValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jfcVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitJfcVal(SqlParser.JfcValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lvVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterLvVal(SqlParser.LvValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lvVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitLvVal(SqlParser.LvValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterParenthVal(SqlParser.ParenthValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitParenthVal(SqlParser.ParenthValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterValueMath(SqlParser.ValueMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitValueMath(SqlParser.ValueMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticMath(SqlParser.ArithmeticMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticMath(SqlParser.ArithmeticMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthMath(SqlParser.ParenthMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthMath(SqlParser.ParenthMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthBool(SqlParser.ParenthBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthBool(SqlParser.ParenthBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareBool(SqlParser.CompareBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareBool(SqlParser.CompareBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueBool(SqlParser.TrueBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueBool(SqlParser.TrueBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultipleBool(SqlParser.MultipleBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultipleBool(SqlParser.MultipleBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterValBool(SqlParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitValBool(SqlParser.ValBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseBool(SqlParser.FalseBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseBool(SqlParser.FalseBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalLog}
	 * labeled alternative in {@link SqlParser#logical_condition}.
	 * @param ctx the parse tree
	 */
	void enterNormalLog(SqlParser.NormalLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalLog}
	 * labeled alternative in {@link SqlParser#logical_condition}.
	 * @param ctx the parse tree
	 */
	void exitNormalLog(SqlParser.NormalLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthLog}
	 * labeled alternative in {@link SqlParser#logical_condition}.
	 * @param ctx the parse tree
	 */
	void enterParenthLog(SqlParser.ParenthLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthLog}
	 * labeled alternative in {@link SqlParser#logical_condition}.
	 * @param ctx the parse tree
	 */
	void exitParenthLog(SqlParser.ParenthLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postInc}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterPostInc(SqlParser.PostIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postInc}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitPostInc(SqlParser.PostIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterPreInc(SqlParser.PreIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitPreInc(SqlParser.PreIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postDec}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterPostDec(SqlParser.PostDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postDec}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitPostDec(SqlParser.PostDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preDec}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterPreDec(SqlParser.PreDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preDec}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitPreDec(SqlParser.PreDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(SqlParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(SqlParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#conditional_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConditional_stmt(SqlParser.Conditional_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#conditional_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConditional_stmt(SqlParser.Conditional_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_stmt(SqlParser.Else_if_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_stmt(SqlParser.Else_if_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(SqlParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(SqlParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(SqlParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(SqlParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(SqlParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(SqlParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(SqlParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(SqlParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_loop(SqlParser.Do_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#do_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_loop(SqlParser.Do_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_each_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_loop(SqlParser.For_each_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_each_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_loop(SqlParser.For_each_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(SqlParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(SqlParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_default(SqlParser.Switch_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_default(SqlParser.Switch_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SqlParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_aggregation_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggregation_function(SqlParser.Create_aggregation_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_aggregation_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggregation_function(SqlParser.Create_aggregation_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(SqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(SqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SqlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SqlParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SqlParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SqlParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SqlParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SqlParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SqlParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SqlParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case1}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase1(SqlParser.Case1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case1}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase1(SqlParser.Case1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case2}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase2(SqlParser.Case2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case2}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase2(SqlParser.Case2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case3}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase3(SqlParser.Case3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case3}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase3(SqlParser.Case3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case4}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase4(SqlParser.Case4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case4}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase4(SqlParser.Case4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case5}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase5(SqlParser.Case5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case5}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase5(SqlParser.Case5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case6}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase6(SqlParser.Case6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case6}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase6(SqlParser.Case6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case7}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase7(SqlParser.Case7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case7}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase7(SqlParser.Case7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case15}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase15(SqlParser.Case15Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case15}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase15(SqlParser.Case15Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case8}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase8(SqlParser.Case8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case8}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase8(SqlParser.Case8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case9}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase9(SqlParser.Case9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case9}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase9(SqlParser.Case9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case11}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase11(SqlParser.Case11Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case11}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase11(SqlParser.Case11Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case12}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase12(SqlParser.Case12Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case12}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase12(SqlParser.Case12Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case13}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase13(SqlParser.Case13Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case13}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase13(SqlParser.Case13Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case14}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase14(SqlParser.Case14Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case14}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase14(SqlParser.Case14Context ctx);
	/**
	 * Enter a parse tree produced by the {@code case10}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase10(SqlParser.Case10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code case10}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase10(SqlParser.Case10Context ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SqlParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SqlParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SqlParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SqlParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SqlParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SqlParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SqlParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SqlParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SqlParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SqlParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SqlParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#method_ID}.
	 * @param ctx the parse tree
	 */
	void enterMethod_ID(SqlParser.Method_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#method_ID}.
	 * @param ctx the parse tree
	 */
	void exitMethod_ID(SqlParser.Method_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#array_name}.
	 * @param ctx the parse tree
	 */
	void enterArray_name(SqlParser.Array_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#array_name}.
	 * @param ctx the parse tree
	 */
	void exitArray_name(SqlParser.Array_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SqlParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SqlParser.Any_nameContext ctx);
}