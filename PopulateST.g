tree grammar PopulateST;

options {
  language = Java;
  tokenVocab = VcalcLP;
  ASTLabelType = CommonTree;
}

@header {
import SymTab.*;
}

@members {
    SymbolTable symtab;
    Scope currentscope;
    public PopulateST(TreeNodeStream input, SymbolTable symtab) {
        this(input);
        this.symtab = symtab;
        currentscope = symtab.globals;
    }
}

program
  : ^(PROGRAM declaration* statement*)
  ;

//declaration node, check for redefination error and define new variable
declaration
  : ^(DECL type assignment) {
    if (symtab.definedName($assignment.id)) {
      System.err.println("The identifier '" + $assignment.id + "' has already been defined, or is a built in symbol and cannot be reused");
      System.exit(-1);
    }  
    VariableSymbol vs = new VariableSymbol($assignment.id, $type.tsym);
    symtab.globals.define(vs);
  }
  ;
  
//return the id of the assignment for use depending on if a declaration or assignment statement
assignment returns [String id]
  : ^(EQUAL IDENT expr) {$id = $IDENT.text;}
  ;
  
statement
  : ifStatement
  | loopStatement
  | printStatement
  | assignment {
    Symbol id = symtab.resolve($assignment.id);
    if (id == null) {
      System.err.println("The symbol '" + $assignment.id + "' is undefined");
      System.exit(-1);
    }
  }
  ;
ifStatement
  : ^('if' expr cstat)
  ;
loopStatement
  : ^('loop' expr cstat)
  ;
cstat
  : ^(CSTAT statement*)
  ;
printStatement
  : ^('print' expr)
  ;
expr
  : ^('+' expr expr)
  | ^('-' expr expr)
  | ^('*' expr expr)
  | ^('/' expr expr)
  | ^('==' expr expr)
  | ^('!=' expr expr) 
  | ^('>' expr expr)
  | ^('<' expr expr) 
  | ^(DREF expr expr) 
  | vector
  | IDENT //check to see if IDENT is defined
  {
    if (!symtab.definedName($IDENT.text)) {
      System.err.println("The symbol '" + $IDENT.text + "' has not been defined yet");
      System.exit(-1);
    }
  }
  | INTEGER 
  ;
vector
  : ^('..' expr expr)
  | ^(GEN IDENT //create new scope and define IDENT within it. pop the scope when done
  {
    currentscope = new NestedScope("genscope", currentscope);
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"));
    currentscope.define(vs);
  } vector expr) 
  {currentscope = currentscope.getEnclosingScope();}
  
  | ^('filter' IDENT //create new scope and define IDENT within it. pop scope when done
  {
    currentscope = new NestedScope("filscope", currentscope);
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"));
    
    currentscope.define(vs);
  } vector expr) 
  {currentscope = currentscope.getEnclosingScope();}
  ;
type returns [Type tsym]
  : IDENT //check to see if type is valid, returning it if it is. 
  {
    $tsym = (Type) symtab.resolveType($IDENT.text);
    if ($tsym == null) {
      System.err.println("'" + $IDENT.text + "' is not a valid type");
      System.exit(-1);
    }
  }
  ;
