tree grammar BackEndTemplate;

options {
  language = Java;
  output = template;
  tokenVocab = BackEnd;
  ASTLabelType = CommonTree;
}

@members {int countLabel = 0; int countLoop = 0;}
declara
  : ^(PROGRAM (x+=declaration)* (y+=nullblock)*) -> program(a={$x})
  ;
  
nullblock
  : ^(LINE assignment)
  | ^(LINE print)
  | ^(LINE ifstatement)
  | ^(LINE loop)
  ;

declaration
  : ^(DECL INTEGER x=ID expr)  -> decl(a={$x})
  ;

walk
  : ^(PROGRAM (x+=loadVariable)* (y+=block)*) -> program2(a={$x},b={$y})
  ;
  
loadVariable
  : ^(DECL INTEGER x=ID y+=expr) -> loadVar(a={$x},b={$y})
  ;

block
  : ^(LINE ^(PRINT x+=expr)) -> printCode(a={$x})
  | ^(LINE ^(IF x+=expr y+=block*)) {countLabel++;} -> bne(exp={$x},lines={$y},label={countLabel})
  | ^(LINE ^(LOOP x+=expr y+=block*)) {countLoop++;} -> looper(exp={$x},lines={$y},label={countLoop})
  | ^(LINE ^(ASSIGN '=' t=ID y+=expr)) -> storeVar(a={$t},b={$y}) 
  ;
  
assignment
  : ^(ASSIGN '=' x=ID y+=expr) -> loadVar(a={$x},b={$y})
  ;
  
print
  : ^(PRINT x+=expr) -> printCode(a={$x})
  ;
  
ifstatement
  : ^(IF expr block*) 
  ;
  
loop
  : ^(LOOP expr block*)
  ;
  
expr 
  : ^('==' x+=expr y+=expr) -> eql(a={$x},b={$y})
  | ^('!=' x+=expr y+=expr) -> neq(a={$x},b={$y})
  | ^('>' x+=expr y+=expr) -> sgt(a={$x},b={$y})
  | ^('<' x+=expr y+=expr) -> slt(a={$x},b={$y})
  | ^('+' x+=expr y+=expr) -> add(a={$x},b={$y})
  | ^('-' x+=expr y+=expr) -> sub(a={$x},b={$y})
  | ^('*' x+=expr y+=expr) -> mult(a={$x},b={$y})
  | ^('/' x+=expr y+=expr) -> div(a={$x},b={$y})
  | INT -> int(v={$INT.text})
  | ID -> var(id={$ID.text})
  ;