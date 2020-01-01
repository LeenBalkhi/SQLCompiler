// Generated from C:/Users/Dell/Documents/GitHub/SQLCompiler\Sql.g4 by ANTLR 4.7.2
package Rules.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, SCOL=23, DOT=24, OPEN_PAR=25, 
		CLOSE_PAR=26, COMMA=27, ASSIGN=28, STAR=29, PLUS=30, MINUS=31, TILDE=32, 
		PIPE2=33, DIV=34, MOD=35, LT2=36, GT2=37, AMP=38, PIPE=39, LT=40, LT_EQ=41, 
		GT=42, GT_EQ=43, EQ=44, NOT_EQ1=45, NOT_EQ2=46, K_ABORT=47, K_ACTION=48, 
		K_ADD=49, K_AFTER=50, K_ALL=51, K_ALTER=52, K_ANALYZE=53, K_AND=54, K_AS=55, 
		K_ASC=56, K_ATTACH=57, K_AUTOINCREMENT=58, K_BEFORE=59, K_BEGIN=60, K_BETWEEN=61, 
		K_BREAK=62, K_BY=63, K_CASCADE=64, K_CASE=65, K_CAST=66, K_CHECK=67, K_COLLATE=68, 
		K_COLUMN=69, K_COMMIT=70, K_CONFLICT=71, K_CONSTRAINT=72, K_CONTINUE=73, 
		K_CREATE=74, K_CROSS=75, K_CURRENT_DATE=76, K_CURRENT_TIME=77, K_CURRENT_TIMESTAMP=78, 
		K_DATABASE=79, K_DEFAULT=80, K_DEFERRABLE=81, K_DEFERRED=82, K_DELETE=83, 
		K_DESC=84, K_DETACH=85, K_DISTINCT=86, K_DO=87, K_DROP=88, K_EACH=89, 
		K_ELSE=90, K_END=91, K_ENABLE=92, K_ESCAPE=93, K_EXCEPT=94, K_EXCLUSIVE=95, 
		K_EXISTS=96, K_EXPLAIN=97, K_FAIL=98, K_FOR=99, K_FOREIGN=100, K_FROM=101, 
		K_FULL=102, K_FUNCTION=103, K_GLOB=104, K_GROUP=105, K_HAVING=106, K_IF=107, 
		K_IGNORE=108, K_IMMEDIATE=109, K_IN=110, K_INDEX=111, K_INDEXED=112, K_INITIALLY=113, 
		K_INNER=114, K_INSERT=115, K_INSTEAD=116, K_INTERSECT=117, K_INTO=118, 
		K_IS=119, K_ISNULL=120, K_JOIN=121, K_KEY=122, K_LEFT=123, K_LIKE=124, 
		K_LIMIT=125, K_MATCH=126, K_NATURAL=127, K_NEXTVAL=128, K_NO=129, K_NOT=130, 
		K_NOTNULL=131, K_NULL=132, K_OF=133, K_OFFSET=134, K_ON=135, K_ONLY=136, 
		K_OR=137, K_ORDER=138, K_OUTER=139, K_PLAN=140, K_PRAGMA=141, K_PRIMARY=142, 
		K_PRINT=143, K_QUERY=144, K_RAISE=145, K_RECURSIVE=146, K_REFERENCES=147, 
		K_REGEXP=148, K_REINDEX=149, K_RELEASE=150, K_RENAME=151, K_REPLACE=152, 
		K_RESTRICT=153, K_RETURN=154, K_RIGHT=155, K_ROLLBACK=156, K_ROW=157, 
		K_SAVEPOINT=158, K_SELECT=159, K_SET=160, K_SWITCH=161, K_TABLE=162, K_TEMP=163, 
		K_TEMPORARY=164, K_THEN=165, K_TO=166, K_TRANSACTION=167, K_TRIGGER=168, 
		K_UNION=169, K_UNIQUE=170, K_UPDATE=171, K_USING=172, K_VACUUM=173, K_VALUES=174, 
		K_VIEW=175, K_VIRTUAL=176, K_VAR=177, K_WHEN=178, K_WHERE=179, K_WHILE=180, 
		K_WITH=181, K_WITHOUT=182, K_TRUE=183, K_FALSE=184, IDENTIFIER=185, NUMERIC_LITERAL=186, 
		BIND_PARAMETER=187, STRING_LITERAL=188, BLOB_LITERAL=189, SINGLE_LINE_COMMENT=190, 
		JAVA_SINGLE_LINE_COMMENT=191, MULTILINE_COMMENT=192, SPACES=193, UNEXPECTED_CHAR=194;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_java_stmt = 2, RULE_default_parameter = 3, 
		RULE_parameter_list = 4, RULE_argument_list = 5, RULE_java_function_call = 6, 
		RULE_higher_order_java_function_call = 7, RULE_ho_java_function = 8, RULE_return_stmt = 9, 
		RULE_return_value = 10, RULE_string = 11, RULE_java_function_declaration = 12, 
		RULE_block = 13, RULE_one_line_block = 14, RULE_java_body = 15, RULE_comments = 16, 
		RULE_variable = 17, RULE_variable_declaration = 18, RULE_variable_assignment = 19, 
		RULE_variable_assignment_value = 20, RULE_array_identification = 21, RULE_array_call = 22, 
		RULE_element = 23, RULE_json_object = 24, RULE_print = 25, RULE_value = 26, 
		RULE_expression = 27, RULE_math_expression = 28, RULE_boolean_expression = 29, 
		RULE_logical_condition = 30, RULE_increment = 31, RULE_assignment_operator = 32, 
		RULE_conditional_stmt = 33, RULE_if_stmt = 34, RULE_else_if_stmt = 35, 
		RULE_else_stmt = 36, RULE_loop_stmt = 37, RULE_for_loop = 38, RULE_while_loop = 39, 
		RULE_do_while_loop = 40, RULE_for_each_loop = 41, RULE_switch_stmt = 42, 
		RULE_switch_case = 43, RULE_switch_default = 44, RULE_sql_stmt_list = 45, 
		RULE_sql_stmt = 46, RULE_alter_table_stmt = 47, RULE_alter_table_add_constraint = 48, 
		RULE_alter_table_add = 49, RULE_create_table_stmt = 50, RULE_delete_stmt = 51, 
		RULE_drop_table_stmt = 52, RULE_factored_select_stmt = 53, RULE_insert_stmt = 54, 
		RULE_select_stmt = 55, RULE_select_or_values = 56, RULE_update_stmt = 57, 
		RULE_column_def = 58, RULE_type_name = 59, RULE_column_constraint = 60, 
		RULE_column_constraint_primary_key = 61, RULE_column_constraint_foreign_key = 62, 
		RULE_column_constraint_not_null = 63, RULE_column_constraint_null = 64, 
		RULE_column_default = 65, RULE_column_default_value = 66, RULE_expr = 67, 
		RULE_foreign_key_clause = 68, RULE_fk_target_column_name = 69, RULE_indexed_column = 70, 
		RULE_table_constraint = 71, RULE_table_constraint_primary_key = 72, RULE_table_constraint_foreign_key = 73, 
		RULE_table_constraint_unique = 74, RULE_table_constraint_key = 75, RULE_fk_origin_column_name = 76, 
		RULE_qualified_table_name = 77, RULE_ordering_term = 78, RULE_pragma_value = 79, 
		RULE_common_table_expression = 80, RULE_result_column = 81, RULE_table_or_subquery = 82, 
		RULE_join_clause = 83, RULE_join_operator = 84, RULE_join_constraint = 85, 
		RULE_select_core = 86, RULE_cte_table_name = 87, RULE_signed_number = 88, 
		RULE_literal_value = 89, RULE_unary_operator = 90, RULE_error_message = 91, 
		RULE_module_argument = 92, RULE_column_alias = 93, RULE_keyword = 94, 
		RULE_unknown = 95, RULE_name = 96, RULE_function_name = 97, RULE_database_name = 98, 
		RULE_source_table_name = 99, RULE_table_name = 100, RULE_table_or_index_name = 101, 
		RULE_new_table_name = 102, RULE_column_name = 103, RULE_collation_name = 104, 
		RULE_foreign_table = 105, RULE_index_name = 106, RULE_trigger_name = 107, 
		RULE_view_name = 108, RULE_module_name = 109, RULE_pragma_name = 110, 
		RULE_savepoint_name = 111, RULE_table_alias = 112, RULE_transaction_name = 113, 
		RULE_method_ID = 114, RULE_array_name = 115, RULE_any_name = 116;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "java_stmt", "default_parameter", "parameter_list", 
			"argument_list", "java_function_call", "higher_order_java_function_call", 
			"ho_java_function", "return_stmt", "return_value", "string", "java_function_declaration", 
			"block", "one_line_block", "java_body", "comments", "variable", "variable_declaration", 
			"variable_assignment", "variable_assignment_value", "array_identification", 
			"array_call", "element", "json_object", "print", "value", "expression", 
			"math_expression", "boolean_expression", "logical_condition", "increment", 
			"assignment_operator", "conditional_stmt", "if_stmt", "else_if_stmt", 
			"else_stmt", "loop_stmt", "for_loop", "while_loop", "do_while_loop", 
			"for_each_loop", "switch_stmt", "switch_case", "switch_default", "sql_stmt_list", 
			"sql_stmt", "alter_table_stmt", "alter_table_add_constraint", "alter_table_add", 
			"create_table_stmt", "delete_stmt", "drop_table_stmt", "factored_select_stmt", 
			"insert_stmt", "select_stmt", "select_or_values", "update_stmt", "column_def", 
			"type_name", "column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "expr", "foreign_key_clause", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "cte_table_name", 
			"signed_number", "literal_value", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "unknown", "name", "function_name", 
			"database_name", "source_table_name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
			"table_alias", "transaction_name", "method_ID", "array_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'\"'", "'['", "']'", "':'", "'''", "'&&'", "'?'", 
			"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "'>>>='", "'::'", "';'", "'.'", "'('", "')'", "','", 
			"'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", 
			"'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "SCOL", 
			"DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", 
			"TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", 
			"GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", "K_ACTION", "K_ADD", 
			"K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", 
			"K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BREAK", 
			"K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
			"K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CONTINUE", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
			"K_DISTINCT", "K_DO", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ENABLE", 
			"K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", 
			"K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_FUNCTION", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
			"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
			"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_PRINT", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RETURN", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
			"K_SELECT", "K_SET", "K_SWITCH", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_VAR", "K_WHEN", "K_WHERE", "K_WHILE", "K_WITH", "K_WITHOUT", "K_TRUE", 
			"K_FALSE", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "JAVA_SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public Java_stmtContext java_stmt() {
			return getRuleContext(Java_stmtContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL || _la==K_ALTER || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_CREATE - 74)) | (1L << (K_DELETE - 74)) | (1L << (K_DROP - 74)) | (1L << (K_INSERT - 74)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (K_SELECT - 159)) | (1L << (K_UPDATE - 159)) | (1L << (K_VALUES - 159)) | (1L << (UNEXPECTED_CHAR - 159)))) != 0)) {
					{
					setState(236);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCOL:
					case K_ALTER:
					case K_CREATE:
					case K_DELETE:
					case K_DROP:
					case K_INSERT:
					case K_SELECT:
					case K_UPDATE:
					case K_VALUES:
						{
						setState(234);
						sql_stmt_list();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(235);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				java_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SqlParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_stmtContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Java_stmtContext java_stmt() {
			return getRuleContext(Java_stmtContext.class,0);
		}
		public Java_function_declarationContext java_function_declaration() {
			return getRuleContext(Java_function_declarationContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public Higher_order_java_function_callContext higher_order_java_function_call() {
			return getRuleContext(Higher_order_java_function_callContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Java_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_stmtContext java_stmt() throws RecognitionException {
		Java_stmtContext _localctx = new Java_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_java_stmt);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				variable_declaration();
				setState(250);
				match(SCOL);
				setState(252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(251);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				java_function_declaration();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL) {
					{
					{
					setState(255);
					match(SCOL);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(261);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				java_function_call();
				setState(265);
				match(SCOL);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(266);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				higher_order_java_function_call();
				setState(270);
				match(SCOL);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(271);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				comments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_parameterContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDefault_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDefault_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDefault_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_parameterContext default_parameter() throws RecognitionException {
		Default_parameterContext _localctx = new Default_parameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_default_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(K_VAR);
			setState(278);
			variable();
			setState(279);
			match(ASSIGN);
			setState(280);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Default_parameterContext> default_parameter() {
			return getRuleContexts(Default_parameterContext.class);
		}
		public Default_parameterContext default_parameter(int i) {
			return getRuleContext(Default_parameterContext.class,i);
		}
		public List<TerminalNode> K_VAR() { return getTokens(SqlParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SqlParser.K_VAR, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(282);
				match(K_VAR);
				setState(283);
				any_name();
				}
				break;
			}
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					match(COMMA);
					setState(287);
					match(K_VAR);
					setState(288);
					any_name();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_VAR) {
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(294);
					match(COMMA);
					}
				}

				setState(297);
				default_parameter();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(298);
					match(COMMA);
					setState(299);
					default_parameter();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_CURRENT_DATE - 76)) | (1L << (K_CURRENT_TIME - 76)) | (1L << (K_CURRENT_TIMESTAMP - 76)) | (1L << (K_NULL - 76)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (K_TRUE - 183)) | (1L << (K_FALSE - 183)) | (1L << (IDENTIFIER - 183)) | (1L << (NUMERIC_LITERAL - 183)) | (1L << (STRING_LITERAL - 183)) | (1L << (BLOB_LITERAL - 183)))) != 0)) {
				{
				setState(307);
				expression();
				}
			}

			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					match(COMMA);
					{
					setState(311);
					expression();
					}
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_callContext extends ParserRuleContext {
		public Method_IDContext method_ID() {
			return getRuleContext(Method_IDContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Java_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_callContext java_function_call() throws RecognitionException {
		Java_function_callContext _localctx = new Java_function_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_java_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			method_ID();
			setState(318);
			match(OPEN_PAR);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(319);
				argument_list();
				}
				break;
			}
			setState(322);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Higher_order_java_function_callContext extends ParserRuleContext {
		public Method_IDContext method_ID() {
			return getRuleContext(Method_IDContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Ho_java_functionContext ho_java_function() {
			return getRuleContext(Ho_java_functionContext.class,0);
		}
		public List<Argument_listContext> argument_list() {
			return getRuleContexts(Argument_listContext.class);
		}
		public Argument_listContext argument_list(int i) {
			return getRuleContext(Argument_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Higher_order_java_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_order_java_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterHigher_order_java_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitHigher_order_java_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitHigher_order_java_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_order_java_function_callContext higher_order_java_function_call() throws RecognitionException {
		Higher_order_java_function_callContext _localctx = new Higher_order_java_function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_higher_order_java_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			method_ID();
			{
			setState(325);
			match(OPEN_PAR);
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(326);
				argument_list();
				}
				break;
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(329);
				match(COMMA);
				}
			}

			{
			setState(332);
			ho_java_function();
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(333);
				match(COMMA);
				setState(334);
				argument_list();
				}
			}

			setState(337);
			match(CLOSE_PAR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ho_java_functionContext extends ParserRuleContext {
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Ho_java_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ho_java_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterHo_java_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitHo_java_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitHo_java_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ho_java_functionContext ho_java_function() throws RecognitionException {
		Ho_java_functionContext _localctx = new Ho_java_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ho_java_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(K_FUNCTION);
			setState(340);
			match(OPEN_PAR);
			{
			setState(341);
			argument_list();
			}
			setState(342);
			match(CLOSE_PAR);
			setState(343);
			match(T__0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(344);
				block();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Return_valueContext return_value() {
			return getRuleContext(Return_valueContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(K_RETURN);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_CURRENT_DATE - 76)) | (1L << (K_CURRENT_TIME - 76)) | (1L << (K_CURRENT_TIMESTAMP - 76)) | (1L << (K_NULL - 76)))) != 0) || ((((_la - 183)) & ~0x3f) == 0 && ((1L << (_la - 183)) & ((1L << (K_TRUE - 183)) | (1L << (K_FALSE - 183)) | (1L << (IDENTIFIER - 183)) | (1L << (NUMERIC_LITERAL - 183)) | (1L << (STRING_LITERAL - 183)) | (1L << (BLOB_LITERAL - 183)))) != 0)) {
				{
				setState(353);
				return_value();
				}
			}

			setState(356);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Logical_conditionContext logical_condition() {
			return getRuleContext(Logical_conditionContext.class,0);
		}
		public Return_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReturn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReturn_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReturn_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_valueContext return_value() throws RecognitionException {
		Return_valueContext _localctx = new Return_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_value);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				logical_condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> SPACES() { return getTokens(SqlParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(SqlParser.SPACES, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__2);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(364);
						expression();
						}
						break;
					case 2:
						{
						setState(365);
						any_name();
						}
						break;
					case 3:
						{
						setState(366);
						match(SPACES);
						}
						break;
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(372);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_declarationContext extends ParserRuleContext {
		public Method_IDContext method_ID() {
			return getRuleContext(Method_IDContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public Java_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_function_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_function_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_function_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_declarationContext java_function_declaration() throws RecognitionException {
		Java_function_declarationContext _localctx = new Java_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_java_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(374);
				match(K_FUNCTION);
				}
			}

			setState(377);
			method_ID();
			setState(378);
			match(OPEN_PAR);
			{
			setState(379);
			parameter_list();
			}
			setState(380);
			match(CLOSE_PAR);
			setState(381);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__0);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_DO - 87)) | (1L << (K_FOR - 87)) | (1L << (K_IF - 87)) | (1L << (K_PRINT - 87)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (K_SWITCH - 161)) | (1L << (K_VAR - 161)) | (1L << (K_WHILE - 161)) | (1L << (IDENTIFIER - 161)) | (1L << (STRING_LITERAL - 161)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 161)) | (1L << (MULTILINE_COMMENT - 161)))) != 0)) {
				{
				{
				setState(384);
				java_body();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(390);
				return_stmt();
				}
			}

			setState(393);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class One_line_blockContext extends ParserRuleContext {
		public Java_bodyContext java_body() {
			return getRuleContext(Java_bodyContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public One_line_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_line_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOne_line_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOne_line_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOne_line_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_line_blockContext one_line_block() throws RecognitionException {
		One_line_blockContext _localctx = new One_line_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_one_line_block);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__9:
			case T__10:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_PRINT:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
			case JAVA_SINGLE_LINE_COMMENT:
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				java_body();
				}
				break;
			case K_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_bodyContext extends ParserRuleContext {
		public Conditional_stmtContext conditional_stmt() {
			return getRuleContext(Conditional_stmtContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
		public List<Java_bodyContext> java_body() {
			return getRuleContexts(Java_bodyContext.class);
		}
		public Java_bodyContext java_body(int i) {
			return getRuleContext(Java_bodyContext.class,i);
		}
		public Java_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_bodyContext java_body() throws RecognitionException {
		Java_bodyContext _localctx = new Java_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_java_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(399);
				conditional_stmt();
				}
				break;
			case 2:
				{
				setState(400);
				comments();
				}
				break;
			case 3:
				{
				setState(401);
				java_function_call();
				setState(402);
				match(SCOL);
				}
				break;
			case 4:
				{
				setState(404);
				loop_stmt();
				}
				break;
			case 5:
				{
				setState(405);
				switch_stmt();
				}
				break;
			case 6:
				{
				setState(406);
				print();
				setState(407);
				match(SCOL);
				}
				break;
			case 7:
				{
				setState(409);
				increment();
				setState(410);
				match(SCOL);
				}
				break;
			case 8:
				{
				setState(412);
				variable_declaration();
				setState(413);
				match(SCOL);
				}
				break;
			case 9:
				{
				setState(415);
				variable_assignment();
				setState(416);
				match(SCOL);
				}
				break;
			case 10:
				{
				setState(418);
				print();
				setState(419);
				match(SCOL);
				}
				break;
			case 11:
				{
				setState(421);
				match(T__0);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_DO - 87)) | (1L << (K_FOR - 87)) | (1L << (K_IF - 87)) | (1L << (K_PRINT - 87)))) != 0) || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (K_SWITCH - 161)) | (1L << (K_VAR - 161)) | (1L << (K_WHILE - 161)) | (1L << (IDENTIFIER - 161)) | (1L << (STRING_LITERAL - 161)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 161)) | (1L << (MULTILINE_COMMENT - 161)))) != 0)) {
					{
					{
					setState(422);
					java_body();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(T__1);
				}
				break;
			}
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(431);
				match(K_BREAK);
				setState(432);
				match(SCOL);
				}
				break;
			case 2:
				{
				setState(433);
				match(K_CONTINUE);
				setState(434);
				match(SCOL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode JAVA_SINGLE_LINE_COMMENT() { return getToken(SqlParser.JAVA_SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTILINE_COMMENT() { return getToken(SqlParser.MULTILINE_COMMENT, 0); }
		public Java_bodyContext java_body() {
			return getRuleContext(Java_bodyContext.class,0);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comments);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(JAVA_SINGLE_LINE_COMMENT);
				}
				break;
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(MULTILINE_COMMENT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(T__0);
				setState(440);
				java_body();
				setState(441);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				any_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				array_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Variable_assignmentContext> variable_assignment() {
			return getRuleContexts(Variable_assignmentContext.class);
		}
		public Variable_assignmentContext variable_assignment(int i) {
			return getRuleContext(Variable_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(K_VAR);
			setState(450);
			variable_assignment();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(451);
				match(COMMA);
				setState(452);
				variable_assignment();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_assignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<Assignment_operatorContext> assignment_operator() {
			return getRuleContexts(Assignment_operatorContext.class);
		}
		public Assignment_operatorContext assignment_operator(int i) {
			return getRuleContext(Assignment_operatorContext.class,i);
		}
		public List<Variable_assignment_valueContext> variable_assignment_value() {
			return getRuleContexts(Variable_assignment_valueContext.class);
		}
		public Variable_assignment_valueContext variable_assignment_value(int i) {
			return getRuleContext(Variable_assignment_valueContext.class,i);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVariable_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			variable();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ASSIGN))) != 0)) {
				{
				{
				setState(459);
				assignment_operator();
				setState(460);
				variable_assignment_value();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_assignment_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Logical_conditionContext logical_condition() {
			return getRuleContext(Logical_conditionContext.class,0);
		}
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public Array_identificationContext array_identification() {
			return getRuleContext(Array_identificationContext.class,0);
		}
		public Variable_assignment_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVariable_assignment_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVariable_assignment_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVariable_assignment_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignment_valueContext variable_assignment_value() throws RecognitionException {
		Variable_assignment_valueContext _localctx = new Variable_assignment_valueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable_assignment_value);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				logical_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				json_object();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				array_identification();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_identificationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Array_identificationContext> array_identification() {
			return getRuleContexts(Array_identificationContext.class);
		}
		public Array_identificationContext array_identification(int i) {
			return getRuleContext(Array_identificationContext.class,i);
		}
		public Array_identificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_identification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArray_identification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArray_identification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArray_identification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_identificationContext array_identification() throws RecognitionException {
		Array_identificationContext _localctx = new Array_identificationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array_identification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__3);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(480);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__2:
					case T__9:
					case T__10:
					case OPEN_PAR:
					case K_CURRENT_DATE:
					case K_CURRENT_TIME:
					case K_CURRENT_TIMESTAMP:
					case K_NULL:
					case K_TRUE:
					case K_FALSE:
					case IDENTIFIER:
					case NUMERIC_LITERAL:
					case STRING_LITERAL:
					case BLOB_LITERAL:
						{
						setState(474);
						expression();
						setState(475);
						match(COMMA);
						}
						break;
					case T__3:
						{
						setState(477);
						array_identification();
						setState(478);
						match(COMMA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__10:
			case OPEN_PAR:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_NULL:
			case K_TRUE:
			case K_FALSE:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(485);
				expression();
				}
				break;
			case T__3:
				{
				setState(486);
				array_identification();
				}
				break;
			case T__4:
				break;
			default:
				break;
			}
			setState(489);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_callContext extends ParserRuleContext {
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public Array_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArray_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArray_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArray_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_callContext array_call() throws RecognitionException {
		Array_callContext _localctx = new Array_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			array_name();
			setState(492);
			match(T__3);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==OPEN_PAR || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_CURRENT_DATE - 76)) | (1L << (K_CURRENT_TIME - 76)) | (1L << (K_CURRENT_TIMESTAMP - 76)) | (1L << (K_NULL - 76)))) != 0) || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (IDENTIFIER - 185)) | (1L << (NUMERIC_LITERAL - 185)) | (1L << (STRING_LITERAL - 185)) | (1L << (BLOB_LITERAL - 185)))) != 0)) {
				{
				setState(493);
				math_expression(0);
				}
			}

			setState(496);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public Array_identificationContext array_identification() {
			return getRuleContext(Array_identificationContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(IDENTIFIER);
			setState(499);
			match(T__5);
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(500);
				value();
				}
				break;
			case 2:
				{
				setState(501);
				json_object();
				}
				break;
			case 3:
				{
				setState(502);
				match(T__2);
				setState(503);
				value();
				setState(504);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(506);
				match(T__6);
				setState(507);
				value();
				setState(508);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(510);
				array_identification();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_objectContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Json_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJson_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJson_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJson_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_objectContext json_object() throws RecognitionException {
		Json_objectContext _localctx = new Json_objectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__0);
			setState(514);
			element();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(515);
				match(COMMA);
				setState(516);
				element();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SqlParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SqlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SqlParser.PLUS, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(K_PRINT);
			setState(525);
			match(OPEN_PAR);
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(526);
				expression();
				}
				break;
			case 2:
				{
				setState(527);
				string();
				}
				break;
			}
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(530);
				match(PLUS);
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(531);
					expression();
					}
					break;
				case 2:
					{
					setState(532);
					string();
					}
					break;
				}
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrContext extends ValueContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StrContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ValueContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValParenthContext extends ValueContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public ValParenthContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterValParenth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitValParenth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitValParenth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JavaFuncContext extends ValueContext {
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public JavaFuncContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJavaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJavaFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJavaFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralValContext extends ValueContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public LiteralValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteralVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteralVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteralVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				variable();
				}
				break;
			case 2:
				_localctx = new StrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				string();
				}
				break;
			case 3:
				_localctx = new JavaFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				java_function_call();
				}
				break;
			case 4:
				_localctx = new LiteralValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				literal_value();
				}
				break;
			case 5:
				_localctx = new ValParenthContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				match(OPEN_PAR);
				setState(547);
				value();
				setState(548);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				boolean_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				math_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				increment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_expressionContext extends ParserRuleContext {
		public Math_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expression; }
	 
		public Math_expressionContext() { }
		public void copyFrom(Math_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NbeDoubleNonBoolContext extends Math_expressionContext {
		public Token op;
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public NbeDoubleNonBoolContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNbeDoubleNonBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNbeDoubleNonBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNbeDoubleNonBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NbeValContext extends Math_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NbeValContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNbeVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNbeVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNbeVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NbeParenthContext extends Math_expressionContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public NbeParenthContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNbeParenth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNbeParenth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNbeParenth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_expressionContext math_expression() throws RecognitionException {
		return math_expression(0);
	}

	private Math_expressionContext math_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_expressionContext _localctx = new Math_expressionContext(_ctx, _parentState);
		Math_expressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_math_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				_localctx = new NbeValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(559);
				value();
				}
				break;
			case 2:
				{
				_localctx = new NbeParenthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(560);
				match(OPEN_PAR);
				setState(561);
				math_expression(0);
				setState(562);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NbeDoubleNonBoolContext(new Math_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
					setState(566);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(567);
					((NbeDoubleNonBoolContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2))) != 0)) ) {
						((NbeDoubleNonBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(568);
					math_expression(3);
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
	 
		public Boolean_expressionContext() { }
		public void copyFrom(Boolean_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValContext extends Boolean_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooltrueContext extends Boolean_expressionContext {
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public BooltrueContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBooltrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBooltrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBooltrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolfalseContext extends Boolean_expressionContext {
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public BoolfalseContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBoolfalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBoolfalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBoolfalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthContext extends Boolean_expressionContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public ParenthContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParenth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParenth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParenth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleBoolContext extends Boolean_expressionContext {
		public Token op;
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public DoubleBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDoubleBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDoubleBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDoubleBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleNonBoolContext extends Boolean_expressionContext {
		public Token op;
		public List<Math_expressionContext> math_expression() {
			return getRuleContexts(Math_expressionContext.class);
		}
		public Math_expressionContext math_expression(int i) {
			return getRuleContext(Math_expressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public DoubleNonBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDoubleNonBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDoubleNonBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDoubleNonBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		return boolean_expression(0);
	}

	private Boolean_expressionContext boolean_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, _parentState);
		Boolean_expressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_boolean_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new ValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(575);
				value();
				}
				break;
			case 2:
				{
				_localctx = new DoubleNonBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(576);
				math_expression(0);
				setState(577);
				((DoubleNonBoolContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
					((DoubleNonBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(578);
				math_expression(0);
				}
				break;
			case 3:
				{
				_localctx = new BooltrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(580);
				match(K_TRUE);
				}
				break;
			case 4:
				{
				_localctx = new BoolfalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(581);
				match(K_FALSE);
				}
				break;
			case 5:
				{
				_localctx = new ParenthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(582);
				match(OPEN_PAR);
				setState(583);
				boolean_expression(0);
				setState(584);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DoubleBoolContext(new Boolean_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
					setState(588);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(589);
					((DoubleBoolContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==PIPE2) ) {
						((DoubleBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(590);
					boolean_expression(5);
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_conditionContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<Logical_conditionContext> logical_condition() {
			return getRuleContexts(Logical_conditionContext.class);
		}
		public Logical_conditionContext logical_condition(int i) {
			return getRuleContext(Logical_conditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logical_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogical_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogical_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogical_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_conditionContext logical_condition() throws RecognitionException {
		Logical_conditionContext _localctx = new Logical_conditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_logical_condition);
		int _la;
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				boolean_expression(0);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(597);
					match(T__8);
					setState(600);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(598);
						logical_condition();
						}
						break;
					case 2:
						{
						setState(599);
						expression();
						}
						break;
					}
					setState(602);
					match(T__5);
					setState(605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(603);
						logical_condition();
						}
						break;
					case 2:
						{
						setState(604);
						expression();
						}
						break;
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(OPEN_PAR);
				setState(610);
				logical_condition();
				setState(611);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
	 
		public IncrementContext() { }
		public void copyFrom(IncrementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostIncContext extends IncrementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PostIncContext(IncrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPostInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPostInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPostInc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreDecContext extends IncrementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PreDecContext(IncrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPreDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPreDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPreDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecContext extends IncrementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PostDecContext(IncrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPostDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPostDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPostDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncContext extends IncrementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PreIncContext(IncrementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPreInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPreInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPreInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_increment);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new PostIncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				variable();
				setState(616);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new PreIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(T__9);
				setState(619);
				variable();
				}
				break;
			case 3:
				_localctx = new PostDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				variable();
				setState(621);
				match(T__10);
				}
				break;
			case 4:
				_localctx = new PreDecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				match(T__10);
				setState(624);
				variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_stmtContext extends ParserRuleContext {
		public List<If_stmtContext> if_stmt() {
			return getRuleContexts(If_stmtContext.class);
		}
		public If_stmtContext if_stmt(int i) {
			return getRuleContext(If_stmtContext.class,i);
		}
		public List<Else_if_stmtContext> else_if_stmt() {
			return getRuleContexts(Else_if_stmtContext.class);
		}
		public Else_if_stmtContext else_if_stmt(int i) {
			return getRuleContext(Else_if_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public Conditional_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConditional_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConditional_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConditional_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_stmtContext conditional_stmt() throws RecognitionException {
		Conditional_stmtContext _localctx = new Conditional_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditional_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(629);
					if_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(632); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(634);
					else_if_stmt();
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(640);
				else_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(K_IF);
			setState(644);
			match(OPEN_PAR);
			setState(645);
			boolean_expression(0);
			setState(646);
			match(CLOSE_PAR);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(647);
				block();
				}
				break;
			case 2:
				{
				setState(648);
				one_line_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_stmtContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public Else_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterElse_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitElse_if_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitElse_if_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_stmtContext else_if_stmt() throws RecognitionException {
		Else_if_stmtContext _localctx = new Else_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(K_ELSE);
			setState(652);
			match(K_IF);
			setState(653);
			match(OPEN_PAR);
			setState(654);
			boolean_expression(0);
			setState(655);
			match(CLOSE_PAR);
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(656);
				block();
				}
				break;
			case 2:
				{
				setState(657);
				one_line_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitElse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitElse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(K_ELSE);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(661);
				block();
				}
				break;
			case 2:
				{
				setState(662);
				one_line_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_stmtContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public For_each_loopContext for_each_loop() {
			return getRuleContext(For_each_loopContext.class,0);
		}
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLoop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLoop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLoop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_loop_stmt);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				do_while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				for_each_loop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			match(K_FOR);
			setState(672);
			match(OPEN_PAR);
			setState(673);
			variable_declaration();
			setState(674);
			match(SCOL);
			setState(675);
			boolean_expression(0);
			setState(676);
			match(SCOL);
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(677);
				increment();
				}
				break;
			case 2:
				{
				setState(678);
				variable_assignment();
				}
				break;
			}
			setState(681);
			match(CLOSE_PAR);
			}
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(683);
				block();
				}
				break;
			case 2:
				{
				setState(684);
				one_line_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687);
			match(K_WHILE);
			setState(688);
			match(OPEN_PAR);
			setState(689);
			boolean_expression(0);
			setState(690);
			match(CLOSE_PAR);
			}
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(692);
				block();
				}
				break;
			case 2:
				{
				setState(693);
				one_line_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SqlParser.K_DO, 0); }
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDo_while_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDo_while_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(K_DO);
			{
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(697);
				block();
				}
				break;
			case 2:
				{
				setState(698);
				one_line_block();
				}
				break;
			}
			}
			setState(701);
			match(K_WHILE);
			setState(702);
			match(OPEN_PAR);
			setState(703);
			boolean_expression(0);
			setState(704);
			match(CLOSE_PAR);
			setState(705);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_each_loopContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public For_each_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_each_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_each_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_each_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_each_loopContext for_each_loop() throws RecognitionException {
		For_each_loopContext _localctx = new For_each_loopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(K_FOR);
			setState(708);
			match(OPEN_PAR);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(709);
				match(K_VAR);
				}
			}

			setState(712);
			variable();
			setState(713);
			match(T__5);
			setState(714);
			array_name();
			setState(715);
			match(CLOSE_PAR);
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(716);
				block();
				}
				break;
			case 2:
				{
				setState(717);
				one_line_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public Switch_defaultContext switch_default() {
			return getRuleContext(Switch_defaultContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(K_SWITCH);
			setState(721);
			match(OPEN_PAR);
			setState(722);
			value();
			setState(723);
			match(CLOSE_PAR);
			setState(724);
			match(T__0);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(725);
				switch_case();
				}
				}
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(731);
				switch_default();
				}
			}

			setState(734);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switch_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(736);
			match(K_CASE);
			{
			setState(737);
			value();
			}
			setState(738);
			match(T__5);
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(739);
				block();
				}
				break;
			case 2:
				{
				setState(740);
				one_line_block();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public Switch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitch_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitch_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitch_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_defaultContext switch_default() throws RecognitionException {
		Switch_defaultContext _localctx = new Switch_defaultContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switch_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(743);
			match(K_DEFAULT);
			setState(744);
			match(T__5);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(745);
				block();
				}
				break;
			case 2:
				{
				setState(746);
				one_line_block();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(749);
				match(SCOL);
				}
				}
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(755);
			sql_stmt();
			setState(764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(756);
						match(SCOL);
						}
						}
						setState(759); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(761);
					sql_stmt();
					}
					} 
				}
				setState(766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					match(SCOL);
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
				setState(773);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(774);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(775);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
				setState(776);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(777);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(778);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(779);
				update_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(K_ALTER);
			setState(783);
			match(K_TABLE);
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(784);
				database_name();
				setState(785);
				match(DOT);
				}
				break;
			}
			setState(789);
			source_table_name();
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(790);
				match(K_RENAME);
				setState(791);
				match(K_TO);
				setState(792);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(793);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(794);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(795);
				match(K_ADD);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(796);
					match(K_COLUMN);
					}
				}

				setState(799);
				column_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(K_ADD);
			setState(803);
			match(K_CONSTRAINT);
			setState(804);
			any_name();
			setState(805);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(K_ADD);
			setState(808);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(K_CREATE);
			setState(811);
			match(K_TABLE);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(812);
				match(K_IF);
				setState(813);
				match(K_NOT);
				setState(814);
				match(K_EXISTS);
				}
			}

			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(817);
				database_name();
				setState(818);
				match(DOT);
				}
				break;
			}
			setState(822);
			table_name();
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(823);
				match(OPEN_PAR);
				setState(824);
				column_def();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(829);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(825);
						match(COMMA);
						setState(826);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(827);
						match(COMMA);
						setState(828);
						column_def();
						}
						break;
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(834);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(836);
				match(K_AS);
				setState(837);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(K_DELETE);
			setState(841);
			match(K_FROM);
			setState(842);
			qualified_table_name();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(843);
				match(K_WHERE);
				setState(844);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(K_DROP);
			setState(848);
			match(K_TABLE);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(849);
				match(K_IF);
				setState(850);
				match(K_EXISTS);
				}
			}

			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(853);
				database_name();
				setState(854);
				match(DOT);
				}
				break;
			}
			setState(858);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			select_core();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(861);
				match(K_ORDER);
				setState(862);
				match(K_BY);
				setState(863);
				ordering_term();
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(864);
					match(COMMA);
					setState(865);
					ordering_term();
					}
					}
					setState(870);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(873);
				match(K_LIMIT);
				setState(874);
				expr(0);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(875);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(876);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(K_INSERT);
			setState(882);
			match(K_INTO);
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(883);
				database_name();
				setState(884);
				match(DOT);
				}
				break;
			}
			setState(888);
			table_name();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(889);
				match(OPEN_PAR);
				setState(890);
				column_name();
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(891);
					match(COMMA);
					setState(892);
					column_name();
					}
					}
					setState(897);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(898);
				match(CLOSE_PAR);
				}
			}

			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(902);
				match(K_VALUES);
				setState(903);
				match(OPEN_PAR);
				setState(904);
				expr(0);
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(905);
					match(COMMA);
					setState(906);
					expr(0);
					}
					}
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(912);
				match(CLOSE_PAR);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(913);
					match(COMMA);
					setState(914);
					match(OPEN_PAR);
					setState(915);
					expr(0);
					setState(920);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(916);
						match(COMMA);
						setState(917);
						expr(0);
						}
						}
						setState(922);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(923);
					match(CLOSE_PAR);
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(930);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(931);
				match(K_DEFAULT);
				setState(932);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			select_or_values();
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(936);
				match(K_ORDER);
				setState(937);
				match(K_BY);
				setState(938);
				ordering_term();
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(939);
					match(COMMA);
					setState(940);
					ordering_term();
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(948);
				match(K_LIMIT);
				setState(949);
				expr(0);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(950);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(951);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_select_or_values);
		int _la;
		try {
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				match(K_SELECT);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(957);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(960);
				result_column();
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(961);
					match(COMMA);
					setState(962);
					result_column();
					}
					}
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(968);
					match(K_FROM);
					setState(978);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(969);
						table_or_subquery();
						setState(974);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(970);
							match(COMMA);
							setState(971);
							table_or_subquery();
							}
							}
							setState(976);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(977);
						join_clause();
						}
						break;
					}
					}
				}

				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(982);
					match(K_WHERE);
					setState(983);
					expr(0);
					}
				}

				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(986);
					match(K_GROUP);
					setState(987);
					match(K_BY);
					setState(988);
					expr(0);
					setState(993);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(989);
						match(COMMA);
						setState(990);
						expr(0);
						}
						}
						setState(995);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(998);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(996);
						match(K_HAVING);
						setState(997);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				match(K_VALUES);
				setState(1003);
				match(OPEN_PAR);
				setState(1004);
				expr(0);
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1005);
					match(COMMA);
					setState(1006);
					expr(0);
					}
					}
					setState(1011);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1012);
				match(CLOSE_PAR);
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1013);
					match(COMMA);
					setState(1014);
					match(OPEN_PAR);
					setState(1015);
					expr(0);
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1016);
						match(COMMA);
						setState(1017);
						expr(0);
						}
						}
						setState(1022);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1023);
					match(CLOSE_PAR);
					}
					}
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(K_UPDATE);
			setState(1033);
			qualified_table_name();
			setState(1034);
			match(K_SET);
			setState(1035);
			column_name();
			setState(1036);
			match(ASSIGN);
			setState(1037);
			expr(0);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1038);
				match(COMMA);
				setState(1039);
				column_name();
				setState(1040);
				match(ASSIGN);
				setState(1041);
				expr(0);
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1048);
				match(K_WHERE);
				setState(1049);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			column_name();
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (OPEN_PAR - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_DEFAULT - 25)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (K_NOT - 130)) | (1L << (K_NULL - 130)) | (1L << (K_PRIMARY - 130)) | (1L << (K_REFERENCES - 130)) | (1L << (K_UNIQUE - 130)) | (1L << (IDENTIFIER - 130)) | (1L << (STRING_LITERAL - 130)))) != 0)) {
				{
				setState(1055);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_CHECK:
				case K_COLLATE:
				case K_CONSTRAINT:
				case K_DEFAULT:
				case K_NOT:
				case K_NULL:
				case K_PRIMARY:
				case K_REFERENCES:
				case K_UNIQUE:
					{
					setState(1053);
					column_constraint();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1054);
					type_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			name();
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1061);
				match(OPEN_PAR);
				setState(1062);
				signed_number();
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1063);
					any_name();
					}
				}

				setState(1066);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1068);
				match(OPEN_PAR);
				setState(1069);
				signed_number();
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1070);
					any_name();
					}
				}

				setState(1073);
				match(COMMA);
				setState(1074);
				signed_number();
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1075);
					any_name();
					}
				}

				setState(1078);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1082);
				match(K_CONSTRAINT);
				setState(1083);
				name();
				}
			}

			setState(1099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1086);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1087);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1088);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1089);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1090);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(1091);
				match(K_CHECK);
				setState(1092);
				match(OPEN_PAR);
				setState(1093);
				expr(0);
				setState(1094);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1096);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1097);
				match(K_COLLATE);
				setState(1098);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			match(K_PRIMARY);
			setState(1102);
			match(K_KEY);
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1103);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(1106);
				match(K_AUTOINCREMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(K_NOT);
			setState(1112);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(K_DEFAULT);
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1117);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1118);
				match(OPEN_PAR);
				setState(1119);
				expr(0);
				setState(1120);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1122);
				match(K_NEXTVAL);
				setState(1123);
				match(OPEN_PAR);
				setState(1124);
				expr(0);
				setState(1125);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1127);
				any_name();
				}
				break;
			}
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(1130);
				match(T__21);
				setState(1132); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1131);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1134); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1138);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1139);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SqlParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SqlParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1143);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						setState(1144);
						database_name();
						setState(1145);
						match(DOT);
						}
						break;
					}
					setState(1149);
					table_name();
					setState(1150);
					match(DOT);
					}
					break;
				}
				setState(1154);
				column_name();
				}
				break;
			case 3:
				{
				setState(1155);
				unary_operator();
				setState(1156);
				expr(13);
				}
				break;
			case 4:
				{
				setState(1158);
				function_name();
				setState(1159);
				match(OPEN_PAR);
				setState(1172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_EXISTS:
				case K_NOT:
				case K_NULL:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1160);
						match(K_DISTINCT);
						}
					}

					setState(1163);
					expr(0);
					setState(1168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1164);
						match(COMMA);
						setState(1165);
						expr(0);
						}
						}
						setState(1170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1171);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1174);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(1176);
				match(OPEN_PAR);
				setState(1177);
				expr(0);
				setState(1178);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1180);
						match(K_NOT);
						}
					}

					setState(1183);
					match(K_EXISTS);
					}
				}

				setState(1186);
				match(OPEN_PAR);
				setState(1187);
				select_stmt();
				setState(1188);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1192);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1193);
						match(PIPE2);
						setState(1194);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1195);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1196);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1197);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1198);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1199);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1200);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1201);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1202);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1203);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1204);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1205);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1206);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1220);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
						case 1:
							{
							setState(1208);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1209);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1210);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1211);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1212);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1213);
							match(K_IS);
							setState(1214);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1215);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1216);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1217);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1218);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1219);
							match(K_REGEXP);
							}
							break;
						}
						setState(1222);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1223);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1224);
						match(K_AND);
						setState(1225);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1226);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1227);
						match(K_OR);
						setState(1228);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1229);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1231);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1230);
							match(K_NOT);
							}
						}

						setState(1233);
						match(K_IN);
						setState(1253);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
						case 1:
							{
							setState(1234);
							match(OPEN_PAR);
							setState(1244);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(1235);
								select_stmt();
								}
								break;
							case OPEN_PAR:
							case PLUS:
							case MINUS:
							case TILDE:
							case K_CURRENT_DATE:
							case K_CURRENT_TIME:
							case K_CURRENT_TIMESTAMP:
							case K_EXISTS:
							case K_NOT:
							case K_NULL:
							case IDENTIFIER:
							case NUMERIC_LITERAL:
							case STRING_LITERAL:
							case BLOB_LITERAL:
								{
								setState(1236);
								expr(0);
								setState(1241);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1237);
									match(COMMA);
									setState(1238);
									expr(0);
									}
									}
									setState(1243);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							case CLOSE_PAR:
								break;
							default:
								break;
							}
							setState(1246);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1250);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
							case 1:
								{
								setState(1247);
								database_name();
								setState(1248);
								match(DOT);
								}
								break;
							}
							setState(1252);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SqlParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SqlParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SqlParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SqlParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SqlParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SqlParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SqlParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SqlParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SqlParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SqlParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SqlParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SqlParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SqlParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SqlParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SqlParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SqlParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SqlParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SqlParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SqlParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SqlParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SqlParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SqlParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(K_REFERENCES);
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1261);
				database_name();
				setState(1262);
				match(DOT);
				}
				break;
			}
			setState(1266);
			foreign_table();
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1267);
				match(OPEN_PAR);
				setState(1268);
				fk_target_column_name();
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1269);
					match(COMMA);
					setState(1270);
					fk_target_column_name();
					}
					}
					setState(1275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1276);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1280);
					match(K_ON);
					setState(1281);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1282);
						match(K_SET);
						setState(1283);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1284);
						match(K_SET);
						setState(1285);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1286);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1287);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1288);
						match(K_NO);
						setState(1289);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1292);
					match(K_MATCH);
					setState(1293);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1301);
					match(K_NOT);
					}
				}

				setState(1304);
				match(K_DEFERRABLE);
				setState(1309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1305);
					match(K_INITIALLY);
					setState(1306);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1307);
					match(K_INITIALLY);
					setState(1308);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1311);
					match(K_ENABLE);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			column_name();
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1319);
				match(K_COLLATE);
				setState(1320);
				collation_name();
				}
			}

			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1323);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1326);
				match(K_CONSTRAINT);
				setState(1327);
				name();
				}
			}

			setState(1339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1330);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1331);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1332);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1333);
				match(K_CHECK);
				setState(1334);
				match(OPEN_PAR);
				setState(1335);
				expr(0);
				setState(1336);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1338);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			match(K_PRIMARY);
			setState(1342);
			match(K_KEY);
			setState(1343);
			match(OPEN_PAR);
			setState(1344);
			indexed_column();
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1345);
				match(COMMA);
				setState(1346);
				indexed_column();
				}
				}
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1352);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(K_FOREIGN);
			setState(1355);
			match(K_KEY);
			setState(1356);
			match(OPEN_PAR);
			setState(1357);
			fk_origin_column_name();
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1358);
				match(COMMA);
				setState(1359);
				fk_origin_column_name();
				}
				}
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1365);
			match(CLOSE_PAR);
			setState(1366);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(K_UNIQUE);
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1369);
				match(K_KEY);
				}
			}

			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1372);
				name();
				}
				break;
			}
			setState(1375);
			match(OPEN_PAR);
			setState(1376);
			indexed_column();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1377);
				match(COMMA);
				setState(1378);
				indexed_column();
				}
				}
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1384);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(K_KEY);
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1387);
				name();
				}
				break;
			}
			setState(1390);
			match(OPEN_PAR);
			setState(1391);
			indexed_column();
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1392);
				match(COMMA);
				setState(1393);
				indexed_column();
				}
				}
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1399);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1403);
				database_name();
				setState(1404);
				match(DOT);
				}
				break;
			}
			setState(1408);
			table_name();
			setState(1414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1409);
				match(K_INDEXED);
				setState(1410);
				match(K_BY);
				setState(1411);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1412);
				match(K_NOT);
				setState(1413);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_INSERT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VALUES:
			case K_WHERE:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			expr(0);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1417);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_pragma_value);
		try {
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1420);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1421);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1422);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			table_name();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1426);
				match(OPEN_PAR);
				setState(1427);
				column_name();
				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1428);
					match(COMMA);
					setState(1429);
					column_name();
					}
					}
					setState(1434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1435);
				match(CLOSE_PAR);
				}
			}

			setState(1439);
			match(K_AS);
			setState(1440);
			match(OPEN_PAR);
			setState(1441);
			select_stmt();
			setState(1442);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_result_column);
		int _la;
		try {
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1445);
				table_name();
				setState(1446);
				match(DOT);
				setState(1447);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1449);
				expr(0);
				setState(1454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1450);
						match(K_AS);
						}
					}

					setState(1453);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_table_or_subquery);
		int _la;
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1458);
					database_name();
					setState(1459);
					match(DOT);
					}
					break;
				}
				setState(1463);
				table_name();
				setState(1468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1464);
						match(K_AS);
						}
					}

					setState(1467);
					table_alias();
					}
				}

				setState(1475);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1470);
					match(K_INDEXED);
					setState(1471);
					match(K_BY);
					setState(1472);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1473);
					match(K_NOT);
					setState(1474);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_ON:
				case K_ORDER:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
				case K_WHERE:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				match(OPEN_PAR);
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1478);
					table_or_subquery();
					setState(1483);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1479);
						match(COMMA);
						setState(1480);
						table_or_subquery();
						}
						}
						setState(1485);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1486);
					join_clause();
					}
					break;
				}
				setState(1489);
				match(CLOSE_PAR);
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(1491);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1490);
						match(K_AS);
						}
					}

					setState(1493);
					table_alias();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				match(OPEN_PAR);
				setState(1497);
				select_stmt();
				setState(1498);
				match(CLOSE_PAR);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(1500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1499);
						match(K_AS);
						}
					}

					setState(1502);
					table_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			table_or_subquery();
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (K_INNER - 114)) | (1L << (K_JOIN - 114)) | (1L << (K_LEFT - 114)))) != 0)) {
				{
				{
				setState(1508);
				join_operator();
				setState(1509);
				table_or_subquery();
				setState(1510);
				join_constraint();
				}
				}
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_join_operator);
		int _la;
		try {
			setState(1526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1517);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1518);
					match(K_LEFT);
					setState(1520);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1519);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1522);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1525);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1528);
				match(K_ON);
				setState(1529);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_select_core);
		int _la;
		try {
			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				match(K_SELECT);
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1533);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1536);
				result_column();
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1537);
					match(COMMA);
					setState(1538);
					result_column();
					}
					}
					setState(1543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1544);
					match(K_FROM);
					setState(1554);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						setState(1545);
						table_or_subquery();
						setState(1550);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1546);
							match(COMMA);
							setState(1547);
							table_or_subquery();
							}
							}
							setState(1552);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1553);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1558);
					match(K_WHERE);
					setState(1559);
					expr(0);
					}
				}

				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1562);
					match(K_GROUP);
					setState(1563);
					match(K_BY);
					setState(1564);
					expr(0);
					setState(1569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1565);
						match(COMMA);
						setState(1566);
						expr(0);
						}
						}
						setState(1571);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1572);
						match(K_HAVING);
						setState(1573);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1578);
				match(K_VALUES);
				setState(1579);
				match(OPEN_PAR);
				setState(1580);
				expr(0);
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1581);
					match(COMMA);
					setState(1582);
					expr(0);
					}
					}
					setState(1587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1588);
				match(CLOSE_PAR);
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1589);
					match(COMMA);
					setState(1590);
					match(OPEN_PAR);
					setState(1591);
					expr(0);
					setState(1596);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1592);
						match(COMMA);
						setState(1593);
						expr(0);
						}
						}
						setState(1598);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1599);
					match(CLOSE_PAR);
					}
					}
					setState(1605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			table_name();
			setState(1620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1609);
				match(OPEN_PAR);
				setState(1610);
				column_name();
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1611);
					match(COMMA);
					setState(1612);
					column_name();
					}
					}
					setState(1617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1618);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1622);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1625);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1626);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_literal_value);
		try {
			setState(1640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1629);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1631);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1632);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(1633);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1634);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1635);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(1636);
				match(OPEN_PAR);
				setState(1637);
				literal_value();
				setState(1638);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_module_argument);
		try {
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SqlParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SqlParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SqlParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SqlParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SqlParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SqlParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SqlParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SqlParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SqlParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SqlParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SqlParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SqlParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SqlParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SqlParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SqlParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SqlParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SqlParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SqlParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SqlParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SqlParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SqlParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SqlParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SqlParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SqlParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SqlParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SqlParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SqlParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SqlParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SqlParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SqlParser.K_NEXTVAL, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1654);
				matchWildcard();
				}
				}
				setState(1657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BREAK) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DO - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)) | (1L << (SINGLE_LINE_COMMENT - 128)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (MULTILINE_COMMENT - 192)) | (1L << (SPACES - 192)) | (1L << (UNEXPECTED_CHAR - 192)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_IDContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Method_IDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_ID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMethod_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMethod_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMethod_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_IDContext method_ID() throws RecognitionException {
		Method_IDContext _localctx = new Method_IDContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_method_ID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Array_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArray_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArray_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArray_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nameContext array_name() throws RecognitionException {
		Array_nameContext _localctx = new Array_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_any_name);
		try {
			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1699);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1700);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1701);
				match(OPEN_PAR);
				setState(1702);
				any_name();
				setState(1703);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		case 29:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		case 67:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expression_sempred(Math_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolean_expression_sempred(Boolean_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c4\u06ae\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\3"+
		"\2\3\2\7\2\u00ef\n\2\f\2\16\2\u00f2\13\2\3\2\3\2\5\2\u00f6\n\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4\u00ff\n\4\3\4\3\4\7\4\u0103\n\4\f\4\16\4\u0106"+
		"\13\4\3\4\5\4\u0109\n\4\3\4\3\4\3\4\5\4\u010e\n\4\3\4\3\4\3\4\5\4\u0113"+
		"\n\4\3\4\5\4\u0116\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u011f\n\6\3\6\3"+
		"\6\3\6\7\6\u0124\n\6\f\6\16\6\u0127\13\6\3\6\5\6\u012a\n\6\3\6\3\6\3\6"+
		"\7\6\u012f\n\6\f\6\16\6\u0132\13\6\5\6\u0134\n\6\3\7\5\7\u0137\n\7\3\7"+
		"\3\7\7\7\u013b\n\7\f\7\16\7\u013e\13\7\3\b\3\b\3\b\5\b\u0143\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\5\t\u014a\n\t\3\t\5\t\u014d\n\t\3\t\3\t\3\t\5\t\u0152\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u015c\n\n\f\n\16\n\u015f\13\n\3"+
		"\n\3\n\3\13\3\13\5\13\u0165\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u016c\n\f\3"+
		"\r\3\r\3\r\3\r\7\r\u0172\n\r\f\r\16\r\u0175\13\r\3\r\3\r\3\16\5\16\u017a"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u0184\n\17\f\17\16"+
		"\17\u0187\13\17\3\17\5\17\u018a\n\17\3\17\3\17\3\20\3\20\5\20\u0190\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01aa\n\21"+
		"\f\21\16\21\u01ad\13\21\3\21\5\21\u01b0\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01b6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01be\n\22\3\23\3\23\5"+
		"\23\u01c2\n\23\3\24\3\24\3\24\3\24\7\24\u01c8\n\24\f\24\16\24\u01cb\13"+
		"\24\3\25\3\25\3\25\3\25\7\25\u01d1\n\25\f\25\16\25\u01d4\13\25\3\26\3"+
		"\26\3\26\3\26\5\26\u01da\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u01e3\n\27\f\27\16\27\u01e6\13\27\3\27\3\27\5\27\u01ea\n\27\3\27\3\27"+
		"\3\30\3\30\3\30\5\30\u01f1\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0202\n\31\3\32\3\32\3\32\3\32"+
		"\7\32\u0208\n\32\f\32\16\32\u020b\13\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\5\33\u0213\n\33\3\33\3\33\3\33\5\33\u0218\n\33\7\33\u021a\n\33\f\33\16"+
		"\33\u021d\13\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0229\n\34\3\35\3\35\3\35\3\35\5\35\u022f\n\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u0237\n\36\3\36\3\36\3\36\7\36\u023c\n\36\f\36\16\36\u023f"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u024d\n\37\3\37\3\37\3\37\7\37\u0252\n\37\f\37\16\37\u0255\13\37\3 \3"+
		" \3 \3 \5 \u025b\n \3 \3 \3 \5 \u0260\n \5 \u0262\n \3 \3 \3 \3 \5 \u0268"+
		"\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0274\n!\3\"\3\"\3#\6#\u0279\n#\r"+
		"#\16#\u027a\3#\7#\u027e\n#\f#\16#\u0281\13#\3#\5#\u0284\n#\3$\3$\3$\3"+
		"$\3$\3$\5$\u028c\n$\3%\3%\3%\3%\3%\3%\3%\5%\u0295\n%\3&\3&\3&\5&\u029a"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u02a0\n\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02aa\n("+
		"\3(\3(\3(\3(\5(\u02b0\n(\3)\3)\3)\3)\3)\3)\3)\5)\u02b9\n)\3*\3*\3*\5*"+
		"\u02be\n*\3*\3*\3*\3*\3*\3*\3+\3+\3+\5+\u02c9\n+\3+\3+\3+\3+\3+\3+\5+"+
		"\u02d1\n+\3,\3,\3,\3,\3,\3,\7,\u02d9\n,\f,\16,\u02dc\13,\3,\5,\u02df\n"+
		",\3,\3,\3-\3-\3-\3-\3-\5-\u02e8\n-\3.\3.\3.\3.\5.\u02ee\n.\3/\7/\u02f1"+
		"\n/\f/\16/\u02f4\13/\3/\3/\6/\u02f8\n/\r/\16/\u02f9\3/\7/\u02fd\n/\f/"+
		"\16/\u0300\13/\3/\7/\u0303\n/\f/\16/\u0306\13/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u030f\n\60\3\61\3\61\3\61\3\61\3\61\5\61\u0316\n\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0320\n\61\3\61\5\61\u0323"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0332\n\64\3\64\3\64\3\64\5\64\u0337\n\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\7\64\u0340\n\64\f\64\16\64\u0343\13\64\3\64\3\64\3\64\3"+
		"\64\5\64\u0349\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u0350\n\65\3\66\3\66"+
		"\3\66\3\66\5\66\u0356\n\66\3\66\3\66\3\66\5\66\u035b\n\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\7\67\u0365\n\67\f\67\16\67\u0368\13\67\5"+
		"\67\u036a\n\67\3\67\3\67\3\67\3\67\5\67\u0370\n\67\5\67\u0372\n\67\38"+
		"\38\38\38\38\58\u0379\n8\38\38\38\38\38\78\u0380\n8\f8\168\u0383\138\3"+
		"8\38\58\u0387\n8\38\38\38\38\38\78\u038e\n8\f8\168\u0391\138\38\38\38"+
		"\38\38\38\78\u0399\n8\f8\168\u039c\138\38\38\78\u03a0\n8\f8\168\u03a3"+
		"\138\38\38\38\58\u03a8\n8\39\39\39\39\39\39\79\u03b0\n9\f9\169\u03b3\13"+
		"9\59\u03b5\n9\39\39\39\39\59\u03bb\n9\59\u03bd\n9\3:\3:\5:\u03c1\n:\3"+
		":\3:\3:\7:\u03c6\n:\f:\16:\u03c9\13:\3:\3:\3:\3:\7:\u03cf\n:\f:\16:\u03d2"+
		"\13:\3:\5:\u03d5\n:\5:\u03d7\n:\3:\3:\5:\u03db\n:\3:\3:\3:\3:\3:\7:\u03e2"+
		"\n:\f:\16:\u03e5\13:\3:\3:\5:\u03e9\n:\5:\u03eb\n:\3:\3:\3:\3:\3:\7:\u03f2"+
		"\n:\f:\16:\u03f5\13:\3:\3:\3:\3:\3:\3:\7:\u03fd\n:\f:\16:\u0400\13:\3"+
		":\3:\7:\u0404\n:\f:\16:\u0407\13:\5:\u0409\n:\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\7;\u0416\n;\f;\16;\u0419\13;\3;\3;\5;\u041d\n;\3<\3<\3<\7<\u0422"+
		"\n<\f<\16<\u0425\13<\3=\3=\3=\3=\5=\u042b\n=\3=\3=\3=\3=\3=\5=\u0432\n"+
		"=\3=\3=\3=\5=\u0437\n=\3=\3=\5=\u043b\n=\3>\3>\5>\u043f\n>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u044e\n>\3?\3?\3?\5?\u0453\n?\3?\5?\u0456"+
		"\n?\3@\3@\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u046b"+
		"\nC\3C\3C\6C\u046f\nC\rC\16C\u0470\5C\u0473\nC\3D\3D\5D\u0477\nD\3E\3"+
		"E\3E\3E\3E\5E\u047e\nE\3E\3E\3E\5E\u0483\nE\3E\3E\3E\3E\3E\3E\3E\5E\u048c"+
		"\nE\3E\3E\3E\7E\u0491\nE\fE\16E\u0494\13E\3E\5E\u0497\nE\3E\3E\3E\3E\3"+
		"E\3E\3E\5E\u04a0\nE\3E\5E\u04a3\nE\3E\3E\3E\3E\5E\u04a9\nE\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\5E\u04c7\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u04d2\nE\3E\3E\3E\3E\3"+
		"E\3E\7E\u04da\nE\fE\16E\u04dd\13E\5E\u04df\nE\3E\3E\3E\3E\5E\u04e5\nE"+
		"\3E\5E\u04e8\nE\7E\u04ea\nE\fE\16E\u04ed\13E\3F\3F\3F\3F\5F\u04f3\nF\3"+
		"F\3F\3F\3F\3F\7F\u04fa\nF\fF\16F\u04fd\13F\3F\3F\5F\u0501\nF\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\5F\u050d\nF\3F\3F\5F\u0511\nF\7F\u0513\nF\fF\16"+
		"F\u0516\13F\3F\5F\u0519\nF\3F\3F\3F\3F\3F\5F\u0520\nF\3F\5F\u0523\nF\5"+
		"F\u0525\nF\3G\3G\3H\3H\3H\5H\u052c\nH\3H\5H\u052f\nH\3I\3I\5I\u0533\n"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u053e\nI\3J\3J\3J\3J\3J\3J\7J\u0546\n"+
		"J\fJ\16J\u0549\13J\3J\3J\3K\3K\3K\3K\3K\3K\7K\u0553\nK\fK\16K\u0556\13"+
		"K\3K\3K\3K\3L\3L\5L\u055d\nL\3L\5L\u0560\nL\3L\3L\3L\3L\7L\u0566\nL\f"+
		"L\16L\u0569\13L\3L\3L\3M\3M\5M\u056f\nM\3M\3M\3M\3M\7M\u0575\nM\fM\16"+
		"M\u0578\13M\3M\3M\3N\3N\3O\3O\3O\5O\u0581\nO\3O\3O\3O\3O\3O\3O\5O\u0589"+
		"\nO\3P\3P\5P\u058d\nP\3Q\3Q\3Q\5Q\u0592\nQ\3R\3R\3R\3R\3R\7R\u0599\nR"+
		"\fR\16R\u059c\13R\3R\3R\5R\u05a0\nR\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3"+
		"S\5S\u05ae\nS\3S\5S\u05b1\nS\5S\u05b3\nS\3T\3T\3T\5T\u05b8\nT\3T\3T\5"+
		"T\u05bc\nT\3T\5T\u05bf\nT\3T\3T\3T\3T\3T\5T\u05c6\nT\3T\3T\3T\3T\7T\u05cc"+
		"\nT\fT\16T\u05cf\13T\3T\5T\u05d2\nT\3T\3T\5T\u05d6\nT\3T\5T\u05d9\nT\3"+
		"T\3T\3T\3T\5T\u05df\nT\3T\5T\u05e2\nT\5T\u05e4\nT\3U\3U\3U\3U\3U\7U\u05eb"+
		"\nU\fU\16U\u05ee\13U\3V\3V\3V\5V\u05f3\nV\3V\5V\u05f6\nV\3V\5V\u05f9\n"+
		"V\3W\3W\5W\u05fd\nW\3X\3X\5X\u0601\nX\3X\3X\3X\7X\u0606\nX\fX\16X\u0609"+
		"\13X\3X\3X\3X\3X\7X\u060f\nX\fX\16X\u0612\13X\3X\5X\u0615\nX\5X\u0617"+
		"\nX\3X\3X\5X\u061b\nX\3X\3X\3X\3X\3X\7X\u0622\nX\fX\16X\u0625\13X\3X\3"+
		"X\5X\u0629\nX\5X\u062b\nX\3X\3X\3X\3X\3X\7X\u0632\nX\fX\16X\u0635\13X"+
		"\3X\3X\3X\3X\3X\3X\7X\u063d\nX\fX\16X\u0640\13X\3X\3X\7X\u0644\nX\fX\16"+
		"X\u0647\13X\5X\u0649\nX\3Y\3Y\3Y\3Y\3Y\7Y\u0650\nY\fY\16Y\u0653\13Y\3"+
		"Y\3Y\5Y\u0657\nY\3Z\5Z\u065a\nZ\3Z\3Z\5Z\u065e\nZ\3[\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\5[\u066b\n[\3\\\3\\\3]\3]\3^\3^\5^\u0673\n^\3_\3_\3`\3`"+
		"\3a\6a\u067a\na\ra\16a\u067b\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3"+
		"h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3"+
		"t\3t\3u\3u\3v\3v\3v\3v\3v\3v\5v\u06ac\nv\3v\2\5:<\u0088w\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\2\21\4\2\37!$\'\3\2*"+
		"\60\4\2\n\n##\4\2\16\27\36\36\4\2\35\35\u0088\u0088\4\2\65\65XX\4\2::"+
		"VV\4\2\37\37$%\3\2 !\3\2&)\3\2*-\4\2UU\u00ad\u00ad\4\2 \"\u0084\u0084"+
		"\4\2\u00bb\u00bb\u00be\u00be\r\2\61?AJLXZhj\u0089\u008b\u0090\u0092\u009b"+
		"\u009d\u00a2\u00a4\u00b2\u00b4\u00b5\u00b7\u00b8\2\u0770\2\u00f5\3\2\2"+
		"\2\4\u00f7\3\2\2\2\6\u0115\3\2\2\2\b\u0117\3\2\2\2\n\u011e\3\2\2\2\f\u0136"+
		"\3\2\2\2\16\u013f\3\2\2\2\20\u0146\3\2\2\2\22\u0155\3\2\2\2\24\u0162\3"+
		"\2\2\2\26\u016b\3\2\2\2\30\u016d\3\2\2\2\32\u0179\3\2\2\2\34\u0181\3\2"+
		"\2\2\36\u018f\3\2\2\2 \u01af\3\2\2\2\"\u01bd\3\2\2\2$\u01c1\3\2\2\2&\u01c3"+
		"\3\2\2\2(\u01cc\3\2\2\2*\u01d9\3\2\2\2,\u01db\3\2\2\2.\u01ed\3\2\2\2\60"+
		"\u01f4\3\2\2\2\62\u0203\3\2\2\2\64\u020e\3\2\2\2\66\u0228\3\2\2\28\u022e"+
		"\3\2\2\2:\u0236\3\2\2\2<\u024c\3\2\2\2>\u0267\3\2\2\2@\u0273\3\2\2\2B"+
		"\u0275\3\2\2\2D\u0278\3\2\2\2F\u0285\3\2\2\2H\u028d\3\2\2\2J\u0296\3\2"+
		"\2\2L\u029f\3\2\2\2N\u02a1\3\2\2\2P\u02b1\3\2\2\2R\u02ba\3\2\2\2T\u02c5"+
		"\3\2\2\2V\u02d2\3\2\2\2X\u02e2\3\2\2\2Z\u02e9\3\2\2\2\\\u02f2\3\2\2\2"+
		"^\u030e\3\2\2\2`\u0310\3\2\2\2b\u0324\3\2\2\2d\u0329\3\2\2\2f\u032c\3"+
		"\2\2\2h\u034a\3\2\2\2j\u0351\3\2\2\2l\u035e\3\2\2\2n\u0373\3\2\2\2p\u03a9"+
		"\3\2\2\2r\u0408\3\2\2\2t\u040a\3\2\2\2v\u041e\3\2\2\2x\u0426\3\2\2\2z"+
		"\u043e\3\2\2\2|\u044f\3\2\2\2~\u0457\3\2\2\2\u0080\u0459\3\2\2\2\u0082"+
		"\u045c\3\2\2\2\u0084\u045e\3\2\2\2\u0086\u0476\3\2\2\2\u0088\u04a8\3\2"+
		"\2\2\u008a\u04ee\3\2\2\2\u008c\u0526\3\2\2\2\u008e\u0528\3\2\2\2\u0090"+
		"\u0532\3\2\2\2\u0092\u053f\3\2\2\2\u0094\u054c\3\2\2\2\u0096\u055a\3\2"+
		"\2\2\u0098\u056c\3\2\2\2\u009a\u057b\3\2\2\2\u009c\u0580\3\2\2\2\u009e"+
		"\u058a\3\2\2\2\u00a0\u0591\3\2\2\2\u00a2\u0593\3\2\2\2\u00a4\u05b2\3\2"+
		"\2\2\u00a6\u05e3\3\2\2\2\u00a8\u05e5\3\2\2\2\u00aa\u05f8\3\2\2\2\u00ac"+
		"\u05fc\3\2\2\2\u00ae\u0648\3\2\2\2\u00b0\u064a\3\2\2\2\u00b2\u065d\3\2"+
		"\2\2\u00b4\u066a\3\2\2\2\u00b6\u066c\3\2\2\2\u00b8\u066e\3\2\2\2\u00ba"+
		"\u0672\3\2\2\2\u00bc\u0674\3\2\2\2\u00be\u0676\3\2\2\2\u00c0\u0679\3\2"+
		"\2\2\u00c2\u067d\3\2\2\2\u00c4\u067f\3\2\2\2\u00c6\u0681\3\2\2\2\u00c8"+
		"\u0683\3\2\2\2\u00ca\u0685\3\2\2\2\u00cc\u0687\3\2\2\2\u00ce\u0689\3\2"+
		"\2\2\u00d0\u068b\3\2\2\2\u00d2\u068d\3\2\2\2\u00d4\u068f\3\2\2\2\u00d6"+
		"\u0691\3\2\2\2\u00d8\u0693\3\2\2\2\u00da\u0695\3\2\2\2\u00dc\u0697\3\2"+
		"\2\2\u00de\u0699\3\2\2\2\u00e0\u069b\3\2\2\2\u00e2\u069d\3\2\2\2\u00e4"+
		"\u069f\3\2\2\2\u00e6\u06a1\3\2\2\2\u00e8\u06a3\3\2\2\2\u00ea\u06ab\3\2"+
		"\2\2\u00ec\u00ef\5\\/\2\u00ed\u00ef\5\4\3\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\7\2\2\3\u00f4"+
		"\u00f6\5\6\4\2\u00f5\u00f0\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\3\3\2\2\2"+
		"\u00f7\u00f8\7\u00c4\2\2\u00f8\u00f9\b\3\1\2\u00f9\5\3\2\2\2\u00fa\u0116"+
		"\3\2\2\2\u00fb\u00fc\5&\24\2\u00fc\u00fe\7\31\2\2\u00fd\u00ff\5\6\4\2"+
		"\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0116\3\2\2\2\u0100\u0104"+
		"\5\32\16\2\u0101\u0103\7\31\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2"+
		"\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0109\5\6\4\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0116\3\2\2\2\u010a\u010b\5\16\b\2\u010b\u010d\7\31\2\2\u010c\u010e\5"+
		"\6\4\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0116\3\2\2\2\u010f"+
		"\u0110\5\20\t\2\u0110\u0112\7\31\2\2\u0111\u0113\5\6\4\2\u0112\u0111\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0116\5\"\22\2\u0115"+
		"\u00fa\3\2\2\2\u0115\u00fb\3\2\2\2\u0115\u0100\3\2\2\2\u0115\u010a\3\2"+
		"\2\2\u0115\u010f\3\2\2\2\u0115\u0114\3\2\2\2\u0116\7\3\2\2\2\u0117\u0118"+
		"\7\u00b3\2\2\u0118\u0119\5$\23\2\u0119\u011a\7\36\2\2\u011a\u011b\58\35"+
		"\2\u011b\t\3\2\2\2\u011c\u011d\7\u00b3\2\2\u011d\u011f\5\u00eav\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0125\3\2\2\2\u0120\u0121\7\35"+
		"\2\2\u0121\u0122\7\u00b3\2\2\u0122\u0124\5\u00eav\2\u0123\u0120\3\2\2"+
		"\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0133"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\7\35\2\2\u0129\u0128\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\5\b\5\2\u012c\u012d"+
		"\7\35\2\2\u012d\u012f\5\b\5\2\u012e\u012c\3\2\2\2\u012f\u0132\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u0134\3\2\2\2\u0134\13\3\2\2\2\u0135"+
		"\u0137\58\35\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013c\3\2"+
		"\2\2\u0138\u0139\7\35\2\2\u0139\u013b\58\35\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\r\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0140\5\u00e6t\2\u0140\u0142\7\33\2\2\u0141"+
		"\u0143\5\f\7\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\7\34\2\2\u0145\17\3\2\2\2\u0146\u0147\5\u00e6t\2\u0147"+
		"\u0149\7\33\2\2\u0148\u014a\5\f\7\2\u0149\u0148\3\2\2\2\u0149\u014a\3"+
		"\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d\7\35\2\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\5\22\n\2\u014f\u0150\7"+
		"\35\2\2\u0150\u0152\5\f\7\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\7\34\2\2\u0154\21\3\2\2\2\u0155\u0156\7i\2"+
		"\2\u0156\u0157\7\33\2\2\u0157\u0158\5\f\7\2\u0158\u0159\7\34\2\2\u0159"+
		"\u015d\7\3\2\2\u015a\u015c\5\34\17\2\u015b\u015a\3\2\2\2\u015c\u015f\3"+
		"\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0161\7\4\2\2\u0161\23\3\2\2\2\u0162\u0164\7\u009c"+
		"\2\2\u0163\u0165\5\26\f\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\7\31\2\2\u0167\25\3\2\2\2\u0168\u016c\58\35"+
		"\2\u0169\u016c\5\30\r\2\u016a\u016c\5> \2\u016b\u0168\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016a\3\2\2\2\u016c\27\3\2\2\2\u016d\u0173\7\5\2\2\u016e"+
		"\u0172\58\35\2\u016f\u0172\5\u00eav\2\u0170\u0172\7\u00c3\2\2\u0171\u016e"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0177\7\5\2\2\u0177\31\3\2\2\2\u0178\u017a\7i\2\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5\u00e6t"+
		"\2\u017c\u017d\7\33\2\2\u017d\u017e\5\n\6\2\u017e\u017f\7\34\2\2\u017f"+
		"\u0180\5\34\17\2\u0180\33\3\2\2\2\u0181\u0185\7\3\2\2\u0182\u0184\5 \21"+
		"\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\5\24\13\2"+
		"\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\7\4\2\2\u018c\35\3\2\2\2\u018d\u0190\5 \21\2\u018e\u0190\5\24\13\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\37\3\2\2\2\u0191\u01b0\5D#\2"+
		"\u0192\u01b0\5\"\22\2\u0193\u0194\5\16\b\2\u0194\u0195\7\31\2\2\u0195"+
		"\u01b0\3\2\2\2\u0196\u01b0\5L\'\2\u0197\u01b0\5V,\2\u0198\u0199\5\64\33"+
		"\2\u0199\u019a\7\31\2\2\u019a\u01b0\3\2\2\2\u019b\u019c\5@!\2\u019c\u019d"+
		"\7\31\2\2\u019d\u01b0\3\2\2\2\u019e\u019f\5&\24\2\u019f\u01a0\7\31\2\2"+
		"\u01a0\u01b0\3\2\2\2\u01a1\u01a2\5(\25\2\u01a2\u01a3\7\31\2\2\u01a3\u01b0"+
		"\3\2\2\2\u01a4\u01a5\5\64\33\2\u01a5\u01a6\7\31\2\2\u01a6\u01b0\3\2\2"+
		"\2\u01a7\u01ab\7\3\2\2\u01a8\u01aa\5 \21\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01b0\7\4\2\2\u01af\u0191\3\2\2\2\u01af\u0192\3\2"+
		"\2\2\u01af\u0193\3\2\2\2\u01af\u0196\3\2\2\2\u01af\u0197\3\2\2\2\u01af"+
		"\u0198\3\2\2\2\u01af\u019b\3\2\2\2\u01af\u019e\3\2\2\2\u01af\u01a1\3\2"+
		"\2\2\u01af\u01a4\3\2\2\2\u01af\u01a7\3\2\2\2\u01b0\u01b5\3\2\2\2\u01b1"+
		"\u01b2\7@\2\2\u01b2\u01b6\7\31\2\2\u01b3\u01b4\7K\2\2\u01b4\u01b6\7\31"+
		"\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"!\3\2\2\2\u01b7\u01be\7\u00c1\2\2\u01b8\u01be\7\u00c2\2\2\u01b9\u01ba"+
		"\7\3\2\2\u01ba\u01bb\5 \21\2\u01bb\u01bc\7\4\2\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01b7\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be#\3\2\2\2"+
		"\u01bf\u01c2\5\u00eav\2\u01c0\u01c2\5.\30\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2%\3\2\2\2\u01c3\u01c4\7\u00b3\2\2\u01c4\u01c9\5(\25"+
		"\2\u01c5\u01c6\7\35\2\2\u01c6\u01c8\5(\25\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\'\3\2\2\2"+
		"\u01cb\u01c9\3\2\2\2\u01cc\u01d2\5$\23\2\u01cd\u01ce\5B\"\2\u01ce\u01cf"+
		"\5*\26\2\u01cf\u01d1\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3)\3\2\2\2\u01d4\u01d2\3\2\2\2"+
		"\u01d5\u01da\58\35\2\u01d6\u01da\5> \2\u01d7\u01da\5\62\32\2\u01d8\u01da"+
		"\5,\27\2\u01d9\u01d5\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01da+\3\2\2\2\u01db\u01e4\7\6\2\2\u01dc\u01dd\58\35\2"+
		"\u01dd\u01de\7\35\2\2\u01de\u01e3\3\2\2\2\u01df\u01e0\5,\27\2\u01e0\u01e1"+
		"\7\35\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01df\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e9"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\58\35\2\u01e8\u01ea\5,\27\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ec\7\7\2\2\u01ec-\3\2\2\2\u01ed\u01ee\5\u00e8u\2\u01ee\u01f0"+
		"\7\6\2\2\u01ef\u01f1\5:\36\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\7\7\2\2\u01f3/\3\2\2\2\u01f4\u01f5\7\u00bb"+
		"\2\2\u01f5\u0201\7\b\2\2\u01f6\u0202\5\66\34\2\u01f7\u0202\5\62\32\2\u01f8"+
		"\u01f9\7\5\2\2\u01f9\u01fa\5\66\34\2\u01fa\u01fb\7\5\2\2\u01fb\u0202\3"+
		"\2\2\2\u01fc\u01fd\7\t\2\2\u01fd\u01fe\5\66\34\2\u01fe\u01ff\7\t\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u0202\5,\27\2\u0201\u01f6\3\2\2\2\u0201\u01f7\3\2"+
		"\2\2\u0201\u01f8\3\2\2\2\u0201\u01fc\3\2\2\2\u0201\u0200\3\2\2\2\u0202"+
		"\61\3\2\2\2\u0203\u0204\7\3\2\2\u0204\u0209\5\60\31\2\u0205\u0206\7\35"+
		"\2\2\u0206\u0208\5\60\31\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020c\u020d\7\4\2\2\u020d\63\3\2\2\2\u020e\u020f\7\u0091\2\2\u020f"+
		"\u0212\7\33\2\2\u0210\u0213\58\35\2\u0211\u0213\5\30\r\2\u0212\u0210\3"+
		"\2\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u021b\3\2\2\2\u0214"+
		"\u0217\7 \2\2\u0215\u0218\58\35\2\u0216\u0218\5\30\r\2\u0217\u0215\3\2"+
		"\2\2\u0217\u0216\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0214\3\2\2\2\u021a"+
		"\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7\34\2\2\u021f\65\3\2\2\2\u0220\u0229"+
		"\5$\23\2\u0221\u0229\5\30\r\2\u0222\u0229\5\16\b\2\u0223\u0229\5\u00b4"+
		"[\2\u0224\u0225\7\33\2\2\u0225\u0226\5\66\34\2\u0226\u0227\7\34\2\2\u0227"+
		"\u0229\3\2\2\2\u0228\u0220\3\2\2\2\u0228\u0221\3\2\2\2\u0228\u0222\3\2"+
		"\2\2\u0228\u0223\3\2\2\2\u0228\u0224\3\2\2\2\u0229\67\3\2\2\2\u022a\u022f"+
		"\5\66\34\2\u022b\u022f\5<\37\2\u022c\u022f\5:\36\2\u022d\u022f\5@!\2\u022e"+
		"\u022a\3\2\2\2\u022e\u022b\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2"+
		"\2\2\u022f9\3\2\2\2\u0230\u0231\b\36\1\2\u0231\u0237\5\66\34\2\u0232\u0233"+
		"\7\33\2\2\u0233\u0234\5:\36\2\u0234\u0235\7\34\2\2\u0235\u0237\3\2\2\2"+
		"\u0236\u0230\3\2\2\2\u0236\u0232\3\2\2\2\u0237\u023d\3\2\2\2\u0238\u0239"+
		"\f\4\2\2\u0239\u023a\t\2\2\2\u023a\u023c\5:\36\5\u023b\u0238\3\2\2\2\u023c"+
		"\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e;\3\2\2\2"+
		"\u023f\u023d\3\2\2\2\u0240\u0241\b\37\1\2\u0241\u024d\5\66\34\2\u0242"+
		"\u0243\5:\36\2\u0243\u0244\t\3\2\2\u0244\u0245\5:\36\2\u0245\u024d\3\2"+
		"\2\2\u0246\u024d\7\u00b9\2\2\u0247\u024d\7\u00ba\2\2\u0248\u0249\7\33"+
		"\2\2\u0249\u024a\5<\37\2\u024a\u024b\7\34\2\2\u024b\u024d\3\2\2\2\u024c"+
		"\u0240\3\2\2\2\u024c\u0242\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0247\3\2"+
		"\2\2\u024c\u0248\3\2\2\2\u024d\u0253\3\2\2\2\u024e\u024f\f\6\2\2\u024f"+
		"\u0250\t\4\2\2\u0250\u0252\5<\37\7\u0251\u024e\3\2\2\2\u0252\u0255\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254=\3\2\2\2\u0255\u0253"+
		"\3\2\2\2\u0256\u0261\5<\37\2\u0257\u025a\7\13\2\2\u0258\u025b\5> \2\u0259"+
		"\u025b\58\35\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c\u025f\7\b\2\2\u025d\u0260\5> \2\u025e\u0260\58\35\2\u025f\u025d"+
		"\3\2\2\2\u025f\u025e\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0257\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0268\3\2\2\2\u0263\u0264\7\33\2\2\u0264\u0265\5"+
		"> \2\u0265\u0266\7\34\2\2\u0266\u0268\3\2\2\2\u0267\u0256\3\2\2\2\u0267"+
		"\u0263\3\2\2\2\u0268?\3\2\2\2\u0269\u026a\5$\23\2\u026a\u026b\7\f\2\2"+
		"\u026b\u0274\3\2\2\2\u026c\u026d\7\f\2\2\u026d\u0274\5$\23\2\u026e\u026f"+
		"\5$\23\2\u026f\u0270\7\r\2\2\u0270\u0274\3\2\2\2\u0271\u0272\7\r\2\2\u0272"+
		"\u0274\5$\23\2\u0273\u0269\3\2\2\2\u0273\u026c\3\2\2\2\u0273\u026e\3\2"+
		"\2\2\u0273\u0271\3\2\2\2\u0274A\3\2\2\2\u0275\u0276\t\5\2\2\u0276C\3\2"+
		"\2\2\u0277\u0279\5F$\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027f\3\2\2\2\u027c\u027e\5H%\2\u027d"+
		"\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2"+
		"\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0284\5J&\2\u0283\u0282"+
		"\3\2\2\2\u0283\u0284\3\2\2\2\u0284E\3\2\2\2\u0285\u0286\7m\2\2\u0286\u0287"+
		"\7\33\2\2\u0287\u0288\5<\37\2\u0288\u028b\7\34\2\2\u0289\u028c\5\34\17"+
		"\2\u028a\u028c\5\36\20\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2\2\u028c"+
		"G\3\2\2\2\u028d\u028e\7\\\2\2\u028e\u028f\7m\2\2\u028f\u0290\7\33\2\2"+
		"\u0290\u0291\5<\37\2\u0291\u0294\7\34\2\2\u0292\u0295\5\34\17\2\u0293"+
		"\u0295\5\36\20\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295I\3\2\2"+
		"\2\u0296\u0299\7\\\2\2\u0297\u029a\5\34\17\2\u0298\u029a\5\36\20\2\u0299"+
		"\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029aK\3\2\2\2\u029b\u02a0\5N(\2\u029c"+
		"\u02a0\5P)\2\u029d\u02a0\5R*\2\u029e\u02a0\5T+\2\u029f\u029b\3\2\2\2\u029f"+
		"\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0M\3\2\2\2"+
		"\u02a1\u02a2\7e\2\2\u02a2\u02a3\7\33\2\2\u02a3\u02a4\5&\24\2\u02a4\u02a5"+
		"\7\31\2\2\u02a5\u02a6\5<\37\2\u02a6\u02a9\7\31\2\2\u02a7\u02aa\5@!\2\u02a8"+
		"\u02aa\5(\25\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02ab\u02ac\7\34\2\2\u02ac\u02af\3\2\2\2\u02ad\u02b0\5\34\17\2\u02ae"+
		"\u02b0\5\36\20\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0O\3\2\2"+
		"\2\u02b1\u02b2\7\u00b6\2\2\u02b2\u02b3\7\33\2\2\u02b3\u02b4\5<\37\2\u02b4"+
		"\u02b5\7\34\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b9\5\34\17\2\u02b7\u02b9"+
		"\5\36\20\2\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9Q\3\2\2\2\u02ba"+
		"\u02bd\7Y\2\2\u02bb\u02be\5\34\17\2\u02bc\u02be\5\36\20\2\u02bd\u02bb"+
		"\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\7\u00b6\2"+
		"\2\u02c0\u02c1\7\33\2\2\u02c1\u02c2\5<\37\2\u02c2\u02c3\7\34\2\2\u02c3"+
		"\u02c4\7\31\2\2\u02c4S\3\2\2\2\u02c5\u02c6\7e\2\2\u02c6\u02c8\7\33\2\2"+
		"\u02c7\u02c9\7\u00b3\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cb\5$\23\2\u02cb\u02cc\7\b\2\2\u02cc\u02cd\5\u00e8"+
		"u\2\u02cd\u02d0\7\34\2\2\u02ce\u02d1\5\34\17\2\u02cf\u02d1\5\36\20\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1U\3\2\2\2\u02d2\u02d3\7\u00a3"+
		"\2\2\u02d3\u02d4\7\33\2\2\u02d4\u02d5\5\66\34\2\u02d5\u02d6\7\34\2\2\u02d6"+
		"\u02da\7\3\2\2\u02d7\u02d9\5X-\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc\3\2\2"+
		"\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da"+
		"\3\2\2\2\u02dd\u02df\5Z.\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e1\7\4\2\2\u02e1W\3\2\2\2\u02e2\u02e3\7C\2\2\u02e3"+
		"\u02e4\5\66\34\2\u02e4\u02e7\7\b\2\2\u02e5\u02e8\5\34\17\2\u02e6\u02e8"+
		"\5\36\20\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8Y\3\2\2\2\u02e9"+
		"\u02ea\7R\2\2\u02ea\u02ed\7\b\2\2\u02eb\u02ee\5\34\17\2\u02ec\u02ee\5"+
		"\36\20\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee[\3\2\2\2\u02ef"+
		"\u02f1\7\31\2\2\u02f0\u02ef\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3"+
		"\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5"+
		"\u02fe\5^\60\2\u02f6\u02f8\7\31\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9\3"+
		"\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fd\5^\60\2\u02fc\u02f7\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0304\3\2\2\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u0303\7\31\2\2\u0302\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3"+
		"\2\2\2\u0304\u0305\3\2\2\2\u0305]\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u030f"+
		"\5`\61\2\u0308\u030f\5f\64\2\u0309\u030f\5h\65\2\u030a\u030f\5j\66\2\u030b"+
		"\u030f\5l\67\2\u030c\u030f\5n8\2\u030d\u030f\5t;\2\u030e\u0307\3\2\2\2"+
		"\u030e\u0308\3\2\2\2\u030e\u0309\3\2\2\2\u030e\u030a\3\2\2\2\u030e\u030b"+
		"\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030f_\3\2\2\2\u0310"+
		"\u0311\7\66\2\2\u0311\u0315\7\u00a4\2\2\u0312\u0313\5\u00c6d\2\u0313\u0314"+
		"\7\32\2\2\u0314\u0316\3\2\2\2\u0315\u0312\3\2\2\2\u0315\u0316\3\2\2\2"+
		"\u0316\u0317\3\2\2\2\u0317\u0322\5\u00c8e\2\u0318\u0319\7\u0099\2\2\u0319"+
		"\u031a\7\u00a8\2\2\u031a\u0323\5\u00ceh\2\u031b\u0323\5d\63\2\u031c\u0323"+
		"\5b\62\2\u031d\u031f\7\63\2\2\u031e\u0320\7G\2\2\u031f\u031e\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\5v<\2\u0322\u0318\3\2\2"+
		"\2\u0322\u031b\3\2\2\2\u0322\u031c\3\2\2\2\u0322\u031d\3\2\2\2\u0323a"+
		"\3\2\2\2\u0324\u0325\7\63\2\2\u0325\u0326\7J\2\2\u0326\u0327\5\u00eav"+
		"\2\u0327\u0328\5\u0090I\2\u0328c\3\2\2\2\u0329\u032a\7\63\2\2\u032a\u032b"+
		"\5\u0090I\2\u032be\3\2\2\2\u032c\u032d\7L\2\2\u032d\u0331\7\u00a4\2\2"+
		"\u032e\u032f\7m\2\2\u032f\u0330\7\u0084\2\2\u0330\u0332\7b\2\2\u0331\u032e"+
		"\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0336\3\2\2\2\u0333\u0334\5\u00c6d"+
		"\2\u0334\u0335\7\32\2\2\u0335\u0337\3\2\2\2\u0336\u0333\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0348\5\u00caf\2\u0339\u033a"+
		"\7\33\2\2\u033a\u0341\5v<\2\u033b\u033c\7\35\2\2\u033c\u0340\5\u0090I"+
		"\2\u033d\u033e\7\35\2\2\u033e\u0340\5v<\2\u033f\u033b\3\2\2\2\u033f\u033d"+
		"\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0345\7\34\2\2\u0345\u0349\3"+
		"\2\2\2\u0346\u0347\79\2\2\u0347\u0349\5p9\2\u0348\u0339\3\2\2\2\u0348"+
		"\u0346\3\2\2\2\u0349g\3\2\2\2\u034a\u034b\7U\2\2\u034b\u034c\7g\2\2\u034c"+
		"\u034f\5\u009cO\2\u034d\u034e\7\u00b5\2\2\u034e\u0350\5\u0088E\2\u034f"+
		"\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350i\3\2\2\2\u0351\u0352\7Z\2\2\u0352"+
		"\u0355\7\u00a4\2\2\u0353\u0354\7m\2\2\u0354\u0356\7b\2\2\u0355\u0353\3"+
		"\2\2\2\u0355\u0356\3\2\2\2\u0356\u035a\3\2\2\2\u0357\u0358\5\u00c6d\2"+
		"\u0358\u0359\7\32\2\2\u0359\u035b\3\2\2\2\u035a\u0357\3\2\2\2\u035a\u035b"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\5\u00caf\2\u035dk\3\2\2\2\u035e"+
		"\u0369\5\u00aeX\2\u035f\u0360\7\u008c\2\2\u0360\u0361\7A\2\2\u0361\u0366"+
		"\5\u009eP\2\u0362\u0363\7\35\2\2\u0363\u0365\5\u009eP\2\u0364\u0362\3"+
		"\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u035f\3\2\2\2\u0369\u036a\3\2"+
		"\2\2\u036a\u0371\3\2\2\2\u036b\u036c\7\177\2\2\u036c\u036f\5\u0088E\2"+
		"\u036d\u036e\t\6\2\2\u036e\u0370\5\u0088E\2\u036f\u036d\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u036b\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372m\3\2\2\2\u0373\u0374\7u\2\2\u0374\u0378\7x\2\2\u0375\u0376"+
		"\5\u00c6d\2\u0376\u0377\7\32\2\2\u0377\u0379\3\2\2\2\u0378\u0375\3\2\2"+
		"\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0386\5\u00caf\2\u037b"+
		"\u037c\7\33\2\2\u037c\u0381\5\u00d0i\2\u037d\u037e\7\35\2\2\u037e\u0380"+
		"\5\u00d0i\2\u037f\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2"+
		"\2\u0381\u0382\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385"+
		"\7\34\2\2\u0385\u0387\3\2\2\2\u0386\u037b\3\2\2\2\u0386\u0387\3\2\2\2"+
		"\u0387\u03a7\3\2\2\2\u0388\u0389\7\u00b0\2\2\u0389\u038a\7\33\2\2\u038a"+
		"\u038f\5\u0088E\2\u038b\u038c\7\35\2\2\u038c\u038e\5\u0088E\2\u038d\u038b"+
		"\3\2\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u03a1\7\34\2\2\u0393\u0394\7"+
		"\35\2\2\u0394\u0395\7\33\2\2\u0395\u039a\5\u0088E\2\u0396\u0397\7\35\2"+
		"\2\u0397\u0399\5\u0088E\2\u0398\u0396\3\2\2\2\u0399\u039c\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u039a\3\2"+
		"\2\2\u039d\u039e\7\34\2\2\u039e\u03a0\3\2\2\2\u039f\u0393\3\2\2\2\u03a0"+
		"\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a8\3\2"+
		"\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a8\5p9\2\u03a5\u03a6\7R\2\2\u03a6\u03a8"+
		"\7\u00b0\2\2\u03a7\u0388\3\2\2\2\u03a7\u03a4\3\2\2\2\u03a7\u03a5\3\2\2"+
		"\2\u03a8o\3\2\2\2\u03a9\u03b4\5r:\2\u03aa\u03ab\7\u008c\2\2\u03ab\u03ac"+
		"\7A\2\2\u03ac\u03b1\5\u009eP\2\u03ad\u03ae\7\35\2\2\u03ae\u03b0\5\u009e"+
		"P\2\u03af\u03ad\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u03aa\3\2"+
		"\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03bc\3\2\2\2\u03b6\u03b7\7\177\2\2\u03b7"+
		"\u03ba\5\u0088E\2\u03b8\u03b9\t\6\2\2\u03b9\u03bb\5\u0088E\2\u03ba\u03b8"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03b6\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bdq\3\2\2\2\u03be\u03c0\7\u00a1\2\2\u03bf\u03c1\t\7"+
		"\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c7\5\u00a4S\2\u03c3\u03c4\7\35\2\2\u03c4\u03c6\5\u00a4S\2\u03c5\u03c3"+
		"\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03d6\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03d4\7g\2\2\u03cb\u03d0\5\u00a6"+
		"T\2\u03cc\u03cd\7\35\2\2\u03cd\u03cf\5\u00a6T\2\u03ce\u03cc\3\2\2\2\u03cf"+
		"\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d5\3\2"+
		"\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d5\5\u00a8U\2\u03d4\u03cb\3\2\2\2\u03d4"+
		"\u03d3\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03ca\3\2\2\2\u03d6\u03d7\3\2"+
		"\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d9\7\u00b5\2\2\u03d9\u03db\5\u0088E"+
		"\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03ea\3\2\2\2\u03dc\u03dd"+
		"\7k\2\2\u03dd\u03de\7A\2\2\u03de\u03e3\5\u0088E\2\u03df\u03e0\7\35\2\2"+
		"\u03e0\u03e2\5\u0088E\2\u03e1\u03df\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e8\3\2\2\2\u03e5\u03e3\3\2"+
		"\2\2\u03e6\u03e7\7l\2\2\u03e7\u03e9\5\u0088E\2\u03e8\u03e6\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03dc\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u0409\3\2\2\2\u03ec\u03ed\7\u00b0\2\2\u03ed\u03ee\7\33\2\2"+
		"\u03ee\u03f3\5\u0088E\2\u03ef\u03f0\7\35\2\2\u03f0\u03f2\5\u0088E\2\u03f1"+
		"\u03ef\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u0405\7\34\2\2\u03f7"+
		"\u03f8\7\35\2\2\u03f8\u03f9\7\33\2\2\u03f9\u03fe\5\u0088E\2\u03fa\u03fb"+
		"\7\35\2\2\u03fb\u03fd\5\u0088E\2\u03fc\u03fa\3\2\2\2\u03fd\u0400\3\2\2"+
		"\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u03fe"+
		"\3\2\2\2\u0401\u0402\7\34\2\2\u0402\u0404\3\2\2\2\u0403\u03f7\3\2\2\2"+
		"\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0409"+
		"\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u03be\3\2\2\2\u0408\u03ec\3\2\2\2\u0409"+
		"s\3\2\2\2\u040a\u040b\7\u00ad\2\2\u040b\u040c\5\u009cO\2\u040c\u040d\7"+
		"\u00a2\2\2\u040d\u040e\5\u00d0i\2\u040e\u040f\7\36\2\2\u040f\u0417\5\u0088"+
		"E\2\u0410\u0411\7\35\2\2\u0411\u0412\5\u00d0i\2\u0412\u0413\7\36\2\2\u0413"+
		"\u0414\5\u0088E\2\u0414\u0416\3\2\2\2\u0415\u0410\3\2\2\2\u0416\u0419"+
		"\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u041c\3\2\2\2\u0419"+
		"\u0417\3\2\2\2\u041a\u041b\7\u00b5\2\2\u041b\u041d\5\u0088E\2\u041c\u041a"+
		"\3\2\2\2\u041c\u041d\3\2\2\2\u041du\3\2\2\2\u041e\u0423\5\u00d0i\2\u041f"+
		"\u0422\5z>\2\u0420\u0422\5x=\2\u0421\u041f\3\2\2\2\u0421\u0420\3\2\2\2"+
		"\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424w\3"+
		"\2\2\2\u0425\u0423\3\2\2\2\u0426\u043a\5\u00c2b\2\u0427\u0428\7\33\2\2"+
		"\u0428\u042a\5\u00b2Z\2\u0429\u042b\5\u00eav\2\u042a\u0429\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7\34\2\2\u042d\u043b\3"+
		"\2\2\2\u042e\u042f\7\33\2\2\u042f\u0431\5\u00b2Z\2\u0430\u0432\5\u00ea"+
		"v\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0434\7\35\2\2\u0434\u0436\5\u00b2Z\2\u0435\u0437\5\u00eav\2\u0436\u0435"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\7\34\2\2"+
		"\u0439\u043b\3\2\2\2\u043a\u0427\3\2\2\2\u043a\u042e\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043by\3\2\2\2\u043c\u043d\7J\2\2\u043d\u043f\5\u00c2b\2\u043e"+
		"\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u044d\3\2\2\2\u0440\u044e\5|"+
		"?\2\u0441\u044e\5~@\2\u0442\u044e\5\u0080A\2\u0443\u044e\5\u0082B\2\u0444"+
		"\u044e\7\u00ac\2\2\u0445\u0446\7E\2\2\u0446\u0447\7\33\2\2\u0447\u0448"+
		"\5\u0088E\2\u0448\u0449\7\34\2\2\u0449\u044e\3\2\2\2\u044a\u044e\5\u0084"+
		"C\2\u044b\u044c\7F\2\2\u044c\u044e\5\u00d2j\2\u044d\u0440\3\2\2\2\u044d"+
		"\u0441\3\2\2\2\u044d\u0442\3\2\2\2\u044d\u0443\3\2\2\2\u044d\u0444\3\2"+
		"\2\2\u044d\u0445\3\2\2\2\u044d\u044a\3\2\2\2\u044d\u044b\3\2\2\2\u044e"+
		"{\3\2\2\2\u044f\u0450\7\u0090\2\2\u0450\u0452\7|\2\2\u0451\u0453\t\b\2"+
		"\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0456"+
		"\7<\2\2\u0455\u0454\3\2\2\2\u0455\u0456\3\2\2\2\u0456}\3\2\2\2\u0457\u0458"+
		"\5\u008aF\2\u0458\177\3\2\2\2\u0459\u045a\7\u0084\2\2\u045a\u045b\7\u0086"+
		"\2\2\u045b\u0081\3\2\2\2\u045c\u045d\7\u0086\2\2\u045d\u0083\3\2\2\2\u045e"+
		"\u046a\7R\2\2\u045f\u046b\5\u0086D\2\u0460\u0461\7\33\2\2\u0461\u0462"+
		"\5\u0088E\2\u0462\u0463\7\34\2\2\u0463\u046b\3\2\2\2\u0464\u0465\7\u0082"+
		"\2\2\u0465\u0466\7\33\2\2\u0466\u0467\5\u0088E\2\u0467\u0468\7\34\2\2"+
		"\u0468\u046b\3\2\2\2\u0469\u046b\5\u00eav\2\u046a\u045f\3\2\2\2\u046a"+
		"\u0460\3\2\2\2\u046a\u0464\3\2\2\2\u046a\u0469\3\2\2\2\u046b\u0472\3\2"+
		"\2\2\u046c\u046e\7\30\2\2\u046d\u046f\5\u00eav\2\u046e\u046d\3\2\2\2\u046f"+
		"\u0470\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0473\3\2"+
		"\2\2\u0472\u046c\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0085\3\2\2\2\u0474"+
		"\u0477\5\u00b2Z\2\u0475\u0477\5\u00b4[\2\u0476\u0474\3\2\2\2\u0476\u0475"+
		"\3\2\2\2\u0477\u0087\3\2\2\2\u0478\u0479\bE\1\2\u0479\u04a9\5\u00b4[\2"+
		"\u047a\u047b\5\u00c6d\2\u047b\u047c\7\32\2\2\u047c\u047e\3\2\2\2\u047d"+
		"\u047a\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\5\u00ca"+
		"f\2\u0480\u0481\7\32\2\2\u0481\u0483\3\2\2\2\u0482\u047d\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u04a9\5\u00d0i\2\u0485\u0486"+
		"\5\u00b6\\\2\u0486\u0487\5\u0088E\17\u0487\u04a9\3\2\2\2\u0488\u0489\5"+
		"\u00c4c\2\u0489\u0496\7\33\2\2\u048a\u048c\7X\2\2\u048b\u048a\3\2\2\2"+
		"\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u0492\5\u0088E\2\u048e"+
		"\u048f\7\35\2\2\u048f\u0491\5\u0088E\2\u0490\u048e\3\2\2\2\u0491\u0494"+
		"\3\2\2\2\u0492\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0497\3\2\2\2\u0494"+
		"\u0492\3\2\2\2\u0495\u0497\7\37\2\2\u0496\u048b\3\2\2\2\u0496\u0495\3"+
		"\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\7\34\2\2\u0499"+
		"\u04a9\3\2\2\2\u049a\u049b\7\33\2\2\u049b\u049c\5\u0088E\2\u049c\u049d"+
		"\7\34\2\2\u049d\u04a9\3\2\2\2\u049e\u04a0\7\u0084\2\2\u049f\u049e\3\2"+
		"\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\7b\2\2\u04a2"+
		"\u049f\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\7\33"+
		"\2\2\u04a5\u04a6\5p9\2\u04a6\u04a7\7\34\2\2\u04a7\u04a9\3\2\2\2\u04a8"+
		"\u0478\3\2\2\2\u04a8\u0482\3\2\2\2\u04a8\u0485\3\2\2\2\u04a8\u0488\3\2"+
		"\2\2\u04a8\u049a\3\2\2\2\u04a8\u04a2\3\2\2\2\u04a9\u04eb\3\2\2\2\u04aa"+
		"\u04ab\f\16\2\2\u04ab\u04ac\7#\2\2\u04ac\u04ea\5\u0088E\17\u04ad\u04ae"+
		"\f\r\2\2\u04ae\u04af\t\t\2\2\u04af\u04ea\5\u0088E\16\u04b0\u04b1\f\f\2"+
		"\2\u04b1\u04b2\t\n\2\2\u04b2\u04ea\5\u0088E\r\u04b3\u04b4\f\13\2\2\u04b4"+
		"\u04b5\t\13\2\2\u04b5\u04ea\5\u0088E\f\u04b6\u04b7\f\n\2\2\u04b7\u04b8"+
		"\t\f\2\2\u04b8\u04ea\5\u0088E\13\u04b9\u04c6\f\t\2\2\u04ba\u04c7\7\36"+
		"\2\2\u04bb\u04c7\7.\2\2\u04bc\u04c7\7/\2\2\u04bd\u04c7\7\60\2\2\u04be"+
		"\u04c7\7y\2\2\u04bf\u04c0\7y\2\2\u04c0\u04c7\7\u0084\2\2\u04c1\u04c7\7"+
		"p\2\2\u04c2\u04c7\7~\2\2\u04c3\u04c7\7j\2\2\u04c4\u04c7\7\u0080\2\2\u04c5"+
		"\u04c7\7\u0096\2\2\u04c6\u04ba\3\2\2\2\u04c6\u04bb\3\2\2\2\u04c6\u04bc"+
		"\3\2\2\2\u04c6\u04bd\3\2\2\2\u04c6\u04be\3\2\2\2\u04c6\u04bf\3\2\2\2\u04c6"+
		"\u04c1\3\2\2\2\u04c6\u04c2\3\2\2\2\u04c6\u04c3\3\2\2\2\u04c6\u04c4\3\2"+
		"\2\2\u04c6\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ea\5\u0088E\n\u04c9"+
		"\u04ca\f\b\2\2\u04ca\u04cb\78\2\2\u04cb\u04ea\5\u0088E\t\u04cc\u04cd\f"+
		"\7\2\2\u04cd\u04ce\7\u008b\2\2\u04ce\u04ea\5\u0088E\b\u04cf\u04d1\f\4"+
		"\2\2\u04d0\u04d2\7\u0084\2\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u04e7\7p\2\2\u04d4\u04de\7\33\2\2\u04d5\u04df\5p"+
		"9\2\u04d6\u04db\5\u0088E\2\u04d7\u04d8\7\35\2\2\u04d8\u04da\5\u0088E\2"+
		"\u04d9\u04d7\3\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc"+
		"\3\2\2\2\u04dc\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04de\u04d5\3\2\2\2\u04de"+
		"\u04d6\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e8\7\34"+
		"\2\2\u04e1\u04e2\5\u00c6d\2\u04e2\u04e3\7\32\2\2\u04e3\u04e5\3\2\2\2\u04e4"+
		"\u04e1\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\5\u00ca"+
		"f\2\u04e7\u04d4\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e8\u04ea\3\2\2\2\u04e9"+
		"\u04aa\3\2\2\2\u04e9\u04ad\3\2\2\2\u04e9\u04b0\3\2\2\2\u04e9\u04b3\3\2"+
		"\2\2\u04e9\u04b6\3\2\2\2\u04e9\u04b9\3\2\2\2\u04e9\u04c9\3\2\2\2\u04e9"+
		"\u04cc\3\2\2\2\u04e9\u04cf\3\2\2\2\u04ea\u04ed\3\2\2\2\u04eb\u04e9\3\2"+
		"\2\2\u04eb\u04ec\3\2\2\2\u04ec\u0089\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ee"+
		"\u04f2\7\u0095\2\2\u04ef\u04f0\5\u00c6d\2\u04f0\u04f1\7\32\2\2\u04f1\u04f3"+
		"\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4"+
		"\u0500\5\u00d4k\2\u04f5\u04f6\7\33\2\2\u04f6\u04fb\5\u008cG\2\u04f7\u04f8"+
		"\7\35\2\2\u04f8\u04fa\5\u008cG\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd\3\2\2"+
		"\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04fb"+
		"\3\2\2\2\u04fe\u04ff\7\34\2\2\u04ff\u0501\3\2\2\2\u0500\u04f5\3\2\2\2"+
		"\u0500\u0501\3\2\2\2\u0501\u0514\3\2\2\2\u0502\u0503\7\u0089\2\2\u0503"+
		"\u050c\t\r\2\2\u0504\u0505\7\u00a2\2\2\u0505\u050d\7\u0086\2\2\u0506\u0507"+
		"\7\u00a2\2\2\u0507\u050d\7R\2\2\u0508\u050d\7B\2\2\u0509\u050d\7\u009b"+
		"\2\2\u050a\u050b\7\u0083\2\2\u050b\u050d\7\62\2\2\u050c\u0504\3\2\2\2"+
		"\u050c\u0506\3\2\2\2\u050c\u0508\3\2\2\2\u050c\u0509\3\2\2\2\u050c\u050a"+
		"\3\2\2\2\u050d\u0511\3\2\2\2\u050e\u050f\7\u0080\2\2\u050f\u0511\5\u00c2"+
		"b\2\u0510\u0502\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0513\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0515\3\2"+
		"\2\2\u0515\u0524\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u0519\7\u0084\2\2\u0518"+
		"\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051f\7S"+
		"\2\2\u051b\u051c\7s\2\2\u051c\u0520\7T\2\2\u051d\u051e\7s\2\2\u051e\u0520"+
		"\7o\2\2\u051f\u051b\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u0522\3\2\2\2\u0521\u0523\7^\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2"+
		"\2\2\u0523\u0525\3\2\2\2\u0524\u0518\3\2\2\2\u0524\u0525\3\2\2\2\u0525"+
		"\u008b\3\2\2\2\u0526\u0527\5\u00c2b\2\u0527\u008d\3\2\2\2\u0528\u052b"+
		"\5\u00d0i\2\u0529\u052a\7F\2\2\u052a\u052c\5\u00d2j\2\u052b\u0529\3\2"+
		"\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2\2\2\u052d\u052f\t\b\2\2\u052e"+
		"\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u008f\3\2\2\2\u0530\u0531\7J"+
		"\2\2\u0531\u0533\5\u00c2b\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2\2\2\u0533"+
		"\u053d\3\2\2\2\u0534\u053e\5\u0092J\2\u0535\u053e\5\u0098M\2\u0536\u053e"+
		"\5\u0096L\2\u0537\u0538\7E\2\2\u0538\u0539\7\33\2\2\u0539\u053a\5\u0088"+
		"E\2\u053a\u053b\7\34\2\2\u053b\u053e\3\2\2\2\u053c\u053e\5\u0094K\2\u053d"+
		"\u0534\3\2\2\2\u053d\u0535\3\2\2\2\u053d\u0536\3\2\2\2\u053d\u0537\3\2"+
		"\2\2\u053d\u053c\3\2\2\2\u053e\u0091\3\2\2\2\u053f\u0540\7\u0090\2\2\u0540"+
		"\u0541\7|\2\2\u0541\u0542\7\33\2\2\u0542\u0547\5\u008eH\2\u0543\u0544"+
		"\7\35\2\2\u0544\u0546\5\u008eH\2\u0545\u0543\3\2\2\2\u0546\u0549\3\2\2"+
		"\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549\u0547"+
		"\3\2\2\2\u054a\u054b\7\34\2\2\u054b\u0093\3\2\2\2\u054c\u054d\7f\2\2\u054d"+
		"\u054e\7|\2\2\u054e\u054f\7\33\2\2\u054f\u0554\5\u009aN\2\u0550\u0551"+
		"\7\35\2\2\u0551\u0553\5\u009aN\2\u0552\u0550\3\2\2\2\u0553\u0556\3\2\2"+
		"\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2\u0556\u0554"+
		"\3\2\2\2\u0557\u0558\7\34\2\2\u0558\u0559\5\u008aF\2\u0559\u0095\3\2\2"+
		"\2\u055a\u055c\7\u00ac\2\2\u055b\u055d\7|\2\2\u055c\u055b\3\2\2\2\u055c"+
		"\u055d\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u0560\5\u00c2b\2\u055f\u055e"+
		"\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562\7\33\2\2"+
		"\u0562\u0567\5\u008eH\2\u0563\u0564\7\35\2\2\u0564\u0566\5\u008eH\2\u0565"+
		"\u0563\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2"+
		"\2\2\u0568\u056a\3\2\2\2\u0569\u0567\3\2\2\2\u056a\u056b\7\34\2\2\u056b"+
		"\u0097\3\2\2\2\u056c\u056e\7|\2\2\u056d\u056f\5\u00c2b\2\u056e\u056d\3"+
		"\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\7\33\2\2\u0571"+
		"\u0576\5\u008eH\2\u0572\u0573\7\35\2\2\u0573\u0575\5\u008eH\2\u0574\u0572"+
		"\3\2\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u0579\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057a\7\34\2\2\u057a\u0099\3"+
		"\2\2\2\u057b\u057c\5\u00d0i\2\u057c\u009b\3\2\2\2\u057d\u057e\5\u00c6"+
		"d\2\u057e\u057f\7\32\2\2\u057f\u0581\3\2\2\2\u0580\u057d\3\2\2\2\u0580"+
		"\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0588\5\u00caf\2\u0583\u0584"+
		"\7r\2\2\u0584\u0585\7A\2\2\u0585\u0589\5\u00d6l\2\u0586\u0587\7\u0084"+
		"\2\2\u0587\u0589\7r\2\2\u0588\u0583\3\2\2\2\u0588\u0586\3\2\2\2\u0588"+
		"\u0589\3\2\2\2\u0589\u009d\3\2\2\2\u058a\u058c\5\u0088E\2\u058b\u058d"+
		"\t\b\2\2\u058c\u058b\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u009f\3\2\2\2\u058e"+
		"\u0592\5\u00b2Z\2\u058f\u0592\5\u00c2b\2\u0590\u0592\7\u00be\2\2\u0591"+
		"\u058e\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0590\3\2\2\2\u0592\u00a1\3\2"+
		"\2\2\u0593\u059f\5\u00caf\2\u0594\u0595\7\33\2\2\u0595\u059a\5\u00d0i"+
		"\2\u0596\u0597\7\35\2\2\u0597\u0599\5\u00d0i\2\u0598\u0596\3\2\2\2\u0599"+
		"\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2"+
		"\2\2\u059c\u059a\3\2\2\2\u059d\u059e\7\34\2\2\u059e\u05a0\3\2\2\2\u059f"+
		"\u0594\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\79"+
		"\2\2\u05a2\u05a3\7\33\2\2\u05a3\u05a4\5p9\2\u05a4\u05a5\7\34\2\2\u05a5"+
		"\u00a3\3\2\2\2\u05a6\u05b3\7\37\2\2\u05a7\u05a8\5\u00caf\2\u05a8\u05a9"+
		"\7\32\2\2\u05a9\u05aa\7\37\2\2\u05aa\u05b3\3\2\2\2\u05ab\u05b0\5\u0088"+
		"E\2\u05ac\u05ae\79\2\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af"+
		"\3\2\2\2\u05af\u05b1\5\u00bc_\2\u05b0\u05ad\3\2\2\2\u05b0\u05b1\3\2\2"+
		"\2\u05b1\u05b3\3\2\2\2\u05b2\u05a6\3\2\2\2\u05b2\u05a7\3\2\2\2\u05b2\u05ab"+
		"\3\2\2\2\u05b3\u00a5\3\2\2\2\u05b4\u05b5\5\u00c6d\2\u05b5\u05b6\7\32\2"+
		"\2\u05b6\u05b8\3\2\2\2\u05b7\u05b4\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9"+
		"\3\2\2\2\u05b9\u05be\5\u00caf\2\u05ba\u05bc\79\2\2\u05bb\u05ba\3\2\2\2"+
		"\u05bb\u05bc\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\5\u00e2r\2\u05be"+
		"\u05bb\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c5\3\2\2\2\u05c0\u05c1\7r"+
		"\2\2\u05c1\u05c2\7A\2\2\u05c2\u05c6\5\u00d6l\2\u05c3\u05c4\7\u0084\2\2"+
		"\u05c4\u05c6\7r\2\2\u05c5\u05c0\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05e4\3\2\2\2\u05c7\u05d1\7\33\2\2\u05c8\u05cd\5\u00a6"+
		"T\2\u05c9\u05ca\7\35\2\2\u05ca\u05cc\5\u00a6T\2\u05cb\u05c9\3\2\2\2\u05cc"+
		"\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d2\3\2"+
		"\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d2\5\u00a8U\2\u05d1\u05c8\3\2\2\2\u05d1"+
		"\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d8\7\34\2\2\u05d4\u05d6\7"+
		"9\2\2\u05d5\u05d4\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7"+
		"\u05d9\5\u00e2r\2\u05d8\u05d5\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05e4"+
		"\3\2\2\2\u05da\u05db\7\33\2\2\u05db\u05dc\5p9\2\u05dc\u05e1\7\34\2\2\u05dd"+
		"\u05df\79\2\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\3\2"+
		"\2\2\u05e0\u05e2\5\u00e2r\2\u05e1\u05de\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e4\3\2\2\2\u05e3\u05b7\3\2\2\2\u05e3\u05c7\3\2\2\2\u05e3\u05da\3\2"+
		"\2\2\u05e4\u00a7\3\2\2\2\u05e5\u05ec\5\u00a6T\2\u05e6\u05e7\5\u00aaV\2"+
		"\u05e7\u05e8\5\u00a6T\2\u05e8\u05e9\5\u00acW\2\u05e9\u05eb\3\2\2\2\u05ea"+
		"\u05e6\3\2\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2"+
		"\2\2\u05ed\u00a9\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef\u05f9\7\35\2\2\u05f0"+
		"\u05f2\7}\2\2\u05f1\u05f3\7\u008d\2\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3"+
		"\3\2\2\2\u05f3\u05f6\3\2\2\2\u05f4\u05f6\7t\2\2\u05f5\u05f0\3\2\2\2\u05f5"+
		"\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\7{"+
		"\2\2\u05f8\u05ef\3\2\2\2\u05f8\u05f5\3\2\2\2\u05f9\u00ab\3\2\2\2\u05fa"+
		"\u05fb\7\u0089\2\2\u05fb\u05fd\5\u0088E\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd"+
		"\3\2\2\2\u05fd\u00ad\3\2\2\2\u05fe\u0600\7\u00a1\2\2\u05ff\u0601\t\7\2"+
		"\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0607"+
		"\5\u00a4S\2\u0603\u0604\7\35\2\2\u0604\u0606\5\u00a4S\2\u0605\u0603\3"+
		"\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u0616\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u0614\7g\2\2\u060b\u0610\5\u00a6"+
		"T\2\u060c\u060d\7\35\2\2\u060d\u060f\5\u00a6T\2\u060e\u060c\3\2\2\2\u060f"+
		"\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0615\3\2"+
		"\2\2\u0612\u0610\3\2\2\2\u0613\u0615\5\u00a8U\2\u0614\u060b\3\2\2\2\u0614"+
		"\u0613\3\2\2\2\u0615\u0617\3\2\2\2\u0616\u060a\3\2\2\2\u0616\u0617\3\2"+
		"\2\2\u0617\u061a\3\2\2\2\u0618\u0619\7\u00b5\2\2\u0619\u061b\5\u0088E"+
		"\2\u061a\u0618\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u062a\3\2\2\2\u061c\u061d"+
		"\7k\2\2\u061d\u061e\7A\2\2\u061e\u0623\5\u0088E\2\u061f\u0620\7\35\2\2"+
		"\u0620\u0622\5\u0088E\2\u0621\u061f\3\2\2\2\u0622\u0625\3\2\2\2\u0623"+
		"\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0628\3\2\2\2\u0625\u0623\3\2"+
		"\2\2\u0626\u0627\7l\2\2\u0627\u0629\5\u0088E\2\u0628\u0626\3\2\2\2\u0628"+
		"\u0629\3\2\2\2\u0629\u062b\3\2\2\2\u062a\u061c\3\2\2\2\u062a\u062b\3\2"+
		"\2\2\u062b\u0649\3\2\2\2\u062c\u062d\7\u00b0\2\2\u062d\u062e\7\33\2\2"+
		"\u062e\u0633\5\u0088E\2\u062f\u0630\7\35\2\2\u0630\u0632\5\u0088E\2\u0631"+
		"\u062f\3\2\2\2\u0632\u0635\3\2\2\2\u0633\u0631\3\2\2\2\u0633\u0634\3\2"+
		"\2\2\u0634\u0636\3\2\2\2\u0635\u0633\3\2\2\2\u0636\u0645\7\34\2\2\u0637"+
		"\u0638\7\35\2\2\u0638\u0639\7\33\2\2\u0639\u063e\5\u0088E\2\u063a\u063b"+
		"\7\35\2\2\u063b\u063d\5\u0088E\2\u063c\u063a\3\2\2\2\u063d\u0640\3\2\2"+
		"\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0641\3\2\2\2\u0640\u063e"+
		"\3\2\2\2\u0641\u0642\7\34\2\2\u0642\u0644\3\2\2\2\u0643\u0637\3\2\2\2"+
		"\u0644\u0647\3\2\2\2\u0645\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0649"+
		"\3\2\2\2\u0647\u0645\3\2\2\2\u0648\u05fe\3\2\2\2\u0648\u062c\3\2\2\2\u0649"+
		"\u00af\3\2\2\2\u064a\u0656\5\u00caf\2\u064b\u064c\7\33\2\2\u064c\u0651"+
		"\5\u00d0i\2\u064d\u064e\7\35\2\2\u064e\u0650\5\u00d0i\2\u064f\u064d\3"+
		"\2\2\2\u0650\u0653\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0654\3\2\2\2\u0653\u0651\3\2\2\2\u0654\u0655\7\34\2\2\u0655\u0657\3"+
		"\2\2\2\u0656\u064b\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u00b1\3\2\2\2\u0658"+
		"\u065a\t\n\2\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065b\3\2"+
		"\2\2\u065b\u065e\7\u00bc\2\2\u065c\u065e\7\37\2\2\u065d\u0659\3\2\2\2"+
		"\u065d\u065c\3\2\2\2\u065e\u00b3\3\2\2\2\u065f\u066b\7\u00bc\2\2\u0660"+
		"\u066b\7\u00be\2\2\u0661\u066b\7\u00bf\2\2\u0662\u066b\7\u0086\2\2\u0663"+
		"\u066b\7O\2\2\u0664\u066b\7N\2\2\u0665\u066b\7P\2\2\u0666\u0667\7\33\2"+
		"\2\u0667\u0668\5\u00b4[\2\u0668\u0669\7\34\2\2\u0669\u066b\3\2\2\2\u066a"+
		"\u065f\3\2\2\2\u066a\u0660\3\2\2\2\u066a\u0661\3\2\2\2\u066a\u0662\3\2"+
		"\2\2\u066a\u0663\3\2\2\2\u066a\u0664\3\2\2\2\u066a\u0665\3\2\2\2\u066a"+
		"\u0666\3\2\2\2\u066b\u00b5\3\2\2\2\u066c\u066d\t\16\2\2\u066d\u00b7\3"+
		"\2\2\2\u066e\u066f\7\u00be\2\2\u066f\u00b9\3\2\2\2\u0670\u0673\5\u0088"+
		"E\2\u0671\u0673\5v<\2\u0672\u0670\3\2\2\2\u0672\u0671\3\2\2\2\u0673\u00bb"+
		"\3\2\2\2\u0674\u0675\t\17\2\2\u0675\u00bd\3\2\2\2\u0676\u0677\t\20\2\2"+
		"\u0677\u00bf\3\2\2\2\u0678\u067a\13\2\2\2\u0679\u0678\3\2\2\2\u067a\u067b"+
		"\3\2\2\2\u067b\u0679\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u00c1\3\2\2\2\u067d"+
		"\u067e\5\u00eav\2\u067e\u00c3\3\2\2\2\u067f\u0680\5\u00eav\2\u0680\u00c5"+
		"\3\2\2\2\u0681\u0682\5\u00eav\2\u0682\u00c7\3\2\2\2\u0683\u0684\5\u00ea"+
		"v\2\u0684\u00c9\3\2\2\2\u0685\u0686\5\u00eav\2\u0686\u00cb\3\2\2\2\u0687"+
		"\u0688\5\u00eav\2\u0688\u00cd\3\2\2\2\u0689\u068a\5\u00eav\2\u068a\u00cf"+
		"\3\2\2\2\u068b\u068c\5\u00eav\2\u068c\u00d1\3\2\2\2\u068d\u068e\5\u00ea"+
		"v\2\u068e\u00d3\3\2\2\2\u068f\u0690\5\u00eav\2\u0690\u00d5\3\2\2\2\u0691"+
		"\u0692\5\u00eav\2\u0692\u00d7\3\2\2\2\u0693\u0694\5\u00eav\2\u0694\u00d9"+
		"\3\2\2\2\u0695\u0696\5\u00eav\2\u0696\u00db\3\2\2\2\u0697\u0698\5\u00ea"+
		"v\2\u0698\u00dd\3\2\2\2\u0699\u069a\5\u00eav\2\u069a\u00df\3\2\2\2\u069b"+
		"\u069c\5\u00eav\2\u069c\u00e1\3\2\2\2\u069d\u069e\7\u00bb\2\2\u069e\u00e3"+
		"\3\2\2\2\u069f\u06a0\5\u00eav\2\u06a0\u00e5\3\2\2\2\u06a1\u06a2\5\u00ea"+
		"v\2\u06a2\u00e7\3\2\2\2\u06a3\u06a4\5\u00eav\2\u06a4\u00e9\3\2\2\2\u06a5"+
		"\u06ac\7\u00bb\2\2\u06a6\u06ac\7\u00be\2\2\u06a7\u06a8\7\33\2\2\u06a8"+
		"\u06a9\5\u00eav\2\u06a9\u06aa\7\34\2\2\u06aa\u06ac\3\2\2\2\u06ab\u06a5"+
		"\3\2\2\2\u06ab\u06a6\3\2\2\2\u06ab\u06a7\3\2\2\2\u06ac\u00eb\3\2\2\2\u00db"+
		"\u00ee\u00f0\u00f5\u00fe\u0104\u0108\u010d\u0112\u0115\u011e\u0125\u0129"+
		"\u0130\u0133\u0136\u013c\u0142\u0149\u014c\u0151\u015d\u0164\u016b\u0171"+
		"\u0173\u0179\u0185\u0189\u018f\u01ab\u01af\u01b5\u01bd\u01c1\u01c9\u01d2"+
		"\u01d9\u01e2\u01e4\u01e9\u01f0\u0201\u0209\u0212\u0217\u021b\u0228\u022e"+
		"\u0236\u023d\u024c\u0253\u025a\u025f\u0261\u0267\u0273\u027a\u027f\u0283"+
		"\u028b\u0294\u0299\u029f\u02a9\u02af\u02b8\u02bd\u02c8\u02d0\u02da\u02de"+
		"\u02e7\u02ed\u02f2\u02f9\u02fe\u0304\u030e\u0315\u031f\u0322\u0331\u0336"+
		"\u033f\u0341\u0348\u034f\u0355\u035a\u0366\u0369\u036f\u0371\u0378\u0381"+
		"\u0386\u038f\u039a\u03a1\u03a7\u03b1\u03b4\u03ba\u03bc\u03c0\u03c7\u03d0"+
		"\u03d4\u03d6\u03da\u03e3\u03e8\u03ea\u03f3\u03fe\u0405\u0408\u0417\u041c"+
		"\u0421\u0423\u042a\u0431\u0436\u043a\u043e\u044d\u0452\u0455\u046a\u0470"+
		"\u0472\u0476\u047d\u0482\u048b\u0492\u0496\u049f\u04a2\u04a8\u04c6\u04d1"+
		"\u04db\u04de\u04e4\u04e7\u04e9\u04eb\u04f2\u04fb\u0500\u050c\u0510\u0514"+
		"\u0518\u051f\u0522\u0524\u052b\u052e\u0532\u053d\u0547\u0554\u055c\u055f"+
		"\u0567\u056e\u0576\u0580\u0588\u058c\u0591\u059a\u059f\u05ad\u05b0\u05b2"+
		"\u05b7\u05bb\u05be\u05c5\u05cd\u05d1\u05d5\u05d8\u05de\u05e1\u05e3\u05ec"+
		"\u05f2\u05f5\u05f8\u05fc\u0600\u0607\u0610\u0614\u0616\u061a\u0623\u0628"+
		"\u062a\u0633\u063e\u0645\u0648\u0651\u0656\u0659\u065d\u066a\u0672\u067b"+
		"\u06ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}