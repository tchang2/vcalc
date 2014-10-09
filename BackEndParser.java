// $ANTLR 3.3 Nov 30, 2010 12:50:56 /cshome/bilec/git/vcalc/BackEnd.g 2014-10-08 18:28:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class BackEndParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECL", "PROGRAM", "LINE", "ASSIGN", "SEMICOLON", "INTEGER", "ID", "PRINT", "INT", "LOOP", "POOL", "IF", "FI", "WS", "NUMBER", "LETTER", "NEWLINE", "'='", "'>'", "'<'", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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
    public static final int DECL=4;
    public static final int PROGRAM=5;
    public static final int LINE=6;
    public static final int ASSIGN=7;
    public static final int SEMICOLON=8;
    public static final int INTEGER=9;
    public static final int ID=10;
    public static final int PRINT=11;
    public static final int INT=12;
    public static final int LOOP=13;
    public static final int POOL=14;
    public static final int IF=15;
    public static final int FI=16;
    public static final int WS=17;
    public static final int NUMBER=18;
    public static final int LETTER=19;
    public static final int NEWLINE=20;

    // delegates
    // delegators


        public BackEndParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BackEndParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BackEndParser.tokenNames; }
    public String getGrammarFileName() { return "/cshome/bilec/git/vcalc/BackEnd.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /cshome/bilec/git/vcalc/BackEnd.g:11:1: prog : ( declaration )* ( line )* EOF -> ^( PROGRAM ( declaration )* ( line )* ) ;
    public final BackEndParser.prog_return prog() throws RecognitionException {
        BackEndParser.prog_return retval = new BackEndParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF3=null;
        BackEndParser.declaration_return declaration1 = null;

        BackEndParser.line_return line2 = null;


        Object EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:12:3: ( ( declaration )* ( line )* EOF -> ^( PROGRAM ( declaration )* ( line )* ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:12:5: ( declaration )* ( line )* EOF
            {
            // /cshome/bilec/git/vcalc/BackEnd.g:12:5: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INTEGER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:12:5: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_prog48);
            	    declaration1=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /cshome/bilec/git/vcalc/BackEnd.g:12:18: ( line )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=ID && LA2_0<=PRINT)||LA2_0==LOOP||LA2_0==IF) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:12:18: line
            	    {
            	    pushFollow(FOLLOW_line_in_prog51);
            	    line2=line();

            	    state._fsp--;

            	    stream_line.add(line2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog54);  
            stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: line, declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 12:28: -> ^( PROGRAM ( declaration )* ( line )* )
            {
                // /cshome/bilec/git/vcalc/BackEnd.g:12:31: ^( PROGRAM ( declaration )* ( line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                // /cshome/bilec/git/vcalc/BackEnd.g:12:41: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                // /cshome/bilec/git/vcalc/BackEnd.g:12:54: ( line )*
                while ( stream_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_line.nextTree());

                }
                stream_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "line"
    // /cshome/bilec/git/vcalc/BackEnd.g:15:1: line : ( assignment SEMICOLON -> ^( LINE assignment ) | print SEMICOLON -> ^( LINE print ) | loop -> ^( LINE loop ) | conditional -> ^( LINE conditional ) );
    public final BackEndParser.line_return line() throws RecognitionException {
        BackEndParser.line_return retval = new BackEndParser.line_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON5=null;
        Token SEMICOLON7=null;
        BackEndParser.assignment_return assignment4 = null;

        BackEndParser.print_return print6 = null;

        BackEndParser.loop_return loop8 = null;

        BackEndParser.conditional_return conditional9 = null;


        Object SEMICOLON5_tree=null;
        Object SEMICOLON7_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_loop=new RewriteRuleSubtreeStream(adaptor,"rule loop");
        RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
        RewriteRuleSubtreeStream stream_print=new RewriteRuleSubtreeStream(adaptor,"rule print");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:16:3: ( assignment SEMICOLON -> ^( LINE assignment ) | print SEMICOLON -> ^( LINE print ) | loop -> ^( LINE loop ) | conditional -> ^( LINE conditional ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt3=1;
                }
                break;
            case PRINT:
                {
                alt3=2;
                }
                break;
            case LOOP:
                {
                alt3=3;
                }
                break;
            case IF:
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
                    // /cshome/bilec/git/vcalc/BackEnd.g:16:5: assignment SEMICOLON
                    {
                    pushFollow(FOLLOW_assignment_in_line79);
                    assignment4=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment4.getTree());
                    SEMICOLON5=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line81);  
                    stream_SEMICOLON.add(SEMICOLON5);



                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 16:26: -> ^( LINE assignment )
                    {
                        // /cshome/bilec/git/vcalc/BackEnd.g:16:29: ^( LINE assignment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LINE, "LINE"), root_1);

                        adaptor.addChild(root_1, stream_assignment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /cshome/bilec/git/vcalc/BackEnd.g:17:5: print SEMICOLON
                    {
                    pushFollow(FOLLOW_print_in_line95);
                    print6=print();

                    state._fsp--;

                    stream_print.add(print6.getTree());
                    SEMICOLON7=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_line97);  
                    stream_SEMICOLON.add(SEMICOLON7);



                    // AST REWRITE
                    // elements: print
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 17:21: -> ^( LINE print )
                    {
                        // /cshome/bilec/git/vcalc/BackEnd.g:17:24: ^( LINE print )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LINE, "LINE"), root_1);

                        adaptor.addChild(root_1, stream_print.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /cshome/bilec/git/vcalc/BackEnd.g:18:5: loop
                    {
                    pushFollow(FOLLOW_loop_in_line111);
                    loop8=loop();

                    state._fsp--;

                    stream_loop.add(loop8.getTree());


                    // AST REWRITE
                    // elements: loop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 18:10: -> ^( LINE loop )
                    {
                        // /cshome/bilec/git/vcalc/BackEnd.g:18:13: ^( LINE loop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LINE, "LINE"), root_1);

                        adaptor.addChild(root_1, stream_loop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /cshome/bilec/git/vcalc/BackEnd.g:19:5: conditional
                    {
                    pushFollow(FOLLOW_conditional_in_line125);
                    conditional9=conditional();

                    state._fsp--;

                    stream_conditional.add(conditional9.getTree());


                    // AST REWRITE
                    // elements: conditional
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 19:17: -> ^( LINE conditional )
                    {
                        // /cshome/bilec/git/vcalc/BackEnd.g:19:20: ^( LINE conditional )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LINE, "LINE"), root_1);

                        adaptor.addChild(root_1, stream_conditional.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "line"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /cshome/bilec/git/vcalc/BackEnd.g:22:1: declaration : INTEGER ID '=' expr SEMICOLON -> ^( DECL INTEGER ID expr ) ;
    public final BackEndParser.declaration_return declaration() throws RecognitionException {
        BackEndParser.declaration_return retval = new BackEndParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER10=null;
        Token ID11=null;
        Token char_literal12=null;
        Token SEMICOLON14=null;
        BackEndParser.expr_return expr13 = null;


        Object INTEGER10_tree=null;
        Object ID11_tree=null;
        Object char_literal12_tree=null;
        Object SEMICOLON14_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:23:3: ( INTEGER ID '=' expr SEMICOLON -> ^( DECL INTEGER ID expr ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:23:5: INTEGER ID '=' expr SEMICOLON
            {
            INTEGER10=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_declaration146);  
            stream_INTEGER.add(INTEGER10);

            ID11=(Token)match(input,ID,FOLLOW_ID_in_declaration148);  
            stream_ID.add(ID11);

            char_literal12=(Token)match(input,21,FOLLOW_21_in_declaration150);  
            stream_21.add(char_literal12);

            pushFollow(FOLLOW_expr_in_declaration152);
            expr13=expr();

            state._fsp--;

            stream_expr.add(expr13.getTree());
            SEMICOLON14=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declaration154);  
            stream_SEMICOLON.add(SEMICOLON14);



            // AST REWRITE
            // elements: ID, expr, INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 23:35: -> ^( DECL INTEGER ID expr )
            {
                // /cshome/bilec/git/vcalc/BackEnd.g:23:38: ^( DECL INTEGER ID expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);

                adaptor.addChild(root_1, stream_INTEGER.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // /cshome/bilec/git/vcalc/BackEnd.g:26:1: assignment : ID '=' expr -> ^( ASSIGN '=' ID expr ) ;
    public final BackEndParser.assignment_return assignment() throws RecognitionException {
        BackEndParser.assignment_return retval = new BackEndParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID15=null;
        Token char_literal16=null;
        BackEndParser.expr_return expr17 = null;


        Object ID15_tree=null;
        Object char_literal16_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:27:3: ( ID '=' expr -> ^( ASSIGN '=' ID expr ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:27:5: ID '=' expr
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_assignment182);  
            stream_ID.add(ID15);

            char_literal16=(Token)match(input,21,FOLLOW_21_in_assignment184);  
            stream_21.add(char_literal16);

            pushFollow(FOLLOW_expr_in_assignment186);
            expr17=expr();

            state._fsp--;

            stream_expr.add(expr17.getTree());


            // AST REWRITE
            // elements: 21, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 27:17: -> ^( ASSIGN '=' ID expr )
            {
                // /cshome/bilec/git/vcalc/BackEnd.g:27:20: ^( ASSIGN '=' ID expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                adaptor.addChild(root_1, stream_21.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // /cshome/bilec/git/vcalc/BackEnd.g:30:1: print : PRINT expr -> ^( PRINT expr ) ;
    public final BackEndParser.print_return print() throws RecognitionException {
        BackEndParser.print_return retval = new BackEndParser.print_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PRINT18=null;
        BackEndParser.expr_return expr19 = null;


        Object PRINT18_tree=null;
        RewriteRuleTokenStream stream_PRINT=new RewriteRuleTokenStream(adaptor,"token PRINT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:31:3: ( PRINT expr -> ^( PRINT expr ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:31:5: PRINT expr
            {
            PRINT18=(Token)match(input,PRINT,FOLLOW_PRINT_in_print214);  
            stream_PRINT.add(PRINT18);

            pushFollow(FOLLOW_expr_in_print216);
            expr19=expr();

            state._fsp--;

            stream_expr.add(expr19.getTree());


            // AST REWRITE
            // elements: PRINT, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 31:16: -> ^( PRINT expr )
            {
                // /cshome/bilec/git/vcalc/BackEnd.g:31:19: ^( PRINT expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PRINT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /cshome/bilec/git/vcalc/BackEnd.g:34:1: expr : compareExpr ;
    public final BackEndParser.expr_return expr() throws RecognitionException {
        BackEndParser.expr_return retval = new BackEndParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        BackEndParser.compareExpr_return compareExpr20 = null;



        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:35:3: ( compareExpr )
            // /cshome/bilec/git/vcalc/BackEnd.g:35:5: compareExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_compareExpr_in_expr237);
            compareExpr20=compareExpr();

            state._fsp--;

            adaptor.addChild(root_0, compareExpr20.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class compareExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compareExpr"
    // /cshome/bilec/git/vcalc/BackEnd.g:38:1: compareExpr : addExpr ( ( '>' | '<' | '==' | '!=' ) addExpr )* ;
    public final BackEndParser.compareExpr_return compareExpr() throws RecognitionException {
        BackEndParser.compareExpr_return retval = new BackEndParser.compareExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        Token char_literal23=null;
        Token string_literal24=null;
        Token string_literal25=null;
        BackEndParser.addExpr_return addExpr21 = null;

        BackEndParser.addExpr_return addExpr26 = null;


        Object char_literal22_tree=null;
        Object char_literal23_tree=null;
        Object string_literal24_tree=null;
        Object string_literal25_tree=null;

        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:39:3: ( addExpr ( ( '>' | '<' | '==' | '!=' ) addExpr )* )
            // /cshome/bilec/git/vcalc/BackEnd.g:39:5: addExpr ( ( '>' | '<' | '==' | '!=' ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_compareExpr252);
            addExpr21=addExpr();

            state._fsp--;

            adaptor.addChild(root_0, addExpr21.getTree());
            // /cshome/bilec/git/vcalc/BackEnd.g:39:13: ( ( '>' | '<' | '==' | '!=' ) addExpr )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=22 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:39:14: ( '>' | '<' | '==' | '!=' ) addExpr
            	    {
            	    // /cshome/bilec/git/vcalc/BackEnd.g:39:14: ( '>' | '<' | '==' | '!=' )
            	    int alt4=4;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:39:15: '>'
            	            {
            	            char_literal22=(Token)match(input,22,FOLLOW_22_in_compareExpr256); 
            	            char_literal22_tree = (Object)adaptor.create(char_literal22);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal22_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:39:22: '<'
            	            {
            	            char_literal23=(Token)match(input,23,FOLLOW_23_in_compareExpr261); 
            	            char_literal23_tree = (Object)adaptor.create(char_literal23);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal23_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:39:29: '=='
            	            {
            	            string_literal24=(Token)match(input,24,FOLLOW_24_in_compareExpr266); 
            	            string_literal24_tree = (Object)adaptor.create(string_literal24);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal24_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:39:37: '!='
            	            {
            	            string_literal25=(Token)match(input,25,FOLLOW_25_in_compareExpr271); 
            	            string_literal25_tree = (Object)adaptor.create(string_literal25);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal25_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_addExpr_in_compareExpr275);
            	    addExpr26=addExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addExpr26.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compareExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // /cshome/bilec/git/vcalc/BackEnd.g:42:1: addExpr : multiExpr ( ( '+' | '-' ) multiExpr )* ;
    public final BackEndParser.addExpr_return addExpr() throws RecognitionException {
        BackEndParser.addExpr_return retval = new BackEndParser.addExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal28=null;
        Token char_literal29=null;
        BackEndParser.multiExpr_return multiExpr27 = null;

        BackEndParser.multiExpr_return multiExpr30 = null;


        Object char_literal28_tree=null;
        Object char_literal29_tree=null;

        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:43:3: ( multiExpr ( ( '+' | '-' ) multiExpr )* )
            // /cshome/bilec/git/vcalc/BackEnd.g:43:5: multiExpr ( ( '+' | '-' ) multiExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiExpr_in_addExpr293);
            multiExpr27=multiExpr();

            state._fsp--;

            adaptor.addChild(root_0, multiExpr27.getTree());
            // /cshome/bilec/git/vcalc/BackEnd.g:43:15: ( ( '+' | '-' ) multiExpr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=26 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:43:16: ( '+' | '-' ) multiExpr
            	    {
            	    // /cshome/bilec/git/vcalc/BackEnd.g:43:16: ( '+' | '-' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==26) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==27) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:43:17: '+'
            	            {
            	            char_literal28=(Token)match(input,26,FOLLOW_26_in_addExpr297); 
            	            char_literal28_tree = (Object)adaptor.create(char_literal28);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal28_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:43:23: '-'
            	            {
            	            char_literal29=(Token)match(input,27,FOLLOW_27_in_addExpr301); 
            	            char_literal29_tree = (Object)adaptor.create(char_literal29);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal29_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiExpr_in_addExpr305);
            	    multiExpr30=multiExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiExpr30.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multiExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiExpr"
    // /cshome/bilec/git/vcalc/BackEnd.g:46:1: multiExpr : atom ( ( '*' | '/' ) atom )* ;
    public final BackEndParser.multiExpr_return multiExpr() throws RecognitionException {
        BackEndParser.multiExpr_return retval = new BackEndParser.multiExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal32=null;
        Token char_literal33=null;
        BackEndParser.atom_return atom31 = null;

        BackEndParser.atom_return atom34 = null;


        Object char_literal32_tree=null;
        Object char_literal33_tree=null;

        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:47:3: ( atom ( ( '*' | '/' ) atom )* )
            // /cshome/bilec/git/vcalc/BackEnd.g:47:5: atom ( ( '*' | '/' ) atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_multiExpr320);
            atom31=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom31.getTree());
            // /cshome/bilec/git/vcalc/BackEnd.g:47:10: ( ( '*' | '/' ) atom )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=28 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:47:11: ( '*' | '/' ) atom
            	    {
            	    // /cshome/bilec/git/vcalc/BackEnd.g:47:11: ( '*' | '/' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==28) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==29) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:47:12: '*'
            	            {
            	            char_literal32=(Token)match(input,28,FOLLOW_28_in_multiExpr324); 
            	            char_literal32_tree = (Object)adaptor.create(char_literal32);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal32_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /cshome/bilec/git/vcalc/BackEnd.g:47:19: '/'
            	            {
            	            char_literal33=(Token)match(input,29,FOLLOW_29_in_multiExpr329); 
            	            char_literal33_tree = (Object)adaptor.create(char_literal33);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal33_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_multiExpr333);
            	    atom34=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom34.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiExpr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /cshome/bilec/git/vcalc/BackEnd.g:50:1: atom : ( INT | ID | '(' expr ')' -> expr );
    public final BackEndParser.atom_return atom() throws RecognitionException {
        BackEndParser.atom_return retval = new BackEndParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT35=null;
        Token ID36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        BackEndParser.expr_return expr38 = null;


        Object INT35_tree=null;
        Object ID36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:51:3: ( INT | ID | '(' expr ')' -> expr )
            int alt10=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt10=1;
                }
                break;
            case ID:
                {
                alt10=2;
                }
                break;
            case 30:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /cshome/bilec/git/vcalc/BackEnd.g:51:5: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT35=(Token)match(input,INT,FOLLOW_INT_in_atom351); 
                    INT35_tree = (Object)adaptor.create(INT35);
                    adaptor.addChild(root_0, INT35_tree);


                    }
                    break;
                case 2 :
                    // /cshome/bilec/git/vcalc/BackEnd.g:52:5: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID36=(Token)match(input,ID,FOLLOW_ID_in_atom357); 
                    ID36_tree = (Object)adaptor.create(ID36);
                    adaptor.addChild(root_0, ID36_tree);


                    }
                    break;
                case 3 :
                    // /cshome/bilec/git/vcalc/BackEnd.g:53:5: '(' expr ')'
                    {
                    char_literal37=(Token)match(input,30,FOLLOW_30_in_atom363);  
                    stream_30.add(char_literal37);

                    pushFollow(FOLLOW_expr_in_atom365);
                    expr38=expr();

                    state._fsp--;

                    stream_expr.add(expr38.getTree());
                    char_literal39=(Token)match(input,31,FOLLOW_31_in_atom367);  
                    stream_31.add(char_literal39);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:18: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class loop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loop"
    // /cshome/bilec/git/vcalc/BackEnd.g:56:1: loop : LOOP expr ( line )* POOL SEMICOLON -> ^( LOOP expr ( line )* ) ;
    public final BackEndParser.loop_return loop() throws RecognitionException {
        BackEndParser.loop_return retval = new BackEndParser.loop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOOP40=null;
        Token POOL43=null;
        Token SEMICOLON44=null;
        BackEndParser.expr_return expr41 = null;

        BackEndParser.line_return line42 = null;


        Object LOOP40_tree=null;
        Object POOL43_tree=null;
        Object SEMICOLON44_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_POOL=new RewriteRuleTokenStream(adaptor,"token POOL");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:57:3: ( LOOP expr ( line )* POOL SEMICOLON -> ^( LOOP expr ( line )* ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:57:5: LOOP expr ( line )* POOL SEMICOLON
            {
            LOOP40=(Token)match(input,LOOP,FOLLOW_LOOP_in_loop386);  
            stream_LOOP.add(LOOP40);

            pushFollow(FOLLOW_expr_in_loop388);
            expr41=expr();

            state._fsp--;

            stream_expr.add(expr41.getTree());
            // /cshome/bilec/git/vcalc/BackEnd.g:57:15: ( line )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=ID && LA11_0<=PRINT)||LA11_0==LOOP||LA11_0==IF) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:57:15: line
            	    {
            	    pushFollow(FOLLOW_line_in_loop390);
            	    line42=line();

            	    state._fsp--;

            	    stream_line.add(line42.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            POOL43=(Token)match(input,POOL,FOLLOW_POOL_in_loop393);  
            stream_POOL.add(POOL43);

            SEMICOLON44=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_loop395);  
            stream_SEMICOLON.add(SEMICOLON44);



            // AST REWRITE
            // elements: expr, LOOP, line
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:36: -> ^( LOOP expr ( line )* )
            {
                // /cshome/bilec/git/vcalc/BackEnd.g:57:39: ^( LOOP expr ( line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LOOP.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /cshome/bilec/git/vcalc/BackEnd.g:57:51: ( line )*
                while ( stream_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_line.nextTree());

                }
                stream_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "loop"

    public static class conditional_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional"
    // /cshome/bilec/git/vcalc/BackEnd.g:60:1: conditional : IF expr ( line )* FI SEMICOLON -> ^( IF expr ( line )* ) ;
    public final BackEndParser.conditional_return conditional() throws RecognitionException {
        BackEndParser.conditional_return retval = new BackEndParser.conditional_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF45=null;
        Token FI48=null;
        Token SEMICOLON49=null;
        BackEndParser.expr_return expr46 = null;

        BackEndParser.line_return line47 = null;


        Object IF45_tree=null;
        Object FI48_tree=null;
        Object SEMICOLON49_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_FI=new RewriteRuleTokenStream(adaptor,"token FI");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:61:3: ( IF expr ( line )* FI SEMICOLON -> ^( IF expr ( line )* ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:61:5: IF expr ( line )* FI SEMICOLON
            {
            IF45=(Token)match(input,IF,FOLLOW_IF_in_conditional421);  
            stream_IF.add(IF45);

            pushFollow(FOLLOW_expr_in_conditional423);
            expr46=expr();

            state._fsp--;

            stream_expr.add(expr46.getTree());
            // /cshome/bilec/git/vcalc/BackEnd.g:61:13: ( line )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=ID && LA12_0<=PRINT)||LA12_0==LOOP||LA12_0==IF) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:61:13: line
            	    {
            	    pushFollow(FOLLOW_line_in_conditional425);
            	    line47=line();

            	    state._fsp--;

            	    stream_line.add(line47.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            FI48=(Token)match(input,FI,FOLLOW_FI_in_conditional428);  
            stream_FI.add(FI48);

            SEMICOLON49=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_conditional430);  
            stream_SEMICOLON.add(SEMICOLON49);



            // AST REWRITE
            // elements: expr, line, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:32: -> ^( IF expr ( line )* )
            {
                // /cshome/bilec/git/vcalc/BackEnd.g:61:35: ^( IF expr ( line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                // /cshome/bilec/git/vcalc/BackEnd.g:61:45: ( line )*
                while ( stream_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_line.nextTree());

                }
                stream_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_prog48 = new BitSet(new long[]{0x000000000000AE00L});
    public static final BitSet FOLLOW_line_in_prog51 = new BitSet(new long[]{0x000000000000AC00L});
    public static final BitSet FOLLOW_EOF_in_prog54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_line79 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_line81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_line95 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_line97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_line111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_line125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_declaration146 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_declaration148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_declaration150 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_expr_in_declaration152 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_declaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment182 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_assignment184 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_expr_in_assignment186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print214 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_expr_in_print216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compareExpr_in_expr237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpr_in_compareExpr252 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_22_in_compareExpr256 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_23_in_compareExpr261 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_24_in_compareExpr266 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_25_in_compareExpr271 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_addExpr_in_compareExpr275 = new BitSet(new long[]{0x0000000003C00002L});
    public static final BitSet FOLLOW_multiExpr_in_addExpr293 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_addExpr297 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_27_in_addExpr301 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_multiExpr_in_addExpr305 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_atom_in_multiExpr320 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_multiExpr324 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_29_in_multiExpr329 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_atom_in_multiExpr333 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_INT_in_atom351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_atom363 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_expr_in_atom365 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_atom367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loop386 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_expr_in_loop388 = new BitSet(new long[]{0x000000000000EC00L});
    public static final BitSet FOLLOW_line_in_loop390 = new BitSet(new long[]{0x000000000000EC00L});
    public static final BitSet FOLLOW_POOL_in_loop393 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_loop395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_conditional421 = new BitSet(new long[]{0x0000000040001400L});
    public static final BitSet FOLLOW_expr_in_conditional423 = new BitSet(new long[]{0x000000000001AC00L});
    public static final BitSet FOLLOW_line_in_conditional425 = new BitSet(new long[]{0x000000000001AC00L});
    public static final BitSet FOLLOW_FI_in_conditional428 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_SEMICOLON_in_conditional430 = new BitSet(new long[]{0x0000000000000002L});

}