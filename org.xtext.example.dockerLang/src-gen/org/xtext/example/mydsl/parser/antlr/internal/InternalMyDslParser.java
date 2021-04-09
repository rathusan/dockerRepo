package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'Hello'", "'Hi'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

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
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalMyDsl.g:79:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalMyDsl.g:81:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Greeting");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:101:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalMyDsl.g:101:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalMyDsl.g:102:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:108:1: ruleGreeting returns [EObject current=null] : ( ( (lv_greeting_0_0= ruleTypeOfGreeting ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_greeting_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( ( ( (lv_greeting_0_0= ruleTypeOfGreeting ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalMyDsl.g:115:2: ( ( (lv_greeting_0_0= ruleTypeOfGreeting ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalMyDsl.g:115:2: ( ( (lv_greeting_0_0= ruleTypeOfGreeting ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // InternalMyDsl.g:116:3: ( (lv_greeting_0_0= ruleTypeOfGreeting ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            // InternalMyDsl.g:116:3: ( (lv_greeting_0_0= ruleTypeOfGreeting ) )
            // InternalMyDsl.g:117:4: (lv_greeting_0_0= ruleTypeOfGreeting )
            {
            // InternalMyDsl.g:117:4: (lv_greeting_0_0= ruleTypeOfGreeting )
            // InternalMyDsl.g:118:5: lv_greeting_0_0= ruleTypeOfGreeting
            {

            					newCompositeNode(grammarAccess.getGreetingAccess().getGreetingTypeOfGreetingEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_greeting_0_0=ruleTypeOfGreeting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreetingRule());
            					}
            					set(
            						current,
            						"greeting",
            						lv_greeting_0_0,
            						"org.xtext.example.mydsl.MyDsl.TypeOfGreeting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:135:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:136:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:136:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:137:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
            		

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "ruleTypeOfGreeting"
    // InternalMyDsl.g:161:1: ruleTypeOfGreeting returns [Enumerator current=null] : ( (enumLiteral_0= 'Hello' ) | (enumLiteral_1= 'Hi' ) ) ;
    public final Enumerator ruleTypeOfGreeting() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:167:2: ( ( (enumLiteral_0= 'Hello' ) | (enumLiteral_1= 'Hi' ) ) )
            // InternalMyDsl.g:168:2: ( (enumLiteral_0= 'Hello' ) | (enumLiteral_1= 'Hi' ) )
            {
            // InternalMyDsl.g:168:2: ( (enumLiteral_0= 'Hello' ) | (enumLiteral_1= 'Hi' ) )
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
                    // InternalMyDsl.g:169:3: (enumLiteral_0= 'Hello' )
                    {
                    // InternalMyDsl.g:169:3: (enumLiteral_0= 'Hello' )
                    // InternalMyDsl.g:170:4: enumLiteral_0= 'Hello'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfGreetingAccess().getHelloEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfGreetingAccess().getHelloEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:177:3: (enumLiteral_1= 'Hi' )
                    {
                    // InternalMyDsl.g:177:3: (enumLiteral_1= 'Hi' )
                    // InternalMyDsl.g:178:4: enumLiteral_1= 'Hi'
                    {
                    enumLiteral_1=(Token)match(input,13,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfGreetingAccess().getHiEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfGreetingAccess().getHiEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleTypeOfGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});

}