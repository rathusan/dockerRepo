package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_COMMENT", "RULE_PLATFORM_OPTION", "RULE_SHELL_CMD", "RULE_KV_PAIR_EQUALS", "RULE_CHOWN_OPTION", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_EXEC_FORM_PARAMETER", "RULE_CONTINUE_NL", "RULE_ANY_OTHER", "'ONBUILD '", "'FROM '", "'CMD'", "'RUN'", "'ENTRYPOINT'", "'VOLUME'", "'MAINTAINER'", "'EXPOSE'", "'WORKDIR'", "'ENV '", "'LABEL '", "'ADD '", "'?'", "'*'", "'.'", "'COPY '", "'/'", "':'", "'-'", "'@'", "' ['", "']'"
    };
    public static final int RULE_STRING=12;
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
    public static final int RULE_SHELL_CMD=7;
    public static final int RULE_ID=10;
    public static final int RULE_COMMENT=5;
    public static final int RULE_CONTINUE_NL=14;
    public static final int RULE_ANY_OTHER=15;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dockerfile";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDockerfile"
    // InternalMyDsl.g:64:1: entryRuleDockerfile returns [EObject current=null] : iv_ruleDockerfile= ruleDockerfile EOF ;
    public final EObject entryRuleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerfile = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleDockerfile= ruleDockerfile EOF )
            // InternalMyDsl.g:65:2: iv_ruleDockerfile= ruleDockerfile EOF
            {
             newCompositeNode(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerfile=ruleDockerfile();

            state._fsp--;

             current =iv_ruleDockerfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // InternalMyDsl.g:71:1: ruleDockerfile returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) ) this_NL_1= RULE_NL )* ;
    public final EObject ruleDockerfile() throws RecognitionException {
        EObject current = null;

        Token this_NL_1=null;
        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_statements_0_0= ruleStatement ) ) this_NL_1= RULE_NL )* )
            // InternalMyDsl.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) ) this_NL_1= RULE_NL )*
            {
            // InternalMyDsl.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) ) this_NL_1= RULE_NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT||(LA1_0>=16 && LA1_0<=27)||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: ( (lv_statements_0_0= ruleStatement ) ) this_NL_1= RULE_NL
            	    {
            	    // InternalMyDsl.g:79:3: ( (lv_statements_0_0= ruleStatement ) )
            	    // InternalMyDsl.g:80:4: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_statements_0_0= ruleStatement )
            	    // InternalMyDsl.g:81:5: lv_statements_0_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDockerfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    this_NL_1=(Token)match(input,RULE_NL,FOLLOW_4); 

            	    			newLeafNode(this_NL_1, grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_1());
            	    		

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:106:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:107:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:113:1: ruleStatement returns [EObject current=null] : ( (otherlv_0= 'ONBUILD ' )? (this_From_1= ruleFrom | this_Cmd_2= ruleCmd | this_Entrypoint_3= ruleEntrypoint | this_Volume_4= ruleVolume | this_Maintainer_5= ruleMaintainer | this_Expose_6= ruleExpose | this_Workdir_7= ruleWorkdir | this_Run_8= ruleRun | this_Env_9= ruleEnv | this_Label_10= ruleLabel | this_Add_11= ruleAdd | this_Copy_12= ruleCopy | this_COMMENT_13= RULE_COMMENT ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_COMMENT_13=null;
        EObject this_From_1 = null;

        EObject this_Cmd_2 = null;

        EObject this_Entrypoint_3 = null;

        EObject this_Volume_4 = null;

        EObject this_Maintainer_5 = null;

        EObject this_Expose_6 = null;

        EObject this_Workdir_7 = null;

        EObject this_Run_8 = null;

        EObject this_Env_9 = null;

        EObject this_Label_10 = null;

        EObject this_Add_11 = null;

        EObject this_Copy_12 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:119:2: ( ( (otherlv_0= 'ONBUILD ' )? (this_From_1= ruleFrom | this_Cmd_2= ruleCmd | this_Entrypoint_3= ruleEntrypoint | this_Volume_4= ruleVolume | this_Maintainer_5= ruleMaintainer | this_Expose_6= ruleExpose | this_Workdir_7= ruleWorkdir | this_Run_8= ruleRun | this_Env_9= ruleEnv | this_Label_10= ruleLabel | this_Add_11= ruleAdd | this_Copy_12= ruleCopy | this_COMMENT_13= RULE_COMMENT ) ) )
            // InternalMyDsl.g:120:2: ( (otherlv_0= 'ONBUILD ' )? (this_From_1= ruleFrom | this_Cmd_2= ruleCmd | this_Entrypoint_3= ruleEntrypoint | this_Volume_4= ruleVolume | this_Maintainer_5= ruleMaintainer | this_Expose_6= ruleExpose | this_Workdir_7= ruleWorkdir | this_Run_8= ruleRun | this_Env_9= ruleEnv | this_Label_10= ruleLabel | this_Add_11= ruleAdd | this_Copy_12= ruleCopy | this_COMMENT_13= RULE_COMMENT ) )
            {
            // InternalMyDsl.g:120:2: ( (otherlv_0= 'ONBUILD ' )? (this_From_1= ruleFrom | this_Cmd_2= ruleCmd | this_Entrypoint_3= ruleEntrypoint | this_Volume_4= ruleVolume | this_Maintainer_5= ruleMaintainer | this_Expose_6= ruleExpose | this_Workdir_7= ruleWorkdir | this_Run_8= ruleRun | this_Env_9= ruleEnv | this_Label_10= ruleLabel | this_Add_11= ruleAdd | this_Copy_12= ruleCopy | this_COMMENT_13= RULE_COMMENT ) )
            // InternalMyDsl.g:121:3: (otherlv_0= 'ONBUILD ' )? (this_From_1= ruleFrom | this_Cmd_2= ruleCmd | this_Entrypoint_3= ruleEntrypoint | this_Volume_4= ruleVolume | this_Maintainer_5= ruleMaintainer | this_Expose_6= ruleExpose | this_Workdir_7= ruleWorkdir | this_Run_8= ruleRun | this_Env_9= ruleEnv | this_Label_10= ruleLabel | this_Add_11= ruleAdd | this_Copy_12= ruleCopy | this_COMMENT_13= RULE_COMMENT )
            {
            // InternalMyDsl.g:121:3: (otherlv_0= 'ONBUILD ' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:122:4: otherlv_0= 'ONBUILD '
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getONBUILDKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:127:3: (this_From_1= ruleFrom | this_Cmd_2= ruleCmd | this_Entrypoint_3= ruleEntrypoint | this_Volume_4= ruleVolume | this_Maintainer_5= ruleMaintainer | this_Expose_6= ruleExpose | this_Workdir_7= ruleWorkdir | this_Run_8= ruleRun | this_Env_9= ruleEnv | this_Label_10= ruleLabel | this_Add_11= ruleAdd | this_Copy_12= ruleCopy | this_COMMENT_13= RULE_COMMENT )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            case 24:
                {
                alt3=7;
                }
                break;
            case 19:
                {
                alt3=8;
                }
                break;
            case 25:
                {
                alt3=9;
                }
                break;
            case 26:
                {
                alt3=10;
                }
                break;
            case 27:
                {
                alt3=11;
                }
                break;
            case 31:
                {
                alt3=12;
                }
                break;
            case RULE_COMMENT:
                {
                alt3=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:128:4: this_From_1= ruleFrom
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getFromParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_From_1=ruleFrom();

                    state._fsp--;


                    				current = this_From_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:137:4: this_Cmd_2= ruleCmd
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getCmdParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Cmd_2=ruleCmd();

                    state._fsp--;


                    				current = this_Cmd_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:146:4: this_Entrypoint_3= ruleEntrypoint
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getEntrypointParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Entrypoint_3=ruleEntrypoint();

                    state._fsp--;


                    				current = this_Entrypoint_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:155:4: this_Volume_4= ruleVolume
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getVolumeParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_Volume_4=ruleVolume();

                    state._fsp--;


                    				current = this_Volume_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:164:4: this_Maintainer_5= ruleMaintainer
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getMaintainerParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_Maintainer_5=ruleMaintainer();

                    state._fsp--;


                    				current = this_Maintainer_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:173:4: this_Expose_6= ruleExpose
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getExposeParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_Expose_6=ruleExpose();

                    state._fsp--;


                    				current = this_Expose_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:182:4: this_Workdir_7= ruleWorkdir
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getWorkdirParserRuleCall_1_6());
                    			
                    pushFollow(FOLLOW_2);
                    this_Workdir_7=ruleWorkdir();

                    state._fsp--;


                    				current = this_Workdir_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:191:4: this_Run_8= ruleRun
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getRunParserRuleCall_1_7());
                    			
                    pushFollow(FOLLOW_2);
                    this_Run_8=ruleRun();

                    state._fsp--;


                    				current = this_Run_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:200:4: this_Env_9= ruleEnv
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getEnvParserRuleCall_1_8());
                    			
                    pushFollow(FOLLOW_2);
                    this_Env_9=ruleEnv();

                    state._fsp--;


                    				current = this_Env_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:209:4: this_Label_10= ruleLabel
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_1_9());
                    			
                    pushFollow(FOLLOW_2);
                    this_Label_10=ruleLabel();

                    state._fsp--;


                    				current = this_Label_10;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:218:4: this_Add_11= ruleAdd
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getAddParserRuleCall_1_10());
                    			
                    pushFollow(FOLLOW_2);
                    this_Add_11=ruleAdd();

                    state._fsp--;


                    				current = this_Add_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:227:4: this_Copy_12= ruleCopy
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getCopyParserRuleCall_1_11());
                    			
                    pushFollow(FOLLOW_2);
                    this_Copy_12=ruleCopy();

                    state._fsp--;


                    				current = this_Copy_12;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:236:4: this_COMMENT_13= RULE_COMMENT
                    {
                    this_COMMENT_13=(Token)match(input,RULE_COMMENT,FOLLOW_2); 

                    				newLeafNode(this_COMMENT_13, grammarAccess.getStatementAccess().getCOMMENTTerminalRuleCall_1_12());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleFrom"
    // InternalMyDsl.g:245:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalMyDsl.g:245:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalMyDsl.g:246:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalMyDsl.g:252:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_platform_option_1_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_tag_or_digest_3_1 = null;

        AntlrDatatypeRuleToken lv_tag_or_digest_3_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:258:2: ( (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? ) )
            // InternalMyDsl.g:259:2: (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? )
            {
            // InternalMyDsl.g:259:2: (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? )
            // InternalMyDsl.g:260:3: otherlv_0= 'FROM ' ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
            		
            // InternalMyDsl.g:264:3: ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PLATFORM_OPTION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:265:4: (lv_platform_option_1_0= RULE_PLATFORM_OPTION )
                    {
                    // InternalMyDsl.g:265:4: (lv_platform_option_1_0= RULE_PLATFORM_OPTION )
                    // InternalMyDsl.g:266:5: lv_platform_option_1_0= RULE_PLATFORM_OPTION
                    {
                    lv_platform_option_1_0=(Token)match(input,RULE_PLATFORM_OPTION,FOLLOW_6); 

                    					newLeafNode(lv_platform_option_1_0, grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFromRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"platform_option",
                    						lv_platform_option_1_0,
                    						"org.xtext.example.mydsl.MyDsl.PLATFORM_OPTION");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:282:3: ( (lv_name_2_0= ruleIMAGE_NAME ) )
            // InternalMyDsl.g:283:4: (lv_name_2_0= ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:283:4: (lv_name_2_0= ruleIMAGE_NAME )
            // InternalMyDsl.g:284:5: lv_name_2_0= ruleIMAGE_NAME
            {

            					newCompositeNode(grammarAccess.getFromAccess().getNameIMAGE_NAMEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleIMAGE_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.IMAGE_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:301:3: ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33||LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:302:4: ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) )
                    {
                    // InternalMyDsl.g:302:4: ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) )
                    // InternalMyDsl.g:303:5: (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:303:5: (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==33) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==35) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:304:6: lv_tag_or_digest_3_1= ruleIMAGE_TAG
                            {

                            						newCompositeNode(grammarAccess.getFromAccess().getTag_or_digestIMAGE_TAGParserRuleCall_3_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tag_or_digest_3_1=ruleIMAGE_TAG();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFromRule());
                            						}
                            						set(
                            							current,
                            							"tag_or_digest",
                            							lv_tag_or_digest_3_1,
                            							"org.xtext.example.mydsl.MyDsl.IMAGE_TAG");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:320:6: lv_tag_or_digest_3_2= ruleIMAGE_DIGEST
                            {

                            						newCompositeNode(grammarAccess.getFromAccess().getTag_or_digestIMAGE_DIGESTParserRuleCall_3_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_tag_or_digest_3_2=ruleIMAGE_DIGEST();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFromRule());
                            						}
                            						set(
                            							current,
                            							"tag_or_digest",
                            							lv_tag_or_digest_3_2,
                            							"org.xtext.example.mydsl.MyDsl.IMAGE_DIGEST");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleCmd"
    // InternalMyDsl.g:342:1: entryRuleCmd returns [EObject current=null] : iv_ruleCmd= ruleCmd EOF ;
    public final EObject entryRuleCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmd = null;


        try {
            // InternalMyDsl.g:342:44: (iv_ruleCmd= ruleCmd EOF )
            // InternalMyDsl.g:343:2: iv_ruleCmd= ruleCmd EOF
            {
             newCompositeNode(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmd=ruleCmd();

            state._fsp--;

             current =iv_ruleCmd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // InternalMyDsl.g:349:1: ruleCmd returns [EObject current=null] : (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SHELL_CMD_3=null;
        EObject this_EXEC_FORM_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:355:2: ( (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:356:2: (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:356:2: (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:357:3: otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCmdAccess().getCMDKeyword_0());
            		
            // InternalMyDsl.g:361:3: (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_SHELL_CMD) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:362:4: this_EXEC_FORM_1= ruleEXEC_FORM
                    {

                    				newCompositeNode(grammarAccess.getCmdAccess().getEXEC_FORMParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_EXEC_FORM_1=ruleEXEC_FORM();

                    state._fsp--;


                    				current = this_EXEC_FORM_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:371:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:371:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    // InternalMyDsl.g:372:5: () this_SHELL_CMD_3= RULE_SHELL_CMD
                    {
                    // InternalMyDsl.g:372:5: ()
                    // InternalMyDsl.g:373:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getCmdAccess().getCmdAction_1_1_0(),
                    							current);
                    					

                    }

                    this_SHELL_CMD_3=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    					newLeafNode(this_SHELL_CMD_3, grammarAccess.getCmdAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleRun"
    // InternalMyDsl.g:389:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalMyDsl.g:389:44: (iv_ruleRun= ruleRun EOF )
            // InternalMyDsl.g:390:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalMyDsl.g:396:1: ruleRun returns [EObject current=null] : (otherlv_0= 'RUN' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SHELL_CMD_3=null;
        EObject this_EXEC_FORM_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:402:2: ( (otherlv_0= 'RUN' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:403:2: (otherlv_0= 'RUN' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:403:2: (otherlv_0= 'RUN' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:404:3: otherlv_0= 'RUN' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRUNKeyword_0());
            		
            // InternalMyDsl.g:408:3: (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_SHELL_CMD) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:409:4: this_EXEC_FORM_1= ruleEXEC_FORM
                    {

                    				newCompositeNode(grammarAccess.getRunAccess().getEXEC_FORMParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_EXEC_FORM_1=ruleEXEC_FORM();

                    state._fsp--;


                    				current = this_EXEC_FORM_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:418:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:418:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    // InternalMyDsl.g:419:5: () this_SHELL_CMD_3= RULE_SHELL_CMD
                    {
                    // InternalMyDsl.g:419:5: ()
                    // InternalMyDsl.g:420:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getRunAccess().getRunAction_1_1_0(),
                    							current);
                    					

                    }

                    this_SHELL_CMD_3=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    					newLeafNode(this_SHELL_CMD_3, grammarAccess.getRunAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleEntrypoint"
    // InternalMyDsl.g:436:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // InternalMyDsl.g:436:51: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // InternalMyDsl.g:437:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
             newCompositeNode(grammarAccess.getEntrypointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;

             current =iv_ruleEntrypoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntrypoint"


    // $ANTLR start "ruleEntrypoint"
    // InternalMyDsl.g:443:1: ruleEntrypoint returns [EObject current=null] : (otherlv_0= 'ENTRYPOINT' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SHELL_CMD_3=null;
        EObject this_EXEC_FORM_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:449:2: ( (otherlv_0= 'ENTRYPOINT' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:450:2: (otherlv_0= 'ENTRYPOINT' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:450:2: (otherlv_0= 'ENTRYPOINT' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:451:3: otherlv_0= 'ENTRYPOINT' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0());
            		
            // InternalMyDsl.g:455:3: (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_SHELL_CMD) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:456:4: this_EXEC_FORM_1= ruleEXEC_FORM
                    {

                    				newCompositeNode(grammarAccess.getEntrypointAccess().getEXEC_FORMParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_EXEC_FORM_1=ruleEXEC_FORM();

                    state._fsp--;


                    				current = this_EXEC_FORM_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:465:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:465:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    // InternalMyDsl.g:466:5: () this_SHELL_CMD_3= RULE_SHELL_CMD
                    {
                    // InternalMyDsl.g:466:5: ()
                    // InternalMyDsl.g:467:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getEntrypointAccess().getEntrypointAction_1_1_0(),
                    							current);
                    					

                    }

                    this_SHELL_CMD_3=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    					newLeafNode(this_SHELL_CMD_3, grammarAccess.getEntrypointAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleVolume"
    // InternalMyDsl.g:483:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalMyDsl.g:483:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalMyDsl.g:484:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalMyDsl.g:490:1: ruleVolume returns [EObject current=null] : (otherlv_0= 'VOLUME' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SHELL_CMD_3=null;
        EObject this_EXEC_FORM_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:496:2: ( (otherlv_0= 'VOLUME' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:497:2: (otherlv_0= 'VOLUME' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:497:2: (otherlv_0= 'VOLUME' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:498:3: otherlv_0= 'VOLUME' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVolumeAccess().getVOLUMEKeyword_0());
            		
            // InternalMyDsl.g:502:3: (this_EXEC_FORM_1= ruleEXEC_FORM | ( () this_SHELL_CMD_3= RULE_SHELL_CMD ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_SHELL_CMD) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:503:4: this_EXEC_FORM_1= ruleEXEC_FORM
                    {

                    				newCompositeNode(grammarAccess.getVolumeAccess().getEXEC_FORMParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_EXEC_FORM_1=ruleEXEC_FORM();

                    state._fsp--;


                    				current = this_EXEC_FORM_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:512:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:512:4: ( () this_SHELL_CMD_3= RULE_SHELL_CMD )
                    // InternalMyDsl.g:513:5: () this_SHELL_CMD_3= RULE_SHELL_CMD
                    {
                    // InternalMyDsl.g:513:5: ()
                    // InternalMyDsl.g:514:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getVolumeAccess().getVolumeAction_1_1_0(),
                    							current);
                    					

                    }

                    this_SHELL_CMD_3=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    					newLeafNode(this_SHELL_CMD_3, grammarAccess.getVolumeAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleMaintainer"
    // InternalMyDsl.g:530:1: entryRuleMaintainer returns [EObject current=null] : iv_ruleMaintainer= ruleMaintainer EOF ;
    public final EObject entryRuleMaintainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaintainer = null;


        try {
            // InternalMyDsl.g:530:51: (iv_ruleMaintainer= ruleMaintainer EOF )
            // InternalMyDsl.g:531:2: iv_ruleMaintainer= ruleMaintainer EOF
            {
             newCompositeNode(grammarAccess.getMaintainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaintainer=ruleMaintainer();

            state._fsp--;

             current =iv_ruleMaintainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaintainer"


    // $ANTLR start "ruleMaintainer"
    // InternalMyDsl.g:537:1: ruleMaintainer returns [EObject current=null] : (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleMaintainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:543:2: ( (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:544:2: (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:544:2: (otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:545:3: otherlv_0= 'MAINTAINER' ( (lv_name_1_0= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0());
            		
            // InternalMyDsl.g:549:3: ( (lv_name_1_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:550:4: (lv_name_1_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:550:4: (lv_name_1_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:551:5: lv_name_1_0= RULE_SHELL_CMD
            {
            lv_name_1_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMaintainerAccess().getNameSHELL_CMDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaintainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaintainer"


    // $ANTLR start "entryRuleExpose"
    // InternalMyDsl.g:571:1: entryRuleExpose returns [EObject current=null] : iv_ruleExpose= ruleExpose EOF ;
    public final EObject entryRuleExpose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpose = null;


        try {
            // InternalMyDsl.g:571:47: (iv_ruleExpose= ruleExpose EOF )
            // InternalMyDsl.g:572:2: iv_ruleExpose= ruleExpose EOF
            {
             newCompositeNode(grammarAccess.getExposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpose=ruleExpose();

            state._fsp--;

             current =iv_ruleExpose; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpose"


    // $ANTLR start "ruleExpose"
    // InternalMyDsl.g:578:1: ruleExpose returns [EObject current=null] : (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleExpose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ports_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:584:2: ( (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:585:2: (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:585:2: (otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:586:3: otherlv_0= 'EXPOSE' ( (lv_ports_1_0= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getExposeAccess().getEXPOSEKeyword_0());
            		
            // InternalMyDsl.g:590:3: ( (lv_ports_1_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:591:4: (lv_ports_1_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:591:4: (lv_ports_1_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:592:5: lv_ports_1_0= RULE_SHELL_CMD
            {
            lv_ports_1_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

            					newLeafNode(lv_ports_1_0, grammarAccess.getExposeAccess().getPortsSHELL_CMDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExposeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ports",
            						lv_ports_1_0,
            						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpose"


    // $ANTLR start "entryRuleWorkdir"
    // InternalMyDsl.g:612:1: entryRuleWorkdir returns [EObject current=null] : iv_ruleWorkdir= ruleWorkdir EOF ;
    public final EObject entryRuleWorkdir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkdir = null;


        try {
            // InternalMyDsl.g:612:48: (iv_ruleWorkdir= ruleWorkdir EOF )
            // InternalMyDsl.g:613:2: iv_ruleWorkdir= ruleWorkdir EOF
            {
             newCompositeNode(grammarAccess.getWorkdirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkdir=ruleWorkdir();

            state._fsp--;

             current =iv_ruleWorkdir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkdir"


    // $ANTLR start "ruleWorkdir"
    // InternalMyDsl.g:619:1: ruleWorkdir returns [EObject current=null] : (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleWorkdir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:625:2: ( (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:626:2: (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:626:2: (otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:627:3: otherlv_0= 'WORKDIR' ( (lv_path_1_0= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0());
            		
            // InternalMyDsl.g:631:3: ( (lv_path_1_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:632:4: (lv_path_1_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:632:4: (lv_path_1_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:633:5: lv_path_1_0= RULE_SHELL_CMD
            {
            lv_path_1_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

            					newLeafNode(lv_path_1_0, grammarAccess.getWorkdirAccess().getPathSHELL_CMDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkdirRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkdir"


    // $ANTLR start "entryRuleEnv"
    // InternalMyDsl.g:653:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalMyDsl.g:653:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalMyDsl.g:654:2: iv_ruleEnv= ruleEnv EOF
            {
             newCompositeNode(grammarAccess.getEnvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnv=ruleEnv();

            state._fsp--;

             current =iv_ruleEnv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalMyDsl.g:660:1: ruleEnv returns [EObject current=null] : (otherlv_0= 'ENV ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_value_pairs_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:666:2: ( (otherlv_0= 'ENV ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) )
            // InternalMyDsl.g:667:2: (otherlv_0= 'ENV ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            {
            // InternalMyDsl.g:667:2: (otherlv_0= 'ENV ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            // InternalMyDsl.g:668:3: otherlv_0= 'ENV ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvAccess().getENVKeyword_0());
            		
            // InternalMyDsl.g:672:3: ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_KV_PAIR_EQUALS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:673:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    {
            	    // InternalMyDsl.g:673:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    // InternalMyDsl.g:674:5: lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS
            	    {
            	    lv_key_value_pairs_1_0=(Token)match(input,RULE_KV_PAIR_EQUALS,FOLLOW_11); 

            	    					newLeafNode(lv_key_value_pairs_1_0, grammarAccess.getEnvAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEnvRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"key_value_pairs",
            	    						lv_key_value_pairs_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.KV_PAIR_EQUALS");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:694:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:694:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:695:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:701:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'LABEL ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_value_pairs_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:707:2: ( (otherlv_0= 'LABEL ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) )
            // InternalMyDsl.g:708:2: (otherlv_0= 'LABEL ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            {
            // InternalMyDsl.g:708:2: (otherlv_0= 'LABEL ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            // InternalMyDsl.g:709:3: otherlv_0= 'LABEL ' ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLABELKeyword_0());
            		
            // InternalMyDsl.g:713:3: ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_KV_PAIR_EQUALS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:714:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    {
            	    // InternalMyDsl.g:714:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    // InternalMyDsl.g:715:5: lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS
            	    {
            	    lv_key_value_pairs_1_0=(Token)match(input,RULE_KV_PAIR_EQUALS,FOLLOW_11); 

            	    					newLeafNode(lv_key_value_pairs_1_0, grammarAccess.getLabelAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLabelRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"key_value_pairs",
            	    						lv_key_value_pairs_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.KV_PAIR_EQUALS");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:735:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMyDsl.g:735:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMyDsl.g:736:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:742:1: ruleAdd returns [EObject current=null] : (otherlv_0= 'ADD ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_chown_options_1_0=null;
        Token lv_file_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Token lv_directory_7_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:748:2: ( (otherlv_0= 'ADD ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:749:2: (otherlv_0= 'ADD ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:749:2: (otherlv_0= 'ADD ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:750:3: otherlv_0= 'ADD ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getADDKeyword_0());
            		
            // InternalMyDsl.g:754:3: ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_CHOWN_OPTION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:755:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    {
                    // InternalMyDsl.g:755:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    // InternalMyDsl.g:756:5: lv_chown_options_1_0= RULE_CHOWN_OPTION
                    {
                    lv_chown_options_1_0=(Token)match(input,RULE_CHOWN_OPTION,FOLLOW_13); 

                    					newLeafNode(lv_chown_options_1_0, grammarAccess.getAddAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAddRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"chown_options",
                    						lv_chown_options_1_0,
                    						"org.xtext.example.mydsl.MyDsl.CHOWN_OPTION");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:772:3: ( (lv_file_2_0= RULE_ID ) )
            // InternalMyDsl.g:773:4: (lv_file_2_0= RULE_ID )
            {
            // InternalMyDsl.g:773:4: (lv_file_2_0= RULE_ID )
            // InternalMyDsl.g:774:5: lv_file_2_0= RULE_ID
            {
            lv_file_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_file_2_0, grammarAccess.getAddAccess().getFileIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.xtext.example.mydsl.MyDsl.ID");
            				

            }


            }

            // InternalMyDsl.g:790:3: ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=28 && LA15_0<=29)) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:791:4: (otherlv_3= '?' | otherlv_4= '*' )
                    {
                    // InternalMyDsl.g:791:4: (otherlv_3= '?' | otherlv_4= '*' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==29) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:792:5: otherlv_3= '?'
                            {
                            otherlv_3=(Token)match(input,28,FOLLOW_9); 

                            					newLeafNode(otherlv_3, grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:797:5: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getAddAccess().getAsteriskKeyword_3_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:803:4: (otherlv_5= '.' this_ID_6= RULE_ID )
                    {
                    // InternalMyDsl.g:803:4: (otherlv_5= '.' this_ID_6= RULE_ID )
                    // InternalMyDsl.g:804:5: otherlv_5= '.' this_ID_6= RULE_ID
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_13); 

                    					newLeafNode(otherlv_5, grammarAccess.getAddAccess().getFullStopKeyword_3_1_0());
                    				
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    					newLeafNode(this_ID_6, grammarAccess.getAddAccess().getIDTerminalRuleCall_3_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:814:3: ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:815:4: (lv_directory_7_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:815:4: (lv_directory_7_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:816:5: lv_directory_7_0= RULE_SHELL_CMD
            {
            lv_directory_7_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

            					newLeafNode(lv_directory_7_0, grammarAccess.getAddAccess().getDirectorySHELL_CMDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(
            						current,
            						"directory",
            						lv_directory_7_0,
            						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleCopy"
    // InternalMyDsl.g:836:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalMyDsl.g:836:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalMyDsl.g:837:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalMyDsl.g:843:1: ruleCopy returns [EObject current=null] : (otherlv_0= 'COPY ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_chown_options_1_0=null;
        Token lv_file_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Token lv_directory_7_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:849:2: ( (otherlv_0= 'COPY ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:850:2: (otherlv_0= 'COPY ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:850:2: (otherlv_0= 'COPY ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:851:3: otherlv_0= 'COPY ' ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCOPYKeyword_0());
            		
            // InternalMyDsl.g:855:3: ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CHOWN_OPTION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:856:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    {
                    // InternalMyDsl.g:856:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    // InternalMyDsl.g:857:5: lv_chown_options_1_0= RULE_CHOWN_OPTION
                    {
                    lv_chown_options_1_0=(Token)match(input,RULE_CHOWN_OPTION,FOLLOW_13); 

                    					newLeafNode(lv_chown_options_1_0, grammarAccess.getCopyAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCopyRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"chown_options",
                    						lv_chown_options_1_0,
                    						"org.xtext.example.mydsl.MyDsl.CHOWN_OPTION");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:873:3: ( (lv_file_2_0= RULE_ID ) )
            // InternalMyDsl.g:874:4: (lv_file_2_0= RULE_ID )
            {
            // InternalMyDsl.g:874:4: (lv_file_2_0= RULE_ID )
            // InternalMyDsl.g:875:5: lv_file_2_0= RULE_ID
            {
            lv_file_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_file_2_0, grammarAccess.getCopyAccess().getFileIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_2_0,
            						"org.xtext.example.mydsl.MyDsl.ID");
            				

            }


            }

            // InternalMyDsl.g:891:3: (otherlv_3= '?' | otherlv_4= '*' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:892:4: otherlv_3= '?'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:897:4: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getCopyAccess().getAsteriskKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:902:3: (otherlv_5= '.' this_ID_6= RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:903:4: otherlv_5= '.' this_ID_6= RULE_ID
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getFullStopKeyword_4_0());
                    			
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    				newLeafNode(this_ID_6, grammarAccess.getCopyAccess().getIDTerminalRuleCall_4_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:912:3: ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:913:4: (lv_directory_7_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:913:4: (lv_directory_7_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:914:5: lv_directory_7_0= RULE_SHELL_CMD
            {
            lv_directory_7_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

            					newLeafNode(lv_directory_7_0, grammarAccess.getCopyAccess().getDirectorySHELL_CMDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"directory",
            						lv_directory_7_0,
            						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleIMAGE_NAME"
    // InternalMyDsl.g:934:1: entryRuleIMAGE_NAME returns [String current=null] : iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF ;
    public final String entryRuleIMAGE_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_NAME = null;


        try {
            // InternalMyDsl.g:934:50: (iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF )
            // InternalMyDsl.g:935:2: iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF
            {
             newCompositeNode(grammarAccess.getIMAGE_NAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMAGE_NAME=ruleIMAGE_NAME();

            state._fsp--;

             current =iv_ruleIMAGE_NAME.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMAGE_NAME"


    // $ANTLR start "ruleIMAGE_NAME"
    // InternalMyDsl.g:941:1: ruleIMAGE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIMAGE_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:947:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // InternalMyDsl.g:948:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // InternalMyDsl.g:948:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // InternalMyDsl.g:949:3: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:956:3: (kw= '/' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:957:4: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMAGE_NAME"


    // $ANTLR start "entryRuleIMAGE_TAG"
    // InternalMyDsl.g:974:1: entryRuleIMAGE_TAG returns [String current=null] : iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF ;
    public final String entryRuleIMAGE_TAG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_TAG = null;


        try {
            // InternalMyDsl.g:974:49: (iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF )
            // InternalMyDsl.g:975:2: iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF
            {
             newCompositeNode(grammarAccess.getIMAGE_TAGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMAGE_TAG=ruleIMAGE_TAG();

            state._fsp--;

             current =iv_ruleIMAGE_TAG.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMAGE_TAG"


    // $ANTLR start "ruleIMAGE_TAG"
    // InternalMyDsl.g:981:1: ruleIMAGE_TAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) ;
    public final AntlrDatatypeRuleToken ruleIMAGE_TAG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token this_ID_4=null;
        Token this_INT_5=null;
        Token this_STRING_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:987:2: ( (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) )
            // InternalMyDsl.g:988:2: (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            {
            // InternalMyDsl.g:988:2: (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            // InternalMyDsl.g:989:3: kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            {
            kw=(Token)match(input,33,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:994:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:995:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_18); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1003:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1011:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1019:3: (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            loop21:
            do {
                int alt21=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt21=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt21=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt21=3;
                    }
                    break;
                case 34:
                    {
                    alt21=4;
                    }
                    break;
                case 30:
                    {
                    alt21=5;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1020:4: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1028:4: this_INT_5= RULE_INT
            	    {
            	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    				current.merge(this_INT_5);
            	    			

            	    				newLeafNode(this_INT_5, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1036:4: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    				current.merge(this_STRING_6);
            	    			

            	    				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:1044:4: kw= '-'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_18); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:1050:4: kw= '.'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_18); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMAGE_TAG"


    // $ANTLR start "entryRuleIMAGE_DIGEST"
    // InternalMyDsl.g:1060:1: entryRuleIMAGE_DIGEST returns [String current=null] : iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF ;
    public final String entryRuleIMAGE_DIGEST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_DIGEST = null;


        try {
            // InternalMyDsl.g:1060:52: (iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF )
            // InternalMyDsl.g:1061:2: iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF
            {
             newCompositeNode(grammarAccess.getIMAGE_DIGESTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIMAGE_DIGEST=ruleIMAGE_DIGEST();

            state._fsp--;

             current =iv_ruleIMAGE_DIGEST.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIMAGE_DIGEST"


    // $ANTLR start "ruleIMAGE_DIGEST"
    // InternalMyDsl.g:1067:1: ruleIMAGE_DIGEST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) ;
    public final AntlrDatatypeRuleToken ruleIMAGE_DIGEST() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token this_ID_4=null;
        Token this_INT_5=null;
        Token this_STRING_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1073:2: ( (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) )
            // InternalMyDsl.g:1074:2: (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            {
            // InternalMyDsl.g:1074:2: (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            // InternalMyDsl.g:1075:3: kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            {
            kw=(Token)match(input,35,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0());
            		
            // InternalMyDsl.g:1080:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case RULE_INT:
                {
                alt22=2;
                }
                break;
            case RULE_STRING:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1081:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_18); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1089:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1097:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1105:3: (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            loop23:
            do {
                int alt23=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt23=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt23=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt23=3;
                    }
                    break;
                case 34:
                    {
                    alt23=4;
                    }
                    break;
                case 30:
                    {
                    alt23=5;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1106:4: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1114:4: this_INT_5= RULE_INT
            	    {
            	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    				current.merge(this_INT_5);
            	    			

            	    				newLeafNode(this_INT_5, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1122:4: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    				current.merge(this_STRING_6);
            	    			

            	    				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:1130:4: kw= '-'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_18); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:1136:4: kw= '.'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_18); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIMAGE_DIGEST"


    // $ANTLR start "entryRuleEXEC_FORM"
    // InternalMyDsl.g:1146:1: entryRuleEXEC_FORM returns [EObject current=null] : iv_ruleEXEC_FORM= ruleEXEC_FORM EOF ;
    public final EObject entryRuleEXEC_FORM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXEC_FORM = null;


        try {
            // InternalMyDsl.g:1146:50: (iv_ruleEXEC_FORM= ruleEXEC_FORM EOF )
            // InternalMyDsl.g:1147:2: iv_ruleEXEC_FORM= ruleEXEC_FORM EOF
            {
             newCompositeNode(grammarAccess.getEXEC_FORMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEXEC_FORM=ruleEXEC_FORM();

            state._fsp--;

             current =iv_ruleEXEC_FORM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXEC_FORM"


    // $ANTLR start "ruleEXEC_FORM"
    // InternalMyDsl.g:1153:1: ruleEXEC_FORM returns [EObject current=null] : (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' ) ;
    public final EObject ruleEXEC_FORM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_executable_1_0=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1159:2: ( (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' ) )
            // InternalMyDsl.g:1160:2: (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' )
            {
            // InternalMyDsl.g:1160:2: (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' )
            // InternalMyDsl.g:1161:3: otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0());
            		
            // InternalMyDsl.g:1165:3: ( (lv_executable_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1166:4: (lv_executable_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1166:4: (lv_executable_1_0= RULE_STRING )
            // InternalMyDsl.g:1167:5: lv_executable_1_0= RULE_STRING
            {
            lv_executable_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_executable_1_0, grammarAccess.getEXEC_FORMAccess().getExecutableSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEXEC_FORMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"executable",
            						lv_executable_1_0,
            						"org.xtext.example.mydsl.MyDsl.STRING");
            				

            }


            }

            // InternalMyDsl.g:1183:3: ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1184:4: (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER )
            	    {
            	    // InternalMyDsl.g:1184:4: (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER )
            	    // InternalMyDsl.g:1185:5: lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER
            	    {
            	    lv_parameters_2_0=(Token)match(input,RULE_EXEC_FORM_PARAMETER,FOLLOW_20); 

            	    					newLeafNode(lv_parameters_2_0, grammarAccess.getEXEC_FORMAccess().getParametersEXEC_FORM_PARAMETERTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEXEC_FORMRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.EXEC_FORM_PARAMETER");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEXEC_FORMAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXEC_FORM"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000008FFF0022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000008FFE0020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000070000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000440001C02L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000002000L});

}