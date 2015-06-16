grammar Tours;

program: body;

/** Body of a program. */
body
    : variableDeclaration* block
    ;

/** Variable declaration block. */
variableDeclaration
    : (variable SEMI)+
    ;

/** Variable declaration. */
variable :  type IDENTIFIER (COMMA IDENTIFIER)* (ASSIGNMENT expression)?
    ;

/** Grouped sequence of statements. */
block
    : BEGIN statement (SEMI statement)* END
    ;

/** Statement. */
statement: identifier ASSIGNMENT expression             #assignStatement
    | IF expression THEN statement (ELSE statement)?    #ifStatement
    | WHILE expression DO statement                     #whileStatement
    | block                                             #blockStatement
    | INPUT LPAR identifier RPAR                        #inputStatement
    | PRINT LPAR expression RPAR                        #printStatement
    ;

/** Target of an assignment. */
identifier
    : IDENTIFIER       #identifierTarget
    ;

/** Expression.*/
expression:     prefixOperator expression                                       #prefixExpression
              | expression multiplyOperator expression                          #multiplyExpression
              | expression plusOperator expression                              #plusExpression
              | expression booleanOperator expression                           #booleanExpression
              | expression compareOperator expression                           #compExpression
              | LPAR expression RPAR                                            #parExpression
              | LBRACE (expression SEMI | statement SEMI)* expression RBRACE    #compoundExpression
              | IDENTIFIER                                                      #identifierExpr
              | NUM                                                             #numExpr
              | TRUE                                                            #trueExpr
              | FALSE                                                           #falseExpr
              ;

/** Prefix operator. */
prefixOperator: MINUS | NOT;

/** Multiplicative operator. */
multiplyOperator: STAR | SLASH;

/** Additive operator. */
plusOperator: PLUS | MINUS;

/** Boolean operator. */
booleanOperator: AND | OR;

/** Comparison operator. */
compareOperator: LE | LT | GE | GT | EQ | NE;

/** Data type. */
type: INTEGER  #intType
    | BOOLEAN  #boolType
    ;

// Keywords
AND:     A N D;
BEGIN:   B E G I N ;
BOOLEAN: B O O L E A N ;
INTEGER: I N T E G E R ;
DO:      D O ;
ELSE:    E L S E ;
END:     E N D ;
EXIT:    E X I T ;
FALSE:   F A L S E ;
FUNC:    F U N C T I O N ;
IF:      I F ;
INPUT:   I N P U T ;
THEN:    T H E N ;
NOT:     N O T ;
OR:      O R ;
PRINT:   P R I N T ;
PROC:    P R O C E D U R E ;
PROGRAM: P R O G R A M ;
TRUE:    T R U E ;
WHILE:   W H I L E ;

ASSIGNMENT:    '=';
COLON:  ':';
COMMA:  ',';
DOT:    '.';
DQUOTE: '"';
EQ:     '=';
GE:     '>=';
GT:     '>';
LE:     '<=';
LBRACE: '{';
LPAR:   '(';
LT:     '<';
MINUS:  '-';
NE:     '<>';
PLUS:   '+';
RBRACE: '}';
RPAR:   ')';
SEMI:   ';';
SLASH:  '/';
STAR:   '*';

// Content-bearing token types
IDENTIFIER: LETTER (LETTER | DIGIT)*;
NUM: DIGIT (DIGIT)*;
STR: DQUOTE .*? DQUOTE;

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

// Skipped token types
COMMENT: LBRACE .*? RBRACE -> skip;
WS: [ \t\r\n]+ -> skip;

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];
