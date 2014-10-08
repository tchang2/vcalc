tree grammar BackEndTemplate;

options {
  language = Java;
  output = template;
  tokenVocab = BackEnd;
  ASTLabelType = CommonTree;
}

@members {int countLabel = 0; int countLoop = 0; int progLine = 0;}
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
  : ^(PROGRAM (x+= storeVariable)* (y+=block)*) -> program2(a={$x},b={$y})
  ;
  
storeVariable
  : ^(DECL INTEGER x=ID y+=expr) -> storeVar(a={$x},b={$y})
  ;

block
  : ^(LINE ^(PRINT x+=expr)) -> printCode(a={$x})
  | ^(LINE ^(IF x+=expr y+=block*)) {countLabel++;} -> bne(exp={$x},lines={$y},label={countLabel})
  | ^(LINE ^(LOOP x+=expr y+=block*)) {countLoop++;} -> looper(exp={$x},lines={$y},label={countLoop})
  | ^(LINE ^(ASSIGN '=' t=ID y+=expr)) -> storeVar(a={$t},b={$y}) 
  ;
  
assignment
  : ^(ASSIGN '=' x=ID y+=expr) -> storeVar(a={$x},b={$y})
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
  
expr returns [counter]
  : ^('==' x+=expr y+=expr) {z=progLine++} -> eql(a={$x},b={$y},c={$z})
  | ^('!=' x+=expr y+=expr) {z=progLine++} -> neq(a={$x},b={$y},c={$z})
  | ^('>' x+=expr y+=expr) {z=progLine++} -> sgt(a={$x},b={$y},c={$z})
  | ^('<' x+=expr y+=expr) {z=progLine++} -> slt(a={$x},b={$y},c={$z})
  | ^('+' x+=expr y+=expr) {z=progLine++} -> add(a={$x},b={$y},c={$z})
  | ^('-' x+=expr y+=expr) {z=progLine++} -> sub(a={$x},b={$y},c={$z})
  | ^('*' x+=expr y+=expr) {z=progLine++} -> mult(a={$x},b={$y},c={$z})
  | ^('/' x+=expr y+=expr) {z=progLine++} -> div(a={$x},b={$y},c={$z})
  | INT {progLine++} -> int(v={$INT.text})
  | ID {progLine++} -> var(id={$ID.text})
  ;