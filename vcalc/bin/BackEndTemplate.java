// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g 2014-10-08 19:21:29

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class BackEndTemplate extends TreeParser {
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


        public BackEndTemplate(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public BackEndTemplate(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("BackEndTemplateTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return BackEndTemplate.tokenNames; }
    public String getGrammarFileName() { return "/home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g"; }


      int countLabel = 0; int countLoop = 0; int progLine = 0;
      int opcounter = 1; int tempcounter = 0;


    public static class walk_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "walk"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:27:1: walk : ^( PROGRAM (x+= declaration )* (y+= block )* ) -> program2(a=$xb=$y);
    public final BackEndTemplate.walk_return walk() throws RecognitionException {
        BackEndTemplate.walk_return retval = new BackEndTemplate.walk_return();
        retval.start = input.LT(1);

        List list_x=null;
        List list_y=null;
        RuleReturnScope x = null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:28:3: ( ^( PROGRAM (x+= declaration )* (y+= block )* ) -> program2(a=$xb=$y))
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:28:5: ^( PROGRAM (x+= declaration )* (y+= block )* )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_walk74); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:28:15: (x+= declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DECL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:28:16: x+= declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_walk79);
                	    x=declaration();

                	    state._fsp--;

                	    if (list_x==null) list_x=new ArrayList();
                	    list_x.add(x.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:28:33: (y+= block )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==LINE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:28:34: y+= block
                	    {
                	    pushFollow(FOLLOW_block_in_walk86);
                	    y=block();

                	    state._fsp--;

                	    if (list_y==null) list_y=new ArrayList();
                	    list_y.add(y.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 28:46: -> program2(a=$xb=$y)
            {
                retval.st = templateLib.getInstanceOf("program2",
              new STAttrMap().put("a", list_x).put("b", list_y));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "walk"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:31:1: declaration : ^( DECL INTEGER x= ID y+= expr ) -> declareInt(a=$yid=$xop=opcounter);
    public final BackEndTemplate.declaration_return declaration() throws RecognitionException {
        BackEndTemplate.declaration_return retval = new BackEndTemplate.declaration_return();
        retval.start = input.LT(1);

        CommonTree x=null;
        List list_y=null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:32:3: ( ^( DECL INTEGER x= ID y+= expr ) -> declareInt(a=$yid=$xop=opcounter))
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:32:5: ^( DECL INTEGER x= ID y+= expr )
            {
            match(input,DECL,FOLLOW_DECL_in_declaration118); 

            match(input, Token.DOWN, null); 
            match(input,INTEGER,FOLLOW_INTEGER_in_declaration120); 
            x=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration124); 
            pushFollow(FOLLOW_expr_in_declaration128);
            y=expr();

            state._fsp--;

            if (list_y==null) list_y=new ArrayList();
            list_y.add(y.getTemplate());


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 32:35: -> declareInt(a=$yid=$xop=opcounter)
            {
                retval.st = templateLib.getInstanceOf("declareInt",
              new STAttrMap().put("a", list_y).put("id", x).put("op", opcounter));
            }


            }

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

    public static class storeVariable_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "storeVariable"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:35:1: storeVariable : ^( DECL INTEGER x= ID y+= expr ) -> storeVar(a=$yid=$xop=opcounter);
    public final BackEndTemplate.storeVariable_return storeVariable() throws RecognitionException {
        BackEndTemplate.storeVariable_return retval = new BackEndTemplate.storeVariable_return();
        retval.start = input.LT(1);

        CommonTree x=null;
        List list_y=null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:36:3: ( ^( DECL INTEGER x= ID y+= expr ) -> storeVar(a=$yid=$xop=opcounter))
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:36:5: ^( DECL INTEGER x= ID y+= expr )
            {
            match(input,DECL,FOLLOW_DECL_in_storeVariable166); 

            match(input, Token.DOWN, null); 
            match(input,INTEGER,FOLLOW_INTEGER_in_storeVariable168); 
            x=(CommonTree)match(input,ID,FOLLOW_ID_in_storeVariable172); 
            pushFollow(FOLLOW_expr_in_storeVariable176);
            y=expr();

            state._fsp--;

            if (list_y==null) list_y=new ArrayList();
            list_y.add(y.getTemplate());


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 36:34: -> storeVar(a=$yid=$xop=opcounter)
            {
                retval.st = templateLib.getInstanceOf("storeVar",
              new STAttrMap().put("a", list_y).put("id", x).put("op", opcounter));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "storeVariable"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:39:1: block : ( ^( LINE ^( PRINT x+= expr ) ) -> printStatement(a=$xtc=tempcounterop=opcounter) | ^( LINE ^( IF x+= expr (y+= block )* ) ) -> bne(tc=tempcounterop=opcounterexp=$xlines=$ylabel=countLabel-1nextlabel=countLabel) | ^( LINE ^( LOOP x+= expr (y+= block )* ) ) -> looper(tc=tempcounterop=opcounterexp=$xlines=$ylabel=countLoop - 2nextlabel=countLoop -1exitlabel=countLoop) | ^( LINE ^( ASSIGN '=' t= ID y+= expr ) ) -> storeVar(a=$yid=$top=opcounter));
    public final BackEndTemplate.block_return block() throws RecognitionException {
        BackEndTemplate.block_return retval = new BackEndTemplate.block_return();
        retval.start = input.LT(1);

        CommonTree t=null;
        List list_x=null;
        List list_y=null;
        RuleReturnScope x = null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:40:3: ( ^( LINE ^( PRINT x+= expr ) ) -> printStatement(a=$xtc=tempcounterop=opcounter) | ^( LINE ^( IF x+= expr (y+= block )* ) ) -> bne(tc=tempcounterop=opcounterexp=$xlines=$ylabel=countLabel-1nextlabel=countLabel) | ^( LINE ^( LOOP x+= expr (y+= block )* ) ) -> looper(tc=tempcounterop=opcounterexp=$xlines=$ylabel=countLoop - 2nextlabel=countLoop -1exitlabel=countLoop) | ^( LINE ^( ASSIGN '=' t= ID y+= expr ) ) -> storeVar(a=$yid=$top=opcounter))
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LINE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case PRINT:
                        {
                        alt5=1;
                        }
                        break;
                    case IF:
                        {
                        alt5=2;
                        }
                        break;
                    case LOOP:
                        {
                        alt5=3;
                        }
                        break;
                    case ASSIGN:
                        {
                        alt5=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:40:5: ^( LINE ^( PRINT x+= expr ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block208); 

                    match(input, Token.DOWN, null); 
                    match(input,PRINT,FOLLOW_PRINT_in_block211); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_block215);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    tempcounter++;


                    // TEMPLATE REWRITE
                    // 40:47: -> printStatement(a=$xtc=tempcounterop=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("printStatement",
                      new STAttrMap().put("a", list_x).put("tc", tempcounter).put("op", opcounter));
                    }


                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:41:5: ^( LINE ^( IF x+= expr (y+= block )* ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block244); 

                    match(input, Token.DOWN, null); 
                    match(input,IF,FOLLOW_IF_in_block247); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_block251);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:41:26: (y+= block )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==LINE) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:41:26: y+= block
                    	    {
                    	    pushFollow(FOLLOW_block_in_block255);
                    	    y=block();

                    	    state._fsp--;

                    	    if (list_y==null) list_y=new ArrayList();
                    	    list_y.add(y.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    countLabel = countLabel + 2; tempcounter++;


                    // TEMPLATE REWRITE
                    // 41:83: -> bne(tc=tempcounterop=opcounterexp=$xlines=$ylabel=countLabel-1nextlabel=countLabel)
                    {
                        retval.st = templateLib.getInstanceOf("bne",
                      new STAttrMap().put("tc", tempcounter).put("op", opcounter).put("exp", list_x).put("lines", list_y).put("label", countLabel-1).put("nextlabel", countLabel));
                    }


                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:42:5: ^( LINE ^( LOOP x+= expr (y+= block )* ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block296); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_block299); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_block303);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:42:28: (y+= block )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==LINE) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:42:28: y+= block
                    	    {
                    	    pushFollow(FOLLOW_block_in_block307);
                    	    y=block();

                    	    state._fsp--;

                    	    if (list_y==null) list_y=new ArrayList();
                    	    list_y.add(y.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    countLoop = countLoop + 3;


                    // TEMPLATE REWRITE
                    // 42:68: -> looper(tc=tempcounterop=opcounterexp=$xlines=$ylabel=countLoop - 2nextlabel=countLoop -1exitlabel=countLoop)
                    {
                        retval.st = templateLib.getInstanceOf("looper",
                      new STAttrMap().put("tc", tempcounter).put("op", opcounter).put("exp", list_x).put("lines", list_y).put("label", countLoop - 2).put("nextlabel", countLoop -1).put("exitlabel", countLoop));
                    }


                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:43:5: ^( LINE ^( ASSIGN '=' t= ID y+= expr ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block352); 

                    match(input, Token.DOWN, null); 
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_block355); 

                    match(input, Token.DOWN, null); 
                    match(input,21,FOLLOW_21_in_block357); 
                    t=(CommonTree)match(input,ID,FOLLOW_ID_in_block361); 
                    pushFollow(FOLLOW_expr_in_block365);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 43:40: -> storeVar(a=$yid=$top=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("storeVar",
                      new STAttrMap().put("a", list_y).put("id", t).put("op", opcounter));
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
        return retval;
    }
    // $ANTLR end "block"

    public static class assignment_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:46:1: assignment : ^( ASSIGN '=' x= ID y+= expr ) -> storeVar(a=$yid=$xop=opcounter);
    public final BackEndTemplate.assignment_return assignment() throws RecognitionException {
        BackEndTemplate.assignment_return retval = new BackEndTemplate.assignment_return();
        retval.start = input.LT(1);

        CommonTree x=null;
        List list_y=null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:47:3: ( ^( ASSIGN '=' x= ID y+= expr ) -> storeVar(a=$yid=$xop=opcounter))
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:47:5: ^( ASSIGN '=' x= ID y+= expr )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment400); 

            match(input, Token.DOWN, null); 
            match(input,21,FOLLOW_21_in_assignment402); 
            x=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment406); 
            pushFollow(FOLLOW_expr_in_assignment410);
            y=expr();

            state._fsp--;

            if (list_y==null) list_y=new ArrayList();
            list_y.add(y.getTemplate());


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 47:32: -> storeVar(a=$yid=$xop=opcounter)
            {
                retval.st = templateLib.getInstanceOf("storeVar",
              new STAttrMap().put("a", list_y).put("id", x).put("op", opcounter));
            }


            }

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

    public static class print_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "print"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:50:1: print : ^( PRINT x+= expr ) -> printStatement(a=$xtc=tempcounterop=opcounter);
    public final BackEndTemplate.print_return print() throws RecognitionException {
        BackEndTemplate.print_return retval = new BackEndTemplate.print_return();
        retval.start = input.LT(1);

        List list_x=null;
        RuleReturnScope x = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:51:3: ( ^( PRINT x+= expr ) -> printStatement(a=$xtc=tempcounterop=opcounter))
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:51:5: ^( PRINT x+= expr )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print444); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_print448);
            x=expr();

            state._fsp--;

            if (list_x==null) list_x=new ArrayList();
            list_x.add(x.getTemplate());


            match(input, Token.UP, null); 
            tempcounter++;


            // TEMPLATE REWRITE
            // 51:39: -> printStatement(a=$xtc=tempcounterop=opcounter)
            {
                retval.st = templateLib.getInstanceOf("printStatement",
              new STAttrMap().put("a", list_x).put("tc", tempcounter).put("op", opcounter));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print"

    public static class ifstatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifstatement"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:54:1: ifstatement : ^( IF expr ( block )* ) ;
    public final BackEndTemplate.ifstatement_return ifstatement() throws RecognitionException {
        BackEndTemplate.ifstatement_return retval = new BackEndTemplate.ifstatement_return();
        retval.start = input.LT(1);

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:55:3: ( ^( IF expr ( block )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:55:5: ^( IF expr ( block )* )
            {
            match(input,IF,FOLLOW_IF_in_ifstatement485); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifstatement487);
            expr();

            state._fsp--;

            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:55:15: ( block )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:55:15: block
            	    {
            	    pushFollow(FOLLOW_block_in_ifstatement489);
            	    block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifstatement"

    public static class loop_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "loop"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:58:1: loop : ^( LOOP expr ( block )* ) ;
    public final BackEndTemplate.loop_return loop() throws RecognitionException {
        BackEndTemplate.loop_return retval = new BackEndTemplate.loop_return();
        retval.start = input.LT(1);

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:59:3: ( ^( LOOP expr ( block )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:59:5: ^( LOOP expr ( block )* )
            {
            match(input,LOOP,FOLLOW_LOOP_in_loop508); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_loop510);
            expr();

            state._fsp--;

            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:59:17: ( block )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:59:17: block
            	    {
            	    pushFollow(FOLLOW_block_in_loop512);
            	    block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "loop"

    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:62:1: expr : ( ^( '==' x= expr y= expr ) -> eql(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '!=' x= expr y= expr ) -> neq(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '>' x= expr y= expr ) -> sgt(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '<' x= expr y= expr ) -> slt(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '+' x= expr y= expr ) -> add(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | ^( '-' x= expr y= expr ) -> sub(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | ^( '*' x= expr y= expr ) -> mult(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | ^( '/' x= expr y= expr ) -> div(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | INT -> int(v=$INT.textoc=opcountertc=tempcounter) | ID -> var(id=$ID.textoc=opcounter));
    public final BackEndTemplate.expr_return expr() throws RecognitionException {
        BackEndTemplate.expr_return retval = new BackEndTemplate.expr_return();
        retval.start = input.LT(1);

        CommonTree INT1=null;
        CommonTree ID2=null;
        BackEndTemplate.expr_return x = null;

        BackEndTemplate.expr_return y = null;


        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:63:3: ( ^( '==' x= expr y= expr ) -> eql(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '!=' x= expr y= expr ) -> neq(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '>' x= expr y= expr ) -> sgt(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '<' x= expr y= expr ) -> slt(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter) | ^( '+' x= expr y= expr ) -> add(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | ^( '-' x= expr y= expr ) -> sub(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | ^( '*' x= expr y= expr ) -> mult(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | ^( '/' x= expr y= expr ) -> div(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter) | INT -> int(v=$INT.textoc=opcountertc=tempcounter) | ID -> var(id=$ID.textoc=opcounter))
            int alt8=10;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            case 28:
                {
                alt8=7;
                }
                break;
            case 29:
                {
                alt8=8;
                }
                break;
            case INT:
                {
                alt8=9;
                }
                break;
            case ID:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:63:5: ^( '==' x= expr y= expr )
                    {
                    match(input,24,FOLLOW_24_in_expr533); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr537);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr541);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++; tempcounter++;


                    // TEMPLATE REWRITE
                    // 63:57: -> eql(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("eql",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("tc", tempcounter).put("dest", opcounter));
                    }


                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:64:5: ^( '!=' x= expr y= expr )
                    {
                    match(input,25,FOLLOW_25_in_expr580); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr584);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr588);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++; tempcounter++;


                    // TEMPLATE REWRITE
                    // 64:57: -> neq(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("neq",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("tc", tempcounter).put("dest", opcounter));
                    }


                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:65:5: ^( '>' x= expr y= expr )
                    {
                    match(input,22,FOLLOW_22_in_expr627); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr631);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr635);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++; tempcounter++;


                    // TEMPLATE REWRITE
                    // 65:56: -> sgt(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("sgt",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("tc", tempcounter).put("dest", opcounter));
                    }


                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:66:5: ^( '<' x= expr y= expr )
                    {
                    match(input,23,FOLLOW_23_in_expr674); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr678);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr682);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++; tempcounter++;


                    // TEMPLATE REWRITE
                    // 66:56: -> slt(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1tc=tempcounterdest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("slt",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("tc", tempcounter).put("dest", opcounter));
                    }


                    }
                    break;
                case 5 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:67:5: ^( '+' x= expr y= expr )
                    {
                    match(input,26,FOLLOW_26_in_expr721); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr725);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr729);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++;


                    // TEMPLATE REWRITE
                    // 67:41: -> add(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("add",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("dest", opcounter));
                    }


                    }
                    break;
                case 6 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:68:5: ^( '-' x= expr y= expr )
                    {
                    match(input,27,FOLLOW_27_in_expr764); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr768);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr772);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++;


                    // TEMPLATE REWRITE
                    // 68:41: -> sub(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("sub",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("dest", opcounter));
                    }


                    }
                    break;
                case 7 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:69:5: ^( '*' x= expr y= expr )
                    {
                    match(input,28,FOLLOW_28_in_expr807); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr811);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr815);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++;


                    // TEMPLATE REWRITE
                    // 69:41: -> mult(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("mult",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("dest", opcounter));
                    }


                    }
                    break;
                case 8 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:70:5: ^( '/' x= expr y= expr )
                    {
                    match(input,29,FOLLOW_29_in_expr850); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr854);
                    x=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr858);
                    y=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    opcounter++;


                    // TEMPLATE REWRITE
                    // 70:41: -> div(a=$x.stb=$y.stop1=opcounter-2op2=opcounter-1dest=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("div",
                      new STAttrMap().put("a", (x!=null?x.st:null)).put("b", (y!=null?y.st:null)).put("op1", opcounter-2).put("op2", opcounter-1).put("dest", opcounter));
                    }


                    }
                    break;
                case 9 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:71:5: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr892); 
                    opcounter++; tempcounter++;


                    // TEMPLATE REWRITE
                    // 71:39: -> int(v=$INT.textoc=opcountertc=tempcounter)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("v", (INT1!=null?INT1.getText():null)).put("oc", opcounter).put("tc", tempcounter));
                    }


                    }
                    break;
                case 10 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/vcalc/bin/BackEndTemplate.g:72:5: ID
                    {
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr917); 
                    opcounter++;


                    // TEMPLATE REWRITE
                    // 72:23: -> var(id=$ID.textoc=opcounter)
                    {
                        retval.st = templateLib.getInstanceOf("var",
                      new STAttrMap().put("id", (ID2!=null?ID2.getText():null)).put("oc", opcounter));
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
        return retval;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAM_in_walk74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_walk79 = new BitSet(new long[]{0x0000000000000058L});
    public static final BitSet FOLLOW_block_in_walk86 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_DECL_in_declaration118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_declaration120 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_declaration124 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_declaration128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECL_in_storeVariable166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_storeVariable168 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_storeVariable172 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_storeVariable176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_block208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRINT_in_block211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_block215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_block244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_in_block247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_block251 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_block255 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_LINE_in_block296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_block299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_block303 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_block307 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_LINE_in_block352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_block355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_21_in_block357 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_block361 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_block365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_21_in_assignment402 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_assignment406 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_assignment410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_print444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_print448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifstatement485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifstatement487 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_ifstatement489 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_LOOP_in_loop508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_loop510 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_loop512 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_24_in_expr533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr537 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_expr580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr584 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_expr627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr631 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expr674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr678 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expr721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr725 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr768 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr772 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expr807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr811 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr854 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr917 = new BitSet(new long[]{0x0000000000000002L});

}