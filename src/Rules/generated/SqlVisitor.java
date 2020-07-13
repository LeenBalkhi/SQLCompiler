// Generated from C:/Users/Dell/Documents/GitHub/SQLCompiler\Sql.g4 by ANTLR 4.7.2
package Rules.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqlParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_stmt(SqlParser.Java_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#default_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_parameter(SqlParser.Default_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(SqlParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(SqlParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_call(SqlParser.Java_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_value(SqlParser.Return_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SqlParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#java_function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_declaration(SqlParser.Java_function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#one_line_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_block(SqlParser.One_line_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondBody(SqlParser.CondBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jfcBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJfcBody(SqlParser.JfcBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBody(SqlParser.LoopBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(SqlParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incremetBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremetBody(SqlParser.IncremetBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecBody(SqlParser.VarDecBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAssignBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignBody(SqlParser.VarAssignBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBody(SqlParser.PrintBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scopeBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeBody(SqlParser.ScopeBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlstmt}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlstmt(SqlParser.SqlstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakBody(SqlParser.BreakBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contimueBody}
	 * labeled alternative in {@link SqlParser#java_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContimueBody(SqlParser.ContimueBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComments(SqlParser.CommentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SqlParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(SqlParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(SqlParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assginment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssginment(SqlParser.AssginmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#variable_assignment_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment_value(SqlParser.Variable_assignment_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#param_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_array(SqlParser.Param_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_agg_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_agg_fun(SqlParser.Create_agg_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(SqlParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SqlParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarVal(SqlParser.VarValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code str}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(SqlParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jfcVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJfcVal(SqlParser.JfcValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lvVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvVal(SqlParser.LvValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthVal}
	 * labeled alternative in {@link SqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthVal(SqlParser.ParenthValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueMath(SqlParser.ValueMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticMath(SqlParser.ArithmeticMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthMath}
	 * labeled alternative in {@link SqlParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthMath(SqlParser.ParenthMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthBool(SqlParser.ParenthBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareBool(SqlParser.CompareBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueBool(SqlParser.TrueBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleBool(SqlParser.MultipleBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(SqlParser.ValBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseBool}
	 * labeled alternative in {@link SqlParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseBool(SqlParser.FalseBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalLog}
	 * labeled alternative in {@link SqlParser#logical_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalLog(SqlParser.NormalLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthLog}
	 * labeled alternative in {@link SqlParser#logical_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthLog(SqlParser.ParenthLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postInc}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostInc(SqlParser.PostIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preInc}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreInc(SqlParser.PreIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postDec}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDec(SqlParser.PostDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preDec}
	 * labeled alternative in {@link SqlParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDec(SqlParser.PreDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(SqlParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#conditional_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_stmt(SqlParser.Conditional_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#else_if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_stmt(SqlParser.Else_if_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(SqlParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(SqlParser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(SqlParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(SqlParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#do_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop(SqlParser.Do_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_each_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_loop(SqlParser.For_each_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stmt(SqlParser.Switch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(SqlParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#switch_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_default(SqlParser.Switch_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SqlParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SqlParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(SqlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#jar_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_path(SqlParser.Jar_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(SqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SqlParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SqlParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SqlParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SqlParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SqlParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case1}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase1(SqlParser.Case1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case2}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase2(SqlParser.Case2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case3}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase3(SqlParser.Case3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case4}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase4(SqlParser.Case4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case5}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase5(SqlParser.Case5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case6}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase6(SqlParser.Case6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case7}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase7(SqlParser.Case7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case15}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase15(SqlParser.Case15Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case8}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase8(SqlParser.Case8Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case16}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase16(SqlParser.Case16Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case9}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase9(SqlParser.Case9Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case11}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase11(SqlParser.Case11Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case22}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase22(SqlParser.Case22Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case12}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase12(SqlParser.Case12Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case13}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase13(SqlParser.Case13Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case14}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase14(SqlParser.Case14Context ctx);
	/**
	 * Visit a parse tree produced by the {@code case10}
	 * labeled alternative in {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase10(SqlParser.Case10Context ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SqlParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SqlParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SqlParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SqlParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SqlParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SqlParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SqlParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SqlParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SqlParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SqlParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SqlParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SqlParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(SqlParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SqlParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(SqlParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(SqlParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SqlParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SqlParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SqlParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SqlParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SqlParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SqlParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SqlParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SqlParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SqlParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SqlParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#method_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_ID(SqlParser.Method_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#array_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name(SqlParser.Array_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqlParser.Any_nameContext ctx);
}