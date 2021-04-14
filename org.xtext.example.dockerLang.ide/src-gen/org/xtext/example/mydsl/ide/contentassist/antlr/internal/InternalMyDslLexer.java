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
    public static final int RULE_STRING=7;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_SHELL_CMD=9;
    public static final int RULE_COMMENT=4;
    public static final int RULE_CONTINUE_NL=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_CHOWN_OPTION=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_KV_PAIR_EQUALS=11;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=8;
    public static final int RULE_EXEC_FORM_PARAMETER=13;
    public static final int T__20=20;
    public static final int RULE_PLATFORM_OPTION=10;
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

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '?' )
            // InternalMyDsl.g:11:9: '?'
            {
            match('?'); 

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
            // InternalMyDsl.g:12:7: ( '*' )
            // InternalMyDsl.g:12:9: '*'
            {
            match('*'); 

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
            // InternalMyDsl.g:13:7: ( '-' )
            // InternalMyDsl.g:13:9: '-'
            {
            match('-'); 

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
            // InternalMyDsl.g:14:7: ( '.' )
            // InternalMyDsl.g:14:9: '.'
            {
            match('.'); 

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
            // InternalMyDsl.g:15:7: ( 'ONBUILD ' )
            // InternalMyDsl.g:15:9: 'ONBUILD '
            {
            match("ONBUILD "); 


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
            // InternalMyDsl.g:16:7: ( 'FROM ' )
            // InternalMyDsl.g:16:9: 'FROM '
            {
            match("FROM "); 


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
            // InternalMyDsl.g:17:7: ( 'CMD' )
            // InternalMyDsl.g:17:9: 'CMD'
            {
            match("CMD"); 


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
            // InternalMyDsl.g:18:7: ( 'RUN' )
            // InternalMyDsl.g:18:9: 'RUN'
            {
            match("RUN"); 


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
            // InternalMyDsl.g:19:7: ( 'ENTRYPOINT' )
            // InternalMyDsl.g:19:9: 'ENTRYPOINT'
            {
            match("ENTRYPOINT"); 


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
            // InternalMyDsl.g:20:7: ( 'VOLUME' )
            // InternalMyDsl.g:20:9: 'VOLUME'
            {
            match("VOLUME"); 


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
            // InternalMyDsl.g:21:7: ( 'MAINTAINER' )
            // InternalMyDsl.g:21:9: 'MAINTAINER'
            {
            match("MAINTAINER"); 


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
            // InternalMyDsl.g:22:7: ( 'EXPOSE' )
            // InternalMyDsl.g:22:9: 'EXPOSE'
            {
            match("EXPOSE"); 


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
            // InternalMyDsl.g:23:7: ( 'WORKDIR' )
            // InternalMyDsl.g:23:9: 'WORKDIR'
            {
            match("WORKDIR"); 


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
            // InternalMyDsl.g:24:7: ( 'ENV ' )
            // InternalMyDsl.g:24:9: 'ENV '
            {
            match("ENV "); 


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
            // InternalMyDsl.g:25:7: ( 'LABEL ' )
            // InternalMyDsl.g:25:9: 'LABEL '
            {
            match("LABEL "); 


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
            // InternalMyDsl.g:26:7: ( 'ADD ' )
            // InternalMyDsl.g:26:9: 'ADD '
            {
            match("ADD "); 


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
            // InternalMyDsl.g:27:7: ( 'COPY ' )
            // InternalMyDsl.g:27:9: 'COPY '
            {
            match("COPY "); 


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
            // InternalMyDsl.g:28:7: ( '/' )
            // InternalMyDsl.g:28:9: '/'
            {
            match('/'); 

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
            // InternalMyDsl.g:29:7: ( ':' )
            // InternalMyDsl.g:29:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:30:7: ( '@' )
            // InternalMyDsl.g:30:9: '@'
            {
            match('@'); 

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
            // InternalMyDsl.g:31:7: ( ' [' )
            // InternalMyDsl.g:31:9: ' ['
            {
            match(" ["); 


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
            // InternalMyDsl.g:32:7: ( ']' )
            // InternalMyDsl.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_PLATFORM_OPTION"
    public final void mRULE_PLATFORM_OPTION() throws RecognitionException {
        try {
            int _type = RULE_PLATFORM_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2859:22: ( '--platform=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' ' )
            // InternalMyDsl.g:2859:24: '--platform=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' '
            {
            match("--platform="); 

            // InternalMyDsl.g:2859:38: ( RULE_ID | RULE_INT )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
                alt1=1;
            }
            else if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:2859:39: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2859:47: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match(':'); 
            // InternalMyDsl.g:2859:61: ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"'||LA4_0=='\''||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:2859:62: ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
                    {
                    // InternalMyDsl.g:2859:62: ( RULE_ID | RULE_INT | RULE_STRING )
                    int alt2=3;
                    switch ( input.LA(1) ) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '^':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt2=1;
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        {
                        alt2=2;
                        }
                        break;
                    case '\"':
                    case '\'':
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // InternalMyDsl.g:2859:63: RULE_ID
                            {
                            mRULE_ID(); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:2859:71: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:2859:80: RULE_STRING
                            {
                            mRULE_STRING(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:2859:93: ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
                    loop3:
                    do {
                        int alt3=6;
                        switch ( input.LA(1) ) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '^':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt3=1;
                            }
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt3=2;
                            }
                            break;
                        case '\"':
                        case '\'':
                            {
                            alt3=3;
                            }
                            break;
                        case '-':
                            {
                            alt3=4;
                            }
                            break;
                        case '.':
                            {
                            alt3=5;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:2859:94: RULE_ID
                    	    {
                    	    mRULE_ID(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2859:102: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMyDsl.g:2859:111: RULE_STRING
                    	    {
                    	    mRULE_STRING(); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalMyDsl.g:2859:123: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalMyDsl.g:2859:127: '.'
                    	    {
                    	    match('.'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLATFORM_OPTION"

    // $ANTLR start "RULE_CHOWN_OPTION"
    public final void mRULE_CHOWN_OPTION() throws RecognitionException {
        try {
            int _type = RULE_CHOWN_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2861:19: ( '--chown=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' ' )
            // InternalMyDsl.g:2861:21: '--chown=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' '
            {
            match("--chown="); 

            // InternalMyDsl.g:2861:32: ( RULE_ID | RULE_INT )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='^' && LA5_0<='_')||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:2861:33: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2861:41: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match(':'); 
            // InternalMyDsl.g:2861:55: ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"'||LA8_0=='\''||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='^' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='z')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:2861:56: ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
                    {
                    // InternalMyDsl.g:2861:56: ( RULE_ID | RULE_INT | RULE_STRING )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '^':
                    case '_':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt6=1;
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        {
                        alt6=2;
                        }
                        break;
                    case '\"':
                    case '\'':
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
                            // InternalMyDsl.g:2861:57: RULE_ID
                            {
                            mRULE_ID(); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:2861:65: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:2861:74: RULE_STRING
                            {
                            mRULE_STRING(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:2861:87: ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
                    loop7:
                    do {
                        int alt7=6;
                        switch ( input.LA(1) ) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '^':
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt7=1;
                            }
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt7=2;
                            }
                            break;
                        case '\"':
                        case '\'':
                            {
                            alt7=3;
                            }
                            break;
                        case '-':
                            {
                            alt7=4;
                            }
                            break;
                        case '.':
                            {
                            alt7=5;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:2861:88: RULE_ID
                    	    {
                    	    mRULE_ID(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2861:96: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMyDsl.g:2861:105: RULE_STRING
                    	    {
                    	    mRULE_STRING(); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalMyDsl.g:2861:117: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalMyDsl.g:2861:121: '.'
                    	    {
                    	    match('.'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHOWN_OPTION"

    // $ANTLR start "RULE_KV_PAIR_EQUALS"
    public final void mRULE_KV_PAIR_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_KV_PAIR_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2863:21: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT ) ( ' ' )? )
            // InternalMyDsl.g:2863:23: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT ) ( ' ' )?
            {
            // InternalMyDsl.g:2863:23: ( RULE_ID | RULE_STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='^' && LA9_0<='_')||(LA9_0>='a' && LA9_0<='z')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='\"'||LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:2863:24: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2863:32: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalMyDsl.g:2863:49: ( RULE_ID | RULE_STRING | RULE_INT )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '^':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt10=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt10=2;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
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
                    // InternalMyDsl.g:2863:50: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2863:58: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2863:70: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalMyDsl.g:2863:80: ( ' ' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==' ') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2863:80: ' '
                    {
                    match(' '); 

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
    // $ANTLR end "RULE_KV_PAIR_EQUALS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2865:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:2865:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2865:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:2865:11: '^'
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

            // InternalMyDsl.g:2865:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
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
            	    break loop13;
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
            // InternalMyDsl.g:2867:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:2867:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2867:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2867:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalMyDsl.g:2869:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:2869:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:2869:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2869:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:2869:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:2869:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2869:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2869:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:2869:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:2869:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2869:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // InternalMyDsl.g:2871:18: ( '\\\\\\n' )
            // InternalMyDsl.g:2871:20: '\\\\\\n'
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

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2873:9: ( ( '\\n' )+ )
            // InternalMyDsl.g:2873:11: ( '\\n' )+
            {
            // InternalMyDsl.g:2873:11: ( '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\n') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2873:11: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2875:16: ( . )
            // InternalMyDsl.g:2875:18: .
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
            // InternalMyDsl.g:2877:26: ( ',' RULE_STRING )
            // InternalMyDsl.g:2877:28: ',' RULE_STRING
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
            // InternalMyDsl.g:2879:16: ( ( ' ' | '\\t' ) (~ ( ( '\\n' | '\\r' | '\\\\' ) ) | '\\\\\\n' )* )
            // InternalMyDsl.g:2879:18: ( ' ' | '\\t' ) (~ ( ( '\\n' | '\\r' | '\\\\' ) ) | '\\\\\\n' )*
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2879:29: (~ ( ( '\\n' | '\\r' | '\\\\' ) ) | '\\\\\\n' )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }
                else if ( (LA19_0=='\\') ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2879:30: ~ ( ( '\\n' | '\\r' | '\\\\' ) )
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
            	case 2 :
            	    // InternalMyDsl.g:2879:50: '\\\\\\n'
            	    {
            	    match("\\\n"); 


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHELL_CMD"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2881:14: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalMyDsl.g:2881:16: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalMyDsl.g:2881:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2881:20: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_PLATFORM_OPTION | RULE_CHOWN_OPTION | RULE_KV_PAIR_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_CONTINUE_NL | RULE_NL | RULE_ANY_OTHER | RULE_EXEC_FORM_PARAMETER | RULE_SHELL_CMD | RULE_COMMENT )
        int alt21=34;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalMyDsl.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: RULE_PLATFORM_OPTION
                {
                mRULE_PLATFORM_OPTION(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:163: RULE_CHOWN_OPTION
                {
                mRULE_CHOWN_OPTION(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:181: RULE_KV_PAIR_EQUALS
                {
                mRULE_KV_PAIR_EQUALS(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:201: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:209: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:218: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:230: RULE_CONTINUE_NL
                {
                mRULE_CONTINUE_NL(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:247: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:255: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:270: RULE_EXEC_FORM_PARAMETER
                {
                mRULE_EXEC_FORM_PARAMETER(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:295: RULE_SHELL_CMD
                {
                mRULE_SHELL_CMD(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:310: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\3\uffff\1\42\1\uffff\12\46\3\uffff\1\36\1\uffff\1\36\1\46\2\36\1\uffff\1\36\1\uffff\3\36\6\uffff\2\46\2\uffff\13\46\3\uffff\1\124\2\uffff\1\46\2\uffff\1\126\2\uffff\1\126\7\uffff\2\46\1\132\1\46\1\134\10\46\4\uffff\2\46\1\uffff\1\46\1\uffff\1\46\1\uffff\5\46\1\uffff\1\46\2\uffff\10\46\1\167\1\170\2\46\1\uffff\2\46\2\uffff\1\46\1\176\1\uffff\2\46\1\uffff\2\46\1\u0083\1\u0084\2\uffff";
    static final String DFA21_eofS =
        "\u0085\uffff";
    static final String DFA21_minS =
        "\1\0\2\uffff\1\55\1\uffff\12\60\3\uffff\1\0\1\uffff\1\101\1\60\2\0\1\uffff\1\12\1\uffff\1\42\2\0\3\uffff\1\143\2\uffff\2\60\2\uffff\13\60\3\uffff\1\0\2\uffff\1\60\2\0\1\75\2\0\1\75\7\uffff\6\60\1\40\5\60\1\40\1\uffff\1\0\1\uffff\1\0\1\60\1\40\1\uffff\1\40\1\uffff\1\60\1\uffff\5\60\1\uffff\1\60\2\uffff\5\60\1\40\6\60\1\uffff\1\40\1\60\2\uffff\2\60\1\uffff\2\60\1\uffff\4\60\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\2\uffff\1\55\1\uffff\12\172\3\uffff\1\uffff\1\uffff\2\172\2\uffff\1\uffff\1\12\1\uffff\1\47\2\uffff\3\uffff\1\160\2\uffff\2\172\2\uffff\13\172\3\uffff\1\uffff\2\uffff\1\172\2\uffff\1\75\2\uffff\1\75\7\uffff\15\172\1\uffff\1\uffff\1\uffff\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\5\172\1\uffff\1\172\2\uffff\14\172\1\uffff\2\172\2\uffff\2\172\1\uffff\2\172\1\uffff\4\172\2\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\12\uffff\1\22\1\23\1\24\1\uffff\1\26\4\uffff\1\33\1\uffff\1\36\3\uffff\1\37\1\1\1\2\1\uffff\1\3\1\4\2\uffff\1\32\1\31\13\uffff\1\22\1\23\1\24\1\uffff\1\41\1\26\7\uffff\1\33\1\35\1\36\1\40\1\42\1\27\1\30\15\uffff\1\25\1\uffff\1\34\3\uffff\1\7\1\uffff\1\10\1\uffff\1\16\5\uffff\1\20\1\uffff\1\6\1\21\14\uffff\1\17\2\uffff\1\14\1\12\2\uffff\1\5\2\uffff\1\15\4\uffff\1\11\1\13";
    static final String DFA21_specialS =
        "\1\13\21\uffff\1\1\3\uffff\1\5\1\10\4\uffff\1\3\1\14\30\uffff\1\4\3\uffff\1\0\1\7\1\uffff\1\2\1\12\26\uffff\1\6\1\uffff\1\11\55\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\36\1\34\1\32\25\36\1\22\1\36\1\26\1\35\3\36\1\27\2\36\1\2\1\36\1\33\1\3\1\4\1\17\12\30\1\20\4\36\1\1\1\21\1\16\1\25\1\7\1\25\1\11\1\6\5\25\1\15\1\13\1\25\1\5\2\25\1\10\3\25\1\12\1\14\3\25\1\36\1\31\1\23\1\24\1\25\1\36\32\25\uff85\36",
            "",
            "",
            "\1\41",
            "",
            "\12\45\3\uffff\1\47\3\uffff\15\45\1\44\14\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\21\45\1\50\10\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\14\45\1\51\1\45\1\52\13\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\24\45\1\53\5\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\15\45\1\54\11\45\1\55\2\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\16\45\1\56\13\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\1\57\31\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\16\45\1\60\13\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\1\61\31\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\3\45\1\62\26\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\12\67\1\uffff\2\67\1\uffff\115\67\1\66\uffa4\67",
            "",
            "\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\42\73\1\74\71\73\1\72\uffa3\73",
            "\47\76\1\77\64\76\1\75\uffa3\76",
            "",
            "\1\101",
            "",
            "\1\103\4\uffff\1\103",
            "\12\67\1\uffff\2\67\1\uffff\ufff2\67",
            "\12\104\1\uffff\2\104\1\uffff\ufff2\104",
            "",
            "",
            "",
            "\1\106\14\uffff\1\105",
            "",
            "",
            "\12\45\3\uffff\1\47\3\uffff\1\45\1\107\30\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\45\3\uffff\1\47\3\uffff\16\45\1\110\13\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\3\45\1\111\26\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\17\45\1\112\12\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\15\45\1\113\14\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\23\45\1\114\1\45\1\115\4\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\17\45\1\116\12\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\13\45\1\117\16\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\10\45\1\120\21\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\21\45\1\121\10\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\1\45\1\122\30\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\3\45\1\123\26\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\12\67\1\uffff\2\67\1\uffff\ufff2\67",
            "",
            "",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\0\125",
            "\42\73\1\74\71\73\1\72\uffa3\73",
            "\1\47",
            "\0\127",
            "\47\76\1\77\64\76\1\75\uffa3\76",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\45\3\uffff\1\47\3\uffff\24\45\1\130\5\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\14\45\1\131\15\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\30\45\1\133\1\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\21\45\1\135\10\45\4\uffff\1\45\1\uffff\32\45",
            "\1\136\17\uffff\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\16\45\1\137\13\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\24\45\1\140\5\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\15\45\1\141\14\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\12\45\1\142\17\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\4\45\1\143\25\45\4\uffff\1\45\1\uffff\32\45",
            "\1\144\17\uffff\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\42\73\1\74\71\73\1\72\uffa3\73",
            "",
            "\47\76\1\77\64\76\1\75\uffa3\76",
            "\12\45\3\uffff\1\47\3\uffff\10\45\1\145\21\45\4\uffff\1\45\1\uffff\32\45",
            "\1\146\17\uffff\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\147\17\uffff\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\3\uffff\1\47\3\uffff\30\45\1\150\1\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\3\uffff\1\47\3\uffff\22\45\1\151\7\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\14\45\1\152\15\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\23\45\1\153\6\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\3\45\1\154\26\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\13\45\1\155\16\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\3\uffff\1\47\3\uffff\13\45\1\156\16\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\45\3\uffff\1\47\3\uffff\17\45\1\157\12\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\4\45\1\160\25\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\4\45\1\161\25\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\1\162\31\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\10\45\1\163\21\45\4\uffff\1\45\1\uffff\32\45",
            "\1\164\17\uffff\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\3\45\1\165\26\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\16\45\1\166\13\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\10\45\1\171\21\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\21\45\1\172\10\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\173\17\uffff\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\10\45\1\174\21\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\45\3\uffff\1\47\3\uffff\15\45\1\175\14\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\3\uffff\1\47\3\uffff\15\45\1\177\14\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\4\45\1\u0080\25\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\3\uffff\1\47\3\uffff\23\45\1\u0081\6\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\21\45\1\u0082\10\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\3\uffff\1\47\3\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_PLATFORM_OPTION | RULE_CHOWN_OPTION | RULE_KV_PAIR_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_CONTINUE_NL | RULE_NL | RULE_ANY_OTHER | RULE_EXEC_FORM_PARAMETER | RULE_SHELL_CMD | RULE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_58 = input.LA(1);

                        s = -1;
                        if ( ((LA21_58>='\u0000' && LA21_58<='\uFFFF')) ) {s = 85;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_18 = input.LA(1);

                        s = -1;
                        if ( (LA21_18=='[') ) {s = 54;}

                        else if ( ((LA21_18>='\u0000' && LA21_18<='\t')||(LA21_18>='\u000B' && LA21_18<='\f')||(LA21_18>='\u000E' && LA21_18<='Z')||(LA21_18>='\\' && LA21_18<='\uFFFF')) ) {s = 55;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_61 = input.LA(1);

                        s = -1;
                        if ( ((LA21_61>='\u0000' && LA21_61<='\uFFFF')) ) {s = 87;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_28 = input.LA(1);

                        s = -1;
                        if ( ((LA21_28>='\u0000' && LA21_28<='\t')||(LA21_28>='\u000B' && LA21_28<='\f')||(LA21_28>='\u000E' && LA21_28<='\uFFFF')) ) {s = 55;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_54 = input.LA(1);

                        s = -1;
                        if ( ((LA21_54>='\u0000' && LA21_54<='\t')||(LA21_54>='\u000B' && LA21_54<='\f')||(LA21_54>='\u000E' && LA21_54<='\uFFFF')) ) {s = 55;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_22 = input.LA(1);

                        s = -1;
                        if ( (LA21_22=='\\') ) {s = 58;}

                        else if ( ((LA21_22>='\u0000' && LA21_22<='!')||(LA21_22>='#' && LA21_22<='[')||(LA21_22>=']' && LA21_22<='\uFFFF')) ) {s = 59;}

                        else if ( (LA21_22=='\"') ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_85 = input.LA(1);

                        s = -1;
                        if ( (LA21_85=='\"') ) {s = 60;}

                        else if ( (LA21_85=='\\') ) {s = 58;}

                        else if ( ((LA21_85>='\u0000' && LA21_85<='!')||(LA21_85>='#' && LA21_85<='[')||(LA21_85>=']' && LA21_85<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_59 = input.LA(1);

                        s = -1;
                        if ( (LA21_59=='\"') ) {s = 60;}

                        else if ( (LA21_59=='\\') ) {s = 58;}

                        else if ( ((LA21_59>='\u0000' && LA21_59<='!')||(LA21_59>='#' && LA21_59<='[')||(LA21_59>=']' && LA21_59<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_23 = input.LA(1);

                        s = -1;
                        if ( (LA21_23=='\\') ) {s = 61;}

                        else if ( ((LA21_23>='\u0000' && LA21_23<='&')||(LA21_23>='(' && LA21_23<='[')||(LA21_23>=']' && LA21_23<='\uFFFF')) ) {s = 62;}

                        else if ( (LA21_23=='\'') ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_87 = input.LA(1);

                        s = -1;
                        if ( (LA21_87=='\'') ) {s = 63;}

                        else if ( (LA21_87=='\\') ) {s = 61;}

                        else if ( ((LA21_87>='\u0000' && LA21_87<='&')||(LA21_87>='(' && LA21_87<='[')||(LA21_87>=']' && LA21_87<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_62 = input.LA(1);

                        s = -1;
                        if ( (LA21_62=='\'') ) {s = 63;}

                        else if ( (LA21_62=='\\') ) {s = 61;}

                        else if ( ((LA21_62>='\u0000' && LA21_62<='&')||(LA21_62>='(' && LA21_62<='[')||(LA21_62>=']' && LA21_62<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='?') ) {s = 1;}

                        else if ( (LA21_0=='*') ) {s = 2;}

                        else if ( (LA21_0=='-') ) {s = 3;}

                        else if ( (LA21_0=='.') ) {s = 4;}

                        else if ( (LA21_0=='O') ) {s = 5;}

                        else if ( (LA21_0=='F') ) {s = 6;}

                        else if ( (LA21_0=='C') ) {s = 7;}

                        else if ( (LA21_0=='R') ) {s = 8;}

                        else if ( (LA21_0=='E') ) {s = 9;}

                        else if ( (LA21_0=='V') ) {s = 10;}

                        else if ( (LA21_0=='M') ) {s = 11;}

                        else if ( (LA21_0=='W') ) {s = 12;}

                        else if ( (LA21_0=='L') ) {s = 13;}

                        else if ( (LA21_0=='A') ) {s = 14;}

                        else if ( (LA21_0=='/') ) {s = 15;}

                        else if ( (LA21_0==':') ) {s = 16;}

                        else if ( (LA21_0=='@') ) {s = 17;}

                        else if ( (LA21_0==' ') ) {s = 18;}

                        else if ( (LA21_0==']') ) {s = 19;}

                        else if ( (LA21_0=='^') ) {s = 20;}

                        else if ( (LA21_0=='B'||LA21_0=='D'||(LA21_0>='G' && LA21_0<='K')||LA21_0=='N'||(LA21_0>='P' && LA21_0<='Q')||(LA21_0>='S' && LA21_0<='U')||(LA21_0>='X' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {s = 21;}

                        else if ( (LA21_0=='\"') ) {s = 22;}

                        else if ( (LA21_0=='\'') ) {s = 23;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 24;}

                        else if ( (LA21_0=='\\') ) {s = 25;}

                        else if ( (LA21_0=='\n') ) {s = 26;}

                        else if ( (LA21_0==',') ) {s = 27;}

                        else if ( (LA21_0=='\t') ) {s = 28;}

                        else if ( (LA21_0=='#') ) {s = 29;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='$' && LA21_0<='&')||(LA21_0>='(' && LA21_0<=')')||LA21_0=='+'||(LA21_0>=';' && LA21_0<='>')||LA21_0=='['||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_29 = input.LA(1);

                        s = -1;
                        if ( ((LA21_29>='\u0000' && LA21_29<='\t')||(LA21_29>='\u000B' && LA21_29<='\f')||(LA21_29>='\u000E' && LA21_29<='\uFFFF')) ) {s = 68;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}