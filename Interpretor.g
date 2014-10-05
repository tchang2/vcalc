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
    boolean gflag = true;
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
    if (gflag) {
      Symbol s = symtab.resolve($IDENT.text);
      VariableSymbol vs = (VariableSymbol) s;
      vs.setValue($expr.value);
    }
  }
  ;
statement
  : ifStatement
  | loopStatement
  | printStatement
  | assignment 
  ;
ifStatement
@init {boolean flag = true; boolean oldflag = true;}
  : ^('if' expr {
    if (gflag) {
        oldflag = gflag;
        //TO-DO: add valid check
        if ($expr.value.getInt() == 1) {
          
          flag = true;
        } else {
          flag = false;
          
        }
        gflag = flag;
      } else {
        oldflag = gflag;
      }
    }    
  cstat) {gflag = oldflag;}
  ;
loopStatement
@init {int mark = input.mark(); boolean rewind = false; boolean flag = true; boolean oldflag = true;}
  : ^('loop' expr {
    if (gflag) {
      oldflag = gflag;
      //TO-DO: add valid check
      if ($expr.value.getInt() == 1) {
        
        flag = true;
        rewind = true;
      } else {
        flag = false;
        rewind = false;
      }
      gflag = flag;
    } else {
      oldflag = gflag;
    }
  }
  cstat) {gflag = oldflag; if (rewind) input.rewind(mark);}
  ;
cstat
  : ^(CSTAT statement*)
  ;
printStatement
  : ^('print' expr) {if (gflag) $expr.value.print();}
  ;
expr returns [Value value]
  : ^('+' a=expr b=expr) {$value = $a.value.add($b.value);}
  | ^('-' a=expr b=expr) {$value = $a.value.sub($b.value);}
  | ^('*' a=expr b=expr) {$value = $a.value.mult($b.value);}
  | ^('/' a=expr b=expr) {$value = $a.value.div($b.value);}
  | ^('==' a=expr b=expr) {$value = $a.value.eq($b.value);}
  | ^('!=' a=expr b=expr) {$value = $a.value.neq($b.value);}
  | ^('>' a=expr b=expr) {$value = $a.value.gt($b.value);}
  | ^('<' a=expr b=expr) {$value = $a.value.lt($b.value);}
  | ^(DREF a=expr b=expr) {$value = $a.value.dref($b.value);}
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
