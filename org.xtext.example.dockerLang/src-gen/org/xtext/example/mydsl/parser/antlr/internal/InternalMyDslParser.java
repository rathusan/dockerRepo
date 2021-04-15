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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_PLATFORM_OPTION", "RULE_SHELL_CMD", "RULE_KV_PAIR_EQUALS", "RULE_CHOWN_OPTION", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_EXEC_FORM_PARAMETER", "RULE_COMMENT", "'FROM '", "'CMD'", "'RUN'", "'ENTRYPOINT'", "'VOLUME'", "'MAINTAINER'", "'EXPOSE'", "'WORKDIR'", "'ENV '", "'LABEL '", "'ADD '", "'?'", "'*'", "'.'", "'COPY '", "'/'", "':'", "'-'", "'@'", "' ['", "']'"
    };
    public static final int RULE_STRING=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SHELL_CMD=6;
    public static final int RULE_ID=9;
    public static final int RULE_COMMENT=13;
    public static final int RULE_CHOWN_OPTION=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_KV_PAIR_EQUALS=7;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=4;
    public static final int RULE_EXEC_FORM_PARAMETER=12;
    public static final int T__20=20;
    public static final int RULE_PLATFORM_OPTION=5;
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
    // InternalMyDsl.g:71:1: ruleDockerfile returns [EObject current=null] : ( ( (lv_statements_0_0= ruleInstruction ) ) this_NL_1= RULE_NL )* ;
    public final EObject ruleDockerfile() throws RecognitionException {
        EObject current = null;

        Token this_NL_1=null;
        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_statements_0_0= ruleInstruction ) ) this_NL_1= RULE_NL )* )
            // InternalMyDsl.g:78:2: ( ( (lv_statements_0_0= ruleInstruction ) ) this_NL_1= RULE_NL )*
            {
            // InternalMyDsl.g:78:2: ( ( (lv_statements_0_0= ruleInstruction ) ) this_NL_1= RULE_NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=24)||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: ( (lv_statements_0_0= ruleInstruction ) ) this_NL_1= RULE_NL
            	    {
            	    // InternalMyDsl.g:79:3: ( (lv_statements_0_0= ruleInstruction ) )
            	    // InternalMyDsl.g:80:4: (lv_statements_0_0= ruleInstruction )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_statements_0_0= ruleInstruction )
            	    // InternalMyDsl.g:81:5: lv_statements_0_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getDockerfileAccess().getStatementsInstructionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDockerfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Instruction");
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


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:106:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:106:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:107:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:113:1: ruleInstruction returns [EObject current=null] : ( ( (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy ) ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_1 = null;

        EObject lv_statement_0_2 = null;

        EObject lv_statement_0_3 = null;

        EObject lv_statement_0_4 = null;

        EObject lv_statement_0_5 = null;

        EObject lv_statement_0_6 = null;

        EObject lv_statement_0_7 = null;

        EObject lv_statement_0_8 = null;

        EObject lv_statement_0_9 = null;

        EObject lv_statement_0_10 = null;

        EObject lv_statement_0_11 = null;

        EObject lv_statement_0_12 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:119:2: ( ( ( (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy ) ) ) )
            // InternalMyDsl.g:120:2: ( ( (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy ) ) )
            {
            // InternalMyDsl.g:120:2: ( ( (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy ) ) )
            // InternalMyDsl.g:121:3: ( (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy ) )
            {
            // InternalMyDsl.g:121:3: ( (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy ) )
            // InternalMyDsl.g:122:4: (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy )
            {
            // InternalMyDsl.g:122:4: (lv_statement_0_1= ruleFrom | lv_statement_0_2= ruleCmd | lv_statement_0_3= ruleEntrypoint | lv_statement_0_4= ruleVolume | lv_statement_0_5= ruleMaintainer | lv_statement_0_6= ruleExpose | lv_statement_0_7= ruleWorkdir | lv_statement_0_8= ruleRun | lv_statement_0_9= ruleEnv | lv_statement_0_10= ruleLabel | lv_statement_0_11= ruleAdd | lv_statement_0_12= ruleCopy )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            case 21:
                {
                alt2=7;
                }
                break;
            case 16:
                {
                alt2=8;
                }
                break;
            case 22:
                {
                alt2=9;
                }
                break;
            case 23:
                {
                alt2=10;
                }
                break;
            case 24:
                {
                alt2=11;
                }
                break;
            case 28:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:123:5: lv_statement_0_1= ruleFrom
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementFromParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_1=ruleFrom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_1,
                    						"org.xtext.example.mydsl.MyDsl.From");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:139:5: lv_statement_0_2= ruleCmd
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementCmdParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_2=ruleCmd();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_2,
                    						"org.xtext.example.mydsl.MyDsl.Cmd");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:155:5: lv_statement_0_3= ruleEntrypoint
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementEntrypointParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_3=ruleEntrypoint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_3,
                    						"org.xtext.example.mydsl.MyDsl.Entrypoint");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:171:5: lv_statement_0_4= ruleVolume
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementVolumeParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_4=ruleVolume();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_4,
                    						"org.xtext.example.mydsl.MyDsl.Volume");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:187:5: lv_statement_0_5= ruleMaintainer
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementMaintainerParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_5=ruleMaintainer();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_5,
                    						"org.xtext.example.mydsl.MyDsl.Maintainer");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:203:5: lv_statement_0_6= ruleExpose
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementExposeParserRuleCall_0_5());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_6=ruleExpose();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_6,
                    						"org.xtext.example.mydsl.MyDsl.Expose");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:219:5: lv_statement_0_7= ruleWorkdir
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementWorkdirParserRuleCall_0_6());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_7=ruleWorkdir();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_7,
                    						"org.xtext.example.mydsl.MyDsl.Workdir");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:235:5: lv_statement_0_8= ruleRun
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementRunParserRuleCall_0_7());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_8=ruleRun();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_8,
                    						"org.xtext.example.mydsl.MyDsl.Run");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:251:5: lv_statement_0_9= ruleEnv
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementEnvParserRuleCall_0_8());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_9=ruleEnv();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_9,
                    						"org.xtext.example.mydsl.MyDsl.Env");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:267:5: lv_statement_0_10= ruleLabel
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementLabelParserRuleCall_0_9());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_10=ruleLabel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_10,
                    						"org.xtext.example.mydsl.MyDsl.Label");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:283:5: lv_statement_0_11= ruleAdd
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementAddParserRuleCall_0_10());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_11=ruleAdd();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_11,
                    						"org.xtext.example.mydsl.MyDsl.Add");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:299:5: lv_statement_0_12= ruleCopy
                    {

                    					newCompositeNode(grammarAccess.getInstructionAccess().getStatementCopyParserRuleCall_0_11());
                    				
                    pushFollow(FOLLOW_2);
                    lv_statement_0_12=ruleCopy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstructionRule());
                    					}
                    					set(
                    						current,
                    						"statement",
                    						lv_statement_0_12,
                    						"org.xtext.example.mydsl.MyDsl.Copy");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleFrom"
    // InternalMyDsl.g:320:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalMyDsl.g:320:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalMyDsl.g:321:2: iv_ruleFrom= ruleFrom EOF
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
    // InternalMyDsl.g:327:1: ruleFrom returns [EObject current=null] : ( ( (lv_key_0_0= 'FROM ' ) ) ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_platform_option_1_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_tag_or_digest_3_1 = null;

        AntlrDatatypeRuleToken lv_tag_or_digest_3_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:333:2: ( ( ( (lv_key_0_0= 'FROM ' ) ) ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? ) )
            // InternalMyDsl.g:334:2: ( ( (lv_key_0_0= 'FROM ' ) ) ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? )
            {
            // InternalMyDsl.g:334:2: ( ( (lv_key_0_0= 'FROM ' ) ) ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? )
            // InternalMyDsl.g:335:3: ( (lv_key_0_0= 'FROM ' ) ) ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )?
            {
            // InternalMyDsl.g:335:3: ( (lv_key_0_0= 'FROM ' ) )
            // InternalMyDsl.g:336:4: (lv_key_0_0= 'FROM ' )
            {
            // InternalMyDsl.g:336:4: (lv_key_0_0= 'FROM ' )
            // InternalMyDsl.g:337:5: lv_key_0_0= 'FROM '
            {
            lv_key_0_0=(Token)match(input,14,FOLLOW_5); 

            					newLeafNode(lv_key_0_0, grammarAccess.getFromAccess().getKeyFROMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "FROM ");
            				

            }


            }

            // InternalMyDsl.g:349:3: ( (lv_platform_option_1_0= RULE_PLATFORM_OPTION ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_PLATFORM_OPTION) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:350:4: (lv_platform_option_1_0= RULE_PLATFORM_OPTION )
                    {
                    // InternalMyDsl.g:350:4: (lv_platform_option_1_0= RULE_PLATFORM_OPTION )
                    // InternalMyDsl.g:351:5: lv_platform_option_1_0= RULE_PLATFORM_OPTION
                    {
                    lv_platform_option_1_0=(Token)match(input,RULE_PLATFORM_OPTION,FOLLOW_5); 

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

            // InternalMyDsl.g:367:3: ( (lv_name_2_0= ruleIMAGE_NAME ) )
            // InternalMyDsl.g:368:4: (lv_name_2_0= ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:368:4: (lv_name_2_0= ruleIMAGE_NAME )
            // InternalMyDsl.g:369:5: lv_name_2_0= ruleIMAGE_NAME
            {

            					newCompositeNode(grammarAccess.getFromAccess().getNameIMAGE_NAMEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalMyDsl.g:386:3: ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30||LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:387:4: ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) )
                    {
                    // InternalMyDsl.g:387:4: ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) )
                    // InternalMyDsl.g:388:5: (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:388:5: (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==30) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==32) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:389:6: lv_tag_or_digest_3_1= ruleIMAGE_TAG
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
                            // InternalMyDsl.g:405:6: lv_tag_or_digest_3_2= ruleIMAGE_DIGEST
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
    // InternalMyDsl.g:427:1: entryRuleCmd returns [EObject current=null] : iv_ruleCmd= ruleCmd EOF ;
    public final EObject entryRuleCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmd = null;


        try {
            // InternalMyDsl.g:427:44: (iv_ruleCmd= ruleCmd EOF )
            // InternalMyDsl.g:428:2: iv_ruleCmd= ruleCmd EOF
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
    // InternalMyDsl.g:434:1: ruleCmd returns [EObject current=null] : ( ( (lv_key_0_0= 'CMD' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) ;
    public final EObject ruleCmd() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_shell_form_2_0=null;
        EObject lv_exec_form_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:440:2: ( ( ( (lv_key_0_0= 'CMD' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) )
            // InternalMyDsl.g:441:2: ( ( (lv_key_0_0= 'CMD' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            {
            // InternalMyDsl.g:441:2: ( ( (lv_key_0_0= 'CMD' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:442:3: ( (lv_key_0_0= 'CMD' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:442:3: ( (lv_key_0_0= 'CMD' ) )
            // InternalMyDsl.g:443:4: (lv_key_0_0= 'CMD' )
            {
            // InternalMyDsl.g:443:4: (lv_key_0_0= 'CMD' )
            // InternalMyDsl.g:444:5: lv_key_0_0= 'CMD'
            {
            lv_key_0_0=(Token)match(input,15,FOLLOW_7); 

            					newLeafNode(lv_key_0_0, grammarAccess.getCmdAccess().getKeyCMDKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "CMD");
            				

            }


            }

            // InternalMyDsl.g:456:3: ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_SHELL_CMD) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:457:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    {
                    // InternalMyDsl.g:457:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    // InternalMyDsl.g:458:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:458:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    // InternalMyDsl.g:459:6: lv_exec_form_1_0= ruleEXEC_FORM
                    {

                    						newCompositeNode(grammarAccess.getCmdAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exec_form_1_0=ruleEXEC_FORM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCmdRule());
                    						}
                    						set(
                    							current,
                    							"exec_form",
                    							lv_exec_form_1_0,
                    							"org.xtext.example.mydsl.MyDsl.EXEC_FORM");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:477:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    {
                    // InternalMyDsl.g:477:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    // InternalMyDsl.g:478:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:478:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    // InternalMyDsl.g:479:6: lv_shell_form_2_0= RULE_SHELL_CMD
                    {
                    lv_shell_form_2_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    						newLeafNode(lv_shell_form_2_0, grammarAccess.getCmdAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCmdRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"shell_form",
                    							lv_shell_form_2_0,
                    							"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
                    					

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
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleRun"
    // InternalMyDsl.g:500:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalMyDsl.g:500:44: (iv_ruleRun= ruleRun EOF )
            // InternalMyDsl.g:501:2: iv_ruleRun= ruleRun EOF
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
    // InternalMyDsl.g:507:1: ruleRun returns [EObject current=null] : ( ( (lv_key_0_0= 'RUN' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_shell_form_2_0=null;
        EObject lv_exec_form_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:513:2: ( ( ( (lv_key_0_0= 'RUN' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) )
            // InternalMyDsl.g:514:2: ( ( (lv_key_0_0= 'RUN' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            {
            // InternalMyDsl.g:514:2: ( ( (lv_key_0_0= 'RUN' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:515:3: ( (lv_key_0_0= 'RUN' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:515:3: ( (lv_key_0_0= 'RUN' ) )
            // InternalMyDsl.g:516:4: (lv_key_0_0= 'RUN' )
            {
            // InternalMyDsl.g:516:4: (lv_key_0_0= 'RUN' )
            // InternalMyDsl.g:517:5: lv_key_0_0= 'RUN'
            {
            lv_key_0_0=(Token)match(input,16,FOLLOW_7); 

            					newLeafNode(lv_key_0_0, grammarAccess.getRunAccess().getKeyRUNKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "RUN");
            				

            }


            }

            // InternalMyDsl.g:529:3: ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
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
                    // InternalMyDsl.g:530:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    {
                    // InternalMyDsl.g:530:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    // InternalMyDsl.g:531:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:531:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    // InternalMyDsl.g:532:6: lv_exec_form_1_0= ruleEXEC_FORM
                    {

                    						newCompositeNode(grammarAccess.getRunAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exec_form_1_0=ruleEXEC_FORM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRunRule());
                    						}
                    						set(
                    							current,
                    							"exec_form",
                    							lv_exec_form_1_0,
                    							"org.xtext.example.mydsl.MyDsl.EXEC_FORM");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:550:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    {
                    // InternalMyDsl.g:550:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    // InternalMyDsl.g:551:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:551:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    // InternalMyDsl.g:552:6: lv_shell_form_2_0= RULE_SHELL_CMD
                    {
                    lv_shell_form_2_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    						newLeafNode(lv_shell_form_2_0, grammarAccess.getRunAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"shell_form",
                    							lv_shell_form_2_0,
                    							"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
                    					

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
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleEntrypoint"
    // InternalMyDsl.g:573:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // InternalMyDsl.g:573:51: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // InternalMyDsl.g:574:2: iv_ruleEntrypoint= ruleEntrypoint EOF
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
    // InternalMyDsl.g:580:1: ruleEntrypoint returns [EObject current=null] : ( ( (lv_key_0_0= 'ENTRYPOINT' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_shell_form_2_0=null;
        EObject lv_exec_form_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:586:2: ( ( ( (lv_key_0_0= 'ENTRYPOINT' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) )
            // InternalMyDsl.g:587:2: ( ( (lv_key_0_0= 'ENTRYPOINT' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            {
            // InternalMyDsl.g:587:2: ( ( (lv_key_0_0= 'ENTRYPOINT' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:588:3: ( (lv_key_0_0= 'ENTRYPOINT' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:588:3: ( (lv_key_0_0= 'ENTRYPOINT' ) )
            // InternalMyDsl.g:589:4: (lv_key_0_0= 'ENTRYPOINT' )
            {
            // InternalMyDsl.g:589:4: (lv_key_0_0= 'ENTRYPOINT' )
            // InternalMyDsl.g:590:5: lv_key_0_0= 'ENTRYPOINT'
            {
            lv_key_0_0=(Token)match(input,17,FOLLOW_7); 

            					newLeafNode(lv_key_0_0, grammarAccess.getEntrypointAccess().getKeyENTRYPOINTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntrypointRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "ENTRYPOINT");
            				

            }


            }

            // InternalMyDsl.g:602:3: ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
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
                    // InternalMyDsl.g:603:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    {
                    // InternalMyDsl.g:603:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    // InternalMyDsl.g:604:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:604:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    // InternalMyDsl.g:605:6: lv_exec_form_1_0= ruleEXEC_FORM
                    {

                    						newCompositeNode(grammarAccess.getEntrypointAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exec_form_1_0=ruleEXEC_FORM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntrypointRule());
                    						}
                    						set(
                    							current,
                    							"exec_form",
                    							lv_exec_form_1_0,
                    							"org.xtext.example.mydsl.MyDsl.EXEC_FORM");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:623:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    {
                    // InternalMyDsl.g:623:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    // InternalMyDsl.g:624:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:624:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    // InternalMyDsl.g:625:6: lv_shell_form_2_0= RULE_SHELL_CMD
                    {
                    lv_shell_form_2_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    						newLeafNode(lv_shell_form_2_0, grammarAccess.getEntrypointAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntrypointRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"shell_form",
                    							lv_shell_form_2_0,
                    							"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
                    					

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
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleVolume"
    // InternalMyDsl.g:646:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalMyDsl.g:646:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalMyDsl.g:647:2: iv_ruleVolume= ruleVolume EOF
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
    // InternalMyDsl.g:653:1: ruleVolume returns [EObject current=null] : ( ( (lv_key_0_0= 'VOLUME' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_shell_form_2_0=null;
        EObject lv_exec_form_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:659:2: ( ( ( (lv_key_0_0= 'VOLUME' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) ) )
            // InternalMyDsl.g:660:2: ( ( (lv_key_0_0= 'VOLUME' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            {
            // InternalMyDsl.g:660:2: ( ( (lv_key_0_0= 'VOLUME' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:661:3: ( (lv_key_0_0= 'VOLUME' ) ) ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:661:3: ( (lv_key_0_0= 'VOLUME' ) )
            // InternalMyDsl.g:662:4: (lv_key_0_0= 'VOLUME' )
            {
            // InternalMyDsl.g:662:4: (lv_key_0_0= 'VOLUME' )
            // InternalMyDsl.g:663:5: lv_key_0_0= 'VOLUME'
            {
            lv_key_0_0=(Token)match(input,18,FOLLOW_7); 

            					newLeafNode(lv_key_0_0, grammarAccess.getVolumeAccess().getKeyVOLUMEKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVolumeRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "VOLUME");
            				

            }


            }

            // InternalMyDsl.g:675:3: ( ( (lv_exec_form_1_0= ruleEXEC_FORM ) ) | ( (lv_shell_form_2_0= RULE_SHELL_CMD ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
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
                    // InternalMyDsl.g:676:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    {
                    // InternalMyDsl.g:676:4: ( (lv_exec_form_1_0= ruleEXEC_FORM ) )
                    // InternalMyDsl.g:677:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:677:5: (lv_exec_form_1_0= ruleEXEC_FORM )
                    // InternalMyDsl.g:678:6: lv_exec_form_1_0= ruleEXEC_FORM
                    {

                    						newCompositeNode(grammarAccess.getVolumeAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exec_form_1_0=ruleEXEC_FORM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVolumeRule());
                    						}
                    						set(
                    							current,
                    							"exec_form",
                    							lv_exec_form_1_0,
                    							"org.xtext.example.mydsl.MyDsl.EXEC_FORM");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:696:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    {
                    // InternalMyDsl.g:696:4: ( (lv_shell_form_2_0= RULE_SHELL_CMD ) )
                    // InternalMyDsl.g:697:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    {
                    // InternalMyDsl.g:697:5: (lv_shell_form_2_0= RULE_SHELL_CMD )
                    // InternalMyDsl.g:698:6: lv_shell_form_2_0= RULE_SHELL_CMD
                    {
                    lv_shell_form_2_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_2); 

                    						newLeafNode(lv_shell_form_2_0, grammarAccess.getVolumeAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVolumeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"shell_form",
                    							lv_shell_form_2_0,
                    							"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
                    					

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
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleMaintainer"
    // InternalMyDsl.g:719:1: entryRuleMaintainer returns [EObject current=null] : iv_ruleMaintainer= ruleMaintainer EOF ;
    public final EObject entryRuleMaintainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaintainer = null;


        try {
            // InternalMyDsl.g:719:51: (iv_ruleMaintainer= ruleMaintainer EOF )
            // InternalMyDsl.g:720:2: iv_ruleMaintainer= ruleMaintainer EOF
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
    // InternalMyDsl.g:726:1: ruleMaintainer returns [EObject current=null] : ( ( (lv_key_0_0= 'MAINTAINER' ) ) ( (lv_name_1_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleMaintainer() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:732:2: ( ( ( (lv_key_0_0= 'MAINTAINER' ) ) ( (lv_name_1_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:733:2: ( ( (lv_key_0_0= 'MAINTAINER' ) ) ( (lv_name_1_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:733:2: ( ( (lv_key_0_0= 'MAINTAINER' ) ) ( (lv_name_1_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:734:3: ( (lv_key_0_0= 'MAINTAINER' ) ) ( (lv_name_1_0= RULE_SHELL_CMD ) )
            {
            // InternalMyDsl.g:734:3: ( (lv_key_0_0= 'MAINTAINER' ) )
            // InternalMyDsl.g:735:4: (lv_key_0_0= 'MAINTAINER' )
            {
            // InternalMyDsl.g:735:4: (lv_key_0_0= 'MAINTAINER' )
            // InternalMyDsl.g:736:5: lv_key_0_0= 'MAINTAINER'
            {
            lv_key_0_0=(Token)match(input,19,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getMaintainerAccess().getKeyMAINTAINERKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaintainerRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "MAINTAINER");
            				

            }


            }

            // InternalMyDsl.g:748:3: ( (lv_name_1_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:749:4: (lv_name_1_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:749:4: (lv_name_1_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:750:5: lv_name_1_0= RULE_SHELL_CMD
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
    // InternalMyDsl.g:770:1: entryRuleExpose returns [EObject current=null] : iv_ruleExpose= ruleExpose EOF ;
    public final EObject entryRuleExpose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpose = null;


        try {
            // InternalMyDsl.g:770:47: (iv_ruleExpose= ruleExpose EOF )
            // InternalMyDsl.g:771:2: iv_ruleExpose= ruleExpose EOF
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
    // InternalMyDsl.g:777:1: ruleExpose returns [EObject current=null] : ( ( (lv_key_0_0= 'EXPOSE' ) ) ( (lv_ports_1_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleExpose() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_ports_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:783:2: ( ( ( (lv_key_0_0= 'EXPOSE' ) ) ( (lv_ports_1_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:784:2: ( ( (lv_key_0_0= 'EXPOSE' ) ) ( (lv_ports_1_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:784:2: ( ( (lv_key_0_0= 'EXPOSE' ) ) ( (lv_ports_1_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:785:3: ( (lv_key_0_0= 'EXPOSE' ) ) ( (lv_ports_1_0= RULE_SHELL_CMD ) )
            {
            // InternalMyDsl.g:785:3: ( (lv_key_0_0= 'EXPOSE' ) )
            // InternalMyDsl.g:786:4: (lv_key_0_0= 'EXPOSE' )
            {
            // InternalMyDsl.g:786:4: (lv_key_0_0= 'EXPOSE' )
            // InternalMyDsl.g:787:5: lv_key_0_0= 'EXPOSE'
            {
            lv_key_0_0=(Token)match(input,20,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getExposeAccess().getKeyEXPOSEKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExposeRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "EXPOSE");
            				

            }


            }

            // InternalMyDsl.g:799:3: ( (lv_ports_1_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:800:4: (lv_ports_1_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:800:4: (lv_ports_1_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:801:5: lv_ports_1_0= RULE_SHELL_CMD
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
    // InternalMyDsl.g:821:1: entryRuleWorkdir returns [EObject current=null] : iv_ruleWorkdir= ruleWorkdir EOF ;
    public final EObject entryRuleWorkdir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkdir = null;


        try {
            // InternalMyDsl.g:821:48: (iv_ruleWorkdir= ruleWorkdir EOF )
            // InternalMyDsl.g:822:2: iv_ruleWorkdir= ruleWorkdir EOF
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
    // InternalMyDsl.g:828:1: ruleWorkdir returns [EObject current=null] : ( ( (lv_key_0_0= 'WORKDIR' ) ) ( (lv_path_1_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleWorkdir() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_path_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:834:2: ( ( ( (lv_key_0_0= 'WORKDIR' ) ) ( (lv_path_1_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:835:2: ( ( (lv_key_0_0= 'WORKDIR' ) ) ( (lv_path_1_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:835:2: ( ( (lv_key_0_0= 'WORKDIR' ) ) ( (lv_path_1_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:836:3: ( (lv_key_0_0= 'WORKDIR' ) ) ( (lv_path_1_0= RULE_SHELL_CMD ) )
            {
            // InternalMyDsl.g:836:3: ( (lv_key_0_0= 'WORKDIR' ) )
            // InternalMyDsl.g:837:4: (lv_key_0_0= 'WORKDIR' )
            {
            // InternalMyDsl.g:837:4: (lv_key_0_0= 'WORKDIR' )
            // InternalMyDsl.g:838:5: lv_key_0_0= 'WORKDIR'
            {
            lv_key_0_0=(Token)match(input,21,FOLLOW_8); 

            					newLeafNode(lv_key_0_0, grammarAccess.getWorkdirAccess().getKeyWORKDIRKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkdirRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "WORKDIR");
            				

            }


            }

            // InternalMyDsl.g:850:3: ( (lv_path_1_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:851:4: (lv_path_1_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:851:4: (lv_path_1_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:852:5: lv_path_1_0= RULE_SHELL_CMD
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
    // InternalMyDsl.g:872:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalMyDsl.g:872:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalMyDsl.g:873:2: iv_ruleEnv= ruleEnv EOF
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
    // InternalMyDsl.g:879:1: ruleEnv returns [EObject current=null] : ( ( (lv_key_0_0= 'ENV ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_key_value_pairs_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:885:2: ( ( ( (lv_key_0_0= 'ENV ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) )
            // InternalMyDsl.g:886:2: ( ( (lv_key_0_0= 'ENV ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            {
            // InternalMyDsl.g:886:2: ( ( (lv_key_0_0= 'ENV ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            // InternalMyDsl.g:887:3: ( (lv_key_0_0= 'ENV ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
            {
            // InternalMyDsl.g:887:3: ( (lv_key_0_0= 'ENV ' ) )
            // InternalMyDsl.g:888:4: (lv_key_0_0= 'ENV ' )
            {
            // InternalMyDsl.g:888:4: (lv_key_0_0= 'ENV ' )
            // InternalMyDsl.g:889:5: lv_key_0_0= 'ENV '
            {
            lv_key_0_0=(Token)match(input,22,FOLLOW_9); 

            					newLeafNode(lv_key_0_0, grammarAccess.getEnvAccess().getKeyENVKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "ENV ");
            				

            }


            }

            // InternalMyDsl.g:901:3: ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_KV_PAIR_EQUALS) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:902:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    {
            	    // InternalMyDsl.g:902:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    // InternalMyDsl.g:903:5: lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS
            	    {
            	    lv_key_value_pairs_1_0=(Token)match(input,RULE_KV_PAIR_EQUALS,FOLLOW_10); 

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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalMyDsl.g:923:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:923:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:924:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalMyDsl.g:930:1: ruleLabel returns [EObject current=null] : ( ( (lv_key_0_0= 'LABEL ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_key_value_pairs_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:936:2: ( ( ( (lv_key_0_0= 'LABEL ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ ) )
            // InternalMyDsl.g:937:2: ( ( (lv_key_0_0= 'LABEL ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            {
            // InternalMyDsl.g:937:2: ( ( (lv_key_0_0= 'LABEL ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+ )
            // InternalMyDsl.g:938:3: ( (lv_key_0_0= 'LABEL ' ) ) ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
            {
            // InternalMyDsl.g:938:3: ( (lv_key_0_0= 'LABEL ' ) )
            // InternalMyDsl.g:939:4: (lv_key_0_0= 'LABEL ' )
            {
            // InternalMyDsl.g:939:4: (lv_key_0_0= 'LABEL ' )
            // InternalMyDsl.g:940:5: lv_key_0_0= 'LABEL '
            {
            lv_key_0_0=(Token)match(input,23,FOLLOW_9); 

            					newLeafNode(lv_key_0_0, grammarAccess.getLabelAccess().getKeyLABELKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "LABEL ");
            				

            }


            }

            // InternalMyDsl.g:952:3: ( (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS ) )+
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
            	    // InternalMyDsl.g:953:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    {
            	    // InternalMyDsl.g:953:4: (lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS )
            	    // InternalMyDsl.g:954:5: lv_key_value_pairs_1_0= RULE_KV_PAIR_EQUALS
            	    {
            	    lv_key_value_pairs_1_0=(Token)match(input,RULE_KV_PAIR_EQUALS,FOLLOW_10); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:974:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMyDsl.g:974:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMyDsl.g:975:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalMyDsl.g:981:1: ruleAdd returns [EObject current=null] : ( ( (lv_key_0_0= 'ADD ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_chown_options_1_0=null;
        Token lv_file_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Token lv_directory_7_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:987:2: ( ( ( (lv_key_0_0= 'ADD ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:988:2: ( ( (lv_key_0_0= 'ADD ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:988:2: ( ( (lv_key_0_0= 'ADD ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:989:3: ( (lv_key_0_0= 'ADD ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )? ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            {
            // InternalMyDsl.g:989:3: ( (lv_key_0_0= 'ADD ' ) )
            // InternalMyDsl.g:990:4: (lv_key_0_0= 'ADD ' )
            {
            // InternalMyDsl.g:990:4: (lv_key_0_0= 'ADD ' )
            // InternalMyDsl.g:991:5: lv_key_0_0= 'ADD '
            {
            lv_key_0_0=(Token)match(input,24,FOLLOW_11); 

            					newLeafNode(lv_key_0_0, grammarAccess.getAddAccess().getKeyADDKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "ADD ");
            				

            }


            }

            // InternalMyDsl.g:1003:3: ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CHOWN_OPTION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1004:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    {
                    // InternalMyDsl.g:1004:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    // InternalMyDsl.g:1005:5: lv_chown_options_1_0= RULE_CHOWN_OPTION
                    {
                    lv_chown_options_1_0=(Token)match(input,RULE_CHOWN_OPTION,FOLLOW_12); 

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

            // InternalMyDsl.g:1021:3: ( (lv_file_2_0= RULE_ID ) )
            // InternalMyDsl.g:1022:4: (lv_file_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1022:4: (lv_file_2_0= RULE_ID )
            // InternalMyDsl.g:1023:5: lv_file_2_0= RULE_ID
            {
            lv_file_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMyDsl.g:1039:3: ( (otherlv_3= '?' | otherlv_4= '*' ) | (otherlv_5= '.' this_ID_6= RULE_ID ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=25 && LA14_0<=26)) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1040:4: (otherlv_3= '?' | otherlv_4= '*' )
                    {
                    // InternalMyDsl.g:1040:4: (otherlv_3= '?' | otherlv_4= '*' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==26) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:1041:5: otherlv_3= '?'
                            {
                            otherlv_3=(Token)match(input,25,FOLLOW_8); 

                            					newLeafNode(otherlv_3, grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1046:5: otherlv_4= '*'
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_8); 

                            					newLeafNode(otherlv_4, grammarAccess.getAddAccess().getAsteriskKeyword_3_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1052:4: (otherlv_5= '.' this_ID_6= RULE_ID )
                    {
                    // InternalMyDsl.g:1052:4: (otherlv_5= '.' this_ID_6= RULE_ID )
                    // InternalMyDsl.g:1053:5: otherlv_5= '.' this_ID_6= RULE_ID
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_12); 

                    					newLeafNode(otherlv_5, grammarAccess.getAddAccess().getFullStopKeyword_3_1_0());
                    				
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    					newLeafNode(this_ID_6, grammarAccess.getAddAccess().getIDTerminalRuleCall_3_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1063:3: ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1064:4: (lv_directory_7_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1064:4: (lv_directory_7_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:1065:5: lv_directory_7_0= RULE_SHELL_CMD
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
    // InternalMyDsl.g:1085:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalMyDsl.g:1085:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalMyDsl.g:1086:2: iv_ruleCopy= ruleCopy EOF
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
    // InternalMyDsl.g:1092:1: ruleCopy returns [EObject current=null] : ( ( (lv_key_0_0= 'COPY ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_chown_options_1_0=null;
        Token lv_file_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Token lv_directory_7_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1098:2: ( ( ( (lv_key_0_0= 'COPY ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) ) )
            // InternalMyDsl.g:1099:2: ( ( (lv_key_0_0= 'COPY ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            {
            // InternalMyDsl.g:1099:2: ( ( (lv_key_0_0= 'COPY ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) ) )
            // InternalMyDsl.g:1100:3: ( (lv_key_0_0= 'COPY ' ) ) ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )? ( (lv_file_2_0= RULE_ID ) ) (otherlv_3= '?' | otherlv_4= '*' )? (otherlv_5= '.' this_ID_6= RULE_ID )? ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            {
            // InternalMyDsl.g:1100:3: ( (lv_key_0_0= 'COPY ' ) )
            // InternalMyDsl.g:1101:4: (lv_key_0_0= 'COPY ' )
            {
            // InternalMyDsl.g:1101:4: (lv_key_0_0= 'COPY ' )
            // InternalMyDsl.g:1102:5: lv_key_0_0= 'COPY '
            {
            lv_key_0_0=(Token)match(input,28,FOLLOW_11); 

            					newLeafNode(lv_key_0_0, grammarAccess.getCopyAccess().getKeyCOPYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            					setWithLastConsumed(current, "key", lv_key_0_0, "COPY ");
            				

            }


            }

            // InternalMyDsl.g:1114:3: ( (lv_chown_options_1_0= RULE_CHOWN_OPTION ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_CHOWN_OPTION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1115:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    {
                    // InternalMyDsl.g:1115:4: (lv_chown_options_1_0= RULE_CHOWN_OPTION )
                    // InternalMyDsl.g:1116:5: lv_chown_options_1_0= RULE_CHOWN_OPTION
                    {
                    lv_chown_options_1_0=(Token)match(input,RULE_CHOWN_OPTION,FOLLOW_12); 

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

            // InternalMyDsl.g:1132:3: ( (lv_file_2_0= RULE_ID ) )
            // InternalMyDsl.g:1133:4: (lv_file_2_0= RULE_ID )
            {
            // InternalMyDsl.g:1133:4: (lv_file_2_0= RULE_ID )
            // InternalMyDsl.g:1134:5: lv_file_2_0= RULE_ID
            {
            lv_file_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMyDsl.g:1150:3: (otherlv_3= '?' | otherlv_4= '*' )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1151:4: otherlv_3= '?'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1156:4: otherlv_4= '*'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getCopyAccess().getAsteriskKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1161:3: (otherlv_5= '.' this_ID_6= RULE_ID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1162:4: otherlv_5= '.' this_ID_6= RULE_ID
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getFullStopKeyword_4_0());
                    			
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    				newLeafNode(this_ID_6, grammarAccess.getCopyAccess().getIDTerminalRuleCall_4_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1171:3: ( (lv_directory_7_0= RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1172:4: (lv_directory_7_0= RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1172:4: (lv_directory_7_0= RULE_SHELL_CMD )
            // InternalMyDsl.g:1173:5: lv_directory_7_0= RULE_SHELL_CMD
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
    // InternalMyDsl.g:1193:1: entryRuleIMAGE_NAME returns [String current=null] : iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF ;
    public final String entryRuleIMAGE_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_NAME = null;


        try {
            // InternalMyDsl.g:1193:50: (iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF )
            // InternalMyDsl.g:1194:2: iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF
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
    // InternalMyDsl.g:1200:1: ruleIMAGE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIMAGE_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1206:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // InternalMyDsl.g:1207:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // InternalMyDsl.g:1207:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // InternalMyDsl.g:1208:3: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1215:3: (kw= '/' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1216:4: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1233:1: entryRuleIMAGE_TAG returns [String current=null] : iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF ;
    public final String entryRuleIMAGE_TAG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_TAG = null;


        try {
            // InternalMyDsl.g:1233:49: (iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF )
            // InternalMyDsl.g:1234:2: iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF
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
    // InternalMyDsl.g:1240:1: ruleIMAGE_TAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) ;
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
            // InternalMyDsl.g:1246:2: ( (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) )
            // InternalMyDsl.g:1247:2: (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            {
            // InternalMyDsl.g:1247:2: (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            // InternalMyDsl.g:1248:3: kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            {
            kw=(Token)match(input,30,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:1253:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1254:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1262:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_17); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1270:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1278:3: (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            loop20:
            do {
                int alt20=6;
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
                case 31:
                    {
                    alt20=4;
                    }
                    break;
                case 27:
                    {
                    alt20=5;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1279:4: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1287:4: this_INT_5= RULE_INT
            	    {
            	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    				current.merge(this_INT_5);
            	    			

            	    				newLeafNode(this_INT_5, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1295:4: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    				current.merge(this_STRING_6);
            	    			

            	    				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:1303:4: kw= '-'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:1309:4: kw= '.'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:1319:1: entryRuleIMAGE_DIGEST returns [String current=null] : iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF ;
    public final String entryRuleIMAGE_DIGEST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_DIGEST = null;


        try {
            // InternalMyDsl.g:1319:52: (iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF )
            // InternalMyDsl.g:1320:2: iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF
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
    // InternalMyDsl.g:1326:1: ruleIMAGE_DIGEST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) ;
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
            // InternalMyDsl.g:1332:2: ( (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) )
            // InternalMyDsl.g:1333:2: (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            {
            // InternalMyDsl.g:1333:2: (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            // InternalMyDsl.g:1334:3: kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            {
            kw=(Token)match(input,32,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0());
            		
            // InternalMyDsl.g:1339:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            int alt21=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1340:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1348:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_17); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1356:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1364:3: (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            loop22:
            do {
                int alt22=6;
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
                case 31:
                    {
                    alt22=4;
                    }
                    break;
                case 27:
                    {
                    alt22=5;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1365:4: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1373:4: this_INT_5= RULE_INT
            	    {
            	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    				current.merge(this_INT_5);
            	    			

            	    				newLeafNode(this_INT_5, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1381:4: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    				current.merge(this_STRING_6);
            	    			

            	    				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:1389:4: kw= '-'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:1395:4: kw= '.'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMyDsl.g:1405:1: entryRuleEXEC_FORM returns [EObject current=null] : iv_ruleEXEC_FORM= ruleEXEC_FORM EOF ;
    public final EObject entryRuleEXEC_FORM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXEC_FORM = null;


        try {
            // InternalMyDsl.g:1405:50: (iv_ruleEXEC_FORM= ruleEXEC_FORM EOF )
            // InternalMyDsl.g:1406:2: iv_ruleEXEC_FORM= ruleEXEC_FORM EOF
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
    // InternalMyDsl.g:1412:1: ruleEXEC_FORM returns [EObject current=null] : (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' ) ;
    public final EObject ruleEXEC_FORM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_executable_1_0=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1418:2: ( (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' ) )
            // InternalMyDsl.g:1419:2: (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' )
            {
            // InternalMyDsl.g:1419:2: (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' )
            // InternalMyDsl.g:1420:3: otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0());
            		
            // InternalMyDsl.g:1424:3: ( (lv_executable_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1425:4: (lv_executable_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1425:4: (lv_executable_1_0= RULE_STRING )
            // InternalMyDsl.g:1426:5: lv_executable_1_0= RULE_STRING
            {
            lv_executable_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalMyDsl.g:1442:3: ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1443:4: (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER )
            	    {
            	    // InternalMyDsl.g:1443:4: (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER )
            	    // InternalMyDsl.g:1444:5: lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER
            	    {
            	    lv_parameters_2_0=(Token)match(input,RULE_EXEC_FORM_PARAMETER,FOLLOW_19); 

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
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000011FFC002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000140000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000088000E02L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400001000L});

}