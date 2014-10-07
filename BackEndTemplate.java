// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g 2014-10-06 17:56:48

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
    public String getGrammarFileName() { return "/home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g"; }

    int countLabel = 0; int countLoop = 0;

    public static class declara_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declara"
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:11:1: declara : ^( PROGRAM (x+= declaration )* (y+= nullblock )* ) -> program(a=$x);
    public final BackEndTemplate.declara_return declara() throws RecognitionException {
        BackEndTemplate.declara_return retval = new BackEndTemplate.declara_return();
        retval.start = input.LT(1);

        List list_x=null;
        List list_y=null;
        RuleReturnScope x = null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:12:3: ( ^( PROGRAM (x+= declaration )* (y+= nullblock )* ) -> program(a=$x))
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:12:5: ^( PROGRAM (x+= declaration )* (y+= nullblock )* )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_declara61); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:12:15: (x+= declaration )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DECL) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:12:16: x+= declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_declara66);
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

                // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:12:33: (y+= nullblock )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==LINE) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:12:34: y+= nullblock
                	    {
                	    pushFollow(FOLLOW_nullblock_in_declara73);
                	    y=nullblock();

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
            // 12:50: -> program(a=$x)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("a", list_x));
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
    // $ANTLR end "declara"

    public static class nullblock_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "nullblock"
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:15:1: nullblock : ( ^( LINE assignment ) | ^( LINE print ) | ^( LINE ifstatement ) | ^( LINE loop ) );
    public final BackEndTemplate.nullblock_return nullblock() throws RecognitionException {
        BackEndTemplate.nullblock_return retval = new BackEndTemplate.nullblock_return();
        retval.start = input.LT(1);

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:16:3: ( ^( LINE assignment ) | ^( LINE print ) | ^( LINE ifstatement ) | ^( LINE loop ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LINE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ASSIGN:
                        {
                        alt3=1;
                        }
                        break;
                    case PRINT:
                        {
                        alt3=2;
                        }
                        break;
                    case IF:
                        {
                        alt3=3;
                        }
                        break;
                    case LOOP:
                        {
                        alt3=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:16:5: ^( LINE assignment )
                    {
                    match(input,LINE,FOLLOW_LINE_in_nullblock101); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_assignment_in_nullblock103);
                    assignment();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:17:5: ^( LINE print )
                    {
                    match(input,LINE,FOLLOW_LINE_in_nullblock111); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_print_in_nullblock113);
                    print();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:18:5: ^( LINE ifstatement )
                    {
                    match(input,LINE,FOLLOW_LINE_in_nullblock121); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_ifstatement_in_nullblock123);
                    ifstatement();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:19:5: ^( LINE loop )
                    {
                    match(input,LINE,FOLLOW_LINE_in_nullblock131); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_loop_in_nullblock133);
                    loop();

                    state._fsp--;


                    match(input, Token.UP, null); 

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
    // $ANTLR end "nullblock"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:22:1: declaration : ^( DECL INTEGER x= ID expr ) -> decl(a=$x);
    public final BackEndTemplate.declaration_return declaration() throws RecognitionException {
        BackEndTemplate.declaration_return retval = new BackEndTemplate.declaration_return();
        retval.start = input.LT(1);

        CommonTree x=null;

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:23:3: ( ^( DECL INTEGER x= ID expr ) -> decl(a=$x))
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:23:5: ^( DECL INTEGER x= ID expr )
            {
            match(input,DECL,FOLLOW_DECL_in_declaration148); 

            match(input, Token.DOWN, null); 
            match(input,INTEGER,FOLLOW_INTEGER_in_declaration150); 
            x=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration154); 
            pushFollow(FOLLOW_expr_in_declaration156);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 23:32: -> decl(a=$x)
            {
                retval.st = templateLib.getInstanceOf("decl",
              new STAttrMap().put("a", x));
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

    public static class walk_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "walk"
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:26:1: walk : ^( PROGRAM (x+= loadVariable )* (y+= block )* ) -> program2(a=$xb=$y);
    public final BackEndTemplate.walk_return walk() throws RecognitionException {
        BackEndTemplate.walk_return retval = new BackEndTemplate.walk_return();
        retval.start = input.LT(1);

        List list_x=null;
        List list_y=null;
        RuleReturnScope x = null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:27:3: ( ^( PROGRAM (x+= loadVariable )* (y+= block )* ) -> program2(a=$xb=$y))
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:27:5: ^( PROGRAM (x+= loadVariable )* (y+= block )* )
            {
            match(input,PROGRAM,FOLLOW_PROGRAM_in_walk181); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:27:15: (x+= loadVariable )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==DECL) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:27:16: x+= loadVariable
                	    {
                	    pushFollow(FOLLOW_loadVariable_in_walk186);
                	    x=loadVariable();

                	    state._fsp--;

                	    if (list_x==null) list_x=new ArrayList();
                	    list_x.add(x.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);

                // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:27:34: (y+= block )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==LINE) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:27:35: y+= block
                	    {
                	    pushFollow(FOLLOW_block_in_walk193);
                	    y=block();

                	    state._fsp--;

                	    if (list_y==null) list_y=new ArrayList();
                	    list_y.add(y.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 27:47: -> program2(a=$xb=$y)
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

    public static class loadVariable_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "loadVariable"
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:30:1: loadVariable : ^( DECL INTEGER x= ID y+= expr ) -> loadVar(a=$xb=$y);
    public final BackEndTemplate.loadVariable_return loadVariable() throws RecognitionException {
        BackEndTemplate.loadVariable_return retval = new BackEndTemplate.loadVariable_return();
        retval.start = input.LT(1);

        CommonTree x=null;
        List list_y=null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:31:3: ( ^( DECL INTEGER x= ID y+= expr ) -> loadVar(a=$xb=$y))
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:31:5: ^( DECL INTEGER x= ID y+= expr )
            {
            match(input,DECL,FOLLOW_DECL_in_loadVariable225); 

            match(input, Token.DOWN, null); 
            match(input,INTEGER,FOLLOW_INTEGER_in_loadVariable227); 
            x=(CommonTree)match(input,ID,FOLLOW_ID_in_loadVariable231); 
            pushFollow(FOLLOW_expr_in_loadVariable235);
            y=expr();

            state._fsp--;

            if (list_y==null) list_y=new ArrayList();
            list_y.add(y.getTemplate());


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 31:34: -> loadVar(a=$xb=$y)
            {
                retval.st = templateLib.getInstanceOf("loadVar",
              new STAttrMap().put("a", x).put("b", list_y));
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
    // $ANTLR end "loadVariable"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:34:1: block : ( ^( LINE ^( PRINT x+= expr ) ) -> printCode(a=$x) | ^( LINE ^( IF x+= expr (y+= block )* ) ) -> bne(exp=$xlines=$ylabel=countLabel) | ^( LINE ^( LOOP x+= expr (y+= block )* ) ) -> looper(exp=$xlines=$ylabel=countLoop) | ^( LINE ^( ASSIGN '=' t= ID y+= expr ) ) -> loadVar(a=$tb=$y));
    public final BackEndTemplate.block_return block() throws RecognitionException {
        BackEndTemplate.block_return retval = new BackEndTemplate.block_return();
        retval.start = input.LT(1);

        CommonTree t=null;
        List list_x=null;
        List list_y=null;
        RuleReturnScope x = null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:35:3: ( ^( LINE ^( PRINT x+= expr ) ) -> printCode(a=$x) | ^( LINE ^( IF x+= expr (y+= block )* ) ) -> bne(exp=$xlines=$ylabel=countLabel) | ^( LINE ^( LOOP x+= expr (y+= block )* ) ) -> looper(exp=$xlines=$ylabel=countLoop) | ^( LINE ^( ASSIGN '=' t= ID y+= expr ) ) -> loadVar(a=$tb=$y))
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LINE) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case PRINT:
                        {
                        alt8=1;
                        }
                        break;
                    case IF:
                        {
                        alt8=2;
                        }
                        break;
                    case LOOP:
                        {
                        alt8=3;
                        }
                        break;
                    case ASSIGN:
                        {
                        alt8=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:35:5: ^( LINE ^( PRINT x+= expr ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block263); 

                    match(input, Token.DOWN, null); 
                    match(input,PRINT,FOLLOW_PRINT_in_block266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_block270);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 35:30: -> printCode(a=$x)
                    {
                        retval.st = templateLib.getInstanceOf("printCode",
                      new STAttrMap().put("a", list_x));
                    }


                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:36:5: ^( LINE ^( IF x+= expr (y+= block )* ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block288); 

                    match(input, Token.DOWN, null); 
                    match(input,IF,FOLLOW_IF_in_block291); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_block295);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:36:26: (y+= block )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==LINE) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:36:26: y+= block
                    	    {
                    	    pushFollow(FOLLOW_block_in_block299);
                    	    y=block();

                    	    state._fsp--;

                    	    if (list_y==null) list_y=new ArrayList();
                    	    list_y.add(y.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    countLabel++;


                    // TEMPLATE REWRITE
                    // 36:53: -> bne(exp=$xlines=$ylabel=countLabel)
                    {
                        retval.st = templateLib.getInstanceOf("bne",
                      new STAttrMap().put("exp", list_x).put("lines", list_y).put("label", countLabel));
                    }


                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:37:5: ^( LINE ^( LOOP x+= expr (y+= block )* ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block328); 

                    match(input, Token.DOWN, null); 
                    match(input,LOOP,FOLLOW_LOOP_in_block331); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_block335);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:37:28: (y+= block )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==LINE) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:37:28: y+= block
                    	    {
                    	    pushFollow(FOLLOW_block_in_block339);
                    	    y=block();

                    	    state._fsp--;

                    	    if (list_y==null) list_y=new ArrayList();
                    	    list_y.add(y.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 
                    countLoop++;


                    // TEMPLATE REWRITE
                    // 37:54: -> looper(exp=$xlines=$ylabel=countLoop)
                    {
                        retval.st = templateLib.getInstanceOf("looper",
                      new STAttrMap().put("exp", list_x).put("lines", list_y).put("label", countLoop));
                    }


                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:38:5: ^( LINE ^( ASSIGN '=' t= ID y+= expr ) )
                    {
                    match(input,LINE,FOLLOW_LINE_in_block368); 

                    match(input, Token.DOWN, null); 
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_block371); 

                    match(input, Token.DOWN, null); 
                    match(input,21,FOLLOW_21_in_block373); 
                    t=(CommonTree)match(input,ID,FOLLOW_ID_in_block377); 
                    pushFollow(FOLLOW_expr_in_block381);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 38:40: -> loadVar(a=$tb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("loadVar",
                      new STAttrMap().put("a", t).put("b", list_y));
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
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:41:1: assignment : ^( ASSIGN '=' x= ID y+= expr ) -> loadVar(a=$xb=$y);
    public final BackEndTemplate.assignment_return assignment() throws RecognitionException {
        BackEndTemplate.assignment_return retval = new BackEndTemplate.assignment_return();
        retval.start = input.LT(1);

        CommonTree x=null;
        List list_y=null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:42:3: ( ^( ASSIGN '=' x= ID y+= expr ) -> loadVar(a=$xb=$y))
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:42:5: ^( ASSIGN '=' x= ID y+= expr )
            {
            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment413); 

            match(input, Token.DOWN, null); 
            match(input,21,FOLLOW_21_in_assignment415); 
            x=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment419); 
            pushFollow(FOLLOW_expr_in_assignment423);
            y=expr();

            state._fsp--;

            if (list_y==null) list_y=new ArrayList();
            list_y.add(y.getTemplate());


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 42:32: -> loadVar(a=$xb=$y)
            {
                retval.st = templateLib.getInstanceOf("loadVar",
              new STAttrMap().put("a", x).put("b", list_y));
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
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:45:1: print : ^( PRINT x+= expr ) -> printCode(a=$x);
    public final BackEndTemplate.print_return print() throws RecognitionException {
        BackEndTemplate.print_return retval = new BackEndTemplate.print_return();
        retval.start = input.LT(1);

        List list_x=null;
        RuleReturnScope x = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:46:3: ( ^( PRINT x+= expr ) -> printCode(a=$x))
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:46:5: ^( PRINT x+= expr )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print453); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_print457);
            x=expr();

            state._fsp--;

            if (list_x==null) list_x=new ArrayList();
            list_x.add(x.getTemplate());


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 46:22: -> printCode(a=$x)
            {
                retval.st = templateLib.getInstanceOf("printCode",
              new STAttrMap().put("a", list_x));
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
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:49:1: ifstatement : ^( IF expr ( block )* ) ;
    public final BackEndTemplate.ifstatement_return ifstatement() throws RecognitionException {
        BackEndTemplate.ifstatement_return retval = new BackEndTemplate.ifstatement_return();
        retval.start = input.LT(1);

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:50:3: ( ^( IF expr ( block )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:50:5: ^( IF expr ( block )* )
            {
            match(input,IF,FOLLOW_IF_in_ifstatement483); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_ifstatement485);
            expr();

            state._fsp--;

            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:50:15: ( block )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LINE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:50:15: block
            	    {
            	    pushFollow(FOLLOW_block_in_ifstatement487);
            	    block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:53:1: loop : ^( LOOP expr ( block )* ) ;
    public final BackEndTemplate.loop_return loop() throws RecognitionException {
        BackEndTemplate.loop_return retval = new BackEndTemplate.loop_return();
        retval.start = input.LT(1);

        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:54:3: ( ^( LOOP expr ( block )* ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:54:5: ^( LOOP expr ( block )* )
            {
            match(input,LOOP,FOLLOW_LOOP_in_loop506); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_loop508);
            expr();

            state._fsp--;

            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:54:17: ( block )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:54:17: block
            	    {
            	    pushFollow(FOLLOW_block_in_loop510);
            	    block();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:57:1: expr : ( ^( '==' x+= expr y+= expr ) -> eql(a=$xb=$y) | ^( '!=' x+= expr y+= expr ) -> neq(a=$xb=$y) | ^( '>' x+= expr y+= expr ) -> sgt(a=$xb=$y) | ^( '<' x+= expr y+= expr ) -> slt(a=$xb=$y) | ^( '+' x+= expr y+= expr ) -> add(a=$xb=$y) | ^( '-' x+= expr y+= expr ) -> sub(a=$xb=$y) | ^( '*' x+= expr y+= expr ) -> mult(a=$xb=$y) | ^( '/' x+= expr y+= expr ) -> div(a=$xb=$y) | INT -> int(v=$INT.text) | ID -> var(id=$ID.text));
    public final BackEndTemplate.expr_return expr() throws RecognitionException {
        BackEndTemplate.expr_return retval = new BackEndTemplate.expr_return();
        retval.start = input.LT(1);

        CommonTree INT1=null;
        CommonTree ID2=null;
        List list_x=null;
        List list_y=null;
        RuleReturnScope x = null;
        RuleReturnScope y = null;
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:58:3: ( ^( '==' x+= expr y+= expr ) -> eql(a=$xb=$y) | ^( '!=' x+= expr y+= expr ) -> neq(a=$xb=$y) | ^( '>' x+= expr y+= expr ) -> sgt(a=$xb=$y) | ^( '<' x+= expr y+= expr ) -> slt(a=$xb=$y) | ^( '+' x+= expr y+= expr ) -> add(a=$xb=$y) | ^( '-' x+= expr y+= expr ) -> sub(a=$xb=$y) | ^( '*' x+= expr y+= expr ) -> mult(a=$xb=$y) | ^( '/' x+= expr y+= expr ) -> div(a=$xb=$y) | INT -> int(v=$INT.text) | ID -> var(id=$ID.text))
            int alt11=10;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            case 27:
                {
                alt11=6;
                }
                break;
            case 28:
                {
                alt11=7;
                }
                break;
            case 29:
                {
                alt11=8;
                }
                break;
            case INT:
                {
                alt11=9;
                }
                break;
            case ID:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:58:5: ^( '==' x+= expr y+= expr )
                    {
                    match(input,24,FOLLOW_24_in_expr529); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr533);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr537);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 58:29: -> eql(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("eql",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 2 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:59:5: ^( '!=' x+= expr y+= expr )
                    {
                    match(input,25,FOLLOW_25_in_expr558); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr562);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr566);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 59:29: -> neq(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("neq",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 3 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:60:5: ^( '>' x+= expr y+= expr )
                    {
                    match(input,22,FOLLOW_22_in_expr587); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr591);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr595);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 60:28: -> sgt(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("sgt",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 4 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:61:5: ^( '<' x+= expr y+= expr )
                    {
                    match(input,23,FOLLOW_23_in_expr616); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr620);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr624);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 61:28: -> slt(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("slt",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 5 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:62:5: ^( '+' x+= expr y+= expr )
                    {
                    match(input,26,FOLLOW_26_in_expr645); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr649);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr653);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 62:28: -> add(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("add",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 6 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:63:5: ^( '-' x+= expr y+= expr )
                    {
                    match(input,27,FOLLOW_27_in_expr674); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr678);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr682);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 63:28: -> sub(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("sub",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 7 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:64:5: ^( '*' x+= expr y+= expr )
                    {
                    match(input,28,FOLLOW_28_in_expr703); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr707);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr711);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 64:28: -> mult(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("mult",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 8 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:65:5: ^( '/' x+= expr y+= expr )
                    {
                    match(input,29,FOLLOW_29_in_expr732); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr736);
                    x=expr();

                    state._fsp--;

                    if (list_x==null) list_x=new ArrayList();
                    list_x.add(x.getTemplate());

                    pushFollow(FOLLOW_expr_in_expr740);
                    y=expr();

                    state._fsp--;

                    if (list_y==null) list_y=new ArrayList();
                    list_y.add(y.getTemplate());


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 65:28: -> div(a=$xb=$y)
                    {
                        retval.st = templateLib.getInstanceOf("div",
                      new STAttrMap().put("a", list_x).put("b", list_y));
                    }


                    }
                    break;
                case 9 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:66:5: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr760); 


                    // TEMPLATE REWRITE
                    // 66:9: -> int(v=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("v", (INT1!=null?INT1.getText():null)));
                    }


                    }
                    break;
                case 10 :
                    // /home/linux-vm/workspace_indigo/git/vcalc/BackEndTemplate.g:67:5: ID
                    {
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr775); 


                    // TEMPLATE REWRITE
                    // 67:8: -> var(id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("var",
                      new STAttrMap().put("id", (ID2!=null?ID2.getText():null)));
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


 

    public static final BitSet FOLLOW_PROGRAM_in_declara61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_declara66 = new BitSet(new long[]{0x0000000000000058L});
    public static final BitSet FOLLOW_nullblock_in_declara73 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_LINE_in_nullblock101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_in_nullblock103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_nullblock111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_print_in_nullblock113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_nullblock121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ifstatement_in_nullblock123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_nullblock131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_loop_in_nullblock133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECL_in_declaration148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_declaration150 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_declaration154 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_declaration156 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROGRAM_in_walk181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_loadVariable_in_walk186 = new BitSet(new long[]{0x0000000000000058L});
    public static final BitSet FOLLOW_block_in_walk193 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_DECL_in_loadVariable225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_loadVariable227 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_loadVariable231 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_loadVariable235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_block263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PRINT_in_block266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_block270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LINE_in_block288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_in_block291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_block295 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_block299 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_LINE_in_block328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOOP_in_block331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_block335 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_block339 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_LINE_in_block368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASSIGN_in_block371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_21_in_block373 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_block377 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_block381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_21_in_assignment415 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_assignment419 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_assignment423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_print453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_print457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifstatement483 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifstatement485 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_ifstatement487 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_LOOP_in_loop506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_loop508 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_block_in_loop510 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_24_in_expr529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr533 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_expr558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr562 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_expr587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr591 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_expr616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr620 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expr645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr649 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr674 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr678 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_28_in_expr703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr707 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_29_in_expr732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr736 = new BitSet(new long[]{0x000000003FC01400L});
    public static final BitSet FOLLOW_expr_in_expr740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr775 = new BitSet(new long[]{0x0000000000000002L});

}