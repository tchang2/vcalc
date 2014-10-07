// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g 2014-10-06 17:56:42

import SymTab.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PopulateST extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "DECL", "CSTAT", "GEN", "DREF", "IDENT", "EQUAL", "SC", "IN", "LP", "RP", "INTEGER", "LETTER", "DIGIT", "LB", "RB", "WS", "'fi'", "'if'", "'loop'", "'pool'", "'print'", "'filter'", "'=='", "'!='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'..'", "'|'"
    };
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int PROGRAM=4;
    public static final int DECL=5;
    public static final int CSTAT=6;
    public static final int GEN=7;
    public static final int DREF=8;
    public static final int IDENT=9;
    public static final int EQUAL=10;
    public static final int SC=11;
    public static final int IN=12;
    public static final int LP=13;
    public static final int RP=14;
    public static final int INTEGER=15;
    public static final int LETTER=16;
    public static final int DIGIT=17;
    public static final int LB=18;
    public static final int RB=19;
    public static final int WS=20;

    // delegates
    // delegators


        public PopulateST(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public PopulateST(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PopulateST.tokenNames; }
    public String getGrammarFileName() { return "/home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g"; }


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



    // $ANTLR start "program"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:31:1: program : ^( PROGRAM ( declaration )* ( statement )* ) ;
    public final void program() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:32:3: ( ^( PROGRAM ( declaration )* ( statement )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:32:5: ^( PROGRAM ( declaration )* ( statement )* )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program59); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:32:15: ( declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DECL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:32:15: declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_program61);
                	    declaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:32:28: ( statement )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==EQUAL||(LA2_0>=22 && LA2_0<=23)||LA2_0==25) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:32:28: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_program64);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "declaration"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:36:1: declaration : ^( DECL type assignment ) ;
    public final void declaration() throws RecognitionException {
        AssignmentTuple assignment1 = null;

        Type type2 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:37:3: ( ^( DECL type assignment ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:37:5: ^( DECL type assignment )
            {
            match(input,DECL,FOLLOW_DECL_in_declaration81); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_declaration83);
            type2=type();

            state._fsp--;

            pushFollow(FOLLOW_assignment_in_declaration85);
            assignment1=assignment();

            state._fsp--;


            match(input, Token.UP, null); 

                if (symtab.definedName(assignment1.id)) {
                  //System.err.println(input.toString());
                  System.err.println("The identifier '" + assignment1.id + "' has already been defined, or is a built in symbol and cannot be reused");
                  System.exit(-1);
                }  
                if (!type2.getName().equals(assignment1.type)) {
                  System.err.println("Type missmatch on symbol '" + assignment1.id + "', expected '" + type2.getName() + "', got '" + assignment1.type + "'");
                  System.exit(-1);
                }
                VariableSymbol vs = new VariableSymbol(assignment1.id, type2);
                symtab.globals.define(vs);
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "assignment"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:53:1: assignment returns [AssignmentTuple tup] : ^( EQUAL IDENT expr ) ;
    public final AssignmentTuple assignment() throws RecognitionException {
        AssignmentTuple tup = null;

        CommonTree IDENT3=null;
        String expr4 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:54:3: ( ^( EQUAL IDENT expr ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:54:5: ^( EQUAL IDENT expr )
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignment109); 

            match(input, Token.DOWN, null); 
            IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment111); 
            pushFollow(FOLLOW_expr_in_assignment113);
            expr4=expr();

            state._fsp--;


            match(input, Token.UP, null); 
            tup = new AssignmentTuple((IDENT3!=null?IDENT3.getText():null), expr4);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tup;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "statement"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:57:1: statement : ( ifStatement | loopStatement | printStatement | assignment );
    public final void statement() throws RecognitionException {
        AssignmentTuple assignment5 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:58:3: ( ifStatement | loopStatement | printStatement | assignment )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case EQUAL:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:58:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement131);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:59:5: loopStatement
                    {
                    pushFollow(FOLLOW_loopStatement_in_statement137);
                    loopStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:60:5: printStatement
                    {
                    pushFollow(FOLLOW_printStatement_in_statement143);
                    printStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:61:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement149);
                    assignment5=assignment();

                    state._fsp--;


                        Symbol id = symtab.resolve(assignment5.id);
                        if (id == null) {
                          System.err.println("The symbol '" + assignment5.id + "' is undefined");
                          System.exit(-1);
                        }
                        if (!id.getTypeName().equals(assignment5.type)) {
                          System.err.println("Type missmatch on symbol '" + assignment5.id + "', expected '" + id.getTypeName() + "', got '" + assignment5.type + "'");
                          System.exit(-1);
                        }
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "ifStatement"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:73:1: ifStatement : ^( 'if' expr cstat ) ;
    public final void ifStatement() throws RecognitionException {
        String expr6 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:74:3: ( ^( 'if' expr cstat ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:74:5: ^( 'if' expr cstat )
            {
            match(input,22,FOLLOW_22_in_ifStatement164); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifStatement166);
            expr6=expr();

            state._fsp--;


                if (!expr6.equals("int")) {
                  System.err.println("conditional expressions need to return an integer value");
                  System.exit(-1);
                }
              
            pushFollow(FOLLOW_cstat_in_ifStatement172);
            cstat();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "loopStatement"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:82:1: loopStatement : ^( 'loop' expr cstat ) ;
    public final void loopStatement() throws RecognitionException {
        String expr7 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:83:3: ( ^( 'loop' expr cstat ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:83:5: ^( 'loop' expr cstat )
            {
            match(input,23,FOLLOW_23_in_loopStatement186); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_loopStatement188);
            expr7=expr();

            state._fsp--;


                if (!expr7.equals("int")) {
                  System.err.println("conditional expressions need to return an integer value");
                  System.exit(-1);
                }
              
            pushFollow(FOLLOW_cstat_in_loopStatement192);
            cstat();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "loopStatement"


    // $ANTLR start "cstat"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:90:1: cstat : ^( CSTAT ( statement )* ) ;
    public final void cstat() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:91:3: ( ^( CSTAT ( statement )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:91:5: ^( CSTAT ( statement )* )
            {
            match(input,CSTAT,FOLLOW_CSTAT_in_cstat206); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:91:13: ( statement )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==EQUAL||(LA4_0>=22 && LA4_0<=23)||LA4_0==25) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:91:13: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_cstat208);
                	    statement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cstat"


    // $ANTLR start "printStatement"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:93:1: printStatement : ^( 'print' expr ) ;
    public final void printStatement() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:94:3: ( ^( 'print' expr ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:94:5: ^( 'print' expr )
            {
            match(input,25,FOLLOW_25_in_printStatement223); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_printStatement225);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "printStatement"


    // $ANTLR start "expr"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:96:1: expr returns [String type] : ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( DREF a= expr b= expr ) | vector | IDENT | INTEGER );
    public final String expr() throws RecognitionException {
        String type = null;

        CommonTree IDENT8=null;
        String a = null;

        String b = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:98:3: ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( DREF a= expr b= expr ) | vector | IDENT | INTEGER )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
                {
                alt5=6;
                }
                break;
            case 30:
                {
                alt5=7;
                }
                break;
            case 29:
                {
                alt5=8;
                }
                break;
            case DREF:
                {
                alt5=9;
                }
                break;
            case GEN:
            case 26:
            case 37:
                {
                alt5=10;
                }
                break;
            case IDENT:
                {
                alt5=11;
                }
                break;
            case INTEGER:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:98:5: ^( '+' a= expr b= expr )
                    {
                    match(input,31,FOLLOW_31_in_expr244); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr248);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr252);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:104:5: ^( '-' a= expr b= expr )
                    {
                    match(input,32,FOLLOW_32_in_expr262); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr266);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr270);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:110:5: ^( '*' a= expr b= expr )
                    {
                    match(input,33,FOLLOW_33_in_expr280); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr284);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr288);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:116:5: ^( '/' a= expr b= expr )
                    {
                    match(input,34,FOLLOW_34_in_expr298); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr302);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr306);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 5 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:122:5: ^( '==' a= expr b= expr )
                    {
                    match(input,27,FOLLOW_27_in_expr316); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr320);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr324);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 6 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:128:5: ^( '!=' a= expr b= expr )
                    {
                    match(input,28,FOLLOW_28_in_expr334); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr338);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr342);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 7 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:134:5: ^( '>' a= expr b= expr )
                    {
                    match(input,30,FOLLOW_30_in_expr352); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr356);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr360);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 8 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:140:5: ^( '<' a= expr b= expr )
                    {
                    match(input,29,FOLLOW_29_in_expr370); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr374);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr378);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (a.equals("vector") || b.equals("vector"))
                          type = "vector";
                        else
                          type = "int";
                      

                    }
                    break;
                case 9 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:146:5: ^( DREF a= expr b= expr )
                    {
                    match(input,DREF,FOLLOW_DREF_in_expr388); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr392);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr396);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (!a.equals("vector")) {
                          System.err.println("cannot index on type '" + a + "', requires vector");
                          System.exit(-1);
                        }
                        type = b;
                      

                    }
                    break;
                case 10 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:153:5: vector
                    {
                    pushFollow(FOLLOW_vector_in_expr405);
                    vector();

                    state._fsp--;

                    type = "vector";

                    }
                    break;
                case 11 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:154:5: IDENT
                    {
                    IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expr413); 

                        Symbol s = currentscope.resolve((IDENT8!=null?IDENT8.getText():null));
                        if (s == null) {
                          System.err.println("The symbol '" + (IDENT8!=null?IDENT8.getText():null) + "' has not been defined yet");
                          System.exit(-1);
                        }
                        type = s.getTypeName();
                      

                    }
                    break;
                case 12 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:163:5: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_expr424); 
                    type = "int";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return type;
    }
    // $ANTLR end "expr"


    // $ANTLR start "vector"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:165:1: vector : ( ^( '..' expr expr ) | ^( GEN IDENT v= expr e= expr ) | ^( 'filter' IDENT v= expr e= expr ) );
    public final void vector() throws RecognitionException {
        CommonTree IDENT9=null;
        CommonTree IDENT10=null;
        String v = null;

        String e = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:166:3: ( ^( '..' expr expr ) | ^( GEN IDENT v= expr e= expr ) | ^( 'filter' IDENT v= expr e= expr ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt6=1;
                }
                break;
            case GEN:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:166:5: ^( '..' expr expr )
                    {
                    match(input,37,FOLLOW_37_in_vector439); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_vector441);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_vector443);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:167:5: ^( GEN IDENT v= expr e= expr )
                    {
                    match(input,GEN,FOLLOW_GEN_in_vector451); 

                    match(input, Token.DOWN, null); 
                    IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_vector453); 

                        currentscope = new NestedScope("genscope", currentscope);
                        VariableSymbol vs = new VariableSymbol((IDENT9!=null?IDENT9.getText():null), new BuiltInTypeSymbol("int"));
                        currentscope.define(vs);
                      
                    pushFollow(FOLLOW_expr_in_vector462);
                    v=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_vector466);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (!v.equals("vector")) {
                          System.err.println("Need a vector for the domain vector");
                          System.exit(-1);
                        }
                        if (!e.equals("int")) {
                          System.err.println("Generator expression must be an integer expression");
                        }
                        currentscope = currentscope.getEnclosingScope();
                      

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:184:5: ^( 'filter' IDENT v= expr e= expr )
                    {
                    match(input,26,FOLLOW_26_in_vector482); 

                    match(input, Token.DOWN, null); 
                    IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_vector484); 

                        currentscope = new NestedScope("filscope", currentscope);
                        VariableSymbol vs = new VariableSymbol((IDENT10!=null?IDENT10.getText():null), new BuiltInTypeSymbol("int"));
                        
                        currentscope.define(vs);
                      
                    pushFollow(FOLLOW_expr_in_vector493);
                    v=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_vector497);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (!v.equals("vector")) {
                          System.err.println("Need a vector for the domain vector");
                          System.exit(-1);
                        }
                        if (!e.equals("int")) {
                          System.err.println("Generator expression must be an integer expression");
                        }
                        currentscope = currentscope.getEnclosingScope();
                      

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "vector"


    // $ANTLR start "type"
    // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:202:1: type returns [Type tsym] : IDENT ;
    public final Type type() throws RecognitionException {
        Type tsym = null;

        CommonTree IDENT11=null;

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:203:3: ( IDENT )
            // /home/linux-vm/workspace_indigo/git/vcalc/PopulateST.g:203:5: IDENT
            {
            IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_type519); 

                tsym = (Type) symtab.resolveType((IDENT11!=null?IDENT11.getText():null));
                //System.out.println(tsym.getName());
                if (tsym == null) {
                  System.err.println("'" + (IDENT11!=null?IDENT11.getText():null) + "' is not a valid type");
                  System.exit(-1);
                }
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tsym;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_program59 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_program61 = new BitSet(new long[]{0x0000000002C00428L});
    public static final BitSet FOLLOW_statement_in_program64 = new BitSet(new long[]{0x0000000002C00408L});
    public static final BitSet FOLLOW_DECL_in_declaration81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_declaration83 = new BitSet(new long[]{0x0000000002C00400L});
    public static final BitSet FOLLOW_assignment_in_declaration85 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_assignment109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment111 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_assignment113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStatement_in_statement131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_statement143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ifStatement164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifStatement166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_ifStatement172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_loopStatement186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_loopStatement188 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_loopStatement192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CSTAT_in_cstat206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_cstat208 = new BitSet(new long[]{0x0000000002C00408L});
    public static final BitSet FOLLOW_25_in_printStatement223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printStatement225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expr244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr248 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expr262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr266 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_33_in_expr280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr284 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expr298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr302 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr320 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expr334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expr352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr356 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr374 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DREF_in_expr388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr392 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_vector_in_expr405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expr413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_expr424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_vector439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_vector441 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEN_in_vector451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_vector453 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector462 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector466 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_vector482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_vector484 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector493 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_type519 = new BitSet(new long[]{0x0000000000000002L});

}