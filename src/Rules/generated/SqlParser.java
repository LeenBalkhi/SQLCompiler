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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		SCOL=25, DOT=26, OPEN_PAR=27, CLOSE_PAR=28, COMMA=29, ASSIGN=30, STAR=31, 
		PLUS=32, MINUS=33, TILDE=34, PIPE2=35, DIV=36, MOD=37, LT2=38, GT2=39, 
		AMP=40, PIPE=41, LT=42, LT_EQ=43, GT=44, GT_EQ=45, EQ=46, NOT_EQ1=47, 
		NOT_EQ2=48, K_ABORT=49, K_ACTION=50, K_ADD=51, K_AFTER=52, K_ALL=53, K_ALTER=54, 
		K_ANALYZE=55, K_AND=56, K_AS=57, K_ASC=58, K_ATTACH=59, K_AUTOINCREMENT=60, 
		K_BEFORE=61, K_BEGIN=62, K_BETWEEN=63, K_BREAK=64, K_BY=65, K_CASCADE=66, 
		K_CASE=67, K_CAST=68, K_CHECK=69, K_COLLATE=70, K_COLUMN=71, K_COMMIT=72, 
		K_CONFLICT=73, K_CONSTRAINT=74, K_CONTINUE=75, K_CREATE=76, K_CROSS=77, 
		K_CURRENT_DATE=78, K_CURRENT_TIME=79, K_CURRENT_TIMESTAMP=80, K_DATABASE=81, 
		K_DEFAULT=82, K_DEFERRABLE=83, K_DEFERRED=84, K_DELETE=85, K_DESC=86, 
		K_DETACH=87, K_DISTINCT=88, K_DO=89, K_DROP=90, K_EACH=91, K_ELSE=92, 
		K_END=93, K_ENABLE=94, K_ESCAPE=95, K_EXCEPT=96, K_EXCLUSIVE=97, K_EXISTS=98, 
		K_EXPLAIN=99, K_FAIL=100, K_FOR=101, K_FOREIGN=102, K_FROM=103, K_FULL=104, 
		K_FUNCTION=105, K_GLOB=106, K_GROUP=107, K_HAVING=108, K_IF=109, K_IGNORE=110, 
		K_IMMEDIATE=111, K_IN=112, K_INDEX=113, K_INDEXED=114, K_INITIALLY=115, 
		K_INNER=116, K_INSERT=117, K_INSTEAD=118, K_INTERSECT=119, K_INTO=120, 
		K_IS=121, K_ISNULL=122, K_JOIN=123, K_KEY=124, K_LEFT=125, K_LIKE=126, 
		K_LIMIT=127, K_MATCH=128, K_NATURAL=129, K_NEXTVAL=130, K_NO=131, K_NOT=132, 
		K_NOTNULL=133, K_NULL=134, K_OF=135, K_OFFSET=136, K_ON=137, K_ONLY=138, 
		K_OR=139, K_ORDER=140, K_OUTER=141, K_PLAN=142, K_PRAGMA=143, K_PRIMARY=144, 
		K_PRINT=145, K_QUERY=146, K_RAISE=147, K_RECURSIVE=148, K_REFERENCES=149, 
		K_REGEXP=150, K_REINDEX=151, K_RELEASE=152, K_RENAME=153, K_REPLACE=154, 
		K_RESTRICT=155, K_RETURN=156, K_RIGHT=157, K_ROLLBACK=158, K_ROW=159, 
		K_SAVEPOINT=160, K_SELECT=161, K_SET=162, K_SWITCH=163, K_TABLE=164, K_TEMP=165, 
		K_TEMPORARY=166, K_THEN=167, K_TO=168, K_TYPE=169, K_TRANSACTION=170, 
		K_TRIGGER=171, K_UNION=172, K_UNIQUE=173, K_UPDATE=174, K_USING=175, K_VACUUM=176, 
		K_VALUES=177, K_VIEW=178, K_VIRTUAL=179, K_VAR=180, K_WHEN=181, K_WHERE=182, 
		K_WHILE=183, K_WITH=184, K_WITHOUT=185, K_TRUE=186, K_FALSE=187, K_CSV=188, 
		K_JSON=189, K_PARQUET=190, K_AGGREGATION=191, IDENTIFIER=192, NUMERIC_LITERAL=193, 
		BIND_PARAMETER=194, STRING_LITERAL=195, BLOB_LITERAL=196, SINGLE_LINE_COMMENT=197, 
		JAVA_SINGLE_LINE_COMMENT=198, MULTILINE_COMMENT=199, SPACES=200, UNEXPECTED_CHAR=201, 
		DISK=202, FILEPATH=203, K_PATH=204;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_java_stmt = 2, RULE_default_parameter = 3, 
		RULE_parameter_list = 4, RULE_argument_list = 5, RULE_java_function_call = 6, 
		RULE_return_stmt = 7, RULE_return_value = 8, RULE_string = 9, RULE_java_function_declaration = 10, 
		RULE_block = 11, RULE_one_line_block = 12, RULE_java_body = 13, RULE_comments = 14, 
		RULE_variable = 15, RULE_variable_declaration = 16, RULE_variable_assignment = 17, 
		RULE_assginment = 18, RULE_variable_assignment_value = 19, RULE_param_array = 20, 
		RULE_create_agg_fun = 21, RULE_element = 22, RULE_print = 23, RULE_value = 24, 
		RULE_expression = 25, RULE_math_expression = 26, RULE_boolean_expression = 27, 
		RULE_logical_condition = 28, RULE_increment = 29, RULE_assignment_operator = 30, 
		RULE_conditional_stmt = 31, RULE_if_stmt = 32, RULE_else_if_stmt = 33, 
		RULE_else_stmt = 34, RULE_loop_stmt = 35, RULE_for_loop = 36, RULE_while_loop = 37, 
		RULE_do_while_loop = 38, RULE_for_each_loop = 39, RULE_switch_stmt = 40, 
		RULE_switch_case = 41, RULE_switch_default = 42, RULE_sql_stmt_list = 43, 
		RULE_sql_stmt = 44, RULE_create_table_stmt = 45, RULE_file = 46, RULE_path = 47, 
		RULE_jar_path = 48, RULE_create_type = 49, RULE_type = 50, RULE_factored_select_stmt = 51, 
		RULE_select_stmt = 52, RULE_select_or_values = 53, RULE_column_def = 54, 
		RULE_type_name = 55, RULE_column_default_value = 56, RULE_expr = 57, RULE_ordering_term = 58, 
		RULE_result_column = 59, RULE_table_or_subquery = 60, RULE_join_clause = 61, 
		RULE_join_operator = 62, RULE_join_constraint = 63, RULE_select_core = 64, 
		RULE_signed_number = 65, RULE_literal_value = 66, RULE_unary_operator = 67, 
		RULE_error_message = 68, RULE_module_argument = 69, RULE_column_alias = 70, 
		RULE_keyword = 71, RULE_unknown = 72, RULE_name = 73, RULE_class_name = 74, 
		RULE_method_name = 75, RULE_function_name = 76, RULE_database_name = 77, 
		RULE_source_table_name = 78, RULE_table_name = 79, RULE_table_or_index_name = 80, 
		RULE_new_table_name = 81, RULE_column_name = 82, RULE_collation_name = 83, 
		RULE_foreign_table = 84, RULE_index_name = 85, RULE_trigger_name = 86, 
		RULE_view_name = 87, RULE_module_name = 88, RULE_pragma_name = 89, RULE_savepoint_name = 90, 
		RULE_table_alias = 91, RULE_transaction_name = 92, RULE_method_ID = 93, 
		RULE_array_name = 94, RULE_any_name = 95;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "java_stmt", "default_parameter", "parameter_list", 
			"argument_list", "java_function_call", "return_stmt", "return_value", 
			"string", "java_function_declaration", "block", "one_line_block", "java_body", 
			"comments", "variable", "variable_declaration", "variable_assignment", 
			"assginment", "variable_assignment_value", "param_array", "create_agg_fun", 
			"element", "print", "value", "expression", "math_expression", "boolean_expression", 
			"logical_condition", "increment", "assignment_operator", "conditional_stmt", 
			"if_stmt", "else_if_stmt", "else_stmt", "loop_stmt", "for_loop", "while_loop", 
			"do_while_loop", "for_each_loop", "switch_stmt", "switch_case", "switch_default", 
			"sql_stmt_list", "sql_stmt", "create_table_stmt", "file", "path", "jar_path", 
			"create_type", "type", "factored_select_stmt", "select_stmt", "select_or_values", 
			"column_def", "type_name", "column_default_value", "expr", "ordering_term", 
			"result_column", "table_or_subquery", "join_clause", "join_operator", 
			"join_constraint", "select_core", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "class_name", "method_name", "function_name", "database_name", 
			"source_table_name", "table_name", "table_or_index_name", "new_table_name", 
			"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
			"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
			"transaction_name", "method_ID", "array_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'{'", "'}'", "'['", "']'", "':'", "'''", "'&&'", "'?'", 
			"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "'>>>='", "'\\'", "'/'", "'.jar'", "';'", "'.'", "'('", 
			"')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", 
			"'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
			"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
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
			"K_TEMPORARY", "K_THEN", "K_TO", "K_TYPE", "K_TRANSACTION", "K_TRIGGER", 
			"K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", 
			"K_VIEW", "K_VIRTUAL", "K_VAR", "K_WHEN", "K_WHERE", "K_WHILE", "K_WITH", 
			"K_WITHOUT", "K_TRUE", "K_FALSE", "K_CSV", "K_JSON", "K_PARQUET", "K_AGGREGATION", 
			"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "JAVA_SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR", "DISK", "FILEPATH", "K_PATH"
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case SCOL:
			case K_CREATE:
			case K_SELECT:
			case K_VALUES:
			case UNEXPECTED_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCOL || _la==K_CREATE || ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (K_SELECT - 161)) | (1L << (K_VALUES - 161)) | (1L << (UNEXPECTED_CHAR - 161)))) != 0)) {
					{
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCOL:
					case K_CREATE:
					case K_SELECT:
					case K_VALUES:
						{
						setState(192);
						sql_stmt_list();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(193);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(EOF);
				}
				break;
			case T__1:
			case OPEN_PAR:
			case K_FUNCTION:
			case K_VAR:
			case IDENTIFIER:
			case STRING_LITERAL:
			case JAVA_SINGLE_LINE_COMMENT:
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				java_stmt();
				setState(201);
				match(EOF);
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
			setState(205);
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
		public TerminalNode SCOL() { return getToken(SqlParser.SCOL, 0); }
		public Java_stmtContext java_stmt() {
			return getRuleContext(Java_stmtContext.class,0);
		}
		public Java_function_declarationContext java_function_declaration() {
			return getRuleContext(Java_function_declarationContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				variable_declaration();
				setState(209);
				match(SCOL);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==OPEN_PAR || _la==K_FUNCTION || ((((_la - 180)) & ~0x3f) == 0 && ((1L << (_la - 180)) & ((1L << (K_VAR - 180)) | (1L << (IDENTIFIER - 180)) | (1L << (STRING_LITERAL - 180)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 180)) | (1L << (MULTILINE_COMMENT - 180)))) != 0)) {
					{
					setState(210);
					java_stmt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				java_function_declaration();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==OPEN_PAR || _la==K_FUNCTION || ((((_la - 180)) & ~0x3f) == 0 && ((1L << (_la - 180)) & ((1L << (K_VAR - 180)) | (1L << (IDENTIFIER - 180)) | (1L << (STRING_LITERAL - 180)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 180)) | (1L << (MULTILINE_COMMENT - 180)))) != 0)) {
					{
					setState(214);
					java_stmt();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				java_function_call();
				setState(218);
				match(SCOL);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==OPEN_PAR || _la==K_FUNCTION || ((((_la - 180)) & ~0x3f) == 0 && ((1L << (_la - 180)) & ((1L << (K_VAR - 180)) | (1L << (IDENTIFIER - 180)) | (1L << (STRING_LITERAL - 180)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 180)) | (1L << (MULTILINE_COMMENT - 180)))) != 0)) {
					{
					setState(219);
					java_stmt();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
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
			setState(225);
			match(K_VAR);
			setState(226);
			variable();
			setState(227);
			match(ASSIGN);
			setState(228);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(230);
				match(K_VAR);
				setState(231);
				any_name();
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					match(K_VAR);
					setState(236);
					any_name();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_VAR) {
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(242);
					match(COMMA);
					}
				}

				setState(245);
				default_parameter();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(246);
					match(COMMA);
					setState(247);
					default_parameter();
					}
					}
					setState(252);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_CURRENT_DATE - 78)) | (1L << (K_CURRENT_TIME - 78)) | (1L << (K_CURRENT_TIMESTAMP - 78)) | (1L << (K_NULL - 78)))) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (K_TRUE - 186)) | (1L << (K_FALSE - 186)) | (1L << (IDENTIFIER - 186)) | (1L << (NUMERIC_LITERAL - 186)) | (1L << (STRING_LITERAL - 186)) | (1L << (BLOB_LITERAL - 186)))) != 0)) {
				{
				setState(255);
				expression();
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(258);
				match(COMMA);
				{
				setState(259);
				expression();
				}
				}
				}
				setState(264);
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
		enterRule(_localctx, 12, RULE_java_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			method_ID();
			setState(266);
			match(OPEN_PAR);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(267);
				argument_list();
				}
				break;
			}
			setState(270);
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
		enterRule(_localctx, 14, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(K_RETURN);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_CURRENT_DATE - 78)) | (1L << (K_CURRENT_TIME - 78)) | (1L << (K_CURRENT_TIMESTAMP - 78)) | (1L << (K_NULL - 78)))) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (K_TRUE - 186)) | (1L << (K_FALSE - 186)) | (1L << (IDENTIFIER - 186)) | (1L << (NUMERIC_LITERAL - 186)) | (1L << (STRING_LITERAL - 186)) | (1L << (BLOB_LITERAL - 186)))) != 0)) {
				{
				setState(273);
				return_value();
				}
			}

			setState(276);
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
		enterRule(_localctx, 16, RULE_return_value);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
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
		enterRule(_localctx, 18, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__0);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(284);
						expression();
						}
						break;
					case 2:
						{
						setState(285);
						match(SPACES);
						}
						break;
					case 3:
						{
						setState(286);
						any_name();
						}
						break;
					case 4:
						{
						setState(287);
						match(SPACES);
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(293);
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
		enterRule(_localctx, 20, RULE_java_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(295);
				match(K_FUNCTION);
				}
			}

			setState(298);
			method_ID();
			setState(299);
			match(OPEN_PAR);
			{
			setState(300);
			parameter_list();
			}
			setState(301);
			match(CLOSE_PAR);
			setState(302);
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__1);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BREAK - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_DO - 64)) | (1L << (K_FOR - 64)) | (1L << (K_IF - 64)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (K_PRINT - 145)) | (1L << (K_SWITCH - 145)) | (1L << (K_VAR - 145)) | (1L << (K_WHILE - 145)) | (1L << (IDENTIFIER - 145)) | (1L << (STRING_LITERAL - 145)))) != 0)) {
				{
				{
				setState(305);
				java_body();
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(311);
				return_stmt();
				}
			}

			setState(314);
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
		enterRule(_localctx, 24, RULE_one_line_block);
		try {
			setState(318);
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
				setState(316);
				java_body();
				}
				break;
			case K_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
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
		enterRule(_localctx, 26, RULE_java_body);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new CondBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				conditional_stmt();
				}
				break;
			case 2:
				_localctx = new JfcBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				java_function_call();
				setState(322);
				match(SCOL);
				}
				break;
			case 3:
				_localctx = new LoopBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				loop_stmt();
				}
				break;
			case 4:
				_localctx = new SwitchBodyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				switch_stmt();
				}
				break;
			case 5:
				_localctx = new IncremetBodyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				increment();
				setState(327);
				match(SCOL);
				}
				break;
			case 6:
				_localctx = new VarDecBodyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				variable_declaration();
				setState(330);
				match(SCOL);
				}
				break;
			case 7:
				_localctx = new VarAssignBodyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(332);
				variable_assignment();
				setState(333);
				match(SCOL);
				}
				break;
			case 8:
				_localctx = new PrintBodyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(335);
				print();
				setState(336);
				match(SCOL);
				}
				break;
			case 9:
				_localctx = new ScopeBodyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				match(T__1);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BREAK - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_DO - 64)) | (1L << (K_FOR - 64)) | (1L << (K_IF - 64)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (K_PRINT - 145)) | (1L << (K_SWITCH - 145)) | (1L << (K_VAR - 145)) | (1L << (K_WHILE - 145)) | (1L << (IDENTIFIER - 145)) | (1L << (STRING_LITERAL - 145)))) != 0)) {
					{
					setState(339);
					java_body();
					}
				}

				setState(342);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new BreakBodyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(343);
				match(K_BREAK);
				setState(344);
				match(SCOL);
				}
				break;
			case 11:
				_localctx = new ContimueBodyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(345);
				match(K_CONTINUE);
				setState(346);
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
		enterRule(_localctx, 28, RULE_comments);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(JAVA_SINGLE_LINE_COMMENT);
				}
				break;
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(MULTILINE_COMMENT);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(T__1);
				setState(352);
				java_body();
				setState(353);
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
		enterRule(_localctx, 30, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			any_name();
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(DOT);
					setState(359);
					any_name();
					}
					} 
				}
				setState(364);
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
		enterRule(_localctx, 32, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(K_VAR);
			setState(366);
			variable_assignment();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(367);
				match(COMMA);
				setState(368);
				variable_assignment();
				}
				}
				setState(373);
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
		enterRule(_localctx, 34, RULE_variable_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			variable();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ASSIGN))) != 0)) {
				{
				{
				setState(375);
				assginment();
				}
				}
				setState(380);
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
		enterRule(_localctx, 36, RULE_assginment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			assignment_operator();
			setState(382);
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
		enterRule(_localctx, 38, RULE_variable_assignment_value);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
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

	public static class Param_arrayContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Param_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterParam_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitParam_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitParam_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_arrayContext param_array() throws RecognitionException {
		Param_arrayContext _localctx = new Param_arrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_param_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(T__3);
			setState(389);
			type();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				type();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
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

	public static class Create_agg_funContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SqlParser.K_CREATE, 0); }
		public TerminalNode K_AGGREGATION() { return getToken(SqlParser.K_AGGREGATION, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SqlParser.K_FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Jar_pathContext jar_path() {
			return getRuleContext(Jar_pathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Param_arrayContext param_array() {
			return getRuleContext(Param_arrayContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Create_agg_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_agg_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCreate_agg_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCreate_agg_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCreate_agg_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_agg_funContext create_agg_fun() throws RecognitionException {
		Create_agg_funContext _localctx = new Create_agg_funContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_agg_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(K_CREATE);
			setState(400);
			match(K_AGGREGATION);
			setState(401);
			match(K_FUNCTION);
			setState(402);
			function_name();
			setState(403);
			match(OPEN_PAR);
			setState(404);
			jar_path();
			setState(405);
			match(COMMA);
			setState(406);
			class_name();
			setState(407);
			match(COMMA);
			setState(408);
			method_name();
			setState(409);
			match(COMMA);
			setState(410);
			type();
			setState(411);
			match(COMMA);
			setState(412);
			param_array();
			setState(413);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 44, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(IDENTIFIER);
			setState(416);
			match(T__5);
			setState(422);
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
				setState(417);
				value();
				}
				break;
			case T__6:
				{
				setState(418);
				match(T__6);
				setState(419);
				value();
				setState(420);
				match(T__6);
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
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(K_PRINT);
			setState(425);
			match(OPEN_PAR);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_CURRENT_DATE - 78)) | (1L << (K_CURRENT_TIME - 78)) | (1L << (K_CURRENT_TIMESTAMP - 78)) | (1L << (K_NULL - 78)))) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (K_TRUE - 186)) | (1L << (K_FALSE - 186)) | (1L << (IDENTIFIER - 186)) | (1L << (NUMERIC_LITERAL - 186)) | (1L << (STRING_LITERAL - 186)) | (1L << (BLOB_LITERAL - 186)))) != 0)) {
				{
				setState(426);
				expression();
				}
			}

			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(429);
				match(PLUS);
				{
				setState(430);
				expression();
				}
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
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
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new VarValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				variable();
				}
				break;
			case 2:
				_localctx = new StrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				string();
				}
				break;
			case 3:
				_localctx = new JfcValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				java_function_call();
				}
				break;
			case 4:
				_localctx = new LvValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				literal_value();
				}
				break;
			case 5:
				_localctx = new ParenthValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
				match(OPEN_PAR);
				setState(443);
				value();
				setState(444);
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
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				boolean_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				math_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_math_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new ValueMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(455);
				value();
				}
				break;
			case 2:
				{
				_localctx = new ParenthMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(456);
				match(OPEN_PAR);
				setState(457);
				math_expression(0);
				setState(458);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticMathContext(new Math_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
					setState(462);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(463);
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
					setState(464);
					math_expression(3);
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_boolean_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				_localctx = new ValBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(471);
				value();
				}
				break;
			case 2:
				{
				_localctx = new CompareBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472);
				math_expression(0);
				setState(473);
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
				setState(474);
				math_expression(0);
				}
				break;
			case 3:
				{
				_localctx = new TrueBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(476);
				match(K_TRUE);
				}
				break;
			case 4:
				{
				_localctx = new FalseBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(477);
				match(K_FALSE);
				}
				break;
			case 5:
				{
				_localctx = new ParenthBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(478);
				match(OPEN_PAR);
				setState(479);
				boolean_expression(0);
				setState(480);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleBoolContext(new Boolean_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
					setState(484);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(485);
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
					setState(486);
					boolean_expression(5);
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 56, RULE_logical_condition);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new NormalLogContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				boolean_expression(0);
				{
				setState(493);
				match(T__8);
				setState(496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(494);
					logical_condition();
					}
					break;
				case 2:
					{
					setState(495);
					expression();
					}
					break;
				}
				setState(498);
				match(T__5);
				setState(501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(499);
					logical_condition();
					}
					break;
				case 2:
					{
					setState(500);
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
				setState(503);
				match(OPEN_PAR);
				setState(504);
				logical_condition();
				setState(505);
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
		enterRule(_localctx, 58, RULE_increment);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new PostIncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				variable();
				setState(510);
				((PostIncContext)_localctx).op = match(T__9);
				}
				break;
			case 2:
				_localctx = new PreIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				((PreIncContext)_localctx).op = match(T__9);
				setState(513);
				variable();
				}
				break;
			case 3:
				_localctx = new PostDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				variable();
				setState(515);
				((PostDecContext)_localctx).op = match(T__10);
				}
				break;
			case 4:
				_localctx = new PreDecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(517);
				((PreDecContext)_localctx).op = match(T__10);
				setState(518);
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
		enterRule(_localctx, 60, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 62, RULE_conditional_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(523);
					if_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(526); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(531);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(528);
					else_if_stmt();
					}
					} 
				}
				setState(533);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(534);
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
		enterRule(_localctx, 64, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(K_IF);
			setState(538);
			match(OPEN_PAR);
			setState(539);
			boolean_expression(0);
			setState(540);
			match(CLOSE_PAR);
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(541);
				block();
				}
				break;
			case 2:
				{
				setState(542);
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
		enterRule(_localctx, 66, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(K_ELSE);
			setState(546);
			match(K_IF);
			setState(547);
			match(OPEN_PAR);
			setState(548);
			boolean_expression(0);
			setState(549);
			match(CLOSE_PAR);
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(550);
				block();
				}
				break;
			case 2:
				{
				setState(551);
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
		enterRule(_localctx, 68, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(K_ELSE);
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(555);
				block();
				}
				break;
			case 2:
				{
				setState(556);
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
		enterRule(_localctx, 70, RULE_loop_stmt);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				do_while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
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
		enterRule(_localctx, 72, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(565);
			match(K_FOR);
			setState(566);
			match(OPEN_PAR);
			setState(567);
			variable_declaration();
			setState(568);
			match(SCOL);
			setState(569);
			boolean_expression(0);
			setState(570);
			match(SCOL);
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(571);
				increment();
				}
				break;
			case 2:
				{
				setState(572);
				variable_assignment();
				}
				break;
			}
			setState(575);
			match(CLOSE_PAR);
			}
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(577);
				block();
				}
				break;
			case 2:
				{
				setState(578);
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
		enterRule(_localctx, 74, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(581);
			match(K_WHILE);
			setState(582);
			match(OPEN_PAR);
			setState(583);
			boolean_expression(0);
			setState(584);
			match(CLOSE_PAR);
			}
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(586);
				block();
				}
				break;
			case 2:
				{
				setState(587);
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
		enterRule(_localctx, 76, RULE_do_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(K_DO);
			{
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(591);
				block();
				}
				break;
			case 2:
				{
				setState(592);
				one_line_block();
				}
				break;
			}
			}
			setState(595);
			match(K_WHILE);
			setState(596);
			match(OPEN_PAR);
			setState(597);
			boolean_expression(0);
			setState(598);
			match(CLOSE_PAR);
			setState(599);
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
		enterRule(_localctx, 78, RULE_for_each_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(K_FOR);
			setState(602);
			match(OPEN_PAR);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(603);
				match(K_VAR);
				}
			}

			setState(606);
			variable();
			setState(607);
			match(T__5);
			setState(608);
			array_name();
			setState(609);
			match(CLOSE_PAR);
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(610);
				block();
				}
				break;
			case 2:
				{
				setState(611);
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
		enterRule(_localctx, 80, RULE_switch_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(K_SWITCH);
			setState(615);
			match(OPEN_PAR);
			setState(616);
			variable();
			setState(617);
			match(CLOSE_PAR);
			setState(618);
			match(T__1);
			setState(620); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(619);
				switch_case();
				}
				}
				setState(622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CASE );
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(624);
				switch_default();
				}
			}

			setState(627);
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
		enterRule(_localctx, 82, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(629);
			match(K_CASE);
			{
			setState(630);
			value();
			}
			setState(631);
			match(T__5);
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
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
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BREAK || _la==K_CONTINUE) {
				{
				setState(636);
				_la = _input.LA(1);
				if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(637);
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
		enterRule(_localctx, 84, RULE_switch_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(640);
			match(K_DEFAULT);
			setState(641);
			match(T__5);
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(642);
				block();
				}
				break;
			case 2:
				{
				setState(643);
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
		enterRule(_localctx, 86, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(646);
				match(SCOL);
				}
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(652);
			sql_stmt();
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(653);
						match(SCOL);
						}
						}
						setState(656); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(658);
					sql_stmt();
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(667);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(664);
					match(SCOL);
					}
					} 
				}
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_typeContext create_type() {
			return getRuleContext(Create_typeContext.class,0);
		}
		public Create_agg_funContext create_agg_fun() {
			return getRuleContext(Create_agg_funContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
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
		enterRule(_localctx, 88, RULE_sql_stmt);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				create_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				create_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				create_agg_fun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				factored_select_stmt();
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
		public TerminalNode K_IF() { return getToken(SqlParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SqlParser.K_EXISTS, 0); }
		public TerminalNode K_TYPE() { return getToken(SqlParser.K_TYPE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SqlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SqlParser.ASSIGN, i);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public TerminalNode K_PATH() { return getToken(SqlParser.K_PATH, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
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
		enterRule(_localctx, 90, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(K_CREATE);
			setState(677);
			match(K_TABLE);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(678);
				match(K_IF);
				setState(679);
				match(K_NOT);
				setState(680);
				match(K_EXISTS);
				}
			}

			setState(683);
			table_name();
			{
			setState(684);
			match(OPEN_PAR);
			setState(685);
			column_def();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(686);
				match(COMMA);
				setState(687);
				column_def();
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
			match(CLOSE_PAR);
			}
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TYPE) {
				{
				setState(695);
				match(K_TYPE);
				setState(696);
				match(ASSIGN);
				setState(697);
				file();
				setState(698);
				match(K_PATH);
				setState(699);
				match(ASSIGN);
				setState(700);
				path();
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode K_CSV() { return getToken(SqlParser.K_CSV, 0); }
		public TerminalNode K_JSON() { return getToken(SqlParser.K_JSON, 0); }
		public TerminalNode K_PARQUET() { return getToken(SqlParser.K_PARQUET, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_la = _input.LA(1);
			if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (K_CSV - 188)) | (1L << (K_JSON - 188)) | (1L << (K_PARQUET - 188)))) != 0)) ) {
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

	public static class PathContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(706);
				match(IDENTIFIER);
				setState(707);
				match(T__5);
				}
			}

			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(710);
				match(T__21);
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(711);
					match(T__21);
					}
				}

				}
				break;
			case T__22:
				{
				setState(714);
				match(T__22);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(715);
					match(T__22);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(720);
			any_name();
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(729);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(721);
					match(T__21);
					setState(723);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(722);
						match(T__21);
						}
						break;
					}
					}
					break;
				case T__22:
					{
					setState(725);
					match(T__22);
					setState(727);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(726);
						match(T__22);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				{
				setState(741);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(733);
					match(T__21);
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(734);
						match(T__21);
						}
					}

					}
					break;
				case T__22:
					{
					setState(737);
					match(T__22);
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__22) {
						{
						setState(738);
						match(T__22);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(743);
				any_name();
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(752);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__21:
						{
						setState(744);
						match(T__21);
						setState(746);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							setState(745);
							match(T__21);
							}
							break;
						}
						}
						break;
					case T__22:
						{
						setState(748);
						match(T__22);
						setState(750);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
						case 1:
							{
							setState(749);
							match(T__22);
							}
							break;
						}
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
				setState(760);
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

	public static class Jar_pathContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public Jar_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterJar_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitJar_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitJar_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_pathContext jar_path() throws RecognitionException {
		Jar_pathContext _localctx = new Jar_pathContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_jar_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(761);
				match(IDENTIFIER);
				setState(762);
				match(T__5);
				}
			}

			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(765);
				match(T__21);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(766);
					match(T__21);
					}
				}

				}
				break;
			case T__22:
				{
				setState(769);
				match(T__22);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(770);
					match(T__22);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(775);
			any_name();
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(784);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(776);
					match(T__21);
					setState(778);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(777);
						match(T__21);
						}
						break;
					}
					}
					break;
				case T__22:
					{
					setState(780);
					match(T__22);
					setState(782);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(781);
						match(T__22);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				{
				setState(796);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(788);
					match(T__21);
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(789);
						match(T__21);
						}
					}

					}
					break;
				case T__22:
					{
					setState(792);
					match(T__22);
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__22) {
						{
						setState(793);
						match(T__22);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(798);
				any_name();
				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(807);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__21:
						{
						setState(799);
						match(T__21);
						setState(801);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
						case 1:
							{
							setState(800);
							match(T__21);
							}
							break;
						}
						}
						break;
					case T__22:
						{
						setState(803);
						match(T__22);
						setState(805);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
						case 1:
							{
							setState(804);
							match(T__22);
							}
							break;
						}
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
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
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
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 98, RULE_create_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(K_CREATE);
			setState(819);
			match(K_TYPE);
			setState(820);
			type_name();
			{
			setState(821);
			match(OPEN_PAR);
			setState(822);
			type();
			{
			setState(823);
			any_name();
			}
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(824);
				match(COMMA);
				setState(825);
				type();
				{
				setState(826);
				any_name();
				}
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
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

	public static class TypeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
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
		enterRule(_localctx, 100, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			type_name();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			select_core();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(838);
				match(K_ORDER);
				setState(839);
				match(K_BY);
				setState(840);
				ordering_term();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(841);
					match(COMMA);
					setState(842);
					ordering_term();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(850);
				match(K_LIMIT);
				setState(851);
				expr(0);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(852);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(853);
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
		enterRule(_localctx, 104, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			select_or_values();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(859);
				match(K_ORDER);
				setState(860);
				match(K_BY);
				setState(861);
				ordering_term();
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(862);
					match(COMMA);
					setState(863);
					ordering_term();
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(871);
				match(K_LIMIT);
				setState(872);
				expr(0);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(873);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(874);
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
		public ExprContext where;
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
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 106, RULE_select_or_values);
		int _la;
		try {
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				match(K_SELECT);
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(880);
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

				setState(883);
				result_column();
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(884);
					match(COMMA);
					setState(885);
					result_column();
					}
					}
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(891);
					match(K_FROM);
					setState(901);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						setState(892);
						table_or_subquery();
						setState(897);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(893);
							match(COMMA);
							setState(894);
							table_or_subquery();
							}
							}
							setState(899);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(900);
						join_clause();
						}
						break;
					}
					}
				}

				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(905);
					match(K_WHERE);
					setState(906);
					((Select_or_valuesContext)_localctx).where = expr(0);
					}
				}

				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(909);
					match(K_GROUP);
					setState(910);
					match(K_BY);
					setState(911);
					expr(0);
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(912);
						match(COMMA);
						setState(913);
						expr(0);
						}
						}
						setState(918);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(919);
						match(K_HAVING);
						setState(920);
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
				setState(925);
				match(K_VALUES);
				setState(926);
				match(OPEN_PAR);
				setState(927);
				expr(0);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(928);
					match(COMMA);
					setState(929);
					expr(0);
					}
					}
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(935);
				match(CLOSE_PAR);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(936);
					match(COMMA);
					setState(937);
					match(OPEN_PAR);
					setState(938);
					expr(0);
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(939);
						match(COMMA);
						setState(940);
						expr(0);
						}
						}
						setState(945);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(946);
					match(CLOSE_PAR);
					}
					}
					setState(952);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
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
		enterRule(_localctx, 108, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			column_name();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(956);
				type_name();
				}
				}
				setState(961);
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
		enterRule(_localctx, 110, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
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
		enterRule(_localctx, 112, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(964);
				signed_number();
				}
				break;
			case 2:
				{
				setState(965);
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
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
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
	public static class Case16Context extends ExprContext {
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SqlParser.K_VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public Case16Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase16(this);
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
	public static class Case22Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Case22Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase22(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase22(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase22(this);
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
		public ExprContext exp1;
		public TerminalNode K_IN() { return getToken(SqlParser.K_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				_localctx = new Case1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(969);
				literal_value();
				}
				break;
			case 2:
				{
				_localctx = new Case16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(970);
				match(OPEN_PAR);
				setState(971);
				match(K_VAR);
				setState(972);
				expression();
				setState(973);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				_localctx = new Case2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(975);
					table_name();
					setState(976);
					match(DOT);
					}
					break;
				}
				setState(980);
				column_name();
				}
				break;
			case 4:
				{
				_localctx = new Case3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(981);
				unary_operator();
				setState(982);
				expr(13);
				}
				break;
			case 5:
				{
				_localctx = new Case12Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(984);
				function_name();
				setState(985);
				match(OPEN_PAR);
				setState(998);
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
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(986);
						match(K_DISTINCT);
						}
					}

					setState(989);
					expr(0);
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(990);
						match(COMMA);
						setState(991);
						expr(0);
						}
						}
						setState(996);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(997);
					((Case12Context)_localctx).op = match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1000);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				_localctx = new Case13Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1002);
				match(OPEN_PAR);
				setState(1003);
				expr(0);
				setState(1004);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				_localctx = new Case15Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1006);
						match(K_NOT);
						}
					}

					setState(1009);
					match(K_EXISTS);
					}
				}

				setState(1012);
				match(OPEN_PAR);
				setState(1013);
				select_stmt();
				setState(1014);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1084);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1082);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						_localctx = new Case4Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1018);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1019);
						((Case4Context)_localctx).op = match(PIPE2);
						setState(1020);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new Case5Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1021);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1022);
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
						setState(1023);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new Case6Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1024);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1025);
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
						setState(1026);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new Case7Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1027);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1028);
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
						setState(1029);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new Case8Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1030);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1031);
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
						setState(1032);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new Case9Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1033);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1044);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ASSIGN:
						case EQ:
						case NOT_EQ1:
						case NOT_EQ2:
							{
							setState(1034);
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
						case K_IS:
						case K_LIKE:
						case K_MATCH:
						case K_REGEXP:
							{
							setState(1042);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
							case 1:
								{
								setState(1035);
								match(K_IS);
								}
								break;
							case 2:
								{
								setState(1036);
								match(K_IS);
								setState(1037);
								match(K_NOT);
								}
								break;
							case 3:
								{
								setState(1038);
								match(K_LIKE);
								}
								break;
							case 4:
								{
								setState(1039);
								match(K_GLOB);
								}
								break;
							case 5:
								{
								setState(1040);
								match(K_MATCH);
								}
								break;
							case 6:
								{
								setState(1041);
								match(K_REGEXP);
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1046);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new Case10Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1047);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1048);
						match(K_AND);
						setState(1049);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new Case11Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1050);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1051);
						match(K_OR);
						setState(1052);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new Case22Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1053);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1054);
						match(DOT);
						setState(1055);
						any_name();
						}
						break;
					case 10:
						{
						_localctx = new Case14Context(new ExprContext(_parentctx, _parentState));
						((Case14Context)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1056);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1058);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1057);
							match(K_NOT);
							}
						}

						setState(1060);
						match(K_IN);
						setState(1080);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
						case 1:
							{
							setState(1061);
							match(OPEN_PAR);
							setState(1071);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case K_SELECT:
							case K_VALUES:
								{
								setState(1062);
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
								setState(1063);
								expr(0);
								setState(1068);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1064);
									match(COMMA);
									setState(1065);
									expr(0);
									}
									}
									setState(1070);
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
							setState(1073);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1077);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
							case 1:
								{
								setState(1074);
								database_name();
								setState(1075);
								match(DOT);
								}
								break;
							}
							setState(1079);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1086);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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
		enterRule(_localctx, 116, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			expr(0);
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1088);
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
		enterRule(_localctx, 118, RULE_result_column);
		int _la;
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				table_name();
				setState(1093);
				match(DOT);
				setState(1094);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				expr(0);
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1097);
						match(K_AS);
						}
					}

					setState(1100);
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
		enterRule(_localctx, 120, RULE_table_or_subquery);
		int _la;
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1105);
					database_name();
					setState(1106);
					match(DOT);
					}
					break;
				}
				setState(1110);
				table_name();
				setState(1115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1111);
						match(K_AS);
						}
					}

					setState(1114);
					table_alias();
					}
					break;
				}
				setState(1122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1117);
					match(K_INDEXED);
					setState(1118);
					match(K_BY);
					setState(1119);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1120);
					match(K_NOT);
					setState(1121);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case OPEN_PAR:
				case CLOSE_PAR:
				case COMMA:
				case K_CREATE:
				case K_GROUP:
				case K_INNER:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_ON:
				case K_ORDER:
				case K_SELECT:
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
				setState(1124);
				match(OPEN_PAR);
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1125);
					table_or_subquery();
					setState(1130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1126);
						match(COMMA);
						setState(1127);
						table_or_subquery();
						}
						}
						setState(1132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1133);
					join_clause();
					}
					break;
				}
				setState(1136);
				match(CLOSE_PAR);
				setState(1141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1137);
						match(K_AS);
						}
					}

					setState(1140);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				match(OPEN_PAR);
				setState(1144);
				select_stmt();
				setState(1145);
				match(CLOSE_PAR);
				setState(1150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1146);
						match(K_AS);
						}
					}

					setState(1149);
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
		enterRule(_localctx, 122, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			table_or_subquery();
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (K_INNER - 116)) | (1L << (K_JOIN - 116)) | (1L << (K_LEFT - 116)))) != 0) || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(1155);
				join_operator();
				setState(1156);
				table_or_subquery();
				setState(1157);
				join_constraint();
				}
				}
				setState(1163);
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
		enterRule(_localctx, 124, RULE_join_operator);
		int _la;
		try {
			setState(1173);
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
				setState(1170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1165);
					match(K_LEFT);
					setState(1167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1166);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1169);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1172);
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
		enterRule(_localctx, 126, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1175);
			match(K_ON);
			setState(1176);
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
		public ExprContext where;
		public ExprContext op;
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
		public TerminalNode K_GROUP() { return getToken(SqlParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SqlParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 128, RULE_select_core);
		int _la;
		try {
			setState(1252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				match(K_SELECT);
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1179);
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

				setState(1182);
				result_column();
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1183);
					match(COMMA);
					setState(1184);
					result_column();
					}
					}
					setState(1189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1190);
					match(K_FROM);
					setState(1200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1191);
						table_or_subquery();
						setState(1196);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1192);
							match(COMMA);
							setState(1193);
							table_or_subquery();
							}
							}
							setState(1198);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1199);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1204);
					match(K_WHERE);
					setState(1205);
					((Select_coreContext)_localctx).where = expr(0);
					}
				}

				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1208);
					match(K_GROUP);
					setState(1209);
					match(K_BY);
					setState(1210);
					expr(0);
					setState(1215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1211);
						match(COMMA);
						setState(1212);
						expr(0);
						}
						}
						setState(1217);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1218);
						match(K_HAVING);
						setState(1219);
						((Select_coreContext)_localctx).op = expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(K_VALUES);
				setState(1225);
				match(OPEN_PAR);
				setState(1226);
				expr(0);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1227);
					match(COMMA);
					setState(1228);
					expr(0);
					}
					}
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1234);
				match(CLOSE_PAR);
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1235);
					match(COMMA);
					setState(1236);
					match(OPEN_PAR);
					setState(1237);
					expr(0);
					setState(1242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1238);
						match(COMMA);
						setState(1239);
						expr(0);
						}
						}
						setState(1244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1245);
					match(CLOSE_PAR);
					}
					}
					setState(1251);
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
		enterRule(_localctx, 130, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1254);
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

				setState(1257);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1258);
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
		enterRule(_localctx, 132, RULE_literal_value);
		try {
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1263);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1264);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(1265);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1266);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1267);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(1268);
				match(OPEN_PAR);
				setState(1269);
				literal_value();
				setState(1270);
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
		enterRule(_localctx, 134, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
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
		enterRule(_localctx, 136, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
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
		enterRule(_localctx, 138, RULE_module_argument);
		try {
			setState(1280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
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
		enterRule(_localctx, 140, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
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
		enterRule(_localctx, 142, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_BY - 65)) | (1L << (K_CASCADE - 65)) | (1L << (K_CASE - 65)) | (1L << (K_CAST - 65)) | (1L << (K_CHECK - 65)) | (1L << (K_COLLATE - 65)) | (1L << (K_COLUMN - 65)) | (1L << (K_COMMIT - 65)) | (1L << (K_CONFLICT - 65)) | (1L << (K_CONSTRAINT - 65)) | (1L << (K_CREATE - 65)) | (1L << (K_CROSS - 65)) | (1L << (K_CURRENT_DATE - 65)) | (1L << (K_CURRENT_TIME - 65)) | (1L << (K_CURRENT_TIMESTAMP - 65)) | (1L << (K_DATABASE - 65)) | (1L << (K_DEFAULT - 65)) | (1L << (K_DEFERRABLE - 65)) | (1L << (K_DEFERRED - 65)) | (1L << (K_DELETE - 65)) | (1L << (K_DESC - 65)) | (1L << (K_DETACH - 65)) | (1L << (K_DISTINCT - 65)) | (1L << (K_DROP - 65)) | (1L << (K_EACH - 65)) | (1L << (K_ELSE - 65)) | (1L << (K_END - 65)) | (1L << (K_ENABLE - 65)) | (1L << (K_ESCAPE - 65)) | (1L << (K_EXCEPT - 65)) | (1L << (K_EXCLUSIVE - 65)) | (1L << (K_EXISTS - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_FAIL - 65)) | (1L << (K_FOR - 65)) | (1L << (K_FOREIGN - 65)) | (1L << (K_FROM - 65)) | (1L << (K_FULL - 65)) | (1L << (K_GLOB - 65)) | (1L << (K_GROUP - 65)) | (1L << (K_HAVING - 65)) | (1L << (K_IF - 65)) | (1L << (K_IGNORE - 65)) | (1L << (K_IMMEDIATE - 65)) | (1L << (K_IN - 65)) | (1L << (K_INDEX - 65)) | (1L << (K_INDEXED - 65)) | (1L << (K_INITIALLY - 65)) | (1L << (K_INNER - 65)) | (1L << (K_INSERT - 65)) | (1L << (K_INSTEAD - 65)) | (1L << (K_INTERSECT - 65)) | (1L << (K_INTO - 65)) | (1L << (K_IS - 65)) | (1L << (K_ISNULL - 65)) | (1L << (K_JOIN - 65)) | (1L << (K_KEY - 65)) | (1L << (K_LEFT - 65)) | (1L << (K_LIKE - 65)) | (1L << (K_LIMIT - 65)) | (1L << (K_MATCH - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_NATURAL - 129)) | (1L << (K_NEXTVAL - 129)) | (1L << (K_NO - 129)) | (1L << (K_NOT - 129)) | (1L << (K_NOTNULL - 129)) | (1L << (K_NULL - 129)) | (1L << (K_OF - 129)) | (1L << (K_OFFSET - 129)) | (1L << (K_ON - 129)) | (1L << (K_OR - 129)) | (1L << (K_ORDER - 129)) | (1L << (K_OUTER - 129)) | (1L << (K_PLAN - 129)) | (1L << (K_PRAGMA - 129)) | (1L << (K_PRIMARY - 129)) | (1L << (K_QUERY - 129)) | (1L << (K_RAISE - 129)) | (1L << (K_RECURSIVE - 129)) | (1L << (K_REFERENCES - 129)) | (1L << (K_REGEXP - 129)) | (1L << (K_REINDEX - 129)) | (1L << (K_RELEASE - 129)) | (1L << (K_RENAME - 129)) | (1L << (K_REPLACE - 129)) | (1L << (K_RESTRICT - 129)) | (1L << (K_RIGHT - 129)) | (1L << (K_ROLLBACK - 129)) | (1L << (K_ROW - 129)) | (1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_SET - 129)) | (1L << (K_TABLE - 129)) | (1L << (K_TEMP - 129)) | (1L << (K_TEMPORARY - 129)) | (1L << (K_THEN - 129)) | (1L << (K_TO - 129)) | (1L << (K_TRANSACTION - 129)) | (1L << (K_TRIGGER - 129)) | (1L << (K_UNION - 129)) | (1L << (K_UNIQUE - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_USING - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_VIEW - 129)) | (1L << (K_VIRTUAL - 129)) | (1L << (K_WHEN - 129)) | (1L << (K_WHERE - 129)) | (1L << (K_WITH - 129)) | (1L << (K_WITHOUT - 129)))) != 0)) ) {
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
		enterRule(_localctx, 144, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1286);
				matchWildcard();
				}
				}
				setState(1289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BREAK - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DO - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_MATCH - 128)) | (1L << (K_NATURAL - 128)) | (1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_CSV - 128)) | (1L << (K_JSON - 128)) | (1L << (K_PARQUET - 128)) | (1L << (K_AGGREGATION - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (IDENTIFIER - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (BIND_PARAMETER - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (BLOB_LITERAL - 192)) | (1L << (SINGLE_LINE_COMMENT - 192)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SPACES - 192)) | (1L << (UNEXPECTED_CHAR - 192)) | (1L << (DISK - 192)) | (1L << (FILEPATH - 192)) | (1L << (K_PATH - 192)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
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

	public static class Class_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
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

	public static class Method_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
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
		enterRule(_localctx, 152, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
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
		enterRule(_localctx, 154, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
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
		enterRule(_localctx, 156, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
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
		enterRule(_localctx, 158, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
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
		enterRule(_localctx, 160, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
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
		enterRule(_localctx, 162, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
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
		enterRule(_localctx, 164, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
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
		enterRule(_localctx, 166, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
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
		enterRule(_localctx, 168, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
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
		enterRule(_localctx, 170, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
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
		enterRule(_localctx, 172, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
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
		enterRule(_localctx, 174, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
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
		enterRule(_localctx, 176, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
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
		enterRule(_localctx, 178, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
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
		enterRule(_localctx, 180, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
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
		enterRule(_localctx, 182, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
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
		enterRule(_localctx, 184, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
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
		enterRule(_localctx, 186, RULE_method_ID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
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
		enterRule(_localctx, 188, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
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
		enterRule(_localctx, 190, RULE_any_name);
		try {
			setState(1341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1335);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1336);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1337);
				match(OPEN_PAR);
				setState(1338);
				any_name();
				setState(1339);
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
		case 26:
			return math_expression_sempred((Math_expressionContext)_localctx, predIndex);
		case 27:
			return boolean_expression_sempred((Boolean_expressionContext)_localctx, predIndex);
		case 57:
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
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ce\u0542\4\2\t"+
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
		"`\t`\4a\ta\3\2\3\2\7\2\u00c5\n\2\f\2\16\2\u00c8\13\2\3\2\3\2\3\2\3\2\5"+
		"\2\u00ce\n\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u00d6\n\4\3\4\3\4\5\4\u00da\n"+
		"\4\3\4\3\4\3\4\5\4\u00df\n\4\3\4\5\4\u00e2\n\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6\u00eb\n\6\3\6\3\6\3\6\7\6\u00f0\n\6\f\6\16\6\u00f3\13\6\3\6\5"+
		"\6\u00f6\n\6\3\6\3\6\3\6\7\6\u00fb\n\6\f\6\16\6\u00fe\13\6\5\6\u0100\n"+
		"\6\3\7\5\7\u0103\n\7\3\7\3\7\7\7\u0107\n\7\f\7\16\7\u010a\13\7\3\b\3\b"+
		"\3\b\5\b\u010f\n\b\3\b\3\b\3\t\3\t\5\t\u0115\n\t\3\t\3\t\3\n\3\n\3\n\5"+
		"\n\u011c\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u0123\n\13\f\13\16\13\u0126"+
		"\13\13\3\13\3\13\3\f\5\f\u012b\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r"+
		"\u0135\n\r\f\r\16\r\u0138\13\r\3\r\5\r\u013b\n\r\3\r\3\r\3\16\3\16\5\16"+
		"\u0141\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0157\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u015e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0166\n"+
		"\20\3\21\3\21\3\21\7\21\u016b\n\21\f\21\16\21\u016e\13\21\3\22\3\22\3"+
		"\22\3\22\7\22\u0174\n\22\f\22\16\22\u0177\13\22\3\23\3\23\7\23\u017b\n"+
		"\23\f\23\16\23\u017e\13\23\3\24\3\24\3\24\3\25\3\25\5\25\u0185\n\25\3"+
		"\26\3\26\3\26\3\26\7\26\u018b\n\26\f\26\16\26\u018e\13\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01a9\n\30\3\31\3\31"+
		"\3\31\5\31\u01ae\n\31\3\31\3\31\7\31\u01b2\n\31\f\31\16\31\u01b5\13\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c1\n\32\3\33"+
		"\3\33\3\33\3\33\5\33\u01c7\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01cf"+
		"\n\34\3\34\3\34\3\34\7\34\u01d4\n\34\f\34\16\34\u01d7\13\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e5\n\35\3\35"+
		"\3\35\3\35\7\35\u01ea\n\35\f\35\16\35\u01ed\13\35\3\36\3\36\3\36\3\36"+
		"\5\36\u01f3\n\36\3\36\3\36\3\36\5\36\u01f8\n\36\3\36\3\36\3\36\3\36\5"+
		"\36\u01fe\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u020a\n\37\3 \3 \3!\6!\u020f\n!\r!\16!\u0210\3!\7!\u0214\n!\f!\16!\u0217"+
		"\13!\3!\5!\u021a\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0222\n\"\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u022b\n#\3$\3$\3$\5$\u0230\n$\3%\3%\3%\3%\5%\u0236\n%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u0240\n&\3&\3&\3&\3&\5&\u0246\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u024f\n\'\3(\3(\3(\5(\u0254\n(\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\5)\u025f\n)\3)\3)\3)\3)\3)\3)\5)\u0267\n)\3*\3*\3*\3*\3*\3*"+
		"\6*\u026f\n*\r*\16*\u0270\3*\5*\u0274\n*\3*\3*\3+\3+\3+\3+\3+\5+\u027d"+
		"\n+\3+\3+\5+\u0281\n+\3,\3,\3,\3,\5,\u0287\n,\3-\7-\u028a\n-\f-\16-\u028d"+
		"\13-\3-\3-\6-\u0291\n-\r-\16-\u0292\3-\7-\u0296\n-\f-\16-\u0299\13-\3"+
		"-\7-\u029c\n-\f-\16-\u029f\13-\3.\3.\3.\3.\5.\u02a5\n.\3/\3/\3/\3/\3/"+
		"\5/\u02ac\n/\3/\3/\3/\3/\3/\7/\u02b3\n/\f/\16/\u02b6\13/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u02c1\n/\3\60\3\60\3\61\3\61\5\61\u02c7\n\61\3\61\3\61"+
		"\5\61\u02cb\n\61\3\61\3\61\5\61\u02cf\n\61\5\61\u02d1\n\61\3\61\3\61\3"+
		"\61\5\61\u02d6\n\61\3\61\3\61\5\61\u02da\n\61\5\61\u02dc\n\61\5\61\u02de"+
		"\n\61\3\61\3\61\5\61\u02e2\n\61\3\61\3\61\5\61\u02e6\n\61\5\61\u02e8\n"+
		"\61\3\61\3\61\3\61\5\61\u02ed\n\61\3\61\3\61\5\61\u02f1\n\61\5\61\u02f3"+
		"\n\61\5\61\u02f5\n\61\7\61\u02f7\n\61\f\61\16\61\u02fa\13\61\3\62\3\62"+
		"\5\62\u02fe\n\62\3\62\3\62\5\62\u0302\n\62\3\62\3\62\5\62\u0306\n\62\5"+
		"\62\u0308\n\62\3\62\3\62\3\62\5\62\u030d\n\62\3\62\3\62\5\62\u0311\n\62"+
		"\5\62\u0313\n\62\5\62\u0315\n\62\3\62\3\62\5\62\u0319\n\62\3\62\3\62\5"+
		"\62\u031d\n\62\5\62\u031f\n\62\3\62\3\62\3\62\5\62\u0324\n\62\3\62\3\62"+
		"\5\62\u0328\n\62\5\62\u032a\n\62\5\62\u032c\n\62\7\62\u032e\n\62\f\62"+
		"\16\62\u0331\13\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\7\63\u033f\n\63\f\63\16\63\u0342\13\63\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\7\65\u034e\n\65\f\65\16\65\u0351\13\65\5"+
		"\65\u0353\n\65\3\65\3\65\3\65\3\65\5\65\u0359\n\65\5\65\u035b\n\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\7\66\u0363\n\66\f\66\16\66\u0366\13\66\5\66"+
		"\u0368\n\66\3\66\3\66\3\66\3\66\5\66\u036e\n\66\5\66\u0370\n\66\3\67\3"+
		"\67\5\67\u0374\n\67\3\67\3\67\3\67\7\67\u0379\n\67\f\67\16\67\u037c\13"+
		"\67\3\67\3\67\3\67\3\67\7\67\u0382\n\67\f\67\16\67\u0385\13\67\3\67\5"+
		"\67\u0388\n\67\5\67\u038a\n\67\3\67\3\67\5\67\u038e\n\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u0395\n\67\f\67\16\67\u0398\13\67\3\67\3\67\5\67\u039c"+
		"\n\67\5\67\u039e\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u03a5\n\67\f\67\16"+
		"\67\u03a8\13\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u03b0\n\67\f\67\16"+
		"\67\u03b3\13\67\3\67\3\67\7\67\u03b7\n\67\f\67\16\67\u03ba\13\67\5\67"+
		"\u03bc\n\67\38\38\78\u03c0\n8\f8\168\u03c3\138\39\39\3:\3:\5:\u03c9\n"+
		":\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u03d5\n;\3;\3;\3;\3;\3;\3;\3;\5;\u03de"+
		"\n;\3;\3;\3;\7;\u03e3\n;\f;\16;\u03e6\13;\3;\5;\u03e9\n;\3;\3;\3;\3;\3"+
		";\3;\3;\5;\u03f2\n;\3;\5;\u03f5\n;\3;\3;\3;\3;\5;\u03fb\n;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0415"+
		"\n;\5;\u0417\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0425\n;\3;\3;"+
		"\3;\3;\3;\3;\7;\u042d\n;\f;\16;\u0430\13;\5;\u0432\n;\3;\3;\3;\3;\5;\u0438"+
		"\n;\3;\5;\u043b\n;\7;\u043d\n;\f;\16;\u0440\13;\3<\3<\5<\u0444\n<\3=\3"+
		"=\3=\3=\3=\3=\3=\5=\u044d\n=\3=\5=\u0450\n=\5=\u0452\n=\3>\3>\3>\5>\u0457"+
		"\n>\3>\3>\5>\u045b\n>\3>\5>\u045e\n>\3>\3>\3>\3>\3>\5>\u0465\n>\3>\3>"+
		"\3>\3>\7>\u046b\n>\f>\16>\u046e\13>\3>\5>\u0471\n>\3>\3>\5>\u0475\n>\3"+
		">\5>\u0478\n>\3>\3>\3>\3>\5>\u047e\n>\3>\5>\u0481\n>\5>\u0483\n>\3?\3"+
		"?\3?\3?\3?\7?\u048a\n?\f?\16?\u048d\13?\3@\3@\3@\5@\u0492\n@\3@\5@\u0495"+
		"\n@\3@\5@\u0498\n@\3A\3A\3A\3B\3B\5B\u049f\nB\3B\3B\3B\7B\u04a4\nB\fB"+
		"\16B\u04a7\13B\3B\3B\3B\3B\7B\u04ad\nB\fB\16B\u04b0\13B\3B\5B\u04b3\n"+
		"B\5B\u04b5\nB\3B\3B\5B\u04b9\nB\3B\3B\3B\3B\3B\7B\u04c0\nB\fB\16B\u04c3"+
		"\13B\3B\3B\5B\u04c7\nB\5B\u04c9\nB\3B\3B\3B\3B\3B\7B\u04d0\nB\fB\16B\u04d3"+
		"\13B\3B\3B\3B\3B\3B\3B\7B\u04db\nB\fB\16B\u04de\13B\3B\3B\7B\u04e2\nB"+
		"\fB\16B\u04e5\13B\5B\u04e7\nB\3C\5C\u04ea\nC\3C\3C\5C\u04ee\nC\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04fb\nD\3E\3E\3F\3F\3G\3G\5G\u0503\nG\3"+
		"H\3H\3I\3I\3J\6J\u050a\nJ\rJ\16J\u050b\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3"+
		"P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3"+
		"[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3a\3a\3a\3a\5a\u0540\na\3a\2\5"+
		"\668tb\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\2\23\4\2!#&)\3\2,\62\4\2\n\n%%\4\2\16\27  \4\2BBMM"+
		"\3\2\u00be\u00c0\4\2\37\37\u008a\u008a\4\2\67\67ZZ\4\2!!&\'\3\2\"#\3\2"+
		"(+\3\2,/\4\2  \60\62\4\2<<XX\4\2\"$\u0086\u0086\4\2\u00c2\u00c2\u00c5"+
		"\u00c5\16\2\63ACLNZ\\jl\u008b\u008d\u0092\u0094\u009d\u009f\u00a4\u00a6"+
		"\u00aa\u00ac\u00b5\u00b7\u00b8\u00ba\u00bb\2\u05d0\2\u00cd\3\2\2\2\4\u00cf"+
		"\3\2\2\2\6\u00e1\3\2\2\2\b\u00e3\3\2\2\2\n\u00ea\3\2\2\2\f\u0102\3\2\2"+
		"\2\16\u010b\3\2\2\2\20\u0112\3\2\2\2\22\u011b\3\2\2\2\24\u011d\3\2\2\2"+
		"\26\u012a\3\2\2\2\30\u0132\3\2\2\2\32\u0140\3\2\2\2\34\u015d\3\2\2\2\36"+
		"\u0165\3\2\2\2 \u0167\3\2\2\2\"\u016f\3\2\2\2$\u0178\3\2\2\2&\u017f\3"+
		"\2\2\2(\u0184\3\2\2\2*\u0186\3\2\2\2,\u0191\3\2\2\2.\u01a1\3\2\2\2\60"+
		"\u01aa\3\2\2\2\62\u01c0\3\2\2\2\64\u01c6\3\2\2\2\66\u01ce\3\2\2\28\u01e4"+
		"\3\2\2\2:\u01fd\3\2\2\2<\u0209\3\2\2\2>\u020b\3\2\2\2@\u020e\3\2\2\2B"+
		"\u021b\3\2\2\2D\u0223\3\2\2\2F\u022c\3\2\2\2H\u0235\3\2\2\2J\u0237\3\2"+
		"\2\2L\u0247\3\2\2\2N\u0250\3\2\2\2P\u025b\3\2\2\2R\u0268\3\2\2\2T\u0277"+
		"\3\2\2\2V\u0282\3\2\2\2X\u028b\3\2\2\2Z\u02a4\3\2\2\2\\\u02a6\3\2\2\2"+
		"^\u02c2\3\2\2\2`\u02c6\3\2\2\2b\u02fd\3\2\2\2d\u0334\3\2\2\2f\u0345\3"+
		"\2\2\2h\u0347\3\2\2\2j\u035c\3\2\2\2l\u03bb\3\2\2\2n\u03bd\3\2\2\2p\u03c4"+
		"\3\2\2\2r\u03c8\3\2\2\2t\u03fa\3\2\2\2v\u0441\3\2\2\2x\u0451\3\2\2\2z"+
		"\u0482\3\2\2\2|\u0484\3\2\2\2~\u0497\3\2\2\2\u0080\u0499\3\2\2\2\u0082"+
		"\u04e6\3\2\2\2\u0084\u04ed\3\2\2\2\u0086\u04fa\3\2\2\2\u0088\u04fc\3\2"+
		"\2\2\u008a\u04fe\3\2\2\2\u008c\u0502\3\2\2\2\u008e\u0504\3\2\2\2\u0090"+
		"\u0506\3\2\2\2\u0092\u0509\3\2\2\2\u0094\u050d\3\2\2\2\u0096\u050f\3\2"+
		"\2\2\u0098\u0511\3\2\2\2\u009a\u0513\3\2\2\2\u009c\u0515\3\2\2\2\u009e"+
		"\u0517\3\2\2\2\u00a0\u0519\3\2\2\2\u00a2\u051b\3\2\2\2\u00a4\u051d\3\2"+
		"\2\2\u00a6\u051f\3\2\2\2\u00a8\u0521\3\2\2\2\u00aa\u0523\3\2\2\2\u00ac"+
		"\u0525\3\2\2\2\u00ae\u0527\3\2\2\2\u00b0\u0529\3\2\2\2\u00b2\u052b\3\2"+
		"\2\2\u00b4\u052d\3\2\2\2\u00b6\u052f\3\2\2\2\u00b8\u0531\3\2\2\2\u00ba"+
		"\u0533\3\2\2\2\u00bc\u0535\3\2\2\2\u00be\u0537\3\2\2\2\u00c0\u053f\3\2"+
		"\2\2\u00c2\u00c5\5X-\2\u00c3\u00c5\5\4\3\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\7\2\2\3\u00ca\u00cb\5\6"+
		"\4\2\u00cb\u00cc\7\2\2\3\u00cc\u00ce\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00ce\3\3\2\2\2\u00cf\u00d0\7\u00cb\2\2\u00d0\u00d1\b\3"+
		"\1\2\u00d1\5\3\2\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d5\7\33\2\2\u00d4\u00d6"+
		"\5\6\4\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e2\3\2\2\2\u00d7"+
		"\u00d9\5\26\f\2\u00d8\u00da\5\6\4\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00e2\3\2\2\2\u00db\u00dc\5\16\b\2\u00dc\u00de\7\33\2\2\u00dd"+
		"\u00df\5\6\4\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00e2\5\36\20\2\u00e1\u00d2\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\7\3\2\2\2\u00e3\u00e4\7\u00b6"+
		"\2\2\u00e4\u00e5\5 \21\2\u00e5\u00e6\7 \2\2\u00e6\u00e7\5\64\33\2\u00e7"+
		"\t\3\2\2\2\u00e8\u00e9\7\u00b6\2\2\u00e9\u00eb\5\u00c0a\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\7\37\2\2"+
		"\u00ed\u00ee\7\u00b6\2\2\u00ee\u00f0\5\u00c0a\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00ff\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\7\37\2\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fc\5\b\5\2\u00f8\u00f9\7\37"+
		"\2\2\u00f9\u00fb\5\b\5\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u00f5\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\13\3\2\2\2\u0101\u0103"+
		"\5\64\33\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0108\3\2\2\2"+
		"\u0104\u0105\7\37\2\2\u0105\u0107\5\64\33\2\u0106\u0104\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\r\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010c\5\u00bc_\2\u010c\u010e\7\35\2\2\u010d"+
		"\u010f\5\f\7\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\7\36\2\2\u0111\17\3\2\2\2\u0112\u0114\7\u009e\2\2\u0113"+
		"\u0115\5\22\n\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0117\7\33\2\2\u0117\21\3\2\2\2\u0118\u011c\5\64\33\2\u0119"+
		"\u011c\5\24\13\2\u011a\u011c\5:\36\2\u011b\u0118\3\2\2\2\u011b\u0119\3"+
		"\2\2\2\u011b\u011a\3\2\2\2\u011c\23\3\2\2\2\u011d\u0124\7\3\2\2\u011e"+
		"\u0123\5\64\33\2\u011f\u0123\7\u00ca\2\2\u0120\u0123\5\u00c0a\2\u0121"+
		"\u0123\7\u00ca\2\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\3"+
		"\2\2\u0128\25\3\2\2\2\u0129\u012b\7k\2\2\u012a\u0129\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5\u00bc_\2\u012d\u012e\7\35\2"+
		"\2\u012e\u012f\5\n\6\2\u012f\u0130\7\36\2\2\u0130\u0131\5\30\r\2\u0131"+
		"\27\3\2\2\2\u0132\u0136\7\4\2\2\u0133\u0135\5\34\17\2\u0134\u0133\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\5\20\t\2\u013a\u0139\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7\5\2\2\u013d"+
		"\31\3\2\2\2\u013e\u0141\5\34\17\2\u013f\u0141\5\20\t\2\u0140\u013e\3\2"+
		"\2\2\u0140\u013f\3\2\2\2\u0141\33\3\2\2\2\u0142\u015e\5@!\2\u0143\u0144"+
		"\5\16\b\2\u0144\u0145\7\33\2\2\u0145\u015e\3\2\2\2\u0146\u015e\5H%\2\u0147"+
		"\u015e\5R*\2\u0148\u0149\5<\37\2\u0149\u014a\7\33\2\2\u014a\u015e\3\2"+
		"\2\2\u014b\u014c\5\"\22\2\u014c\u014d\7\33\2\2\u014d\u015e\3\2\2\2\u014e"+
		"\u014f\5$\23\2\u014f\u0150\7\33\2\2\u0150\u015e\3\2\2\2\u0151\u0152\5"+
		"\60\31\2\u0152\u0153\7\33\2\2\u0153\u015e\3\2\2\2\u0154\u0156\7\4\2\2"+
		"\u0155\u0157\5\34\17\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015e\7\5\2\2\u0159\u015a\7B\2\2\u015a\u015e\7\33\2\2\u015b"+
		"\u015c\7M\2\2\u015c\u015e\7\33\2\2\u015d\u0142\3\2\2\2\u015d\u0143\3\2"+
		"\2\2\u015d\u0146\3\2\2\2\u015d\u0147\3\2\2\2\u015d\u0148\3\2\2\2\u015d"+
		"\u014b\3\2\2\2\u015d\u014e\3\2\2\2\u015d\u0151\3\2\2\2\u015d\u0154\3\2"+
		"\2\2\u015d\u0159\3\2\2\2\u015d\u015b\3\2\2\2\u015e\35\3\2\2\2\u015f\u0166"+
		"\7\u00c8\2\2\u0160\u0166\7\u00c9\2\2\u0161\u0162\7\4\2\2\u0162\u0163\5"+
		"\34\17\2\u0163\u0164\7\5\2\2\u0164\u0166\3\2\2\2\u0165\u015f\3\2\2\2\u0165"+
		"\u0160\3\2\2\2\u0165\u0161\3\2\2\2\u0166\37\3\2\2\2\u0167\u016c\5\u00c0"+
		"a\2\u0168\u0169\7\34\2\2\u0169\u016b\5\u00c0a\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d!\3\2\2\2"+
		"\u016e\u016c\3\2\2\2\u016f\u0170\7\u00b6\2\2\u0170\u0175\5$\23\2\u0171"+
		"\u0172\7\37\2\2\u0172\u0174\5$\23\2\u0173\u0171\3\2\2\2\u0174\u0177\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176#\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u017c\5 \21\2\u0179\u017b\5&\24\2\u017a\u0179\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d%\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017f\u0180\5> \2\u0180\u0181\5(\25\2\u0181\'\3\2"+
		"\2\2\u0182\u0185\5\64\33\2\u0183\u0185\5:\36\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0183\3\2\2\2\u0185)\3\2\2\2\u0186\u0187\7\6\2\2\u0187\u018c\5f\64\2"+
		"\u0188\u0189\7\37\2\2\u0189\u018b\5f\64\2\u018a\u0188\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0190\7\7\2\2\u0190+\3\2\2\2\u0191\u0192\7N\2\2\u0192"+
		"\u0193\7\u00c1\2\2\u0193\u0194\7k\2\2\u0194\u0195\5\u009aN\2\u0195\u0196"+
		"\7\35\2\2\u0196\u0197\5b\62\2\u0197\u0198\7\37\2\2\u0198\u0199\5\u0096"+
		"L\2\u0199\u019a\7\37\2\2\u019a\u019b\5\u0098M\2\u019b\u019c\7\37\2\2\u019c"+
		"\u019d\5f\64\2\u019d\u019e\7\37\2\2\u019e\u019f\5*\26\2\u019f\u01a0\7"+
		"\36\2\2\u01a0-\3\2\2\2\u01a1\u01a2\7\u00c2\2\2\u01a2\u01a8\7\b\2\2\u01a3"+
		"\u01a9\5\62\32\2\u01a4\u01a5\7\t\2\2\u01a5\u01a6\5\62\32\2\u01a6\u01a7"+
		"\7\t\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a9"+
		"/\3\2\2\2\u01aa\u01ab\7\u0093\2\2\u01ab\u01ad\7\35\2\2\u01ac\u01ae\5\64"+
		"\33\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b3\3\2\2\2\u01af"+
		"\u01b0\7\"\2\2\u01b0\u01b2\5\64\33\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3"+
		"\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b6\u01b7\7\36\2\2\u01b7\61\3\2\2\2\u01b8\u01c1\5 \21"+
		"\2\u01b9\u01c1\5\24\13\2\u01ba\u01c1\5\16\b\2\u01bb\u01c1\5\u0086D\2\u01bc"+
		"\u01bd\7\35\2\2\u01bd\u01be\5\62\32\2\u01be\u01bf\7\36\2\2\u01bf\u01c1"+
		"\3\2\2\2\u01c0\u01b8\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c0"+
		"\u01bb\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1\63\3\2\2\2\u01c2\u01c7\5\62\32"+
		"\2\u01c3\u01c7\58\35\2\u01c4\u01c7\5\66\34\2\u01c5\u01c7\5<\37\2\u01c6"+
		"\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2"+
		"\2\2\u01c7\65\3\2\2\2\u01c8\u01c9\b\34\1\2\u01c9\u01cf\5\62\32\2\u01ca"+
		"\u01cb\7\35\2\2\u01cb\u01cc\5\66\34\2\u01cc\u01cd\7\36\2\2\u01cd\u01cf"+
		"\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf\u01d5\3\2\2\2\u01d0"+
		"\u01d1\f\4\2\2\u01d1\u01d2\t\2\2\2\u01d2\u01d4\5\66\34\5\u01d3\u01d0\3"+
		"\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\67\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\b\35\1\2\u01d9\u01e5\5\62"+
		"\32\2\u01da\u01db\5\66\34\2\u01db\u01dc\t\3\2\2\u01dc\u01dd\5\66\34\2"+
		"\u01dd\u01e5\3\2\2\2\u01de\u01e5\7\u00bc\2\2\u01df\u01e5\7\u00bd\2\2\u01e0"+
		"\u01e1\7\35\2\2\u01e1\u01e2\58\35\2\u01e2\u01e3\7\36\2\2\u01e3\u01e5\3"+
		"\2\2\2\u01e4\u01d8\3\2\2\2\u01e4\u01da\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4"+
		"\u01df\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5\u01eb\3\2\2\2\u01e6\u01e7\f\6"+
		"\2\2\u01e7\u01e8\t\4\2\2\u01e8\u01ea\58\35\7\u01e9\u01e6\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec9\3\2\2\2"+
		"\u01ed\u01eb\3\2\2\2\u01ee\u01ef\58\35\2\u01ef\u01f2\7\13\2\2\u01f0\u01f3"+
		"\5:\36\2\u01f1\u01f3\5\64\33\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2"+
		"\u01f3\u01f4\3\2\2\2\u01f4\u01f7\7\b\2\2\u01f5\u01f8\5:\36\2\u01f6\u01f8"+
		"\5\64\33\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fe\3\2\2\2"+
		"\u01f9\u01fa\7\35\2\2\u01fa\u01fb\5:\36\2\u01fb\u01fc\7\36\2\2\u01fc\u01fe"+
		"\3\2\2\2\u01fd\u01ee\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fe;\3\2\2\2\u01ff"+
		"\u0200\5 \21\2\u0200\u0201\7\f\2\2\u0201\u020a\3\2\2\2\u0202\u0203\7\f"+
		"\2\2\u0203\u020a\5 \21\2\u0204\u0205\5 \21\2\u0205\u0206\7\r\2\2\u0206"+
		"\u020a\3\2\2\2\u0207\u0208\7\r\2\2\u0208\u020a\5 \21\2\u0209\u01ff\3\2"+
		"\2\2\u0209\u0202\3\2\2\2\u0209\u0204\3\2\2\2\u0209\u0207\3\2\2\2\u020a"+
		"=\3\2\2\2\u020b\u020c\t\5\2\2\u020c?\3\2\2\2\u020d\u020f\5B\"\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0215\3\2\2\2\u0212\u0214\5D#\2\u0213\u0212\3\2\2\2\u0214\u0217"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0218\u021a\5F$\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021aA\3\2\2\2\u021b\u021c\7o\2\2\u021c\u021d\7\35\2\2\u021d\u021e"+
		"\58\35\2\u021e\u0221\7\36\2\2\u021f\u0222\5\30\r\2\u0220\u0222\5\32\16"+
		"\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222C\3\2\2\2\u0223\u0224"+
		"\7^\2\2\u0224\u0225\7o\2\2\u0225\u0226\7\35\2\2\u0226\u0227\58\35\2\u0227"+
		"\u022a\7\36\2\2\u0228\u022b\5\30\r\2\u0229\u022b\5\32\16\2\u022a\u0228"+
		"\3\2\2\2\u022a\u0229\3\2\2\2\u022bE\3\2\2\2\u022c\u022f\7^\2\2\u022d\u0230"+
		"\5\30\r\2\u022e\u0230\5\32\16\2\u022f\u022d\3\2\2\2\u022f\u022e\3\2\2"+
		"\2\u0230G\3\2\2\2\u0231\u0236\5J&\2\u0232\u0236\5L\'\2\u0233\u0236\5N"+
		"(\2\u0234\u0236\5P)\2\u0235\u0231\3\2\2\2\u0235\u0232\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0235\u0234\3\2\2\2\u0236I\3\2\2\2\u0237\u0238\7g\2\2\u0238\u0239"+
		"\7\35\2\2\u0239\u023a\5\"\22\2\u023a\u023b\7\33\2\2\u023b\u023c\58\35"+
		"\2\u023c\u023f\7\33\2\2\u023d\u0240\5<\37\2\u023e\u0240\5$\23\2\u023f"+
		"\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\7\36"+
		"\2\2\u0242\u0245\3\2\2\2\u0243\u0246\5\30\r\2\u0244\u0246\5\32\16\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246K\3\2\2\2\u0247\u0248\7\u00b9"+
		"\2\2\u0248\u0249\7\35\2\2\u0249\u024a\58\35\2\u024a\u024b\7\36\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024f\5\30\r\2\u024d\u024f\5\32\16\2\u024e\u024c"+
		"\3\2\2\2\u024e\u024d\3\2\2\2\u024fM\3\2\2\2\u0250\u0253\7[\2\2\u0251\u0254"+
		"\5\30\r\2\u0252\u0254\5\32\16\2\u0253\u0251\3\2\2\2\u0253\u0252\3\2\2"+
		"\2\u0254\u0255\3\2\2\2\u0255\u0256\7\u00b9\2\2\u0256\u0257\7\35\2\2\u0257"+
		"\u0258\58\35\2\u0258\u0259\7\36\2\2\u0259\u025a\7\33\2\2\u025aO\3\2\2"+
		"\2\u025b\u025c\7g\2\2\u025c\u025e\7\35\2\2\u025d\u025f\7\u00b6\2\2\u025e"+
		"\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5 "+
		"\21\2\u0261\u0262\7\b\2\2\u0262\u0263\5\u00be`\2\u0263\u0266\7\36\2\2"+
		"\u0264\u0267\5\30\r\2\u0265\u0267\5\32\16\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0265\3\2\2\2\u0267Q\3\2\2\2\u0268\u0269\7\u00a5\2\2\u0269\u026a\7\35"+
		"\2\2\u026a\u026b\5 \21\2\u026b\u026c\7\36\2\2\u026c\u026e\7\4\2\2\u026d"+
		"\u026f\5T+\2\u026e\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u026e\3\2\2"+
		"\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272\u0274\5V,\2\u0273\u0272"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\7\5\2\2\u0276"+
		"S\3\2\2\2\u0277\u0278\7E\2\2\u0278\u0279\5\62\32\2\u0279\u027c\7\b\2\2"+
		"\u027a\u027d\5\30\r\2\u027b\u027d\5\32\16\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027b\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027f\t\6\2\2\u027f\u0281\7\33"+
		"\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281U\3\2\2\2\u0282\u0283"+
		"\7T\2\2\u0283\u0286\7\b\2\2\u0284\u0287\5\30\r\2\u0285\u0287\5\32\16\2"+
		"\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0287W\3\2\2\2\u0288\u028a\7"+
		"\33\2\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0297\5Z"+
		".\2\u028f\u0291\7\33\2\2\u0290\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\5Z"+
		".\2\u0295\u0290\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u029d\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\7\33"+
		"\2\2\u029b\u029a\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029eY\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a5\5\\/\2\u02a1"+
		"\u02a5\5d\63\2\u02a2\u02a5\5,\27\2\u02a3\u02a5\5h\65\2\u02a4\u02a0\3\2"+
		"\2\2\u02a4\u02a1\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5"+
		"[\3\2\2\2\u02a6\u02a7\7N\2\2\u02a7\u02ab\7\u00a6\2\2\u02a8\u02a9\7o\2"+
		"\2\u02a9\u02aa\7\u0086\2\2\u02aa\u02ac\7d\2\2\u02ab\u02a8\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\5\u00a0Q\2\u02ae\u02af"+
		"\7\35\2\2\u02af\u02b4\5n8\2\u02b0\u02b1\7\37\2\2\u02b1\u02b3\5n8\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8\7\36\2\2\u02b8"+
		"\u02c0\3\2\2\2\u02b9\u02ba\7\u00ab\2\2\u02ba\u02bb\7 \2\2\u02bb\u02bc"+
		"\5^\60\2\u02bc\u02bd\7\u00ce\2\2\u02bd\u02be\7 \2\2\u02be\u02bf\5`\61"+
		"\2\u02bf\u02c1\3\2\2\2\u02c0\u02b9\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1]"+
		"\3\2\2\2\u02c2\u02c3\t\7\2\2\u02c3_\3\2\2\2\u02c4\u02c5\7\u00c2\2\2\u02c5"+
		"\u02c7\7\b\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02d0\3\2"+
		"\2\2\u02c8\u02ca\7\30\2\2\u02c9\u02cb\7\30\2\2\u02ca\u02c9\3\2\2\2\u02ca"+
		"\u02cb\3\2\2\2\u02cb\u02d1\3\2\2\2\u02cc\u02ce\7\31\2\2\u02cd\u02cf\7"+
		"\31\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02c8\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02dd\5\u00c0"+
		"a\2\u02d3\u02d5\7\30\2\2\u02d4\u02d6\7\30\2\2\u02d5\u02d4\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02dc\3\2\2\2\u02d7\u02d9\7\31\2\2\u02d8\u02da\7"+
		"\31\2\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02d3\3\2\2\2\u02db\u02d7\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02db\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02de\u02f8\3\2\2\2\u02df\u02e1\7\30\2\2\u02e0"+
		"\u02e2\7\30\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e8\3"+
		"\2\2\2\u02e3\u02e5\7\31\2\2\u02e4\u02e6\7\31\2\2\u02e5\u02e4\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02df\3\2\2\2\u02e7\u02e3\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02f4\5\u00c0a\2\u02ea\u02ec\7\30\2\2\u02eb"+
		"\u02ed\7\30\2\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f3\3"+
		"\2\2\2\u02ee\u02f0\7\31\2\2\u02ef\u02f1\7\31\2\2\u02f0\u02ef\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02ea\3\2\2\2\u02f2\u02ee\3\2"+
		"\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02e7\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9a\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc"+
		"\7\u00c2\2\2\u02fc\u02fe\7\b\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2"+
		"\2\u02fe\u0307\3\2\2\2\u02ff\u0301\7\30\2\2\u0300\u0302\7\30\2\2\u0301"+
		"\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0308\3\2\2\2\u0303\u0305\7\31"+
		"\2\2\u0304\u0306\7\31\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0308\3\2\2\2\u0307\u02ff\3\2\2\2\u0307\u0303\3\2\2\2\u0308\u0309\3\2"+
		"\2\2\u0309\u0314\5\u00c0a\2\u030a\u030c\7\30\2\2\u030b\u030d\7\30\2\2"+
		"\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0313\3\2\2\2\u030e\u0310"+
		"\7\31\2\2\u030f\u0311\7\31\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2"+
		"\u0311\u0313\3\2\2\2\u0312\u030a\3\2\2\2\u0312\u030e\3\2\2\2\u0313\u0315"+
		"\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u032f\3\2\2\2\u0316"+
		"\u0318\7\30\2\2\u0317\u0319\7\30\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3"+
		"\2\2\2\u0319\u031f\3\2\2\2\u031a\u031c\7\31\2\2\u031b\u031d\7\31\2\2\u031c"+
		"\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0316\3\2"+
		"\2\2\u031e\u031a\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u032b\5\u00c0a\2\u0321"+
		"\u0323\7\30\2\2\u0322\u0324\7\30\2\2\u0323\u0322\3\2\2\2\u0323\u0324\3"+
		"\2\2\2\u0324\u032a\3\2\2\2\u0325\u0327\7\31\2\2\u0326\u0328\7\31\2\2\u0327"+
		"\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u0321\3\2"+
		"\2\2\u0329\u0325\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u031e\3\2\2\2\u032e\u0331\3\2"+
		"\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331"+
		"\u032f\3\2\2\2\u0332\u0333\7\32\2\2\u0333c\3\2\2\2\u0334\u0335\7N\2\2"+
		"\u0335\u0336\7\u00ab\2\2\u0336\u0337\5p9\2\u0337\u0338\7\35\2\2\u0338"+
		"\u0339\5f\64\2\u0339\u0340\5\u00c0a\2\u033a\u033b\7\37\2\2\u033b\u033c"+
		"\5f\64\2\u033c\u033d\5\u00c0a\2\u033d\u033f\3\2\2\2\u033e\u033a\3\2\2"+
		"\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343"+
		"\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\7\36\2\2\u0344e\3\2\2\2\u0345"+
		"\u0346\5p9\2\u0346g\3\2\2\2\u0347\u0352\5\u0082B\2\u0348\u0349\7\u008e"+
		"\2\2\u0349\u034a\7C\2\2\u034a\u034f\5v<\2\u034b\u034c\7\37\2\2\u034c\u034e"+
		"\5v<\2\u034d\u034b\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0348\3\2"+
		"\2\2\u0352\u0353\3\2\2\2\u0353\u035a\3\2\2\2\u0354\u0355\7\u0081\2\2\u0355"+
		"\u0358\5t;\2\u0356\u0357\t\b\2\2\u0357\u0359\5t;\2\u0358\u0356\3\2\2\2"+
		"\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u035b"+
		"\3\2\2\2\u035bi\3\2\2\2\u035c\u0367\5l\67\2\u035d\u035e\7\u008e\2\2\u035e"+
		"\u035f\7C\2\2\u035f\u0364\5v<\2\u0360\u0361\7\37\2\2\u0361\u0363\5v<\2"+
		"\u0362\u0360\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365"+
		"\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u035d\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036f\3\2\2\2\u0369\u036a\7\u0081\2\2\u036a\u036d"+
		"\5t;\2\u036b\u036c\t\b\2\2\u036c\u036e\5t;\2\u036d\u036b\3\2\2\2\u036d"+
		"\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u0369\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370k\3\2\2\2\u0371\u0373\7\u00a3\2\2\u0372\u0374\t\t\2\2\u0373"+
		"\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u037a\5x"+
		"=\2\u0376\u0377\7\37\2\2\u0377\u0379\5x=\2\u0378\u0376\3\2\2\2\u0379\u037c"+
		"\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0389\3\2\2\2\u037c"+
		"\u037a\3\2\2\2\u037d\u0387\7i\2\2\u037e\u0383\5z>\2\u037f\u0380\7\37\2"+
		"\2\u0380\u0382\5z>\2\u0381\u037f\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0388\3\2\2\2\u0385\u0383\3\2\2\2\u0386"+
		"\u0388\5|?\2\u0387\u037e\3\2\2\2\u0387\u0386\3\2\2\2\u0388\u038a\3\2\2"+
		"\2\u0389\u037d\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u038c"+
		"\7\u00b8\2\2\u038c\u038e\5t;\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2"+
		"\u038e\u039d\3\2\2\2\u038f\u0390\7m\2\2\u0390\u0391\7C\2\2\u0391\u0396"+
		"\5t;\2\u0392\u0393\7\37\2\2\u0393\u0395\5t;\2\u0394\u0392\3\2\2\2\u0395"+
		"\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039b\3\2"+
		"\2\2\u0398\u0396\3\2\2\2\u0399\u039a\7n\2\2\u039a\u039c\5t;\2\u039b\u0399"+
		"\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u038f\3\2\2\2\u039d"+
		"\u039e\3\2\2\2\u039e\u03bc\3\2\2\2\u039f\u03a0\7\u00b3\2\2\u03a0\u03a1"+
		"\7\35\2\2\u03a1\u03a6\5t;\2\u03a2\u03a3\7\37\2\2\u03a3\u03a5\5t;\2\u03a4"+
		"\u03a2\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2"+
		"\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03b8\7\36\2\2\u03aa"+
		"\u03ab\7\37\2\2\u03ab\u03ac\7\35\2\2\u03ac\u03b1\5t;\2\u03ad\u03ae\7\37"+
		"\2\2\u03ae\u03b0\5t;\2\u03af\u03ad\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"\u03b5\7\36\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03aa\3\2\2\2\u03b7\u03ba\3"+
		"\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03bb\u0371\3\2\2\2\u03bb\u039f\3\2\2\2\u03bcm\3\2\2\2"+
		"\u03bd\u03c1\5\u00a6T\2\u03be\u03c0\5p9\2\u03bf\u03be\3\2\2\2\u03c0\u03c3"+
		"\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2o\3\2\2\2\u03c3"+
		"\u03c1\3\2\2\2\u03c4\u03c5\5\u0094K\2\u03c5q\3\2\2\2\u03c6\u03c9\5\u0084"+
		"C\2\u03c7\u03c9\5\u0086D\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9"+
		"s\3\2\2\2\u03ca\u03cb\b;\1\2\u03cb\u03fb\5\u0086D\2\u03cc\u03cd\7\35\2"+
		"\2\u03cd\u03ce\7\u00b6\2\2\u03ce\u03cf\5\64\33\2\u03cf\u03d0\7\36\2\2"+
		"\u03d0\u03fb\3\2\2\2\u03d1\u03d2\5\u00a0Q\2\u03d2\u03d3\7\34\2\2\u03d3"+
		"\u03d5\3\2\2\2\u03d4\u03d1\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2"+
		"\2\2\u03d6\u03fb\5\u00a6T\2\u03d7\u03d8\5\u0088E\2\u03d8\u03d9\5t;\17"+
		"\u03d9\u03fb\3\2\2\2\u03da\u03db\5\u009aN\2\u03db\u03e8\7\35\2\2\u03dc"+
		"\u03de\7Z\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2"+
		"\2\2\u03df\u03e4\5t;\2\u03e0\u03e1\7\37\2\2\u03e1\u03e3\5t;\2\u03e2\u03e0"+
		"\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u03e9\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03e9\7!\2\2\u03e8\u03dd\3\2"+
		"\2\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea"+
		"\u03eb\7\36\2\2\u03eb\u03fb\3\2\2\2\u03ec\u03ed\7\35\2\2\u03ed\u03ee\5"+
		"t;\2\u03ee\u03ef\7\36\2\2\u03ef\u03fb\3\2\2\2\u03f0\u03f2\7\u0086\2\2"+
		"\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5"+
		"\7d\2\2\u03f4\u03f1\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6"+
		"\u03f7\7\35\2\2\u03f7\u03f8\5j\66\2\u03f8\u03f9\7\36\2\2\u03f9\u03fb\3"+
		"\2\2\2\u03fa\u03ca\3\2\2\2\u03fa\u03cc\3\2\2\2\u03fa\u03d4\3\2\2\2\u03fa"+
		"\u03d7\3\2\2\2\u03fa\u03da\3\2\2\2\u03fa\u03ec\3\2\2\2\u03fa\u03f4\3\2"+
		"\2\2\u03fb\u043e\3\2\2\2\u03fc\u03fd\f\16\2\2\u03fd\u03fe\7%\2\2\u03fe"+
		"\u043d\5t;\17\u03ff\u0400\f\r\2\2\u0400\u0401\t\n\2\2\u0401\u043d\5t;"+
		"\16\u0402\u0403\f\f\2\2\u0403\u0404\t\13\2\2\u0404\u043d\5t;\r\u0405\u0406"+
		"\f\13\2\2\u0406\u0407\t\f\2\2\u0407\u043d\5t;\f\u0408\u0409\f\n\2\2\u0409"+
		"\u040a\t\r\2\2\u040a\u043d\5t;\13\u040b\u0416\f\t\2\2\u040c\u0417\t\16"+
		"\2\2\u040d\u0415\7{\2\2\u040e\u040f\7{\2\2\u040f\u0415\7\u0086\2\2\u0410"+
		"\u0415\7\u0080\2\2\u0411\u0415\7l\2\2\u0412\u0415\7\u0082\2\2\u0413\u0415"+
		"\7\u0098\2\2\u0414\u040d\3\2\2\2\u0414\u040e\3\2\2\2\u0414\u0410\3\2\2"+
		"\2\u0414\u0411\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0413\3\2\2\2\u0415\u0417"+
		"\3\2\2\2\u0416\u040c\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u043d\5t;\n\u0419\u041a\f\b\2\2\u041a\u041b\7:\2\2\u041b\u043d\5t;\t"+
		"\u041c\u041d\f\7\2\2\u041d\u041e\7\u008d\2\2\u041e\u043d\5t;\b\u041f\u0420"+
		"\f\20\2\2\u0420\u0421\7\34\2\2\u0421\u043d\5\u00c0a\2\u0422\u0424\f\4"+
		"\2\2\u0423\u0425\7\u0086\2\2\u0424\u0423\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u043a\7r\2\2\u0427\u0431\7\35\2\2\u0428\u0432\5j"+
		"\66\2\u0429\u042e\5t;\2\u042a\u042b\7\37\2\2\u042b\u042d\5t;\2\u042c\u042a"+
		"\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0428\3\2\2\2\u0431\u0429\3\2"+
		"\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u043b\7\36\2\2\u0434"+
		"\u0435\5\u009cO\2\u0435\u0436\7\34\2\2\u0436\u0438\3\2\2\2\u0437\u0434"+
		"\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043b\5\u00a0Q"+
		"\2\u043a\u0427\3\2\2\2\u043a\u0437\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u03fc"+
		"\3\2\2\2\u043c\u03ff\3\2\2\2\u043c\u0402\3\2\2\2\u043c\u0405\3\2\2\2\u043c"+
		"\u0408\3\2\2\2\u043c\u040b\3\2\2\2\u043c\u0419\3\2\2\2\u043c\u041c\3\2"+
		"\2\2\u043c\u041f\3\2\2\2\u043c\u0422\3\2\2\2\u043d\u0440\3\2\2\2\u043e"+
		"\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043fu\3\2\2\2\u0440\u043e\3\2\2\2"+
		"\u0441\u0443\5t;\2\u0442\u0444\t\17\2\2\u0443\u0442\3\2\2\2\u0443\u0444"+
		"\3\2\2\2\u0444w\3\2\2\2\u0445\u0452\7!\2\2\u0446\u0447\5\u00a0Q\2\u0447"+
		"\u0448\7\34\2\2\u0448\u0449\7!\2\2\u0449\u0452\3\2\2\2\u044a\u044f\5t"+
		";\2\u044b\u044d\7;\2\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e"+
		"\3\2\2\2\u044e\u0450\5\u008eH\2\u044f\u044c\3\2\2\2\u044f\u0450\3\2\2"+
		"\2\u0450\u0452\3\2\2\2\u0451\u0445\3\2\2\2\u0451\u0446\3\2\2\2\u0451\u044a"+
		"\3\2\2\2\u0452y\3\2\2\2\u0453\u0454\5\u009cO\2\u0454\u0455\7\34\2\2\u0455"+
		"\u0457\3\2\2\2\u0456\u0453\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2"+
		"\2\2\u0458\u045d\5\u00a0Q\2\u0459\u045b\7;\2\2\u045a\u0459\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\5\u00b8]\2\u045d\u045a"+
		"\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0464\3\2\2\2\u045f\u0460\7t\2\2\u0460"+
		"\u0461\7C\2\2\u0461\u0465\5\u00acW\2\u0462\u0463\7\u0086\2\2\u0463\u0465"+
		"\7t\2\2\u0464\u045f\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465"+
		"\u0483\3\2\2\2\u0466\u0470\7\35\2\2\u0467\u046c\5z>\2\u0468\u0469\7\37"+
		"\2\2\u0469\u046b\5z>\2\u046a\u0468\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046a"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0471\3\2\2\2\u046e\u046c\3\2\2\2\u046f"+
		"\u0471\5|?\2\u0470\u0467\3\2\2\2\u0470\u046f\3\2\2\2\u0471\u0472\3\2\2"+
		"\2\u0472\u0477\7\36\2\2\u0473\u0475\7;\2\2\u0474\u0473\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\5\u00b8]\2\u0477\u0474\3\2\2"+
		"\2\u0477\u0478\3\2\2\2\u0478\u0483\3\2\2\2\u0479\u047a\7\35\2\2\u047a"+
		"\u047b\5j\66\2\u047b\u0480\7\36\2\2\u047c\u047e\7;\2\2\u047d\u047c\3\2"+
		"\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\5\u00b8]\2\u0480"+
		"\u047d\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0483\3\2\2\2\u0482\u0456\3\2"+
		"\2\2\u0482\u0466\3\2\2\2\u0482\u0479\3\2\2\2\u0483{\3\2\2\2\u0484\u048b"+
		"\5z>\2\u0485\u0486\5~@\2\u0486\u0487\5z>\2\u0487\u0488\5\u0080A\2\u0488"+
		"\u048a\3\2\2\2\u0489\u0485\3\2\2\2\u048a\u048d\3\2\2\2\u048b\u0489\3\2"+
		"\2\2\u048b\u048c\3\2\2\2\u048c}\3\2\2\2\u048d\u048b\3\2\2\2\u048e\u0498"+
		"\3\2\2\2\u048f\u0491\7\177\2\2\u0490\u0492\7\u008f\2\2\u0491\u0490\3\2"+
		"\2\2\u0491\u0492\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0495\7v\2\2\u0494"+
		"\u048f\3\2\2\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2"+
		"\2\2\u0496\u0498\7}\2\2\u0497\u048e\3\2\2\2\u0497\u0494\3\2\2\2\u0498"+
		"\177\3\2\2\2\u0499\u049a\7\u008b\2\2\u049a\u049b\5t;\2\u049b\u0081\3\2"+
		"\2\2\u049c\u049e\7\u00a3\2\2\u049d\u049f\t\t\2\2\u049e\u049d\3\2\2\2\u049e"+
		"\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a5\5x=\2\u04a1\u04a2\7\37"+
		"\2\2\u04a2\u04a4\5x=\2\u04a3\u04a1\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3"+
		"\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04b4\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8"+
		"\u04b2\7i\2\2\u04a9\u04ae\5z>\2\u04aa\u04ab\7\37\2\2\u04ab\u04ad\5z>\2"+
		"\u04ac\u04aa\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac\3\2\2\2\u04ae\u04af"+
		"\3\2\2\2\u04af\u04b3\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b3\5|?\2\u04b2"+
		"\u04a9\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4\u04a8\3\2"+
		"\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b7\7\u00b8\2\2\u04b7"+
		"\u04b9\5t;\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04c8\3\2\2"+
		"\2\u04ba\u04bb\7m\2\2\u04bb\u04bc\7C\2\2\u04bc\u04c1\5t;\2\u04bd\u04be"+
		"\7\37\2\2\u04be\u04c0\5t;\2\u04bf\u04bd\3\2\2\2\u04c0\u04c3\3\2\2\2\u04c1"+
		"\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c6\3\2\2\2\u04c3\u04c1\3\2"+
		"\2\2\u04c4\u04c5\7n\2\2\u04c5\u04c7\5t;\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7"+
		"\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04ba\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04e7\3\2\2\2\u04ca\u04cb\7\u00b3\2\2\u04cb\u04cc\7\35\2\2\u04cc\u04d1"+
		"\5t;\2\u04cd\u04ce\7\37\2\2\u04ce\u04d0\5t;\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04e3\7\36\2\2\u04d5\u04d6\7\37\2\2\u04d6"+
		"\u04d7\7\35\2\2\u04d7\u04dc\5t;\2\u04d8\u04d9\7\37\2\2\u04d9\u04db\5t"+
		";\2\u04da\u04d8\3\2\2\2\u04db\u04de\3\2\2\2\u04dc\u04da\3\2\2\2\u04dc"+
		"\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04dc\3\2\2\2\u04df\u04e0\7\36"+
		"\2\2\u04e0\u04e2\3\2\2\2\u04e1\u04d5\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3"+
		"\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e7\3\2\2\2\u04e5\u04e3\3\2"+
		"\2\2\u04e6\u049c\3\2\2\2\u04e6\u04ca\3\2\2\2\u04e7\u0083\3\2\2\2\u04e8"+
		"\u04ea\t\13\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3"+
		"\2\2\2\u04eb\u04ee\7\u00c3\2\2\u04ec\u04ee\7!\2\2\u04ed\u04e9\3\2\2\2"+
		"\u04ed\u04ec\3\2\2\2\u04ee\u0085\3\2\2\2\u04ef\u04fb\7\u00c3\2\2\u04f0"+
		"\u04fb\7\u00c5\2\2\u04f1\u04fb\7\u00c6\2\2\u04f2\u04fb\7\u0088\2\2\u04f3"+
		"\u04fb\7Q\2\2\u04f4\u04fb\7P\2\2\u04f5\u04fb\7R\2\2\u04f6\u04f7\7\35\2"+
		"\2\u04f7\u04f8\5\u0086D\2\u04f8\u04f9\7\36\2\2\u04f9\u04fb\3\2\2\2\u04fa"+
		"\u04ef\3\2\2\2\u04fa\u04f0\3\2\2\2\u04fa\u04f1\3\2\2\2\u04fa\u04f2\3\2"+
		"\2\2\u04fa\u04f3\3\2\2\2\u04fa\u04f4\3\2\2\2\u04fa\u04f5\3\2\2\2\u04fa"+
		"\u04f6\3\2\2\2\u04fb\u0087\3\2\2\2\u04fc\u04fd\t\20\2\2\u04fd\u0089\3"+
		"\2\2\2\u04fe\u04ff\7\u00c5\2\2\u04ff\u008b\3\2\2\2\u0500\u0503\5t;\2\u0501"+
		"\u0503\5n8\2\u0502\u0500\3\2\2\2\u0502\u0501\3\2\2\2\u0503\u008d\3\2\2"+
		"\2\u0504\u0505\t\21\2\2\u0505\u008f\3\2\2\2\u0506\u0507\t\22\2\2\u0507"+
		"\u0091\3\2\2\2\u0508\u050a\13\2\2\2\u0509\u0508\3\2\2\2\u050a\u050b\3"+
		"\2\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0093\3\2\2\2\u050d"+
		"\u050e\5\u00c0a\2\u050e\u0095\3\2\2\2\u050f\u0510\5\u00c0a\2\u0510\u0097"+
		"\3\2\2\2\u0511\u0512\5\u00c0a\2\u0512\u0099\3\2\2\2\u0513\u0514\5\u00c0"+
		"a\2\u0514\u009b\3\2\2\2\u0515\u0516\5\u00c0a\2\u0516\u009d\3\2\2\2\u0517"+
		"\u0518\5\u00c0a\2\u0518\u009f\3\2\2\2\u0519\u051a\5\u00c0a\2\u051a\u00a1"+
		"\3\2\2\2\u051b\u051c\5\u00c0a\2\u051c\u00a3\3\2\2\2\u051d\u051e\5\u00c0"+
		"a\2\u051e\u00a5\3\2\2\2\u051f\u0520\5\u00c0a\2\u0520\u00a7\3\2\2\2\u0521"+
		"\u0522\5\u00c0a\2\u0522\u00a9\3\2\2\2\u0523\u0524\5\u00c0a\2\u0524\u00ab"+
		"\3\2\2\2\u0525\u0526\5\u00c0a\2\u0526\u00ad\3\2\2\2\u0527\u0528\5\u00c0"+
		"a\2\u0528\u00af\3\2\2\2\u0529\u052a\5\u00c0a\2\u052a\u00b1\3\2\2\2\u052b"+
		"\u052c\5\u00c0a\2\u052c\u00b3\3\2\2\2\u052d\u052e\5\u00c0a\2\u052e\u00b5"+
		"\3\2\2\2\u052f\u0530\5\u00c0a\2\u0530\u00b7\3\2\2\2\u0531\u0532\7\u00c2"+
		"\2\2\u0532\u00b9\3\2\2\2\u0533\u0534\5\u00c0a\2\u0534\u00bb\3\2\2\2\u0535"+
		"\u0536\5\u00c0a\2\u0536\u00bd\3\2\2\2\u0537\u0538\5\u00c0a\2\u0538\u00bf"+
		"\3\2\2\2\u0539\u0540\7\u00c2\2\2\u053a\u0540\7\u00c5\2\2\u053b\u053c\7"+
		"\35\2\2\u053c\u053d\5\u00c0a\2\u053d\u053e\7\36\2\2\u053e\u0540\3\2\2"+
		"\2\u053f\u0539\3\2\2\2\u053f\u053a\3\2\2\2\u053f\u053b\3\2\2\2\u0540\u00c1"+
		"\3\2\2\2\u00b6\u00c4\u00c6\u00cd\u00d5\u00d9\u00de\u00e1\u00ea\u00f1\u00f5"+
		"\u00fc\u00ff\u0102\u0108\u010e\u0114\u011b\u0122\u0124\u012a\u0136\u013a"+
		"\u0140\u0156\u015d\u0165\u016c\u0175\u017c\u0184\u018c\u01a8\u01ad\u01b3"+
		"\u01c0\u01c6\u01ce\u01d5\u01e4\u01eb\u01f2\u01f7\u01fd\u0209\u0210\u0215"+
		"\u0219\u0221\u022a\u022f\u0235\u023f\u0245\u024e\u0253\u025e\u0266\u0270"+
		"\u0273\u027c\u0280\u0286\u028b\u0292\u0297\u029d\u02a4\u02ab\u02b4\u02c0"+
		"\u02c6\u02ca\u02ce\u02d0\u02d5\u02d9\u02db\u02dd\u02e1\u02e5\u02e7\u02ec"+
		"\u02f0\u02f2\u02f4\u02f8\u02fd\u0301\u0305\u0307\u030c\u0310\u0312\u0314"+
		"\u0318\u031c\u031e\u0323\u0327\u0329\u032b\u032f\u0340\u034f\u0352\u0358"+
		"\u035a\u0364\u0367\u036d\u036f\u0373\u037a\u0383\u0387\u0389\u038d\u0396"+
		"\u039b\u039d\u03a6\u03b1\u03b8\u03bb\u03c1\u03c8\u03d4\u03dd\u03e4\u03e8"+
		"\u03f1\u03f4\u03fa\u0414\u0416\u0424\u042e\u0431\u0437\u043a\u043c\u043e"+
		"\u0443\u044c\u044f\u0451\u0456\u045a\u045d\u0464\u046c\u0470\u0474\u0477"+
		"\u047d\u0480\u0482\u048b\u0491\u0494\u0497\u049e\u04a5\u04ae\u04b2\u04b4"+
		"\u04b8\u04c1\u04c6\u04c8\u04d1\u04dc\u04e3\u04e6\u04e9\u04ed\u04fa\u0502"+
		"\u050b\u053f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}