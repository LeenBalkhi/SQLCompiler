grammar Sql;

parse
 : (java_stmt)  EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

java_stmt
:
  variable_declaration ';' (java_stmt)?
  | java_function_declaration (java_stmt)?
  | java_function_call ';' (java_stmt)?
  | comments
  | sql_stmt (java_stmt)?
;


// the java fucntion identification method
default_parameter
:
K_VAR variable '=' expression
;

parameter_list
:
((K_VAR any_name)? (',' K_VAR any_name)*) ((',')? default_parameter (',' default_parameter)*)?
;

argument_list
:
(expression)? ( ',' (expression))*
;

java_function_call
:
method_ID  '(' (argument_list)?  ')'
;


//higher_order_java_function_call
//:
//method_ID ( '(' (argument_list)? ','? (ho_java_function) (',' argument_list)? ')' )
//;


// ho_java_function:
//  K_FUNCTION OPEN_PAR ( argument_list) CLOSE_PAR
//  block
// ;

return_stmt
:
 K_RETURN (return_value)? ';'
;

return_value
:
expression
|string
|logical_condition
;

string:
'"'(expression|SPACES|any_name|SPACES)* '"'
;

java_function_declaration
: K_FUNCTION? method_ID OPEN_PAR (parameter_list) CLOSE_PAR
block
;

block:
'{'
 (java_body)*
 return_stmt?
'}'
;

one_line_block:
java_body
| return_stmt
;

java_body
:
conditional_stmt #condBody
|java_function_call';' #jfcBody
|loop_stmt #loopBody
|switch_stmt #switchBody
|increment ';' #incremetBody
|variable_declaration ';' #varDecBody
|variable_assignment ';' #varAssignBody
|print ';' #printBody
|'{' java_body? '}' #scopeBody
| sql_stmt #sqlstmt
|K_BREAK ';' #breakBody
|K_CONTINUE ';' #contimueBody
;

comments:
JAVA_SINGLE_LINE_COMMENT
| MULTILINE_COMMENT
| '{' java_body '}'
// why don't comments appear in parse tree?
;

variable:
any_name ('.' any_name)*
//|array_call
;

variable_declaration
:
 K_VAR variable_assignment
 (',' variable_assignment )*
 /*|  K_VAR? (object | array_call) ('=' sql_stmt_list)?*/
;


variable_assignment
:
variable (assginment)*
;

assginment:
assignment_operator variable_assignment_value
;

variable_assignment_value
:
expression
|logical_condition
|factored_select_stmt
//|array_identification
;

//array_identification
//:
//'['(expression ','| array_identification ',')* (expression | array_identification)? ']'
//;

//array_call:
//array_name '[' math_expression? ']'
//;

param_array
:
 '[' type (',' type)*']'
;

create_agg_fun:
K_CREATE  K_AGGREGATION K_FUNCTION
function_name
'('
 jar_path ','
  class_name /*classname*/ ','
  method_name/*MethodName*/ ','
  type/*return type*/  ','
  param_array
 ')'
;

element
:
IDENTIFIER ':'
 (value
// |'"' value '"'=
 |'\'' value '\''
// |array_identification
 )
;

//json_object
//:
//'{'
// element  (','  element)*
//'}'
//;

print
:
K_PRINT '(' (expression )? ('+' ( expression))*')'
;

value:
  variable #varVal
| string #str
| java_function_call #jfcVal
| literal_value #lvVal
| '(' value ')' #parenthVal
;

expression:
value
|boolean_expression
|math_expression
|increment
;

math_expression
:
value #valueMath
|math_expression op=( '<<' | '>>' |'*' | '/' | '%' |'+' | '-' )  math_expression #arithmeticMath
|'(' math_expression ')' #parenthMath
;

boolean_expression
:
value #valBool
|math_expression op=( '<' | '<=' | '>' | '>='| '==' | '!=' | '<>' ) math_expression #compareBool
| boolean_expression op=( '||' | '&&' )boolean_expression #multipleBool
| K_TRUE #trueBool
| K_FALSE #falseBool
| '(' boolean_expression ')' #parenthBool
;

