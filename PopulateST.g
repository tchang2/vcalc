tree grammar PopulateST;

options {
  language = Java;
  output = AST;
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

declaration
  : ^(DECL type assignment) {
    VariableSymbol vs = new VariableSymbol($assignment.id, $type.tsym);
    //System.out.println(vs.toString());
    symtab.globals.define(vs);
  }
  ;
assignment returns [String id]
  : ^('=' IDENT expr) {$id = $IDENT.text;}
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
  | ^(DREF IDENT expr)
  | vector
  | IDENT 
  | INTEGER 
  ;
vector
  : ^('..' expr expr)
  | ^(GEN IDENT {
    currentscope = new NestedScope("genscope", currentscope);
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"));
    //System.out.println(vs.toString());
    currentscope.define(vs);
  } vector expr) {currentscope = currentscope.getEnclosingScope();}
  | ^('filter' IDENT {
    currentscope = new NestedScope("filscope", currentscope);
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"));
    
    currentscope.define(vs);
  } vector expr) {currentscope = currentscope.getEnclosingScope();}
  ;
type returns [Type tsym]
  : WORD {
    $tsym = (Type) symtab.resolveType($WORD.text);
    if ($tsym == null) {
      System.err.println("'" + $WORD.text + "' is not a valid type");
      System.exit(-1);
    }
  }
  ;
