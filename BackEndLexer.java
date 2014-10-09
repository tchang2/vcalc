// $ANTLR 3.3 Nov 30, 2010 12:50:56 /cshome/bilec/git/vcalc/BackEnd.g 2014-10-08 18:28:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BackEndLexer extends Lexer {
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

    public BackEndLexer() {;} 
    public BackEndLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BackEndLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/cshome/bilec/git/vcalc/BackEnd.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:7:7: ( '=' )
            // /cshome/bilec/git/vcalc/BackEnd.g:7:9: '='
            {
            match('='); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:8:7: ( '>' )
            // /cshome/bilec/git/vcalc/BackEnd.g:8:9: '>'
            {
            match('>'); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:9:7: ( '<' )
            // /cshome/bilec/git/vcalc/BackEnd.g:9:9: '<'
            {
            match('<'); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:10:7: ( '==' )
            // /cshome/bilec/git/vcalc/BackEnd.g:10:9: '=='
            {
            match("=="); 


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
            // /cshome/bilec/git/vcalc/BackEnd.g:11:7: ( '!=' )
            // /cshome/bilec/git/vcalc/BackEnd.g:11:9: '!='
            {
            match("!="); 


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
            // /cshome/bilec/git/vcalc/BackEnd.g:12:7: ( '+' )
            // /cshome/bilec/git/vcalc/BackEnd.g:12:9: '+'
            {
            match('+'); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:13:7: ( '-' )
            // /cshome/bilec/git/vcalc/BackEnd.g:13:9: '-'
            {
            match('-'); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:14:7: ( '*' )
            // /cshome/bilec/git/vcalc/BackEnd.g:14:9: '*'
            {
            match('*'); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:15:7: ( '/' )
            // /cshome/bilec/git/vcalc/BackEnd.g:15:9: '/'
            {
            match('/'); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:16:7: ( '(' )
            // /cshome/bilec/git/vcalc/BackEnd.g:16:9: '('
            {
            match('('); 

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
            // /cshome/bilec/git/vcalc/BackEnd.g:17:7: ( ')' )
            // /cshome/bilec/git/vcalc/BackEnd.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:64:5: ( 'loop' )
            // /cshome/bilec/git/vcalc/BackEnd.g:64:7: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "POOL"
    public final void mPOOL() throws RecognitionException {
        try {
            int _type = POOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:65:5: ( 'pool' )
            // /cshome/bilec/git/vcalc/BackEnd.g:65:7: 'pool'
            {
            match("pool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POOL"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:66:3: ( 'if' )
            // /cshome/bilec/git/vcalc/BackEnd.g:66:5: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "FI"
    public final void mFI() throws RecognitionException {
        try {
            int _type = FI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:67:3: ( 'fi' )
            // /cshome/bilec/git/vcalc/BackEnd.g:67:5: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FI"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:68:6: ( 'print' )
            // /cshome/bilec/git/vcalc/BackEnd.g:68:8: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:69:8: ( 'int' )
            // /cshome/bilec/git/vcalc/BackEnd.g:69:10: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:70:3: ( ( ' ' | '\\t' )+ )
            // /cshome/bilec/git/vcalc/BackEnd.g:70:5: ( ' ' | '\\t' )+
            {
            // /cshome/bilec/git/vcalc/BackEnd.g:70:5: ( ' ' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:71:10: ( ';' )
            // /cshome/bilec/git/vcalc/BackEnd.g:71:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:72:4: ( ( NUMBER )+ )
            // /cshome/bilec/git/vcalc/BackEnd.g:72:7: ( NUMBER )+
            {
            // /cshome/bilec/git/vcalc/BackEnd.g:72:7: ( NUMBER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:72:7: NUMBER
            	    {
            	    mNUMBER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:73:3: ( LETTER ( LETTER | NUMBER )* )
            // /cshome/bilec/git/vcalc/BackEnd.g:73:5: LETTER ( LETTER | NUMBER )*
            {
            mLETTER(); 
            // /cshome/bilec/git/vcalc/BackEnd.g:73:12: ( LETTER | NUMBER )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:73:13: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // /cshome/bilec/git/vcalc/BackEnd.g:73:22: NUMBER
            	    {
            	    mNUMBER(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /cshome/bilec/git/vcalc/BackEnd.g:74:8: ( ( '\\r' )? '\\n' )
            // /cshome/bilec/git/vcalc/BackEnd.g:74:10: ( '\\r' )? '\\n'
            {
            // /cshome/bilec/git/vcalc/BackEnd.g:74:10: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /cshome/bilec/git/vcalc/BackEnd.g:74:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:75:16: ( ( '0' .. '9' ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:75:18: ( '0' .. '9' )
            {
            // /cshome/bilec/git/vcalc/BackEnd.g:75:18: ( '0' .. '9' )
            // /cshome/bilec/git/vcalc/BackEnd.g:75:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /cshome/bilec/git/vcalc/BackEnd.g:76:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /cshome/bilec/git/vcalc/BackEnd.g:76:19: ( 'a' .. 'z' | 'A' .. 'Z' )
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

    public void mTokens() throws RecognitionException {
        // /cshome/bilec/git/vcalc/BackEnd.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | LOOP | POOL | IF | FI | PRINT | INTEGER | WS | SEMICOLON | INT | ID | NEWLINE )
        int alt5=22;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:76: LOOP
                {
                mLOOP(); 

                }
                break;
            case 13 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:81: POOL
                {
                mPOOL(); 

                }
                break;
            case 14 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:86: IF
                {
                mIF(); 

                }
                break;
            case 15 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:89: FI
                {
                mFI(); 

                }
                break;
            case 16 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:92: PRINT
                {
                mPRINT(); 

                }
                break;
            case 17 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:98: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 18 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:106: WS
                {
                mWS(); 

                }
                break;
            case 19 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:109: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 20 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:119: INT
                {
                mINT(); 

                }
                break;
            case 21 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:123: ID
                {
                mID(); 

                }
                break;
            case 22 :
                // /cshome/bilec/git/vcalc/BackEnd.g:1:126: NEWLINE
                {
                mNEWLINE(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\25\11\uffff\4\22\7\uffff\3\22\1\37\1\22\1\41\3\22\1\uffff"+
        "\1\45\1\uffff\1\46\1\47\1\22\3\uffff\1\51\1\uffff";
    static final String DFA5_eofS =
        "\52\uffff";
    static final String DFA5_minS =
        "\1\11\1\75\11\uffff\2\157\1\146\1\151\7\uffff\2\157\1\151\1\60\1"+
        "\164\1\60\1\160\1\154\1\156\1\uffff\1\60\1\uffff\2\60\1\164\3\uffff"+
        "\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\172\1\75\11\uffff\1\157\1\162\1\156\1\151\7\uffff\2\157\1\151"+
        "\1\172\1\164\1\172\1\160\1\154\1\156\1\uffff\1\172\1\uffff\2\172"+
        "\1\164\3\uffff\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\uffff\1\22\1"+
        "\23\1\24\1\25\1\26\1\4\1\1\11\uffff\1\16\1\uffff\1\17\3\uffff\1"+
        "\21\1\14\1\15\1\uffff\1\20";
    static final String DFA5_specialS =
        "\52\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\17\1\23\2\uffff\1\23\22\uffff\1\17\1\4\6\uffff\1\11\1\12"+
            "\1\7\1\5\1\uffff\1\6\1\uffff\1\10\12\21\1\uffff\1\20\1\3\1\1"+
            "\1\2\2\uffff\32\22\6\uffff\5\22\1\16\2\22\1\15\2\22\1\13\3\22"+
            "\1\14\12\22",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\27\2\uffff\1\30",
            "\1\31\7\uffff\1\32",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\40",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            "\1\50",
            "",
            "",
            "",
            "\12\22\7\uffff\32\22\6\uffff\32\22",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | LOOP | POOL | IF | FI | PRINT | INTEGER | WS | SEMICOLON | INT | ID | NEWLINE );";
        }
    }
 

}