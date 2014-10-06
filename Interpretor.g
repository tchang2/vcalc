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
    //$expr.value.print();
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
        int cond = $expr.value.getInt().intValue();
        if (cond != 1 && cond != 0) {
          System.err.println("Conditional statements require a value of 1 or 0, got: " + cond);
          System.exit(-1);
        }
        if (cond == 1) {
          
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
      int cond = $expr.value.getInt().intValue();
      if (cond != 1 && cond != 0) {
        System.err.println("Conditional statements require a value of 1 or 0, got: " + cond);
        System.exit(-1);
      }
      if (cond == 1) {
        
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
  | gen {$value = $gen.value;}
  | filter {$value = $filter.value;}
  | IDENT {
    Symbol s = currentscope.resolve($IDENT.text);
    VariableSymbol vs = (VariableSymbol) s;
    $value = vs.getValue();
  }
  | INTEGER {$value = new Value(Integer.parseInt($INTEGER.text));}
  ;
  
gen returns [Value value]
@init {
  Integer index = 0;
  ArrayList<Integer> data = new ArrayList<Integer>();
  Integer vsize; 
  currentscope = new NestedScope("genscope", currentscope); 
}
  : ^(GEN 
  IDENT v=expr {
    vsize = $v.value.getSize();
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"), new Value($v.value.dref(new Value(index)).getInt()));
    currentscope.define(vs);
  } 
  ({int mark = input.mark();} d=expr {
  data.add($d.value.getInt());
  
  index++;
  vs.setValue(new Value($v.value.dref(new Value(index)).getInt()));
  if (index < vsize) input.rewind(mark);
  })+ 
  ) {
    currentscope = currentscope.getEnclosingScope();
    $value = new Value(new BuiltInTypeSymbol("vector"), data);
}
  ;
  
filter returns [Value value]
@init {
  Integer index = 0;
  ArrayList<Integer> data = new ArrayList<Integer>();
  Integer vsize; 
  currentscope = new NestedScope("filscope", currentscope); 
}
  : ^('filter' IDENT v=expr  {
    vsize = $v.value.getSize();
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"), new Value($v.value.dref(new Value(index)).getInt()));
    currentscope.define(vs);
  } 
  ({int mark = input.mark();} d=expr {
  if ($d.value.getInt().intValue() == 1)
    data.add($v.value.dref(new Value(index)).getInt());
  
  index++;
  vs.setValue(new Value($v.value.dref(new Value(index)).getInt()));
  if (index < vsize) input.rewind(mark);
  })+
  ) {
    currentscope = currentscope.getEnclosingScope();
    $value = new Value(new BuiltInTypeSymbol("vector"), data);
}
  ;

type returns [Type tsym]
  : IDENT 
  {
    $tsym = (Type) symtab.resolveType($IDENT.text);
  }
  ;