logical_condition
:
boolean_expression ('?' (logical_condition | expression) ':' (logical_condition | expression)) #normalLog
| '(' logical_condition ')' #parenthLog

;


increment
:
variable op='++' #postInc
| op='++' variable #preInc
| variable op='--' #postDec
| op='--' variable #preDec
;

assignment_operator
:
'=' |'+='| '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>='
;

conditional_stmt
:
if_stmt+ else_if_stmt* else_stmt?
;

if_stmt
:
K_IF '(' boolean_expression ')'
(block | one_line_block)
;

else_if_stmt:
K_ELSE K_IF '('boolean_expression')'
(block | one_line_block)
;

else_stmt:
K_ELSE
(block | one_line_block)
;

loop_stmt
:
for_loop
| while_loop
| do_while_loop
| for_each_loop
;


for_loop
:
(K_FOR '(' variable_declaration ';' boolean_expression ';' (increment|variable_assignment) ')')
(block | one_line_block)
;

while_loop
:
(K_WHILE '('boolean_expression ')')
(block | one_line_block)
;

do_while_loop
:
K_DO ( (block | one_line_block) )
 K_WHILE OPEN_PAR boolean_expression CLOSE_PAR ';'
;

for_each_loop
:
K_FOR '(' K_VAR? variable ':' array_name ')'
(block | one_line_block)
;

switch_stmt
:
K_SWITCH OPEN_PAR variable CLOSE_PAR
'{'
switch_case+
switch_default?
'}'
;

switch_case
:
(K_CASE (value) ':'(block | one_line_block) )
((K_BREAK|K_CONTINUE)';')?
;

switch_default
:
(K_DEFAULT ':' (block | one_line_block) )
;


sql_stmt
:
 create_table_stmt
| create_type
| create_agg_fun
| factored_select_stmt
 ;

/*
alter_table_stmt
 : K_ALTER K_TABLE ( database_name '.' )? source_table_name
   ( K_RENAME K_TO new_table_name
   | alter_table_add
   | alter_table_add_constraint
   | alter_table_add_column
   )
 ;

alter_table_add_column:
K_ADD K_COLUMN? column_def
;
*/
//alter_table_stmt
// : K_ALTER K_TABLE ( database_name '.' )? source_table_name
//   ( K_RENAME K_TO new_table_name
//   | alter_table_add
//   | alter_table_add_constraint
//   | K_ADD K_COLUMN? column_def
//   )
// ;
//
//alter_table_add_constraint
// : K_ADD K_CONSTRAINT any_name table_constraint
// ;
//
//alter_table_add
// : K_ADD table_constraint
// ;

/*
create_table_stmt
 : K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )? ( database_name '.' )? table_name
   ( create_table_def
     |create_table_as_select
   )
 ;

 create_table_def:
 '(' column_def ( ',' table_constraint | ',' column_def )* ')'
 ;

 create_table_as_select:
 K_AS select_stmt
 ;
*/
create_table_stmt
 : K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
   table_name
   ( '(' column_def ( /*',' table_constraint |*/ ',' column_def )* ')'
//   | K_AS select_stmt
   )
  ( K_TYPE '=' file
   K_PATH '=' path)?
   ;
file:
K_CSV | K_JSON | K_PARQUET
;
path:
(IDENTIFIER ':')? ('\\' ('\\')?| '\/' ('\/')?) any_name (('\\' ('\\')?| '\/' ('\/')?))? (('\\' ('\\')?| '\/' ('\/')?) any_name (('\\' ('\\')?| '\/' ('\/')?))?)*
;
jar_path:
(IDENTIFIER ':')? ('\\' ('\\')?| '\/' ('\/')?) any_name (('\\' ('\\')?| '\/' ('\/')?))? (('\\' ('\\')?| '\/' ('\/')?) any_name (('\\' ('\\')?| '\/' ('\/')?))?)*'.jar'
;

create_type
:
K_CREATE  K_TYPE
   type_name
   ( '(' type (any_name) ( ',' type  (any_name) )* ')' )
;

