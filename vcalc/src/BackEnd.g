grammar BackEnd;

options {
  language = Java;
  output = AST;
}

tokens {DECL;PROGRAM;LINE;ASSIGN;}


prog
  : declaration* line* EOF -> ^(PROGRAM declaration* line*)
  ;

line
  : assignment SEMICOLON -> ^(LINE assignment)
  | print SEMICOLON -> ^(LINE print)
  | loop -> ^(LINE loop)
  | conditional -> ^(LINE conditional)
  ;

declaration
  : INTEGER ID '=' expr SEMICOLON -> ^(DECL INTEGER ID expr)
  ;
   
assignment
  : ID '=' expr -> ^(ASSIGN '=' ID expr)
  ;
  
print 
  : PRINT expr -> ^(PRINT expr)
  ;

expr
  : compareExpr
  ;
  
compareExpr
  : addExpr (('>'^ | '<'^ | '=='^ | '!='^) addExpr)* 
  ;
  
addExpr
  : multiExpr (('+'^ |'-'^) multiExpr)*
  ;

multiExpr
  : atom (('*'^ | '/'^) atom)*
  ;
  
atom 
  : INT
  | ID
  | '(' expr ')' -> expr
  ;
  
loop
  : LOOP expr line* POOL SEMICOLON -> ^(LOOP expr line*)
  ;
  
conditional
  : IF expr line* FI SEMICOLON -> ^(IF expr line*)
  ;
  
LOOP: 'loop' ; 
POOL: 'pool' ; 
IF: 'if' ;
FI: 'fi' ;
PRINT: 'print' ;
INTEGER: 'int' ;
WS: (' ' | '\t')+ {$channel=HIDDEN;} ;
SEMICOLON: ';' ;
INT:  NUMBER+ ;
ID: LETTER (LETTER | NUMBER)* ;
NEWLINE: '\r'? '\n' {$channel=HIDDEN;} ;
fragment NUMBER: ('0'..'9') ;
fragment LETTER:  ('a'..'z'|'A'..'Z') ;