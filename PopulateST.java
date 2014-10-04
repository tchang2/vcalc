// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g 2014-10-03 19:50:39

import SymTab.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class PopulateST extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "DECL", "CSTAT", "GEN", "DREF", "IDENT", "EQUAL", "SC", "LP", "RP", "INTEGER", "LETTER", "DIGIT", "LB", "RB", "WS", "'if'", "'fi'", "'loop'", "'pool'", "'print'", "'=='", "'!='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'['", "']'", "'..'", "'in'", "'|'", "'filter'"
    };
    public static final int EOF=-1;
    public static final int T__20=20;
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
    public static final int LP=12;
    public static final int RP=13;
    public static final int INTEGER=14;
    public static final int LETTER=15;
    public static final int DIGIT=16;
    public static final int LB=17;
    public static final int RB=18;
    public static final int WS=19;

    // delegates
    // delegators


        public PopulateST(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public PopulateST(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PopulateST.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g"; }


        SymbolTable symtab;
        Scope currentscope;
        public PopulateST(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentscope = symtab.globals;
        }


    public static class program_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:24:1: program : ^( PROGRAM ( declaration )* ( statement )* ) ;
    public final PopulateST.program_return program() throws RecognitionException {
        PopulateST.program_return retval = new PopulateST.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PROGRAM1=null;
        PopulateST.declaration_return declaration2 = null;

        PopulateST.statement_return statement3 = null;


        CommonTree PROGRAM1_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:25:3: ( ^( PROGRAM ( declaration )* ( statement )* ) )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:25:5: ^( PROGRAM ( declaration )* ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PROGRAM1=(CommonTree)match(input,PROGRAM,FOLLOW_PROGRAM_in_program68); 
            PROGRAM1_tree = (CommonTree)adaptor.dupNode(PROGRAM1);

            root_1 = (CommonTree)adaptor.becomeRoot(PROGRAM1_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:25:15: ( declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DECL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:25:15: declaration
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_declaration_in_program70);
                	    declaration2=declaration();

                	    state._fsp--;

                	    adaptor.addChild(root_1, declaration2.getTree());

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:25:28: ( statement )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==EQUAL||LA2_0==20||LA2_0==22||LA2_0==24) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:25:28: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_program73);
                	    statement3=statement();

                	    state._fsp--;

                	    adaptor.addChild(root_1, statement3.getTree());

                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:29:1: declaration : ^( DECL type assignment ) ;
    public final PopulateST.declaration_return declaration() throws RecognitionException {
        PopulateST.declaration_return retval = new PopulateST.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DECL4=null;
        PopulateST.type_return type5 = null;

        PopulateST.assignment_return assignment6 = null;


        CommonTree DECL4_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:30:3: ( ^( DECL type assignment ) )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:30:5: ^( DECL type assignment )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DECL4=(CommonTree)match(input,DECL,FOLLOW_DECL_in_declaration90); 
            DECL4_tree = (CommonTree)adaptor.dupNode(DECL4);

            root_1 = (CommonTree)adaptor.becomeRoot(DECL4_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_declaration92);
            type5=type();

            state._fsp--;

            adaptor.addChild(root_1, type5.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_assignment_in_declaration94);
            assignment6=assignment();

            state._fsp--;

            adaptor.addChild(root_1, assignment6.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if (symtab.definedName((assignment6!=null?assignment6.id:null))) {
                  System.err.println("The identifier '" + (assignment6!=null?assignment6.id:null) + "' has already been defined, or is a built in symbol and cannot be reused");
                  System.exit(-1);
                }  
                VariableSymbol vs = new VariableSymbol((assignment6!=null?assignment6.id:null), (type5!=null?type5.tsym:null));
                symtab.globals.define(vs);
              

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class assignment_return extends TreeRuleReturnScope {
        public String id;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:41:1: assignment returns [String id] : ^( EQUAL IDENT expr ) ;
    public final PopulateST.assignment_return assignment() throws RecognitionException {
        PopulateST.assignment_return retval = new PopulateST.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUAL7=null;
        CommonTree IDENT8=null;
        PopulateST.expr_return expr9 = null;


        CommonTree EQUAL7_tree=null;
        CommonTree IDENT8_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:42:3: ( ^( EQUAL IDENT expr ) )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:42:5: ^( EQUAL IDENT expr )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EQUAL7=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_assignment118); 
            EQUAL7_tree = (CommonTree)adaptor.dupNode(EQUAL7);

            root_1 = (CommonTree)adaptor.becomeRoot(EQUAL7_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment120); 
            IDENT8_tree = (CommonTree)adaptor.dupNode(IDENT8);

            adaptor.addChild(root_1, IDENT8_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_assignment122);
            expr9=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr9.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.id = (IDENT8!=null?IDENT8.getText():null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:45:1: statement : ( ifStatement | loopStatement | printStatement | assignment );
    public final PopulateST.statement_return statement() throws RecognitionException {
        PopulateST.statement_return retval = new PopulateST.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        PopulateST.ifStatement_return ifStatement10 = null;

        PopulateST.loopStatement_return loopStatement11 = null;

        PopulateST.printStatement_return printStatement12 = null;

        PopulateST.assignment_return assignment13 = null;



        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:46:3: ( ifStatement | loopStatement | printStatement | assignment )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 24:
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
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:46:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ifStatement_in_statement140);
                    ifStatement10=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:47:5: loopStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_loopStatement_in_statement146);
                    loopStatement11=loopStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, loopStatement11.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:48:5: printStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_printStatement_in_statement152);
                    printStatement12=printStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, printStatement12.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:49:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_assignment_in_statement158);
                    assignment13=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment13.getTree());

                        Symbol id = symtab.resolve((assignment13!=null?assignment13.id:null));
                        if (id == null) {
                          System.err.println("The symbol '" + (assignment13!=null?assignment13.id:null) + "' is undefined");
                          System.exit(-1);
                        }
                      

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class ifStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:57:1: ifStatement : ^( 'if' expr cstat ) ;
    public final PopulateST.ifStatement_return ifStatement() throws RecognitionException {
        PopulateST.ifStatement_return retval = new PopulateST.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal14=null;
        PopulateST.expr_return expr15 = null;

        PopulateST.cstat_return cstat16 = null;


        CommonTree string_literal14_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:58:3: ( ^( 'if' expr cstat ) )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:58:5: ^( 'if' expr cstat )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            string_literal14=(CommonTree)match(input,20,FOLLOW_20_in_ifStatement173); 
            string_literal14_tree = (CommonTree)adaptor.dupNode(string_literal14);

            root_1 = (CommonTree)adaptor.becomeRoot(string_literal14_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_ifStatement175);
            expr15=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr15.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_cstat_in_ifStatement177);
            cstat16=cstat();

            state._fsp--;

            adaptor.addChild(root_1, cstat16.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class loopStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopStatement"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:60:1: loopStatement : ^( 'loop' expr cstat ) ;
    public final PopulateST.loopStatement_return loopStatement() throws RecognitionException {
        PopulateST.loopStatement_return retval = new PopulateST.loopStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal17=null;
        PopulateST.expr_return expr18 = null;

        PopulateST.cstat_return cstat19 = null;


        CommonTree string_literal17_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:61:3: ( ^( 'loop' expr cstat ) )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:61:5: ^( 'loop' expr cstat )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            string_literal17=(CommonTree)match(input,22,FOLLOW_22_in_loopStatement191); 
            string_literal17_tree = (CommonTree)adaptor.dupNode(string_literal17);

            root_1 = (CommonTree)adaptor.becomeRoot(string_literal17_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_loopStatement193);
            expr18=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr18.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_cstat_in_loopStatement195);
            cstat19=cstat();

            state._fsp--;

            adaptor.addChild(root_1, cstat19.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "loopStatement"

    public static class cstat_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cstat"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:63:1: cstat : ^( CSTAT ( statement )* ) ;
    public final PopulateST.cstat_return cstat() throws RecognitionException {
        PopulateST.cstat_return retval = new PopulateST.cstat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CSTAT20=null;
        PopulateST.statement_return statement21 = null;


        CommonTree CSTAT20_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:64:3: ( ^( CSTAT ( statement )* ) )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:64:5: ^( CSTAT ( statement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CSTAT20=(CommonTree)match(input,CSTAT,FOLLOW_CSTAT_in_cstat209); 
            CSTAT20_tree = (CommonTree)adaptor.dupNode(CSTAT20);

            root_1 = (CommonTree)adaptor.becomeRoot(CSTAT20_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:64:13: ( statement )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==EQUAL||LA4_0==20||LA4_0==22||LA4_0==24) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:64:13: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_cstat211);
                	    statement21=statement();

                	    state._fsp--;

                	    adaptor.addChild(root_1, statement21.getTree());

                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cstat"

    public static class printStatement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printStatement"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:66:1: printStatement : ^( 'print' expr ) ;
    public final PopulateST.printStatement_return printStatement() throws RecognitionException {
        PopulateST.printStatement_return retval = new PopulateST.printStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal22=null;
        PopulateST.expr_return expr23 = null;


        CommonTree string_literal22_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:67:3: ( ^( 'print' expr ) )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:67:5: ^( 'print' expr )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            string_literal22=(CommonTree)match(input,24,FOLLOW_24_in_printStatement226); 
            string_literal22_tree = (CommonTree)adaptor.dupNode(string_literal22);

            root_1 = (CommonTree)adaptor.becomeRoot(string_literal22_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_printStatement228);
            expr23=expr();

            state._fsp--;

            adaptor.addChild(root_1, expr23.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "printStatement"

    public static class expr_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:69:1: expr : ( ^( '+' expr expr ) | ^( '-' expr expr ) | ^( '*' expr expr ) | ^( '/' expr expr ) | ^( '==' expr expr ) | ^( '!=' expr expr ) | ^( '>' expr expr ) | ^( '<' expr expr ) | ^( '[' expr ( expr )* ) | vector | IDENT | INTEGER );
    public final PopulateST.expr_return expr() throws RecognitionException {
        PopulateST.expr_return retval = new PopulateST.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal24=null;
        CommonTree char_literal27=null;
        CommonTree char_literal30=null;
        CommonTree char_literal33=null;
        CommonTree string_literal36=null;
        CommonTree string_literal39=null;
        CommonTree char_literal42=null;
        CommonTree char_literal45=null;
        CommonTree char_literal48=null;
        CommonTree IDENT52=null;
        CommonTree INTEGER53=null;
        PopulateST.expr_return expr25 = null;

        PopulateST.expr_return expr26 = null;

        PopulateST.expr_return expr28 = null;

        PopulateST.expr_return expr29 = null;

        PopulateST.expr_return expr31 = null;

        PopulateST.expr_return expr32 = null;

        PopulateST.expr_return expr34 = null;

        PopulateST.expr_return expr35 = null;

        PopulateST.expr_return expr37 = null;

        PopulateST.expr_return expr38 = null;

        PopulateST.expr_return expr40 = null;

        PopulateST.expr_return expr41 = null;

        PopulateST.expr_return expr43 = null;

        PopulateST.expr_return expr44 = null;

        PopulateST.expr_return expr46 = null;

        PopulateST.expr_return expr47 = null;

        PopulateST.expr_return expr49 = null;

        PopulateST.expr_return expr50 = null;

        PopulateST.vector_return vector51 = null;


        CommonTree char_literal24_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree string_literal36_tree=null;
        CommonTree string_literal39_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree IDENT52_tree=null;
        CommonTree INTEGER53_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:70:3: ( ^( '+' expr expr ) | ^( '-' expr expr ) | ^( '*' expr expr ) | ^( '/' expr expr ) | ^( '==' expr expr ) | ^( '!=' expr expr ) | ^( '>' expr expr ) | ^( '<' expr expr ) | ^( '[' expr ( expr )* ) | vector | IDENT | INTEGER )
            int alt6=12;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            case 28:
                {
                alt6=7;
                }
                break;
            case 27:
                {
                alt6=8;
                }
                break;
            case 33:
                {
                alt6=9;
                }
                break;
            case GEN:
            case 35:
            case 38:
                {
                alt6=10;
                }
                break;
            case IDENT:
                {
                alt6=11;
                }
                break;
            case INTEGER:
                {
                alt6=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:70:5: ^( '+' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal24=(CommonTree)match(input,29,FOLLOW_29_in_expr242); 
                    char_literal24_tree = (CommonTree)adaptor.dupNode(char_literal24);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal24_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr244);
                    expr25=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr25.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr246);
                    expr26=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr26.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:71:5: ^( '-' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal27=(CommonTree)match(input,30,FOLLOW_30_in_expr254); 
                    char_literal27_tree = (CommonTree)adaptor.dupNode(char_literal27);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal27_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr256);
                    expr28=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr28.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr258);
                    expr29=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr29.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:72:5: ^( '*' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal30=(CommonTree)match(input,31,FOLLOW_31_in_expr266); 
                    char_literal30_tree = (CommonTree)adaptor.dupNode(char_literal30);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal30_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr268);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr31.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr270);
                    expr32=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr32.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:73:5: ^( '/' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal33=(CommonTree)match(input,32,FOLLOW_32_in_expr278); 
                    char_literal33_tree = (CommonTree)adaptor.dupNode(char_literal33);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal33_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr280);
                    expr34=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr34.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr282);
                    expr35=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr35.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:74:5: ^( '==' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal36=(CommonTree)match(input,25,FOLLOW_25_in_expr290); 
                    string_literal36_tree = (CommonTree)adaptor.dupNode(string_literal36);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal36_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr292);
                    expr37=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr37.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr294);
                    expr38=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr38.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:75:5: ^( '!=' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal39=(CommonTree)match(input,26,FOLLOW_26_in_expr302); 
                    string_literal39_tree = (CommonTree)adaptor.dupNode(string_literal39);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal39_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr304);
                    expr40=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr40.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr306);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr41.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:76:5: ^( '>' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal42=(CommonTree)match(input,28,FOLLOW_28_in_expr315); 
                    char_literal42_tree = (CommonTree)adaptor.dupNode(char_literal42);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal42_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr317);
                    expr43=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr43.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr319);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr44.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:77:5: ^( '<' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal45=(CommonTree)match(input,27,FOLLOW_27_in_expr327); 
                    char_literal45_tree = (CommonTree)adaptor.dupNode(char_literal45);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal45_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr329);
                    expr46=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr46.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr331);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr47.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:78:5: ^( '[' expr ( expr )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal48=(CommonTree)match(input,33,FOLLOW_33_in_expr340); 
                    char_literal48_tree = (CommonTree)adaptor.dupNode(char_literal48);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal48_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr342);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr49.getTree());
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:78:16: ( expr )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==GEN||LA5_0==IDENT||LA5_0==INTEGER||(LA5_0>=25 && LA5_0<=33)||LA5_0==35||LA5_0==38) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:78:16: expr
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expr_in_expr344);
                    	    expr50=expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, expr50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 10 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:79:5: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_vector_in_expr353);
                    vector51=vector();

                    state._fsp--;

                    adaptor.addChild(root_0, vector51.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:80:5: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT52=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_expr359); 
                    IDENT52_tree = (CommonTree)adaptor.dupNode(IDENT52);

                    adaptor.addChild(root_0, IDENT52_tree);


                        if (!symtab.definedName((IDENT52!=null?IDENT52.getText():null))) {
                          System.err.println("The symbol '" + (IDENT52!=null?IDENT52.getText():null) + "' has not been defined yet");
                          System.exit(-1);
                        }
                      

                    }
                    break;
                case 12 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:87:5: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    INTEGER53=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expr370); 
                    INTEGER53_tree = (CommonTree)adaptor.dupNode(INTEGER53);

                    adaptor.addChild(root_0, INTEGER53_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class vector_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vector"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:89:1: vector : ( ^( '..' expr expr ) | ^( GEN IDENT vector expr ) | ^( 'filter' IDENT vector expr ) );
    public final PopulateST.vector_return vector() throws RecognitionException {
        PopulateST.vector_return retval = new PopulateST.vector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal54=null;
        CommonTree GEN57=null;
        CommonTree IDENT58=null;
        CommonTree string_literal61=null;
        CommonTree IDENT62=null;
        PopulateST.expr_return expr55 = null;

        PopulateST.expr_return expr56 = null;

        PopulateST.vector_return vector59 = null;

        PopulateST.expr_return expr60 = null;

        PopulateST.vector_return vector63 = null;

        PopulateST.expr_return expr64 = null;


        CommonTree string_literal54_tree=null;
        CommonTree GEN57_tree=null;
        CommonTree IDENT58_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree IDENT62_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:90:3: ( ^( '..' expr expr ) | ^( GEN IDENT vector expr ) | ^( 'filter' IDENT vector expr ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case GEN:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:90:5: ^( '..' expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal54=(CommonTree)match(input,35,FOLLOW_35_in_vector384); 
                    string_literal54_tree = (CommonTree)adaptor.dupNode(string_literal54);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal54_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_vector386);
                    expr55=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr55.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_vector388);
                    expr56=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr56.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:91:5: ^( GEN IDENT vector expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GEN57=(CommonTree)match(input,GEN,FOLLOW_GEN_in_vector396); 
                    GEN57_tree = (CommonTree)adaptor.dupNode(GEN57);

                    root_1 = (CommonTree)adaptor.becomeRoot(GEN57_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT58=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_vector398); 
                    IDENT58_tree = (CommonTree)adaptor.dupNode(IDENT58);

                    adaptor.addChild(root_1, IDENT58_tree);


                        currentscope = new NestedScope("genscope", currentscope);
                        VariableSymbol vs = new VariableSymbol((IDENT58!=null?IDENT58.getText():null), new BuiltInTypeSymbol("int"));
                        currentscope.define(vs);
                      
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_vector_in_vector405);
                    vector59=vector();

                    state._fsp--;

                    adaptor.addChild(root_1, vector59.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_vector407);
                    expr60=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr60.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    currentscope = currentscope.getEnclosingScope();

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:99:5: ^( 'filter' IDENT vector expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal61=(CommonTree)match(input,38,FOLLOW_38_in_vector423); 
                    string_literal61_tree = (CommonTree)adaptor.dupNode(string_literal61);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IDENT62=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_vector425); 
                    IDENT62_tree = (CommonTree)adaptor.dupNode(IDENT62);

                    adaptor.addChild(root_1, IDENT62_tree);


                        currentscope = new NestedScope("filscope", currentscope);
                        VariableSymbol vs = new VariableSymbol((IDENT62!=null?IDENT62.getText():null), new BuiltInTypeSymbol("int"));
                        
                        currentscope.define(vs);
                      
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_vector_in_vector432);
                    vector63=vector();

                    state._fsp--;

                    adaptor.addChild(root_1, vector63.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_vector434);
                    expr64=expr();

                    state._fsp--;

                    adaptor.addChild(root_1, expr64.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    currentscope = currentscope.getEnclosingScope();

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vector"

    public static class type_return extends TreeRuleReturnScope {
        public Type tsym;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:108:1: type returns [Type tsym] : IDENT ;
    public final PopulateST.type_return type() throws RecognitionException {
        PopulateST.type_return retval = new PopulateST.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT65=null;

        CommonTree IDENT65_tree=null;

        try {
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:109:3: ( IDENT )
            // C:\\Users\\Lyle\\workspace\\vcalc\\src\\PopulateST.g:109:5: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            IDENT65=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_type456); 
            IDENT65_tree = (CommonTree)adaptor.dupNode(IDENT65);

            adaptor.addChild(root_0, IDENT65_tree);


                retval.tsym = (Type) symtab.resolveType((IDENT65!=null?IDENT65.getText():null));
                if (retval.tsym == null) {
                  System.err.println("'" + (IDENT65!=null?IDENT65.getText():null) + "' is not a valid type");
                  System.exit(-1);
                }
              

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_program68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_program70 = new BitSet(new long[]{0x0000000001500428L});
    public static final BitSet FOLLOW_statement_in_program73 = new BitSet(new long[]{0x0000000001500408L});
    public static final BitSet FOLLOW_DECL_in_declaration90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_declaration92 = new BitSet(new long[]{0x0000000001500400L});
    public static final BitSet FOLLOW_assignment_in_declaration94 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_assignment118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment120 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_assignment122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStatement_in_statement140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_statement152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ifStatement173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifStatement175 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_ifStatement177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_loopStatement191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_loopStatement193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_cstat_in_loopStatement195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CSTAT_in_cstat209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_cstat211 = new BitSet(new long[]{0x0000000001500408L});
    public static final BitSet FOLLOW_24_in_printStatement226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_printStatement228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr244 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_30_in_expr254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr256 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_31_in_expr266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr268 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_32_in_expr278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr280 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_expr290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr292 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expr302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expr315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr317 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr329 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_expr331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_33_in_expr340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr342 = new BitSet(new long[]{0x0000004BFE004288L});
    public static final BitSet FOLLOW_expr_in_expr344 = new BitSet(new long[]{0x0000004BFE004288L});
    public static final BitSet FOLLOW_vector_in_expr353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_expr359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_expr370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_vector384 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_vector386 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_vector388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEN_in_vector396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_vector398 = new BitSet(new long[]{0x0000004800000080L});
    public static final BitSet FOLLOW_vector_in_vector405 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_vector407 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_vector423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_vector425 = new BitSet(new long[]{0x0000004800000080L});
    public static final BitSet FOLLOW_vector_in_vector432 = new BitSet(new long[]{0x0000004BFE004280L});
    public static final BitSet FOLLOW_expr_in_vector434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_type456 = new BitSet(new long[]{0x0000000000000002L});

}