type:
type_name
;
/*
delete_stmt
 :  K_DELETE K_FROM qualified_table_name
   condition?
 ;
 condition:
 K_WHERE expr
 ;
*/
//delete_stmt
// :  K_DELETE K_FROM qualified_table_name
//   ( K_WHERE expr )?
// ;

//drop_table_stmt
// : K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name
// ;

/*
factored_select_stmt
 :
   select_core
   select_ordered?
   select_limit?
 ;
select_ordered:
 K_ORDER K_BY ordering_term ( ',' ordering_term )*
;

select_limit:
K_LIMIT expr ( ( K_OFFSET | ',' ) expr )?
;

*/
factored_select_stmt
 :
   select_core
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;
/*
insert_stmt
   :   K_INSERT  K_INTO
   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
   ( insert_values
   | select_stmt
   | default_values
   )
 ;

 insert_values:
 K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;
 dafault_values:
 K_DEFAULT K_VALUES
 ;
*/
//insert_stmt
//   :   K_INSERT  K_INTO
//   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
//   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
//   | select_stmt
//   | K_DEFAULT K_VALUES
//   )
// ;
/*
select_stmt
 :  select_or_values
   select_ordered?
   select_limit?
 ;

*/
select_stmt
 :  select_or_values
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

/*
select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   select_from?
   condition?
   group_by?
   sql_values
 |
 ;

 group_by:
 K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )?
 ;

 sql_values:
 K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;
*/
select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE where=expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

//update_stmt
//   :  K_UPDATE  qualified_table_name
//   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
// ;

column_def
 : column_name ( /*column_constraint |*/ type_name )*
 ;

type_name
 : name
 ;

/*
????
//*/
//column_constraint
// : ( K_CONSTRAINT name )?
//   ( column_constraint_primary_key
//   | column_constraint_foreign_key
//   | column_constraint_not_null
//   | column_constraint_null
//   | K_UNIQUE
//   | K_CHECK '(' expr ')'
//   | column_default
//   | K_COLLATE collation_name
//   )
// ;
//
//column_constraint_primary_key
// : K_PRIMARY K_KEY ( K_ASC | K_DESC )?  K_AUTOINCREMENT?
// ;
//
//column_constraint_foreign_key
// : foreign_key_clause
// ;
//
//column_constraint_not_null
// : K_NOT K_NULL
// ;
//
//column_constraint_null
// : K_NULL
// ;


column_default_value
 : ( signed_number | literal_value )
 ;


/*
expr
 : literal_value  #case1
 | sql_column_name #case2
 |operator_expr #case3
 | or_expr #case4
 | f_op_expr  #case5
 | s_op_expr #case6
 |  binary_expr #case7
 | compare_expr #case8
 | bool_expr #case9
 | k_and_expr #case10
 | k_or_expr #case11
 | function_expr #case12
 | '(' expr ')' #case13
 | exists_expr  #case14
 | select_expr #case15
 ;
 sql_column_name:
 ( ( database_name '.' )? table_name '.' )? column_name
 ;

 operator_expr:
  unary_operator expr
 ;

 or_expr:
 expr op='||' expr
 ;

 f_op_expr:
 expr op=( '*' | '/' | '%' ) expr
 ;

 s_op_expr:
  expr op=( '+' | '-' ) expr
 ;

 binary_expr:
 expr op=( '<<' | '>>' | '&' | '|' ) expr
 ;

 compare_expr:
  expr op=( '<' | '<=' | '>' | '>=' ) expr
 ;

 bool_expr:
 expr ( op=( '=' | '==' | '!=' | '<>') | (K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP) ) expr
 ;

 k_and_expr:
  expr K_AND expr
 ;

 k_or_expr:
 expr K_OR expr
 ;

 function_expr:
 function_name '(' ( K_DISTINCT? expr ( ',' expr )* | op='*' )? ')'
 ;

exists_expr:
 expr K_NOT? K_IN ( '(' ( select_stmt
                          | expr ( ',' expr )*
                          )?
                      ')'
                    | ( database_name '.' )? table_name )
 ;

 select_expr:
 ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')'
 ;
*/
expr
 : literal_value  #case1
 | '(' K_VAR expression')' #case16
 | ( table_name '.' )? column_name  #case2
 | expr '.' any_name #case22
 | unary_operator expr  #case3
 | expr op='||' expr  #case4
 | expr op=( '*' | '/' | '%' ) expr  #case5
 | expr op=( '+' | '-' ) expr  #case6
 | expr op=( '<<' | '>>' | '&' | '|' ) expr  #case7
 | expr op=( '<' | '<=' | '>' | '>=' ) expr  #case8
 | expr ( op=( '=' | '==' | '!=' | '<>') | (K_IS | K_IS K_NOT | K_LIKE | K_GLOB | K_MATCH | K_REGEXP) ) expr  #case9
 | expr K_AND expr  #case10
 | expr K_OR expr  #case11
 | function_name '(' ( K_DISTINCT? expr ( ',' expr )* | op='*' )? ')' #case12
 | '(' expr ')' #case13
 | exp1=expr K_NOT? K_IN ( '(' ( select_stmt
                          | expr ( ',' expr )*
                          )?
                      ')'
                    | ( database_name '.' )? table_name )  #case14
 | ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')' #case15
 ;

