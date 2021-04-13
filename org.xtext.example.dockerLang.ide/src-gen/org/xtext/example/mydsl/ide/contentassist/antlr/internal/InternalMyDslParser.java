package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SHELL_CMD", "RULE_CONTINUE_NL", "RULE_EXEC_FORM_PARAMETER", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'FROM '", "'CMD'", "'/'", "':'", "'@'", "'--platform='", "' ['", "']'"
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDockerfile"
    // InternalMyDsl.g:53:1: entryRuleDockerfile : ruleDockerfile EOF ;
    public final void entryRuleDockerfile() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDockerfile EOF )
            // InternalMyDsl.g:55:1: ruleDockerfile EOF
            {
             before(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_1);
            ruleDockerfile();

            state._fsp--;

             after(grammarAccess.getDockerfileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // InternalMyDsl.g:62:1: ruleDockerfile : ( ( rule__Dockerfile__StatementsAssignment )* ) ;
    public final void ruleDockerfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Dockerfile__StatementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Dockerfile__StatementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Dockerfile__StatementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Dockerfile__StatementsAssignment )*
            {
             before(grammarAccess.getDockerfileAccess().getStatementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Dockerfile__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Dockerfile__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Dockerfile__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDockerfileAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStatement EOF )
            // InternalMyDsl.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Statement__Alternatives )
            // InternalMyDsl.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleFrom"
    // InternalMyDsl.g:103:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleFrom EOF )
            // InternalMyDsl.g:105:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalMyDsl.g:112:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__From__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__From__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__From__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__From__Group__0 )
            // InternalMyDsl.g:119:4: rule__From__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleCmd"
    // InternalMyDsl.g:128:1: entryRuleCmd : ruleCmd EOF ;
    public final void entryRuleCmd() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleCmd EOF )
            // InternalMyDsl.g:130:1: ruleCmd EOF
            {
             before(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_1);
            ruleCmd();

            state._fsp--;

             after(grammarAccess.getCmdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // InternalMyDsl.g:137:1: ruleCmd : ( ( rule__Cmd__Group__0 ) ) ;
    public final void ruleCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Cmd__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Cmd__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Cmd__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Cmd__Group__0 )
            {
             before(grammarAccess.getCmdAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Cmd__Group__0 )
            // InternalMyDsl.g:144:4: rule__Cmd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleIMAGE_NAME"
    // InternalMyDsl.g:153:1: entryRuleIMAGE_NAME : ruleIMAGE_NAME EOF ;
    public final void entryRuleIMAGE_NAME() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleIMAGE_NAME EOF )
            // InternalMyDsl.g:155:1: ruleIMAGE_NAME EOF
            {
             before(grammarAccess.getIMAGE_NAMERule()); 
            pushFollow(FOLLOW_1);
            ruleIMAGE_NAME();

            state._fsp--;

             after(grammarAccess.getIMAGE_NAMERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIMAGE_NAME"


    // $ANTLR start "ruleIMAGE_NAME"
    // InternalMyDsl.g:162:1: ruleIMAGE_NAME : ( ( rule__IMAGE_NAME__Group__0 ) ) ;
    public final void ruleIMAGE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__IMAGE_NAME__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__IMAGE_NAME__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__IMAGE_NAME__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__IMAGE_NAME__Group__0 )
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__IMAGE_NAME__Group__0 )
            // InternalMyDsl.g:169:4: rule__IMAGE_NAME__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIMAGE_NAMEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIMAGE_NAME"


    // $ANTLR start "entryRuleIMAGE_TAG"
    // InternalMyDsl.g:178:1: entryRuleIMAGE_TAG : ruleIMAGE_TAG EOF ;
    public final void entryRuleIMAGE_TAG() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleIMAGE_TAG EOF )
            // InternalMyDsl.g:180:1: ruleIMAGE_TAG EOF
            {
             before(grammarAccess.getIMAGE_TAGRule()); 
            pushFollow(FOLLOW_1);
            ruleIMAGE_TAG();

            state._fsp--;

             after(grammarAccess.getIMAGE_TAGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIMAGE_TAG"


    // $ANTLR start "ruleIMAGE_TAG"
    // InternalMyDsl.g:187:1: ruleIMAGE_TAG : ( ( rule__IMAGE_TAG__Group__0 ) ) ;
    public final void ruleIMAGE_TAG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__IMAGE_TAG__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__IMAGE_TAG__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__IMAGE_TAG__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__IMAGE_TAG__Group__0 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__IMAGE_TAG__Group__0 )
            // InternalMyDsl.g:194:4: rule__IMAGE_TAG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_TAG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIMAGE_TAGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIMAGE_TAG"


    // $ANTLR start "entryRuleIMAGE_DIGEST"
    // InternalMyDsl.g:203:1: entryRuleIMAGE_DIGEST : ruleIMAGE_DIGEST EOF ;
    public final void entryRuleIMAGE_DIGEST() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleIMAGE_DIGEST EOF )
            // InternalMyDsl.g:205:1: ruleIMAGE_DIGEST EOF
            {
             before(grammarAccess.getIMAGE_DIGESTRule()); 
            pushFollow(FOLLOW_1);
            ruleIMAGE_DIGEST();

            state._fsp--;

             after(grammarAccess.getIMAGE_DIGESTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIMAGE_DIGEST"


    // $ANTLR start "ruleIMAGE_DIGEST"
    // InternalMyDsl.g:212:1: ruleIMAGE_DIGEST : ( ( rule__IMAGE_DIGEST__Group__0 ) ) ;
    public final void ruleIMAGE_DIGEST() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__IMAGE_DIGEST__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__IMAGE_DIGEST__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__IMAGE_DIGEST__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__IMAGE_DIGEST__Group__0 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__IMAGE_DIGEST__Group__0 )
            // InternalMyDsl.g:219:4: rule__IMAGE_DIGEST__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_DIGEST__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIMAGE_DIGESTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIMAGE_DIGEST"


    // $ANTLR start "entryRulePLATFORM_OPTION"
    // InternalMyDsl.g:228:1: entryRulePLATFORM_OPTION : rulePLATFORM_OPTION EOF ;
    public final void entryRulePLATFORM_OPTION() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( rulePLATFORM_OPTION EOF )
            // InternalMyDsl.g:230:1: rulePLATFORM_OPTION EOF
            {
             before(grammarAccess.getPLATFORM_OPTIONRule()); 
            pushFollow(FOLLOW_1);
            rulePLATFORM_OPTION();

            state._fsp--;

             after(grammarAccess.getPLATFORM_OPTIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePLATFORM_OPTION"


    // $ANTLR start "rulePLATFORM_OPTION"
    // InternalMyDsl.g:237:1: rulePLATFORM_OPTION : ( ( rule__PLATFORM_OPTION__Group__0 ) ) ;
    public final void rulePLATFORM_OPTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__PLATFORM_OPTION__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__PLATFORM_OPTION__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__PLATFORM_OPTION__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__PLATFORM_OPTION__Group__0 )
            {
             before(grammarAccess.getPLATFORM_OPTIONAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__PLATFORM_OPTION__Group__0 )
            // InternalMyDsl.g:244:4: rule__PLATFORM_OPTION__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PLATFORM_OPTION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPLATFORM_OPTIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePLATFORM_OPTION"


    // $ANTLR start "entryRuleEXEC_FORM"
    // InternalMyDsl.g:253:1: entryRuleEXEC_FORM : ruleEXEC_FORM EOF ;
    public final void entryRuleEXEC_FORM() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEXEC_FORM EOF )
            // InternalMyDsl.g:255:1: ruleEXEC_FORM EOF
            {
             before(grammarAccess.getEXEC_FORMRule()); 
            pushFollow(FOLLOW_1);
            ruleEXEC_FORM();

            state._fsp--;

             after(grammarAccess.getEXEC_FORMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXEC_FORM"


    // $ANTLR start "ruleEXEC_FORM"
    // InternalMyDsl.g:262:1: ruleEXEC_FORM : ( ( rule__EXEC_FORM__Group__0 ) ) ;
    public final void ruleEXEC_FORM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EXEC_FORM__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EXEC_FORM__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EXEC_FORM__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__EXEC_FORM__Group__0 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__EXEC_FORM__Group__0 )
            // InternalMyDsl.g:269:4: rule__EXEC_FORM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EXEC_FORM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEXEC_FORMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXEC_FORM"


    // $ANTLR start "entryRuleSHELL_FORM"
    // InternalMyDsl.g:278:1: entryRuleSHELL_FORM : ruleSHELL_FORM EOF ;
    public final void entryRuleSHELL_FORM() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleSHELL_FORM EOF )
            // InternalMyDsl.g:280:1: ruleSHELL_FORM EOF
            {
             before(grammarAccess.getSHELL_FORMRule()); 
            pushFollow(FOLLOW_1);
            ruleSHELL_FORM();

            state._fsp--;

             after(grammarAccess.getSHELL_FORMRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSHELL_FORM"


    // $ANTLR start "ruleSHELL_FORM"
    // InternalMyDsl.g:287:1: ruleSHELL_FORM : ( ( rule__SHELL_FORM__Group__0 ) ) ;
    public final void ruleSHELL_FORM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__SHELL_FORM__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__SHELL_FORM__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__SHELL_FORM__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__SHELL_FORM__Group__0 )
            {
             before(grammarAccess.getSHELL_FORMAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__SHELL_FORM__Group__0 )
            // InternalMyDsl.g:294:4: rule__SHELL_FORM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SHELL_FORM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSHELL_FORMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSHELL_FORM"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyDsl.g:302:1: rule__Statement__Alternatives : ( ( ruleFrom ) | ( ruleCmd ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ruleFrom ) | ( ruleCmd ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:307:2: ( ruleFrom )
                    {
                    // InternalMyDsl.g:307:2: ( ruleFrom )
                    // InternalMyDsl.g:308:3: ruleFrom
                    {
                     before(grammarAccess.getStatementAccess().getFromParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFrom();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFromParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:313:2: ( ruleCmd )
                    {
                    // InternalMyDsl.g:313:2: ( ruleCmd )
                    // InternalMyDsl.g:314:3: ruleCmd
                    {
                     before(grammarAccess.getStatementAccess().getCmdParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCmd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCmdParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__From__Tag_or_digestAlternatives_3_0"
    // InternalMyDsl.g:323:1: rule__From__Tag_or_digestAlternatives_3_0 : ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) );
    public final void rule__From__Tag_or_digestAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:328:2: ( ruleIMAGE_TAG )
                    {
                    // InternalMyDsl.g:328:2: ( ruleIMAGE_TAG )
                    // InternalMyDsl.g:329:3: ruleIMAGE_TAG
                    {
                     before(grammarAccess.getFromAccess().getTag_or_digestIMAGE_TAGParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIMAGE_TAG();

                    state._fsp--;

                     after(grammarAccess.getFromAccess().getTag_or_digestIMAGE_TAGParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:334:2: ( ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:334:2: ( ruleIMAGE_DIGEST )
                    // InternalMyDsl.g:335:3: ruleIMAGE_DIGEST
                    {
                     before(grammarAccess.getFromAccess().getTag_or_digestIMAGE_DIGESTParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIMAGE_DIGEST();

                    state._fsp--;

                     after(grammarAccess.getFromAccess().getTag_or_digestIMAGE_DIGESTParserRuleCall_3_0_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Tag_or_digestAlternatives_3_0"


    // $ANTLR start "rule__Cmd__Alternatives_1"
    // InternalMyDsl.g:344:1: rule__Cmd__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Cmd__Group_1_1__0 ) ) );
    public final void rule__Cmd__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( ( ruleEXEC_FORM ) | ( ( rule__Cmd__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_SHELL_CMD) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:349:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:349:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:350:3: ruleEXEC_FORM
                    {
                     before(grammarAccess.getCmdAccess().getEXEC_FORMParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEXEC_FORM();

                    state._fsp--;

                     after(grammarAccess.getCmdAccess().getEXEC_FORMParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:355:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:355:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    // InternalMyDsl.g:356:3: ( rule__Cmd__Group_1_1__0 )
                    {
                     before(grammarAccess.getCmdAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:357:3: ( rule__Cmd__Group_1_1__0 )
                    // InternalMyDsl.g:357:4: rule__Cmd__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cmd__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCmdAccess().getGroup_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Alternatives_1"


    // $ANTLR start "rule__IMAGE_TAG__Alternatives_1"
    // InternalMyDsl.g:365:1: rule__IMAGE_TAG__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_TAG__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:369:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:370:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:370:2: ( RULE_ID )
                    // InternalMyDsl.g:371:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:376:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:376:2: ( RULE_INT )
                    // InternalMyDsl.g:377:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:382:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:382:2: ( RULE_STRING )
                    // InternalMyDsl.g:383:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Alternatives_1"


    // $ANTLR start "rule__IMAGE_TAG__Alternatives_2"
    // InternalMyDsl.g:392:1: rule__IMAGE_TAG__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_TAG__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:396:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 12:
                {
                alt6=4;
                }
                break;
            case 13:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:397:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:397:2: ( RULE_ID )
                    // InternalMyDsl.g:398:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:403:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:403:2: ( RULE_INT )
                    // InternalMyDsl.g:404:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:409:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:409:2: ( RULE_STRING )
                    // InternalMyDsl.g:410:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:415:2: ( '-' )
                    {
                    // InternalMyDsl.g:415:2: ( '-' )
                    // InternalMyDsl.g:416:3: '-'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:421:2: ( '.' )
                    {
                    // InternalMyDsl.g:421:2: ( '.' )
                    // InternalMyDsl.g:422:3: '.'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Alternatives_2"


    // $ANTLR start "rule__IMAGE_DIGEST__Alternatives_1"
    // InternalMyDsl.g:431:1: rule__IMAGE_DIGEST__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_DIGEST__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:435:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:436:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:436:2: ( RULE_ID )
                    // InternalMyDsl.g:437:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:442:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:442:2: ( RULE_INT )
                    // InternalMyDsl.g:443:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:448:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:448:2: ( RULE_STRING )
                    // InternalMyDsl.g:449:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_1_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_1_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Alternatives_1"


    // $ANTLR start "rule__IMAGE_DIGEST__Alternatives_2"
    // InternalMyDsl.g:458:1: rule__IMAGE_DIGEST__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_DIGEST__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:462:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
            int alt8=5;
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
            case 12:
                {
                alt8=4;
                }
                break;
            case 13:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:463:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:463:2: ( RULE_ID )
                    // InternalMyDsl.g:464:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:469:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:469:2: ( RULE_INT )
                    // InternalMyDsl.g:470:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:475:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:475:2: ( RULE_STRING )
                    // InternalMyDsl.g:476:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:481:2: ( '-' )
                    {
                    // InternalMyDsl.g:481:2: ( '-' )
                    // InternalMyDsl.g:482:3: '-'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:487:2: ( '.' )
                    {
                    // InternalMyDsl.g:487:2: ( '.' )
                    // InternalMyDsl.g:488:3: '.'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Alternatives_2"


    // $ANTLR start "rule__From__Group__0"
    // InternalMyDsl.g:497:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalMyDsl.g:502:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // InternalMyDsl.g:509:1: rule__From__Group__0__Impl : ( 'FROM ' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( ( 'FROM ' ) )
            // InternalMyDsl.g:514:1: ( 'FROM ' )
            {
            // InternalMyDsl.g:514:1: ( 'FROM ' )
            // InternalMyDsl.g:515:2: 'FROM '
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getFROMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // InternalMyDsl.g:524:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalMyDsl.g:529:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__From__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // InternalMyDsl.g:536:1: rule__From__Group__1__Impl : ( ( rule__From__Platform_optionAssignment_1 )? ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( ( rule__From__Platform_optionAssignment_1 )? ) )
            // InternalMyDsl.g:541:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            {
            // InternalMyDsl.g:541:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            // InternalMyDsl.g:542:2: ( rule__From__Platform_optionAssignment_1 )?
            {
             before(grammarAccess.getFromAccess().getPlatform_optionAssignment_1()); 
            // InternalMyDsl.g:543:2: ( rule__From__Platform_optionAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:543:3: rule__From__Platform_optionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__From__Platform_optionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromAccess().getPlatform_optionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__From__Group__2"
    // InternalMyDsl.g:551:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalMyDsl.g:556:2: rule__From__Group__2__Impl rule__From__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__From__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2"


    // $ANTLR start "rule__From__Group__2__Impl"
    // InternalMyDsl.g:563:1: rule__From__Group__2__Impl : ( ( rule__From__NameAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( ( rule__From__NameAssignment_2 ) ) )
            // InternalMyDsl.g:568:1: ( ( rule__From__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:568:1: ( ( rule__From__NameAssignment_2 ) )
            // InternalMyDsl.g:569:2: ( rule__From__NameAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:570:2: ( rule__From__NameAssignment_2 )
            // InternalMyDsl.g:570:3: rule__From__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__From__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2__Impl"


    // $ANTLR start "rule__From__Group__3"
    // InternalMyDsl.g:578:1: rule__From__Group__3 : rule__From__Group__3__Impl ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__From__Group__3__Impl )
            // InternalMyDsl.g:583:2: rule__From__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__3"


    // $ANTLR start "rule__From__Group__3__Impl"
    // InternalMyDsl.g:589:1: rule__From__Group__3__Impl : ( ( rule__From__Tag_or_digestAssignment_3 )? ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( ( ( rule__From__Tag_or_digestAssignment_3 )? ) )
            // InternalMyDsl.g:594:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            {
            // InternalMyDsl.g:594:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            // InternalMyDsl.g:595:2: ( rule__From__Tag_or_digestAssignment_3 )?
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAssignment_3()); 
            // InternalMyDsl.g:596:2: ( rule__From__Tag_or_digestAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=17 && LA10_0<=18)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:596:3: rule__From__Tag_or_digestAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__From__Tag_or_digestAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromAccess().getTag_or_digestAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__3__Impl"


    // $ANTLR start "rule__Cmd__Group__0"
    // InternalMyDsl.g:605:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // InternalMyDsl.g:610:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Cmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0"


    // $ANTLR start "rule__Cmd__Group__0__Impl"
    // InternalMyDsl.g:617:1: rule__Cmd__Group__0__Impl : ( 'CMD' ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( 'CMD' ) )
            // InternalMyDsl.g:622:1: ( 'CMD' )
            {
            // InternalMyDsl.g:622:1: ( 'CMD' )
            // InternalMyDsl.g:623:2: 'CMD'
            {
             before(grammarAccess.getCmdAccess().getCMDKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCmdAccess().getCMDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0__Impl"


    // $ANTLR start "rule__Cmd__Group__1"
    // InternalMyDsl.g:632:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Cmd__Group__1__Impl )
            // InternalMyDsl.g:637:2: rule__Cmd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1"


    // $ANTLR start "rule__Cmd__Group__1__Impl"
    // InternalMyDsl.g:643:1: rule__Cmd__Group__1__Impl : ( ( rule__Cmd__Alternatives_1 ) ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( ( ( rule__Cmd__Alternatives_1 ) ) )
            // InternalMyDsl.g:648:1: ( ( rule__Cmd__Alternatives_1 ) )
            {
            // InternalMyDsl.g:648:1: ( ( rule__Cmd__Alternatives_1 ) )
            // InternalMyDsl.g:649:2: ( rule__Cmd__Alternatives_1 )
            {
             before(grammarAccess.getCmdAccess().getAlternatives_1()); 
            // InternalMyDsl.g:650:2: ( rule__Cmd__Alternatives_1 )
            // InternalMyDsl.g:650:3: rule__Cmd__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1__Impl"


    // $ANTLR start "rule__Cmd__Group_1_1__0"
    // InternalMyDsl.g:659:1: rule__Cmd__Group_1_1__0 : rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 ;
    public final void rule__Cmd__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 )
            // InternalMyDsl.g:664:2: rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Cmd__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cmd__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__0"


    // $ANTLR start "rule__Cmd__Group_1_1__0__Impl"
    // InternalMyDsl.g:671:1: rule__Cmd__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Cmd__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( () ) )
            // InternalMyDsl.g:676:1: ( () )
            {
            // InternalMyDsl.g:676:1: ( () )
            // InternalMyDsl.g:677:2: ()
            {
             before(grammarAccess.getCmdAccess().getCmdAction_1_1_0()); 
            // InternalMyDsl.g:678:2: ()
            // InternalMyDsl.g:678:3: 
            {
            }

             after(grammarAccess.getCmdAccess().getCmdAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__0__Impl"


    // $ANTLR start "rule__Cmd__Group_1_1__1"
    // InternalMyDsl.g:686:1: rule__Cmd__Group_1_1__1 : rule__Cmd__Group_1_1__1__Impl ;
    public final void rule__Cmd__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Cmd__Group_1_1__1__Impl )
            // InternalMyDsl.g:691:2: rule__Cmd__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__1"


    // $ANTLR start "rule__Cmd__Group_1_1__1__Impl"
    // InternalMyDsl.g:697:1: rule__Cmd__Group_1_1__1__Impl : ( ruleSHELL_FORM ) ;
    public final void rule__Cmd__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( ( ruleSHELL_FORM ) )
            // InternalMyDsl.g:702:1: ( ruleSHELL_FORM )
            {
            // InternalMyDsl.g:702:1: ( ruleSHELL_FORM )
            // InternalMyDsl.g:703:2: ruleSHELL_FORM
            {
             before(grammarAccess.getCmdAccess().getSHELL_FORMParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_2);
            ruleSHELL_FORM();

            state._fsp--;

             after(grammarAccess.getCmdAccess().getSHELL_FORMParserRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_1_1__1__Impl"


    // $ANTLR start "rule__IMAGE_NAME__Group__0"
    // InternalMyDsl.g:713:1: rule__IMAGE_NAME__Group__0 : rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 ;
    public final void rule__IMAGE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 )
            // InternalMyDsl.g:718:2: rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__IMAGE_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE_NAME__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group__0"


    // $ANTLR start "rule__IMAGE_NAME__Group__0__Impl"
    // InternalMyDsl.g:725:1: rule__IMAGE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:730:1: ( RULE_ID )
            {
            // InternalMyDsl.g:730:1: ( RULE_ID )
            // InternalMyDsl.g:731:2: RULE_ID
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group__0__Impl"


    // $ANTLR start "rule__IMAGE_NAME__Group__1"
    // InternalMyDsl.g:740:1: rule__IMAGE_NAME__Group__1 : rule__IMAGE_NAME__Group__1__Impl ;
    public final void rule__IMAGE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__IMAGE_NAME__Group__1__Impl )
            // InternalMyDsl.g:745:2: rule__IMAGE_NAME__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_NAME__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group__1"


    // $ANTLR start "rule__IMAGE_NAME__Group__1__Impl"
    // InternalMyDsl.g:751:1: rule__IMAGE_NAME__Group__1__Impl : ( ( rule__IMAGE_NAME__Group_1__0 )* ) ;
    public final void rule__IMAGE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( ( rule__IMAGE_NAME__Group_1__0 )* ) )
            // InternalMyDsl.g:756:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            {
            // InternalMyDsl.g:756:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            // InternalMyDsl.g:757:2: ( rule__IMAGE_NAME__Group_1__0 )*
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup_1()); 
            // InternalMyDsl.g:758:2: ( rule__IMAGE_NAME__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:758:3: rule__IMAGE_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__IMAGE_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIMAGE_NAMEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group__1__Impl"


    // $ANTLR start "rule__IMAGE_NAME__Group_1__0"
    // InternalMyDsl.g:767:1: rule__IMAGE_NAME__Group_1__0 : rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 ;
    public final void rule__IMAGE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 )
            // InternalMyDsl.g:772:2: rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__IMAGE_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE_NAME__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group_1__0"


    // $ANTLR start "rule__IMAGE_NAME__Group_1__0__Impl"
    // InternalMyDsl.g:779:1: rule__IMAGE_NAME__Group_1__0__Impl : ( '/' ) ;
    public final void rule__IMAGE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( '/' ) )
            // InternalMyDsl.g:784:1: ( '/' )
            {
            // InternalMyDsl.g:784:1: ( '/' )
            // InternalMyDsl.g:785:2: '/'
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group_1__0__Impl"


    // $ANTLR start "rule__IMAGE_NAME__Group_1__1"
    // InternalMyDsl.g:794:1: rule__IMAGE_NAME__Group_1__1 : rule__IMAGE_NAME__Group_1__1__Impl ;
    public final void rule__IMAGE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__IMAGE_NAME__Group_1__1__Impl )
            // InternalMyDsl.g:799:2: rule__IMAGE_NAME__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_NAME__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group_1__1"


    // $ANTLR start "rule__IMAGE_NAME__Group_1__1__Impl"
    // InternalMyDsl.g:805:1: rule__IMAGE_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:810:1: ( RULE_ID )
            {
            // InternalMyDsl.g:810:1: ( RULE_ID )
            // InternalMyDsl.g:811:2: RULE_ID
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_NAME__Group_1__1__Impl"


    // $ANTLR start "rule__IMAGE_TAG__Group__0"
    // InternalMyDsl.g:821:1: rule__IMAGE_TAG__Group__0 : rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 ;
    public final void rule__IMAGE_TAG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 )
            // InternalMyDsl.g:826:2: rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__IMAGE_TAG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE_TAG__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Group__0"


    // $ANTLR start "rule__IMAGE_TAG__Group__0__Impl"
    // InternalMyDsl.g:833:1: rule__IMAGE_TAG__Group__0__Impl : ( ':' ) ;
    public final void rule__IMAGE_TAG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ':' ) )
            // InternalMyDsl.g:838:1: ( ':' )
            {
            // InternalMyDsl.g:838:1: ( ':' )
            // InternalMyDsl.g:839:2: ':'
            {
             before(grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Group__0__Impl"


    // $ANTLR start "rule__IMAGE_TAG__Group__1"
    // InternalMyDsl.g:848:1: rule__IMAGE_TAG__Group__1 : rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 ;
    public final void rule__IMAGE_TAG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 )
            // InternalMyDsl.g:853:2: rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IMAGE_TAG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE_TAG__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Group__1"


    // $ANTLR start "rule__IMAGE_TAG__Group__1__Impl"
    // InternalMyDsl.g:860:1: rule__IMAGE_TAG__Group__1__Impl : ( ( rule__IMAGE_TAG__Alternatives_1 ) ) ;
    public final void rule__IMAGE_TAG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( ( ( rule__IMAGE_TAG__Alternatives_1 ) ) )
            // InternalMyDsl.g:865:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            {
            // InternalMyDsl.g:865:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            // InternalMyDsl.g:866:2: ( rule__IMAGE_TAG__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_1()); 
            // InternalMyDsl.g:867:2: ( rule__IMAGE_TAG__Alternatives_1 )
            // InternalMyDsl.g:867:3: rule__IMAGE_TAG__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_TAG__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getIMAGE_TAGAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Group__1__Impl"


    // $ANTLR start "rule__IMAGE_TAG__Group__2"
    // InternalMyDsl.g:875:1: rule__IMAGE_TAG__Group__2 : rule__IMAGE_TAG__Group__2__Impl ;
    public final void rule__IMAGE_TAG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__IMAGE_TAG__Group__2__Impl )
            // InternalMyDsl.g:880:2: rule__IMAGE_TAG__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_TAG__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Group__2"


    // $ANTLR start "rule__IMAGE_TAG__Group__2__Impl"
    // InternalMyDsl.g:886:1: rule__IMAGE_TAG__Group__2__Impl : ( ( rule__IMAGE_TAG__Alternatives_2 )* ) ;
    public final void rule__IMAGE_TAG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( ( ( rule__IMAGE_TAG__Alternatives_2 )* ) )
            // InternalMyDsl.g:891:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            {
            // InternalMyDsl.g:891:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            // InternalMyDsl.g:892:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_2()); 
            // InternalMyDsl.g:893:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||(LA12_0>=12 && LA12_0<=13)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:893:3: rule__IMAGE_TAG__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__IMAGE_TAG__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getIMAGE_TAGAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_TAG__Group__2__Impl"


    // $ANTLR start "rule__IMAGE_DIGEST__Group__0"
    // InternalMyDsl.g:902:1: rule__IMAGE_DIGEST__Group__0 : rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 ;
    public final void rule__IMAGE_DIGEST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 )
            // InternalMyDsl.g:907:2: rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__IMAGE_DIGEST__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE_DIGEST__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Group__0"


    // $ANTLR start "rule__IMAGE_DIGEST__Group__0__Impl"
    // InternalMyDsl.g:914:1: rule__IMAGE_DIGEST__Group__0__Impl : ( '@' ) ;
    public final void rule__IMAGE_DIGEST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( '@' ) )
            // InternalMyDsl.g:919:1: ( '@' )
            {
            // InternalMyDsl.g:919:1: ( '@' )
            // InternalMyDsl.g:920:2: '@'
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Group__0__Impl"


    // $ANTLR start "rule__IMAGE_DIGEST__Group__1"
    // InternalMyDsl.g:929:1: rule__IMAGE_DIGEST__Group__1 : rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 ;
    public final void rule__IMAGE_DIGEST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 )
            // InternalMyDsl.g:934:2: rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__IMAGE_DIGEST__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IMAGE_DIGEST__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Group__1"


    // $ANTLR start "rule__IMAGE_DIGEST__Group__1__Impl"
    // InternalMyDsl.g:941:1: rule__IMAGE_DIGEST__Group__1__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) ;
    public final void rule__IMAGE_DIGEST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) )
            // InternalMyDsl.g:946:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            {
            // InternalMyDsl.g:946:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            // InternalMyDsl.g:947:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_1()); 
            // InternalMyDsl.g:948:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            // InternalMyDsl.g:948:3: rule__IMAGE_DIGEST__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_DIGEST__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Group__1__Impl"


    // $ANTLR start "rule__IMAGE_DIGEST__Group__2"
    // InternalMyDsl.g:956:1: rule__IMAGE_DIGEST__Group__2 : rule__IMAGE_DIGEST__Group__2__Impl ;
    public final void rule__IMAGE_DIGEST__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( rule__IMAGE_DIGEST__Group__2__Impl )
            // InternalMyDsl.g:961:2: rule__IMAGE_DIGEST__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IMAGE_DIGEST__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Group__2"


    // $ANTLR start "rule__IMAGE_DIGEST__Group__2__Impl"
    // InternalMyDsl.g:967:1: rule__IMAGE_DIGEST__Group__2__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) ;
    public final void rule__IMAGE_DIGEST__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) )
            // InternalMyDsl.g:972:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            {
            // InternalMyDsl.g:972:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            // InternalMyDsl.g:973:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_2()); 
            // InternalMyDsl.g:974:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||(LA13_0>=12 && LA13_0<=13)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:974:3: rule__IMAGE_DIGEST__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__IMAGE_DIGEST__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IMAGE_DIGEST__Group__2__Impl"


    // $ANTLR start "rule__PLATFORM_OPTION__Group__0"
    // InternalMyDsl.g:983:1: rule__PLATFORM_OPTION__Group__0 : rule__PLATFORM_OPTION__Group__0__Impl rule__PLATFORM_OPTION__Group__1 ;
    public final void rule__PLATFORM_OPTION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( rule__PLATFORM_OPTION__Group__0__Impl rule__PLATFORM_OPTION__Group__1 )
            // InternalMyDsl.g:988:2: rule__PLATFORM_OPTION__Group__0__Impl rule__PLATFORM_OPTION__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PLATFORM_OPTION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PLATFORM_OPTION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLATFORM_OPTION__Group__0"


    // $ANTLR start "rule__PLATFORM_OPTION__Group__0__Impl"
    // InternalMyDsl.g:995:1: rule__PLATFORM_OPTION__Group__0__Impl : ( '--platform=' ) ;
    public final void rule__PLATFORM_OPTION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( ( '--platform=' ) )
            // InternalMyDsl.g:1000:1: ( '--platform=' )
            {
            // InternalMyDsl.g:1000:1: ( '--platform=' )
            // InternalMyDsl.g:1001:2: '--platform='
            {
             before(grammarAccess.getPLATFORM_OPTIONAccess().getPlatformKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPLATFORM_OPTIONAccess().getPlatformKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLATFORM_OPTION__Group__0__Impl"


    // $ANTLR start "rule__PLATFORM_OPTION__Group__1"
    // InternalMyDsl.g:1010:1: rule__PLATFORM_OPTION__Group__1 : rule__PLATFORM_OPTION__Group__1__Impl ;
    public final void rule__PLATFORM_OPTION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( rule__PLATFORM_OPTION__Group__1__Impl )
            // InternalMyDsl.g:1015:2: rule__PLATFORM_OPTION__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PLATFORM_OPTION__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLATFORM_OPTION__Group__1"


    // $ANTLR start "rule__PLATFORM_OPTION__Group__1__Impl"
    // InternalMyDsl.g:1021:1: rule__PLATFORM_OPTION__Group__1__Impl : ( ruleIMAGE_NAME ) ;
    public final void rule__PLATFORM_OPTION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( ( ruleIMAGE_NAME ) )
            // InternalMyDsl.g:1026:1: ( ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:1026:1: ( ruleIMAGE_NAME )
            // InternalMyDsl.g:1027:2: ruleIMAGE_NAME
            {
             before(grammarAccess.getPLATFORM_OPTIONAccess().getIMAGE_NAMEParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleIMAGE_NAME();

            state._fsp--;

             after(grammarAccess.getPLATFORM_OPTIONAccess().getIMAGE_NAMEParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PLATFORM_OPTION__Group__1__Impl"


    // $ANTLR start "rule__EXEC_FORM__Group__0"
    // InternalMyDsl.g:1037:1: rule__EXEC_FORM__Group__0 : rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 ;
    public final void rule__EXEC_FORM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 )
            // InternalMyDsl.g:1042:2: rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EXEC_FORM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXEC_FORM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__0"


    // $ANTLR start "rule__EXEC_FORM__Group__0__Impl"
    // InternalMyDsl.g:1049:1: rule__EXEC_FORM__Group__0__Impl : ( ' [' ) ;
    public final void rule__EXEC_FORM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( ( ' [' ) )
            // InternalMyDsl.g:1054:1: ( ' [' )
            {
            // InternalMyDsl.g:1054:1: ( ' [' )
            // InternalMyDsl.g:1055:2: ' ['
            {
             before(grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__0__Impl"


    // $ANTLR start "rule__EXEC_FORM__Group__1"
    // InternalMyDsl.g:1064:1: rule__EXEC_FORM__Group__1 : rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 ;
    public final void rule__EXEC_FORM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 )
            // InternalMyDsl.g:1069:2: rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EXEC_FORM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXEC_FORM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__1"


    // $ANTLR start "rule__EXEC_FORM__Group__1__Impl"
    // InternalMyDsl.g:1076:1: rule__EXEC_FORM__Group__1__Impl : ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) ;
    public final void rule__EXEC_FORM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) )
            // InternalMyDsl.g:1081:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            {
            // InternalMyDsl.g:1081:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            // InternalMyDsl.g:1082:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getExecutableAssignment_1()); 
            // InternalMyDsl.g:1083:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            // InternalMyDsl.g:1083:3: rule__EXEC_FORM__ExecutableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EXEC_FORM__ExecutableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEXEC_FORMAccess().getExecutableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__1__Impl"


    // $ANTLR start "rule__EXEC_FORM__Group__2"
    // InternalMyDsl.g:1091:1: rule__EXEC_FORM__Group__2 : rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 ;
    public final void rule__EXEC_FORM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 )
            // InternalMyDsl.g:1096:2: rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__EXEC_FORM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EXEC_FORM__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__2"


    // $ANTLR start "rule__EXEC_FORM__Group__2__Impl"
    // InternalMyDsl.g:1103:1: rule__EXEC_FORM__Group__2__Impl : ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) ;
    public final void rule__EXEC_FORM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) )
            // InternalMyDsl.g:1108:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            {
            // InternalMyDsl.g:1108:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            // InternalMyDsl.g:1109:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            {
             before(grammarAccess.getEXEC_FORMAccess().getParametersAssignment_2()); 
            // InternalMyDsl.g:1110:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1110:3: rule__EXEC_FORM__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EXEC_FORM__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEXEC_FORMAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__2__Impl"


    // $ANTLR start "rule__EXEC_FORM__Group__3"
    // InternalMyDsl.g:1118:1: rule__EXEC_FORM__Group__3 : rule__EXEC_FORM__Group__3__Impl ;
    public final void rule__EXEC_FORM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( rule__EXEC_FORM__Group__3__Impl )
            // InternalMyDsl.g:1123:2: rule__EXEC_FORM__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EXEC_FORM__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__3"


    // $ANTLR start "rule__EXEC_FORM__Group__3__Impl"
    // InternalMyDsl.g:1129:1: rule__EXEC_FORM__Group__3__Impl : ( ']' ) ;
    public final void rule__EXEC_FORM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( ( ']' ) )
            // InternalMyDsl.g:1134:1: ( ']' )
            {
            // InternalMyDsl.g:1134:1: ( ']' )
            // InternalMyDsl.g:1135:2: ']'
            {
             before(grammarAccess.getEXEC_FORMAccess().getRightSquareBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEXEC_FORMAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__Group__3__Impl"


    // $ANTLR start "rule__SHELL_FORM__Group__0"
    // InternalMyDsl.g:1145:1: rule__SHELL_FORM__Group__0 : rule__SHELL_FORM__Group__0__Impl rule__SHELL_FORM__Group__1 ;
    public final void rule__SHELL_FORM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( rule__SHELL_FORM__Group__0__Impl rule__SHELL_FORM__Group__1 )
            // InternalMyDsl.g:1150:2: rule__SHELL_FORM__Group__0__Impl rule__SHELL_FORM__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SHELL_FORM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SHELL_FORM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group__0"


    // $ANTLR start "rule__SHELL_FORM__Group__0__Impl"
    // InternalMyDsl.g:1157:1: rule__SHELL_FORM__Group__0__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__SHELL_FORM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1162:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1162:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1163:2: RULE_SHELL_CMD
            {
             before(grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group__0__Impl"


    // $ANTLR start "rule__SHELL_FORM__Group__1"
    // InternalMyDsl.g:1172:1: rule__SHELL_FORM__Group__1 : rule__SHELL_FORM__Group__1__Impl ;
    public final void rule__SHELL_FORM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( rule__SHELL_FORM__Group__1__Impl )
            // InternalMyDsl.g:1177:2: rule__SHELL_FORM__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SHELL_FORM__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group__1"


    // $ANTLR start "rule__SHELL_FORM__Group__1__Impl"
    // InternalMyDsl.g:1183:1: rule__SHELL_FORM__Group__1__Impl : ( ( rule__SHELL_FORM__Group_1__0 )* ) ;
    public final void rule__SHELL_FORM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( ( ( rule__SHELL_FORM__Group_1__0 )* ) )
            // InternalMyDsl.g:1188:1: ( ( rule__SHELL_FORM__Group_1__0 )* )
            {
            // InternalMyDsl.g:1188:1: ( ( rule__SHELL_FORM__Group_1__0 )* )
            // InternalMyDsl.g:1189:2: ( rule__SHELL_FORM__Group_1__0 )*
            {
             before(grammarAccess.getSHELL_FORMAccess().getGroup_1()); 
            // InternalMyDsl.g:1190:2: ( rule__SHELL_FORM__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_CONTINUE_NL) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1190:3: rule__SHELL_FORM__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SHELL_FORM__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSHELL_FORMAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group__1__Impl"


    // $ANTLR start "rule__SHELL_FORM__Group_1__0"
    // InternalMyDsl.g:1199:1: rule__SHELL_FORM__Group_1__0 : rule__SHELL_FORM__Group_1__0__Impl rule__SHELL_FORM__Group_1__1 ;
    public final void rule__SHELL_FORM__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( rule__SHELL_FORM__Group_1__0__Impl rule__SHELL_FORM__Group_1__1 )
            // InternalMyDsl.g:1204:2: rule__SHELL_FORM__Group_1__0__Impl rule__SHELL_FORM__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__SHELL_FORM__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SHELL_FORM__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group_1__0"


    // $ANTLR start "rule__SHELL_FORM__Group_1__0__Impl"
    // InternalMyDsl.g:1211:1: rule__SHELL_FORM__Group_1__0__Impl : ( RULE_CONTINUE_NL ) ;
    public final void rule__SHELL_FORM__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( ( RULE_CONTINUE_NL ) )
            // InternalMyDsl.g:1216:1: ( RULE_CONTINUE_NL )
            {
            // InternalMyDsl.g:1216:1: ( RULE_CONTINUE_NL )
            // InternalMyDsl.g:1217:2: RULE_CONTINUE_NL
            {
             before(grammarAccess.getSHELL_FORMAccess().getCONTINUE_NLTerminalRuleCall_1_0()); 
            match(input,RULE_CONTINUE_NL,FOLLOW_2); 
             after(grammarAccess.getSHELL_FORMAccess().getCONTINUE_NLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group_1__0__Impl"


    // $ANTLR start "rule__SHELL_FORM__Group_1__1"
    // InternalMyDsl.g:1226:1: rule__SHELL_FORM__Group_1__1 : rule__SHELL_FORM__Group_1__1__Impl ;
    public final void rule__SHELL_FORM__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( rule__SHELL_FORM__Group_1__1__Impl )
            // InternalMyDsl.g:1231:2: rule__SHELL_FORM__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SHELL_FORM__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group_1__1"


    // $ANTLR start "rule__SHELL_FORM__Group_1__1__Impl"
    // InternalMyDsl.g:1237:1: rule__SHELL_FORM__Group_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__SHELL_FORM__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1242:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1242:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1243:2: RULE_SHELL_CMD
            {
             before(grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_1_1()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SHELL_FORM__Group_1__1__Impl"


    // $ANTLR start "rule__Dockerfile__StatementsAssignment"
    // InternalMyDsl.g:1253:1: rule__Dockerfile__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Dockerfile__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:1258:2: ( ruleStatement )
            {
            // InternalMyDsl.g:1258:2: ( ruleStatement )
            // InternalMyDsl.g:1259:3: ruleStatement
            {
             before(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dockerfile__StatementsAssignment"


    // $ANTLR start "rule__From__Platform_optionAssignment_1"
    // InternalMyDsl.g:1268:1: rule__From__Platform_optionAssignment_1 : ( rulePLATFORM_OPTION ) ;
    public final void rule__From__Platform_optionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( rulePLATFORM_OPTION ) )
            // InternalMyDsl.g:1273:2: ( rulePLATFORM_OPTION )
            {
            // InternalMyDsl.g:1273:2: ( rulePLATFORM_OPTION )
            // InternalMyDsl.g:1274:3: rulePLATFORM_OPTION
            {
             before(grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePLATFORM_OPTION();

            state._fsp--;

             after(grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Platform_optionAssignment_1"


    // $ANTLR start "rule__From__NameAssignment_2"
    // InternalMyDsl.g:1283:1: rule__From__NameAssignment_2 : ( ruleIMAGE_NAME ) ;
    public final void rule__From__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( ( ruleIMAGE_NAME ) )
            // InternalMyDsl.g:1288:2: ( ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:1288:2: ( ruleIMAGE_NAME )
            // InternalMyDsl.g:1289:3: ruleIMAGE_NAME
            {
             before(grammarAccess.getFromAccess().getNameIMAGE_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIMAGE_NAME();

            state._fsp--;

             after(grammarAccess.getFromAccess().getNameIMAGE_NAMEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__NameAssignment_2"


    // $ANTLR start "rule__From__Tag_or_digestAssignment_3"
    // InternalMyDsl.g:1298:1: rule__From__Tag_or_digestAssignment_3 : ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) ;
    public final void rule__From__Tag_or_digestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) )
            // InternalMyDsl.g:1303:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            {
            // InternalMyDsl.g:1303:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            // InternalMyDsl.g:1304:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAlternatives_3_0()); 
            // InternalMyDsl.g:1305:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            // InternalMyDsl.g:1305:4: rule__From__Tag_or_digestAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__From__Tag_or_digestAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getTag_or_digestAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Tag_or_digestAssignment_3"


    // $ANTLR start "rule__EXEC_FORM__ExecutableAssignment_1"
    // InternalMyDsl.g:1313:1: rule__EXEC_FORM__ExecutableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EXEC_FORM__ExecutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1317:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1318:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1318:2: ( RULE_STRING )
            // InternalMyDsl.g:1319:3: RULE_STRING
            {
             before(grammarAccess.getEXEC_FORMAccess().getExecutableSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEXEC_FORMAccess().getExecutableSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__ExecutableAssignment_1"


    // $ANTLR start "rule__EXEC_FORM__ParametersAssignment_2"
    // InternalMyDsl.g:1328:1: rule__EXEC_FORM__ParametersAssignment_2 : ( RULE_EXEC_FORM_PARAMETER ) ;
    public final void rule__EXEC_FORM__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( RULE_EXEC_FORM_PARAMETER ) )
            // InternalMyDsl.g:1333:2: ( RULE_EXEC_FORM_PARAMETER )
            {
            // InternalMyDsl.g:1333:2: ( RULE_EXEC_FORM_PARAMETER )
            // InternalMyDsl.g:1334:3: RULE_EXEC_FORM_PARAMETER
            {
             before(grammarAccess.getEXEC_FORMAccess().getParametersEXEC_FORM_PARAMETERTerminalRuleCall_2_0()); 
            match(input,RULE_EXEC_FORM_PARAMETER,FOLLOW_2); 
             after(grammarAccess.getEXEC_FORMAccess().getParametersEXEC_FORM_PARAMETERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXEC_FORM__ParametersAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003072L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});

}