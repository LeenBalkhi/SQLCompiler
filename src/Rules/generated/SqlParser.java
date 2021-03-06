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
		T__24=25, SCOL=26, DOT=27, OPEN_PAR=28, CLOSE_PAR=29, COMMA=30, ASSIGN=31, 
		STAR=32, PLUS=33, MINUS=34, TILDE=35, PIPE2=36, DIV=37, MOD=38, LT2=39, 
		GT2=40, AMP=41, PIPE=42, LT=43, LT_EQ=44, GT=45, GT_EQ=46, EQ=47, NOT_EQ1=48, 
		NOT_EQ2=49, K_ABORT=50, K_ACTION=51, K_ADD=52, K_AFTER=53, K_ALL=54, K_ALTER=55, 
		K_ANALYZE=56, K_AND=57, K_AS=58, K_ASC=59, K_ATTACH=60, K_AUTOINCREMENT=61, 
		K_BEFORE=62, K_BEGIN=63, K_BETWEEN=64, K_BREAK=65, K_BY=66, K_CASCADE=67, 
		K_CASE=68, K_CAST=69, K_CHECK=70, K_COLLATE=71, K_COLUMN=72, K_COMMIT=73, 
		K_CONFLICT=74, K_CONSTRAINT=75, K_CONTINUE=76, K_CREATE=77, K_CROSS=78, 
		K_CURRENT_DATE=79, K_CURRENT_TIME=80, K_CURRENT_TIMESTAMP=81, K_DATABASE=82, 
		K_DEFAULT=83, K_DEFERRABLE=84, K_DEFERRED=85, K_DELETE=86, K_DESC=87, 
		K_DETACH=88, K_DISTINCT=89, K_DO=90, K_DROP=91, K_EACH=92, K_ELSE=93, 
		K_END=94, K_ENABLE=95, K_ESCAPE=96, K_EXCEPT=97, K_EXCLUSIVE=98, K_EXISTS=99, 
		K_EXPLAIN=100, K_FAIL=101, K_FOR=102, K_FOREIGN=103, K_FROM=104, K_FULL=105, 
		K_FUNCTION=106, K_GLOB=107, K_GROUP=108, K_HAVING=109, K_IF=110, K_IGNORE=111, 
		K_IMMEDIATE=112, K_IN=113, K_INDEX=114, K_INDEXED=115, K_INITIALLY=116, 
		K_INNER=117, K_INSERT=118, K_INSTEAD=119, K_INTERSECT=120, K_INTO=121, 
		K_IS=122, K_ISNULL=123, K_JOIN=124, K_KEY=125, K_LEFT=126, K_LIKE=127, 
		K_LIMIT=128, K_MATCH=129, K_NATURAL=130, K_NEXTVAL=131, K_NO=132, K_NOT=133, 
		K_NOTNULL=134, K_NULL=135, K_OF=136, K_OFFSET=137, K_ON=138, K_ONLY=139, 
		K_OR=140, K_ORDER=141, K_OUTER=142, K_PLAN=143, K_PRAGMA=144, K_PRIMARY=145, 
		K_PRINT=146, K_QUERY=147, K_RAISE=148, K_RECURSIVE=149, K_REFERENCES=150, 
		K_REGEXP=151, K_REINDEX=152, K_RELEASE=153, K_RENAME=154, K_REPLACE=155, 
		K_RESTRICT=156, K_RETURN=157, K_RIGHT=158, K_ROLLBACK=159, K_ROW=160, 
		K_SAVEPOINT=161, K_SELECT=162, K_SET=163, K_SWITCH=164, K_TABLE=165, K_TEMP=166, 
		K_TEMPORARY=167, K_THEN=168, K_TO=169, K_TYPE=170, K_TRANSACTION=171, 
		K_TRIGGER=172, K_UNION=173, K_UNIQUE=174, K_UPDATE=175, K_USING=176, K_VACUUM=177, 
		K_VALUES=178, K_VIEW=179, K_VIRTUAL=180, K_VAR=181, K_WHEN=182, K_WHERE=183, 
		K_WHILE=184, K_WITH=185, K_WITHOUT=186, K_TRUE=187, K_FALSE=188, K_CSV=189, 
		K_JSON=190, K_PARQUET=191, K_AGGREGATION=192, K_PATH=193, IDENTIFIER=194, 
		NUMERIC_LITERAL=195, BIND_PARAMETER=196, STRING_LITERAL=197, BLOB_LITERAL=198, 
		SINGLE_LINE_COMMENT=199, JAVA_SINGLE_LINE_COMMENT=200, MULTILINE_COMMENT=201, 
		SPACES=202, UNEXPECTED_CHAR=203, DISK=204, FILEPATH=205;
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
		RULE_switch_case = 41, RULE_switch_default = 42, RULE_sql_stmt = 43, RULE_create_table_stmt = 44, 
		RULE_file = 45, RULE_path = 46, RULE_jar_path = 47, RULE_create_type = 48, 
		RULE_type = 49, RULE_factored_select_stmt = 50, RULE_select_stmt = 51, 
		RULE_select_or_values = 52, RULE_column_def = 53, RULE_type_name = 54, 
		RULE_column_default_value = 55, RULE_expr = 56, RULE_ordering_term = 57, 
		RULE_result_column = 58, RULE_table_or_subquery = 59, RULE_join_clause = 60, 
		RULE_join_operator = 61, RULE_join_constraint = 62, RULE_select_core = 63, 
		RULE_signed_number = 64, RULE_literal_value = 65, RULE_unary_operator = 66, 
		RULE_error_message = 67, RULE_module_argument = 68, RULE_column_alias = 69, 
		RULE_keyword = 70, RULE_unknown = 71, RULE_name = 72, RULE_class_name = 73, 
		RULE_method_name = 74, RULE_function_name = 75, RULE_database_name = 76, 
		RULE_source_table_name = 77, RULE_table_name = 78, RULE_table_or_index_name = 79, 
		RULE_new_table_name = 80, RULE_column_name = 81, RULE_collation_name = 82, 
		RULE_foreign_table = 83, RULE_index_name = 84, RULE_trigger_name = 85, 
		RULE_view_name = 86, RULE_module_name = 87, RULE_pragma_name = 88, RULE_savepoint_name = 89, 
		RULE_table_alias = 90, RULE_transaction_name = 91, RULE_method_ID = 92, 
		RULE_array_name = 93, RULE_any_name = 94;
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
			"sql_stmt", "create_table_stmt", "file", "path", "jar_path", "create_type", 
			"type", "factored_select_stmt", "select_stmt", "select_or_values", "column_def", 
			"type_name", "column_default_value", "expr", "ordering_term", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "signed_number", "literal_value", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "unknown", "name", "class_name", 
			"method_name", "function_name", "database_name", "source_table_name", 
			"table_name", "table_or_index_name", "new_table_name", "column_name", 
			"collation_name", "foreign_table", "index_name", "trigger_name", "view_name", 
			"module_name", "pragma_name", "savepoint_name", "table_alias", "transaction_name", 
			"method_ID", "array_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'{'", "'}'", "'['", "']'", "':'", "'''", "'&&'", "'?'", 
			"'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "'>>>='", "'\\'", "'/'", "'.jar'", "'->'", "';'", "'.'", 
			"'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", 
			"'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			"'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
			"STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", 
			"AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", 
			"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
			"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", 
			"K_BEGIN", "K_BETWEEN", "K_BREAK", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", 
			"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
			"K_CONTINUE", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", 
			"K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", 
			"K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DO", "K_DROP", "K_EACH", 
			"K_ELSE", "K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", 
			"K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", 
			"K_FUNCTION", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", 
			"K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", 
			"K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", 
			"K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", 
			"K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_ONLY", 
			"K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_PRINT", 
			"K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", 
			"K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RETURN", "K_RIGHT", 
			"K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_SWITCH", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TYPE", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_VAR", "K_WHEN", "K_WHERE", "K_WHILE", 
			"K_WITH", "K_WITHOUT", "K_TRUE", "K_FALSE", "K_CSV", "K_JSON", "K_PARQUET", 
			"K_AGGREGATION", "K_PATH", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
			"STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "JAVA_SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "DISK", "FILEPATH"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			java_stmt();
			}
			setState(191);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
			setState(193);
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
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				variable_declaration();
				setState(197);
				match(SCOL);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==OPEN_PAR || _la==K_CREATE || _la==K_FUNCTION || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (K_SELECT - 162)) | (1L << (K_VALUES - 162)) | (1L << (K_VAR - 162)) | (1L << (IDENTIFIER - 162)) | (1L << (STRING_LITERAL - 162)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 162)) | (1L << (MULTILINE_COMMENT - 162)))) != 0)) {
					{
					setState(198);
					java_stmt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				java_function_declaration();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==OPEN_PAR || _la==K_CREATE || _la==K_FUNCTION || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (K_SELECT - 162)) | (1L << (K_VALUES - 162)) | (1L << (K_VAR - 162)) | (1L << (IDENTIFIER - 162)) | (1L << (STRING_LITERAL - 162)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 162)) | (1L << (MULTILINE_COMMENT - 162)))) != 0)) {
					{
					setState(202);
					java_stmt();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				java_function_call();
				setState(206);
				match(SCOL);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==OPEN_PAR || _la==K_CREATE || _la==K_FUNCTION || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (K_SELECT - 162)) | (1L << (K_VALUES - 162)) | (1L << (K_VAR - 162)) | (1L << (IDENTIFIER - 162)) | (1L << (STRING_LITERAL - 162)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 162)) | (1L << (MULTILINE_COMMENT - 162)))) != 0)) {
					{
					setState(207);
					java_stmt();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				comments();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				sql_stmt();
				setState(212);
				match(SCOL);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==OPEN_PAR || _la==K_CREATE || _la==K_FUNCTION || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (K_SELECT - 162)) | (1L << (K_VALUES - 162)) | (1L << (K_VAR - 162)) | (1L << (IDENTIFIER - 162)) | (1L << (STRING_LITERAL - 162)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 162)) | (1L << (MULTILINE_COMMENT - 162)))) != 0)) {
					{
					setState(213);
					java_stmt();
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
			setState(218);
			match(K_VAR);
			setState(219);
			variable();
			setState(220);
			match(ASSIGN);
			setState(221);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(223);
				match(K_VAR);
				setState(224);
				any_name();
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					match(K_VAR);
					setState(229);
					any_name();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==K_VAR) {
				{
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(235);
					match(COMMA);
					}
				}

				setState(238);
				default_parameter();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					default_parameter();
					}
					}
					setState(245);
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
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_CURRENT_DATE - 79)) | (1L << (K_CURRENT_TIME - 79)) | (1L << (K_CURRENT_TIMESTAMP - 79)) | (1L << (K_NULL - 79)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (K_TRUE - 187)) | (1L << (K_FALSE - 187)) | (1L << (IDENTIFIER - 187)) | (1L << (NUMERIC_LITERAL - 187)) | (1L << (STRING_LITERAL - 187)) | (1L << (BLOB_LITERAL - 187)))) != 0)) {
				{
				setState(248);
				expression();
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				{
				setState(252);
				expression();
				}
				}
				}
				setState(257);
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
			setState(258);
			method_ID();
			setState(259);
			match(OPEN_PAR);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(260);
				argument_list();
				}
				break;
			}
			setState(263);
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
			setState(265);
			match(K_RETURN);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_CURRENT_DATE - 79)) | (1L << (K_CURRENT_TIME - 79)) | (1L << (K_CURRENT_TIMESTAMP - 79)) | (1L << (K_NULL - 79)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (K_TRUE - 187)) | (1L << (K_FALSE - 187)) | (1L << (IDENTIFIER - 187)) | (1L << (NUMERIC_LITERAL - 187)) | (1L << (STRING_LITERAL - 187)) | (1L << (BLOB_LITERAL - 187)))) != 0)) {
				{
				setState(266);
				return_value();
				}
			}

			setState(269);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
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
			setState(276);
			match(T__0);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(277);
						expression();
						}
						break;
					case 2:
						{
						setState(278);
						match(SPACES);
						}
						break;
					case 3:
						{
						setState(279);
						any_name();
						}
						break;
					case 4:
						{
						setState(280);
						match(SPACES);
						}
						break;
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(286);
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
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FUNCTION) {
				{
				setState(288);
				match(K_FUNCTION);
				}
			}

			setState(291);
			method_ID();
			setState(292);
			match(OPEN_PAR);
			{
			setState(293);
			parameter_list();
			}
			setState(294);
			match(CLOSE_PAR);
			setState(295);
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
			setState(297);
			match(T__1);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_BREAK - 65)) | (1L << (K_CONTINUE - 65)) | (1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (K_PRINT - 146)) | (1L << (K_SELECT - 146)) | (1L << (K_SWITCH - 146)) | (1L << (K_VALUES - 146)) | (1L << (K_VAR - 146)) | (1L << (K_WHILE - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (STRING_LITERAL - 146)))) != 0)) {
				{
				{
				setState(298);
				java_body();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_RETURN) {
				{
				setState(304);
				return_stmt();
				}
			}

			setState(307);
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
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__9:
			case T__10:
			case OPEN_PAR:
			case K_BREAK:
			case K_CONTINUE:
			case K_CREATE:
			case K_DO:
			case K_FOR:
			case K_IF:
			case K_PRINT:
			case K_SELECT:
			case K_SWITCH:
			case K_VALUES:
			case K_VAR:
			case K_WHILE:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				java_body();
				}
				break;
			case K_RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
	public static class SqlstmtContext extends Java_bodyContext {
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public SqlstmtContext(Java_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSqlstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSqlstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitSqlstmt(this);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new CondBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				conditional_stmt();
				}
				break;
			case 2:
				_localctx = new JfcBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				java_function_call();
				setState(315);
				match(SCOL);
				}
				break;
			case 3:
				_localctx = new LoopBodyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				loop_stmt();
				}
				break;
			case 4:
				_localctx = new SwitchBodyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				switch_stmt();
				}
				break;
			case 5:
				_localctx = new IncremetBodyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				increment();
				setState(320);
				match(SCOL);
				}
				break;
			case 6:
				_localctx = new VarDecBodyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				variable_declaration();
				setState(323);
				match(SCOL);
				}
				break;
			case 7:
				_localctx = new VarAssignBodyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				variable_assignment();
				setState(326);
				match(SCOL);
				}
				break;
			case 8:
				_localctx = new PrintBodyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(328);
				print();
				setState(329);
				match(SCOL);
				}
				break;
			case 9:
				_localctx = new ScopeBodyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(331);
				match(T__1);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_BREAK - 65)) | (1L << (K_CONTINUE - 65)) | (1L << (K_CREATE - 65)) | (1L << (K_DO - 65)) | (1L << (K_FOR - 65)) | (1L << (K_IF - 65)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (K_PRINT - 146)) | (1L << (K_SELECT - 146)) | (1L << (K_SWITCH - 146)) | (1L << (K_VALUES - 146)) | (1L << (K_VAR - 146)) | (1L << (K_WHILE - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (STRING_LITERAL - 146)))) != 0)) {
					{
					setState(332);
					java_body();
					}
				}

				setState(335);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new SqlstmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(336);
				sql_stmt();
				}
				break;
			case 11:
				_localctx = new BreakBodyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(337);
				match(K_BREAK);
				setState(338);
				match(SCOL);
				}
				break;
			case 12:
				_localctx = new ContimueBodyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(339);
				match(K_CONTINUE);
				setState(340);
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
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAVA_SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(JAVA_SINGLE_LINE_COMMENT);
				}
				break;
			case MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(MULTILINE_COMMENT);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(T__1);
				setState(346);
				java_body();
				setState(347);
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
			setState(351);
			any_name();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					match(DOT);
					setState(353);
					any_name();
					}
					} 
				}
				setState(358);
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
			setState(359);
			match(K_VAR);
			setState(360);
			variable_assignment();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(361);
				match(COMMA);
				setState(362);
				variable_assignment();
				}
				}
				setState(367);
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
			setState(368);
			variable();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ASSIGN))) != 0)) {
				{
				{
				setState(369);
				assginment();
				}
				}
				setState(374);
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
			setState(375);
			assignment_operator();
			setState(376);
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
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
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
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				logical_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
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
			setState(383);
			match(T__3);
			setState(384);
			type();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(385);
				match(COMMA);
				setState(386);
				type();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
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
			setState(394);
			match(K_CREATE);
			setState(395);
			match(K_AGGREGATION);
			setState(396);
			match(K_FUNCTION);
			setState(397);
			function_name();
			setState(398);
			match(OPEN_PAR);
			setState(399);
			match(T__0);
			setState(400);
			jar_path();
			setState(401);
			match(T__0);
			setState(402);
			match(COMMA);
			setState(403);
			match(T__0);
			setState(404);
			class_name();
			setState(405);
			match(T__0);
			setState(406);
			match(COMMA);
			setState(407);
			match(T__0);
			setState(408);
			method_name();
			setState(409);
			match(T__0);
			setState(410);
			match(COMMA);
			setState(411);
			type();
			setState(412);
			match(COMMA);
			setState(413);
			param_array();
			setState(414);
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
			setState(416);
			match(IDENTIFIER);
			setState(417);
			match(T__5);
			setState(423);
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
				setState(418);
				value();
				}
				break;
			case T__6:
				{
				setState(419);
				match(T__6);
				setState(420);
				value();
				setState(421);
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
			setState(425);
			match(K_PRINT);
			setState(426);
			match(OPEN_PAR);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__9) | (1L << T__10) | (1L << OPEN_PAR))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_CURRENT_DATE - 79)) | (1L << (K_CURRENT_TIME - 79)) | (1L << (K_CURRENT_TIMESTAMP - 79)) | (1L << (K_NULL - 79)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (K_TRUE - 187)) | (1L << (K_FALSE - 187)) | (1L << (IDENTIFIER - 187)) | (1L << (NUMERIC_LITERAL - 187)) | (1L << (STRING_LITERAL - 187)) | (1L << (BLOB_LITERAL - 187)))) != 0)) {
				{
				setState(427);
				expression();
				}
			}

			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(430);
				match(PLUS);
				{
				setState(431);
				expression();
				}
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
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
	public static class TableAsValueContext extends ValueContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TableAsValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTableAsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTableAsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitTableAsValue(this);
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
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new VarValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				variable();
				}
				break;
			case 2:
				_localctx = new StrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				string();
				}
				break;
			case 3:
				_localctx = new JfcValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				java_function_call();
				}
				break;
			case 4:
				_localctx = new LvValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				literal_value();
				}
				break;
			case 5:
				_localctx = new ParenthValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(OPEN_PAR);
				setState(444);
				value();
				setState(445);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				_localctx = new TableAsValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				table_name();
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
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				boolean_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				math_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
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
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				_localctx = new ValueMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(457);
				value();
				}
				break;
			case 2:
				{
				_localctx = new ParenthMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458);
				match(OPEN_PAR);
				setState(459);
				math_expression(0);
				setState(460);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticMathContext(new Math_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_math_expression);
					setState(464);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(465);
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
					setState(466);
					math_expression(3);
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new ValBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(473);
				value();
				}
				break;
			case 2:
				{
				_localctx = new CompareBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(474);
				math_expression(0);
				setState(475);
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
				setState(476);
				math_expression(0);
				}
				break;
			case 3:
				{
				_localctx = new TrueBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(478);
				match(K_TRUE);
				}
				break;
			case 4:
				{
				_localctx = new FalseBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(479);
				match(K_FALSE);
				}
				break;
			case 5:
				{
				_localctx = new ParenthBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480);
				match(OPEN_PAR);
				setState(481);
				boolean_expression(0);
				setState(482);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleBoolContext(new Boolean_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolean_expression);
					setState(486);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(487);
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
					setState(488);
					boolean_expression(5);
					}
					} 
				}
				setState(493);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new NormalLogContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				boolean_expression(0);
				{
				setState(495);
				match(T__8);
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(496);
					logical_condition();
					}
					break;
				case 2:
					{
					setState(497);
					expression();
					}
					break;
				}
				setState(500);
				match(T__5);
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(501);
					logical_condition();
					}
					break;
				case 2:
					{
					setState(502);
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
				setState(505);
				match(OPEN_PAR);
				setState(506);
				logical_condition();
				setState(507);
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
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new PostIncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				variable();
				setState(512);
				((PostIncContext)_localctx).op = match(T__9);
				}
				break;
			case 2:
				_localctx = new PreIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				((PreIncContext)_localctx).op = match(T__9);
				setState(515);
				variable();
				}
				break;
			case 3:
				_localctx = new PostDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				variable();
				setState(517);
				((PostDecContext)_localctx).op = match(T__10);
				}
				break;
			case 4:
				_localctx = new PreDecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				((PreDecContext)_localctx).op = match(T__10);
				setState(520);
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
			setState(523);
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
			setState(526); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(525);
					if_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(528); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(530);
					else_if_stmt();
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(536);
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
			setState(539);
			match(K_IF);
			setState(540);
			match(OPEN_PAR);
			setState(541);
			boolean_expression(0);
			setState(542);
			match(CLOSE_PAR);
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(543);
				block();
				}
				break;
			case 2:
				{
				setState(544);
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
			setState(547);
			match(K_ELSE);
			setState(548);
			match(K_IF);
			setState(549);
			match(OPEN_PAR);
			setState(550);
			boolean_expression(0);
			setState(551);
			match(CLOSE_PAR);
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(552);
				block();
				}
				break;
			case 2:
				{
				setState(553);
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
			setState(556);
			match(K_ELSE);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(557);
				block();
				}
				break;
			case 2:
				{
				setState(558);
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
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				for_loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				do_while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
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
			setState(567);
			match(K_FOR);
			setState(568);
			match(OPEN_PAR);
			setState(569);
			variable_declaration();
			setState(570);
			match(SCOL);
			setState(571);
			boolean_expression(0);
			setState(572);
			match(SCOL);
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(573);
				increment();
				}
				break;
			case 2:
				{
				setState(574);
				variable_assignment();
				}
				break;
			}
			setState(577);
			match(CLOSE_PAR);
			}
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(579);
				block();
				}
				break;
			case 2:
				{
				setState(580);
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
			setState(583);
			match(K_WHILE);
			setState(584);
			match(OPEN_PAR);
			setState(585);
			boolean_expression(0);
			setState(586);
			match(CLOSE_PAR);
			}
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(588);
				block();
				}
				break;
			case 2:
				{
				setState(589);
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
			setState(592);
			match(K_DO);
			{
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(593);
				block();
				}
				break;
			case 2:
				{
				setState(594);
				one_line_block();
				}
				break;
			}
			}
			setState(597);
			match(K_WHILE);
			setState(598);
			match(OPEN_PAR);
			setState(599);
			boolean_expression(0);
			setState(600);
			match(CLOSE_PAR);
			setState(601);
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
			setState(603);
			match(K_FOR);
			setState(604);
			match(OPEN_PAR);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(605);
				match(K_VAR);
				}
			}

			setState(608);
			variable();
			setState(609);
			match(T__5);
			setState(610);
			array_name();
			setState(611);
			match(CLOSE_PAR);
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(612);
				block();
				}
				break;
			case 2:
				{
				setState(613);
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
			setState(616);
			match(K_SWITCH);
			setState(617);
			match(OPEN_PAR);
			setState(618);
			variable();
			setState(619);
			match(CLOSE_PAR);
			setState(620);
			match(T__1);
			setState(622); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(621);
				switch_case();
				}
				}
				setState(624); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CASE );
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(626);
				switch_default();
				}
			}

			setState(629);
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
			setState(631);
			match(K_CASE);
			{
			setState(632);
			value();
			}
			setState(633);
			match(T__5);
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(634);
				block();
				}
				break;
			case 2:
				{
				setState(635);
				one_line_block();
				}
				break;
			}
			}
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_BREAK || _la==K_CONTINUE) {
				{
				setState(638);
				_la = _input.LA(1);
				if ( !(_la==K_BREAK || _la==K_CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(639);
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
			setState(642);
			match(K_DEFAULT);
			setState(643);
			match(T__5);
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(644);
				block();
				}
				break;
			case 2:
				{
				setState(645);
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
		enterRule(_localctx, 86, RULE_sql_stmt);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				create_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				create_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				create_agg_fun();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
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
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public TerminalNode K_PATH() { return getToken(SqlParser.K_PATH, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
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
		enterRule(_localctx, 88, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(K_CREATE);
			setState(655);
			match(K_TABLE);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(656);
				match(K_IF);
				setState(657);
				match(K_NOT);
				setState(658);
				match(K_EXISTS);
				}
			}

			setState(661);
			table_name();
			{
			setState(662);
			match(OPEN_PAR);
			setState(663);
			column_def();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(664);
				match(COMMA);
				setState(665);
				column_def();
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
			match(CLOSE_PAR);
			}
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TYPE) {
				{
				setState(673);
				match(K_TYPE);
				setState(674);
				match(ASSIGN);
				setState(675);
				file();
				setState(676);
				match(COMMA);
				setState(677);
				match(K_PATH);
				setState(678);
				match(ASSIGN);
				setState(679);
				match(T__0);
				setState(680);
				path();
				setState(681);
				match(T__0);
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
		enterRule(_localctx, 90, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_la = _input.LA(1);
			if ( !(((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (K_CSV - 189)) | (1L << (K_JSON - 189)) | (1L << (K_PARQUET - 189)))) != 0)) ) {
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
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
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
		enterRule(_localctx, 92, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(687);
				match(IDENTIFIER);
				setState(688);
				match(T__5);
				}
				break;
			}
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(691);
				match(T__21);
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(692);
					match(T__21);
					}
				}

				}
				break;
			case T__22:
				{
				setState(695);
				match(T__22);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(696);
					match(T__22);
					}
				}

				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				break;
			default:
				break;
			}
			setState(701);
			any_name();
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(710);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(702);
					match(T__21);
					setState(704);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(703);
						match(T__21);
						}
						break;
					}
					}
					break;
				case T__22:
					{
					setState(706);
					match(T__22);
					setState(708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(707);
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
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				{
				setState(722);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(714);
					match(T__21);
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(715);
						match(T__21);
						}
					}

					}
					break;
				case T__22:
					{
					setState(718);
					match(T__22);
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__22) {
						{
						setState(719);
						match(T__22);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(724);
				any_name();
				setState(735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(733);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__21:
						{
						setState(725);
						match(T__21);
						setState(727);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(726);
							match(T__21);
							}
							break;
						}
						}
						break;
					case T__22:
						{
						setState(729);
						match(T__22);
						setState(731);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(730);
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
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
			match(DOT);
			setState(743);
			file();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_jar_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(745);
				match(IDENTIFIER);
				setState(746);
				match(T__5);
				}
				break;
			}
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(749);
				match(T__21);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(750);
					match(T__21);
					}
				}

				}
				break;
			case T__22:
				{
				setState(753);
				match(T__22);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(754);
					match(T__22);
					}
				}

				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				break;
			default:
				break;
			}
			setState(759);
			any_name();
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(768);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(760);
					match(T__21);
					setState(762);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(761);
						match(T__21);
						}
						break;
					}
					}
					break;
				case T__22:
					{
					setState(764);
					match(T__22);
					setState(766);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(765);
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
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				{
				setState(780);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(772);
					match(T__21);
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(773);
						match(T__21);
						}
					}

					}
					break;
				case T__22:
					{
					setState(776);
					match(T__22);
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__22) {
						{
						setState(777);
						match(T__22);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(782);
				any_name();
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(791);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__21:
						{
						setState(783);
						match(T__21);
						setState(785);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
						case 1:
							{
							setState(784);
							match(T__21);
							}
							break;
						}
						}
						break;
					case T__22:
						{
						setState(787);
						match(T__22);
						setState(789);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
						case 1:
							{
							setState(788);
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
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(800);
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
		enterRule(_localctx, 96, RULE_create_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(K_CREATE);
			setState(803);
			match(K_TYPE);
			setState(804);
			type_name();
			{
			setState(805);
			match(OPEN_PAR);
			setState(806);
			type();
			{
			setState(807);
			any_name();
			}
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(808);
				match(COMMA);
				setState(809);
				type();
				{
				setState(810);
				any_name();
				}
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
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
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
		enterRule(_localctx, 100, RULE_factored_select_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			select_core();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(822);
				match(K_ORDER);
				setState(823);
				match(K_BY);
				setState(824);
				ordering_term();
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(825);
						match(COMMA);
						setState(826);
						ordering_term();
						}
						} 
					}
					setState(831);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
			}

			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(834);
				match(K_LIMIT);
				setState(835);
				expr(0);
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(836);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(837);
					expr(0);
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
		enterRule(_localctx, 102, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			select_or_values();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(843);
				match(K_ORDER);
				setState(844);
				match(K_BY);
				setState(845);
				ordering_term();
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(846);
					match(COMMA);
					setState(847);
					ordering_term();
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(855);
				match(K_LIMIT);
				setState(856);
				expr(0);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(857);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(858);
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
		enterRule(_localctx, 104, RULE_select_or_values);
		int _la;
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				match(K_SELECT);
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(864);
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

				setState(867);
				result_column();
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(868);
					match(COMMA);
					setState(869);
					result_column();
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(875);
					match(K_FROM);
					setState(885);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(876);
						table_or_subquery();
						setState(881);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(877);
							match(COMMA);
							setState(878);
							table_or_subquery();
							}
							}
							setState(883);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(884);
						join_clause();
						}
						break;
					}
					}
				}

				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(889);
					match(K_WHERE);
					setState(890);
					((Select_or_valuesContext)_localctx).where = expr(0);
					}
				}

				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(893);
					match(K_GROUP);
					setState(894);
					match(K_BY);
					setState(895);
					expr(0);
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(896);
						match(COMMA);
						setState(897);
						expr(0);
						}
						}
						setState(902);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(905);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(903);
						match(K_HAVING);
						setState(904);
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
				setState(909);
				match(K_VALUES);
				setState(910);
				match(OPEN_PAR);
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
				setState(919);
				match(CLOSE_PAR);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(920);
					match(COMMA);
					setState(921);
					match(OPEN_PAR);
					setState(922);
					expr(0);
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(923);
						match(COMMA);
						setState(924);
						expr(0);
						}
						}
						setState(929);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(930);
					match(CLOSE_PAR);
					}
					}
					setState(936);
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
		enterRule(_localctx, 106, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			column_name();
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				{
				setState(940);
				type_name();
				}
				}
				setState(945);
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
		enterRule(_localctx, 108, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
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
		enterRule(_localctx, 110, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(948);
				signed_number();
				}
				break;
			case 2:
				{
				setState(949);
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
	public static class Case0Context extends ExprContext {
		public TerminalNode STAR() { return getToken(SqlParser.STAR, 0); }
		public Case0Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCase0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCase0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlVisitor ) return ((SqlVisitor<? extends T>)visitor).visitCase0(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case1Context extends ExprContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode K_TRUE() { return getToken(SqlParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SqlParser.K_FALSE, 0); }
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
		public Any_nameContext table;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SqlParser.K_WHERE, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
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
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SqlParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SqlParser.CLOSE_PAR, 0); }
		public TerminalNode K_NOT() { return getToken(SqlParser.K_NOT, 0); }
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				_localctx = new Case0Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(953);
				match(STAR);
				}
				break;
			case 2:
				{
				_localctx = new Case1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(961);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_NULL:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(954);
					literal_value();
					}
					break;
				case T__0:
					{
					setState(955);
					match(T__0);
					setState(956);
					string();
					setState(957);
					match(T__0);
					}
					break;
				case K_TRUE:
					{
					setState(959);
					match(K_TRUE);
					}
					break;
				case K_FALSE:
					{
					setState(960);
					match(K_FALSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				_localctx = new Case16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(963);
				match(OPEN_PAR);
				setState(964);
				match(K_VAR);
				setState(965);
				expression();
				setState(966);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				_localctx = new Case2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(968);
					((Case2Context)_localctx).table = any_name();
					setState(969);
					match(DOT);
					}
					break;
				}
				setState(973);
				column_name();
				}
				break;
			case 5:
				{
				_localctx = new Case3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(974);
				unary_operator();
				setState(975);
				expr(13);
				}
				break;
			case 6:
				{
				_localctx = new Case12Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(977);
				function_name();
				setState(978);
				match(OPEN_PAR);
				setState(979);
				expr(0);
				setState(980);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				_localctx = new Case13Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(982);
				match(OPEN_PAR);
				setState(983);
				expr(0);
				setState(984);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				_localctx = new Case15Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(986);
						match(K_NOT);
						}
					}

					setState(989);
					match(K_EXISTS);
					}
				}

				setState(992);
				match(OPEN_PAR);
				setState(993);
				select_stmt();
				setState(994);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1060);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new Case4Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(998);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(999);
						((Case4Context)_localctx).op = match(PIPE2);
						setState(1000);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new Case5Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1001);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1002);
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
						setState(1003);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new Case6Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1004);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1005);
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
						setState(1006);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new Case7Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1007);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1008);
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
						setState(1009);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new Case8Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1010);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1011);
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
						setState(1012);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new Case9Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1013);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1024);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ASSIGN:
						case EQ:
						case NOT_EQ1:
						case NOT_EQ2:
							{
							setState(1014);
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
							setState(1022);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
							case 1:
								{
								setState(1015);
								match(K_IS);
								}
								break;
							case 2:
								{
								setState(1016);
								match(K_IS);
								setState(1017);
								match(K_NOT);
								}
								break;
							case 3:
								{
								setState(1018);
								match(K_LIKE);
								}
								break;
							case 4:
								{
								setState(1019);
								match(K_GLOB);
								}
								break;
							case 5:
								{
								setState(1020);
								match(K_MATCH);
								}
								break;
							case 6:
								{
								setState(1021);
								match(K_REGEXP);
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1026);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new Case10Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1027);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1028);
						match(K_AND);
						setState(1029);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new Case11Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1030);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1031);
						match(K_OR);
						setState(1032);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new Case22Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1033);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1034);
						match(T__24);
						setState(1035);
						match(OPEN_PAR);
						setState(1036);
						any_name();
						setState(1037);
						match(K_WHERE);
						setState(1038);
						expr(0);
						setState(1039);
						match(CLOSE_PAR);
						}
						break;
					case 10:
						{
						_localctx = new Case14Context(new ExprContext(_parentctx, _parentState));
						((Case14Context)_localctx).exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1041);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1043);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1042);
							match(K_NOT);
							}
						}

						setState(1045);
						match(K_IN);
						setState(1058);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
						case 1:
							{
							setState(1046);
							match(OPEN_PAR);
							setState(1047);
							select_stmt();
							setState(1048);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1050);
							match(OPEN_PAR);
							setState(1054);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OPEN_PAR) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_CURRENT_DATE - 79)) | (1L << (K_CURRENT_TIME - 79)) | (1L << (K_CURRENT_TIMESTAMP - 79)) | (1L << (K_EXISTS - 79)) | (1L << (K_NOT - 79)) | (1L << (K_NULL - 79)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (K_TRUE - 187)) | (1L << (K_FALSE - 187)) | (1L << (IDENTIFIER - 187)) | (1L << (NUMERIC_LITERAL - 187)) | (1L << (STRING_LITERAL - 187)) | (1L << (BLOB_LITERAL - 187)))) != 0)) {
								{
								{
								setState(1051);
								expr(0);
								}
								}
								setState(1056);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1057);
							match(CLOSE_PAR);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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
		enterRule(_localctx, 114, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			expr(0);
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1066);
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
		enterRule(_localctx, 116, RULE_result_column);
		int _la;
		try {
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1069);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				table_name();
				setState(1071);
				match(DOT);
				setState(1072);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				expr(0);
				setState(1079);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1075);
						match(K_AS);
						}
					}

					setState(1078);
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
		enterRule(_localctx, 118, RULE_table_or_subquery);
		int _la;
		try {
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1083);
					database_name();
					setState(1084);
					match(DOT);
					}
					break;
				}
				setState(1088);
				table_name();
				setState(1093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1090);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1089);
						match(K_AS);
						}
					}

					setState(1092);
					table_alias();
					}
					break;
				}
				setState(1100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1095);
					match(K_INDEXED);
					setState(1096);
					match(K_BY);
					setState(1097);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1098);
					match(K_NOT);
					setState(1099);
					match(K_INDEXED);
					}
					break;
				case T__1:
				case T__2:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case SCOL:
				case OPEN_PAR:
				case CLOSE_PAR:
				case COMMA:
				case ASSIGN:
				case K_BREAK:
				case K_CASE:
				case K_CONTINUE:
				case K_CREATE:
				case K_DEFAULT:
				case K_DO:
				case K_ELSE:
				case K_FOR:
				case K_GROUP:
				case K_IF:
				case K_INNER:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_ON:
				case K_ORDER:
				case K_PRINT:
				case K_RETURN:
				case K_SELECT:
				case K_SWITCH:
				case K_VALUES:
				case K_VAR:
				case K_WHERE:
				case K_WHILE:
				case IDENTIFIER:
				case STRING_LITERAL:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(OPEN_PAR);
				setState(1112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1103);
					table_or_subquery();
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1104);
						match(COMMA);
						setState(1105);
						table_or_subquery();
						}
						}
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1111);
					join_clause();
					}
					break;
				}
				setState(1114);
				match(CLOSE_PAR);
				setState(1119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1115);
						match(K_AS);
						}
					}

					setState(1118);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1121);
				match(OPEN_PAR);
				setState(1122);
				select_stmt();
				setState(1123);
				match(CLOSE_PAR);
				setState(1128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1124);
						match(K_AS);
						}
					}

					setState(1127);
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
		enterRule(_localctx, 120, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			table_or_subquery();
			setState(1139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1133);
					join_operator();
					setState(1134);
					table_or_subquery();
					setState(1135);
					join_constraint();
					}
					} 
				}
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_join_operator);
		int _la;
		try {
			setState(1151);
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
				setState(1148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1143);
					match(K_LEFT);
					setState(1145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1144);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1147);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1150);
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
		enterRule(_localctx, 124, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1153);
			match(K_ON);
			setState(1154);
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
		enterRule(_localctx, 126, RULE_select_core);
		int _la;
		try {
			int _alt;
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				match(K_SELECT);
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1157);
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

				setState(1160);
				result_column();
				setState(1165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1161);
						match(COMMA);
						setState(1162);
						result_column();
						}
						} 
					}
					setState(1167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1168);
					match(K_FROM);
					setState(1178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
					case 1:
						{
						setState(1169);
						table_or_subquery();
						setState(1174);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1170);
								match(COMMA);
								setState(1171);
								table_or_subquery();
								}
								} 
							}
							setState(1176);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
						}
						}
						break;
					case 2:
						{
						setState(1177);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1182);
					match(K_WHERE);
					setState(1183);
					((Select_coreContext)_localctx).where = expr(0);
					}
				}

				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1186);
					match(K_GROUP);
					setState(1187);
					match(K_BY);
					setState(1188);
					expr(0);
					setState(1193);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1189);
							match(COMMA);
							setState(1190);
							expr(0);
							}
							} 
						}
						setState(1195);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
					}
					setState(1198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1196);
						match(K_HAVING);
						setState(1197);
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
				setState(1202);
				match(K_VALUES);
				setState(1203);
				match(OPEN_PAR);
				setState(1204);
				expr(0);
				setState(1209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1205);
					match(COMMA);
					setState(1206);
					expr(0);
					}
					}
					setState(1211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1212);
				match(CLOSE_PAR);
				setState(1227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1213);
						match(COMMA);
						setState(1214);
						match(OPEN_PAR);
						setState(1215);
						expr(0);
						setState(1220);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1216);
							match(COMMA);
							setState(1217);
							expr(0);
							}
							}
							setState(1222);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1223);
						match(CLOSE_PAR);
						}
						} 
					}
					setState(1229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
		enterRule(_localctx, 128, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1232);
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

				setState(1235);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1236);
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
		enterRule(_localctx, 130, RULE_literal_value);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1239);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				match(STRING_LITERAL);
				}
				break;
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1241);
				match(BLOB_LITERAL);
				}
				break;
			case K_NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1242);
				match(K_NULL);
				}
				break;
			case K_CURRENT_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(1243);
				match(K_CURRENT_TIME);
				}
				break;
			case K_CURRENT_DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1244);
				match(K_CURRENT_DATE);
				}
				break;
			case K_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1245);
				match(K_CURRENT_TIMESTAMP);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(1246);
				match(OPEN_PAR);
				setState(1247);
				literal_value();
				setState(1248);
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
		enterRule(_localctx, 132, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
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
		enterRule(_localctx, 134, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
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
		enterRule(_localctx, 136, RULE_module_argument);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
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
		enterRule(_localctx, 138, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
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
		enterRule(_localctx, 140, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BETWEEN - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_LIMIT - 128)) | (1L << (K_MATCH - 128)) | (1L << (K_NATURAL - 128)) | (1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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
		enterRule(_localctx, 142, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1264);
				matchWildcard();
				}
				}
				setState(1267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_BETWEEN - 64)) | (1L << (K_BREAK - 64)) | (1L << (K_BY - 64)) | (1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DO - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_FUNCTION - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_LIMIT - 128)) | (1L << (K_MATCH - 128)) | (1L << (K_NATURAL - 128)) | (1L << (K_NEXTVAL - 128)) | (1L << (K_NO - 128)) | (1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_CSV - 128)) | (1L << (K_JSON - 128)) | (1L << (K_PARQUET - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_AGGREGATION - 192)) | (1L << (K_PATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (BIND_PARAMETER - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (BLOB_LITERAL - 192)) | (1L << (SINGLE_LINE_COMMENT - 192)) | (1L << (JAVA_SINGLE_LINE_COMMENT - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SPACES - 192)) | (1L << (UNEXPECTED_CHAR - 192)) | (1L << (DISK - 192)) | (1L << (FILEPATH - 192)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
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
		enterRule(_localctx, 146, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
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
		enterRule(_localctx, 148, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
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
		enterRule(_localctx, 150, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
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
		enterRule(_localctx, 152, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
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
		enterRule(_localctx, 154, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
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
		enterRule(_localctx, 156, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
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
		enterRule(_localctx, 158, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
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
		enterRule(_localctx, 160, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
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
		enterRule(_localctx, 162, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
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
		enterRule(_localctx, 164, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
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
		enterRule(_localctx, 166, RULE_foreign_table);
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
		enterRule(_localctx, 168, RULE_index_name);
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
		enterRule(_localctx, 170, RULE_trigger_name);
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
		enterRule(_localctx, 172, RULE_view_name);
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
		enterRule(_localctx, 174, RULE_module_name);
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
		enterRule(_localctx, 176, RULE_pragma_name);
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
		enterRule(_localctx, 178, RULE_savepoint_name);
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
		enterRule(_localctx, 180, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
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
		enterRule(_localctx, 182, RULE_transaction_name);
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
		enterRule(_localctx, 184, RULE_method_ID);
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
		enterRule(_localctx, 186, RULE_array_name);
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
		enterRule(_localctx, 188, RULE_any_name);
		try {
			setState(1319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1315);
				match(OPEN_PAR);
				setState(1316);
				any_name();
				setState(1317);
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
		case 56:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00cf\u052c\4\2\t"+
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
		"`\t`\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u00ca\n\4\3\4\3\4\5\4\u00ce"+
		"\n\4\3\4\3\4\3\4\5\4\u00d3\n\4\3\4\3\4\3\4\3\4\5\4\u00d9\n\4\5\4\u00db"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u00e4\n\6\3\6\3\6\3\6\7\6\u00e9\n"+
		"\6\f\6\16\6\u00ec\13\6\3\6\5\6\u00ef\n\6\3\6\3\6\3\6\7\6\u00f4\n\6\f\6"+
		"\16\6\u00f7\13\6\5\6\u00f9\n\6\3\7\5\7\u00fc\n\7\3\7\3\7\7\7\u0100\n\7"+
		"\f\7\16\7\u0103\13\7\3\b\3\b\3\b\5\b\u0108\n\b\3\b\3\b\3\t\3\t\5\t\u010e"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u0115\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u011c"+
		"\n\13\f\13\16\13\u011f\13\13\3\13\3\13\3\f\5\f\u0124\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13\r\3\r\5\r\u0134\n\r"+
		"\3\r\3\r\3\16\3\16\5\16\u013a\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0150\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0158\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u0160\n\20\3\21\3\21\3\21\7\21\u0165\n\21\f\21"+
		"\16\21\u0168\13\21\3\22\3\22\3\22\3\22\7\22\u016e\n\22\f\22\16\22\u0171"+
		"\13\22\3\23\3\23\7\23\u0175\n\23\f\23\16\23\u0178\13\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\5\25\u0180\n\25\3\26\3\26\3\26\3\26\7\26\u0186\n\26\f"+
		"\26\16\26\u0189\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01aa\n\30\3\31\3\31\3\31\5\31"+
		"\u01af\n\31\3\31\3\31\7\31\u01b3\n\31\f\31\16\31\u01b6\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01c3\n\32\3\33\3\33"+
		"\3\33\3\33\5\33\u01c9\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01d1\n"+
		"\34\3\34\3\34\3\34\7\34\u01d6\n\34\f\34\16\34\u01d9\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e7\n\35\3\35"+
		"\3\35\3\35\7\35\u01ec\n\35\f\35\16\35\u01ef\13\35\3\36\3\36\3\36\3\36"+
		"\5\36\u01f5\n\36\3\36\3\36\3\36\5\36\u01fa\n\36\3\36\3\36\3\36\3\36\5"+
		"\36\u0200\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u020c\n\37\3 \3 \3!\6!\u0211\n!\r!\16!\u0212\3!\7!\u0216\n!\f!\16!\u0219"+
		"\13!\3!\5!\u021c\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0224\n\"\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u022d\n#\3$\3$\3$\5$\u0232\n$\3%\3%\3%\3%\5%\u0238\n%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u0242\n&\3&\3&\3&\3&\5&\u0248\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0251\n\'\3(\3(\3(\5(\u0256\n(\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\5)\u0261\n)\3)\3)\3)\3)\3)\3)\5)\u0269\n)\3*\3*\3*\3*\3*\3*"+
		"\6*\u0271\n*\r*\16*\u0272\3*\5*\u0276\n*\3*\3*\3+\3+\3+\3+\3+\5+\u027f"+
		"\n+\3+\3+\5+\u0283\n+\3,\3,\3,\3,\5,\u0289\n,\3-\3-\3-\3-\5-\u028f\n-"+
		"\3.\3.\3.\3.\3.\5.\u0296\n.\3.\3.\3.\3.\3.\7.\u029d\n.\f.\16.\u02a0\13"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02ae\n.\3/\3/\3\60\3\60\5\60"+
		"\u02b4\n\60\3\60\3\60\5\60\u02b8\n\60\3\60\3\60\5\60\u02bc\n\60\5\60\u02be"+
		"\n\60\3\60\3\60\3\60\5\60\u02c3\n\60\3\60\3\60\5\60\u02c7\n\60\5\60\u02c9"+
		"\n\60\5\60\u02cb\n\60\3\60\3\60\5\60\u02cf\n\60\3\60\3\60\5\60\u02d3\n"+
		"\60\5\60\u02d5\n\60\3\60\3\60\3\60\5\60\u02da\n\60\3\60\3\60\5\60\u02de"+
		"\n\60\5\60\u02e0\n\60\5\60\u02e2\n\60\7\60\u02e4\n\60\f\60\16\60\u02e7"+
		"\13\60\3\60\3\60\3\60\3\61\3\61\5\61\u02ee\n\61\3\61\3\61\5\61\u02f2\n"+
		"\61\3\61\3\61\5\61\u02f6\n\61\5\61\u02f8\n\61\3\61\3\61\3\61\5\61\u02fd"+
		"\n\61\3\61\3\61\5\61\u0301\n\61\5\61\u0303\n\61\5\61\u0305\n\61\3\61\3"+
		"\61\5\61\u0309\n\61\3\61\3\61\5\61\u030d\n\61\5\61\u030f\n\61\3\61\3\61"+
		"\3\61\5\61\u0314\n\61\3\61\3\61\5\61\u0318\n\61\5\61\u031a\n\61\5\61\u031c"+
		"\n\61\7\61\u031e\n\61\f\61\16\61\u0321\13\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u032f\n\62\f\62\16\62\u0332\13"+
		"\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u033e\n\64"+
		"\f\64\16\64\u0341\13\64\5\64\u0343\n\64\3\64\3\64\3\64\3\64\5\64\u0349"+
		"\n\64\5\64\u034b\n\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0353\n\65\f"+
		"\65\16\65\u0356\13\65\5\65\u0358\n\65\3\65\3\65\3\65\3\65\5\65\u035e\n"+
		"\65\5\65\u0360\n\65\3\66\3\66\5\66\u0364\n\66\3\66\3\66\3\66\7\66\u0369"+
		"\n\66\f\66\16\66\u036c\13\66\3\66\3\66\3\66\3\66\7\66\u0372\n\66\f\66"+
		"\16\66\u0375\13\66\3\66\5\66\u0378\n\66\5\66\u037a\n\66\3\66\3\66\5\66"+
		"\u037e\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u0385\n\66\f\66\16\66\u0388"+
		"\13\66\3\66\3\66\5\66\u038c\n\66\5\66\u038e\n\66\3\66\3\66\3\66\3\66\3"+
		"\66\7\66\u0395\n\66\f\66\16\66\u0398\13\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\7\66\u03a0\n\66\f\66\16\66\u03a3\13\66\3\66\3\66\7\66\u03a7\n\66\f"+
		"\66\16\66\u03aa\13\66\5\66\u03ac\n\66\3\67\3\67\7\67\u03b0\n\67\f\67\16"+
		"\67\u03b3\13\67\38\38\39\39\59\u03b9\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:"+
		"\u03c4\n:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u03ce\n:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\5:\u03de\n:\3:\5:\u03e1\n:\3:\3:\3:\3:\5:\u03e7\n:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\5:\u0401\n:\5:\u0403\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\5:\u0416\n:\3:\3:\3:\3:\3:\3:\3:\7:\u041f\n:\f:\16:\u0422\13"+
		":\3:\5:\u0425\n:\7:\u0427\n:\f:\16:\u042a\13:\3;\3;\5;\u042e\n;\3<\3<"+
		"\3<\3<\3<\3<\3<\5<\u0437\n<\3<\5<\u043a\n<\5<\u043c\n<\3=\3=\3=\5=\u0441"+
		"\n=\3=\3=\5=\u0445\n=\3=\5=\u0448\n=\3=\3=\3=\3=\3=\5=\u044f\n=\3=\3="+
		"\3=\3=\7=\u0455\n=\f=\16=\u0458\13=\3=\5=\u045b\n=\3=\3=\5=\u045f\n=\3"+
		"=\5=\u0462\n=\3=\3=\3=\3=\5=\u0468\n=\3=\5=\u046b\n=\5=\u046d\n=\3>\3"+
		">\3>\3>\3>\7>\u0474\n>\f>\16>\u0477\13>\3?\3?\3?\5?\u047c\n?\3?\5?\u047f"+
		"\n?\3?\5?\u0482\n?\3@\3@\3@\3A\3A\5A\u0489\nA\3A\3A\3A\7A\u048e\nA\fA"+
		"\16A\u0491\13A\3A\3A\3A\3A\7A\u0497\nA\fA\16A\u049a\13A\3A\5A\u049d\n"+
		"A\5A\u049f\nA\3A\3A\5A\u04a3\nA\3A\3A\3A\3A\3A\7A\u04aa\nA\fA\16A\u04ad"+
		"\13A\3A\3A\5A\u04b1\nA\5A\u04b3\nA\3A\3A\3A\3A\3A\7A\u04ba\nA\fA\16A\u04bd"+
		"\13A\3A\3A\3A\3A\3A\3A\7A\u04c5\nA\fA\16A\u04c8\13A\3A\3A\7A\u04cc\nA"+
		"\fA\16A\u04cf\13A\5A\u04d1\nA\3B\5B\u04d4\nB\3B\3B\5B\u04d8\nB\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04e5\nC\3D\3D\3E\3E\3F\3F\5F\u04ed\nF\3"+
		"G\3G\3H\3H\3I\6I\u04f4\nI\rI\16I\u04f5\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3"+
		"O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3"+
		"Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3`\3`\3`\3`\5`\u052a\n`\3`\2\5"+
		"\668ra\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\2\23\4\2\"$\'*\3\2-\63\4\2\n\n&&\4\2\16\27!!\4\2CCNN\3\2"+
		"\u00bf\u00c1\4\2  \u008b\u008b\4\288[[\4\2\"\"\'(\3\2#$\3\2),\3\2-\60"+
		"\4\2!!\61\63\4\2==YY\4\2#%\u0087\u0087\4\2\u00c4\u00c4\u00c7\u00c7\16"+
		"\2\64BDMO[]km\u008c\u008e\u0093\u0095\u009e\u00a0\u00a5\u00a7\u00ab\u00ad"+
		"\u00b6\u00b8\u00b9\u00bb\u00bc\2\u05b8\2\u00c0\3\2\2\2\4\u00c3\3\2\2\2"+
		"\6\u00da\3\2\2\2\b\u00dc\3\2\2\2\n\u00e3\3\2\2\2\f\u00fb\3\2\2\2\16\u0104"+
		"\3\2\2\2\20\u010b\3\2\2\2\22\u0114\3\2\2\2\24\u0116\3\2\2\2\26\u0123\3"+
		"\2\2\2\30\u012b\3\2\2\2\32\u0139\3\2\2\2\34\u0157\3\2\2\2\36\u015f\3\2"+
		"\2\2 \u0161\3\2\2\2\"\u0169\3\2\2\2$\u0172\3\2\2\2&\u0179\3\2\2\2(\u017f"+
		"\3\2\2\2*\u0181\3\2\2\2,\u018c\3\2\2\2.\u01a2\3\2\2\2\60\u01ab\3\2\2\2"+
		"\62\u01c2\3\2\2\2\64\u01c8\3\2\2\2\66\u01d0\3\2\2\28\u01e6\3\2\2\2:\u01ff"+
		"\3\2\2\2<\u020b\3\2\2\2>\u020d\3\2\2\2@\u0210\3\2\2\2B\u021d\3\2\2\2D"+
		"\u0225\3\2\2\2F\u022e\3\2\2\2H\u0237\3\2\2\2J\u0239\3\2\2\2L\u0249\3\2"+
		"\2\2N\u0252\3\2\2\2P\u025d\3\2\2\2R\u026a\3\2\2\2T\u0279\3\2\2\2V\u0284"+
		"\3\2\2\2X\u028e\3\2\2\2Z\u0290\3\2\2\2\\\u02af\3\2\2\2^\u02b3\3\2\2\2"+
		"`\u02ed\3\2\2\2b\u0324\3\2\2\2d\u0335\3\2\2\2f\u0337\3\2\2\2h\u034c\3"+
		"\2\2\2j\u03ab\3\2\2\2l\u03ad\3\2\2\2n\u03b4\3\2\2\2p\u03b8\3\2\2\2r\u03e6"+
		"\3\2\2\2t\u042b\3\2\2\2v\u043b\3\2\2\2x\u046c\3\2\2\2z\u046e\3\2\2\2|"+
		"\u0481\3\2\2\2~\u0483\3\2\2\2\u0080\u04d0\3\2\2\2\u0082\u04d7\3\2\2\2"+
		"\u0084\u04e4\3\2\2\2\u0086\u04e6\3\2\2\2\u0088\u04e8\3\2\2\2\u008a\u04ec"+
		"\3\2\2\2\u008c\u04ee\3\2\2\2\u008e\u04f0\3\2\2\2\u0090\u04f3\3\2\2\2\u0092"+
		"\u04f7\3\2\2\2\u0094\u04f9\3\2\2\2\u0096\u04fb\3\2\2\2\u0098\u04fd\3\2"+
		"\2\2\u009a\u04ff\3\2\2\2\u009c\u0501\3\2\2\2\u009e\u0503\3\2\2\2\u00a0"+
		"\u0505\3\2\2\2\u00a2\u0507\3\2\2\2\u00a4\u0509\3\2\2\2\u00a6\u050b\3\2"+
		"\2\2\u00a8\u050d\3\2\2\2\u00aa\u050f\3\2\2\2\u00ac\u0511\3\2\2\2\u00ae"+
		"\u0513\3\2\2\2\u00b0\u0515\3\2\2\2\u00b2\u0517\3\2\2\2\u00b4\u0519\3\2"+
		"\2\2\u00b6\u051b\3\2\2\2\u00b8\u051d\3\2\2\2\u00ba\u051f\3\2\2\2\u00bc"+
		"\u0521\3\2\2\2\u00be\u0529\3\2\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\7\2"+
		"\2\3\u00c2\3\3\2\2\2\u00c3\u00c4\7\u00cd\2\2\u00c4\u00c5\b\3\1\2\u00c5"+
		"\5\3\2\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c9\7\34\2\2\u00c8\u00ca\5\6\4"+
		"\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00db\3\2\2\2\u00cb\u00cd"+
		"\5\26\f\2\u00cc\u00ce\5\6\4\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00db\3\2\2\2\u00cf\u00d0\5\16\b\2\u00d0\u00d2\7\34\2\2\u00d1\u00d3"+
		"\5\6\4\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00db\3\2\2\2\u00d4"+
		"\u00db\5\36\20\2\u00d5\u00d6\5X-\2\u00d6\u00d8\7\34\2\2\u00d7\u00d9\5"+
		"\6\4\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00c6\3\2\2\2\u00da\u00cb\3\2\2\2\u00da\u00cf\3\2\2\2\u00da\u00d4\3\2"+
		"\2\2\u00da\u00d5\3\2\2\2\u00db\7\3\2\2\2\u00dc\u00dd\7\u00b7\2\2\u00dd"+
		"\u00de\5 \21\2\u00de\u00df\7!\2\2\u00df\u00e0\5\64\33\2\u00e0\t\3\2\2"+
		"\2\u00e1\u00e2\7\u00b7\2\2\u00e2\u00e4\5\u00be`\2\u00e3\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7"+
		"\7\u00b7\2\2\u00e7\u00e9\5\u00be`\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f8\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\7 \2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f5\5\b\5\2\u00f1\u00f2\7 \2\2\u00f2"+
		"\u00f4\5\b\5\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00ee\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\13\3\2\2\2\u00fa\u00fc\5\64\33"+
		"\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0101\3\2\2\2\u00fd\u00fe"+
		"\7 \2\2\u00fe\u0100\5\64\33\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\r\3\2\2\2\u0103\u0101\3"+
		"\2\2\2\u0104\u0105\5\u00ba^\2\u0105\u0107\7\36\2\2\u0106\u0108\5\f\7\2"+
		"\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\7\37\2\2\u010a\17\3\2\2\2\u010b\u010d\7\u009f\2\2\u010c\u010e\5\22\n"+
		"\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\7\34\2\2\u0110\21\3\2\2\2\u0111\u0115\5\64\33\2\u0112\u0115\5\24\13\2"+
		"\u0113\u0115\5:\36\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\23\3\2\2\2\u0116\u011d\7\3\2\2\u0117\u011c\5\64\33\2\u0118"+
		"\u011c\7\u00cc\2\2\u0119\u011c\5\u00be`\2\u011a\u011c\7\u00cc\2\2\u011b"+
		"\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\3\2\2\u0121\25\3\2\2"+
		"\2\u0122\u0124\7l\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\5\u00ba^\2\u0126\u0127\7\36\2\2\u0127\u0128\5\n\6"+
		"\2\u0128\u0129\7\37\2\2\u0129\u012a\5\30\r\2\u012a\27\3\2\2\2\u012b\u012f"+
		"\7\4\2\2\u012c\u012e\5\34\17\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0134\5\20\t\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0136\7\5\2\2\u0136\31\3\2\2\2\u0137\u013a"+
		"\5\34\17\2\u0138\u013a\5\20\t\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2"+
		"\2\u013a\33\3\2\2\2\u013b\u0158\5@!\2\u013c\u013d\5\16\b\2\u013d\u013e"+
		"\7\34\2\2\u013e\u0158\3\2\2\2\u013f\u0158\5H%\2\u0140\u0158\5R*\2\u0141"+
		"\u0142\5<\37\2\u0142\u0143\7\34\2\2\u0143\u0158\3\2\2\2\u0144\u0145\5"+
		"\"\22\2\u0145\u0146\7\34\2\2\u0146\u0158\3\2\2\2\u0147\u0148\5$\23\2\u0148"+
		"\u0149\7\34\2\2\u0149\u0158\3\2\2\2\u014a\u014b\5\60\31\2\u014b\u014c"+
		"\7\34\2\2\u014c\u0158\3\2\2\2\u014d\u014f\7\4\2\2\u014e\u0150\5\34\17"+
		"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0158"+
		"\7\5\2\2\u0152\u0158\5X-\2\u0153\u0154\7C\2\2\u0154\u0158\7\34\2\2\u0155"+
		"\u0156\7N\2\2\u0156\u0158\7\34\2\2\u0157\u013b\3\2\2\2\u0157\u013c\3\2"+
		"\2\2\u0157\u013f\3\2\2\2\u0157\u0140\3\2\2\2\u0157\u0141\3\2\2\2\u0157"+
		"\u0144\3\2\2\2\u0157\u0147\3\2\2\2\u0157\u014a\3\2\2\2\u0157\u014d\3\2"+
		"\2\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\35\3\2\2\2\u0159\u0160\7\u00ca\2\2\u015a\u0160\7\u00cb\2\2\u015b\u015c"+
		"\7\4\2\2\u015c\u015d\5\34\17\2\u015d\u015e\7\5\2\2\u015e\u0160\3\2\2\2"+
		"\u015f\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2\2\2\u0160\37"+
		"\3\2\2\2\u0161\u0166\5\u00be`\2\u0162\u0163\7\35\2\2\u0163\u0165\5\u00be"+
		"`\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167!\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\u00b7"+
		"\2\2\u016a\u016f\5$\23\2\u016b\u016c\7 \2\2\u016c\u016e\5$\23\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170#\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0176\5 \21\2\u0173\u0175"+
		"\5&\24\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177%\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\5> \2\u017a"+
		"\u017b\5(\25\2\u017b\'\3\2\2\2\u017c\u0180\5\64\33\2\u017d\u0180\5:\36"+
		"\2\u017e\u0180\5f\64\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e"+
		"\3\2\2\2\u0180)\3\2\2\2\u0181\u0182\7\6\2\2\u0182\u0187\5d\63\2\u0183"+
		"\u0184\7 \2\2\u0184\u0186\5d\63\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018b\7\7\2\2\u018b+\3\2\2\2\u018c\u018d\7O\2\2\u018d"+
		"\u018e\7\u00c2\2\2\u018e\u018f\7l\2\2\u018f\u0190\5\u0098M\2\u0190\u0191"+
		"\7\36\2\2\u0191\u0192\7\3\2\2\u0192\u0193\5`\61\2\u0193\u0194\7\3\2\2"+
		"\u0194\u0195\7 \2\2\u0195\u0196\7\3\2\2\u0196\u0197\5\u0094K\2\u0197\u0198"+
		"\7\3\2\2\u0198\u0199\7 \2\2\u0199\u019a\7\3\2\2\u019a\u019b\5\u0096L\2"+
		"\u019b\u019c\7\3\2\2\u019c\u019d\7 \2\2\u019d\u019e\5d\63\2\u019e\u019f"+
		"\7 \2\2\u019f\u01a0\5*\26\2\u01a0\u01a1\7\37\2\2\u01a1-\3\2\2\2\u01a2"+
		"\u01a3\7\u00c4\2\2\u01a3\u01a9\7\b\2\2\u01a4\u01aa\5\62\32\2\u01a5\u01a6"+
		"\7\t\2\2\u01a6\u01a7\5\62\32\2\u01a7\u01a8\7\t\2\2\u01a8\u01aa\3\2\2\2"+
		"\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa/\3\2\2\2\u01ab\u01ac\7"+
		"\u0094\2\2\u01ac\u01ae\7\36\2\2\u01ad\u01af\5\64\33\2\u01ae\u01ad\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b4\3\2\2\2\u01b0\u01b1\7#\2\2\u01b1"+
		"\u01b3\5\64\33\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3"+
		"\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01b8\7\37\2\2\u01b8\61\3\2\2\2\u01b9\u01c3\5 \21\2\u01ba\u01c3\5\24"+
		"\13\2\u01bb\u01c3\5\16\b\2\u01bc\u01c3\5\u0084C\2\u01bd\u01be\7\36\2\2"+
		"\u01be\u01bf\5\62\32\2\u01bf\u01c0\7\37\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01c3\5\u009eP\2\u01c2\u01b9\3\2\2\2\u01c2\u01ba\3\2\2\2\u01c2\u01bb"+
		"\3\2\2\2\u01c2\u01bc\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\63\3\2\2\2\u01c4\u01c9\5\62\32\2\u01c5\u01c9\58\35\2\u01c6\u01c9\5\66"+
		"\34\2\u01c7\u01c9\5<\37\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\65\3\2\2\2\u01ca\u01cb\b\34\1"+
		"\2\u01cb\u01d1\5\62\32\2\u01cc\u01cd\7\36\2\2\u01cd\u01ce\5\66\34\2\u01ce"+
		"\u01cf\7\37\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01cc\3"+
		"\2\2\2\u01d1\u01d7\3\2\2\2\u01d2\u01d3\f\4\2\2\u01d3\u01d4\t\2\2\2\u01d4"+
		"\u01d6\5\66\34\5\u01d5\u01d2\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3"+
		"\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\67\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01db\b\35\1\2\u01db\u01e7\5\62\32\2\u01dc\u01dd\5\66\34\2\u01dd\u01de"+
		"\t\3\2\2\u01de\u01df\5\66\34\2\u01df\u01e7\3\2\2\2\u01e0\u01e7\7\u00bd"+
		"\2\2\u01e1\u01e7\7\u00be\2\2\u01e2\u01e3\7\36\2\2\u01e3\u01e4\58\35\2"+
		"\u01e4\u01e5\7\37\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01da\3\2\2\2\u01e6\u01dc"+
		"\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e7"+
		"\u01ed\3\2\2\2\u01e8\u01e9\f\6\2\2\u01e9\u01ea\t\4\2\2\u01ea\u01ec\58"+
		"\35\7\u01eb\u01e8\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee9\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\58\35\2"+
		"\u01f1\u01f4\7\13\2\2\u01f2\u01f5\5:\36\2\u01f3\u01f5\5\64\33\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\7\b"+
		"\2\2\u01f7\u01fa\5:\36\2\u01f8\u01fa\5\64\33\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u0200\3\2\2\2\u01fb\u01fc\7\36\2\2\u01fc\u01fd\5"+
		":\36\2\u01fd\u01fe\7\37\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f0\3\2\2\2\u01ff"+
		"\u01fb\3\2\2\2\u0200;\3\2\2\2\u0201\u0202\5 \21\2\u0202\u0203\7\f\2\2"+
		"\u0203\u020c\3\2\2\2\u0204\u0205\7\f\2\2\u0205\u020c\5 \21\2\u0206\u0207"+
		"\5 \21\2\u0207\u0208\7\r\2\2\u0208\u020c\3\2\2\2\u0209\u020a\7\r\2\2\u020a"+
		"\u020c\5 \21\2\u020b\u0201\3\2\2\2\u020b\u0204\3\2\2\2\u020b\u0206\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020c=\3\2\2\2\u020d\u020e\t\5\2\2\u020e?\3\2"+
		"\2\2\u020f\u0211\5B\"\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0217\3\2\2\2\u0214\u0216\5D"+
		"#\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021c\5F"+
		"$\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021cA\3\2\2\2\u021d\u021e"+
		"\7p\2\2\u021e\u021f\7\36\2\2\u021f\u0220\58\35\2\u0220\u0223\7\37\2\2"+
		"\u0221\u0224\5\30\r\2\u0222\u0224\5\32\16\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0222\3\2\2\2\u0224C\3\2\2\2\u0225\u0226\7_\2\2\u0226\u0227\7p\2\2\u0227"+
		"\u0228\7\36\2\2\u0228\u0229\58\35\2\u0229\u022c\7\37\2\2\u022a\u022d\5"+
		"\30\r\2\u022b\u022d\5\32\16\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2"+
		"\u022dE\3\2\2\2\u022e\u0231\7_\2\2\u022f\u0232\5\30\r\2\u0230\u0232\5"+
		"\32\16\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232G\3\2\2\2\u0233"+
		"\u0238\5J&\2\u0234\u0238\5L\'\2\u0235\u0238\5N(\2\u0236\u0238\5P)\2\u0237"+
		"\u0233\3\2\2\2\u0237\u0234\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2"+
		"\2\2\u0238I\3\2\2\2\u0239\u023a\7h\2\2\u023a\u023b\7\36\2\2\u023b\u023c"+
		"\5\"\22\2\u023c\u023d\7\34\2\2\u023d\u023e\58\35\2\u023e\u0241\7\34\2"+
		"\2\u023f\u0242\5<\37\2\u0240\u0242\5$\23\2\u0241\u023f\3\2\2\2\u0241\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\7\37\2\2\u0244\u0247\3\2\2\2"+
		"\u0245\u0248\5\30\r\2\u0246\u0248\5\32\16\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0246\3\2\2\2\u0248K\3\2\2\2\u0249\u024a\7\u00ba\2\2\u024a\u024b\7\36"+
		"\2\2\u024b\u024c\58\35\2\u024c\u024d\7\37\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u0251\5\30\r\2\u024f\u0251\5\32\16\2\u0250\u024e\3\2\2\2\u0250\u024f"+
		"\3\2\2\2\u0251M\3\2\2\2\u0252\u0255\7\\\2\2\u0253\u0256\5\30\r\2\u0254"+
		"\u0256\5\32\16\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256\u0257\3"+
		"\2\2\2\u0257\u0258\7\u00ba\2\2\u0258\u0259\7\36\2\2\u0259\u025a\58\35"+
		"\2\u025a\u025b\7\37\2\2\u025b\u025c\7\34\2\2\u025cO\3\2\2\2\u025d\u025e"+
		"\7h\2\2\u025e\u0260\7\36\2\2\u025f\u0261\7\u00b7\2\2\u0260\u025f\3\2\2"+
		"\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\5 \21\2\u0263\u0264"+
		"\7\b\2\2\u0264\u0265\5\u00bc_\2\u0265\u0268\7\37\2\2\u0266\u0269\5\30"+
		"\r\2\u0267\u0269\5\32\16\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269"+
		"Q\3\2\2\2\u026a\u026b\7\u00a6\2\2\u026b\u026c\7\36\2\2\u026c\u026d\5 "+
		"\21\2\u026d\u026e\7\37\2\2\u026e\u0270\7\4\2\2\u026f\u0271\5T+\2\u0270"+
		"\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0275\3\2\2\2\u0274\u0276\5V,\2\u0275\u0274\3\2\2\2\u0275\u0276"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\5\2\2\u0278S\3\2\2\2\u0279"+
		"\u027a\7F\2\2\u027a\u027b\5\62\32\2\u027b\u027e\7\b\2\2\u027c\u027f\5"+
		"\30\r\2\u027d\u027f\5\32\16\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2"+
		"\u027f\u0282\3\2\2\2\u0280\u0281\t\6\2\2\u0281\u0283\7\34\2\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283U\3\2\2\2\u0284\u0285\7U\2\2\u0285\u0288"+
		"\7\b\2\2\u0286\u0289\5\30\r\2\u0287\u0289\5\32\16\2\u0288\u0286\3\2\2"+
		"\2\u0288\u0287\3\2\2\2\u0289W\3\2\2\2\u028a\u028f\5Z.\2\u028b\u028f\5"+
		"b\62\2\u028c\u028f\5,\27\2\u028d\u028f\5f\64\2\u028e\u028a\3\2\2\2\u028e"+
		"\u028b\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028fY\3\2\2\2"+
		"\u0290\u0291\7O\2\2\u0291\u0295\7\u00a7\2\2\u0292\u0293\7p\2\2\u0293\u0294"+
		"\7\u0087\2\2\u0294\u0296\7e\2\2\u0295\u0292\3\2\2\2\u0295\u0296\3\2\2"+
		"\2\u0296\u0297\3\2\2\2\u0297\u0298\5\u009eP\2\u0298\u0299\7\36\2\2\u0299"+
		"\u029e\5l\67\2\u029a\u029b\7 \2\2\u029b\u029d\5l\67\2\u029c\u029a\3\2"+
		"\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a1\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\7\37\2\2\u02a2\u02ad\3"+
		"\2\2\2\u02a3\u02a4\7\u00ac\2\2\u02a4\u02a5\7!\2\2\u02a5\u02a6\5\\/\2\u02a6"+
		"\u02a7\7 \2\2\u02a7\u02a8\7\u00c3\2\2\u02a8\u02a9\7!\2\2\u02a9\u02aa\7"+
		"\3\2\2\u02aa\u02ab\5^\60\2\u02ab\u02ac\7\3\2\2\u02ac\u02ae\3\2\2\2\u02ad"+
		"\u02a3\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae[\3\2\2\2\u02af\u02b0\t\7\2\2"+
		"\u02b0]\3\2\2\2\u02b1\u02b2\7\u00c4\2\2\u02b2\u02b4\7\b\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02bd\3\2\2\2\u02b5\u02b7\7\30\2\2"+
		"\u02b6\u02b8\7\30\2\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02be"+
		"\3\2\2\2\u02b9\u02bb\7\31\2\2\u02ba\u02bc\7\31\2\2\u02bb\u02ba\3\2\2\2"+
		"\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02b5\3\2\2\2\u02bd\u02b9"+
		"\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02ca\5\u00be`"+
		"\2\u02c0\u02c2\7\30\2\2\u02c1\u02c3\7\30\2\2\u02c2\u02c1\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c9\3\2\2\2\u02c4\u02c6\7\31\2\2\u02c5\u02c7\7"+
		"\31\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02c0\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2"+
		"\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02e5\3\2\2\2\u02cc\u02ce\7\30\2\2\u02cd"+
		"\u02cf\7\30\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d5\3"+
		"\2\2\2\u02d0\u02d2\7\31\2\2\u02d1\u02d3\7\31\2\2\u02d2\u02d1\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02cc\3\2\2\2\u02d4\u02d0\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02e1\5\u00be`\2\u02d7\u02d9\7\30\2\2\u02d8"+
		"\u02da\7\30\2\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02e0\3"+
		"\2\2\2\u02db\u02dd\7\31\2\2\u02dc\u02de\7\31\2\2\u02dd\u02dc\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e0\3\2\2\2\u02df\u02d7\3\2\2\2\u02df\u02db\3\2"+
		"\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e4\3\2\2\2\u02e3\u02d4\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2"+
		"\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8"+
		"\u02e9\7\35\2\2\u02e9\u02ea\5\\/\2\u02ea_\3\2\2\2\u02eb\u02ec\7\u00c4"+
		"\2\2\u02ec\u02ee\7\b\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f7\3\2\2\2\u02ef\u02f1\7\30\2\2\u02f0\u02f2\7\30\2\2\u02f1\u02f0\3"+
		"\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f8\3\2\2\2\u02f3\u02f5\7\31\2\2\u02f4"+
		"\u02f6\7\31\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3"+
		"\2\2\2\u02f7\u02ef\3\2\2\2\u02f7\u02f3\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u0304\5\u00be`\2\u02fa\u02fc\7\30\2\2\u02fb\u02fd"+
		"\7\30\2\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0303\3\2\2\2"+
		"\u02fe\u0300\7\31\2\2\u02ff\u0301\7\31\2\2\u0300\u02ff\3\2\2\2\u0300\u0301"+
		"\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u02fa\3\2\2\2\u0302\u02fe\3\2\2\2\u0303"+
		"\u0305\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u031f\3\2"+
		"\2\2\u0306\u0308\7\30\2\2\u0307\u0309\7\30\2\2\u0308\u0307\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030f\3\2\2\2\u030a\u030c\7\31\2\2\u030b\u030d\7"+
		"\31\2\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e"+
		"\u0306\3\2\2\2\u030e\u030a\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u031b\5\u00be"+
		"`\2\u0311\u0313\7\30\2\2\u0312\u0314\7\30\2\2\u0313\u0312\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u031a\3\2\2\2\u0315\u0317\7\31\2\2\u0316\u0318\7"+
		"\31\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319"+
		"\u0311\3\2\2\2\u0319\u0315\3\2\2\2\u031a\u031c\3\2\2\2\u031b\u0319\3\2"+
		"\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u030e\3\2\2\2\u031e"+
		"\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2"+
		"\2\2\u0321\u031f\3\2\2\2\u0322\u0323\7\32\2\2\u0323a\3\2\2\2\u0324\u0325"+
		"\7O\2\2\u0325\u0326\7\u00ac\2\2\u0326\u0327\5n8\2\u0327\u0328\7\36\2\2"+
		"\u0328\u0329\5d\63\2\u0329\u0330\5\u00be`\2\u032a\u032b\7 \2\2\u032b\u032c"+
		"\5d\63\2\u032c\u032d\5\u00be`\2\u032d\u032f\3\2\2\2\u032e\u032a\3\2\2"+
		"\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333"+
		"\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7\37\2\2\u0334c\3\2\2\2\u0335"+
		"\u0336\5n8\2\u0336e\3\2\2\2\u0337\u0342\5\u0080A\2\u0338\u0339\7\u008f"+
		"\2\2\u0339\u033a\7D\2\2\u033a\u033f\5t;\2\u033b\u033c\7 \2\2\u033c\u033e"+
		"\5t;\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0338\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u034a\3\2\2\2\u0344\u0345\7\u0082\2\2\u0345"+
		"\u0348\5r:\2\u0346\u0347\t\b\2\2\u0347\u0349\5r:\2\u0348\u0346\3\2\2\2"+
		"\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u0344\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034bg\3\2\2\2\u034c\u0357\5j\66\2\u034d\u034e\7\u008f\2\2\u034e"+
		"\u034f\7D\2\2\u034f\u0354\5t;\2\u0350\u0351\7 \2\2\u0351\u0353\5t;\2\u0352"+
		"\u0350\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2"+
		"\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u034d\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u035f\3\2\2\2\u0359\u035a\7\u0082\2\2\u035a\u035d"+
		"\5r:\2\u035b\u035c\t\b\2\2\u035c\u035e\5r:\2\u035d\u035b\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u0359\3\2\2\2\u035f\u0360\3\2"+
		"\2\2\u0360i\3\2\2\2\u0361\u0363\7\u00a4\2\2\u0362\u0364\t\t\2\2\u0363"+
		"\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u036a\5v"+
		"<\2\u0366\u0367\7 \2\2\u0367\u0369\5v<\2\u0368\u0366\3\2\2\2\u0369\u036c"+
		"\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u0379\3\2\2\2\u036c"+
		"\u036a\3\2\2\2\u036d\u0377\7j\2\2\u036e\u0373\5x=\2\u036f\u0370\7 \2\2"+
		"\u0370\u0372\5x=\2\u0371\u036f\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0378\3\2\2\2\u0375\u0373\3\2\2\2\u0376"+
		"\u0378\5z>\2\u0377\u036e\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u037a\3\2\2"+
		"\2\u0379\u036d\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u037c"+
		"\7\u00b9\2\2\u037c\u037e\5r:\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2"+
		"\u037e\u038d\3\2\2\2\u037f\u0380\7n\2\2\u0380\u0381\7D\2\2\u0381\u0386"+
		"\5r:\2\u0382\u0383\7 \2\2\u0383\u0385\5r:\2\u0384\u0382\3\2\2\2\u0385"+
		"\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038b\3\2"+
		"\2\2\u0388\u0386\3\2\2\2\u0389\u038a\7o\2\2\u038a\u038c\5r:\2\u038b\u0389"+
		"\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u037f\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u03ac\3\2\2\2\u038f\u0390\7\u00b4\2\2\u0390\u0391"+
		"\7\36\2\2\u0391\u0396\5r:\2\u0392\u0393\7 \2\2\u0393\u0395\5r:\2\u0394"+
		"\u0392\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2"+
		"\2\2\u0397\u0399\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u03a8\7\37\2\2\u039a"+
		"\u039b\7 \2\2\u039b\u039c\7\36\2\2\u039c\u03a1\5r:\2\u039d\u039e\7 \2"+
		"\2\u039e\u03a0\5r:\2\u039f\u039d\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4"+
		"\u03a5\7\37\2\2\u03a5\u03a7\3\2\2\2\u03a6\u039a\3\2\2\2\u03a7\u03aa\3"+
		"\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03ab\u0361\3\2\2\2\u03ab\u038f\3\2\2\2\u03ack\3\2\2\2"+
		"\u03ad\u03b1\5\u00a4S\2\u03ae\u03b0\5n8\2\u03af\u03ae\3\2\2\2\u03b0\u03b3"+
		"\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2m\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b4\u03b5\5\u0092J\2\u03b5o\3\2\2\2\u03b6\u03b9\5\u0082"+
		"B\2\u03b7\u03b9\5\u0084C\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2\u03b9"+
		"q\3\2\2\2\u03ba\u03bb\b:\1\2\u03bb\u03e7\7\"\2\2\u03bc\u03c4\5\u0084C"+
		"\2\u03bd\u03be\7\3\2\2\u03be\u03bf\5\24\13\2\u03bf\u03c0\7\3\2\2\u03c0"+
		"\u03c4\3\2\2\2\u03c1\u03c4\7\u00bd\2\2\u03c2\u03c4\7\u00be\2\2\u03c3\u03bc"+
		"\3\2\2\2\u03c3\u03bd\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c2\3\2\2\2\u03c4"+
		"\u03e7\3\2\2\2\u03c5\u03c6\7\36\2\2\u03c6\u03c7\7\u00b7\2\2\u03c7\u03c8"+
		"\5\64\33\2\u03c8\u03c9\7\37\2\2\u03c9\u03e7\3\2\2\2\u03ca\u03cb\5\u00be"+
		"`\2\u03cb\u03cc\7\35\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03ca\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03e7\5\u00a4S\2\u03d0\u03d1"+
		"\5\u0086D\2\u03d1\u03d2\5r:\17\u03d2\u03e7\3\2\2\2\u03d3\u03d4\5\u0098"+
		"M\2\u03d4\u03d5\7\36\2\2\u03d5\u03d6\5r:\2\u03d6\u03d7\7\37\2\2\u03d7"+
		"\u03e7\3\2\2\2\u03d8\u03d9\7\36\2\2\u03d9\u03da\5r:\2\u03da\u03db\7\37"+
		"\2\2\u03db\u03e7\3\2\2\2\u03dc\u03de\7\u0087\2\2\u03dd\u03dc\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\7e\2\2\u03e0\u03dd\3\2"+
		"\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\7\36\2\2\u03e3"+
		"\u03e4\5h\65\2\u03e4\u03e5\7\37\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03ba\3"+
		"\2\2\2\u03e6\u03c3\3\2\2\2\u03e6\u03c5\3\2\2\2\u03e6\u03cd\3\2\2\2\u03e6"+
		"\u03d0\3\2\2\2\u03e6\u03d3\3\2\2\2\u03e6\u03d8\3\2\2\2\u03e6\u03e0\3\2"+
		"\2\2\u03e7\u0428\3\2\2\2\u03e8\u03e9\f\16\2\2\u03e9\u03ea\7&\2\2\u03ea"+
		"\u0427\5r:\17\u03eb\u03ec\f\r\2\2\u03ec\u03ed\t\n\2\2\u03ed\u0427\5r:"+
		"\16\u03ee\u03ef\f\f\2\2\u03ef\u03f0\t\13\2\2\u03f0\u0427\5r:\r\u03f1\u03f2"+
		"\f\13\2\2\u03f2\u03f3\t\f\2\2\u03f3\u0427\5r:\f\u03f4\u03f5\f\n\2\2\u03f5"+
		"\u03f6\t\r\2\2\u03f6\u0427\5r:\13\u03f7\u0402\f\t\2\2\u03f8\u0403\t\16"+
		"\2\2\u03f9\u0401\7|\2\2\u03fa\u03fb\7|\2\2\u03fb\u0401\7\u0087\2\2\u03fc"+
		"\u0401\7\u0081\2\2\u03fd\u0401\7m\2\2\u03fe\u0401\7\u0083\2\2\u03ff\u0401"+
		"\7\u0099\2\2\u0400\u03f9\3\2\2\2\u0400\u03fa\3\2\2\2\u0400\u03fc\3\2\2"+
		"\2\u0400\u03fd\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u03ff\3\2\2\2\u0401\u0403"+
		"\3\2\2\2\u0402\u03f8\3\2\2\2\u0402\u0400\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0427\5r:\n\u0405\u0406\f\b\2\2\u0406\u0407\7;\2\2\u0407\u0427\5r:\t"+
		"\u0408\u0409\f\7\2\2\u0409\u040a\7\u008e\2\2\u040a\u0427\5r:\b\u040b\u040c"+
		"\f\20\2\2\u040c\u040d\7\33\2\2\u040d\u040e\7\36\2\2\u040e\u040f\5\u00be"+
		"`\2\u040f\u0410\7\u00b9\2\2\u0410\u0411\5r:\2\u0411\u0412\7\37\2\2\u0412"+
		"\u0427\3\2\2\2\u0413\u0415\f\4\2\2\u0414\u0416\7\u0087\2\2\u0415\u0414"+
		"\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0424\7s\2\2\u0418"+
		"\u0419\7\36\2\2\u0419\u041a\5h\65\2\u041a\u041b\7\37\2\2\u041b\u0425\3"+
		"\2\2\2\u041c\u0420\7\36\2\2\u041d\u041f\5r:\2\u041e\u041d\3\2\2\2\u041f"+
		"\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0423\3\2"+
		"\2\2\u0422\u0420\3\2\2\2\u0423\u0425\7\37\2\2\u0424\u0418\3\2\2\2\u0424"+
		"\u041c\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u03e8\3\2\2\2\u0426\u03eb\3\2"+
		"\2\2\u0426\u03ee\3\2\2\2\u0426\u03f1\3\2\2\2\u0426\u03f4\3\2\2\2\u0426"+
		"\u03f7\3\2\2\2\u0426\u0405\3\2\2\2\u0426\u0408\3\2\2\2\u0426\u040b\3\2"+
		"\2\2\u0426\u0413\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429s\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042d\5r:\2\u042c"+
		"\u042e\t\17\2\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042eu\3\2\2\2"+
		"\u042f\u043c\7\"\2\2\u0430\u0431\5\u009eP\2\u0431\u0432\7\35\2\2\u0432"+
		"\u0433\7\"\2\2\u0433\u043c\3\2\2\2\u0434\u0439\5r:\2\u0435\u0437\7<\2"+
		"\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a"+
		"\5\u008cG\2\u0439\u0436\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043c\3\2\2"+
		"\2\u043b\u042f\3\2\2\2\u043b\u0430\3\2\2\2\u043b\u0434\3\2\2\2\u043cw"+
		"\3\2\2\2\u043d\u043e\5\u009aN\2\u043e\u043f\7\35\2\2\u043f\u0441\3\2\2"+
		"\2\u0440\u043d\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0447"+
		"\5\u009eP\2\u0443\u0445\7<\2\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2"+
		"\u0445\u0446\3\2\2\2\u0446\u0448\5\u00b6\\\2\u0447\u0444\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u044e\3\2\2\2\u0449\u044a\7u\2\2\u044a\u044b\7D\2"+
		"\2\u044b\u044f\5\u00aaV\2\u044c\u044d\7\u0087\2\2\u044d\u044f\7u\2\2\u044e"+
		"\u0449\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u046d\3\2"+
		"\2\2\u0450\u045a\7\36\2\2\u0451\u0456\5x=\2\u0452\u0453\7 \2\2\u0453\u0455"+
		"\5x=\2\u0454\u0452\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456"+
		"\u0457\3\2\2\2\u0457\u045b\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045b\5z"+
		">\2\u045a\u0451\3\2\2\2\u045a\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"\u0461\7\37\2\2\u045d\u045f\7<\2\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2"+
		"\2\2\u045f\u0460\3\2\2\2\u0460\u0462\5\u00b6\\\2\u0461\u045e\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u046d\3\2\2\2\u0463\u0464\7\36\2\2\u0464\u0465\5"+
		"h\65\2\u0465\u046a\7\37\2\2\u0466\u0468\7<\2\2\u0467\u0466\3\2\2\2\u0467"+
		"\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\5\u00b6\\\2\u046a\u0467"+
		"\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046d\3\2\2\2\u046c\u0440\3\2\2\2\u046c"+
		"\u0450\3\2\2\2\u046c\u0463\3\2\2\2\u046dy\3\2\2\2\u046e\u0475\5x=\2\u046f"+
		"\u0470\5|?\2\u0470\u0471\5x=\2\u0471\u0472\5~@\2\u0472\u0474\3\2\2\2\u0473"+
		"\u046f\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2"+
		"\2\2\u0476{\3\2\2\2\u0477\u0475\3\2\2\2\u0478\u0482\3\2\2\2\u0479\u047b"+
		"\7\u0080\2\2\u047a\u047c\7\u0090\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3"+
		"\2\2\2\u047c\u047f\3\2\2\2\u047d\u047f\7w\2\2\u047e\u0479\3\2\2\2\u047e"+
		"\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0482\7~"+
		"\2\2\u0481\u0478\3\2\2\2\u0481\u047e\3\2\2\2\u0482}\3\2\2\2\u0483\u0484"+
		"\7\u008c\2\2\u0484\u0485\5r:\2\u0485\177\3\2\2\2\u0486\u0488\7\u00a4\2"+
		"\2\u0487\u0489\t\t\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a"+
		"\3\2\2\2\u048a\u048f\5v<\2\u048b\u048c\7 \2\2\u048c\u048e\5v<\2\u048d"+
		"\u048b\3\2\2\2\u048e\u0491\3\2\2\2\u048f\u048d\3\2\2\2\u048f\u0490\3\2"+
		"\2\2\u0490\u049e\3\2\2\2\u0491\u048f\3\2\2\2\u0492\u049c\7j\2\2\u0493"+
		"\u0498\5x=\2\u0494\u0495\7 \2\2\u0495\u0497\5x=\2\u0496\u0494\3\2\2\2"+
		"\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049d"+
		"\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049d\5z>\2\u049c\u0493\3\2\2\2\u049c"+
		"\u049b\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u0492\3\2\2\2\u049e\u049f\3\2"+
		"\2\2\u049f\u04a2\3\2\2\2\u04a0\u04a1\7\u00b9\2\2\u04a1\u04a3\5r:\2\u04a2"+
		"\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04b2\3\2\2\2\u04a4\u04a5\7n"+
		"\2\2\u04a5\u04a6\7D\2\2\u04a6\u04ab\5r:\2\u04a7\u04a8\7 \2\2\u04a8\u04aa"+
		"\5r:\2\u04a9\u04a7\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab"+
		"\u04ac\3\2\2\2\u04ac\u04b0\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae\u04af\7o"+
		"\2\2\u04af\u04b1\5r:\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3"+
		"\3\2\2\2\u04b2\u04a4\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04d1\3\2\2\2\u04b4"+
		"\u04b5\7\u00b4\2\2\u04b5\u04b6\7\36\2\2\u04b6\u04bb\5r:\2\u04b7\u04b8"+
		"\7 \2\2\u04b8\u04ba\5r:\2\u04b9\u04b7\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb"+
		"\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04be\3\2\2\2\u04bd\u04bb\3\2"+
		"\2\2\u04be\u04cd\7\37\2\2\u04bf\u04c0\7 \2\2\u04c0\u04c1\7\36\2\2\u04c1"+
		"\u04c6\5r:\2\u04c2\u04c3\7 \2\2\u04c3\u04c5\5r:\2\u04c4\u04c2\3\2\2\2"+
		"\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c9"+
		"\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04ca\7\37\2\2\u04ca\u04cc\3\2\2\2"+
		"\u04cb\u04bf\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce"+
		"\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u0486\3\2\2\2\u04d0"+
		"\u04b4\3\2\2\2\u04d1\u0081\3\2\2\2\u04d2\u04d4\t\13\2\2\u04d3\u04d2\3"+
		"\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d8\7\u00c5\2\2"+
		"\u04d6\u04d8\7\"\2\2\u04d7\u04d3\3\2\2\2\u04d7\u04d6\3\2\2\2\u04d8\u0083"+
		"\3\2\2\2\u04d9\u04e5\7\u00c5\2\2\u04da\u04e5\7\u00c7\2\2\u04db\u04e5\7"+
		"\u00c8\2\2\u04dc\u04e5\7\u0089\2\2\u04dd\u04e5\7R\2\2\u04de\u04e5\7Q\2"+
		"\2\u04df\u04e5\7S\2\2\u04e0\u04e1\7\36\2\2\u04e1\u04e2\5\u0084C\2\u04e2"+
		"\u04e3\7\37\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04d9\3\2\2\2\u04e4\u04da\3"+
		"\2\2\2\u04e4\u04db\3\2\2\2\u04e4\u04dc\3\2\2\2\u04e4\u04dd\3\2\2\2\u04e4"+
		"\u04de\3\2\2\2\u04e4\u04df\3\2\2\2\u04e4\u04e0\3\2\2\2\u04e5\u0085\3\2"+
		"\2\2\u04e6\u04e7\t\20\2\2\u04e7\u0087\3\2\2\2\u04e8\u04e9\7\u00c7\2\2"+
		"\u04e9\u0089\3\2\2\2\u04ea\u04ed\5r:\2\u04eb\u04ed\5l\67\2\u04ec\u04ea"+
		"\3\2\2\2\u04ec\u04eb\3\2\2\2\u04ed\u008b\3\2\2\2\u04ee\u04ef\t\21\2\2"+
		"\u04ef\u008d\3\2\2\2\u04f0\u04f1\t\22\2\2\u04f1\u008f\3\2\2\2\u04f2\u04f4"+
		"\13\2\2\2\u04f3\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f3\3\2\2\2"+
		"\u04f5\u04f6\3\2\2\2\u04f6\u0091\3\2\2\2\u04f7\u04f8\5\u00be`\2\u04f8"+
		"\u0093\3\2\2\2\u04f9\u04fa\5\u00be`\2\u04fa\u0095\3\2\2\2\u04fb\u04fc"+
		"\5\u00be`\2\u04fc\u0097\3\2\2\2\u04fd\u04fe\5\u00be`\2\u04fe\u0099\3\2"+
		"\2\2\u04ff\u0500\5\u00be`\2\u0500\u009b\3\2\2\2\u0501\u0502\5\u00be`\2"+
		"\u0502\u009d\3\2\2\2\u0503\u0504\5\u00be`\2\u0504\u009f\3\2\2\2\u0505"+
		"\u0506\5\u00be`\2\u0506\u00a1\3\2\2\2\u0507\u0508\5\u00be`\2\u0508\u00a3"+
		"\3\2\2\2\u0509\u050a\5\u00be`\2\u050a\u00a5\3\2\2\2\u050b\u050c\5\u00be"+
		"`\2\u050c\u00a7\3\2\2\2\u050d\u050e\5\u00be`\2\u050e\u00a9\3\2\2\2\u050f"+
		"\u0510\5\u00be`\2\u0510\u00ab\3\2\2\2\u0511\u0512\5\u00be`\2\u0512\u00ad"+
		"\3\2\2\2\u0513\u0514\5\u00be`\2\u0514\u00af\3\2\2\2\u0515\u0516\5\u00be"+
		"`\2\u0516\u00b1\3\2\2\2\u0517\u0518\5\u00be`\2\u0518\u00b3\3\2\2\2\u0519"+
		"\u051a\5\u00be`\2\u051a\u00b5\3\2\2\2\u051b\u051c\7\u00c4\2\2\u051c\u00b7"+
		"\3\2\2\2\u051d\u051e\5\u00be`\2\u051e\u00b9\3\2\2\2\u051f\u0520\5\u00be"+
		"`\2\u0520\u00bb\3\2\2\2\u0521\u0522\5\u00be`\2\u0522\u00bd\3\2\2\2\u0523"+
		"\u052a\7\u00c4\2\2\u0524\u052a\7\u00c7\2\2\u0525\u0526\7\36\2\2\u0526"+
		"\u0527\5\u00be`\2\u0527\u0528\7\37\2\2\u0528\u052a\3\2\2\2\u0529\u0523"+
		"\3\2\2\2\u0529\u0524\3\2\2\2\u0529\u0525\3\2\2\2\u052a\u00bf\3\2\2\2\u00ac"+
		"\u00c9\u00cd\u00d2\u00d8\u00da\u00e3\u00ea\u00ee\u00f5\u00f8\u00fb\u0101"+
		"\u0107\u010d\u0114\u011b\u011d\u0123\u012f\u0133\u0139\u014f\u0157\u015f"+
		"\u0166\u016f\u0176\u017f\u0187\u01a9\u01ae\u01b4\u01c2\u01c8\u01d0\u01d7"+
		"\u01e6\u01ed\u01f4\u01f9\u01ff\u020b\u0212\u0217\u021b\u0223\u022c\u0231"+
		"\u0237\u0241\u0247\u0250\u0255\u0260\u0268\u0272\u0275\u027e\u0282\u0288"+
		"\u028e\u0295\u029e\u02ad\u02b3\u02b7\u02bb\u02bd\u02c2\u02c6\u02c8\u02ca"+
		"\u02ce\u02d2\u02d4\u02d9\u02dd\u02df\u02e1\u02e5\u02ed\u02f1\u02f5\u02f7"+
		"\u02fc\u0300\u0302\u0304\u0308\u030c\u030e\u0313\u0317\u0319\u031b\u031f"+
		"\u0330\u033f\u0342\u0348\u034a\u0354\u0357\u035d\u035f\u0363\u036a\u0373"+
		"\u0377\u0379\u037d\u0386\u038b\u038d\u0396\u03a1\u03a8\u03ab\u03b1\u03b8"+
		"\u03c3\u03cd\u03dd\u03e0\u03e6\u0400\u0402\u0415\u0420\u0424\u0426\u0428"+
		"\u042d\u0436\u0439\u043b\u0440\u0444\u0447\u044e\u0456\u045a\u045e\u0461"+
		"\u0467\u046a\u046c\u0475\u047b\u047e\u0481\u0488\u048f\u0498\u049c\u049e"+
		"\u04a2\u04ab\u04b0\u04b2\u04bb\u04c6\u04cd\u04d0\u04d3\u04d7\u04e4\u04ec"+
		"\u04f5\u0529";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}