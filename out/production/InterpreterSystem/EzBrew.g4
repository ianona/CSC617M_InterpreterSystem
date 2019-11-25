grammar EzBrew;
// Keywords

ABSTRACT:           'outline';//'abstract';
//ASSERT:             'assert';
BOOLEAN:            'bool';//'boolean';
BREAK:              'stop';//'break';
//BYTE:               'byte';
CASE:               'sample';//'case';
//CATCH:              'handle';//'catch';
CHAR:               'letter';//'char';
//CLASS:              'blueprint';//'class';
CONST:              'perm';//'const';
//CONTINUE:           'continue';
//DEFAULT:            'default';
DO:                 'do';//'do';
DOUBLE:             'ddec';//'double';
ELSE:               'other';//'else';
//ENUM:               'catalog';//'enum';
//EXTENDS:            'childof';//'extends';
//FINAL:              'abs';//'final';
//FINALLY:            'lastly';//'finally';
FLOAT:              'sdec';//'float';
FOR:                'loop';//'for';
IF:                 'given';//'if';
//GOTO:               'goto';
//IMPLEMENTS:         'has';//'implements';
//IMPORT:             'include';//'import';
//INSTANCEOF:         'is';//'instanceof';
INT:                'num';//'int';
//INTERFACE:          'mod';//'interface';
//LONG:               'long';
//NATIVE:             'native';
NEW:                'orig';//'new';
//PACKAGE:            'bundle';//'package';
//PRIVATE:            'closed';//'private';
//PROTECTED:          'secured';//'protected';
//PUBLIC:             'open';//'public';
RETURN:             'out';//'return';
//SHORT:              'short';
//STATIC:             'same';//'static';
//STRICTFP:           'strictfp';
//SUPER:              'parent';//'super';
SWITCH:             'choose';//'switch';
//SYNCHRONIZED:       'synchronized';
THIS:               'self';//'this';
//THROW:              'shoot';//'throw';
//THROWS:             'shoots';//'throws';
//TRANSIENT:          'transient';
//TRY:                'attempt';//'try';
VOID:               'emp';//'void';
//VOLATILE:           'volatile';
WHILE:              'during';//'while';
SCAN:               'scan';
PRINT:              'print';
STRING:             'string';

// Literals

DECIMAL_LITERAL
                :    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?
                ;
//HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
//OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
//BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
             ;

//HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'true'
            |       'false'
            ;

//CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';
NULL_LITERAL:       'null';
// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';
// Operators
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
BANG:               '!';
//TILDE:              '~';
//QUESTION:           '?';
//COLON:              ':';
EQUAL:              '==';
LE:                 '<=';
GE:                 '>=';
NOTEQUAL:           '!=';
AND:                '&&';
OR:                 '||';
INC:                '++';
DEC:                '--';
ADD:                '+';
SUB:                '-';
MUL:                '*';
DIV:                '/';
//BITAND:             '&';
//BITOR:              '|';
//CARET:              '^';
MOD:                '%';
ADD_ASSIGN:         '+=';
SUB_ASSIGN:         '-=';
MUL_ASSIGN:         '*=';
DIV_ASSIGN:         '/=';
//AND_ASSIGN:         '&=';
//OR_ASSIGN:          '|=';
//XOR_ASSIGN:         '^=';
//MOD_ASSIGN:         '%=';
//LSHIFT_ASSIGN:      '<<=';
//RSHIFT_ASSIGN:      '>>=';
//URSHIFT_ASSIGN:     '>>>=';
// Java 8 tokens
//ARROW:              '->';
//COLONCOLON:         '::';
// Additional symbols not defined in the lexical specification
//AT:                 '@';
//ELLIPSIS:           '...';
// Whitespace and comments
WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);
//WS		:	[ \t\r]+ -> skip;
COMMENT:            '<!>' .*? '<!>'    -> channel(HIDDEN);
LINE_COMMENT:       '#' ~[\r\n]*    -> channel(HIDDEN);

// Identifiers

IDENTIFIER:         Letter LetterOrDigit*;

ERROR   :   [0-9] LetterOrDigit*
        |   '\'' (~['\\\r\n] | EscapeSequence) (~['\\\r\n] | EscapeSequence)+ '\''
        |   '\'' '\''
        ;

// Fragment rules

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
//    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
//fragment HexDigits
//    : HexDigit ((HexDigit | '_')* HexDigit)?
//    ;
//fragment HexDigit
//    : [0-9a-fA-F]
//    ;
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;

