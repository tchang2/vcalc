tree grammar BackEndTemplate;

options {
  language = Java;
  output = template;
  tokenVocab = BackEnd;
  ASTLabelType = CommonTree;
}

@members {
  int countLabel = 0; int countLoop = 0; int progLine = 0;
  int opcounter = 1; int tempcounter = 0;
}
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
  : ^(DECL INTEGER x=ID y+=expr)  -> declareInt(a={$y}, id={$x}, op={opcounter})
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
  : ^(ASSIGN '=' x=ID y+=expr) -> storeVar(a={$y},id={$x},op={opcounter})
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
//  : ^('==' x+=expr y+=expr) {z=progLine++} -> eql(a={$x},b={$y},c={$z})
//  | ^('!=' x+=expr y+=expr) {z=progLine++} -> neq(a={$x},b={$y},c={$z})
//  | ^('>' x+=expr y+=expr) {z=progLine++} -> sgt(a={$x},b={$y},c={$z})
//  | ^('<' x+=expr y+=expr) {z=progLine++} -> slt(a={$x},b={$y},c={$z})
  : ^('+' x=expr y=expr) {opcounter++;} -> add(a={$x.st},b={$y.st},op1={opcounter-2},op2={opcounter-1},dest={opcounter})
//  | ^('-' x+=expr y+=expr) {z=progLine++} -> sub(a={$x},b={$y},c={$z})
//  | ^('*' x+=expr y+=expr) {z=progLine++} -> mult(a={$x},b={$y},c={$z})
//  | ^('/' x+=expr y+=expr) {z=progLine++} -> div(a={$x},b={$y},c={$z})
  | INT {opcounter++; tempcounter++;} -> int(v={$INT.text},oc={opcounter},tc={tempcounter})
  | ID {opcounter++;} -> var(id={$ID.text}, oc={opcounter})
  ;