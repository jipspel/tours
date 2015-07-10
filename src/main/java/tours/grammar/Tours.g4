grammar Tours;

@header{package tours.grammar;}

program
    : (voidFunction | returnFunction)* mainFunction? (voidFunction | returnFunction)*
    ;

/** Variable declaration. */
variable
    : primitiveType IDENTIFIER (COMMA IDENTIFIER)* (ASSIGNMENT expression)? #variablePrimitive
    | arrayType IDENTIFIER (COMMA IDENTIFIER)* (ASSIGNMENT expression)?     #variableArray
    ;

/** Variable assignment */
variableAssignment
    : IDENTIFIER (LBLOCK expression RBLOCK)? ASSIGNMENT expression
    ;

/** Void function */
voidFunction
    : FUNC VOID IDENTIFIER LPAR ((variableType IDENTIFIER COMMA)* (variableType IDENTIFIER))? RPAR block
    ;

/** Return function */
returnFunction
    : FUNC variableType  IDENTIFIER LPAR ((variableType  IDENTIFIER COMMA)* (variableType IDENTIFIER))? RPAR returnBlock
    ;

/** Main function */
mainFunction
    : FUNC MAIN LPAR RPAR block
    ;

/** Grouped sequence of statements. */
block
    : LBRACE (((statement | variable | expression) SEMI) | conditionalStatement)* RBRACE
    ;

/** Grouped sequence of statements with return. */
returnBlock
    : LBRACE (((statement | variable | expression) SEMI) | conditionalStatement)* returnStatement SEMI RBRACE
    ;

/** Statement. */
statement: variableAssignment                               #assignStatement
         | INPUT LPAR IDENTIFIER (COMMA IDENTIFIER)* RPAR   #inputStatement
         | PRINT LPAR expression (COMMA expression)* RPAR   #printStatement
         ;

/** Coditional statement. */
conditionalStatement: IF LPAR expression RPAR compound (ELSE compound)?                                         #ifStatement
                    | WHILE LPAR expression RPAR compound                                                       #whileStatement
                    | FOR LPAR (variable | statement)? SEMI expression SEMI variableAssignment RPAR compound    #forStatement
                    ;

/** Return statement. */
returnStatement
    : RETURN expression
    ;

/** Expression.*/
expression:     LPAR expression RPAR                                            #parenthesisExpression
              | prefixOperator expression                                       #prefixExpression
              | expression multiplyOperator expression                          #multiplyExpression
              | expression plusOperator expression                              #plusExpression
              | expression compareOperator expression                           #compareExpression
              | expression AND expression                                       #booleanAndExpression
              | expression OR expression                                        #booleanOrExpression
              | IDENTIFIER LBLOCK expression RBLOCK                             #arrayElementExpression
              | LBRACE expression (COMMA expression)* RBRACE                    #arrayInitialisationExpression
              | NEW primitiveType LBLOCK expression RBLOCK                      #arrayNewExpression
              | IDENTIFIER DOT LENGTH                                           #arrayLengthExpression
              | compound                                                        #compoundExpression
              | IF LPAR expression RPAR compound ELSE compound                  #ifElseExpression
              | INPUT LPAR IDENTIFIER RPAR                                      #inputExpression
              | PRINT LPAR expression RPAR                                      #printExpression
              | IDENTIFIER LPAR ((expression COMMA)* expression)? RPAR          #functionExpression
              | IDENTIFIER                                                      #identifierExpression
              | CHAR                                                            #characterExpression
              | STR                                                             #stringExpression
              | INT                                                             #integerExpression
              | TRUE                                                            #trueExpression
              | FALSE                                                           #falseExpression
              ;
/** Compound expression */
compound
    : LBRACE ((statement | variable | expression) SEMI | conditionalStatement)*
                          ((statement | variable | expression) SEMI) RBRACE
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
variableType: primitiveType
            | arrayType
            ;
/** Primitive types */
primitiveType: INTEGER   #integerType
             | BOOLEAN   #booleanType
             | CHARACTER #characterType
             | STRING    #stringType
                ;
/** Array types */
arrayType:   INTEGER_ARRAY   #integerArrayType
           | BOOLEAN_ARRAY   #booleanArrayType
           | CHARACTER_ARRAY #characterArrayType
           | STRING_ARRAY    #stringArrayType
           ;

// Keywords
BEGIN:              B E G I N ;
BOOLEAN:            B O O L E A N ;
BOOLEAN_ARRAY:      B O O L E A N LBLOCK RBLOCK ;
CHARACTER:          C H A R A C T E R ;
CHARACTER_ARRAY:    C H A R A C T E R LBLOCK RBLOCK ;
ELSE:               E L S E ;
END:                E N D ;
EXIT:               E X I T ;
FALSE:              F A L S E ;
FOR:                F O R ;
FUNC:               F U N C ;
IF:                 I F ;
INPUT:              I N P U T ;
INTEGER:            I N T E G E R ;
INTEGER_ARRAY:      I N T E G E R LBLOCK RBLOCK ;
LENGTH:             L E N G T H ;
MAIN:               M A I N ;
NEW :               N E W ;
PRINT:              P R I N T ;
PROGRAM:            P R O G R A M ;
RETURN:             R E T U R N ;
STRING:             S T R I N G ;
STRING_ARRAY:       S T R I N G LBLOCK RBLOCK ;
TRUE:               T R U E ;
VOID:               V O I D;
WHILE:              W H I L E ;

ASSIGNMENT:    '=';
AND:           '&&';
COMMA:         ',';
DOT:           '.';
DQUOTE:        '"';
EQ:            '==';
GE:            '>=';
GT:            '>';
LE:            '<=';
LBLOCK:        '[';
LBRACE:        '{';
LPAR:          '(';
LT:            '<';
MINUS:         '-';
MODULO:        '%';
NE:            '!=';
NOT:           '!';
OR:            '||';
PLUS:          '+';
RBLOCK:        ']';
RBRACE:        '}';
RPAR:          ')';
SEMI:          ';';
SLASH:         '/';
STAR:          '*';
SQUOTE:        '\'';
UNDERSCORE:    '_';

// Content-bearing token types
IDENTIFIER: LETTER (LETTER | DIGIT | UNDERSCORE)*;
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
