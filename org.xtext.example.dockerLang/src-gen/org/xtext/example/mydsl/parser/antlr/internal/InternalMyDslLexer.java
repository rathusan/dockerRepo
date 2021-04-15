package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_STRING=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SHELL_CMD=7;
    public static final int RULE_ID=10;
    public static final int RULE_COMMENT=5;
    public static final int RULE_CHOWN_OPTION=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_KV_PAIR_EQUALS=8;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=4;
    public static final int RULE_EXEC_FORM_PARAMETER=13;
    public static final int T__20=20;
    public static final int RULE_PLATFORM_OPTION=6;
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

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'FROM ' )
            // InternalMyDsl.g:11:9: 'FROM '
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
            // InternalMyDsl.g:12:7: ( 'CMD' )
            // InternalMyDsl.g:12:9: 'CMD'
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
            // InternalMyDsl.g:13:7: ( 'RUN' )
            // InternalMyDsl.g:13:9: 'RUN'
            {
            match("RUN"); 


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
            // InternalMyDsl.g:14:7: ( 'ENTRYPOINT' )
            // InternalMyDsl.g:14:9: 'ENTRYPOINT'
            {
            match("ENTRYPOINT"); 


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
            // InternalMyDsl.g:15:7: ( 'VOLUME' )
            // InternalMyDsl.g:15:9: 'VOLUME'
            {
            match("VOLUME"); 


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
            // InternalMyDsl.g:16:7: ( 'MAINTAINER' )
            // InternalMyDsl.g:16:9: 'MAINTAINER'
            {
            match("MAINTAINER"); 


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
            // InternalMyDsl.g:17:7: ( 'EXPOSE' )
            // InternalMyDsl.g:17:9: 'EXPOSE'
            {
            match("EXPOSE"); 


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
            // InternalMyDsl.g:18:7: ( 'WORKDIR' )
            // InternalMyDsl.g:18:9: 'WORKDIR'
            {
            match("WORKDIR"); 


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
            // InternalMyDsl.g:19:7: ( 'ENV ' )
            // InternalMyDsl.g:19:9: 'ENV '
            {
            match("ENV "); 


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
            // InternalMyDsl.g:20:7: ( 'LABEL ' )
            // InternalMyDsl.g:20:9: 'LABEL '
            {
            match("LABEL "); 


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
            // InternalMyDsl.g:21:7: ( 'ADD ' )
            // InternalMyDsl.g:21:9: 'ADD '
            {
            match("ADD "); 


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
            // InternalMyDsl.g:22:7: ( '?' )
            // InternalMyDsl.g:22:9: '?'
            {
            match('?'); 

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
            // InternalMyDsl.g:23:7: ( '*' )
            // InternalMyDsl.g:23:9: '*'
            {
            match('*'); 

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
            // InternalMyDsl.g:24:7: ( '.' )
            // InternalMyDsl.g:24:9: '.'
            {
            match('.'); 

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
            // InternalMyDsl.g:25:7: ( 'COPY ' )
            // InternalMyDsl.g:25:9: 'COPY '
            {
            match("COPY "); 


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
            // InternalMyDsl.g:26:7: ( 'ONBUILD ' )
            // InternalMyDsl.g:26:9: 'ONBUILD '
            {
            match("ONBUILD "); 


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
            // InternalMyDsl.g:27:7: ( '/' )
            // InternalMyDsl.g:27:9: '/'
            {
            match('/'); 

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
            // InternalMyDsl.g:28:7: ( ':' )
            // InternalMyDsl.g:28:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:29:7: ( '-' )
            // InternalMyDsl.g:29:9: '-'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_PLATFORM_OPTION"
    public final void mRULE_PLATFORM_OPTION() throws RecognitionException {
        try {
            int _type = RULE_PLATFORM_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1562:22: ( '--platform=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' ' )
            // InternalMyDsl.g:1562:24: '--platform=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' '
            {
            match("--platform="); 

            // InternalMyDsl.g:1562:38: ( RULE_ID | RULE_INT )
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
                    // InternalMyDsl.g:1562:39: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1562:47: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match(':'); 
            // InternalMyDsl.g:1562:61: ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"'||LA4_0=='\''||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1562:62: ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
                    {
                    // InternalMyDsl.g:1562:62: ( RULE_ID | RULE_INT | RULE_STRING )
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
                            // InternalMyDsl.g:1562:63: RULE_ID
                            {
                            mRULE_ID(); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1562:71: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:1562:80: RULE_STRING
                            {
                            mRULE_STRING(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:1562:93: ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
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
                    	    // InternalMyDsl.g:1562:94: RULE_ID
                    	    {
                    	    mRULE_ID(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1562:102: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMyDsl.g:1562:111: RULE_STRING
                    	    {
                    	    mRULE_STRING(); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalMyDsl.g:1562:123: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalMyDsl.g:1562:127: '.'
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
            // InternalMyDsl.g:1564:19: ( '--chown=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' ' )
            // InternalMyDsl.g:1564:21: '--chown=' ( RULE_ID | RULE_INT ) ':' ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )? ' '
            {
            match("--chown="); 

            // InternalMyDsl.g:1564:32: ( RULE_ID | RULE_INT )
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
                    // InternalMyDsl.g:1564:33: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1564:41: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            match(':'); 
            // InternalMyDsl.g:1564:55: ( ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"'||LA8_0=='\''||(LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='^' && LA8_0<='_')||(LA8_0>='a' && LA8_0<='z')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1564:56: ( RULE_ID | RULE_INT | RULE_STRING ) ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
                    {
                    // InternalMyDsl.g:1564:56: ( RULE_ID | RULE_INT | RULE_STRING )
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
                            // InternalMyDsl.g:1564:57: RULE_ID
                            {
                            mRULE_ID(); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1564:65: RULE_INT
                            {
                            mRULE_INT(); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:1564:74: RULE_STRING
                            {
                            mRULE_STRING(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:1564:87: ( RULE_ID | RULE_INT | RULE_STRING | '-' | '.' )*
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
                    	    // InternalMyDsl.g:1564:88: RULE_ID
                    	    {
                    	    mRULE_ID(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1564:96: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMyDsl.g:1564:105: RULE_STRING
                    	    {
                    	    mRULE_STRING(); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalMyDsl.g:1564:117: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalMyDsl.g:1564:121: '.'
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
            // InternalMyDsl.g:1566:21: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT ) ( ' ' )? )
            // InternalMyDsl.g:1566:23: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT ) ( ' ' )?
            {
            // InternalMyDsl.g:1566:23: ( RULE_ID | RULE_STRING )
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
                    // InternalMyDsl.g:1566:24: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1566:32: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalMyDsl.g:1566:49: ( RULE_ID | RULE_STRING | RULE_INT )
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
                    // InternalMyDsl.g:1566:50: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1566:58: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1566:70: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalMyDsl.g:1566:80: ( ' ' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==' ') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1566:80: ' '
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
            // InternalMyDsl.g:1568:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1568:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1568:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1568:11: '^'
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

            // InternalMyDsl.g:1568:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalMyDsl.g:1570:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1570:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1570:12: ( '0' .. '9' )+
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
            	    // InternalMyDsl.g:1570:13: '0' .. '9'
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
            // InternalMyDsl.g:1572:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1572:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1572:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMyDsl.g:1572:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1572:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyDsl.g:1572:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1572:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMyDsl.g:1572:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1572:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyDsl.g:1572:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1572:61: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1574:9: ( ( '\\n' | '\\r' )+ )
            // InternalMyDsl.g:1574:11: ( '\\n' | '\\r' )+
            {
            // InternalMyDsl.g:1574:11: ( '\\n' | '\\r' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

    // $ANTLR start "RULE_EXEC_FORM_PARAMETER"
    public final void mRULE_EXEC_FORM_PARAMETER() throws RecognitionException {
        try {
            int _type = RULE_EXEC_FORM_PARAMETER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1576:26: ( ',' RULE_STRING )
            // InternalMyDsl.g:1576:28: ',' RULE_STRING
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
            // InternalMyDsl.g:1578:16: ( ( ' ' | '\\t' ) (~ ( ( '\\n' | '\\r' | '\\\\' ) ) | '\\\\' ( '\\n' | '\\r\\n' ) )* )
            // InternalMyDsl.g:1578:18: ( ' ' | '\\t' ) (~ ( ( '\\n' | '\\r' | '\\\\' ) ) | '\\\\' ( '\\n' | '\\r\\n' ) )*
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1578:29: (~ ( ( '\\n' | '\\r' | '\\\\' ) ) | '\\\\' ( '\\n' | '\\r\\n' ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }
                else if ( (LA20_0=='\\') ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1578:30: ~ ( ( '\\n' | '\\r' | '\\\\' ) )
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
            	    // InternalMyDsl.g:1578:50: '\\\\' ( '\\n' | '\\r\\n' )
            	    {
            	    match('\\'); 
            	    // InternalMyDsl.g:1578:55: ( '\\n' | '\\r\\n' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0=='\n') ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0=='\r') ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalMyDsl.g:1578:56: '\\n'
            	            {
            	            match('\n'); 

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1578:61: '\\r\\n'
            	            {
            	            match("\r\n"); 


            	            }
            	            break;

            	    }


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
    // $ANTLR end "RULE_SHELL_CMD"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1580:14: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalMyDsl.g:1580:16: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalMyDsl.g:1580:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1580:20: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
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
        // InternalMyDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_PLATFORM_OPTION | RULE_CHOWN_OPTION | RULE_KV_PAIR_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_NL | RULE_EXEC_FORM_PARAMETER | RULE_SHELL_CMD | RULE_COMMENT )
        int alt22=32;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalMyDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__35
                {
                mT__35(); 

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
                // InternalMyDsl.g:1:230: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:238: RULE_EXEC_FORM_PARAMETER
                {
                mRULE_EXEC_FORM_PARAMETER(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:263: RULE_SHELL_CMD
                {
                mRULE_SHELL_CMD(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:278: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\11\37\3\uffff\1\37\2\uffff\1\55\1\uffff\1\33\2\uffff\1\37\7\uffff\2\37\2\uffff\13\37\2\uffff\1\104\2\uffff\1\106\2\uffff\1\106\1\37\1\111\1\37\1\113\11\37\6\uffff\1\37\1\uffff\1\37\1\uffff\1\37\1\uffff\5\37\1\uffff\1\37\2\uffff\10\37\1\146\1\147\2\37\1\uffff\2\37\2\uffff\1\37\1\155\3\37\2\uffff\2\37\1\163\1\164\2\uffff";
    static final String DFA22_eofS =
        "\165\uffff";
    static final String DFA22_minS =
        "\1\11\11\60\3\uffff\1\60\2\uffff\1\55\1\uffff\1\133\1\uffff\1\101\1\60\2\0\5\uffff\2\60\2\uffff\13\60\1\143\1\uffff\3\0\1\75\2\0\1\75\5\60\1\40\5\60\1\40\1\60\3\uffff\1\0\1\uffff\1\0\1\40\1\uffff\1\40\1\uffff\1\60\1\uffff\5\60\1\uffff\1\60\2\uffff\5\60\1\40\6\60\1\uffff\2\60\2\uffff\2\60\1\40\2\60\2\uffff\4\60\2\uffff";
    static final String DFA22_maxS =
        "\12\172\3\uffff\1\172\2\uffff\1\55\1\uffff\1\133\1\uffff\2\172\2\uffff\5\uffff\2\172\2\uffff\13\172\1\160\1\uffff\3\uffff\1\75\2\uffff\1\75\15\172\3\uffff\1\uffff\1\uffff\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\5\172\1\uffff\1\172\2\uffff\14\172\1\uffff\2\172\2\uffff\5\172\2\uffff\4\172\2\uffff";
    static final String DFA22_acceptS =
        "\12\uffff\1\14\1\15\1\16\1\uffff\1\21\1\22\1\uffff\1\24\1\uffff\1\26\4\uffff\1\33\1\35\1\36\1\37\1\40\2\uffff\1\32\1\31\14\uffff\1\23\24\uffff\1\27\1\30\1\25\1\uffff\1\34\2\uffff\1\2\1\uffff\1\3\1\uffff\1\11\5\uffff\1\13\1\uffff\1\1\1\17\14\uffff\1\12\2\uffff\1\7\1\5\5\uffff\1\10\1\20\4\uffff\1\4\1\6";
    static final String DFA22_specialS =
        "\26\uffff\1\3\1\6\26\uffff\1\7\1\10\1\2\1\uffff\1\0\1\5\21\uffff\1\1\1\uffff\1\4\55\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\33\1\31\2\uffff\1\31\22\uffff\1\22\1\uffff\1\26\1\34\3\uffff\1\27\2\uffff\1\13\1\uffff\1\32\1\20\1\14\1\16\12\30\1\17\4\uffff\1\12\1\21\1\11\1\25\1\2\1\25\1\4\1\1\5\25\1\10\1\6\1\25\1\15\2\25\1\3\3\25\1\5\1\7\3\25\2\uffff\1\23\1\24\1\25\1\uffff\32\25",
            "\12\36\3\uffff\1\40\3\uffff\21\36\1\35\10\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\14\36\1\41\1\36\1\42\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\24\36\1\43\5\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\15\36\1\44\11\36\1\45\2\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\16\36\1\46\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\1\47\31\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\16\36\1\50\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\1\51\31\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\3\36\1\52\26\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\12\36\3\uffff\1\40\3\uffff\15\36\1\53\14\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\54",
            "",
            "\1\56",
            "",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\42\60\1\61\71\60\1\57\uffa3\60",
            "\47\63\1\64\64\63\1\62\uffa3\63",
            "",
            "",
            "",
            "",
            "",
            "\12\36\3\uffff\1\40\3\uffff\16\36\1\65\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\3\uffff\1\40\3\uffff\3\36\1\66\26\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\17\36\1\67\12\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\15\36\1\70\14\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\23\36\1\71\1\36\1\72\4\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\17\36\1\73\12\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\13\36\1\74\16\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\10\36\1\75\21\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\21\36\1\76\10\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\1\36\1\77\30\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\3\36\1\100\26\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\1\36\1\101\30\36\4\uffff\1\36\1\uffff\32\36",
            "\1\103\14\uffff\1\102",
            "",
            "\12\33\1\uffff\2\33\1\uffff\ufff2\33",
            "\0\105",
            "\42\60\1\61\71\60\1\57\uffa3\60",
            "\1\40",
            "\0\107",
            "\47\63\1\64\64\63\1\62\uffa3\63",
            "\1\40",
            "\12\36\3\uffff\1\40\3\uffff\14\36\1\110\15\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\30\36\1\112\1\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\21\36\1\114\10\36\4\uffff\1\36\1\uffff\32\36",
            "\1\115\17\uffff\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\16\36\1\116\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\24\36\1\117\5\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\15\36\1\120\14\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\12\36\1\121\17\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\4\36\1\122\25\36\4\uffff\1\36\1\uffff\32\36",
            "\1\123\17\uffff\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\24\36\1\124\5\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\42\60\1\61\71\60\1\57\uffa3\60",
            "",
            "\47\63\1\64\64\63\1\62\uffa3\63",
            "\1\125\17\uffff\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\126\17\uffff\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\40\3\uffff\30\36\1\127\1\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\40\3\uffff\22\36\1\130\7\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\14\36\1\131\15\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\23\36\1\132\6\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\3\36\1\133\26\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\13\36\1\134\16\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\40\3\uffff\10\36\1\135\21\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\3\uffff\1\40\3\uffff\17\36\1\136\12\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\4\36\1\137\25\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\4\36\1\140\25\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\1\141\31\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\10\36\1\142\21\36\4\uffff\1\36\1\uffff\32\36",
            "\1\143\17\uffff\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\13\36\1\144\16\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\16\36\1\145\13\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\10\36\1\150\21\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\21\36\1\151\10\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\3\uffff\1\40\3\uffff\3\36\1\152\26\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\10\36\1\153\21\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\3\uffff\1\40\3\uffff\15\36\1\154\14\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\156\17\uffff\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\15\36\1\157\14\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\4\36\1\160\25\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\3\uffff\1\40\3\uffff\23\36\1\161\6\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\21\36\1\162\10\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\3\uffff\1\40\3\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_PLATFORM_OPTION | RULE_CHOWN_OPTION | RULE_KV_PAIR_EQUALS | RULE_ID | RULE_INT | RULE_STRING | RULE_NL | RULE_EXEC_FORM_PARAMETER | RULE_SHELL_CMD | RULE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_50 = input.LA(1);

                        s = -1;
                        if ( ((LA22_50>='\u0000' && LA22_50<='\uFFFF')) ) {s = 71;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_69 = input.LA(1);

                        s = -1;
                        if ( (LA22_69=='\"') ) {s = 49;}

                        else if ( (LA22_69=='\\') ) {s = 47;}

                        else if ( ((LA22_69>='\u0000' && LA22_69<='!')||(LA22_69>='#' && LA22_69<='[')||(LA22_69>=']' && LA22_69<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_48 = input.LA(1);

                        s = -1;
                        if ( (LA22_48=='\"') ) {s = 49;}

                        else if ( (LA22_48=='\\') ) {s = 47;}

                        else if ( ((LA22_48>='\u0000' && LA22_48<='!')||(LA22_48>='#' && LA22_48<='[')||(LA22_48>=']' && LA22_48<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_22 = input.LA(1);

                        s = -1;
                        if ( (LA22_22=='\\') ) {s = 47;}

                        else if ( ((LA22_22>='\u0000' && LA22_22<='!')||(LA22_22>='#' && LA22_22<='[')||(LA22_22>=']' && LA22_22<='\uFFFF')) ) {s = 48;}

                        else if ( (LA22_22=='\"') ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_71 = input.LA(1);

                        s = -1;
                        if ( (LA22_71=='\'') ) {s = 52;}

                        else if ( (LA22_71=='\\') ) {s = 50;}

                        else if ( ((LA22_71>='\u0000' && LA22_71<='&')||(LA22_71>='(' && LA22_71<='[')||(LA22_71>=']' && LA22_71<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_51 = input.LA(1);

                        s = -1;
                        if ( (LA22_51=='\'') ) {s = 52;}

                        else if ( (LA22_51=='\\') ) {s = 50;}

                        else if ( ((LA22_51>='\u0000' && LA22_51<='&')||(LA22_51>='(' && LA22_51<='[')||(LA22_51>=']' && LA22_51<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_23 = input.LA(1);

                        s = -1;
                        if ( (LA22_23=='\\') ) {s = 50;}

                        else if ( ((LA22_23>='\u0000' && LA22_23<='&')||(LA22_23>='(' && LA22_23<='[')||(LA22_23>=']' && LA22_23<='\uFFFF')) ) {s = 51;}

                        else if ( (LA22_23=='\'') ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_46 = input.LA(1);

                        s = -1;
                        if ( ((LA22_46>='\u0000' && LA22_46<='\t')||(LA22_46>='\u000B' && LA22_46<='\f')||(LA22_46>='\u000E' && LA22_46<='\uFFFF')) ) {s = 27;}

                        else s = 68;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_47 = input.LA(1);

                        s = -1;
                        if ( ((LA22_47>='\u0000' && LA22_47<='\uFFFF')) ) {s = 69;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}