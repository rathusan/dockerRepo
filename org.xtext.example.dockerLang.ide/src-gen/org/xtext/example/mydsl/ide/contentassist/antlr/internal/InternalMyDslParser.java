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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_NL", "RULE_SHELL_CMD", "RULE_PLATFORM_OPTION", "RULE_KV_PAIR_EQUALS", "RULE_CHOWN_OPTION", "RULE_EXEC_FORM_PARAMETER", "RULE_CONTINUE_NL", "RULE_ANY_OTHER", "'?'", "'*'", "'-'", "'.'", "'ONBUILD '", "'FROM '", "'CMD'", "'RUN'", "'ENTRYPOINT'", "'VOLUME'", "'MAINTAINER'", "'EXPOSE'", "'WORKDIR'", "'ENV '", "'LABEL '", "'ADD '", "'COPY '", "'/'", "':'", "'@'", "' ['", "']'"
    };
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
    // InternalMyDsl.g:62:1: ruleDockerfile : ( ( rule__Dockerfile__Group__0 )* ) ;
    public final void ruleDockerfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Dockerfile__Group__0 )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Dockerfile__Group__0 )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Dockerfile__Group__0 )* )
            // InternalMyDsl.g:68:3: ( rule__Dockerfile__Group__0 )*
            {
             before(grammarAccess.getDockerfileAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Dockerfile__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT||(LA1_0>=20 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Dockerfile__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Dockerfile__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDockerfileAccess().getGroup()); 

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
    // InternalMyDsl.g:87:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Statement__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Statement__Group__0 )
            // InternalMyDsl.g:94:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

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


    // $ANTLR start "entryRuleRun"
    // InternalMyDsl.g:153:1: entryRuleRun : ruleRun EOF ;
    public final void entryRuleRun() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRun EOF )
            // InternalMyDsl.g:155:1: ruleRun EOF
            {
             before(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            ruleRun();

            state._fsp--;

             after(grammarAccess.getRunRule()); 
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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalMyDsl.g:162:1: ruleRun : ( ( rule__Run__Group__0 ) ) ;
    public final void ruleRun() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Run__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Run__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Run__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Run__Group__0 )
            {
             before(grammarAccess.getRunAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Run__Group__0 )
            // InternalMyDsl.g:169:4: rule__Run__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Run__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunAccess().getGroup()); 

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
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleEntrypoint"
    // InternalMyDsl.g:178:1: entryRuleEntrypoint : ruleEntrypoint EOF ;
    public final void entryRuleEntrypoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEntrypoint EOF )
            // InternalMyDsl.g:180:1: ruleEntrypoint EOF
            {
             before(grammarAccess.getEntrypointRule()); 
            pushFollow(FOLLOW_1);
            ruleEntrypoint();

            state._fsp--;

             after(grammarAccess.getEntrypointRule()); 
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
    // $ANTLR end "entryRuleEntrypoint"


    // $ANTLR start "ruleEntrypoint"
    // InternalMyDsl.g:187:1: ruleEntrypoint : ( ( rule__Entrypoint__Group__0 ) ) ;
    public final void ruleEntrypoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Entrypoint__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Entrypoint__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Entrypoint__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Entrypoint__Group__0 )
            {
             before(grammarAccess.getEntrypointAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Entrypoint__Group__0 )
            // InternalMyDsl.g:194:4: rule__Entrypoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getGroup()); 

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
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleVolume"
    // InternalMyDsl.g:203:1: entryRuleVolume : ruleVolume EOF ;
    public final void entryRuleVolume() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleVolume EOF )
            // InternalMyDsl.g:205:1: ruleVolume EOF
            {
             before(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getVolumeRule()); 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalMyDsl.g:212:1: ruleVolume : ( ( rule__Volume__Group__0 ) ) ;
    public final void ruleVolume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Volume__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Volume__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Volume__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Volume__Group__0 )
            {
             before(grammarAccess.getVolumeAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Volume__Group__0 )
            // InternalMyDsl.g:219:4: rule__Volume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getGroup()); 

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
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleMaintainer"
    // InternalMyDsl.g:228:1: entryRuleMaintainer : ruleMaintainer EOF ;
    public final void entryRuleMaintainer() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMaintainer EOF )
            // InternalMyDsl.g:230:1: ruleMaintainer EOF
            {
             before(grammarAccess.getMaintainerRule()); 
            pushFollow(FOLLOW_1);
            ruleMaintainer();

            state._fsp--;

             after(grammarAccess.getMaintainerRule()); 
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
    // $ANTLR end "entryRuleMaintainer"


    // $ANTLR start "ruleMaintainer"
    // InternalMyDsl.g:237:1: ruleMaintainer : ( ( rule__Maintainer__Group__0 ) ) ;
    public final void ruleMaintainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Maintainer__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Maintainer__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Maintainer__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Maintainer__Group__0 )
            {
             before(grammarAccess.getMaintainerAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Maintainer__Group__0 )
            // InternalMyDsl.g:244:4: rule__Maintainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getGroup()); 

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
    // $ANTLR end "ruleMaintainer"


    // $ANTLR start "entryRuleExpose"
    // InternalMyDsl.g:253:1: entryRuleExpose : ruleExpose EOF ;
    public final void entryRuleExpose() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleExpose EOF )
            // InternalMyDsl.g:255:1: ruleExpose EOF
            {
             before(grammarAccess.getExposeRule()); 
            pushFollow(FOLLOW_1);
            ruleExpose();

            state._fsp--;

             after(grammarAccess.getExposeRule()); 
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
    // $ANTLR end "entryRuleExpose"


    // $ANTLR start "ruleExpose"
    // InternalMyDsl.g:262:1: ruleExpose : ( ( rule__Expose__Group__0 ) ) ;
    public final void ruleExpose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Expose__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Expose__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Expose__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Expose__Group__0 )
            {
             before(grammarAccess.getExposeAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Expose__Group__0 )
            // InternalMyDsl.g:269:4: rule__Expose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getGroup()); 

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
    // $ANTLR end "ruleExpose"


    // $ANTLR start "entryRuleWorkdir"
    // InternalMyDsl.g:278:1: entryRuleWorkdir : ruleWorkdir EOF ;
    public final void entryRuleWorkdir() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleWorkdir EOF )
            // InternalMyDsl.g:280:1: ruleWorkdir EOF
            {
             before(grammarAccess.getWorkdirRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkdir();

            state._fsp--;

             after(grammarAccess.getWorkdirRule()); 
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
    // $ANTLR end "entryRuleWorkdir"


    // $ANTLR start "ruleWorkdir"
    // InternalMyDsl.g:287:1: ruleWorkdir : ( ( rule__Workdir__Group__0 ) ) ;
    public final void ruleWorkdir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Workdir__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Workdir__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Workdir__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Workdir__Group__0 )
            {
             before(grammarAccess.getWorkdirAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Workdir__Group__0 )
            // InternalMyDsl.g:294:4: rule__Workdir__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkdir"


    // $ANTLR start "entryRuleEnv"
    // InternalMyDsl.g:303:1: entryRuleEnv : ruleEnv EOF ;
    public final void entryRuleEnv() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleEnv EOF )
            // InternalMyDsl.g:305:1: ruleEnv EOF
            {
             before(grammarAccess.getEnvRule()); 
            pushFollow(FOLLOW_1);
            ruleEnv();

            state._fsp--;

             after(grammarAccess.getEnvRule()); 
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
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalMyDsl.g:312:1: ruleEnv : ( ( rule__Env__Group__0 ) ) ;
    public final void ruleEnv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Env__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Env__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Env__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Env__Group__0 )
            {
             before(grammarAccess.getEnvAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Env__Group__0 )
            // InternalMyDsl.g:319:4: rule__Env__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Env__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getGroup()); 

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
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:328:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleLabel EOF )
            // InternalMyDsl.g:330:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:337:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Label__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Label__Group__0 )
            // InternalMyDsl.g:344:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:353:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAdd EOF )
            // InternalMyDsl.g:355:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:362:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Add__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Add__Group__0 )
            // InternalMyDsl.g:369:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleCopy"
    // InternalMyDsl.g:378:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleCopy EOF )
            // InternalMyDsl.g:380:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalMyDsl.g:387:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Copy__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Copy__Group__0 )
            // InternalMyDsl.g:394:4: rule__Copy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleIMAGE_NAME"
    // InternalMyDsl.g:403:1: entryRuleIMAGE_NAME : ruleIMAGE_NAME EOF ;
    public final void entryRuleIMAGE_NAME() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleIMAGE_NAME EOF )
            // InternalMyDsl.g:405:1: ruleIMAGE_NAME EOF
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
    // InternalMyDsl.g:412:1: ruleIMAGE_NAME : ( ( rule__IMAGE_NAME__Group__0 ) ) ;
    public final void ruleIMAGE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__IMAGE_NAME__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__IMAGE_NAME__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__IMAGE_NAME__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__IMAGE_NAME__Group__0 )
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__IMAGE_NAME__Group__0 )
            // InternalMyDsl.g:419:4: rule__IMAGE_NAME__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleIMAGE_TAG : ruleIMAGE_TAG EOF ;
    public final void entryRuleIMAGE_TAG() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleIMAGE_TAG EOF )
            // InternalMyDsl.g:430:1: ruleIMAGE_TAG EOF
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
    // InternalMyDsl.g:437:1: ruleIMAGE_TAG : ( ( rule__IMAGE_TAG__Group__0 ) ) ;
    public final void ruleIMAGE_TAG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__IMAGE_TAG__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__IMAGE_TAG__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__IMAGE_TAG__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__IMAGE_TAG__Group__0 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__IMAGE_TAG__Group__0 )
            // InternalMyDsl.g:444:4: rule__IMAGE_TAG__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleIMAGE_DIGEST : ruleIMAGE_DIGEST EOF ;
    public final void entryRuleIMAGE_DIGEST() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleIMAGE_DIGEST EOF )
            // InternalMyDsl.g:455:1: ruleIMAGE_DIGEST EOF
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
    // InternalMyDsl.g:462:1: ruleIMAGE_DIGEST : ( ( rule__IMAGE_DIGEST__Group__0 ) ) ;
    public final void ruleIMAGE_DIGEST() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__IMAGE_DIGEST__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__IMAGE_DIGEST__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__IMAGE_DIGEST__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__IMAGE_DIGEST__Group__0 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__IMAGE_DIGEST__Group__0 )
            // InternalMyDsl.g:469:4: rule__IMAGE_DIGEST__Group__0
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


    // $ANTLR start "entryRuleEXEC_FORM"
    // InternalMyDsl.g:478:1: entryRuleEXEC_FORM : ruleEXEC_FORM EOF ;
    public final void entryRuleEXEC_FORM() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleEXEC_FORM EOF )
            // InternalMyDsl.g:480:1: ruleEXEC_FORM EOF
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
    // InternalMyDsl.g:487:1: ruleEXEC_FORM : ( ( rule__EXEC_FORM__Group__0 ) ) ;
    public final void ruleEXEC_FORM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__EXEC_FORM__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__EXEC_FORM__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__EXEC_FORM__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__EXEC_FORM__Group__0 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__EXEC_FORM__Group__0 )
            // InternalMyDsl.g:494:4: rule__EXEC_FORM__Group__0
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


    // $ANTLR start "rule__Statement__Alternatives_1"
    // InternalMyDsl.g:502:1: rule__Statement__Alternatives_1 : ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) | ( RULE_COMMENT ) );
    public final void rule__Statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) | ( RULE_COMMENT ) )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 27:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
                }
                break;
            case 23:
                {
                alt2=8;
                }
                break;
            case 29:
                {
                alt2=9;
                }
                break;
            case 30:
                {
                alt2=10;
                }
                break;
            case 31:
                {
                alt2=11;
                }
                break;
            case 32:
                {
                alt2=12;
                }
                break;
            case RULE_COMMENT:
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:507:2: ( ruleFrom )
                    {
                    // InternalMyDsl.g:507:2: ( ruleFrom )
                    // InternalMyDsl.g:508:3: ruleFrom
                    {
                     before(grammarAccess.getStatementAccess().getFromParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFrom();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFromParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:513:2: ( ruleCmd )
                    {
                    // InternalMyDsl.g:513:2: ( ruleCmd )
                    // InternalMyDsl.g:514:3: ruleCmd
                    {
                     before(grammarAccess.getStatementAccess().getCmdParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCmd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCmdParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:519:2: ( ruleEntrypoint )
                    {
                    // InternalMyDsl.g:519:2: ( ruleEntrypoint )
                    // InternalMyDsl.g:520:3: ruleEntrypoint
                    {
                     before(grammarAccess.getStatementAccess().getEntrypointParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEntrypoint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEntrypointParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:525:2: ( ruleVolume )
                    {
                    // InternalMyDsl.g:525:2: ( ruleVolume )
                    // InternalMyDsl.g:526:3: ruleVolume
                    {
                     before(grammarAccess.getStatementAccess().getVolumeParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVolume();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVolumeParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:531:2: ( ruleMaintainer )
                    {
                    // InternalMyDsl.g:531:2: ( ruleMaintainer )
                    // InternalMyDsl.g:532:3: ruleMaintainer
                    {
                     before(grammarAccess.getStatementAccess().getMaintainerParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMaintainer();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMaintainerParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:537:2: ( ruleExpose )
                    {
                    // InternalMyDsl.g:537:2: ( ruleExpose )
                    // InternalMyDsl.g:538:3: ruleExpose
                    {
                     before(grammarAccess.getStatementAccess().getExposeParserRuleCall_1_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpose();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExposeParserRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:543:2: ( ruleWorkdir )
                    {
                    // InternalMyDsl.g:543:2: ( ruleWorkdir )
                    // InternalMyDsl.g:544:3: ruleWorkdir
                    {
                     before(grammarAccess.getStatementAccess().getWorkdirParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkdir();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWorkdirParserRuleCall_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:549:2: ( ruleRun )
                    {
                    // InternalMyDsl.g:549:2: ( ruleRun )
                    // InternalMyDsl.g:550:3: ruleRun
                    {
                     before(grammarAccess.getStatementAccess().getRunParserRuleCall_1_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRun();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRunParserRuleCall_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:555:2: ( ruleEnv )
                    {
                    // InternalMyDsl.g:555:2: ( ruleEnv )
                    // InternalMyDsl.g:556:3: ruleEnv
                    {
                     before(grammarAccess.getStatementAccess().getEnvParserRuleCall_1_8()); 
                    pushFollow(FOLLOW_2);
                    ruleEnv();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getEnvParserRuleCall_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:561:2: ( ruleLabel )
                    {
                    // InternalMyDsl.g:561:2: ( ruleLabel )
                    // InternalMyDsl.g:562:3: ruleLabel
                    {
                     before(grammarAccess.getStatementAccess().getLabelParserRuleCall_1_9()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLabelParserRuleCall_1_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:567:2: ( ruleAdd )
                    {
                    // InternalMyDsl.g:567:2: ( ruleAdd )
                    // InternalMyDsl.g:568:3: ruleAdd
                    {
                     before(grammarAccess.getStatementAccess().getAddParserRuleCall_1_10()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAddParserRuleCall_1_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:573:2: ( ruleCopy )
                    {
                    // InternalMyDsl.g:573:2: ( ruleCopy )
                    // InternalMyDsl.g:574:3: ruleCopy
                    {
                     before(grammarAccess.getStatementAccess().getCopyParserRuleCall_1_11()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCopyParserRuleCall_1_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:579:2: ( RULE_COMMENT )
                    {
                    // InternalMyDsl.g:579:2: ( RULE_COMMENT )
                    // InternalMyDsl.g:580:3: RULE_COMMENT
                    {
                     before(grammarAccess.getStatementAccess().getCOMMENTTerminalRuleCall_1_12()); 
                    match(input,RULE_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getStatementAccess().getCOMMENTTerminalRuleCall_1_12()); 

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
    // $ANTLR end "rule__Statement__Alternatives_1"


    // $ANTLR start "rule__From__Tag_or_digestAlternatives_3_0"
    // InternalMyDsl.g:589:1: rule__From__Tag_or_digestAlternatives_3_0 : ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) );
    public final void rule__From__Tag_or_digestAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:594:2: ( ruleIMAGE_TAG )
                    {
                    // InternalMyDsl.g:594:2: ( ruleIMAGE_TAG )
                    // InternalMyDsl.g:595:3: ruleIMAGE_TAG
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
                    // InternalMyDsl.g:600:2: ( ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:600:2: ( ruleIMAGE_DIGEST )
                    // InternalMyDsl.g:601:3: ruleIMAGE_DIGEST
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
    // InternalMyDsl.g:610:1: rule__Cmd__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Cmd__Group_1_1__0 ) ) );
    public final void rule__Cmd__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( ruleEXEC_FORM ) | ( ( rule__Cmd__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
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
                    // InternalMyDsl.g:615:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:615:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:616:3: ruleEXEC_FORM
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
                    // InternalMyDsl.g:621:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:621:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    // InternalMyDsl.g:622:3: ( rule__Cmd__Group_1_1__0 )
                    {
                     before(grammarAccess.getCmdAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:623:3: ( rule__Cmd__Group_1_1__0 )
                    // InternalMyDsl.g:623:4: rule__Cmd__Group_1_1__0
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


    // $ANTLR start "rule__Run__Alternatives_1"
    // InternalMyDsl.g:631:1: rule__Run__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Run__Group_1_1__0 ) ) );
    public final void rule__Run__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:635:1: ( ( ruleEXEC_FORM ) | ( ( rule__Run__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SHELL_CMD) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:636:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:636:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:637:3: ruleEXEC_FORM
                    {
                     before(grammarAccess.getRunAccess().getEXEC_FORMParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEXEC_FORM();

                    state._fsp--;

                     after(grammarAccess.getRunAccess().getEXEC_FORMParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:642:2: ( ( rule__Run__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:642:2: ( ( rule__Run__Group_1_1__0 ) )
                    // InternalMyDsl.g:643:3: ( rule__Run__Group_1_1__0 )
                    {
                     before(grammarAccess.getRunAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:644:3: ( rule__Run__Group_1_1__0 )
                    // InternalMyDsl.g:644:4: rule__Run__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Run__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRunAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Run__Alternatives_1"


    // $ANTLR start "rule__Entrypoint__Alternatives_1"
    // InternalMyDsl.g:652:1: rule__Entrypoint__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Entrypoint__Group_1_1__0 ) ) );
    public final void rule__Entrypoint__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( ruleEXEC_FORM ) | ( ( rule__Entrypoint__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
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
                    // InternalMyDsl.g:657:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:657:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:658:3: ruleEXEC_FORM
                    {
                     before(grammarAccess.getEntrypointAccess().getEXEC_FORMParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEXEC_FORM();

                    state._fsp--;

                     after(grammarAccess.getEntrypointAccess().getEXEC_FORMParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:663:2: ( ( rule__Entrypoint__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:663:2: ( ( rule__Entrypoint__Group_1_1__0 ) )
                    // InternalMyDsl.g:664:3: ( rule__Entrypoint__Group_1_1__0 )
                    {
                     before(grammarAccess.getEntrypointAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:665:3: ( rule__Entrypoint__Group_1_1__0 )
                    // InternalMyDsl.g:665:4: rule__Entrypoint__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrypoint__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntrypointAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Entrypoint__Alternatives_1"


    // $ANTLR start "rule__Volume__Alternatives_1"
    // InternalMyDsl.g:673:1: rule__Volume__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Volume__Group_1_1__0 ) ) );
    public final void rule__Volume__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( ruleEXEC_FORM ) | ( ( rule__Volume__Group_1_1__0 ) ) )
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
                    // InternalMyDsl.g:678:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:678:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:679:3: ruleEXEC_FORM
                    {
                     before(grammarAccess.getVolumeAccess().getEXEC_FORMParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEXEC_FORM();

                    state._fsp--;

                     after(grammarAccess.getVolumeAccess().getEXEC_FORMParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:684:2: ( ( rule__Volume__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:684:2: ( ( rule__Volume__Group_1_1__0 ) )
                    // InternalMyDsl.g:685:3: ( rule__Volume__Group_1_1__0 )
                    {
                     before(grammarAccess.getVolumeAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:686:3: ( rule__Volume__Group_1_1__0 )
                    // InternalMyDsl.g:686:4: rule__Volume__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVolumeAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Volume__Alternatives_1"


    // $ANTLR start "rule__Add__Alternatives_3"
    // InternalMyDsl.g:694:1: rule__Add__Alternatives_3 : ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) );
    public final void rule__Add__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:699:2: ( ( rule__Add__Alternatives_3_0 ) )
                    {
                    // InternalMyDsl.g:699:2: ( ( rule__Add__Alternatives_3_0 ) )
                    // InternalMyDsl.g:700:3: ( rule__Add__Alternatives_3_0 )
                    {
                     before(grammarAccess.getAddAccess().getAlternatives_3_0()); 
                    // InternalMyDsl.g:701:3: ( rule__Add__Alternatives_3_0 )
                    // InternalMyDsl.g:701:4: rule__Add__Alternatives_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Add__Alternatives_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddAccess().getAlternatives_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:705:2: ( ( rule__Add__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:705:2: ( ( rule__Add__Group_3_1__0 ) )
                    // InternalMyDsl.g:706:3: ( rule__Add__Group_3_1__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:707:3: ( rule__Add__Group_3_1__0 )
                    // InternalMyDsl.g:707:4: rule__Add__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Add__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Add__Alternatives_3"


    // $ANTLR start "rule__Add__Alternatives_3_0"
    // InternalMyDsl.g:715:1: rule__Add__Alternatives_3_0 : ( ( '?' ) | ( '*' ) );
    public final void rule__Add__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( '?' ) | ( '*' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:720:2: ( '?' )
                    {
                    // InternalMyDsl.g:720:2: ( '?' )
                    // InternalMyDsl.g:721:3: '?'
                    {
                     before(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:726:2: ( '*' )
                    {
                    // InternalMyDsl.g:726:2: ( '*' )
                    // InternalMyDsl.g:727:3: '*'
                    {
                     before(grammarAccess.getAddAccess().getAsteriskKeyword_3_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getAddAccess().getAsteriskKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Add__Alternatives_3_0"


    // $ANTLR start "rule__Copy__Alternatives_3"
    // InternalMyDsl.g:736:1: rule__Copy__Alternatives_3 : ( ( '?' ) | ( '*' ) );
    public final void rule__Copy__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( '?' ) | ( '*' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:741:2: ( '?' )
                    {
                    // InternalMyDsl.g:741:2: ( '?' )
                    // InternalMyDsl.g:742:3: '?'
                    {
                     before(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:747:2: ( '*' )
                    {
                    // InternalMyDsl.g:747:2: ( '*' )
                    // InternalMyDsl.g:748:3: '*'
                    {
                     before(grammarAccess.getCopyAccess().getAsteriskKeyword_3_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCopyAccess().getAsteriskKeyword_3_1()); 

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
    // $ANTLR end "rule__Copy__Alternatives_3"


    // $ANTLR start "rule__IMAGE_TAG__Alternatives_1"
    // InternalMyDsl.g:757:1: rule__IMAGE_TAG__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_TAG__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt11=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:762:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:762:2: ( RULE_ID )
                    // InternalMyDsl.g:763:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:768:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:768:2: ( RULE_INT )
                    // InternalMyDsl.g:769:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:774:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:774:2: ( RULE_STRING )
                    // InternalMyDsl.g:775:3: RULE_STRING
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
    // InternalMyDsl.g:784:1: rule__IMAGE_TAG__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_TAG__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_INT:
                {
                alt12=2;
                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case 18:
                {
                alt12=4;
                }
                break;
            case 19:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:789:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:789:2: ( RULE_ID )
                    // InternalMyDsl.g:790:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:795:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:795:2: ( RULE_INT )
                    // InternalMyDsl.g:796:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:801:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:801:2: ( RULE_STRING )
                    // InternalMyDsl.g:802:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:807:2: ( '-' )
                    {
                    // InternalMyDsl.g:807:2: ( '-' )
                    // InternalMyDsl.g:808:3: '-'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:813:2: ( '.' )
                    {
                    // InternalMyDsl.g:813:2: ( '.' )
                    // InternalMyDsl.g:814:3: '.'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:823:1: rule__IMAGE_DIGEST__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_DIGEST__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
                {
                alt13=2;
                }
                break;
            case RULE_STRING:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:828:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:828:2: ( RULE_ID )
                    // InternalMyDsl.g:829:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:834:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:834:2: ( RULE_INT )
                    // InternalMyDsl.g:835:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:840:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:840:2: ( RULE_STRING )
                    // InternalMyDsl.g:841:3: RULE_STRING
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
    // InternalMyDsl.g:850:1: rule__IMAGE_DIGEST__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_DIGEST__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            case 18:
                {
                alt14=4;
                }
                break;
            case 19:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:855:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:855:2: ( RULE_ID )
                    // InternalMyDsl.g:856:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:861:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:861:2: ( RULE_INT )
                    // InternalMyDsl.g:862:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:867:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:867:2: ( RULE_STRING )
                    // InternalMyDsl.g:868:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:873:2: ( '-' )
                    {
                    // InternalMyDsl.g:873:2: ( '-' )
                    // InternalMyDsl.g:874:3: '-'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:879:2: ( '.' )
                    {
                    // InternalMyDsl.g:879:2: ( '.' )
                    // InternalMyDsl.g:880:3: '.'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Dockerfile__Group__0"
    // InternalMyDsl.g:889:1: rule__Dockerfile__Group__0 : rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1 ;
    public final void rule__Dockerfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1 )
            // InternalMyDsl.g:894:2: rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Dockerfile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dockerfile__Group__1();

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
    // $ANTLR end "rule__Dockerfile__Group__0"


    // $ANTLR start "rule__Dockerfile__Group__0__Impl"
    // InternalMyDsl.g:901:1: rule__Dockerfile__Group__0__Impl : ( ( rule__Dockerfile__StatementsAssignment_0 ) ) ;
    public final void rule__Dockerfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( ( ( rule__Dockerfile__StatementsAssignment_0 ) ) )
            // InternalMyDsl.g:906:1: ( ( rule__Dockerfile__StatementsAssignment_0 ) )
            {
            // InternalMyDsl.g:906:1: ( ( rule__Dockerfile__StatementsAssignment_0 ) )
            // InternalMyDsl.g:907:2: ( rule__Dockerfile__StatementsAssignment_0 )
            {
             before(grammarAccess.getDockerfileAccess().getStatementsAssignment_0()); 
            // InternalMyDsl.g:908:2: ( rule__Dockerfile__StatementsAssignment_0 )
            // InternalMyDsl.g:908:3: rule__Dockerfile__StatementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dockerfile__StatementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDockerfileAccess().getStatementsAssignment_0()); 

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
    // $ANTLR end "rule__Dockerfile__Group__0__Impl"


    // $ANTLR start "rule__Dockerfile__Group__1"
    // InternalMyDsl.g:916:1: rule__Dockerfile__Group__1 : rule__Dockerfile__Group__1__Impl ;
    public final void rule__Dockerfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__Dockerfile__Group__1__Impl )
            // InternalMyDsl.g:921:2: rule__Dockerfile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dockerfile__Group__1__Impl();

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
    // $ANTLR end "rule__Dockerfile__Group__1"


    // $ANTLR start "rule__Dockerfile__Group__1__Impl"
    // InternalMyDsl.g:927:1: rule__Dockerfile__Group__1__Impl : ( RULE_NL ) ;
    public final void rule__Dockerfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( RULE_NL ) )
            // InternalMyDsl.g:932:1: ( RULE_NL )
            {
            // InternalMyDsl.g:932:1: ( RULE_NL )
            // InternalMyDsl.g:933:2: RULE_NL
            {
             before(grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_1()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Dockerfile__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalMyDsl.g:943:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalMyDsl.g:948:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalMyDsl.g:955:1: rule__Statement__Group__0__Impl : ( ( 'ONBUILD ' )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( ( ( 'ONBUILD ' )? ) )
            // InternalMyDsl.g:960:1: ( ( 'ONBUILD ' )? )
            {
            // InternalMyDsl.g:960:1: ( ( 'ONBUILD ' )? )
            // InternalMyDsl.g:961:2: ( 'ONBUILD ' )?
            {
             before(grammarAccess.getStatementAccess().getONBUILDKeyword_0()); 
            // InternalMyDsl.g:962:2: ( 'ONBUILD ' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:962:3: 'ONBUILD '
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getONBUILDKeyword_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalMyDsl.g:970:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( rule__Statement__Group__1__Impl )
            // InternalMyDsl.g:975:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalMyDsl.g:981:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__Alternatives_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( ( ( rule__Statement__Alternatives_1 ) ) )
            // InternalMyDsl.g:986:1: ( ( rule__Statement__Alternatives_1 ) )
            {
            // InternalMyDsl.g:986:1: ( ( rule__Statement__Alternatives_1 ) )
            // InternalMyDsl.g:987:2: ( rule__Statement__Alternatives_1 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_1()); 
            // InternalMyDsl.g:988:2: ( rule__Statement__Alternatives_1 )
            // InternalMyDsl.g:988:3: rule__Statement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__From__Group__0"
    // InternalMyDsl.g:997:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalMyDsl.g:1002:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1009:1: rule__From__Group__0__Impl : ( 'FROM ' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( ( 'FROM ' ) )
            // InternalMyDsl.g:1014:1: ( 'FROM ' )
            {
            // InternalMyDsl.g:1014:1: ( 'FROM ' )
            // InternalMyDsl.g:1015:2: 'FROM '
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1024:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalMyDsl.g:1029:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1036:1: rule__From__Group__1__Impl : ( ( rule__From__Platform_optionAssignment_1 )? ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1040:1: ( ( ( rule__From__Platform_optionAssignment_1 )? ) )
            // InternalMyDsl.g:1041:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            {
            // InternalMyDsl.g:1041:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            // InternalMyDsl.g:1042:2: ( rule__From__Platform_optionAssignment_1 )?
            {
             before(grammarAccess.getFromAccess().getPlatform_optionAssignment_1()); 
            // InternalMyDsl.g:1043:2: ( rule__From__Platform_optionAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_PLATFORM_OPTION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1043:3: rule__From__Platform_optionAssignment_1
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
    // InternalMyDsl.g:1051:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalMyDsl.g:1056:2: rule__From__Group__2__Impl rule__From__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1063:1: rule__From__Group__2__Impl : ( ( rule__From__NameAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1067:1: ( ( ( rule__From__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1068:1: ( ( rule__From__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1068:1: ( ( rule__From__NameAssignment_2 ) )
            // InternalMyDsl.g:1069:2: ( rule__From__NameAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1070:2: ( rule__From__NameAssignment_2 )
            // InternalMyDsl.g:1070:3: rule__From__NameAssignment_2
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
    // InternalMyDsl.g:1078:1: rule__From__Group__3 : rule__From__Group__3__Impl ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( rule__From__Group__3__Impl )
            // InternalMyDsl.g:1083:2: rule__From__Group__3__Impl
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
    // InternalMyDsl.g:1089:1: rule__From__Group__3__Impl : ( ( rule__From__Tag_or_digestAssignment_3 )? ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( ( ( rule__From__Tag_or_digestAssignment_3 )? ) )
            // InternalMyDsl.g:1094:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            {
            // InternalMyDsl.g:1094:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            // InternalMyDsl.g:1095:2: ( rule__From__Tag_or_digestAssignment_3 )?
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAssignment_3()); 
            // InternalMyDsl.g:1096:2: ( rule__From__Tag_or_digestAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=34 && LA17_0<=35)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1096:3: rule__From__Tag_or_digestAssignment_3
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
    // InternalMyDsl.g:1105:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // InternalMyDsl.g:1110:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1117:1: rule__Cmd__Group__0__Impl : ( 'CMD' ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( ( 'CMD' ) )
            // InternalMyDsl.g:1122:1: ( 'CMD' )
            {
            // InternalMyDsl.g:1122:1: ( 'CMD' )
            // InternalMyDsl.g:1123:2: 'CMD'
            {
             before(grammarAccess.getCmdAccess().getCMDKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1132:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( rule__Cmd__Group__1__Impl )
            // InternalMyDsl.g:1137:2: rule__Cmd__Group__1__Impl
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
    // InternalMyDsl.g:1143:1: rule__Cmd__Group__1__Impl : ( ( rule__Cmd__Alternatives_1 ) ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( ( ( rule__Cmd__Alternatives_1 ) ) )
            // InternalMyDsl.g:1148:1: ( ( rule__Cmd__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1148:1: ( ( rule__Cmd__Alternatives_1 ) )
            // InternalMyDsl.g:1149:2: ( rule__Cmd__Alternatives_1 )
            {
             before(grammarAccess.getCmdAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1150:2: ( rule__Cmd__Alternatives_1 )
            // InternalMyDsl.g:1150:3: rule__Cmd__Alternatives_1
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
    // InternalMyDsl.g:1159:1: rule__Cmd__Group_1_1__0 : rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 ;
    public final void rule__Cmd__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 )
            // InternalMyDsl.g:1164:2: rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1171:1: rule__Cmd__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Cmd__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1175:1: ( ( () ) )
            // InternalMyDsl.g:1176:1: ( () )
            {
            // InternalMyDsl.g:1176:1: ( () )
            // InternalMyDsl.g:1177:2: ()
            {
             before(grammarAccess.getCmdAccess().getCmdAction_1_1_0()); 
            // InternalMyDsl.g:1178:2: ()
            // InternalMyDsl.g:1178:3: 
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
    // InternalMyDsl.g:1186:1: rule__Cmd__Group_1_1__1 : rule__Cmd__Group_1_1__1__Impl ;
    public final void rule__Cmd__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( rule__Cmd__Group_1_1__1__Impl )
            // InternalMyDsl.g:1191:2: rule__Cmd__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1197:1: rule__Cmd__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Cmd__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1202:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1202:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1203:2: RULE_SHELL_CMD
            {
             before(grammarAccess.getCmdAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getCmdAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 

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


    // $ANTLR start "rule__Run__Group__0"
    // InternalMyDsl.g:1213:1: rule__Run__Group__0 : rule__Run__Group__0__Impl rule__Run__Group__1 ;
    public final void rule__Run__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( rule__Run__Group__0__Impl rule__Run__Group__1 )
            // InternalMyDsl.g:1218:2: rule__Run__Group__0__Impl rule__Run__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Run__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Run__Group__1();

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
    // $ANTLR end "rule__Run__Group__0"


    // $ANTLR start "rule__Run__Group__0__Impl"
    // InternalMyDsl.g:1225:1: rule__Run__Group__0__Impl : ( 'RUN' ) ;
    public final void rule__Run__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( ( 'RUN' ) )
            // InternalMyDsl.g:1230:1: ( 'RUN' )
            {
            // InternalMyDsl.g:1230:1: ( 'RUN' )
            // InternalMyDsl.g:1231:2: 'RUN'
            {
             before(grammarAccess.getRunAccess().getRUNKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRunAccess().getRUNKeyword_0()); 

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
    // $ANTLR end "rule__Run__Group__0__Impl"


    // $ANTLR start "rule__Run__Group__1"
    // InternalMyDsl.g:1240:1: rule__Run__Group__1 : rule__Run__Group__1__Impl ;
    public final void rule__Run__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( rule__Run__Group__1__Impl )
            // InternalMyDsl.g:1245:2: rule__Run__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Run__Group__1__Impl();

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
    // $ANTLR end "rule__Run__Group__1"


    // $ANTLR start "rule__Run__Group__1__Impl"
    // InternalMyDsl.g:1251:1: rule__Run__Group__1__Impl : ( ( rule__Run__Alternatives_1 ) ) ;
    public final void rule__Run__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( ( rule__Run__Alternatives_1 ) ) )
            // InternalMyDsl.g:1256:1: ( ( rule__Run__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1256:1: ( ( rule__Run__Alternatives_1 ) )
            // InternalMyDsl.g:1257:2: ( rule__Run__Alternatives_1 )
            {
             before(grammarAccess.getRunAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1258:2: ( rule__Run__Alternatives_1 )
            // InternalMyDsl.g:1258:3: rule__Run__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Run__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRunAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Run__Group__1__Impl"


    // $ANTLR start "rule__Run__Group_1_1__0"
    // InternalMyDsl.g:1267:1: rule__Run__Group_1_1__0 : rule__Run__Group_1_1__0__Impl rule__Run__Group_1_1__1 ;
    public final void rule__Run__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( rule__Run__Group_1_1__0__Impl rule__Run__Group_1_1__1 )
            // InternalMyDsl.g:1272:2: rule__Run__Group_1_1__0__Impl rule__Run__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Run__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Run__Group_1_1__1();

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
    // $ANTLR end "rule__Run__Group_1_1__0"


    // $ANTLR start "rule__Run__Group_1_1__0__Impl"
    // InternalMyDsl.g:1279:1: rule__Run__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Run__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( ( () ) )
            // InternalMyDsl.g:1284:1: ( () )
            {
            // InternalMyDsl.g:1284:1: ( () )
            // InternalMyDsl.g:1285:2: ()
            {
             before(grammarAccess.getRunAccess().getRunAction_1_1_0()); 
            // InternalMyDsl.g:1286:2: ()
            // InternalMyDsl.g:1286:3: 
            {
            }

             after(grammarAccess.getRunAccess().getRunAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group_1_1__0__Impl"


    // $ANTLR start "rule__Run__Group_1_1__1"
    // InternalMyDsl.g:1294:1: rule__Run__Group_1_1__1 : rule__Run__Group_1_1__1__Impl ;
    public final void rule__Run__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( rule__Run__Group_1_1__1__Impl )
            // InternalMyDsl.g:1299:2: rule__Run__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Run__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Run__Group_1_1__1"


    // $ANTLR start "rule__Run__Group_1_1__1__Impl"
    // InternalMyDsl.g:1305:1: rule__Run__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Run__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1310:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1310:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1311:2: RULE_SHELL_CMD
            {
             before(grammarAccess.getRunAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getRunAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__Run__Group_1_1__1__Impl"


    // $ANTLR start "rule__Entrypoint__Group__0"
    // InternalMyDsl.g:1321:1: rule__Entrypoint__Group__0 : rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 ;
    public final void rule__Entrypoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 )
            // InternalMyDsl.g:1326:2: rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Entrypoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__1();

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
    // $ANTLR end "rule__Entrypoint__Group__0"


    // $ANTLR start "rule__Entrypoint__Group__0__Impl"
    // InternalMyDsl.g:1333:1: rule__Entrypoint__Group__0__Impl : ( 'ENTRYPOINT' ) ;
    public final void rule__Entrypoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( ( 'ENTRYPOINT' ) )
            // InternalMyDsl.g:1338:1: ( 'ENTRYPOINT' )
            {
            // InternalMyDsl.g:1338:1: ( 'ENTRYPOINT' )
            // InternalMyDsl.g:1339:2: 'ENTRYPOINT'
            {
             before(grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0()); 

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
    // $ANTLR end "rule__Entrypoint__Group__0__Impl"


    // $ANTLR start "rule__Entrypoint__Group__1"
    // InternalMyDsl.g:1348:1: rule__Entrypoint__Group__1 : rule__Entrypoint__Group__1__Impl ;
    public final void rule__Entrypoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( rule__Entrypoint__Group__1__Impl )
            // InternalMyDsl.g:1353:2: rule__Entrypoint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__1__Impl();

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
    // $ANTLR end "rule__Entrypoint__Group__1"


    // $ANTLR start "rule__Entrypoint__Group__1__Impl"
    // InternalMyDsl.g:1359:1: rule__Entrypoint__Group__1__Impl : ( ( rule__Entrypoint__Alternatives_1 ) ) ;
    public final void rule__Entrypoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( ( rule__Entrypoint__Alternatives_1 ) ) )
            // InternalMyDsl.g:1364:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1364:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            // InternalMyDsl.g:1365:2: ( rule__Entrypoint__Alternatives_1 )
            {
             before(grammarAccess.getEntrypointAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1366:2: ( rule__Entrypoint__Alternatives_1 )
            // InternalMyDsl.g:1366:3: rule__Entrypoint__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Entrypoint__Group__1__Impl"


    // $ANTLR start "rule__Entrypoint__Group_1_1__0"
    // InternalMyDsl.g:1375:1: rule__Entrypoint__Group_1_1__0 : rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1 ;
    public final void rule__Entrypoint__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1 )
            // InternalMyDsl.g:1380:2: rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Entrypoint__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group_1_1__1();

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
    // $ANTLR end "rule__Entrypoint__Group_1_1__0"


    // $ANTLR start "rule__Entrypoint__Group_1_1__0__Impl"
    // InternalMyDsl.g:1387:1: rule__Entrypoint__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Entrypoint__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( () ) )
            // InternalMyDsl.g:1392:1: ( () )
            {
            // InternalMyDsl.g:1392:1: ( () )
            // InternalMyDsl.g:1393:2: ()
            {
             before(grammarAccess.getEntrypointAccess().getEntrypointAction_1_1_0()); 
            // InternalMyDsl.g:1394:2: ()
            // InternalMyDsl.g:1394:3: 
            {
            }

             after(grammarAccess.getEntrypointAccess().getEntrypointAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group_1_1__0__Impl"


    // $ANTLR start "rule__Entrypoint__Group_1_1__1"
    // InternalMyDsl.g:1402:1: rule__Entrypoint__Group_1_1__1 : rule__Entrypoint__Group_1_1__1__Impl ;
    public final void rule__Entrypoint__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__Entrypoint__Group_1_1__1__Impl )
            // InternalMyDsl.g:1407:2: rule__Entrypoint__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Entrypoint__Group_1_1__1"


    // $ANTLR start "rule__Entrypoint__Group_1_1__1__Impl"
    // InternalMyDsl.g:1413:1: rule__Entrypoint__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Entrypoint__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1418:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1418:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1419:2: RULE_SHELL_CMD
            {
             before(grammarAccess.getEntrypointAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getEntrypointAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__Entrypoint__Group_1_1__1__Impl"


    // $ANTLR start "rule__Volume__Group__0"
    // InternalMyDsl.g:1429:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalMyDsl.g:1434:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Volume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__1();

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
    // $ANTLR end "rule__Volume__Group__0"


    // $ANTLR start "rule__Volume__Group__0__Impl"
    // InternalMyDsl.g:1441:1: rule__Volume__Group__0__Impl : ( 'VOLUME' ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( 'VOLUME' ) )
            // InternalMyDsl.g:1446:1: ( 'VOLUME' )
            {
            // InternalMyDsl.g:1446:1: ( 'VOLUME' )
            // InternalMyDsl.g:1447:2: 'VOLUME'
            {
             before(grammarAccess.getVolumeAccess().getVOLUMEKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getVOLUMEKeyword_0()); 

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
    // $ANTLR end "rule__Volume__Group__0__Impl"


    // $ANTLR start "rule__Volume__Group__1"
    // InternalMyDsl.g:1456:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( rule__Volume__Group__1__Impl )
            // InternalMyDsl.g:1461:2: rule__Volume__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__1__Impl();

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
    // $ANTLR end "rule__Volume__Group__1"


    // $ANTLR start "rule__Volume__Group__1__Impl"
    // InternalMyDsl.g:1467:1: rule__Volume__Group__1__Impl : ( ( rule__Volume__Alternatives_1 ) ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( ( rule__Volume__Alternatives_1 ) ) )
            // InternalMyDsl.g:1472:1: ( ( rule__Volume__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1472:1: ( ( rule__Volume__Alternatives_1 ) )
            // InternalMyDsl.g:1473:2: ( rule__Volume__Alternatives_1 )
            {
             before(grammarAccess.getVolumeAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1474:2: ( rule__Volume__Alternatives_1 )
            // InternalMyDsl.g:1474:3: rule__Volume__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Volume__Group__1__Impl"


    // $ANTLR start "rule__Volume__Group_1_1__0"
    // InternalMyDsl.g:1483:1: rule__Volume__Group_1_1__0 : rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1 ;
    public final void rule__Volume__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1 )
            // InternalMyDsl.g:1488:2: rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Volume__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group_1_1__1();

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
    // $ANTLR end "rule__Volume__Group_1_1__0"


    // $ANTLR start "rule__Volume__Group_1_1__0__Impl"
    // InternalMyDsl.g:1495:1: rule__Volume__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Volume__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( () ) )
            // InternalMyDsl.g:1500:1: ( () )
            {
            // InternalMyDsl.g:1500:1: ( () )
            // InternalMyDsl.g:1501:2: ()
            {
             before(grammarAccess.getVolumeAccess().getVolumeAction_1_1_0()); 
            // InternalMyDsl.g:1502:2: ()
            // InternalMyDsl.g:1502:3: 
            {
            }

             after(grammarAccess.getVolumeAccess().getVolumeAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group_1_1__0__Impl"


    // $ANTLR start "rule__Volume__Group_1_1__1"
    // InternalMyDsl.g:1510:1: rule__Volume__Group_1_1__1 : rule__Volume__Group_1_1__1__Impl ;
    public final void rule__Volume__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( rule__Volume__Group_1_1__1__Impl )
            // InternalMyDsl.g:1515:2: rule__Volume__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Volume__Group_1_1__1"


    // $ANTLR start "rule__Volume__Group_1_1__1__Impl"
    // InternalMyDsl.g:1521:1: rule__Volume__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Volume__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1526:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1526:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1527:2: RULE_SHELL_CMD
            {
             before(grammarAccess.getVolumeAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getSHELL_CMDTerminalRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__Volume__Group_1_1__1__Impl"


    // $ANTLR start "rule__Maintainer__Group__0"
    // InternalMyDsl.g:1537:1: rule__Maintainer__Group__0 : rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 ;
    public final void rule__Maintainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 )
            // InternalMyDsl.g:1542:2: rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Maintainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__1();

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
    // $ANTLR end "rule__Maintainer__Group__0"


    // $ANTLR start "rule__Maintainer__Group__0__Impl"
    // InternalMyDsl.g:1549:1: rule__Maintainer__Group__0__Impl : ( 'MAINTAINER' ) ;
    public final void rule__Maintainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( 'MAINTAINER' ) )
            // InternalMyDsl.g:1554:1: ( 'MAINTAINER' )
            {
            // InternalMyDsl.g:1554:1: ( 'MAINTAINER' )
            // InternalMyDsl.g:1555:2: 'MAINTAINER'
            {
             before(grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0()); 

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
    // $ANTLR end "rule__Maintainer__Group__0__Impl"


    // $ANTLR start "rule__Maintainer__Group__1"
    // InternalMyDsl.g:1564:1: rule__Maintainer__Group__1 : rule__Maintainer__Group__1__Impl ;
    public final void rule__Maintainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( rule__Maintainer__Group__1__Impl )
            // InternalMyDsl.g:1569:2: rule__Maintainer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__1__Impl();

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
    // $ANTLR end "rule__Maintainer__Group__1"


    // $ANTLR start "rule__Maintainer__Group__1__Impl"
    // InternalMyDsl.g:1575:1: rule__Maintainer__Group__1__Impl : ( ( rule__Maintainer__NameAssignment_1 ) ) ;
    public final void rule__Maintainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( ( ( rule__Maintainer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1580:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1580:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            // InternalMyDsl.g:1581:2: ( rule__Maintainer__NameAssignment_1 )
            {
             before(grammarAccess.getMaintainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1582:2: ( rule__Maintainer__NameAssignment_1 )
            // InternalMyDsl.g:1582:3: rule__Maintainer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Maintainer__Group__1__Impl"


    // $ANTLR start "rule__Expose__Group__0"
    // InternalMyDsl.g:1591:1: rule__Expose__Group__0 : rule__Expose__Group__0__Impl rule__Expose__Group__1 ;
    public final void rule__Expose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( rule__Expose__Group__0__Impl rule__Expose__Group__1 )
            // InternalMyDsl.g:1596:2: rule__Expose__Group__0__Impl rule__Expose__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Expose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expose__Group__1();

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
    // $ANTLR end "rule__Expose__Group__0"


    // $ANTLR start "rule__Expose__Group__0__Impl"
    // InternalMyDsl.g:1603:1: rule__Expose__Group__0__Impl : ( 'EXPOSE' ) ;
    public final void rule__Expose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1607:1: ( ( 'EXPOSE' ) )
            // InternalMyDsl.g:1608:1: ( 'EXPOSE' )
            {
            // InternalMyDsl.g:1608:1: ( 'EXPOSE' )
            // InternalMyDsl.g:1609:2: 'EXPOSE'
            {
             before(grammarAccess.getExposeAccess().getEXPOSEKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExposeAccess().getEXPOSEKeyword_0()); 

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
    // $ANTLR end "rule__Expose__Group__0__Impl"


    // $ANTLR start "rule__Expose__Group__1"
    // InternalMyDsl.g:1618:1: rule__Expose__Group__1 : rule__Expose__Group__1__Impl ;
    public final void rule__Expose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( rule__Expose__Group__1__Impl )
            // InternalMyDsl.g:1623:2: rule__Expose__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expose__Group__1__Impl();

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
    // $ANTLR end "rule__Expose__Group__1"


    // $ANTLR start "rule__Expose__Group__1__Impl"
    // InternalMyDsl.g:1629:1: rule__Expose__Group__1__Impl : ( ( rule__Expose__PortsAssignment_1 ) ) ;
    public final void rule__Expose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( ( ( rule__Expose__PortsAssignment_1 ) ) )
            // InternalMyDsl.g:1634:1: ( ( rule__Expose__PortsAssignment_1 ) )
            {
            // InternalMyDsl.g:1634:1: ( ( rule__Expose__PortsAssignment_1 ) )
            // InternalMyDsl.g:1635:2: ( rule__Expose__PortsAssignment_1 )
            {
             before(grammarAccess.getExposeAccess().getPortsAssignment_1()); 
            // InternalMyDsl.g:1636:2: ( rule__Expose__PortsAssignment_1 )
            // InternalMyDsl.g:1636:3: rule__Expose__PortsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expose__PortsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getPortsAssignment_1()); 

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
    // $ANTLR end "rule__Expose__Group__1__Impl"


    // $ANTLR start "rule__Workdir__Group__0"
    // InternalMyDsl.g:1645:1: rule__Workdir__Group__0 : rule__Workdir__Group__0__Impl rule__Workdir__Group__1 ;
    public final void rule__Workdir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( rule__Workdir__Group__0__Impl rule__Workdir__Group__1 )
            // InternalMyDsl.g:1650:2: rule__Workdir__Group__0__Impl rule__Workdir__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Workdir__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workdir__Group__1();

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
    // $ANTLR end "rule__Workdir__Group__0"


    // $ANTLR start "rule__Workdir__Group__0__Impl"
    // InternalMyDsl.g:1657:1: rule__Workdir__Group__0__Impl : ( 'WORKDIR' ) ;
    public final void rule__Workdir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( ( 'WORKDIR' ) )
            // InternalMyDsl.g:1662:1: ( 'WORKDIR' )
            {
            // InternalMyDsl.g:1662:1: ( 'WORKDIR' )
            // InternalMyDsl.g:1663:2: 'WORKDIR'
            {
             before(grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0()); 

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
    // $ANTLR end "rule__Workdir__Group__0__Impl"


    // $ANTLR start "rule__Workdir__Group__1"
    // InternalMyDsl.g:1672:1: rule__Workdir__Group__1 : rule__Workdir__Group__1__Impl ;
    public final void rule__Workdir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( rule__Workdir__Group__1__Impl )
            // InternalMyDsl.g:1677:2: rule__Workdir__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__Group__1__Impl();

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
    // $ANTLR end "rule__Workdir__Group__1"


    // $ANTLR start "rule__Workdir__Group__1__Impl"
    // InternalMyDsl.g:1683:1: rule__Workdir__Group__1__Impl : ( ( rule__Workdir__PathAssignment_1 ) ) ;
    public final void rule__Workdir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( ( ( rule__Workdir__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1688:1: ( ( rule__Workdir__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1688:1: ( ( rule__Workdir__PathAssignment_1 ) )
            // InternalMyDsl.g:1689:2: ( rule__Workdir__PathAssignment_1 )
            {
             before(grammarAccess.getWorkdirAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1690:2: ( rule__Workdir__PathAssignment_1 )
            // InternalMyDsl.g:1690:3: rule__Workdir__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__Workdir__Group__1__Impl"


    // $ANTLR start "rule__Env__Group__0"
    // InternalMyDsl.g:1699:1: rule__Env__Group__0 : rule__Env__Group__0__Impl rule__Env__Group__1 ;
    public final void rule__Env__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( rule__Env__Group__0__Impl rule__Env__Group__1 )
            // InternalMyDsl.g:1704:2: rule__Env__Group__0__Impl rule__Env__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Env__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Env__Group__1();

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
    // $ANTLR end "rule__Env__Group__0"


    // $ANTLR start "rule__Env__Group__0__Impl"
    // InternalMyDsl.g:1711:1: rule__Env__Group__0__Impl : ( 'ENV ' ) ;
    public final void rule__Env__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( ( 'ENV ' ) )
            // InternalMyDsl.g:1716:1: ( 'ENV ' )
            {
            // InternalMyDsl.g:1716:1: ( 'ENV ' )
            // InternalMyDsl.g:1717:2: 'ENV '
            {
             before(grammarAccess.getEnvAccess().getENVKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEnvAccess().getENVKeyword_0()); 

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
    // $ANTLR end "rule__Env__Group__0__Impl"


    // $ANTLR start "rule__Env__Group__1"
    // InternalMyDsl.g:1726:1: rule__Env__Group__1 : rule__Env__Group__1__Impl ;
    public final void rule__Env__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( rule__Env__Group__1__Impl )
            // InternalMyDsl.g:1731:2: rule__Env__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Env__Group__1__Impl();

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
    // $ANTLR end "rule__Env__Group__1"


    // $ANTLR start "rule__Env__Group__1__Impl"
    // InternalMyDsl.g:1737:1: rule__Env__Group__1__Impl : ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Env__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1742:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1742:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1743:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1743:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1744:3: ( rule__Env__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1745:3: ( rule__Env__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1745:4: rule__Env__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__Env__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1748:2: ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1749:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1750:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_KV_PAIR_EQUALS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1750:4: rule__Env__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Env__Key_value_pairsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Env__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalMyDsl.g:1760:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:1765:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalMyDsl.g:1772:1: rule__Label__Group__0__Impl : ( 'LABEL ' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( ( 'LABEL ' ) )
            // InternalMyDsl.g:1777:1: ( 'LABEL ' )
            {
            // InternalMyDsl.g:1777:1: ( 'LABEL ' )
            // InternalMyDsl.g:1778:2: 'LABEL '
            {
             before(grammarAccess.getLabelAccess().getLABELKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLABELKeyword_0()); 

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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalMyDsl.g:1787:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( rule__Label__Group__1__Impl )
            // InternalMyDsl.g:1792:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__1__Impl();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalMyDsl.g:1798:1: rule__Label__Group__1__Impl : ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1802:1: ( ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1803:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1803:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1804:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1804:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1805:3: ( rule__Label__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1806:3: ( rule__Label__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1806:4: rule__Label__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__Label__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1809:2: ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1810:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1811:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_KV_PAIR_EQUALS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1811:4: rule__Label__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Label__Key_value_pairsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalMyDsl.g:1821:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:1826:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

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
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalMyDsl.g:1833:1: rule__Add__Group__0__Impl : ( 'ADD ' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( 'ADD ' ) )
            // InternalMyDsl.g:1838:1: ( 'ADD ' )
            {
            // InternalMyDsl.g:1838:1: ( 'ADD ' )
            // InternalMyDsl.g:1839:2: 'ADD '
            {
             before(grammarAccess.getAddAccess().getADDKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getADDKeyword_0()); 

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
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalMyDsl.g:1848:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalMyDsl.g:1853:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Add__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__2();

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
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalMyDsl.g:1860:1: rule__Add__Group__1__Impl : ( ( rule__Add__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( ( rule__Add__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:1865:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:1865:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:1866:2: ( rule__Add__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getAddAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:1867:2: ( rule__Add__Chown_optionsAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_CHOWN_OPTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1867:3: rule__Add__Chown_optionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Add__Chown_optionsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddAccess().getChown_optionsAssignment_1()); 

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
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__2"
    // InternalMyDsl.g:1875:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalMyDsl.g:1880:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Add__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__3();

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
    // $ANTLR end "rule__Add__Group__2"


    // $ANTLR start "rule__Add__Group__2__Impl"
    // InternalMyDsl.g:1887:1: rule__Add__Group__2__Impl : ( ( rule__Add__FileAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( ( ( rule__Add__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1892:1: ( ( rule__Add__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1892:1: ( ( rule__Add__FileAssignment_2 ) )
            // InternalMyDsl.g:1893:2: ( rule__Add__FileAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1894:2: ( rule__Add__FileAssignment_2 )
            // InternalMyDsl.g:1894:3: rule__Add__FileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Add__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getFileAssignment_2()); 

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
    // $ANTLR end "rule__Add__Group__2__Impl"


    // $ANTLR start "rule__Add__Group__3"
    // InternalMyDsl.g:1902:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalMyDsl.g:1907:2: rule__Add__Group__3__Impl rule__Add__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Add__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__4();

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
    // $ANTLR end "rule__Add__Group__3"


    // $ANTLR start "rule__Add__Group__3__Impl"
    // InternalMyDsl.g:1914:1: rule__Add__Group__3__Impl : ( ( rule__Add__Alternatives_3 )? ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( ( ( rule__Add__Alternatives_3 )? ) )
            // InternalMyDsl.g:1919:1: ( ( rule__Add__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1919:1: ( ( rule__Add__Alternatives_3 )? )
            // InternalMyDsl.g:1920:2: ( rule__Add__Alternatives_3 )?
            {
             before(grammarAccess.getAddAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1921:2: ( rule__Add__Alternatives_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=16 && LA21_0<=17)||LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1921:3: rule__Add__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Add__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Add__Group__3__Impl"


    // $ANTLR start "rule__Add__Group__4"
    // InternalMyDsl.g:1929:1: rule__Add__Group__4 : rule__Add__Group__4__Impl ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( rule__Add__Group__4__Impl )
            // InternalMyDsl.g:1934:2: rule__Add__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__4__Impl();

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
    // $ANTLR end "rule__Add__Group__4"


    // $ANTLR start "rule__Add__Group__4__Impl"
    // InternalMyDsl.g:1940:1: rule__Add__Group__4__Impl : ( ( rule__Add__DirectoryAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( ( rule__Add__DirectoryAssignment_4 ) ) )
            // InternalMyDsl.g:1945:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            {
            // InternalMyDsl.g:1945:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            // InternalMyDsl.g:1946:2: ( rule__Add__DirectoryAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getDirectoryAssignment_4()); 
            // InternalMyDsl.g:1947:2: ( rule__Add__DirectoryAssignment_4 )
            // InternalMyDsl.g:1947:3: rule__Add__DirectoryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Add__DirectoryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getDirectoryAssignment_4()); 

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
    // $ANTLR end "rule__Add__Group__4__Impl"


    // $ANTLR start "rule__Add__Group_3_1__0"
    // InternalMyDsl.g:1956:1: rule__Add__Group_3_1__0 : rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 ;
    public final void rule__Add__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 )
            // InternalMyDsl.g:1961:2: rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Add__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_3_1__1();

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
    // $ANTLR end "rule__Add__Group_3_1__0"


    // $ANTLR start "rule__Add__Group_3_1__0__Impl"
    // InternalMyDsl.g:1968:1: rule__Add__Group_3_1__0__Impl : ( '.' ) ;
    public final void rule__Add__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( ( '.' ) )
            // InternalMyDsl.g:1973:1: ( '.' )
            {
            // InternalMyDsl.g:1973:1: ( '.' )
            // InternalMyDsl.g:1974:2: '.'
            {
             before(grammarAccess.getAddAccess().getFullStopKeyword_3_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getFullStopKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Add__Group_3_1__0__Impl"


    // $ANTLR start "rule__Add__Group_3_1__1"
    // InternalMyDsl.g:1983:1: rule__Add__Group_3_1__1 : rule__Add__Group_3_1__1__Impl ;
    public final void rule__Add__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( rule__Add__Group_3_1__1__Impl )
            // InternalMyDsl.g:1988:2: rule__Add__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Add__Group_3_1__1"


    // $ANTLR start "rule__Add__Group_3_1__1__Impl"
    // InternalMyDsl.g:1994:1: rule__Add__Group_3_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Add__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1999:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1999:1: ( RULE_ID )
            // InternalMyDsl.g:2000:2: RULE_ID
            {
             before(grammarAccess.getAddAccess().getIDTerminalRuleCall_3_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getIDTerminalRuleCall_3_1_1()); 

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
    // $ANTLR end "rule__Add__Group_3_1__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalMyDsl.g:2010:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalMyDsl.g:2015:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__1();

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
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // InternalMyDsl.g:2022:1: rule__Copy__Group__0__Impl : ( 'COPY ' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( ( 'COPY ' ) )
            // InternalMyDsl.g:2027:1: ( 'COPY ' )
            {
            // InternalMyDsl.g:2027:1: ( 'COPY ' )
            // InternalMyDsl.g:2028:2: 'COPY '
            {
             before(grammarAccess.getCopyAccess().getCOPYKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCOPYKeyword_0()); 

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
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // InternalMyDsl.g:2037:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalMyDsl.g:2042:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__2();

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
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // InternalMyDsl.g:2049:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( ( ( rule__Copy__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:2054:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:2054:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:2055:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getCopyAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:2056:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_CHOWN_OPTION) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2056:3: rule__Copy__Chown_optionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Chown_optionsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCopyAccess().getChown_optionsAssignment_1()); 

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
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group__2"
    // InternalMyDsl.g:2064:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalMyDsl.g:2069:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__3();

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
    // $ANTLR end "rule__Copy__Group__2"


    // $ANTLR start "rule__Copy__Group__2__Impl"
    // InternalMyDsl.g:2076:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__FileAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( ( ( rule__Copy__FileAssignment_2 ) ) )
            // InternalMyDsl.g:2081:1: ( ( rule__Copy__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:2081:1: ( ( rule__Copy__FileAssignment_2 ) )
            // InternalMyDsl.g:2082:2: ( rule__Copy__FileAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:2083:2: ( rule__Copy__FileAssignment_2 )
            // InternalMyDsl.g:2083:3: rule__Copy__FileAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Copy__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getFileAssignment_2()); 

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
    // $ANTLR end "rule__Copy__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__3"
    // InternalMyDsl.g:2091:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalMyDsl.g:2096:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__4();

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
    // $ANTLR end "rule__Copy__Group__3"


    // $ANTLR start "rule__Copy__Group__3__Impl"
    // InternalMyDsl.g:2103:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__Alternatives_3 )? ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( ( ( rule__Copy__Alternatives_3 )? ) )
            // InternalMyDsl.g:2108:1: ( ( rule__Copy__Alternatives_3 )? )
            {
            // InternalMyDsl.g:2108:1: ( ( rule__Copy__Alternatives_3 )? )
            // InternalMyDsl.g:2109:2: ( rule__Copy__Alternatives_3 )?
            {
             before(grammarAccess.getCopyAccess().getAlternatives_3()); 
            // InternalMyDsl.g:2110:2: ( rule__Copy__Alternatives_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=16 && LA23_0<=17)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2110:3: rule__Copy__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCopyAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Copy__Group__3__Impl"


    // $ANTLR start "rule__Copy__Group__4"
    // InternalMyDsl.g:2118:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalMyDsl.g:2123:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__5();

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
    // $ANTLR end "rule__Copy__Group__4"


    // $ANTLR start "rule__Copy__Group__4__Impl"
    // InternalMyDsl.g:2130:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__Group_4__0 )? ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( ( ( rule__Copy__Group_4__0 )? ) )
            // InternalMyDsl.g:2135:1: ( ( rule__Copy__Group_4__0 )? )
            {
            // InternalMyDsl.g:2135:1: ( ( rule__Copy__Group_4__0 )? )
            // InternalMyDsl.g:2136:2: ( rule__Copy__Group_4__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_4()); 
            // InternalMyDsl.g:2137:2: ( rule__Copy__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2137:3: rule__Copy__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Copy__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCopyAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Copy__Group__4__Impl"


    // $ANTLR start "rule__Copy__Group__5"
    // InternalMyDsl.g:2145:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( rule__Copy__Group__5__Impl )
            // InternalMyDsl.g:2150:2: rule__Copy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__5__Impl();

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
    // $ANTLR end "rule__Copy__Group__5"


    // $ANTLR start "rule__Copy__Group__5__Impl"
    // InternalMyDsl.g:2156:1: rule__Copy__Group__5__Impl : ( ( rule__Copy__DirectoryAssignment_5 ) ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( ( rule__Copy__DirectoryAssignment_5 ) ) )
            // InternalMyDsl.g:2161:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            {
            // InternalMyDsl.g:2161:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            // InternalMyDsl.g:2162:2: ( rule__Copy__DirectoryAssignment_5 )
            {
             before(grammarAccess.getCopyAccess().getDirectoryAssignment_5()); 
            // InternalMyDsl.g:2163:2: ( rule__Copy__DirectoryAssignment_5 )
            // InternalMyDsl.g:2163:3: rule__Copy__DirectoryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Copy__DirectoryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getDirectoryAssignment_5()); 

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
    // $ANTLR end "rule__Copy__Group__5__Impl"


    // $ANTLR start "rule__Copy__Group_4__0"
    // InternalMyDsl.g:2172:1: rule__Copy__Group_4__0 : rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 ;
    public final void rule__Copy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 )
            // InternalMyDsl.g:2177:2: rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Copy__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group_4__1();

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
    // $ANTLR end "rule__Copy__Group_4__0"


    // $ANTLR start "rule__Copy__Group_4__0__Impl"
    // InternalMyDsl.g:2184:1: rule__Copy__Group_4__0__Impl : ( '.' ) ;
    public final void rule__Copy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( '.' ) )
            // InternalMyDsl.g:2189:1: ( '.' )
            {
            // InternalMyDsl.g:2189:1: ( '.' )
            // InternalMyDsl.g:2190:2: '.'
            {
             before(grammarAccess.getCopyAccess().getFullStopKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getFullStopKeyword_4_0()); 

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
    // $ANTLR end "rule__Copy__Group_4__0__Impl"


    // $ANTLR start "rule__Copy__Group_4__1"
    // InternalMyDsl.g:2199:1: rule__Copy__Group_4__1 : rule__Copy__Group_4__1__Impl ;
    public final void rule__Copy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( rule__Copy__Group_4__1__Impl )
            // InternalMyDsl.g:2204:2: rule__Copy__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group_4__1__Impl();

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
    // $ANTLR end "rule__Copy__Group_4__1"


    // $ANTLR start "rule__Copy__Group_4__1__Impl"
    // InternalMyDsl.g:2210:1: rule__Copy__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__Copy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2215:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2215:1: ( RULE_ID )
            // InternalMyDsl.g:2216:2: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getIDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Copy__Group_4__1__Impl"


    // $ANTLR start "rule__IMAGE_NAME__Group__0"
    // InternalMyDsl.g:2226:1: rule__IMAGE_NAME__Group__0 : rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 ;
    public final void rule__IMAGE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 )
            // InternalMyDsl.g:2231:2: rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2238:1: rule__IMAGE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2243:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2243:1: ( RULE_ID )
            // InternalMyDsl.g:2244:2: RULE_ID
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
    // InternalMyDsl.g:2253:1: rule__IMAGE_NAME__Group__1 : rule__IMAGE_NAME__Group__1__Impl ;
    public final void rule__IMAGE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( rule__IMAGE_NAME__Group__1__Impl )
            // InternalMyDsl.g:2258:2: rule__IMAGE_NAME__Group__1__Impl
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
    // InternalMyDsl.g:2264:1: rule__IMAGE_NAME__Group__1__Impl : ( ( rule__IMAGE_NAME__Group_1__0 )* ) ;
    public final void rule__IMAGE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( ( rule__IMAGE_NAME__Group_1__0 )* ) )
            // InternalMyDsl.g:2269:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            {
            // InternalMyDsl.g:2269:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            // InternalMyDsl.g:2270:2: ( rule__IMAGE_NAME__Group_1__0 )*
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup_1()); 
            // InternalMyDsl.g:2271:2: ( rule__IMAGE_NAME__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2271:3: rule__IMAGE_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__IMAGE_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMyDsl.g:2280:1: rule__IMAGE_NAME__Group_1__0 : rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 ;
    public final void rule__IMAGE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 )
            // InternalMyDsl.g:2285:2: rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2292:1: rule__IMAGE_NAME__Group_1__0__Impl : ( '/' ) ;
    public final void rule__IMAGE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( ( '/' ) )
            // InternalMyDsl.g:2297:1: ( '/' )
            {
            // InternalMyDsl.g:2297:1: ( '/' )
            // InternalMyDsl.g:2298:2: '/'
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2307:1: rule__IMAGE_NAME__Group_1__1 : rule__IMAGE_NAME__Group_1__1__Impl ;
    public final void rule__IMAGE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( rule__IMAGE_NAME__Group_1__1__Impl )
            // InternalMyDsl.g:2312:2: rule__IMAGE_NAME__Group_1__1__Impl
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
    // InternalMyDsl.g:2318:1: rule__IMAGE_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2323:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2323:1: ( RULE_ID )
            // InternalMyDsl.g:2324:2: RULE_ID
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
    // InternalMyDsl.g:2334:1: rule__IMAGE_TAG__Group__0 : rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 ;
    public final void rule__IMAGE_TAG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 )
            // InternalMyDsl.g:2339:2: rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2346:1: rule__IMAGE_TAG__Group__0__Impl : ( ':' ) ;
    public final void rule__IMAGE_TAG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( ( ':' ) )
            // InternalMyDsl.g:2351:1: ( ':' )
            {
            // InternalMyDsl.g:2351:1: ( ':' )
            // InternalMyDsl.g:2352:2: ':'
            {
             before(grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2361:1: rule__IMAGE_TAG__Group__1 : rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 ;
    public final void rule__IMAGE_TAG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 )
            // InternalMyDsl.g:2366:2: rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2373:1: rule__IMAGE_TAG__Group__1__Impl : ( ( rule__IMAGE_TAG__Alternatives_1 ) ) ;
    public final void rule__IMAGE_TAG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( ( ( rule__IMAGE_TAG__Alternatives_1 ) ) )
            // InternalMyDsl.g:2378:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2378:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            // InternalMyDsl.g:2379:2: ( rule__IMAGE_TAG__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2380:2: ( rule__IMAGE_TAG__Alternatives_1 )
            // InternalMyDsl.g:2380:3: rule__IMAGE_TAG__Alternatives_1
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
    // InternalMyDsl.g:2388:1: rule__IMAGE_TAG__Group__2 : rule__IMAGE_TAG__Group__2__Impl ;
    public final void rule__IMAGE_TAG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( rule__IMAGE_TAG__Group__2__Impl )
            // InternalMyDsl.g:2393:2: rule__IMAGE_TAG__Group__2__Impl
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
    // InternalMyDsl.g:2399:1: rule__IMAGE_TAG__Group__2__Impl : ( ( rule__IMAGE_TAG__Alternatives_2 )* ) ;
    public final void rule__IMAGE_TAG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( ( ( rule__IMAGE_TAG__Alternatives_2 )* ) )
            // InternalMyDsl.g:2404:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2404:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            // InternalMyDsl.g:2405:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2406:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||(LA26_0>=18 && LA26_0<=19)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:2406:3: rule__IMAGE_TAG__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IMAGE_TAG__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMyDsl.g:2415:1: rule__IMAGE_DIGEST__Group__0 : rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 ;
    public final void rule__IMAGE_DIGEST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 )
            // InternalMyDsl.g:2420:2: rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2427:1: rule__IMAGE_DIGEST__Group__0__Impl : ( '@' ) ;
    public final void rule__IMAGE_DIGEST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( '@' ) )
            // InternalMyDsl.g:2432:1: ( '@' )
            {
            // InternalMyDsl.g:2432:1: ( '@' )
            // InternalMyDsl.g:2433:2: '@'
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2442:1: rule__IMAGE_DIGEST__Group__1 : rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 ;
    public final void rule__IMAGE_DIGEST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 )
            // InternalMyDsl.g:2447:2: rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2454:1: rule__IMAGE_DIGEST__Group__1__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) ;
    public final void rule__IMAGE_DIGEST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) )
            // InternalMyDsl.g:2459:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2459:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            // InternalMyDsl.g:2460:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2461:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            // InternalMyDsl.g:2461:3: rule__IMAGE_DIGEST__Alternatives_1
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
    // InternalMyDsl.g:2469:1: rule__IMAGE_DIGEST__Group__2 : rule__IMAGE_DIGEST__Group__2__Impl ;
    public final void rule__IMAGE_DIGEST__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( rule__IMAGE_DIGEST__Group__2__Impl )
            // InternalMyDsl.g:2474:2: rule__IMAGE_DIGEST__Group__2__Impl
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
    // InternalMyDsl.g:2480:1: rule__IMAGE_DIGEST__Group__2__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) ;
    public final void rule__IMAGE_DIGEST__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) )
            // InternalMyDsl.g:2485:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2485:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            // InternalMyDsl.g:2486:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2487:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||(LA27_0>=18 && LA27_0<=19)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2487:3: rule__IMAGE_DIGEST__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IMAGE_DIGEST__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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


    // $ANTLR start "rule__EXEC_FORM__Group__0"
    // InternalMyDsl.g:2496:1: rule__EXEC_FORM__Group__0 : rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 ;
    public final void rule__EXEC_FORM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 )
            // InternalMyDsl.g:2501:2: rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2508:1: rule__EXEC_FORM__Group__0__Impl : ( ' [' ) ;
    public final void rule__EXEC_FORM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( ( ' [' ) )
            // InternalMyDsl.g:2513:1: ( ' [' )
            {
            // InternalMyDsl.g:2513:1: ( ' [' )
            // InternalMyDsl.g:2514:2: ' ['
            {
             before(grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2523:1: rule__EXEC_FORM__Group__1 : rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 ;
    public final void rule__EXEC_FORM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 )
            // InternalMyDsl.g:2528:2: rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2535:1: rule__EXEC_FORM__Group__1__Impl : ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) ;
    public final void rule__EXEC_FORM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) )
            // InternalMyDsl.g:2540:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            {
            // InternalMyDsl.g:2540:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            // InternalMyDsl.g:2541:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getExecutableAssignment_1()); 
            // InternalMyDsl.g:2542:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            // InternalMyDsl.g:2542:3: rule__EXEC_FORM__ExecutableAssignment_1
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
    // InternalMyDsl.g:2550:1: rule__EXEC_FORM__Group__2 : rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 ;
    public final void rule__EXEC_FORM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 )
            // InternalMyDsl.g:2555:2: rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2562:1: rule__EXEC_FORM__Group__2__Impl : ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) ;
    public final void rule__EXEC_FORM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) )
            // InternalMyDsl.g:2567:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            {
            // InternalMyDsl.g:2567:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            // InternalMyDsl.g:2568:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            {
             before(grammarAccess.getEXEC_FORMAccess().getParametersAssignment_2()); 
            // InternalMyDsl.g:2569:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2569:3: rule__EXEC_FORM__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__EXEC_FORM__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMyDsl.g:2577:1: rule__EXEC_FORM__Group__3 : rule__EXEC_FORM__Group__3__Impl ;
    public final void rule__EXEC_FORM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( rule__EXEC_FORM__Group__3__Impl )
            // InternalMyDsl.g:2582:2: rule__EXEC_FORM__Group__3__Impl
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
    // InternalMyDsl.g:2588:1: rule__EXEC_FORM__Group__3__Impl : ( ']' ) ;
    public final void rule__EXEC_FORM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( ( ']' ) )
            // InternalMyDsl.g:2593:1: ( ']' )
            {
            // InternalMyDsl.g:2593:1: ( ']' )
            // InternalMyDsl.g:2594:2: ']'
            {
             before(grammarAccess.getEXEC_FORMAccess().getRightSquareBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__Dockerfile__StatementsAssignment_0"
    // InternalMyDsl.g:2604:1: rule__Dockerfile__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__Dockerfile__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2609:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2609:2: ( ruleStatement )
            // InternalMyDsl.g:2610:3: ruleStatement
            {
             before(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Dockerfile__StatementsAssignment_0"


    // $ANTLR start "rule__From__Platform_optionAssignment_1"
    // InternalMyDsl.g:2619:1: rule__From__Platform_optionAssignment_1 : ( RULE_PLATFORM_OPTION ) ;
    public final void rule__From__Platform_optionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( ( RULE_PLATFORM_OPTION ) )
            // InternalMyDsl.g:2624:2: ( RULE_PLATFORM_OPTION )
            {
            // InternalMyDsl.g:2624:2: ( RULE_PLATFORM_OPTION )
            // InternalMyDsl.g:2625:3: RULE_PLATFORM_OPTION
            {
             before(grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_PLATFORM_OPTION,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONTerminalRuleCall_1_0()); 

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
    // InternalMyDsl.g:2634:1: rule__From__NameAssignment_2 : ( ruleIMAGE_NAME ) ;
    public final void rule__From__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2638:1: ( ( ruleIMAGE_NAME ) )
            // InternalMyDsl.g:2639:2: ( ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:2639:2: ( ruleIMAGE_NAME )
            // InternalMyDsl.g:2640:3: ruleIMAGE_NAME
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
    // InternalMyDsl.g:2649:1: rule__From__Tag_or_digestAssignment_3 : ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) ;
    public final void rule__From__Tag_or_digestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) )
            // InternalMyDsl.g:2654:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            {
            // InternalMyDsl.g:2654:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            // InternalMyDsl.g:2655:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAlternatives_3_0()); 
            // InternalMyDsl.g:2656:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            // InternalMyDsl.g:2656:4: rule__From__Tag_or_digestAlternatives_3_0
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


    // $ANTLR start "rule__Maintainer__NameAssignment_1"
    // InternalMyDsl.g:2664:1: rule__Maintainer__NameAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Maintainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2669:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2669:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2670:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getMaintainerAccess().getNameSHELL_CMDTerminalRuleCall_1_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getMaintainerAccess().getNameSHELL_CMDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Maintainer__NameAssignment_1"


    // $ANTLR start "rule__Expose__PortsAssignment_1"
    // InternalMyDsl.g:2679:1: rule__Expose__PortsAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Expose__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2684:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2684:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2685:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getExposeAccess().getPortsSHELL_CMDTerminalRuleCall_1_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getExposeAccess().getPortsSHELL_CMDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expose__PortsAssignment_1"


    // $ANTLR start "rule__Workdir__PathAssignment_1"
    // InternalMyDsl.g:2694:1: rule__Workdir__PathAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Workdir__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2699:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2699:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2700:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getWorkdirAccess().getPathSHELL_CMDTerminalRuleCall_1_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getWorkdirAccess().getPathSHELL_CMDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Workdir__PathAssignment_1"


    // $ANTLR start "rule__Env__Key_value_pairsAssignment_1"
    // InternalMyDsl.g:2709:1: rule__Env__Key_value_pairsAssignment_1 : ( RULE_KV_PAIR_EQUALS ) ;
    public final void rule__Env__Key_value_pairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( ( RULE_KV_PAIR_EQUALS ) )
            // InternalMyDsl.g:2714:2: ( RULE_KV_PAIR_EQUALS )
            {
            // InternalMyDsl.g:2714:2: ( RULE_KV_PAIR_EQUALS )
            // InternalMyDsl.g:2715:3: RULE_KV_PAIR_EQUALS
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0()); 
            match(input,RULE_KV_PAIR_EQUALS,FOLLOW_2); 
             after(grammarAccess.getEnvAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Env__Key_value_pairsAssignment_1"


    // $ANTLR start "rule__Label__Key_value_pairsAssignment_1"
    // InternalMyDsl.g:2724:1: rule__Label__Key_value_pairsAssignment_1 : ( RULE_KV_PAIR_EQUALS ) ;
    public final void rule__Label__Key_value_pairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( RULE_KV_PAIR_EQUALS ) )
            // InternalMyDsl.g:2729:2: ( RULE_KV_PAIR_EQUALS )
            {
            // InternalMyDsl.g:2729:2: ( RULE_KV_PAIR_EQUALS )
            // InternalMyDsl.g:2730:3: RULE_KV_PAIR_EQUALS
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0()); 
            match(input,RULE_KV_PAIR_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Label__Key_value_pairsAssignment_1"


    // $ANTLR start "rule__Add__Chown_optionsAssignment_1"
    // InternalMyDsl.g:2739:1: rule__Add__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Add__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:2744:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:2744:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:2745:3: RULE_CHOWN_OPTION
            {
             before(grammarAccess.getAddAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_CHOWN_OPTION,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Add__Chown_optionsAssignment_1"


    // $ANTLR start "rule__Add__FileAssignment_2"
    // InternalMyDsl.g:2754:1: rule__Add__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Add__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2759:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2759:2: ( RULE_ID )
            // InternalMyDsl.g:2760:3: RULE_ID
            {
             before(grammarAccess.getAddAccess().getFileIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getFileIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Add__FileAssignment_2"


    // $ANTLR start "rule__Add__DirectoryAssignment_4"
    // InternalMyDsl.g:2769:1: rule__Add__DirectoryAssignment_4 : ( RULE_SHELL_CMD ) ;
    public final void rule__Add__DirectoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2773:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2774:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2774:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2775:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getAddAccess().getDirectorySHELL_CMDTerminalRuleCall_4_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getDirectorySHELL_CMDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Add__DirectoryAssignment_4"


    // $ANTLR start "rule__Copy__Chown_optionsAssignment_1"
    // InternalMyDsl.g:2784:1: rule__Copy__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Copy__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:2789:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:2789:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:2790:3: RULE_CHOWN_OPTION
            {
             before(grammarAccess.getCopyAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0()); 
            match(input,RULE_CHOWN_OPTION,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Copy__Chown_optionsAssignment_1"


    // $ANTLR start "rule__Copy__FileAssignment_2"
    // InternalMyDsl.g:2799:1: rule__Copy__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Copy__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2804:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2804:2: ( RULE_ID )
            // InternalMyDsl.g:2805:3: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getFileIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getFileIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Copy__FileAssignment_2"


    // $ANTLR start "rule__Copy__DirectoryAssignment_5"
    // InternalMyDsl.g:2814:1: rule__Copy__DirectoryAssignment_5 : ( RULE_SHELL_CMD ) ;
    public final void rule__Copy__DirectoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2819:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2819:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2820:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getCopyAccess().getDirectorySHELL_CMDTerminalRuleCall_5_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getDirectorySHELL_CMDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Copy__DirectoryAssignment_5"


    // $ANTLR start "rule__EXEC_FORM__ExecutableAssignment_1"
    // InternalMyDsl.g:2829:1: rule__EXEC_FORM__ExecutableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EXEC_FORM__ExecutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2834:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2834:2: ( RULE_STRING )
            // InternalMyDsl.g:2835:3: RULE_STRING
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
    // InternalMyDsl.g:2844:1: rule__EXEC_FORM__ParametersAssignment_2 : ( RULE_EXEC_FORM_PARAMETER ) ;
    public final void rule__EXEC_FORM__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( ( RULE_EXEC_FORM_PARAMETER ) )
            // InternalMyDsl.g:2849:2: ( RULE_EXEC_FORM_PARAMETER )
            {
            // InternalMyDsl.g:2849:2: ( RULE_EXEC_FORM_PARAMETER )
            // InternalMyDsl.g:2850:3: RULE_EXEC_FORM_PARAMETER
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001FFF00012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001FFF00010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000B0200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000C00E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000C00E2L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002002L});

}