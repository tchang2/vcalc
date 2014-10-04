tree grammar Interpretor;

options {
  language = Java;
  tokenVocab = VcalcLP;
  ASTLabelType = CommonTree;
}

@header {
import SymTab.*;
import VcalcValue.*;
}

@members {
    SymbolTable symtab;
    Scope currentscope;
    public Interpretor(TreeNodeStream input, SymbolTable symtab) {
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
  : ^(DECL type assignment) 
  ;
  
//return the id of the assignment for use depending on if a declaration or assignment statement
assignment 
  : ^(EQUAL IDENT expr) {
    Symbol s = symtab.resolve($IDENT.text);
    VariableSymbol vs = (VariableSymbol) s;
    vs.setValue($expr.value);
  }
  ;
statement
  : ifStatement
  | loopStatement
  | printStatement
  | assignment 
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
  : ^('print' expr) {$expr.value.print();}
  ;
expr returns [Value value]
  : ^('+' a=expr b=expr) {$value = $a.value.add($b.value);}
  | ^('-' expr expr)
  | ^('*' expr expr)
  | ^('/' expr expr)
  | ^('==' expr expr)
  | ^('!=' expr expr) 
  | ^('>' expr expr)
  | ^('<' expr expr) 
  | ^(DREF expr expr) 
  | ^('..' a=expr b=expr) {$value = new Value($a.value, $b.value);}
  | ^(GEN IDENT expr expr) 
  | ^('filter' IDENT expr expr) 
  | IDENT {
    Symbol s = currentscope.resolve($IDENT.text);
    VariableSymbol vs = (VariableSymbol) s;
    $value = vs.getValue();
  }
  | INTEGER {$value = new Value(Integer.parseInt($INTEGER.text));}
  ;

type returns [Type tsym]
  : IDENT 
  {
    $tsym = (Type) symtab.resolveType($IDENT.text);
  }
  ;
