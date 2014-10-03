grammar VcalcLP;



options {
  language = Java;
  output = AST;
}

tokens {
  PROGRAM;
  DECL;
  CSTAT;
  GEN;
  DREF;
}
@header {
  import SymTab.*;
}




program
  : declaration* statement* -> ^(PROGRAM declaration* statement*)
  ;

declaration
  : type assignment -> ^(DECL type assignment) 
  ;
assignment 
  : IDENT EQUAL expr SC -> ^(EQUAL IDENT expr)
  ;
   
statement
  : ifStatement
  | loopStatement
  | printStatement
  | assignment 
  ;
ifStatement
  : 'if' LP expr RP cstat 'fi' SC -> ^('if' expr cstat)
  ;
loopStatement
  : 'loop' LP expr RP cstat 'pool' SC -> ^('loop' expr cstat)
  ;
cstat
  : statement* -> ^(CSTAT statement*)
  ;
printStatement
  : 'print' LP expr RP SC -> ^('print' expr)
  ;
expr
  : add (('=='^ | '!='^ | '<'^ | '>'^) add)*
  ;
add
  : mult (('+'^ | '-'^) mult)*
  ;
mult
  : vector (('*'^ | '/'^) vector)*
  ;
vector
  : term ('..'^ term)*
  | '[' IDENT 'in' vector '|' expr ']' -> ^(GEN IDENT vector expr)
  | 'filter' LP IDENT 'in' vector '|' expr RP -> ^('filter' IDENT vector expr)
  ;

type 
  : IDENT
  ;
term 
  : LP expr RP -> expr
  | IDENT '[' expr ']' -> ^(DREF IDENT expr)
  | IDENT 
  | INTEGER
  ;

fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
EQUAL : '=' ;
IDENT : LETTER (LETTER | DIGIT)*;
SC : ';' ;
LP : '(' ;
RP : ')' ;
LB : '{' ;
RB : '}' ;
WS : (' ' | '\n' | '\r' | '\t') {$channel=HIDDEN;} ;