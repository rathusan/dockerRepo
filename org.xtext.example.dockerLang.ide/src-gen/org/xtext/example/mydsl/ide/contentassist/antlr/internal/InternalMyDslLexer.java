package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_SHELL_CMD=7;
    public static final int RULE_WS=10;
    public static final int RULE_CONTINUE_NL=8;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_EXEC_FORM_PARAMETER=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '-' )
            // InternalMyDsl.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( '.' )
            // InternalMyDsl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'FROM ' )
            // InternalMyDsl.g:13:9: 'FROM '
            {
            match("FROM "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'CMD' )
            // InternalMyDsl.g:14:9: 'CMD'
            {
            match("CMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '/' )
            // InternalMyDsl.g:15:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( ':' )
            // InternalMyDsl.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '@' )
            // InternalMyDsl.g:17:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( '--platform=' )
            // InternalMyDsl.g:18:9: '--platform='
            {
            match("--platform="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( ' [' )
            // InternalMyDsl.g:19:9: ' ['
            {
            match(" ["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( ']' )
            // InternalMyDsl.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1343:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1343:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1343:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:1343:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1343:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1345:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1345:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1345:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:1345:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1347:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1347:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1347:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1347:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1347:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:1347:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1347:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1347:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1347:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:1347:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1347:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_CONTINUE_NL"
    public final void mRULE_CONTINUE_NL() throws RecognitionException {
        try {
            int _type = RULE_CONTINUE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1349:18: ( '\\\\\\n' )
            // InternalMyDsl.g:1349:20: '\\\\\\n'
            {
            match("\\\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTINUE_NL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1351:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1351:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1351:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1353:16: ( . )
            // InternalMyDsl.g:1353:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_EXEC_FORM_PARAMETER"
    public final void mRULE_EXEC_FORM_PARAMETER() throws RecognitionException {
        try {
            int _type = RULE_EXEC_FORM_PARAMETER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1355:26: ( ',' RULE_STRING )
            // InternalMyDsl.g:1355:28: ',' RULE_STRING
            {
            match(','); 
            mRULE_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXEC_FORM_PARAMETER"

    // $ANTLR start "RULE_SHELL_CMD"
    public final void mRULE_SHELL_CMD() throws RecognitionException {
        try {
            int _type = RULE_SHELL_CMD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1357:16: ( ( ' ' | '\\t' ) (~ ( ( '\\n' | '\\r' | '\\\\' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1357:18: ( ' ' | '\\t' ) (~ ( ( '\\n' | '\\r' | '\\\\' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1357:29: (~ ( ( '\\n' | '\\r' | '\\\\' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1357:29: ~ ( ( '\\n' | '\\r' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:1357:50: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1357:51: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1357:51: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:1357:51: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHELL_CMD"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_ID | RULE_INT | RULE_STRING | RULE_CONTINUE_NL | RULE_WS | RULE_ANY_OTHER | RULE_EXEC_FORM_PARAMETER | RULE_SHELL_CMD )
        int alt11=18;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalMyDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:78: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:87: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:99: RULE_CONTINUE_NL
                {
                mRULE_CONTINUE_NL(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:116: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:124: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:139: RULE_EXEC_FORM_PARAMETER
                {
                mRULE_EXEC_FORM_PARAMETER(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:164: RULE_SHELL_CMD
                {
                mRULE_SHELL_CMD(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\25\1\uffff\2\30\3\uffff\1\36\1\uffff\1\22\2\uffff\3\22\1\36\1\22\5\uffff\1\30\1\uffff\1\30\3\uffff\1\52\1\uffff\2\36\7\uffff\1\30\1\54\1\uffff\1\30\2\uffff";
    static final String DFA11_eofS =
        "\56\uffff";
    static final String DFA11_minS =
        "\1\0\1\55\1\uffff\1\122\1\115\3\uffff\1\0\1\uffff\1\101\2\uffff\2\0\1\12\1\0\1\42\5\uffff\1\117\1\uffff\1\104\3\uffff\1\0\1\uffff\1\0\1\12\7\uffff\1\115\1\60\1\uffff\1\40\2\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\55\1\uffff\1\122\1\115\3\uffff\1\uffff\1\uffff\1\172\2\uffff\2\uffff\1\12\1\uffff\1\47\5\uffff\1\117\1\uffff\1\104\3\uffff\1\uffff\1\uffff\1\uffff\1\12\7\uffff\1\115\1\172\1\uffff\1\40\2\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\13\1\14\5\uffff\1\20\1\17\1\10\1\1\1\2\1\uffff\1\13\1\uffff\1\5\1\6\1\7\1\uffff\1\17\2\uffff\1\22\1\17\1\12\1\14\1\15\1\16\1\21\2\uffff\1\11\1\uffff\1\4\1\3";
    static final String DFA11_specialS =
        "\1\1\7\uffff\1\0\4\uffff\1\4\1\2\1\uffff\1\3\14\uffff\1\6\1\uffff\1\5\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\22\1\20\1\23\2\22\1\23\22\22\1\10\1\22\1\15\4\22\1\16\4\22\1\21\1\1\1\2\1\5\12\14\1\6\5\22\1\7\2\13\1\4\2\13\1\3\24\13\1\22\1\17\1\11\1\12\1\13\1\22\32\13\uff85\22",
            "\1\24",
            "",
            "\1\27",
            "\1\31",
            "",
            "",
            "",
            "\11\41\1\37\1\42\2\41\1\40\22\41\1\37\72\41\1\35\1\uffff\uffa3\41",
            "",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\0\45",
            "\0\45",
            "\1\46",
            "\11\41\1\37\1\42\2\41\1\40\22\41\1\37\73\41\1\uffff\uffa3\41",
            "\1\47\4\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "",
            "\1\51",
            "",
            "",
            "",
            "\134\41\1\uffff\uffa3\41",
            "",
            "\11\41\1\37\1\42\2\41\1\40\22\41\1\37\73\41\1\uffff\uffa3\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\55",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_ID | RULE_INT | RULE_STRING | RULE_CONTINUE_NL | RULE_WS | RULE_ANY_OTHER | RULE_EXEC_FORM_PARAMETER | RULE_SHELL_CMD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_8 = input.LA(1);

                        s = -1;
                        if ( (LA11_8=='[') ) {s = 29;}

                        else if ( (LA11_8=='\t'||LA11_8==' ') ) {s = 31;}

                        else if ( (LA11_8=='\r') ) {s = 32;}

                        else if ( ((LA11_8>='\u0000' && LA11_8<='\b')||(LA11_8>='\u000B' && LA11_8<='\f')||(LA11_8>='\u000E' && LA11_8<='\u001F')||(LA11_8>='!' && LA11_8<='Z')||(LA11_8>=']' && LA11_8<='\uFFFF')) ) {s = 33;}

                        else if ( (LA11_8=='\n') ) {s = 34;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='-') ) {s = 1;}

                        else if ( (LA11_0=='.') ) {s = 2;}

                        else if ( (LA11_0=='F') ) {s = 3;}

                        else if ( (LA11_0=='C') ) {s = 4;}

                        else if ( (LA11_0=='/') ) {s = 5;}

                        else if ( (LA11_0==':') ) {s = 6;}

                        else if ( (LA11_0=='@') ) {s = 7;}

                        else if ( (LA11_0==' ') ) {s = 8;}

                        else if ( (LA11_0==']') ) {s = 9;}

                        else if ( (LA11_0=='^') ) {s = 10;}

                        else if ( ((LA11_0>='A' && LA11_0<='B')||(LA11_0>='D' && LA11_0<='E')||(LA11_0>='G' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {s = 11;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 12;}

                        else if ( (LA11_0=='\"') ) {s = 13;}

                        else if ( (LA11_0=='\'') ) {s = 14;}

                        else if ( (LA11_0=='\\') ) {s = 15;}

                        else if ( (LA11_0=='\t') ) {s = 16;}

                        else if ( (LA11_0==',') ) {s = 17;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='+')||(LA11_0>=';' && LA11_0<='?')||LA11_0=='['||LA11_0=='`'||(LA11_0>='{' && LA11_0<='\uFFFF')) ) {s = 18;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_14 = input.LA(1);

                        s = -1;
                        if ( ((LA11_14>='\u0000' && LA11_14<='\uFFFF')) ) {s = 37;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_16 = input.LA(1);

                        s = -1;
                        if ( (LA11_16=='\t'||LA11_16==' ') ) {s = 31;}

                        else if ( (LA11_16=='\r') ) {s = 32;}

                        else if ( ((LA11_16>='\u0000' && LA11_16<='\b')||(LA11_16>='\u000B' && LA11_16<='\f')||(LA11_16>='\u000E' && LA11_16<='\u001F')||(LA11_16>='!' && LA11_16<='[')||(LA11_16>=']' && LA11_16<='\uFFFF')) ) {s = 33;}

                        else if ( (LA11_16=='\n') ) {s = 34;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_13 = input.LA(1);

                        s = -1;
                        if ( ((LA11_13>='\u0000' && LA11_13<='\uFFFF')) ) {s = 37;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_31 = input.LA(1);

                        s = -1;
                        if ( (LA11_31=='\r') ) {s = 32;}

                        else if ( (LA11_31=='\n') ) {s = 34;}

                        else if ( (LA11_31=='\t'||LA11_31==' ') ) {s = 31;}

                        else if ( ((LA11_31>='\u0000' && LA11_31<='\b')||(LA11_31>='\u000B' && LA11_31<='\f')||(LA11_31>='\u000E' && LA11_31<='\u001F')||(LA11_31>='!' && LA11_31<='[')||(LA11_31>=']' && LA11_31<='\uFFFF')) ) {s = 33;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_29 = input.LA(1);

                        s = -1;
                        if ( ((LA11_29>='\u0000' && LA11_29<='[')||(LA11_29>=']' && LA11_29<='\uFFFF')) ) {s = 33;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}