// $ANTLR 3.3 Nov 30, 2010 12:50:56 /cshome/bilec/git/vcalc/PopulateST.g 2014-10-08 18:28:19

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
    public String getGrammarFileName() { return "/cshome/bilec/git/vcalc/PopulateST.g"; }


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
    // /cshome/bilec/git/vcalc/PopulateST.g:31:1: program : ^( PROGRAM ( declaration )* ( statement )* ) ;
    public final void program() throws RecognitionException {
        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:32:3: ( ^( PROGRAM ( declaration )* ( statement )* ) )
            // /cshome/bilec/git/vcalc/PopulateST.g:32:5: ^( PROGRAM ( declaration )* ( statement )* )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program59); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /cshome/bilec/git/vcalc/PopulateST.g:32:15: ( declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DECL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /cshome/bilec/git/vcalc/PopulateST.g:32:15: declaration
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

                // /cshome/bilec/git/vcalc/PopulateST.g:32:28: ( statement )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==EQUAL||(LA2_0>=22 && LA2_0<=23)||LA2_0==25) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /cshome/bilec/git/vcalc/PopulateST.g:32:28: statement
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
    // /cshome/bilec/git/vcalc/PopulateST.g:36:1: declaration : ^( DECL type assignment ) ;
    public final void declaration() throws RecognitionException {
        AssignmentTuple assignment1 = null;

        Type type2 = null;


        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:37:3: ( ^( DECL type assignment ) )
            // /cshome/bilec/git/vcalc/PopulateST.g:37:5: ^( DECL type assignment )
            {
            match(input,DECL,FOLLOW_DECL_in_declaration81); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_declaration83);
            type2=type();

            state._fsp--;

            int line = input.getTokenStream().get(input.index()).getLine(); int chline = input.getTokenStream().get(input.index()).getCharPositionInLine();
            pushFollow(FOLLOW_assignment_in_declaration87);
            assignment1=assignment();

            state._fsp--;


            match(input, Token.UP, null); 

                if (symtab.definedName(assignment1.id)) {
                  System.err.println("Sanity Error: Line<" + line + ":" + chline + ">" + "The identifier '" + assignment1.id + "' has already been defined, or is a built in symbol and cannot be reused");
                  System.exit(-1);
                }  
                if (!type2.getName().equals(assignment1.type)) {
                  System.err.println("Sanity Error: Line<" + line + ":" + chline + ">" + "Type missmatch on symbol '" + assignment1.id + "', expected '" + type2.getName() + "', got '" + assignment1.type + "'");
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
    // /cshome/bilec/git/vcalc/PopulateST.g:52:1: assignment returns [AssignmentTuple tup] : ^( EQUAL IDENT expr ) ;
    public final AssignmentTuple assignment() throws RecognitionException {
        AssignmentTuple tup = null;

        CommonTree IDENT3=null;
        String expr4 = null;


        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:53:3: ( ^( EQUAL IDENT expr ) )
            // /cshome/bilec/git/vcalc/PopulateST.g:53:5: ^( EQUAL IDENT expr )
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignment112); 

            match(input, Token.DOWN, null); 
            IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment114); 
            pushFollow(FOLLOW_expr_in_assignment116);
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
    // /cshome/bilec/git/vcalc/PopulateST.g:56:1: statement : ( ifStatement | loopStatement | printStatement | assignment );
    public final void statement() throws RecognitionException {
        AssignmentTuple assignment5 = null;


        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:57:3: ( ifStatement | loopStatement | printStatement | assignment )
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:57:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement134);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:58:5: loopStatement
                    {
                    pushFollow(FOLLOW_loopStatement_in_statement140);
                    loopStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:59:5: printStatement
                    {
                    pushFollow(FOLLOW_printStatement_in_statement146);
                    printStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:60:5: assignment
                    {
                    int line = input.getTokenStream().get(input.index()).getLine(); int chline = input.getTokenStream().get(input.index()).getCharPositionInLine();
                    pushFollow(FOLLOW_assignment_in_statement159);
                    assignment5=assignment();

                    state._fsp--;


                        Symbol id = symtab.resolve(assignment5.id);
                        if (id == null) {
                          System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "The symbol '" + assignment5.id + "' is undefined");
                          System.exit(-1);
                        }
                        if (!id.getTypeName().equals(assignment5.type)) {
                          System.err.println("Sanity Error: Line<" + line + ":" + chline + ">" + "Type missmatch on symbol '" + assignment5.id + "', expected '" + id.getTypeName() + "', got '" + assignment5.type + "'");
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
    // /cshome/bilec/git/vcalc/PopulateST.g:73:1: ifStatement : ^( 'if' expr cstat ) ;
    public final void ifStatement() throws RecognitionException {
        String expr6 = null;


        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:74:3: ( ^( 'if' expr cstat ) )
            // /cshome/bilec/git/vcalc/PopulateST.g:74:5: ^( 'if' expr cstat )
            {
            match(input,22,FOLLOW_22_in_ifStatement174); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifStatement176);
            expr6=expr();

            state._fsp--;


                if (!expr6.equals("int")) {
                  System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "conditional expressions need to return an integer value");
                  System.exit(-1);
                }
              
            pushFollow(FOLLOW_cstat_in_ifStatement182);
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
    // /cshome/bilec/git/vcalc/PopulateST.g:82:1: loopStatement : ^( 'loop' expr cstat ) ;
    public final void loopStatement() throws RecognitionException {
        String expr7 = null;


        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:83:3: ( ^( 'loop' expr cstat ) )
            // /cshome/bilec/git/vcalc/PopulateST.g:83:5: ^( 'loop' expr cstat )
            {
            match(input,23,FOLLOW_23_in_loopStatement196); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_loopStatement198);
            expr7=expr();

            state._fsp--;


                if (!expr7.equals("int")) {
                  System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" +
                    " conditional expressions need to return an integer value");
                  System.exit(-1);
                }
              
            pushFollow(FOLLOW_cstat_in_loopStatement202);
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
    // /cshome/bilec/git/vcalc/PopulateST.g:91:1: cstat : ^( CSTAT ( statement )* ) ;
    public final void cstat() throws RecognitionException {
        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:92:3: ( ^( CSTAT ( statement )* ) )
            // /cshome/bilec/git/vcalc/PopulateST.g:92:5: ^( CSTAT ( statement )* )
            {
            match(input,CSTAT,FOLLOW_CSTAT_in_cstat216); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /cshome/bilec/git/vcalc/PopulateST.g:92:13: ( statement )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==EQUAL||(LA4_0>=22 && LA4_0<=23)||LA4_0==25) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /cshome/bilec/git/vcalc/PopulateST.g:92:13: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_cstat218);
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
    // /cshome/bilec/git/vcalc/PopulateST.g:94:1: printStatement : ^( 'print' expr ) ;
    public final void printStatement() throws RecognitionException {
        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:95:3: ( ^( 'print' expr ) )
            // /cshome/bilec/git/vcalc/PopulateST.g:95:5: ^( 'print' expr )
            {
            match(input,25,FOLLOW_25_in_printStatement233); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_printStatement235);
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
    // /cshome/bilec/git/vcalc/PopulateST.g:97:1: expr returns [String type] : ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( DREF a= expr b= expr ) | vector | IDENT | INTEGER );
    public final String expr() throws RecognitionException {
        String type = null;

        CommonTree IDENT8=null;
        String a = null;

        String b = null;


        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:98:3: ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( DREF a= expr b= expr ) | vector | IDENT | INTEGER )
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:98:5: ^( '+' a= expr b= expr )
                    {
                    match(input,31,FOLLOW_31_in_expr253); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr257);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr261);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:104:5: ^( '-' a= expr b= expr )
                    {
                    match(input,32,FOLLOW_32_in_expr271); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr275);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr279);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:110:5: ^( '*' a= expr b= expr )
                    {
                    match(input,33,FOLLOW_33_in_expr289); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr293);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr297);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:116:5: ^( '/' a= expr b= expr )
                    {
                    match(input,34,FOLLOW_34_in_expr307); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr311);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr315);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:122:5: ^( '==' a= expr b= expr )
                    {
                    match(input,27,FOLLOW_27_in_expr325); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr329);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr333);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:128:5: ^( '!=' a= expr b= expr )
                    {
                    match(input,28,FOLLOW_28_in_expr343); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr347);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr351);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:134:5: ^( '>' a= expr b= expr )
                    {
                    match(input,30,FOLLOW_30_in_expr361); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr365);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr369);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:140:5: ^( '<' a= expr b= expr )
                    {
                    match(input,29,FOLLOW_29_in_expr379); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr383);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr387);
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:146:5: ^( DREF a= expr b= expr )
                    {
                    match(input,DREF,FOLLOW_DREF_in_expr397); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr401);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr405);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (!a.equals("vector")) {
                          System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "cannot index on type '" + a + "', requires vector");
                          System.exit(-1);
                        }
                        type = b;
                      

                    }
                    break;
                case 10 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:153:5: vector
                    {
                    pushFollow(FOLLOW_vector_in_expr414);
                    vector();

                    state._fsp--;

                    type = "vector";

                    }
                    break;
                case 11 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:154:5: IDENT
                    {
                    IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expr422); 

                        Symbol s = currentscope.resolve((IDENT8!=null?IDENT8.getText():null));
                        if (s == null) {
                          System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "The symbol '" + (IDENT8!=null?IDENT8.getText():null) + "' has not been defined yet");
                          System.exit(-1);
                        }
                        type = s.getTypeName();
                      

                    }
                    break;
                case 12 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:163:5: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_expr433); 
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
    // /cshome/bilec/git/vcalc/PopulateST.g:165:1: vector : ( ^( '..' expr expr ) | ^( GEN IDENT v= expr e= expr ) | ^( 'filter' IDENT v= expr e= expr ) );
    public final void vector() throws RecognitionException {
        CommonTree IDENT9=null;
        CommonTree IDENT10=null;
        String v = null;

        String e = null;


        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:166:3: ( ^( '..' expr expr ) | ^( GEN IDENT v= expr e= expr ) | ^( 'filter' IDENT v= expr e= expr ) )
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
                    // /cshome/bilec/git/vcalc/PopulateST.g:166:5: ^( '..' expr expr )
                    {
                    match(input,37,FOLLOW_37_in_vector448); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_vector450);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_vector452);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:167:5: ^( GEN IDENT v= expr e= expr )
                    {
                    match(input,GEN,FOLLOW_GEN_in_vector460); 

                    match(input, Token.DOWN, null); 
                    IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_vector462); 

                        currentscope = new NestedScope("genscope", currentscope);
                        VariableSymbol vs = new VariableSymbol((IDENT9!=null?IDENT9.getText():null), new BuiltInTypeSymbol("int"));
                        currentscope.define(vs);
                      
                    pushFollow(FOLLOW_expr_in_vector471);
                    v=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_vector475);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (!v.equals("vector")) {
                          System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "Need a vector for the domain vector");
                          System.exit(-1);
                        }
                        if (!e.equals("int")) {
                          System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "Generator expression must be an integer expression");
                          System.exit(-1);
                        }
                        currentscope = currentscope.getEnclosingScope();
                      

                    }
                    break;
                case 3 :
                    // /cshome/bilec/git/vcalc/PopulateST.g:185:5: ^( 'filter' IDENT v= expr e= expr )
                    {
                    match(input,26,FOLLOW_26_in_vector491); 

                    match(input, Token.DOWN, null); 
                    IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_vector493); 

                        currentscope = new NestedScope("filscope", currentscope);
                        VariableSymbol vs = new VariableSymbol((IDENT10!=null?IDENT10.getText():null), new BuiltInTypeSymbol("int"));
                        
                        currentscope.define(vs);
                      
                    pushFollow(FOLLOW_expr_in_vector502);
                    v=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_vector506);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (!v.equals("vector")) {
                          System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "Need a vector for the domain vector");
                          System.exit(-1);
                        }
                        if (!e.equals("int")) {
                          System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "filter expression must be an integer expression");
                          System.exit(-1);
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
    // /cshome/bilec/git/vcalc/PopulateST.g:204:1: type returns [Type tsym] : IDENT ;
    public final Type type() throws RecognitionException {
        Type tsym = null;

        CommonTree IDENT11=null;

        try {
            // /cshome/bilec/git/vcalc/PopulateST.g:205:3: ( IDENT )
            // /cshome/bilec/git/vcalc/PopulateST.g:205:5: IDENT
            {
            IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_type528); 

                tsym = (Type) symtab.resolveType((IDENT11!=null?IDENT11.getText():null));
                //System.out.println(tsym.getName());
                if (tsym == null) {
                  System.err.println("Sanity Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "'" + (IDENT11!=null?IDENT11.getText():null) + "' is not a valid type");
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
    public static final BitSet FOLLOW_assignment_in_declaration87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_assignment112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment114 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_assignment116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStatement_in_statement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_statement146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ifStatement174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifStatement176 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_ifStatement182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_loopStatement196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_loopStatement198 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_loopStatement202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CSTAT_in_cstat216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_cstat218 = new BitSet(new long[]{0x0000000002C00408L});
    public static final BitSet FOLLOW_25_in_printStatement233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printStatement235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expr253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr257 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expr271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr275 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_33_in_expr289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr293 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expr307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr311 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr329 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expr343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr347 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expr361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr365 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DREF_in_expr397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr401 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_vector_in_expr414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expr422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_expr433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_vector448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_vector450 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEN_in_vector460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_vector462 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector471 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_vector491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_vector493 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector502 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_vector506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_type528 = new BitSet(new long[]{0x0000000000000002L});

}