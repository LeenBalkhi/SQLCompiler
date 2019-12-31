
// Generated from C:/Users/Dell/Documents/GitHub/SQLCompiler\Sql.g4 by ANTLR 4.7.2
package Rules;

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
		T__17=18, T__18=19, SCOL=20, DOT=21, OPEN_PAR=22, CLOSE_PAR=23, COMMA=24, 
		ASSIGN=25, STAR=26, PLUS=27, MINUS=28, TILDE=29, PIPE2=30, DIV=31, MOD=32, 
		LT2=33, GT2=34, AMP=35, PIPE=36, LT=37, LT_EQ=38, GT=39, GT_EQ=40, EQ=41, 
		NOT_EQ1=42, NOT_EQ2=43, K_ABORT=44, K_ACTION=45, K_ADD=46, K_AFTER=47, 
		K_ALL=48, K_ALTER=49, K_ANALYZE=50, K_AND=51, K_AS=52, K_ASC=53, K_ATTACH=54, 
		K_AUTOINCREMENT=55, K_BEFORE=56, K_BEGIN=57, K_BETWEEN=58, K_BREAK=59, 
		K_BY=60, K_CASCADE=61, K_CASE=62, K_CAST=63, K_CHECK=64, K_COLLATE=65, 
		K_COLUMN=66, K_COMMIT=67, K_CONFLICT=68, K_CONSTRAINT=69, K_CONTINUE=70, 
		K_CREATE=71, K_CROSS=72, K_CURRENT_DATE=73, K_CURRENT_TIME=74, K_CURRENT_TIMESTAMP=75, 
		K_DATABASE=76, K_DEFAULT=77, K_DEFERRABLE=78, K_DEFERRED=79, K_DELETE=80, 
		K_DESC=81, K_DETACH=82, K_DISTINCT=83, K_DO=84, K_DROP=85, K_EACH=86, 
		K_ELSE=87, K_END=88, K_ENABLE=89, K_ESCAPE=90, K_EXCEPT=91, K_EXCLUSIVE=92, 
		K_EXISTS=93, K_EXPLAIN=94, K_FAIL=95, K_FOR=96, K_FOREIGN=97, K_FROM=98, 
		K_FULL=99, K_FUNCTION=100, K_GLOB=101, K_GROUP=102, K_HAVING=103, K_IF=104, 
		K_IGNORE=105, K_IMMEDIATE=106, K_IN=107, K_INDEX=108, K_INDEXED=109, K_INITIALLY=110, 
		K_INNER=111, K_INSERT=112, K_INSTEAD=113, K_INTERSECT=114, K_INTO=115, 
		K_IS=116, K_ISNULL=117, K_JOIN=118, K_KEY=119, K_LEFT=120, K_LIKE=121, 
		K_LIMIT=122, K_MATCH=123, K_NATURAL=124, K_NEXTVAL=125, K_NO=126, K_NOT=127, 
		K_NOTNULL=128, K_NULL=129, K_OF=130, K_OFFSET=131, K_ON=132, K_ONLY=133, 
		K_OR=134, K_ORDER=135, K_OUTER=136, K_PLAN=137, K_PRAGMA=138, K_PRIMARY=139, 
		K_PRINT=140, K_QUERY=141, K_RAISE=142, K_RECURSIVE=143, K_REFERENCES=144, 
		K_REGEXP=145, K_REINDEX=146, K_RELEASE=147, K_RENAME=148, K_REPLACE=149, 
		K_RESTRICT=150, K_RETURN=151, K_RIGHT=152, K_ROLLBACK=153, K_ROW=154, 
		K_SAVEPOINT=155, K_SELECT=156, K_SET=157, K_SWITCH=158, K_TABLE=159, K_TEMP=160, 
		K_TEMPORARY=161, K_THEN=162, K_TO=163, K_TRANSACTION=164, K_TRIGGER=165, 
		K_UNION=166, K_UNIQUE=167, K_UPDATE=168, K_USING=169, K_VACUUM=170, K_VALUES=171, 
		K_VIEW=172, K_VIRTUAL=173, K_VAR=174, K_WHEN=175, K_WHERE=176, K_WHILE=177, 
		K_WITH=178, K_WITHOUT=179, K_TRUE=180, K_FALSE=181, IDENTIFIER=182, NUMERIC_LITERAL=183, 
		BIND_PARAMETER=184, STRING_LITERAL=185, BLOB_LITERAL=186, SINGLE_LINE_COMMENT=187, 
		JAVA_SINGLE_LINE_COMMENT=188, MULTILINE_COMMENT=189, SPACES=190, UNEXPECTED_CHAR=191;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_java_stmt = 2, RULE_parameter_list = 3, 
		RULE_argument_list = 4, RULE_java_function_call = 5, RULE_return_stmt = 6, 
		RULE_java_function_declaration = 7, RULE_block = 8, RULE_one_line_block = 9, 
		RULE_java_body = 10, RULE_comments = 11, RULE_variable = 12, RULE_variable_declaration = 13, 
		RULE_variable_assignment = 14, RULE_array_call = 15, RULE_value = 16, 
		RULE_non_boolean_expression = 17, RULE_boolean_exprk = 18, RULE_increment = 19, 
		RULE_assignment_operator = 20, RULE_conditional_stmt = 21, RULE_if_stmt = 22, 
		RULE_else_if_stmt = 23, RULE_else_stmt = 24, RULE_loop_stmt = 25, RULE_for_lopp = 26, 
		RULE_while_loop = 27, RULE_do_while_loop = 28, RULE_for_each_loop = 29, 
		RULE_sql_stmt_list = 30, RULE_sql_stmt = 31, RULE_alter_table_stmt = 32, 
		RULE_alter_table_add_constraint = 33, RULE_alter_table_add = 34, RULE_create_table_stmt = 35, 
		RULE_delete_stmt = 36, RULE_drop_table_stmt = 37, RULE_factored_select_stmt = 38, 
		RULE_insert_stmt = 39, RULE_select_stmt = 40, RULE_select_or_values = 41, 
		RULE_update_stmt = 42, RULE_column_def = 43, RULE_type_name = 44, RULE_column_constraint = 45, 
		RULE_column_constraint_primary_key = 46, RULE_column_constraint_foreign_key = 47, 
		RULE_column_constraint_not_null = 48, RULE_column_constraint_null = 49, 
		RULE_column_default = 50, RULE_column_default_value = 51, RULE_expr = 52, 
		RULE_foreign_key_clause = 53, RULE_fk_target_column_name = 54, RULE_indexed_column = 55, 
		RULE_table_constraint = 56, RULE_table_constraint_primary_key = 57, RULE_table_constraint_foreign_key = 58, 
		RULE_table_constraint_unique = 59, RULE_table_constraint_key = 60, RULE_fk_origin_column_name = 61, 
		RULE_qualified_table_name = 62, RULE_ordering_term = 63, RULE_pragma_value = 64, 
		RULE_common_table_expression = 65, RULE_result_column = 66, RULE_table_or_subquery = 67, 
		RULE_join_clause = 68, RULE_join_operator = 69, RULE_join_constraint = 70, 
		RULE_select_core = 71, RULE_cte_table_name = 72, RULE_signed_number = 73, 
		RULE_literal_value = 74, RULE_unary_operator = 75, RULE_error_message = 76, 
		RULE_module_argument = 77, RULE_column_alias = 78, RULE_keyword = 79, 
		RULE_unknown = 80, RULE_name = 81, RULE_function_name = 82, RULE_database_name = 83, 
		RULE_source_table_name = 84, RULE_table_name = 85, RULE_table_or_index_name = 86, 
		RULE_new_table_name = 87, RULE_column_name = 88, RULE_collation_name = 89, 
		RULE_foreign_table = 90, RULE_index_name = 91, RULE_trigger_name = 92, 
		RULE_view_name = 93, RULE_module_name = 94, RULE_pragma_name = 95, RULE_savepoint_name = 96, 
		RULE_table_alias = 97, RULE_transaction_name = 98, RULE_method_ID = 99, 
		RULE_array_name = 100, RULE_any_name = 101;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "java_stmt", "parameter_list", "argument_list", "java_function_call", 
			"return_stmt", "java_function_declaration", "block", "one_line_block", 
			"java_body", "comments", "variable", "variable_declaration", "variable_assignment", 
			"array_call", "value", "non_boolean_expression", "boolean_exprk", "increment", 
			"assignment_operator", "conditional_stmt", "if_stmt", "else_if_stmt", 
			"else_stmt", "loop_stmt", "for_lopp", "while_loop", "do_while_loop", 
			"for_each_loop", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "create_table_stmt", "delete_stmt", "drop_table_stmt", 
			"factored_select_stmt", "insert_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "expr", "foreign_key_clause", 
			"fk_target_column_name", "indexed_column", "table_constraint", "table_constraint_primary_key", 
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
			null, "'{'", "'}'", "'['", "']'", "'&&'", "'++'", "'--'", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'>>>='", "':'", 
			"'::'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SCOL", "DOT", "OPEN_PAR", 
			"CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", 
			"DIV", "MOD", "LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", 
			"EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", 
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
			case UNEXPECTED_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL || _la==K_ALTER || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (K_CREATE - 71)) | (1L << (K_DELETE - 71)) | (1L << (K_DROP - 71)) | (1L << (K_INSERT - 71)))) != 0) || ((((_la - 156)) & ~0x3f) == 0 && ((1L << (_la - 156)) & ((1L << (K_SELECT - 156)) | (1L << (K_UPDATE - 156)) | (1L << (K_VALUES - 156)) | (1L << (UNEXPECTED_CHAR - 156)))) != 0)) {
					{
					setState(206);
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
						setState(204);
						sql_stmt_list();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(205);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(EOF);
				}
				break;
			case OPEN_PAR:
			case K_FUNCTION:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				java_stmt();
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
			setState(215);
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
		public Java_function_declarationContext java_function_declaration() {
			return getRuleContext(Java_function_declarationContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
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
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				java_function_declaration();
				setState(219);
				match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				java_function_call();
				setState(222);
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

	public static class Parameter_listContext extends ParserRuleContext {
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
		enterRule(_localctx, 6, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(226);
				match(K_VAR);
				setState(227);
				any_name();
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				match(K_VAR);
				setState(232);
				any_name();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 8, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(238);
				any_name();
				}
				break;
			case 2:
				{
				setState(239);
				literal_value();
				}
				break;
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(243);
					any_name();
					}
					break;
				case 2:
					{
					setState(244);
					literal_value();
					}
					break;
				}
				}
				}
				setState(251);
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
		enterRule(_localctx, 10, RULE_java_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			method_ID();
			setState(253);
			match(OPEN_PAR);
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(254);
				argument_list();
				}
				break;
			}
			setState(257);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SqlParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Non_boolean_expressionContext non_boolean_expression() {
			return getRuleContext(Non_boolean_expressionContext.class,0);
		}
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
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
		enterRule(_localctx, 12, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(K_RETURN);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(260);
				non_boolean_expression(0);
				}
				break;
			case 2:
				{
				setState(261);
				boolean_exprk(0);
				}
				break;
			}
			setState(264);
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
		enterRule(_localctx, 14, RULE_java_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(266);
				match(K_FUNCTION);
				}
			}

			setState(269);
			method_ID();
			setState(270);
			match(OPEN_PAR);
			{
			setState(271);
			parameter_list();
			}
			setState(272);
			match(CLOSE_PAR);
			setState(273);
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
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__0);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OPEN_PAR) | (1L << K_BREAK))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CONTINUE - 70)) | (1L << (K_DO - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_VAR - 174)) | (1L << (K_WHILE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 174)) | (1L << (MULTILINE_COMMENT - 174)))) != 0)) {
				{
				{
				setState(276);
				java_body();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(282);
				return_stmt();
				}
			}

			setState(285);
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
		enterRule(_localctx, 18, RULE_one_line_block);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case OPEN_PAR:
			case K_BREAK:
			case K_CONTINUE:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
			case JAVA_SINGLE_LINE_COMMENT:
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				java_body();
				}
				break;
			case K_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
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
		enterRule(_localctx, 20, RULE_java_body);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				conditional_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				comments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				java_function_call();
				setState(294);
				match(SCOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				loop_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				increment();
				setState(298);
				match(SCOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				variable_declaration();
				setState(301);
				match(SCOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				variable_assignment();
				setState(304);
				match(SCOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(306);
				match(K_BREAK);
				setState(307);
				match(SCOL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(308);
				match(K_CONTINUE);
				setState(309);
				match(SCOL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(310);
				match(T__0);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << OPEN_PAR) | (1L << K_BREAK))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CONTINUE - 70)) | (1L << (K_DO - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_VAR - 174)) | (1L << (K_WHILE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 174)) | (1L << (MULTILINE_COMMENT - 174)))) != 0)) {
					{
					{
					setState(311);
					java_body();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(T__1);
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
		enterRule(_localctx, 22, RULE_comments);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(JAVA_SINGLE_LINE_COMMENT);
				}
				break;
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(MULTILINE_COMMENT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(T__0);
				setState(323);
				java_body();
				setState(324);
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
		enterRule(_localctx, 24, RULE_variable);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				any_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
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
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SqlParser.ASSIGN, 0); }
		public Non_boolean_expressionContext non_boolean_expression() {
			return getRuleContext(Non_boolean_expressionContext.class,0);
		}
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
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
		enterRule(_localctx, 26, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(K_VAR);
			setState(333);
			any_name();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(334);
				match(ASSIGN);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(335);
					non_boolean_expression(0);
					}
					break;
				case 2:
					{
					setState(336);
					boolean_exprk(0);
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Non_boolean_expressionContext non_boolean_expression() {
			return getRuleContext(Non_boolean_expressionContext.class,0);
		}
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
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
		enterRule(_localctx, 28, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			variable();
			setState(342);
			assignment_operator();
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(343);
				non_boolean_expression(0);
				}
				break;
			case 2:
				{
				setState(344);
				boolean_exprk(0);
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

	public static class Array_callContext extends ParserRuleContext {
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 30, RULE_array_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			array_name();
			setState(348);
			match(T__2);
			setState(349);
			value();
			setState(350);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				variable();
				}
				break;
			case 2:
				_localctx = new JavaFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				java_function_call();
				}
				break;
			case 3:
				_localctx = new LiteralValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				literal_value();
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

	public static class Non_boolean_expressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<Non_boolean_expressionContext> non_boolean_expression() {
			return getRuleContexts(Non_boolean_expressionContext.class);
		}
		public Non_boolean_expressionContext non_boolean_expression(int i) {
			return getRuleContext(Non_boolean_expressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode LT2() { return getToken(SqlParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SqlParser.GT2, 0); }
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SqlParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SqlParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public Non_boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterNon_boolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitNon_boolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitNon_boolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_boolean_expressionContext non_boolean_expression() throws RecognitionException {
		return non_boolean_expression(0);
	}

	private Non_boolean_expressionContext non_boolean_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_boolean_expressionContext _localctx = new Non_boolean_expressionContext(_ctx, _parentState);
		Non_boolean_expressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_non_boolean_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(358);
				value();
				}
				break;
			case 2:
				{
				setState(359);
				match(OPEN_PAR);
				setState(360);
				non_boolean_expression(0);
				setState(361);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_boolean_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_boolean_expression);
					setState(365);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(366);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(367);
					non_boolean_expression(3);
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Boolean_exprkContext extends ParserRuleContext {
		public Boolean_exprkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_exprk; }
	 
		public Boolean_exprkContext() { }
		public void copyFrom(Boolean_exprkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValContext extends Boolean_exprkContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValContext(Boolean_exprkContext ctx) { copyFrom(ctx); }
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
	public static class TrueContext extends Boolean_exprkContext {
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TrueContext(Boolean_exprkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Boolean_exprkContext {
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
		public FalseContext(Boolean_exprkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleBoolContext extends Boolean_exprkContext {
		public List<Boolean_exprkContext> boolean_exprk() {
			return getRuleContexts(Boolean_exprkContext.class);
		}
		public Boolean_exprkContext boolean_exprk(int i) {
			return getRuleContext(Boolean_exprkContext.class,i);
		}
		public TerminalNode PIPE2() { return getToken(SqlParser.PIPE2, 0); }
		public DoubleBoolContext(Boolean_exprkContext ctx) { copyFrom(ctx); }
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
	public static class DoubleNonBoolContext extends Boolean_exprkContext {
		public List<Non_boolean_expressionContext> non_boolean_expression() {
			return getRuleContexts(Non_boolean_expressionContext.class);
		}
		public Non_boolean_expressionContext non_boolean_expression(int i) {
			return getRuleContext(Non_boolean_expressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(SqlParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SqlParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SqlParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SqlParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SqlParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SqlParser.NOT_EQ2, 0); }
		public DoubleNonBoolContext(Boolean_exprkContext ctx) { copyFrom(ctx); }
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

	public final Boolean_exprkContext boolean_exprk() throws RecognitionException {
		return boolean_exprk(0);
	}

	private Boolean_exprkContext boolean_exprk(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_exprkContext _localctx = new Boolean_exprkContext(_ctx, _parentState);
		Boolean_exprkContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_boolean_exprk, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(374);
				value();
				}
				break;
			case 2:
				{
				_localctx = new DoubleNonBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(375);
				non_boolean_expression(0);
				setState(376);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				non_boolean_expression(0);
				}
				break;
			case 3:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(379);
				match(K_TRUE);
				}
				break;
			case 4:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				match(K_FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DoubleBoolContext(new Boolean_exprkContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_exprk);
					setState(383);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(384);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==PIPE2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(385);
					boolean_exprk(2);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 38, RULE_increment);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new PostIncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				variable();
				setState(392);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new PreIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(T__5);
				setState(395);
				variable();
				}
				break;
			case 3:
				_localctx = new PostDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				variable();
				setState(397);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new PreDecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(T__6);
				setState(400);
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
		enterRule(_localctx, 40, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ASSIGN))) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_conditional_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(405);
					if_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(408); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					else_if_stmt();
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(416);
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
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
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
		enterRule(_localctx, 44, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(K_IF);
			setState(420);
			match(OPEN_PAR);
			setState(421);
			boolean_exprk(0);
			setState(422);
			match(CLOSE_PAR);
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(423);
				block();
				}
				break;
			case 2:
				{
				setState(424);
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
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
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
		enterRule(_localctx, 46, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(K_ELSE);
			setState(428);
			match(K_IF);
			setState(429);
			match(OPEN_PAR);
			setState(430);
			boolean_exprk(0);
			setState(431);
			match(CLOSE_PAR);
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(432);
				block();
				}
				break;
			case 2:
				{
				setState(433);
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
		enterRule(_localctx, 48, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(K_ELSE);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(437);
				block();
				}
				break;
			case 2:
				{
				setState(438);
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
		enterRule(_localctx, 50, RULE_loop_stmt);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				for_lopp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				do_while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
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
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SqlParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SqlParser.SCOL, i);
		}
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public One_line_blockContext one_line_block() {
			return getRuleContext(One_line_blockContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_for_lopp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(447);
			match(K_FOR);
			setState(448);
			match(OPEN_PAR);
			setState(449);
			variable_declaration();
			setState(450);
			match(SCOL);
			setState(451);
			boolean_exprk(0);
			setState(452);
			match(SCOL);
			setState(453);
			increment();
			setState(454);
			match(CLOSE_PAR);
			}
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(456);
				block();
				}
				break;
			case 2:
				{
				setState(457);
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
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
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
		enterRule(_localctx, 54, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(460);
			match(K_WHILE);
			setState(461);
			match(OPEN_PAR);
			setState(462);
			boolean_exprk(0);
			setState(463);
			match(CLOSE_PAR);
			}
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(465);
				block();
				}
				break;
			case 2:
				{
				setState(466);
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
		public Boolean_exprkContext boolean_exprk() {
			return getRuleContext(Boolean_exprkContext.class,0);
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
		enterRule(_localctx, 56, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(K_DO);
			{
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(470);
				block();
				}
				break;
			case 2:
				{
				setState(471);
				one_line_block();
				}
				break;
			}
			}
			setState(474);
			match(K_WHILE);
			setState(475);
			match(OPEN_PAR);
			setState(476);
			boolean_exprk(0);
			setState(477);
			match(CLOSE_PAR);
			setState(478);
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
		enterRule(_localctx, 58, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(K_FOR);
			setState(481);
			match(OPEN_PAR);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(482);
				match(K_VAR);
				}
			}

			setState(485);
			variable();
			setState(486);
			match(T__17);
			setState(487);
			array_name();
			setState(488);
			match(CLOSE_PAR);
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(489);
				block();
				}
				break;
			case 2:
				{
				setState(490);
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
		enterRule(_localctx, 60, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(493);
				match(SCOL);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			sql_stmt();
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(501); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(500);
						match(SCOL);
						}
						}
						setState(503); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(505);
					sql_stmt();
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					match(SCOL);
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 62, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
				setState(517);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(518);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(519);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
				setState(520);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(521);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(522);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(523);
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
		enterRule(_localctx, 64, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(K_ALTER);
			setState(527);
			match(K_TABLE);
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(528);
				database_name();
				setState(529);
				match(DOT);
				}
				break;
			}
			setState(533);
			source_table_name();
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(534);
				match(K_RENAME);
				setState(535);
				match(K_TO);
				setState(536);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(537);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(538);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(539);
				match(K_ADD);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(540);
					match(K_COLUMN);
					}
				}

				setState(543);
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
		enterRule(_localctx, 66, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(K_ADD);
			setState(547);
			match(K_CONSTRAINT);
			setState(548);
			any_name();
			setState(549);
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
		enterRule(_localctx, 68, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(K_ADD);
			setState(552);
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
		enterRule(_localctx, 70, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(K_CREATE);
			setState(555);
			match(K_TABLE);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(556);
				match(K_IF);
				setState(557);
				match(K_NOT);
				setState(558);
				match(K_EXISTS);
				}
			}

			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(561);
				database_name();
				setState(562);
				match(DOT);
				}
				break;
			}
			setState(566);
			table_name();
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(567);
				match(OPEN_PAR);
				setState(568);
				column_def();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(573);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(569);
						match(COMMA);
						setState(570);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(571);
						match(COMMA);
						setState(572);
						column_def();
						}
						break;
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(580);
				match(K_AS);
				setState(581);
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
		enterRule(_localctx, 72, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(K_DELETE);
			setState(585);
			match(K_FROM);
			setState(586);
			qualified_table_name();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(587);
				match(K_WHERE);
				setState(588);
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
		enterRule(_localctx, 74, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(K_DROP);
			setState(592);
			match(K_TABLE);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(593);
				match(K_IF);
				setState(594);
				match(K_EXISTS);
				}
			}

			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(597);
				database_name();
				setState(598);
				match(DOT);
				}
				break;
			}
			setState(602);
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
		enterRule(_localctx, 76, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			select_core();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(605);
				match(K_ORDER);
				setState(606);
				match(K_BY);
				setState(607);
				ordering_term();
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(608);
					match(COMMA);
					setState(609);
					ordering_term();
					}
					}
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(617);
				match(K_LIMIT);
				setState(618);
				expr(0);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(619);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(620);
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
		enterRule(_localctx, 78, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(K_INSERT);
			setState(626);
			match(K_INTO);
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(627);
				database_name();
				setState(628);
				match(DOT);
				}
				break;
			}
			setState(632);
			table_name();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(633);
				match(OPEN_PAR);
				setState(634);
				column_name();
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(635);
					match(COMMA);
					setState(636);
					column_name();
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(642);
				match(CLOSE_PAR);
				}
			}

			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(646);
				match(K_VALUES);
				setState(647);
				match(OPEN_PAR);
				setState(648);
				expr(0);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(649);
					match(COMMA);
					setState(650);
					expr(0);
					}
					}
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(656);
				match(CLOSE_PAR);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(657);
					match(COMMA);
					setState(658);
					match(OPEN_PAR);
					setState(659);
					expr(0);
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(660);
						match(COMMA);
						setState(661);
						expr(0);
						}
						}
						setState(666);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(667);
					match(CLOSE_PAR);
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(674);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(675);
				match(K_DEFAULT);
				setState(676);
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
		enterRule(_localctx, 80, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			select_or_values();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(680);
				match(K_ORDER);
				setState(681);
				match(K_BY);
				setState(682);
				ordering_term();
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(683);
					match(COMMA);
					setState(684);
					ordering_term();
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(692);
				match(K_LIMIT);
				setState(693);
				expr(0);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(694);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(695);
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
		enterRule(_localctx, 82, RULE_select_or_values);
		int _la;
		try {
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(K_SELECT);
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(701);
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

				setState(704);
				result_column();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(705);
					match(COMMA);
					setState(706);
					result_column();
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(712);
					match(K_FROM);
					setState(722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(713);
						table_or_subquery();
						setState(718);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(714);
							match(COMMA);
							setState(715);
							table_or_subquery();
							}
							}
							setState(720);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(721);
						join_clause();
						}
						break;
					}
					}
				}

				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(726);
					match(K_WHERE);
					setState(727);
					expr(0);
					}
				}

				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(730);
					match(K_GROUP);
					setState(731);
					match(K_BY);
					setState(732);
					expr(0);
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(733);
						match(COMMA);
						setState(734);
						expr(0);
						}
						}
						setState(739);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(740);
						match(K_HAVING);
						setState(741);
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
				setState(746);
				match(K_VALUES);
				setState(747);
				match(OPEN_PAR);
				setState(748);
				expr(0);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(749);
					match(COMMA);
					setState(750);
					expr(0);
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756);
				match(CLOSE_PAR);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(757);
					match(COMMA);
					setState(758);
					match(OPEN_PAR);
					setState(759);
					expr(0);
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(760);
						match(COMMA);
						setState(761);
						expr(0);
						}
						}
						setState(766);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(767);
					match(CLOSE_PAR);
					}
					}
					setState(773);
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
		enterRule(_localctx, 84, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(K_UPDATE);
			setState(777);
			qualified_table_name();
			setState(778);
			match(K_SET);
			setState(779);
			column_name();
			setState(780);
			match(ASSIGN);
			setState(781);
			expr(0);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(782);
				match(COMMA);
				setState(783);
				column_name();
				setState(784);
				match(ASSIGN);
				setState(785);
				expr(0);
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(792);
				match(K_WHERE);
				setState(793);
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
		enterRule(_localctx, 86, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			column_name();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (OPEN_PAR - 22)) | (1L << (K_CHECK - 22)) | (1L << (K_COLLATE - 22)) | (1L << (K_CONSTRAINT - 22)) | (1L << (K_DEFAULT - 22)))) != 0) || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (K_NOT - 127)) | (1L << (K_NULL - 127)) | (1L << (K_PRIMARY - 127)) | (1L << (K_REFERENCES - 127)) | (1L << (K_UNIQUE - 127)) | (1L << (IDENTIFIER - 127)) | (1L << (STRING_LITERAL - 127)))) != 0)) {
				{
				setState(799);
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
					setState(797);
					column_constraint();
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(798);
					type_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(803);
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
		enterRule(_localctx, 88, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			name();
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(805);
				match(OPEN_PAR);
				setState(806);
				signed_number();
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(807);
					any_name();
					}
				}

				setState(810);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(812);
				match(OPEN_PAR);
				setState(813);
				signed_number();
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(814);
					any_name();
					}
				}

				setState(817);
				match(COMMA);
				setState(818);
				signed_number();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(819);
					any_name();
					}
				}

				setState(822);
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
		enterRule(_localctx, 90, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(826);
				match(K_CONSTRAINT);
				setState(827);
				name();
				}
			}

			setState(843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(830);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(831);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(832);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(833);
				column_constraint_null();
				}
				break;
			case K_UNIQUE:
				{
				setState(834);
				match(K_UNIQUE);
				}
				break;
			case K_CHECK:
				{
				setState(835);
				match(K_CHECK);
				setState(836);
				match(OPEN_PAR);
				setState(837);
				expr(0);
				setState(838);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(840);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(841);
				match(K_COLLATE);
				setState(842);
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
		enterRule(_localctx, 92, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(K_PRIMARY);
			setState(846);
			match(K_KEY);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(847);
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

			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(850);
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
		enterRule(_localctx, 94, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
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
		enterRule(_localctx, 96, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(K_NOT);
			setState(856);
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
		enterRule(_localctx, 98, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
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
		enterRule(_localctx, 100, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(K_DEFAULT);
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(861);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(862);
				match(OPEN_PAR);
				setState(863);
				expr(0);
				setState(864);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(866);
				match(K_NEXTVAL);
				setState(867);
				match(OPEN_PAR);
				setState(868);
				expr(0);
				setState(869);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(871);
				any_name();
				}
				break;
			}
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(874);
				match(T__18);
				setState(876); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(875);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(878); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 102, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(882);
				signed_number();
				}
				break;
			case 2:
				{
				setState(883);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(887);
				literal_value();
				}
				break;
			case 2:
				{
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(891);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						setState(888);
						database_name();
						setState(889);
						match(DOT);
						}
						break;
					}
					setState(893);
					table_name();
					setState(894);
					match(DOT);
					}
					break;
				}
				setState(898);
				column_name();
				}
				break;
			case 3:
				{
				setState(899);
				unary_operator();
				setState(900);
				expr(13);
				}
				break;
			case 4:
				{
				setState(902);
				function_name();
				setState(903);
				match(OPEN_PAR);
				setState(916);
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
					setState(905);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(904);
						match(K_DISTINCT);
						}
					}

					setState(907);
					expr(0);
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(908);
						match(COMMA);
						setState(909);
						expr(0);
						}
						}
						setState(914);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(915);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(918);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(920);
				match(OPEN_PAR);
				setState(921);
				expr(0);
				setState(922);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(924);
						match(K_NOT);
						}
					}

					setState(927);
					match(K_EXISTS);
					}
				}

				setState(930);
				match(OPEN_PAR);
				setState(931);
				select_stmt();
				setState(932);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(999);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(936);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(937);
						match(PIPE2);
						setState(938);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(939);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(940);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(941);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(942);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(943);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(944);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(945);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(946);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(947);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(948);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(949);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(950);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(951);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(964);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
						case 1:
							{
							setState(952);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(953);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(954);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(955);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(956);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(957);
							match(K_IS);
							setState(958);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(959);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(960);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(961);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(962);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(963);
							match(K_REGEXP);
							}
							break;
						}
						setState(966);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(967);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(968);
						match(K_AND);
						setState(969);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(970);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(971);
						match(K_OR);
						setState(972);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(973);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(975);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(974);
							match(K_NOT);
							}
						}

						setState(977);
						match(K_IN);
						setState(997);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
						case 1:
							{
							setState(978);
							match(OPEN_PAR);
							setState(988);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(979);
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
								setState(980);
								expr(0);
								setState(985);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(981);
									match(COMMA);
									setState(982);
									expr(0);
									}
									}
									setState(987);
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
							setState(990);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(994);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
							case 1:
								{
								setState(991);
								database_name();
								setState(992);
								match(DOT);
								}
								break;
							}
							setState(996);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		enterRule(_localctx, 106, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(K_REFERENCES);
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1005);
				database_name();
				setState(1006);
				match(DOT);
				}
				break;
			}
			setState(1010);
			foreign_table();
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1011);
				match(OPEN_PAR);
				setState(1012);
				fk_target_column_name();
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1013);
					match(COMMA);
					setState(1014);
					fk_target_column_name();
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1038);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1024);
					match(K_ON);
					setState(1025);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1034);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(1026);
						match(K_SET);
						setState(1027);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1028);
						match(K_SET);
						setState(1029);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1030);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1031);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1032);
						match(K_NO);
						setState(1033);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1036);
					match(K_MATCH);
					setState(1037);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1045);
					match(K_NOT);
					}
				}

				setState(1048);
				match(K_DEFERRABLE);
				setState(1053);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1049);
					match(K_INITIALLY);
					setState(1050);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1051);
					match(K_INITIALLY);
					setState(1052);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1055);
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
		enterRule(_localctx, 108, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
		enterRule(_localctx, 110, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			column_name();
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1063);
				match(K_COLLATE);
				setState(1064);
				collation_name();
				}
			}

			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1067);
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
		enterRule(_localctx, 112, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1070);
				match(K_CONSTRAINT);
				setState(1071);
				name();
				}
			}

			setState(1083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1074);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1075);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1076);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1077);
				match(K_CHECK);
				setState(1078);
				match(OPEN_PAR);
				setState(1079);
				expr(0);
				setState(1080);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1082);
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
		enterRule(_localctx, 114, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(K_PRIMARY);
			setState(1086);
			match(K_KEY);
			setState(1087);
			match(OPEN_PAR);
			setState(1088);
			indexed_column();
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1089);
				match(COMMA);
				setState(1090);
				indexed_column();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1096);
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
		enterRule(_localctx, 116, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(K_FOREIGN);
			setState(1099);
			match(K_KEY);
			setState(1100);
			match(OPEN_PAR);
			setState(1101);
			fk_origin_column_name();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1102);
				match(COMMA);
				setState(1103);
				fk_origin_column_name();
				}
				}
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1109);
			match(CLOSE_PAR);
			setState(1110);
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
		enterRule(_localctx, 118, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(K_UNIQUE);
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1113);
				match(K_KEY);
				}
			}

			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1116);
				name();
				}
				break;
			}
			setState(1119);
			match(OPEN_PAR);
			setState(1120);
			indexed_column();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1121);
				match(COMMA);
				setState(1122);
				indexed_column();
				}
				}
				setState(1127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1128);
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
		enterRule(_localctx, 120, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(K_KEY);
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1131);
				name();
				}
				break;
			}
			setState(1134);
			match(OPEN_PAR);
			setState(1135);
			indexed_column();
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1136);
				match(COMMA);
				setState(1137);
				indexed_column();
				}
				}
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1143);
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
		enterRule(_localctx, 122, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
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
		enterRule(_localctx, 124, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1147);
				database_name();
				setState(1148);
				match(DOT);
				}
				break;
			}
			setState(1152);
			table_name();
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1153);
				match(K_INDEXED);
				setState(1154);
				match(K_BY);
				setState(1155);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1156);
				match(K_NOT);
				setState(1157);
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
		enterRule(_localctx, 126, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			expr(0);
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1161);
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
		enterRule(_localctx, 128, RULE_pragma_value);
		try {
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
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
		enterRule(_localctx, 130, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			table_name();
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1170);
				match(OPEN_PAR);
				setState(1171);
				column_name();
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1172);
					match(COMMA);
					setState(1173);
					column_name();
					}
					}
					setState(1178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1179);
				match(CLOSE_PAR);
				}
			}

			setState(1183);
			match(K_AS);
			setState(1184);
			match(OPEN_PAR);
			setState(1185);
			select_stmt();
			setState(1186);
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
		enterRule(_localctx, 132, RULE_result_column);
		int _la;
		try {
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1189);
				table_name();
				setState(1190);
				match(DOT);
				setState(1191);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1193);
				expr(0);
				setState(1198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1194);
						match(K_AS);
						}
					}

					setState(1197);
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
		enterRule(_localctx, 134, RULE_table_or_subquery);
		int _la;
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1202);
					database_name();
					setState(1203);
					match(DOT);
					}
					break;
				}
				setState(1207);
				table_name();
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(1209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1208);
						match(K_AS);
						}
					}

					setState(1211);
					table_alias();
					}
				}

				setState(1219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1214);
					match(K_INDEXED);
					setState(1215);
					match(K_BY);
					setState(1216);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1217);
					match(K_NOT);
					setState(1218);
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
				setState(1221);
				match(OPEN_PAR);
				setState(1231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1222);
					table_or_subquery();
					setState(1227);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1223);
						match(COMMA);
						setState(1224);
						table_or_subquery();
						}
						}
						setState(1229);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1230);
					join_clause();
					}
					break;
				}
				setState(1233);
				match(CLOSE_PAR);
				setState(1238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(1235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1234);
						match(K_AS);
						}
					}

					setState(1237);
					table_alias();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1240);
				match(OPEN_PAR);
				setState(1241);
				select_stmt();
				setState(1242);
				match(CLOSE_PAR);
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(1244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1243);
						match(K_AS);
						}
					}

					setState(1246);
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
		enterRule(_localctx, 136, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			table_or_subquery();
			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (K_INNER - 111)) | (1L << (K_JOIN - 111)) | (1L << (K_LEFT - 111)))) != 0)) {
				{
				{
				setState(1252);
				join_operator();
				setState(1253);
				table_or_subquery();
				setState(1254);
				join_constraint();
				}
				}
				setState(1260);
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
		enterRule(_localctx, 138, RULE_join_operator);
		int _la;
		try {
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1262);
					match(K_LEFT);
					setState(1264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1263);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1266);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1269);
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
		enterRule(_localctx, 140, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1272);
				match(K_ON);
				setState(1273);
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
		enterRule(_localctx, 142, RULE_select_core);
		int _la;
		try {
			setState(1350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1276);
				match(K_SELECT);
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1277);
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

				setState(1280);
				result_column();
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1281);
					match(COMMA);
					setState(1282);
					result_column();
					}
					}
					setState(1287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1288);
					match(K_FROM);
					setState(1298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
					case 1:
						{
						setState(1289);
						table_or_subquery();
						setState(1294);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1290);
							match(COMMA);
							setState(1291);
							table_or_subquery();
							}
							}
							setState(1296);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1297);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1302);
					match(K_WHERE);
					setState(1303);
					expr(0);
					}
				}

				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1306);
					match(K_GROUP);
					setState(1307);
					match(K_BY);
					setState(1308);
					expr(0);
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1309);
						match(COMMA);
						setState(1310);
						expr(0);
						}
						}
						setState(1315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1316);
						match(K_HAVING);
						setState(1317);
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
				setState(1322);
				match(K_VALUES);
				setState(1323);
				match(OPEN_PAR);
				setState(1324);
				expr(0);
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1325);
					match(COMMA);
					setState(1326);
					expr(0);
					}
					}
					setState(1331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1332);
				match(CLOSE_PAR);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1333);
					match(COMMA);
					setState(1334);
					match(OPEN_PAR);
					setState(1335);
					expr(0);
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1336);
						match(COMMA);
						setState(1337);
						expr(0);
						}
						}
						setState(1342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1343);
					match(CLOSE_PAR);
					}
					}
					setState(1349);
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
		enterRule(_localctx, 144, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			table_name();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1353);
				match(OPEN_PAR);
				setState(1354);
				column_name();
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1355);
					match(COMMA);
					setState(1356);
					column_name();
					}
					}
					setState(1361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1362);
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
		enterRule(_localctx, 146, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1366);
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

				setState(1369);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1370);
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
		enterRule(_localctx, 148, RULE_literal_value);
		try {
			setState(1384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1375);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1376);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(1377);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1378);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1379);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(1380);
				match(OPEN_PAR);
				setState(1381);
				literal_value();
				setState(1382);
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
		enterRule(_localctx, 150, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
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
		enterRule(_localctx, 152, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
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
		enterRule(_localctx, 154, RULE_module_argument);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
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
		enterRule(_localctx, 156, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
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
		enterRule(_localctx, 158, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1398);
				matchWildcard();
				}
				}
				setState(1401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BREAK) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DO - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)) | (1L << (SINGLE_LINE_COMMENT - 128)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 128)) | (1L << (MULTILINE_COMMENT - 128)) | (1L << (SPACES - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
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
		enterRule(_localctx, 164, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
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
		enterRule(_localctx, 166, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
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
		enterRule(_localctx, 168, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
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
		enterRule(_localctx, 170, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
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
		enterRule(_localctx, 172, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
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
		enterRule(_localctx, 174, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
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
		enterRule(_localctx, 176, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
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
		enterRule(_localctx, 178, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
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
		enterRule(_localctx, 180, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
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
		enterRule(_localctx, 182, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
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
		enterRule(_localctx, 184, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
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
		enterRule(_localctx, 186, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
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
		enterRule(_localctx, 188, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
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
		enterRule(_localctx, 190, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
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
		enterRule(_localctx, 192, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
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
		enterRule(_localctx, 194, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
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
		enterRule(_localctx, 196, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
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
		enterRule(_localctx, 198, RULE_method_ID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
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
		enterRule(_localctx, 200, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
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
		enterRule(_localctx, 202, RULE_any_name);
		try {
			setState(1449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1444);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1445);
				match(OPEN_PAR);
				setState(1446);
				any_name();
				setState(1447);
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
			return non_boolean_expression_sempred((Non_boolean_expressionContext)_localctx, predIndex);
		case 18:
			return boolean_exprk_sempred((Boolean_exprkContext)_localctx, predIndex);
		case 52:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean non_boolean_expression_sempred(Non_boolean_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolean_exprk_sempred(Boolean_exprkContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c1\u05ae\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\7\2\u00d1\n\2\f"+
		"\2\16\2\u00d4\13\2\3\2\3\2\5\2\u00d8\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u00e3\n\4\3\5\3\5\5\5\u00e7\n\5\3\5\3\5\3\5\7\5\u00ec\n\5\f"+
		"\5\16\5\u00ef\13\5\3\6\3\6\5\6\u00f3\n\6\3\6\3\6\3\6\5\6\u00f8\n\6\7\6"+
		"\u00fa\n\6\f\6\16\6\u00fd\13\6\3\7\3\7\3\7\5\7\u0102\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\5\b\u0109\n\b\3\b\3\b\3\t\5\t\u010e\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\7\n\u0118\n\n\f\n\16\n\u011b\13\n\3\n\5\n\u011e\n\n\3\n\3\n\3"+
		"\13\3\13\5\13\u0124\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u013b\n\f\f\f\16\f\u013e\13"+
		"\f\3\f\5\f\u0141\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0149\n\r\3\16\3\16\5"+
		"\16\u014d\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0154\n\17\5\17\u0156\n\17"+
		"\3\20\3\20\3\20\3\20\5\20\u015c\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\5\22\u0166\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016e\n\23\3"+
		"\23\3\23\3\23\7\23\u0173\n\23\f\23\16\23\u0176\13\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0180\n\24\3\24\3\24\3\24\7\24\u0185\n\24"+
		"\f\24\16\24\u0188\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0194\n\25\3\26\3\26\3\27\6\27\u0199\n\27\r\27\16\27\u019a\3"+
		"\27\7\27\u019e\n\27\f\27\16\27\u01a1\13\27\3\27\5\27\u01a4\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u01ac\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u01b5\n\31\3\32\3\32\3\32\5\32\u01ba\n\32\3\33\3\33\3\33\3"+
		"\33\5\33\u01c0\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u01cd\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01d6\n"+
		"\35\3\36\3\36\3\36\5\36\u01db\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\5\37\u01e6\n\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01ee\n"+
		"\37\3 \7 \u01f1\n \f \16 \u01f4\13 \3 \3 \6 \u01f8\n \r \16 \u01f9\3 "+
		"\7 \u01fd\n \f \16 \u0200\13 \3 \7 \u0203\n \f \16 \u0206\13 \3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u020f\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0216\n\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u0220\n\"\3\"\5\"\u0223\n\"\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0232\n%\3%\3%\3%\5%\u0237\n%\3%\3%\3%\3%"+
		"\3%\3%\3%\7%\u0240\n%\f%\16%\u0243\13%\3%\3%\3%\3%\5%\u0249\n%\3&\3&\3"+
		"&\3&\3&\5&\u0250\n&\3\'\3\'\3\'\3\'\5\'\u0256\n\'\3\'\3\'\3\'\5\'\u025b"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\7(\u0265\n(\f(\16(\u0268\13(\5(\u026a\n"+
		"(\3(\3(\3(\3(\5(\u0270\n(\5(\u0272\n(\3)\3)\3)\3)\3)\5)\u0279\n)\3)\3"+
		")\3)\3)\3)\7)\u0280\n)\f)\16)\u0283\13)\3)\3)\5)\u0287\n)\3)\3)\3)\3)"+
		"\3)\7)\u028e\n)\f)\16)\u0291\13)\3)\3)\3)\3)\3)\3)\7)\u0299\n)\f)\16)"+
		"\u029c\13)\3)\3)\7)\u02a0\n)\f)\16)\u02a3\13)\3)\3)\3)\5)\u02a8\n)\3*"+
		"\3*\3*\3*\3*\3*\7*\u02b0\n*\f*\16*\u02b3\13*\5*\u02b5\n*\3*\3*\3*\3*\5"+
		"*\u02bb\n*\5*\u02bd\n*\3+\3+\5+\u02c1\n+\3+\3+\3+\7+\u02c6\n+\f+\16+\u02c9"+
		"\13+\3+\3+\3+\3+\7+\u02cf\n+\f+\16+\u02d2\13+\3+\5+\u02d5\n+\5+\u02d7"+
		"\n+\3+\3+\5+\u02db\n+\3+\3+\3+\3+\3+\7+\u02e2\n+\f+\16+\u02e5\13+\3+\3"+
		"+\5+\u02e9\n+\5+\u02eb\n+\3+\3+\3+\3+\3+\7+\u02f2\n+\f+\16+\u02f5\13+"+
		"\3+\3+\3+\3+\3+\3+\7+\u02fd\n+\f+\16+\u0300\13+\3+\3+\7+\u0304\n+\f+\16"+
		"+\u0307\13+\5+\u0309\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0316\n,\f"+
		",\16,\u0319\13,\3,\3,\5,\u031d\n,\3-\3-\3-\7-\u0322\n-\f-\16-\u0325\13"+
		"-\3.\3.\3.\3.\5.\u032b\n.\3.\3.\3.\3.\3.\5.\u0332\n.\3.\3.\3.\5.\u0337"+
		"\n.\3.\3.\5.\u033b\n.\3/\3/\5/\u033f\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\5/\u034e\n/\3\60\3\60\3\60\5\60\u0353\n\60\3\60\5\60\u0356\n"+
		"\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\5\64\u036b\n\64\3\64\3\64\6\64\u036f\n\64"+
		"\r\64\16\64\u0370\5\64\u0373\n\64\3\65\3\65\5\65\u0377\n\65\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u037e\n\66\3\66\3\66\3\66\5\66\u0383\n\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\5\66\u038c\n\66\3\66\3\66\3\66\7\66\u0391"+
		"\n\66\f\66\16\66\u0394\13\66\3\66\5\66\u0397\n\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u03a0\n\66\3\66\5\66\u03a3\n\66\3\66\3\66\3\66\3"+
		"\66\5\66\u03a9\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u03c7\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u03d2\n\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u03da\n"+
		"\66\f\66\16\66\u03dd\13\66\5\66\u03df\n\66\3\66\3\66\3\66\3\66\5\66\u03e5"+
		"\n\66\3\66\5\66\u03e8\n\66\7\66\u03ea\n\66\f\66\16\66\u03ed\13\66\3\67"+
		"\3\67\3\67\3\67\5\67\u03f3\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u03fa\n"+
		"\67\f\67\16\67\u03fd\13\67\3\67\3\67\5\67\u0401\n\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u040d\n\67\3\67\3\67\5\67\u0411"+
		"\n\67\7\67\u0413\n\67\f\67\16\67\u0416\13\67\3\67\5\67\u0419\n\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u0420\n\67\3\67\5\67\u0423\n\67\5\67\u0425\n"+
		"\67\38\38\39\39\39\59\u042c\n9\39\59\u042f\n9\3:\3:\5:\u0433\n:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\5:\u043e\n:\3;\3;\3;\3;\3;\3;\7;\u0446\n;\f;\16"+
		";\u0449\13;\3;\3;\3<\3<\3<\3<\3<\3<\7<\u0453\n<\f<\16<\u0456\13<\3<\3"+
		"<\3<\3=\3=\5=\u045d\n=\3=\5=\u0460\n=\3=\3=\3=\3=\7=\u0466\n=\f=\16=\u0469"+
		"\13=\3=\3=\3>\3>\5>\u046f\n>\3>\3>\3>\3>\7>\u0475\n>\f>\16>\u0478\13>"+
		"\3>\3>\3?\3?\3@\3@\3@\5@\u0481\n@\3@\3@\3@\3@\3@\3@\5@\u0489\n@\3A\3A"+
		"\5A\u048d\nA\3B\3B\3B\5B\u0492\nB\3C\3C\3C\3C\3C\7C\u0499\nC\fC\16C\u049c"+
		"\13C\3C\3C\5C\u04a0\nC\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\5D\u04ae\n"+
		"D\3D\5D\u04b1\nD\5D\u04b3\nD\3E\3E\3E\5E\u04b8\nE\3E\3E\5E\u04bc\nE\3"+
		"E\5E\u04bf\nE\3E\3E\3E\3E\3E\5E\u04c6\nE\3E\3E\3E\3E\7E\u04cc\nE\fE\16"+
		"E\u04cf\13E\3E\5E\u04d2\nE\3E\3E\5E\u04d6\nE\3E\5E\u04d9\nE\3E\3E\3E\3"+
		"E\5E\u04df\nE\3E\5E\u04e2\nE\5E\u04e4\nE\3F\3F\3F\3F\3F\7F\u04eb\nF\f"+
		"F\16F\u04ee\13F\3G\3G\3G\5G\u04f3\nG\3G\5G\u04f6\nG\3G\5G\u04f9\nG\3H"+
		"\3H\5H\u04fd\nH\3I\3I\5I\u0501\nI\3I\3I\3I\7I\u0506\nI\fI\16I\u0509\13"+
		"I\3I\3I\3I\3I\7I\u050f\nI\fI\16I\u0512\13I\3I\5I\u0515\nI\5I\u0517\nI"+
		"\3I\3I\5I\u051b\nI\3I\3I\3I\3I\3I\7I\u0522\nI\fI\16I\u0525\13I\3I\3I\5"+
		"I\u0529\nI\5I\u052b\nI\3I\3I\3I\3I\3I\7I\u0532\nI\fI\16I\u0535\13I\3I"+
		"\3I\3I\3I\3I\3I\7I\u053d\nI\fI\16I\u0540\13I\3I\3I\7I\u0544\nI\fI\16I"+
		"\u0547\13I\5I\u0549\nI\3J\3J\3J\3J\3J\7J\u0550\nJ\fJ\16J\u0553\13J\3J"+
		"\3J\5J\u0557\nJ\3K\5K\u055a\nK\3K\3K\5K\u055e\nK\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\5L\u056b\nL\3M\3M\3N\3N\3O\3O\5O\u0573\nO\3P\3P\3Q\3Q\3R"+
		"\6R\u057a\nR\rR\16R\u057b\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3"+
		"Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e"+
		"\3e\3f\3f\3g\3g\3g\3g\3g\3g\5g\u05ac\ng\3g\2\5$&jh\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\2\21\4\2\34\36!$\3\2\'-\4\2\7\7  \4\2\n\23\33"+
		"\33\4\2\32\32\u0085\u0085\4\2\62\62UU\4\2\67\67SS\4\2\34\34!\"\3\2\35"+
		"\36\3\2#&\3\2\'*\4\2RR\u00aa\u00aa\4\2\35\37\u0081\u0081\4\2\u00b8\u00b8"+
		"\u00bb\u00bb\r\2.<>GIUWeg\u0086\u0088\u008d\u008f\u0098\u009a\u009f\u00a1"+
		"\u00af\u00b1\u00b2\u00b4\u00b5\2\u064b\2\u00d7\3\2\2\2\4\u00d9\3\2\2\2"+
		"\6\u00e2\3\2\2\2\b\u00e6\3\2\2\2\n\u00f2\3\2\2\2\f\u00fe\3\2\2\2\16\u0105"+
		"\3\2\2\2\20\u010d\3\2\2\2\22\u0115\3\2\2\2\24\u0123\3\2\2\2\26\u0140\3"+
		"\2\2\2\30\u0148\3\2\2\2\32\u014c\3\2\2\2\34\u014e\3\2\2\2\36\u0157\3\2"+
		"\2\2 \u015d\3\2\2\2\"\u0165\3\2\2\2$\u016d\3\2\2\2&\u017f\3\2\2\2(\u0193"+
		"\3\2\2\2*\u0195\3\2\2\2,\u0198\3\2\2\2.\u01a5\3\2\2\2\60\u01ad\3\2\2\2"+
		"\62\u01b6\3\2\2\2\64\u01bf\3\2\2\2\66\u01c1\3\2\2\28\u01ce\3\2\2\2:\u01d7"+
		"\3\2\2\2<\u01e2\3\2\2\2>\u01f2\3\2\2\2@\u020e\3\2\2\2B\u0210\3\2\2\2D"+
		"\u0224\3\2\2\2F\u0229\3\2\2\2H\u022c\3\2\2\2J\u024a\3\2\2\2L\u0251\3\2"+
		"\2\2N\u025e\3\2\2\2P\u0273\3\2\2\2R\u02a9\3\2\2\2T\u0308\3\2\2\2V\u030a"+
		"\3\2\2\2X\u031e\3\2\2\2Z\u0326\3\2\2\2\\\u033e\3\2\2\2^\u034f\3\2\2\2"+
		"`\u0357\3\2\2\2b\u0359\3\2\2\2d\u035c\3\2\2\2f\u035e\3\2\2\2h\u0376\3"+
		"\2\2\2j\u03a8\3\2\2\2l\u03ee\3\2\2\2n\u0426\3\2\2\2p\u0428\3\2\2\2r\u0432"+
		"\3\2\2\2t\u043f\3\2\2\2v\u044c\3\2\2\2x\u045a\3\2\2\2z\u046c\3\2\2\2|"+
		"\u047b\3\2\2\2~\u0480\3\2\2\2\u0080\u048a\3\2\2\2\u0082\u0491\3\2\2\2"+
		"\u0084\u0493\3\2\2\2\u0086\u04b2\3\2\2\2\u0088\u04e3\3\2\2\2\u008a\u04e5"+
		"\3\2\2\2\u008c\u04f8\3\2\2\2\u008e\u04fc\3\2\2\2\u0090\u0548\3\2\2\2\u0092"+
		"\u054a\3\2\2\2\u0094\u055d\3\2\2\2\u0096\u056a\3\2\2\2\u0098\u056c\3\2"+
		"\2\2\u009a\u056e\3\2\2\2\u009c\u0572\3\2\2\2\u009e\u0574\3\2\2\2\u00a0"+
		"\u0576\3\2\2\2\u00a2\u0579\3\2\2\2\u00a4\u057d\3\2\2\2\u00a6\u057f\3\2"+
		"\2\2\u00a8\u0581\3\2\2\2\u00aa\u0583\3\2\2\2\u00ac\u0585\3\2\2\2\u00ae"+
		"\u0587\3\2\2\2\u00b0\u0589\3\2\2\2\u00b2\u058b\3\2\2\2\u00b4\u058d\3\2"+
		"\2\2\u00b6\u058f\3\2\2\2\u00b8\u0591\3\2\2\2\u00ba\u0593\3\2\2\2\u00bc"+
		"\u0595\3\2\2\2\u00be\u0597\3\2\2\2\u00c0\u0599\3\2\2\2\u00c2\u059b\3\2"+
		"\2\2\u00c4\u059d\3\2\2\2\u00c6\u059f\3\2\2\2\u00c8\u05a1\3\2\2\2\u00ca"+
		"\u05a3\3\2\2\2\u00cc\u05ab\3\2\2\2\u00ce\u00d1\5> \2\u00cf\u00d1\5\4\3"+
		"\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\7\2\2\3\u00d6\u00d8\5\6\4\2\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\3\3\2\2\2\u00d9\u00da\7\u00c1\2\2\u00da\u00db\b\3\1\2\u00db"+
		"\5\3\2\2\2\u00dc\u00dd\5\20\t\2\u00dd\u00de\7\26\2\2\u00de\u00e3\3\2\2"+
		"\2\u00df\u00e0\5\f\7\2\u00e0\u00e1\7\26\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00dc\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\7\3\2\2\2\u00e4\u00e5\7\u00b0"+
		"\2\2\u00e5\u00e7\5\u00ccg\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00ed\3\2\2\2\u00e8\u00e9\7\32\2\2\u00e9\u00ea\7\u00b0\2\2\u00ea\u00ec"+
		"\5\u00ccg\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2"+
		"\2\u00ed\u00ee\3\2\2\2\u00ee\t\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3"+
		"\5\u00ccg\2\u00f1\u00f3\5\u0096L\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fb\3\2\2\2\u00f4\u00f7\7\32\2\2\u00f5"+
		"\u00f8\5\u00ccg\2\u00f6\u00f8\5\u0096L\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f4\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\13\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fe\u00ff\5\u00c8e\2\u00ff\u0101\7\30\2\2\u0100\u0102\5\n\6\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\31"+
		"\2\2\u0104\r\3\2\2\2\u0105\u0108\7\u0099\2\2\u0106\u0109\5$\23\2\u0107"+
		"\u0109\5&\24\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\26\2\2\u010b\17\3\2\2\2\u010c\u010e"+
		"\7f\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\5\u00c8e\2\u0110\u0111\7\30\2\2\u0111\u0112\5\b\5\2\u0112\u0113"+
		"\7\31\2\2\u0113\u0114\5\22\n\2\u0114\21\3\2\2\2\u0115\u0119\7\3\2\2\u0116"+
		"\u0118\5\26\f\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011e\5\16\b\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3"+
		"\2\2\2\u011f\u0120\7\4\2\2\u0120\23\3\2\2\2\u0121\u0124\5\26\f\2\u0122"+
		"\u0124\5\16\b\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\25\3\2\2"+
		"\2\u0125\u0141\5,\27\2\u0126\u0141\5\30\r\2\u0127\u0128\5\f\7\2\u0128"+
		"\u0129\7\26\2\2\u0129\u0141\3\2\2\2\u012a\u0141\5\64\33\2\u012b\u012c"+
		"\5(\25\2\u012c\u012d\7\26\2\2\u012d\u0141\3\2\2\2\u012e\u012f\5\34\17"+
		"\2\u012f\u0130\7\26\2\2\u0130\u0141\3\2\2\2\u0131\u0132\5\36\20\2\u0132"+
		"\u0133\7\26\2\2\u0133\u0141\3\2\2\2\u0134\u0135\7=\2\2\u0135\u0141\7\26"+
		"\2\2\u0136\u0137\7H\2\2\u0137\u0141\7\26\2\2\u0138\u013c\7\3\2\2\u0139"+
		"\u013b\5\26\f\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0141\7\4\2\2\u0140\u0125\3\2\2\2\u0140\u0126\3\2\2\2\u0140\u0127\3\2"+
		"\2\2\u0140\u012a\3\2\2\2\u0140\u012b\3\2\2\2\u0140\u012e\3\2\2\2\u0140"+
		"\u0131\3\2\2\2\u0140\u0134\3\2\2\2\u0140\u0136\3\2\2\2\u0140\u0138\3\2"+
		"\2\2\u0141\27\3\2\2\2\u0142\u0149\7\u00be\2\2\u0143\u0149\7\u00bf\2\2"+
		"\u0144\u0145\7\3\2\2\u0145\u0146\5\26\f\2\u0146\u0147\7\4\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0149"+
		"\31\3\2\2\2\u014a\u014d\5\u00ccg\2\u014b\u014d\5 \21\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014b\3\2\2\2\u014d\33\3\2\2\2\u014e\u014f\7\u00b0\2\2\u014f"+
		"\u0155\5\u00ccg\2\u0150\u0153\7\33\2\2\u0151\u0154\5$\23\2\u0152\u0154"+
		"\5&\24\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0155\u0156\3\2\2\2\u0156\35\3\2\2\2\u0157\u0158\5\32\16"+
		"\2\u0158\u015b\5*\26\2\u0159\u015c\5$\23\2\u015a\u015c\5&\24\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015a\3\2\2\2\u015c\37\3\2\2\2\u015d\u015e\5\u00caf\2\u015e"+
		"\u015f\7\5\2\2\u015f\u0160\5\"\22\2\u0160\u0161\7\6\2\2\u0161!\3\2\2\2"+
		"\u0162\u0166\5\32\16\2\u0163\u0166\5\f\7\2\u0164\u0166\5\u0096L\2\u0165"+
		"\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166#\3\2\2\2"+
		"\u0167\u0168\b\23\1\2\u0168\u016e\5\"\22\2\u0169\u016a\7\30\2\2\u016a"+
		"\u016b\5$\23\2\u016b\u016c\7\31\2\2\u016c\u016e\3\2\2\2\u016d\u0167\3"+
		"\2\2\2\u016d\u0169\3\2\2\2\u016e\u0174\3\2\2\2\u016f\u0170\f\4\2\2\u0170"+
		"\u0171\t\2\2\2\u0171\u0173\5$\23\5\u0172\u016f\3\2\2\2\u0173\u0176\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175%\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u0178\b\24\1\2\u0178\u0180\5\"\22\2\u0179\u017a\5$\23\2"+
		"\u017a\u017b\t\3\2\2\u017b\u017c\5$\23\2\u017c\u0180\3\2\2\2\u017d\u0180"+
		"\7\u00b6\2\2\u017e\u0180\7\u00b7\2\2\u017f\u0177\3\2\2\2\u017f\u0179\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0186\3\2\2\2\u0181"+
		"\u0182\f\3\2\2\u0182\u0183\t\4\2\2\u0183\u0185\5&\24\4\u0184\u0181\3\2"+
		"\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\'\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\5\32\16\2\u018a\u018b\7\b\2"+
		"\2\u018b\u0194\3\2\2\2\u018c\u018d\7\b\2\2\u018d\u0194\5\32\16\2\u018e"+
		"\u018f\5\32\16\2\u018f\u0190\7\t\2\2\u0190\u0194\3\2\2\2\u0191\u0192\7"+
		"\t\2\2\u0192\u0194\5\32\16\2\u0193\u0189\3\2\2\2\u0193\u018c\3\2\2\2\u0193"+
		"\u018e\3\2\2\2\u0193\u0191\3\2\2\2\u0194)\3\2\2\2\u0195\u0196\t\5\2\2"+
		"\u0196+\3\2\2\2\u0197\u0199\5.\30\2\u0198\u0197\3\2\2\2\u0199\u019a\3"+
		"\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019f\3\2\2\2\u019c"+
		"\u019e\5\60\31\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a4\5\62\32\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4-\3\2\2"+
		"\2\u01a5\u01a6\7j\2\2\u01a6\u01a7\7\30\2\2\u01a7\u01a8\5&\24\2\u01a8\u01ab"+
		"\7\31\2\2\u01a9\u01ac\5\22\n\2\u01aa\u01ac\5\24\13\2\u01ab\u01a9\3\2\2"+
		"\2\u01ab\u01aa\3\2\2\2\u01ac/\3\2\2\2\u01ad\u01ae\7Y\2\2\u01ae\u01af\7"+
		"j\2\2\u01af\u01b0\7\30\2\2\u01b0\u01b1\5&\24\2\u01b1\u01b4\7\31\2\2\u01b2"+
		"\u01b5\5\22\n\2\u01b3\u01b5\5\24\13\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3"+
		"\3\2\2\2\u01b5\61\3\2\2\2\u01b6\u01b9\7Y\2\2\u01b7\u01ba\5\22\n\2\u01b8"+
		"\u01ba\5\24\13\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\63\3\2"+
		"\2\2\u01bb\u01c0\5\66\34\2\u01bc\u01c0\58\35\2\u01bd\u01c0\5:\36\2\u01be"+
		"\u01c0\5<\37\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01be\3\2\2\2\u01c0\65\3\2\2\2\u01c1\u01c2\7b\2\2\u01c2\u01c3"+
		"\7\30\2\2\u01c3\u01c4\5\34\17\2\u01c4\u01c5\7\26\2\2\u01c5\u01c6\5&\24"+
		"\2\u01c6\u01c7\7\26\2\2\u01c7\u01c8\5(\25\2\u01c8\u01c9\7\31\2\2\u01c9"+
		"\u01cc\3\2\2\2\u01ca\u01cd\5\22\n\2\u01cb\u01cd\5\24\13\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\67\3\2\2\2\u01ce\u01cf\7\u00b3\2\2"+
		"\u01cf\u01d0\7\30\2\2\u01d0\u01d1\5&\24\2\u01d1\u01d2\7\31\2\2\u01d2\u01d5"+
		"\3\2\2\2\u01d3\u01d6\5\22\n\2\u01d4\u01d6\5\24\13\2\u01d5\u01d3\3\2\2"+
		"\2\u01d5\u01d4\3\2\2\2\u01d69\3\2\2\2\u01d7\u01da\7V\2\2\u01d8\u01db\5"+
		"\22\n\2\u01d9\u01db\5\24\13\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2"+
		"\u01db\u01dc\3\2\2\2\u01dc\u01dd\7\u00b3\2\2\u01dd\u01de\7\30\2\2\u01de"+
		"\u01df\5&\24\2\u01df\u01e0\7\31\2\2\u01e0\u01e1\7\26\2\2\u01e1;\3\2\2"+
		"\2\u01e2\u01e3\7b\2\2\u01e3\u01e5\7\30\2\2\u01e4\u01e6\7\u00b0\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5\32"+
		"\16\2\u01e8\u01e9\7\24\2\2\u01e9\u01ea\5\u00caf\2\u01ea\u01ed\7\31\2\2"+
		"\u01eb\u01ee\5\22\n\2\u01ec\u01ee\5\24\13\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee=\3\2\2\2\u01ef\u01f1\7\26\2\2\u01f0\u01ef\3\2\2\2"+
		"\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01fe\5@!\2\u01f6\u01f8\7\26\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\5@!\2\u01fc\u01f7\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0204\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0203\7\26\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3"+
		"\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205?\3\2\2\2\u0206\u0204"+
		"\3\2\2\2\u0207\u020f\5B\"\2\u0208\u020f\5H%\2\u0209\u020f\5J&\2\u020a"+
		"\u020f\5L\'\2\u020b\u020f\5N(\2\u020c\u020f\5P)\2\u020d\u020f\5V,\2\u020e"+
		"\u0207\3\2\2\2\u020e\u0208\3\2\2\2\u020e\u0209\3\2\2\2\u020e\u020a\3\2"+
		"\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f"+
		"A\3\2\2\2\u0210\u0211\7\63\2\2\u0211\u0215\7\u00a1\2\2\u0212\u0213\5\u00a8"+
		"U\2\u0213\u0214\7\27\2\2\u0214\u0216\3\2\2\2\u0215\u0212\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0222\5\u00aaV\2\u0218\u0219"+
		"\7\u0096\2\2\u0219\u021a\7\u00a5\2\2\u021a\u0223\5\u00b0Y\2\u021b\u0223"+
		"\5F$\2\u021c\u0223\5D#\2\u021d\u021f\7\60\2\2\u021e\u0220\7D\2\2\u021f"+
		"\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\5X"+
		"-\2\u0222\u0218\3\2\2\2\u0222\u021b\3\2\2\2\u0222\u021c\3\2\2\2\u0222"+
		"\u021d\3\2\2\2\u0223C\3\2\2\2\u0224\u0225\7\60\2\2\u0225\u0226\7G\2\2"+
		"\u0226\u0227\5\u00ccg\2\u0227\u0228\5r:\2\u0228E\3\2\2\2\u0229\u022a\7"+
		"\60\2\2\u022a\u022b\5r:\2\u022bG\3\2\2\2\u022c\u022d\7I\2\2\u022d\u0231"+
		"\7\u00a1\2\2\u022e\u022f\7j\2\2\u022f\u0230\7\u0081\2\2\u0230\u0232\7"+
		"_\2\2\u0231\u022e\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0236\3\2\2\2\u0233"+
		"\u0234\5\u00a8U\2\u0234\u0235\7\27\2\2\u0235\u0237\3\2\2\2\u0236\u0233"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0248\5\u00acW"+
		"\2\u0239\u023a\7\30\2\2\u023a\u0241\5X-\2\u023b\u023c\7\32\2\2\u023c\u0240"+
		"\5r:\2\u023d\u023e\7\32\2\2\u023e\u0240\5X-\2\u023f\u023b\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\7\31\2\2\u0245"+
		"\u0249\3\2\2\2\u0246\u0247\7\66\2\2\u0247\u0249\5R*\2\u0248\u0239\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0249I\3\2\2\2\u024a\u024b\7R\2\2\u024b\u024c"+
		"\7d\2\2\u024c\u024f\5~@\2\u024d\u024e\7\u00b2\2\2\u024e\u0250\5j\66\2"+
		"\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250K\3\2\2\2\u0251\u0252\7"+
		"W\2\2\u0252\u0255\7\u00a1\2\2\u0253\u0254\7j\2\2\u0254\u0256\7_\2\2\u0255"+
		"\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025a\3\2\2\2\u0257\u0258\5\u00a8"+
		"U\2\u0258\u0259\7\27\2\2\u0259\u025b\3\2\2\2\u025a\u0257\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\5\u00acW\2\u025dM\3\2\2"+
		"\2\u025e\u0269\5\u0090I\2\u025f\u0260\7\u0089\2\2\u0260\u0261\7>\2\2\u0261"+
		"\u0266\5\u0080A\2\u0262\u0263\7\32\2\2\u0263\u0265\5\u0080A\2\u0264\u0262"+
		"\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u025f\3\2\2\2\u0269\u026a\3\2"+
		"\2\2\u026a\u0271\3\2\2\2\u026b\u026c\7|\2\2\u026c\u026f\5j\66\2\u026d"+
		"\u026e\t\6\2\2\u026e\u0270\5j\66\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u0272\3\2\2\2\u0271\u026b\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"O\3\2\2\2\u0273\u0274\7r\2\2\u0274\u0278\7u\2\2\u0275\u0276\5\u00a8U\2"+
		"\u0276\u0277\7\27\2\2\u0277\u0279\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0286\5\u00acW\2\u027b\u027c\7\30\2"+
		"\2\u027c\u0281\5\u00b2Z\2\u027d\u027e\7\32\2\2\u027e\u0280\5\u00b2Z\2"+
		"\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u0284\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\7\31\2\2"+
		"\u0285\u0287\3\2\2\2\u0286\u027b\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u02a7"+
		"\3\2\2\2\u0288\u0289\7\u00ad\2\2\u0289\u028a\7\30\2\2\u028a\u028f\5j\66"+
		"\2\u028b\u028c\7\32\2\2\u028c\u028e\5j\66\2\u028d\u028b\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0292\u02a1\7\31\2\2\u0293\u0294\7\32\2\2\u0294"+
		"\u0295\7\30\2\2\u0295\u029a\5j\66\2\u0296\u0297\7\32\2\2\u0297\u0299\5"+
		"j\66\2\u0298\u0296\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\7\31"+
		"\2\2\u029e\u02a0\3\2\2\2\u029f\u0293\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a8\3\2\2\2\u02a3\u02a1\3\2"+
		"\2\2\u02a4\u02a8\5R*\2\u02a5\u02a6\7O\2\2\u02a6\u02a8\7\u00ad\2\2\u02a7"+
		"\u0288\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8Q\3\2\2\2"+
		"\u02a9\u02b4\5T+\2\u02aa\u02ab\7\u0089\2\2\u02ab\u02ac\7>\2\2\u02ac\u02b1"+
		"\5\u0080A\2\u02ad\u02ae\7\32\2\2\u02ae\u02b0\5\u0080A\2\u02af\u02ad\3"+
		"\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02aa\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02bc\3\2\2\2\u02b6\u02b7\7|\2\2\u02b7\u02ba\5j\66\2\u02b8"+
		"\u02b9\t\6\2\2\u02b9\u02bb\5j\66\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02b6\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"S\3\2\2\2\u02be\u02c0\7\u009e\2\2\u02bf\u02c1\t\7\2\2\u02c0\u02bf\3\2"+
		"\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c7\5\u0086D\2\u02c3"+
		"\u02c4\7\32\2\2\u02c4\u02c6\5\u0086D\2\u02c5\u02c3\3\2\2\2\u02c6\u02c9"+
		"\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02d6\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02ca\u02d4\7d\2\2\u02cb\u02d0\5\u0088E\2\u02cc\u02cd\7"+
		"\32\2\2\u02cd\u02cf\5\u0088E\2\u02ce\u02cc\3\2\2\2\u02cf\u02d2\3\2\2\2"+
		"\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d5\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d3\u02d5\5\u008aF\2\u02d4\u02cb\3\2\2\2\u02d4\u02d3\3\2\2"+
		"\2\u02d5\u02d7\3\2\2\2\u02d6\u02ca\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02da"+
		"\3\2\2\2\u02d8\u02d9\7\u00b2\2\2\u02d9\u02db\5j\66\2\u02da\u02d8\3\2\2"+
		"\2\u02da\u02db\3\2\2\2\u02db\u02ea\3\2\2\2\u02dc\u02dd\7h\2\2\u02dd\u02de"+
		"\7>\2\2\u02de\u02e3\5j\66\2\u02df\u02e0\7\32\2\2\u02e0\u02e2\5j\66\2\u02e1"+
		"\u02df\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4\u02e8\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7i\2\2\u02e7"+
		"\u02e9\5j\66\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2"+
		"\2\2\u02ea\u02dc\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0309\3\2\2\2\u02ec"+
		"\u02ed\7\u00ad\2\2\u02ed\u02ee\7\30\2\2\u02ee\u02f3\5j\66\2\u02ef\u02f0"+
		"\7\32\2\2\u02f0\u02f2\5j\66\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3\2\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f3"+
		"\3\2\2\2\u02f6\u0305\7\31\2\2\u02f7\u02f8\7\32\2\2\u02f8\u02f9\7\30\2"+
		"\2\u02f9\u02fe\5j\66\2\u02fa\u02fb\7\32\2\2\u02fb\u02fd\5j\66\2\u02fc"+
		"\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2"+
		"\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0302\7\31\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u02f7\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0308"+
		"\u02be\3\2\2\2\u0308\u02ec\3\2\2\2\u0309U\3\2\2\2\u030a\u030b\7\u00aa"+
		"\2\2\u030b\u030c\5~@\2\u030c\u030d\7\u009f\2\2\u030d\u030e\5\u00b2Z\2"+
		"\u030e\u030f\7\33\2\2\u030f\u0317\5j\66\2\u0310\u0311\7\32\2\2\u0311\u0312"+
		"\5\u00b2Z\2\u0312\u0313\7\33\2\2\u0313\u0314\5j\66\2\u0314\u0316\3\2\2"+
		"\2\u0315\u0310\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u031c\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031b\7\u00b2\2"+
		"\2\u031b\u031d\5j\66\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031dW"+
		"\3\2\2\2\u031e\u0323\5\u00b2Z\2\u031f\u0322\5\\/\2\u0320\u0322\5Z.\2\u0321"+
		"\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0323\u0324\3\2\2\2\u0324Y\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u033a"+
		"\5\u00a4S\2\u0327\u0328\7\30\2\2\u0328\u032a\5\u0094K\2\u0329\u032b\5"+
		"\u00ccg\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2"+
		"\u032c\u032d\7\31\2\2\u032d\u033b\3\2\2\2\u032e\u032f\7\30\2\2\u032f\u0331"+
		"\5\u0094K\2\u0330\u0332\5\u00ccg\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u0334\7\32\2\2\u0334\u0336\5\u0094K\2\u0335"+
		"\u0337\5\u00ccg\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338"+
		"\3\2\2\2\u0338\u0339\7\31\2\2\u0339\u033b\3\2\2\2\u033a\u0327\3\2\2\2"+
		"\u033a\u032e\3\2\2\2\u033a\u033b\3\2\2\2\u033b[\3\2\2\2\u033c\u033d\7"+
		"G\2\2\u033d\u033f\5\u00a4S\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u034d\3\2\2\2\u0340\u034e\5^\60\2\u0341\u034e\5`\61\2\u0342\u034e\5b"+
		"\62\2\u0343\u034e\5d\63\2\u0344\u034e\7\u00a9\2\2\u0345\u0346\7B\2\2\u0346"+
		"\u0347\7\30\2\2\u0347\u0348\5j\66\2\u0348\u0349\7\31\2\2\u0349\u034e\3"+
		"\2\2\2\u034a\u034e\5f\64\2\u034b\u034c\7C\2\2\u034c\u034e\5\u00b4[\2\u034d"+
		"\u0340\3\2\2\2\u034d\u0341\3\2\2\2\u034d\u0342\3\2\2\2\u034d\u0343\3\2"+
		"\2\2\u034d\u0344\3\2\2\2\u034d\u0345\3\2\2\2\u034d\u034a\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034e]\3\2\2\2\u034f\u0350\7\u008d\2\2\u0350\u0352\7y\2"+
		"\2\u0351\u0353\t\b\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355"+
		"\3\2\2\2\u0354\u0356\79\2\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356"+
		"_\3\2\2\2\u0357\u0358\5l\67\2\u0358a\3\2\2\2\u0359\u035a\7\u0081\2\2\u035a"+
		"\u035b\7\u0083\2\2\u035bc\3\2\2\2\u035c\u035d\7\u0083\2\2\u035de\3\2\2"+
		"\2\u035e\u036a\7O\2\2\u035f\u036b\5h\65\2\u0360\u0361\7\30\2\2\u0361\u0362"+
		"\5j\66\2\u0362\u0363\7\31\2\2\u0363\u036b\3\2\2\2\u0364\u0365\7\177\2"+
		"\2\u0365\u0366\7\30\2\2\u0366\u0367\5j\66\2\u0367\u0368\7\31\2\2\u0368"+
		"\u036b\3\2\2\2\u0369\u036b\5\u00ccg\2\u036a\u035f\3\2\2\2\u036a\u0360"+
		"\3\2\2\2\u036a\u0364\3\2\2\2\u036a\u0369\3\2\2\2\u036b\u0372\3\2\2\2\u036c"+
		"\u036e\7\25\2\2\u036d\u036f\5\u00ccg\2\u036e\u036d\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372"+
		"\u036c\3\2\2\2\u0372\u0373\3\2\2\2\u0373g\3\2\2\2\u0374\u0377\5\u0094"+
		"K\2\u0375\u0377\5\u0096L\2\u0376\u0374\3\2\2\2\u0376\u0375\3\2\2\2\u0377"+
		"i\3\2\2\2\u0378\u0379\b\66\1\2\u0379\u03a9\5\u0096L\2\u037a\u037b\5\u00a8"+
		"U\2\u037b\u037c\7\27\2\2\u037c\u037e\3\2\2\2\u037d\u037a\3\2\2\2\u037d"+
		"\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\5\u00acW\2\u0380\u0381"+
		"\7\27\2\2\u0381\u0383\3\2\2\2\u0382\u037d\3\2\2\2\u0382\u0383\3\2\2\2"+
		"\u0383\u0384\3\2\2\2\u0384\u03a9\5\u00b2Z\2\u0385\u0386\5\u0098M\2\u0386"+
		"\u0387\5j\66\17\u0387\u03a9\3\2\2\2\u0388\u0389\5\u00a6T\2\u0389\u0396"+
		"\7\30\2\2\u038a\u038c\7U\2\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u0392\5j\66\2\u038e\u038f\7\32\2\2\u038f\u0391\5"+
		"j\66\2\u0390\u038e\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0397\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0397\7\34"+
		"\2\2\u0396\u038b\3\2\2\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398\u0399\7\31\2\2\u0399\u03a9\3\2\2\2\u039a\u039b\7"+
		"\30\2\2\u039b\u039c\5j\66\2\u039c\u039d\7\31\2\2\u039d\u03a9\3\2\2\2\u039e"+
		"\u03a0\7\u0081\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1"+
		"\3\2\2\2\u03a1\u03a3\7_\2\2\u03a2\u039f\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a5\7\30\2\2\u03a5\u03a6\5R*\2\u03a6\u03a7\7\31"+
		"\2\2\u03a7\u03a9\3\2\2\2\u03a8\u0378\3\2\2\2\u03a8\u0382\3\2\2\2\u03a8"+
		"\u0385\3\2\2\2\u03a8\u0388\3\2\2\2\u03a8\u039a\3\2\2\2\u03a8\u03a2\3\2"+
		"\2\2\u03a9\u03eb\3\2\2\2\u03aa\u03ab\f\16\2\2\u03ab\u03ac\7 \2\2\u03ac"+
		"\u03ea\5j\66\17\u03ad\u03ae\f\r\2\2\u03ae\u03af\t\t\2\2\u03af\u03ea\5"+
		"j\66\16\u03b0\u03b1\f\f\2\2\u03b1\u03b2\t\n\2\2\u03b2\u03ea\5j\66\r\u03b3"+
		"\u03b4\f\13\2\2\u03b4\u03b5\t\13\2\2\u03b5\u03ea\5j\66\f\u03b6\u03b7\f"+
		"\n\2\2\u03b7\u03b8\t\f\2\2\u03b8\u03ea\5j\66\13\u03b9\u03c6\f\t\2\2\u03ba"+
		"\u03c7\7\33\2\2\u03bb\u03c7\7+\2\2\u03bc\u03c7\7,\2\2\u03bd\u03c7\7-\2"+
		"\2\u03be\u03c7\7v\2\2\u03bf\u03c0\7v\2\2\u03c0\u03c7\7\u0081\2\2\u03c1"+
		"\u03c7\7m\2\2\u03c2\u03c7\7{\2\2\u03c3\u03c7\7g\2\2\u03c4\u03c7\7}\2\2"+
		"\u03c5\u03c7\7\u0093\2\2\u03c6\u03ba\3\2\2\2\u03c6\u03bb\3\2\2\2\u03c6"+
		"\u03bc\3\2\2\2\u03c6\u03bd\3\2\2\2\u03c6\u03be\3\2\2\2\u03c6\u03bf\3\2"+
		"\2\2\u03c6\u03c1\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ea\5j"+
		"\66\n\u03c9\u03ca\f\b\2\2\u03ca\u03cb\7\65\2\2\u03cb\u03ea\5j\66\t\u03cc"+
		"\u03cd\f\7\2\2\u03cd\u03ce\7\u0088\2\2\u03ce\u03ea\5j\66\b\u03cf\u03d1"+
		"\f\4\2\2\u03d0\u03d2\7\u0081\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2"+
		"\2\u03d2\u03d3\3\2\2\2\u03d3\u03e7\7m\2\2\u03d4\u03de\7\30\2\2\u03d5\u03df"+
		"\5R*\2\u03d6\u03db\5j\66\2\u03d7\u03d8\7\32\2\2\u03d8\u03da\5j\66\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03d5\3\2\2\2\u03de"+
		"\u03d6\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e8\7\31"+
		"\2\2\u03e1\u03e2\5\u00a8U\2\u03e2\u03e3\7\27\2\2\u03e3\u03e5\3\2\2\2\u03e4"+
		"\u03e1\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e8\5\u00ac"+
		"W\2\u03e7\u03d4\3\2\2\2\u03e7\u03e4\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9"+
		"\u03aa\3\2\2\2\u03e9\u03ad\3\2\2\2\u03e9\u03b0\3\2\2\2\u03e9\u03b3\3\2"+
		"\2\2\u03e9\u03b6\3\2\2\2\u03e9\u03b9\3\2\2\2\u03e9\u03c9\3\2\2\2\u03e9"+
		"\u03cc\3\2\2\2\u03e9\u03cf\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2"+
		"\2\2\u03eb\u03ec\3\2\2\2\u03eck\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03f2"+
		"\7\u0092\2\2\u03ef\u03f0\5\u00a8U\2\u03f0\u03f1\7\27\2\2\u03f1\u03f3\3"+
		"\2\2\2\u03f2\u03ef\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u0400\5\u00b6\\\2\u03f5\u03f6\7\30\2\2\u03f6\u03fb\5n8\2\u03f7\u03f8"+
		"\7\32\2\2\u03f8\u03fa\5n8\2\u03f9\u03f7\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb"+
		"\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03fb\3\2"+
		"\2\2\u03fe\u03ff\7\31\2\2\u03ff\u0401\3\2\2\2\u0400\u03f5\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0414\3\2\2\2\u0402\u0403\7\u0086\2\2\u0403\u040c"+
		"\t\r\2\2\u0404\u0405\7\u009f\2\2\u0405\u040d\7\u0083\2\2\u0406\u0407\7"+
		"\u009f\2\2\u0407\u040d\7O\2\2\u0408\u040d\7?\2\2\u0409\u040d\7\u0098\2"+
		"\2\u040a\u040b\7\u0080\2\2\u040b\u040d\7/\2\2\u040c\u0404\3\2\2\2\u040c"+
		"\u0406\3\2\2\2\u040c\u0408\3\2\2\2\u040c\u0409\3\2\2\2\u040c\u040a\3\2"+
		"\2\2\u040d\u0411\3\2\2\2\u040e\u040f\7}\2\2\u040f\u0411\5\u00a4S\2\u0410"+
		"\u0402\3\2\2\2\u0410\u040e\3\2\2\2\u0411\u0413\3\2\2\2\u0412\u0410\3\2"+
		"\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0424\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0419\7\u0081\2\2\u0418\u0417"+
		"\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041f\7P\2\2\u041b"+
		"\u041c\7p\2\2\u041c\u0420\7Q\2\2\u041d\u041e\7p\2\2\u041e\u0420\7l\2\2"+
		"\u041f\u041b\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422"+
		"\3\2\2\2\u0421\u0423\7[\2\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0425\3\2\2\2\u0424\u0418\3\2\2\2\u0424\u0425\3\2\2\2\u0425m\3\2\2\2"+
		"\u0426\u0427\5\u00a4S\2\u0427o\3\2\2\2\u0428\u042b\5\u00b2Z\2\u0429\u042a"+
		"\7C\2\2\u042a\u042c\5\u00b4[\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2"+
		"\u042c\u042e\3\2\2\2\u042d\u042f\t\b\2\2\u042e\u042d\3\2\2\2\u042e\u042f"+
		"\3\2\2\2\u042fq\3\2\2\2\u0430\u0431\7G\2\2\u0431\u0433\5\u00a4S\2\u0432"+
		"\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u043d\3\2\2\2\u0434\u043e\5t"+
		";\2\u0435\u043e\5z>\2\u0436\u043e\5x=\2\u0437\u0438\7B\2\2\u0438\u0439"+
		"\7\30\2\2\u0439\u043a\5j\66\2\u043a\u043b\7\31\2\2\u043b\u043e\3\2\2\2"+
		"\u043c\u043e\5v<\2\u043d\u0434\3\2\2\2\u043d\u0435\3\2\2\2\u043d\u0436"+
		"\3\2\2\2\u043d\u0437\3\2\2\2\u043d\u043c\3\2\2\2\u043es\3\2\2\2\u043f"+
		"\u0440\7\u008d\2\2\u0440\u0441\7y\2\2\u0441\u0442\7\30\2\2\u0442\u0447"+
		"\5p9\2\u0443\u0444\7\32\2\2\u0444\u0446\5p9\2\u0445\u0443\3\2\2\2\u0446"+
		"\u0449\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2"+
		"\2\2\u0449\u0447\3\2\2\2\u044a\u044b\7\31\2\2\u044bu\3\2\2\2\u044c\u044d"+
		"\7c\2\2\u044d\u044e\7y\2\2\u044e\u044f\7\30\2\2\u044f\u0454\5|?\2\u0450"+
		"\u0451\7\32\2\2\u0451\u0453\5|?\2\u0452\u0450\3\2\2\2\u0453\u0456\3\2"+
		"\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0457\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0457\u0458\7\31\2\2\u0458\u0459\5l\67\2\u0459w\3\2\2\2"+
		"\u045a\u045c\7\u00a9\2\2\u045b\u045d\7y\2\2\u045c\u045b\3\2\2\2\u045c"+
		"\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u0460\5\u00a4S\2\u045f\u045e"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\7\30\2\2"+
		"\u0462\u0467\5p9\2\u0463\u0464\7\32\2\2\u0464\u0466\5p9\2\u0465\u0463"+
		"\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u046a\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046b\7\31\2\2\u046by\3\2\2\2"+
		"\u046c\u046e\7y\2\2\u046d\u046f\5\u00a4S\2\u046e\u046d\3\2\2\2\u046e\u046f"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\7\30\2\2\u0471\u0476\5p9\2\u0472"+
		"\u0473\7\32\2\2\u0473\u0475\5p9\2\u0474\u0472\3\2\2\2\u0475\u0478\3\2"+
		"\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478"+
		"\u0476\3\2\2\2\u0479\u047a\7\31\2\2\u047a{\3\2\2\2\u047b\u047c\5\u00b2"+
		"Z\2\u047c}\3\2\2\2\u047d\u047e\5\u00a8U\2\u047e\u047f\7\27\2\2\u047f\u0481"+
		"\3\2\2\2\u0480\u047d\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482"+
		"\u0488\5\u00acW\2\u0483\u0484\7o\2\2\u0484\u0485\7>\2\2\u0485\u0489\5"+
		"\u00b8]\2\u0486\u0487\7\u0081\2\2\u0487\u0489\7o\2\2\u0488\u0483\3\2\2"+
		"\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489\177\3\2\2\2\u048a\u048c"+
		"\5j\66\2\u048b\u048d\t\b\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u0081\3\2\2\2\u048e\u0492\5\u0094K\2\u048f\u0492\5\u00a4S\2\u0490\u0492"+
		"\7\u00bb\2\2\u0491\u048e\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0490\3\2\2"+
		"\2\u0492\u0083\3\2\2\2\u0493\u049f\5\u00acW\2\u0494\u0495\7\30\2\2\u0495"+
		"\u049a\5\u00b2Z\2\u0496\u0497\7\32\2\2\u0497\u0499\5\u00b2Z\2\u0498\u0496"+
		"\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u049d\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u049e\7\31\2\2\u049e\u04a0\3"+
		"\2\2\2\u049f\u0494\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a2\7\66\2\2\u04a2\u04a3\7\30\2\2\u04a3\u04a4\5R*\2\u04a4\u04a5\7\31"+
		"\2\2\u04a5\u0085\3\2\2\2\u04a6\u04b3\7\34\2\2\u04a7\u04a8\5\u00acW\2\u04a8"+
		"\u04a9\7\27\2\2\u04a9\u04aa\7\34\2\2\u04aa\u04b3\3\2\2\2\u04ab\u04b0\5"+
		"j\66\2\u04ac\u04ae\7\66\2\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b1\5\u009eP\2\u04b0\u04ad\3\2\2\2\u04b0\u04b1"+
		"\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04a6\3\2\2\2\u04b2\u04a7\3\2\2\2\u04b2"+
		"\u04ab\3\2\2\2\u04b3\u0087\3\2\2\2\u04b4\u04b5\5\u00a8U\2\u04b5\u04b6"+
		"\7\27\2\2\u04b6\u04b8\3\2\2\2\u04b7\u04b4\3\2\2\2\u04b7\u04b8\3\2\2\2"+
		"\u04b8\u04b9\3\2\2\2\u04b9\u04be\5\u00acW\2\u04ba\u04bc\7\66\2\2\u04bb"+
		"\u04ba\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04bf\5\u00c4"+
		"c\2\u04be\u04bb\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c5\3\2\2\2\u04c0"+
		"\u04c1\7o\2\2\u04c1\u04c2\7>\2\2\u04c2\u04c6\5\u00b8]\2\u04c3\u04c4\7"+
		"\u0081\2\2\u04c4\u04c6\7o\2\2\u04c5\u04c0\3\2\2\2\u04c5\u04c3\3\2\2\2"+
		"\u04c5\u04c6\3\2\2\2\u04c6\u04e4\3\2\2\2\u04c7\u04d1\7\30\2\2\u04c8\u04cd"+
		"\5\u0088E\2\u04c9\u04ca\7\32\2\2\u04ca\u04cc\5\u0088E\2\u04cb\u04c9\3"+
		"\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04d2\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d2\5\u008aF\2\u04d1\u04c8"+
		"\3\2\2\2\u04d1\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d8\7\31\2\2"+
		"\u04d4\u04d6\7\66\2\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7"+
		"\3\2\2\2\u04d7\u04d9\5\u00c4c\2\u04d8\u04d5\3\2\2\2\u04d8\u04d9\3\2\2"+
		"\2\u04d9\u04e4\3\2\2\2\u04da\u04db\7\30\2\2\u04db\u04dc\5R*\2\u04dc\u04e1"+
		"\7\31\2\2\u04dd\u04df\7\66\2\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2"+
		"\u04df\u04e0\3\2\2\2\u04e0\u04e2\5\u00c4c\2\u04e1\u04de\3\2\2\2\u04e1"+
		"\u04e2\3\2\2\2\u04e2\u04e4\3\2\2\2\u04e3\u04b7\3\2\2\2\u04e3\u04c7\3\2"+
		"\2\2\u04e3\u04da\3\2\2\2\u04e4\u0089\3\2\2\2\u04e5\u04ec\5\u0088E\2\u04e6"+
		"\u04e7\5\u008cG\2\u04e7\u04e8\5\u0088E\2\u04e8\u04e9\5\u008eH\2\u04e9"+
		"\u04eb\3\2\2\2\u04ea\u04e6\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2"+
		"\2\2\u04ec\u04ed\3\2\2\2\u04ed\u008b\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef"+
		"\u04f9\7\32\2\2\u04f0\u04f2\7z\2\2\u04f1\u04f3\7\u008a\2\2\u04f2\u04f1"+
		"\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4\u04f6\7q\2\2\u04f5"+
		"\u04f0\3\2\2\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2"+
		"\2\2\u04f7\u04f9\7x\2\2\u04f8\u04ef\3\2\2\2\u04f8\u04f5\3\2\2\2\u04f9"+
		"\u008d\3\2\2\2\u04fa\u04fb\7\u0086\2\2\u04fb\u04fd\5j\66\2\u04fc\u04fa"+
		"\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u008f\3\2\2\2\u04fe\u0500\7\u009e\2"+
		"\2\u04ff\u0501\t\7\2\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502"+
		"\3\2\2\2\u0502\u0507\5\u0086D\2\u0503\u0504\7\32\2\2\u0504\u0506\5\u0086"+
		"D\2\u0505\u0503\3\2\2\2\u0506\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u0516\3\2\2\2\u0509\u0507\3\2\2\2\u050a\u0514\7d"+
		"\2\2\u050b\u0510\5\u0088E\2\u050c\u050d\7\32\2\2\u050d\u050f\5\u0088E"+
		"\2\u050e\u050c\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511"+
		"\3\2\2\2\u0511\u0515\3\2\2\2\u0512\u0510\3\2\2\2\u0513\u0515\5\u008aF"+
		"\2\u0514\u050b\3\2\2\2\u0514\u0513\3\2\2\2\u0515\u0517\3\2\2\2\u0516\u050a"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u051a\3\2\2\2\u0518\u0519\7\u00b2\2"+
		"\2\u0519\u051b\5j\66\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u052a"+
		"\3\2\2\2\u051c\u051d\7h\2\2\u051d\u051e\7>\2\2\u051e\u0523\5j\66\2\u051f"+
		"\u0520\7\32\2\2\u0520\u0522\5j\66\2\u0521\u051f\3\2\2\2\u0522\u0525\3"+
		"\2\2\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0528\3\2\2\2\u0525"+
		"\u0523\3\2\2\2\u0526\u0527\7i\2\2\u0527\u0529\5j\66\2\u0528\u0526\3\2"+
		"\2\2\u0528\u0529\3\2\2\2\u0529\u052b\3\2\2\2\u052a\u051c\3\2\2\2\u052a"+
		"\u052b\3\2\2\2\u052b\u0549\3\2\2\2\u052c\u052d\7\u00ad\2\2\u052d\u052e"+
		"\7\30\2\2\u052e\u0533\5j\66\2\u052f\u0530\7\32\2\2\u0530\u0532\5j\66\2"+
		"\u0531\u052f\3\2\2\2\u0532\u0535\3\2\2\2\u0533\u0531\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0536\3\2\2\2\u0535\u0533\3\2\2\2\u0536\u0545\7\31\2\2"+
		"\u0537\u0538\7\32\2\2\u0538\u0539\7\30\2\2\u0539\u053e\5j\66\2\u053a\u053b"+
		"\7\32\2\2\u053b\u053d\5j\66\2\u053c\u053a\3\2\2\2\u053d\u0540\3\2\2\2"+
		"\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u053e"+
		"\3\2\2\2\u0541\u0542\7\31\2\2\u0542\u0544\3\2\2\2\u0543\u0537\3\2\2\2"+
		"\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0549"+
		"\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u04fe\3\2\2\2\u0548\u052c\3\2\2\2\u0549"+
		"\u0091\3\2\2\2\u054a\u0556\5\u00acW\2\u054b\u054c\7\30\2\2\u054c\u0551"+
		"\5\u00b2Z\2\u054d\u054e\7\32\2\2\u054e\u0550\5\u00b2Z\2\u054f\u054d\3"+
		"\2\2\2\u0550\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552"+
		"\u0554\3\2\2\2\u0553\u0551\3\2\2\2\u0554\u0555\7\31\2\2\u0555\u0557\3"+
		"\2\2\2\u0556\u054b\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0093\3\2\2\2\u0558"+
		"\u055a\t\n\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2"+
		"\2\2\u055b\u055e\7\u00b9\2\2\u055c\u055e\7\34\2\2\u055d\u0559\3\2\2\2"+
		"\u055d\u055c\3\2\2\2\u055e\u0095\3\2\2\2\u055f\u056b\7\u00b9\2\2\u0560"+
		"\u056b\7\u00bb\2\2\u0561\u056b\7\u00bc\2\2\u0562\u056b\7\u0083\2\2\u0563"+
		"\u056b\7L\2\2\u0564\u056b\7K\2\2\u0565\u056b\7M\2\2\u0566\u0567\7\30\2"+
		"\2\u0567\u0568\5\u0096L\2\u0568\u0569\7\31\2\2\u0569\u056b\3\2\2\2\u056a"+
		"\u055f\3\2\2\2\u056a\u0560\3\2\2\2\u056a\u0561\3\2\2\2\u056a\u0562\3\2"+
		"\2\2\u056a\u0563\3\2\2\2\u056a\u0564\3\2\2\2\u056a\u0565\3\2\2\2\u056a"+
		"\u0566\3\2\2\2\u056b\u0097\3\2\2\2\u056c\u056d\t\16\2\2\u056d\u0099\3"+
		"\2\2\2\u056e\u056f\7\u00bb\2\2\u056f\u009b\3\2\2\2\u0570\u0573\5j\66\2"+
		"\u0571\u0573\5X-\2\u0572\u0570\3\2\2\2\u0572\u0571\3\2\2\2\u0573\u009d"+
		"\3\2\2\2\u0574\u0575\t\17\2\2\u0575\u009f\3\2\2\2\u0576\u0577\t\20\2\2"+
		"\u0577\u00a1\3\2\2\2\u0578\u057a\13\2\2\2\u0579\u0578\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u00a3\3\2\2\2\u057d"+
		"\u057e\5\u00ccg\2\u057e\u00a5\3\2\2\2\u057f\u0580\5\u00ccg\2\u0580\u00a7"+
		"\3\2\2\2\u0581\u0582\5\u00ccg\2\u0582\u00a9\3\2\2\2\u0583\u0584\5\u00cc"+
		"g\2\u0584\u00ab\3\2\2\2\u0585\u0586\5\u00ccg\2\u0586\u00ad\3\2\2\2\u0587"+
		"\u0588\5\u00ccg\2\u0588\u00af\3\2\2\2\u0589\u058a\5\u00ccg\2\u058a\u00b1"+
		"\3\2\2\2\u058b\u058c\5\u00ccg\2\u058c\u00b3\3\2\2\2\u058d\u058e\5\u00cc"+
		"g\2\u058e\u00b5\3\2\2\2\u058f\u0590\5\u00ccg\2\u0590\u00b7\3\2\2\2\u0591"+
		"\u0592\5\u00ccg\2\u0592\u00b9\3\2\2\2\u0593\u0594\5\u00ccg\2\u0594\u00bb"+
		"\3\2\2\2\u0595\u0596\5\u00ccg\2\u0596\u00bd\3\2\2\2\u0597\u0598\5\u00cc"+
		"g\2\u0598\u00bf\3\2\2\2\u0599\u059a\5\u00ccg\2\u059a\u00c1\3\2\2\2\u059b"+
		"\u059c\5\u00ccg\2\u059c\u00c3\3\2\2\2\u059d\u059e\7\u00b8\2\2\u059e\u00c5"+
		"\3\2\2\2\u059f\u05a0\5\u00ccg\2\u05a0\u00c7\3\2\2\2\u05a1\u05a2\5\u00cc"+
		"g\2\u05a2\u00c9\3\2\2\2\u05a3\u05a4\5\u00ccg\2\u05a4\u00cb\3\2\2\2\u05a5"+
		"\u05ac\7\u00b8\2\2\u05a6\u05ac\7\u00bb\2\2\u05a7\u05a8\7\30\2\2\u05a8"+
		"\u05a9\5\u00ccg\2\u05a9\u05aa\7\31\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05a5"+
		"\3\2\2\2\u05ab\u05a6\3\2\2\2\u05ab\u05a7\3\2\2\2\u05ac\u00cd\3\2\2\2\u00b9"+
		"\u00d0\u00d2\u00d7\u00e2\u00e6\u00ed\u00f2\u00f7\u00fb\u0101\u0108\u010d"+
		"\u0119\u011d\u0123\u013c\u0140\u0148\u014c\u0153\u0155\u015b\u0165\u016d"+
		"\u0174\u017f\u0186\u0193\u019a\u019f\u01a3\u01ab\u01b4\u01b9\u01bf\u01cc"+
		"\u01d5\u01da\u01e5\u01ed\u01f2\u01f9\u01fe\u0204\u020e\u0215\u021f\u0222"+
		"\u0231\u0236\u023f\u0241\u0248\u024f\u0255\u025a\u0266\u0269\u026f\u0271"+
		"\u0278\u0281\u0286\u028f\u029a\u02a1\u02a7\u02b1\u02b4\u02ba\u02bc\u02c0"+
		"\u02c7\u02d0\u02d4\u02d6\u02da\u02e3\u02e8\u02ea\u02f3\u02fe\u0305\u0308"+
		"\u0317\u031c\u0321\u0323\u032a\u0331\u0336\u033a\u033e\u034d\u0352\u0355"+
		"\u036a\u0370\u0372\u0376\u037d\u0382\u038b\u0392\u0396\u039f\u03a2\u03a8"+
		"\u03c6\u03d1\u03db\u03de\u03e4\u03e7\u03e9\u03eb\u03f2\u03fb\u0400\u040c"+
		"\u0410\u0414\u0418\u041f\u0422\u0424\u042b\u042e\u0432\u043d\u0447\u0454"+
		"\u045c\u045f\u0467\u046e\u0476\u0480\u0488\u048c\u0491\u049a\u049f\u04ad"+
		"\u04b0\u04b2\u04b7\u04bb\u04be\u04c5\u04cd\u04d1\u04d5\u04d8\u04de\u04e1"+
		"\u04e3\u04ec\u04f2\u04f5\u04f8\u04fc\u0500\u0507\u0510\u0514\u0516\u051a"+
		"\u0523\u0528\u052a\u0533\u053e\u0545\u0548\u0551\u0556\u0559\u055d\u056a"+
		"\u0572\u057b\u05ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}