start
    :classBodyDeclaration* EOF
    ;

//compilationUnit
//    : packageDeclaration? importDeclaration* typeDeclaration* EOF
//    ;
//
//packageDeclaration
//    : annotation* PACKAGE qualifiedName ';'
//    ;
//
//importDeclaration
//    : IMPORT STATIC? qualifiedName ('.' '*')? ';'
//    ;
//
//typeDeclaration
//    : classOrInterfaceModifier*
//      (classDeclaration | enumDeclaration | interfaceDeclaration | annotationTypeDeclaration)
//    | ';'
//    ;

modifier
    : classOrInterfaceModifier
//    | NATIVE
//    | SYNCHRONIZED
//    | TRANSIENT
//    | VOLATILE
    ;
//
classOrInterfaceModifier
//    : annotation
    : PUBLIC
//    | PROTECTED
//    | PRIVATE
//    | STATIC
//    | ABSTRACT
//    | FINAL    // FINAL for class only -- does not apply to interfaces
//    | STRICTFP
    ;
//
//variableModifier
//    : FINAL
//    | annotation
//    ;

//classDeclaration
//    : CLASS IDENTIFIER typeParameters?
//      (EXTENDS typeType)?
//      (IMPLEMENTS typeList)?
//      classBody
//    ;
//
//typeParameters
//    : '<' typeParameter (',' typeParameter)* '>'
//    ;
//
//typeParameter
//    : annotation* IDENTIFIER (EXTENDS typeBound)?
//    ;
//
//typeBound
//    : typeType ('&' typeType)*
//    ;
//
//enumDeclaration
//    : ENUM IDENTIFIER (IMPLEMENTS typeList)? '{' enumConstants? ','? enumBodyDeclarations? '}'
//    ;
//
//enumConstants
//    : enumConstant (',' enumConstant)*
//    ;
//
//enumConstant
//    : annotation* IDENTIFIER arguments? classBody?
//    ;
//
//enumBodyDeclarations
//    : ';' classBodyDeclaration*
//    ;
//
//interfaceDeclaration
//    : INTERFACE IDENTIFIER typeParameters? (EXTENDS typeList)? interfaceBody
//    ;

//classBody
//    : '{' classBodyDeclaration* '}'
//    ;
//
//interfaceBody
//    : '{' interfaceBodyDeclaration* '}'
//    ;

classBodyDeclaration
    : ';'
    | STATIC? block
    | modifier* memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
//    | genericMethodDeclaration
//    | fieldDeclaration
    | constructorDeclaration
//    | genericConstructorDeclaration
//    | interfaceDeclaration
//    | annotationTypeDeclaration
//    | classDeclaration
//    | enumDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    : typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')*
      (THROWS qualifiedNameList)?
      methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

//genericMethodDeclaration
//    : typeParameters methodDeclaration
//    ;
//
//genericConstructorDeclaration
//    : typeParameters constructorDeclaration
//    ;

constructorDeclaration
    : IDENTIFIER formalParameters (THROWS qualifiedNameList)? constructorBody=block
    ;

//fieldDeclaration
//    : typeType variableDeclarators ';'
//    ;

//interfaceBodyDeclaration
//    : modifier* interfaceMemberDeclaration
//    | ';'
//    ;
//
//interfaceMemberDeclaration
//    : constDeclaration
//    | interfaceMethodDeclaration
//    | genericInterfaceMethodDeclaration
//    | interfaceDeclaration
//    | annotationTypeDeclaration
//    | classDeclaration
//    | enumDeclaration
//    ;

constDeclaration
    : typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    : IDENTIFIER ('[' ']')* '=' variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest
// methodBody from Java8
//interfaceMethodDeclaration
//    : interfaceMethodModifier* (typeTypeOrVoid | typeParameters annotation* typeTypeOrVoid)
//      IDENTIFIER formalParameters ('[' ']')* (THROWS qualifiedNameList)? methodBody
//    ;

// Java8
interfaceMethodModifier
//    : annotation
    : PUBLIC
//    | ABSTRACT
//    | DEFAULT
//    | STATIC
//    | STRICTFP
    ;

//genericInterfaceMethodDeclaration
//    : typeParameters interfaceMethodDeclaration
//    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)? # VarAssignment
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')* #VarDeclarator
    ;

variableInitializer
    : arrayInitializer #ArrInit
    | expression #ExprInit
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

classOrInterfaceType
    : IDENTIFIER typeArguments? ('.' IDENTIFIER typeArguments?)*
    ;

