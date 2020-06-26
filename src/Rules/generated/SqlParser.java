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
		K_ADD=49, K_AFTER=50, K_AGGREGATION=51, K_ALL=52, K_ALTER=53, K_ANALYZE=54, 
		K_AND=55, K_AS=56, K_ASC=57, K_ATTACH=58, K_AUTOINCREMENT=59, K_BEFORE=60, 
		K_BEGIN=61, K_BETWEEN=62, K_BREAK=63, K_BY=64, K_CASCADE=65, K_CASE=66, 
		K_CAST=67, K_CHECK=68, K_COLLATE=69, K_COLUMN=70, K_COMMIT=71, K_CONFLICT=72, 
		K_CONSTRAINT=73, K_CONTINUE=74, K_CREATE=75, K_CROSS=76, K_CURRENT_DATE=77, 
		K_CURRENT_TIME=78, K_CURRENT_TIMESTAMP=79, K_DATABASE=80, K_DEFAULT=81, 
		K_DEFERRABLE=82, K_DEFERRED=83, K_DELETE=84, K_DESC=85, K_DETACH=86, K_DISTINCT=87, 
		K_DO=88, K_DROP=89, K_EACH=90, K_ELSE=91, K_END=92, K_ENABLE=93, K_ESCAPE=94, 
		K_EXCEPT=95, K_EXCLUSIVE=96, K_EXISTS=97, K_EXPLAIN=98, K_FAIL=99, K_FOR=100, 
		K_FOREIGN=101, K_FROM=102, K_FULL=103, K_FUNCTION=104, K_GLOB=105, K_GROUP=106, 
		K_HAVING=107, K_IF=108, K_IGNORE=109, K_IMMEDIATE=110, K_IN=111, K_INDEX=112, 
		K_INDEXED=113, K_INITIALLY=114, K_INNER=115, K_INSERT=116, K_INSTEAD=117, 
		K_INTERSECT=118, K_INTO=119, K_IS=120, K_ISNULL=121, K_JOIN=122, K_KEY=123, 
		K_LEFT=124, K_LIKE=125, K_LIMIT=126, K_MATCH=127, K_NATURAL=128, K_NEXTVAL=129, 
		K_NO=130, K_NOT=131, K_NOTNULL=132, K_NULL=133, K_OF=134, K_OFFSET=135, 
		K_ON=136, K_ONLY=137, K_OR=138, K_ORDER=139, K_OUTER=140, K_PLAN=141, 
		K_PRAGMA=142, K_PRIMARY=143, K_PRINT=144, K_QUERY=145, K_RAISE=146, K_RECURSIVE=147, 
		K_REFERENCES=148, K_REGEXP=149, K_REINDEX=150, K_RELEASE=151, K_RENAME=152, 
		K_REPLACE=153, K_RESTRICT=154, K_RETURN=155, K_RIGHT=156, K_ROLLBACK=157, 
		K_ROW=158, K_SAVEPOINT=159, K_SELECT=160, K_SET=161, K_SWITCH=162, K_TABLE=163, 
		K_TEMP=164, K_TEMPORARY=165, K_THEN=166, K_TO=167, K_TRANSACTION=168, 
		K_TRIGGER=169, K_TYPE=170, K_UNION=171, K_UNIQUE=172, K_UPDATE=173, K_USING=174, 
		K_VACUUM=175, K_VALUES=176, K_VIEW=177, K_VIRTUAL=178, K_VAR=179, K_WHEN=180, 
		K_WHERE=181, K_WHILE=182, K_WITH=183, K_WITHOUT=184, K_TRUE=185, K_FALSE=186, 
		IDENTIFIER=187, NUMERIC_LITERAL=188, BIND_PARAMETER=189, STRING_LITERAL=190, 
		BLOB_LITERAL=191, SINGLE_LINE_COMMENT=192, JAVA_SINGLE_LINE_COMMENT=193, 
		MULTILINE_COMMENT=194, SPACES=195, UNEXPECTED_CHAR=196, K_AGGREGATION_FUNCTION=197;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_java_stmt = 2, RULE_default_parameter = 3, 
		RULE_parameter_list = 4, RULE_argument_list = 5, RULE_java_function_call = 6, 
		RULE_higher_order_java_function_call = 7, RULE_ho_java_function = 8, RULE_return_stmt = 9, 
		RULE_return_value = 10, RULE_string = 11, RULE_java_function_declaration = 12, 
		RULE_block = 13, RULE_one_line_block = 14, RULE_java_body = 15, RULE_comments = 16, 
		RULE_variable = 17, RULE_variable_declaration = 18, RULE_variable_assignment = 19, 
		RULE_assginment = 20, RULE_variable_assignment_value = 21, RULE_array_identification = 22, 
		RULE_array_call = 23, RULE_element = 24, RULE_json_object = 25, RULE_print = 26, 
		RULE_value = 27, RULE_expression = 28, RULE_math_expression = 29, RULE_boolean_expression = 30, 
		RULE_logical_condition = 31, RULE_increment = 32, RULE_assignment_operator = 33, 
		RULE_conditional_stmt = 34, RULE_if_stmt = 35, RULE_else_if_stmt = 36, 
		RULE_else_stmt = 37, RULE_loop_stmt = 38, RULE_for_loop = 39, RULE_while_loop = 40, 
		RULE_do_while_loop = 41, RULE_for_each_loop = 42, RULE_switch_stmt = 43, 
		RULE_switch_case = 44, RULE_switch_default = 45, RULE_sql_stmt_list = 46, 
		RULE_sql_stmt = 47, RULE_alter_table_stmt = 48, RULE_create_aggregation_function = 49, 
		RULE_create_type = 50, RULE_type = 51, RULE_alter_table_add_constraint = 52, 
		RULE_alter_table_add = 53, RULE_create_table_stmt = 54, RULE_delete_stmt = 55, 
		RULE_drop_table_stmt = 56, RULE_factored_select_stmt = 57, RULE_insert_stmt = 58, 
		RULE_select_stmt = 59, RULE_select_or_values = 60, RULE_update_stmt = 61, 
		RULE_column_def = 62, RULE_type_name = 63, RULE_column_constraint = 64, 
		RULE_column_constraint_primary_key = 65, RULE_column_constraint_foreign_key = 66, 
		RULE_column_constraint_not_null = 67, RULE_column_constraint_null = 68, 
		RULE_column_default = 69, RULE_column_default_value = 70, RULE_expr = 71, 
		RULE_foreign_key_clause = 72, RULE_fk_target_column_name = 73, RULE_indexed_column = 74, 
		RULE_table_constraint = 75, RULE_table_constraint_primary_key = 76, RULE_table_constraint_foreign_key = 77, 
		RULE_table_constraint_unique = 78, RULE_table_constraint_key = 79, RULE_fk_origin_column_name = 80, 
		RULE_qualified_table_name = 81, RULE_ordering_term = 82, RULE_result_column = 83, 
		RULE_table_or_subquery = 84, RULE_join_clause = 85, RULE_join_operator = 86, 
		RULE_join_constraint = 87, RULE_select_core = 88, RULE_signed_number = 89, 
		RULE_literal_value = 90, RULE_unary_operator = 91, RULE_error_message = 92, 
		RULE_module_argument = 93, RULE_column_alias = 94, RULE_keyword = 95, 
		RULE_unknown = 96, RULE_name = 97, RULE_function_name = 98, RULE_database_name = 99, 
		RULE_source_table_name = 100, RULE_table_name = 101, RULE_table_or_index_name = 102, 
		RULE_new_table_name = 103, RULE_column_name = 104, RULE_collation_name = 105, 
		RULE_foreign_table = 106, RULE_index_name = 107, RULE_trigger_name = 108, 
		RULE_view_name = 109, RULE_module_name = 110, RULE_pragma_name = 111, 
		RULE_savepoint_name = 112, RULE_table_alias = 113, RULE_transaction_name = 114, 
		RULE_method_ID = 115, RULE_array_name = 116, RULE_any_name = 117;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "java_stmt", "default_parameter", "parameter_list", 
			"argument_list", "java_function_call", "higher_order_java_function_call", 
			"ho_java_function", "return_stmt", "return_value", "string", "java_function_declaration", 
			"block", "one_line_block", "java_body", "comments", "variable", "variable_declaration", 
			"variable_assignment", "assginment", "variable_assignment_value", "array_identification", 
			"array_call", "element", "json_object", "print", "value", "expression", 
			"math_expression", "boolean_expression", "logical_condition", "increment", 
			"assignment_operator", "conditional_stmt", "if_stmt", "else_if_stmt", 
			"else_stmt", "loop_stmt", "for_loop", "while_loop", "do_while_loop", 
			"for_each_loop", "switch_stmt", "switch_case", "switch_default", "sql_stmt_list", 
			"sql_stmt", "alter_table_stmt", "create_aggregation_function", "create_type", 
			"type", "alter_table_add_constraint", "alter_table_add", "create_table_stmt", 
			"delete_stmt", "drop_table_stmt", "factored_select_stmt", "insert_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "column_def", "type_name", 
			"column_constraint", "column_constraint_primary_key", "column_constraint_foreign_key", 
			"column_constraint_not_null", "column_constraint_null", "column_default", 
			"column_default_value", "expr", "foreign_key_clause", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "signed_number", "literal_value", "unary_operator", "error_message", 
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
			null, "'\"'", "'{'", "'}'", "'['", "']'", "':'", "'''", "'&&'", "'?'", 
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
			"K_AFTER", "K_AGGREGATION", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
			"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
			"K_BETWEEN", "K_BREAK", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", 
			"K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CONTINUE", 
			"K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DO", "K_DROP", "K_EACH", "K_ELSE", 
			"K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", 
			"K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_FUNCTION", 
			"K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", 
			"K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", 
			"K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", 
			"K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", 
			"K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", 
			"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_PRINT", "K_QUERY", 
			"K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", 
			"K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RETURN", "K_RIGHT", "K_ROLLBACK", 
			"K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_SWITCH", "K_TABLE", "K_TEMP", 
			"K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_TYPE", 
			"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
			"K_VIEW", "K_VIRTUAL", "K_VAR", "K_WHEN", "K_WHERE", "K_WHILE", "K_WITH", 
			"K_WITHOUT", "K_TRUE", "K_FALSE", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
			"STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "JAVA_SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "K_AGGREGATION_FUNCTION"
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL || _la==K_ALTER || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (K_CREATE - 75)) | (1L << (K_DELETE - 75)) | (1L << (K_DROP - 75)) | (1L << (K_INSERT - 75)))) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (K_SELECT - 160)) | (1L << (K_UPDATE - 160)) | (1L << (K_VALUES - 160)) | (1L << (UNEXPECTED_CHAR - 160)))) != 0)) {
					{
					setState(238);
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
						setState(236);
						sql_stmt_list();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(237);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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
			setState(247);
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
			setState(277);
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
				setState(251);
				variable_declaration();
				setState(252);
				match(SCOL);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(253);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				java_function_declaration();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL) {
					{
					{
					setState(257);
					match(SCOL);
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(263);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				java_function_call();
				setState(267);
				match(SCOL);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(268);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				higher_order_java_function_call();
				setState(272);
				match(SCOL);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(273);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
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
			setState(279);
			match(K_VAR);
			setState(280);
			variable();
			setState(281);
			match(ASSIGN);
			setState(282);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(284);
				match(K_VAR);
				setState(285);
				any_name();
				}
				break;
			}
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(COMMA);
					setState(289);
					match(K_VAR);
					setState(290);
					any_name();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_VAR) {
				{
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(296);
					match(COMMA);
					}
				}

				setState(299);
				default_parameter();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(300);
					match(COMMA);
					setState(301);
					default_parameter();
					}
					}
					setState(306);
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
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_CURRENT_DATE - 77)) | (1L << (K_CURRENT_TIME - 77)) | (1L << (K_CURRENT_TIMESTAMP - 77)) | (1L << (K_NULL - 77)))) != 0) || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (K_TRUE - 185)) | (1L << (K_FALSE - 185)) | (1L << (IDENTIFIER - 185)) | (1L << (NUMERIC_LITERAL - 185)) | (1L << (STRING_LITERAL - 185)) | (1L << (BLOB_LITERAL - 185)))) != 0)) {
				{
				setState(309);
				expression();
				}
			}

			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(COMMA);
					{
					setState(313);
					expression();
					}
					}
					} 
				}
				setState(318);
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
			setState(319);
			method_ID();
			setState(320);
			match(OPEN_PAR);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(321);
				argument_list();
				}
				break;
			}
			setState(324);
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
			setState(326);
			method_ID();
			{
			setState(327);
			match(OPEN_PAR);
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(328);
				argument_list();
				}
				break;
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(331);
				match(COMMA);
				}
			}

			{
			setState(334);
			ho_java_function();
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(335);
				match(COMMA);
				setState(336);
				argument_list();
				}
			}

			setState(339);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(K_FUNCTION);
			setState(342);
			match(OPEN_PAR);
			{
			setState(343);
			argument_list();
			}
			setState(344);
			match(CLOSE_PAR);
			setState(345);
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
			setState(347);
			match(K_RETURN);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_CURRENT_DATE - 77)) | (1L << (K_CURRENT_TIME - 77)) | (1L << (K_CURRENT_TIMESTAMP - 77)) | (1L << (K_NULL - 77)))) != 0) || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (K_TRUE - 185)) | (1L << (K_FALSE - 185)) | (1L << (IDENTIFIER - 185)) | (1L << (NUMERIC_LITERAL - 185)) | (1L << (STRING_LITERAL - 185)) | (1L << (BLOB_LITERAL - 185)))) != 0)) {
				{
				setState(348);
				return_value();
				}
			}

			setState(351);
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
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
		public List<TerminalNode> SPACES() { return getTokens(SqlParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(SqlParser.SPACES, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
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
			setState(358);
			match(T__0);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(359);
						expression();
						}
						break;
					case 2:
						{
						setState(360);
						match(SPACES);
						}
						break;
					case 3:
						{
						setState(361);
						any_name();
						}
						break;
					case 4:
						{
						setState(362);
						match(SPACES);
						}
						break;
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(368);
			match(T__0);
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
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(370);
				match(K_FUNCTION);
				}
			}

			setState(373);
			method_ID();
			setState(374);
			match(OPEN_PAR);
			{
			setState(375);
			parameter_list();
			}
			setState(376);
			match(CLOSE_PAR);
			setState(377);
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
			setState(379);
			match(T__1);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR) | (1L << K_BREAK))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_CONTINUE - 74)) | (1L << (K_DO - 74)) | (1L << (K_FOR - 74)) | (1L << (K_IF - 74)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (K_PRINT - 144)) | (1L << (K_SWITCH - 144)) | (1L << (K_VAR - 144)) | (1L << (K_WHILE - 144)) | (1L << (IDENTIFIER - 144)) | (1L << (STRING_LITERAL - 144)))) != 0)) {
				{
				{
				setState(380);
				java_body();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(386);
				return_stmt();
				}
			}

			setState(389);
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
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__9:
			case T__10:
			case OPEN_PAR:
			case K_BREAK:
			case K_CONTINUE:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_PRINT:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				java_body();
				}
				break;
			case K_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
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
		public Java_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_body; }
	 
		public Java_bodyContext() { }
		public void copyFrom(Java_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopBodyContext extends Java_bodyContext {
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public LoopBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLoopBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLoopBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLoopBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchBodyContext extends Java_bodyContext {
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public SwitchBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSwitchBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSwitchBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintBodyContext extends Java_bodyContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public PrintBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPrintBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPrintBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPrintBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScopeBodyContext extends Java_bodyContext {
		public Java_bodyContext java_body() {
			return getRuleContext(Java_bodyContext.class,0);
		}
		public ScopeBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterScopeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitScopeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitScopeBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncremetBodyContext extends Java_bodyContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public IncremetBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIncremetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIncremetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIncremetBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakBodyContext extends Java_bodyContext {
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public BreakBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBreakBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBreakBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBreakBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondBodyContext extends Java_bodyContext {
		public Conditional_stmtContext conditional_stmt() {
			return getRuleContext(Conditional_stmtContext.class,0);
		}
		public CondBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCondBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JfcBodyContext extends Java_bodyContext {
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public JfcBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJfcBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJfcBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJfcBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContimueBodyContext extends Java_bodyContext {
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public ContimueBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterContimueBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitContimueBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitContimueBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAssignBodyContext extends Java_bodyContext {
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public VarAssignBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVarAssignBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVarAssignBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVarAssignBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecBodyContext extends Java_bodyContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public VarDecBodyContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVarDecBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVarDecBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVarDecBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_bodyContext java_body() throws RecognitionException {
		Java_bodyContext _localctx = new Java_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_java_body);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new CondBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				conditional_stmt();
				}
				break;
			case 2:
				_localctx = new JfcBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				java_function_call();
				setState(397);
				match(SCOL);
				}
				break;
			case 3:
				_localctx = new LoopBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				loop_stmt();
				}
				break;
			case 4:
				_localctx = new SwitchBodyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				switch_stmt();
				}
				break;
			case 5:
				_localctx = new IncremetBodyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				increment();
				setState(402);
				match(SCOL);
				}
				break;
			case 6:
				_localctx = new VarDecBodyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				variable_declaration();
				setState(405);
				match(SCOL);
				}
				break;
			case 7:
				_localctx = new VarAssignBodyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(407);
				variable_assignment();
				setState(408);
				match(SCOL);
				}
				break;
			case 8:
				_localctx = new PrintBodyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				print();
				setState(411);
				match(SCOL);
				}
				break;
			case 9:
				_localctx = new ScopeBodyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(413);
				match(T__1);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR) | (1L << K_BREAK))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_CONTINUE - 74)) | (1L << (K_DO - 74)) | (1L << (K_FOR - 74)) | (1L << (K_IF - 74)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (K_PRINT - 144)) | (1L << (K_SWITCH - 144)) | (1L << (K_VAR - 144)) | (1L << (K_WHILE - 144)) | (1L << (IDENTIFIER - 144)) | (1L << (STRING_LITERAL - 144)))) != 0)) {
					{
					setState(414);
					java_body();
					}
				}

				setState(417);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new BreakBodyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(418);
				match(K_BREAK);
				setState(419);
				match(SCOL);
				}
				break;
			case 11:
				_localctx = new ContimueBodyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(420);
				match(K_CONTINUE);
				setState(421);
				match(SCOL);
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
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(JAVA_SINGLE_LINE_COMMENT);
				}
				break;
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(MULTILINE_COMMENT);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(T__1);
				setState(427);
				java_body();
				setState(428);
				match(T__2);
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
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
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
			int _alt;
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				any_name();
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(433);
						match(DOT);
						setState(434);
						any_name();
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
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
			setState(443);
			match(K_VAR);
			setState(444);
			variable_assignment();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(445);
				match(COMMA);
				setState(446);
				variable_assignment();
				}
				}
				setState(451);
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
		public List<AssginmentContext> assginment() {
			return getRuleContexts(AssginmentContext.class);
		}
		public AssginmentContext assginment(int i) {
			return getRuleContext(AssginmentContext.class,i);
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
			setState(452);
			variable();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ASSIGN))) != 0)) {
				{
				{
				setState(453);
				assginment();
				}
				}
				setState(458);
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

	public static class AssginmentContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Variable_assignment_valueContext variable_assignment_value() {
			return getRuleContext(Variable_assignment_valueContext.class,0);
		}
		public AssginmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assginment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAssginment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAssginment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAssginment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssginmentContext assginment() throws RecognitionException {
		AssginmentContext _localctx = new AssginmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assginment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			assignment_operator();
			setState(460);
			variable_assignment_value();
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
		enterRule(_localctx, 42, RULE_variable_assignment_value);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				logical_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				json_object();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
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
		enterRule(_localctx, 44, RULE_array_identification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__3);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(475);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
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
						setState(469);
						expression();
						setState(470);
						match(COMMA);
						}
						break;
					case T__3:
						{
						setState(472);
						array_identification();
						setState(473);
						match(COMMA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
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
				setState(480);
				expression();
				}
				break;
			case T__3:
				{
				setState(481);
				array_identification();
				}
				break;
			case T__4:
				break;
			default:
				break;
			}
			setState(484);
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
		enterRule(_localctx, 46, RULE_array_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			array_name();
			setState(487);
			match(T__3);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==OPEN_PAR || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_CURRENT_DATE - 77)) | (1L << (K_CURRENT_TIME - 77)) | (1L << (K_CURRENT_TIMESTAMP - 77)) | (1L << (K_NULL - 77)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (IDENTIFIER - 187)) | (1L << (NUMERIC_LITERAL - 187)) | (1L << (STRING_LITERAL - 187)) | (1L << (BLOB_LITERAL - 187)))) != 0)) {
				{
				setState(488);
				math_expression(0);
				}
			}

			setState(491);
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
		enterRule(_localctx, 48, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(IDENTIFIER);
			setState(494);
			match(T__5);
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case OPEN_PAR:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_NULL:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(495);
				value();
				}
				break;
			case T__1:
				{
				setState(496);
				json_object();
				}
				break;
			case T__6:
				{
				setState(497);
				match(T__6);
				setState(498);
				value();
				setState(499);
				match(T__6);
				}
				break;
			case T__3:
				{
				setState(501);
				array_identification();
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
		enterRule(_localctx, 50, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__1);
			setState(505);
			element();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(506);
				match(COMMA);
				setState(507);
				element();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
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
		enterRule(_localctx, 52, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(K_PRINT);
			setState(516);
			match(OPEN_PAR);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_CURRENT_DATE - 77)) | (1L << (K_CURRENT_TIME - 77)) | (1L << (K_CURRENT_TIMESTAMP - 77)) | (1L << (K_NULL - 77)))) != 0) || ((((_la - 185)) & ~0x3f) == 0 && ((1L << (_la - 185)) & ((1L << (K_TRUE - 185)) | (1L << (K_FALSE - 185)) | (1L << (IDENTIFIER - 185)) | (1L << (NUMERIC_LITERAL - 185)) | (1L << (STRING_LITERAL - 185)) | (1L << (BLOB_LITERAL - 185)))) != 0)) {
				{
				setState(517);
				expression();
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(520);
				match(PLUS);
				{
				setState(521);
				expression();
				}
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
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
	public static class ParenthValContext extends ValueContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public ParenthValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParenthVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParenthVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParenthVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JfcValContext extends ValueContext {
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public JfcValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJfcVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJfcVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJfcVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarValContext extends ValueContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVarVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVarVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVarVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LvValContext extends ValueContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public LvValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLvVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLvVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLvVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new VarValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				variable();
				}
				break;
			case 2:
				_localctx = new StrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				string();
				}
				break;
			case 3:
				_localctx = new JfcValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				java_function_call();
				}
				break;
			case 4:
				_localctx = new LvValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				literal_value();
				}
				break;
			case 5:
				_localctx = new ParenthValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				match(OPEN_PAR);
				setState(534);
				value();
				setState(535);
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
		enterRule(_localctx, 56, RULE_expression);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				boolean_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				math_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
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
	public static class ValueMathContext extends Math_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueMathContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterValueMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitValueMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitValueMath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticMathContext extends Math_expressionContext {
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
		public ArithmeticMathContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterArithmeticMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitArithmeticMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitArithmeticMath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthMathContext extends Math_expressionContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Math_expressionContext math_expression() {
			return getRuleContext(Math_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public ParenthMathContext(Math_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParenthMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParenthMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParenthMath(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_math_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				_localctx = new ValueMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(546);
				value();
				}
				break;
			case 2:
				{
				_localctx = new ParenthMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(547);
				match(OPEN_PAR);
				setState(548);
				math_expression(0);
				setState(549);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticMathContext(new Math_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
					setState(553);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(554);
					((ArithmeticMathContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2))) != 0)) ) {
						((ArithmeticMathContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(555);
					math_expression(3);
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
	public static class ParenthBoolContext extends Boolean_expressionContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public ParenthBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParenthBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParenthBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParenthBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareBoolContext extends Boolean_expressionContext {
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
		public CompareBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompareBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompareBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompareBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueBoolContext extends Boolean_expressionContext {
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TrueBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTrueBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTrueBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTrueBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleBoolContext extends Boolean_expressionContext {
		public Token op;
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public MultipleBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMultipleBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMultipleBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMultipleBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends Boolean_expressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseBoolContext extends Boolean_expressionContext {
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public FalseBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFalseBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFalseBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFalseBool(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_boolean_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				_localctx = new ValBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(562);
				value();
				}
				break;
			case 2:
				{
				_localctx = new CompareBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(563);
				math_expression(0);
				setState(564);
				((CompareBoolContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
					((CompareBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(565);
				math_expression(0);
				}
				break;
			case 3:
				{
				_localctx = new TrueBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(567);
				match(K_TRUE);
				}
				break;
			case 4:
				{
				_localctx = new FalseBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(568);
				match(K_FALSE);
				}
				break;
			case 5:
				{
				_localctx = new ParenthBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(569);
				match(OPEN_PAR);
				setState(570);
				boolean_expression(0);
				setState(571);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleBoolContext(new Boolean_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
					setState(575);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(576);
					((MultipleBoolContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==PIPE2) ) {
						((MultipleBoolContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(577);
					boolean_expression(5);
					}
					} 
				}
				setState(582);
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

	public static class Logical_conditionContext extends ParserRuleContext {
		public Logical_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_condition; }
	 
		public Logical_conditionContext() { }
		public void copyFrom(Logical_conditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalLogContext extends Logical_conditionContext {
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
		public NormalLogContext(Logical_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNormalLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNormalLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNormalLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthLogContext extends Logical_conditionContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logical_conditionContext logical_condition() {
			return getRuleContext(Logical_conditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public ParenthLogContext(Logical_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParenthLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParenthLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParenthLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_conditionContext logical_condition() throws RecognitionException {
		Logical_conditionContext _localctx = new Logical_conditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logical_condition);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new NormalLogContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				boolean_expression(0);
				{
				setState(584);
				match(T__8);
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(585);
					logical_condition();
					}
					break;
				case 2:
					{
					setState(586);
					expression();
					}
					break;
				}
				setState(589);
				match(T__5);
				setState(592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(590);
					logical_condition();
					}
					break;
				case 2:
					{
					setState(591);
					expression();
					}
					break;
				}
				}
				}
				break;
			case 2:
				_localctx = new ParenthLogContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(OPEN_PAR);
				setState(595);
				logical_condition();
				setState(596);
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
		public Token op;
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
		public Token op;
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
		public Token op;
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
		public Token op;
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
		enterRule(_localctx, 64, RULE_increment);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new PostIncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				variable();
				setState(601);
				((PostIncContext)_localctx).op = match(T__9);
				}
				break;
			case 2:
				_localctx = new PreIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				((PreIncContext)_localctx).op = match(T__9);
				setState(604);
				variable();
				}
				break;
			case 3:
				_localctx = new PostDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				variable();
				setState(606);
				((PostDecContext)_localctx).op = match(T__10);
				}
				break;
			case 4:
				_localctx = new PreDecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				((PreDecContext)_localctx).op = match(T__10);
				setState(609);
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
		enterRule(_localctx, 66, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
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
		enterRule(_localctx, 68, RULE_conditional_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(614);
					if_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(617); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619);
					else_if_stmt();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(625);
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
		enterRule(_localctx, 70, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(K_IF);
			setState(629);
			match(OPEN_PAR);
			setState(630);
			boolean_expression(0);
			setState(631);
			match(CLOSE_PAR);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(632);
				block();
				}
				break;
			case 2:
				{
				setState(633);
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
		enterRule(_localctx, 72, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(K_ELSE);
			setState(637);
			match(K_IF);
			setState(638);
			match(OPEN_PAR);
			setState(639);
			boolean_expression(0);
			setState(640);
			match(CLOSE_PAR);
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(641);
				block();
				}
				break;
			case 2:
				{
				setState(642);
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
		enterRule(_localctx, 74, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(K_ELSE);
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(646);
				block();
				}
				break;
			case 2:
				{
				setState(647);
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
		enterRule(_localctx, 76, RULE_loop_stmt);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				do_while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(653);
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
		enterRule(_localctx, 78, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(656);
			match(K_FOR);
			setState(657);
			match(OPEN_PAR);
			setState(658);
			variable_declaration();
			setState(659);
			match(SCOL);
			setState(660);
			boolean_expression(0);
			setState(661);
			match(SCOL);
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(662);
				increment();
				}
				break;
			case 2:
				{
				setState(663);
				variable_assignment();
				}
				break;
			}
			setState(666);
			match(CLOSE_PAR);
			}
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(668);
				block();
				}
				break;
			case 2:
				{
				setState(669);
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
		enterRule(_localctx, 80, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(672);
			match(K_WHILE);
			setState(673);
			match(OPEN_PAR);
			setState(674);
			boolean_expression(0);
			setState(675);
			match(CLOSE_PAR);
			}
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(677);
				block();
				}
				break;
			case 2:
				{
				setState(678);
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
		enterRule(_localctx, 82, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(K_DO);
			{
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(682);
				block();
				}
				break;
			case 2:
				{
				setState(683);
				one_line_block();
				}
				break;
			}
			}
			setState(686);
			match(K_WHILE);
			setState(687);
			match(OPEN_PAR);
			setState(688);
			boolean_expression(0);
			setState(689);
			match(CLOSE_PAR);
			setState(690);
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
		enterRule(_localctx, 84, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(K_FOR);
			setState(693);
			match(OPEN_PAR);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(694);
				match(K_VAR);
				}
			}

			setState(697);
			variable();
			setState(698);
			match(T__5);
			setState(699);
			array_name();
			setState(700);
			match(CLOSE_PAR);
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(701);
				block();
				}
				break;
			case 2:
				{
				setState(702);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
		enterRule(_localctx, 86, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(K_SWITCH);
			setState(706);
			match(OPEN_PAR);
			setState(707);
			variable();
			setState(708);
			match(CLOSE_PAR);
			setState(709);
			match(T__1);
			setState(711); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(710);
				switch_case();
				}
				}
				setState(713); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CASE );
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(715);
				switch_default();
				}
			}

			setState(718);
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

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
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
		enterRule(_localctx, 88, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(720);
			match(K_CASE);
			{
			setState(721);
			value();
			}
			setState(722);
			match(T__5);
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(723);
				block();
				}
				break;
			case 2:
				{
				setState(724);
				one_line_block();
				}
				break;
			}
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BREAK || _la==K_CONTINUE) {
				{
				setState(727);
				_la = _input.LA(1);
				if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(728);
				match(SCOL);
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
		enterRule(_localctx, 90, RULE_switch_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			match(K_DEFAULT);
			setState(732);
			match(T__5);
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(733);
				block();
				}
				break;
			case 2:
				{
				setState(734);
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
		enterRule(_localctx, 92, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(737);
				match(SCOL);
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			sql_stmt();
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(745); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(744);
						match(SCOL);
						}
						}
						setState(747); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(749);
					sql_stmt();
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755);
					match(SCOL);
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 94, RULE_sql_stmt);
		try {
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				delete_stmt();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(764);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				enterOuterAlt(_localctx, 5);
				{
				setState(765);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 6);
				{
				setState(766);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(767);
				update_stmt();
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
		enterRule(_localctx, 96, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(K_ALTER);
			setState(771);
			match(K_TABLE);
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(772);
				database_name();
				setState(773);
				match(DOT);
				}
				break;
			}
			setState(777);
			source_table_name();
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(778);
				match(K_RENAME);
				setState(779);
				match(K_TO);
				setState(780);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(781);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(782);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(783);
				match(K_ADD);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(784);
					match(K_COLUMN);
					}
				}

				setState(787);
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

	public static class Create_aggregation_functionContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_AGGREGATION() { return getToken(SqlParser.K_AGGREGATION, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Create_aggregation_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_aggregation_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_aggregation_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_aggregation_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_aggregation_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_aggregation_functionContext create_aggregation_function() throws RecognitionException {
		Create_aggregation_functionContext _localctx = new Create_aggregation_functionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_aggregation_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(K_CREATE);
			setState(791);
			match(K_AGGREGATION);
			setState(792);
			match(K_FUNCTION);
			setState(793);
			any_name();
			setState(794);
			match(OPEN_PAR);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(795);
				type();
				setState(796);
				any_name();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
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

	public static class Create_typeContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TYPE() { return getToken(SqlParser.K_TYPE, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Create_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_typeContext create_type() throws RecognitionException {
		Create_typeContext _localctx = new Create_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(K_CREATE);
			setState(806);
			match(K_TYPE);
			setState(807);
			any_name();
			setState(808);
			match(OPEN_PAR);
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(809);
				type();
				setState(810);
				any_name();
				}
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(817);
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

	public static class TypeContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
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
		enterRule(_localctx, 104, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(K_ADD);
			setState(822);
			match(K_CONSTRAINT);
			setState(823);
			any_name();
			setState(824);
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
		enterRule(_localctx, 106, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(K_ADD);
			setState(827);
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
		enterRule(_localctx, 108, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(K_CREATE);
			setState(830);
			match(K_TABLE);
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(831);
				match(K_IF);
				setState(832);
				match(K_NOT);
				setState(833);
				match(K_EXISTS);
				}
			}

			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(836);
				database_name();
				setState(837);
				match(DOT);
				}
				break;
			}
			setState(841);
			table_name();
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(842);
				match(OPEN_PAR);
				setState(843);
				column_def();
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(848);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(844);
						match(COMMA);
						setState(845);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(846);
						match(COMMA);
						setState(847);
						column_def();
						}
						break;
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(853);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(855);
				match(K_AS);
				setState(856);
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
		enterRule(_localctx, 110, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(K_DELETE);
			setState(860);
			match(K_FROM);
			setState(861);
			qualified_table_name();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(862);
				match(K_WHERE);
				setState(863);
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
		enterRule(_localctx, 112, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(K_DROP);
			setState(867);
			match(K_TABLE);
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(868);
				match(K_IF);
				setState(869);
				match(K_EXISTS);
				}
			}

			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(872);
				database_name();
				setState(873);
				match(DOT);
				}
				break;
			}
			setState(877);
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
		enterRule(_localctx, 114, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			select_core();
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(880);
				match(K_ORDER);
				setState(881);
				match(K_BY);
				setState(882);
				ordering_term();
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(883);
					match(COMMA);
					setState(884);
					ordering_term();
					}
					}
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(892);
				match(K_LIMIT);
				setState(893);
				expr(0);
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(894);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(895);
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
		enterRule(_localctx, 116, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(K_INSERT);
			setState(901);
			match(K_INTO);
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(902);
				database_name();
				setState(903);
				match(DOT);
				}
				break;
			}
			setState(907);
			table_name();
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(908);
				match(OPEN_PAR);
				setState(909);
				column_name();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(910);
					match(COMMA);
					setState(911);
					column_name();
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				match(CLOSE_PAR);
				}
			}

			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(921);
				match(K_VALUES);
				setState(922);
				match(OPEN_PAR);
				setState(923);
				expr(0);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(924);
					match(COMMA);
					setState(925);
					expr(0);
					}
					}
					setState(930);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
				match(CLOSE_PAR);
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(932);
					match(COMMA);
					setState(933);
					match(OPEN_PAR);
					setState(934);
					expr(0);
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(935);
						match(COMMA);
						setState(936);
						expr(0);
						}
						}
						setState(941);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(942);
					match(CLOSE_PAR);
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(949);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(950);
				match(K_DEFAULT);
				setState(951);
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
		enterRule(_localctx, 118, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			select_or_values();
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(955);
				match(K_ORDER);
				setState(956);
				match(K_BY);
				setState(957);
				ordering_term();
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(958);
					match(COMMA);
					setState(959);
					ordering_term();
					}
					}
					setState(964);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(967);
				match(K_LIMIT);
				setState(968);
				expr(0);
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(969);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(970);
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
		enterRule(_localctx, 120, RULE_select_or_values);
		int _la;
		try {
			setState(1049);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				match(K_SELECT);
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(976);
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

				setState(979);
				result_column();
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(980);
					match(COMMA);
					setState(981);
					result_column();
					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(987);
					match(K_FROM);
					setState(997);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(988);
						table_or_subquery();
						setState(993);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(989);
							match(COMMA);
							setState(990);
							table_or_subquery();
							}
							}
							setState(995);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(996);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1001);
					match(K_WHERE);
					setState(1002);
					expr(0);
					}
				}

				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1005);
					match(K_GROUP);
					setState(1006);
					match(K_BY);
					setState(1007);
					expr(0);
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1008);
						match(COMMA);
						setState(1009);
						expr(0);
						}
						}
						setState(1014);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1017);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1015);
						match(K_HAVING);
						setState(1016);
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
				setState(1021);
				match(K_VALUES);
				setState(1022);
				match(OPEN_PAR);
				setState(1023);
				expr(0);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1024);
					match(COMMA);
					setState(1025);
					expr(0);
					}
					}
					setState(1030);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				match(CLOSE_PAR);
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1032);
					match(COMMA);
					setState(1033);
					match(OPEN_PAR);
					setState(1034);
					expr(0);
					setState(1039);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1035);
						match(COMMA);
						setState(1036);
						expr(0);
						}
						}
						setState(1041);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1042);
					match(CLOSE_PAR);
					}
					}
					setState(1048);
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
		enterRule(_localctx, 122, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(K_UPDATE);
			setState(1052);
			qualified_table_name();
			setState(1053);
			match(K_SET);
			setState(1054);
			column_name();
			setState(1055);
			match(ASSIGN);
			setState(1056);
			expr(0);
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1057);
				match(COMMA);
				setState(1058);
				column_name();
				setState(1059);
				match(ASSIGN);
				setState(1060);
				expr(0);
				}
				}
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1067);
				match(K_WHERE);
				setState(1068);
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
		enterRule(_localctx, 124, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			column_name();
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (OPEN_PAR - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_DEFAULT - 25)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_NOT - 131)) | (1L << (K_NULL - 131)) | (1L << (K_PRIMARY - 131)) | (1L << (K_REFERENCES - 131)) | (1L << (K_UNIQUE - 131)) | (1L << (IDENTIFIER - 131)) | (1L << (STRING_LITERAL - 131)))) != 0)) {
				{
				setState(1074);
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
					setState(1072);
					column_constraint();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1073);
					type_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1078);
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
		enterRule(_localctx, 126, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			name();
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1080);
				match(OPEN_PAR);
				setState(1081);
				signed_number();
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1082);
					any_name();
					}
				}

				setState(1085);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1087);
				match(OPEN_PAR);
				setState(1088);
				signed_number();
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1089);
					any_name();
					}
				}

				setState(1092);
				match(COMMA);
				setState(1093);
				signed_number();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1094);
					any_name();
					}
				}

				setState(1097);
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
		enterRule(_localctx, 128, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1101);
				match(K_CONSTRAINT);
				setState(1102);
				name();
				}
			}

			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1105);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1106);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1107);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1108);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1109);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(1110);
				match(K_CHECK);
				setState(1111);
				match(OPEN_PAR);
				setState(1112);
				expr(0);
				setState(1113);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1115);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1116);
				match(K_COLLATE);
				setState(1117);
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
		enterRule(_localctx, 130, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(K_PRIMARY);
			setState(1121);
			match(K_KEY);
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1122);
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

			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(1125);
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
		enterRule(_localctx, 132, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
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
		enterRule(_localctx, 134, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(K_NOT);
			setState(1131);
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
		enterRule(_localctx, 136, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
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
		enterRule(_localctx, 138, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(K_DEFAULT);
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1136);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1137);
				match(OPEN_PAR);
				setState(1138);
				expr(0);
				setState(1139);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1141);
				match(K_NEXTVAL);
				setState(1142);
				match(OPEN_PAR);
				setState(1143);
				expr(0);
				setState(1144);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1146);
				any_name();
				}
				break;
			}
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(1149);
				match(T__21);
				setState(1151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1150);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1153); 
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
		enterRule(_localctx, 140, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1157);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1158);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Case1Context extends ExprContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Case1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case2Context extends ExprContext {
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
		public Case2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case3Context extends ExprContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Case3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case4Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public Case4Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case5Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public Case5Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case6Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Case6Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case7Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SqlParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SqlParser.PIPE, 0); }
		public Case7Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case15Context extends ExprContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Case15Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase15(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase15(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase15(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case8Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public Case8Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case9Context extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SqlParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SqlParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SqlParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SqlParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SqlParser.K_REGEXP, 0); }
		public Case9Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase9(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case11Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public Case11Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase11(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case12Context extends ExprContext {
		public Token op;
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SqlParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Case12Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase12(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase12(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case13Context extends ExprContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Case13Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase13(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase13(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case14Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Case14Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase14(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase14(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case10Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_AND() { return getToken(SqlParser.K_AND, 0); }
		public Case10Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase10(this);
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				_localctx = new Case1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1162);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new Case2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						setState(1163);
						database_name();
						setState(1164);
						match(DOT);
						}
						break;
					}
					setState(1168);
					table_name();
					setState(1169);
					match(DOT);
					}
					break;
				}
				setState(1173);
				column_name();
				}
				break;
			case 3:
				{
				_localctx = new Case3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1174);
				unary_operator();
				setState(1175);
				expr(13);
				}
				break;
			case 4:
				{
				_localctx = new Case12Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1177);
				function_name();
				setState(1178);
				match(OPEN_PAR);
				setState(1191);
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
					setState(1180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1179);
						match(K_DISTINCT);
						}
					}

					setState(1182);
					expr(0);
					setState(1187);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1183);
						match(COMMA);
						setState(1184);
						expr(0);
						}
						}
						setState(1189);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1190);
					((Case12Context)_localctx).op = match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1193);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				_localctx = new Case13Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1195);
				match(OPEN_PAR);
				setState(1196);
				expr(0);
				setState(1197);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				_localctx = new Case15Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1199);
						match(K_NOT);
						}
					}

					setState(1202);
					match(K_EXISTS);
					}
				}

				setState(1205);
				match(OPEN_PAR);
				setState(1206);
				select_stmt();
				setState(1207);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						_localctx = new Case4Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1211);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1212);
						((Case4Context)_localctx).op = match(PIPE2);
						setState(1213);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new Case5Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1214);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1215);
						((Case5Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Case5Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1216);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new Case6Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1217);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1218);
						((Case6Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Case6Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1219);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new Case7Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1220);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1221);
						((Case7Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
							((Case7Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1222);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new Case8Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1223);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1224);
						((Case8Context)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
							((Case8Context)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1225);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new Case9Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1226);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1238);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ASSIGN:
						case EQ:
						case NOT_EQ1:
						case NOT_EQ2:
							{
							setState(1227);
							((Case9Context)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
								((Case9Context)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						case K_GLOB:
						case K_IN:
						case K_IS:
						case K_LIKE:
						case K_MATCH:
						case K_REGEXP:
							{
							setState(1236);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
							case 1:
								{
								setState(1228);
								match(K_IS);
								}
								break;
							case 2:
								{
								setState(1229);
								match(K_IS);
								setState(1230);
								match(K_NOT);
								}
								break;
							case 3:
								{
								setState(1231);
								match(K_IN);
								}
								break;
							case 4:
								{
								setState(1232);
								match(K_LIKE);
								}
								break;
							case 5:
								{
								setState(1233);
								match(K_GLOB);
								}
								break;
							case 6:
								{
								setState(1234);
								match(K_MATCH);
								}
								break;
							case 7:
								{
								setState(1235);
								match(K_REGEXP);
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1240);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new Case10Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1241);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1242);
						match(K_AND);
						setState(1243);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new Case11Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1244);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1245);
						match(K_OR);
						setState(1246);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new Case14Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1247);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1249);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1248);
							match(K_NOT);
							}
						}

						setState(1251);
						match(K_IN);
						setState(1271);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
						case 1:
							{
							setState(1252);
							match(OPEN_PAR);
							setState(1262);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(1253);
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
								setState(1254);
								expr(0);
								setState(1259);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1255);
									match(COMMA);
									setState(1256);
									expr(0);
									}
									}
									setState(1261);
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
							setState(1264);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1268);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
							case 1:
								{
								setState(1265);
								database_name();
								setState(1266);
								match(DOT);
								}
								break;
							}
							setState(1270);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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
		enterRule(_localctx, 144, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(K_REFERENCES);
			setState(1282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1279);
				database_name();
				setState(1280);
				match(DOT);
				}
				break;
			}
			setState(1284);
			foreign_table();
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1285);
				match(OPEN_PAR);
				setState(1286);
				fk_target_column_name();
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1287);
					match(COMMA);
					setState(1288);
					fk_target_column_name();
					}
					}
					setState(1293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1294);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1298);
					match(K_ON);
					setState(1299);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1300);
						match(K_SET);
						setState(1301);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1302);
						match(K_SET);
						setState(1303);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1304);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1305);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1306);
						match(K_NO);
						setState(1307);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1310);
					match(K_MATCH);
					setState(1311);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1319);
					match(K_NOT);
					}
				}

				setState(1322);
				match(K_DEFERRABLE);
				setState(1327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1323);
					match(K_INITIALLY);
					setState(1324);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1325);
					match(K_INITIALLY);
					setState(1326);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1329);
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
		enterRule(_localctx, 146, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
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
		public Token desc;
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
		enterRule(_localctx, 148, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			column_name();
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1337);
				match(K_COLLATE);
				setState(1338);
				collation_name();
				}
			}

			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1341);
				((Indexed_columnContext)_localctx).desc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
					((Indexed_columnContext)_localctx).desc = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 150, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1344);
				match(K_CONSTRAINT);
				setState(1345);
				name();
				}
			}

			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1348);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1349);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1350);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1351);
				match(K_CHECK);
				setState(1352);
				match(OPEN_PAR);
				setState(1353);
				expr(0);
				setState(1354);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1356);
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
		enterRule(_localctx, 152, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(K_PRIMARY);
			setState(1360);
			match(K_KEY);
			setState(1361);
			match(OPEN_PAR);
			setState(1362);
			indexed_column();
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1363);
				match(COMMA);
				setState(1364);
				indexed_column();
				}
				}
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1370);
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
		enterRule(_localctx, 154, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			match(K_FOREIGN);
			setState(1373);
			match(K_KEY);
			setState(1374);
			match(OPEN_PAR);
			setState(1375);
			fk_origin_column_name();
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1376);
				match(COMMA);
				setState(1377);
				fk_origin_column_name();
				}
				}
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1383);
			match(CLOSE_PAR);
			setState(1384);
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
		enterRule(_localctx, 156, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(K_UNIQUE);
			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1387);
				match(K_KEY);
				}
			}

			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1390);
				name();
				}
				break;
			}
			setState(1393);
			match(OPEN_PAR);
			setState(1394);
			indexed_column();
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1395);
				match(COMMA);
				setState(1396);
				indexed_column();
				}
				}
				setState(1401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1402);
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
		enterRule(_localctx, 158, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			match(K_KEY);
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1405);
				name();
				}
				break;
			}
			setState(1408);
			match(OPEN_PAR);
			setState(1409);
			indexed_column();
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1410);
				match(COMMA);
				setState(1411);
				indexed_column();
				}
				}
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1417);
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
		enterRule(_localctx, 160, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
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
		enterRule(_localctx, 162, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1421);
				database_name();
				setState(1422);
				match(DOT);
				}
				break;
			}
			setState(1426);
			table_name();
			setState(1432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1427);
				match(K_INDEXED);
				setState(1428);
				match(K_BY);
				setState(1429);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1430);
				match(K_NOT);
				setState(1431);
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
		enterRule(_localctx, 164, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			expr(0);
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1435);
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
		enterRule(_localctx, 166, RULE_result_column);
		int _la;
		try {
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1438);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				table_name();
				setState(1440);
				match(DOT);
				setState(1441);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1443);
				expr(0);
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1444);
						match(K_AS);
						}
					}

					setState(1447);
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
		enterRule(_localctx, 168, RULE_table_or_subquery);
		int _la;
		try {
			setState(1499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1452);
					database_name();
					setState(1453);
					match(DOT);
					}
					break;
				}
				setState(1457);
				table_name();
				setState(1462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1458);
						match(K_AS);
						}
					}

					setState(1461);
					table_alias();
					}
					break;
				}
				setState(1469);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1464);
					match(K_INDEXED);
					setState(1465);
					match(K_BY);
					setState(1466);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1467);
					match(K_NOT);
					setState(1468);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case OPEN_PAR:
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
				case IDENTIFIER:
				case STRING_LITERAL:
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
				setState(1471);
				match(OPEN_PAR);
				setState(1481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1472);
					table_or_subquery();
					setState(1477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1473);
						match(COMMA);
						setState(1474);
						table_or_subquery();
						}
						}
						setState(1479);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1480);
					join_clause();
					}
					break;
				}
				setState(1483);
				match(CLOSE_PAR);
				setState(1488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1484);
						match(K_AS);
						}
					}

					setState(1487);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(OPEN_PAR);
				setState(1491);
				select_stmt();
				setState(1492);
				match(CLOSE_PAR);
				setState(1497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1493);
						match(K_AS);
						}
					}

					setState(1496);
					table_alias();
					}
					break;
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
		enterRule(_localctx, 170, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			table_or_subquery();
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (K_INNER - 115)) | (1L << (K_JOIN - 115)) | (1L << (K_LEFT - 115)))) != 0) || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(1502);
				join_operator();
				setState(1503);
				table_or_subquery();
				setState(1504);
				join_constraint();
				}
				}
				setState(1510);
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
		enterRule(_localctx, 172, RULE_join_operator);
		int _la;
		try {
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1512);
					match(K_LEFT);
					setState(1514);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1513);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1516);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1519);
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
		enterRule(_localctx, 174, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1522);
			match(K_ON);
			setState(1523);
			expr(0);
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
		enterRule(_localctx, 176, RULE_select_core);
		int _la;
		try {
			setState(1599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				match(K_SELECT);
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1526);
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

				setState(1529);
				result_column();
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1530);
					match(COMMA);
					setState(1531);
					result_column();
					}
					}
					setState(1536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1537);
					match(K_FROM);
					setState(1547);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						setState(1538);
						table_or_subquery();
						setState(1543);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1539);
							match(COMMA);
							setState(1540);
							table_or_subquery();
							}
							}
							setState(1545);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1546);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1551);
					match(K_WHERE);
					setState(1552);
					expr(0);
					}
				}

				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1555);
					match(K_GROUP);
					setState(1556);
					match(K_BY);
					setState(1557);
					expr(0);
					setState(1562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1558);
						match(COMMA);
						setState(1559);
						expr(0);
						}
						}
						setState(1564);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1567);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1565);
						match(K_HAVING);
						setState(1566);
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
				setState(1571);
				match(K_VALUES);
				setState(1572);
				match(OPEN_PAR);
				setState(1573);
				expr(0);
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1574);
					match(COMMA);
					setState(1575);
					expr(0);
					}
					}
					setState(1580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1581);
				match(CLOSE_PAR);
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1582);
					match(COMMA);
					setState(1583);
					match(OPEN_PAR);
					setState(1584);
					expr(0);
					setState(1589);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1585);
						match(COMMA);
						setState(1586);
						expr(0);
						}
						}
						setState(1591);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1592);
					match(CLOSE_PAR);
					}
					}
					setState(1598);
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
		enterRule(_localctx, 178, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1601);
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

				setState(1604);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1605);
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
		enterRule(_localctx, 180, RULE_literal_value);
		try {
			setState(1619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1610);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1611);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(1612);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1613);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1614);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(1615);
				match(OPEN_PAR);
				setState(1616);
				literal_value();
				setState(1617);
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
		enterRule(_localctx, 182, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
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
		enterRule(_localctx, 184, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
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
		enterRule(_localctx, 186, RULE_module_argument);
		try {
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
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
		enterRule(_localctx, 188, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
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
		public TerminalNode K_AGGREGATION_FUNCTION() { return getToken(SqlParser.K_AGGREGATION_FUNCTION, 0); }
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
		public TerminalNode K_TYPE() { return getToken(SqlParser.K_TYPE, 0); }
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
		enterRule(_localctx, 190, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_ABORT - 47)) | (1L << (K_ACTION - 47)) | (1L << (K_ADD - 47)) | (1L << (K_AFTER - 47)) | (1L << (K_ALL - 47)) | (1L << (K_ALTER - 47)) | (1L << (K_ANALYZE - 47)) | (1L << (K_AND - 47)) | (1L << (K_AS - 47)) | (1L << (K_ASC - 47)) | (1L << (K_ATTACH - 47)) | (1L << (K_AUTOINCREMENT - 47)) | (1L << (K_BEFORE - 47)) | (1L << (K_BEGIN - 47)) | (1L << (K_BETWEEN - 47)) | (1L << (K_BY - 47)) | (1L << (K_CASCADE - 47)) | (1L << (K_CASE - 47)) | (1L << (K_CAST - 47)) | (1L << (K_CHECK - 47)) | (1L << (K_COLLATE - 47)) | (1L << (K_COLUMN - 47)) | (1L << (K_COMMIT - 47)) | (1L << (K_CONFLICT - 47)) | (1L << (K_CONSTRAINT - 47)) | (1L << (K_CREATE - 47)) | (1L << (K_CROSS - 47)) | (1L << (K_CURRENT_DATE - 47)) | (1L << (K_CURRENT_TIME - 47)) | (1L << (K_CURRENT_TIMESTAMP - 47)) | (1L << (K_DATABASE - 47)) | (1L << (K_DEFAULT - 47)) | (1L << (K_DEFERRABLE - 47)) | (1L << (K_DEFERRED - 47)) | (1L << (K_DELETE - 47)) | (1L << (K_DESC - 47)) | (1L << (K_DETACH - 47)) | (1L << (K_DISTINCT - 47)) | (1L << (K_DROP - 47)) | (1L << (K_EACH - 47)) | (1L << (K_ELSE - 47)) | (1L << (K_END - 47)) | (1L << (K_ENABLE - 47)) | (1L << (K_ESCAPE - 47)) | (1L << (K_EXCEPT - 47)) | (1L << (K_EXCLUSIVE - 47)) | (1L << (K_EXISTS - 47)) | (1L << (K_EXPLAIN - 47)) | (1L << (K_FAIL - 47)) | (1L << (K_FOR - 47)) | (1L << (K_FOREIGN - 47)) | (1L << (K_FROM - 47)) | (1L << (K_FULL - 47)) | (1L << (K_GLOB - 47)) | (1L << (K_GROUP - 47)) | (1L << (K_HAVING - 47)) | (1L << (K_IF - 47)) | (1L << (K_IGNORE - 47)) | (1L << (K_IMMEDIATE - 47)))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (K_IN - 111)) | (1L << (K_INDEX - 111)) | (1L << (K_INDEXED - 111)) | (1L << (K_INITIALLY - 111)) | (1L << (K_INNER - 111)) | (1L << (K_INSERT - 111)) | (1L << (K_INSTEAD - 111)) | (1L << (K_INTERSECT - 111)) | (1L << (K_INTO - 111)) | (1L << (K_IS - 111)) | (1L << (K_ISNULL - 111)) | (1L << (K_JOIN - 111)) | (1L << (K_KEY - 111)) | (1L << (K_LEFT - 111)) | (1L << (K_LIKE - 111)) | (1L << (K_LIMIT - 111)) | (1L << (K_MATCH - 111)) | (1L << (K_NATURAL - 111)) | (1L << (K_NEXTVAL - 111)) | (1L << (K_NO - 111)) | (1L << (K_NOT - 111)) | (1L << (K_NOTNULL - 111)) | (1L << (K_NULL - 111)) | (1L << (K_OF - 111)) | (1L << (K_OFFSET - 111)) | (1L << (K_ON - 111)) | (1L << (K_OR - 111)) | (1L << (K_ORDER - 111)) | (1L << (K_OUTER - 111)) | (1L << (K_PLAN - 111)) | (1L << (K_PRAGMA - 111)) | (1L << (K_PRIMARY - 111)) | (1L << (K_QUERY - 111)) | (1L << (K_RAISE - 111)) | (1L << (K_RECURSIVE - 111)) | (1L << (K_REFERENCES - 111)) | (1L << (K_REGEXP - 111)) | (1L << (K_REINDEX - 111)) | (1L << (K_RELEASE - 111)) | (1L << (K_RENAME - 111)) | (1L << (K_REPLACE - 111)) | (1L << (K_RESTRICT - 111)) | (1L << (K_RIGHT - 111)) | (1L << (K_ROLLBACK - 111)) | (1L << (K_ROW - 111)) | (1L << (K_SAVEPOINT - 111)) | (1L << (K_SELECT - 111)) | (1L << (K_SET - 111)) | (1L << (K_TABLE - 111)) | (1L << (K_TEMP - 111)) | (1L << (K_TEMPORARY - 111)) | (1L << (K_THEN - 111)) | (1L << (K_TO - 111)) | (1L << (K_TRANSACTION - 111)) | (1L << (K_TRIGGER - 111)) | (1L << (K_TYPE - 111)) | (1L << (K_UNION - 111)) | (1L << (K_UNIQUE - 111)) | (1L << (K_UPDATE - 111)) | (1L << (K_USING - 111)))) != 0) || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (K_VACUUM - 175)) | (1L << (K_VALUES - 175)) | (1L << (K_VIEW - 175)) | (1L << (K_VIRTUAL - 175)) | (1L << (K_WHEN - 175)) | (1L << (K_WHERE - 175)) | (1L << (K_WITH - 175)) | (1L << (K_WITHOUT - 175)) | (1L << (K_AGGREGATION_FUNCTION - 175)))) != 0)) ) {
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
		enterRule(_localctx, 192, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1633);
				matchWildcard();
				}
				}
				setState(1636); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_AGGREGATION) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BREAK))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DO - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NATURAL - 128)) | (1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (SINGLE_LINE_COMMENT - 192)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SPACES - 192)) | (1L << (UNEXPECTED_CHAR - 192)) | (1L << (K_AGGREGATION_FUNCTION - 192)))) != 0) );
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
		enterRule(_localctx, 194, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
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
		enterRule(_localctx, 196, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
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
		enterRule(_localctx, 198, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
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
		enterRule(_localctx, 200, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
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
		enterRule(_localctx, 202, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
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
		enterRule(_localctx, 204, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
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
		enterRule(_localctx, 206, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
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
		enterRule(_localctx, 208, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
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
		enterRule(_localctx, 210, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
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
		enterRule(_localctx, 212, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
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
		enterRule(_localctx, 214, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
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
		enterRule(_localctx, 216, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
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
		enterRule(_localctx, 218, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
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
		enterRule(_localctx, 220, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
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
		enterRule(_localctx, 222, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
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
		enterRule(_localctx, 224, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
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
		enterRule(_localctx, 226, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
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
		enterRule(_localctx, 228, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1672);
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
		enterRule(_localctx, 230, RULE_method_ID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
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
		enterRule(_localctx, 232, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
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
		enterRule(_localctx, 234, RULE_any_name);
		try {
			setState(1684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1678);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1680);
				match(OPEN_PAR);
				setState(1681);
				any_name();
				setState(1682);
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
		case 29:
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		case 30:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		case 71:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c7\u0699\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\3\2\3\2\7\2\u00f1\n\2\f\2\16\2\u00f4\13\2\3\2\3\2\5\2\u00f8\n\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0101\n\4\3\4\3\4\7\4\u0105\n\4\f\4\16"+
		"\4\u0108\13\4\3\4\5\4\u010b\n\4\3\4\3\4\3\4\5\4\u0110\n\4\3\4\3\4\3\4"+
		"\5\4\u0115\n\4\3\4\5\4\u0118\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0121"+
		"\n\6\3\6\3\6\3\6\7\6\u0126\n\6\f\6\16\6\u0129\13\6\3\6\5\6\u012c\n\6\3"+
		"\6\3\6\3\6\7\6\u0131\n\6\f\6\16\6\u0134\13\6\5\6\u0136\n\6\3\7\5\7\u0139"+
		"\n\7\3\7\3\7\7\7\u013d\n\7\f\7\16\7\u0140\13\7\3\b\3\b\3\b\5\b\u0145\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\5\t\u014c\n\t\3\t\5\t\u014f\n\t\3\t\3\t\3\t\5\t"+
		"\u0154\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0160\n\13\3"+
		"\13\3\13\3\f\3\f\3\f\5\f\u0167\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u016e\n\r\f"+
		"\r\16\r\u0171\13\r\3\r\3\r\3\16\5\16\u0176\n\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\7\17\u0180\n\17\f\17\16\17\u0183\13\17\3\17\5\17\u0186"+
		"\n\17\3\17\3\17\3\20\3\20\5\20\u018c\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u01a2\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01a9\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u01b1\n\22\3\23\3\23\3\23\7\23\u01b6\n\23\f\23"+
		"\16\23\u01b9\13\23\3\23\5\23\u01bc\n\23\3\24\3\24\3\24\3\24\7\24\u01c2"+
		"\n\24\f\24\16\24\u01c5\13\24\3\25\3\25\7\25\u01c9\n\25\f\25\16\25\u01cc"+
		"\13\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u01d5\n\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u01de\n\30\f\30\16\30\u01e1\13\30\3\30\3"+
		"\30\5\30\u01e5\n\30\3\30\3\30\3\31\3\31\3\31\5\31\u01ec\n\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01f9\n\32\3\33\3\33"+
		"\3\33\3\33\7\33\u01ff\n\33\f\33\16\33\u0202\13\33\3\33\3\33\3\34\3\34"+
		"\3\34\5\34\u0209\n\34\3\34\3\34\7\34\u020d\n\34\f\34\16\34\u0210\13\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u021c\n\35\3\36"+
		"\3\36\3\36\3\36\5\36\u0222\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u022a"+
		"\n\37\3\37\3\37\3\37\7\37\u022f\n\37\f\37\16\37\u0232\13\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0240\n \3 \3 \3 \7 \u0245\n \f \16 \u0248"+
		"\13 \3!\3!\3!\3!\5!\u024e\n!\3!\3!\3!\5!\u0253\n!\3!\3!\3!\3!\5!\u0259"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0265\n\"\3#\3#\3$\6$"+
		"\u026a\n$\r$\16$\u026b\3$\7$\u026f\n$\f$\16$\u0272\13$\3$\5$\u0275\n$"+
		"\3%\3%\3%\3%\3%\3%\5%\u027d\n%\3&\3&\3&\3&\3&\3&\3&\5&\u0286\n&\3\'\3"+
		"\'\3\'\5\'\u028b\n\'\3(\3(\3(\3(\5(\u0291\n(\3)\3)\3)\3)\3)\3)\3)\3)\5"+
		")\u029b\n)\3)\3)\3)\3)\5)\u02a1\n)\3*\3*\3*\3*\3*\3*\3*\5*\u02aa\n*\3"+
		"+\3+\3+\5+\u02af\n+\3+\3+\3+\3+\3+\3+\3,\3,\3,\5,\u02ba\n,\3,\3,\3,\3"+
		",\3,\3,\5,\u02c2\n,\3-\3-\3-\3-\3-\3-\6-\u02ca\n-\r-\16-\u02cb\3-\5-\u02cf"+
		"\n-\3-\3-\3.\3.\3.\3.\3.\5.\u02d8\n.\3.\3.\5.\u02dc\n.\3/\3/\3/\3/\5/"+
		"\u02e2\n/\3\60\7\60\u02e5\n\60\f\60\16\60\u02e8\13\60\3\60\3\60\6\60\u02ec"+
		"\n\60\r\60\16\60\u02ed\3\60\7\60\u02f1\n\60\f\60\16\60\u02f4\13\60\3\60"+
		"\7\60\u02f7\n\60\f\60\16\60\u02fa\13\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0303\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u030a\n\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0314\n\62\3\62\5\62\u0317\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0321\n\63\f\63\16\63\u0324"+
		"\13\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u032f\n\64\f"+
		"\64\16\64\u0332\13\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\38\38\38\58\u0345\n8\38\38\38\58\u034a\n8\38\38\38\3"+
		"8\38\38\38\78\u0353\n8\f8\168\u0356\138\38\38\38\38\58\u035c\n8\39\39"+
		"\39\39\39\59\u0363\n9\3:\3:\3:\3:\5:\u0369\n:\3:\3:\3:\5:\u036e\n:\3:"+
		"\3:\3;\3;\3;\3;\3;\3;\7;\u0378\n;\f;\16;\u037b\13;\5;\u037d\n;\3;\3;\3"+
		";\3;\5;\u0383\n;\5;\u0385\n;\3<\3<\3<\3<\3<\5<\u038c\n<\3<\3<\3<\3<\3"+
		"<\7<\u0393\n<\f<\16<\u0396\13<\3<\3<\5<\u039a\n<\3<\3<\3<\3<\3<\7<\u03a1"+
		"\n<\f<\16<\u03a4\13<\3<\3<\3<\3<\3<\3<\7<\u03ac\n<\f<\16<\u03af\13<\3"+
		"<\3<\7<\u03b3\n<\f<\16<\u03b6\13<\3<\3<\3<\5<\u03bb\n<\3=\3=\3=\3=\3="+
		"\3=\7=\u03c3\n=\f=\16=\u03c6\13=\5=\u03c8\n=\3=\3=\3=\3=\5=\u03ce\n=\5"+
		"=\u03d0\n=\3>\3>\5>\u03d4\n>\3>\3>\3>\7>\u03d9\n>\f>\16>\u03dc\13>\3>"+
		"\3>\3>\3>\7>\u03e2\n>\f>\16>\u03e5\13>\3>\5>\u03e8\n>\5>\u03ea\n>\3>\3"+
		">\5>\u03ee\n>\3>\3>\3>\3>\3>\7>\u03f5\n>\f>\16>\u03f8\13>\3>\3>\5>\u03fc"+
		"\n>\5>\u03fe\n>\3>\3>\3>\3>\3>\7>\u0405\n>\f>\16>\u0408\13>\3>\3>\3>\3"+
		">\3>\3>\7>\u0410\n>\f>\16>\u0413\13>\3>\3>\7>\u0417\n>\f>\16>\u041a\13"+
		">\5>\u041c\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0429\n?\f?\16?\u042c"+
		"\13?\3?\3?\5?\u0430\n?\3@\3@\3@\7@\u0435\n@\f@\16@\u0438\13@\3A\3A\3A"+
		"\3A\5A\u043e\nA\3A\3A\3A\3A\3A\5A\u0445\nA\3A\3A\3A\5A\u044a\nA\3A\3A"+
		"\5A\u044e\nA\3B\3B\5B\u0452\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B"+
		"\5B\u0461\nB\3C\3C\3C\5C\u0466\nC\3C\5C\u0469\nC\3D\3D\3E\3E\3E\3F\3F"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u047e\nG\3G\3G\6G\u0482\nG\rG"+
		"\16G\u0483\5G\u0486\nG\3H\3H\5H\u048a\nH\3I\3I\3I\3I\3I\5I\u0491\nI\3"+
		"I\3I\3I\5I\u0496\nI\3I\3I\3I\3I\3I\3I\3I\5I\u049f\nI\3I\3I\3I\7I\u04a4"+
		"\nI\fI\16I\u04a7\13I\3I\5I\u04aa\nI\3I\3I\3I\3I\3I\3I\3I\5I\u04b3\nI\3"+
		"I\5I\u04b6\nI\3I\3I\3I\3I\5I\u04bc\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u04d7\nI\5I\u04d9\nI\3"+
		"I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u04e4\nI\3I\3I\3I\3I\3I\3I\7I\u04ec\nI\f"+
		"I\16I\u04ef\13I\5I\u04f1\nI\3I\3I\3I\3I\5I\u04f7\nI\3I\5I\u04fa\nI\7I"+
		"\u04fc\nI\fI\16I\u04ff\13I\3J\3J\3J\3J\5J\u0505\nJ\3J\3J\3J\3J\3J\7J\u050c"+
		"\nJ\fJ\16J\u050f\13J\3J\3J\5J\u0513\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5"+
		"J\u051f\nJ\3J\3J\5J\u0523\nJ\7J\u0525\nJ\fJ\16J\u0528\13J\3J\5J\u052b"+
		"\nJ\3J\3J\3J\3J\3J\5J\u0532\nJ\3J\5J\u0535\nJ\5J\u0537\nJ\3K\3K\3L\3L"+
		"\3L\5L\u053e\nL\3L\5L\u0541\nL\3M\3M\5M\u0545\nM\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\3M\5M\u0550\nM\3N\3N\3N\3N\3N\3N\7N\u0558\nN\fN\16N\u055b\13N\3N\3"+
		"N\3O\3O\3O\3O\3O\3O\7O\u0565\nO\fO\16O\u0568\13O\3O\3O\3O\3P\3P\5P\u056f"+
		"\nP\3P\5P\u0572\nP\3P\3P\3P\3P\7P\u0578\nP\fP\16P\u057b\13P\3P\3P\3Q\3"+
		"Q\5Q\u0581\nQ\3Q\3Q\3Q\3Q\7Q\u0587\nQ\fQ\16Q\u058a\13Q\3Q\3Q\3R\3R\3S"+
		"\3S\3S\5S\u0593\nS\3S\3S\3S\3S\3S\3S\5S\u059b\nS\3T\3T\5T\u059f\nT\3U"+
		"\3U\3U\3U\3U\3U\3U\5U\u05a8\nU\3U\5U\u05ab\nU\5U\u05ad\nU\3V\3V\3V\5V"+
		"\u05b2\nV\3V\3V\5V\u05b6\nV\3V\5V\u05b9\nV\3V\3V\3V\3V\3V\5V\u05c0\nV"+
		"\3V\3V\3V\3V\7V\u05c6\nV\fV\16V\u05c9\13V\3V\5V\u05cc\nV\3V\3V\5V\u05d0"+
		"\nV\3V\5V\u05d3\nV\3V\3V\3V\3V\5V\u05d9\nV\3V\5V\u05dc\nV\5V\u05de\nV"+
		"\3W\3W\3W\3W\3W\7W\u05e5\nW\fW\16W\u05e8\13W\3X\3X\3X\5X\u05ed\nX\3X\5"+
		"X\u05f0\nX\3X\5X\u05f3\nX\3Y\3Y\3Y\3Z\3Z\5Z\u05fa\nZ\3Z\3Z\3Z\7Z\u05ff"+
		"\nZ\fZ\16Z\u0602\13Z\3Z\3Z\3Z\3Z\7Z\u0608\nZ\fZ\16Z\u060b\13Z\3Z\5Z\u060e"+
		"\nZ\5Z\u0610\nZ\3Z\3Z\5Z\u0614\nZ\3Z\3Z\3Z\3Z\3Z\7Z\u061b\nZ\fZ\16Z\u061e"+
		"\13Z\3Z\3Z\5Z\u0622\nZ\5Z\u0624\nZ\3Z\3Z\3Z\3Z\3Z\7Z\u062b\nZ\fZ\16Z\u062e"+
		"\13Z\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0636\nZ\fZ\16Z\u0639\13Z\3Z\3Z\7Z\u063d\nZ"+
		"\fZ\16Z\u0640\13Z\5Z\u0642\nZ\3[\5[\u0645\n[\3[\3[\5[\u0649\n[\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0656\n\\\3]\3]\3^\3^\3_\3_\5"+
		"_\u065e\n_\3`\3`\3a\3a\3b\6b\u0665\nb\rb\16b\u0666\3c\3c\3d\3d\3e\3e\3"+
		"f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3"+
		"q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3w\3w\3w\3w\5w\u0697\nw\3w\2\5<"+
		">\u0090x\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\2\23\4\2\37!$\'\3\2*\60\4\2\n\n##\4\2\16\27\36\36\4\2AALL\4\2\35"+
		"\35\u0089\u0089\4\2\66\66YY\4\2;;WW\4\2\37\37$%\3\2 !\3\2&)\3\2*-\4\2"+
		"\36\36.\60\4\2VV\u00af\u00af\4\2 \"\u0085\u0085\4\2\u00bd\u00bd\u00c0"+
		"\u00c0\17\2\61\64\66@BKMY[ik\u008a\u008c\u0091\u0093\u009c\u009e\u00a3"+
		"\u00a5\u00b4\u00b6\u00b7\u00b9\u00ba\u00c7\u00c7\2\u074e\2\u00f7\3\2\2"+
		"\2\4\u00f9\3\2\2\2\6\u0117\3\2\2\2\b\u0119\3\2\2\2\n\u0120\3\2\2\2\f\u0138"+
		"\3\2\2\2\16\u0141\3\2\2\2\20\u0148\3\2\2\2\22\u0157\3\2\2\2\24\u015d\3"+
		"\2\2\2\26\u0166\3\2\2\2\30\u0168\3\2\2\2\32\u0175\3\2\2\2\34\u017d\3\2"+
		"\2\2\36\u018b\3\2\2\2 \u01a8\3\2\2\2\"\u01b0\3\2\2\2$\u01bb\3\2\2\2&\u01bd"+
		"\3\2\2\2(\u01c6\3\2\2\2*\u01cd\3\2\2\2,\u01d4\3\2\2\2.\u01d6\3\2\2\2\60"+
		"\u01e8\3\2\2\2\62\u01ef\3\2\2\2\64\u01fa\3\2\2\2\66\u0205\3\2\2\28\u021b"+
		"\3\2\2\2:\u0221\3\2\2\2<\u0229\3\2\2\2>\u023f\3\2\2\2@\u0258\3\2\2\2B"+
		"\u0264\3\2\2\2D\u0266\3\2\2\2F\u0269\3\2\2\2H\u0276\3\2\2\2J\u027e\3\2"+
		"\2\2L\u0287\3\2\2\2N\u0290\3\2\2\2P\u0292\3\2\2\2R\u02a2\3\2\2\2T\u02ab"+
		"\3\2\2\2V\u02b6\3\2\2\2X\u02c3\3\2\2\2Z\u02d2\3\2\2\2\\\u02dd\3\2\2\2"+
		"^\u02e6\3\2\2\2`\u0302\3\2\2\2b\u0304\3\2\2\2d\u0318\3\2\2\2f\u0327\3"+
		"\2\2\2h\u0335\3\2\2\2j\u0337\3\2\2\2l\u033c\3\2\2\2n\u033f\3\2\2\2p\u035d"+
		"\3\2\2\2r\u0364\3\2\2\2t\u0371\3\2\2\2v\u0386\3\2\2\2x\u03bc\3\2\2\2z"+
		"\u041b\3\2\2\2|\u041d\3\2\2\2~\u0431\3\2\2\2\u0080\u0439\3\2\2\2\u0082"+
		"\u0451\3\2\2\2\u0084\u0462\3\2\2\2\u0086\u046a\3\2\2\2\u0088\u046c\3\2"+
		"\2\2\u008a\u046f\3\2\2\2\u008c\u0471\3\2\2\2\u008e\u0489\3\2\2\2\u0090"+
		"\u04bb\3\2\2\2\u0092\u0500\3\2\2\2\u0094\u0538\3\2\2\2\u0096\u053a\3\2"+
		"\2\2\u0098\u0544\3\2\2\2\u009a\u0551\3\2\2\2\u009c\u055e\3\2\2\2\u009e"+
		"\u056c\3\2\2\2\u00a0\u057e\3\2\2\2\u00a2\u058d\3\2\2\2\u00a4\u0592\3\2"+
		"\2\2\u00a6\u059c\3\2\2\2\u00a8\u05ac\3\2\2\2\u00aa\u05dd\3\2\2\2\u00ac"+
		"\u05df\3\2\2\2\u00ae\u05f2\3\2\2\2\u00b0\u05f4\3\2\2\2\u00b2\u0641\3\2"+
		"\2\2\u00b4\u0648\3\2\2\2\u00b6\u0655\3\2\2\2\u00b8\u0657\3\2\2\2\u00ba"+
		"\u0659\3\2\2\2\u00bc\u065d\3\2\2\2\u00be\u065f\3\2\2\2\u00c0\u0661\3\2"+
		"\2\2\u00c2\u0664\3\2\2\2\u00c4\u0668\3\2\2\2\u00c6\u066a\3\2\2\2\u00c8"+
		"\u066c\3\2\2\2\u00ca\u066e\3\2\2\2\u00cc\u0670\3\2\2\2\u00ce\u0672\3\2"+
		"\2\2\u00d0\u0674\3\2\2\2\u00d2\u0676\3\2\2\2\u00d4\u0678\3\2\2\2\u00d6"+
		"\u067a\3\2\2\2\u00d8\u067c\3\2\2\2\u00da\u067e\3\2\2\2\u00dc\u0680\3\2"+
		"\2\2\u00de\u0682\3\2\2\2\u00e0\u0684\3\2\2\2\u00e2\u0686\3\2\2\2\u00e4"+
		"\u0688\3\2\2\2\u00e6\u068a\3\2\2\2\u00e8\u068c\3\2\2\2\u00ea\u068e\3\2"+
		"\2\2\u00ec\u0696\3\2\2\2\u00ee\u00f1\5^\60\2\u00ef\u00f1\5\4\3\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f8\7\2\2\3\u00f6\u00f8\5\6\4\2\u00f7\u00f2\3\2\2\2\u00f7\u00f6\3\2"+
		"\2\2\u00f8\3\3\2\2\2\u00f9\u00fa\7\u00c6\2\2\u00fa\u00fb\b\3\1\2\u00fb"+
		"\5\3\2\2\2\u00fc\u0118\3\2\2\2\u00fd\u00fe\5&\24\2\u00fe\u0100\7\31\2"+
		"\2\u00ff\u0101\5\6\4\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0118"+
		"\3\2\2\2\u0102\u0106\5\32\16\2\u0103\u0105\7\31\2\2\u0104\u0103\3\2\2"+
		"\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\5\6\4\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0118\3\2\2\2\u010c\u010d\5\16\b\2\u010d\u010f\7"+
		"\31\2\2\u010e\u0110\5\6\4\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0118\3\2\2\2\u0111\u0112\5\20\t\2\u0112\u0114\7\31\2\2\u0113\u0115\5"+
		"\6\4\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0118\5\"\22\2\u0117\u00fc\3\2\2\2\u0117\u00fd\3\2\2\2\u0117\u0102\3"+
		"\2\2\2\u0117\u010c\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\7\3\2\2\2\u0119\u011a\7\u00b5\2\2\u011a\u011b\5$\23\2\u011b\u011c\7\36"+
		"\2\2\u011c\u011d\5:\36\2\u011d\t\3\2\2\2\u011e\u011f\7\u00b5\2\2\u011f"+
		"\u0121\5\u00ecw\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0127"+
		"\3\2\2\2\u0122\u0123\7\35\2\2\u0123\u0124\7\u00b5\2\2\u0124\u0126\5\u00ec"+
		"w\2\u0125\u0122\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0135\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\7\35"+
		"\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0132\5\b\5\2\u012e\u012f\7\35\2\2\u012f\u0131\5\b\5\2\u0130\u012e\3"+
		"\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u012b\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\13\3\2\2\2\u0137\u0139\5:\36\2\u0138\u0137\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013e\3\2\2\2\u013a\u013b\7\35\2\2\u013b\u013d\5:\36\2"+
		"\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\r\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\5\u00e8u\2\u0142"+
		"\u0144\7\33\2\2\u0143\u0145\5\f\7\2\u0144\u0143\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\34\2\2\u0147\17\3\2\2\2\u0148"+
		"\u0149\5\u00e8u\2\u0149\u014b\7\33\2\2\u014a\u014c\5\f\7\2\u014b\u014a"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f\7\35\2\2"+
		"\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153"+
		"\5\22\n\2\u0151\u0152\7\35\2\2\u0152\u0154\5\f\7\2\u0153\u0151\3\2\2\2"+
		"\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\34\2\2\u0156\21"+
		"\3\2\2\2\u0157\u0158\7j\2\2\u0158\u0159\7\33\2\2\u0159\u015a\5\f\7\2\u015a"+
		"\u015b\7\34\2\2\u015b\u015c\5\34\17\2\u015c\23\3\2\2\2\u015d\u015f\7\u009d"+
		"\2\2\u015e\u0160\5\26\f\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\7\31\2\2\u0162\25\3\2\2\2\u0163\u0167\5:\36"+
		"\2\u0164\u0167\5\30\r\2\u0165\u0167\5@!\2\u0166\u0163\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0165\3\2\2\2\u0167\27\3\2\2\2\u0168\u016f\7\3\2\2\u0169"+
		"\u016e\5:\36\2\u016a\u016e\7\u00c5\2\2\u016b\u016e\5\u00ecw\2\u016c\u016e"+
		"\7\u00c5\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2"+
		"\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7\3\2\2\u0173"+
		"\31\3\2\2\2\u0174\u0176\7j\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0177\3\2\2\2\u0177\u0178\5\u00e8u\2\u0178\u0179\7\33\2\2\u0179"+
		"\u017a\5\n\6\2\u017a\u017b\7\34\2\2\u017b\u017c\5\34\17\2\u017c\33\3\2"+
		"\2\2\u017d\u0181\7\4\2\2\u017e\u0180\5 \21\2\u017f\u017e\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184\u0186\5\24\13\2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7\5\2\2\u0188\35\3\2\2"+
		"\2\u0189\u018c\5 \21\2\u018a\u018c\5\24\13\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\37\3\2\2\2\u018d\u01a9\5F$\2\u018e\u018f\5\16\b\2"+
		"\u018f\u0190\7\31\2\2\u0190\u01a9\3\2\2\2\u0191\u01a9\5N(\2\u0192\u01a9"+
		"\5X-\2\u0193\u0194\5B\"\2\u0194\u0195\7\31\2\2\u0195\u01a9\3\2\2\2\u0196"+
		"\u0197\5&\24\2\u0197\u0198\7\31\2\2\u0198\u01a9\3\2\2\2\u0199\u019a\5"+
		"(\25\2\u019a\u019b\7\31\2\2\u019b\u01a9\3\2\2\2\u019c\u019d\5\66\34\2"+
		"\u019d\u019e\7\31\2\2\u019e\u01a9\3\2\2\2\u019f\u01a1\7\4\2\2\u01a0\u01a2"+
		"\5 \21\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a9\7\5\2\2\u01a4\u01a5\7A\2\2\u01a5\u01a9\7\31\2\2\u01a6\u01a7\7L"+
		"\2\2\u01a7\u01a9\7\31\2\2\u01a8\u018d\3\2\2\2\u01a8\u018e\3\2\2\2\u01a8"+
		"\u0191\3\2\2\2\u01a8\u0192\3\2\2\2\u01a8\u0193\3\2\2\2\u01a8\u0196\3\2"+
		"\2\2\u01a8\u0199\3\2\2\2\u01a8\u019c\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8"+
		"\u01a4\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9!\3\2\2\2\u01aa\u01b1\7\u00c3"+
		"\2\2\u01ab\u01b1\7\u00c4\2\2\u01ac\u01ad\7\4\2\2\u01ad\u01ae\5 \21\2\u01ae"+
		"\u01af\7\5\2\2\u01af\u01b1\3\2\2\2\u01b0\u01aa\3\2\2\2\u01b0\u01ab\3\2"+
		"\2\2\u01b0\u01ac\3\2\2\2\u01b1#\3\2\2\2\u01b2\u01b7\5\u00ecw\2\u01b3\u01b4"+
		"\7\32\2\2\u01b4\u01b6\5\u00ecw\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2"+
		"\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bc\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01bc\5\60\31\2\u01bb\u01b2\3\2\2\2\u01bb\u01ba\3\2\2\2"+
		"\u01bc%\3\2\2\2\u01bd\u01be\7\u00b5\2\2\u01be\u01c3\5(\25\2\u01bf\u01c0"+
		"\7\35\2\2\u01c0\u01c2\5(\25\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2"+
		"\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\'\3\2\2\2\u01c5\u01c3\3"+
		"\2\2\2\u01c6\u01ca\5$\23\2\u01c7\u01c9\5*\26\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb)\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cd\u01ce\5D#\2\u01ce\u01cf\5,\27\2\u01cf+\3\2"+
		"\2\2\u01d0\u01d5\5:\36\2\u01d1\u01d5\5@!\2\u01d2\u01d5\5\64\33\2\u01d3"+
		"\u01d5\5.\30\2\u01d4\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d3\3\2\2\2\u01d5-\3\2\2\2\u01d6\u01df\7\6\2\2\u01d7\u01d8"+
		"\5:\36\2\u01d8\u01d9\7\35\2\2\u01d9\u01de\3\2\2\2\u01da\u01db\5.\30\2"+
		"\u01db\u01dc\7\35\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d7\3\2\2\2\u01dd\u01da"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e4\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\5:\36\2\u01e3\u01e5\5."+
		"\30\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\7\7\2\2\u01e7/\3\2\2\2\u01e8\u01e9\5\u00ea"+
		"v\2\u01e9\u01eb\7\6\2\2\u01ea\u01ec\5<\37\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\7\2\2\u01ee\61\3\2\2"+
		"\2\u01ef\u01f0\7\u00bd\2\2\u01f0\u01f8\7\b\2\2\u01f1\u01f9\58\35\2\u01f2"+
		"\u01f9\5\64\33\2\u01f3\u01f4\7\t\2\2\u01f4\u01f5\58\35\2\u01f5\u01f6\7"+
		"\t\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\5.\30\2\u01f8\u01f1\3\2\2\2\u01f8"+
		"\u01f2\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\63\3\2\2"+
		"\2\u01fa\u01fb\7\4\2\2\u01fb\u0200\5\62\32\2\u01fc\u01fd\7\35\2\2\u01fd"+
		"\u01ff\5\62\32\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3"+
		"\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\7\5\2\2\u0204\65\3\2\2\2\u0205\u0206\7\u0092\2\2\u0206\u0208\7"+
		"\33\2\2\u0207\u0209\5:\36\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020e\3\2\2\2\u020a\u020b\7 \2\2\u020b\u020d\5:\36\2\u020c\u020a\3\2"+
		"\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\7\34\2\2\u0212\67\3\2\2"+
		"\2\u0213\u021c\5$\23\2\u0214\u021c\5\30\r\2\u0215\u021c\5\16\b\2\u0216"+
		"\u021c\5\u00b6\\\2\u0217\u0218\7\33\2\2\u0218\u0219\58\35\2\u0219\u021a"+
		"\7\34\2\2\u021a\u021c\3\2\2\2\u021b\u0213\3\2\2\2\u021b\u0214\3\2\2\2"+
		"\u021b\u0215\3\2\2\2\u021b\u0216\3\2\2\2\u021b\u0217\3\2\2\2\u021c9\3"+
		"\2\2\2\u021d\u0222\58\35\2\u021e\u0222\5> \2\u021f\u0222\5<\37\2\u0220"+
		"\u0222\5B\"\2\u0221\u021d\3\2\2\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2"+
		"\2\2\u0221\u0220\3\2\2\2\u0222;\3\2\2\2\u0223\u0224\b\37\1\2\u0224\u022a"+
		"\58\35\2\u0225\u0226\7\33\2\2\u0226\u0227\5<\37\2\u0227\u0228\7\34\2\2"+
		"\u0228\u022a\3\2\2\2\u0229\u0223\3\2\2\2\u0229\u0225\3\2\2\2\u022a\u0230"+
		"\3\2\2\2\u022b\u022c\f\4\2\2\u022c\u022d\t\2\2\2\u022d\u022f\5<\37\5\u022e"+
		"\u022b\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231=\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\b \1\2\u0234\u0240"+
		"\58\35\2\u0235\u0236\5<\37\2\u0236\u0237\t\3\2\2\u0237\u0238\5<\37\2\u0238"+
		"\u0240\3\2\2\2\u0239\u0240\7\u00bb\2\2\u023a\u0240\7\u00bc\2\2\u023b\u023c"+
		"\7\33\2\2\u023c\u023d\5> \2\u023d\u023e\7\34\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u0233\3\2\2\2\u023f\u0235\3\2\2\2\u023f\u0239\3\2\2\2\u023f\u023a\3\2"+
		"\2\2\u023f\u023b\3\2\2\2\u0240\u0246\3\2\2\2\u0241\u0242\f\6\2\2\u0242"+
		"\u0243\t\4\2\2\u0243\u0245\5> \7\u0244\u0241\3\2\2\2\u0245\u0248\3\2\2"+
		"\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247?\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0249\u024a\5> \2\u024a\u024d\7\13\2\2\u024b\u024e\5@!\2\u024c"+
		"\u024e\5:\36\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024f\u0252\7\b\2\2\u0250\u0253\5@!\2\u0251\u0253\5:\36\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0251\3\2\2\2\u0253\u0259\3\2\2\2\u0254\u0255\7\33\2\2"+
		"\u0255\u0256\5@!\2\u0256\u0257\7\34\2\2\u0257\u0259\3\2\2\2\u0258\u0249"+
		"\3\2\2\2\u0258\u0254\3\2\2\2\u0259A\3\2\2\2\u025a\u025b\5$\23\2\u025b"+
		"\u025c\7\f\2\2\u025c\u0265\3\2\2\2\u025d\u025e\7\f\2\2\u025e\u0265\5$"+
		"\23\2\u025f\u0260\5$\23\2\u0260\u0261\7\r\2\2\u0261\u0265\3\2\2\2\u0262"+
		"\u0263\7\r\2\2\u0263\u0265\5$\23\2\u0264\u025a\3\2\2\2\u0264\u025d\3\2"+
		"\2\2\u0264\u025f\3\2\2\2\u0264\u0262\3\2\2\2\u0265C\3\2\2\2\u0266\u0267"+
		"\t\5\2\2\u0267E\3\2\2\2\u0268\u026a\5H%\2\u0269\u0268\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0270\3\2\2\2\u026d"+
		"\u026f\5J&\2\u026e\u026d\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2"+
		"\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275"+
		"\5L\'\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275G\3\2\2\2\u0276\u0277"+
		"\7n\2\2\u0277\u0278\7\33\2\2\u0278\u0279\5> \2\u0279\u027c\7\34\2\2\u027a"+
		"\u027d\5\34\17\2\u027b\u027d\5\36\20\2\u027c\u027a\3\2\2\2\u027c\u027b"+
		"\3\2\2\2\u027dI\3\2\2\2\u027e\u027f\7]\2\2\u027f\u0280\7n\2\2\u0280\u0281"+
		"\7\33\2\2\u0281\u0282\5> \2\u0282\u0285\7\34\2\2\u0283\u0286\5\34\17\2"+
		"\u0284\u0286\5\36\20\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286K"+
		"\3\2\2\2\u0287\u028a\7]\2\2\u0288\u028b\5\34\17\2\u0289\u028b\5\36\20"+
		"\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028bM\3\2\2\2\u028c\u0291"+
		"\5P)\2\u028d\u0291\5R*\2\u028e\u0291\5T+\2\u028f\u0291\5V,\2\u0290\u028c"+
		"\3\2\2\2\u0290\u028d\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291"+
		"O\3\2\2\2\u0292\u0293\7f\2\2\u0293\u0294\7\33\2\2\u0294\u0295\5&\24\2"+
		"\u0295\u0296\7\31\2\2\u0296\u0297\5> \2\u0297\u029a\7\31\2\2\u0298\u029b"+
		"\5B\"\2\u0299\u029b\5(\25\2\u029a\u0298\3\2\2\2\u029a\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029d\7\34\2\2\u029d\u02a0\3\2\2\2\u029e\u02a1\5"+
		"\34\17\2\u029f\u02a1\5\36\20\2\u02a0\u029e\3\2\2\2\u02a0\u029f\3\2\2\2"+
		"\u02a1Q\3\2\2\2\u02a2\u02a3\7\u00b8\2\2\u02a3\u02a4\7\33\2\2\u02a4\u02a5"+
		"\5> \2\u02a5\u02a6\7\34\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02aa\5\34\17\2"+
		"\u02a8\u02aa\5\36\20\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aaS"+
		"\3\2\2\2\u02ab\u02ae\7Z\2\2\u02ac\u02af\5\34\17\2\u02ad\u02af\5\36\20"+
		"\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1"+
		"\7\u00b8\2\2\u02b1\u02b2\7\33\2\2\u02b2\u02b3\5> \2\u02b3\u02b4\7\34\2"+
		"\2\u02b4\u02b5\7\31\2\2\u02b5U\3\2\2\2\u02b6\u02b7\7f\2\2\u02b7\u02b9"+
		"\7\33\2\2\u02b8\u02ba\7\u00b5\2\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\5$\23\2\u02bc\u02bd\7\b\2\2\u02bd"+
		"\u02be\5\u00eav\2\u02be\u02c1\7\34\2\2\u02bf\u02c2\5\34\17\2\u02c0\u02c2"+
		"\5\36\20\2\u02c1\u02bf\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2W\3\2\2\2\u02c3"+
		"\u02c4\7\u00a4\2\2\u02c4\u02c5\7\33\2\2\u02c5\u02c6\5$\23\2\u02c6\u02c7"+
		"\7\34\2\2\u02c7\u02c9\7\4\2\2\u02c8\u02ca\5Z.\2\u02c9\u02c8\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2"+
		"\2\2\u02cd\u02cf\5\\/\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02d1\7\5\2\2\u02d1Y\3\2\2\2\u02d2\u02d3\7D\2\2\u02d3"+
		"\u02d4\58\35\2\u02d4\u02d7\7\b\2\2\u02d5\u02d8\5\34\17\2\u02d6\u02d8\5"+
		"\36\20\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9"+
		"\u02da\t\6\2\2\u02da\u02dc\7\31\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3"+
		"\2\2\2\u02dc[\3\2\2\2\u02dd\u02de\7S\2\2\u02de\u02e1\7\b\2\2\u02df\u02e2"+
		"\5\34\17\2\u02e0\u02e2\5\36\20\2\u02e1\u02df\3\2\2\2\u02e1\u02e0\3\2\2"+
		"\2\u02e2]\3\2\2\2\u02e3\u02e5\7\31\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02e8"+
		"\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u02f2\5`\61\2\u02ea\u02ec\7\31\2\2\u02eb\u02ea\3"+
		"\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f1\5`\61\2\u02f0\u02eb\3\2\2\2\u02f1\u02f4\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f8\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f5\u02f7\7\31\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02fa\3"+
		"\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9_\3\2\2\2\u02fa\u02f8"+
		"\3\2\2\2\u02fb\u0303\5b\62\2\u02fc\u0303\5n8\2\u02fd\u0303\5p9\2\u02fe"+
		"\u0303\5r:\2\u02ff\u0303\5t;\2\u0300\u0303\5v<\2\u0301\u0303\5|?\2\u0302"+
		"\u02fb\3\2\2\2\u0302\u02fc\3\2\2\2\u0302\u02fd\3\2\2\2\u0302\u02fe\3\2"+
		"\2\2\u0302\u02ff\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0301\3\2\2\2\u0303"+
		"a\3\2\2\2\u0304\u0305\7\67\2\2\u0305\u0309\7\u00a5\2\2\u0306\u0307\5\u00c8"+
		"e\2\u0307\u0308\7\32\2\2\u0308\u030a\3\2\2\2\u0309\u0306\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0316\5\u00caf\2\u030c\u030d"+
		"\7\u009a\2\2\u030d\u030e\7\u00a9\2\2\u030e\u0317\5\u00d0i\2\u030f\u0317"+
		"\5l\67\2\u0310\u0317\5j\66\2\u0311\u0313\7\63\2\2\u0312\u0314\7H\2\2\u0313"+
		"\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\5~"+
		"@\2\u0316\u030c\3\2\2\2\u0316\u030f\3\2\2\2\u0316\u0310\3\2\2\2\u0316"+
		"\u0311\3\2\2\2\u0317c\3\2\2\2\u0318\u0319\7M\2\2\u0319\u031a\7\65\2\2"+
		"\u031a\u031b\7j\2\2\u031b\u031c\5\u00ecw\2\u031c\u0322\7\33\2\2\u031d"+
		"\u031e\5h\65\2\u031e\u031f\5\u00ecw\2\u031f\u0321\3\2\2\2\u0320\u031d"+
		"\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u0325\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0326\7\34\2\2\u0326e\3\2\2\2"+
		"\u0327\u0328\7M\2\2\u0328\u0329\7\u00ac\2\2\u0329\u032a\5\u00ecw\2\u032a"+
		"\u0330\7\33\2\2\u032b\u032c\5h\65\2\u032c\u032d\5\u00ecw\2\u032d\u032f"+
		"\3\2\2\2\u032e\u032b\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7\34"+
		"\2\2\u0334g\3\2\2\2\u0335\u0336\5\u00ecw\2\u0336i\3\2\2\2\u0337\u0338"+
		"\7\63\2\2\u0338\u0339\7K\2\2\u0339\u033a\5\u00ecw\2\u033a\u033b\5\u0098"+
		"M\2\u033bk\3\2\2\2\u033c\u033d\7\63\2\2\u033d\u033e\5\u0098M\2\u033em"+
		"\3\2\2\2\u033f\u0340\7M\2\2\u0340\u0344\7\u00a5\2\2\u0341\u0342\7n\2\2"+
		"\u0342\u0343\7\u0085\2\2\u0343\u0345\7c\2\2\u0344\u0341\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u0349\3\2\2\2\u0346\u0347\5\u00c8e\2\u0347\u0348"+
		"\7\32\2\2\u0348\u034a\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u034a\3\2\2\2"+
		"\u034a\u034b\3\2\2\2\u034b\u035b\5\u00ccg\2\u034c\u034d\7\33\2\2\u034d"+
		"\u0354\5~@\2\u034e\u034f\7\35\2\2\u034f\u0353\5\u0098M\2\u0350\u0351\7"+
		"\35\2\2\u0351\u0353\5~@\2\u0352\u034e\3\2\2\2\u0352\u0350\3\2\2\2\u0353"+
		"\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2"+
		"\2\2\u0356\u0354\3\2\2\2\u0357\u0358\7\34\2\2\u0358\u035c\3\2\2\2\u0359"+
		"\u035a\7:\2\2\u035a\u035c\5x=\2\u035b\u034c\3\2\2\2\u035b\u0359\3\2\2"+
		"\2\u035co\3\2\2\2\u035d\u035e\7V\2\2\u035e\u035f\7h\2\2\u035f\u0362\5"+
		"\u00a4S\2\u0360\u0361\7\u00b7\2\2\u0361\u0363\5\u0090I\2\u0362\u0360\3"+
		"\2\2\2\u0362\u0363\3\2\2\2\u0363q\3\2\2\2\u0364\u0365\7[\2\2\u0365\u0368"+
		"\7\u00a5\2\2\u0366\u0367\7n\2\2\u0367\u0369\7c\2\2\u0368\u0366\3\2\2\2"+
		"\u0368\u0369\3\2\2\2\u0369\u036d\3\2\2\2\u036a\u036b\5\u00c8e\2\u036b"+
		"\u036c\7\32\2\2\u036c\u036e\3\2\2\2\u036d\u036a\3\2\2\2\u036d\u036e\3"+
		"\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\5\u00ccg\2\u0370s\3\2\2\2\u0371"+
		"\u037c\5\u00b2Z\2\u0372\u0373\7\u008d\2\2\u0373\u0374\7B\2\2\u0374\u0379"+
		"\5\u00a6T\2\u0375\u0376\7\35\2\2\u0376\u0378\5\u00a6T\2\u0377\u0375\3"+
		"\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u0372\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u0384\3\2\2\2\u037e\u037f\7\u0080\2\2\u037f\u0382\5\u0090I"+
		"\2\u0380\u0381\t\7\2\2\u0381\u0383\5\u0090I\2\u0382\u0380\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u037e\3\2\2\2\u0384\u0385\3\2"+
		"\2\2\u0385u\3\2\2\2\u0386\u0387\7v\2\2\u0387\u038b\7y\2\2\u0388\u0389"+
		"\5\u00c8e\2\u0389\u038a\7\32\2\2\u038a\u038c\3\2\2\2\u038b\u0388\3\2\2"+
		"\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0399\5\u00ccg\2\u038e"+
		"\u038f\7\33\2\2\u038f\u0394\5\u00d2j\2\u0390\u0391\7\35\2\2\u0391\u0393"+
		"\5\u00d2j\2\u0392\u0390\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2"+
		"\2\u0394\u0395\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u0398"+
		"\7\34\2\2\u0398\u039a\3\2\2\2\u0399\u038e\3\2\2\2\u0399\u039a\3\2\2\2"+
		"\u039a\u03ba\3\2\2\2\u039b\u039c\7\u00b2\2\2\u039c\u039d\7\33\2\2\u039d"+
		"\u03a2\5\u0090I\2\u039e\u039f\7\35\2\2\u039f\u03a1\5\u0090I\2\u03a0\u039e"+
		"\3\2\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a5\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03b4\7\34\2\2\u03a6\u03a7\7"+
		"\35\2\2\u03a7\u03a8\7\33\2\2\u03a8\u03ad\5\u0090I\2\u03a9\u03aa\7\35\2"+
		"\2\u03aa\u03ac\5\u0090I\2\u03ab\u03a9\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad"+
		"\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03ad\3\2"+
		"\2\2\u03b0\u03b1\7\34\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03a6\3\2\2\2\u03b3"+
		"\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03bb\3\2"+
		"\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03bb\5x=\2\u03b8\u03b9\7S\2\2\u03b9\u03bb"+
		"\7\u00b2\2\2\u03ba\u039b\3\2\2\2\u03ba\u03b7\3\2\2\2\u03ba\u03b8\3\2\2"+
		"\2\u03bbw\3\2\2\2\u03bc\u03c7\5z>\2\u03bd\u03be\7\u008d\2\2\u03be\u03bf"+
		"\7B\2\2\u03bf\u03c4\5\u00a6T\2\u03c0\u03c1\7\35\2\2\u03c1\u03c3\5\u00a6"+
		"T\2\u03c2\u03c0\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4"+
		"\u03c5\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03bd\3\2"+
		"\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cf\3\2\2\2\u03c9\u03ca\7\u0080\2\2\u03ca"+
		"\u03cd\5\u0090I\2\u03cb\u03cc\t\7\2\2\u03cc\u03ce\5\u0090I\2\u03cd\u03cb"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03c9\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0y\3\2\2\2\u03d1\u03d3\7\u00a2\2\2\u03d2\u03d4\t\b"+
		"\2\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03da\5\u00a8U\2\u03d6\u03d7\7\35\2\2\u03d7\u03d9\5\u00a8U\2\u03d8\u03d6"+
		"\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03e9\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03e7\7h\2\2\u03de\u03e3\5\u00aa"+
		"V\2\u03df\u03e0\7\35\2\2\u03e0\u03e2\5\u00aaV\2\u03e1\u03df\3\2\2\2\u03e2"+
		"\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e8\3\2"+
		"\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e8\5\u00acW\2\u03e7\u03de\3\2\2\2\u03e7"+
		"\u03e6\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03dd\3\2\2\2\u03e9\u03ea\3\2"+
		"\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03ec\7\u00b7\2\2\u03ec\u03ee\5\u0090I"+
		"\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03fd\3\2\2\2\u03ef\u03f0"+
		"\7l\2\2\u03f0\u03f1\7B\2\2\u03f1\u03f6\5\u0090I\2\u03f2\u03f3\7\35\2\2"+
		"\u03f3\u03f5\5\u0090I\2\u03f4\u03f2\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03fb\3\2\2\2\u03f8\u03f6\3\2"+
		"\2\2\u03f9\u03fa\7m\2\2\u03fa\u03fc\5\u0090I\2\u03fb\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03ef\3\2\2\2\u03fd\u03fe\3\2"+
		"\2\2\u03fe\u041c\3\2\2\2\u03ff\u0400\7\u00b2\2\2\u0400\u0401\7\33\2\2"+
		"\u0401\u0406\5\u0090I\2\u0402\u0403\7\35\2\2\u0403\u0405\5\u0090I\2\u0404"+
		"\u0402\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u0409\3\2\2\2\u0408\u0406\3\2\2\2\u0409\u0418\7\34\2\2\u040a"+
		"\u040b\7\35\2\2\u040b\u040c\7\33\2\2\u040c\u0411\5\u0090I\2\u040d\u040e"+
		"\7\35\2\2\u040e\u0410\5\u0090I\2\u040f\u040d\3\2\2\2\u0410\u0413\3\2\2"+
		"\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u0411"+
		"\3\2\2\2\u0414\u0415\7\34\2\2\u0415\u0417\3\2\2\2\u0416\u040a\3\2\2\2"+
		"\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041c"+
		"\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u03d1\3\2\2\2\u041b\u03ff\3\2\2\2\u041c"+
		"{\3\2\2\2\u041d\u041e\7\u00af\2\2\u041e\u041f\5\u00a4S\2\u041f\u0420\7"+
		"\u00a3\2\2\u0420\u0421\5\u00d2j\2\u0421\u0422\7\36\2\2\u0422\u042a\5\u0090"+
		"I\2\u0423\u0424\7\35\2\2\u0424\u0425\5\u00d2j\2\u0425\u0426\7\36\2\2\u0426"+
		"\u0427\5\u0090I\2\u0427\u0429\3\2\2\2\u0428\u0423\3\2\2\2\u0429\u042c"+
		"\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042f\3\2\2\2\u042c"+
		"\u042a\3\2\2\2\u042d\u042e\7\u00b7\2\2\u042e\u0430\5\u0090I\2\u042f\u042d"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430}\3\2\2\2\u0431\u0436\5\u00d2j\2\u0432"+
		"\u0435\5\u0082B\2\u0433\u0435\5\u0080A\2\u0434\u0432\3\2\2\2\u0434\u0433"+
		"\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\177\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u044d\5\u00c4c\2\u043a\u043b\7"+
		"\33\2\2\u043b\u043d\5\u00b4[\2\u043c\u043e\5\u00ecw\2\u043d\u043c\3\2"+
		"\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\7\34\2\2\u0440"+
		"\u044e\3\2\2\2\u0441\u0442\7\33\2\2\u0442\u0444\5\u00b4[\2\u0443\u0445"+
		"\5\u00ecw\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\3\2\2"+
		"\2\u0446\u0447\7\35\2\2\u0447\u0449\5\u00b4[\2\u0448\u044a\5\u00ecw\2"+
		"\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c"+
		"\7\34\2\2\u044c\u044e\3\2\2\2\u044d\u043a\3\2\2\2\u044d\u0441\3\2\2\2"+
		"\u044d\u044e\3\2\2\2\u044e\u0081\3\2\2\2\u044f\u0450\7K\2\2\u0450\u0452"+
		"\5\u00c4c\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0460\3\2\2"+
		"\2\u0453\u0461\5\u0084C\2\u0454\u0461\5\u0086D\2\u0455\u0461\5\u0088E"+
		"\2\u0456\u0461\5\u008aF\2\u0457\u0461\7\u00ae\2\2\u0458\u0459\7F\2\2\u0459"+
		"\u045a\7\33\2\2\u045a\u045b\5\u0090I\2\u045b\u045c\7\34\2\2\u045c\u0461"+
		"\3\2\2\2\u045d\u0461\5\u008cG\2\u045e\u045f\7G\2\2\u045f\u0461\5\u00d4"+
		"k\2\u0460\u0453\3\2\2\2\u0460\u0454\3\2\2\2\u0460\u0455\3\2\2\2\u0460"+
		"\u0456\3\2\2\2\u0460\u0457\3\2\2\2\u0460\u0458\3\2\2\2\u0460\u045d\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0461\u0083\3\2\2\2\u0462\u0463\7\u0091\2\2\u0463"+
		"\u0465\7}\2\2\u0464\u0466\t\t\2\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2"+
		"\2\2\u0466\u0468\3\2\2\2\u0467\u0469\7=\2\2\u0468\u0467\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u0085\3\2\2\2\u046a\u046b\5\u0092J\2\u046b\u0087"+
		"\3\2\2\2\u046c\u046d\7\u0085\2\2\u046d\u046e\7\u0087\2\2\u046e\u0089\3"+
		"\2\2\2\u046f\u0470\7\u0087\2\2\u0470\u008b\3\2\2\2\u0471\u047d\7S\2\2"+
		"\u0472\u047e\5\u008eH\2\u0473\u0474\7\33\2\2\u0474\u0475\5\u0090I\2\u0475"+
		"\u0476\7\34\2\2\u0476\u047e\3\2\2\2\u0477\u0478\7\u0083\2\2\u0478\u0479"+
		"\7\33\2\2\u0479\u047a\5\u0090I\2\u047a\u047b\7\34\2\2\u047b\u047e\3\2"+
		"\2\2\u047c\u047e\5\u00ecw\2\u047d\u0472\3\2\2\2\u047d\u0473\3\2\2\2\u047d"+
		"\u0477\3\2\2\2\u047d\u047c\3\2\2\2\u047e\u0485\3\2\2\2\u047f\u0481\7\30"+
		"\2\2\u0480\u0482\5\u00ecw\2\u0481\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0486\3\2\2\2\u0485\u047f\3\2"+
		"\2\2\u0485\u0486\3\2\2\2\u0486\u008d\3\2\2\2\u0487\u048a\5\u00b4[\2\u0488"+
		"\u048a\5\u00b6\\\2\u0489\u0487\3\2\2\2\u0489\u0488\3\2\2\2\u048a\u008f"+
		"\3\2\2\2\u048b\u048c\bI\1\2\u048c\u04bc\5\u00b6\\\2\u048d\u048e\5\u00c8"+
		"e\2\u048e\u048f\7\32\2\2\u048f\u0491\3\2\2\2\u0490\u048d\3\2\2\2\u0490"+
		"\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\5\u00ccg\2\u0493\u0494"+
		"\7\32\2\2\u0494\u0496\3\2\2\2\u0495\u0490\3\2\2\2\u0495\u0496\3\2\2\2"+
		"\u0496\u0497\3\2\2\2\u0497\u04bc\5\u00d2j\2\u0498\u0499\5\u00b8]\2\u0499"+
		"\u049a\5\u0090I\17\u049a\u04bc\3\2\2\2\u049b\u049c\5\u00c6d\2\u049c\u04a9"+
		"\7\33\2\2\u049d\u049f\7Y\2\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u04a5\5\u0090I\2\u04a1\u04a2\7\35\2\2\u04a2\u04a4"+
		"\5\u0090I\2\u04a3\u04a1\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2\2"+
		"\2\u04a5\u04a6\3\2\2\2\u04a6\u04aa\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04aa"+
		"\7\37\2\2\u04a9\u049e\3\2\2\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2"+
		"\u04aa\u04ab\3\2\2\2\u04ab\u04ac\7\34\2\2\u04ac\u04bc\3\2\2\2\u04ad\u04ae"+
		"\7\33\2\2\u04ae\u04af\5\u0090I\2\u04af\u04b0\7\34\2\2\u04b0\u04bc\3\2"+
		"\2\2\u04b1\u04b3\7\u0085\2\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b4\3\2\2\2\u04b4\u04b6\7c\2\2\u04b5\u04b2\3\2\2\2\u04b5\u04b6\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7\33\2\2\u04b8\u04b9\5x=\2\u04b9"+
		"\u04ba\7\34\2\2\u04ba\u04bc\3\2\2\2\u04bb\u048b\3\2\2\2\u04bb\u0495\3"+
		"\2\2\2\u04bb\u0498\3\2\2\2\u04bb\u049b\3\2\2\2\u04bb\u04ad\3\2\2\2\u04bb"+
		"\u04b5\3\2\2\2\u04bc\u04fd\3\2\2\2\u04bd\u04be\f\16\2\2\u04be\u04bf\7"+
		"#\2\2\u04bf\u04fc\5\u0090I\17\u04c0\u04c1\f\r\2\2\u04c1\u04c2\t\n\2\2"+
		"\u04c2\u04fc\5\u0090I\16\u04c3\u04c4\f\f\2\2\u04c4\u04c5\t\13\2\2\u04c5"+
		"\u04fc\5\u0090I\r\u04c6\u04c7\f\13\2\2\u04c7\u04c8\t\f\2\2\u04c8\u04fc"+
		"\5\u0090I\f\u04c9\u04ca\f\n\2\2\u04ca\u04cb\t\r\2\2\u04cb\u04fc\5\u0090"+
		"I\13\u04cc\u04d8\f\t\2\2\u04cd\u04d9\t\16\2\2\u04ce\u04d7\7z\2\2\u04cf"+
		"\u04d0\7z\2\2\u04d0\u04d7\7\u0085\2\2\u04d1\u04d7\7q\2\2\u04d2\u04d7\7"+
		"\177\2\2\u04d3\u04d7\7k\2\2\u04d4\u04d7\7\u0081\2\2\u04d5\u04d7\7\u0097"+
		"\2\2\u04d6\u04ce\3\2\2\2\u04d6\u04cf\3\2\2\2\u04d6\u04d1\3\2\2\2\u04d6"+
		"\u04d2\3\2\2\2\u04d6\u04d3\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2"+
		"\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04cd\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04fc\5\u0090I\n\u04db\u04dc\f\b\2\2\u04dc\u04dd"+
		"\79\2\2\u04dd\u04fc\5\u0090I\t\u04de\u04df\f\7\2\2\u04df\u04e0\7\u008c"+
		"\2\2\u04e0\u04fc\5\u0090I\b\u04e1\u04e3\f\4\2\2\u04e2\u04e4\7\u0085\2"+
		"\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04f9"+
		"\7q\2\2\u04e6\u04f0\7\33\2\2\u04e7\u04f1\5x=\2\u04e8\u04ed\5\u0090I\2"+
		"\u04e9\u04ea\7\35\2\2\u04ea\u04ec\5\u0090I\2\u04eb\u04e9\3\2\2\2\u04ec"+
		"\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f1\3\2"+
		"\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04e7\3\2\2\2\u04f0\u04e8\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04fa\7\34\2\2\u04f3\u04f4\5"+
		"\u00c8e\2\u04f4\u04f5\7\32\2\2\u04f5\u04f7\3\2\2\2\u04f6\u04f3\3\2\2\2"+
		"\u04f6\u04f7\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\5\u00ccg\2\u04f9"+
		"\u04e6\3\2\2\2\u04f9\u04f6\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04bd\3\2"+
		"\2\2\u04fb\u04c0\3\2\2\2\u04fb\u04c3\3\2\2\2\u04fb\u04c6\3\2\2\2\u04fb"+
		"\u04c9\3\2\2\2\u04fb\u04cc\3\2\2\2\u04fb\u04db\3\2\2\2\u04fb\u04de\3\2"+
		"\2\2\u04fb\u04e1\3\2\2\2\u04fc\u04ff\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\u0091\3\2\2\2\u04ff\u04fd\3\2\2\2\u0500\u0504\7\u0096"+
		"\2\2\u0501\u0502\5\u00c8e\2\u0502\u0503\7\32\2\2\u0503\u0505\3\2\2\2\u0504"+
		"\u0501\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0512\5\u00d6"+
		"l\2\u0507\u0508\7\33\2\2\u0508\u050d\5\u0094K\2\u0509\u050a\7\35\2\2\u050a"+
		"\u050c\5\u0094K\2\u050b\u0509\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b"+
		"\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u0510\3\2\2\2\u050f\u050d\3\2\2\2\u0510"+
		"\u0511\7\34\2\2\u0511\u0513\3\2\2\2\u0512\u0507\3\2\2\2\u0512\u0513\3"+
		"\2\2\2\u0513\u0526\3\2\2\2\u0514\u0515\7\u008a\2\2\u0515\u051e\t\17\2"+
		"\2\u0516\u0517\7\u00a3\2\2\u0517\u051f\7\u0087\2\2\u0518\u0519\7\u00a3"+
		"\2\2\u0519\u051f\7S\2\2\u051a\u051f\7C\2\2\u051b\u051f\7\u009c\2\2\u051c"+
		"\u051d\7\u0084\2\2\u051d\u051f\7\62\2\2\u051e\u0516\3\2\2\2\u051e\u0518"+
		"\3\2\2\2\u051e\u051a\3\2\2\2\u051e\u051b\3\2\2\2\u051e\u051c\3\2\2\2\u051f"+
		"\u0523\3\2\2\2\u0520\u0521\7\u0081\2\2\u0521\u0523\5\u00c4c\2\u0522\u0514"+
		"\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u0522\3\2\2\2\u0525"+
		"\u0528\3\2\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0536\3\2"+
		"\2\2\u0528\u0526\3\2\2\2\u0529\u052b\7\u0085\2\2\u052a\u0529\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u0531\7T\2\2\u052d\u052e\7t\2"+
		"\2\u052e\u0532\7U\2\2\u052f\u0530\7t\2\2\u0530\u0532\7p\2\2\u0531\u052d"+
		"\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533"+
		"\u0535\7_\2\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0537\3\2"+
		"\2\2\u0536\u052a\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0093\3\2\2\2\u0538"+
		"\u0539\5\u00c4c\2\u0539\u0095\3\2\2\2\u053a\u053d\5\u00d2j\2\u053b\u053c"+
		"\7G\2\2\u053c\u053e\5\u00d4k\2\u053d\u053b\3\2\2\2\u053d\u053e\3\2\2\2"+
		"\u053e\u0540\3\2\2\2\u053f\u0541\t\t\2\2\u0540\u053f\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0097\3\2\2\2\u0542\u0543\7K\2\2\u0543\u0545\5\u00c4c\2"+
		"\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u054f\3\2\2\2\u0546\u0550"+
		"\5\u009aN\2\u0547\u0550\5\u00a0Q\2\u0548\u0550\5\u009eP\2\u0549\u054a"+
		"\7F\2\2\u054a\u054b\7\33\2\2\u054b\u054c\5\u0090I\2\u054c\u054d\7\34\2"+
		"\2\u054d\u0550\3\2\2\2\u054e\u0550\5\u009cO\2\u054f\u0546\3\2\2\2\u054f"+
		"\u0547\3\2\2\2\u054f\u0548\3\2\2\2\u054f\u0549\3\2\2\2\u054f\u054e\3\2"+
		"\2\2\u0550\u0099\3\2\2\2\u0551\u0552\7\u0091\2\2\u0552\u0553\7}\2\2\u0553"+
		"\u0554\7\33\2\2\u0554\u0559\5\u0096L\2\u0555\u0556\7\35\2\2\u0556\u0558"+
		"\5\u0096L\2\u0557\u0555\3\2\2\2\u0558\u055b\3\2\2\2\u0559\u0557\3\2\2"+
		"\2\u0559\u055a\3\2\2\2\u055a\u055c\3\2\2\2\u055b\u0559\3\2\2\2\u055c\u055d"+
		"\7\34\2\2\u055d\u009b\3\2\2\2\u055e\u055f\7g\2\2\u055f\u0560\7}\2\2\u0560"+
		"\u0561\7\33\2\2\u0561\u0566\5\u00a2R\2\u0562\u0563\7\35\2\2\u0563\u0565"+
		"\5\u00a2R\2\u0564\u0562\3\2\2\2\u0565\u0568\3\2\2\2\u0566\u0564\3\2\2"+
		"\2\u0566\u0567\3\2\2\2\u0567\u0569\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056a"+
		"\7\34\2\2\u056a\u056b\5\u0092J\2\u056b\u009d\3\2\2\2\u056c\u056e\7\u00ae"+
		"\2\2\u056d\u056f\7}\2\2\u056e\u056d\3\2\2\2\u056e\u056f\3\2\2\2\u056f"+
		"\u0571\3\2\2\2\u0570\u0572\5\u00c4c\2\u0571\u0570\3\2\2\2\u0571\u0572"+
		"\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\7\33\2\2\u0574\u0579\5\u0096"+
		"L\2\u0575\u0576\7\35\2\2\u0576\u0578\5\u0096L\2\u0577\u0575\3\2\2\2\u0578"+
		"\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2"+
		"\2\2\u057b\u0579\3\2\2\2\u057c\u057d\7\34\2\2\u057d\u009f\3\2\2\2\u057e"+
		"\u0580\7}\2\2\u057f\u0581\5\u00c4c\2\u0580\u057f\3\2\2\2\u0580\u0581\3"+
		"\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\7\33\2\2\u0583\u0588\5\u0096L\2"+
		"\u0584\u0585\7\35\2\2\u0585\u0587\5\u0096L\2\u0586\u0584\3\2\2\2\u0587"+
		"\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2"+
		"\2\2\u058a\u0588\3\2\2\2\u058b\u058c\7\34\2\2\u058c\u00a1\3\2\2\2\u058d"+
		"\u058e\5\u00d2j\2\u058e\u00a3\3\2\2\2\u058f\u0590\5\u00c8e\2\u0590\u0591"+
		"\7\32\2\2\u0591\u0593\3\2\2\2\u0592\u058f\3\2\2\2\u0592\u0593\3\2\2\2"+
		"\u0593\u0594\3\2\2\2\u0594\u059a\5\u00ccg\2\u0595\u0596\7s\2\2\u0596\u0597"+
		"\7B\2\2\u0597\u059b\5\u00d8m\2\u0598\u0599\7\u0085\2\2\u0599\u059b\7s"+
		"\2\2\u059a\u0595\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b"+
		"\u00a5\3\2\2\2\u059c\u059e\5\u0090I\2\u059d\u059f\t\t\2\2\u059e\u059d"+
		"\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u00a7\3\2\2\2\u05a0\u05ad\7\37\2\2"+
		"\u05a1\u05a2\5\u00ccg\2\u05a2\u05a3\7\32\2\2\u05a3\u05a4\7\37\2\2\u05a4"+
		"\u05ad\3\2\2\2\u05a5\u05aa\5\u0090I\2\u05a6\u05a8\7:\2\2\u05a7\u05a6\3"+
		"\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ab\5\u00be`\2"+
		"\u05aa\u05a7\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05a0"+
		"\3\2\2\2\u05ac\u05a1\3\2\2\2\u05ac\u05a5\3\2\2\2\u05ad\u00a9\3\2\2\2\u05ae"+
		"\u05af\5\u00c8e\2\u05af\u05b0\7\32\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05ae"+
		"\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b8\5\u00ccg"+
		"\2\u05b4\u05b6\7:\2\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05b9\5\u00e4s\2\u05b8\u05b5\3\2\2\2\u05b8\u05b9\3\2\2"+
		"\2\u05b9\u05bf\3\2\2\2\u05ba\u05bb\7s\2\2\u05bb\u05bc\7B\2\2\u05bc\u05c0"+
		"\5\u00d8m\2\u05bd\u05be\7\u0085\2\2\u05be\u05c0\7s\2\2\u05bf\u05ba\3\2"+
		"\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05de\3\2\2\2\u05c1"+
		"\u05cb\7\33\2\2\u05c2\u05c7\5\u00aaV\2\u05c3\u05c4\7\35\2\2\u05c4\u05c6"+
		"\5\u00aaV\2\u05c5\u05c3\3\2\2\2\u05c6\u05c9\3\2\2\2\u05c7\u05c5\3\2\2"+
		"\2\u05c7\u05c8\3\2\2\2\u05c8\u05cc\3\2\2\2\u05c9\u05c7\3\2\2\2\u05ca\u05cc"+
		"\5\u00acW\2\u05cb\u05c2\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cc\u05cd\3\2\2"+
		"\2\u05cd\u05d2\7\34\2\2\u05ce\u05d0\7:\2\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0"+
		"\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\5\u00e4s\2\u05d2\u05cf\3\2\2"+
		"\2\u05d2\u05d3\3\2\2\2\u05d3\u05de\3\2\2\2\u05d4\u05d5\7\33\2\2\u05d5"+
		"\u05d6\5x=\2\u05d6\u05db\7\34\2\2\u05d7\u05d9\7:\2\2\u05d8\u05d7\3\2\2"+
		"\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\5\u00e4s\2\u05db"+
		"\u05d8\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd\u05b1\3\2"+
		"\2\2\u05dd\u05c1\3\2\2\2\u05dd\u05d4\3\2\2\2\u05de\u00ab\3\2\2\2\u05df"+
		"\u05e6\5\u00aaV\2\u05e0\u05e1\5\u00aeX\2\u05e1\u05e2\5\u00aaV\2\u05e2"+
		"\u05e3\5\u00b0Y\2\u05e3\u05e5\3\2\2\2\u05e4\u05e0\3\2\2\2\u05e5\u05e8"+
		"\3\2\2\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u00ad\3\2\2\2\u05e8"+
		"\u05e6\3\2\2\2\u05e9\u05f3\3\2\2\2\u05ea\u05ec\7~\2\2\u05eb\u05ed\7\u008e"+
		"\2\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee"+
		"\u05f0\7u\2\2\u05ef\u05ea\3\2\2\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2"+
		"\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\7|\2\2\u05f2\u05e9\3\2\2\2\u05f2"+
		"\u05ef\3\2\2\2\u05f3\u00af\3\2\2\2\u05f4\u05f5\7\u008a\2\2\u05f5\u05f6"+
		"\5\u0090I\2\u05f6\u00b1\3\2\2\2\u05f7\u05f9\7\u00a2\2\2\u05f8\u05fa\t"+
		"\b\2\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u0600\5\u00a8U\2\u05fc\u05fd\7\35\2\2\u05fd\u05ff\5\u00a8U\2\u05fe\u05fc"+
		"\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
		"\u060f\3\2\2\2\u0602\u0600\3\2\2\2\u0603\u060d\7h\2\2\u0604\u0609\5\u00aa"+
		"V\2\u0605\u0606\7\35\2\2\u0606\u0608\5\u00aaV\2\u0607\u0605\3\2\2\2\u0608"+
		"\u060b\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060e\3\2"+
		"\2\2\u060b\u0609\3\2\2\2\u060c\u060e\5\u00acW\2\u060d\u0604\3\2\2\2\u060d"+
		"\u060c\3\2\2\2\u060e\u0610\3\2\2\2\u060f\u0603\3\2\2\2\u060f\u0610\3\2"+
		"\2\2\u0610\u0613\3\2\2\2\u0611\u0612\7\u00b7\2\2\u0612\u0614\5\u0090I"+
		"\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0623\3\2\2\2\u0615\u0616"+
		"\7l\2\2\u0616\u0617\7B\2\2\u0617\u061c\5\u0090I\2\u0618\u0619\7\35\2\2"+
		"\u0619\u061b\5\u0090I\2\u061a\u0618\3\2\2\2\u061b\u061e\3\2\2\2\u061c"+
		"\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u0621\3\2\2\2\u061e\u061c\3\2"+
		"\2\2\u061f\u0620\7m\2\2\u0620\u0622\5\u0090I\2\u0621\u061f\3\2\2\2\u0621"+
		"\u0622\3\2\2\2\u0622\u0624\3\2\2\2\u0623\u0615\3\2\2\2\u0623\u0624\3\2"+
		"\2\2\u0624\u0642\3\2\2\2\u0625\u0626\7\u00b2\2\2\u0626\u0627\7\33\2\2"+
		"\u0627\u062c\5\u0090I\2\u0628\u0629\7\35\2\2\u0629\u062b\5\u0090I\2\u062a"+
		"\u0628\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c\u062d\3\2"+
		"\2\2\u062d\u062f\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u063e\7\34\2\2\u0630"+
		"\u0631\7\35\2\2\u0631\u0632\7\33\2\2\u0632\u0637\5\u0090I\2\u0633\u0634"+
		"\7\35\2\2\u0634\u0636\5\u0090I\2\u0635\u0633\3\2\2\2\u0636\u0639\3\2\2"+
		"\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063a\3\2\2\2\u0639\u0637"+
		"\3\2\2\2\u063a\u063b\7\34\2\2\u063b\u063d\3\2\2\2\u063c\u0630\3\2\2\2"+
		"\u063d\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0642"+
		"\3\2\2\2\u0640\u063e\3\2\2\2\u0641\u05f7\3\2\2\2\u0641\u0625\3\2\2\2\u0642"+
		"\u00b3\3\2\2\2\u0643\u0645\t\13\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3"+
		"\2\2\2\u0645\u0646\3\2\2\2\u0646\u0649\7\u00be\2\2\u0647\u0649\7\37\2"+
		"\2\u0648\u0644\3\2\2\2\u0648\u0647\3\2\2\2\u0649\u00b5\3\2\2\2\u064a\u0656"+
		"\7\u00be\2\2\u064b\u0656\7\u00c0\2\2\u064c\u0656\7\u00c1\2\2\u064d\u0656"+
		"\7\u0087\2\2\u064e\u0656\7P\2\2\u064f\u0656\7O\2\2\u0650\u0656\7Q\2\2"+
		"\u0651\u0652\7\33\2\2\u0652\u0653\5\u00b6\\\2\u0653\u0654\7\34\2\2\u0654"+
		"\u0656\3\2\2\2\u0655\u064a\3\2\2\2\u0655\u064b\3\2\2\2\u0655\u064c\3\2"+
		"\2\2\u0655\u064d\3\2\2\2\u0655\u064e\3\2\2\2\u0655\u064f\3\2\2\2\u0655"+
		"\u0650\3\2\2\2\u0655\u0651\3\2\2\2\u0656\u00b7\3\2\2\2\u0657\u0658\t\20"+
		"\2\2\u0658\u00b9\3\2\2\2\u0659\u065a\7\u00c0\2\2\u065a\u00bb\3\2\2\2\u065b"+
		"\u065e\5\u0090I\2\u065c\u065e\5~@\2\u065d\u065b\3\2\2\2\u065d\u065c\3"+
		"\2\2\2\u065e\u00bd\3\2\2\2\u065f\u0660\t\21\2\2\u0660\u00bf\3\2\2\2\u0661"+
		"\u0662\t\22\2\2\u0662\u00c1\3\2\2\2\u0663\u0665\13\2\2\2\u0664\u0663\3"+
		"\2\2\2\u0665\u0666\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u00c3\3\2\2\2\u0668\u0669\5\u00ecw\2\u0669\u00c5\3\2\2\2\u066a\u066b"+
		"\5\u00ecw\2\u066b\u00c7\3\2\2\2\u066c\u066d\5\u00ecw\2\u066d\u00c9\3\2"+
		"\2\2\u066e\u066f\5\u00ecw\2\u066f\u00cb\3\2\2\2\u0670\u0671\5\u00ecw\2"+
		"\u0671\u00cd\3\2\2\2\u0672\u0673\5\u00ecw\2\u0673\u00cf\3\2\2\2\u0674"+
		"\u0675\5\u00ecw\2\u0675\u00d1\3\2\2\2\u0676\u0677\5\u00ecw\2\u0677\u00d3"+
		"\3\2\2\2\u0678\u0679\5\u00ecw\2\u0679\u00d5\3\2\2\2\u067a\u067b\5\u00ec"+
		"w\2\u067b\u00d7\3\2\2\2\u067c\u067d\5\u00ecw\2\u067d\u00d9\3\2\2\2\u067e"+
		"\u067f\5\u00ecw\2\u067f\u00db\3\2\2\2\u0680\u0681\5\u00ecw\2\u0681\u00dd"+
		"\3\2\2\2\u0682\u0683\5\u00ecw\2\u0683\u00df\3\2\2\2\u0684\u0685\5\u00ec"+
		"w\2\u0685\u00e1\3\2\2\2\u0686\u0687\5\u00ecw\2\u0687\u00e3\3\2\2\2\u0688"+
		"\u0689\7\u00bd\2\2\u0689\u00e5\3\2\2\2\u068a\u068b\5\u00ecw\2\u068b\u00e7"+
		"\3\2\2\2\u068c\u068d\5\u00ecw\2\u068d\u00e9\3\2\2\2\u068e\u068f\5\u00ec"+
		"w\2\u068f\u00eb\3\2\2\2\u0690\u0697\7\u00bd\2\2\u0691\u0697\7\u00c0\2"+
		"\2\u0692\u0693\7\33\2\2\u0693\u0694\5\u00ecw\2\u0694\u0695\7\34\2\2\u0695"+
		"\u0697\3\2\2\2\u0696\u0690\3\2\2\2\u0696\u0691\3\2\2\2\u0696\u0692\3\2"+
		"\2\2\u0697\u00ed\3\2\2\2\u00d6\u00f0\u00f2\u00f7\u0100\u0106\u010a\u010f"+
		"\u0114\u0117\u0120\u0127\u012b\u0132\u0135\u0138\u013e\u0144\u014b\u014e"+
		"\u0153\u015f\u0166\u016d\u016f\u0175\u0181\u0185\u018b\u01a1\u01a8\u01b0"+
		"\u01b7\u01bb\u01c3\u01ca\u01d4\u01dd\u01df\u01e4\u01eb\u01f8\u0200\u0208"+
		"\u020e\u021b\u0221\u0229\u0230\u023f\u0246\u024d\u0252\u0258\u0264\u026b"+
		"\u0270\u0274\u027c\u0285\u028a\u0290\u029a\u02a0\u02a9\u02ae\u02b9\u02c1"+
		"\u02cb\u02ce\u02d7\u02db\u02e1\u02e6\u02ed\u02f2\u02f8\u0302\u0309\u0313"+
		"\u0316\u0322\u0330\u0344\u0349\u0352\u0354\u035b\u0362\u0368\u036d\u0379"+
		"\u037c\u0382\u0384\u038b\u0394\u0399\u03a2\u03ad\u03b4\u03ba\u03c4\u03c7"+
		"\u03cd\u03cf\u03d3\u03da\u03e3\u03e7\u03e9\u03ed\u03f6\u03fb\u03fd\u0406"+
		"\u0411\u0418\u041b\u042a\u042f\u0434\u0436\u043d\u0444\u0449\u044d\u0451"+
		"\u0460\u0465\u0468\u047d\u0483\u0485\u0489\u0490\u0495\u049e\u04a5\u04a9"+
		"\u04b2\u04b5\u04bb\u04d6\u04d8\u04e3\u04ed\u04f0\u04f6\u04f9\u04fb\u04fd"+
		"\u0504\u050d\u0512\u051e\u0522\u0526\u052a\u0531\u0534\u0536\u053d\u0540"+
		"\u0544\u054f\u0559\u0566\u056e\u0571\u0579\u0580\u0588\u0592\u059a\u059e"+
		"\u05a7\u05aa\u05ac\u05b1\u05b5\u05b8\u05bf\u05c7\u05cb\u05cf\u05d2\u05d8"+
		"\u05db\u05dd\u05e6\u05ec\u05ef\u05f2\u05f9\u0600\u0609\u060d\u060f\u0613"+
		"\u061c\u0621\u0623\u062c\u0637\u063e\u0641\u0644\u0648\u0655\u065d\u0666"+
		"\u0696";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}