/*
???
*/
//foreign_key_clause
// : K_REFERENCES ( database_name '.' )? foreign_table ( '(' fk_target_column_name ( ',' fk_target_column_name )* ')' )?
//   ( ( K_ON ( K_DELETE | K_UPDATE ) ( K_SET K_NULL
//                                    | K_SET K_DEFAULT
//                                    | K_CASCADE
//                                    | K_RESTRICT
//                                    | K_NO K_ACTION )
//     | K_MATCH name
//     )
//   )*
//   ( K_NOT? K_DEFERRABLE ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE )? K_ENABLE? )?
// ;
//
//fk_target_column_name
// : name
// ;


//table_constraint
// : ( K_CONSTRAINT name )?
//   ( table_constraint_primary_key
//   | table_constraint_key
//   | table_constraint_unique
//   | K_CHECK '(' expr ')'
//   | table_constraint_foreign_key
//   )
// ;
//
//table_constraint_primary_key
// : K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')'
// ;
//
//table_constraint_foreign_key
// : K_FOREIGN K_KEY '(' fk_origin_column_name ( ',' fk_origin_column_name )* ')' foreign_key_clause
// ;
//
//table_constraint_unique
// : K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')'
// ;
//
//table_constraint_key
// : K_KEY name? '(' indexed_column ( ',' indexed_column )* ')'
// ;
//
//fk_origin_column_name
// : column_name
// ;


ordering_term
 : expr  ( K_ASC | K_DESC )?
 ;

//pragma_value
// : signed_number
// | name
// | STRING_LITERAL
// ;
//
//common_table_expression
// : table_name ( '(' column_name ( ',' column_name )* ')' )? K_AS '(' select_stmt ')'
// ;

result_column
 : '*'
 | table_name '.' '*'
 | expr ( K_AS? column_alias )?
 ;

/*
table_or_subquery
 :
 (( database_name '.' )? table_name ( K_AS? table_alias )? ( K_INDEXED K_BY index_name | K_NOT K_INDEXED )? #indexed ) #table
 | '(' ( table_or_subquery ( ',' table_or_subquery )* | join_clause )  ')' ( K_AS? table_alias )? #join
 | '(' select_stmt ')' ( K_AS? table_alias )? #select
 ;

*/
table_or_subquery
 : ( database_name '.' )? table_name ( K_AS? table_alias )?
   ( K_INDEXED K_BY index_name
   | K_NOT K_INDEXED )?
 | '(' ( table_or_subquery ( ',' table_or_subquery )*
       | join_clause )
   ')' ( K_AS? table_alias )?
 | '(' select_stmt ')' ( K_AS? table_alias )?
 ;

join_clause
 : table_or_subquery ( join_operator table_or_subquery join_constraint )*
 ;

join_operator
 :
 |  ( K_LEFT K_OUTER? | K_INNER  )? K_JOIN
 ;

join_constraint
   : ( K_ON expr)
 ;
/*
select_core
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
    select_from?
    condition?
    group_by?
    sql_values
 ;
*/
select_core
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE where=expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING op=expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

