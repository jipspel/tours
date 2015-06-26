grammar Tours;

@header{package tours.grammar;}

program: body;

/** Body of a program. */
body
    : (variableDeclaration | function)*
    ;

/** Variable declaration block. */
variableDeclaration
    : (variable SEMI)+
    ;

/** Variable declaration. */
variable : variableType IDENTIFIER (COMMA IDENTIFIER)* (ASSIGNMENT expression)?
    ;

function
    : IDENTIFIER LPAR RPAR block
    ;

/** Grouped sequence of statements. */
block
    : LBRACE (((statement | variable ) SEMI) | conditionalStatement)* RBRACE
    ;

/** Statement. */
statement: IDENTIFIER ASSIGNMENT expression                                     #assignStatement
         | INPUT LPAR IDENTIFIER RPAR                                                #inputStatement
         | PRINT LPAR expression RPAR                                                #printStatement
         ;

/** Coditional statement. */
conditionalStatement: IF LPAR expression RPAR block (ELSE block)?                                   #ifStatement
                    | WHILE LPAR expression RPAR block                                              #whileStatement
                    | FOR LPAR (variable | statement) SEMI expression SEMI statement RPAR block  #forStatement
                    ;

/** Expression.*/
expression:     LPAR expression RPAR                                            #parExpression
              | prefixOperator expression                                       #prefixExpression
              | expression multiplyOperator expression                          #multiplyExpression
              | expression plusOperator expression                              #plusExpression
              | expression compareOperator expression                           #compareExpression
              | expression AND expression                                       #booleanAndExpression
              | expression OR expression                                        #booleanOrExpression
              | LBRACE (expression SEMI | statement)* expression RBRACE         #compoundExpression
              | IDENTIFIER                                                      #identifierExpr
              | CHAR                                                            #characterExpr
              | STR                                                             #stringExpr
              | INT                                                             #integerExpr
              | TRUE                                                            #trueExpr
              | FALSE                                                           #falseExpr
              ;

/** Prefix operator. */
prefixOperator: MINUS | NOT | PLUS;

/** Multiplicative operator. */
multiplyOperator: STAR | SLASH | MODULO;

/** Additive operator. */
plusOperator: PLUS | MINUS;

/** Boolean operator. */
booleanOperator: AND | OR;

/** Comparison operator. */
compareOperator: LE | LT | GE | GT | EQ | NE;

/** Variable data type. */
variableType: INTEGER   #intType
            | BOOLEAN   #boolType
            | CHARACTER #charType
            | STRING    #strType
            ;

// Keywords
BEGIN:      B E G I N ;
BOOLEAN:    B O O L E A N ;
CHARACTER:  C H A R A C T E R ;
ELSE:       E L S E ;
END:        E N D ;
EXIT:       E X I T ;
FALSE:      F A L S E ;
FOR:        F O R ;
FUNC:       F U N C T I O N ;
IF:         I F ;
INPUT:      I N P U T ;
INTEGER:    I N T E G E R ;
PRINT:      P R I N T ;
PROC:       P R O C E D U R E ;
PROGRAM:    P R O G R A M ;
STRING:     S T R I N G ;
TRUE:       T R U E ;
WHILE:      W H I L E ;

ASSIGNMENT:    '=';
AND:           '&&';
COLON:         ':';
COMMA:         ',';
DOT:           '.';
DQUOTE:        '"';
EQ:            '==';
GE:            '>=';
GT:            '>';
LE:            '<=';
LBRACE:        '{';
LPAR:          '(';
LT:            '<';
MINUS:         '-';
MODULO:        '%';
NE:            '!=';
NOT:           '!';
OR:            '||';
PLUS:          '+';
RBRACE:        '}';
RPAR:          ')';
SEMI:          ';';
SLASH:         '/';
STAR:          '*';
SQUOTE:        '\'';

// Content-bearing token types
IDENTIFIER: LETTER (LETTER | DIGIT)*;
INT: DIGIT (DIGIT)*;
STR: DQUOTE .*? DQUOTE;
CHAR: SQUOTE . SQUOTE;

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

// Skipped token types
COMMENT: SLASH SLASH ~[\r\n]* -> skip;
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
