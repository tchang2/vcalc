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
    public class AssignmentTuple {
      public String id;
      public String type;
      public AssignmentTuple(String id, String type) {
        this.id = id;
        this.type = type;
      }
    }
}

program
  : ^(PROGRAM declaration* statement*)
  ;

//declaration node, check for redefination error and define new variable
declaration
  : ^(DECL type assignment) {
    if (symtab.definedName($assignment.tup.id)) {
      //System.err.println(input.toString());
      System.err.println("The identifier '" + $assignment.tup.id + "' has already been defined, or is a built in symbol and cannot be reused");
      System.exit(-1);
    }  
    if (!$type.tsym.getName().equals($assignment.tup.type)) {
      System.err.println("Type missmatch on symbol '" + $assignment.tup.id + "', expected '" + $type.tsym.getName() + "', got '" + $assignment.tup.type + "'");
      System.exit(-1);
    }
    VariableSymbol vs = new VariableSymbol($assignment.tup.id, $type.tsym);
    symtab.globals.define(vs);
  }
  ;
  
//return the id of the assignment for use depending on if a declaration or assignment statement
assignment returns [AssignmentTuple tup]
  : ^(EQUAL IDENT expr) {$tup = new AssignmentTuple($IDENT.text, $expr.type);}
  ;
  
statement
  : ifStatement
  | loopStatement
  | printStatement
  | assignment {
    Symbol id = symtab.resolve($assignment.tup.id);
    if (id == null) {
      System.err.println("The symbol '" + $assignment.tup.id + "' is undefined");
      System.exit(-1);
    }
    if (!id.getTypeName().equals($assignment.tup.type)) {
      System.err.println("Type missmatch on symbol '" + $assignment.tup.id + "', expected '" + id.getTypeName() + "', got '" + $assignment.tup.type + "'");
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
expr returns [String type]
  : ^('+' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^('-' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^('*' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^('/' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^('==' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^('!=' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^('>' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^('<' a=expr b=expr) {
    if ($a.type.equals("vector") || $b.type.equals("vector"))
      $type = "vector";
    else
      $type = "int";
  }
  | ^(DREF a=expr b=expr) {
    if (!$a.type.equals("vector")) {
      System.err.println("cannot index on type '" + $a.type + "', requires vector");
      System.exit(-1);
    }
    $type = $b.type;
  }
  | vector {$type = "vector";}
  | IDENT //check to see if IDENT is defined
  {
    Symbol s = currentscope.resolve($IDENT.text);
    if (s == null) {
      System.err.println("The symbol '" + $IDENT.text + "' has not been defined yet");
      System.exit(-1);
    }
    $type = s.getTypeName();
  }
  | INTEGER {$type = "int";}
  ;
vector
  : ^('..' expr expr)
  | ^(GEN IDENT //create new scope and define IDENT within it. pop the scope when done
  {
    currentscope = new NestedScope("genscope", currentscope);
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"));
    currentscope.define(vs);
  } expr expr) 
  {currentscope = currentscope.getEnclosingScope();}
  
  | ^('filter' IDENT //create new scope and define IDENT within it. pop scope when done
  {
    currentscope = new NestedScope("filscope", currentscope);
    VariableSymbol vs = new VariableSymbol($IDENT.text, new BuiltInTypeSymbol("int"));
    
    currentscope.define(vs);
  } expr expr) 
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