typeArgument
    : typeType
    | '?' ((EXTENDS | SUPER) typeType)?
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
//    : variableModifier* typeType variableDeclaratorId
    : typeType variableDeclaratorId
    ;

lastFormalParameter
//    : variableModifier* typeType '...' variableDeclaratorId
    : typeType '...' variableDeclaratorId
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL #IntLit
//    | HEX_LITERAL
//    | OCT_LITERAL
//    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
//    | HEX_FLOAT_LITERAL
    ;

// ANNOTATIONS

annotation
    : '@' qualifiedName ('(' ( elementValuePairs | elementValue )? ')')?
    ;

elementValuePairs
    : elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    : IDENTIFIER '=' elementValue
    ;

elementValue
    : expression
//    | annotation
    | elementValueArrayInitializer
    ;

elementValueArrayInitializer
    : '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;

//annotationTypeDeclaration
//    : '@' INTERFACE IDENTIFIER annotationTypeBody
//    ;
//
//annotationTypeBody
//    : '{' (annotationTypeElementDeclaration)* '}'
//    ;
//
//annotationTypeElementDeclaration
//    : modifier* annotationTypeElementRest
//    | ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
//    ;
//
//annotationTypeElementRest
//    : typeType annotationMethodOrConstantRest ';'
//    | classDeclaration ';'?
//    | interfaceDeclaration ';'?
//    | enumDeclaration ';'?
//    | annotationTypeDeclaration ';'?
//    ;
//
//annotationMethodOrConstantRest
//    : annotationMethodRest
//    | annotationConstantRest
//    ;
//
//annotationMethodRest
//    : IDENTIFIER '(' ')' defaultValue?
//    ;
//
//annotationConstantRest
//    : variableDeclarators
//    ;
//
//defaultValue
//    : DEFAULT elementValue
//    ;

// STATEMENTS / BLOCKS

block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
//    | localTypeDeclaration
    ;

localVariableDeclaration
//    : variableModifier* typeType variableDeclarators
    : typeType variableDeclarators
    ;

//localTypeDeclaration
//    : classOrInterfaceModifier*
//      (classDeclaration | interfaceDeclaration)
//    | ';'
//    ;

elseStatement
    : ELSE statement #ElseStmt
    ;

statement
    : blockLabel=block #BlockStmt
//    | ASSERT expression (':' expression)? ';'
    | IF parExpression statement (elseStatement)? #IfStmt
    | IF '(' expression bop=('==' | '!=') expression ')' (elseStatement)? #IfStmt2
    | FOR '(' forControl ')' statement #ForStmt
    | WHILE parExpression statement #WhileStmt
    | DO statement WHILE parExpression ';' #DoWhileStmt
//    | TRY block (catchClause+ finallyBlock? | finallyBlock)
//    | TRY resourceSpecification block catchClause* finallyBlock?
    | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}' #SwitchStmt
//    | SYNCHRONIZED parExpression block
    | RETURN expression? ';' #ReturnStmt
//    | THROW expression ';'
//    | BREAK IDENTIFIER? ';'
//    | CONTINUE IDENTIFIER? ';'
//    | SEMI
    | statementExpression=expression ';' #ExprStmt
//    | identifierLabel=IDENTIFIER ':' statement
//    | IDENTIFIER '=' SCAN '(' (STRING_LITERAL('+'IDENTIFIER)*)? ')' #InputStmt
//    | PRINT '(' (STRING_LITERAL | IDENTIFIER) (('+'STRING_LITERAL) ('+'IDENTIFIER))* ');' #PrintStmt
    | PRINT '(' primary ('+'primary)* ');' #PrintStmt
    ;

//catchClause
//    : CATCH '(' variableModifier* catchType IDENTIFIER ')' block
//    ;
//
//catchType
//    : qualifiedName ('|' qualifiedName)*
//    ;
//
//finallyBlock
//    : FINALLY block
//    ;

resourceSpecification
    : '(' resources ';'? ')'
    ;

resources
    : resource (';' resource)*
    ;

resource
//    : variableModifier* classOrInterfaceType variableDeclaratorId '=' expression
    : classOrInterfaceType variableDeclaratorId '=' expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) ':'
    | DEFAULT ':'
    ;

forControl
//    : enhancedForControl
    : forInit ';' expression? ';' forUpdate=expressionList?
    ;

forInit
//    : localVariableDeclaration
//    : variableModifier* typeType variableDeclaratorId '=' variableInitializer
    : typeType variableDeclaratorId '=' variableInitializer
    | expressionList
    ;

