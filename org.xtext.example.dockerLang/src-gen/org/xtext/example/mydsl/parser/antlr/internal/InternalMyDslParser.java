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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_EXEC_FORM_PARAMETER", "RULE_SHELL_CMD", "RULE_CONTINUE_NL", "RULE_WS", "RULE_ANY_OTHER", "'FROM '", "'CMD'", "'/'", "':'", "'-'", "'.'", "'@'", "'--platform='", "' ['", "']'"
    };
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
    public static final int RULE_SHELL_CMD=8;
    public static final int RULE_WS=10;
    public static final int RULE_CONTINUE_NL=9;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_EXEC_FORM_PARAMETER=7;
    public static final int T__20=20;
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
    // InternalMyDsl.g:71:1: ruleDockerfile returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalMyDsl.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalMyDsl.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0());
            	    			
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
    // InternalMyDsl.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:101:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:107:1: ruleStatement returns [EObject current=null] : (this_From_0= ruleFrom | this_Cmd_1= ruleCmd ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_From_0 = null;

        EObject this_Cmd_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_From_0= ruleFrom | this_Cmd_1= ruleCmd ) )
            // InternalMyDsl.g:114:2: (this_From_0= ruleFrom | this_Cmd_1= ruleCmd )
            {
            // InternalMyDsl.g:114:2: (this_From_0= ruleFrom | this_Cmd_1= ruleCmd )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_From_0= ruleFrom
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFromParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_From_0=ruleFrom();

                    state._fsp--;


                    			current = this_From_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Cmd_1= ruleCmd
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCmdParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cmd_1=ruleCmd();

                    state._fsp--;


                    			current = this_Cmd_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // InternalMyDsl.g:136:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalMyDsl.g:136:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalMyDsl.g:137:2: iv_ruleFrom= ruleFrom EOF
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
    // InternalMyDsl.g:143:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= rulePLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_platform_option_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_tag_or_digest_3_1 = null;

        AntlrDatatypeRuleToken lv_tag_or_digest_3_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= rulePLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= rulePLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'FROM ' ( (lv_platform_option_1_0= rulePLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )? )
            // InternalMyDsl.g:151:3: otherlv_0= 'FROM ' ( (lv_platform_option_1_0= rulePLATFORM_OPTION ) )? ( (lv_name_2_0= ruleIMAGE_NAME ) ) ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_platform_option_1_0= rulePLATFORM_OPTION ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:156:4: (lv_platform_option_1_0= rulePLATFORM_OPTION )
                    {
                    // InternalMyDsl.g:156:4: (lv_platform_option_1_0= rulePLATFORM_OPTION )
                    // InternalMyDsl.g:157:5: lv_platform_option_1_0= rulePLATFORM_OPTION
                    {

                    					newCompositeNode(grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_platform_option_1_0=rulePLATFORM_OPTION();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFromRule());
                    					}
                    					set(
                    						current,
                    						"platform_option",
                    						lv_platform_option_1_0,
                    						"org.xtext.example.mydsl.MyDsl.PLATFORM_OPTION");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:174:3: ( (lv_name_2_0= ruleIMAGE_NAME ) )
            // InternalMyDsl.g:175:4: (lv_name_2_0= ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:175:4: (lv_name_2_0= ruleIMAGE_NAME )
            // InternalMyDsl.g:176:5: lv_name_2_0= ruleIMAGE_NAME
            {

            					newCompositeNode(grammarAccess.getFromAccess().getNameIMAGE_NAMEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalMyDsl.g:193:3: ( ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15||LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:194:4: ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) )
                    {
                    // InternalMyDsl.g:194:4: ( (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST ) )
                    // InternalMyDsl.g:195:5: (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:195:5: (lv_tag_or_digest_3_1= ruleIMAGE_TAG | lv_tag_or_digest_3_2= ruleIMAGE_DIGEST )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==15) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==18) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:196:6: lv_tag_or_digest_3_1= ruleIMAGE_TAG
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
                            // InternalMyDsl.g:212:6: lv_tag_or_digest_3_2= ruleIMAGE_DIGEST
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
    // InternalMyDsl.g:234:1: entryRuleCmd returns [EObject current=null] : iv_ruleCmd= ruleCmd EOF ;
    public final EObject entryRuleCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmd = null;


        try {
            // InternalMyDsl.g:234:44: (iv_ruleCmd= ruleCmd EOF )
            // InternalMyDsl.g:235:2: iv_ruleCmd= ruleCmd EOF
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
    // InternalMyDsl.g:241:1: ruleCmd returns [EObject current=null] : (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () ruleSHELL_FORM ) ) ) ;
    public final EObject ruleCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_EXEC_FORM_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:247:2: ( (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () ruleSHELL_FORM ) ) ) )
            // InternalMyDsl.g:248:2: (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () ruleSHELL_FORM ) ) )
            {
            // InternalMyDsl.g:248:2: (otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () ruleSHELL_FORM ) ) )
            // InternalMyDsl.g:249:3: otherlv_0= 'CMD' (this_EXEC_FORM_1= ruleEXEC_FORM | ( () ruleSHELL_FORM ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCmdAccess().getCMDKeyword_0());
            		
            // InternalMyDsl.g:253:3: (this_EXEC_FORM_1= ruleEXEC_FORM | ( () ruleSHELL_FORM ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
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
                    // InternalMyDsl.g:254:4: this_EXEC_FORM_1= ruleEXEC_FORM
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
                    // InternalMyDsl.g:263:4: ( () ruleSHELL_FORM )
                    {
                    // InternalMyDsl.g:263:4: ( () ruleSHELL_FORM )
                    // InternalMyDsl.g:264:5: () ruleSHELL_FORM
                    {
                    // InternalMyDsl.g:264:5: ()
                    // InternalMyDsl.g:265:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getCmdAccess().getCmdAction_1_1_0(),
                    							current);
                    					

                    }


                    					newCompositeNode(grammarAccess.getCmdAccess().getSHELL_FORMParserRuleCall_1_1_1());
                    				
                    pushFollow(FOLLOW_2);
                    ruleSHELL_FORM();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

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


    // $ANTLR start "entryRuleIMAGE_NAME"
    // InternalMyDsl.g:284:1: entryRuleIMAGE_NAME returns [String current=null] : iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF ;
    public final String entryRuleIMAGE_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_NAME = null;


        try {
            // InternalMyDsl.g:284:50: (iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF )
            // InternalMyDsl.g:285:2: iv_ruleIMAGE_NAME= ruleIMAGE_NAME EOF
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
    // InternalMyDsl.g:291:1: ruleIMAGE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIMAGE_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:297:2: ( (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* ) )
            // InternalMyDsl.g:298:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            {
            // InternalMyDsl.g:298:2: (this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )* )
            // InternalMyDsl.g:299:3: this_ID_0= RULE_ID (kw= '/' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:306:3: (kw= '/' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:307:4: kw= '/' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:324:1: entryRuleIMAGE_TAG returns [String current=null] : iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF ;
    public final String entryRuleIMAGE_TAG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_TAG = null;


        try {
            // InternalMyDsl.g:324:49: (iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF )
            // InternalMyDsl.g:325:2: iv_ruleIMAGE_TAG= ruleIMAGE_TAG EOF
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
    // InternalMyDsl.g:331:1: ruleIMAGE_TAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) ;
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
            // InternalMyDsl.g:337:2: ( (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) )
            // InternalMyDsl.g:338:2: (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            {
            // InternalMyDsl.g:338:2: (kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            // InternalMyDsl.g:339:3: kw= ':' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            {
            kw=(Token)match(input,15,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0());
            		
            // InternalMyDsl.g:344:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:345:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:353:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:361:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:369:3: (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            loop9:
            do {
                int alt9=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt9=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt9=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt9=3;
                    }
                    break;
                case 16:
                    {
                    alt9=4;
                    }
                    break;
                case 17:
                    {
                    alt9=5;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:370:4: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:378:4: this_INT_5= RULE_INT
            	    {
            	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_10); 

            	    				current.merge(this_INT_5);
            	    			

            	    				newLeafNode(this_INT_5, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:386:4: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    				current.merge(this_STRING_6);
            	    			

            	    				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:394:4: kw= '-'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:400:4: kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:410:1: entryRuleIMAGE_DIGEST returns [String current=null] : iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF ;
    public final String entryRuleIMAGE_DIGEST() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGE_DIGEST = null;


        try {
            // InternalMyDsl.g:410:52: (iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF )
            // InternalMyDsl.g:411:2: iv_ruleIMAGE_DIGEST= ruleIMAGE_DIGEST EOF
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
    // InternalMyDsl.g:417:1: ruleIMAGE_DIGEST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) ;
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
            // InternalMyDsl.g:423:2: ( (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* ) )
            // InternalMyDsl.g:424:2: (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            {
            // InternalMyDsl.g:424:2: (kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )* )
            // InternalMyDsl.g:425:3: kw= '@' (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING ) (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            {
            kw=(Token)match(input,18,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0());
            		
            // InternalMyDsl.g:430:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
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
                    // InternalMyDsl.g:431:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:439:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_10); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:447:4: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    				current.merge(this_STRING_3);
                    			

                    				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:455:3: (this_ID_4= RULE_ID | this_INT_5= RULE_INT | this_STRING_6= RULE_STRING | kw= '-' | kw= '.' )*
            loop11:
            do {
                int alt11=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt11=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt11=3;
                    }
                    break;
                case 16:
                    {
                    alt11=4;
                    }
                    break;
                case 17:
                    {
                    alt11=5;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:456:4: this_ID_4= RULE_ID
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:464:4: this_INT_5= RULE_INT
            	    {
            	    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_10); 

            	    				current.merge(this_INT_5);
            	    			

            	    				newLeafNode(this_INT_5, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:472:4: this_STRING_6= RULE_STRING
            	    {
            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    				current.merge(this_STRING_6);
            	    			

            	    				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:480:4: kw= '-'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:486:4: kw= '.'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRulePLATFORM_OPTION"
    // InternalMyDsl.g:496:1: entryRulePLATFORM_OPTION returns [String current=null] : iv_rulePLATFORM_OPTION= rulePLATFORM_OPTION EOF ;
    public final String entryRulePLATFORM_OPTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLATFORM_OPTION = null;


        try {
            // InternalMyDsl.g:496:55: (iv_rulePLATFORM_OPTION= rulePLATFORM_OPTION EOF )
            // InternalMyDsl.g:497:2: iv_rulePLATFORM_OPTION= rulePLATFORM_OPTION EOF
            {
             newCompositeNode(grammarAccess.getPLATFORM_OPTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePLATFORM_OPTION=rulePLATFORM_OPTION();

            state._fsp--;

             current =iv_rulePLATFORM_OPTION.getText(); 
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
    // $ANTLR end "entryRulePLATFORM_OPTION"


    // $ANTLR start "rulePLATFORM_OPTION"
    // InternalMyDsl.g:503:1: rulePLATFORM_OPTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '--platform=' this_IMAGE_NAME_1= ruleIMAGE_NAME ) ;
    public final AntlrDatatypeRuleToken rulePLATFORM_OPTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IMAGE_NAME_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:509:2: ( (kw= '--platform=' this_IMAGE_NAME_1= ruleIMAGE_NAME ) )
            // InternalMyDsl.g:510:2: (kw= '--platform=' this_IMAGE_NAME_1= ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:510:2: (kw= '--platform=' this_IMAGE_NAME_1= ruleIMAGE_NAME )
            // InternalMyDsl.g:511:3: kw= '--platform=' this_IMAGE_NAME_1= ruleIMAGE_NAME
            {
            kw=(Token)match(input,19,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPLATFORM_OPTIONAccess().getPlatformKeyword_0());
            		

            			newCompositeNode(grammarAccess.getPLATFORM_OPTIONAccess().getIMAGE_NAMEParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_IMAGE_NAME_1=ruleIMAGE_NAME();

            state._fsp--;


            			current.merge(this_IMAGE_NAME_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "rulePLATFORM_OPTION"


    // $ANTLR start "entryRuleEXEC_FORM"
    // InternalMyDsl.g:530:1: entryRuleEXEC_FORM returns [EObject current=null] : iv_ruleEXEC_FORM= ruleEXEC_FORM EOF ;
    public final EObject entryRuleEXEC_FORM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXEC_FORM = null;


        try {
            // InternalMyDsl.g:530:50: (iv_ruleEXEC_FORM= ruleEXEC_FORM EOF )
            // InternalMyDsl.g:531:2: iv_ruleEXEC_FORM= ruleEXEC_FORM EOF
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
    // InternalMyDsl.g:537:1: ruleEXEC_FORM returns [EObject current=null] : (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' ) ;
    public final EObject ruleEXEC_FORM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_executable_1_0=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:543:2: ( (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' ) )
            // InternalMyDsl.g:544:2: (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' )
            {
            // InternalMyDsl.g:544:2: (otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']' )
            // InternalMyDsl.g:545:3: otherlv_0= ' [' ( (lv_executable_1_0= RULE_STRING ) ) ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )* otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0());
            		
            // InternalMyDsl.g:549:3: ( (lv_executable_1_0= RULE_STRING ) )
            // InternalMyDsl.g:550:4: (lv_executable_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:550:4: (lv_executable_1_0= RULE_STRING )
            // InternalMyDsl.g:551:5: lv_executable_1_0= RULE_STRING
            {
            lv_executable_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            // InternalMyDsl.g:567:3: ( (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:568:4: (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER )
            	    {
            	    // InternalMyDsl.g:568:4: (lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER )
            	    // InternalMyDsl.g:569:5: lv_parameters_2_0= RULE_EXEC_FORM_PARAMETER
            	    {
            	    lv_parameters_2_0=(Token)match(input,RULE_EXEC_FORM_PARAMETER,FOLLOW_12); 

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
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSHELL_FORM"
    // InternalMyDsl.g:593:1: entryRuleSHELL_FORM returns [String current=null] : iv_ruleSHELL_FORM= ruleSHELL_FORM EOF ;
    public final String entryRuleSHELL_FORM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSHELL_FORM = null;


        try {
            // InternalMyDsl.g:593:50: (iv_ruleSHELL_FORM= ruleSHELL_FORM EOF )
            // InternalMyDsl.g:594:2: iv_ruleSHELL_FORM= ruleSHELL_FORM EOF
            {
             newCompositeNode(grammarAccess.getSHELL_FORMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSHELL_FORM=ruleSHELL_FORM();

            state._fsp--;

             current =iv_ruleSHELL_FORM.getText(); 
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
    // $ANTLR end "entryRuleSHELL_FORM"


    // $ANTLR start "ruleSHELL_FORM"
    // InternalMyDsl.g:600:1: ruleSHELL_FORM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SHELL_CMD_0= RULE_SHELL_CMD (this_CONTINUE_NL_1= RULE_CONTINUE_NL this_SHELL_CMD_2= RULE_SHELL_CMD )* ) ;
    public final AntlrDatatypeRuleToken ruleSHELL_FORM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SHELL_CMD_0=null;
        Token this_CONTINUE_NL_1=null;
        Token this_SHELL_CMD_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:606:2: ( (this_SHELL_CMD_0= RULE_SHELL_CMD (this_CONTINUE_NL_1= RULE_CONTINUE_NL this_SHELL_CMD_2= RULE_SHELL_CMD )* ) )
            // InternalMyDsl.g:607:2: (this_SHELL_CMD_0= RULE_SHELL_CMD (this_CONTINUE_NL_1= RULE_CONTINUE_NL this_SHELL_CMD_2= RULE_SHELL_CMD )* )
            {
            // InternalMyDsl.g:607:2: (this_SHELL_CMD_0= RULE_SHELL_CMD (this_CONTINUE_NL_1= RULE_CONTINUE_NL this_SHELL_CMD_2= RULE_SHELL_CMD )* )
            // InternalMyDsl.g:608:3: this_SHELL_CMD_0= RULE_SHELL_CMD (this_CONTINUE_NL_1= RULE_CONTINUE_NL this_SHELL_CMD_2= RULE_SHELL_CMD )*
            {
            this_SHELL_CMD_0=(Token)match(input,RULE_SHELL_CMD,FOLLOW_13); 

            			current.merge(this_SHELL_CMD_0);
            		

            			newLeafNode(this_SHELL_CMD_0, grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:615:3: (this_CONTINUE_NL_1= RULE_CONTINUE_NL this_SHELL_CMD_2= RULE_SHELL_CMD )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_CONTINUE_NL) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:616:4: this_CONTINUE_NL_1= RULE_CONTINUE_NL this_SHELL_CMD_2= RULE_SHELL_CMD
            	    {
            	    this_CONTINUE_NL_1=(Token)match(input,RULE_CONTINUE_NL,FOLLOW_14); 

            	    				current.merge(this_CONTINUE_NL_1);
            	    			

            	    				newLeafNode(this_CONTINUE_NL_1, grammarAccess.getSHELL_FORMAccess().getCONTINUE_NLTerminalRuleCall_1_0());
            	    			
            	    this_SHELL_CMD_2=(Token)match(input,RULE_SHELL_CMD,FOLLOW_13); 

            	    				current.merge(this_SHELL_CMD_2);
            	    			

            	    				newLeafNode(this_SHELL_CMD_2, grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleSHELL_FORM"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030072L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});

}