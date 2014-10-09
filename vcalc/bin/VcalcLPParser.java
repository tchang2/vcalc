// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g 2014-10-08 19:21:36

  import SymTab.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class VcalcLPParser extends Parser {
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


        public VcalcLPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public VcalcLPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[49+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return VcalcLPParser.tokenNames; }
    public String getGrammarFileName() { return "/home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g"; }


      SymbolTable symtab;


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:28:1: program[SymbolTable symtab] : ( declaration )* ( statement )* -> ^( PROGRAM ( declaration )* ( statement )* ) ;
    public final VcalcLPParser.program_return program(SymbolTable symtab) throws RecognitionException {
        VcalcLPParser.program_return retval = new VcalcLPParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        Object root_0 = null;

        VcalcLPParser.declaration_return declaration1 = null;

        VcalcLPParser.statement_return statement2 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        this.symtab = symtab;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:3: ( ( declaration )* ( statement )* -> ^( PROGRAM ( declaration )* ( statement )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:5: ( declaration )* ( statement )*
            {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:5: ( declaration )*
            loop1:
            do {
                int alt1=2;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program104);
            	    declaration1=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:18: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT||LA2_0==IN||(LA2_0>=21 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program107);
            	    statement2=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: statement, declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:29: -> ^( PROGRAM ( declaration )* ( statement )* )
            {
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:32: ^( PROGRAM ( declaration )* ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:42: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:55: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:33:1: declaration : type assignment -> ^( DECL type assignment ) ;
    public final VcalcLPParser.declaration_return declaration() throws RecognitionException {
        VcalcLPParser.declaration_return retval = new VcalcLPParser.declaration_return();
        retval.start = input.LT(1);
        int declaration_StartIndex = input.index();
        Object root_0 = null;

        VcalcLPParser.type_return type3 = null;

        VcalcLPParser.assignment_return assignment4 = null;


        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:35:3: ( type assignment -> ^( DECL type assignment ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:35:5: type assignment
            {
            pushFollow(FOLLOW_type_in_declaration134);
            type3=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type3.getTree());
            pushFollow(FOLLOW_assignment_in_declaration136);
            assignment4=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignment.add(assignment4.getTree());


            // AST REWRITE
            // elements: type, assignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 35:21: -> ^( DECL type assignment )
            {
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:35:24: ^( DECL type assignment )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_assignment.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, declaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:37:1: assignment : ( IDENT EQUAL expr SC -> ^( EQUAL IDENT expr ) | 'fi' | IN | 'if' | 'loop' | 'pool' | 'print' | 'filter' );
    public final VcalcLPParser.assignment_return assignment() throws RecognitionException {
        VcalcLPParser.assignment_return retval = new VcalcLPParser.assignment_return();
        retval.start = input.LT(1);
        int assignment_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT5=null;
        Token EQUAL6=null;
        Token SC8=null;
        Token string_literal9=null;
        Token IN10=null;
        Token string_literal11=null;
        Token string_literal12=null;
        Token string_literal13=null;
        Token string_literal14=null;
        Token string_literal15=null;
        VcalcLPParser.expr_return expr7 = null;


        Object IDENT5_tree=null;
        Object EQUAL6_tree=null;
        Object SC8_tree=null;
        Object string_literal9_tree=null;
        Object IN10_tree=null;
        Object string_literal11_tree=null;
        Object string_literal12_tree=null;
        Object string_literal13_tree=null;
        Object string_literal14_tree=null;
        Object string_literal15_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:38:3: ( IDENT EQUAL expr SC -> ^( EQUAL IDENT expr ) | 'fi' | IN | 'if' | 'loop' | 'pool' | 'print' | 'filter' )
            int alt3=8;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case IN:
                {
                alt3=3;
                }
                break;
            case 22:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            case 24:
                {
                alt3=6;
                }
                break;
            case 25:
                {
                alt3=7;
                }
                break;
            case 26:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:38:5: IDENT EQUAL expr SC
                    {
                    IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT5);

                    if ( state.backtracking==0 ) {

                          if ((IDENT5!=null?IDENT5.getText():null).equals("int") || (IDENT5!=null?IDENT5.getText():null).equals("vector")) {
                            System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'" + (IDENT5!=null?IDENT5.getText():null) + "' is not a valid name");
                            System.exit(-1);
                          }
                        
                    }
                    EQUAL6=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignment166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL6);

                    pushFollow(FOLLOW_expr_in_assignment168);
                    expr7=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr7.getTree());
                    SC8=(Token)match(input,SC,FOLLOW_SC_in_assignment170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SC.add(SC8);



                    // AST REWRITE
                    // elements: expr, IDENT, EQUAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 43:19: -> ^( EQUAL IDENT expr )
                    {
                        // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:43:22: ^( EQUAL IDENT expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:44:5: 'fi'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal9=(Token)match(input,21,FOLLOW_21_in_assignment186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal9_tree = (Object)adaptor.create(string_literal9);
                    adaptor.addChild(root_0, string_literal9_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'fi' is not a valid name"); System.exit(-1);
                    }

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:45:5: IN
                    {
                    root_0 = (Object)adaptor.nil();

                    IN10=(Token)match(input,IN,FOLLOW_IN_in_assignment194); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN10_tree = (Object)adaptor.create(IN10);
                    adaptor.addChild(root_0, IN10_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'in' is not a valid name"); System.exit(-1);
                    }

                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:46:5: 'if'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal11=(Token)match(input,22,FOLLOW_22_in_assignment202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal11_tree = (Object)adaptor.create(string_literal11);
                    adaptor.addChild(root_0, string_literal11_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'if' is not a valid name"); System.exit(-1);
                    }

                    }
                    break;
                case 5 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:47:5: 'loop'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal12=(Token)match(input,23,FOLLOW_23_in_assignment210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal12_tree = (Object)adaptor.create(string_literal12);
                    adaptor.addChild(root_0, string_literal12_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'loop' is not a valid name"); System.exit(-1);
                    }

                    }
                    break;
                case 6 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:48:5: 'pool'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal13=(Token)match(input,24,FOLLOW_24_in_assignment218); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal13_tree = (Object)adaptor.create(string_literal13);
                    adaptor.addChild(root_0, string_literal13_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'pool' is not a valid name"); System.exit(-1);
                    }

                    }
                    break;
                case 7 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:49:5: 'print'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal14=(Token)match(input,25,FOLLOW_25_in_assignment226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal14_tree = (Object)adaptor.create(string_literal14);
                    adaptor.addChild(root_0, string_literal14_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'print' is not a valid name"); System.exit(-1);
                    }

                    }
                    break;
                case 8 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:50:5: 'filter'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal15=(Token)match(input,26,FOLLOW_26_in_assignment234); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal15_tree = (Object)adaptor.create(string_literal15);
                    adaptor.addChild(root_0, string_literal15_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'filter' is not a valid name"); System.exit(-1);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, assignment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:53:1: statement : ( ifStatement | loopStatement | printStatement | assignment );
    public final VcalcLPParser.statement_return statement() throws RecognitionException {
        VcalcLPParser.statement_return retval = new VcalcLPParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        VcalcLPParser.ifStatement_return ifStatement16 = null;

        VcalcLPParser.loopStatement_return loopStatement17 = null;

        VcalcLPParser.printStatement_return printStatement18 = null;

        VcalcLPParser.assignment_return assignment19 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:54:3: ( ifStatement | loopStatement | printStatement | assignment )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==LP) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==IDENT||LA4_1==IN||(LA4_1>=21 && LA4_1<=26)) ) {
                    alt4=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==LP) ) {
                    alt4=2;
                }
                else if ( (LA4_2==EOF||LA4_2==IDENT||LA4_2==IN||(LA4_2>=21 && LA4_2<=26)) ) {
                    alt4=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==LP) ) {
                    alt4=3;
                }
                else if ( (LA4_3==EOF||LA4_3==IDENT||LA4_3==IN||(LA4_3>=21 && LA4_3<=26)) ) {
                    alt4=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case IDENT:
            case IN:
            case 21:
            case 24:
            case 26:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:54:5: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement252);
                    ifStatement16=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement16.getTree());

                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:55:5: loopStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_loopStatement_in_statement258);
                    loopStatement17=loopStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, loopStatement17.getTree());

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:56:5: printStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_printStatement_in_statement264);
                    printStatement18=printStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printStatement18.getTree());

                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:57:5: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement270);
                    assignment19=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:59:1: ifStatement : 'if' LP expr RP cstat 'fi' SC -> ^( 'if' expr cstat ) ;
    public final VcalcLPParser.ifStatement_return ifStatement() throws RecognitionException {
        VcalcLPParser.ifStatement_return retval = new VcalcLPParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal20=null;
        Token LP21=null;
        Token RP23=null;
        Token string_literal25=null;
        Token SC26=null;
        VcalcLPParser.expr_return expr22 = null;

        VcalcLPParser.cstat_return cstat24 = null;


        Object string_literal20_tree=null;
        Object LP21_tree=null;
        Object RP23_tree=null;
        Object string_literal25_tree=null;
        Object SC26_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_cstat=new RewriteRuleSubtreeStream(adaptor,"rule cstat");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:60:3: ( 'if' LP expr RP cstat 'fi' SC -> ^( 'if' expr cstat ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:60:5: 'if' LP expr RP cstat 'fi' SC
            {
            string_literal20=(Token)match(input,22,FOLLOW_22_in_ifStatement283); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(string_literal20);

            LP21=(Token)match(input,LP,FOLLOW_LP_in_ifStatement285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP21);

            pushFollow(FOLLOW_expr_in_ifStatement287);
            expr22=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr22.getTree());
            RP23=(Token)match(input,RP,FOLLOW_RP_in_ifStatement289); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP23);

            pushFollow(FOLLOW_cstat_in_ifStatement291);
            cstat24=cstat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cstat.add(cstat24.getTree());
            string_literal25=(Token)match(input,21,FOLLOW_21_in_ifStatement293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_21.add(string_literal25);

            SC26=(Token)match(input,SC,FOLLOW_SC_in_ifStatement295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SC.add(SC26);



            // AST REWRITE
            // elements: 22, expr, cstat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:35: -> ^( 'if' expr cstat )
            {
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:60:38: ^( 'if' expr cstat )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_22.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_cstat.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {

                System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "Syntax error on if statement");
                System.exit(-1);
              
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class loopStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopStatement"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:66:1: loopStatement : 'loop' LP expr RP cstat 'pool' SC -> ^( 'loop' expr cstat ) ;
    public final VcalcLPParser.loopStatement_return loopStatement() throws RecognitionException {
        VcalcLPParser.loopStatement_return retval = new VcalcLPParser.loopStatement_return();
        retval.start = input.LT(1);
        int loopStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal27=null;
        Token LP28=null;
        Token RP30=null;
        Token string_literal32=null;
        Token SC33=null;
        VcalcLPParser.expr_return expr29 = null;

        VcalcLPParser.cstat_return cstat31 = null;


        Object string_literal27_tree=null;
        Object LP28_tree=null;
        Object RP30_tree=null;
        Object string_literal32_tree=null;
        Object SC33_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_cstat=new RewriteRuleSubtreeStream(adaptor,"rule cstat");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:67:3: ( 'loop' LP expr RP cstat 'pool' SC -> ^( 'loop' expr cstat ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:67:5: 'loop' LP expr RP cstat 'pool' SC
            {
            string_literal27=(Token)match(input,23,FOLLOW_23_in_loopStatement325); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(string_literal27);

            LP28=(Token)match(input,LP,FOLLOW_LP_in_loopStatement327); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP28);

            pushFollow(FOLLOW_expr_in_loopStatement329);
            expr29=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());
            RP30=(Token)match(input,RP,FOLLOW_RP_in_loopStatement331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP30);

            pushFollow(FOLLOW_cstat_in_loopStatement333);
            cstat31=cstat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cstat.add(cstat31.getTree());
            string_literal32=(Token)match(input,24,FOLLOW_24_in_loopStatement335); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(string_literal32);

            SC33=(Token)match(input,SC,FOLLOW_SC_in_loopStatement337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SC.add(SC33);



            // AST REWRITE
            // elements: expr, 23, cstat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:39: -> ^( 'loop' expr cstat )
            {
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:67:42: ^( 'loop' expr cstat )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_23.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_cstat.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {

                System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "Syntax error on loop statement");
                System.exit(-1);
              
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, loopStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "loopStatement"

    public static class cstat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cstat"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:73:1: cstat : ( statement )* -> ^( CSTAT ( statement )* ) ;
    public final VcalcLPParser.cstat_return cstat() throws RecognitionException {
        VcalcLPParser.cstat_return retval = new VcalcLPParser.cstat_return();
        retval.start = input.LT(1);
        int cstat_StartIndex = input.index();
        Object root_0 = null;

        VcalcLPParser.statement_return statement34 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:74:3: ( ( statement )* -> ^( CSTAT ( statement )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:74:5: ( statement )*
            {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:74:5: ( statement )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==IDENT||LA5_1==IN||(LA5_1>=21 && LA5_1<=26)) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==IDENT||LA5_2==IN||(LA5_2>=21 && LA5_2<=26)) ) {
                        alt5=1;
                    }


                    }
                    break;
                case IDENT:
                case IN:
                case 22:
                case 23:
                case 25:
                case 26:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_cstat367);
            	    statement34=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement34.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:16: -> ^( CSTAT ( statement )* )
            {
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:74:19: ^( CSTAT ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CSTAT, "CSTAT"), root_1);

                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:74:27: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, cstat_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "cstat"

    public static class printStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "printStatement"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:76:1: printStatement : 'print' LP expr RP SC -> ^( 'print' expr ) ;
    public final VcalcLPParser.printStatement_return printStatement() throws RecognitionException {
        VcalcLPParser.printStatement_return retval = new VcalcLPParser.printStatement_return();
        retval.start = input.LT(1);
        int printStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal35=null;
        Token LP36=null;
        Token RP38=null;
        Token SC39=null;
        VcalcLPParser.expr_return expr37 = null;


        Object string_literal35_tree=null;
        Object LP36_tree=null;
        Object RP38_tree=null;
        Object SC39_tree=null;
        RewriteRuleTokenStream stream_SC=new RewriteRuleTokenStream(adaptor,"token SC");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:77:3: ( 'print' LP expr RP SC -> ^( 'print' expr ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:77:5: 'print' LP expr RP SC
            {
            string_literal35=(Token)match(input,25,FOLLOW_25_in_printStatement389); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(string_literal35);

            LP36=(Token)match(input,LP,FOLLOW_LP_in_printStatement391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LP.add(LP36);

            pushFollow(FOLLOW_expr_in_printStatement393);
            expr37=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr37.getTree());
            RP38=(Token)match(input,RP,FOLLOW_RP_in_printStatement395); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RP.add(RP38);

            SC39=(Token)match(input,SC,FOLLOW_SC_in_printStatement397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SC.add(SC39);



            // AST REWRITE
            // elements: 25, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:27: -> ^( 'print' expr )
            {
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:77:30: ^( 'print' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_25.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {

                System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "Syntax error on print statement");
                System.exit(-1);
              
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, printStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "printStatement"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:83:1: expr : add ( ( '==' | '!=' | '<' | '>' ) add )* ;
    public final VcalcLPParser.expr_return expr() throws RecognitionException {
        VcalcLPParser.expr_return retval = new VcalcLPParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal41=null;
        Token string_literal42=null;
        Token char_literal43=null;
        Token char_literal44=null;
        VcalcLPParser.add_return add40 = null;

        VcalcLPParser.add_return add45 = null;


        Object string_literal41_tree=null;
        Object string_literal42_tree=null;
        Object char_literal43_tree=null;
        Object char_literal44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:3: ( add ( ( '==' | '!=' | '<' | '>' ) add )* )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:5: add ( ( '==' | '!=' | '<' | '>' ) add )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_in_expr425);
            add40=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add40.getTree());
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:9: ( ( '==' | '!=' | '<' | '>' ) add )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=27 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:10: ( '==' | '!=' | '<' | '>' ) add
            	    {
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:10: ( '==' | '!=' | '<' | '>' )
            	    int alt6=4;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:11: '=='
            	            {
            	            string_literal41=(Token)match(input,27,FOLLOW_27_in_expr429); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal41_tree = (Object)adaptor.create(string_literal41);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal41_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:19: '!='
            	            {
            	            string_literal42=(Token)match(input,28,FOLLOW_28_in_expr434); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal42_tree = (Object)adaptor.create(string_literal42);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal42_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:27: '<'
            	            {
            	            char_literal43=(Token)match(input,29,FOLLOW_29_in_expr439); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal43_tree = (Object)adaptor.create(char_literal43);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal43_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:84:34: '>'
            	            {
            	            char_literal44=(Token)match(input,30,FOLLOW_30_in_expr444); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal44_tree = (Object)adaptor.create(char_literal44);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal44_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_add_in_expr448);
            	    add45=add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add45.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:86:1: add : mult ( ( '+' | '-' ) mult )* ;
    public final VcalcLPParser.add_return add() throws RecognitionException {
        VcalcLPParser.add_return retval = new VcalcLPParser.add_return();
        retval.start = input.LT(1);
        int add_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal47=null;
        Token char_literal48=null;
        VcalcLPParser.mult_return mult46 = null;

        VcalcLPParser.mult_return mult49 = null;


        Object char_literal47_tree=null;
        Object char_literal48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:87:3: ( mult ( ( '+' | '-' ) mult )* )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:87:5: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_in_add462);
            mult46=mult();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult46.getTree());
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:87:10: ( ( '+' | '-' ) mult )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=31 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:87:11: ( '+' | '-' ) mult
            	    {
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:87:11: ( '+' | '-' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==31) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==32) ) {
            	        alt8=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:87:12: '+'
            	            {
            	            char_literal47=(Token)match(input,31,FOLLOW_31_in_add466); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal47_tree = (Object)adaptor.create(char_literal47);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal47_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:87:19: '-'
            	            {
            	            char_literal48=(Token)match(input,32,FOLLOW_32_in_add471); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal48_tree = (Object)adaptor.create(char_literal48);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal48_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_in_add475);
            	    mult49=mult();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult49.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, add_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:89:1: mult : dref ( ( '*' | '/' ) dref )* ;
    public final VcalcLPParser.mult_return mult() throws RecognitionException {
        VcalcLPParser.mult_return retval = new VcalcLPParser.mult_return();
        retval.start = input.LT(1);
        int mult_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal51=null;
        Token char_literal52=null;
        VcalcLPParser.dref_return dref50 = null;

        VcalcLPParser.dref_return dref53 = null;


        Object char_literal51_tree=null;
        Object char_literal52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:90:3: ( dref ( ( '*' | '/' ) dref )* )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:90:5: dref ( ( '*' | '/' ) dref )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_dref_in_mult489);
            dref50=dref();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dref50.getTree());
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:90:10: ( ( '*' | '/' ) dref )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=33 && LA11_0<=34)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:90:11: ( '*' | '/' ) dref
            	    {
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:90:11: ( '*' | '/' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==33) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==34) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:90:12: '*'
            	            {
            	            char_literal51=(Token)match(input,33,FOLLOW_33_in_mult493); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal51_tree = (Object)adaptor.create(char_literal51);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal51_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:90:19: '/'
            	            {
            	            char_literal52=(Token)match(input,34,FOLLOW_34_in_mult498); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal52_tree = (Object)adaptor.create(char_literal52);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal52_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_dref_in_mult502);
            	    dref53=dref();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, dref53.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, mult_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mult"

    public static class dref_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dref"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:92:1: dref : ( vector -> vector ) ( '[' e= expr ']' -> ^( DREF $dref $e) )* ;
    public final VcalcLPParser.dref_return dref() throws RecognitionException {
        VcalcLPParser.dref_return retval = new VcalcLPParser.dref_return();
        retval.start = input.LT(1);
        int dref_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal56=null;
        VcalcLPParser.expr_return e = null;

        VcalcLPParser.vector_return vector54 = null;


        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_vector=new RewriteRuleSubtreeStream(adaptor,"rule vector");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:93:3: ( ( vector -> vector ) ( '[' e= expr ']' -> ^( DREF $dref $e) )* )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:93:5: ( vector -> vector ) ( '[' e= expr ']' -> ^( DREF $dref $e) )*
            {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:93:5: ( vector -> vector )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:93:6: vector
            {
            pushFollow(FOLLOW_vector_in_dref517);
            vector54=vector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_vector.add(vector54.getTree());


            // AST REWRITE
            // elements: vector
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:13: -> vector
            {
                adaptor.addChild(root_0, stream_vector.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:93:24: ( '[' e= expr ']' -> ^( DREF $dref $e) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:93:25: '[' e= expr ']'
            	    {
            	    char_literal55=(Token)match(input,35,FOLLOW_35_in_dref525); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_35.add(char_literal55);

            	    pushFollow(FOLLOW_expr_in_dref529);
            	    e=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(e.getTree());
            	    char_literal56=(Token)match(input,36,FOLLOW_36_in_dref531); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_36.add(char_literal56);



            	    // AST REWRITE
            	    // elements: dref, e
            	    // token labels: 
            	    // rule labels: retval, e
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 93:40: -> ^( DREF $dref $e)
            	    {
            	        // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:93:43: ^( DREF $dref $e)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DREF, "DREF"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, dref_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "dref"

    public static class vector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vector"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:95:1: vector : ( term ( '..' term )* | '[' IDENT IN vector '|' expr ']' -> ^( GEN IDENT vector expr ) | 'filter' LP IDENT IN vector '|' expr RP -> ^( 'filter' IDENT vector expr ) );
    public final VcalcLPParser.vector_return vector() throws RecognitionException {
        VcalcLPParser.vector_return retval = new VcalcLPParser.vector_return();
        retval.start = input.LT(1);
        int vector_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal58=null;
        Token char_literal60=null;
        Token IDENT61=null;
        Token IN62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        Token string_literal67=null;
        Token LP68=null;
        Token IDENT69=null;
        Token IN70=null;
        Token char_literal72=null;
        Token RP74=null;
        VcalcLPParser.term_return term57 = null;

        VcalcLPParser.term_return term59 = null;

        VcalcLPParser.vector_return vector63 = null;

        VcalcLPParser.expr_return expr65 = null;

        VcalcLPParser.vector_return vector71 = null;

        VcalcLPParser.expr_return expr73 = null;


        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        Object IDENT61_tree=null;
        Object IN62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal66_tree=null;
        Object string_literal67_tree=null;
        Object LP68_tree=null;
        Object IDENT69_tree=null;
        Object IN70_tree=null;
        Object char_literal72_tree=null;
        Object RP74_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_vector=new RewriteRuleSubtreeStream(adaptor,"rule vector");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:96:3: ( term ( '..' term )* | '[' IDENT IN vector '|' expr ']' -> ^( GEN IDENT vector expr ) | 'filter' LP IDENT IN vector '|' expr RP -> ^( 'filter' IDENT vector expr ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case IDENT:
            case LP:
            case INTEGER:
                {
                alt14=1;
                }
                break;
            case 35:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:96:5: term ( '..' term )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_term_in_vector558);
                    term57=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term57.getTree());
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:96:10: ( '..' term )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==37) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:96:11: '..' term
                    	    {
                    	    string_literal58=(Token)match(input,37,FOLLOW_37_in_vector561); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal58_tree = (Object)adaptor.create(string_literal58);
                    	    root_0 = (Object)adaptor.becomeRoot(string_literal58_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_term_in_vector564);
                    	    term59=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term59.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:97:5: '[' IDENT IN vector '|' expr ']'
                    {
                    char_literal60=(Token)match(input,35,FOLLOW_35_in_vector572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal60);

                    IDENT61=(Token)match(input,IDENT,FOLLOW_IDENT_in_vector574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT61);

                    IN62=(Token)match(input,IN,FOLLOW_IN_in_vector576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN62);

                    pushFollow(FOLLOW_vector_in_vector578);
                    vector63=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vector.add(vector63.getTree());
                    char_literal64=(Token)match(input,38,FOLLOW_38_in_vector580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal64);

                    pushFollow(FOLLOW_expr_in_vector582);
                    expr65=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr65.getTree());
                    char_literal66=(Token)match(input,36,FOLLOW_36_in_vector584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal66);



                    // AST REWRITE
                    // elements: expr, IDENT, vector
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:38: -> ^( GEN IDENT vector expr )
                    {
                        // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:97:41: ^( GEN IDENT vector expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GEN, "GEN"), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_vector.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:98:5: 'filter' LP IDENT IN vector '|' expr RP
                    {
                    string_literal67=(Token)match(input,26,FOLLOW_26_in_vector602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(string_literal67);

                    LP68=(Token)match(input,LP,FOLLOW_LP_in_vector604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP68);

                    IDENT69=(Token)match(input,IDENT,FOLLOW_IDENT_in_vector606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENT.add(IDENT69);

                    IN70=(Token)match(input,IN,FOLLOW_IN_in_vector608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN70);

                    pushFollow(FOLLOW_vector_in_vector610);
                    vector71=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_vector.add(vector71.getTree());
                    char_literal72=(Token)match(input,38,FOLLOW_38_in_vector612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(char_literal72);

                    pushFollow(FOLLOW_expr_in_vector614);
                    expr73=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr73.getTree());
                    RP74=(Token)match(input,RP,FOLLOW_RP_in_vector616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP74);



                    // AST REWRITE
                    // elements: expr, 26, vector, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:45: -> ^( 'filter' IDENT vector expr )
                    {
                        // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:98:48: ^( 'filter' IDENT vector expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_26.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENT.nextNode());
                        adaptor.addChild(root_1, stream_vector.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, vector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "vector"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:100:1: term : ( LP expr RP -> expr | IDENT | INTEGER );
    public final VcalcLPParser.term_return term() throws RecognitionException {
        VcalcLPParser.term_return retval = new VcalcLPParser.term_return();
        retval.start = input.LT(1);
        int term_StartIndex = input.index();
        Object root_0 = null;

        Token LP75=null;
        Token RP77=null;
        Token IDENT78=null;
        Token INTEGER79=null;
        VcalcLPParser.expr_return expr76 = null;


        Object LP75_tree=null;
        Object RP77_tree=null;
        Object IDENT78_tree=null;
        Object INTEGER79_tree=null;
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:101:3: ( LP expr RP -> expr | IDENT | INTEGER )
            int alt15=3;
            switch ( input.LA(1) ) {
            case LP:
                {
                alt15=1;
                }
                break;
            case IDENT:
                {
                alt15=2;
                }
                break;
            case INTEGER:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:101:5: LP expr RP
                    {
                    LP75=(Token)match(input,LP,FOLLOW_LP_in_term641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LP.add(LP75);

                    pushFollow(FOLLOW_expr_in_term643);
                    expr76=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr76.getTree());
                    RP77=(Token)match(input,RP,FOLLOW_RP_in_term645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RP.add(RP77);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:16: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:102:5: IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT78=(Token)match(input,IDENT,FOLLOW_IDENT_in_term655); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT78_tree = (Object)adaptor.create(IDENT78);
                    adaptor.addChild(root_0, IDENT78_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:103:5: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    INTEGER79=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term662); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER79_tree = (Object)adaptor.create(INTEGER79);
                    adaptor.addChild(root_0, INTEGER79_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, term_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class type_return extends ParserRuleReturnScope {
        public Type tsym;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:105:1: type returns [Type tsym] : ( IDENT | 'fi' | IN | 'if' | 'loop' | 'pool' | 'print' | 'filter' );
    public final VcalcLPParser.type_return type() throws RecognitionException {
        VcalcLPParser.type_return retval = new VcalcLPParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token IDENT80=null;
        Token string_literal81=null;
        Token IN82=null;
        Token string_literal83=null;
        Token string_literal84=null;
        Token string_literal85=null;
        Token string_literal86=null;
        Token string_literal87=null;

        Object IDENT80_tree=null;
        Object string_literal81_tree=null;
        Object IN82_tree=null;
        Object string_literal83_tree=null;
        Object string_literal84_tree=null;
        Object string_literal85_tree=null;
        Object string_literal86_tree=null;
        Object string_literal87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:107:3: ( IDENT | 'fi' | IN | 'if' | 'loop' | 'pool' | 'print' | 'filter' )
            int alt16=8;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt16=1;
                }
                break;
            case 21:
                {
                alt16=2;
                }
                break;
            case IN:
                {
                alt16=3;
                }
                break;
            case 22:
                {
                alt16=4;
                }
                break;
            case 23:
                {
                alt16=5;
                }
                break;
            case 24:
                {
                alt16=6;
                }
                break;
            case 25:
                {
                alt16=7;
                }
                break;
            case 26:
                {
                alt16=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:107:5: IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT80=(Token)match(input,IDENT,FOLLOW_IDENT_in_type679); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT80_tree = (Object)adaptor.create(IDENT80);
                    adaptor.addChild(root_0, IDENT80_tree);
                    }
                    if ( state.backtracking==0 ) {

                          retval.tsym = (Type) symtab.resolveType((IDENT80!=null?IDENT80.getText():null));
                          //System.out.println(tsym.getName());
                          if (retval.tsym == null) {
                            System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'" + (IDENT80!=null?IDENT80.getText():null) + "' is not a valid type");
                            System.exit(-1);
                          }
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:115:5: 'fi'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal81=(Token)match(input,21,FOLLOW_21_in_type687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal81_tree = (Object)adaptor.create(string_literal81);
                    adaptor.addChild(root_0, string_literal81_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'fi' is not a valid type"); System.exit(-1);
                    }

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:116:5: IN
                    {
                    root_0 = (Object)adaptor.nil();

                    IN82=(Token)match(input,IN,FOLLOW_IN_in_type695); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IN82_tree = (Object)adaptor.create(IN82);
                    adaptor.addChild(root_0, IN82_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'in' is not a valid type"); System.exit(-1);
                    }

                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:117:5: 'if'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal83=(Token)match(input,22,FOLLOW_22_in_type703); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal83_tree = (Object)adaptor.create(string_literal83);
                    adaptor.addChild(root_0, string_literal83_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'if' is not a valid type"); System.exit(-1);
                    }

                    }
                    break;
                case 5 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:118:5: 'loop'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal84=(Token)match(input,23,FOLLOW_23_in_type711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal84_tree = (Object)adaptor.create(string_literal84);
                    adaptor.addChild(root_0, string_literal84_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'loop' is not a valid type"); System.exit(-1);
                    }

                    }
                    break;
                case 6 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:119:5: 'pool'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal85=(Token)match(input,24,FOLLOW_24_in_type719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal85_tree = (Object)adaptor.create(string_literal85);
                    adaptor.addChild(root_0, string_literal85_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'pool' is not a valid type"); System.exit(-1);
                    }

                    }
                    break;
                case 7 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:120:5: 'print'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal86=(Token)match(input,25,FOLLOW_25_in_type727); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal86_tree = (Object)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'print' is not a valid type"); System.exit(-1);
                    }

                    }
                    break;
                case 8 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:121:5: 'filter'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal87=(Token)match(input,26,FOLLOW_26_in_type735); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal87_tree = (Object)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);
                    }
                    if ( state.backtracking==0 ) {
                      System.err.println("Sanity Error: Line<" + input.get(input.index()).getLine() + ":" + input.get(input.index()).getCharPositionInLine() + ">" + "'filter' is not a valid type"); System.exit(-1);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred1_VcalcLP
    public final void synpred1_VcalcLP_fragment() throws RecognitionException {   
        // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:5: ( declaration )
        // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/VcalcLP.g:30:5: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred1_VcalcLP104);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_VcalcLP

    // Delegated rules

    public final boolean synpred1_VcalcLP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_VcalcLP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\1\11\12\uffff";
    static final String DFA1_minS =
        "\1\11\10\0\2\uffff";
    static final String DFA1_maxS =
        "\1\32\10\0\2\uffff";
    static final String DFA1_acceptS =
        "\11\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\2\uffff\1\6\10\uffff\1\5\1\1\1\2\1\7\1\3\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 30:5: ( declaration )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_VcalcLP()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_declaration_in_program104 = new BitSet(new long[]{0x0000000007E01202L});
    public static final BitSet FOLLOW_statement_in_program107 = new BitSet(new long[]{0x0000000007E01202L});
    public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000007E01200L});
    public static final BitSet FOLLOW_assignment_in_declaration136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment162 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQUAL_in_assignment166 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_assignment168 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SC_in_assignment170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_assignment186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_assignment194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_assignment202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_assignment210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_assignment218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_assignment226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_assignment234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_statement264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ifStatement283 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LP_in_ifStatement285 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_ifStatement287 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_ifStatement289 = new BitSet(new long[]{0x0000000007E01200L});
    public static final BitSet FOLLOW_cstat_in_ifStatement291 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ifStatement293 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SC_in_ifStatement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_loopStatement325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LP_in_loopStatement327 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_loopStatement329 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_loopStatement331 = new BitSet(new long[]{0x0000000007E01200L});
    public static final BitSet FOLLOW_cstat_in_loopStatement333 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_loopStatement335 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SC_in_loopStatement337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_cstat367 = new BitSet(new long[]{0x0000000007E01202L});
    public static final BitSet FOLLOW_25_in_printStatement389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LP_in_printStatement391 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_printStatement393 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_printStatement395 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SC_in_printStatement397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_expr425 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_27_in_expr429 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_28_in_expr434 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_29_in_expr439 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_30_in_expr444 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_add_in_expr448 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_mult_in_add462 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_add466 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_32_in_add471 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_mult_in_add475 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_dref_in_mult489 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_mult493 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_34_in_mult498 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_dref_in_mult502 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_vector_in_dref517 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_dref525 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_dref529 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_dref531 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_term_in_vector558 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_vector561 = new BitSet(new long[]{0x000000000000A200L});
    public static final BitSet FOLLOW_term_in_vector564 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_35_in_vector572 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDENT_in_vector574 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_vector576 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_vector_in_vector578 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_vector580 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_vector582 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_vector584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_vector602 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LP_in_vector604 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDENT_in_vector606 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_vector608 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_vector_in_vector610 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_vector612 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_vector614 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_vector616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_term641 = new BitSet(new long[]{0x000000080400A200L});
    public static final BitSet FOLLOW_expr_in_term643 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RP_in_term645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_term662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_type687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_type695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_type703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_type711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_type719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_type727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1_VcalcLP104 = new BitSet(new long[]{0x0000000000000002L});

}