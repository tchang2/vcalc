// $ANTLR 3.3 Nov 30, 2010 12:50:56 /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g 2014-10-06 17:56:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class VcalcLPLexer extends Lexer {
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

    public VcalcLPLexer() {;} 
    public VcalcLPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public VcalcLPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:7:7: ( 'fi' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:7:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:8:7: ( 'if' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:8:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:9:7: ( 'loop' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:9:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:10:7: ( 'pool' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:10:9: 'pool'
            {
            match("pool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:11:7: ( 'print' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:11:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:12:7: ( 'filter' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:12:9: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:13:7: ( '==' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:13:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:14:7: ( '!=' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:14:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:15:7: ( '<' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:15:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:16:7: ( '>' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:16:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:17:7: ( '+' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:17:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:18:7: ( '-' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:18:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:19:7: ( '*' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:19:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:20:7: ( '/' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:20:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:21:7: ( '[' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:22:7: ( ']' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:23:7: ( '..' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:23:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:24:7: ( '|' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:24:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:126:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:126:19: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:127:16: ( '0' .. '9' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:127:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:128:9: ( ( DIGIT )+ )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:128:11: ( DIGIT )+
            {
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:128:11: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:128:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:129:7: ( '=' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:129:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:130:4: ( 'in' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:130:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:131:7: ( LETTER ( LETTER | DIGIT )* )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:131:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:131:16: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "SC"
    public final void mSC() throws RecognitionException {
        try {
            int _type = SC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:132:4: ( ';' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:132:6: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SC"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:133:4: ( '(' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:133:6: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:134:4: ( ')' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:134:6: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RP"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:135:4: ( '{' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:135:6: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LB"

    // $ANTLR start "RB"
    public final void mRB() throws RecognitionException {
        try {
            int _type = RB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:136:4: ( '}' )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:136:6: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RB"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:137:4: ( ( ' ' | '\\n' | '\\r' | '\\t' ) )
            // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:137:6: ( ' ' | '\\n' | '\\r' | '\\t' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | INTEGER | EQUAL | IN | IDENT | SC | LP | RP | LB | RB | WS )
        int alt3=28;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:118: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 20 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:126: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 21 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:132: IN
                {
                mIN(); 

                }
                break;
            case 22 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:135: IDENT
                {
                mIDENT(); 

                }
                break;
            case 23 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:141: SC
                {
                mSC(); 

                }
                break;
            case 24 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:144: LP
                {
                mLP(); 

                }
                break;
            case 25 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:147: RP
                {
                mRP(); 

                }
                break;
            case 26 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:150: LB
                {
                mLB(); 

                }
                break;
            case 27 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:153: RB
                {
                mRB(); 

                }
                break;
            case 28 :
                // /home/linux-vm/workspace_indigo/git/vcalc/VcalcLP.g:1:156: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\4\22\1\40\23\uffff\1\42\1\43\1\44\3\22\2\uffff\1\22\3\uffff"+
        "\4\22\1\55\1\56\2\22\2\uffff\1\61\1\62\2\uffff";
    static final String DFA3_eofS =
        "\63\uffff";
    static final String DFA3_minS =
        "\1\11\1\151\1\146\2\157\1\75\23\uffff\3\60\2\157\1\151\2\uffff\1"+
        "\164\3\uffff\1\160\1\154\1\156\1\145\2\60\1\164\1\162\2\uffff\2"+
        "\60\2\uffff";
    static final String DFA3_maxS =
        "\1\175\1\151\1\156\1\157\1\162\1\75\23\uffff\3\172\2\157\1\151\2"+
        "\uffff\1\164\3\uffff\1\160\1\154\1\156\1\145\2\172\1\164\1\162\2"+
        "\uffff\2\172\2\uffff";
    static final String DFA3_acceptS =
        "\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
        "\1\23\1\26\1\27\1\30\1\31\1\32\1\33\1\34\6\uffff\1\7\1\24\1\uffff"+
        "\1\1\1\2\1\25\10\uffff\1\3\1\4\2\uffff\1\5\1\6";
    static final String DFA3_specialS =
        "\63\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\6\6\uffff\1\24\1\25\1\13"+
            "\1\11\1\uffff\1\12\1\17\1\14\12\21\1\uffff\1\23\1\7\1\5\1\10"+
            "\2\uffff\32\22\1\15\1\uffff\1\16\3\uffff\5\22\1\1\2\22\1\2\2"+
            "\22\1\3\3\22\1\4\12\22\1\26\1\20\1\27",
            "\1\31",
            "\1\32\7\uffff\1\33",
            "\1\34",
            "\1\35\2\uffff\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\22\7\uffff\32\22\6\uffff\13\22\1\41\16\22",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\57",
            "\1\60",
            "",
            "",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | INTEGER | EQUAL | IN | IDENT | SC | LP | RP | LB | RB | WS );";
        }
    }
 

}