//enhancedForControl
//    : variableModifier* typeType variableDeclaratorId ':' expression
//    ;

// EXPRESSIONS

parExpression
    : '(' expression ')' #ParExp
    ;

expressionList
    : expression (',' expression)*
    ;

 methodCall
    : IDENTIFIER '(' expressionList? ')'
    | THIS '(' expressionList? ')'
    | SUPER '(' expressionList? ')'
    ;

expression
    : primary # Pri
//    | expression bop='.'
//      ( IDENTIFIER
//      | methodCall
//      | THIS
////      | NEW nonWildcardTypeArguments? innerCreator
//      | SUPER superSuffix
////      | explicitGenericInvocation
//      )
    | expression '[' expression ']' #ArrayAccess
    | methodCall #MthdCall
    | NEW creator #NewCreator
////    | '(' typeType ')' expression
    | IDENTIFIER postfix=('++' | '--') #IncDec
//    | prefix=('+'|'-'|'++'|'--') expression
//    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression # MulDiv
    | expression bop=('+'|'-') expression # AddSub
//    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression #Compare1
////    | expression bop=INSTANCEOF typeType
    | expression bop=('==' | '!=') expression #Compare2
//    | expression bop='&' expression
//    | expression bop='^' expression
//    | expression bop='|' expression
    | expression bop='&&' expression #And
    | expression bop='||' expression #Or
//    | <assoc=right> expression bop='?' expression ':' expression
      | <assoc=right> expression bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=') expression #Assignment
//    | lambdaExpression // Java8

    // Java 8 methodReference
//    | expression '::' typeArguments? IDENTIFIER
//    | typeType '::' (typeArguments? IDENTIFIER | NEW)
//    | classType '::' typeArguments? NEW

//    | SCAN '(' (STRING_LITERAL('+'IDENTIFIER)*)? ')' # Input
    | SCAN '(' primary ')' # Input
    ;

// Java8
//lambdaExpression
//    : lambdaParameters '->' lambdaBody
//    ;

// Java8
//lambdaParameters
//    : IDENTIFIER
//    | '(' formalParameterList? ')'
//    | '(' IDENTIFIER (',' IDENTIFIER)* ')'
//    ;

// Java8
//lambdaBody
//    : expression
//    | block
//    ;

primary
    : '(' expression ')' #ParEps
//    | THIS
//    | SUPER
    | literal #Lit
    | IDENTIFIER #Identifier
//    | typeTypeOrVoid '.' CLASS
//    | nonWildcardTypeArguments (explicitGenericInvocationSuffix | THIS arguments)
    ;

//classType
//    : (classOrInterfaceType '.')? annotation* IDENTIFIER typeArguments?
//    ;

creator
//    : nonWildcardTypeArguments createdName classCreatorRest
//    | createdName (arrayCreatorRest | classCreatorRest)
    :createdName arrayCreatorRest
    ;
//
createdName
//    : IDENTIFIER typeArgumentsOrDiamond? ('.' IDENTIFIER typeArgumentsOrDiamond?)*
    : primitiveType
    ;
//
//innerCreator
//    : IDENTIFIER nonWildcardTypeArgumentsOrDiamond? classCreatorRest
//    ;

arrayCreatorRest
    : '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
    ;

//classCreatorRest
//    : arguments classBody?
//    ;

//explicitGenericInvocation
//    : nonWildcardTypeArguments explicitGenericInvocationSuffix
//    ;
//
//typeArgumentsOrDiamond
//    : '<' '>'
//    | typeArguments
//    ;
//
//nonWildcardTypeArgumentsOrDiamond
//    : '<' '>'
//    | nonWildcardTypeArguments
//    ;
//
//nonWildcardTypeArguments
//    : '<' typeList '>'
//    ;
//
//typeList
//    : typeType (',' typeType)*
//    ;
//
typeType
    : annotation? (classOrInterfaceType | primitiveType) ('[' ']')*
    ;

primitiveType
    : BOOLEAN
    | CHAR
//    | BYTE
//    | SHORT
    | INT
//    | LONG
    | FLOAT
    | DOUBLE
    | STRING
    ;

typeArguments
    : '<' typeArgument (',' typeArgument)* '>'
    ;

superSuffix
    : arguments
    | '.' IDENTIFIER arguments?
    ;

explicitGenericInvocationSuffix
    : SUPER superSuffix
    | IDENTIFIER arguments
    ;

arguments
    : '(' expressionList? ')'
    ;