//cte_table_name
// : table_name ( '(' column_name ( ',' column_name )* ')' )?
// ;

signed_number
 : ( ( '+' | '-' )? NUMERIC_LITERAL | '*' )
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | BLOB_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 | '(' literal_value ')'
 ;

unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;

error_message
 : STRING_LITERAL
 ;

module_argument // TODO check what exactly is permitted here
 : expr
 | column_def
 ;

column_alias
 : IDENTIFIER
 | STRING_LITERAL
 ;


keyword
 : K_ABORT
 | K_ACTION
 | K_ADD
 | K_AFTER
 | K_ALL
 | K_ALTER
 | K_ANALYZE
 | K_AND
 | K_AS
 | K_ASC
 | K_ATTACH
 | K_AUTOINCREMENT
 | K_BEFORE
 | K_BEGIN
 | K_BETWEEN
 | K_BY
 | K_CASCADE
 | K_CASE
 | K_CAST
 | K_CHECK
 | K_COLLATE
 | K_COLUMN
 | K_COMMIT
 | K_CONFLICT
 | K_CONSTRAINT
 | K_CREATE
 | K_CROSS
 | K_CURRENT_DATE
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_DATABASE
 | K_DEFAULT
 | K_DEFERRABLE
 | K_DEFERRED
 | K_DELETE
 | K_DESC
 | K_DETACH
 | K_DISTINCT
 | K_DROP
 | K_EACH
 | K_ELSE
 | K_END
 | K_ENABLE
 | K_ESCAPE
 | K_EXCEPT
 | K_EXCLUSIVE
 | K_EXISTS
 | K_EXPLAIN
 | K_FAIL
 | K_FOR
 | K_FOREIGN
 | K_FROM
 | K_FULL
 | K_GLOB
 | K_GROUP
 | K_HAVING
 | K_IF
 | K_IGNORE
 | K_IMMEDIATE
 | K_IN
 | K_INDEX
 | K_INDEXED
 | K_INITIALLY
 | K_INNER
 | K_INSERT
 | K_INSTEAD
 | K_INTERSECT
 | K_INTO
 | K_IS
 | K_ISNULL
 | K_JOIN
 | K_KEY
 | K_LEFT
 | K_LIKE
 | K_LIMIT
 | K_MATCH
 | K_NATURAL
 | K_NO
 | K_NOT
 | K_NOTNULL
 | K_NULL
 | K_OF
 | K_OFFSET
 | K_ON
 | K_OR
 | K_ORDER
 | K_OUTER
 | K_PLAN
 | K_PRAGMA
 | K_PRIMARY
 | K_QUERY
 | K_RAISE
 | K_RECURSIVE
 | K_REFERENCES
 | K_REGEXP
 | K_REINDEX
 | K_RELEASE
 | K_RENAME
 | K_REPLACE
 | K_RESTRICT
 | K_RIGHT
 | K_ROLLBACK
 | K_ROW
 | K_SAVEPOINT
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_TEMP
 | K_TEMPORARY
 | K_THEN
 | K_TO
 | K_TRANSACTION
 | K_TRIGGER
 | K_UNION
 | K_UNIQUE
 | K_UPDATE
 | K_USING
 | K_VACUUM
 | K_VALUES
 | K_VIEW
 | K_VIRTUAL
 | K_WHEN
 | K_WHERE
 | K_WITH
 | K_WITHOUT
 | K_NEXTVAL
 ;

// TODO check all names below

//[a-zA-Z_0-9\t \-\[\]\=]+
unknown
 : .+
 ;

name
 : any_name
 ;

class_name:
any_name;

method_name:
any_name
;


function_name
 : any_name
 ;

database_name
 : any_name
 ;

source_table_name
 : any_name
 ;

table_name
 : any_name
 ;

table_or_index_name
 : any_name
 ;

new_table_name
 : any_name
 ;

column_name
 : any_name
 ;

collation_name
 : any_name
 ;

foreign_table
 : any_name
 ;

index_name
 : any_name
 ;

trigger_name
 : any_name
 ;

view_name
 : any_name
 ;

module_name
 : any_name
 ;

pragma_name
 : any_name
 ;

