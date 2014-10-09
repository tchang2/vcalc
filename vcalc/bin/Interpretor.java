// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g 2014-10-08 19:21:38

import SymTab.*;
import VcalcValue.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Interpretor extends TreeParser {
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


        public Interpretor(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Interpretor(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Interpretor.tokenNames; }
    public String getGrammarFileName() { return "/home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g"; }


        SymbolTable symtab;
        Scope currentscope;
        boolean gflag = true;
        public Interpretor(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentscope = symtab.globals;
        }



    // $ANTLR start "program"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:25:1: program : ^( PROGRAM ( declaration )* ( statement )* ) ;
    public final void program() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:26:3: ( ^( PROGRAM ( declaration )* ( statement )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:26:5: ^( PROGRAM ( declaration )* ( statement )* )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_program59); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:26:15: ( declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DECL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:26:15: declaration
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

                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:26:28: ( statement )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==EQUAL||(LA2_0>=22 && LA2_0<=23)||LA2_0==25) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:26:28: statement
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
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:30:1: declaration : ^( DECL type assignment ) ;
    public final void declaration() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:31:3: ( ^( DECL type assignment ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:31:5: ^( DECL type assignment )
            {
            match(input,DECL,FOLLOW_DECL_in_declaration81); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_declaration83);
            type();

            state._fsp--;

            pushFollow(FOLLOW_assignment_in_declaration85);
            assignment();

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
    // $ANTLR end "declaration"


    // $ANTLR start "assignment"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:35:1: assignment : ^( EQUAL IDENT expr ) ;
    public final void assignment() throws RecognitionException {
        CommonTree IDENT1=null;
        Value expr2 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:36:3: ( ^( EQUAL IDENT expr ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:36:5: ^( EQUAL IDENT expr )
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_assignment105); 

            match(input, Token.DOWN, null); 
            IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment107); 
            pushFollow(FOLLOW_expr_in_assignment109);
            expr2=expr();

            state._fsp--;


            match(input, Token.UP, null); 

                if (gflag) {
                  Symbol s = symtab.resolve((IDENT1!=null?IDENT1.getText():null));
                  VariableSymbol vs = (VariableSymbol) s;
                  vs.setValue(expr2);
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
    // $ANTLR end "assignment"


    // $ANTLR start "statement"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:44:1: statement : ( ifStatement | loopStatement | printStatement | assignment );
    public final void statement() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:45:3: ( ifStatement | loopStatement | printStatement | assignment )
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
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:45:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement125);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:46:5: loopStatement
                    {
                    pushFollow(FOLLOW_loopStatement_in_statement131);
                    loopStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:47:5: printStatement
                    {
                    pushFollow(FOLLOW_printStatement_in_statement137);
                    printStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:48:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement143);
                    assignment();

                    state._fsp--;


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
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:50:1: ifStatement : ^( 'if' expr cstat ) ;
    public final void ifStatement() throws RecognitionException {
        Value expr3 = null;


        boolean flag = true; boolean oldflag = true;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:52:3: ( ^( 'if' expr cstat ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:52:5: ^( 'if' expr cstat )
            {
            match(input,22,FOLLOW_22_in_ifStatement162); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifStatement164);
            expr3=expr();

            state._fsp--;


                if (gflag) {
                    oldflag = gflag;
                    int cond = expr3.getInt().intValue();
                    if (cond != 1 && cond != 0) {
                      System.err.println("Runtime Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "Conditional statements require a value of 1 or 0, got: " + cond);
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
                
            pushFollow(FOLLOW_cstat_in_ifStatement174);
            cstat();

            state._fsp--;


            match(input, Token.UP, null); 
            gflag = oldflag;

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
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:74:1: loopStatement : ^( 'loop' expr cstat ) ;
    public final void loopStatement() throws RecognitionException {
        Value expr4 = null;


        int mark = input.mark(); boolean rewind = false; boolean flag = true; boolean oldflag = true;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:76:3: ( ^( 'loop' expr cstat ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:76:5: ^( 'loop' expr cstat )
            {
            match(input,23,FOLLOW_23_in_loopStatement195); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_loopStatement197);
            expr4=expr();

            state._fsp--;


                if (gflag) {
                  oldflag = gflag;
                  int cond = expr4.getInt().intValue();
                  if (cond != 1 && cond != 0) {
                    System.err.println("Runtime Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "Conditional statements require a value of 1 or 0, got: " + cond);
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
              
            pushFollow(FOLLOW_cstat_in_loopStatement203);
            cstat();

            state._fsp--;


            match(input, Token.UP, null); 
            gflag = oldflag; if (rewind) input.rewind(mark);

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
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:99:1: cstat : ^( CSTAT ( statement )* ) ;
    public final void cstat() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:100:3: ( ^( CSTAT ( statement )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:100:5: ^( CSTAT ( statement )* )
            {
            match(input,CSTAT,FOLLOW_CSTAT_in_cstat219); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:100:13: ( statement )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==EQUAL||(LA4_0>=22 && LA4_0<=23)||LA4_0==25) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:100:13: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_cstat221);
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
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:102:1: printStatement : ^( 'print' expr ) ;
    public final void printStatement() throws RecognitionException {
        Value expr5 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:103:3: ( ^( 'print' expr ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:103:5: ^( 'print' expr )
            {
            match(input,25,FOLLOW_25_in_printStatement236); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_printStatement238);
            expr5=expr();

            state._fsp--;


            match(input, Token.UP, null); 
            if (gflag) expr5.print();

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
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:105:1: expr returns [Value value] : ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( DREF a= expr b= expr ) | ^( '..' a= expr b= expr ) | gen | filter | IDENT | INTEGER );
    public final Value expr() throws RecognitionException {
        Value value = null;

        CommonTree IDENT8=null;
        CommonTree INTEGER9=null;
        Value a = null;

        Value b = null;

        Value gen6 = null;

        Value filter7 = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:106:3: ( ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( DREF a= expr b= expr ) | ^( '..' a= expr b= expr ) | gen | filter | IDENT | INTEGER )
            int alt5=14;
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
            case 37:
                {
                alt5=10;
                }
                break;
            case GEN:
                {
                alt5=11;
                }
                break;
            case 26:
                {
                alt5=12;
                }
                break;
            case IDENT:
                {
                alt5=13;
                }
                break;
            case INTEGER:
                {
                alt5=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:106:5: ^( '+' a= expr b= expr )
                    {
                    match(input,31,FOLLOW_31_in_expr258); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr262);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr266);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.add(b);

                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:107:5: ^( '-' a= expr b= expr )
                    {
                    match(input,32,FOLLOW_32_in_expr276); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr280);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr284);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.sub(b);

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:108:5: ^( '*' a= expr b= expr )
                    {
                    match(input,33,FOLLOW_33_in_expr294); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr298);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr302);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.mult(b);

                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:109:5: ^( '/' a= expr b= expr )
                    {
                    match(input,34,FOLLOW_34_in_expr312); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr316);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr320);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.div(b);

                    }
                    break;
                case 5 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:110:5: ^( '==' a= expr b= expr )
                    {
                    match(input,27,FOLLOW_27_in_expr330); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr334);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr338);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.eq(b);

                    }
                    break;
                case 6 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:111:5: ^( '!=' a= expr b= expr )
                    {
                    match(input,28,FOLLOW_28_in_expr348); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr352);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr356);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.neq(b);

                    }
                    break;
                case 7 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:112:5: ^( '>' a= expr b= expr )
                    {
                    match(input,30,FOLLOW_30_in_expr366); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr370);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr374);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.gt(b);

                    }
                    break;
                case 8 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:113:5: ^( '<' a= expr b= expr )
                    {
                    match(input,29,FOLLOW_29_in_expr384); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr388);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr392);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.lt(b);

                    }
                    break;
                case 9 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:114:5: ^( DREF a= expr b= expr )
                    {
                    match(input,DREF,FOLLOW_DREF_in_expr402); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr406);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr410);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    value = a.dref(b);

                    }
                    break;
                case 10 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:115:5: ^( '..' a= expr b= expr )
                    {
                    match(input,37,FOLLOW_37_in_expr420); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr424);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr428);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                        if (!a.getTypeName().equals("int") || !b.getTypeName().equals("int") || a.getInt().intValue() > b.getInt().intValue()) {
                          System.err.println("Runtime Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "Range boundary error on " + a.toString() + ".." + b.toString());
                          System.exit(-1);
                        }
                        value = new Value(a, b);
                      

                    }
                    break;
                case 11 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:122:5: gen
                    {
                    pushFollow(FOLLOW_gen_in_expr437);
                    gen6=gen();

                    state._fsp--;

                    value = gen6;

                    }
                    break;
                case 12 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:123:5: filter
                    {
                    pushFollow(FOLLOW_filter_in_expr445);
                    filter7=filter();

                    state._fsp--;

                    value = filter7;

                    }
                    break;
                case 13 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:124:5: IDENT
                    {
                    IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expr453); 

                        Symbol s = currentscope.resolve((IDENT8!=null?IDENT8.getText():null));
                        VariableSymbol vs = (VariableSymbol) s;
                        value = vs.getValue();
                      

                    }
                    break;
                case 14 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:129:5: INTEGER
                    {
                    INTEGER9=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expr461); 
                    value = new Value(Integer.parseInt((INTEGER9!=null?INTEGER9.getText():null)));

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
        return value;
    }
    // $ANTLR end "expr"


    // $ANTLR start "gen"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:132:1: gen returns [Value value] : ^( GEN IDENT v= expr (d= expr )+ ) ;
    public final Value gen() throws RecognitionException {
        Value value = null;

        CommonTree IDENT10=null;
        Value v = null;

        Value d = null;



          Integer index = 0;
          ArrayList<Integer> data = new ArrayList<Integer>();
          Integer vsize; 
          currentscope = new NestedScope("genscope", currentscope); 

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:139:3: ( ^( GEN IDENT v= expr (d= expr )+ ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:139:5: ^( GEN IDENT v= expr (d= expr )+ )
            {
            match(input,GEN,FOLLOW_GEN_in_gen488); 

            match(input, Token.DOWN, null); 
            IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_gen493); 
            pushFollow(FOLLOW_expr_in_gen497);
            v=expr();

            state._fsp--;


                vsize = v.getSize();
                VariableSymbol vs = new VariableSymbol((IDENT10!=null?IDENT10.getText():null), new BuiltInTypeSymbol("int"), new Value(v.dref(new Value(index)).getInt()));
                currentscope.define(vs);
              
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:145:3: (d= expr )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=GEN && LA6_0<=IDENT)||LA6_0==INTEGER||(LA6_0>=26 && LA6_0<=34)||LA6_0==37) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:145:4: d= expr
            	    {
            	    int mark = input.mark();
            	    pushFollow(FOLLOW_expr_in_gen509);
            	    d=expr();

            	    state._fsp--;


            	      data.add(d.getInt());
            	      
            	      index++;
            	      vs.setValue(new Value(v.dref(new Value(index)).getInt()));
            	      if (index < vsize) input.rewind(mark);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input, Token.UP, null); 

                currentscope = currentscope.getEnclosingScope();
                value = new Value(new BuiltInTypeSymbol("vector"), data);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "gen"


    // $ANTLR start "filter"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:158:1: filter returns [Value value] : ^( 'filter' IDENT v= expr (d= expr )+ ) ;
    public final Value filter() throws RecognitionException {
        Value value = null;

        CommonTree IDENT11=null;
        Value v = null;

        Value d = null;



          Integer index = 0;
          ArrayList<Integer> data = new ArrayList<Integer>();
          Integer vsize; 
          currentscope = new NestedScope("filscope", currentscope); 

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:165:3: ( ^( 'filter' IDENT v= expr (d= expr )+ ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:165:5: ^( 'filter' IDENT v= expr (d= expr )+ )
            {
            match(input,26,FOLLOW_26_in_filter545); 

            match(input, Token.DOWN, null); 
            IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_filter547); 
            pushFollow(FOLLOW_expr_in_filter551);
            v=expr();

            state._fsp--;


                vsize = v.getSize();
                VariableSymbol vs = new VariableSymbol((IDENT11!=null?IDENT11.getText():null), new BuiltInTypeSymbol("int"), new Value(v.dref(new Value(index)).getInt()));
                currentscope.define(vs);
              
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:170:3: (d= expr )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=GEN && LA7_0<=IDENT)||LA7_0==INTEGER||(LA7_0>=26 && LA7_0<=34)||LA7_0==37) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:170:4: d= expr
            	    {
            	    int mark = input.mark();
            	    pushFollow(FOLLOW_expr_in_filter564);
            	    d=expr();

            	    state._fsp--;


            	      int cond = d.getInt().intValue();
            	      if (cond != 1 && cond != 0) {
            	        System.err.println("Runtime Error: Line<" + input.getTokenStream().get(input.index()).getLine() + ":" + input.getTokenStream().get(input.index()).getCharPositionInLine() + ">" + "Conditional statements require a value of 1 or 0, got: " + cond);
            	        System.exit(-1);
            	      }
            	      if (cond == 1)
            	        data.add(v.dref(new Value(index)).getInt());
            	      
            	      index++;
            	      vs.setValue(new Value(v.dref(new Value(index)).getInt()));
            	      if (index < vsize) input.rewind(mark);
            	      

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match(input, Token.UP, null); 

                currentscope = currentscope.getEnclosingScope();
                value = new Value(new BuiltInTypeSymbol("vector"), data);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "filter"


    // $ANTLR start "type"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:189:1: type returns [Type tsym] : IDENT ;
    public final Type type() throws RecognitionException {
        Type tsym = null;

        CommonTree IDENT12=null;

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:190:3: ( IDENT )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/Interpretor.g:190:5: IDENT
            {
            IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_type591); 

                tsym = (Type) symtab.resolveType((IDENT12!=null?IDENT12.getText():null));
              

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
    public static final BitSet FOLLOW_EQUAL_in_assignment105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment107 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_assignment109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStatement_in_statement125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_statement137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ifStatement162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifStatement164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_ifStatement174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_loopStatement195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_loopStatement197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_loopStatement203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CSTAT_in_cstat219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_cstat221 = new BitSet(new long[]{0x0000000002C00408L});
    public static final BitSet FOLLOW_25_in_printStatement236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printStatement238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expr258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr262 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expr276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr280 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_33_in_expr294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr298 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expr312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr316 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr334 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expr348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr352 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expr366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr388 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DREF_in_expr402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_37_in_expr420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr424 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_expr428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_gen_in_expr437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filter_in_expr445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expr453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_expr461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GEN_in_gen488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_gen493 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_gen497 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_gen509 = new BitSet(new long[]{0x00000027FC008388L});
    public static final BitSet FOLLOW_26_in_filter545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_filter547 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_filter551 = new BitSet(new long[]{0x00000027FC008380L});
    public static final BitSet FOLLOW_expr_in_filter564 = new BitSet(new long[]{0x00000027FC008388L});
    public static final BitSet FOLLOW_IDENT_in_type591 = new BitSet(new long[]{0x0000000000000002L});

}