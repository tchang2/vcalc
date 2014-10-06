grammar VcalcLP;



options {
  language = Java;
  output = AST;
  backtrack = true;
  memoize = true;
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


@members {
  SymbolTable symtab;
}

program [SymbolTable symtab]
@init {this.symtab = symtab;}
  : declaration* statement* -> ^(PROGRAM declaration* statement*)
  ;

declaration
//@init {System.out.println("hit dec");}
  : type assignment -> ^(DECL type assignment) 
  ; 
assignment 
  : IDENT EQUAL expr SC -> ^(EQUAL IDENT expr)
  | 'fi' {System.err.println("'fi' is not a valid name"); System.exit(-1);}
  | IN {System.err.println("'in' is not a valid name"); System.exit(-1);}
  | 'if' {System.err.println("'if' is not a valid name"); System.exit(-1);}
  | 'loop' {System.err.println("'loop' is not a valid name"); System.exit(-1);}
  | 'pool' {System.err.println("'pool' is not a valid name"); System.exit(-1);}
  | 'print' {System.err.println("'print' is not a valid name"); System.exit(-1);}
  | 'filter' {System.err.println("'filter' is not a valid name"); System.exit(-1);}
  ;
   
statement
//@init {System.out.println("hit statement");}
  : ifStatement
  | loopStatement
  | printStatement
  | assignment 
  ;
ifStatement
  : 'if' LP expr RP cstat 'fi' SC -> ^('if' expr cstat)
  ;
  catch [RecognitionException re] {
    System.err.println("Syntax error on if statement");
    System.exit(-1);
  }
loopStatement
  : 'loop' LP expr RP cstat 'pool' SC -> ^('loop' expr cstat)
  ;
  catch [RecognitionException re] {
    System.err.println("Syntax error on loop statement");
    System.exit(-1);
  }
cstat
  : statement* -> ^(CSTAT statement*)
  ;
printStatement
  : 'print' LP expr RP SC -> ^('print' expr)
  ;
  catch [RecognitionException re] {
    System.err.println("Syntax error on print statement");
    System.exit(-1);
  }
expr
  : add (('=='^ | '!='^ | '<'^ | '>'^) add)*
  ;
add
  : mult (('+'^ | '-'^) mult)*
  ;
mult
  : dref (('*'^ | '/'^) dref)*
  ;
dref
  : (vector -> vector) ('[' e=expr ']' -> ^(DREF $dref $e))*// -> ^(DREF vector expr*)
  ; 
vector
  : term ('..'^ term)*
  | '[' IDENT IN vector '|' expr ']' -> ^(GEN IDENT vector expr)
  | 'filter' LP IDENT IN vector '|' expr RP -> ^('filter' IDENT vector expr)
  ;
term 
  : LP expr RP -> expr
  | IDENT 
  | INTEGER
  ;
type returns [Type tsym]
//@init {System.out.println("hit type");}
  : IDENT {
    $tsym = (Type) symtab.resolveType($IDENT.text);
    //System.out.println(tsym.getName());
    if ($tsym == null) {
      System.err.println("'" + $IDENT.text + "' is not a valid type");
      System.exit(-1);
    }
  }
  | 'fi' {System.err.println("'fi' is not a valid type"); System.exit(-1);}
  | IN {System.err.println("'in' is not a valid type"); System.exit(-1);}
  | 'if' {System.err.println("'if' is not a valid type"); System.exit(-1);}
  | 'loop' {System.err.println("'loop' is not a valid type"); System.exit(-1);}
  | 'pool' {System.err.println("'pool' is not a valid type"); System.exit(-1);}
  | 'print' {System.err.println("'print' is not a valid type"); System.exit(-1);}
  | 'filter' {System.err.println("'filter' is not a valid type"); System.exit(-1);}
  ;


fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
EQUAL : '=' ;
IN : 'in' ;
IDENT : LETTER (LETTER | DIGIT)*;
SC : ';' ;
LP : '(' ;
RP : ')' ;
LB : '{' ;
RB : '}' ;
WS : (' ' | '\n' | '\r' | '\t') {$channel=HIDDEN;} ;