savepoint_name
 : any_name
 ;

table_alias
 : IDENTIFIER
 ;

transaction_name
 : any_name
 ;
method_ID
 : any_name
 ;



/*variable
 :
 ( any_name '.' )* any_name
 ;
*/
array_name
 : any_name
 ;

any_name
 : IDENTIFIER
 | STRING_LITERAL
 | '(' any_name ')'
 ;


SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';

// http://www.sqlite.org/lang_keywords.html
K_ABORT : A B O R T;
K_ACTION : A C T I O N;
K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALTER : A L T E R;
K_ANALYZE : A N A L Y Z E;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_ATTACH : A T T A C H;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BEFORE : B E F O R E;
K_BEGIN : B E G I N;
K_BETWEEN : B E T W E E N;
K_BREAK : B R E A K;
K_BY : B Y;
K_CASCADE : C A S C A D E;
K_CASE : C A S E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_COLLATE : C O L L A T E;
K_COLUMN : C O L U M N;
K_COMMIT : C O M M I T;
K_CONFLICT : C O N F L I C T;
K_CONSTRAINT : C O N S T R A I N T;
K_CONTINUE : C O N T I N U E;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_DEFERRABLE : D E F E R R A B L E;
K_DEFERRED : D E F E R R E D;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DO : D O;
K_DROP : D R O P;
K_EACH : E A C H;
K_ELSE : E L S E;
K_END : E N D;
K_ENABLE : E N A B L E;
K_ESCAPE : E S C A P E;
K_EXCEPT : E X C E P T;
K_EXCLUSIVE : E X C L U S I V E;
K_EXISTS : E X I S T S;
K_EXPLAIN : E X P L A I N;
K_FAIL : F A I L;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_FUNCTION: F U N C T I O N;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_IGNORE : I G N O R E;
K_IMMEDIATE : I M M E D I A T E;
K_IN : I N;
K_INDEX : I N D E X;
K_INDEXED : I N D E X E D;
K_INITIALLY : I N I T I A L L Y;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INSTEAD : I N S T E A D;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_KEY : K E Y;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NEXTVAL : N E X T V A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_ONLY : O N L Y;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PLAN : P L A N;
K_PRAGMA : P R A G M A;
K_PRIMARY : P R I M A R Y;
K_PRINT : P R I N T;
K_QUERY : Q U E R Y;
K_RAISE : R A I S E;
K_RECURSIVE : R E C U R S I V E;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_REINDEX : R E I N D E X;
K_RELEASE : R E L E A S E;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RESTRICT : R E S T R I C T;
K_RETURN : R E T U R N;
K_RIGHT : R I G H T;
K_ROLLBACK : R O L L B A C K;
K_ROW : R O W;
K_SAVEPOINT : S A V E P O I N T;
K_SELECT : S E L E C T;
K_SET : S E T;
K_SWITCH: S W I T C H;
K_TABLE : T A B L E;
K_TEMP : T E M P;
K_TEMPORARY : T E M P O R A R Y;
K_THEN : T H E N;
K_TO : T O;
K_TYPE: T Y P E;
K_TRANSACTION : T R A N S A C T I O N;
K_TRIGGER : T R I G G E R;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VACUUM : V A C U U M;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_VIRTUAL : V I R T U A L;
K_VAR : V A R;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WHILE : W H I L E;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;
K_TRUE : T R U E;
K_FALSE : F A L S E;
K_CSV: C S V;
K_JSON: J S O N;
K_PARQUET: P A R Q U E T;
K_AGGREGATION: A G G R E G A T I O N;
IDENTIFIER
 : //'"' (~'"' | '""')* '"'
  // | '`' (~'`' | '``')* '`'
   //| '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;


NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

SINGLE_LINE_COMMENT
 :// '--' ~[\r\n]* -> channel(HIDDEN)
 ;
JAVA_SINGLE_LINE_COMMENT
:
'//' ~[ \r\n ]* -> channel (HIDDEN)
;
MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;
SPACES
 : [ \u000B\t\r\n ] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;
DISK:
[a-zA-Z_]
;
FILEPATH:
//[-.a-zA-Z0-9:/\]+
;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
