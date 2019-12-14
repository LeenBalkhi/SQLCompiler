// Generated from E:/uni/lectures/4th Year/Compiler/Practical/SQLCompiler\Sql.g4 by ANTLR 4.7.2
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
		LBRACE=1, RBRACE=2, LBRACK=3, T__18=4, RBRACK=5, T__10=6, AND=7, INC=8, 
		DEC=9, QUESTION=10, ADD_ASSIGN=11, SUB_ASSIGN=12, MUL_ASSIGN=13, DIV_ASSIGN=14, 
		AND_ASSIGN=15, OR_ASSIGN=16, XOR_ASSIGN=17, LSHIFT_ASSIGN=18, RSHIFT_ASSIGN=19, 
		URSHIFT_ASSIGN=20, T__22=21, SCOL=22, DOT=23, OPEN_PAR=24, CLOSE_PAR=25, 
		COMMA=26, ASSIGN=27, STAR=28, PLUS=29, MINUS=30, TILDE=31, PIPE2=32, DIV=33, 
		MOD=34, LT2=35, GT2=36, AMP=37, PIPE=38, LT=39, LT_EQ=40, GT=41, GT_EQ=42, 
		EQ=43, NOT_EQ1=44, NOT_EQ2=45, DOTS=46, COMMENT_OP=47, K_ABORT=48, K_ACTION=49, 
		K_ADD=50, K_AFTER=51, K_ALL=52, K_ALTER=53, K_ANALYZE=54, K_AND=55, K_AS=56, 
		K_ASC=57, K_ATTACH=58, K_AUTOINCREMENT=59, K_BEFORE=60, K_BEGIN=61, K_BETWEEN=62, 
		K_BREAK=63, K_BY=64, K_CASCADE=65, K_CASE=66, K_CAST=67, K_CHECK=68, K_COLLATE=69, 
		K_COLUMN=70, K_COMMIT=71, K_CONFLICT=72, K_CONSTRAINT=73, K_CONTINUE=74, 
		K_CREATE=75, K_CROSS=76, K_CURRENT_DATE=77, K_CURRENT_TIME=78, K_CURRENT_TIMESTAMP=79, 
		K_DATABASE=80, K_DEFAULT=81, K_DEFERRABLE=82, K_DEFERRED=83, K_DELETE=84, 
		K_DESC=85, K_DETACH=86, K_DISTINCT=87, K_DO=88, K_DROP=89, K_EACH=90, 
		K_ELSE=91, K_END=92, K_ENABLE=93, K_ESCAPE=94, K_EXCEPT=95, K_EXCLUSIVE=96, 
		K_EXISTS=97, K_EXPLAIN=98, K_FAIL=99, K_FOR=100, K_FOREIGN=101, K_FROM=102, 
		K_FULL=103, K_FUNCTION=104, K_GLOB=105, K_GROUP=106, K_HAVING=107, K_IF=108, 
		K_IGNORE=109, K_IMMEDIATE=110, K_IN=111, K_INDEX=112, K_INDEXED=113, K_INITIALLY=114, 
		K_INNER=115, K_INSERT=116, K_INSTEAD=117, K_INTERSECT=118, K_INTO=119, 
		K_IS=120, K_ISNULL=121, K_JOIN=122, K_KEY=123, K_LEFT=124, K_LIKE=125, 
		K_LIMIT=126, K_MATCH=127, K_NATURAL=128, K_NEXTVAL=129, K_NO=130, K_NOT=131, 
		K_NOTNULL=132, K_NULL=133, K_OF=134, K_OFFSET=135, K_ON=136, K_ONLY=137, 
		K_OR=138, K_ORDER=139, K_OUTER=140, K_PLAN=141, K_PRAGMA=142, K_PRIMARY=143, 
		K_PRINT=144, K_QUERY=145, K_RAISE=146, K_RECURSIVE=147, K_REFERENCES=148, 
		K_REGEXP=149, K_REINDEX=150, K_RELEASE=151, K_RENAME=152, K_REPLACE=153, 
		K_RESTRICT=154, K_RETURN=155, K_RIGHT=156, K_ROLLBACK=157, K_ROW=158, 
		K_SAVEPOINT=159, K_SELECT=160, K_SET=161, K_SWITCH=162, K_TABLE=163, K_TEMP=164, 
		K_TEMPORARY=165, K_THEN=166, K_TO=167, K_TRANSACTION=168, K_TRIGGER=169, 
		K_UNION=170, K_UNIQUE=171, K_UPDATE=172, K_USING=173, K_VACUUM=174, K_VALUES=175, 
		K_VIEW=176, K_VIRTUAL=177, K_VAR=178, K_WHEN=179, K_WHERE=180, K_WHILE=181, 
		K_WITH=182, K_WITHOUT=183, K_TRUE=184, K_FALSE=185, IDENTIFIER=186, NUMERIC_LITERAL=187, 
		BIND_PARAMETER=188, STRING_LITERAL=189, BLOB_LITERAL=190, SINGLE_LINE_COMMENT=191, 
		JAVA_SINGLE_LINE_COMMENT=192, MULTILINE_COMMENT=193, SPACES=194, UNEXPECTED_CHAR=195, 
		DIGIT=196;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_java_stmt = 3, 
		RULE_default_parameter = 4, RULE_parameter_list = 5, RULE_argument_list = 6, 
		RULE_java_function_call = 7, RULE_higher_order_function = 8, RULE_ho_java_function = 9, 
		RULE_return_stmt = 10, RULE_java_function = 11, RULE_method_logic = 12, 
		RULE_comments = 13, RULE_variable_identification = 14, RULE_array_identification = 15, 
		RULE_array_call = 16, RULE_element = 17, RULE_json_object = 18, RULE_print = 19, 
		RULE_string = 20, RULE_logical_expression = 21, RULE_logical_condition = 22, 
		RULE_increment = 23, RULE_assignment_operator = 24, RULE_conditional_stmt = 25, 
		RULE_loop_stmt = 26, RULE_for_lopp = 27, RULE_while_loop = 28, RULE_do_while_loop = 29, 
		RULE_for_each_loop = 30, RULE_switch_stmt = 31, RULE_sql_stmt = 32, RULE_alter_table_stmt = 33, 
		RULE_alter_table_add_constraint = 34, RULE_alter_table_add = 35, RULE_analyze_stmt = 36, 
		RULE_attach_stmt = 37, RULE_begin_stmt = 38, RULE_commit_stmt = 39, RULE_compound_select_stmt = 40, 
		RULE_create_index_stmt = 41, RULE_create_table_stmt = 42, RULE_create_trigger_stmt = 43, 
		RULE_create_view_stmt = 44, RULE_create_virtual_table_stmt = 45, RULE_delete_stmt = 46, 
		RULE_delete_stmt_limited = 47, RULE_detach_stmt = 48, RULE_drop_index_stmt = 49, 
		RULE_drop_table_stmt = 50, RULE_drop_trigger_stmt = 51, RULE_drop_view_stmt = 52, 
		RULE_factored_select_stmt = 53, RULE_insert_stmt = 54, RULE_pragma_stmt = 55, 
		RULE_reindex_stmt = 56, RULE_release_stmt = 57, RULE_rollback_stmt = 58, 
		RULE_savepoint_stmt = 59, RULE_simple_select_stmt = 60, RULE_select_stmt = 61, 
		RULE_select_or_values = 62, RULE_update_stmt = 63, RULE_update_stmt_limited = 64, 
		RULE_vacuum_stmt = 65, RULE_column_def = 66, RULE_type_name = 67, RULE_column_constraint = 68, 
		RULE_column_constraint_primary_key = 69, RULE_column_constraint_foreign_key = 70, 
		RULE_column_constraint_not_null = 71, RULE_column_constraint_null = 72, 
		RULE_column_default = 73, RULE_column_default_value = 74, RULE_conflict_clause = 75, 
		RULE_expr = 76, RULE_foreign_key_clause = 77, RULE_fk_target_column_name = 78, 
		RULE_raise_function = 79, RULE_indexed_column = 80, RULE_table_constraint = 81, 
		RULE_table_constraint_primary_key = 82, RULE_table_constraint_foreign_key = 83, 
		RULE_table_constraint_unique = 84, RULE_table_constraint_key = 85, RULE_fk_origin_column_name = 86, 
		RULE_with_clause = 87, RULE_qualified_table_name = 88, RULE_ordering_term = 89, 
		RULE_pragma_value = 90, RULE_common_table_expression = 91, RULE_result_column = 92, 
		RULE_table_or_subquery = 93, RULE_join_clause = 94, RULE_join_operator = 95, 
		RULE_join_constraint = 96, RULE_select_core = 97, RULE_compound_operator = 98, 
		RULE_cte_table_name = 99, RULE_signed_number = 100, RULE_literal_value = 101, 
		RULE_unary_operator = 102, RULE_error_message = 103, RULE_module_argument = 104, 
		RULE_column_alias = 105, RULE_keyword = 106, RULE_unknown = 107, RULE_name = 108, 
		RULE_function_name = 109, RULE_database_name = 110, RULE_source_table_name = 111, 
		RULE_table_name = 112, RULE_table_or_index_name = 113, RULE_new_table_name = 114, 
		RULE_column_name = 115, RULE_collation_name = 116, RULE_foreign_table = 117, 
		RULE_index_name = 118, RULE_trigger_name = 119, RULE_view_name = 120, 
		RULE_module_name = 121, RULE_pragma_name = 122, RULE_savepoint_name = 123, 
		RULE_table_alias = 124, RULE_transaction_name = 125, RULE_method_ID = 126, 
		RULE_variable = 127, RULE_array_name = 128, RULE_any_name = 129;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "java_stmt", "default_parameter", 
			"parameter_list", "argument_list", "java_function_call", "higher_order_function", 
			"ho_java_function", "return_stmt", "java_function", "method_logic", "comments", 
			"variable_identification", "array_identification", "array_call", "element", 
			"json_object", "print", "string", "logical_expression", "logical_condition", 
			"increment", "assignment_operator", "conditional_stmt", "loop_stmt", 
			"for_lopp", "while_loop", "do_while_loop", "for_each_loop", "switch_stmt", 
			"sql_stmt", "alter_table_stmt", "alter_table_add_constraint", "alter_table_add", 
			"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", 
			"create_index_stmt", "create_table_stmt", "create_trigger_stmt", "create_view_stmt", 
			"create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", "detach_stmt", 
			"drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", 
			"factored_select_stmt", "insert_stmt", "pragma_stmt", "reindex_stmt", 
			"release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
			"vacuum_stmt", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "conflict_clause", "expr", 
			"foreign_key_clause", "fk_target_column_name", "raise_function", "indexed_column", 
			"table_constraint", "table_constraint_primary_key", "table_constraint_foreign_key", 
			"table_constraint_unique", "table_constraint_key", "fk_origin_column_name", 
			"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "method_ID", 
			"variable", "array_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "'\"'", "']'", "'''", "'&&'", "'++'", "'--'", 
			"'?'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'<<='", 
			"'>>='", "'>>>='", "'::'", "';'", "'.'", "'('", "')'", "','", "'='", 
			"'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
			"'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", "':'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "LBRACK", null, "RBRACK", null, "AND", "INC", 
			"DEC", "QUESTION", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", 
			"ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", 
			"GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", 
			"NOT_EQ2", "DOTS", "COMMENT_OP", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", 
			"K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", 
			"K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BREAK", "K_BY", 
			"K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
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
			"SPACES", "UNEXPECTED_CHAR", "DIGIT"
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_INSERT - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_WITH - 142)) | (1L << (UNEXPECTED_CHAR - 142)))) != 0)) {
					{
					setState(262);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCOL:
					case K_ALTER:
					case K_ANALYZE:
					case K_ATTACH:
					case K_BEGIN:
					case K_COMMIT:
					case K_CREATE:
					case K_DELETE:
					case K_DETACH:
					case K_DROP:
					case K_END:
					case K_EXPLAIN:
					case K_INSERT:
					case K_PRAGMA:
					case K_REINDEX:
					case K_RELEASE:
					case K_REPLACE:
					case K_ROLLBACK:
					case K_SAVEPOINT:
					case K_SELECT:
					case K_UPDATE:
					case K_VACUUM:
					case K_VALUES:
					case K_WITH:
						{
						setState(260);
						sql_stmt_list();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(261);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
			setState(271);
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
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(274);
				match(SCOL);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			sql_stmt();
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(281);
						match(SCOL);
						}
						}
						setState(284); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(286);
					sql_stmt();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(SCOL);
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Java_stmtContext extends ParserRuleContext {
		public Variable_identificationContext variable_identification() {
			return getRuleContext(Variable_identificationContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Java_stmtContext java_stmt() {
			return getRuleContext(Java_stmtContext.class,0);
		}
		public Java_functionContext java_function() {
			return getRuleContext(Java_functionContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
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
		enterRule(_localctx, 6, RULE_java_stmt);
		try {
			int _alt;
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				variable_identification();
				setState(300);
				match(SCOL);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(301);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				java_function();
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						match(SCOL);
						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(311);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				java_function_call();
				setState(315);
				match(SCOL);
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(316);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				higher_order_function();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(320);
					java_stmt();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
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
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
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
		enterRule(_localctx, 8, RULE_default_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(K_VAR);
			setState(327);
			variable();
			setState(328);
			match(ASSIGN);
			setState(329);
			logical_expression(0);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
		enterRule(_localctx, 10, RULE_parameter_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(331);
				match(K_VAR);
				setState(332);
				variable();
				}
				break;
			}
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					match(K_VAR);
					setState(337);
					variable();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_VAR) {
				{
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(343);
					match(COMMA);
					}
				}

				setState(346);
				default_parameter();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(347);
					match(COMMA);
					setState(348);
					default_parameter();
					}
					}
					setState(353);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
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
		enterRule(_localctx, 12, RULE_argument_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(356);
				variable();
				}
				break;
			case 2:
				{
				setState(357);
				literal_value();
				}
				break;
			}
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(COMMA);
					setState(363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(361);
						variable();
						}
						break;
					case 2:
						{
						setState(362);
						literal_value();
						}
						break;
					}
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public ParseContext parse() {
			return getRuleContext(ParseContext.class,0);
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
		enterRule(_localctx, 14, RULE_java_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			method_ID();
			setState(371);
			match(OPEN_PAR);
			setState(372);
			argument_list();
			setState(373);
			match(CLOSE_PAR);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(374);
				parse();
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

	public static class Higher_order_functionContext extends ParserRuleContext {
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
		public Higher_order_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_order_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterHigher_order_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitHigher_order_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitHigher_order_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_order_functionContext higher_order_function() throws RecognitionException {
		Higher_order_functionContext _localctx = new Higher_order_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_higher_order_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			method_ID();
			{
			setState(378);
			match(OPEN_PAR);
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(379);
				argument_list();
				}
				break;
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(382);
				match(COMMA);
				}
			}

			{
			setState(385);
			ho_java_function();
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(386);
				match(COMMA);
				setState(387);
				argument_list();
				}
			}

			setState(390);
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
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
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
		enterRule(_localctx, 18, RULE_ho_java_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(K_FUNCTION);
			setState(393);
			match(OPEN_PAR);
			{
			setState(394);
			argument_list();
			}
			setState(395);
			match(CLOSE_PAR);
			setState(396);
			match(LBRACE);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
				{
				{
				setState(397);
				method_logic();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(403);
				return_stmt();
				}
			}

			setState(406);
			match(RBRACE);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Array_identificationContext array_identification() {
			return getRuleContext(Array_identificationContext.class,0);
		}
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public Logical_conditionContext logical_condition() {
			return getRuleContext(Logical_conditionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
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
		enterRule(_localctx, 20, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			match(K_RETURN);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(409);
				string();
				}
				break;
			case 2:
				{
				setState(410);
				variable();
				}
				break;
			case 3:
				{
				setState(411);
				array_identification();
				}
				break;
			case 4:
				{
				setState(412);
				json_object();
				}
				break;
			case 5:
				{
				setState(413);
				java_function_call();
				}
				break;
			case 6:
				{
				setState(414);
				logical_condition();
				}
				break;
			case 7:
				{
				setState(415);
				logical_expression(0);
				}
				break;
			}
			setState(418);
			match(SCOL);
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

	public static class Java_functionContext extends ParserRuleContext {
		public Method_IDContext method_ID() {
			return getRuleContext(Method_IDContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Java_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_functionContext java_function() throws RecognitionException {
		Java_functionContext _localctx = new Java_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_java_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(420);
				match(K_FUNCTION);
				}
			}

			setState(423);
			method_ID();
			setState(424);
			match(OPEN_PAR);
			{
			setState(425);
			parameter_list();
			}
			setState(426);
			match(CLOSE_PAR);
			setState(427);
			match(LBRACE);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
				{
				{
				setState(428);
				method_logic();
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(434);
				return_stmt();
				}
			}

			setState(437);
			match(RBRACE);
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

	public static class Method_logicContext extends ParserRuleContext {
		public Conditional_stmtContext conditional_stmt() {
			return getRuleContext(Conditional_stmtContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Variable_identificationContext variable_identification() {
			return getRuleContext(Variable_identificationContext.class,0);
		}
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public Method_logicContext method_logic() {
			return getRuleContext(Method_logicContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public Method_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMethod_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMethod_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMethod_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_logicContext method_logic() throws RecognitionException {
		Method_logicContext _localctx = new Method_logicContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_logic);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				conditional_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				comments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				java_function_call();
				setState(442);
				match(SCOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				sql_stmt_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				loop_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(446);
				switch_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(447);
				increment();
				setState(448);
				match(SCOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(450);
				logical_expression(0);
				setState(451);
				match(SCOL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				variable_identification();
				setState(454);
				match(SCOL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(456);
				higher_order_function();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(457);
				print();
				setState(458);
				match(SCOL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(460);
				match(LBRACE);
				setState(461);
				method_logic();
				setState(462);
				match(RBRACE);
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
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public Method_logicContext method_logic() {
			return getRuleContext(Method_logicContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
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
		enterRule(_localctx, 26, RULE_comments);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(JAVA_SINGLE_LINE_COMMENT);
				}
				break;
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(MULTILINE_COMMENT);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				match(LBRACE);
				setState(469);
				method_logic();
				setState(470);
				match(RBRACE);
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

	public static class Variable_identificationContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Array_callContext array_call() {
			return getRuleContext(Array_callContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Assignment_operatorContext> assignment_operator() {
			return getRuleContexts(Assignment_operatorContext.class);
		}
		public Assignment_operatorContext assignment_operator(int i) {
			return getRuleContext(Assignment_operatorContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Json_objectContext> json_object() {
			return getRuleContexts(Json_objectContext.class);
		}
		public Json_objectContext json_object(int i) {
			return getRuleContext(Json_objectContext.class,i);
		}
		public List<Array_identificationContext> array_identification() {
			return getRuleContexts(Array_identificationContext.class);
		}
		public Array_identificationContext array_identification(int i) {
			return getRuleContext(Array_identificationContext.class,i);
		}
		public List<Higher_order_functionContext> higher_order_function() {
			return getRuleContexts(Higher_order_functionContext.class);
		}
		public Higher_order_functionContext higher_order_function(int i) {
			return getRuleContext(Higher_order_functionContext.class,i);
		}
		public List<Java_function_callContext> java_function_call() {
			return getRuleContexts(Java_function_callContext.class);
		}
		public Java_function_callContext java_function_call(int i) {
			return getRuleContext(Java_function_callContext.class,i);
		}
		public List<Logical_conditionContext> logical_condition() {
			return getRuleContexts(Logical_conditionContext.class);
		}
		public Logical_conditionContext logical_condition(int i) {
			return getRuleContext(Logical_conditionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public Variable_identificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_identification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVariable_identification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVariable_identification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVariable_identification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_identificationContext variable_identification() throws RecognitionException {
		Variable_identificationContext _localctx = new Variable_identificationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable_identification);
		int _la;
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(475);
					match(K_VAR);
					}
				}

				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(478);
					variable();
					}
					break;
				case 2:
					{
					setState(479);
					array_call();
					}
					break;
				}
				setState(492); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(482);
					assignment_operator();
					setState(490);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(483);
						variable();
						}
						break;
					case 2:
						{
						setState(484);
						signed_number();
						}
						break;
					case 3:
						{
						setState(485);
						json_object();
						}
						break;
					case 4:
						{
						setState(486);
						array_identification();
						}
						break;
					case 5:
						{
						setState(487);
						higher_order_function();
						}
						break;
					case 6:
						{
						setState(488);
						java_function_call();
						}
						break;
					case 7:
						{
						setState(489);
						logical_condition();
						}
						break;
					}
					}
					}
					setState(494); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << AND_ASSIGN) | (1L << OR_ASSIGN) | (1L << XOR_ASSIGN) | (1L << LSHIFT_ASSIGN) | (1L << RSHIFT_ASSIGN) | (1L << URSHIFT_ASSIGN) | (1L << ASSIGN) | (1L << PLUS))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(496);
					match(K_VAR);
					}
				}

				setState(501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(499);
					variable();
					}
					break;
				case 2:
					{
					setState(500);
					array_call();
					}
					break;
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(503);
					match(ASSIGN);
					setState(504);
					sql_stmt_list();
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

	public static class Array_identificationContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SqlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SqlParser.RBRACK, 0); }
		public List<Array_identificationContext> array_identification() {
			return getRuleContexts(Array_identificationContext.class);
		}
		public Array_identificationContext array_identification(int i) {
			return getRuleContext(Array_identificationContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public List<Json_objectContext> json_object() {
			return getRuleContexts(Json_objectContext.class);
		}
		public Json_objectContext json_object(int i) {
			return getRuleContext(Json_objectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
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
		enterRule(_localctx, 30, RULE_array_identification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(LBRACK);
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_CURRENT_DATE - 77)) | (1L << (K_CURRENT_TIME - 77)) | (1L << (K_CURRENT_TIMESTAMP - 77)) | (1L << (K_NOT - 77)) | (1L << (K_NULL - 77)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (K_TRUE - 184)) | (1L << (K_FALSE - 184)) | (1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) {
					{
					{
					setState(517);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(510);
						element();
						}
						break;
					case 2:
						{
						setState(511);
						logical_expression(0);
						}
						break;
					case 3:
						{
						setState(512);
						match(T__18);
						setState(513);
						logical_expression(0);
						setState(514);
						match(T__18);
						}
						break;
					case 4:
						{
						setState(516);
						json_object();
						}
						break;
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(519);
						match(COMMA);
						}
						}
						setState(524);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(530);
					array_identification();
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(531);
						match(COMMA);
						}
						}
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(544);
			match(RBRACK);
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
		public TerminalNode LBRACK() { return getToken(SqlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SqlParser.RBRACK, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
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
		enterRule(_localctx, 32, RULE_array_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			array_name();
			setState(547);
			match(LBRACK);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << INC) | (1L << DEC) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_CURRENT_DATE - 77)) | (1L << (K_CURRENT_TIME - 77)) | (1L << (K_CURRENT_TIMESTAMP - 77)) | (1L << (K_NOT - 77)) | (1L << (K_NULL - 77)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (K_TRUE - 184)) | (1L << (K_FALSE - 184)) | (1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) {
				{
				setState(548);
				logical_expression(0);
				}
			}

			setState(551);
			match(RBRACK);
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
		public TerminalNode DOTS() { return getToken(SqlParser.DOTS, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
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
		enterRule(_localctx, 34, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(IDENTIFIER);
			setState(554);
			match(DOTS);
			setState(555);
			logical_expression(0);
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
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOTS() { return getTokens(SqlParser.DOTS); }
		public TerminalNode DOTS(int i) {
			return getToken(SqlParser.DOTS, i);
		}
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public List<Json_objectContext> json_object() {
			return getRuleContexts(Json_objectContext.class);
		}
		public Json_objectContext json_object(int i) {
			return getRuleContext(Json_objectContext.class,i);
		}
		public List<Array_identificationContext> array_identification() {
			return getRuleContexts(Array_identificationContext.class);
		}
		public Array_identificationContext array_identification(int i) {
			return getRuleContext(Array_identificationContext.class,i);
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
		enterRule(_localctx, 36, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(LBRACE);
			setState(558);
			match(IDENTIFIER);
			setState(559);
			match(DOTS);
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(560);
				logical_expression(0);
				}
				break;
			case 2:
				{
				setState(561);
				match(T__18);
				setState(562);
				logical_expression(0);
				setState(563);
				match(T__18);
				}
				break;
			case 3:
				{
				setState(565);
				match(T__10);
				setState(566);
				logical_expression(0);
				setState(567);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(569);
				json_object();
				}
				break;
			case 5:
				{
				setState(570);
				array_identification();
				}
				break;
			}
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(573);
				match(COMMA);
				setState(574);
				match(IDENTIFIER);
				setState(575);
				match(DOTS);
				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(576);
					logical_expression(0);
					}
					break;
				case 2:
					{
					setState(577);
					match(T__18);
					setState(578);
					logical_expression(0);
					setState(579);
					match(T__18);
					}
					break;
				case 3:
					{
					setState(581);
					match(T__10);
					setState(582);
					logical_expression(0);
					setState(583);
					match(T__10);
					}
					break;
				case 4:
					{
					setState(585);
					json_object();
					}
					break;
				case 5:
					{
					setState(586);
					array_identification();
					}
					break;
				}
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(RBRACE);
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
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<Java_function_callContext> java_function_call() {
			return getRuleContexts(Java_function_callContext.class);
		}
		public Java_function_callContext java_function_call(int i) {
			return getRuleContext(Java_function_callContext.class,i);
		}
		public List<Array_callContext> array_call() {
			return getRuleContexts(Array_callContext.class);
		}
		public Array_callContext array_call(int i) {
			return getRuleContext(Array_callContext.class,i);
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
		enterRule(_localctx, 38, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(K_PRINT);
			setState(597);
			match(OPEN_PAR);
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(598);
				logical_expression(0);
				}
				break;
			case 2:
				{
				setState(599);
				variable();
				}
				break;
			case 3:
				{
				setState(600);
				match(T__18);
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(601);
						logical_expression(0);
						}
						} 
					}
					setState(606);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(607);
				match(T__18);
				}
				break;
			case 4:
				{
				setState(608);
				java_function_call();
				}
				break;
			case 5:
				{
				setState(609);
				array_call();
				}
				break;
			}
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(612);
				match(PLUS);
				setState(624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(613);
					logical_expression(0);
					}
					break;
				case 2:
					{
					setState(614);
					match(T__18);
					setState(618);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(615);
							logical_expression(0);
							}
							} 
						}
						setState(620);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
					}
					setState(621);
					match(T__18);
					}
					break;
				case 3:
					{
					setState(622);
					java_function_call();
					}
					break;
				case 4:
					{
					setState(623);
					array_call();
					}
					break;
				}
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
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

	public static class StringContext extends ParserRuleContext {
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
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
		enterRule(_localctx, 40, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(T__18);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(634);
					logical_expression(0);
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(640);
			match(T__18);
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public TerminalNode INC() { return getToken(SqlParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SqlParser.DEC, 0); }
		public List<Assignment_operatorContext> assignment_operator() {
			return getRuleContexts(Assignment_operatorContext.class);
		}
		public Assignment_operatorContext assignment_operator(int i) {
			return getRuleContext(Assignment_operatorContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logical_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(643);
							variable();
							setState(644);
							match(DOT);
							}
							} 
						}
						setState(650);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
					}
					setState(651);
					variable();
					setState(652);
					match(DOT);
					}
					break;
				}
				setState(656);
				variable();
				}
				break;
			case 2:
				{
				setState(657);
				literal_value();
				}
				break;
			case 3:
				{
				setState(658);
				match(T__18);
				setState(659);
				logical_expression(0);
				setState(660);
				match(T__18);
				}
				break;
			case 4:
				{
				setState(662);
				match(OPEN_PAR);
				setState(663);
				logical_expression(0);
				setState(664);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(666);
				unary_operator();
				setState(667);
				logical_expression(15);
				}
				break;
			case 6:
				{
				setState(669);
				match(K_TRUE);
				}
				break;
			case 7:
				{
				setState(670);
				match(K_FALSE);
				}
				break;
			case 8:
				{
				setState(671);
				java_function_call();
				}
				break;
			case 9:
				{
				setState(672);
				match(INC);
				setState(673);
				logical_expression(4);
				}
				break;
			case 10:
				{
				setState(674);
				match(DEC);
				setState(675);
				logical_expression(2);
				}
				break;
			case 11:
				{
				setState(676);
				variable();
				setState(677);
				assignment_operator();
				setState(680);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(678);
					signed_number();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(679);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(682);
						assignment_operator();
						setState(685);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
						case PLUS:
						case MINUS:
						case NUMERIC_LITERAL:
							{
							setState(683);
							signed_number();
							}
							break;
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(684);
							variable();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(691);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(716);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(694);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(695);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(696);
						logical_expression(15);
						}
						break;
					case 2:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(697);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(698);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(699);
						logical_expression(14);
						}
						break;
					case 3:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(700);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(701);
						_la = _input.LA(1);
						if ( !(_la==LT2 || _la==GT2) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(702);
						logical_expression(13);
						}
						break;
					case 4:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(703);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(704);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(705);
						logical_expression(12);
						}
						break;
					case 5:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(706);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(707);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(708);
						logical_expression(11);
						}
						break;
					case 6:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(709);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(710);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==PIPE2) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(711);
						logical_expression(0);
						}
						}
						break;
					case 7:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(712);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(713);
						match(INC);
						}
						break;
					case 8:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(714);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(715);
						match(DEC);
						}
						break;
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(SqlParser.QUESTION, 0); }
		public TerminalNode DOTS() { return getToken(SqlParser.DOTS, 0); }
		public List<Logical_conditionContext> logical_condition() {
			return getRuleContexts(Logical_conditionContext.class);
		}
		public Logical_conditionContext logical_condition(int i) {
			return getRuleContext(Logical_conditionContext.class,i);
		}
		public List<IncrementContext> increment() {
			return getRuleContexts(IncrementContext.class);
		}
		public IncrementContext increment(int i) {
			return getRuleContext(IncrementContext.class,i);
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
		enterRule(_localctx, 44, RULE_logical_condition);
		int _la;
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				logical_expression(0);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(722);
					match(QUESTION);
					setState(726);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(723);
						logical_condition();
						}
						break;
					case 2:
						{
						setState(724);
						logical_expression(0);
						}
						break;
					case 3:
						{
						setState(725);
						increment();
						}
						break;
					}
					setState(728);
					match(DOTS);
					setState(732);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(729);
						logical_condition();
						}
						break;
					case 2:
						{
						setState(730);
						logical_expression(0);
						}
						break;
					case 3:
						{
						setState(731);
						increment();
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
				setState(736);
				match(OPEN_PAR);
				setState(737);
				logical_condition();
				setState(738);
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
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(SqlParser.INC, 0); }
		public TerminalNode DEC() { return getToken(SqlParser.DEC, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Assignment_operatorContext> assignment_operator() {
			return getRuleContexts(Assignment_operatorContext.class);
		}
		public Assignment_operatorContext assignment_operator(int i) {
			return getRuleContext(Assignment_operatorContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_increment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(742);
				logical_expression(0);
				setState(743);
				match(INC);
				}
				break;
			case 2:
				{
				setState(745);
				match(INC);
				setState(746);
				logical_expression(0);
				}
				break;
			case 3:
				{
				setState(747);
				logical_expression(0);
				setState(748);
				match(DEC);
				}
				break;
			case 4:
				{
				setState(750);
				match(DEC);
				setState(751);
				logical_expression(0);
				}
				break;
			case 5:
				{
				setState(752);
				variable();
				setState(753);
				assignment_operator();
				setState(756);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(754);
					signed_number();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(755);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(758);
						assignment_operator();
						setState(761);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
						case PLUS:
						case MINUS:
						case NUMERIC_LITERAL:
							{
							setState(759);
							signed_number();
							}
							break;
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(760);
							variable();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(767);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(SqlParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(SqlParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(SqlParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(SqlParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(SqlParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(SqlParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(SqlParser.XOR_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(SqlParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(SqlParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(SqlParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
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
		enterRule(_localctx, 48, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_ASSIGN) | (1L << SUB_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << AND_ASSIGN) | (1L << OR_ASSIGN) | (1L << XOR_ASSIGN) | (1L << LSHIFT_ASSIGN) | (1L << RSHIFT_ASSIGN) | (1L << URSHIFT_ASSIGN) | (1L << ASSIGN) | (1L << PLUS))) != 0)) ) {
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
		public List<TerminalNode> K_IF() { return getTokens(SqlParser.K_IF); }
		public TerminalNode K_IF(int i) {
			return getToken(SqlParser.K_IF, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(SqlParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SqlParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SqlParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SqlParser.RBRACE, i);
		}
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
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
		enterRule(_localctx, 50, RULE_conditional_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(K_IF);
			setState(773);
			match(OPEN_PAR);
			setState(774);
			logical_expression(0);
			setState(775);
			match(CLOSE_PAR);
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(776);
					match(LBRACE);
					setState(786);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(780);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
							{
							{
							setState(777);
							method_logic();
							}
							}
							setState(782);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(784);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_RETURN) {
							{
							setState(783);
							return_stmt();
							}
						}

						}
						break;
					}
					setState(788);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(791);
				method_logic();
				}
				break;
			case 3:
				{
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(792);
					return_stmt();
					}
					break;
				}
				}
				break;
			}
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(797);
				match(K_ELSE);
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(798);
					match(K_IF);
					setState(799);
					match(OPEN_PAR);
					setState(800);
					logical_expression(0);
					setState(801);
					match(CLOSE_PAR);
					}
					break;
				}
				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(805);
					method_logic();
					}
					break;
				case 2:
					{
					setState(807);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(806);
						return_stmt();
						}
						break;
					}
					}
					break;
				}
				setState(822);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(811);
					match(LBRACE);
					setState(815);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(812);
							method_logic();
							}
							} 
						}
						setState(817);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					}
					}
					break;
				case RBRACE:
				case K_RETURN:
					{
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_RETURN) {
						{
						setState(818);
						return_stmt();
						}
					}

					setState(821);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Loop_stmtContext extends ParserRuleContext {
		public For_loppContext for_lopp() {
			return getRuleContext(For_loppContext.class,0);
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
		enterRule(_localctx, 52, RULE_loop_stmt);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				for_lopp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				do_while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
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

	public static class For_loppContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
		public For_loppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_lopp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFor_lopp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFor_lopp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFor_lopp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loppContext for_lopp() throws RecognitionException {
		For_loppContext _localctx = new For_loppContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_lopp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(832);
			match(K_FOR);
			setState(833);
			match(OPEN_PAR);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(834);
				match(K_VAR);
				}
			}

			setState(837);
			variable();
			setState(838);
			match(ASSIGN);
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				{
				setState(840); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(839);
					match(NUMERIC_LITERAL);
					}
					}
					setState(842); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERIC_LITERAL );
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(844);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(847);
			match(SCOL);
			setState(848);
			variable();
			setState(849);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(850);
				variable();
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(852); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(851);
					match(NUMERIC_LITERAL);
					}
					}
					setState(854); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERIC_LITERAL );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(858);
			match(SCOL);
			setState(859);
			increment();
			setState(860);
			match(CLOSE_PAR);
			{
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(861);
				method_logic();
				}
				break;
			case 2:
				{
				{
				setState(865);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_BREAK:
					{
					setState(862);
					match(K_BREAK);
					}
					break;
				case K_CONTINUE:
					{
					setState(863);
					match(K_CONTINUE);
					setState(864);
					match(SCOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(867);
					return_stmt();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(870);
				match(LBRACE);
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
					{
					{
					setState(871);
					method_logic();
					}
					}
					setState(876);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK || _la==K_CONTINUE) {
					{
					setState(877);
					_la = _input.LA(1);
					if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(878);
					match(SCOL);
					}
				}

				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RETURN) {
					{
					setState(881);
					return_stmt();
					}
				}

				setState(884);
				match(RBRACE);
				}
				break;
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
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
		enterRule(_localctx, 56, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(887);
			match(K_WHILE);
			setState(888);
			match(OPEN_PAR);
			setState(889);
			logical_expression(0);
			setState(890);
			match(CLOSE_PAR);
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(894);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
				case T__18:
				case INC:
				case DEC:
				case SCOL:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DELETE:
				case K_DETACH:
				case K_DO:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_FOR:
				case K_IF:
				case K_INSERT:
				case K_NOT:
				case K_NULL:
				case K_PRAGMA:
				case K_PRINT:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SWITCH:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_VAR:
				case K_WHILE:
				case K_WITH:
				case K_TRUE:
				case K_FALSE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
				case JAVA_SINGLE_LINE_COMMENT:
				case MULTILINE_COMMENT:
					{
					setState(891);
					method_logic();
					}
					break;
				case K_BREAK:
				case K_CONTINUE:
					{
					{
					setState(892);
					_la = _input.LA(1);
					if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(893);
					match(SCOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(896);
					return_stmt();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(899);
				match(LBRACE);
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
					{
					{
					setState(900);
					method_logic();
					}
					}
					setState(905);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK || _la==K_CONTINUE) {
					{
					setState(906);
					_la = _input.LA(1);
					if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(907);
					match(SCOL);
					}
				}

				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RETURN) {
					{
					setState(910);
					return_stmt();
					}
				}

				setState(913);
				match(RBRACE);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SqlParser.K_DO, 0); }
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
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
		enterRule(_localctx, 58, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(K_DO);
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(920);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
				case T__18:
				case INC:
				case DEC:
				case SCOL:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DELETE:
				case K_DETACH:
				case K_DO:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_FOR:
				case K_IF:
				case K_INSERT:
				case K_NOT:
				case K_NULL:
				case K_PRAGMA:
				case K_PRINT:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SWITCH:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_VAR:
				case K_WHILE:
				case K_WITH:
				case K_TRUE:
				case K_FALSE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
				case JAVA_SINGLE_LINE_COMMENT:
				case MULTILINE_COMMENT:
					{
					setState(917);
					method_logic();
					}
					break;
				case K_BREAK:
				case K_CONTINUE:
					{
					{
					setState(918);
					_la = _input.LA(1);
					if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(919);
					match(SCOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(922);
				match(LBRACE);
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
					{
					{
					setState(923);
					method_logic();
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK || _la==K_CONTINUE) {
					{
					setState(929);
					_la = _input.LA(1);
					if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(930);
					match(SCOL);
					}
				}

				setState(933);
				match(RBRACE);
				}
				break;
			}
			setState(936);
			match(K_WHILE);
			setState(937);
			match(OPEN_PAR);
			setState(938);
			logical_expression(0);
			setState(939);
			match(CLOSE_PAR);
			setState(940);
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
		public TerminalNode DOTS() { return getToken(SqlParser.DOTS, 0); }
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(SqlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SqlParser.RBRACE, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
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
		enterRule(_localctx, 60, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(K_FOR);
			setState(943);
			match(OPEN_PAR);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(944);
				match(K_VAR);
				}
			}

			setState(947);
			variable();
			setState(948);
			match(DOTS);
			setState(949);
			array_name();
			setState(950);
			match(CLOSE_PAR);
			{
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(951);
				method_logic();
				}
				break;
			case 2:
				{
				{
				setState(955);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_BREAK:
					{
					setState(952);
					match(K_BREAK);
					}
					break;
				case K_CONTINUE:
					{
					setState(953);
					match(K_CONTINUE);
					setState(954);
					match(SCOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(957);
					return_stmt();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(960);
				match(LBRACE);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
					{
					{
					setState(961);
					method_logic();
					}
					}
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_BREAK || _la==K_CONTINUE) {
					{
					setState(967);
					_la = _input.LA(1);
					if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(968);
					match(SCOL);
					}
				}

				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RETURN) {
					{
					setState(971);
					return_stmt();
					}
				}

				setState(974);
				match(RBRACE);
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(SqlParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SqlParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SqlParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SqlParser.RBRACE, i);
		}
		public List<TerminalNode> K_CASE() { return getTokens(SqlParser.K_CASE); }
		public TerminalNode K_CASE(int i) {
			return getToken(SqlParser.K_CASE, i);
		}
		public List<TerminalNode> DOTS() { return getTokens(SqlParser.DOTS); }
		public TerminalNode DOTS(int i) {
			return getToken(SqlParser.DOTS, i);
		}
		public TerminalNode K_DEFAULT() { return getToken(SqlParser.K_DEFAULT, 0); }
		public List<Method_logicContext> method_logic() {
			return getRuleContexts(Method_logicContext.class);
		}
		public Method_logicContext method_logic(int i) {
			return getRuleContext(Method_logicContext.class,i);
		}
		public List<TerminalNode> K_BREAK() { return getTokens(SqlParser.K_BREAK); }
		public TerminalNode K_BREAK(int i) {
			return getToken(SqlParser.K_BREAK, i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
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
		enterRule(_localctx, 62, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(K_SWITCH);
			setState(978);
			match(OPEN_PAR);
			setState(979);
			logical_expression(0);
			setState(980);
			match(CLOSE_PAR);
			setState(981);
			match(LBRACE);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(982);
				match(K_CASE);
				{
				setState(983);
				logical_expression(0);
				}
				setState(984);
				match(DOTS);
				setState(1004);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
						{
						setState(985);
						method_logic();
						}
					}

					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(988);
						match(K_BREAK);
						setState(989);
						match(SCOL);
						}
					}

					}
					break;
				case 2:
					{
					setState(992);
					match(LBRACE);
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
						{
						{
						setState(993);
						method_logic();
						}
						}
						setState(998);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(999);
						match(K_BREAK);
						setState(1000);
						match(SCOL);
						}
					}

					setState(1003);
					match(RBRACE);
					}
					break;
				}
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(1011);
				match(K_DEFAULT);
				setState(1012);
				match(DOTS);
				setState(1032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
						{
						setState(1013);
						method_logic();
						}
					}

					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(1016);
						match(K_BREAK);
						setState(1017);
						match(SCOL);
						}
					}

					}
					break;
				case 2:
					{
					setState(1020);
					match(LBRACE);
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << T__18) | (1L << INC) | (1L << DEC) | (1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_COMMIT - 71)) | (1L << (K_CREATE - 71)) | (1L << (K_CURRENT_DATE - 71)) | (1L << (K_CURRENT_TIME - 71)) | (1L << (K_CURRENT_TIMESTAMP - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DETACH - 71)) | (1L << (K_DO - 71)) | (1L << (K_DROP - 71)) | (1L << (K_END - 71)) | (1L << (K_EXPLAIN - 71)) | (1L << (K_FOR - 71)) | (1L << (K_IF - 71)) | (1L << (K_INSERT - 71)) | (1L << (K_NOT - 71)) | (1L << (K_NULL - 71)))) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (K_PRAGMA - 142)) | (1L << (K_PRINT - 142)) | (1L << (K_REINDEX - 142)) | (1L << (K_RELEASE - 142)) | (1L << (K_REPLACE - 142)) | (1L << (K_ROLLBACK - 142)) | (1L << (K_SAVEPOINT - 142)) | (1L << (K_SELECT - 142)) | (1L << (K_SWITCH - 142)) | (1L << (K_UPDATE - 142)) | (1L << (K_VACUUM - 142)) | (1L << (K_VALUES - 142)) | (1L << (K_VAR - 142)) | (1L << (K_WHILE - 142)) | (1L << (K_WITH - 142)) | (1L << (K_TRUE - 142)) | (1L << (K_FALSE - 142)) | (1L << (IDENTIFIER - 142)) | (1L << (NUMERIC_LITERAL - 142)) | (1L << (STRING_LITERAL - 142)) | (1L << (BLOB_LITERAL - 142)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 142)) | (1L << (MULTILINE_COMMENT - 142)))) != 0)) {
						{
						{
						setState(1021);
						method_logic();
						}
						}
						setState(1026);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1029);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_BREAK) {
						{
						setState(1027);
						match(K_BREAK);
						setState(1028);
						match(SCOL);
						}
					}

					setState(1031);
					match(RBRACE);
					}
					break;
				}
				}
			}

			setState(1036);
			match(RBRACE);
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
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SqlParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SqlParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SqlParser.K_PLAN, 0); }
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
		enterRule(_localctx, 64, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(1038);
				match(K_EXPLAIN);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(1039);
					match(K_QUERY);
					setState(1040);
					match(K_PLAN);
					}
				}

				}
			}

			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1045);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(1046);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(1047);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(1048);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(1049);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(1050);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(1051);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(1052);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(1053);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(1054);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(1055);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(1056);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(1057);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(1058);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(1059);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(1060);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(1061);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(1062);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(1063);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(1064);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(1065);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(1066);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(1067);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(1068);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(1069);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(1070);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(1071);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(1072);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(1073);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(1074);
				vacuum_stmt();
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
		public TerminalNode K_ONLY() { return getToken(SqlParser.K_ONLY, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode K_ENABLE() { return getToken(SqlParser.K_ENABLE, 0); }
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(K_ALTER);
			setState(1078);
			match(K_TABLE);
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLY) {
				{
				setState(1079);
				match(K_ONLY);
				}
			}

			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1082);
				database_name();
				setState(1083);
				match(DOT);
				}
				break;
			}
			setState(1087);
			source_table_name();
			setState(1098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1088);
				match(K_RENAME);
				setState(1089);
				match(K_TO);
				setState(1090);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(1091);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(1092);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(1093);
				match(K_ADD);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(1094);
					match(K_COLUMN);
					}
				}

				setState(1097);
				column_def();
				}
				break;
			}
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1100);
				match(K_ENABLE);
				}
				break;
			}
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1103);
				unknown();
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
		enterRule(_localctx, 68, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(K_ADD);
			setState(1107);
			match(K_CONSTRAINT);
			setState(1108);
			any_name();
			setState(1109);
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
		enterRule(_localctx, 70, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			match(K_ADD);
			setState(1112);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SqlParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(K_ANALYZE);
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1115);
				database_name();
				}
				break;
			case 2:
				{
				setState(1116);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(1117);
				database_name();
				setState(1118);
				match(DOT);
				setState(1119);
				table_or_index_name();
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SqlParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			match(K_ATTACH);
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATABASE) {
				{
				setState(1124);
				match(K_DATABASE);
				}
			}

			setState(1127);
			expr(0);
			setState(1128);
			match(K_AS);
			setState(1129);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SqlParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SqlParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SqlParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(K_BEGIN);
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1132);
				_la = _input.LA(1);
				if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (K_DEFERRED - 83)) | (1L << (K_EXCLUSIVE - 83)) | (1L << (K_IMMEDIATE - 83)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1135);
				match(K_TRANSACTION);
				setState(1137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1136);
					transaction_name();
					}
					break;
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SqlParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1142);
				match(K_TRANSACTION);
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1143);
					transaction_name();
					}
					break;
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
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
		public List<TerminalNode> K_UNION() { return getTokens(SqlParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SqlParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SqlParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SqlParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SqlParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SqlParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SqlParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SqlParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_compound_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1148);
				match(K_WITH);
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1149);
					match(K_RECURSIVE);
					}
				}

				setState(1152);
				common_table_expression();
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1153);
					match(COMMA);
					setState(1154);
					common_table_expression();
					}
					}
					setState(1159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1162);
			select_core();
			setState(1172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1169);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_UNION:
						{
						setState(1163);
						match(K_UNION);
						setState(1165);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_ALL) {
							{
							setState(1164);
							match(K_ALL);
							}
						}

						}
						break;
					case K_INTERSECT:
						{
						setState(1167);
						match(K_INTERSECT);
						}
						break;
					case K_EXCEPT:
						{
						setState(1168);
						match(K_EXCEPT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1171);
					select_core();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1174); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1176);
				match(K_ORDER);
				setState(1177);
				match(K_BY);
				setState(1178);
				ordering_term();
				setState(1183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1179);
						match(COMMA);
						setState(1180);
						ordering_term();
						}
						} 
					}
					setState(1185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				}
				break;
			}
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1188);
				match(K_LIMIT);
				setState(1189);
				expr(0);
				setState(1192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1190);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1191);
					expr(0);
					}
					break;
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SqlParser.K_UNIQUE, 0); }
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
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(K_CREATE);
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(1197);
				match(K_UNIQUE);
				}
			}

			setState(1200);
			match(K_INDEX);
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1201);
				match(K_IF);
				setState(1202);
				match(K_NOT);
				setState(1203);
				match(K_EXISTS);
				}
			}

			setState(1209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1206);
				database_name();
				setState(1207);
				match(DOT);
				}
				break;
			}
			setState(1211);
			index_name();
			setState(1212);
			match(K_ON);
			setState(1213);
			table_name();
			setState(1214);
			match(OPEN_PAR);
			setState(1215);
			indexed_column();
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1216);
				match(COMMA);
				setState(1217);
				indexed_column();
				}
				}
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1223);
			match(CLOSE_PAR);
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1224);
				match(K_WHERE);
				setState(1225);
				expr(0);
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
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
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
		public TerminalNode K_WITHOUT() { return getToken(SqlParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 84, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			match(K_CREATE);
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(1229);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1232);
			match(K_TABLE);
			setState(1236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1233);
				match(K_IF);
				setState(1234);
				match(K_NOT);
				setState(1235);
				match(K_EXISTS);
				}
			}

			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1238);
				database_name();
				setState(1239);
				match(DOT);
				}
				break;
			}
			setState(1243);
			table_name();
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(1244);
				match(OPEN_PAR);
				setState(1245);
				column_def();
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(1250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						setState(1246);
						match(COMMA);
						setState(1247);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(1248);
						match(COMMA);
						setState(1249);
						column_def();
						}
						break;
					}
					}
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1255);
				match(CLOSE_PAR);
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1256);
					match(K_WITHOUT);
					setState(1257);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case K_AS:
				{
				setState(1260);
				match(K_AS);
				setState(1261);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1264);
				unknown();
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SqlParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SqlParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SqlParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SqlParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SqlParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SqlParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SqlParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SqlParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SqlParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SqlParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			match(K_CREATE);
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(1268);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1271);
			match(K_TRIGGER);
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1272);
				match(K_IF);
				setState(1273);
				match(K_NOT);
				setState(1274);
				match(K_EXISTS);
				}
			}

			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1277);
				database_name();
				setState(1278);
				match(DOT);
				}
				break;
			}
			setState(1282);
			trigger_name();
			setState(1287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(1283);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(1284);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(1285);
				match(K_INSTEAD);
				setState(1286);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(1303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(1289);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(1290);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(1291);
				match(K_UPDATE);
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(1292);
					match(K_OF);
					setState(1293);
					column_name();
					setState(1298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1294);
						match(COMMA);
						setState(1295);
						column_name();
						}
						}
						setState(1300);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1305);
			match(K_ON);
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1306);
				database_name();
				setState(1307);
				match(DOT);
				}
				break;
			}
			setState(1311);
			table_name();
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(1312);
				match(K_FOR);
				setState(1313);
				match(K_EACH);
				setState(1314);
				match(K_ROW);
				}
			}

			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(1317);
				match(K_WHEN);
				setState(1318);
				expr(0);
				}
			}

			setState(1321);
			match(K_BEGIN);
			setState(1330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1322);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(1323);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(1324);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(1325);
					select_stmt();
					}
					break;
				}
				setState(1328);
				match(SCOL);
				}
				}
				setState(1332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & ((1L << (K_REPLACE - 153)) | (1L << (K_SELECT - 153)) | (1L << (K_UPDATE - 153)) | (1L << (K_VALUES - 153)) | (1L << (K_WITH - 153)))) != 0) );
			setState(1334);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
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
		public TerminalNode K_TEMP() { return getToken(SqlParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SqlParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(K_CREATE);
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(1337);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1340);
			match(K_VIEW);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1341);
				match(K_IF);
				setState(1342);
				match(K_NOT);
				setState(1343);
				match(K_EXISTS);
				}
			}

			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1346);
				database_name();
				setState(1347);
				match(DOT);
				}
				break;
			}
			setState(1351);
			view_name();
			setState(1352);
			match(K_AS);
			setState(1353);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SqlParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SqlParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			match(K_CREATE);
			setState(1356);
			match(K_VIRTUAL);
			setState(1357);
			match(K_TABLE);
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1358);
				match(K_IF);
				setState(1359);
				match(K_NOT);
				setState(1360);
				match(K_EXISTS);
				}
			}

			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1363);
				database_name();
				setState(1364);
				match(DOT);
				}
				break;
			}
			setState(1368);
			table_name();
			setState(1369);
			match(K_USING);
			setState(1370);
			module_name();
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1371);
				match(OPEN_PAR);
				setState(1372);
				module_argument();
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1373);
					match(COMMA);
					setState(1374);
					module_argument();
					}
					}
					setState(1379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1380);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
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
		enterRule(_localctx, 92, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1384);
				with_clause();
				}
			}

			setState(1387);
			match(K_DELETE);
			setState(1388);
			match(K_FROM);
			setState(1389);
			qualified_table_name();
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1390);
				match(K_WHERE);
				setState(1391);
				expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SqlParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SqlParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1394);
				with_clause();
				}
			}

			setState(1397);
			match(K_DELETE);
			setState(1398);
			match(K_FROM);
			setState(1401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(1399);
				qualified_table_name();
				}
				break;
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
				{
				setState(1400);
				sql_stmt_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1403);
				match(K_WHERE);
				setState(1404);
				expr(0);
				}
				break;
			}
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1407);
					match(K_ORDER);
					setState(1408);
					match(K_BY);
					setState(1409);
					ordering_term();
					setState(1414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1410);
						match(COMMA);
						setState(1411);
						ordering_term();
						}
						}
						setState(1416);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1419);
				match(K_LIMIT);
				setState(1420);
				expr(0);
				setState(1423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1421);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1422);
					expr(0);
					}
					break;
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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SqlParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SqlParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_detach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(K_DETACH);
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATABASE) {
				{
				setState(1428);
				match(K_DATABASE);
				}
			}

			setState(1431);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SqlParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_drop_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(K_DROP);
			setState(1434);
			match(K_INDEX);
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1435);
				match(K_IF);
				setState(1436);
				match(K_EXISTS);
				}
			}

			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1439);
				database_name();
				setState(1440);
				match(DOT);
				}
				break;
			}
			setState(1444);
			index_name();
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
		enterRule(_localctx, 100, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(K_DROP);
			setState(1447);
			match(K_TABLE);
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1448);
				match(K_IF);
				setState(1449);
				match(K_EXISTS);
				}
			}

			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SqlParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_drop_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(K_DROP);
			setState(1460);
			match(K_TRIGGER);
			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1461);
				match(K_IF);
				setState(1462);
				match(K_EXISTS);
				}
			}

			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1465);
				database_name();
				setState(1466);
				match(DOT);
				}
				break;
			}
			setState(1470);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SqlParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SqlParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_drop_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(K_DROP);
			setState(1473);
			match(K_VIEW);
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1474);
				match(K_IF);
				setState(1475);
				match(K_EXISTS);
				}
			}

			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1478);
				database_name();
				setState(1479);
				match(DOT);
				}
				break;
			}
			setState(1483);
			view_name();
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
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
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
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1485);
				match(K_WITH);
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1486);
					match(K_RECURSIVE);
					}
				}

				setState(1489);
				common_table_expression();
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1490);
					match(COMMA);
					setState(1491);
					common_table_expression();
					}
					}
					setState(1496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1499);
			select_core();
			setState(1505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1500);
					compound_operator();
					setState(1501);
					select_core();
					}
					} 
				}
				setState(1507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1508);
				match(K_ORDER);
				setState(1509);
				match(K_BY);
				setState(1510);
				ordering_term();
				setState(1515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1511);
						match(COMMA);
						setState(1512);
						ordering_term();
						}
						} 
					}
					setState(1517);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				break;
			}
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1520);
				match(K_LIMIT);
				setState(1521);
				expr(0);
				setState(1524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1522);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1523);
					expr(0);
					}
					break;
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SqlParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SqlParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
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
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1528);
				with_clause();
				}
			}

			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1531);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(1532);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(1533);
				match(K_INSERT);
				setState(1534);
				match(K_OR);
				setState(1535);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1536);
				match(K_INSERT);
				setState(1537);
				match(K_OR);
				setState(1538);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(1539);
				match(K_INSERT);
				setState(1540);
				match(K_OR);
				setState(1541);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(1542);
				match(K_INSERT);
				setState(1543);
				match(K_OR);
				setState(1544);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(1545);
				match(K_INSERT);
				setState(1546);
				match(K_OR);
				setState(1547);
				match(K_IGNORE);
				}
				break;
			}
			setState(1550);
			match(K_INTO);
			setState(1554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1551);
				database_name();
				setState(1552);
				match(DOT);
				}
				break;
			}
			setState(1556);
			table_name();
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1557);
				match(OPEN_PAR);
				setState(1558);
				column_name();
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1559);
					match(COMMA);
					setState(1560);
					column_name();
					}
					}
					setState(1565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1566);
				match(CLOSE_PAR);
				}
			}

			setState(1601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1570);
				match(K_VALUES);
				setState(1571);
				match(OPEN_PAR);
				setState(1572);
				expr(0);
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1573);
					match(COMMA);
					setState(1574);
					expr(0);
					}
					}
					setState(1579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1580);
				match(CLOSE_PAR);
				setState(1595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1581);
						match(COMMA);
						setState(1582);
						match(OPEN_PAR);
						setState(1583);
						expr(0);
						setState(1588);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1584);
							match(COMMA);
							setState(1585);
							expr(0);
							}
							}
							setState(1590);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1591);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1597);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1598);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1599);
				match(K_DEFAULT);
				setState(1600);
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SqlParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			match(K_PRAGMA);
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1604);
				database_name();
				setState(1605);
				match(DOT);
				}
				break;
			}
			setState(1609);
			pragma_name();
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1610);
				match(ASSIGN);
				setState(1611);
				pragma_value();
				}
				break;
			case 2:
				{
				setState(1612);
				match(OPEN_PAR);
				setState(1613);
				pragma_value();
				setState(1614);
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SqlParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			match(K_REINDEX);
			setState(1629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1619);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1620);
					database_name();
					setState(1621);
					match(DOT);
					}
					break;
				}
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1625);
					table_name();
					}
					break;
				case 2:
					{
					setState(1626);
					index_name();
					}
					break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SqlParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_release_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(K_RELEASE);
			setState(1633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SAVEPOINT) {
				{
				setState(1632);
				match(K_SAVEPOINT);
				}
			}

			setState(1635);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SqlParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SqlParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(K_ROLLBACK);
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1638);
				match(K_TRANSACTION);
				setState(1640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1639);
					transaction_name();
					}
					break;
				}
				}
				break;
			}
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1644);
				match(K_TO);
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_SAVEPOINT) {
					{
					setState(1645);
					match(K_SAVEPOINT);
					}
				}

				setState(1648);
				savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SqlParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(K_SAVEPOINT);
			setState(1652);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
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
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_simple_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1654);
				match(K_WITH);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1655);
					match(K_RECURSIVE);
					}
				}

				setState(1658);
				common_table_expression();
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1659);
					match(COMMA);
					setState(1660);
					common_table_expression();
					}
					}
					setState(1665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1668);
			select_core();
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1669);
				match(K_ORDER);
				setState(1670);
				match(K_BY);
				setState(1671);
				ordering_term();
				setState(1676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1672);
						match(COMMA);
						setState(1673);
						ordering_term();
						}
						} 
					}
					setState(1678);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
				}
				}
				break;
			}
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1681);
				match(K_LIMIT);
				setState(1682);
				expr(0);
				setState(1685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1683);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1684);
					expr(0);
					}
					break;
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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
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
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
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
		enterRule(_localctx, 122, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1689);
				match(K_WITH);
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1690);
					match(K_RECURSIVE);
					}
				}

				setState(1693);
				common_table_expression();
				setState(1698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1694);
					match(COMMA);
					setState(1695);
					common_table_expression();
					}
					}
					setState(1700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1703);
			select_or_values();
			setState(1709);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1704);
					compound_operator();
					setState(1705);
					select_or_values();
					}
					} 
				}
				setState(1711);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1712);
				match(K_ORDER);
				setState(1713);
				match(K_BY);
				setState(1714);
				ordering_term();
				setState(1719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1715);
						match(COMMA);
						setState(1716);
						ordering_term();
						}
						} 
					}
					setState(1721);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				}
				}
				break;
			}
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1724);
				match(K_LIMIT);
				setState(1725);
				expr(0);
				setState(1728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1726);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1727);
					expr(0);
					}
					break;
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SqlParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
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
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
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
		enterRule(_localctx, 124, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				match(K_SELECT);
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1733);
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

				{
				setState(1736);
				result_column();
				setState(1741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1737);
						match(COMMA);
						setState(1738);
						result_column();
						}
						} 
					}
					setState(1743);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				}
				}
				setState(1756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1744);
					match(K_FROM);
					setState(1754);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
					case 1:
						{
						setState(1745);
						table_or_subquery();
						setState(1750);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1746);
								match(COMMA);
								setState(1747);
								table_or_subquery();
								}
								} 
							}
							setState(1752);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1753);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1758);
					match(K_WHERE);
					setState(1759);
					expr(0);
					}
					break;
				}
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1762);
					match(K_GROUP);
					setState(1763);
					match(K_BY);
					setState(1764);
					expr(0);
					setState(1769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1765);
							match(COMMA);
							setState(1766);
							expr(0);
							}
							} 
						}
						setState(1771);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
					}
					setState(1774);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
					case 1:
						{
						setState(1772);
						match(K_HAVING);
						setState(1773);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1778);
				match(K_VALUES);
				setState(1779);
				match(OPEN_PAR);
				setState(1780);
				expr(0);
				setState(1785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1781);
					match(COMMA);
					setState(1782);
					expr(0);
					}
					}
					setState(1787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1788);
				match(CLOSE_PAR);
				setState(1803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1789);
						match(COMMA);
						setState(1790);
						match(OPEN_PAR);
						setState(1791);
						expr(0);
						setState(1796);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1792);
							match(COMMA);
							setState(1793);
							expr(0);
							}
							}
							setState(1798);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1799);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1805);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
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
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
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
		enterRule(_localctx, 126, RULE_update_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1808);
				with_clause();
				}
			}

			setState(1811);
			match(K_UPDATE);
			setState(1822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1812);
				match(K_OR);
				setState(1813);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1814);
				match(K_OR);
				setState(1815);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1816);
				match(K_OR);
				setState(1817);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1818);
				match(K_OR);
				setState(1819);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1820);
				match(K_OR);
				setState(1821);
				match(K_IGNORE);
				}
				break;
			}
			setState(1824);
			qualified_table_name();
			setState(1825);
			match(K_SET);
			setState(1826);
			column_name();
			setState(1827);
			match(ASSIGN);
			setState(1828);
			expr(0);
			setState(1836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1829);
					match(COMMA);
					setState(1830);
					column_name();
					setState(1831);
					match(ASSIGN);
					setState(1832);
					expr(0);
					}
					} 
				}
				setState(1838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			setState(1841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1839);
				match(K_WHERE);
				setState(1840);
				expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
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
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SqlParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SqlParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SqlParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_update_stmt_limited);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1843);
				with_clause();
				}
			}

			setState(1846);
			match(K_UPDATE);
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(1847);
				match(K_OR);
				setState(1848);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1849);
				match(K_OR);
				setState(1850);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1851);
				match(K_OR);
				setState(1852);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1853);
				match(K_OR);
				setState(1854);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1855);
				match(K_OR);
				setState(1856);
				match(K_IGNORE);
				}
				break;
			}
			setState(1859);
			qualified_table_name();
			setState(1860);
			match(K_SET);
			setState(1861);
			column_name();
			setState(1862);
			match(ASSIGN);
			setState(1863);
			expr(0);
			setState(1871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1864);
					match(COMMA);
					setState(1865);
					column_name();
					setState(1866);
					match(ASSIGN);
					setState(1867);
					expr(0);
					}
					} 
				}
				setState(1873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			setState(1876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1874);
				match(K_WHERE);
				setState(1875);
				expr(0);
				}
				break;
			}
			setState(1896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1878);
					match(K_ORDER);
					setState(1879);
					match(K_BY);
					setState(1880);
					ordering_term();
					setState(1885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1881);
						match(COMMA);
						setState(1882);
						ordering_term();
						}
						}
						setState(1887);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1890);
				match(K_LIMIT);
				setState(1891);
				expr(0);
				setState(1894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(1892);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1893);
					expr(0);
					}
					break;
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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SqlParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			match(K_VACUUM);
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
		enterRule(_localctx, 132, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			column_name();
			setState(1905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1903);
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
						setState(1901);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(1902);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
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
		enterRule(_localctx, 134, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			name();
			setState(1928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(1909);
				match(OPEN_PAR);
				setState(1910);
				signed_number();
				setState(1912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1911);
					any_name();
					}
				}

				setState(1914);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1916);
				match(OPEN_PAR);
				setState(1917);
				signed_number();
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1918);
					any_name();
					}
				}

				setState(1921);
				match(COMMA);
				setState(1922);
				signed_number();
				setState(1924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1923);
					any_name();
					}
				}

				setState(1926);
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
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
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
		enterRule(_localctx, 136, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1930);
				match(K_CONSTRAINT);
				setState(1931);
				name();
				}
			}

			setState(1948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1934);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1935);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1936);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1937);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1938);
				match(K_UNIQUE);
				setState(1939);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1940);
				match(K_CHECK);
				setState(1941);
				match(OPEN_PAR);
				setState(1942);
				expr(0);
				setState(1943);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1945);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1946);
				match(K_COLLATE);
				setState(1947);
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
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1950);
			match(K_PRIMARY);
			setState(1951);
			match(K_KEY);
			setState(1953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(1952);
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
				break;
			}
			setState(1955);
			conflict_clause();
			setState(1957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(1956);
				match(K_AUTOINCREMENT);
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
		enterRule(_localctx, 140, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
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
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
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
		enterRule(_localctx, 142, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			match(K_NOT);
			setState(1962);
			match(K_NULL);
			setState(1963);
			conflict_clause();
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
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
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
		enterRule(_localctx, 144, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(K_NULL);
			setState(1966);
			conflict_clause();
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
		enterRule(_localctx, 146, RULE_column_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(K_DEFAULT);
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(1969);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1970);
				match(OPEN_PAR);
				setState(1971);
				expr(0);
				setState(1972);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1974);
				match(K_NEXTVAL);
				setState(1975);
				match(OPEN_PAR);
				setState(1976);
				expr(0);
				setState(1977);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1979);
				any_name();
				}
				break;
			}
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(1982);
				match(T__22);
				setState(1984); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1983);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1986); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 148, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(1990);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1991);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SqlParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SqlParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SqlParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(1994);
				match(K_ON);
				setState(1995);
				match(K_CONFLICT);
				setState(1996);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (K_FAIL - 99)) | (1L << (K_IGNORE - 99)) | (1L << (K_REPLACE - 99)) | (1L << (K_ROLLBACK - 99)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SqlParser.BIND_PARAMETER, 0); }
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
		public TerminalNode K_CAST() { return getToken(SqlParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SqlParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SqlParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SqlParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SqlParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SqlParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SqlParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SqlParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
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
		public TerminalNode K_BETWEEN() { return getToken(SqlParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SqlParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SqlParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SqlParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
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
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2000);
				literal_value();
				}
				break;
			case 2:
				{
				setState(2001);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(2010);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2005);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
					case 1:
						{
						setState(2002);
						database_name();
						setState(2003);
						match(DOT);
						}
						break;
					}
					setState(2007);
					table_name();
					setState(2008);
					match(DOT);
					}
					break;
				}
				setState(2012);
				column_name();
				}
				break;
			case 4:
				{
				setState(2013);
				unary_operator();
				setState(2014);
				expr(22);
				}
				break;
			case 5:
				{
				setState(2016);
				function_name();
				setState(2017);
				match(OPEN_PAR);
				setState(2030);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_CASE:
				case K_CAST:
				case K_COMMIT:
				case K_CREATE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DELETE:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_END:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_INSERT:
				case K_NOT:
				case K_NULL:
				case K_PRAGMA:
				case K_RAISE:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(2019);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(2018);
						match(K_DISTINCT);
						}
					}

					setState(2021);
					expr(0);
					setState(2026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2022);
						match(COMMA);
						setState(2023);
						expr(0);
						}
						}
						setState(2028);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(2029);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(2032);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(2034);
				match(OPEN_PAR);
				setState(2035);
				expr(0);
				setState(2036);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(2038);
				match(K_CAST);
				setState(2039);
				match(OPEN_PAR);
				setState(2040);
				expr(0);
				setState(2041);
				match(K_AS);
				setState(2042);
				type_name();
				setState(2043);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(2049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(2046);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(2045);
						match(K_NOT);
						}
					}

					setState(2048);
					match(K_EXISTS);
					}
				}

				setState(2051);
				match(OPEN_PAR);
				setState(2052);
				select_stmt();
				setState(2053);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(2055);
				match(K_CASE);
				setState(2057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_CASE - 66)) | (1L << (K_CAST - 66)) | (1L << (K_COMMIT - 66)) | (1L << (K_CREATE - 66)) | (1L << (K_CURRENT_DATE - 66)) | (1L << (K_CURRENT_TIME - 66)) | (1L << (K_CURRENT_TIMESTAMP - 66)) | (1L << (K_DELETE - 66)) | (1L << (K_DETACH - 66)) | (1L << (K_DROP - 66)) | (1L << (K_END - 66)) | (1L << (K_EXISTS - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_NOT - 131)) | (1L << (K_NULL - 131)) | (1L << (K_PRAGMA - 131)) | (1L << (K_RAISE - 131)) | (1L << (K_REINDEX - 131)) | (1L << (K_RELEASE - 131)) | (1L << (K_REPLACE - 131)) | (1L << (K_ROLLBACK - 131)) | (1L << (K_SAVEPOINT - 131)) | (1L << (K_SELECT - 131)) | (1L << (K_UPDATE - 131)) | (1L << (K_VACUUM - 131)) | (1L << (K_VALUES - 131)) | (1L << (K_WITH - 131)) | (1L << (IDENTIFIER - 131)) | (1L << (NUMERIC_LITERAL - 131)) | (1L << (BIND_PARAMETER - 131)) | (1L << (STRING_LITERAL - 131)) | (1L << (BLOB_LITERAL - 131)))) != 0)) {
					{
					setState(2056);
					expr(0);
					}
				}

				setState(2064); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2059);
					match(K_WHEN);
					setState(2060);
					expr(0);
					setState(2061);
					match(K_THEN);
					setState(2062);
					expr(0);
					}
					}
					setState(2066); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(2070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(2068);
					match(K_ELSE);
					setState(2069);
					expr(0);
					}
				}

				setState(2072);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(2074);
				raise_function();
				}
				break;
			case 11:
				{
				setState(2075);
				sql_stmt_list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2078);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(2079);
						match(PIPE2);
						setState(2080);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2081);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2082);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2083);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2084);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2085);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2086);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2087);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2088);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2089);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2090);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2091);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2092);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2093);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2106);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
						case 1:
							{
							setState(2094);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(2095);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(2096);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(2097);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(2098);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(2099);
							match(K_IS);
							setState(2100);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(2101);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(2102);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(2103);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(2104);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(2105);
							match(K_REGEXP);
							}
							break;
						}
						setState(2108);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2109);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2110);
						match(K_AND);
						setState(2111);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2112);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2113);
						match(K_OR);
						setState(2114);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2115);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2116);
						match(K_IS);
						setState(2118);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
						case 1:
							{
							setState(2117);
							match(K_NOT);
							}
							break;
						}
						setState(2120);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2121);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2123);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(2122);
							match(K_NOT);
							}
						}

						setState(2125);
						match(K_BETWEEN);
						setState(2126);
						expr(0);
						setState(2127);
						match(K_AND);
						setState(2128);
						expr(7);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2130);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2131);
						match(K_COLLATE);
						setState(2132);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2133);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2135);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(2134);
							match(K_NOT);
							}
						}

						setState(2137);
						_la = _input.LA(1);
						if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (K_GLOB - 105)) | (1L << (K_LIKE - 105)) | (1L << (K_MATCH - 105)) | (1L << (K_REGEXP - 105)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2138);
						expr(0);
						setState(2141);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
						case 1:
							{
							setState(2139);
							match(K_ESCAPE);
							setState(2140);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2143);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2148);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(2144);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(2145);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(2146);
							match(K_NOT);
							setState(2147);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2152);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(2151);
							match(K_NOT);
							}
						}

						setState(2154);
						match(K_IN);
						setState(2174);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
						case 1:
							{
							setState(2155);
							match(OPEN_PAR);
							setState(2165);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
							case 1:
								{
								setState(2156);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(2157);
								expr(0);
								setState(2162);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(2158);
									match(COMMA);
									setState(2159);
									expr(0);
									}
									}
									setState(2164);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(2167);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(2171);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
							case 1:
								{
								setState(2168);
								database_name();
								setState(2169);
								match(DOT);
								}
								break;
							}
							setState(2173);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
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
		enterRule(_localctx, 154, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2181);
			match(K_REFERENCES);
			setState(2185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2182);
				database_name();
				setState(2183);
				match(DOT);
				}
				break;
			}
			setState(2187);
			foreign_table();
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2188);
				match(OPEN_PAR);
				setState(2189);
				fk_target_column_name();
				setState(2194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2190);
					match(COMMA);
					setState(2191);
					fk_target_column_name();
					}
					}
					setState(2196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2197);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(2219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2215);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(2201);
						match(K_ON);
						setState(2202);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2211);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
						case 1:
							{
							setState(2203);
							match(K_SET);
							setState(2204);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(2205);
							match(K_SET);
							setState(2206);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(2207);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(2208);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(2209);
							match(K_NO);
							setState(2210);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(2213);
						match(K_MATCH);
						setState(2214);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			setState(2235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2222);
					match(K_NOT);
					}
				}

				setState(2225);
				match(K_DEFERRABLE);
				setState(2230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2226);
					match(K_INITIALLY);
					setState(2227);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(2228);
					match(K_INITIALLY);
					setState(2229);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2232);
					match(K_ENABLE);
					}
					break;
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
		enterRule(_localctx, 156, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SqlParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SqlParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SqlParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SqlParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SqlParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			match(K_RAISE);
			setState(2240);
			match(OPEN_PAR);
			setState(2245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(2241);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(2242);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2243);
				match(COMMA);
				setState(2244);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2247);
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
		enterRule(_localctx, 160, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			column_name();
			setState(2252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(2250);
				match(K_COLLATE);
				setState(2251);
				collation_name();
				}
			}

			setState(2255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(2254);
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
		enterRule(_localctx, 162, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(2257);
				match(K_CONSTRAINT);
				setState(2258);
				name();
				}
			}

			setState(2270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(2261);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(2262);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(2263);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(2264);
				match(K_CHECK);
				setState(2265);
				match(OPEN_PAR);
				setState(2266);
				expr(0);
				setState(2267);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(2269);
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
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
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
		enterRule(_localctx, 164, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			match(K_PRIMARY);
			setState(2273);
			match(K_KEY);
			setState(2274);
			match(OPEN_PAR);
			setState(2275);
			indexed_column();
			setState(2280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2276);
				match(COMMA);
				setState(2277);
				indexed_column();
				}
				}
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2283);
			match(CLOSE_PAR);
			setState(2284);
			conflict_clause();
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
		enterRule(_localctx, 166, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2286);
			match(K_FOREIGN);
			setState(2287);
			match(K_KEY);
			setState(2288);
			match(OPEN_PAR);
			setState(2289);
			fk_origin_column_name();
			setState(2294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2290);
				match(COMMA);
				setState(2291);
				fk_origin_column_name();
				}
				}
				setState(2296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2297);
			match(CLOSE_PAR);
			setState(2298);
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
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
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
		enterRule(_localctx, 168, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			match(K_UNIQUE);
			setState(2302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(2301);
				match(K_KEY);
				}
			}

			setState(2305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2304);
				name();
				}
				break;
			}
			setState(2307);
			match(OPEN_PAR);
			setState(2308);
			indexed_column();
			setState(2313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2309);
				match(COMMA);
				setState(2310);
				indexed_column();
				}
				}
				setState(2315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2316);
			match(CLOSE_PAR);
			setState(2317);
			conflict_clause();
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
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
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
		enterRule(_localctx, 170, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			match(K_KEY);
			setState(2321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2320);
				name();
				}
				break;
			}
			setState(2323);
			match(OPEN_PAR);
			setState(2324);
			indexed_column();
			setState(2329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2325);
				match(COMMA);
				setState(2326);
				indexed_column();
				}
				}
				setState(2331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2332);
			match(CLOSE_PAR);
			setState(2333);
			conflict_clause();
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
		enterRule(_localctx, 172, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SqlParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SqlParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SqlParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SqlParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SqlParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SqlParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SqlParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SqlParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			match(K_WITH);
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RECURSIVE) {
				{
				setState(2338);
				match(K_RECURSIVE);
				}
			}

			setState(2341);
			cte_table_name();
			setState(2342);
			match(K_AS);
			setState(2343);
			match(OPEN_PAR);
			setState(2344);
			select_stmt();
			setState(2345);
			match(CLOSE_PAR);
			setState(2355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2346);
				match(COMMA);
				setState(2347);
				cte_table_name();
				setState(2348);
				match(K_AS);
				setState(2349);
				match(OPEN_PAR);
				setState(2350);
				select_stmt();
				setState(2351);
				match(CLOSE_PAR);
				}
				}
				setState(2357);
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
		enterRule(_localctx, 176, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				setState(2358);
				database_name();
				setState(2359);
				match(DOT);
				}
				break;
			}
			setState(2363);
			table_name();
			setState(2369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				{
				setState(2364);
				match(K_INDEXED);
				setState(2365);
				match(K_BY);
				setState(2366);
				index_name();
				}
				break;
			case 2:
				{
				setState(2367);
				match(K_NOT);
				setState(2368);
				match(K_INDEXED);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SqlParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
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
		enterRule(_localctx, 178, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			expr(0);
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2372);
				match(K_COLLATE);
				setState(2373);
				collation_name();
				}
				break;
			}
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2376);
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
		enterRule(_localctx, 180, RULE_pragma_value);
		try {
			setState(2382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2379);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2381);
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
		enterRule(_localctx, 182, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			table_name();
			setState(2396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2385);
				match(OPEN_PAR);
				setState(2386);
				column_name();
				setState(2391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2387);
					match(COMMA);
					setState(2388);
					column_name();
					}
					}
					setState(2393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2394);
				match(CLOSE_PAR);
				}
			}

			setState(2398);
			match(K_AS);
			setState(2399);
			match(OPEN_PAR);
			setState(2400);
			select_stmt();
			setState(2401);
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
		enterRule(_localctx, 184, RULE_result_column);
		int _la;
		try {
			setState(2415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2404);
				table_name();
				setState(2405);
				match(DOT);
				setState(2406);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2408);
				expr(0);
				setState(2413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2409);
						match(K_AS);
						}
					}

					setState(2412);
					column_alias();
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
		enterRule(_localctx, 186, RULE_table_or_subquery);
		int _la;
		try {
			setState(2464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2417);
					database_name();
					setState(2418);
					match(DOT);
					}
					break;
				}
				setState(2422);
				table_name();
				setState(2427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2423);
						match(K_AS);
						}
					}

					setState(2426);
					table_alias();
					}
					break;
				}
				setState(2434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
				case 1:
					{
					setState(2429);
					match(K_INDEXED);
					setState(2430);
					match(K_BY);
					setState(2431);
					index_name();
					}
					break;
				case 2:
					{
					setState(2432);
					match(K_NOT);
					setState(2433);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2436);
				match(OPEN_PAR);
				setState(2446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(2437);
					table_or_subquery();
					setState(2442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2438);
						match(COMMA);
						setState(2439);
						table_or_subquery();
						}
						}
						setState(2444);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2445);
					join_clause();
					}
					break;
				}
				setState(2448);
				match(CLOSE_PAR);
				setState(2453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2450);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2449);
						match(K_AS);
						}
					}

					setState(2452);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2455);
				match(OPEN_PAR);
				setState(2456);
				select_stmt();
				setState(2457);
				match(CLOSE_PAR);
				setState(2462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
				case 1:
					{
					setState(2459);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2458);
						match(K_AS);
						}
					}

					setState(2461);
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
		enterRule(_localctx, 188, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			table_or_subquery();
			setState(2473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2467);
					join_operator();
					setState(2468);
					table_or_subquery();
					setState(2469);
					join_constraint();
					}
					} 
				}
				setState(2475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
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
		public TerminalNode K_NATURAL() { return getToken(SqlParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SqlParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SqlParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SqlParser.K_CROSS, 0); }
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
		enterRule(_localctx, 190, RULE_join_operator);
		int _la;
		try {
			setState(2489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2476);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(2477);
					match(K_NATURAL);
					}
				}

				setState(2486);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(2480);
					match(K_LEFT);
					setState(2482);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(2481);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(2484);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(2485);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(2488);
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
		public TerminalNode K_USING() { return getToken(SqlParser.K_USING, 0); }
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
		enterRule(_localctx, 192, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
			case 1:
				{
				setState(2491);
				match(K_ON);
				setState(2492);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2493);
				match(K_USING);
				setState(2494);
				match(OPEN_PAR);
				setState(2495);
				column_name();
				setState(2500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2496);
					match(COMMA);
					setState(2497);
					column_name();
					}
					}
					setState(2502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2503);
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
		enterRule(_localctx, 194, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(2581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2507);
				match(K_SELECT);
				setState(2509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(2508);
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

				setState(2511);
				result_column();
				setState(2516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2512);
						match(COMMA);
						setState(2513);
						result_column();
						}
						} 
					}
					setState(2518);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,362,_ctx);
				}
				setState(2531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2519);
					match(K_FROM);
					setState(2529);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
					case 1:
						{
						setState(2520);
						table_or_subquery();
						setState(2525);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2521);
								match(COMMA);
								setState(2522);
								table_or_subquery();
								}
								} 
							}
							setState(2527);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,363,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(2528);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(2535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2533);
					match(K_WHERE);
					setState(2534);
					expr(0);
					}
					break;
				}
				setState(2551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
				case 1:
					{
					setState(2537);
					match(K_GROUP);
					setState(2538);
					match(K_BY);
					setState(2539);
					expr(0);
					setState(2544);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2540);
							match(COMMA);
							setState(2541);
							expr(0);
							}
							} 
						}
						setState(2546);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,367,_ctx);
					}
					setState(2549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
					case 1:
						{
						setState(2547);
						match(K_HAVING);
						setState(2548);
						expr(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(2553);
				match(K_VALUES);
				setState(2554);
				match(OPEN_PAR);
				setState(2555);
				expr(0);
				setState(2560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2556);
					match(COMMA);
					setState(2557);
					expr(0);
					}
					}
					setState(2562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2563);
				match(CLOSE_PAR);
				setState(2578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2564);
						match(COMMA);
						setState(2565);
						match(OPEN_PAR);
						setState(2566);
						expr(0);
						setState(2571);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(2567);
							match(COMMA);
							setState(2568);
							expr(0);
							}
							}
							setState(2573);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2574);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(2580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,372,_ctx);
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SqlParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SqlParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SqlParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SqlParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_compound_operator);
		try {
			setState(2588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2583);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2584);
				match(K_UNION);
				setState(2585);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2586);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2587);
				match(K_EXCEPT);
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
		enterRule(_localctx, 198, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			table_name();
			setState(2602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2591);
				match(OPEN_PAR);
				setState(2592);
				column_name();
				setState(2597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2593);
					match(COMMA);
					setState(2594);
					column_name();
					}
					}
					setState(2599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2600);
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
		enterRule(_localctx, 200, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(2605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2604);
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

				setState(2607);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(2608);
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
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SqlParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SqlParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SqlParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SqlParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SqlParser.K_CURRENT_TIMESTAMP, 0); }
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
		enterRule(_localctx, 202, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2611);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_CURRENT_DATE - 77)) | (1L << (K_CURRENT_TIME - 77)) | (1L << (K_CURRENT_TIMESTAMP - 77)) | (1L << (K_NULL - 77)))) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (IDENTIFIER - 186)) | (1L << (NUMERIC_LITERAL - 186)) | (1L << (STRING_LITERAL - 186)) | (1L << (BLOB_LITERAL - 186)))) != 0)) ) {
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
		enterRule(_localctx, 204, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613);
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
		enterRule(_localctx, 206, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
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
		enterRule(_localctx, 208, RULE_module_argument);
		try {
			setState(2619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2617);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2618);
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
		enterRule(_localctx, 210, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2621);
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
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
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
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public TerminalNode K_WHEN() { return getToken(SqlParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode K_WHILE() { return getToken(SqlParser.K_WHILE, 0); }
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
		enterRule(_localctx, 212, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2623);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NATURAL - 128)) | (1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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
		enterRule(_localctx, 214, RULE_unknown);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2626); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2625);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2628); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 216, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630);
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
		enterRule(_localctx, 218, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2632);
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
		enterRule(_localctx, 220, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2634);
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
		enterRule(_localctx, 222, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2636);
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
		enterRule(_localctx, 224, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
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
		enterRule(_localctx, 226, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2640);
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
		enterRule(_localctx, 228, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2642);
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
		enterRule(_localctx, 230, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2644);
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
		enterRule(_localctx, 232, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2646);
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
		enterRule(_localctx, 234, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2648);
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
		enterRule(_localctx, 236, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2650);
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
		enterRule(_localctx, 238, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
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
		enterRule(_localctx, 240, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2654);
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
		enterRule(_localctx, 242, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2656);
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
		enterRule(_localctx, 244, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
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
		enterRule(_localctx, 246, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
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
		enterRule(_localctx, 248, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
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
		enterRule(_localctx, 250, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2664);
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
		enterRule(_localctx, 252, RULE_method_ID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
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

	public static class VariableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
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
		enterRule(_localctx, 254, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2668);
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
		enterRule(_localctx, 256, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2670);
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
		enterRule(_localctx, 258, RULE_any_name);
		try {
			setState(2678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2672);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2673);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2674);
				match(OPEN_PAR);
				setState(2675);
				any_name();
				setState(2676);
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
		case 21:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 76:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 21);
		case 9:
			return precpred(_ctx, 20);
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 15);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 10);
		case 19:
			return precpred(_ctx, 9);
		case 20:
			return precpred(_ctx, 8);
		case 21:
			return precpred(_ctx, 5);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c6\u0a7b\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\3\2\3\2\7\2\u0109\n\2"+
		"\f\2\16\2\u010c\13\2\3\2\3\2\5\2\u0110\n\2\3\3\3\3\3\3\3\4\7\4\u0116\n"+
		"\4\f\4\16\4\u0119\13\4\3\4\3\4\6\4\u011d\n\4\r\4\16\4\u011e\3\4\7\4\u0122"+
		"\n\4\f\4\16\4\u0125\13\4\3\4\7\4\u0128\n\4\f\4\16\4\u012b\13\4\3\5\3\5"+
		"\3\5\3\5\5\5\u0131\n\5\3\5\3\5\7\5\u0135\n\5\f\5\16\5\u0138\13\5\3\5\5"+
		"\5\u013b\n\5\3\5\3\5\3\5\5\5\u0140\n\5\3\5\3\5\5\5\u0144\n\5\3\5\5\5\u0147"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0150\n\7\3\7\3\7\3\7\7\7\u0155\n"+
		"\7\f\7\16\7\u0158\13\7\3\7\5\7\u015b\n\7\3\7\3\7\3\7\7\7\u0160\n\7\f\7"+
		"\16\7\u0163\13\7\5\7\u0165\n\7\3\b\3\b\5\b\u0169\n\b\3\b\3\b\3\b\5\b\u016e"+
		"\n\b\7\b\u0170\n\b\f\b\16\b\u0173\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u017a\n"+
		"\t\3\n\3\n\3\n\5\n\u017f\n\n\3\n\5\n\u0182\n\n\3\n\3\n\3\n\5\n\u0187\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0191\n\13\f\13\16\13\u0194"+
		"\13\13\3\13\5\13\u0197\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u01a3\n\f\3\f\3\f\3\r\5\r\u01a8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01b0"+
		"\n\r\f\r\16\r\u01b3\13\r\3\r\5\r\u01b6\n\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01d3\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u01db\n\17\3\20\3\20\5\20\u01df\n\20\3\20\3\20\5\20\u01e3"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01ed\n\20\6\20\u01ef"+
		"\n\20\r\20\16\20\u01f0\3\20\5\20\u01f4\n\20\3\20\3\20\5\20\u01f8\n\20"+
		"\3\20\3\20\5\20\u01fc\n\20\5\20\u01fe\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0208\n\21\3\21\7\21\u020b\n\21\f\21\16\21\u020e\13"+
		"\21\7\21\u0210\n\21\f\21\16\21\u0213\13\21\3\21\3\21\7\21\u0217\n\21\f"+
		"\21\16\21\u021a\13\21\7\21\u021c\n\21\f\21\16\21\u021f\13\21\5\21\u0221"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u0228\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u023e\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u024e\n\24\7\24\u0250\n\24\f\24\16\24\u0253"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u025d\n\25\f\25\16"+
		"\25\u0260\13\25\3\25\3\25\3\25\5\25\u0265\n\25\3\25\3\25\3\25\3\25\7\25"+
		"\u026b\n\25\f\25\16\25\u026e\13\25\3\25\3\25\3\25\5\25\u0273\n\25\7\25"+
		"\u0275\n\25\f\25\16\25\u0278\13\25\3\25\3\25\3\26\3\26\7\26\u027e\n\26"+
		"\f\26\16\26\u0281\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0289\n\27"+
		"\f\27\16\27\u028c\13\27\3\27\3\27\3\27\5\27\u0291\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02ab\n\27\3\27\3\27\3\27\5\27"+
		"\u02b0\n\27\7\27\u02b2\n\27\f\27\16\27\u02b5\13\27\5\27\u02b7\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u02cf\n\27\f\27\16\27\u02d2\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\5\30\u02d9\n\30\3\30\3\30\3\30\3\30\5\30"+
		"\u02df\n\30\5\30\u02e1\n\30\3\30\3\30\3\30\3\30\5\30\u02e7\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02f7"+
		"\n\31\3\31\3\31\3\31\5\31\u02fc\n\31\7\31\u02fe\n\31\f\31\16\31\u0301"+
		"\13\31\5\31\u0303\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u030d"+
		"\n\33\f\33\16\33\u0310\13\33\3\33\5\33\u0313\n\33\5\33\u0315\n\33\3\33"+
		"\5\33\u0318\n\33\3\33\3\33\5\33\u031c\n\33\5\33\u031e\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0326\n\33\3\33\3\33\5\33\u032a\n\33\5\33\u032c"+
		"\n\33\3\33\3\33\7\33\u0330\n\33\f\33\16\33\u0333\13\33\3\33\5\33\u0336"+
		"\n\33\3\33\5\33\u0339\n\33\5\33\u033b\n\33\3\34\3\34\3\34\3\34\5\34\u0341"+
		"\n\34\3\35\3\35\3\35\5\35\u0346\n\35\3\35\3\35\3\35\6\35\u034b\n\35\r"+
		"\35\16\35\u034c\3\35\5\35\u0350\n\35\3\35\3\35\3\35\3\35\3\35\6\35\u0357"+
		"\n\35\r\35\16\35\u0358\5\35\u035b\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0364\n\35\3\35\5\35\u0367\n\35\3\35\3\35\7\35\u036b\n\35\f\35"+
		"\16\35\u036e\13\35\3\35\3\35\5\35\u0372\n\35\3\35\5\35\u0375\n\35\3\35"+
		"\5\35\u0378\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0381\n\36\3"+
		"\36\5\36\u0384\n\36\3\36\3\36\7\36\u0388\n\36\f\36\16\36\u038b\13\36\3"+
		"\36\3\36\5\36\u038f\n\36\3\36\5\36\u0392\n\36\3\36\5\36\u0395\n\36\3\37"+
		"\3\37\3\37\3\37\5\37\u039b\n\37\3\37\3\37\7\37\u039f\n\37\f\37\16\37\u03a2"+
		"\13\37\3\37\3\37\5\37\u03a6\n\37\3\37\5\37\u03a9\n\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \5 \u03b4\n \3 \3 \3 \3 \3 \3 \3 \3 \5 \u03be\n"+
		" \3 \5 \u03c1\n \3 \3 \7 \u03c5\n \f \16 \u03c8\13 \3 \3 \5 \u03cc\n "+
		"\3 \5 \u03cf\n \3 \5 \u03d2\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u03dd\n!"+
		"\3!\3!\5!\u03e1\n!\3!\3!\7!\u03e5\n!\f!\16!\u03e8\13!\3!\3!\5!\u03ec\n"+
		"!\3!\5!\u03ef\n!\7!\u03f1\n!\f!\16!\u03f4\13!\3!\3!\3!\5!\u03f9\n!\3!"+
		"\3!\5!\u03fd\n!\3!\3!\7!\u0401\n!\f!\16!\u0404\13!\3!\3!\5!\u0408\n!\3"+
		"!\5!\u040b\n!\5!\u040d\n!\3!\3!\3\"\3\"\3\"\5\"\u0414\n\"\5\"\u0416\n"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0436\n\"\3#"+
		"\3#\3#\5#\u043b\n#\3#\3#\3#\5#\u0440\n#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u044a"+
		"\n#\3#\5#\u044d\n#\3#\5#\u0450\n#\3#\5#\u0453\n#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3&\5&\u0464\n&\3\'\3\'\5\'\u0468\n\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\5(\u0470\n(\3(\3(\5(\u0474\n(\5(\u0476\n(\3)\3)\3)\5)\u047b"+
		"\n)\5)\u047d\n)\3*\3*\5*\u0481\n*\3*\3*\3*\7*\u0486\n*\f*\16*\u0489\13"+
		"*\5*\u048b\n*\3*\3*\3*\5*\u0490\n*\3*\3*\5*\u0494\n*\3*\6*\u0497\n*\r"+
		"*\16*\u0498\3*\3*\3*\3*\3*\7*\u04a0\n*\f*\16*\u04a3\13*\5*\u04a5\n*\3"+
		"*\3*\3*\3*\5*\u04ab\n*\5*\u04ad\n*\3+\3+\5+\u04b1\n+\3+\3+\3+\3+\5+\u04b7"+
		"\n+\3+\3+\3+\5+\u04bc\n+\3+\3+\3+\3+\3+\3+\3+\7+\u04c5\n+\f+\16+\u04c8"+
		"\13+\3+\3+\3+\5+\u04cd\n+\3,\3,\5,\u04d1\n,\3,\3,\3,\3,\5,\u04d7\n,\3"+
		",\3,\3,\5,\u04dc\n,\3,\3,\3,\3,\3,\3,\3,\7,\u04e5\n,\f,\16,\u04e8\13,"+
		"\3,\3,\3,\5,\u04ed\n,\3,\3,\5,\u04f1\n,\3,\5,\u04f4\n,\3-\3-\5-\u04f8"+
		"\n-\3-\3-\3-\3-\5-\u04fe\n-\3-\3-\3-\5-\u0503\n-\3-\3-\3-\3-\3-\5-\u050a"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\7-\u0513\n-\f-\16-\u0516\13-\5-\u0518\n-\5-\u051a"+
		"\n-\3-\3-\3-\3-\5-\u0520\n-\3-\3-\3-\3-\5-\u0526\n-\3-\3-\5-\u052a\n-"+
		"\3-\3-\3-\3-\3-\5-\u0531\n-\3-\3-\6-\u0535\n-\r-\16-\u0536\3-\3-\3.\3"+
		".\5.\u053d\n.\3.\3.\3.\3.\5.\u0543\n.\3.\3.\3.\5.\u0548\n.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\5/\u0554\n/\3/\3/\3/\5/\u0559\n/\3/\3/\3/\3/\3/\3"+
		"/\3/\7/\u0562\n/\f/\16/\u0565\13/\3/\3/\5/\u0569\n/\3\60\5\60\u056c\n"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u0573\n\60\3\61\5\61\u0576\n\61\3\61"+
		"\3\61\3\61\3\61\5\61\u057c\n\61\3\61\3\61\5\61\u0580\n\61\3\61\3\61\3"+
		"\61\3\61\3\61\7\61\u0587\n\61\f\61\16\61\u058a\13\61\5\61\u058c\n\61\3"+
		"\61\3\61\3\61\3\61\5\61\u0592\n\61\5\61\u0594\n\61\3\62\3\62\5\62\u0598"+
		"\n\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u05a0\n\63\3\63\3\63\3\63\5\63"+
		"\u05a5\n\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u05ad\n\64\3\64\3\64\3"+
		"\64\5\64\u05b2\n\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u05ba\n\65\3\65"+
		"\3\65\3\65\5\65\u05bf\n\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u05c7\n"+
		"\66\3\66\3\66\3\66\5\66\u05cc\n\66\3\66\3\66\3\67\3\67\5\67\u05d2\n\67"+
		"\3\67\3\67\3\67\7\67\u05d7\n\67\f\67\16\67\u05da\13\67\5\67\u05dc\n\67"+
		"\3\67\3\67\3\67\3\67\7\67\u05e2\n\67\f\67\16\67\u05e5\13\67\3\67\3\67"+
		"\3\67\3\67\3\67\7\67\u05ec\n\67\f\67\16\67\u05ef\13\67\5\67\u05f1\n\67"+
		"\3\67\3\67\3\67\3\67\5\67\u05f7\n\67\5\67\u05f9\n\67\38\58\u05fc\n8\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u060f\n8\38\38\3"+
		"8\38\58\u0615\n8\38\38\38\38\38\78\u061c\n8\f8\168\u061f\138\38\38\58"+
		"\u0623\n8\38\38\38\38\38\78\u062a\n8\f8\168\u062d\138\38\38\38\38\38\3"+
		"8\78\u0635\n8\f8\168\u0638\138\38\38\78\u063c\n8\f8\168\u063f\138\38\3"+
		"8\38\58\u0644\n8\39\39\39\39\59\u064a\n9\39\39\39\39\39\39\39\59\u0653"+
		"\n9\3:\3:\3:\3:\3:\5:\u065a\n:\3:\3:\5:\u065e\n:\5:\u0660\n:\3;\3;\5;"+
		"\u0664\n;\3;\3;\3<\3<\3<\5<\u066b\n<\5<\u066d\n<\3<\3<\5<\u0671\n<\3<"+
		"\5<\u0674\n<\3=\3=\3=\3>\3>\5>\u067b\n>\3>\3>\3>\7>\u0680\n>\f>\16>\u0683"+
		"\13>\5>\u0685\n>\3>\3>\3>\3>\3>\3>\7>\u068d\n>\f>\16>\u0690\13>\5>\u0692"+
		"\n>\3>\3>\3>\3>\5>\u0698\n>\5>\u069a\n>\3?\3?\5?\u069e\n?\3?\3?\3?\7?"+
		"\u06a3\n?\f?\16?\u06a6\13?\5?\u06a8\n?\3?\3?\3?\3?\7?\u06ae\n?\f?\16?"+
		"\u06b1\13?\3?\3?\3?\3?\3?\7?\u06b8\n?\f?\16?\u06bb\13?\5?\u06bd\n?\3?"+
		"\3?\3?\3?\5?\u06c3\n?\5?\u06c5\n?\3@\3@\5@\u06c9\n@\3@\3@\3@\7@\u06ce"+
		"\n@\f@\16@\u06d1\13@\3@\3@\3@\3@\7@\u06d7\n@\f@\16@\u06da\13@\3@\5@\u06dd"+
		"\n@\5@\u06df\n@\3@\3@\5@\u06e3\n@\3@\3@\3@\3@\3@\7@\u06ea\n@\f@\16@\u06ed"+
		"\13@\3@\3@\5@\u06f1\n@\5@\u06f3\n@\3@\3@\3@\3@\3@\7@\u06fa\n@\f@\16@\u06fd"+
		"\13@\3@\3@\3@\3@\3@\3@\7@\u0705\n@\f@\16@\u0708\13@\3@\3@\7@\u070c\n@"+
		"\f@\16@\u070f\13@\5@\u0711\n@\3A\5A\u0714\nA\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\5A\u0721\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u072d\nA\fA\16A\u0730"+
		"\13A\3A\3A\5A\u0734\nA\3B\5B\u0737\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\5B\u0744\nB\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\7B\u0750\nB\fB\16B\u0753\13"+
		"B\3B\3B\5B\u0757\nB\3B\3B\3B\3B\3B\7B\u075e\nB\fB\16B\u0761\13B\5B\u0763"+
		"\nB\3B\3B\3B\3B\5B\u0769\nB\5B\u076b\nB\3C\3C\3D\3D\3D\7D\u0772\nD\fD"+
		"\16D\u0775\13D\3E\3E\3E\3E\5E\u077b\nE\3E\3E\3E\3E\3E\5E\u0782\nE\3E\3"+
		"E\3E\5E\u0787\nE\3E\3E\5E\u078b\nE\3F\3F\5F\u078f\nF\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u079f\nF\3G\3G\3G\5G\u07a4\nG\3G\3G\5G\u07a8"+
		"\nG\3H\3H\3I\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K"+
		"\u07bf\nK\3K\3K\6K\u07c3\nK\rK\16K\u07c4\5K\u07c7\nK\3L\3L\5L\u07cb\n"+
		"L\3M\3M\3M\5M\u07d0\nM\3N\3N\3N\3N\3N\3N\5N\u07d8\nN\3N\3N\3N\5N\u07dd"+
		"\nN\3N\3N\3N\3N\3N\3N\3N\5N\u07e6\nN\3N\3N\3N\7N\u07eb\nN\fN\16N\u07ee"+
		"\13N\3N\5N\u07f1\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0801"+
		"\nN\3N\5N\u0804\nN\3N\3N\3N\3N\3N\3N\5N\u080c\nN\3N\3N\3N\3N\3N\6N\u0813"+
		"\nN\rN\16N\u0814\3N\3N\5N\u0819\nN\3N\3N\3N\3N\5N\u081f\nN\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\5N\u083d\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0849\nN\3N\3N\3N\5"+
		"N\u084e\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u085a\nN\3N\3N\3N\3N\5N\u0860"+
		"\nN\3N\3N\3N\3N\3N\5N\u0867\nN\3N\3N\5N\u086b\nN\3N\3N\3N\3N\3N\3N\7N"+
		"\u0873\nN\fN\16N\u0876\13N\5N\u0878\nN\3N\3N\3N\3N\5N\u087e\nN\3N\5N\u0881"+
		"\nN\7N\u0883\nN\fN\16N\u0886\13N\3O\3O\3O\3O\5O\u088c\nO\3O\3O\3O\3O\3"+
		"O\7O\u0893\nO\fO\16O\u0896\13O\3O\3O\5O\u089a\nO\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\5O\u08a6\nO\3O\3O\5O\u08aa\nO\7O\u08ac\nO\fO\16O\u08af\13O\3"+
		"O\5O\u08b2\nO\3O\3O\3O\3O\3O\5O\u08b9\nO\3O\5O\u08bc\nO\5O\u08be\nO\3"+
		"P\3P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u08c8\nQ\3Q\3Q\3R\3R\3R\5R\u08cf\nR\3R\5R\u08d2"+
		"\nR\3S\3S\5S\u08d6\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u08e1\nS\3T\3T\3T"+
		"\3T\3T\3T\7T\u08e9\nT\fT\16T\u08ec\13T\3T\3T\3T\3U\3U\3U\3U\3U\3U\7U\u08f7"+
		"\nU\fU\16U\u08fa\13U\3U\3U\3U\3V\3V\5V\u0901\nV\3V\5V\u0904\nV\3V\3V\3"+
		"V\3V\7V\u090a\nV\fV\16V\u090d\13V\3V\3V\3V\3W\3W\5W\u0914\nW\3W\3W\3W"+
		"\3W\7W\u091a\nW\fW\16W\u091d\13W\3W\3W\3W\3X\3X\3Y\3Y\5Y\u0926\nY\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u0934\nY\fY\16Y\u0937\13Y\3Z\3Z\3Z"+
		"\5Z\u093c\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0944\nZ\3[\3[\3[\5[\u0949\n[\3[\5["+
		"\u094c\n[\3\\\3\\\3\\\5\\\u0951\n\\\3]\3]\3]\3]\3]\7]\u0958\n]\f]\16]"+
		"\u095b\13]\3]\3]\5]\u095f\n]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3^\3^\5^\u096d"+
		"\n^\3^\5^\u0970\n^\5^\u0972\n^\3_\3_\3_\5_\u0977\n_\3_\3_\5_\u097b\n_"+
		"\3_\5_\u097e\n_\3_\3_\3_\3_\3_\5_\u0985\n_\3_\3_\3_\3_\7_\u098b\n_\f_"+
		"\16_\u098e\13_\3_\5_\u0991\n_\3_\3_\5_\u0995\n_\3_\5_\u0998\n_\3_\3_\3"+
		"_\3_\5_\u099e\n_\3_\5_\u09a1\n_\5_\u09a3\n_\3`\3`\3`\3`\3`\7`\u09aa\n"+
		"`\f`\16`\u09ad\13`\3a\3a\5a\u09b1\na\3a\3a\5a\u09b5\na\3a\3a\5a\u09b9"+
		"\na\3a\5a\u09bc\na\3b\3b\3b\3b\3b\3b\3b\7b\u09c5\nb\fb\16b\u09c8\13b\3"+
		"b\3b\5b\u09cc\nb\3c\3c\5c\u09d0\nc\3c\3c\3c\7c\u09d5\nc\fc\16c\u09d8\13"+
		"c\3c\3c\3c\3c\7c\u09de\nc\fc\16c\u09e1\13c\3c\5c\u09e4\nc\5c\u09e6\nc"+
		"\3c\3c\5c\u09ea\nc\3c\3c\3c\3c\3c\7c\u09f1\nc\fc\16c\u09f4\13c\3c\3c\5"+
		"c\u09f8\nc\5c\u09fa\nc\3c\3c\3c\3c\3c\7c\u0a01\nc\fc\16c\u0a04\13c\3c"+
		"\3c\3c\3c\3c\3c\7c\u0a0c\nc\fc\16c\u0a0f\13c\3c\3c\7c\u0a13\nc\fc\16c"+
		"\u0a16\13c\5c\u0a18\nc\3d\3d\3d\3d\3d\5d\u0a1f\nd\3e\3e\3e\3e\3e\7e\u0a26"+
		"\ne\fe\16e\u0a29\13e\3e\3e\5e\u0a2d\ne\3f\5f\u0a30\nf\3f\3f\5f\u0a34\n"+
		"f\3g\3g\3h\3h\3i\3i\3j\3j\5j\u0a3e\nj\3k\3k\3l\3l\3m\6m\u0a45\nm\rm\16"+
		"m\u0a46\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3"+
		"x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0a79\n\u0083\3\u0083\2\4,\u009a\u0084\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\2\32\4\2\36\36"+
		"#$\3\2\37 \3\2%&\3\2),\4\2\35\35-/\4\2\t\t\"\"\5\2\r\26\35\35\37\37\4"+
		"\2\35\35),\4\2AALL\5\2UUbbpp\4\2II^^\4\2\34\34\u0089\u0089\3\2\u00a6\u00a7"+
		"\4\2\66\66YY\4\2;;WW\7\2\62\62eeoo\u009b\u009b\u009f\u009f\3\2%(\6\2k"+
		"k\177\177\u0081\u0081\u0097\u0097\4\2VV\u00ae\u00ae\5\2\62\62ee\u009f"+
		"\u009f\6\2OQ\u0087\u0087\u00bc\u00bd\u00bf\u00c0\4\2\37!\u0085\u0085\4"+
		"\2\u00bc\u00bc\u00bf\u00bf\n\2\62@BKMY[ik\u008a\u008c\u0091\u0093\u00a3"+
		"\u00a5\u00b9\2\u0c2f\2\u010f\3\2\2\2\4\u0111\3\2\2\2\6\u0117\3\2\2\2\b"+
		"\u0146\3\2\2\2\n\u0148\3\2\2\2\f\u014f\3\2\2\2\16\u0168\3\2\2\2\20\u0174"+
		"\3\2\2\2\22\u017b\3\2\2\2\24\u018a\3\2\2\2\26\u019a\3\2\2\2\30\u01a7\3"+
		"\2\2\2\32\u01d2\3\2\2\2\34\u01da\3\2\2\2\36\u01fd\3\2\2\2 \u01ff\3\2\2"+
		"\2\"\u0224\3\2\2\2$\u022b\3\2\2\2&\u022f\3\2\2\2(\u0256\3\2\2\2*\u027b"+
		"\3\2\2\2,\u02b6\3\2\2\2.\u02e6\3\2\2\2\60\u0302\3\2\2\2\62\u0304\3\2\2"+
		"\2\64\u0306\3\2\2\2\66\u0340\3\2\2\28\u0342\3\2\2\2:\u0379\3\2\2\2<\u0396"+
		"\3\2\2\2>\u03b0\3\2\2\2@\u03d3\3\2\2\2B\u0415\3\2\2\2D\u0437\3\2\2\2F"+
		"\u0454\3\2\2\2H\u0459\3\2\2\2J\u045c\3\2\2\2L\u0465\3\2\2\2N\u046d\3\2"+
		"\2\2P\u0477\3\2\2\2R\u048a\3\2\2\2T\u04ae\3\2\2\2V\u04ce\3\2\2\2X\u04f5"+
		"\3\2\2\2Z\u053a\3\2\2\2\\\u054d\3\2\2\2^\u056b\3\2\2\2`\u0575\3\2\2\2"+
		"b\u0595\3\2\2\2d\u059b\3\2\2\2f\u05a8\3\2\2\2h\u05b5\3\2\2\2j\u05c2\3"+
		"\2\2\2l\u05db\3\2\2\2n\u05fb\3\2\2\2p\u0645\3\2\2\2r\u0654\3\2\2\2t\u0661"+
		"\3\2\2\2v\u0667\3\2\2\2x\u0675\3\2\2\2z\u0684\3\2\2\2|\u06a7\3\2\2\2~"+
		"\u0710\3\2\2\2\u0080\u0713\3\2\2\2\u0082\u0736\3\2\2\2\u0084\u076c\3\2"+
		"\2\2\u0086\u076e\3\2\2\2\u0088\u0776\3\2\2\2\u008a\u078e\3\2\2\2\u008c"+
		"\u07a0\3\2\2\2\u008e\u07a9\3\2\2\2\u0090\u07ab\3\2\2\2\u0092\u07af\3\2"+
		"\2\2\u0094\u07b2\3\2\2\2\u0096\u07ca\3\2\2\2\u0098\u07cf\3\2\2\2\u009a"+
		"\u081e\3\2\2\2\u009c\u0887\3\2\2\2\u009e\u08bf\3\2\2\2\u00a0\u08c1\3\2"+
		"\2\2\u00a2\u08cb\3\2\2\2\u00a4\u08d5\3\2\2\2\u00a6\u08e2\3\2\2\2\u00a8"+
		"\u08f0\3\2\2\2\u00aa\u08fe\3\2\2\2\u00ac\u0911\3\2\2\2\u00ae\u0921\3\2"+
		"\2\2\u00b0\u0923\3\2\2\2\u00b2\u093b\3\2\2\2\u00b4\u0945\3\2\2\2\u00b6"+
		"\u0950\3\2\2\2\u00b8\u0952\3\2\2\2\u00ba\u0971\3\2\2\2\u00bc\u09a2\3\2"+
		"\2\2\u00be\u09a4\3\2\2\2\u00c0\u09bb\3\2\2\2\u00c2\u09cb\3\2\2\2\u00c4"+
		"\u0a17\3\2\2\2\u00c6\u0a1e\3\2\2\2\u00c8\u0a20\3\2\2\2\u00ca\u0a33\3\2"+
		"\2\2\u00cc\u0a35\3\2\2\2\u00ce\u0a37\3\2\2\2\u00d0\u0a39\3\2\2\2\u00d2"+
		"\u0a3d\3\2\2\2\u00d4\u0a3f\3\2\2\2\u00d6\u0a41\3\2\2\2\u00d8\u0a44\3\2"+
		"\2\2\u00da\u0a48\3\2\2\2\u00dc\u0a4a\3\2\2\2\u00de\u0a4c\3\2\2\2\u00e0"+
		"\u0a4e\3\2\2\2\u00e2\u0a50\3\2\2\2\u00e4\u0a52\3\2\2\2\u00e6\u0a54\3\2"+
		"\2\2\u00e8\u0a56\3\2\2\2\u00ea\u0a58\3\2\2\2\u00ec\u0a5a\3\2\2\2\u00ee"+
		"\u0a5c\3\2\2\2\u00f0\u0a5e\3\2\2\2\u00f2\u0a60\3\2\2\2\u00f4\u0a62\3\2"+
		"\2\2\u00f6\u0a64\3\2\2\2\u00f8\u0a66\3\2\2\2\u00fa\u0a68\3\2\2\2\u00fc"+
		"\u0a6a\3\2\2\2\u00fe\u0a6c\3\2\2\2\u0100\u0a6e\3\2\2\2\u0102\u0a70\3\2"+
		"\2\2\u0104\u0a78\3\2\2\2\u0106\u0109\5\6\4\2\u0107\u0109\5\4\3\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u0110\7\2\2\3\u010e\u0110\5\b\5\2\u010f\u010a\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\3\3\2\2\2\u0111\u0112\7\u00c5\2\2\u0112\u0113\b\3\1\2\u0113"+
		"\5\3\2\2\2\u0114\u0116\7\30\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2"+
		"\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u0123\5B\"\2\u011b\u011d\7\30\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\5B\"\2\u0121\u011c\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0129\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0128\7\30\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\7\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012c\u0147\3\2\2\2\u012d\u012e\5\36\20\2\u012e\u0130\7\30\2\2\u012f"+
		"\u0131\5\b\5\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0147\3\2"+
		"\2\2\u0132\u0136\5\30\r\2\u0133\u0135\7\30\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013b\5\b\5\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0147\3\2\2\2\u013c\u013d\5\20\t\2\u013d\u013f\7"+
		"\30\2\2\u013e\u0140\5\b\5\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0147\3\2\2\2\u0141\u0143\5\22\n\2\u0142\u0144\5\b\5\2\u0143\u0142\3"+
		"\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0147\5\34\17\2\u0146"+
		"\u012c\3\2\2\2\u0146\u012d\3\2\2\2\u0146\u0132\3\2\2\2\u0146\u013c\3\2"+
		"\2\2\u0146\u0141\3\2\2\2\u0146\u0145\3\2\2\2\u0147\t\3\2\2\2\u0148\u0149"+
		"\7\u00b4\2\2\u0149\u014a\5\u0100\u0081\2\u014a\u014b\7\35\2\2\u014b\u014c"+
		"\5,\27\2\u014c\13\3\2\2\2\u014d\u014e\7\u00b4\2\2\u014e\u0150\5\u0100"+
		"\u0081\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0156\3\2\2\2\u0151"+
		"\u0152\7\34\2\2\u0152\u0153\7\u00b4\2\2\u0153\u0155\5\u0100\u0081\2\u0154"+
		"\u0151\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0164\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\7\34\2\2\u015a"+
		"\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0161\5\n"+
		"\6\2\u015d\u015e\7\34\2\2\u015e\u0160\5\n\6\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0165\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u015a\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\r\3\2\2\2\u0166\u0169\5\u0100\u0081\2\u0167\u0169\5\u00ccg\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0171\3\2\2\2\u016a"+
		"\u016d\7\34\2\2\u016b\u016e\5\u0100\u0081\2\u016c\u016e\5\u00ccg\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016a\3\2"+
		"\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\17\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\5\u00fe\u0080\2\u0175\u0176"+
		"\7\32\2\2\u0176\u0177\5\16\b\2\u0177\u0179\7\33\2\2\u0178\u017a\5\2\2"+
		"\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\21\3\2\2\2\u017b\u017c"+
		"\5\u00fe\u0080\2\u017c\u017e\7\32\2\2\u017d\u017f\5\16\b\2\u017e\u017d"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0182\7\34\2\2"+
		"\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186"+
		"\5\24\13\2\u0184\u0185\7\34\2\2\u0185\u0187\5\16\b\2\u0186\u0184\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\33\2\2\u0189"+
		"\23\3\2\2\2\u018a\u018b\7j\2\2\u018b\u018c\7\32\2\2\u018c\u018d\5\16\b"+
		"\2\u018d\u018e\7\33\2\2\u018e\u0192\7\3\2\2\u018f\u0191\5\32\16\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0197\5\26\f\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\4"+
		"\2\2\u0199\25\3\2\2\2\u019a\u01a2\7\u009d\2\2\u019b\u01a3\5*\26\2\u019c"+
		"\u01a3\5\u0100\u0081\2\u019d\u01a3\5 \21\2\u019e\u01a3\5&\24\2\u019f\u01a3"+
		"\5\20\t\2\u01a0\u01a3\5.\30\2\u01a1\u01a3\5,\27\2\u01a2\u019b\3\2\2\2"+
		"\u01a2\u019c\3\2\2\2\u01a2\u019d\3\2\2\2\u01a2\u019e\3\2\2\2\u01a2\u019f"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\7\30\2\2\u01a5\27\3\2\2\2\u01a6\u01a8\7j\2"+
		"\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa"+
		"\5\u00fe\u0080\2\u01aa\u01ab\7\32\2\2\u01ab\u01ac\5\f\7\2\u01ac\u01ad"+
		"\7\33\2\2\u01ad\u01b1\7\3\2\2\u01ae\u01b0\5\32\16\2\u01af\u01ae\3\2\2"+
		"\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\5\26\f\2\u01b5\u01b4\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\7\4\2\2\u01b8\31"+
		"\3\2\2\2\u01b9\u01d3\5\64\33\2\u01ba\u01d3\5\34\17\2\u01bb\u01bc\5\20"+
		"\t\2\u01bc\u01bd\7\30\2\2\u01bd\u01d3\3\2\2\2\u01be\u01d3\5\6\4\2\u01bf"+
		"\u01d3\5\66\34\2\u01c0\u01d3\5@!\2\u01c1\u01c2\5\60\31\2\u01c2\u01c3\7"+
		"\30\2\2\u01c3\u01d3\3\2\2\2\u01c4\u01c5\5,\27\2\u01c5\u01c6\7\30\2\2\u01c6"+
		"\u01d3\3\2\2\2\u01c7\u01c8\5\36\20\2\u01c8\u01c9\7\30\2\2\u01c9\u01d3"+
		"\3\2\2\2\u01ca\u01d3\5\22\n\2\u01cb\u01cc\5(\25\2\u01cc\u01cd\7\30\2\2"+
		"\u01cd\u01d3\3\2\2\2\u01ce\u01cf\7\3\2\2\u01cf\u01d0\5\32\16\2\u01d0\u01d1"+
		"\7\4\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01b9\3\2\2\2\u01d2\u01ba\3\2\2\2\u01d2"+
		"\u01bb\3\2\2\2\u01d2\u01be\3\2\2\2\u01d2\u01bf\3\2\2\2\u01d2\u01c0\3\2"+
		"\2\2\u01d2\u01c1\3\2\2\2\u01d2\u01c4\3\2\2\2\u01d2\u01c7\3\2\2\2\u01d2"+
		"\u01ca\3\2\2\2\u01d2\u01cb\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d3\33\3\2\2"+
		"\2\u01d4\u01db\7\u00c2\2\2\u01d5\u01db\7\u00c3\2\2\u01d6\u01d7\7\3\2\2"+
		"\u01d7\u01d8\5\32\16\2\u01d8\u01d9\7\4\2\2\u01d9\u01db\3\2\2\2\u01da\u01d4"+
		"\3\2\2\2\u01da\u01d5\3\2\2\2\u01da\u01d6\3\2\2\2\u01db\35\3\2\2\2\u01dc"+
		"\u01fe\3\2\2\2\u01dd\u01df\7\u00b4\2\2\u01de\u01dd\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e3\5\u0100\u0081\2\u01e1\u01e3\5"+
		"\"\22\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01ee\3\2\2\2\u01e4"+
		"\u01ec\5\62\32\2\u01e5\u01ed\5\u0100\u0081\2\u01e6\u01ed\5\u00caf\2\u01e7"+
		"\u01ed\5&\24\2\u01e8\u01ed\5 \21\2\u01e9\u01ed\5\22\n\2\u01ea\u01ed\5"+
		"\20\t\2\u01eb\u01ed\5.\30\2\u01ec\u01e5\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec"+
		"\u01e7\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01e4\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01fe\3\2\2\2\u01f2\u01f4\7\u00b4\2\2\u01f3\u01f2\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f8\5\u0100\u0081\2\u01f6\u01f8"+
		"\5\"\22\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2"+
		"\u01f9\u01fa\7\35\2\2\u01fa\u01fc\5\6\4\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01dc\3\2\2\2\u01fd\u01de\3\2\2\2\u01fd"+
		"\u01f3\3\2\2\2\u01fe\37\3\2\2\2\u01ff\u0220\7\5\2\2\u0200\u0208\5$\23"+
		"\2\u0201\u0208\5,\27\2\u0202\u0203\7\6\2\2\u0203\u0204\5,\27\2\u0204\u0205"+
		"\7\6\2\2\u0205\u0208\3\2\2\2\u0206\u0208\5&\24\2\u0207\u0200\3\2\2\2\u0207"+
		"\u0201\3\2\2\2\u0207\u0202\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u020c\3\2"+
		"\2\2\u0209\u020b\7\34\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2"+
		"\2\2\u020f\u0207\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0221\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0218\5 "+
		"\21\2\u0215\u0217\7\34\2\2\u0216\u0215\3\2\2\2\u0217\u021a\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021b\u0214\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0211\3\2"+
		"\2\2\u0220\u021d\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7\7\2\2\u0223"+
		"!\3\2\2\2\u0224\u0225\5\u0102\u0082\2\u0225\u0227\7\5\2\2\u0226\u0228"+
		"\5,\27\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\7\7\2\2\u022a#\3\2\2\2\u022b\u022c\7\u00bc\2\2\u022c\u022d\7\60"+
		"\2\2\u022d\u022e\5,\27\2\u022e%\3\2\2\2\u022f\u0230\7\3\2\2\u0230\u0231"+
		"\7\u00bc\2\2\u0231\u023d\7\60\2\2\u0232\u023e\5,\27\2\u0233\u0234\7\6"+
		"\2\2\u0234\u0235\5,\27\2\u0235\u0236\7\6\2\2\u0236\u023e\3\2\2\2\u0237"+
		"\u0238\7\b\2\2\u0238\u0239\5,\27\2\u0239\u023a\7\b\2\2\u023a\u023e\3\2"+
		"\2\2\u023b\u023e\5&\24\2\u023c\u023e\5 \21\2\u023d\u0232\3\2\2\2\u023d"+
		"\u0233\3\2\2\2\u023d\u0237\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2"+
		"\2\2\u023e\u0251\3\2\2\2\u023f\u0240\7\34\2\2\u0240\u0241\7\u00bc\2\2"+
		"\u0241\u024d\7\60\2\2\u0242\u024e\5,\27\2\u0243\u0244\7\6\2\2\u0244\u0245"+
		"\5,\27\2\u0245\u0246\7\6\2\2\u0246\u024e\3\2\2\2\u0247\u0248\7\b\2\2\u0248"+
		"\u0249\5,\27\2\u0249\u024a\7\b\2\2\u024a\u024e\3\2\2\2\u024b\u024e\5&"+
		"\24\2\u024c\u024e\5 \21\2\u024d\u0242\3\2\2\2\u024d\u0243\3\2\2\2\u024d"+
		"\u0247\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u0250\3\2"+
		"\2\2\u024f\u023f\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7\4"+
		"\2\2\u0255\'\3\2\2\2\u0256\u0257\7\u0092\2\2\u0257\u0264\7\32\2\2\u0258"+
		"\u0265\5,\27\2\u0259\u0265\5\u0100\u0081\2\u025a\u025e\7\6\2\2\u025b\u025d"+
		"\5,\27\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0265\7\6"+
		"\2\2\u0262\u0265\5\20\t\2\u0263\u0265\5\"\22\2\u0264\u0258\3\2\2\2\u0264"+
		"\u0259\3\2\2\2\u0264\u025a\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2"+
		"\2\2\u0265\u0276\3\2\2\2\u0266\u0272\7\37\2\2\u0267\u0273\5,\27\2\u0268"+
		"\u026c\7\6\2\2\u0269\u026b\5,\27\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0273\7\6\2\2\u0270\u0273\5\20\t\2\u0271\u0273\5"+
		"\"\22\2\u0272\u0267\3\2\2\2\u0272\u0268\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0271\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0266\3\2\2\2\u0275\u0278\3\2"+
		"\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0279\u027a\7\33\2\2\u027a)\3\2\2\2\u027b\u027f\7\6\2\2"+
		"\u027c\u027e\5,\27\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2\2\2\u0282"+
		"\u0283\7\6\2\2\u0283+\3\2\2\2\u0284\u0290\b\27\1\2\u0285\u0286\5\u0100"+
		"\u0081\2\u0286\u0287\7\31\2\2\u0287\u0289\3\2\2\2\u0288\u0285\3\2\2\2"+
		"\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d"+
		"\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u028e\5\u0100\u0081\2\u028e\u028f\7"+
		"\31\2\2\u028f\u0291\3\2\2\2\u0290\u028a\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\u02b7\5\u0100\u0081\2\u0293\u02b7\5\u00ccg\2\u0294"+
		"\u0295\7\6\2\2\u0295\u0296\5,\27\2\u0296\u0297\7\6\2\2\u0297\u02b7\3\2"+
		"\2\2\u0298\u0299\7\32\2\2\u0299\u029a\5,\27\2\u029a\u029b\7\33\2\2\u029b"+
		"\u02b7\3\2\2\2\u029c\u029d\5\u00ceh\2\u029d\u029e\5,\27\21\u029e\u02b7"+
		"\3\2\2\2\u029f\u02b7\7\u00ba\2\2\u02a0\u02b7\7\u00bb\2\2\u02a1\u02b7\5"+
		"\20\t\2\u02a2\u02a3\7\n\2\2\u02a3\u02b7\5,\27\6\u02a4\u02a5\7\13\2\2\u02a5"+
		"\u02b7\5,\27\4\u02a6\u02a7\5\u0100\u0081\2\u02a7\u02aa\5\62\32\2\u02a8"+
		"\u02ab\5\u00caf\2\u02a9\u02ab\5\u0100\u0081\2\u02aa\u02a8\3\2\2\2\u02aa"+
		"\u02a9\3\2\2\2\u02ab\u02b3\3\2\2\2\u02ac\u02af\5\62\32\2\u02ad\u02b0\5"+
		"\u00caf\2\u02ae\u02b0\5\u0100\u0081\2\u02af\u02ad\3\2\2\2\u02af\u02ae"+
		"\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02ac\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b6\u0284\3\2\2\2\u02b6\u0293\3\2\2\2\u02b6\u0294\3\2\2\2\u02b6"+
		"\u0298\3\2\2\2\u02b6\u029c\3\2\2\2\u02b6\u029f\3\2\2\2\u02b6\u02a0\3\2"+
		"\2\2\u02b6\u02a1\3\2\2\2\u02b6\u02a2\3\2\2\2\u02b6\u02a4\3\2\2\2\u02b6"+
		"\u02a6\3\2\2\2\u02b7\u02d0\3\2\2\2\u02b8\u02b9\f\20\2\2\u02b9\u02ba\t"+
		"\2\2\2\u02ba\u02cf\5,\27\21\u02bb\u02bc\f\17\2\2\u02bc\u02bd\t\3\2\2\u02bd"+
		"\u02cf\5,\27\20\u02be\u02bf\f\16\2\2\u02bf\u02c0\t\4\2\2\u02c0\u02cf\5"+
		",\27\17\u02c1\u02c2\f\r\2\2\u02c2\u02c3\t\5\2\2\u02c3\u02cf\5,\27\16\u02c4"+
		"\u02c5\f\f\2\2\u02c5\u02c6\t\6\2\2\u02c6\u02cf\5,\27\r\u02c7\u02c8\f\t"+
		"\2\2\u02c8\u02c9\t\7\2\2\u02c9\u02cf\5,\27\2\u02ca\u02cb\f\7\2\2\u02cb"+
		"\u02cf\7\n\2\2\u02cc\u02cd\f\5\2\2\u02cd\u02cf\7\13\2\2\u02ce\u02b8\3"+
		"\2\2\2\u02ce\u02bb\3\2\2\2\u02ce\u02be\3\2\2\2\u02ce\u02c1\3\2\2\2\u02ce"+
		"\u02c4\3\2\2\2\u02ce\u02c7\3\2\2\2\u02ce\u02ca\3\2\2\2\u02ce\u02cc\3\2"+
		"\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"-\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02e0\5,\27\2\u02d4\u02d8\7\f\2\2"+
		"\u02d5\u02d9\5.\30\2\u02d6\u02d9\5,\27\2\u02d7\u02d9\5\60\31\2\u02d8\u02d5"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02de\7\60\2\2\u02db\u02df\5.\30\2\u02dc\u02df\5,\27\2\u02dd\u02df\5"+
		"\60\31\2\u02de\u02db\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df"+
		"\u02e1\3\2\2\2\u02e0\u02d4\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e7\3\2"+
		"\2\2\u02e2\u02e3\7\32\2\2\u02e3\u02e4\5.\30\2\u02e4\u02e5\7\33\2\2\u02e5"+
		"\u02e7\3\2\2\2\u02e6\u02d3\3\2\2\2\u02e6\u02e2\3\2\2\2\u02e7/\3\2\2\2"+
		"\u02e8\u02e9\5,\27\2\u02e9\u02ea\7\n\2\2\u02ea\u0303\3\2\2\2\u02eb\u02ec"+
		"\7\n\2\2\u02ec\u0303\5,\27\2\u02ed\u02ee\5,\27\2\u02ee\u02ef\7\13\2\2"+
		"\u02ef\u0303\3\2\2\2\u02f0\u02f1\7\13\2\2\u02f1\u0303\5,\27\2\u02f2\u02f3"+
		"\5\u0100\u0081\2\u02f3\u02f6\5\62\32\2\u02f4\u02f7\5\u00caf\2\u02f5\u02f7"+
		"\5\u0100\u0081\2\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02ff\3"+
		"\2\2\2\u02f8\u02fb\5\62\32\2\u02f9\u02fc\5\u00caf\2\u02fa\u02fc\5\u0100"+
		"\u0081\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd"+
		"\u02f8\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u02e8\3\2\2\2\u0302"+
		"\u02eb\3\2\2\2\u0302\u02ed\3\2\2\2\u0302\u02f0\3\2\2\2\u0302\u02f2\3\2"+
		"\2\2\u0303\61\3\2\2\2\u0304\u0305\t\b\2\2\u0305\63\3\2\2\2\u0306\u0307"+
		"\7n\2\2\u0307\u0308\7\32\2\2\u0308\u0309\5,\27\2\u0309\u031d\7\33\2\2"+
		"\u030a\u0314\7\3\2\2\u030b\u030d\5\32\16\2\u030c\u030b\3\2\2\2\u030d\u0310"+
		"\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0315\3\2\2\2\u0310"+
		"\u030e\3\2\2\2\u0311\u0313\5\26\f\2\u0312\u0311\3\2\2\2\u0312\u0313\3"+
		"\2\2\2\u0313\u0315\3\2\2\2\u0314\u030e\3\2\2\2\u0314\u0312\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0318\7\4\2\2\u0317\u030a\3\2\2\2\u0317\u0318\3\2"+
		"\2\2\u0318\u031e\3\2\2\2\u0319\u031e\5\32\16\2\u031a\u031c\5\26\f\2\u031b"+
		"\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u0317\3\2"+
		"\2\2\u031d\u0319\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u033a\3\2\2\2\u031f"+
		"\u0325\7]\2\2\u0320\u0321\7n\2\2\u0321\u0322\7\32\2\2\u0322\u0323\5,\27"+
		"\2\u0323\u0324\7\33\2\2\u0324\u0326\3\2\2\2\u0325\u0320\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u032b\3\2\2\2\u0327\u032c\5\32\16\2\u0328\u032a\5"+
		"\26\f\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b"+
		"\u0327\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0338\3\2"+
		"\2\2\u032d\u0331\7\3\2\2\u032e\u0330\5\32\16\2\u032f\u032e\3\2\2\2\u0330"+
		"\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0339\3\2"+
		"\2\2\u0333\u0331\3\2\2\2\u0334\u0336\5\26\f\2\u0335\u0334\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\7\4\2\2\u0338\u032d\3\2"+
		"\2\2\u0338\u0335\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u031f\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\65\3\2\2\2\u033c\u0341\58\35\2\u033d\u0341\5:\36"+
		"\2\u033e\u0341\5<\37\2\u033f\u0341\5> \2\u0340\u033c\3\2\2\2\u0340\u033d"+
		"\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u033f\3\2\2\2\u0341\67\3\2\2\2\u0342"+
		"\u0343\7f\2\2\u0343\u0345\7\32\2\2\u0344\u0346\7\u00b4\2\2\u0345\u0344"+
		"\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\5\u0100\u0081"+
		"\2\u0348\u034f\7\35\2\2\u0349\u034b\7\u00bd\2\2\u034a\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0350\3\2"+
		"\2\2\u034e\u0350\5\u0100\u0081\2\u034f\u034a\3\2\2\2\u034f\u034e\3\2\2"+
		"\2\u0350\u0351\3\2\2\2\u0351\u0352\7\30\2\2\u0352\u0353\5\u0100\u0081"+
		"\2\u0353\u035a\t\t\2\2\u0354\u035b\5\u0100\u0081\2\u0355\u0357\7\u00bd"+
		"\2\2\u0356\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0356\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u0356\3\2"+
		"\2\2\u035b\u035c\3\2\2\2\u035c\u035d\7\30\2\2\u035d\u035e\5\60\31\2\u035e"+
		"\u0377\7\33\2\2\u035f\u0378\5\32\16\2\u0360\u0364\7A\2\2\u0361\u0362\7"+
		"L\2\2\u0362\u0364\7\30\2\2\u0363\u0360\3\2\2\2\u0363\u0361\3\2\2\2\u0364"+
		"\u0378\3\2\2\2\u0365\u0367\5\26\f\2\u0366\u0365\3\2\2\2\u0366\u0367\3"+
		"\2\2\2\u0367\u0378\3\2\2\2\u0368\u036c\7\3\2\2\u0369\u036b\5\32\16\2\u036a"+
		"\u0369\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u0371\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0370\t\n\2\2\u0370"+
		"\u0372\7\30\2\2\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\3"+
		"\2\2\2\u0373\u0375\5\26\f\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0376\u0378\7\4\2\2\u0377\u035f\3\2\2\2\u0377\u0363\3\2"+
		"\2\2\u0377\u0366\3\2\2\2\u0377\u0368\3\2\2\2\u03789\3\2\2\2\u0379\u037a"+
		"\7\u00b7\2\2\u037a\u037b\7\32\2\2\u037b\u037c\5,\27\2\u037c\u0394\7\33"+
		"\2\2\u037d\u0381\5\32\16\2\u037e\u037f\t\n\2\2\u037f\u0381\7\30\2\2\u0380"+
		"\u037d\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0395\3\2\2\2\u0382\u0384\5\26"+
		"\f\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0395\3\2\2\2\u0385"+
		"\u0389\7\3\2\2\u0386\u0388\5\32\16\2\u0387\u0386\3\2\2\2\u0388\u038b\3"+
		"\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038e\3\2\2\2\u038b"+
		"\u0389\3\2\2\2\u038c\u038d\t\n\2\2\u038d\u038f\7\30\2\2\u038e\u038c\3"+
		"\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u0392\5\26\f\2\u0391"+
		"\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\7\4"+
		"\2\2\u0394\u0380\3\2\2\2\u0394\u0383\3\2\2\2\u0394\u0385\3\2\2\2\u0395"+
		";\3\2\2\2\u0396\u03a8\7Z\2\2\u0397\u039b\5\32\16\2\u0398\u0399\t\n\2\2"+
		"\u0399\u039b\7\30\2\2\u039a\u0397\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u03a9"+
		"\3\2\2\2\u039c\u03a0\7\3\2\2\u039d\u039f\5\32\16\2\u039e\u039d\3\2\2\2"+
		"\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a5"+
		"\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\t\n\2\2\u03a4\u03a6\7\30\2\2"+
		"\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9"+
		"\7\4\2\2\u03a8\u039a\3\2\2\2\u03a8\u039c\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ab\7\u00b7\2\2\u03ab\u03ac\7\32\2\2\u03ac\u03ad\5,\27\2\u03ad\u03ae"+
		"\7\33\2\2\u03ae\u03af\7\30\2\2\u03af=\3\2\2\2\u03b0\u03b1\7f\2\2\u03b1"+
		"\u03b3\7\32\2\2\u03b2\u03b4\7\u00b4\2\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4"+
		"\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\5\u0100\u0081\2\u03b6\u03b7\7"+
		"\60\2\2\u03b7\u03b8\5\u0102\u0082\2\u03b8\u03d1\7\33\2\2\u03b9\u03d2\5"+
		"\32\16\2\u03ba\u03be\7A\2\2\u03bb\u03bc\7L\2\2\u03bc\u03be\7\30\2\2\u03bd"+
		"\u03ba\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03d2\3\2\2\2\u03bf\u03c1\5\26"+
		"\f\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03d2\3\2\2\2\u03c2"+
		"\u03c6\7\3\2\2\u03c3\u03c5\5\32\16\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3"+
		"\2\2\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03cb\3\2\2\2\u03c8"+
		"\u03c6\3\2\2\2\u03c9\u03ca\t\n\2\2\u03ca\u03cc\7\30\2\2\u03cb\u03c9\3"+
		"\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03cf\5\26\f\2\u03ce"+
		"\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\7\4"+
		"\2\2\u03d1\u03b9\3\2\2\2\u03d1\u03bd\3\2\2\2\u03d1\u03c0\3\2\2\2\u03d1"+
		"\u03c2\3\2\2\2\u03d2?\3\2\2\2\u03d3\u03d4\7\u00a4\2\2\u03d4\u03d5\7\32"+
		"\2\2\u03d5\u03d6\5,\27\2\u03d6\u03d7\7\33\2\2\u03d7\u03f2\7\3\2\2\u03d8"+
		"\u03d9\7D\2\2\u03d9\u03da\5,\27\2\u03da\u03ee\7\60\2\2\u03db\u03dd\5\32"+
		"\16\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de"+
		"\u03df\7A\2\2\u03df\u03e1\7\30\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2"+
		"\2\2\u03e1\u03ef\3\2\2\2\u03e2\u03e6\7\3\2\2\u03e3\u03e5\5\32\16\2\u03e4"+
		"\u03e3\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7\u03eb\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ea\7A\2\2\u03ea"+
		"\u03ec\7\30\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\3"+
		"\2\2\2\u03ed\u03ef\7\4\2\2\u03ee\u03dc\3\2\2\2\u03ee\u03e2\3\2\2\2\u03ef"+
		"\u03f1\3\2\2\2\u03f0\u03d8\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2"+
		"\2\2\u03f2\u03f3\3\2\2\2\u03f3\u040c\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5"+
		"\u03f6\7S\2\2\u03f6\u040a\7\60\2\2\u03f7\u03f9\5\32\16\2\u03f8\u03f7\3"+
		"\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03fb\7A\2\2\u03fb"+
		"\u03fd\7\30\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u040b\3"+
		"\2\2\2\u03fe\u0402\7\3\2\2\u03ff\u0401\5\32\16\2\u0400\u03ff\3\2\2\2\u0401"+
		"\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0407\3\2"+
		"\2\2\u0404\u0402\3\2\2\2\u0405\u0406\7A\2\2\u0406\u0408\7\30\2\2\u0407"+
		"\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040b\7\4"+
		"\2\2\u040a\u03f8\3\2\2\2\u040a\u03fe\3\2\2\2\u040b\u040d\3\2\2\2\u040c"+
		"\u03f5\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\7\4"+
		"\2\2\u040fA\3\2\2\2\u0410\u0413\7d\2\2\u0411\u0412\7\u0093\2\2\u0412\u0414"+
		"\7\u008f\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2"+
		"\2\u0415\u0410\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0435\3\2\2\2\u0417\u0436"+
		"\5D#\2\u0418\u0436\5J&\2\u0419\u0436\5L\'\2\u041a\u0436\5N(\2\u041b\u0436"+
		"\5P)\2\u041c\u0436\5R*\2\u041d\u0436\5T+\2\u041e\u0436\5V,\2\u041f\u0436"+
		"\5X-\2\u0420\u0436\5Z.\2\u0421\u0436\5\\/\2\u0422\u0436\5^\60\2\u0423"+
		"\u0436\5`\61\2\u0424\u0436\5b\62\2\u0425\u0436\5d\63\2\u0426\u0436\5f"+
		"\64\2\u0427\u0436\5h\65\2\u0428\u0436\5j\66\2\u0429\u0436\5l\67\2\u042a"+
		"\u0436\5n8\2\u042b\u0436\5p9\2\u042c\u0436\5r:\2\u042d\u0436\5t;\2\u042e"+
		"\u0436\5v<\2\u042f\u0436\5x=\2\u0430\u0436\5z>\2\u0431\u0436\5|?\2\u0432"+
		"\u0436\5\u0080A\2\u0433\u0436\5\u0082B\2\u0434\u0436\5\u0084C\2\u0435"+
		"\u0417\3\2\2\2\u0435\u0418\3\2\2\2\u0435\u0419\3\2\2\2\u0435\u041a\3\2"+
		"\2\2\u0435\u041b\3\2\2\2\u0435\u041c\3\2\2\2\u0435\u041d\3\2\2\2\u0435"+
		"\u041e\3\2\2\2\u0435\u041f\3\2\2\2\u0435\u0420\3\2\2\2\u0435\u0421\3\2"+
		"\2\2\u0435\u0422\3\2\2\2\u0435\u0423\3\2\2\2\u0435\u0424\3\2\2\2\u0435"+
		"\u0425\3\2\2\2\u0435\u0426\3\2\2\2\u0435\u0427\3\2\2\2\u0435\u0428\3\2"+
		"\2\2\u0435\u0429\3\2\2\2\u0435\u042a\3\2\2\2\u0435\u042b\3\2\2\2\u0435"+
		"\u042c\3\2\2\2\u0435\u042d\3\2\2\2\u0435\u042e\3\2\2\2\u0435\u042f\3\2"+
		"\2\2\u0435\u0430\3\2\2\2\u0435\u0431\3\2\2\2\u0435\u0432\3\2\2\2\u0435"+
		"\u0433\3\2\2\2\u0435\u0434\3\2\2\2\u0436C\3\2\2\2\u0437\u0438\7\67\2\2"+
		"\u0438\u043a\7\u00a5\2\2\u0439\u043b\7\u008b\2\2\u043a\u0439\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043f\3\2\2\2\u043c\u043d\5\u00dep\2\u043d\u043e"+
		"\7\31\2\2\u043e\u0440\3\2\2\2\u043f\u043c\3\2\2\2\u043f\u0440\3\2\2\2"+
		"\u0440\u0441\3\2\2\2\u0441\u044c\5\u00e0q\2\u0442\u0443\7\u009a\2\2\u0443"+
		"\u0444\7\u00a9\2\2\u0444\u044d\5\u00e6t\2\u0445\u044d\5H%\2\u0446\u044d"+
		"\5F$\2\u0447\u0449\7\64\2\2\u0448\u044a\7H\2\2\u0449\u0448\3\2\2\2\u0449"+
		"\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d\5\u0086D\2\u044c\u0442"+
		"\3\2\2\2\u044c\u0445\3\2\2\2\u044c\u0446\3\2\2\2\u044c\u0447\3\2\2\2\u044d"+
		"\u044f\3\2\2\2\u044e\u0450\7_\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2"+
		"\2\2\u0450\u0452\3\2\2\2\u0451\u0453\5\u00d8m\2\u0452\u0451\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0453E\3\2\2\2\u0454\u0455\7\64\2\2\u0455\u0456\7K\2\2"+
		"\u0456\u0457\5\u0104\u0083\2\u0457\u0458\5\u00a4S\2\u0458G\3\2\2\2\u0459"+
		"\u045a\7\64\2\2\u045a\u045b\5\u00a4S\2\u045bI\3\2\2\2\u045c\u0463\78\2"+
		"\2\u045d\u0464\5\u00dep\2\u045e\u0464\5\u00e4s\2\u045f\u0460\5\u00dep"+
		"\2\u0460\u0461\7\31\2\2\u0461\u0462\5\u00e4s\2\u0462\u0464\3\2\2\2\u0463"+
		"\u045d\3\2\2\2\u0463\u045e\3\2\2\2\u0463\u045f\3\2\2\2\u0463\u0464\3\2"+
		"\2\2\u0464K\3\2\2\2\u0465\u0467\7<\2\2\u0466\u0468\7R\2\2\u0467\u0466"+
		"\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\5\u009aN"+
		"\2\u046a\u046b\7:\2\2\u046b\u046c\5\u00dep\2\u046cM\3\2\2\2\u046d\u046f"+
		"\7?\2\2\u046e\u0470\t\13\2\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0475\3\2\2\2\u0471\u0473\7\u00aa\2\2\u0472\u0474\5\u00fc\177\2\u0473"+
		"\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0476\3\2\2\2\u0475\u0471\3\2"+
		"\2\2\u0475\u0476\3\2\2\2\u0476O\3\2\2\2\u0477\u047c\t\f\2\2\u0478\u047a"+
		"\7\u00aa\2\2\u0479\u047b\5\u00fc\177\2\u047a\u0479\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u0478\3\2\2\2\u047c\u047d\3\2\2\2\u047d"+
		"Q\3\2\2\2\u047e\u0480\7\u00b8\2\2\u047f\u0481\7\u0095\2\2\u0480\u047f"+
		"\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0487\5\u00b8]"+
		"\2\u0483\u0484\7\34\2\2\u0484\u0486\5\u00b8]\2\u0485\u0483\3\2\2\2\u0486"+
		"\u0489\3\2\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048b\3\2"+
		"\2\2\u0489\u0487\3\2\2\2\u048a\u047e\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u048c\3\2\2\2\u048c\u0496\5\u00c4c\2\u048d\u048f\7\u00ac\2\2\u048e\u0490"+
		"\7\66\2\2\u048f\u048e\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0494\3\2\2\2"+
		"\u0491\u0494\7x\2\2\u0492\u0494\7a\2\2\u0493\u048d\3\2\2\2\u0493\u0491"+
		"\3\2\2\2\u0493\u0492\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0497\5\u00c4c"+
		"\2\u0496\u0493\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499"+
		"\3\2\2\2\u0499\u04a4\3\2\2\2\u049a\u049b\7\u008d\2\2\u049b\u049c\7B\2"+
		"\2\u049c\u04a1\5\u00b4[\2\u049d\u049e\7\34\2\2\u049e\u04a0\5\u00b4[\2"+
		"\u049f\u049d\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2"+
		"\3\2\2\2\u04a2\u04a5\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4\u049a\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04ac\3\2\2\2\u04a6\u04a7\7\u0080\2\2\u04a7\u04aa"+
		"\5\u009aN\2\u04a8\u04a9\t\r\2\2\u04a9\u04ab\5\u009aN\2\u04aa\u04a8\3\2"+
		"\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04a6\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04adS\3\2\2\2\u04ae\u04b0\7M\2\2\u04af\u04b1\7\u00ad\2"+
		"\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b6"+
		"\7r\2\2\u04b3\u04b4\7n\2\2\u04b4\u04b5\7\u0085\2\2\u04b5\u04b7\7c\2\2"+
		"\u04b6\u04b3\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04bb\3\2\2\2\u04b8\u04b9"+
		"\5\u00dep\2\u04b9\u04ba\7\31\2\2\u04ba\u04bc\3\2\2\2\u04bb\u04b8\3\2\2"+
		"\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\5\u00eex\2\u04be"+
		"\u04bf\7\u008a\2\2\u04bf\u04c0\5\u00e2r\2\u04c0\u04c1\7\32\2\2\u04c1\u04c6"+
		"\5\u00a2R\2\u04c2\u04c3\7\34\2\2\u04c3\u04c5\5\u00a2R\2\u04c4\u04c2\3"+
		"\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7"+
		"\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cc\7\33\2\2\u04ca\u04cb\7"+
		"\u00b6\2\2\u04cb\u04cd\5\u009aN\2\u04cc\u04ca\3\2\2\2\u04cc\u04cd\3\2"+
		"\2\2\u04cdU\3\2\2\2\u04ce\u04d0\7M\2\2\u04cf\u04d1\t\16\2\2\u04d0\u04cf"+
		"\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d6\7\u00a5\2"+
		"\2\u04d3\u04d4\7n\2\2\u04d4\u04d5\7\u0085\2\2\u04d5\u04d7\7c\2\2\u04d6"+
		"\u04d3\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04db\3\2\2\2\u04d8\u04d9\5\u00de"+
		"p\2\u04d9\u04da\7\31\2\2\u04da\u04dc\3\2\2\2\u04db\u04d8\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04f0\5\u00e2r\2\u04de\u04df"+
		"\7\32\2\2\u04df\u04e6\5\u0086D\2\u04e0\u04e1\7\34\2\2\u04e1\u04e5\5\u00a4"+
		"S\2\u04e2\u04e3\7\34\2\2\u04e3\u04e5\5\u0086D\2\u04e4\u04e0\3\2\2\2\u04e4"+
		"\u04e2\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2"+
		"\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ec\7\33\2\2\u04ea"+
		"\u04eb\7\u00b9\2\2\u04eb\u04ed\7\u00bc\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed"+
		"\3\2\2\2\u04ed\u04f1\3\2\2\2\u04ee\u04ef\7:\2\2\u04ef\u04f1\5|?\2\u04f0"+
		"\u04de\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04f4\5\u00d8"+
		"m\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4W\3\2\2\2\u04f5\u04f7"+
		"\7M\2\2\u04f6\u04f8\t\16\2\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u04fd\7\u00ab\2\2\u04fa\u04fb\7n\2\2\u04fb\u04fc"+
		"\7\u0085\2\2\u04fc\u04fe\7c\2\2\u04fd\u04fa\3\2\2\2\u04fd\u04fe\3\2\2"+
		"\2\u04fe\u0502\3\2\2\2\u04ff\u0500\5\u00dep\2\u0500\u0501\7\31\2\2\u0501"+
		"\u0503\3\2\2\2\u0502\u04ff\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504\3\2"+
		"\2\2\u0504\u0509\5\u00f0y\2\u0505\u050a\7>\2\2\u0506\u050a\7\65\2\2\u0507"+
		"\u0508\7w\2\2\u0508\u050a\7\u0088\2\2\u0509\u0505\3\2\2\2\u0509\u0506"+
		"\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0519\3\2\2\2\u050b"+
		"\u051a\7V\2\2\u050c\u051a\7v\2\2\u050d\u0517\7\u00ae\2\2\u050e\u050f\7"+
		"\u0088\2\2\u050f\u0514\5\u00e8u\2\u0510\u0511\7\34\2\2\u0511\u0513\5\u00e8"+
		"u\2\u0512\u0510\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514"+
		"\u0515\3\2\2\2\u0515\u0518\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u050e\3\2"+
		"\2\2\u0517\u0518\3\2\2\2\u0518\u051a\3\2\2\2\u0519\u050b\3\2\2\2\u0519"+
		"\u050c\3\2\2\2\u0519\u050d\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051f\7\u008a"+
		"\2\2\u051c\u051d\5\u00dep\2\u051d\u051e\7\31\2\2\u051e\u0520\3\2\2\2\u051f"+
		"\u051c\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0525\5\u00e2"+
		"r\2\u0522\u0523\7f\2\2\u0523\u0524\7\\\2\2\u0524\u0526\7\u00a0\2\2\u0525"+
		"\u0522\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0528\7\u00b5"+
		"\2\2\u0528\u052a\5\u009aN\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u0534\7?\2\2\u052c\u0531\5\u0080A\2\u052d\u0531\5"+
		"n8\2\u052e\u0531\5^\60\2\u052f\u0531\5|?\2\u0530\u052c\3\2\2\2\u0530\u052d"+
		"\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0533\7\30\2\2\u0533\u0535\3\2\2\2\u0534\u0530\3\2\2\2\u0535\u0536\3"+
		"\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538"+
		"\u0539\7^\2\2\u0539Y\3\2\2\2\u053a\u053c\7M\2\2\u053b\u053d\t\16\2\2\u053c"+
		"\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0542\7\u00b2"+
		"\2\2\u053f\u0540\7n\2\2\u0540\u0541\7\u0085\2\2\u0541\u0543\7c\2\2\u0542"+
		"\u053f\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0547\3\2\2\2\u0544\u0545\5\u00de"+
		"p\2\u0545\u0546\7\31\2\2\u0546\u0548\3\2\2\2\u0547\u0544\3\2\2\2\u0547"+
		"\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\5\u00f2z\2\u054a\u054b"+
		"\7:\2\2\u054b\u054c\5|?\2\u054c[\3\2\2\2\u054d\u054e\7M\2\2\u054e\u054f"+
		"\7\u00b3\2\2\u054f\u0553\7\u00a5\2\2\u0550\u0551\7n\2\2\u0551\u0552\7"+
		"\u0085\2\2\u0552\u0554\7c\2\2\u0553\u0550\3\2\2\2\u0553\u0554\3\2\2\2"+
		"\u0554\u0558\3\2\2\2\u0555\u0556\5\u00dep\2\u0556\u0557\7\31\2\2\u0557"+
		"\u0559\3\2\2\2\u0558\u0555\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\3\2"+
		"\2\2\u055a\u055b\5\u00e2r\2\u055b\u055c\7\u00af\2\2\u055c\u0568\5\u00f4"+
		"{\2\u055d\u055e\7\32\2\2\u055e\u0563\5\u00d2j\2\u055f\u0560\7\34\2\2\u0560"+
		"\u0562\5\u00d2j\2\u0561\u055f\3\2\2\2\u0562\u0565\3\2\2\2\u0563\u0561"+
		"\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0566\3\2\2\2\u0565\u0563\3\2\2\2\u0566"+
		"\u0567\7\33\2\2\u0567\u0569\3\2\2\2\u0568\u055d\3\2\2\2\u0568\u0569\3"+
		"\2\2\2\u0569]\3\2\2\2\u056a\u056c\5\u00b0Y\2\u056b\u056a\3\2\2\2\u056b"+
		"\u056c\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\7V\2\2\u056e\u056f\7h\2"+
		"\2\u056f\u0572\5\u00b2Z\2\u0570\u0571\7\u00b6\2\2\u0571\u0573\5\u009a"+
		"N\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573_\3\2\2\2\u0574\u0576"+
		"\5\u00b0Y\2\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\3\2\2"+
		"\2\u0577\u0578\7V\2\2\u0578\u057b\7h\2\2\u0579\u057c\5\u00b2Z\2\u057a"+
		"\u057c\5\6\4\2\u057b\u0579\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u057f\3\2"+
		"\2\2\u057d\u057e\7\u00b6\2\2\u057e\u0580\5\u009aN\2\u057f\u057d\3\2\2"+
		"\2\u057f\u0580\3\2\2\2\u0580\u0593\3\2\2\2\u0581\u0582\7\u008d\2\2\u0582"+
		"\u0583\7B\2\2\u0583\u0588\5\u00b4[\2\u0584\u0585\7\34\2\2\u0585\u0587"+
		"\5\u00b4[\2\u0586\u0584\3\2\2\2\u0587\u058a\3\2\2\2\u0588\u0586\3\2\2"+
		"\2\u0588\u0589\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058b\u0581"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058e\7\u0080\2"+
		"\2\u058e\u0591\5\u009aN\2\u058f\u0590\t\r\2\2\u0590\u0592\5\u009aN\2\u0591"+
		"\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u058b\3\2"+
		"\2\2\u0593\u0594\3\2\2\2\u0594a\3\2\2\2\u0595\u0597\7X\2\2\u0596\u0598"+
		"\7R\2\2\u0597\u0596\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599"+
		"\u059a\5\u00dep\2\u059ac\3\2\2\2\u059b\u059c\7[\2\2\u059c\u059f\7r\2\2"+
		"\u059d\u059e\7n\2\2\u059e\u05a0\7c\2\2\u059f\u059d\3\2\2\2\u059f\u05a0"+
		"\3\2\2\2\u05a0\u05a4\3\2\2\2\u05a1\u05a2\5\u00dep\2\u05a2\u05a3\7\31\2"+
		"\2\u05a3\u05a5\3\2\2\2\u05a4\u05a1\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6"+
		"\3\2\2\2\u05a6\u05a7\5\u00eex\2\u05a7e\3\2\2\2\u05a8\u05a9\7[\2\2\u05a9"+
		"\u05ac\7\u00a5\2\2\u05aa\u05ab\7n\2\2\u05ab\u05ad\7c\2\2\u05ac\u05aa\3"+
		"\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05b1\3\2\2\2\u05ae\u05af\5\u00dep\2"+
		"\u05af\u05b0\7\31\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05ae\3\2\2\2\u05b1\u05b2"+
		"\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\5\u00e2r\2\u05b4g\3\2\2\2\u05b5"+
		"\u05b6\7[\2\2\u05b6\u05b9\7\u00ab\2\2\u05b7\u05b8\7n\2\2\u05b8\u05ba\7"+
		"c\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05be\3\2\2\2\u05bb"+
		"\u05bc\5\u00dep\2\u05bc\u05bd\7\31\2\2\u05bd\u05bf\3\2\2\2\u05be\u05bb"+
		"\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1\5\u00f0y"+
		"\2\u05c1i\3\2\2\2\u05c2\u05c3\7[\2\2\u05c3\u05c6\7\u00b2\2\2\u05c4\u05c5"+
		"\7n\2\2\u05c5\u05c7\7c\2\2\u05c6\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7"+
		"\u05cb\3\2\2\2\u05c8\u05c9\5\u00dep\2\u05c9\u05ca\7\31\2\2\u05ca\u05cc"+
		"\3\2\2\2\u05cb\u05c8\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u05ce\5\u00f2z\2\u05cek\3\2\2\2\u05cf\u05d1\7\u00b8\2\2\u05d0\u05d2\7"+
		"\u0095\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d3\3\2\2\2"+
		"\u05d3\u05d8\5\u00b8]\2\u05d4\u05d5\7\34\2\2\u05d5\u05d7\5\u00b8]\2\u05d6"+
		"\u05d4\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2"+
		"\2\2\u05d9\u05dc\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05cf\3\2\2\2\u05db"+
		"\u05dc\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e3\5\u00c4c\2\u05de\u05df"+
		"\5\u00c6d\2\u05df\u05e0\5\u00c4c\2\u05e0\u05e2\3\2\2\2\u05e1\u05de\3\2"+
		"\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4"+
		"\u05f0\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05e7\7\u008d\2\2\u05e7\u05e8"+
		"\7B\2\2\u05e8\u05ed\5\u00b4[\2\u05e9\u05ea\7\34\2\2\u05ea\u05ec\5\u00b4"+
		"[\2\u05eb\u05e9\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed"+
		"\u05ee\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05e6\3\2"+
		"\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f8\3\2\2\2\u05f2\u05f3\7\u0080\2\2\u05f3"+
		"\u05f6\5\u009aN\2\u05f4\u05f5\t\r\2\2\u05f5\u05f7\5\u009aN\2\u05f6\u05f4"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\3\2\2\2\u05f8\u05f2\3\2\2\2\u05f8"+
		"\u05f9\3\2\2\2\u05f9m\3\2\2\2\u05fa\u05fc\5\u00b0Y\2\u05fb\u05fa\3\2\2"+
		"\2\u05fb\u05fc\3\2\2\2\u05fc\u060e\3\2\2\2\u05fd\u060f\7v\2\2\u05fe\u060f"+
		"\7\u009b\2\2\u05ff\u0600\7v\2\2\u0600\u0601\7\u008c\2\2\u0601\u060f\7"+
		"\u009b\2\2\u0602\u0603\7v\2\2\u0603\u0604\7\u008c\2\2\u0604\u060f\7\u009f"+
		"\2\2\u0605\u0606\7v\2\2\u0606\u0607\7\u008c\2\2\u0607\u060f\7\62\2\2\u0608"+
		"\u0609\7v\2\2\u0609\u060a\7\u008c\2\2\u060a\u060f\7e\2\2\u060b\u060c\7"+
		"v\2\2\u060c\u060d\7\u008c\2\2\u060d\u060f\7o\2\2\u060e\u05fd\3\2\2\2\u060e"+
		"\u05fe\3\2\2\2\u060e\u05ff\3\2\2\2\u060e\u0602\3\2\2\2\u060e\u0605\3\2"+
		"\2\2\u060e\u0608\3\2\2\2\u060e\u060b\3\2\2\2\u060f\u0610\3\2\2\2\u0610"+
		"\u0614\7y\2\2\u0611\u0612\5\u00dep\2\u0612\u0613\7\31\2\2\u0613\u0615"+
		"\3\2\2\2\u0614\u0611\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u0622\5\u00e2r\2\u0617\u0618\7\32\2\2\u0618\u061d\5\u00e8u\2\u0619\u061a"+
		"\7\34\2\2\u061a\u061c\5\u00e8u\2\u061b\u0619\3\2\2\2\u061c\u061f\3\2\2"+
		"\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0620\3\2\2\2\u061f\u061d"+
		"\3\2\2\2\u0620\u0621\7\33\2\2\u0621\u0623\3\2\2\2\u0622\u0617\3\2\2\2"+
		"\u0622\u0623\3\2\2\2\u0623\u0643\3\2\2\2\u0624\u0625\7\u00b1\2\2\u0625"+
		"\u0626\7\32\2\2\u0626\u062b\5\u009aN\2\u0627\u0628\7\34\2\2\u0628\u062a"+
		"\5\u009aN\2\u0629\u0627\3\2\2\2\u062a\u062d\3\2\2\2\u062b\u0629\3\2\2"+
		"\2\u062b\u062c\3\2\2\2\u062c\u062e\3\2\2\2\u062d\u062b\3\2\2\2\u062e\u063d"+
		"\7\33\2\2\u062f\u0630\7\34\2\2\u0630\u0631\7\32\2\2\u0631\u0636\5\u009a"+
		"N\2\u0632\u0633\7\34\2\2\u0633\u0635\5\u009aN\2\u0634\u0632\3\2\2\2\u0635"+
		"\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\3\2"+
		"\2\2\u0638\u0636\3\2\2\2\u0639\u063a\7\33\2\2\u063a\u063c\3\2\2\2\u063b"+
		"\u062f\3\2\2\2\u063c\u063f\3\2\2\2\u063d\u063b\3\2\2\2\u063d\u063e\3\2"+
		"\2\2\u063e\u0644\3\2\2\2\u063f\u063d\3\2\2\2\u0640\u0644\5|?\2\u0641\u0642"+
		"\7S\2\2\u0642\u0644\7\u00b1\2\2\u0643\u0624\3\2\2\2\u0643\u0640\3\2\2"+
		"\2\u0643\u0641\3\2\2\2\u0644o\3\2\2\2\u0645\u0649\7\u0090\2\2\u0646\u0647"+
		"\5\u00dep\2\u0647\u0648\7\31\2\2\u0648\u064a\3\2\2\2\u0649\u0646\3\2\2"+
		"\2\u0649\u064a\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u0652\5\u00f6|\2\u064c"+
		"\u064d\7\35\2\2\u064d\u0653\5\u00b6\\\2\u064e\u064f\7\32\2\2\u064f\u0650"+
		"\5\u00b6\\\2\u0650\u0651\7\33\2\2\u0651\u0653\3\2\2\2\u0652\u064c\3\2"+
		"\2\2\u0652\u064e\3\2\2\2\u0652\u0653\3\2\2\2\u0653q\3\2\2\2\u0654\u065f"+
		"\7\u0098\2\2\u0655\u0660\5\u00eav\2\u0656\u0657\5\u00dep\2\u0657\u0658"+
		"\7\31\2\2\u0658\u065a\3\2\2\2\u0659\u0656\3\2\2\2\u0659\u065a\3\2\2\2"+
		"\u065a\u065d\3\2\2\2\u065b\u065e\5\u00e2r\2\u065c\u065e\5\u00eex\2\u065d"+
		"\u065b\3\2\2\2\u065d\u065c\3\2\2\2\u065e\u0660\3\2\2\2\u065f\u0655\3\2"+
		"\2\2\u065f\u0659\3\2\2\2\u065f\u0660\3\2\2\2\u0660s\3\2\2\2\u0661\u0663"+
		"\7\u0099\2\2\u0662\u0664\7\u00a1\2\2\u0663\u0662\3\2\2\2\u0663\u0664\3"+
		"\2\2\2\u0664\u0665\3\2\2\2\u0665\u0666\5\u00f8}\2\u0666u\3\2\2\2\u0667"+
		"\u066c\7\u009f\2\2\u0668\u066a\7\u00aa\2\2\u0669\u066b\5\u00fc\177\2\u066a"+
		"\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066d\3\2\2\2\u066c\u0668\3\2"+
		"\2\2\u066c\u066d\3\2\2\2\u066d\u0673\3\2\2\2\u066e\u0670\7\u00a9\2\2\u066f"+
		"\u0671\7\u00a1\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0672"+
		"\3\2\2\2\u0672\u0674\5\u00f8}\2\u0673\u066e\3\2\2\2\u0673\u0674\3\2\2"+
		"\2\u0674w\3\2\2\2\u0675\u0676\7\u00a1\2\2\u0676\u0677\5\u00f8}\2\u0677"+
		"y\3\2\2\2\u0678\u067a\7\u00b8\2\2\u0679\u067b\7\u0095\2\2\u067a\u0679"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u0681\5\u00b8]"+
		"\2\u067d\u067e\7\34\2\2\u067e\u0680\5\u00b8]\2\u067f\u067d\3\2\2\2\u0680"+
		"\u0683\3\2\2\2\u0681\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0685\3\2"+
		"\2\2\u0683\u0681\3\2\2\2\u0684\u0678\3\2\2\2\u0684\u0685\3\2\2\2\u0685"+
		"\u0686\3\2\2\2\u0686\u0691\5\u00c4c\2\u0687\u0688\7\u008d\2\2\u0688\u0689"+
		"\7B\2\2\u0689\u068e\5\u00b4[\2\u068a\u068b\7\34\2\2\u068b\u068d\5\u00b4"+
		"[\2\u068c\u068a\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u068c\3\2\2\2\u068e"+
		"\u068f\3\2\2\2\u068f\u0692\3\2\2\2\u0690\u068e\3\2\2\2\u0691\u0687\3\2"+
		"\2\2\u0691\u0692\3\2\2\2\u0692\u0699\3\2\2\2\u0693\u0694\7\u0080\2\2\u0694"+
		"\u0697\5\u009aN\2\u0695\u0696\t\r\2\2\u0696\u0698\5\u009aN\2\u0697\u0695"+
		"\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u069a\3\2\2\2\u0699\u0693\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a{\3\2\2\2\u069b\u069d\7\u00b8\2\2\u069c\u069e\7\u0095"+
		"\2\2\u069d\u069c\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069f\3\2\2\2\u069f"+
		"\u06a4\5\u00b8]\2\u06a0\u06a1\7\34\2\2\u06a1\u06a3\5\u00b8]\2\u06a2\u06a0"+
		"\3\2\2\2\u06a3\u06a6\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5"+
		"\u06a8\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a7\u069b\3\2\2\2\u06a7\u06a8\3\2"+
		"\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06af\5~@\2\u06aa\u06ab\5\u00c6d\2\u06ab"+
		"\u06ac\5~@\2\u06ac\u06ae\3\2\2\2\u06ad\u06aa\3\2\2\2\u06ae\u06b1\3\2\2"+
		"\2\u06af\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06bc\3\2\2\2\u06b1\u06af"+
		"\3\2\2\2\u06b2\u06b3\7\u008d\2\2\u06b3\u06b4\7B\2\2\u06b4\u06b9\5\u00b4"+
		"[\2\u06b5\u06b6\7\34\2\2\u06b6\u06b8\5\u00b4[\2\u06b7\u06b5\3\2\2\2\u06b8"+
		"\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bd\3\2"+
		"\2\2\u06bb\u06b9\3\2\2\2\u06bc\u06b2\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd"+
		"\u06c4\3\2\2\2\u06be\u06bf\7\u0080\2\2\u06bf\u06c2\5\u009aN\2\u06c0\u06c1"+
		"\t\r\2\2\u06c1\u06c3\5\u009aN\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2"+
		"\2\u06c3\u06c5\3\2\2\2\u06c4\u06be\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5}"+
		"\3\2\2\2\u06c6\u06c8\7\u00a2\2\2\u06c7\u06c9\t\17\2\2\u06c8\u06c7\3\2"+
		"\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cf\5\u00ba^\2\u06cb"+
		"\u06cc\7\34\2\2\u06cc\u06ce\5\u00ba^\2\u06cd\u06cb\3\2\2\2\u06ce\u06d1"+
		"\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06de\3\2\2\2\u06d1"+
		"\u06cf\3\2\2\2\u06d2\u06dc\7h\2\2\u06d3\u06d8\5\u00bc_\2\u06d4\u06d5\7"+
		"\34\2\2\u06d5\u06d7\5\u00bc_\2\u06d6\u06d4\3\2\2\2\u06d7\u06da\3\2\2\2"+
		"\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06dd\3\2\2\2\u06da\u06d8"+
		"\3\2\2\2\u06db\u06dd\5\u00be`\2\u06dc\u06d3\3\2\2\2\u06dc\u06db\3\2\2"+
		"\2\u06dd\u06df\3\2\2\2\u06de\u06d2\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e2"+
		"\3\2\2\2\u06e0\u06e1\7\u00b6\2\2\u06e1\u06e3\5\u009aN\2\u06e2\u06e0\3"+
		"\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06f2\3\2\2\2\u06e4\u06e5\7l\2\2\u06e5"+
		"\u06e6\7B\2\2\u06e6\u06eb\5\u009aN\2\u06e7\u06e8\7\34\2\2\u06e8\u06ea"+
		"\5\u009aN\2\u06e9\u06e7\3\2\2\2\u06ea\u06ed\3\2\2\2\u06eb\u06e9\3\2\2"+
		"\2\u06eb\u06ec\3\2\2\2\u06ec\u06f0\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ee\u06ef"+
		"\7m\2\2\u06ef\u06f1\5\u009aN\2\u06f0\u06ee\3\2\2\2\u06f0\u06f1\3\2\2\2"+
		"\u06f1\u06f3\3\2\2\2\u06f2\u06e4\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u0711"+
		"\3\2\2\2\u06f4\u06f5\7\u00b1\2\2\u06f5\u06f6\7\32\2\2\u06f6\u06fb\5\u009a"+
		"N\2\u06f7\u06f8\7\34\2\2\u06f8\u06fa\5\u009aN\2\u06f9\u06f7\3\2\2\2\u06fa"+
		"\u06fd\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\3\2"+
		"\2\2\u06fd\u06fb\3\2\2\2\u06fe\u070d\7\33\2\2\u06ff\u0700\7\34\2\2\u0700"+
		"\u0701\7\32\2\2\u0701\u0706\5\u009aN\2\u0702\u0703\7\34\2\2\u0703\u0705"+
		"\5\u009aN\2\u0704\u0702\3\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2"+
		"\2\u0706\u0707\3\2\2\2\u0707\u0709\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u070a"+
		"\7\33\2\2\u070a\u070c\3\2\2\2\u070b\u06ff\3\2\2\2\u070c\u070f\3\2\2\2"+
		"\u070d\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0711\3\2\2\2\u070f\u070d"+
		"\3\2\2\2\u0710\u06c6\3\2\2\2\u0710\u06f4\3\2\2\2\u0711\177\3\2\2\2\u0712"+
		"\u0714\5\u00b0Y\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715"+
		"\3\2\2\2\u0715\u0720\7\u00ae\2\2\u0716\u0717\7\u008c\2\2\u0717\u0721\7"+
		"\u009f\2\2\u0718\u0719\7\u008c\2\2\u0719\u0721\7\62\2\2\u071a\u071b\7"+
		"\u008c\2\2\u071b\u0721\7\u009b\2\2\u071c\u071d\7\u008c\2\2\u071d\u0721"+
		"\7e\2\2\u071e\u071f\7\u008c\2\2\u071f\u0721\7o\2\2\u0720\u0716\3\2\2\2"+
		"\u0720\u0718\3\2\2\2\u0720\u071a\3\2\2\2\u0720\u071c\3\2\2\2\u0720\u071e"+
		"\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\5\u00b2Z"+
		"\2\u0723\u0724\7\u00a3\2\2\u0724\u0725\5\u00e8u\2\u0725\u0726\7\35\2\2"+
		"\u0726\u072e\5\u009aN\2\u0727\u0728\7\34\2\2\u0728\u0729\5\u00e8u\2\u0729"+
		"\u072a\7\35\2\2\u072a\u072b\5\u009aN\2\u072b\u072d\3\2\2\2\u072c\u0727"+
		"\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f"+
		"\u0733\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0732\7\u00b6\2\2\u0732\u0734"+
		"\5\u009aN\2\u0733\u0731\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0081\3\2\2"+
		"\2\u0735\u0737\5\u00b0Y\2\u0736\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737"+
		"\u0738\3\2\2\2\u0738\u0743\7\u00ae\2\2\u0739\u073a\7\u008c\2\2\u073a\u0744"+
		"\7\u009f\2\2\u073b\u073c\7\u008c\2\2\u073c\u0744\7\62\2\2\u073d\u073e"+
		"\7\u008c\2\2\u073e\u0744\7\u009b\2\2\u073f\u0740\7\u008c\2\2\u0740\u0744"+
		"\7e\2\2\u0741\u0742\7\u008c\2\2\u0742\u0744\7o\2\2\u0743\u0739\3\2\2\2"+
		"\u0743\u073b\3\2\2\2\u0743\u073d\3\2\2\2\u0743\u073f\3\2\2\2\u0743\u0741"+
		"\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0746\5\u00b2Z"+
		"\2\u0746\u0747\7\u00a3\2\2\u0747\u0748\5\u00e8u\2\u0748\u0749\7\35\2\2"+
		"\u0749\u0751\5\u009aN\2\u074a\u074b\7\34\2\2\u074b\u074c\5\u00e8u\2\u074c"+
		"\u074d\7\35\2\2\u074d\u074e\5\u009aN\2\u074e\u0750\3\2\2\2\u074f\u074a"+
		"\3\2\2\2\u0750\u0753\3\2\2\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752"+
		"\u0756\3\2\2\2\u0753\u0751\3\2\2\2\u0754\u0755\7\u00b6\2\2\u0755\u0757"+
		"\5\u009aN\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u076a\3\2\2"+
		"\2\u0758\u0759\7\u008d\2\2\u0759\u075a\7B\2\2\u075a\u075f\5\u00b4[\2\u075b"+
		"\u075c\7\34\2\2\u075c\u075e\5\u00b4[\2\u075d\u075b\3\2\2\2\u075e\u0761"+
		"\3\2\2\2\u075f\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0763\3\2\2\2\u0761"+
		"\u075f\3\2\2\2\u0762\u0758\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0764\3\2"+
		"\2\2\u0764\u0765\7\u0080\2\2\u0765\u0768\5\u009aN\2\u0766\u0767\t\r\2"+
		"\2\u0767\u0769\5\u009aN\2\u0768\u0766\3\2\2\2\u0768\u0769\3\2\2\2\u0769"+
		"\u076b\3\2\2\2\u076a\u0762\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u0083\3\2"+
		"\2\2\u076c\u076d\7\u00b0\2\2\u076d\u0085\3\2\2\2\u076e\u0773\5\u00e8u"+
		"\2\u076f\u0772\5\u008aF\2\u0770\u0772\5\u0088E\2\u0771\u076f\3\2\2\2\u0771"+
		"\u0770\3\2\2\2\u0772\u0775\3\2\2\2\u0773\u0771\3\2\2\2\u0773\u0774\3\2"+
		"\2\2\u0774\u0087\3\2\2\2\u0775\u0773\3\2\2\2\u0776\u078a\5\u00dan\2\u0777"+
		"\u0778\7\32\2\2\u0778\u077a\5\u00caf\2\u0779\u077b\5\u0104\u0083\2\u077a"+
		"\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\7\33"+
		"\2\2\u077d\u078b\3\2\2\2\u077e\u077f\7\32\2\2\u077f\u0781\5\u00caf\2\u0780"+
		"\u0782\5\u0104\u0083\2\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0783"+
		"\3\2\2\2\u0783\u0784\7\34\2\2\u0784\u0786\5\u00caf\2\u0785\u0787\5\u0104"+
		"\u0083\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\3\2\2\2\u0788"+
		"\u0789\7\33\2\2\u0789\u078b\3\2\2\2\u078a\u0777\3\2\2\2\u078a\u077e\3"+
		"\2\2\2\u078a\u078b\3\2\2\2\u078b\u0089\3\2\2\2\u078c\u078d\7K\2\2\u078d"+
		"\u078f\5\u00dan\2\u078e\u078c\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u079e"+
		"\3\2\2\2\u0790\u079f\5\u008cG\2\u0791\u079f\5\u008eH\2\u0792\u079f\5\u0090"+
		"I\2\u0793\u079f\5\u0092J\2\u0794\u0795\7\u00ad\2\2\u0795\u079f\5\u0098"+
		"M\2\u0796\u0797\7F\2\2\u0797\u0798\7\32\2\2\u0798\u0799\5\u009aN\2\u0799"+
		"\u079a\7\33\2\2\u079a\u079f\3\2\2\2\u079b\u079f\5\u0094K\2\u079c\u079d"+
		"\7G\2\2\u079d\u079f\5\u00eav\2\u079e\u0790\3\2\2\2\u079e\u0791\3\2\2\2"+
		"\u079e\u0792\3\2\2\2\u079e\u0793\3\2\2\2\u079e\u0794\3\2\2\2\u079e\u0796"+
		"\3\2\2\2\u079e\u079b\3\2\2\2\u079e\u079c\3\2\2\2\u079f\u008b\3\2\2\2\u07a0"+
		"\u07a1\7\u0091\2\2\u07a1\u07a3\7}\2\2\u07a2\u07a4\t\20\2\2\u07a3\u07a2"+
		"\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a7\5\u0098M"+
		"\2\u07a6\u07a8\7=\2\2\u07a7\u07a6\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u008d"+
		"\3\2\2\2\u07a9\u07aa\5\u009cO\2\u07aa\u008f\3\2\2\2\u07ab\u07ac\7\u0085"+
		"\2\2\u07ac\u07ad\7\u0087\2\2\u07ad\u07ae\5\u0098M\2\u07ae\u0091\3\2\2"+
		"\2\u07af\u07b0\7\u0087\2\2\u07b0\u07b1\5\u0098M\2\u07b1\u0093\3\2\2\2"+
		"\u07b2\u07be\7S\2\2\u07b3\u07bf\5\u0096L\2\u07b4\u07b5\7\32\2\2\u07b5"+
		"\u07b6\5\u009aN\2\u07b6\u07b7\7\33\2\2\u07b7\u07bf\3\2\2\2\u07b8\u07b9"+
		"\7\u0083\2\2\u07b9\u07ba\7\32\2\2\u07ba\u07bb\5\u009aN\2\u07bb\u07bc\7"+
		"\33\2\2\u07bc\u07bf\3\2\2\2\u07bd\u07bf\5\u0104\u0083\2\u07be\u07b3\3"+
		"\2\2\2\u07be\u07b4\3\2\2\2\u07be\u07b8\3\2\2\2\u07be\u07bd\3\2\2\2\u07bf"+
		"\u07c6\3\2\2\2\u07c0\u07c2\7\27\2\2\u07c1\u07c3\5\u0104\u0083\2\u07c2"+
		"\u07c1\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2"+
		"\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07c0\3\2\2\2\u07c6\u07c7\3\2\2\2\u07c7"+
		"\u0095\3\2\2\2\u07c8\u07cb\5\u00caf\2\u07c9\u07cb\5\u00ccg\2\u07ca\u07c8"+
		"\3\2\2\2\u07ca\u07c9\3\2\2\2\u07cb\u0097\3\2\2\2\u07cc\u07cd\7\u008a\2"+
		"\2\u07cd\u07ce\7J\2\2\u07ce\u07d0\t\21\2\2\u07cf\u07cc\3\2\2\2\u07cf\u07d0"+
		"\3\2\2\2\u07d0\u0099\3\2\2\2\u07d1\u07d2\bN\1\2\u07d2\u081f\5\u00ccg\2"+
		"\u07d3\u081f\7\u00be\2\2\u07d4\u07d5\5\u00dep\2\u07d5\u07d6\7\31\2\2\u07d6"+
		"\u07d8\3\2\2\2\u07d7\u07d4\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d9\3\2"+
		"\2\2\u07d9\u07da\5\u00e2r\2\u07da\u07db\7\31\2\2\u07db\u07dd\3\2\2\2\u07dc"+
		"\u07d7\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07de\3\2\2\2\u07de\u081f\5\u00e8"+
		"u\2\u07df\u07e0\5\u00ceh\2\u07e0\u07e1\5\u009aN\30\u07e1\u081f\3\2\2\2"+
		"\u07e2\u07e3\5\u00dco\2\u07e3\u07f0\7\32\2\2\u07e4\u07e6\7Y\2\2\u07e5"+
		"\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07ec\5\u009a"+
		"N\2\u07e8\u07e9\7\34\2\2\u07e9\u07eb\5\u009aN\2\u07ea\u07e8\3\2\2\2\u07eb"+
		"\u07ee\3\2\2\2\u07ec\u07ea\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07f1\3\2"+
		"\2\2\u07ee\u07ec\3\2\2\2\u07ef\u07f1\7\36\2\2\u07f0\u07e5\3\2\2\2\u07f0"+
		"\u07ef\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f3\7\33"+
		"\2\2\u07f3\u081f\3\2\2\2\u07f4\u07f5\7\32\2\2\u07f5\u07f6\5\u009aN\2\u07f6"+
		"\u07f7\7\33\2\2\u07f7\u081f\3\2\2\2\u07f8\u07f9\7E\2\2\u07f9\u07fa\7\32"+
		"\2\2\u07fa\u07fb\5\u009aN\2\u07fb\u07fc\7:\2\2\u07fc\u07fd\5\u0088E\2"+
		"\u07fd\u07fe\7\33\2\2\u07fe\u081f\3\2\2\2\u07ff\u0801\7\u0085\2\2\u0800"+
		"\u07ff\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0804\7c"+
		"\2\2\u0803\u0800\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u0805\3\2\2\2\u0805"+
		"\u0806\7\32\2\2\u0806\u0807\5|?\2\u0807\u0808\7\33\2\2\u0808\u081f\3\2"+
		"\2\2\u0809\u080b\7D\2\2\u080a\u080c\5\u009aN\2\u080b\u080a\3\2\2\2\u080b"+
		"\u080c\3\2\2\2\u080c\u0812\3\2\2\2\u080d\u080e\7\u00b5\2\2\u080e\u080f"+
		"\5\u009aN\2\u080f\u0810\7\u00a8\2\2\u0810\u0811\5\u009aN\2\u0811\u0813"+
		"\3\2\2\2\u0812\u080d\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0812\3\2\2\2\u0814"+
		"\u0815\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0817\7]\2\2\u0817\u0819\5\u009a"+
		"N\2\u0818\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u081b\7^\2\2\u081b\u081f\3\2\2\2\u081c\u081f\5\u00a0Q\2\u081d\u081f\5"+
		"\6\4\2\u081e\u07d1\3\2\2\2\u081e\u07d3\3\2\2\2\u081e\u07dc\3\2\2\2\u081e"+
		"\u07df\3\2\2\2\u081e\u07e2\3\2\2\2\u081e\u07f4\3\2\2\2\u081e\u07f8\3\2"+
		"\2\2\u081e\u0803\3\2\2\2\u081e\u0809\3\2\2\2\u081e\u081c\3\2\2\2\u081e"+
		"\u081d\3\2\2\2\u081f\u0884\3\2\2\2\u0820\u0821\f\27\2\2\u0821\u0822\7"+
		"\"\2\2\u0822\u0883\5\u009aN\30\u0823\u0824\f\26\2\2\u0824\u0825\t\2\2"+
		"\2\u0825\u0883\5\u009aN\27\u0826\u0827\f\25\2\2\u0827\u0828\t\3\2\2\u0828"+
		"\u0883\5\u009aN\26\u0829\u082a\f\24\2\2\u082a\u082b\t\22\2\2\u082b\u0883"+
		"\5\u009aN\25\u082c\u082d\f\23\2\2\u082d\u082e\t\5\2\2\u082e\u0883\5\u009a"+
		"N\24\u082f\u083c\f\22\2\2\u0830\u083d\7\35\2\2\u0831\u083d\7-\2\2\u0832"+
		"\u083d\7.\2\2\u0833\u083d\7/\2\2\u0834\u083d\7z\2\2\u0835\u0836\7z\2\2"+
		"\u0836\u083d\7\u0085\2\2\u0837\u083d\7q\2\2\u0838\u083d\7\177\2\2\u0839"+
		"\u083d\7k\2\2\u083a\u083d\7\u0081\2\2\u083b\u083d\7\u0097\2\2\u083c\u0830"+
		"\3\2\2\2\u083c\u0831\3\2\2\2\u083c\u0832\3\2\2\2\u083c\u0833\3\2\2\2\u083c"+
		"\u0834\3\2\2\2\u083c\u0835\3\2\2\2\u083c\u0837\3\2\2\2\u083c\u0838\3\2"+
		"\2\2\u083c\u0839\3\2\2\2\u083c\u083a\3\2\2\2\u083c\u083b\3\2\2\2\u083d"+
		"\u083e\3\2\2\2\u083e\u0883\5\u009aN\23\u083f\u0840\f\21\2\2\u0840\u0841"+
		"\79\2\2\u0841\u0883\5\u009aN\22\u0842\u0843\f\20\2\2\u0843\u0844\7\u008c"+
		"\2\2\u0844\u0883\5\u009aN\21\u0845\u0846\f\t\2\2\u0846\u0848\7z\2\2\u0847"+
		"\u0849\7\u0085\2\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a"+
		"\3\2\2\2\u084a\u0883\5\u009aN\n\u084b\u084d\f\b\2\2\u084c\u084e\7\u0085"+
		"\2\2\u084d\u084c\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f"+
		"\u0850\7@\2\2\u0850\u0851\5\u009aN\2\u0851\u0852\79\2\2\u0852\u0853\5"+
		"\u009aN\t\u0853\u0883\3\2\2\2\u0854\u0855\f\f\2\2\u0855\u0856\7G\2\2\u0856"+
		"\u0883\5\u00eav\2\u0857\u0859\f\13\2\2\u0858\u085a\7\u0085\2\2\u0859\u0858"+
		"\3\2\2\2\u0859\u085a\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\t\23\2\2"+
		"\u085c\u085f\5\u009aN\2\u085d\u085e\7`\2\2\u085e\u0860\5\u009aN\2\u085f"+
		"\u085d\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0883\3\2\2\2\u0861\u0866\f\n"+
		"\2\2\u0862\u0867\7{\2\2\u0863\u0867\7\u0086\2\2\u0864\u0865\7\u0085\2"+
		"\2\u0865\u0867\7\u0087\2\2\u0866\u0862\3\2\2\2\u0866\u0863\3\2\2\2\u0866"+
		"\u0864\3\2\2\2\u0867\u0883\3\2\2\2\u0868\u086a\f\7\2\2\u0869\u086b\7\u0085"+
		"\2\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c"+
		"\u0880\7q\2\2\u086d\u0877\7\32\2\2\u086e\u0878\5|?\2\u086f\u0874\5\u009a"+
		"N\2\u0870\u0871\7\34\2\2\u0871\u0873\5\u009aN\2\u0872\u0870\3\2\2\2\u0873"+
		"\u0876\3\2\2\2\u0874\u0872\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0878\3\2"+
		"\2\2\u0876\u0874\3\2\2\2\u0877\u086e\3\2\2\2\u0877\u086f\3\2\2\2\u0877"+
		"\u0878\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0881\7\33\2\2\u087a\u087b\5"+
		"\u00dep\2\u087b\u087c\7\31\2\2\u087c\u087e\3\2\2\2\u087d\u087a\3\2\2\2"+
		"\u087d\u087e\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0881\5\u00e2r\2\u0880"+
		"\u086d\3\2\2\2\u0880\u087d\3\2\2\2\u0881\u0883\3\2\2\2\u0882\u0820\3\2"+
		"\2\2\u0882\u0823\3\2\2\2\u0882\u0826\3\2\2\2\u0882\u0829\3\2\2\2\u0882"+
		"\u082c\3\2\2\2\u0882\u082f\3\2\2\2\u0882\u083f\3\2\2\2\u0882\u0842\3\2"+
		"\2\2\u0882\u0845\3\2\2\2\u0882\u084b\3\2\2\2\u0882\u0854\3\2\2\2\u0882"+
		"\u0857\3\2\2\2\u0882\u0861\3\2\2\2\u0882\u0868\3\2\2\2\u0883\u0886\3\2"+
		"\2\2\u0884\u0882\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u009b\3\2\2\2\u0886"+
		"\u0884\3\2\2\2\u0887\u088b\7\u0096\2\2\u0888\u0889\5\u00dep\2\u0889\u088a"+
		"\7\31\2\2\u088a\u088c\3\2\2\2\u088b\u0888\3\2\2\2\u088b\u088c\3\2\2\2"+
		"\u088c\u088d\3\2\2\2\u088d\u0899\5\u00ecw\2\u088e\u088f\7\32\2\2\u088f"+
		"\u0894\5\u009eP\2\u0890\u0891\7\34\2\2\u0891\u0893\5\u009eP\2\u0892\u0890"+
		"\3\2\2\2\u0893\u0896\3\2\2\2\u0894\u0892\3\2\2\2\u0894\u0895\3\2\2\2\u0895"+
		"\u0897\3\2\2\2\u0896\u0894\3\2\2\2\u0897\u0898\7\33\2\2\u0898\u089a\3"+
		"\2\2\2\u0899\u088e\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u08ad\3\2\2\2\u089b"+
		"\u089c\7\u008a\2\2\u089c\u08a5\t\24\2\2\u089d\u089e\7\u00a3\2\2\u089e"+
		"\u08a6\7\u0087\2\2\u089f\u08a0\7\u00a3\2\2\u08a0\u08a6\7S\2\2\u08a1\u08a6"+
		"\7C\2\2\u08a2\u08a6\7\u009c\2\2\u08a3\u08a4\7\u0084\2\2\u08a4\u08a6\7"+
		"\63\2\2\u08a5\u089d\3\2\2\2\u08a5\u089f\3\2\2\2\u08a5\u08a1\3\2\2\2\u08a5"+
		"\u08a2\3\2\2\2\u08a5\u08a3\3\2\2\2\u08a6\u08aa\3\2\2\2\u08a7\u08a8\7\u0081"+
		"\2\2\u08a8\u08aa\5\u00dan\2\u08a9\u089b\3\2\2\2\u08a9\u08a7\3\2\2\2\u08aa"+
		"\u08ac\3\2\2\2\u08ab\u08a9\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2"+
		"\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08bd\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0"+
		"\u08b2\7\u0085\2\2\u08b1\u08b0\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3"+
		"\3\2\2\2\u08b3\u08b8\7T\2\2\u08b4\u08b5\7t\2\2\u08b5\u08b9\7U\2\2\u08b6"+
		"\u08b7\7t\2\2\u08b7\u08b9\7p\2\2\u08b8\u08b4\3\2\2\2\u08b8\u08b6\3\2\2"+
		"\2\u08b8\u08b9\3\2\2\2\u08b9\u08bb\3\2\2\2\u08ba\u08bc\7_\2\2\u08bb\u08ba"+
		"\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08be\3\2\2\2\u08bd\u08b1\3\2\2\2\u08bd"+
		"\u08be\3\2\2\2\u08be\u009d\3\2\2\2\u08bf\u08c0\5\u00dan\2\u08c0\u009f"+
		"\3\2\2\2\u08c1\u08c2\7\u0094\2\2\u08c2\u08c7\7\32\2\2\u08c3\u08c8\7o\2"+
		"\2\u08c4\u08c5\t\25\2\2\u08c5\u08c6\7\34\2\2\u08c6\u08c8\5\u00d0i\2\u08c7"+
		"\u08c3\3\2\2\2\u08c7\u08c4\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\7\33"+
		"\2\2\u08ca\u00a1\3\2\2\2\u08cb\u08ce\5\u00e8u\2\u08cc\u08cd\7G\2\2\u08cd"+
		"\u08cf\5\u00eav\2\u08ce\u08cc\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d1"+
		"\3\2\2\2\u08d0\u08d2";
	private static final String _serializedATNSegment1 =
		"\t\20\2\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u00a3\3\2\2\2"+
		"\u08d3\u08d4\7K\2\2\u08d4\u08d6\5\u00dan\2\u08d5\u08d3\3\2\2\2\u08d5\u08d6"+
		"\3\2\2\2\u08d6\u08e0\3\2\2\2\u08d7\u08e1\5\u00a6T\2\u08d8\u08e1\5\u00ac"+
		"W\2\u08d9\u08e1\5\u00aaV\2\u08da\u08db\7F\2\2\u08db\u08dc\7\32\2\2\u08dc"+
		"\u08dd\5\u009aN\2\u08dd\u08de\7\33\2\2\u08de\u08e1\3\2\2\2\u08df\u08e1"+
		"\5\u00a8U\2\u08e0\u08d7\3\2\2\2\u08e0\u08d8\3\2\2\2\u08e0\u08d9\3\2\2"+
		"\2\u08e0\u08da\3\2\2\2\u08e0\u08df\3\2\2\2\u08e1\u00a5\3\2\2\2\u08e2\u08e3"+
		"\7\u0091\2\2\u08e3\u08e4\7}\2\2\u08e4\u08e5\7\32\2\2\u08e5\u08ea\5\u00a2"+
		"R\2\u08e6\u08e7\7\34\2\2\u08e7\u08e9\5\u00a2R\2\u08e8\u08e6\3\2\2\2\u08e9"+
		"\u08ec\3\2\2\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ed\3\2"+
		"\2\2\u08ec\u08ea\3\2\2\2\u08ed\u08ee\7\33\2\2\u08ee\u08ef\5\u0098M\2\u08ef"+
		"\u00a7\3\2\2\2\u08f0\u08f1\7g\2\2\u08f1\u08f2\7}\2\2\u08f2\u08f3\7\32"+
		"\2\2\u08f3\u08f8\5\u00aeX\2\u08f4\u08f5\7\34\2\2\u08f5\u08f7\5\u00aeX"+
		"\2\u08f6\u08f4\3\2\2\2\u08f7\u08fa\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f8\u08f9"+
		"\3\2\2\2\u08f9\u08fb\3\2\2\2\u08fa\u08f8\3\2\2\2\u08fb\u08fc\7\33\2\2"+
		"\u08fc\u08fd\5\u009cO\2\u08fd\u00a9\3\2\2\2\u08fe\u0900\7\u00ad\2\2\u08ff"+
		"\u0901\7}\2\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0903\3\2"+
		"\2\2\u0902\u0904\5\u00dan\2\u0903\u0902\3\2\2\2\u0903\u0904\3\2\2\2\u0904"+
		"\u0905\3\2\2\2\u0905\u0906\7\32\2\2\u0906\u090b\5\u00a2R\2\u0907\u0908"+
		"\7\34\2\2\u0908\u090a\5\u00a2R\2\u0909\u0907\3\2\2\2\u090a\u090d\3\2\2"+
		"\2\u090b\u0909\3\2\2\2\u090b\u090c\3\2\2\2\u090c\u090e\3\2\2\2\u090d\u090b"+
		"\3\2\2\2\u090e\u090f\7\33\2\2\u090f\u0910\5\u0098M\2\u0910\u00ab\3\2\2"+
		"\2\u0911\u0913\7}\2\2\u0912\u0914\5\u00dan\2\u0913\u0912\3\2\2\2\u0913"+
		"\u0914\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916\7\32\2\2\u0916\u091b\5"+
		"\u00a2R\2\u0917\u0918\7\34\2\2\u0918\u091a\5\u00a2R\2\u0919\u0917\3\2"+
		"\2\2\u091a\u091d\3\2\2\2\u091b\u0919\3\2\2\2\u091b\u091c\3\2\2\2\u091c"+
		"\u091e\3\2\2\2\u091d\u091b\3\2\2\2\u091e\u091f\7\33\2\2\u091f\u0920\5"+
		"\u0098M\2\u0920\u00ad\3\2\2\2\u0921\u0922\5\u00e8u\2\u0922\u00af\3\2\2"+
		"\2\u0923\u0925\7\u00b8\2\2\u0924\u0926\7\u0095\2\2\u0925\u0924\3\2\2\2"+
		"\u0925\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\5\u00c8e\2\u0928"+
		"\u0929\7:\2\2\u0929\u092a\7\32\2\2\u092a\u092b\5|?\2\u092b\u0935\7\33"+
		"\2\2\u092c\u092d\7\34\2\2\u092d\u092e\5\u00c8e\2\u092e\u092f\7:\2\2\u092f"+
		"\u0930\7\32\2\2\u0930\u0931\5|?\2\u0931\u0932\7\33\2\2\u0932\u0934\3\2"+
		"\2\2\u0933\u092c\3\2\2\2\u0934\u0937\3\2\2\2\u0935\u0933\3\2\2\2\u0935"+
		"\u0936\3\2\2\2\u0936\u00b1\3\2\2\2\u0937\u0935\3\2\2\2\u0938\u0939\5\u00de"+
		"p\2\u0939\u093a\7\31\2\2\u093a\u093c\3\2\2\2\u093b\u0938\3\2\2\2\u093b"+
		"\u093c\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u0943\5\u00e2r\2\u093e\u093f"+
		"\7s\2\2\u093f\u0940\7B\2\2\u0940\u0944\5\u00eex\2\u0941\u0942\7\u0085"+
		"\2\2\u0942\u0944\7s\2\2\u0943\u093e\3\2\2\2\u0943\u0941\3\2\2\2\u0943"+
		"\u0944\3\2\2\2\u0944\u00b3\3\2\2\2\u0945\u0948\5\u009aN\2\u0946\u0947"+
		"\7G\2\2\u0947\u0949\5\u00eav\2\u0948\u0946\3\2\2\2\u0948\u0949\3\2\2\2"+
		"\u0949\u094b\3\2\2\2\u094a\u094c\t\20\2\2\u094b\u094a\3\2\2\2\u094b\u094c"+
		"\3\2\2\2\u094c\u00b5\3\2\2\2\u094d\u0951\5\u00caf\2\u094e\u0951\5\u00da"+
		"n\2\u094f\u0951\7\u00bf\2\2\u0950\u094d\3\2\2\2\u0950\u094e\3\2\2\2\u0950"+
		"\u094f\3\2\2\2\u0951\u00b7\3\2\2\2\u0952\u095e\5\u00e2r\2\u0953\u0954"+
		"\7\32\2\2\u0954\u0959\5\u00e8u\2\u0955\u0956\7\34\2\2\u0956\u0958\5\u00e8"+
		"u\2\u0957\u0955\3\2\2\2\u0958\u095b\3\2\2\2\u0959\u0957\3\2\2\2\u0959"+
		"\u095a\3\2\2\2\u095a\u095c\3\2\2\2\u095b\u0959\3\2\2\2\u095c\u095d\7\33"+
		"\2\2\u095d\u095f\3\2\2\2\u095e\u0953\3\2\2\2\u095e\u095f\3\2\2\2\u095f"+
		"\u0960\3\2\2\2\u0960\u0961\7:\2\2\u0961\u0962\7\32\2\2\u0962\u0963\5|"+
		"?\2\u0963\u0964\7\33\2\2\u0964\u00b9\3\2\2\2\u0965\u0972\7\36\2\2\u0966"+
		"\u0967\5\u00e2r\2\u0967\u0968\7\31\2\2\u0968\u0969\7\36\2\2\u0969\u0972"+
		"\3\2\2\2\u096a\u096f\5\u009aN\2\u096b\u096d\7:\2\2\u096c\u096b\3\2\2\2"+
		"\u096c\u096d\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u0970\5\u00d4k\2\u096f"+
		"\u096c\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0972\3\2\2\2\u0971\u0965\3\2"+
		"\2\2\u0971\u0966\3\2\2\2\u0971\u096a\3\2\2\2\u0972\u00bb\3\2\2\2\u0973"+
		"\u0974\5\u00dep\2\u0974\u0975\7\31\2\2\u0975\u0977\3\2\2\2\u0976\u0973"+
		"\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u097d\5\u00e2r"+
		"\2\u0979\u097b\7:\2\2\u097a\u0979\3\2\2\2\u097a\u097b\3\2\2\2\u097b\u097c"+
		"\3\2\2\2\u097c\u097e\5\u00fa~\2\u097d\u097a\3\2\2\2\u097d\u097e\3\2\2"+
		"\2\u097e\u0984\3\2\2\2\u097f\u0980\7s\2\2\u0980\u0981\7B\2\2\u0981\u0985"+
		"\5\u00eex\2\u0982\u0983\7\u0085\2\2\u0983\u0985\7s\2\2\u0984\u097f\3\2"+
		"\2\2\u0984\u0982\3\2\2\2\u0984\u0985\3\2\2\2\u0985\u09a3\3\2\2\2\u0986"+
		"\u0990\7\32\2\2\u0987\u098c\5\u00bc_\2\u0988\u0989\7\34\2\2\u0989\u098b"+
		"\5\u00bc_\2\u098a\u0988\3\2\2\2\u098b\u098e\3\2\2\2\u098c\u098a\3\2\2"+
		"\2\u098c\u098d\3\2\2\2\u098d\u0991\3\2\2\2\u098e\u098c\3\2\2\2\u098f\u0991"+
		"\5\u00be`\2\u0990\u0987\3\2\2\2\u0990\u098f\3\2\2\2\u0991\u0992\3\2\2"+
		"\2\u0992\u0997\7\33\2\2\u0993\u0995\7:\2\2\u0994\u0993\3\2\2\2\u0994\u0995"+
		"\3\2\2\2\u0995\u0996\3\2\2\2\u0996\u0998\5\u00fa~\2\u0997\u0994\3\2\2"+
		"\2\u0997\u0998\3\2\2\2\u0998\u09a3\3\2\2\2\u0999\u099a\7\32\2\2\u099a"+
		"\u099b\5|?\2\u099b\u09a0\7\33\2\2\u099c\u099e\7:\2\2\u099d\u099c\3\2\2"+
		"\2\u099d\u099e\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a1\5\u00fa~\2\u09a0"+
		"\u099d\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a3\3\2\2\2\u09a2\u0976\3\2"+
		"\2\2\u09a2\u0986\3\2\2\2\u09a2\u0999\3\2\2\2\u09a3\u00bd\3\2\2\2\u09a4"+
		"\u09ab\5\u00bc_\2\u09a5\u09a6\5\u00c0a\2\u09a6\u09a7\5\u00bc_\2\u09a7"+
		"\u09a8\5\u00c2b\2\u09a8\u09aa\3\2\2\2\u09a9\u09a5\3\2\2\2\u09aa\u09ad"+
		"\3\2\2\2\u09ab\u09a9\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u00bf\3\2\2\2\u09ad"+
		"\u09ab\3\2\2\2\u09ae\u09bc\7\34\2\2\u09af\u09b1\7\u0082\2\2\u09b0\u09af"+
		"\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b8\3\2\2\2\u09b2\u09b4\7~\2\2\u09b3"+
		"\u09b5\7\u008e\2\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b9"+
		"\3\2\2\2\u09b6\u09b9\7u\2\2\u09b7\u09b9\7N\2\2\u09b8\u09b2\3\2\2\2\u09b8"+
		"\u09b6\3\2\2\2\u09b8\u09b7\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2"+
		"\2\2\u09ba\u09bc\7|\2\2\u09bb\u09ae\3\2\2\2\u09bb\u09b0\3\2\2\2\u09bc"+
		"\u00c1\3\2\2\2\u09bd\u09be\7\u008a\2\2\u09be\u09cc\5\u009aN\2\u09bf\u09c0"+
		"\7\u00af\2\2\u09c0\u09c1\7\32\2\2\u09c1\u09c6\5\u00e8u\2\u09c2\u09c3\7"+
		"\34\2\2\u09c3\u09c5\5\u00e8u\2\u09c4\u09c2\3\2\2\2\u09c5\u09c8\3\2\2\2"+
		"\u09c6\u09c4\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09c9\3\2\2\2\u09c8\u09c6"+
		"\3\2\2\2\u09c9\u09ca\7\33\2\2\u09ca\u09cc\3\2\2\2\u09cb\u09bd\3\2\2\2"+
		"\u09cb\u09bf\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u00c3\3\2\2\2\u09cd\u09cf"+
		"\7\u00a2\2\2\u09ce\u09d0\t\17\2\2\u09cf\u09ce\3\2\2\2\u09cf\u09d0\3\2"+
		"\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d6\5\u00ba^\2\u09d2\u09d3\7\34\2\2\u09d3"+
		"\u09d5\5\u00ba^\2\u09d4\u09d2\3\2\2\2\u09d5\u09d8\3\2\2\2\u09d6\u09d4"+
		"\3\2\2\2\u09d6\u09d7\3\2\2\2\u09d7\u09e5\3\2\2\2\u09d8\u09d6\3\2\2\2\u09d9"+
		"\u09e3\7h\2\2\u09da\u09df\5\u00bc_\2\u09db\u09dc\7\34\2\2\u09dc\u09de"+
		"\5\u00bc_\2\u09dd\u09db\3\2\2\2\u09de\u09e1\3\2\2\2\u09df\u09dd\3\2\2"+
		"\2\u09df\u09e0\3\2\2\2\u09e0\u09e4\3\2\2\2\u09e1\u09df\3\2\2\2\u09e2\u09e4"+
		"\5\u00be`\2\u09e3\u09da\3\2\2\2\u09e3\u09e2\3\2\2\2\u09e4\u09e6\3\2\2"+
		"\2\u09e5\u09d9\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e9\3\2\2\2\u09e7\u09e8"+
		"\7\u00b6\2\2\u09e8\u09ea\5\u009aN\2\u09e9\u09e7\3\2\2\2\u09e9\u09ea\3"+
		"\2\2\2\u09ea\u09f9\3\2\2\2\u09eb\u09ec\7l\2\2\u09ec\u09ed\7B\2\2\u09ed"+
		"\u09f2\5\u009aN\2\u09ee\u09ef\7\34\2\2\u09ef\u09f1\5\u009aN\2\u09f0\u09ee"+
		"\3\2\2\2\u09f1\u09f4\3\2\2\2\u09f2\u09f0\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3"+
		"\u09f7\3\2\2\2\u09f4\u09f2\3\2\2\2\u09f5\u09f6\7m\2\2\u09f6\u09f8\5\u009a"+
		"N\2\u09f7\u09f5\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09fa\3\2\2\2\u09f9"+
		"\u09eb\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u0a18\3\2\2\2\u09fb\u09fc\7\u00b1"+
		"\2\2\u09fc\u09fd\7\32\2\2\u09fd\u0a02\5\u009aN\2\u09fe\u09ff\7\34\2\2"+
		"\u09ff\u0a01\5\u009aN\2\u0a00\u09fe\3\2\2\2\u0a01\u0a04\3\2\2\2\u0a02"+
		"\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a05\3\2\2\2\u0a04\u0a02\3\2"+
		"\2\2\u0a05\u0a14\7\33\2\2\u0a06\u0a07\7\34\2\2\u0a07\u0a08\7\32\2\2\u0a08"+
		"\u0a0d\5\u009aN\2\u0a09\u0a0a\7\34\2\2\u0a0a\u0a0c\5\u009aN\2\u0a0b\u0a09"+
		"\3\2\2\2\u0a0c\u0a0f\3\2\2\2\u0a0d\u0a0b\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e"+
		"\u0a10\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a10\u0a11\7\33\2\2\u0a11\u0a13\3"+
		"\2\2\2\u0a12\u0a06\3\2\2\2\u0a13\u0a16\3\2\2\2\u0a14\u0a12\3\2\2\2\u0a14"+
		"\u0a15\3\2\2\2\u0a15\u0a18\3\2\2\2\u0a16\u0a14\3\2\2\2\u0a17\u09cd\3\2"+
		"\2\2\u0a17\u09fb\3\2\2\2\u0a18\u00c5\3\2\2\2\u0a19\u0a1f\7\u00ac\2\2\u0a1a"+
		"\u0a1b\7\u00ac\2\2\u0a1b\u0a1f\7\66\2\2\u0a1c\u0a1f\7x\2\2\u0a1d\u0a1f"+
		"\7a\2\2\u0a1e\u0a19\3\2\2\2\u0a1e\u0a1a\3\2\2\2\u0a1e\u0a1c\3\2\2\2\u0a1e"+
		"\u0a1d\3\2\2\2\u0a1f\u00c7\3\2\2\2\u0a20\u0a2c\5\u00e2r\2\u0a21\u0a22"+
		"\7\32\2\2\u0a22\u0a27\5\u00e8u\2\u0a23\u0a24\7\34\2\2\u0a24\u0a26\5\u00e8"+
		"u\2\u0a25\u0a23\3\2\2\2\u0a26\u0a29\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a27"+
		"\u0a28\3\2\2\2\u0a28\u0a2a\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a2a\u0a2b\7\33"+
		"\2\2\u0a2b\u0a2d\3\2\2\2\u0a2c\u0a21\3\2\2\2\u0a2c\u0a2d\3\2\2\2\u0a2d"+
		"\u00c9\3\2\2\2\u0a2e\u0a30\t\3\2\2\u0a2f\u0a2e\3\2\2\2\u0a2f\u0a30\3\2"+
		"\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a34\7\u00bd\2\2\u0a32\u0a34\7\36\2\2"+
		"\u0a33\u0a2f\3\2\2\2\u0a33\u0a32\3\2\2\2\u0a34\u00cb\3\2\2\2\u0a35\u0a36"+
		"\t\26\2\2\u0a36\u00cd\3\2\2\2\u0a37\u0a38\t\27\2\2\u0a38\u00cf\3\2\2\2"+
		"\u0a39\u0a3a\7\u00bf\2\2\u0a3a\u00d1\3\2\2\2\u0a3b\u0a3e\5\u009aN\2\u0a3c"+
		"\u0a3e\5\u0086D\2\u0a3d\u0a3b\3\2\2\2\u0a3d\u0a3c\3\2\2\2\u0a3e\u00d3"+
		"\3\2\2\2\u0a3f\u0a40\t\30\2\2\u0a40\u00d5\3\2\2\2\u0a41\u0a42\t\31\2\2"+
		"\u0a42\u00d7\3\2\2\2\u0a43\u0a45\13\2\2\2\u0a44\u0a43\3\2\2\2\u0a45\u0a46"+
		"\3\2\2\2\u0a46\u0a44\3\2\2\2\u0a46\u0a47\3\2\2\2\u0a47\u00d9\3\2\2\2\u0a48"+
		"\u0a49\5\u0104\u0083\2\u0a49\u00db\3\2\2\2\u0a4a\u0a4b\5\u0104\u0083\2"+
		"\u0a4b\u00dd\3\2\2\2\u0a4c\u0a4d\5\u0104\u0083\2\u0a4d\u00df\3\2\2\2\u0a4e"+
		"\u0a4f\5\u0104\u0083\2\u0a4f\u00e1\3\2\2\2\u0a50\u0a51\5\u0104\u0083\2"+
		"\u0a51\u00e3\3\2\2\2\u0a52\u0a53\5\u0104\u0083\2\u0a53\u00e5\3\2\2\2\u0a54"+
		"\u0a55\5\u0104\u0083\2\u0a55\u00e7\3\2\2\2\u0a56\u0a57\5\u0104\u0083\2"+
		"\u0a57\u00e9\3\2\2\2\u0a58\u0a59\5\u0104\u0083\2\u0a59\u00eb\3\2\2\2\u0a5a"+
		"\u0a5b\5\u0104\u0083\2\u0a5b\u00ed\3\2\2\2\u0a5c\u0a5d\5\u0104\u0083\2"+
		"\u0a5d\u00ef\3\2\2\2\u0a5e\u0a5f\5\u0104\u0083\2\u0a5f\u00f1\3\2\2\2\u0a60"+
		"\u0a61\5\u0104\u0083\2\u0a61\u00f3\3\2\2\2\u0a62\u0a63\5\u0104\u0083\2"+
		"\u0a63\u00f5\3\2\2\2\u0a64\u0a65\5\u0104\u0083\2\u0a65\u00f7\3\2\2\2\u0a66"+
		"\u0a67\5\u0104\u0083\2\u0a67\u00f9\3\2\2\2\u0a68\u0a69\5\u0104\u0083\2"+
		"\u0a69\u00fb\3\2\2\2\u0a6a\u0a6b\5\u0104\u0083\2\u0a6b\u00fd\3\2\2\2\u0a6c"+
		"\u0a6d\5\u0104\u0083\2\u0a6d\u00ff\3\2\2\2\u0a6e\u0a6f\5\u0104\u0083\2"+
		"\u0a6f\u0101\3\2\2\2\u0a70\u0a71\5\u0104\u0083\2\u0a71\u0103\3\2\2\2\u0a72"+
		"\u0a79\7\u00bc\2\2\u0a73\u0a79\7\u00bf\2\2\u0a74\u0a75\7\32\2\2\u0a75"+
		"\u0a76\5\u0104\u0083\2\u0a76\u0a77\7\33\2\2\u0a77\u0a79\3\2\2\2\u0a78"+
		"\u0a72\3\2\2\2\u0a78\u0a73\3\2\2\2\u0a78\u0a74\3\2\2\2\u0a79\u0105\3\2"+
		"\2\2\u0180\u0108\u010a\u010f\u0117\u011e\u0123\u0129\u0130\u0136\u013a"+
		"\u013f\u0143\u0146\u014f\u0156\u015a\u0161\u0164\u0168\u016d\u0171\u0179"+
		"\u017e\u0181\u0186\u0192\u0196\u01a2\u01a7\u01b1\u01b5\u01d2\u01da\u01de"+
		"\u01e2\u01ec\u01f0\u01f3\u01f7\u01fb\u01fd\u0207\u020c\u0211\u0218\u021d"+
		"\u0220\u0227\u023d\u024d\u0251\u025e\u0264\u026c\u0272\u0276\u027f\u028a"+
		"\u0290\u02aa\u02af\u02b3\u02b6\u02ce\u02d0\u02d8\u02de\u02e0\u02e6\u02f6"+
		"\u02fb\u02ff\u0302\u030e\u0312\u0314\u0317\u031b\u031d\u0325\u0329\u032b"+
		"\u0331\u0335\u0338\u033a\u0340\u0345\u034c\u034f\u0358\u035a\u0363\u0366"+
		"\u036c\u0371\u0374\u0377\u0380\u0383\u0389\u038e\u0391\u0394\u039a\u03a0"+
		"\u03a5\u03a8\u03b3\u03bd\u03c0\u03c6\u03cb\u03ce\u03d1\u03dc\u03e0\u03e6"+
		"\u03eb\u03ee\u03f2\u03f8\u03fc\u0402\u0407\u040a\u040c\u0413\u0415\u0435"+
		"\u043a\u043f\u0449\u044c\u044f\u0452\u0463\u0467\u046f\u0473\u0475\u047a"+
		"\u047c\u0480\u0487\u048a\u048f\u0493\u0498\u04a1\u04a4\u04aa\u04ac\u04b0"+
		"\u04b6\u04bb\u04c6\u04cc\u04d0\u04d6\u04db\u04e4\u04e6\u04ec\u04f0\u04f3"+
		"\u04f7\u04fd\u0502\u0509\u0514\u0517\u0519\u051f\u0525\u0529\u0530\u0536"+
		"\u053c\u0542\u0547\u0553\u0558\u0563\u0568\u056b\u0572\u0575\u057b\u057f"+
		"\u0588\u058b\u0591\u0593\u0597\u059f\u05a4\u05ac\u05b1\u05b9\u05be\u05c6"+
		"\u05cb\u05d1\u05d8\u05db\u05e3\u05ed\u05f0\u05f6\u05f8\u05fb\u060e\u0614"+
		"\u061d\u0622\u062b\u0636\u063d\u0643\u0649\u0652\u0659\u065d\u065f\u0663"+
		"\u066a\u066c\u0670\u0673\u067a\u0681\u0684\u068e\u0691\u0697\u0699\u069d"+
		"\u06a4\u06a7\u06af\u06b9\u06bc\u06c2\u06c4\u06c8\u06cf\u06d8\u06dc\u06de"+
		"\u06e2\u06eb\u06f0\u06f2\u06fb\u0706\u070d\u0710\u0713\u0720\u072e\u0733"+
		"\u0736\u0743\u0751\u0756\u075f\u0762\u0768\u076a\u0771\u0773\u077a\u0781"+
		"\u0786\u078a\u078e\u079e\u07a3\u07a7\u07be\u07c4\u07c6\u07ca\u07cf\u07d7"+
		"\u07dc\u07e5\u07ec\u07f0\u0800\u0803\u080b\u0814\u0818\u081e\u083c\u0848"+
		"\u084d\u0859\u085f\u0866\u086a\u0874\u0877\u087d\u0880\u0882\u0884\u088b"+
		"\u0894\u0899\u08a5\u08a9\u08ad\u08b1\u08b8\u08bb\u08bd\u08c7\u08ce\u08d1"+
		"\u08d5\u08e0\u08ea\u08f8\u0900\u0903\u090b\u0913\u091b\u0925\u0935\u093b"+
		"\u0943\u0948\u094b\u0950\u0959\u095e\u096c\u096f\u0971\u0976\u097a\u097d"+
		"\u0984\u098c\u0990\u0994\u0997\u099d\u09a0\u09a2\u09ab\u09b0\u09b4\u09b8"+
		"\u09bb\u09c6\u09cb\u09cf\u09d6\u09df\u09e3\u09e5\u09e9\u09f2\u09f7\u09f9"+
		"\u0a02\u0a0d\u0a14\u0a17\u0a1e\u0a27\u0a2c\u0a2f\u0a33\u0a3d\u0a46\u0a78";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}