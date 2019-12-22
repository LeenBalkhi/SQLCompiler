// Generated from C:/Users/Dell/Desktop/SQL Compiler/SQL Compiler\Sql.g4 by ANTLR 4.7.2
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
		T__17=18, T__18=19, T__19=20, T__20=21, SCOL=22, DOT=23, OPEN_PAR=24, 
		CLOSE_PAR=25, COMMA=26, ASSIGN=27, STAR=28, PLUS=29, MINUS=30, TILDE=31, 
		PIPE2=32, DIV=33, MOD=34, LT2=35, GT2=36, AMP=37, PIPE=38, LT=39, LT_EQ=40, 
		GT=41, GT_EQ=42, EQ=43, NOT_EQ1=44, NOT_EQ2=45, DOTS=46, K_ABORT=47, K_ACTION=48, 
		K_ADD=49, K_AFTER=50, K_ALL=51, K_ALTER=52, K_ANALYZE=53, K_AND=54, K_AS=55, 
		K_ASC=56, K_ATTACH=57, K_AUTOINCREMENT=58, K_BEFORE=59, K_BEGIN=60, K_BETWEEN=61, 
		K_BREAK=62, K_BY=63, K_CASCADE=64, K_CASE=65, K_CAST=66, K_CHECK=67, K_COLLATE=68, 
		K_COLUMN=69, K_COMMIT=70, K_CONFLICT=71, K_CONSTRAINT=72, K_CONTINUE=73, 
		K_CREATE=74, K_CROSS=75, K_CURRENT_DATE=76, K_CURRENT_TIME=77, K_CURRENT_TIMESTAMP=78, 
		K_DATABASE=79, K_DEFAULT=80, K_DEFERRABLE=81, K_DEFERRED=82, K_DELETE=83, 
		K_DESC=84, K_DETACH=85, K_DISTINCT=86, K_DO=87, K_DROP=88, K_EACH=89, 
		K_ELSE=90, K_END=91, K_ENABLE=92, K_ESCAPE=93, K_EXCEPT=94, K_EXCLUSIVE=95, 
		K_EXISTS=96, K_EXPLAIN=97, K_FAIL=98, K_FOR=99, K_FOREIGN=100, K_FROM=101, 
		K_FULL=102, K_GLOB=103, K_GROUP=104, K_HAVING=105, K_IF=106, K_IGNORE=107, 
		K_IMMEDIATE=108, K_IN=109, K_INDEX=110, K_INDEXED=111, K_INITIALLY=112, 
		K_INNER=113, K_INSERT=114, K_INSTEAD=115, K_INTERSECT=116, K_INTO=117, 
		K_IS=118, K_ISNULL=119, K_JOIN=120, K_KEY=121, K_LEFT=122, K_LIKE=123, 
		K_LIMIT=124, K_MATCH=125, K_NATURAL=126, K_NEXTVAL=127, K_NO=128, K_NOT=129, 
		K_NOTNULL=130, K_NULL=131, K_OF=132, K_OFFSET=133, K_ON=134, K_ONLY=135, 
		K_OR=136, K_ORDER=137, K_OUTER=138, K_PLAN=139, K_PRAGMA=140, K_PRIMARY=141, 
		K_PRINT=142, K_QUERY=143, K_RAISE=144, K_RECURSIVE=145, K_REFERENCES=146, 
		K_REGEXP=147, K_REINDEX=148, K_RELEASE=149, K_RENAME=150, K_REPLACE=151, 
		K_RESTRICT=152, K_RETURN=153, K_RIGHT=154, K_ROLLBACK=155, K_ROW=156, 
		K_SAVEPOINT=157, K_SELECT=158, K_SET=159, K_SWITCH=160, K_TABLE=161, K_TEMP=162, 
		K_TEMPORARY=163, K_THEN=164, K_TO=165, K_TRANSACTION=166, K_TRIGGER=167, 
		K_UNION=168, K_UNIQUE=169, K_UPDATE=170, K_USING=171, K_VACUUM=172, K_VALUES=173, 
		K_VIEW=174, K_VIRTUAL=175, K_VAR=176, K_WHEN=177, K_WHERE=178, K_WHILE=179, 
		K_WITH=180, K_WITHOUT=181, K_TRUE=182, K_FALSE=183, IDENTIFIER=184, NUMERIC_LITERAL=185, 
		BIND_PARAMETER=186, STRING_LITERAL=187, BLOB_LITERAL=188, SINGLE_LINE_COMMENT=189, 
		MULTILINE_COMMENT=190, SPACES=191, UNEXPECTED_CHAR=192, DIGIT=193;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_variable = 3, 
		RULE_default_parameter = 4, RULE_parameter_list = 5, RULE_argument_list = 6, 
		RULE_java_function_call = 7, RULE_higher_order_function = 8, RULE_return_stmt = 9, 
		RULE_java_function = 10, RULE_java_stmt = 11, RULE_java_stmt_within_loop = 12, 
		RULE_variable_identification = 13, RULE_array_identification = 14, RULE_json_object = 15, 
		RULE_print = 16, RULE_logical_expression = 17, RULE_logical_condition = 18, 
		RULE_increment = 19, RULE_assignment_operator = 20, RULE_block = 21, RULE_loop_block = 22, 
		RULE_one_line_block = 23, RULE_conditional_stmt_one_line_block_within_loop = 24, 
		RULE_conditional_stmt_block_within_loop = 25, RULE_if_stmt = 26, RULE_else_if_stmt = 27, 
		RULE_else_stmt = 28, RULE_if_stmt_within_loop = 29, RULE_else_if_stmt_within_loop = 30, 
		RULE_else_stmt_within_loop = 31, RULE_conditional_stmt_within_loop = 32, 
		RULE_conditional_stmt = 33, RULE_loop_stmt = 34, RULE_for_loop = 35, RULE_while_loop = 36, 
		RULE_do_while_loop = 37, RULE_for_each_loop = 38, RULE_switch_stmt = 39, 
		RULE_sql_stmt = 40, RULE_alter_table_stmt = 41, RULE_alter_table_add_constraint = 42, 
		RULE_alter_table_add = 43, RULE_analyze_stmt = 44, RULE_attach_stmt = 45, 
		RULE_begin_stmt = 46, RULE_commit_stmt = 47, RULE_compound_select_stmt = 48, 
		RULE_create_index_stmt = 49, RULE_create_table_stmt = 50, RULE_create_trigger_stmt = 51, 
		RULE_create_view_stmt = 52, RULE_create_virtual_table_stmt = 53, RULE_delete_stmt = 54, 
		RULE_delete_stmt_limited = 55, RULE_detach_stmt = 56, RULE_drop_index_stmt = 57, 
		RULE_drop_table_stmt = 58, RULE_drop_trigger_stmt = 59, RULE_drop_view_stmt = 60, 
		RULE_factored_select_stmt = 61, RULE_insert_stmt = 62, RULE_pragma_stmt = 63, 
		RULE_reindex_stmt = 64, RULE_release_stmt = 65, RULE_rollback_stmt = 66, 
		RULE_savepoint_stmt = 67, RULE_simple_select_stmt = 68, RULE_select_stmt = 69, 
		RULE_select_or_values = 70, RULE_update_stmt = 71, RULE_update_stmt_limited = 72, 
		RULE_vacuum_stmt = 73, RULE_column_def = 74, RULE_type_name = 75, RULE_column_constraint = 76, 
		RULE_column_constraint_primary_key = 77, RULE_column_constraint_foreign_key = 78, 
		RULE_column_constraint_not_null = 79, RULE_column_constraint_null = 80, 
		RULE_column_default = 81, RULE_column_default_value = 82, RULE_conflict_clause = 83, 
		RULE_expr = 84, RULE_foreign_key_clause = 85, RULE_fk_target_column_name = 86, 
		RULE_raise_function = 87, RULE_indexed_column = 88, RULE_table_constraint = 89, 
		RULE_table_constraint_primary_key = 90, RULE_table_constraint_foreign_key = 91, 
		RULE_table_constraint_unique = 92, RULE_table_constraint_key = 93, RULE_fk_origin_column_name = 94, 
		RULE_with_clause = 95, RULE_qualified_table_name = 96, RULE_ordering_term = 97, 
		RULE_pragma_value = 98, RULE_common_table_expression = 99, RULE_result_column = 100, 
		RULE_table_or_subquery = 101, RULE_join_clause = 102, RULE_join_operator = 103, 
		RULE_join_constraint = 104, RULE_select_core = 105, RULE_compound_operator = 106, 
		RULE_cte_table_name = 107, RULE_signed_number = 108, RULE_literal_value = 109, 
		RULE_unary_operator = 110, RULE_error_message = 111, RULE_module_argument = 112, 
		RULE_column_alias = 113, RULE_keyword = 114, RULE_unknown = 115, RULE_name = 116, 
		RULE_function_name = 117, RULE_database_name = 118, RULE_source_table_name = 119, 
		RULE_table_name = 120, RULE_table_or_index_name = 121, RULE_new_table_name = 122, 
		RULE_column_name = 123, RULE_collation_name = 124, RULE_foreign_table = 125, 
		RULE_index_name = 126, RULE_trigger_name = 127, RULE_view_name = 128, 
		RULE_module_name = 129, RULE_pragma_name = 130, RULE_savepoint_name = 131, 
		RULE_table_alias = 132, RULE_transaction_name = 133, RULE_method_ID = 134, 
		RULE_any_name = 135;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "variable", "default_parameter", "parameter_list", 
			"argument_list", "java_function_call", "higher_order_function", "return_stmt", 
			"java_function", "java_stmt", "java_stmt_within_loop", "variable_identification", 
			"array_identification", "json_object", "print", "logical_expression", 
			"logical_condition", "increment", "assignment_operator", "block", "loop_block", 
			"one_line_block", "conditional_stmt_one_line_block_within_loop", "conditional_stmt_block_within_loop", 
			"if_stmt", "else_if_stmt", "else_stmt", "if_stmt_within_loop", "else_if_stmt_within_loop", 
			"else_stmt_within_loop", "conditional_stmt_within_loop", "conditional_stmt", 
			"loop_stmt", "for_loop", "while_loop", "do_while_loop", "for_each_loop", 
			"switch_stmt", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", 
			"compound_select_stmt", "create_index_stmt", "create_table_stmt", "create_trigger_stmt", 
			"create_view_stmt", "create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", 
			"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
			"drop_view_stmt", "factored_select_stmt", "insert_stmt", "pragma_stmt", 
			"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
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
			"any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'{'", "'\"'", "'''", "'}'", "'&&'", "'?'", "'++'", 
			"'--'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'<<='", 
			"'>>='", "'>>>='", "'::'", "';'", "'.'", "'('", "')'", "','", "'='", 
			"'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", 
			"'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "SCOL", "DOT", 
			"OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", 
			"TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", 
			"GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "DOTS", "K_ABORT", "K_ACTION", 
			"K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", 
			"K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", 
			"K_BREAK", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
			"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CONTINUE", "K_CREATE", 
			"K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DO", "K_DROP", "K_EACH", "K_ELSE", 
			"K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", 
			"K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
			"K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", 
			"K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", 
			"K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", 
			"K_LIMIT", "K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", 
			"K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", 
			"K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_PRINT", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RETURN", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
			"K_SELECT", "K_SET", "K_SWITCH", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_VAR", "K_WHEN", "K_WHERE", "K_WHILE", "K_WITH", "K_WITHOUT", "K_TRUE", 
			"K_FALSE", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
			"UNEXPECTED_CHAR", "DIGIT"
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Java_functionContext java_function() {
			return getRuleContext(Java_functionContext.class,0);
		}
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_COMMIT - 70)) | (1L << (K_CREATE - 70)) | (1L << (K_DELETE - 70)) | (1L << (K_DETACH - 70)) | (1L << (K_DROP - 70)) | (1L << (K_END - 70)) | (1L << (K_EXPLAIN - 70)) | (1L << (K_INSERT - 70)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_PRAGMA - 140)) | (1L << (K_REINDEX - 140)) | (1L << (K_RELEASE - 140)) | (1L << (K_REPLACE - 140)) | (1L << (K_ROLLBACK - 140)) | (1L << (K_SAVEPOINT - 140)) | (1L << (K_SELECT - 140)) | (1L << (K_UPDATE - 140)) | (1L << (K_VACUUM - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_WITH - 140)) | (1L << (UNEXPECTED_CHAR - 140)))) != 0)) {
					{
					setState(274);
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
						setState(272);
						sql_stmt_list();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(273);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				variable();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL) {
					{
					{
					setState(281);
					match(SCOL);
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				java_function();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL) {
					{
					{
					setState(288);
					match(SCOL);
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				higher_order_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
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
			setState(299);
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
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(302);
				match(SCOL);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			sql_stmt();
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(309);
						match(SCOL);
						}
						}
						setState(312); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(314);
					sql_stmt();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					match(SCOL);
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public Any_nameContext var_Name;
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
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
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(K_VAR);
			setState(327);
			((VariableContext)_localctx).var_Name = any_name();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(328);
				match(ASSIGN);
				setState(329);
				sql_stmt_list();
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

	public static class Default_parameterContext extends ParserRuleContext {
		public Any_nameContext default_Parameter_Name;
		public Signed_numberContext default_Parameter_Value;
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
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
			setState(332);
			match(K_VAR);
			setState(333);
			((Default_parameterContext)_localctx).default_Parameter_Name = any_name();
			setState(334);
			match(ASSIGN);
			setState(335);
			((Default_parameterContext)_localctx).default_Parameter_Value = signed_number();
			}
		}
		catch (RecognitionException re) {
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
		public Any_nameContext param;
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
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(337);
				match(K_VAR);
				setState(338);
				((Parameter_listContext)_localctx).param = any_name();
				}
				break;
			}
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					match(COMMA);
					setState(342);
					match(K_VAR);
					setState(343);
					any_name();
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_VAR) {
				{
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(349);
					match(COMMA);
					}
				}

				setState(352);
				default_parameter();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(353);
					match(COMMA);
					setState(354);
					default_parameter();
					}
					}
					setState(359);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(362);
				any_name();
				}
			}

			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(365);
					match(COMMA);
					setState(366);
					any_name();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(372);
			method_ID();
			setState(373);
			match(OPEN_PAR);
			setState(374);
			argument_list();
			setState(375);
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

	public static class Higher_order_functionContext extends ParserRuleContext {
		public Method_IDContext method_ID() {
			return getRuleContext(Method_IDContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Java_functionContext java_function() {
			return getRuleContext(Java_functionContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
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
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(379);
				argument_list();
				setState(380);
				match(COMMA);
				}
				break;
			}
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(384);
				java_function();
				}
			}

			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(387);
				match(COMMA);
				setState(388);
				parameter_list();
				}
			}

			setState(391);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public Logical_conditionContext logical_condition() {
			return getRuleContext(Logical_conditionContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(393);
			match(K_RETURN);
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(394);
				any_name();
				}
				break;
			case 2:
				{
				setState(395);
				java_function_call();
				}
				break;
			case 3:
				{
				setState(396);
				logical_condition();
				}
				break;
			}
			setState(399);
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
		public Method_IDContext funcName;
		public Parameter_listContext parameterList;
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Method_IDContext method_ID() {
			return getRuleContext(Method_IDContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
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
		enterRule(_localctx, 20, RULE_java_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((Java_functionContext)_localctx).funcName = method_ID();
			setState(402);
			match(OPEN_PAR);
			setState(403);
			((Java_functionContext)_localctx).parameterList = parameter_list();
			setState(404);
			match(CLOSE_PAR);
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(405);
				block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(406);
				one_line_block();
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

	public static class Java_stmtContext extends ParserRuleContext {
		public Conditional_stmtContext conditional_stmt() {
			return getRuleContext(Conditional_stmtContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
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
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Variable_identificationContext variable_identification() {
			return getRuleContext(Variable_identificationContext.class,0);
		}
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
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
		enterRule(_localctx, 22, RULE_java_stmt);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				conditional_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				java_function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				loop_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				switch_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				increment();
				setState(414);
				match(SCOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				variable_identification();
				setState(417);
				match(SCOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				higher_order_function();
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

	public static class Java_stmt_within_loopContext extends ParserRuleContext {
		public Conditional_stmt_within_loopContext conditional_stmt_within_loop() {
			return getRuleContext(Conditional_stmt_within_loopContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
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
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Variable_identificationContext variable_identification() {
			return getRuleContext(Variable_identificationContext.class,0);
		}
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
		}
		public Java_stmt_within_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_stmt_within_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJava_stmt_within_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJava_stmt_within_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJava_stmt_within_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_stmt_within_loopContext java_stmt_within_loop() throws RecognitionException {
		Java_stmt_within_loopContext _localctx = new Java_stmt_within_loopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_java_stmt_within_loop);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				conditional_stmt_within_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				java_function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				loop_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				switch_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				increment();
				setState(427);
				match(SCOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				variable_identification();
				setState(430);
				match(SCOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(432);
				higher_order_function();
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

	public static class Variable_identificationContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Json_objectContext json_object() {
			return getRuleContext(Json_objectContext.class,0);
		}
		public Array_identificationContext array_identification() {
			return getRuleContext(Array_identificationContext.class,0);
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
		enterRule(_localctx, 26, RULE_variable_identification);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOL:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case K_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(K_VAR);
				setState(437);
				any_name();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ASSIGN) | (1L << PLUS))) != 0)) {
					{
					setState(438);
					assignment_operator();
					setState(443);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(439);
						any_name();
						}
						break;
					case STAR:
					case PLUS:
					case MINUS:
					case NUMERIC_LITERAL:
						{
						setState(440);
						signed_number();
						}
						break;
					case T__2:
						{
						setState(441);
						json_object();
						}
						break;
					case T__0:
						{
						setState(442);
						array_identification();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
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

	public static class Array_identificationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOTS() { return getTokens(SqlParser.DOTS); }
		public TerminalNode DOTS(int i) {
			return getToken(SqlParser.DOTS, i);
		}
		public List<Array_identificationContext> array_identification() {
			return getRuleContexts(Array_identificationContext.class);
		}
		public Array_identificationContext array_identification(int i) {
			return getRuleContext(Array_identificationContext.class,i);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
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
		enterRule(_localctx, 28, RULE_array_identification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__0);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(450);
					match(IDENTIFIER);
					setState(451);
					match(DOTS);
					{
					setState(452);
					logical_expression(0);
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(453);
						match(COMMA);
						}
						}
						setState(458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(464);
					array_identification();
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(465);
						match(COMMA);
						}
						}
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(478);
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

	public static class Json_objectContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SqlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOTS() { return getTokens(SqlParser.DOTS); }
		public TerminalNode DOTS(int i) {
			return getToken(SqlParser.DOTS, i);
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
		enterRule(_localctx, 30, RULE_json_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__2);
			setState(481);
			match(IDENTIFIER);
			setState(482);
			match(DOTS);
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(483);
				logical_expression(0);
				}
				break;
			case T__3:
				{
				setState(484);
				match(T__3);
				setState(485);
				logical_expression(0);
				setState(486);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(488);
				match(T__4);
				setState(489);
				logical_expression(0);
				setState(490);
				match(T__4);
				}
				break;
			case T__2:
				{
				setState(492);
				json_object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				match(IDENTIFIER);
				setState(497);
				match(DOTS);
				setState(508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
					setState(498);
					logical_expression(0);
					}
					break;
				case T__3:
					{
					setState(499);
					match(T__3);
					setState(500);
					logical_expression(0);
					setState(501);
					match(T__3);
					}
					break;
				case T__4:
					{
					setState(503);
					match(T__4);
					setState(504);
					logical_expression(0);
					setState(505);
					match(T__4);
					}
					break;
				case T__2:
					{
					setState(507);
					json_object();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<Java_function_callContext> java_function_call() {
			return getRuleContexts(Java_function_callContext.class);
		}
		public Java_function_callContext java_function_call(int i) {
			return getRuleContext(Java_function_callContext.class,i);
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
		enterRule(_localctx, 32, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(K_PRINT);
			setState(518);
			match(OPEN_PAR);
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(519);
				logical_expression(0);
				}
				break;
			case 2:
				{
				setState(520);
				match(T__3);
				setState(521);
				literal_value();
				setState(522);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(524);
				java_function_call();
				}
				break;
			}
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(527);
				match(PLUS);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(528);
					logical_expression(0);
					}
					break;
				case 2:
					{
					setState(529);
					match(T__3);
					setState(530);
					literal_value();
					setState(531);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(533);
					java_function_call();
					}
					break;
				}
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			match(CLOSE_PAR);
			setState(542);
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
	 
		public Logical_expressionContext() { }
		public void copyFrom(Logical_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Logical_expression_case5Context extends Logical_expressionContext {
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public Logical_expression_case5Context(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogical_expression_case5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogical_expression_case5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogical_expression_case5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_expression_case1Context extends Logical_expressionContext {
		public Token op1;
		public Token op2;
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Logical_expression_case1Context(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogical_expression_case1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogical_expression_case1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogical_expression_case1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_expression_case2Context extends Logical_expressionContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logical_expression_case2Context(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogical_expression_case2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogical_expression_case2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogical_expression_case2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_expression_case3Context extends Logical_expressionContext {
		public Token booleanval;
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public Logical_expression_case3Context(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogical_expression_case3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogical_expression_case3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogical_expression_case3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_expression_case4Context extends Logical_expressionContext {
		public Token op1;
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public Logical_expression_case4Context(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLogical_expression_case4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLogical_expression_case4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLogical_expression_case4(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logical_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				_localctx = new Logical_expression_case1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(545);
					literal_value();
					}
					break;
				case 2:
					{
					setState(546);
					any_name();
					}
					break;
				}
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						setState(549);
						((Logical_expression_case1Context)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Logical_expression_case1Context)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(552);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(550);
							literal_value();
							}
							break;
						case 2:
							{
							setState(551);
							any_name();
							}
							break;
						}
						}
					}

					setState(556);
					((Logical_expression_case1Context)_localctx).op2 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) ) {
						((Logical_expression_case1Context)_localctx).op2 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(559);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(557);
						literal_value();
						}
						break;
					case 2:
						{
						setState(558);
						any_name();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new Logical_expression_case2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(563);
				match(OPEN_PAR);
				setState(564);
				logical_expression(0);
				setState(565);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				_localctx = new Logical_expression_case3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(567);
				((Logical_expression_case3Context)_localctx).booleanval = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==K_TRUE || _la==K_FALSE) ) {
					((Logical_expression_case3Context)_localctx).booleanval = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				_localctx = new Logical_expression_case5Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(568);
				java_function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_expression_case4Context(new Logical_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
					setState(571);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					{
					setState(572);
					((Logical_expression_case4Context)_localctx).op1 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==PIPE2) ) {
						((Logical_expression_case4Context)_localctx).op1 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(573);
					logical_expression(0);
					}
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode DOTS() { return getToken(SqlParser.DOTS, 0); }
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
		enterRule(_localctx, 36, RULE_logical_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			logical_expression(0);
			setState(580);
			match(T__7);
			setState(581);
			logical_expression(0);
			setState(582);
			match(DOTS);
			setState(583);
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

	public static class IncrementContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
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
		enterRule(_localctx, 38, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(585);
				any_name();
				setState(586);
				match(T__8);
				}
				break;
			case 2:
				{
				setState(588);
				match(T__8);
				setState(589);
				any_name();
				}
				break;
			case 3:
				{
				setState(590);
				any_name();
				setState(591);
				match(T__9);
				}
				break;
			case 4:
				{
				setState(593);
				match(T__9);
				setState(594);
				any_name();
				}
				break;
			case 5:
				{
				setState(595);
				any_name();
				setState(596);
				assignment_operator();
				setState(599);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
				case PLUS:
				case MINUS:
				case NUMERIC_LITERAL:
					{
					setState(597);
					signed_number();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(598);
					any_name();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
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
		enterRule(_localctx, 40, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ASSIGN) | (1L << PLUS))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public List<Java_stmtContext> java_stmt() {
			return getRuleContexts(Java_stmtContext.class);
		}
		public Java_stmtContext java_stmt(int i) {
			return getRuleContext(Java_stmtContext.class,i);
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
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__2);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << SCOL) | (1L << OPEN_PAR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_DO - 87)) | (1L << (K_FOR - 87)) | (1L << (K_IF - 87)))) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (K_SWITCH - 160)) | (1L << (K_VAR - 160)) | (1L << (K_WHILE - 160)) | (1L << (IDENTIFIER - 160)) | (1L << (STRING_LITERAL - 160)))) != 0)) {
				{
				{
				setState(606);
				java_stmt();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(612);
				return_stmt();
				}
			}

			setState(615);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_blockContext extends ParserRuleContext {
		public List<Java_stmt_within_loopContext> java_stmt_within_loop() {
			return getRuleContexts(Java_stmt_within_loopContext.class);
		}
		public Java_stmt_within_loopContext java_stmt_within_loop(int i) {
			return getRuleContext(Java_stmt_within_loopContext.class,i);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Loop_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterLoop_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitLoop_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitLoop_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_blockContext loop_block() throws RecognitionException {
		Loop_blockContext _localctx = new Loop_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loop_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__2);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << SCOL) | (1L << OPEN_PAR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_DO - 87)) | (1L << (K_FOR - 87)) | (1L << (K_IF - 87)))) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (K_SWITCH - 160)) | (1L << (K_VAR - 160)) | (1L << (K_WHILE - 160)) | (1L << (IDENTIFIER - 160)) | (1L << (STRING_LITERAL - 160)))) != 0)) {
				{
				{
				setState(618);
				java_stmt_within_loop();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(624);
				return_stmt();
				}
			}

			setState(627);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		public Java_stmtContext java_stmt() {
			return getRuleContext(Java_stmtContext.class,0);
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
		enterRule(_localctx, 46, RULE_one_line_block);
		try {
			setState(631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				java_stmt();
				}
				break;
			case K_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
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

	public static class Conditional_stmt_one_line_block_within_loopContext extends ParserRuleContext {
		public Java_stmt_within_loopContext java_stmt_within_loop() {
			return getRuleContext(Java_stmt_within_loopContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Conditional_stmt_one_line_block_within_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_stmt_one_line_block_within_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConditional_stmt_one_line_block_within_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConditional_stmt_one_line_block_within_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConditional_stmt_one_line_block_within_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_stmt_one_line_block_within_loopContext conditional_stmt_one_line_block_within_loop() throws RecognitionException {
		Conditional_stmt_one_line_block_within_loopContext _localctx = new Conditional_stmt_one_line_block_within_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_conditional_stmt_one_line_block_within_loop);
		try {
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				java_stmt_within_loop();
				}
				break;
			case K_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
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

	public static class Conditional_stmt_block_within_loopContext extends ParserRuleContext {
		public Token br;
		public Token con;
		public Return_stmtContext ret;
		public List<Java_stmt_within_loopContext> java_stmt_within_loop() {
			return getRuleContexts(Java_stmt_within_loopContext.class);
		}
		public Java_stmt_within_loopContext java_stmt_within_loop(int i) {
			return getRuleContext(Java_stmt_within_loopContext.class,i);
		}
		public TerminalNode K_BREAK() { return getToken(SqlParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SqlParser.K_CONTINUE, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Conditional_stmt_block_within_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_stmt_block_within_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConditional_stmt_block_within_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConditional_stmt_block_within_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConditional_stmt_block_within_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_stmt_block_within_loopContext conditional_stmt_block_within_loop() throws RecognitionException {
		Conditional_stmt_block_within_loopContext _localctx = new Conditional_stmt_block_within_loopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conditional_stmt_block_within_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(T__2);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << SCOL) | (1L << OPEN_PAR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_DO - 87)) | (1L << (K_FOR - 87)) | (1L << (K_IF - 87)))) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (K_SWITCH - 160)) | (1L << (K_VAR - 160)) | (1L << (K_WHILE - 160)) | (1L << (IDENTIFIER - 160)) | (1L << (STRING_LITERAL - 160)))) != 0)) {
				{
				{
				setState(638);
				java_stmt_within_loop();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BREAK:
				{
				setState(644);
				((Conditional_stmt_block_within_loopContext)_localctx).br = match(K_BREAK);
				}
				break;
			case K_CONTINUE:
				{
				setState(645);
				((Conditional_stmt_block_within_loopContext)_localctx).con = match(K_CONTINUE);
				}
				break;
			case K_RETURN:
				{
				setState(646);
				((Conditional_stmt_block_within_loopContext)_localctx).ret = return_stmt();
				}
				break;
			case T__5:
				break;
			default:
				break;
			}
			setState(649);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
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
		public Logical_expressionContext if1;
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(K_IF);
			setState(652);
			match(OPEN_PAR);
			setState(653);
			((If_stmtContext)_localctx).if1 = logical_expression(0);
			setState(654);
			match(CLOSE_PAR);
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(655);
				block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(656);
				one_line_block();
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

	public static class Else_if_stmtContext extends ParserRuleContext {
		public Logical_expressionContext if2;
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(K_ELSE);
			{
			setState(660);
			match(K_IF);
			setState(661);
			match(OPEN_PAR);
			setState(662);
			((Else_if_stmtContext)_localctx).if2 = logical_expression(0);
			setState(663);
			match(CLOSE_PAR);
			}
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(665);
				block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(666);
				one_line_block();
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
		enterRule(_localctx, 56, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(K_ELSE);
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(670);
				block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(671);
				one_line_block();
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

	public static class If_stmt_within_loopContext extends ParserRuleContext {
		public Logical_expressionContext if1;
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Conditional_stmt_block_within_loopContext conditional_stmt_block_within_loop() {
			return getRuleContext(Conditional_stmt_block_within_loopContext.class,0);
		}
		public Conditional_stmt_one_line_block_within_loopContext conditional_stmt_one_line_block_within_loop() {
			return getRuleContext(Conditional_stmt_one_line_block_within_loopContext.class,0);
		}
		public If_stmt_within_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt_within_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterIf_stmt_within_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitIf_stmt_within_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitIf_stmt_within_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt_within_loopContext if_stmt_within_loop() throws RecognitionException {
		If_stmt_within_loopContext _localctx = new If_stmt_within_loopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_stmt_within_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(K_IF);
			setState(675);
			match(OPEN_PAR);
			setState(676);
			((If_stmt_within_loopContext)_localctx).if1 = logical_expression(0);
			setState(677);
			match(CLOSE_PAR);
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(678);
				conditional_stmt_block_within_loop();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(679);
				conditional_stmt_one_line_block_within_loop();
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

	public static class Else_if_stmt_within_loopContext extends ParserRuleContext {
		public Logical_expressionContext if2;
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Conditional_stmt_block_within_loopContext conditional_stmt_block_within_loop() {
			return getRuleContext(Conditional_stmt_block_within_loopContext.class,0);
		}
		public Conditional_stmt_one_line_block_within_loopContext conditional_stmt_one_line_block_within_loop() {
			return getRuleContext(Conditional_stmt_one_line_block_within_loopContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public Else_if_stmt_within_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_stmt_within_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterElse_if_stmt_within_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitElse_if_stmt_within_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitElse_if_stmt_within_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_stmt_within_loopContext else_if_stmt_within_loop() throws RecognitionException {
		Else_if_stmt_within_loopContext _localctx = new Else_if_stmt_within_loopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_else_if_stmt_within_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(K_ELSE);
			{
			setState(683);
			match(K_IF);
			setState(684);
			match(OPEN_PAR);
			setState(685);
			((Else_if_stmt_within_loopContext)_localctx).if2 = logical_expression(0);
			setState(686);
			match(CLOSE_PAR);
			}
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(688);
				conditional_stmt_block_within_loop();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(689);
				conditional_stmt_one_line_block_within_loop();
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

	public static class Else_stmt_within_loopContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SqlParser.K_ELSE, 0); }
		public Conditional_stmt_block_within_loopContext conditional_stmt_block_within_loop() {
			return getRuleContext(Conditional_stmt_block_within_loopContext.class,0);
		}
		public Conditional_stmt_one_line_block_within_loopContext conditional_stmt_one_line_block_within_loop() {
			return getRuleContext(Conditional_stmt_one_line_block_within_loopContext.class,0);
		}
		public Else_stmt_within_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt_within_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterElse_stmt_within_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitElse_stmt_within_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitElse_stmt_within_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmt_within_loopContext else_stmt_within_loop() throws RecognitionException {
		Else_stmt_within_loopContext _localctx = new Else_stmt_within_loopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_else_stmt_within_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(K_ELSE);
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(693);
				conditional_stmt_block_within_loop();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(694);
				conditional_stmt_one_line_block_within_loop();
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

	public static class Conditional_stmt_within_loopContext extends ParserRuleContext {
		public List<If_stmt_within_loopContext> if_stmt_within_loop() {
			return getRuleContexts(If_stmt_within_loopContext.class);
		}
		public If_stmt_within_loopContext if_stmt_within_loop(int i) {
			return getRuleContext(If_stmt_within_loopContext.class,i);
		}
		public List<Else_if_stmt_within_loopContext> else_if_stmt_within_loop() {
			return getRuleContexts(Else_if_stmt_within_loopContext.class);
		}
		public Else_if_stmt_within_loopContext else_if_stmt_within_loop(int i) {
			return getRuleContext(Else_if_stmt_within_loopContext.class,i);
		}
		public Else_stmt_within_loopContext else_stmt_within_loop() {
			return getRuleContext(Else_stmt_within_loopContext.class,0);
		}
		public Conditional_stmt_within_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_stmt_within_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterConditional_stmt_within_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitConditional_stmt_within_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitConditional_stmt_within_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_stmt_within_loopContext conditional_stmt_within_loop() throws RecognitionException {
		Conditional_stmt_within_loopContext _localctx = new Conditional_stmt_within_loopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional_stmt_within_loop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(697);
					if_stmt_within_loop();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(700); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(702);
					else_if_stmt_within_loop();
					}
					} 
				}
				setState(707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(708);
				else_stmt_within_loop();
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
			setState(712); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(711);
					if_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(714); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(716);
					else_if_stmt();
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(722);
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
		enterRule(_localctx, 68, RULE_loop_stmt);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				do_while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
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
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
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
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SqlParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SqlParser.NUMERIC_LITERAL, i);
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
		enterRule(_localctx, 70, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(731);
			match(K_FOR);
			setState(732);
			match(OPEN_PAR);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(733);
				match(K_VAR);
				}
			}

			setState(736);
			any_name();
			setState(737);
			match(ASSIGN);
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				{
				setState(739); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(738);
					match(NUMERIC_LITERAL);
					}
					}
					setState(741); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERIC_LITERAL );
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(743);
				any_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(746);
			match(SCOL);
			setState(747);
			any_name();
			setState(748);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(749);
				any_name();
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(751); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(750);
					match(NUMERIC_LITERAL);
					}
					}
					setState(753); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMERIC_LITERAL );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(757);
			match(SCOL);
			setState(758);
			increment();
			setState(759);
			match(CLOSE_PAR);
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(760);
				loop_block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(761);
				one_line_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
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
		enterRule(_localctx, 72, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(764);
			match(K_WHILE);
			setState(765);
			match(OPEN_PAR);
			setState(766);
			logical_expression(0);
			setState(767);
			match(CLOSE_PAR);
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(768);
				loop_block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(769);
				one_line_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
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
		enterRule(_localctx, 74, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(K_DO);
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(773);
				loop_block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(774);
				one_line_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(777);
			match(K_WHILE);
			setState(778);
			match(OPEN_PAR);
			setState(779);
			logical_expression(0);
			setState(780);
			match(CLOSE_PAR);
			setState(781);
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
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode DOTS() { return getToken(SqlParser.DOTS, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Loop_blockContext loop_block() {
			return getRuleContext(Loop_blockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
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
		enterRule(_localctx, 76, RULE_for_each_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(K_FOR);
			setState(784);
			match(OPEN_PAR);
			setState(785);
			match(K_VAR);
			setState(786);
			any_name();
			setState(787);
			match(DOTS);
			setState(788);
			any_name();
			setState(789);
			match(CLOSE_PAR);
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(790);
				loop_block();
				}
				break;
			case T__8:
			case T__9:
			case SCOL:
			case OPEN_PAR:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_RETURN:
			case K_SWITCH:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(791);
				one_line_block();
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SqlParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 78, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(K_SWITCH);
			setState(795);
			match(OPEN_PAR);
			setState(796);
			logical_expression(0);
			setState(797);
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
		enterRule(_localctx, 80, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(799);
				match(K_EXPLAIN);
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(800);
					match(K_QUERY);
					setState(801);
					match(K_PLAN);
					}
				}

				}
			}

			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(806);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(807);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(808);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(809);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(810);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(811);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(812);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(813);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(814);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(815);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(816);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(817);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(818);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(819);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(820);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(821);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(822);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(823);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(824);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(825);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(826);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(827);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(828);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(829);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(830);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(831);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(832);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(833);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(834);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(835);
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
		enterRule(_localctx, 82, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(K_ALTER);
			setState(839);
			match(K_TABLE);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ONLY) {
				{
				setState(840);
				match(K_ONLY);
				}
			}

			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(843);
				database_name();
				setState(844);
				match(DOT);
				}
				break;
			}
			setState(848);
			source_table_name();
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(849);
				match(K_RENAME);
				setState(850);
				match(K_TO);
				setState(851);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(852);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(853);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(854);
				match(K_ADD);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(855);
					match(K_COLUMN);
					}
				}

				setState(858);
				column_def();
				}
				break;
			}
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(861);
				match(K_ENABLE);
				}
				break;
			}
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(864);
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
		enterRule(_localctx, 84, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(K_ADD);
			setState(868);
			match(K_CONSTRAINT);
			setState(869);
			any_name();
			setState(870);
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
		enterRule(_localctx, 86, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(K_ADD);
			setState(873);
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
		enterRule(_localctx, 88, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(K_ANALYZE);
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(876);
				database_name();
				}
				break;
			case 2:
				{
				setState(877);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(878);
				database_name();
				setState(879);
				match(DOT);
				setState(880);
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
		enterRule(_localctx, 90, RULE_attach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(K_ATTACH);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATABASE) {
				{
				setState(885);
				match(K_DATABASE);
				}
			}

			setState(888);
			expr(0);
			setState(889);
			match(K_AS);
			setState(890);
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
		enterRule(_localctx, 92, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(K_BEGIN);
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (K_DEFERRED - 82)) | (1L << (K_EXCLUSIVE - 82)) | (1L << (K_IMMEDIATE - 82)))) != 0)) ) {
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
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(896);
				match(K_TRANSACTION);
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(897);
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
		enterRule(_localctx, 94, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(903);
				match(K_TRANSACTION);
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(904);
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
		enterRule(_localctx, 96, RULE_compound_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(909);
				match(K_WITH);
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(910);
					match(K_RECURSIVE);
					}
				}

				setState(913);
				common_table_expression();
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(914);
					match(COMMA);
					setState(915);
					common_table_expression();
					}
					}
					setState(920);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(923);
			select_core();
			setState(933); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(930);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_UNION:
						{
						setState(924);
						match(K_UNION);
						setState(926);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_ALL) {
							{
							setState(925);
							match(K_ALL);
							}
						}

						}
						break;
					case K_INTERSECT:
						{
						setState(928);
						match(K_INTERSECT);
						}
						break;
					case K_EXCEPT:
						{
						setState(929);
						match(K_EXCEPT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(932);
					select_core();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(935); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(937);
				match(K_ORDER);
				setState(938);
				match(K_BY);
				setState(939);
				ordering_term();
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(940);
						match(COMMA);
						setState(941);
						ordering_term();
						}
						} 
					}
					setState(946);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
				break;
			}
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(949);
				match(K_LIMIT);
				setState(950);
				expr(0);
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(951);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(952);
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
		enterRule(_localctx, 98, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(K_CREATE);
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(958);
				match(K_UNIQUE);
				}
			}

			setState(961);
			match(K_INDEX);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(962);
				match(K_IF);
				setState(963);
				match(K_NOT);
				setState(964);
				match(K_EXISTS);
				}
			}

			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(967);
				database_name();
				setState(968);
				match(DOT);
				}
				break;
			}
			setState(972);
			index_name();
			setState(973);
			match(K_ON);
			setState(974);
			table_name();
			setState(975);
			match(OPEN_PAR);
			setState(976);
			indexed_column();
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(977);
				match(COMMA);
				setState(978);
				indexed_column();
				}
				}
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(984);
			match(CLOSE_PAR);
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(985);
				match(K_WHERE);
				setState(986);
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
		enterRule(_localctx, 100, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(K_CREATE);
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(990);
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

			setState(993);
			match(K_TABLE);
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(994);
				match(K_IF);
				setState(995);
				match(K_NOT);
				setState(996);
				match(K_EXISTS);
				}
			}

			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(999);
				database_name();
				setState(1000);
				match(DOT);
				}
				break;
			}
			setState(1004);
			table_name();
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(1005);
				match(OPEN_PAR);
				setState(1006);
				column_def();
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(1011);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						setState(1007);
						match(COMMA);
						setState(1008);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(1009);
						match(COMMA);
						setState(1010);
						column_def();
						}
						break;
					}
					}
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1016);
				match(CLOSE_PAR);
				setState(1019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1017);
					match(K_WITHOUT);
					setState(1018);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case K_AS:
				{
				setState(1021);
				match(K_AS);
				setState(1022);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1025);
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
		enterRule(_localctx, 102, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(K_CREATE);
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(1029);
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

			setState(1032);
			match(K_TRIGGER);
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1033);
				match(K_IF);
				setState(1034);
				match(K_NOT);
				setState(1035);
				match(K_EXISTS);
				}
			}

			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1038);
				database_name();
				setState(1039);
				match(DOT);
				}
				break;
			}
			setState(1043);
			trigger_name();
			setState(1048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(1044);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(1045);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(1046);
				match(K_INSTEAD);
				setState(1047);
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
			setState(1064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(1050);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(1051);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(1052);
				match(K_UPDATE);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(1053);
					match(K_OF);
					setState(1054);
					column_name();
					setState(1059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1055);
						match(COMMA);
						setState(1056);
						column_name();
						}
						}
						setState(1061);
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
			setState(1066);
			match(K_ON);
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1067);
				database_name();
				setState(1068);
				match(DOT);
				}
				break;
			}
			setState(1072);
			table_name();
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(1073);
				match(K_FOR);
				setState(1074);
				match(K_EACH);
				setState(1075);
				match(K_ROW);
				}
			}

			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(1078);
				match(K_WHEN);
				setState(1079);
				expr(0);
				}
			}

			setState(1082);
			match(K_BEGIN);
			setState(1091); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1083);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(1084);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(1085);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(1086);
					select_stmt();
					}
					break;
				}
				setState(1089);
				match(SCOL);
				}
				}
				setState(1093); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || _la==K_INSERT || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (K_REPLACE - 151)) | (1L << (K_SELECT - 151)) | (1L << (K_UPDATE - 151)) | (1L << (K_VALUES - 151)) | (1L << (K_WITH - 151)))) != 0) );
			setState(1095);
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
		enterRule(_localctx, 104, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			match(K_CREATE);
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(1098);
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

			setState(1101);
			match(K_VIEW);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1102);
				match(K_IF);
				setState(1103);
				match(K_NOT);
				setState(1104);
				match(K_EXISTS);
				}
			}

			setState(1110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1107);
				database_name();
				setState(1108);
				match(DOT);
				}
				break;
			}
			setState(1112);
			view_name();
			setState(1113);
			match(K_AS);
			setState(1114);
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
		enterRule(_localctx, 106, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(K_CREATE);
			setState(1117);
			match(K_VIRTUAL);
			setState(1118);
			match(K_TABLE);
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1119);
				match(K_IF);
				setState(1120);
				match(K_NOT);
				setState(1121);
				match(K_EXISTS);
				}
			}

			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1124);
				database_name();
				setState(1125);
				match(DOT);
				}
				break;
			}
			setState(1129);
			table_name();
			setState(1130);
			match(K_USING);
			setState(1131);
			module_name();
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1132);
				match(OPEN_PAR);
				setState(1133);
				module_argument();
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1134);
					match(COMMA);
					setState(1135);
					module_argument();
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1141);
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
		enterRule(_localctx, 108, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1145);
				with_clause();
				}
			}

			setState(1148);
			match(K_DELETE);
			setState(1149);
			match(K_FROM);
			setState(1150);
			qualified_table_name();
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1151);
				match(K_WHERE);
				setState(1152);
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
		enterRule(_localctx, 110, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1155);
				with_clause();
				}
			}

			setState(1158);
			match(K_DELETE);
			setState(1159);
			match(K_FROM);
			setState(1162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(1160);
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
				setState(1161);
				sql_stmt_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1164);
				match(K_WHERE);
				setState(1165);
				expr(0);
				}
				break;
			}
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1168);
					match(K_ORDER);
					setState(1169);
					match(K_BY);
					setState(1170);
					ordering_term();
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1171);
						match(COMMA);
						setState(1172);
						ordering_term();
						}
						}
						setState(1177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1180);
				match(K_LIMIT);
				setState(1181);
				expr(0);
				setState(1184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1182);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1183);
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
		enterRule(_localctx, 112, RULE_detach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(K_DETACH);
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DATABASE) {
				{
				setState(1189);
				match(K_DATABASE);
				}
			}

			setState(1192);
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
		enterRule(_localctx, 114, RULE_drop_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(K_DROP);
			setState(1195);
			match(K_INDEX);
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1196);
				match(K_IF);
				setState(1197);
				match(K_EXISTS);
				}
			}

			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1200);
				database_name();
				setState(1201);
				match(DOT);
				}
				break;
			}
			setState(1205);
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
		enterRule(_localctx, 116, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(K_DROP);
			setState(1208);
			match(K_TABLE);
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1209);
				match(K_IF);
				setState(1210);
				match(K_EXISTS);
				}
			}

			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1213);
				database_name();
				setState(1214);
				match(DOT);
				}
				break;
			}
			setState(1218);
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
		enterRule(_localctx, 118, RULE_drop_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(K_DROP);
			setState(1221);
			match(K_TRIGGER);
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1222);
				match(K_IF);
				setState(1223);
				match(K_EXISTS);
				}
			}

			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1226);
				database_name();
				setState(1227);
				match(DOT);
				}
				break;
			}
			setState(1231);
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
		enterRule(_localctx, 120, RULE_drop_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			match(K_DROP);
			setState(1234);
			match(K_VIEW);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(1235);
				match(K_IF);
				setState(1236);
				match(K_EXISTS);
				}
			}

			setState(1242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1239);
				database_name();
				setState(1240);
				match(DOT);
				}
				break;
			}
			setState(1244);
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
		enterRule(_localctx, 122, RULE_factored_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1246);
				match(K_WITH);
				setState(1248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1247);
					match(K_RECURSIVE);
					}
				}

				setState(1250);
				common_table_expression();
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1251);
					match(COMMA);
					setState(1252);
					common_table_expression();
					}
					}
					setState(1257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1260);
			select_core();
			setState(1266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1261);
					compound_operator();
					setState(1262);
					select_core();
					}
					} 
				}
				setState(1268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			}
			setState(1279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1269);
				match(K_ORDER);
				setState(1270);
				match(K_BY);
				setState(1271);
				ordering_term();
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1272);
						match(COMMA);
						setState(1273);
						ordering_term();
						}
						} 
					}
					setState(1278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				}
				break;
			}
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1281);
				match(K_LIMIT);
				setState(1282);
				expr(0);
				setState(1285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1283);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1284);
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
		enterRule(_localctx, 124, RULE_insert_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1289);
				with_clause();
				}
			}

			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1292);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(1293);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(1294);
				match(K_INSERT);
				setState(1295);
				match(K_OR);
				setState(1296);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1297);
				match(K_INSERT);
				setState(1298);
				match(K_OR);
				setState(1299);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(1300);
				match(K_INSERT);
				setState(1301);
				match(K_OR);
				setState(1302);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(1303);
				match(K_INSERT);
				setState(1304);
				match(K_OR);
				setState(1305);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(1306);
				match(K_INSERT);
				setState(1307);
				match(K_OR);
				setState(1308);
				match(K_IGNORE);
				}
				break;
			}
			setState(1311);
			match(K_INTO);
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1312);
				database_name();
				setState(1313);
				match(DOT);
				}
				break;
			}
			setState(1317);
			table_name();
			setState(1329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1318);
				match(OPEN_PAR);
				setState(1319);
				column_name();
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1320);
					match(COMMA);
					setState(1321);
					column_name();
					}
					}
					setState(1326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1327);
				match(CLOSE_PAR);
				}
			}

			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				{
				setState(1331);
				match(K_VALUES);
				setState(1332);
				match(OPEN_PAR);
				setState(1333);
				expr(0);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1334);
					match(COMMA);
					setState(1335);
					expr(0);
					}
					}
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1341);
				match(CLOSE_PAR);
				setState(1356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1342);
						match(COMMA);
						setState(1343);
						match(OPEN_PAR);
						setState(1344);
						expr(0);
						setState(1349);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1345);
							match(COMMA);
							setState(1346);
							expr(0);
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
					}
					setState(1358);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1359);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1360);
				match(K_DEFAULT);
				setState(1361);
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
		enterRule(_localctx, 126, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			match(K_PRAGMA);
			setState(1368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1365);
				database_name();
				setState(1366);
				match(DOT);
				}
				break;
			}
			setState(1370);
			pragma_name();
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1371);
				match(ASSIGN);
				setState(1372);
				pragma_value();
				}
				break;
			case 2:
				{
				setState(1373);
				match(OPEN_PAR);
				setState(1374);
				pragma_value();
				setState(1375);
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
		enterRule(_localctx, 128, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(K_REINDEX);
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1380);
				collation_name();
				}
				break;
			case 2:
				{
				setState(1384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1381);
					database_name();
					setState(1382);
					match(DOT);
					}
					break;
				}
				setState(1388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1386);
					table_name();
					}
					break;
				case 2:
					{
					setState(1387);
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
		enterRule(_localctx, 130, RULE_release_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(K_RELEASE);
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SAVEPOINT) {
				{
				setState(1393);
				match(K_SAVEPOINT);
				}
			}

			setState(1396);
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
		enterRule(_localctx, 132, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			match(K_ROLLBACK);
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1399);
				match(K_TRANSACTION);
				setState(1401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1400);
					transaction_name();
					}
					break;
				}
				}
				break;
			}
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1405);
				match(K_TO);
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_SAVEPOINT) {
					{
					setState(1406);
					match(K_SAVEPOINT);
					}
				}

				setState(1409);
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
		enterRule(_localctx, 134, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(K_SAVEPOINT);
			setState(1413);
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
		enterRule(_localctx, 136, RULE_simple_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1415);
				match(K_WITH);
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1416);
					match(K_RECURSIVE);
					}
				}

				setState(1419);
				common_table_expression();
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1420);
					match(COMMA);
					setState(1421);
					common_table_expression();
					}
					}
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1429);
			select_core();
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1430);
				match(K_ORDER);
				setState(1431);
				match(K_BY);
				setState(1432);
				ordering_term();
				setState(1437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1433);
						match(COMMA);
						setState(1434);
						ordering_term();
						}
						} 
					}
					setState(1439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				break;
			}
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1442);
				match(K_LIMIT);
				setState(1443);
				expr(0);
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1444);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1445);
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
		enterRule(_localctx, 138, RULE_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1450);
				match(K_WITH);
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_RECURSIVE) {
					{
					setState(1451);
					match(K_RECURSIVE);
					}
				}

				setState(1454);
				common_table_expression();
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1455);
					match(COMMA);
					setState(1456);
					common_table_expression();
					}
					}
					setState(1461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1464);
			select_or_values();
			setState(1470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1465);
					compound_operator();
					setState(1466);
					select_or_values();
					}
					} 
				}
				setState(1472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1473);
				match(K_ORDER);
				setState(1474);
				match(K_BY);
				setState(1475);
				ordering_term();
				setState(1480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1476);
						match(COMMA);
						setState(1477);
						ordering_term();
						}
						} 
					}
					setState(1482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				}
				break;
			}
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1485);
				match(K_LIMIT);
				setState(1486);
				expr(0);
				setState(1489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1487);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1488);
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
		enterRule(_localctx, 140, RULE_select_or_values);
		int _la;
		try {
			int _alt;
			setState(1567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				match(K_SELECT);
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1494);
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
				setState(1497);
				result_column();
				setState(1502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1498);
						match(COMMA);
						setState(1499);
						result_column();
						}
						} 
					}
					setState(1504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				}
				}
				setState(1517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1505);
					match(K_FROM);
					setState(1515);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						setState(1506);
						table_or_subquery();
						setState(1511);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1507);
								match(COMMA);
								setState(1508);
								table_or_subquery();
								}
								} 
							}
							setState(1513);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1514);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(1521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1519);
					match(K_WHERE);
					setState(1520);
					expr(0);
					}
					break;
				}
				setState(1537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1523);
					match(K_GROUP);
					setState(1524);
					match(K_BY);
					setState(1525);
					expr(0);
					setState(1530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1526);
							match(COMMA);
							setState(1527);
							expr(0);
							}
							} 
						}
						setState(1532);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
					}
					setState(1535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
					case 1:
						{
						setState(1533);
						match(K_HAVING);
						setState(1534);
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
				setState(1539);
				match(K_VALUES);
				setState(1540);
				match(OPEN_PAR);
				setState(1541);
				expr(0);
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1542);
					match(COMMA);
					setState(1543);
					expr(0);
					}
					}
					setState(1548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1549);
				match(CLOSE_PAR);
				setState(1564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1550);
						match(COMMA);
						setState(1551);
						match(OPEN_PAR);
						setState(1552);
						expr(0);
						setState(1557);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1553);
							match(COMMA);
							setState(1554);
							expr(0);
							}
							}
							setState(1559);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1560);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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
		enterRule(_localctx, 142, RULE_update_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1569);
				with_clause();
				}
			}

			setState(1572);
			match(K_UPDATE);
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1573);
				match(K_OR);
				setState(1574);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1575);
				match(K_OR);
				setState(1576);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1577);
				match(K_OR);
				setState(1578);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1579);
				match(K_OR);
				setState(1580);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1581);
				match(K_OR);
				setState(1582);
				match(K_IGNORE);
				}
				break;
			}
			setState(1585);
			qualified_table_name();
			setState(1586);
			match(K_SET);
			setState(1587);
			column_name();
			setState(1588);
			match(ASSIGN);
			setState(1589);
			expr(0);
			setState(1597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1590);
					match(COMMA);
					setState(1591);
					column_name();
					setState(1592);
					match(ASSIGN);
					setState(1593);
					expr(0);
					}
					} 
				}
				setState(1599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1600);
				match(K_WHERE);
				setState(1601);
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
		enterRule(_localctx, 144, RULE_update_stmt_limited);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1604);
				with_clause();
				}
			}

			setState(1607);
			match(K_UPDATE);
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1608);
				match(K_OR);
				setState(1609);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1610);
				match(K_OR);
				setState(1611);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1612);
				match(K_OR);
				setState(1613);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1614);
				match(K_OR);
				setState(1615);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1616);
				match(K_OR);
				setState(1617);
				match(K_IGNORE);
				}
				break;
			}
			setState(1620);
			qualified_table_name();
			setState(1621);
			match(K_SET);
			setState(1622);
			column_name();
			setState(1623);
			match(ASSIGN);
			setState(1624);
			expr(0);
			setState(1632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1625);
					match(COMMA);
					setState(1626);
					column_name();
					setState(1627);
					match(ASSIGN);
					setState(1628);
					expr(0);
					}
					} 
				}
				setState(1634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1635);
				match(K_WHERE);
				setState(1636);
				expr(0);
				}
				break;
			}
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1639);
					match(K_ORDER);
					setState(1640);
					match(K_BY);
					setState(1641);
					ordering_term();
					setState(1646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1642);
						match(COMMA);
						setState(1643);
						ordering_term();
						}
						}
						setState(1648);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1651);
				match(K_LIMIT);
				setState(1652);
				expr(0);
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1653);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1654);
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
		enterRule(_localctx, 146, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
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
		enterRule(_localctx, 148, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			column_name();
			setState(1666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1664);
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
						setState(1662);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(1663);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
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
		enterRule(_localctx, 150, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			name();
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1670);
				match(OPEN_PAR);
				setState(1671);
				signed_number();
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1672);
					any_name();
					}
				}

				setState(1675);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1677);
				match(OPEN_PAR);
				setState(1678);
				signed_number();
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1679);
					any_name();
					}
				}

				setState(1682);
				match(COMMA);
				setState(1683);
				signed_number();
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1684);
					any_name();
					}
				}

				setState(1687);
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
		enterRule(_localctx, 152, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1691);
				match(K_CONSTRAINT);
				setState(1692);
				name();
				}
			}

			setState(1709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1695);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1696);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1697);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1698);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(1699);
				match(K_UNIQUE);
				setState(1700);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1701);
				match(K_CHECK);
				setState(1702);
				match(OPEN_PAR);
				setState(1703);
				expr(0);
				setState(1704);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1706);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1707);
				match(K_COLLATE);
				setState(1708);
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
		enterRule(_localctx, 154, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(K_PRIMARY);
			setState(1712);
			match(K_KEY);
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1713);
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
			setState(1716);
			conflict_clause();
			setState(1718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1717);
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
		enterRule(_localctx, 156, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
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
		enterRule(_localctx, 158, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(K_NOT);
			setState(1723);
			match(K_NULL);
			setState(1724);
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
		enterRule(_localctx, 160, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(K_NULL);
			setState(1727);
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
		enterRule(_localctx, 162, RULE_column_default);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			match(K_DEFAULT);
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1730);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1731);
				match(OPEN_PAR);
				setState(1732);
				expr(0);
				setState(1733);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1735);
				match(K_NEXTVAL);
				setState(1736);
				match(OPEN_PAR);
				setState(1737);
				expr(0);
				setState(1738);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1740);
				any_name();
				}
				break;
			}
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1743);
				match(T__20);
				setState(1745); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1744);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1747); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
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
		enterRule(_localctx, 164, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1751);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1752);
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
		enterRule(_localctx, 166, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1755);
				match(K_ON);
				setState(1756);
				match(K_CONFLICT);
				setState(1757);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (K_FAIL - 98)) | (1L << (K_IGNORE - 98)) | (1L << (K_REPLACE - 98)) | (1L << (K_ROLLBACK - 98)))) != 0)) ) {
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1761);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1762);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1766);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
					case 1:
						{
						setState(1763);
						database_name();
						setState(1764);
						match(DOT);
						}
						break;
					}
					setState(1768);
					table_name();
					setState(1769);
					match(DOT);
					}
					break;
				}
				setState(1773);
				column_name();
				}
				break;
			case 4:
				{
				setState(1774);
				unary_operator();
				setState(1775);
				expr(22);
				}
				break;
			case 5:
				{
				setState(1777);
				function_name();
				setState(1778);
				match(OPEN_PAR);
				setState(1791);
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
					setState(1780);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(1779);
						match(K_DISTINCT);
						}
					}

					setState(1782);
					expr(0);
					setState(1787);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1783);
						match(COMMA);
						setState(1784);
						expr(0);
						}
						}
						setState(1789);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1790);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1793);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1795);
				match(OPEN_PAR);
				setState(1796);
				expr(0);
				setState(1797);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1799);
				match(K_CAST);
				setState(1800);
				match(OPEN_PAR);
				setState(1801);
				expr(0);
				setState(1802);
				match(K_AS);
				setState(1803);
				type_name();
				setState(1804);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1807);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1806);
						match(K_NOT);
						}
					}

					setState(1809);
					match(K_EXISTS);
					}
				}

				setState(1812);
				match(OPEN_PAR);
				setState(1813);
				select_stmt();
				setState(1814);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1816);
				match(K_CASE);
				setState(1818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_CASE - 65)) | (1L << (K_CAST - 65)) | (1L << (K_COMMIT - 65)) | (1L << (K_CREATE - 65)) | (1L << (K_CURRENT_DATE - 65)) | (1L << (K_CURRENT_TIME - 65)) | (1L << (K_CURRENT_TIMESTAMP - 65)) | (1L << (K_DELETE - 65)) | (1L << (K_DETACH - 65)) | (1L << (K_DROP - 65)) | (1L << (K_END - 65)) | (1L << (K_EXISTS - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_INSERT - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_NOT - 129)) | (1L << (K_NULL - 129)) | (1L << (K_PRAGMA - 129)) | (1L << (K_RAISE - 129)) | (1L << (K_REINDEX - 129)) | (1L << (K_RELEASE - 129)) | (1L << (K_REPLACE - 129)) | (1L << (K_ROLLBACK - 129)) | (1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)) | (1L << (IDENTIFIER - 129)) | (1L << (NUMERIC_LITERAL - 129)) | (1L << (BIND_PARAMETER - 129)) | (1L << (STRING_LITERAL - 129)) | (1L << (BLOB_LITERAL - 129)))) != 0)) {
					{
					setState(1817);
					expr(0);
					}
				}

				setState(1825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1820);
					match(K_WHEN);
					setState(1821);
					expr(0);
					setState(1822);
					match(K_THEN);
					setState(1823);
					expr(0);
					}
					}
					setState(1827); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1829);
					match(K_ELSE);
					setState(1830);
					expr(0);
					}
				}

				setState(1833);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1835);
				raise_function();
				}
				break;
			case 11:
				{
				setState(1836);
				sql_stmt_list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1939);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1937);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1839);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1840);
						match(PIPE2);
						setState(1841);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1842);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1843);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1844);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1845);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1846);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1847);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1848);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1849);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1850);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1851);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1852);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1853);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1854);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1867);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
						case 1:
							{
							setState(1855);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1856);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1857);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1858);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1859);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1860);
							match(K_IS);
							setState(1861);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1862);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1863);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1864);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1865);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1866);
							match(K_REGEXP);
							}
							break;
						}
						setState(1869);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1870);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1871);
						match(K_AND);
						setState(1872);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1873);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1874);
						match(K_OR);
						setState(1875);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1876);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1877);
						match(K_IS);
						setState(1879);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
						case 1:
							{
							setState(1878);
							match(K_NOT);
							}
							break;
						}
						setState(1881);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1882);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1884);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1883);
							match(K_NOT);
							}
						}

						setState(1886);
						match(K_BETWEEN);
						setState(1887);
						expr(0);
						setState(1888);
						match(K_AND);
						setState(1889);
						expr(7);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1891);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1892);
						match(K_COLLATE);
						setState(1893);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1894);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1896);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1895);
							match(K_NOT);
							}
						}

						setState(1898);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (K_GLOB - 103)) | (1L << (K_LIKE - 103)) | (1L << (K_MATCH - 103)) | (1L << (K_REGEXP - 103)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1899);
						expr(0);
						setState(1902);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
						case 1:
							{
							setState(1900);
							match(K_ESCAPE);
							setState(1901);
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
						setState(1904);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1909);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1905);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1906);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1907);
							match(K_NOT);
							setState(1908);
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
						setState(1911);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1913);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1912);
							match(K_NOT);
							}
						}

						setState(1915);
						match(K_IN);
						setState(1935);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
						case 1:
							{
							setState(1916);
							match(OPEN_PAR);
							setState(1926);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
							case 1:
								{
								setState(1917);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1918);
								expr(0);
								setState(1923);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1919);
									match(COMMA);
									setState(1920);
									expr(0);
									}
									}
									setState(1925);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1928);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1932);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
							case 1:
								{
								setState(1929);
								database_name();
								setState(1930);
								match(DOT);
								}
								break;
							}
							setState(1934);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
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
		enterRule(_localctx, 170, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(K_REFERENCES);
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1943);
				database_name();
				setState(1944);
				match(DOT);
				}
				break;
			}
			setState(1948);
			foreign_table();
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1949);
				match(OPEN_PAR);
				setState(1950);
				fk_target_column_name();
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1951);
					match(COMMA);
					setState(1952);
					fk_target_column_name();
					}
					}
					setState(1957);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1958);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1976);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(1962);
						match(K_ON);
						setState(1963);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1972);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
						case 1:
							{
							setState(1964);
							match(K_SET);
							setState(1965);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(1966);
							match(K_SET);
							setState(1967);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(1968);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(1969);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(1970);
							match(K_NO);
							setState(1971);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(1974);
						match(K_MATCH);
						setState(1975);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			setState(1996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1983);
					match(K_NOT);
					}
				}

				setState(1986);
				match(K_DEFERRABLE);
				setState(1991);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(1987);
					match(K_INITIALLY);
					setState(1988);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1989);
					match(K_INITIALLY);
					setState(1990);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(1993);
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
		enterRule(_localctx, 172, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
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
		enterRule(_localctx, 174, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(K_RAISE);
			setState(2001);
			match(OPEN_PAR);
			setState(2006);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(2002);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(2003);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2004);
				match(COMMA);
				setState(2005);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2008);
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
		enterRule(_localctx, 176, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			column_name();
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(2011);
				match(K_COLLATE);
				setState(2012);
				collation_name();
				}
			}

			setState(2016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(2015);
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
		enterRule(_localctx, 178, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(2018);
				match(K_CONSTRAINT);
				setState(2019);
				name();
				}
			}

			setState(2031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(2022);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(2023);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(2024);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(2025);
				match(K_CHECK);
				setState(2026);
				match(OPEN_PAR);
				setState(2027);
				expr(0);
				setState(2028);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(2030);
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
		enterRule(_localctx, 180, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			match(K_PRIMARY);
			setState(2034);
			match(K_KEY);
			setState(2035);
			match(OPEN_PAR);
			setState(2036);
			indexed_column();
			setState(2041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2037);
				match(COMMA);
				setState(2038);
				indexed_column();
				}
				}
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2044);
			match(CLOSE_PAR);
			setState(2045);
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
		enterRule(_localctx, 182, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			match(K_FOREIGN);
			setState(2048);
			match(K_KEY);
			setState(2049);
			match(OPEN_PAR);
			setState(2050);
			fk_origin_column_name();
			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2051);
				match(COMMA);
				setState(2052);
				fk_origin_column_name();
				}
				}
				setState(2057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2058);
			match(CLOSE_PAR);
			setState(2059);
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
		enterRule(_localctx, 184, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2061);
			match(K_UNIQUE);
			setState(2063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(2062);
				match(K_KEY);
				}
			}

			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2065);
				name();
				}
				break;
			}
			setState(2068);
			match(OPEN_PAR);
			setState(2069);
			indexed_column();
			setState(2074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2070);
				match(COMMA);
				setState(2071);
				indexed_column();
				}
				}
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2077);
			match(CLOSE_PAR);
			setState(2078);
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
		enterRule(_localctx, 186, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			match(K_KEY);
			setState(2082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2081);
				name();
				}
				break;
			}
			setState(2084);
			match(OPEN_PAR);
			setState(2085);
			indexed_column();
			setState(2090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2086);
				match(COMMA);
				setState(2087);
				indexed_column();
				}
				}
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2093);
			match(CLOSE_PAR);
			setState(2094);
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
		enterRule(_localctx, 188, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2096);
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
		enterRule(_localctx, 190, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2098);
			match(K_WITH);
			setState(2100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RECURSIVE) {
				{
				setState(2099);
				match(K_RECURSIVE);
				}
			}

			setState(2102);
			cte_table_name();
			setState(2103);
			match(K_AS);
			setState(2104);
			match(OPEN_PAR);
			setState(2105);
			select_stmt();
			setState(2106);
			match(CLOSE_PAR);
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2107);
				match(COMMA);
				setState(2108);
				cte_table_name();
				setState(2109);
				match(K_AS);
				setState(2110);
				match(OPEN_PAR);
				setState(2111);
				select_stmt();
				setState(2112);
				match(CLOSE_PAR);
				}
				}
				setState(2118);
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
		enterRule(_localctx, 192, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2119);
				database_name();
				setState(2120);
				match(DOT);
				}
				break;
			}
			setState(2124);
			table_name();
			setState(2130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2125);
				match(K_INDEXED);
				setState(2126);
				match(K_BY);
				setState(2127);
				index_name();
				}
				break;
			case 2:
				{
				setState(2128);
				match(K_NOT);
				setState(2129);
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
		enterRule(_localctx, 194, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			expr(0);
			setState(2135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2133);
				match(K_COLLATE);
				setState(2134);
				collation_name();
				}
				break;
			}
			setState(2138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2137);
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
		enterRule(_localctx, 196, RULE_pragma_value);
		try {
			setState(2143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2140);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2141);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2142);
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
		enterRule(_localctx, 198, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			table_name();
			setState(2157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2146);
				match(OPEN_PAR);
				setState(2147);
				column_name();
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2148);
					match(COMMA);
					setState(2149);
					column_name();
					}
					}
					setState(2154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2155);
				match(CLOSE_PAR);
				}
			}

			setState(2159);
			match(K_AS);
			setState(2160);
			match(OPEN_PAR);
			setState(2161);
			select_stmt();
			setState(2162);
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
		enterRule(_localctx, 200, RULE_result_column);
		int _la;
		try {
			setState(2176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2164);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2165);
				table_name();
				setState(2166);
				match(DOT);
				setState(2167);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2169);
				expr(0);
				setState(2174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2171);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2170);
						match(K_AS);
						}
					}

					setState(2173);
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
		enterRule(_localctx, 202, RULE_table_or_subquery);
		int _la;
		try {
			setState(2225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2178);
					database_name();
					setState(2179);
					match(DOT);
					}
					break;
				}
				setState(2183);
				table_name();
				setState(2188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2184);
						match(K_AS);
						}
					}

					setState(2187);
					table_alias();
					}
					break;
				}
				setState(2195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2190);
					match(K_INDEXED);
					setState(2191);
					match(K_BY);
					setState(2192);
					index_name();
					}
					break;
				case 2:
					{
					setState(2193);
					match(K_NOT);
					setState(2194);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2197);
				match(OPEN_PAR);
				setState(2207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2198);
					table_or_subquery();
					setState(2203);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2199);
						match(COMMA);
						setState(2200);
						table_or_subquery();
						}
						}
						setState(2205);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2206);
					join_clause();
					}
					break;
				}
				setState(2209);
				match(CLOSE_PAR);
				setState(2214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2211);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2210);
						match(K_AS);
						}
					}

					setState(2213);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2216);
				match(OPEN_PAR);
				setState(2217);
				select_stmt();
				setState(2218);
				match(CLOSE_PAR);
				setState(2223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
				case 1:
					{
					setState(2220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2219);
						match(K_AS);
						}
					}

					setState(2222);
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
		enterRule(_localctx, 204, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			table_or_subquery();
			setState(2234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2228);
					join_operator();
					setState(2229);
					table_or_subquery();
					setState(2230);
					join_constraint();
					}
					} 
				}
				setState(2236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
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
		enterRule(_localctx, 206, RULE_join_operator);
		int _la;
		try {
			setState(2250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2237);
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
				setState(2239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(2238);
					match(K_NATURAL);
					}
				}

				setState(2247);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(2241);
					match(K_LEFT);
					setState(2243);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(2242);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(2245);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(2246);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(2249);
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
		enterRule(_localctx, 208, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2252);
				match(K_ON);
				setState(2253);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2254);
				match(K_USING);
				setState(2255);
				match(OPEN_PAR);
				setState(2256);
				column_name();
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2257);
					match(COMMA);
					setState(2258);
					column_name();
					}
					}
					setState(2263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2264);
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
		enterRule(_localctx, 210, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(2342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2268);
				match(K_SELECT);
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(2269);
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

				setState(2272);
				result_column();
				setState(2277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2273);
						match(COMMA);
						setState(2274);
						result_column();
						}
						} 
					}
					setState(2279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
				}
				setState(2292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2280);
					match(K_FROM);
					setState(2290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
					case 1:
						{
						setState(2281);
						table_or_subquery();
						setState(2286);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2282);
								match(COMMA);
								setState(2283);
								table_or_subquery();
								}
								} 
							}
							setState(2288);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(2289);
						join_clause();
						}
						break;
					}
					}
					break;
				}
				setState(2296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2294);
					match(K_WHERE);
					setState(2295);
					expr(0);
					}
					break;
				}
				setState(2312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2298);
					match(K_GROUP);
					setState(2299);
					match(K_BY);
					setState(2300);
					expr(0);
					setState(2305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2301);
							match(COMMA);
							setState(2302);
							expr(0);
							}
							} 
						}
						setState(2307);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
					}
					setState(2310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						setState(2308);
						match(K_HAVING);
						setState(2309);
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
				setState(2314);
				match(K_VALUES);
				setState(2315);
				match(OPEN_PAR);
				setState(2316);
				expr(0);
				setState(2321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2317);
					match(COMMA);
					setState(2318);
					expr(0);
					}
					}
					setState(2323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2324);
				match(CLOSE_PAR);
				setState(2339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2325);
						match(COMMA);
						setState(2326);
						match(OPEN_PAR);
						setState(2327);
						expr(0);
						setState(2332);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(2328);
							match(COMMA);
							setState(2329);
							expr(0);
							}
							}
							setState(2334);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(2335);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(2341);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
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
		enterRule(_localctx, 212, RULE_compound_operator);
		try {
			setState(2349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2344);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2345);
				match(K_UNION);
				setState(2346);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2347);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2348);
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
		enterRule(_localctx, 214, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2351);
			table_name();
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2352);
				match(OPEN_PAR);
				setState(2353);
				column_name();
				setState(2358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2354);
					match(COMMA);
					setState(2355);
					column_name();
					}
					}
					setState(2360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2361);
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
		enterRule(_localctx, 216, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(2366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2365);
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

				setState(2368);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(2369);
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
		enterRule(_localctx, 218, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_CURRENT_DATE - 76)) | (1L << (K_CURRENT_TIME - 76)) | (1L << (K_CURRENT_TIMESTAMP - 76)) | (1L << (K_NULL - 76)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (IDENTIFIER - 184)) | (1L << (NUMERIC_LITERAL - 184)) | (1L << (STRING_LITERAL - 184)) | (1L << (BLOB_LITERAL - 184)))) != 0)) ) {
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
		enterRule(_localctx, 220, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
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
		enterRule(_localctx, 222, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
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
		enterRule(_localctx, 224, RULE_module_argument);
		try {
			setState(2380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2378);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2379);
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
		enterRule(_localctx, 226, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
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
		enterRule(_localctx, 228, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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
		enterRule(_localctx, 230, RULE_unknown);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2387); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2386);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2389); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
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
		enterRule(_localctx, 232, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
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
		enterRule(_localctx, 234, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2393);
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
		enterRule(_localctx, 236, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
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
		enterRule(_localctx, 238, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
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
		enterRule(_localctx, 240, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
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
		enterRule(_localctx, 242, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
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
		enterRule(_localctx, 244, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
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
		enterRule(_localctx, 246, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2405);
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
		enterRule(_localctx, 248, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2407);
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
		enterRule(_localctx, 250, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2409);
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
		enterRule(_localctx, 252, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
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
		enterRule(_localctx, 254, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
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
		enterRule(_localctx, 256, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2415);
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
		enterRule(_localctx, 258, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
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
		enterRule(_localctx, 260, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419);
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
		enterRule(_localctx, 262, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2421);
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
		enterRule(_localctx, 264, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
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
		enterRule(_localctx, 266, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
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
		enterRule(_localctx, 268, RULE_method_ID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
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
		enterRule(_localctx, 270, RULE_any_name);
		try {
			setState(2435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2429);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2430);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(2431);
				match(OPEN_PAR);
				setState(2432);
				any_name();
				setState(2433);
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
		case 17:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 84:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 5);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c3\u0988\4\2\t"+
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
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\3\2\7\2\u0115\n\2\f\2\16\2\u0118\13\2\3\2\3\2\3\2\7\2\u011d\n\2\f"+
		"\2\16\2\u0120\13\2\3\2\3\2\7\2\u0124\n\2\f\2\16\2\u0127\13\2\3\2\3\2\3"+
		"\2\5\2\u012c\n\2\3\3\3\3\3\3\3\4\7\4\u0132\n\4\f\4\16\4\u0135\13\4\3\4"+
		"\3\4\6\4\u0139\n\4\r\4\16\4\u013a\3\4\7\4\u013e\n\4\f\4\16\4\u0141\13"+
		"\4\3\4\7\4\u0144\n\4\f\4\16\4\u0147\13\4\3\5\3\5\3\5\3\5\5\5\u014d\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u0156\n\7\3\7\3\7\3\7\7\7\u015b\n\7\f"+
		"\7\16\7\u015e\13\7\3\7\5\7\u0161\n\7\3\7\3\7\3\7\7\7\u0166\n\7\f\7\16"+
		"\7\u0169\13\7\5\7\u016b\n\7\3\b\5\b\u016e\n\b\3\b\3\b\7\b\u0172\n\b\f"+
		"\b\16\b\u0175\13\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0181\n"+
		"\n\3\n\5\n\u0184\n\n\3\n\3\n\5\n\u0188\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\5\13\u0190\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u019a\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01a7\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01b4\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u01be\n\17\5\17\u01c0\n\17\5\17\u01c2\n"+
		"\17\3\20\3\20\3\20\3\20\3\20\7\20\u01c9\n\20\f\20\16\20\u01cc\13\20\7"+
		"\20\u01ce\n\20\f\20\16\20\u01d1\13\20\3\20\3\20\7\20\u01d5\n\20\f\20\16"+
		"\20\u01d8\13\20\7\20\u01da\n\20\f\20\16\20\u01dd\13\20\5\20\u01df\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u01f0\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u01ff\n\21\7\21\u0201\n\21\f\21\16\21\u0204\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0210\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0219\n\22\7\22\u021b\n\22\f\22\16"+
		"\22\u021e\13\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0226\n\23\3\23\3\23"+
		"\3\23\5\23\u022b\n\23\5\23\u022d\n\23\3\23\3\23\3\23\5\23\u0232\n\23\5"+
		"\23\u0234\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u023c\n\23\3\23\3\23"+
		"\3\23\7\23\u0241\n\23\f\23\16\23\u0244\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u025a\n\25\5\25\u025c\n\25\3\26\3\26\3\27\3\27\7\27\u0262\n"+
		"\27\f\27\16\27\u0265\13\27\3\27\5\27\u0268\n\27\3\27\3\27\3\30\3\30\7"+
		"\30\u026e\n\30\f\30\16\30\u0271\13\30\3\30\5\30\u0274\n\30\3\30\3\30\3"+
		"\31\3\31\5\31\u027a\n\31\3\32\3\32\5\32\u027e\n\32\3\33\3\33\7\33\u0282"+
		"\n\33\f\33\16\33\u0285\13\33\3\33\3\33\3\33\5\33\u028a\n\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0294\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u029e\n\35\3\36\3\36\3\36\5\36\u02a3\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u02ab\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u02b5"+
		"\n \3!\3!\3!\5!\u02ba\n!\3\"\6\"\u02bd\n\"\r\"\16\"\u02be\3\"\7\"\u02c2"+
		"\n\"\f\"\16\"\u02c5\13\"\3\"\5\"\u02c8\n\"\3#\6#\u02cb\n#\r#\16#\u02cc"+
		"\3#\7#\u02d0\n#\f#\16#\u02d3\13#\3#\5#\u02d6\n#\3$\3$\3$\3$\5$\u02dc\n"+
		"$\3%\3%\3%\5%\u02e1\n%\3%\3%\3%\6%\u02e6\n%\r%\16%\u02e7\3%\5%\u02eb\n"+
		"%\3%\3%\3%\3%\3%\6%\u02f2\n%\r%\16%\u02f3\5%\u02f6\n%\3%\3%\3%\3%\3%\5"+
		"%\u02fd\n%\3&\3&\3&\3&\3&\3&\5&\u0305\n&\3\'\3\'\3\'\5\'\u030a\n\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u031b\n(\3)\3)\3)\3"+
		")\3)\3*\3*\3*\5*\u0325\n*\5*\u0327\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0347\n"+
		"*\3+\3+\3+\5+\u034c\n+\3+\3+\3+\5+\u0351\n+\3+\3+\3+\3+\3+\3+\3+\3+\5"+
		"+\u035b\n+\3+\5+\u035e\n+\3+\5+\u0361\n+\3+\5+\u0364\n+\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\5.\u0375\n.\3/\3/\5/\u0379\n/\3/\3/\3"+
		"/\3/\3\60\3\60\5\60\u0381\n\60\3\60\3\60\5\60\u0385\n\60\5\60\u0387\n"+
		"\60\3\61\3\61\3\61\5\61\u038c\n\61\5\61\u038e\n\61\3\62\3\62\5\62\u0392"+
		"\n\62\3\62\3\62\3\62\7\62\u0397\n\62\f\62\16\62\u039a\13\62\5\62\u039c"+
		"\n\62\3\62\3\62\3\62\5\62\u03a1\n\62\3\62\3\62\5\62\u03a5\n\62\3\62\6"+
		"\62\u03a8\n\62\r\62\16\62\u03a9\3\62\3\62\3\62\3\62\3\62\7\62\u03b1\n"+
		"\62\f\62\16\62\u03b4\13\62\5\62\u03b6\n\62\3\62\3\62\3\62\3\62\5\62\u03bc"+
		"\n\62\5\62\u03be\n\62\3\63\3\63\5\63\u03c2\n\63\3\63\3\63\3\63\3\63\5"+
		"\63\u03c8\n\63\3\63\3\63\3\63\5\63\u03cd\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u03d6\n\63\f\63\16\63\u03d9\13\63\3\63\3\63\3\63\5\63"+
		"\u03de\n\63\3\64\3\64\5\64\u03e2\n\64\3\64\3\64\3\64\3\64\5\64\u03e8\n"+
		"\64\3\64\3\64\3\64\5\64\u03ed\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\7\64\u03f6\n\64\f\64\16\64\u03f9\13\64\3\64\3\64\3\64\5\64\u03fe\n\64"+
		"\3\64\3\64\5\64\u0402\n\64\3\64\5\64\u0405\n\64\3\65\3\65\5\65\u0409\n"+
		"\65\3\65\3\65\3\65\3\65\5\65\u040f\n\65\3\65\3\65\3\65\5\65\u0414\n\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u041b\n\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\7\65\u0424\n\65\f\65\16\65\u0427\13\65\5\65\u0429\n\65\5\65\u042b"+
		"\n\65\3\65\3\65\3\65\3\65\5\65\u0431\n\65\3\65\3\65\3\65\3\65\5\65\u0437"+
		"\n\65\3\65\3\65\5\65\u043b\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u0442\n"+
		"\65\3\65\3\65\6\65\u0446\n\65\r\65\16\65\u0447\3\65\3\65\3\66\3\66\5\66"+
		"\u044e\n\66\3\66\3\66\3\66\3\66\5\66\u0454\n\66\3\66\3\66\3\66\5\66\u0459"+
		"\n\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0465\n\67"+
		"\3\67\3\67\3\67\5\67\u046a\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67"+
		"\u0473\n\67\f\67\16\67\u0476\13\67\3\67\3\67\5\67\u047a\n\67\38\58\u047d"+
		"\n8\38\38\38\38\38\58\u0484\n8\39\59\u0487\n9\39\39\39\39\59\u048d\n9"+
		"\39\39\59\u0491\n9\39\39\39\39\39\79\u0498\n9\f9\169\u049b\139\59\u049d"+
		"\n9\39\39\39\39\59\u04a3\n9\59\u04a5\n9\3:\3:\5:\u04a9\n:\3:\3:\3;\3;"+
		"\3;\3;\5;\u04b1\n;\3;\3;\3;\5;\u04b6\n;\3;\3;\3<\3<\3<\3<\5<\u04be\n<"+
		"\3<\3<\3<\5<\u04c3\n<\3<\3<\3=\3=\3=\3=\5=\u04cb\n=\3=\3=\3=\5=\u04d0"+
		"\n=\3=\3=\3>\3>\3>\3>\5>\u04d8\n>\3>\3>\3>\5>\u04dd\n>\3>\3>\3?\3?\5?"+
		"\u04e3\n?\3?\3?\3?\7?\u04e8\n?\f?\16?\u04eb\13?\5?\u04ed\n?\3?\3?\3?\3"+
		"?\7?\u04f3\n?\f?\16?\u04f6\13?\3?\3?\3?\3?\3?\7?\u04fd\n?\f?\16?\u0500"+
		"\13?\5?\u0502\n?\3?\3?\3?\3?\5?\u0508\n?\5?\u050a\n?\3@\5@\u050d\n@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0520\n@\3@\3@\3"+
		"@\3@\5@\u0526\n@\3@\3@\3@\3@\3@\7@\u052d\n@\f@\16@\u0530\13@\3@\3@\5@"+
		"\u0534\n@\3@\3@\3@\3@\3@\7@\u053b\n@\f@\16@\u053e\13@\3@\3@\3@\3@\3@\3"+
		"@\7@\u0546\n@\f@\16@\u0549\13@\3@\3@\7@\u054d\n@\f@\16@\u0550\13@\3@\3"+
		"@\3@\5@\u0555\n@\3A\3A\3A\3A\5A\u055b\nA\3A\3A\3A\3A\3A\3A\3A\5A\u0564"+
		"\nA\3B\3B\3B\3B\3B\5B\u056b\nB\3B\3B\5B\u056f\nB\5B\u0571\nB\3C\3C\5C"+
		"\u0575\nC\3C\3C\3D\3D\3D\5D\u057c\nD\5D\u057e\nD\3D\3D\5D\u0582\nD\3D"+
		"\5D\u0585\nD\3E\3E\3E\3F\3F\5F\u058c\nF\3F\3F\3F\7F\u0591\nF\fF\16F\u0594"+
		"\13F\5F\u0596\nF\3F\3F\3F\3F\3F\3F\7F\u059e\nF\fF\16F\u05a1\13F\5F\u05a3"+
		"\nF\3F\3F\3F\3F\5F\u05a9\nF\5F\u05ab\nF\3G\3G\5G\u05af\nG\3G\3G\3G\7G"+
		"\u05b4\nG\fG\16G\u05b7\13G\5G\u05b9\nG\3G\3G\3G\3G\7G\u05bf\nG\fG\16G"+
		"\u05c2\13G\3G\3G\3G\3G\3G\7G\u05c9\nG\fG\16G\u05cc\13G\5G\u05ce\nG\3G"+
		"\3G\3G\3G\5G\u05d4\nG\5G\u05d6\nG\3H\3H\5H\u05da\nH\3H\3H\3H\7H\u05df"+
		"\nH\fH\16H\u05e2\13H\3H\3H\3H\3H\7H\u05e8\nH\fH\16H\u05eb\13H\3H\5H\u05ee"+
		"\nH\5H\u05f0\nH\3H\3H\5H\u05f4\nH\3H\3H\3H\3H\3H\7H\u05fb\nH\fH\16H\u05fe"+
		"\13H\3H\3H\5H\u0602\nH\5H\u0604\nH\3H\3H\3H\3H\3H\7H\u060b\nH\fH\16H\u060e"+
		"\13H\3H\3H\3H\3H\3H\3H\7H\u0616\nH\fH\16H\u0619\13H\3H\3H\7H\u061d\nH"+
		"\fH\16H\u0620\13H\5H\u0622\nH\3I\5I\u0625\nI\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\5I\u0632\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u063e\nI\fI\16I\u0641"+
		"\13I\3I\3I\5I\u0645\nI\3J\5J\u0648\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\5J\u0655\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\7J\u0661\nJ\fJ\16J\u0664\13"+
		"J\3J\3J\5J\u0668\nJ\3J\3J\3J\3J\3J\7J\u066f\nJ\fJ\16J\u0672\13J\5J\u0674"+
		"\nJ\3J\3J\3J\3J\5J\u067a\nJ\5J\u067c\nJ\3K\3K\3L\3L\3L\7L\u0683\nL\fL"+
		"\16L\u0686\13L\3M\3M\3M\3M\5M\u068c\nM\3M\3M\3M\3M\3M\5M\u0693\nM\3M\3"+
		"M\3M\5M\u0698\nM\3M\3M\5M\u069c\nM\3N\3N\5N\u06a0\nN\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u06b0\nN\3O\3O\3O\5O\u06b5\nO\3O\3O\5O\u06b9"+
		"\nO\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S"+
		"\u06d0\nS\3S\3S\6S\u06d4\nS\rS\16S\u06d5\5S\u06d8\nS\3T\3T\5T\u06dc\n"+
		"T\3U\3U\3U\5U\u06e1\nU\3V\3V\3V\3V\3V\3V\5V\u06e9\nV\3V\3V\3V\5V\u06ee"+
		"\nV\3V\3V\3V\3V\3V\3V\3V\5V\u06f7\nV\3V\3V\3V\7V\u06fc\nV\fV\16V\u06ff"+
		"\13V\3V\5V\u0702\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0712"+
		"\nV\3V\5V\u0715\nV\3V\3V\3V\3V\3V\3V\5V\u071d\nV\3V\3V\3V\3V\3V\6V\u0724"+
		"\nV\rV\16V\u0725\3V\3V\5V\u072a\nV\3V\3V\3V\3V\5V\u0730\nV\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\5V\u074e\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u075a\nV\3V\3V\3V\5"+
		"V\u075f\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u076b\nV\3V\3V\3V\3V\5V\u0771"+
		"\nV\3V\3V\3V\3V\3V\5V\u0778\nV\3V\3V\5V\u077c\nV\3V\3V\3V\3V\3V\3V\7V"+
		"\u0784\nV\fV\16V\u0787\13V\5V\u0789\nV\3V\3V\3V\3V\5V\u078f\nV\3V\5V\u0792"+
		"\nV\7V\u0794\nV\fV\16V\u0797\13V\3W\3W\3W\3W\5W\u079d\nW\3W\3W\3W\3W\3"+
		"W\7W\u07a4\nW\fW\16W\u07a7\13W\3W\3W\5W\u07ab\nW\3W\3W\3W\3W\3W\3W\3W"+
		"\3W\3W\3W\5W\u07b7\nW\3W\3W\5W\u07bb\nW\7W\u07bd\nW\fW\16W\u07c0\13W\3"+
		"W\5W\u07c3\nW\3W\3W\3W\3W\3W\5W\u07ca\nW\3W\5W\u07cd\nW\5W\u07cf\nW\3"+
		"X\3X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u07d9\nY\3Y\3Y\3Z\3Z\3Z\5Z\u07e0\nZ\3Z\5Z\u07e3"+
		"\nZ\3[\3[\5[\u07e7\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u07f2\n[\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\7\\\u07fa\n\\\f\\\16\\\u07fd\13\\\3\\\3\\\3\\\3]\3]\3]"+
		"\3]\3]\3]\7]\u0808\n]\f]\16]\u080b\13]\3]\3]\3]\3^\3^\5^\u0812\n^\3^\5"+
		"^\u0815\n^\3^\3^\3^\3^\7^\u081b\n^\f^\16^\u081e\13^\3^\3^\3^\3_\3_\5_"+
		"\u0825\n_\3_\3_\3_\3_\7_\u082b\n_\f_\16_\u082e\13_\3_\3_\3_\3`\3`\3a\3"+
		"a\5a\u0837\na\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\7a\u0845\na\fa\16a\u0848"+
		"\13a\3b\3b\3b\5b\u084d\nb\3b\3b\3b\3b\3b\3b\5b\u0855\nb\3c\3c\3c\5c\u085a"+
		"\nc\3c\5c\u085d\nc\3d\3d\3d\5d\u0862\nd\3e\3e\3e\3e\3e\7e\u0869\ne\fe"+
		"\16e\u086c\13e\3e\3e\5e\u0870\ne\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3f\5"+
		"f\u087e\nf\3f\5f\u0881\nf\5f\u0883\nf\3g\3g\3g\5g\u0888\ng\3g\3g\5g\u088c"+
		"\ng\3g\5g\u088f\ng\3g\3g\3g\3g\3g\5g\u0896\ng\3g\3g\3g\3g\7g\u089c\ng"+
		"\fg\16g\u089f\13g\3g\5g\u08a2\ng\3g\3g\5g\u08a6\ng\3g\5g\u08a9\ng\3g\3"+
		"g\3g\3g\5g\u08af\ng\3g\5g\u08b2\ng\5g\u08b4\ng\3h\3h\3h\3h\3h\7h\u08bb"+
		"\nh\fh\16h\u08be\13h\3i\3i\5i\u08c2\ni\3i\3i\5i\u08c6\ni\3i\3i\5i\u08ca"+
		"\ni\3i\5i\u08cd\ni\3j\3j\3j\3j\3j\3j\3j\7j\u08d6\nj\fj\16j\u08d9\13j\3"+
		"j\3j\5j\u08dd\nj\3k\3k\5k\u08e1\nk\3k\3k\3k\7k\u08e6\nk\fk\16k\u08e9\13"+
		"k\3k\3k\3k\3k\7k\u08ef\nk\fk\16k\u08f2\13k\3k\5k\u08f5\nk\5k\u08f7\nk"+
		"\3k\3k\5k\u08fb\nk\3k\3k\3k\3k\3k\7k\u0902\nk\fk\16k\u0905\13k\3k\3k\5"+
		"k\u0909\nk\5k\u090b\nk\3k\3k\3k\3k\3k\7k\u0912\nk\fk\16k\u0915\13k\3k"+
		"\3k\3k\3k\3k\3k\7k\u091d\nk\fk\16k\u0920\13k\3k\3k\7k\u0924\nk\fk\16k"+
		"\u0927\13k\5k\u0929\nk\3l\3l\3l\3l\3l\5l\u0930\nl\3m\3m\3m\3m\3m\7m\u0937"+
		"\nm\fm\16m\u093a\13m\3m\3m\5m\u093e\nm\3n\5n\u0941\nn\3n\3n\5n\u0945\n"+
		"n\3o\3o\3p\3p\3q\3q\3r\3r\5r\u094f\nr\3s\3s\3t\3t\3u\6u\u0956\nu\ru\16"+
		"u\u0957\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3"+
		"\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3"+
		"\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0986"+
		"\n\u0089\3\u0089\2\4$\u00aa\u008a\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\2\32"+
		"\4\2\36 #$\3\2).\3\2\u00b8\u00b9\4\2\t\t\"\"\5\2\r\26\35\35\37\37\4\2"+
		"\35\35),\5\2TTaann\4\2HH]]\4\2\34\34\u0087\u0087\3\2\u00a4\u00a5\4\2\65"+
		"\65XX\4\2::VV\7\2\61\61ddmm\u0099\u0099\u009d\u009d\4\2\36\36#$\3\2\37"+
		" \3\2%(\3\2),\6\2ii}}\177\177\u0095\u0095\4\2UU\u00ac\u00ac\5\2\61\61"+
		"dd\u009d\u009d\6\2NP\u0085\u0085\u00ba\u00bb\u00bd\u00be\4\2\37!\u0083"+
		"\u0083\4\2\u00ba\u00ba\u00bd\u00bd\t\2\61?AJLXZ\u0088\u008a\u008f\u0091"+
		"\u00a1\u00a3\u00b7\2\u0ade\2\u012b\3\2\2\2\4\u012d\3\2\2\2\6\u0133\3\2"+
		"\2\2\b\u0148\3\2\2\2\n\u014e\3\2\2\2\f\u0155\3\2\2\2\16\u016d\3\2\2\2"+
		"\20\u0176\3\2\2\2\22\u017b\3\2\2\2\24\u018b\3\2\2\2\26\u0193\3\2\2\2\30"+
		"\u01a6\3\2\2\2\32\u01b3\3\2\2\2\34\u01c1\3\2\2\2\36\u01c3\3\2\2\2 \u01e2"+
		"\3\2\2\2\"\u0207\3\2\2\2$\u023b\3\2\2\2&\u0245\3\2\2\2(\u025b\3\2\2\2"+
		"*\u025d\3\2\2\2,\u025f\3\2\2\2.\u026b\3\2\2\2\60\u0279\3\2\2\2\62\u027d"+
		"\3\2\2\2\64\u027f\3\2\2\2\66\u028d\3\2\2\28\u0295\3\2\2\2:\u029f\3\2\2"+
		"\2<\u02a4\3\2\2\2>\u02ac\3\2\2\2@\u02b6\3\2\2\2B\u02bc\3\2\2\2D\u02ca"+
		"\3\2\2\2F\u02db\3\2\2\2H\u02dd\3\2\2\2J\u02fe\3\2\2\2L\u0306\3\2\2\2N"+
		"\u0311\3\2\2\2P\u031c\3\2\2\2R\u0326\3\2\2\2T\u0348\3\2\2\2V\u0365\3\2"+
		"\2\2X\u036a\3\2\2\2Z\u036d\3\2\2\2\\\u0376\3\2\2\2^\u037e\3\2\2\2`\u0388"+
		"\3\2\2\2b\u039b\3\2\2\2d\u03bf\3\2\2\2f\u03df\3\2\2\2h\u0406\3\2\2\2j"+
		"\u044b\3\2\2\2l\u045e\3\2\2\2n\u047c\3\2\2\2p\u0486\3\2\2\2r\u04a6\3\2"+
		"\2\2t\u04ac\3\2\2\2v\u04b9\3\2\2\2x\u04c6\3\2\2\2z\u04d3\3\2\2\2|\u04ec"+
		"\3\2\2\2~\u050c\3\2\2\2\u0080\u0556\3\2\2\2\u0082\u0565\3\2\2\2\u0084"+
		"\u0572\3\2\2\2\u0086\u0578\3\2\2\2\u0088\u0586\3\2\2\2\u008a\u0595\3\2"+
		"\2\2\u008c\u05b8\3\2\2\2\u008e\u0621\3\2\2\2\u0090\u0624\3\2\2\2\u0092"+
		"\u0647\3\2\2\2\u0094\u067d\3\2\2\2\u0096\u067f\3\2\2\2\u0098\u0687\3\2"+
		"\2\2\u009a\u069f\3\2\2\2\u009c\u06b1\3\2\2\2\u009e\u06ba\3\2\2\2\u00a0"+
		"\u06bc\3\2\2\2\u00a2\u06c0\3\2\2\2\u00a4\u06c3\3\2\2\2\u00a6\u06db\3\2"+
		"\2\2\u00a8\u06e0\3\2\2\2\u00aa\u072f\3\2\2\2\u00ac\u0798\3\2\2\2\u00ae"+
		"\u07d0\3\2\2\2\u00b0\u07d2\3\2\2\2\u00b2\u07dc\3\2\2\2\u00b4\u07e6\3\2"+
		"\2\2\u00b6\u07f3\3\2\2\2\u00b8\u0801\3\2\2\2\u00ba\u080f\3\2\2\2\u00bc"+
		"\u0822\3\2\2\2\u00be\u0832\3\2\2\2\u00c0\u0834\3\2\2\2\u00c2\u084c\3\2"+
		"\2\2\u00c4\u0856\3\2\2\2\u00c6\u0861\3\2\2\2\u00c8\u0863\3\2\2\2\u00ca"+
		"\u0882\3\2\2\2\u00cc\u08b3\3\2\2\2\u00ce\u08b5\3\2\2\2\u00d0\u08cc\3\2"+
		"\2\2\u00d2\u08dc\3\2\2\2\u00d4\u0928\3\2\2\2\u00d6\u092f\3\2\2\2\u00d8"+
		"\u0931\3\2\2\2\u00da\u0944\3\2\2\2\u00dc\u0946\3\2\2\2\u00de\u0948\3\2"+
		"\2\2\u00e0\u094a\3\2\2\2\u00e2\u094e\3\2\2\2\u00e4\u0950\3\2\2\2\u00e6"+
		"\u0952\3\2\2\2\u00e8\u0955\3\2\2\2\u00ea\u0959\3\2\2\2\u00ec\u095b\3\2"+
		"\2\2\u00ee\u095d\3\2\2\2\u00f0\u095f\3\2\2\2\u00f2\u0961\3\2\2\2\u00f4"+
		"\u0963\3\2\2\2\u00f6\u0965\3\2\2\2\u00f8\u0967\3\2\2\2\u00fa\u0969\3\2"+
		"\2\2\u00fc\u096b\3\2\2\2\u00fe\u096d\3\2\2\2\u0100\u096f\3\2\2\2\u0102"+
		"\u0971\3\2\2\2\u0104\u0973\3\2\2\2\u0106\u0975\3\2\2\2\u0108\u0977\3\2"+
		"\2\2\u010a\u0979\3\2\2\2\u010c\u097b\3\2\2\2\u010e\u097d\3\2\2\2\u0110"+
		"\u0985\3\2\2\2\u0112\u0115\5\6\4\2\u0113\u0115\5\4\3\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u012c\7\2"+
		"\2\3\u011a\u011e\5\b\5\2\u011b\u011d\7\30\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u012c\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0125\5\26\f\2\u0122\u0124\7\30\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u012c\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\5\22\n\2\u0129"+
		"\u012c\5\"\22\2\u012a\u012c\5(\25\2\u012b\u0116\3\2\2\2\u012b\u011a\3"+
		"\2\2\2\u012b\u0121\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\3\3\2\2\2\u012d\u012e\7\u00c2\2\2\u012e\u012f\b\3"+
		"\1\2\u012f\5\3\2\2\2\u0130\u0132\7\30\2\2\u0131\u0130\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u013f\5R*\2\u0137\u0139\7\30\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\5R*\2\u013d\u0138\3\2\2\2\u013e\u0141\3\2\2"+
		"\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0145\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0144\7\30\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2"+
		"\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\7\3\2\2\2\u0147\u0145\3"+
		"\2\2\2\u0148\u0149\7\u00b2\2\2\u0149\u014c\5\u0110\u0089\2\u014a\u014b"+
		"\7\35\2\2\u014b\u014d\5\6\4\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2"+
		"\u014d\t\3\2\2\2\u014e\u014f\7\u00b2\2\2\u014f\u0150\5\u0110\u0089\2\u0150"+
		"\u0151\7\35\2\2\u0151\u0152\5\u00dan\2\u0152\13\3\2\2\2\u0153\u0154\7"+
		"\u00b2\2\2\u0154\u0156\5\u0110\u0089\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u015c\3\2\2\2\u0157\u0158\7\34\2\2\u0158\u0159\7\u00b2"+
		"\2\2\u0159\u015b\5\u0110\u0089\2\u015a\u0157\3\2\2\2\u015b\u015e\3\2\2"+
		"\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u016a\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015f\u0161\7\34\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0162\u0167\5\n\6\2\u0163\u0164\7\34\2\2\u0164\u0166"+
		"\5\n\6\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0160\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\r\3\2\2\2\u016c\u016e\5\u0110\u0089\2\u016d"+
		"\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0173\3\2\2\2\u016f\u0170\7\34"+
		"\2\2\u0170\u0172\5\u0110\u0089\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2"+
		"\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\17\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0176\u0177\5\u010e\u0088\2\u0177\u0178\7\32\2\2\u0178\u0179"+
		"\5\16\b\2\u0179\u017a\7\33\2\2\u017a\21\3\2\2\2\u017b\u017c\5\u010e\u0088"+
		"\2\u017c\u0180\7\32\2\2\u017d\u017e\5\16\b\2\u017e\u017f\7\34\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2"+
		"\2\2\u0182\u0184\5\26\f\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0186\7\34\2\2\u0186\u0188\5\f\7\2\u0187\u0185\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\7\33\2\2\u018a"+
		"\23\3\2\2\2\u018b\u018f\7\u009b\2\2\u018c\u0190\5\u0110\u0089\2\u018d"+
		"\u0190\5\20\t\2\u018e\u0190\5&\24\2\u018f\u018c\3\2\2\2\u018f\u018d\3"+
		"\2\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\7\30\2\2\u0192\25\3\2\2\2\u0193\u0194\5\u010e\u0088\2\u0194\u0195"+
		"\7\32\2\2\u0195\u0196\5\f\7\2\u0196\u0199\7\33\2\2\u0197\u019a\5,\27\2"+
		"\u0198\u019a\5\60\31\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\27"+
		"\3\2\2\2\u019b\u01a7\5D#\2\u019c\u01a7\5\20\t\2\u019d\u01a7\5F$\2\u019e"+
		"\u01a7\5P)\2\u019f\u01a0\5(\25\2\u01a0\u01a1\7\30\2\2\u01a1\u01a7\3\2"+
		"\2\2\u01a2\u01a3\5\34\17\2\u01a3\u01a4\7\30\2\2\u01a4\u01a7\3\2\2\2\u01a5"+
		"\u01a7\5\22\n\2\u01a6\u019b\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6\u019d\3"+
		"\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u019f\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\31\3\2\2\2\u01a8\u01b4\5B\"\2\u01a9\u01b4\5\20\t"+
		"\2\u01aa\u01b4\5F$\2\u01ab\u01b4\5P)\2\u01ac\u01ad\5(\25\2\u01ad\u01ae"+
		"\7\30\2\2\u01ae\u01b4\3\2\2\2\u01af\u01b0\5\34\17\2\u01b0\u01b1\7\30\2"+
		"\2\u01b1\u01b4\3\2\2\2\u01b2\u01b4\5\22\n\2\u01b3\u01a8\3\2\2\2\u01b3"+
		"\u01a9\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2"+
		"\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\33\3\2\2\2\u01b5\u01c2"+
		"\3\2\2\2\u01b6\u01b7\7\u00b2\2\2\u01b7\u01bf\5\u0110\u0089\2\u01b8\u01bd"+
		"\5*\26\2\u01b9\u01be\5\u0110\u0089\2\u01ba\u01be\5\u00dan\2\u01bb\u01be"+
		"\5 \21\2\u01bc\u01be\5\36\20\2\u01bd\u01b9\3\2\2\2\u01bd\u01ba\3\2\2\2"+
		"\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b8"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01b5\3\2\2\2\u01c1"+
		"\u01b6\3\2\2\2\u01c2\35\3\2\2\2\u01c3\u01de\7\3\2\2\u01c4\u01c5\7\u00ba"+
		"\2\2\u01c5\u01c6\7\60\2\2\u01c6\u01ca\5$\23\2\u01c7\u01c9\7\34\2\2\u01c8"+
		"\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01c4\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01df\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d6\5\36\20\2\u01d3\u01d5\7\34\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01d2\3\2\2\2\u01da"+
		"\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01de\u01cf\3\2\2\2\u01de\u01db\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\7\4\2\2\u01e1\37\3\2\2\2\u01e2\u01e3\7\5\2"+
		"\2\u01e3\u01e4\7\u00ba\2\2\u01e4\u01ef\7\60\2\2\u01e5\u01f0\5$\23\2\u01e6"+
		"\u01e7\7\6\2\2\u01e7\u01e8\5$\23\2\u01e8\u01e9\7\6\2\2\u01e9\u01f0\3\2"+
		"\2\2\u01ea\u01eb\7\7\2\2\u01eb\u01ec\5$\23\2\u01ec\u01ed\7\7\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01f0\5 \21\2\u01ef\u01e5\3\2\2\2\u01ef\u01e6\3\2"+
		"\2\2\u01ef\u01ea\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u0202\3\2\2\2\u01f1"+
		"\u01f2\7\34\2\2\u01f2\u01f3\7\u00ba\2\2\u01f3\u01fe\7\60\2\2\u01f4\u01ff"+
		"\5$\23\2\u01f5\u01f6\7\6\2\2\u01f6\u01f7\5$\23\2\u01f7\u01f8\7\6\2\2\u01f8"+
		"\u01ff\3\2\2\2\u01f9\u01fa\7\7\2\2\u01fa\u01fb\5$\23\2\u01fb\u01fc\7\7"+
		"\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01ff\5 \21\2\u01fe\u01f4\3\2\2\2\u01fe"+
		"\u01f5\3\2\2\2\u01fe\u01f9\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0201\3\2"+
		"\2\2\u0200\u01f1\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\7\b"+
		"\2\2\u0206!\3\2\2\2\u0207\u0208\7\u0090\2\2\u0208\u020f\7\32\2\2\u0209"+
		"\u0210\5$\23\2\u020a\u020b\7\6\2\2\u020b\u020c\5\u00dco\2\u020c\u020d"+
		"\7\6\2\2\u020d\u0210\3\2\2\2\u020e\u0210\5\20\t\2\u020f\u0209\3\2\2\2"+
		"\u020f\u020a\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u021c\3\2\2\2\u0211\u0218"+
		"\7\37\2\2\u0212\u0219\5$\23\2\u0213\u0214\7\6\2\2\u0214\u0215\5\u00dc"+
		"o\2\u0215\u0216\7\6\2\2\u0216\u0219\3\2\2\2\u0217\u0219\5\20\t\2\u0218"+
		"\u0212\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u021b\3\2"+
		"\2\2\u021a\u0211\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7\33"+
		"\2\2\u0220\u0221\7\30\2\2\u0221#\3\2\2\2\u0222\u0225\b\23\1\2\u0223\u0226"+
		"\5\u00dco\2\u0224\u0226\5\u0110\u0089\2\u0225\u0223\3\2\2\2\u0225\u0224"+
		"\3\2\2\2\u0226\u0233\3\2\2\2\u0227\u022a\t\2\2\2\u0228\u022b\5\u00dco"+
		"\2\u0229\u022b\5\u0110\u0089\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2"+
		"\u022b\u022d\3\2\2\2\u022c\u0227\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0231\t\3\2\2\u022f\u0232\5\u00dco\2\u0230\u0232\5\u0110"+
		"\u0089\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u022c\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u023c\3\2\2\2\u0235\u0236\7\32"+
		"\2\2\u0236\u0237\5$\23\2\u0237\u0238\7\33\2\2\u0238\u023c\3\2\2\2\u0239"+
		"\u023c\t\4\2\2\u023a\u023c\5\20\t\2\u023b\u0222\3\2\2\2\u023b\u0235\3"+
		"\2\2\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u0242\3\2\2\2\u023d"+
		"\u023e\f\4\2\2\u023e\u023f\t\5\2\2\u023f\u0241\5$\23\2\u0240\u023d\3\2"+
		"\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"%\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\5$\23\2\u0246\u0247\7\n\2\2"+
		"\u0247\u0248\5$\23\2\u0248\u0249\7\60\2\2\u0249\u024a\5$\23\2\u024a\'"+
		"\3\2\2\2\u024b\u024c\5\u0110\u0089\2\u024c\u024d\7\13\2\2\u024d\u025c"+
		"\3\2\2\2\u024e\u024f\7\13\2\2\u024f\u025c\5\u0110\u0089\2\u0250\u0251"+
		"\5\u0110\u0089\2\u0251\u0252\7\f\2\2\u0252\u025c\3\2\2\2\u0253\u0254\7"+
		"\f\2\2\u0254\u025c\5\u0110\u0089\2\u0255\u0256\5\u0110\u0089\2\u0256\u0259"+
		"\5*\26\2\u0257\u025a\5\u00dan\2\u0258\u025a\5\u0110\u0089\2\u0259\u0257"+
		"\3\2\2\2\u0259\u0258\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u024b\3\2\2\2\u025b"+
		"\u024e\3\2\2\2\u025b\u0250\3\2\2\2\u025b\u0253\3\2\2\2\u025b\u0255\3\2"+
		"\2\2\u025c)\3\2\2\2\u025d\u025e\t\6\2\2\u025e+\3\2\2\2\u025f\u0263\7\5"+
		"\2\2\u0260\u0262\5\30\r\2\u0261\u0260\3\2\2\2\u0262\u0265\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0266\u0268\5\24\13\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\7\b\2\2\u026a-\3\2\2\2\u026b\u026f\7\5\2\2"+
		"\u026c\u026e\5\32\16\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0274\5\24\13\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3"+
		"\2\2\2\u0275\u0276\7\b\2\2\u0276/\3\2\2\2\u0277\u027a\5\30\r\2\u0278\u027a"+
		"\5\24\13\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2\2\2\u027a\61\3\2\2\2\u027b"+
		"\u027e\5\32\16\2\u027c\u027e\5\24\13\2\u027d\u027b\3\2\2\2\u027d\u027c"+
		"\3\2\2\2\u027e\63\3\2\2\2\u027f\u0283\7\5\2\2\u0280\u0282\5\32\16\2\u0281"+
		"\u0280\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u0289\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u028a\7@\2\2\u0287"+
		"\u028a\7K\2\2\u0288\u028a\5\24\13\2\u0289\u0286\3\2\2\2\u0289\u0287\3"+
		"\2\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028c\7\b\2\2\u028c\65\3\2\2\2\u028d\u028e\7l\2\2\u028e\u028f\7\32\2"+
		"\2\u028f\u0290\5$\23\2\u0290\u0293\7\33\2\2\u0291\u0294\5,\27\2\u0292"+
		"\u0294\5\60\31\2\u0293\u0291\3\2\2\2\u0293\u0292\3\2\2\2\u0294\67\3\2"+
		"\2\2\u0295\u0296\7\\\2\2\u0296\u0297\7l\2\2\u0297\u0298\7\32\2\2\u0298"+
		"\u0299\5$\23\2\u0299\u029a\7\33\2\2\u029a\u029d\3\2\2\2\u029b\u029e\5"+
		",\27\2\u029c\u029e\5\60\31\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029e"+
		"9\3\2\2\2\u029f\u02a2\7\\\2\2\u02a0\u02a3\5,\27\2\u02a1\u02a3\5\60\31"+
		"\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3;\3\2\2\2\u02a4\u02a5"+
		"\7l\2\2\u02a5\u02a6\7\32\2\2\u02a6\u02a7\5$\23\2\u02a7\u02aa\7\33\2\2"+
		"\u02a8\u02ab\5\64\33\2\u02a9\u02ab\5\62\32\2\u02aa\u02a8\3\2\2\2\u02aa"+
		"\u02a9\3\2\2\2\u02ab=\3\2\2\2\u02ac\u02ad\7\\\2\2\u02ad\u02ae\7l\2\2\u02ae"+
		"\u02af\7\32\2\2\u02af\u02b0\5$\23\2\u02b0\u02b1\7\33\2\2\u02b1\u02b4\3"+
		"\2\2\2\u02b2\u02b5\5\64\33\2\u02b3\u02b5\5\62\32\2\u02b4\u02b2\3\2\2\2"+
		"\u02b4\u02b3\3\2\2\2\u02b5?\3\2\2\2\u02b6\u02b9\7\\\2\2\u02b7\u02ba\5"+
		"\64\33\2\u02b8\u02ba\5\62\32\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2"+
		"\u02baA\3\2\2\2\u02bb\u02bd\5<\37\2\u02bc\u02bb\3\2\2\2\u02bd\u02be\3"+
		"\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c3\3\2\2\2\u02c0"+
		"\u02c2\5> \2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2"+
		"\2\u02c3\u02c4\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c8"+
		"\5@!\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8C\3\2\2\2\u02c9\u02cb"+
		"\5\66\34\2\u02ca\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ca\3\2\2\2"+
		"\u02cc\u02cd\3\2\2\2\u02cd\u02d1\3\2\2\2\u02ce\u02d0\58\35\2\u02cf\u02ce"+
		"\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d6\5:\36\2\u02d5\u02d4\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6E\3\2\2\2\u02d7\u02dc\5H%\2\u02d8\u02dc"+
		"\5J&\2\u02d9\u02dc\5L\'\2\u02da\u02dc\5N(\2\u02db\u02d7\3\2\2\2\u02db"+
		"\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dcG\3\2\2\2"+
		"\u02dd\u02de\7e\2\2\u02de\u02e0\7\32\2\2\u02df\u02e1\7\u00b2\2\2\u02e0"+
		"\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\5\u0110"+
		"\u0089\2\u02e3\u02ea\7\35\2\2\u02e4\u02e6\7\u00bb\2\2\u02e5\u02e4\3\2"+
		"\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02eb\3\2\2\2\u02e9\u02eb\5\u0110\u0089\2\u02ea\u02e5\3\2\2\2\u02ea\u02e9"+
		"\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\7\30\2\2\u02ed\u02ee\5\u0110"+
		"\u0089\2\u02ee\u02f5\t\7\2\2\u02ef\u02f6\5\u0110\u0089\2\u02f0\u02f2\7"+
		"\u00bb\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f1\3\2\2\2"+
		"\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f5\u02f1"+
		"\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\7\30\2\2\u02f8\u02f9\5(\25\2"+
		"\u02f9\u02fc\7\33\2\2\u02fa\u02fd\5.\30\2\u02fb\u02fd\5\60\31\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fdI\3\2\2\2\u02fe\u02ff\7\u00b5"+
		"\2\2\u02ff\u0300\7\32\2\2\u0300\u0301\5$\23\2\u0301\u0304\7\33\2\2\u0302"+
		"\u0305\5.\30\2\u0303\u0305\5\60\31\2\u0304\u0302\3\2\2\2\u0304\u0303\3"+
		"\2\2\2\u0305K\3\2\2\2\u0306\u0309\7Y\2\2\u0307\u030a\5.\30\2\u0308\u030a"+
		"\5\60\31\2\u0309\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u030b\3\2\2\2"+
		"\u030b\u030c\7\u00b5\2\2\u030c\u030d\7\32\2\2\u030d\u030e\5$\23\2\u030e"+
		"\u030f\7\33\2\2\u030f\u0310\7\30\2\2\u0310M\3\2\2\2\u0311\u0312\7e\2\2"+
		"\u0312\u0313\7\32\2\2\u0313\u0314\7\u00b2\2\2\u0314\u0315\5\u0110\u0089"+
		"\2\u0315\u0316\7\60\2\2\u0316\u0317\5\u0110\u0089\2\u0317\u031a\7\33\2"+
		"\2\u0318\u031b\5.\30\2\u0319\u031b\5\60\31\2\u031a\u0318\3\2\2\2\u031a"+
		"\u0319\3\2\2\2\u031bO\3\2\2\2\u031c\u031d\7\u00a2\2\2\u031d\u031e\7\32"+
		"\2\2\u031e\u031f\5$\23\2\u031f\u0320\7\33\2\2\u0320Q\3\2\2\2\u0321\u0324"+
		"\7c\2\2\u0322\u0323\7\u0091\2\2\u0323\u0325\7\u008d\2\2\u0324\u0322\3"+
		"\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0321\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u0346\3\2\2\2\u0328\u0347\5T+\2\u0329\u0347\5Z.\2"+
		"\u032a\u0347\5\\/\2\u032b\u0347\5^\60\2\u032c\u0347\5`\61\2\u032d\u0347"+
		"\5b\62\2\u032e\u0347\5d\63\2\u032f\u0347\5f\64\2\u0330\u0347\5h\65\2\u0331"+
		"\u0347\5j\66\2\u0332\u0347\5l\67\2\u0333\u0347\5n8\2\u0334\u0347\5p9\2"+
		"\u0335\u0347\5r:\2\u0336\u0347\5t;\2\u0337\u0347\5v<\2\u0338\u0347\5x"+
		"=\2\u0339\u0347\5z>\2\u033a\u0347\5|?\2\u033b\u0347\5~@\2\u033c\u0347"+
		"\5\u0080A\2\u033d\u0347\5\u0082B\2\u033e\u0347\5\u0084C\2\u033f\u0347"+
		"\5\u0086D\2\u0340\u0347\5\u0088E\2\u0341\u0347\5\u008aF\2\u0342\u0347"+
		"\5\u008cG\2\u0343\u0347\5\u0090I\2\u0344\u0347\5\u0092J\2\u0345\u0347"+
		"\5\u0094K\2\u0346\u0328\3\2\2\2\u0346\u0329\3\2\2\2\u0346\u032a\3\2\2"+
		"\2\u0346\u032b\3\2\2\2\u0346\u032c\3\2\2\2\u0346\u032d\3\2\2\2\u0346\u032e"+
		"\3\2\2\2\u0346\u032f\3\2\2\2\u0346\u0330\3\2\2\2\u0346\u0331\3\2\2\2\u0346"+
		"\u0332\3\2\2\2\u0346\u0333\3\2\2\2\u0346\u0334\3\2\2\2\u0346\u0335\3\2"+
		"\2\2\u0346\u0336\3\2\2\2\u0346\u0337\3\2\2\2\u0346\u0338\3\2\2\2\u0346"+
		"\u0339\3\2\2\2\u0346\u033a\3\2\2\2\u0346\u033b\3\2\2\2\u0346\u033c\3\2"+
		"\2\2\u0346\u033d\3\2\2\2\u0346\u033e\3\2\2\2\u0346\u033f\3\2\2\2\u0346"+
		"\u0340\3\2\2\2\u0346\u0341\3\2\2\2\u0346\u0342\3\2\2\2\u0346\u0343\3\2"+
		"\2\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347S\3\2\2\2\u0348\u0349"+
		"\7\66\2\2\u0349\u034b\7\u00a3\2\2\u034a\u034c\7\u0089\2\2\u034b\u034a"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u0350\3\2\2\2\u034d\u034e\5\u00eex"+
		"\2\u034e\u034f\7\31\2\2\u034f\u0351\3\2\2\2\u0350\u034d\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u035d\5\u00f0y\2\u0353\u0354"+
		"\7\u0098\2\2\u0354\u0355\7\u00a7\2\2\u0355\u035e\5\u00f6|\2\u0356\u035e"+
		"\5X-\2\u0357\u035e\5V,\2\u0358\u035a\7\63\2\2\u0359\u035b\7G\2\2\u035a"+
		"\u0359\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\5\u0096"+
		"L\2\u035d\u0353\3\2\2\2\u035d\u0356\3\2\2\2\u035d\u0357\3\2\2\2\u035d"+
		"\u0358\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0361\7^\2\2\u0360\u035f\3\2"+
		"\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0364\5\u00e8u\2\u0363"+
		"\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364U\3\2\2\2\u0365\u0366\7\63\2\2"+
		"\u0366\u0367\7J\2\2\u0367\u0368\5\u0110\u0089\2\u0368\u0369\5\u00b4[\2"+
		"\u0369W\3\2\2\2\u036a\u036b\7\63\2\2\u036b\u036c\5\u00b4[\2\u036cY\3\2"+
		"\2\2\u036d\u0374\7\67\2\2\u036e\u0375\5\u00eex\2\u036f\u0375\5\u00f4{"+
		"\2\u0370\u0371\5\u00eex\2\u0371\u0372\7\31\2\2\u0372\u0373\5\u00f4{\2"+
		"\u0373\u0375\3\2\2\2\u0374\u036e\3\2\2\2\u0374\u036f\3\2\2\2\u0374\u0370"+
		"\3\2\2\2\u0374\u0375\3\2\2\2\u0375[\3\2\2\2\u0376\u0378\7;\2\2\u0377\u0379"+
		"\7Q\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037b\5\u00aaV\2\u037b\u037c\79\2\2\u037c\u037d\5\u00eex\2\u037d]\3\2"+
		"\2\2\u037e\u0380\7>\2\2\u037f\u0381\t\b\2\2\u0380\u037f\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0386\3\2\2\2\u0382\u0384\7\u00a8\2\2\u0383\u0385"+
		"\5\u010c\u0087\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3"+
		"\2\2\2\u0386\u0382\3\2\2\2\u0386\u0387\3\2\2\2\u0387_\3\2\2\2\u0388\u038d"+
		"\t\t\2\2\u0389\u038b\7\u00a8\2\2\u038a\u038c\5\u010c\u0087\2\u038b\u038a"+
		"\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u0389\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038ea\3\2\2\2\u038f\u0391\7\u00b6\2\2\u0390\u0392\7\u0093"+
		"\2\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u0398\5\u00c8e\2\u0394\u0395\7\34\2\2\u0395\u0397\5\u00c8e\2\u0396\u0394"+
		"\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u038f\3\2\2\2\u039b\u039c\3\2"+
		"\2\2\u039c\u039d\3\2\2\2\u039d\u03a7\5\u00d4k\2\u039e\u03a0\7\u00aa\2"+
		"\2\u039f\u03a1\7\65\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a5\3\2\2\2\u03a2\u03a5\7v\2\2\u03a3\u03a5\7`\2\2\u03a4\u039e\3\2\2"+
		"\2\u03a4\u03a2\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8"+
		"\5\u00d4k\2\u03a7\u03a4\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03a7\3\2\2"+
		"\2\u03a9\u03aa\3\2\2\2\u03aa\u03b5\3\2\2\2\u03ab\u03ac\7\u008b\2\2\u03ac"+
		"\u03ad\7A\2\2\u03ad\u03b2\5\u00c4c\2\u03ae\u03af\7\34\2\2\u03af\u03b1"+
		"\5\u00c4c\2\u03b0\u03ae\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2"+
		"\2\u03b2\u03b3\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03ab"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03bd\3\2\2\2\u03b7\u03b8\7~\2\2\u03b8"+
		"\u03bb\5\u00aaV\2\u03b9\u03ba\t\n\2\2\u03ba\u03bc\5\u00aaV\2\u03bb\u03b9"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03b7\3\2\2\2\u03bd"+
		"\u03be\3\2\2\2\u03bec\3\2\2\2\u03bf\u03c1\7L\2\2\u03c0\u03c2\7\u00ab\2"+
		"\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c7"+
		"\7p\2\2\u03c4\u03c5\7l\2\2\u03c5\u03c6\7\u0083\2\2\u03c6\u03c8\7b\2\2"+
		"\u03c7\u03c4\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03cc\3\2\2\2\u03c9\u03ca"+
		"\5\u00eex\2\u03ca\u03cb\7\31\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03c9\3\2\2"+
		"\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\5\u00fe\u0080\2"+
		"\u03cf\u03d0\7\u0088\2\2\u03d0\u03d1\5\u00f2z\2\u03d1\u03d2\7\32\2\2\u03d2"+
		"\u03d7\5\u00b2Z\2\u03d3\u03d4\7\34\2\2\u03d4\u03d6\5\u00b2Z\2\u03d5\u03d3"+
		"\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\7\33\2\2\u03db\u03dc\7"+
		"\u00b4\2\2\u03dc\u03de\5\u00aaV\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2"+
		"\2\2\u03dee\3\2\2\2\u03df\u03e1\7L\2\2\u03e0\u03e2\t\13\2\2\u03e1\u03e0"+
		"\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e7\7\u00a3\2"+
		"\2\u03e4\u03e5\7l\2\2\u03e5\u03e6\7\u0083\2\2\u03e6\u03e8\7b\2\2\u03e7"+
		"\u03e4\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ec\3\2\2\2\u03e9\u03ea\5\u00ee"+
		"x\2\u03ea\u03eb\7\31\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03e9\3\2\2\2\u03ec"+
		"\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u0401\5\u00f2z\2\u03ef\u03f0"+
		"\7\32\2\2\u03f0\u03f7\5\u0096L\2\u03f1\u03f2\7\34\2\2\u03f2\u03f6\5\u00b4"+
		"[\2\u03f3\u03f4\7\34\2\2\u03f4\u03f6\5\u0096L\2\u03f5\u03f1\3\2\2\2\u03f5"+
		"\u03f3\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fd\7\33\2\2\u03fb"+
		"\u03fc\7\u00b7\2\2\u03fc\u03fe\7\u00ba\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe"+
		"\3\2\2\2\u03fe\u0402\3\2\2\2\u03ff\u0400\79\2\2\u0400\u0402\5\u008cG\2"+
		"\u0401\u03ef\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0405"+
		"\5\u00e8u\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405g\3\2\2\2\u0406"+
		"\u0408\7L\2\2\u0407\u0409\t\13\2\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409\u040a\3\2\2\2\u040a\u040e\7\u00a9\2\2\u040b\u040c\7l\2\2\u040c"+
		"\u040d\7\u0083\2\2\u040d\u040f\7b\2\2\u040e\u040b\3\2\2\2\u040e\u040f"+
		"\3\2\2\2\u040f\u0413\3\2\2\2\u0410\u0411\5\u00eex\2\u0411\u0412\7\31\2"+
		"\2\u0412\u0414\3\2\2\2\u0413\u0410\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415"+
		"\3\2\2\2\u0415\u041a\5\u0100\u0081\2\u0416\u041b\7=\2\2\u0417\u041b\7"+
		"\64\2\2\u0418\u0419\7u\2\2\u0419\u041b\7\u0086\2\2\u041a\u0416\3\2\2\2"+
		"\u041a\u0417\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u042a"+
		"\3\2\2\2\u041c\u042b\7U\2\2\u041d\u042b\7t\2\2\u041e\u0428\7\u00ac\2\2"+
		"\u041f\u0420\7\u0086\2\2\u0420\u0425\5\u00f8}\2\u0421\u0422\7\34\2\2\u0422"+
		"\u0424\5\u00f8}\2\u0423\u0421\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0428"+
		"\u041f\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u041c\3\2"+
		"\2\2\u042a\u041d\3\2\2\2\u042a\u041e\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u0430\7\u0088\2\2\u042d\u042e\5\u00eex\2\u042e\u042f\7\31\2\2\u042f\u0431"+
		"\3\2\2\2\u0430\u042d\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\3\2\2\2\u0432"+
		"\u0436\5\u00f2z\2\u0433\u0434\7e\2\2\u0434\u0435\7[\2\2\u0435\u0437\7"+
		"\u009e\2\2\u0436\u0433\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u043a\3\2\2\2"+
		"\u0438\u0439\7\u00b3\2\2\u0439\u043b\5\u00aaV\2\u043a\u0438\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u0445\7>\2\2\u043d\u0442\5\u0090"+
		"I\2\u043e\u0442\5~@\2\u043f\u0442\5n8\2\u0440\u0442\5\u008cG\2\u0441\u043d"+
		"\3\2\2\2\u0441\u043e\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0440\3\2\2\2\u0442"+
		"\u0443\3\2\2\2\u0443\u0444\7\30\2\2\u0444\u0446\3\2\2\2\u0445\u0441\3"+
		"\2\2\2\u0446\u0447\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u044a\7]\2\2\u044ai\3\2\2\2\u044b\u044d\7L\2\2\u044c"+
		"\u044e\t\13\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\3"+
		"\2\2\2\u044f\u0453\7\u00b0\2\2\u0450\u0451\7l\2\2\u0451\u0452\7\u0083"+
		"\2\2\u0452\u0454\7b\2\2\u0453\u0450\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u0458\3\2\2\2\u0455\u0456\5\u00eex\2\u0456\u0457\7\31\2\2\u0457\u0459"+
		"\3\2\2\2\u0458\u0455\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a"+
		"\u045b\5\u0102\u0082\2\u045b\u045c\79\2\2\u045c\u045d\5\u008cG\2\u045d"+
		"k\3\2\2\2\u045e\u045f\7L\2\2\u045f\u0460\7\u00b1\2\2\u0460\u0464\7\u00a3"+
		"\2\2\u0461\u0462\7l\2\2\u0462\u0463\7\u0083\2\2\u0463\u0465\7b\2\2\u0464"+
		"\u0461\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0469\3\2\2\2\u0466\u0467\5\u00ee"+
		"x\2\u0467\u0468\7\31\2\2\u0468\u046a\3\2\2\2\u0469\u0466\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\5\u00f2z\2\u046c\u046d"+
		"\7\u00ad\2\2\u046d\u0479\5\u0104\u0083\2\u046e\u046f\7\32\2\2\u046f\u0474"+
		"\5\u00e2r\2\u0470\u0471\7\34\2\2\u0471\u0473\5\u00e2r\2\u0472\u0470\3"+
		"\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0477\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0478\7\33\2\2\u0478\u047a\3"+
		"\2\2\2\u0479\u046e\3\2\2\2\u0479\u047a\3\2\2\2\u047am\3\2\2\2\u047b\u047d"+
		"\5\u00c0a\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2"+
		"\2\u047e\u047f\7U\2\2\u047f\u0480\7g\2\2\u0480\u0483\5\u00c2b\2\u0481"+
		"\u0482\7\u00b4\2\2\u0482\u0484\5\u00aaV\2\u0483\u0481\3\2\2\2\u0483\u0484"+
		"\3\2\2\2\u0484o\3\2\2\2\u0485\u0487\5\u00c0a\2\u0486\u0485\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\7U\2\2\u0489\u048c\7g\2"+
		"\2\u048a\u048d\5\u00c2b\2\u048b\u048d\5\6\4\2\u048c\u048a\3\2\2\2\u048c"+
		"\u048b\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048f\7\u00b4\2\2\u048f\u0491"+
		"\5\u00aaV\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u04a4\3\2\2"+
		"\2\u0492\u0493\7\u008b\2\2\u0493\u0494\7A\2\2\u0494\u0499\5\u00c4c\2\u0495"+
		"\u0496\7\34\2\2\u0496\u0498\5\u00c4c\2\u0497\u0495\3\2\2\2\u0498\u049b"+
		"\3\2\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049d\3\2\2\2\u049b"+
		"\u0499\3\2\2\2\u049c\u0492\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2"+
		"\2\2\u049e\u049f\7~\2\2\u049f\u04a2\5\u00aaV\2\u04a0\u04a1\t\n\2\2\u04a1"+
		"\u04a3\5\u00aaV\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5"+
		"\3\2\2\2\u04a4\u049c\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5q\3\2\2\2\u04a6"+
		"\u04a8\7W\2\2\u04a7\u04a9\7Q\2\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2"+
		"\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\5\u00eex\2\u04abs\3\2\2\2\u04ac\u04ad"+
		"\7Z\2\2\u04ad\u04b0\7p\2\2\u04ae\u04af\7l\2\2\u04af\u04b1\7b\2\2\u04b0"+
		"\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b5\3\2\2\2\u04b2\u04b3\5\u00ee"+
		"x\2\u04b3\u04b4\7\31\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b2\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\5\u00fe\u0080\2\u04b8u"+
		"\3\2\2\2\u04b9\u04ba\7Z\2\2\u04ba\u04bd\7\u00a3\2\2\u04bb\u04bc\7l\2\2"+
		"\u04bc\u04be\7b\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04c2"+
		"\3\2\2\2\u04bf\u04c0\5\u00eex\2\u04c0\u04c1\7\31\2\2\u04c1\u04c3\3\2\2"+
		"\2\u04c2\u04bf\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5"+
		"\5\u00f2z\2\u04c5w\3\2\2\2\u04c6\u04c7\7Z\2\2\u04c7\u04ca\7\u00a9\2\2"+
		"\u04c8\u04c9\7l\2\2\u04c9\u04cb\7b\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb"+
		"\3\2\2\2\u04cb\u04cf\3\2\2\2\u04cc\u04cd\5\u00eex\2\u04cd\u04ce\7\31\2"+
		"\2\u04ce\u04d0\3\2\2\2\u04cf\u04cc\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1"+
		"\3\2\2\2\u04d1\u04d2\5\u0100\u0081\2\u04d2y\3\2\2\2\u04d3\u04d4\7Z\2\2"+
		"\u04d4\u04d7\7\u00b0\2\2\u04d5\u04d6\7l\2\2\u04d6\u04d8\7b\2\2\u04d7\u04d5"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04dc\3\2\2\2\u04d9\u04da\5\u00eex"+
		"\2\u04da\u04db\7\31\2\2\u04db\u04dd\3\2\2\2\u04dc\u04d9\3\2\2\2\u04dc"+
		"\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\5\u0102\u0082\2\u04df{"+
		"\3\2\2\2\u04e0\u04e2\7\u00b6\2\2\u04e1\u04e3\7\u0093\2\2\u04e2\u04e1\3"+
		"\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e9\5\u00c8e\2"+
		"\u04e5\u04e6\7\34\2\2\u04e6\u04e8\5\u00c8e\2\u04e7\u04e5\3\2\2\2\u04e8"+
		"\u04eb\3\2\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04ed\3\2"+
		"\2\2\u04eb\u04e9\3\2\2\2\u04ec\u04e0\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u04f4\5\u00d4k\2\u04ef\u04f0\5\u00d6l\2\u04f0\u04f1"+
		"\5\u00d4k\2\u04f1\u04f3\3\2\2\2\u04f2\u04ef\3\2\2\2\u04f3\u04f6\3\2\2"+
		"\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u0501\3\2\2\2\u04f6\u04f4"+
		"\3\2\2\2\u04f7\u04f8\7\u008b\2\2\u04f8\u04f9\7A\2\2\u04f9\u04fe\5\u00c4"+
		"c\2\u04fa\u04fb\7\34\2\2\u04fb\u04fd\5\u00c4c\2\u04fc\u04fa\3\2\2\2\u04fd"+
		"\u0500\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0502\3\2"+
		"\2\2\u0500\u04fe\3\2\2\2\u0501\u04f7\3\2\2\2\u0501\u0502\3\2\2\2\u0502"+
		"\u0509\3\2\2\2\u0503\u0504\7~\2\2\u0504\u0507\5\u00aaV\2\u0505\u0506\t"+
		"\n\2\2\u0506\u0508\5\u00aaV\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2"+
		"\u0508\u050a\3\2\2\2\u0509\u0503\3\2\2\2\u0509\u050a\3\2\2\2\u050a}\3"+
		"\2\2\2\u050b\u050d\5\u00c0a\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2"+
		"\u050d\u051f\3\2\2\2\u050e\u0520\7t\2\2\u050f\u0520\7\u0099\2\2\u0510"+
		"\u0511\7t\2\2\u0511\u0512\7\u008a\2\2\u0512\u0520\7\u0099\2\2\u0513\u0514"+
		"\7t\2\2\u0514\u0515\7\u008a\2\2\u0515\u0520\7\u009d\2\2\u0516\u0517\7"+
		"t\2\2\u0517\u0518\7\u008a\2\2\u0518\u0520\7\61\2\2\u0519\u051a\7t\2\2"+
		"\u051a\u051b\7\u008a\2\2\u051b\u0520\7d\2\2\u051c\u051d\7t\2\2\u051d\u051e"+
		"\7\u008a\2\2\u051e\u0520\7m\2\2\u051f\u050e\3\2\2\2\u051f\u050f\3\2\2"+
		"\2\u051f\u0510\3\2\2\2\u051f\u0513\3\2\2\2\u051f\u0516\3\2\2\2\u051f\u0519"+
		"\3\2\2\2\u051f\u051c\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0525\7w\2\2\u0522"+
		"\u0523\5\u00eex\2\u0523\u0524\7\31\2\2\u0524\u0526\3\2\2\2\u0525\u0522"+
		"\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0533\5\u00f2z"+
		"\2\u0528\u0529\7\32\2\2\u0529\u052e\5\u00f8}\2\u052a\u052b\7\34\2\2\u052b"+
		"\u052d\5\u00f8}\2\u052c\u052a\3\2\2\2\u052d\u0530\3\2\2\2\u052e\u052c"+
		"\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0531\3\2\2\2\u0530\u052e\3\2\2\2\u0531"+
		"\u0532\7\33\2\2\u0532\u0534\3\2\2\2\u0533\u0528\3\2\2\2\u0533\u0534\3"+
		"\2\2\2\u0534\u0554\3\2\2\2\u0535\u0536\7\u00af\2\2\u0536\u0537\7\32\2"+
		"\2\u0537\u053c\5\u00aaV\2\u0538\u0539\7\34\2\2\u0539\u053b\5\u00aaV\2"+
		"\u053a\u0538\3\2\2\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d"+
		"\3\2\2\2\u053d\u053f\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u054e\7\33\2\2"+
		"\u0540\u0541\7\34\2\2\u0541\u0542\7\32\2\2\u0542\u0547\5\u00aaV\2\u0543"+
		"\u0544\7\34\2\2\u0544\u0546\5\u00aaV\2\u0545\u0543\3\2\2\2\u0546\u0549"+
		"\3\2\2\2\u0547\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u054a\3\2\2\2\u0549"+
		"\u0547\3\2\2\2\u054a\u054b\7\33\2\2\u054b\u054d\3\2\2\2\u054c\u0540\3"+
		"\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f"+
		"\u0555\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0555\5\u008cG\2\u0552\u0553"+
		"\7R\2\2\u0553\u0555\7\u00af\2\2\u0554\u0535\3\2\2\2\u0554\u0551\3\2\2"+
		"\2\u0554\u0552\3\2\2\2\u0555\177\3\2\2\2\u0556\u055a\7\u008e\2\2\u0557"+
		"\u0558\5\u00eex\2\u0558\u0559\7\31\2\2\u0559\u055b\3\2\2\2\u055a\u0557"+
		"\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u0563\5\u0106\u0084"+
		"\2\u055d\u055e\7\35\2\2\u055e\u0564\5\u00c6d\2\u055f\u0560\7\32\2\2\u0560"+
		"\u0561\5\u00c6d\2\u0561\u0562\7\33\2\2\u0562\u0564\3\2\2\2\u0563\u055d"+
		"\3\2\2\2\u0563\u055f\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0081\3\2\2\2\u0565"+
		"\u0570\7\u0096\2\2\u0566\u0571\5\u00fa~\2\u0567\u0568\5\u00eex\2\u0568"+
		"\u0569\7\31\2\2\u0569\u056b\3\2\2\2\u056a\u0567\3\2\2\2\u056a\u056b\3"+
		"\2\2\2\u056b\u056e\3\2\2\2\u056c\u056f\5\u00f2z\2\u056d\u056f\5\u00fe"+
		"\u0080\2\u056e\u056c\3\2\2\2\u056e\u056d\3\2\2\2\u056f\u0571\3\2\2\2\u0570"+
		"\u0566\3\2\2\2\u0570\u056a\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0083\3\2"+
		"\2\2\u0572\u0574\7\u0097\2\2\u0573\u0575\7\u009f\2\2\u0574\u0573\3\2\2"+
		"\2\u0574\u0575\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\5\u0108\u0085\2"+
		"\u0577\u0085\3\2\2\2\u0578\u057d\7\u009d\2\2\u0579\u057b\7\u00a8\2\2\u057a"+
		"\u057c\5\u010c\u0087\2\u057b\u057a\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057e"+
		"\3\2\2\2\u057d\u0579\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0584\3\2\2\2\u057f"+
		"\u0581\7\u00a7\2\2\u0580\u0582\7\u009f\2\2\u0581\u0580\3\2\2\2\u0581\u0582"+
		"\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\5\u0108\u0085\2\u0584\u057f\3"+
		"\2\2\2\u0584\u0585\3\2\2\2\u0585\u0087\3\2\2\2\u0586\u0587\7\u009f\2\2"+
		"\u0587\u0588\5\u0108\u0085\2\u0588\u0089\3\2\2\2\u0589\u058b\7\u00b6\2"+
		"\2\u058a\u058c\7\u0093\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058d\3\2\2\2\u058d\u0592\5\u00c8e\2\u058e\u058f\7\34\2\2\u058f\u0591"+
		"\5\u00c8e\2\u0590\u058e\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2"+
		"\2\u0592\u0593\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0589"+
		"\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u05a2\5\u00d4k"+
		"\2\u0598\u0599\7\u008b\2\2\u0599\u059a\7A\2\2\u059a\u059f\5\u00c4c\2\u059b"+
		"\u059c\7\34\2\2\u059c\u059e\5\u00c4c\2\u059d\u059b\3\2\2\2\u059e\u05a1"+
		"\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1"+
		"\u059f\3\2\2\2\u05a2\u0598\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05aa\3\2"+
		"\2\2\u05a4\u05a5\7~\2\2\u05a5\u05a8\5\u00aaV\2\u05a6\u05a7\t\n\2\2\u05a7"+
		"\u05a9\5\u00aaV\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ab"+
		"\3\2\2\2\u05aa\u05a4\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u008b\3\2\2\2\u05ac"+
		"\u05ae\7\u00b6\2\2\u05ad\u05af\7\u0093\2\2\u05ae\u05ad\3\2\2\2\u05ae\u05af"+
		"\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b5\5\u00c8e\2\u05b1\u05b2\7\34\2"+
		"\2\u05b2\u05b4\5\u00c8e\2\u05b3\u05b1\3\2\2\2\u05b4\u05b7\3\2\2\2\u05b5"+
		"\u05b3\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5\3\2"+
		"\2\2\u05b8\u05ac\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u05c0\5\u008eH\2\u05bb\u05bc\5\u00d6l\2\u05bc\u05bd\5\u008eH\2\u05bd"+
		"\u05bf\3\2\2\2\u05be\u05bb\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2"+
		"\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05cd\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3"+
		"\u05c4\7\u008b\2\2\u05c4\u05c5\7A\2\2\u05c5\u05ca\5\u00c4c\2\u05c6\u05c7"+
		"\7\34\2\2\u05c7\u05c9\5\u00c4c\2\u05c8\u05c6\3\2\2\2\u05c9\u05cc\3\2\2"+
		"\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05ce\3\2\2\2\u05cc\u05ca"+
		"\3\2\2\2\u05cd\u05c3\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d5\3\2\2\2\u05cf"+
		"\u05d0\7~\2\2\u05d0\u05d3\5\u00aaV\2\u05d1\u05d2\t\n\2\2\u05d2\u05d4\5"+
		"\u00aaV\2\u05d3\u05d1\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2"+
		"\u05d5\u05cf\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u008d\3\2\2\2\u05d7\u05d9"+
		"\7\u00a0\2\2\u05d8\u05da\t\f\2\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2"+
		"\2\u05da\u05db\3\2\2\2\u05db\u05e0\5\u00caf\2\u05dc\u05dd\7\34\2\2\u05dd"+
		"\u05df\5\u00caf\2\u05de\u05dc\3\2\2\2\u05df\u05e2\3\2\2\2\u05e0\u05de"+
		"\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05ef\3\2\2\2\u05e2\u05e0\3\2\2\2\u05e3"+
		"\u05ed\7g\2\2\u05e4\u05e9\5\u00ccg\2\u05e5\u05e6\7\34\2\2\u05e6\u05e8"+
		"\5\u00ccg\2\u05e7\u05e5\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2\2"+
		"\2\u05e9\u05ea\3\2\2\2\u05ea\u05ee\3\2\2\2\u05eb\u05e9\3\2\2\2\u05ec\u05ee"+
		"\5\u00ceh\2\u05ed\u05e4\3\2\2\2\u05ed\u05ec\3\2\2\2\u05ee\u05f0\3\2\2"+
		"\2\u05ef\u05e3\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05f2"+
		"\7\u00b4\2\2\u05f2\u05f4\5\u00aaV\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3"+
		"\2\2\2\u05f4\u0603\3\2\2\2\u05f5\u05f6\7j\2\2\u05f6\u05f7\7A\2\2\u05f7"+
		"\u05fc\5\u00aaV\2\u05f8\u05f9\7\34\2\2\u05f9\u05fb\5\u00aaV\2\u05fa\u05f8"+
		"\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd"+
		"\u0601\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0600\7k\2\2\u0600\u0602\5\u00aa"+
		"V\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\3\2\2\2\u0603"+
		"\u05f5\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0622\3\2\2\2\u0605\u0606\7\u00af"+
		"\2\2\u0606\u0607\7\32\2\2\u0607\u060c\5\u00aaV\2\u0608\u0609\7\34\2\2"+
		"\u0609\u060b\5\u00aaV\2\u060a\u0608\3\2\2\2\u060b\u060e\3\2\2\2\u060c"+
		"\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\3\2\2\2\u060e\u060c\3\2"+
		"\2\2\u060f\u061e\7\33\2\2\u0610\u0611\7\34\2\2\u0611\u0612\7\32\2\2\u0612"+
		"\u0617\5\u00aaV\2\u0613\u0614\7\34\2\2\u0614\u0616\5\u00aaV\2\u0615\u0613"+
		"\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2\2\2\u0617\u0618\3\2\2\2\u0618"+
		"\u061a\3\2\2\2\u0619\u0617\3\2\2\2\u061a\u061b\7\33\2\2\u061b\u061d\3"+
		"\2\2\2\u061c\u0610\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e"+
		"\u061f\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0621\u05d7\3\2"+
		"\2\2\u0621\u0605\3\2\2\2\u0622\u008f\3\2\2\2\u0623\u0625\5\u00c0a\2\u0624"+
		"\u0623\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0631\7\u00ac"+
		"\2\2\u0627\u0628\7\u008a\2\2\u0628\u0632\7\u009d\2\2\u0629\u062a\7\u008a"+
		"\2\2\u062a\u0632\7\61\2\2\u062b\u062c\7\u008a\2\2\u062c\u0632\7\u0099"+
		"\2\2\u062d\u062e\7\u008a\2\2\u062e\u0632\7d\2\2\u062f\u0630\7\u008a\2"+
		"\2\u0630\u0632\7m\2\2\u0631\u0627\3\2\2\2\u0631\u0629\3\2\2\2\u0631\u062b"+
		"\3\2\2\2\u0631\u062d\3\2\2\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632"+
		"\u0633\3\2\2\2\u0633\u0634\5\u00c2b\2\u0634\u0635\7\u00a1\2\2\u0635\u0636"+
		"\5\u00f8}\2\u0636\u0637\7\35\2\2\u0637\u063f\5\u00aaV\2\u0638\u0639\7"+
		"\34\2\2\u0639\u063a\5\u00f8}\2\u063a\u063b\7\35\2\2\u063b\u063c\5\u00aa"+
		"V\2\u063c\u063e\3\2\2\2\u063d\u0638\3\2\2\2\u063e\u0641\3\2\2\2\u063f"+
		"\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0644\3\2\2\2\u0641\u063f\3\2"+
		"\2\2\u0642\u0643\7\u00b4\2\2\u0643\u0645\5\u00aaV\2\u0644\u0642\3\2\2"+
		"\2\u0644\u0645\3\2\2\2\u0645\u0091\3\2\2\2\u0646\u0648\5\u00c0a\2\u0647"+
		"\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u0654\7\u00ac"+
		"\2\2\u064a\u064b\7\u008a\2\2\u064b\u0655\7\u009d\2\2\u064c\u064d\7\u008a"+
		"\2\2\u064d\u0655\7\61\2\2\u064e\u064f\7\u008a\2\2\u064f\u0655\7\u0099"+
		"\2\2\u0650\u0651\7\u008a\2\2\u0651\u0655\7d\2\2\u0652\u0653\7\u008a\2"+
		"\2\u0653\u0655\7m\2\2\u0654\u064a\3\2\2\2\u0654\u064c\3\2\2\2\u0654\u064e"+
		"\3\2\2\2\u0654\u0650\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0656\3\2\2\2\u0656\u0657\5\u00c2b\2\u0657\u0658\7\u00a1\2\2\u0658\u0659"+
		"\5\u00f8}\2\u0659\u065a\7\35\2\2\u065a\u0662\5\u00aaV\2\u065b\u065c\7"+
		"\34\2\2\u065c\u065d\5\u00f8}\2\u065d\u065e\7\35\2\2\u065e\u065f\5\u00aa"+
		"V\2\u065f\u0661\3\2\2\2\u0660\u065b\3\2\2\2\u0661\u0664\3\2\2\2\u0662"+
		"\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0667\3\2\2\2\u0664\u0662\3\2"+
		"\2\2\u0665\u0666\7\u00b4\2\2\u0666\u0668\5\u00aaV\2\u0667\u0665\3\2\2"+
		"\2\u0667\u0668\3\2\2\2\u0668\u067b\3\2\2\2\u0669\u066a\7\u008b\2\2\u066a"+
		"\u066b\7A\2\2\u066b\u0670\5\u00c4c\2\u066c\u066d\7\34\2\2\u066d\u066f"+
		"\5\u00c4c\2\u066e\u066c\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2"+
		"\2\u0670\u0671\3\2\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0673\u0669"+
		"\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\7~\2\2\u0676"+
		"\u0679\5\u00aaV\2\u0677\u0678\t\n\2\2\u0678\u067a\5\u00aaV\2\u0679\u0677"+
		"\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c\3\2\2\2\u067b\u0673\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u0093\3\2\2\2\u067d\u067e\7\u00ae\2\2\u067e\u0095"+
		"\3\2\2\2\u067f\u0684\5\u00f8}\2\u0680\u0683\5\u009aN\2\u0681\u0683\5\u0098"+
		"M\2\u0682\u0680\3\2\2\2\u0682\u0681\3\2\2\2\u0683\u0686\3\2\2\2\u0684"+
		"\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0097\3\2\2\2\u0686\u0684\3\2"+
		"\2\2\u0687\u069b\5\u00eav\2\u0688\u0689\7\32\2\2\u0689\u068b\5\u00dan"+
		"\2\u068a\u068c\5\u0110\u0089\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2"+
		"\u068c\u068d\3\2\2\2\u068d\u068e\7\33\2\2\u068e\u069c\3\2\2\2\u068f\u0690"+
		"\7\32\2\2\u0690\u0692\5\u00dan\2\u0691\u0693\5\u0110\u0089\2\u0692\u0691"+
		"\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\7\34\2\2"+
		"\u0695\u0697\5\u00dan\2\u0696\u0698\5\u0110\u0089\2\u0697\u0696\3\2\2"+
		"\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\7\33\2\2\u069a"+
		"\u069c\3\2\2\2\u069b\u0688\3\2\2\2\u069b\u068f\3\2\2\2\u069b\u069c\3\2"+
		"\2\2\u069c\u0099\3\2\2\2\u069d\u069e\7J\2\2\u069e\u06a0\5\u00eav\2\u069f"+
		"\u069d\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06af\3\2\2\2\u06a1\u06b0\5\u009c"+
		"O\2\u06a2\u06b0\5\u009eP\2\u06a3\u06b0\5\u00a0Q\2\u06a4\u06b0\5\u00a2"+
		"R\2\u06a5\u06a6\7\u00ab\2\2\u06a6\u06b0\5\u00a8U\2\u06a7\u06a8\7E\2\2"+
		"\u06a8\u06a9\7\32\2\2\u06a9\u06aa\5\u00aaV\2\u06aa\u06ab\7\33\2\2\u06ab"+
		"\u06b0\3\2\2\2\u06ac\u06b0\5\u00a4S\2\u06ad\u06ae\7F\2\2\u06ae\u06b0\5"+
		"\u00fa~\2\u06af\u06a1\3\2\2\2\u06af\u06a2\3\2\2\2\u06af\u06a3\3\2\2\2"+
		"\u06af\u06a4\3\2\2\2\u06af\u06a5\3\2\2\2\u06af\u06a7\3\2\2\2\u06af\u06ac"+
		"\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u009b\3\2\2\2\u06b1\u06b2\7\u008f\2"+
		"\2\u06b2\u06b4\7{\2\2\u06b3\u06b5\t\r\2\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5"+
		"\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b8\5\u00a8U\2\u06b7\u06b9\7<\2\2"+
		"\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u009d\3\2\2\2\u06ba\u06bb"+
		"\5\u00acW\2\u06bb\u009f\3\2\2\2\u06bc\u06bd\7\u0083\2\2\u06bd\u06be\7"+
		"\u0085\2\2\u06be\u06bf\5\u00a8U\2\u06bf\u00a1\3\2\2\2\u06c0\u06c1\7\u0085"+
		"\2\2\u06c1\u06c2\5\u00a8U\2\u06c2\u00a3\3\2\2\2\u06c3\u06cf\7R\2\2\u06c4"+
		"\u06d0\5\u00a6T\2\u06c5\u06c6\7\32\2\2\u06c6\u06c7\5\u00aaV\2\u06c7\u06c8"+
		"\7\33\2\2\u06c8\u06d0\3\2\2\2\u06c9\u06ca\7\u0081\2\2\u06ca\u06cb\7\32"+
		"\2\2\u06cb\u06cc\5\u00aaV\2\u06cc\u06cd\7\33\2\2\u06cd\u06d0\3\2\2\2\u06ce"+
		"\u06d0\5\u0110\u0089\2\u06cf\u06c4\3\2\2\2\u06cf\u06c5\3\2\2\2\u06cf\u06c9"+
		"\3\2\2\2\u06cf\u06ce\3\2\2\2\u06d0\u06d7\3\2\2\2\u06d1\u06d3\7\27\2\2"+
		"\u06d2\u06d4\5\u0110\u0089\2\u06d3\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5"+
		"\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7\u06d1\3\2"+
		"\2\2\u06d7\u06d8\3\2\2\2\u06d8\u00a5\3\2\2\2\u06d9\u06dc\5\u00dan\2\u06da"+
		"\u06dc\5\u00dco\2\u06db\u06d9\3\2\2\2\u06db\u06da\3\2\2\2\u06dc\u00a7"+
		"\3\2\2\2\u06dd\u06de\7\u0088\2\2\u06de\u06df\7I\2\2\u06df\u06e1\t\16\2"+
		"\2\u06e0\u06dd\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u00a9\3\2\2\2\u06e2\u06e3"+
		"\bV\1\2\u06e3\u0730\5\u00dco\2\u06e4\u0730\7\u00bc\2\2\u06e5\u06e6\5\u00ee"+
		"x\2\u06e6\u06e7\7\31\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06e5\3\2\2\2\u06e8"+
		"\u06e9\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\5\u00f2z\2\u06eb\u06ec"+
		"\7\31\2\2\u06ec\u06ee\3\2\2\2\u06ed\u06e8\3\2\2\2\u06ed\u06ee\3\2\2\2"+
		"\u06ee\u06ef\3\2\2\2\u06ef\u0730\5\u00f8}\2\u06f0\u06f1\5\u00dep\2\u06f1"+
		"\u06f2\5\u00aaV\30\u06f2\u0730\3\2\2\2\u06f3\u06f4\5\u00ecw\2\u06f4\u0701"+
		"\7\32\2\2\u06f5\u06f7\7X\2\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f8\3\2\2\2\u06f8\u06fd\5\u00aaV\2\u06f9\u06fa\7\34\2\2\u06fa\u06fc"+
		"\5\u00aaV\2\u06fb\u06f9\3\2\2\2\u06fc\u06ff\3\2\2\2\u06fd\u06fb\3\2\2"+
		"\2\u06fd\u06fe\3\2\2\2\u06fe\u0702\3\2\2\2\u06ff\u06fd\3\2\2\2\u0700\u0702"+
		"\7\36\2\2\u0701\u06f6\3\2\2\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2"+
		"\u0702\u0703\3\2\2\2\u0703\u0704\7\33\2\2\u0704\u0730\3\2\2\2\u0705\u0706"+
		"\7\32\2\2\u0706\u0707\5\u00aaV\2\u0707\u0708\7\33\2\2\u0708\u0730\3\2"+
		"\2\2\u0709\u070a\7D\2\2\u070a\u070b\7\32\2\2\u070b\u070c\5\u00aaV\2\u070c"+
		"\u070d\79\2\2\u070d\u070e\5\u0098M\2\u070e\u070f\7\33\2\2\u070f\u0730"+
		"\3\2\2\2\u0710\u0712\7\u0083\2\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2"+
		"\2\u0712\u0713\3\2\2\2\u0713\u0715\7b\2\2\u0714\u0711\3\2\2\2\u0714\u0715"+
		"\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0717\7\32\2\2\u0717\u0718\5\u008c"+
		"G\2\u0718\u0719\7\33\2\2\u0719\u0730\3\2\2\2\u071a\u071c\7C\2\2\u071b"+
		"\u071d\5\u00aaV\2\u071c\u071b\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u0723"+
		"\3\2\2\2\u071e\u071f\7\u00b3\2\2\u071f\u0720\5\u00aaV\2\u0720\u0721\7"+
		"\u00a6\2\2\u0721\u0722\5\u00aaV\2\u0722\u0724\3\2\2\2\u0723\u071e\3\2"+
		"\2\2\u0724\u0725\3\2\2\2\u0725\u0723\3\2\2\2\u0725\u0726\3\2\2\2\u0726"+
		"\u0729\3\2\2\2\u0727\u0728\7\\\2\2\u0728\u072a\5\u00aaV\2\u0729\u0727"+
		"\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c\7]\2\2\u072c"+
		"\u0730\3\2\2\2\u072d\u0730\5\u00b0Y\2\u072e\u0730\5\6\4\2\u072f\u06e2"+
		"\3\2\2\2\u072f\u06e4\3\2\2\2\u072f\u06ed\3\2\2\2\u072f\u06f0\3\2\2\2\u072f"+
		"\u06f3\3\2\2\2\u072f\u0705\3\2\2\2\u072f\u0709\3\2\2\2\u072f\u0714\3\2"+
		"\2\2\u072f\u071a\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u072e\3\2\2\2\u0730"+
		"\u0795\3\2\2\2\u0731\u0732\f\27\2\2\u0732\u0733\7\"\2\2\u0733\u0794\5"+
		"\u00aaV\30\u0734\u0735\f\26\2\2\u0735\u0736\t\17\2\2\u0736\u0794\5\u00aa"+
		"V\27\u0737\u0738\f\25\2\2\u0738\u0739\t\20\2\2\u0739\u0794\5\u00aaV\26"+
		"\u073a\u073b\f\24\2\2\u073b\u073c\t\21\2\2\u073c\u0794\5\u00aaV\25\u073d"+
		"\u073e\f\23\2\2\u073e\u073f\t\22\2\2\u073f\u0794\5\u00aaV\24\u0740\u074d"+
		"\f\22\2\2\u0741\u074e\7\35\2\2\u0742\u074e\7-\2\2\u0743\u074e\7.\2\2\u0744"+
		"\u074e\7/\2\2\u0745\u074e\7x\2\2\u0746\u0747\7x\2\2\u0747\u074e\7\u0083"+
		"\2\2\u0748\u074e\7o\2\2\u0749\u074e\7}\2\2\u074a\u074e\7i\2\2\u074b\u074e"+
		"\7\177\2\2\u074c\u074e\7\u0095\2\2\u074d\u0741\3\2\2\2\u074d\u0742\3\2"+
		"\2\2\u074d\u0743\3\2\2\2\u074d\u0744\3\2\2\2\u074d\u0745\3\2\2\2\u074d"+
		"\u0746\3\2\2\2\u074d\u0748\3\2\2\2\u074d\u0749\3\2\2\2\u074d\u074a\3\2"+
		"\2\2\u074d\u074b\3\2\2\2\u074d\u074c\3\2\2\2\u074e\u074f\3\2\2\2\u074f"+
		"\u0794\5\u00aaV\23\u0750\u0751\f\21\2\2\u0751\u0752\78\2\2\u0752\u0794"+
		"\5\u00aaV\22\u0753\u0754\f\20\2\2\u0754\u0755\7\u008a\2\2\u0755\u0794"+
		"\5\u00aaV\21\u0756\u0757\f\t\2\2\u0757\u0759\7x\2\2\u0758\u075a\7\u0083"+
		"\2\2\u0759\u0758\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075b\3\2\2\2\u075b"+
		"\u0794\5\u00aaV\n\u075c\u075e\f\b\2\2\u075d\u075f\7\u0083\2\2\u075e\u075d"+
		"\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0761\7?\2\2\u0761"+
		"\u0762\5\u00aaV\2\u0762\u0763\78\2\2\u0763\u0764\5\u00aaV\t\u0764\u0794"+
		"\3\2\2\2\u0765\u0766\f\f\2\2\u0766\u0767\7F\2\2\u0767\u0794\5\u00fa~\2"+
		"\u0768\u076a\f\13\2\2\u0769\u076b\7\u0083\2\2\u076a\u0769\3\2\2\2\u076a"+
		"\u076b\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\t\23\2\2\u076d\u0770\5"+
		"\u00aaV\2\u076e\u076f\7_\2\2\u076f\u0771\5\u00aaV\2\u0770\u076e\3\2\2"+
		"\2\u0770\u0771\3\2\2\2\u0771\u0794\3\2\2\2\u0772\u0777\f\n\2\2\u0773\u0778"+
		"\7y\2\2\u0774\u0778\7\u0084\2\2\u0775\u0776\7\u0083\2\2\u0776\u0778\7"+
		"\u0085\2\2\u0777\u0773\3\2\2\2\u0777\u0774\3\2\2\2\u0777\u0775\3\2\2\2"+
		"\u0778\u0794\3\2\2\2\u0779\u077b\f\7\2\2\u077a\u077c\7\u0083\2\2\u077b"+
		"\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0791\7o"+
		"\2\2\u077e\u0788\7\32\2\2\u077f\u0789\5\u008cG\2\u0780\u0785\5\u00aaV"+
		"\2\u0781\u0782\7\34\2\2\u0782\u0784\5\u00aaV\2\u0783\u0781\3\2\2\2\u0784"+
		"\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0789\3\2"+
		"\2\2\u0787\u0785\3\2\2\2\u0788\u077f\3\2\2\2\u0788\u0780\3\2\2\2\u0788"+
		"\u0789\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u0792\7\33\2\2\u078b\u078c\5"+
		"\u00eex\2\u078c\u078d\7\31\2\2\u078d\u078f\3\2\2\2\u078e\u078b\3\2\2\2"+
		"\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\5\u00f2z\2\u0791"+
		"\u077e\3\2\2\2\u0791\u078e\3\2\2\2\u0792\u0794\3\2\2\2\u0793\u0731\3\2"+
		"\2\2\u0793\u0734\3\2\2\2\u0793\u0737\3\2\2\2\u0793\u073a\3\2\2\2\u0793"+
		"\u073d\3\2\2\2\u0793\u0740\3\2\2\2\u0793\u0750\3\2\2\2\u0793\u0753\3\2"+
		"\2\2\u0793\u0756\3\2\2\2\u0793\u075c\3\2\2\2\u0793\u0765\3\2\2\2\u0793"+
		"\u0768\3\2\2\2\u0793\u0772\3\2\2\2\u0793\u0779\3\2\2\2\u0794\u0797\3\2"+
		"\2\2\u0795\u0793\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u00ab\3\2\2\2\u0797"+
		"\u0795\3\2\2\2\u0798\u079c\7\u0094\2\2\u0799\u079a\5\u00eex\2\u079a\u079b"+
		"\7\31\2\2\u079b\u079d\3\2\2\2\u079c\u0799\3\2\2\2\u079c\u079d\3\2\2\2"+
		"\u079d\u079e\3\2\2\2\u079e\u07aa\5\u00fc\177\2\u079f\u07a0\7\32\2\2\u07a0"+
		"\u07a5\5\u00aeX\2\u07a1\u07a2\7\34\2\2\u07a2\u07a4\5\u00aeX\2\u07a3\u07a1"+
		"\3\2\2\2\u07a4\u07a7\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6"+
		"\u07a8\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a8\u07a9\7\33\2\2\u07a9\u07ab\3"+
		"\2\2\2\u07aa\u079f\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07be\3\2\2\2\u07ac"+
		"\u07ad\7\u0088\2\2\u07ad\u07b6\t\24\2\2\u07ae\u07af\7\u00a1\2\2\u07af"+
		"\u07b7\7\u0085\2\2\u07b0\u07b1\7\u00a1\2\2\u07b1\u07b7\7R\2\2\u07b2\u07b7"+
		"\7B\2\2\u07b3\u07b7\7\u009a\2\2\u07b4\u07b5\7\u0082\2\2\u07b5\u07b7\7"+
		"\62\2\2\u07b6\u07ae\3\2\2\2\u07b6\u07b0\3\2\2\2\u07b6\u07b2\3\2\2\2\u07b6"+
		"\u07b3\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07bb\3\2\2\2\u07b8\u07b9\7\177"+
		"\2\2\u07b9\u07bb\5\u00eav\2\u07ba\u07ac\3\2\2\2\u07ba\u07b8\3\2\2\2\u07bb"+
		"\u07bd\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2"+
		"\2\2\u07be\u07bf\3\2\2\2\u07bf\u07ce\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1"+
		"\u07c3\7\u0083\2\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4"+
		"\3\2\2\2\u07c4\u07c9\7S\2\2\u07c5\u07c6\7r\2\2\u07c6\u07ca\7T\2\2\u07c7"+
		"\u07c8\7r\2\2\u07c8\u07ca\7n\2\2\u07c9\u07c5\3\2\2\2\u07c9\u07c7\3\2\2"+
		"\2\u07c9\u07ca\3\2\2\2\u07ca\u07cc\3\2\2\2\u07cb\u07cd\7^\2\2\u07cc\u07cb"+
		"\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\3\2\2\2\u07ce\u07c2\3\2\2\2\u07ce"+
		"\u07cf\3\2\2\2\u07cf\u00ad\3\2\2\2\u07d0\u07d1\5\u00eav\2\u07d1\u00af"+
		"\3\2\2\2\u07d2\u07d3\7\u0092\2\2\u07d3\u07d8\7\32\2\2\u07d4\u07d9\7m\2"+
		"\2\u07d5\u07d6\t\25\2\2\u07d6\u07d7\7\34\2\2\u07d7\u07d9\5\u00e0q\2\u07d8"+
		"\u07d4\3\2\2\2\u07d8\u07d5\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\7\33"+
		"\2\2\u07db\u00b1\3\2\2\2\u07dc\u07df\5\u00f8}\2\u07dd\u07de\7F\2\2\u07de"+
		"\u07e0\5\u00fa~\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e2"+
		"\3\2\2\2\u07e1\u07e3\t\r\2\2\u07e2\u07e1\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3"+
		"\u00b3\3\2\2\2\u07e4\u07e5\7J\2\2\u07e5\u07e7\5\u00eav\2\u07e6\u07e4\3"+
		"\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07f1\3\2\2\2\u07e8\u07f2\5\u00b6\\\2"+
		"\u07e9\u07f2\5\u00bc_\2\u07ea\u07f2\5\u00ba^\2\u07eb\u07ec\7E\2\2\u07ec"+
		"\u07ed\7\32\2\2\u07ed\u07ee\5\u00aaV\2\u07ee\u07ef\7\33\2\2\u07ef\u07f2"+
		"\3\2\2\2\u07f0\u07f2\5\u00b8]\2\u07f1\u07e8\3\2\2\2\u07f1\u07e9\3\2\2"+
		"\2\u07f1\u07ea\3\2\2\2\u07f1\u07eb\3\2\2\2\u07f1\u07f0\3\2\2\2\u07f2\u00b5"+
		"\3\2\2\2\u07f3\u07f4\7\u008f\2\2\u07f4\u07f5\7{\2\2\u07f5\u07f6\7\32\2"+
		"\2\u07f6\u07fb\5\u00b2Z\2\u07f7\u07f8\7\34\2\2\u07f8\u07fa\5\u00b2Z\2"+
		"\u07f9\u07f7\3\2\2\2\u07fa\u07fd\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc"+
		"\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fe\u07ff\7\33\2\2"+
		"\u07ff\u0800\5\u00a8U\2\u0800\u00b7\3\2\2\2\u0801\u0802\7f\2\2\u0802\u0803"+
		"\7{\2\2\u0803\u0804\7\32\2\2\u0804\u0809\5\u00be`\2\u0805\u0806\7\34\2"+
		"\2\u0806\u0808\5\u00be`\2\u0807\u0805\3\2\2\2\u0808\u080b\3\2\2\2\u0809"+
		"\u0807\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\3\2\2\2\u080b\u0809\3\2"+
		"\2\2\u080c\u080d\7\33\2\2\u080d\u080e\5\u00acW\2\u080e\u00b9\3\2\2\2\u080f"+
		"\u0811\7\u00ab\2\2\u0810\u0812\7{\2\2\u0811\u0810\3\2\2\2\u0811\u0812"+
		"\3\2\2\2\u0812\u0814\3\2\2\2\u0813\u0815\5\u00eav\2\u0814\u0813\3\2\2"+
		"\2\u0814\u0815\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0817\7\32\2\2\u0817"+
		"\u081c\5\u00b2Z\2\u0818\u0819\7\34\2\2\u0819\u081b\5\u00b2Z\2\u081a\u0818"+
		"\3\2\2\2\u081b\u081e\3\2\2\2\u081c\u081a\3\2\2\2\u081c\u081d\3\2\2\2\u081d"+
		"\u081f\3\2\2\2\u081e\u081c\3\2\2\2\u081f\u0820\7\33\2\2\u0820\u0821\5"+
		"\u00a8U\2\u0821\u00bb\3\2\2\2\u0822\u0824\7{\2\2\u0823\u0825\5\u00eav"+
		"\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0827"+
		"\7\32\2\2\u0827\u082c\5\u00b2Z\2\u0828\u0829\7\34\2\2\u0829\u082b\5\u00b2"+
		"Z\2\u082a\u0828\3\2\2\2\u082b\u082e\3\2\2\2\u082c\u082a\3\2\2\2\u082c"+
		"\u082d\3\2\2\2\u082d\u082f\3\2\2\2\u082e\u082c\3\2\2\2\u082f\u0830\7\33"+
		"\2\2\u0830\u0831\5\u00a8U\2\u0831\u00bd\3\2\2\2\u0832\u0833\5\u00f8}\2"+
		"\u0833\u00bf\3\2\2\2\u0834\u0836\7\u00b6\2\2\u0835\u0837\7\u0093\2\2\u0836"+
		"\u0835\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u0839\5\u00d8"+
		"m\2\u0839\u083a\79\2\2\u083a\u083b\7\32\2\2\u083b\u083c\5\u008cG\2\u083c"+
		"\u0846\7\33\2\2\u083d\u083e\7\34\2\2\u083e\u083f\5\u00d8m\2\u083f\u0840"+
		"\79\2\2\u0840\u0841\7\32\2\2\u0841\u0842\5\u008cG\2\u0842\u0843\7\33\2"+
		"\2\u0843\u0845\3\2\2\2\u0844\u083d\3\2\2\2\u0845\u0848\3\2\2\2\u0846\u0844"+
		"\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u00c1\3\2\2\2\u0848\u0846\3\2\2\2\u0849"+
		"\u084a\5\u00eex\2\u084a\u084b\7\31\2\2\u084b\u084d\3\2\2\2\u084c\u0849"+
		"\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u0854\5\u00f2z"+
		"\2\u084f\u0850\7q\2\2\u0850\u0851\7A\2\2\u0851\u0855\5\u00fe\u0080\2\u0852"+
		"\u0853\7\u0083\2\2\u0853\u0855\7q\2\2\u0854\u084f\3\2\2\2\u0854\u0852"+
		"\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u00c3\3\2\2\2\u0856\u0859\5\u00aaV"+
		"\2\u0857\u0858\7F\2\2\u0858\u085a\5\u00fa~\2\u0859\u0857\3\2\2\2\u0859"+
		"\u085a\3\2\2\2\u085a\u085c\3\2\2\2\u085b\u085d\t\r\2\2\u085c\u085b\3\2"+
		"\2\2\u085c\u085d\3\2\2\2\u085d\u00c5\3\2\2\2\u085e\u0862\5\u00dan\2\u085f"+
		"\u0862\5\u00eav\2\u0860\u0862\7\u00bd\2\2\u0861\u085e\3\2\2\2\u0861\u085f"+
		"\3\2\2\2\u0861\u0860\3\2\2\2\u0862\u00c7\3\2\2\2\u0863\u086f\5\u00f2z"+
		"\2\u0864\u0865\7\32\2\2\u0865\u086a\5\u00f8}\2\u0866\u0867\7\34\2\2\u0867"+
		"\u0869\5\u00f8}\2\u0868\u0866\3\2\2\2\u0869\u086c\3\2\2\2\u086a\u0868"+
		"\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086d\3\2\2\2\u086c\u086a\3\2\2\2\u086d"+
		"\u086e\7\33\2\2\u086e\u0870\3\2\2\2\u086f\u0864\3\2\2\2\u086f\u0870\3"+
		"\2\2\2\u0870\u0871\3\2\2\2\u0871\u0872\79\2\2\u0872\u0873\7\32\2\2\u0873"+
		"\u0874\5\u008cG\2\u0874\u0875\7\33\2\2\u0875\u00c9\3\2\2\2\u0876\u0883"+
		"\7\36\2\2\u0877\u0878\5\u00f2z\2\u0878\u0879\7\31\2\2\u0879\u087a\7\36"+
		"\2\2\u087a\u0883\3\2\2\2\u087b\u0880\5\u00aaV\2\u087c\u087e\79\2\2\u087d"+
		"\u087c\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0881\5\u00e4"+
		"s\2\u0880\u087d\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0883\3\2\2\2\u0882"+
		"\u0876\3\2\2\2\u0882\u0877\3\2\2\2\u0882\u087b\3\2\2\2\u0883\u00cb\3\2"+
		"\2\2\u0884\u0885\5\u00eex\2\u0885\u0886\7\31\2\2\u0886\u0888\3\2\2\2\u0887"+
		"\u0884\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088e\5\u00f2"+
		"z\2\u088a\u088c\79\2\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d"+
		"\3\2\2\2\u088d\u088f\5\u010a\u0086\2\u088e\u088b\3\2\2\2\u088e\u088f\3"+
		"\2\2\2\u088f\u0895\3\2\2\2\u0890\u0891\7q\2\2\u0891\u0892\7A\2\2\u0892"+
		"\u0896\5\u00fe\u0080\2\u0893\u0894\7\u0083\2\2\u0894\u0896\7q\2\2\u0895"+
		"\u0890\3\2\2\2\u0895\u0893\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u08b4\3\2"+
		"\2\2\u0897\u08a1\7\32\2\2\u0898\u089d\5\u00ccg\2\u0899\u089a\7\34\2\2"+
		"\u089a\u089c\5\u00ccg\2\u089b\u0899\3\2\2\2\u089c\u089f\3\2\2\2\u089d"+
		"\u089b\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u08a2\3\2\2\2\u089f\u089d\3\2"+
		"\2\2\u08a0\u08a2\5\u00ceh\2\u08a1\u0898\3\2\2\2\u08a1\u08a0\3\2\2\2\u08a2"+
		"\u08a3\3\2\2\2\u08a3\u08a8\7\33\2\2\u08a4\u08a6\79\2\2\u08a5\u08a4\3\2"+
		"\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08a9\5\u010a\u0086"+
		"\2\u08a8\u08a5\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u08b4\3\2\2\2\u08aa\u08ab"+
		"\7\32\2\2\u08ab\u08ac\5\u008cG\2\u08ac\u08b1\7\33\2\2\u08ad\u08af\79\2"+
		"\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b2"+
		"\5\u010a\u0086\2\u08b1\u08ae\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b4\3"+
		"\2\2\2\u08b3\u0887\3\2\2\2\u08b3\u0897\3\2\2\2\u08b3\u08aa\3\2\2\2\u08b4"+
		"\u00cd\3\2\2\2\u08b5\u08bc\5\u00ccg\2\u08b6\u08b7\5\u00d0i\2\u08b7\u08b8"+
		"\5\u00ccg\2\u08b8\u08b9\5\u00d2j\2\u08b9\u08bb\3\2\2\2\u08ba\u08b6\3\2"+
		"\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd"+
		"\u00cf\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf\u08cd\7\34\2\2\u08c0\u08c2\7"+
		"\u0080\2\2\u08c1\u08c0\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c9\3\2\2\2"+
		"\u08c3\u08c5\7|\2\2\u08c4\u08c6\7\u008c\2\2\u08c5\u08c4\3\2\2\2\u08c5"+
		"\u08c6\3\2\2\2\u08c6\u08ca\3\2\2\2\u08c7\u08ca\7s\2\2\u08c8\u08ca\7M\2"+
		"\2\u08c9\u08c3\3\2\2\2\u08c9\u08c7\3\2\2\2\u08c9\u08c8\3\2\2\2\u08c9\u08ca"+
		"\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cd\7z\2\2\u08cc\u08bf\3\2\2\2\u08cc"+
		"\u08c1\3\2\2\2\u08cd\u00d1\3\2\2\2\u08ce\u08cf\7\u0088\2\2\u08cf\u08dd"+
		"\5\u00aaV\2\u08d0\u08d1\7\u00ad\2\2\u08d1\u08d2\7\32\2\2\u08d2\u08d7\5"+
		"\u00f8}\2\u08d3\u08d4\7\34\2\2\u08d4\u08d6\5\u00f8}\2\u08d5\u08d3\3\2"+
		"\2\2\u08d6\u08d9\3\2\2\2\u08d7\u08d5\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8"+
		"\u08da\3\2\2\2\u08d9\u08d7\3\2\2\2\u08da\u08db\7\33\2\2\u08db\u08dd\3"+
		"\2\2\2\u08dc\u08ce\3\2\2\2\u08dc\u08d0\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd"+
		"\u00d3\3\2\2\2\u08de\u08e0\7\u00a0\2\2\u08df\u08e1\t\f\2\2\u08e0\u08df"+
		"\3\2\2\2\u08e0\u08e1\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u08e7\5\u00caf"+
		"\2\u08e3\u08e4\7\34\2\2\u08e4\u08e6\5\u00caf\2\u08e5\u08e3\3\2\2\2\u08e6"+
		"\u08e9\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08f6\3\2"+
		"\2\2\u08e9\u08e7\3\2\2\2\u08ea\u08f4\7g\2\2\u08eb\u08f0\5\u00ccg\2\u08ec"+
		"\u08ed\7\34\2\2\u08ed\u08ef\5\u00ccg\2\u08ee\u08ec\3\2\2\2\u08ef\u08f2"+
		"\3\2\2\2\u08f0\u08ee\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f5\3\2\2\2\u08f2"+
		"\u08f0\3\2\2\2\u08f3\u08f5\5\u00ceh\2\u08f4\u08eb\3\2\2\2\u08f4\u08f3"+
		"\3\2\2\2\u08f5\u08f7\3\2\2\2\u08f6\u08ea\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7"+
		"\u08fa\3\2\2\2\u08f8\u08f9\7\u00b4\2\2\u08f9\u08fb\5\u00aaV\2\u08fa\u08f8"+
		"\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u090a\3\2\2\2\u08fc\u08fd\7j\2\2\u08fd"+
		"\u08fe\7A\2\2\u08fe\u0903\5\u00aaV\2\u08ff\u0900\7\34\2\2\u0900\u0902"+
		"\5\u00aaV\2\u0901\u08ff\3\2\2\2\u0902\u0905\3\2\2\2\u0903\u0901\3\2\2"+
		"\2\u0903\u0904\3\2\2\2\u0904\u0908\3\2\2\2\u0905\u0903\3\2\2\2\u0906\u0907"+
		"\7k\2\2\u0907\u0909\5\u00aaV\2\u0908\u0906\3\2\2\2\u0908\u0909\3\2\2\2"+
		"\u0909\u090b\3\2\2\2\u090a\u08fc\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u0929"+
		"\3\2\2\2\u090c\u090d\7\u00af\2\2\u090d\u090e\7\32\2\2\u090e\u0913\5\u00aa"+
		"V\2\u090f\u0910\7\34\2\2\u0910\u0912\5\u00aaV\2\u0911\u090f\3\2\2\2\u0912"+
		"\u0915\3\2\2\2\u0913\u0911\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0916\3\2"+
		"\2\2\u0915\u0913\3\2\2\2\u0916\u0925\7\33\2\2\u0917\u0918\7\34\2\2\u0918"+
		"\u0919\7\32\2\2\u0919\u091e\5\u00aaV\2\u091a\u091b\7\34\2\2\u091b\u091d"+
		"\5\u00aaV\2\u091c\u091a\3\2\2\2\u091d\u0920\3\2\2\2\u091e\u091c\3\2\2"+
		"\2\u091e\u091f\3\2\2\2\u091f\u0921\3\2\2\2\u0920\u091e\3\2\2\2\u0921\u0922"+
		"\7\33\2\2\u0922\u0924\3\2\2\2\u0923\u0917\3\2\2\2\u0924\u0927\3\2\2\2"+
		"\u0925\u0923\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u0929\3\2\2\2\u0927\u0925"+
		"\3\2\2\2\u0928\u08de\3\2\2\2\u0928\u090c\3\2\2\2\u0929\u00d5\3\2\2\2\u092a"+
		"\u0930\7\u00aa\2\2\u092b\u092c\7\u00aa\2\2\u092c\u0930\7\65\2\2\u092d"+
		"\u0930\7v\2\2\u092e\u0930\7`\2\2\u092f\u092a\3\2\2\2\u092f\u092b\3\2\2"+
		"\2\u092f\u092d\3\2\2\2\u092f\u092e\3\2\2\2\u0930\u00d7\3\2\2\2\u0931\u093d"+
		"\5\u00f2z\2\u0932\u0933\7\32\2\2\u0933\u0938\5\u00f8}\2\u0934\u0935\7"+
		"\34\2\2\u0935\u0937\5\u00f8}\2\u0936\u0934\3\2\2\2\u0937\u093a\3\2\2\2"+
		"\u0938\u0936\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093b\3\2\2\2\u093a\u0938"+
		"\3\2\2\2\u093b\u093c\7\33\2\2\u093c\u093e\3\2\2\2\u093d\u0932\3\2\2\2"+
		"\u093d\u093e\3\2\2\2\u093e\u00d9\3\2\2\2\u093f\u0941\t\20\2\2\u0940\u093f"+
		"\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0945\7\u00bb\2";
	private static final String _serializedATNSegment1 =
		"\2\u0943\u0945\7\36\2\2\u0944\u0940\3\2\2\2\u0944\u0943\3\2\2\2\u0945"+
		"\u00db\3\2\2\2\u0946\u0947\t\26\2\2\u0947\u00dd\3\2\2\2\u0948\u0949\t"+
		"\27\2\2\u0949\u00df\3\2\2\2\u094a\u094b\7\u00bd\2\2\u094b\u00e1\3\2\2"+
		"\2\u094c\u094f\5\u00aaV\2\u094d\u094f\5\u0096L\2\u094e\u094c\3\2\2\2\u094e"+
		"\u094d\3\2\2\2\u094f\u00e3\3\2\2\2\u0950\u0951\t\30\2\2\u0951\u00e5\3"+
		"\2\2\2\u0952\u0953\t\31\2\2\u0953\u00e7\3\2\2\2\u0954\u0956\13\2\2\2\u0955"+
		"\u0954\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0955\3\2\2\2\u0957\u0958\3\2"+
		"\2\2\u0958\u00e9\3\2\2\2\u0959\u095a\5\u0110\u0089\2\u095a\u00eb\3\2\2"+
		"\2\u095b\u095c\5\u0110\u0089\2\u095c\u00ed\3\2\2\2\u095d\u095e\5\u0110"+
		"\u0089\2\u095e\u00ef\3\2\2\2\u095f\u0960\5\u0110\u0089\2\u0960\u00f1\3"+
		"\2\2\2\u0961\u0962\5\u0110\u0089\2\u0962\u00f3\3\2\2\2\u0963\u0964\5\u0110"+
		"\u0089\2\u0964\u00f5\3\2\2\2\u0965\u0966\5\u0110\u0089\2\u0966\u00f7\3"+
		"\2\2\2\u0967\u0968\5\u0110\u0089\2\u0968\u00f9\3\2\2\2\u0969\u096a\5\u0110"+
		"\u0089\2\u096a\u00fb\3\2\2\2\u096b\u096c\5\u0110\u0089\2\u096c\u00fd\3"+
		"\2\2\2\u096d\u096e\5\u0110\u0089\2\u096e\u00ff\3\2\2\2\u096f\u0970\5\u0110"+
		"\u0089\2\u0970\u0101\3\2\2\2\u0971\u0972\5\u0110\u0089\2\u0972\u0103\3"+
		"\2\2\2\u0973\u0974\5\u0110\u0089\2\u0974\u0105\3\2\2\2\u0975\u0976\5\u0110"+
		"\u0089\2\u0976\u0107\3\2\2\2\u0977\u0978\5\u0110\u0089\2\u0978\u0109\3"+
		"\2\2\2\u0979\u097a\5\u0110\u0089\2\u097a\u010b\3\2\2\2\u097b\u097c\5\u0110"+
		"\u0089\2\u097c\u010d\3\2\2\2\u097d\u097e\5\u0110\u0089\2\u097e\u010f\3"+
		"\2\2\2\u097f\u0986\7\u00ba\2\2\u0980\u0986\7\u00bd\2\2\u0981\u0982\7\32"+
		"\2\2\u0982\u0983\5\u0110\u0089\2\u0983\u0984\7\33\2\2\u0984\u0986\3\2"+
		"\2\2\u0985\u097f\3\2\2\2\u0985\u0980\3\2\2\2\u0985\u0981\3\2\2\2\u0986"+
		"\u0111\3\2\2\2\u014e\u0114\u0116\u011e\u0125\u012b\u0133\u013a\u013f\u0145"+
		"\u014c\u0155\u015c\u0160\u0167\u016a\u016d\u0173\u0180\u0183\u0187\u018f"+
		"\u0199\u01a6\u01b3\u01bd\u01bf\u01c1\u01ca\u01cf\u01d6\u01db\u01de\u01ef"+
		"\u01fe\u0202\u020f\u0218\u021c\u0225\u022a\u022c\u0231\u0233\u023b\u0242"+
		"\u0259\u025b\u0263\u0267\u026f\u0273\u0279\u027d\u0283\u0289\u0293\u029d"+
		"\u02a2\u02aa\u02b4\u02b9\u02be\u02c3\u02c7\u02cc\u02d1\u02d5\u02db\u02e0"+
		"\u02e7\u02ea\u02f3\u02f5\u02fc\u0304\u0309\u031a\u0324\u0326\u0346\u034b"+
		"\u0350\u035a\u035d\u0360\u0363\u0374\u0378\u0380\u0384\u0386\u038b\u038d"+
		"\u0391\u0398\u039b\u03a0\u03a4\u03a9\u03b2\u03b5\u03bb\u03bd\u03c1\u03c7"+
		"\u03cc\u03d7\u03dd\u03e1\u03e7\u03ec\u03f5\u03f7\u03fd\u0401\u0404\u0408"+
		"\u040e\u0413\u041a\u0425\u0428\u042a\u0430\u0436\u043a\u0441\u0447\u044d"+
		"\u0453\u0458\u0464\u0469\u0474\u0479\u047c\u0483\u0486\u048c\u0490\u0499"+
		"\u049c\u04a2\u04a4\u04a8\u04b0\u04b5\u04bd\u04c2\u04ca\u04cf\u04d7\u04dc"+
		"\u04e2\u04e9\u04ec\u04f4\u04fe\u0501\u0507\u0509\u050c\u051f\u0525\u052e"+
		"\u0533\u053c\u0547\u054e\u0554\u055a\u0563\u056a\u056e\u0570\u0574\u057b"+
		"\u057d\u0581\u0584\u058b\u0592\u0595\u059f\u05a2\u05a8\u05aa\u05ae\u05b5"+
		"\u05b8\u05c0\u05ca\u05cd\u05d3\u05d5\u05d9\u05e0\u05e9\u05ed\u05ef\u05f3"+
		"\u05fc\u0601\u0603\u060c\u0617\u061e\u0621\u0624\u0631\u063f\u0644\u0647"+
		"\u0654\u0662\u0667\u0670\u0673\u0679\u067b\u0682\u0684\u068b\u0692\u0697"+
		"\u069b\u069f\u06af\u06b4\u06b8\u06cf\u06d5\u06d7\u06db\u06e0\u06e8\u06ed"+
		"\u06f6\u06fd\u0701\u0711\u0714\u071c\u0725\u0729\u072f\u074d\u0759\u075e"+
		"\u076a\u0770\u0777\u077b\u0785\u0788\u078e\u0791\u0793\u0795\u079c\u07a5"+
		"\u07aa\u07b6\u07ba\u07be\u07c2\u07c9\u07cc\u07ce\u07d8\u07df\u07e2\u07e6"+
		"\u07f1\u07fb\u0809\u0811\u0814\u081c\u0824\u082c\u0836\u0846\u084c\u0854"+
		"\u0859\u085c\u0861\u086a\u086f\u087d\u0880\u0882\u0887\u088b\u088e\u0895"+
		"\u089d\u08a1\u08a5\u08a8\u08ae\u08b1\u08b3\u08bc\u08c1\u08c5\u08c9\u08cc"+
		"\u08d7\u08dc\u08e0\u08e7\u08f0\u08f4\u08f6\u08fa\u0903\u0908\u090a\u0913"+
		"\u091e\u0925\u0928\u092f\u0938\u093d\u0940\u0944\u094e\u0957\u0985";
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