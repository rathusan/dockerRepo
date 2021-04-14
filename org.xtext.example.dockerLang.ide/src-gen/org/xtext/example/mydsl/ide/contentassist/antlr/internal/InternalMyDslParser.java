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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_NL", "RULE_SHELL_CMD", "RULE_PLATFORM_OPTION", "RULE_KV_PAIR_EQUALS", "RULE_CHOWN_OPTION", "RULE_EXEC_FORM_PARAMETER", "'?'", "'*'", "'-'", "'.'", "'ONBUILD '", "'FROM '", "'CMD'", "'RUN'", "'ENTRYPOINT'", "'VOLUME'", "'MAINTAINER'", "'EXPOSE'", "'WORKDIR'", "'ENV '", "'LABEL '", "'ADD '", "'COPY '", "'/'", "':'", "'@'", "' ['", "']'"
    };
    public static final int RULE_STRING=7;
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
    public static final int RULE_ID=5;
    public static final int RULE_SHELL_CMD=9;
    public static final int RULE_COMMENT=4;
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

                if ( (LA1_0==RULE_COMMENT||(LA1_0>=18 && LA1_0<=30)) ) {
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyDsl.g:502:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( RULE_COMMENT ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( RULE_COMMENT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=30)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_COMMENT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:507:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:507:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalMyDsl.g:508:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalMyDsl.g:509:3: ( rule__Statement__Group_0__0 )
                    // InternalMyDsl.g:509:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:513:2: ( RULE_COMMENT )
                    {
                    // InternalMyDsl.g:513:2: ( RULE_COMMENT )
                    // InternalMyDsl.g:514:3: RULE_COMMENT
                    {
                     before(grammarAccess.getStatementAccess().getCOMMENTTerminalRuleCall_1()); 
                    match(input,RULE_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getStatementAccess().getCOMMENTTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Statement__StatementAlternatives_0_1_0"
    // InternalMyDsl.g:523:1: rule__Statement__StatementAlternatives_0_1_0 : ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) );
    public final void rule__Statement__StatementAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case 26:
                {
                alt3=7;
                }
                break;
            case 21:
                {
                alt3=8;
                }
                break;
            case 27:
                {
                alt3=9;
                }
                break;
            case 28:
                {
                alt3=10;
                }
                break;
            case 29:
                {
                alt3=11;
                }
                break;
            case 30:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:528:2: ( ruleFrom )
                    {
                    // InternalMyDsl.g:528:2: ( ruleFrom )
                    // InternalMyDsl.g:529:3: ruleFrom
                    {
                     before(grammarAccess.getStatementAccess().getStatementFromParserRuleCall_0_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFrom();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementFromParserRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:534:2: ( ruleCmd )
                    {
                    // InternalMyDsl.g:534:2: ( ruleCmd )
                    // InternalMyDsl.g:535:3: ruleCmd
                    {
                     before(grammarAccess.getStatementAccess().getStatementCmdParserRuleCall_0_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCmd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementCmdParserRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:540:2: ( ruleEntrypoint )
                    {
                    // InternalMyDsl.g:540:2: ( ruleEntrypoint )
                    // InternalMyDsl.g:541:3: ruleEntrypoint
                    {
                     before(grammarAccess.getStatementAccess().getStatementEntrypointParserRuleCall_0_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEntrypoint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementEntrypointParserRuleCall_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:546:2: ( ruleVolume )
                    {
                    // InternalMyDsl.g:546:2: ( ruleVolume )
                    // InternalMyDsl.g:547:3: ruleVolume
                    {
                     before(grammarAccess.getStatementAccess().getStatementVolumeParserRuleCall_0_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVolume();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementVolumeParserRuleCall_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:552:2: ( ruleMaintainer )
                    {
                    // InternalMyDsl.g:552:2: ( ruleMaintainer )
                    // InternalMyDsl.g:553:3: ruleMaintainer
                    {
                     before(grammarAccess.getStatementAccess().getStatementMaintainerParserRuleCall_0_1_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMaintainer();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementMaintainerParserRuleCall_0_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:558:2: ( ruleExpose )
                    {
                    // InternalMyDsl.g:558:2: ( ruleExpose )
                    // InternalMyDsl.g:559:3: ruleExpose
                    {
                     before(grammarAccess.getStatementAccess().getStatementExposeParserRuleCall_0_1_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpose();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementExposeParserRuleCall_0_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:564:2: ( ruleWorkdir )
                    {
                    // InternalMyDsl.g:564:2: ( ruleWorkdir )
                    // InternalMyDsl.g:565:3: ruleWorkdir
                    {
                     before(grammarAccess.getStatementAccess().getStatementWorkdirParserRuleCall_0_1_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkdir();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementWorkdirParserRuleCall_0_1_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:570:2: ( ruleRun )
                    {
                    // InternalMyDsl.g:570:2: ( ruleRun )
                    // InternalMyDsl.g:571:3: ruleRun
                    {
                     before(grammarAccess.getStatementAccess().getStatementRunParserRuleCall_0_1_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRun();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementRunParserRuleCall_0_1_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:576:2: ( ruleEnv )
                    {
                    // InternalMyDsl.g:576:2: ( ruleEnv )
                    // InternalMyDsl.g:577:3: ruleEnv
                    {
                     before(grammarAccess.getStatementAccess().getStatementEnvParserRuleCall_0_1_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleEnv();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementEnvParserRuleCall_0_1_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:582:2: ( ruleLabel )
                    {
                    // InternalMyDsl.g:582:2: ( ruleLabel )
                    // InternalMyDsl.g:583:3: ruleLabel
                    {
                     before(grammarAccess.getStatementAccess().getStatementLabelParserRuleCall_0_1_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementLabelParserRuleCall_0_1_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:588:2: ( ruleAdd )
                    {
                    // InternalMyDsl.g:588:2: ( ruleAdd )
                    // InternalMyDsl.g:589:3: ruleAdd
                    {
                     before(grammarAccess.getStatementAccess().getStatementAddParserRuleCall_0_1_0_10()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementAddParserRuleCall_0_1_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:594:2: ( ruleCopy )
                    {
                    // InternalMyDsl.g:594:2: ( ruleCopy )
                    // InternalMyDsl.g:595:3: ruleCopy
                    {
                     before(grammarAccess.getStatementAccess().getStatementCopyParserRuleCall_0_1_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStatementCopyParserRuleCall_0_1_0_11()); 

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
    // $ANTLR end "rule__Statement__StatementAlternatives_0_1_0"


    // $ANTLR start "rule__From__Tag_or_digestAlternatives_3_0"
    // InternalMyDsl.g:604:1: rule__From__Tag_or_digestAlternatives_3_0 : ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) );
    public final void rule__From__Tag_or_digestAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:609:2: ( ruleIMAGE_TAG )
                    {
                    // InternalMyDsl.g:609:2: ( ruleIMAGE_TAG )
                    // InternalMyDsl.g:610:3: ruleIMAGE_TAG
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
                    // InternalMyDsl.g:615:2: ( ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:615:2: ( ruleIMAGE_DIGEST )
                    // InternalMyDsl.g:616:3: ruleIMAGE_DIGEST
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
    // InternalMyDsl.g:625:1: rule__Cmd__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Cmd__Group_1_1__0 ) ) );
    public final void rule__Cmd__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( ruleEXEC_FORM ) | ( ( rule__Cmd__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
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
                    // InternalMyDsl.g:630:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:630:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:631:3: ruleEXEC_FORM
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
                    // InternalMyDsl.g:636:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:636:2: ( ( rule__Cmd__Group_1_1__0 ) )
                    // InternalMyDsl.g:637:3: ( rule__Cmd__Group_1_1__0 )
                    {
                     before(grammarAccess.getCmdAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:638:3: ( rule__Cmd__Group_1_1__0 )
                    // InternalMyDsl.g:638:4: rule__Cmd__Group_1_1__0
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
    // InternalMyDsl.g:646:1: rule__Run__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Run__Group_1_1__0 ) ) );
    public final void rule__Run__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ruleEXEC_FORM ) | ( ( rule__Run__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
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
                    // InternalMyDsl.g:651:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:651:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:652:3: ruleEXEC_FORM
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
                    // InternalMyDsl.g:657:2: ( ( rule__Run__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:657:2: ( ( rule__Run__Group_1_1__0 ) )
                    // InternalMyDsl.g:658:3: ( rule__Run__Group_1_1__0 )
                    {
                     before(grammarAccess.getRunAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:659:3: ( rule__Run__Group_1_1__0 )
                    // InternalMyDsl.g:659:4: rule__Run__Group_1_1__0
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
    // InternalMyDsl.g:667:1: rule__Entrypoint__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Entrypoint__Group_1_1__0 ) ) );
    public final void rule__Entrypoint__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( ruleEXEC_FORM ) | ( ( rule__Entrypoint__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
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
                    // InternalMyDsl.g:672:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:672:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:673:3: ruleEXEC_FORM
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
                    // InternalMyDsl.g:678:2: ( ( rule__Entrypoint__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:678:2: ( ( rule__Entrypoint__Group_1_1__0 ) )
                    // InternalMyDsl.g:679:3: ( rule__Entrypoint__Group_1_1__0 )
                    {
                     before(grammarAccess.getEntrypointAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:680:3: ( rule__Entrypoint__Group_1_1__0 )
                    // InternalMyDsl.g:680:4: rule__Entrypoint__Group_1_1__0
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
    // InternalMyDsl.g:688:1: rule__Volume__Alternatives_1 : ( ( ruleEXEC_FORM ) | ( ( rule__Volume__Group_1_1__0 ) ) );
    public final void rule__Volume__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( ruleEXEC_FORM ) | ( ( rule__Volume__Group_1_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
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
                    // InternalMyDsl.g:693:2: ( ruleEXEC_FORM )
                    {
                    // InternalMyDsl.g:693:2: ( ruleEXEC_FORM )
                    // InternalMyDsl.g:694:3: ruleEXEC_FORM
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
                    // InternalMyDsl.g:699:2: ( ( rule__Volume__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:699:2: ( ( rule__Volume__Group_1_1__0 ) )
                    // InternalMyDsl.g:700:3: ( rule__Volume__Group_1_1__0 )
                    {
                     before(grammarAccess.getVolumeAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:701:3: ( rule__Volume__Group_1_1__0 )
                    // InternalMyDsl.g:701:4: rule__Volume__Group_1_1__0
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
    // InternalMyDsl.g:709:1: rule__Add__Alternatives_3 : ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) );
    public final void rule__Add__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=15)) ) {
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
                    // InternalMyDsl.g:714:2: ( ( rule__Add__Alternatives_3_0 ) )
                    {
                    // InternalMyDsl.g:714:2: ( ( rule__Add__Alternatives_3_0 ) )
                    // InternalMyDsl.g:715:3: ( rule__Add__Alternatives_3_0 )
                    {
                     before(grammarAccess.getAddAccess().getAlternatives_3_0()); 
                    // InternalMyDsl.g:716:3: ( rule__Add__Alternatives_3_0 )
                    // InternalMyDsl.g:716:4: rule__Add__Alternatives_3_0
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
                    // InternalMyDsl.g:720:2: ( ( rule__Add__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:720:2: ( ( rule__Add__Group_3_1__0 ) )
                    // InternalMyDsl.g:721:3: ( rule__Add__Group_3_1__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:722:3: ( rule__Add__Group_3_1__0 )
                    // InternalMyDsl.g:722:4: rule__Add__Group_3_1__0
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
    // InternalMyDsl.g:730:1: rule__Add__Alternatives_3_0 : ( ( '?' ) | ( '*' ) );
    public final void rule__Add__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( ( '?' ) | ( '*' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:735:2: ( '?' )
                    {
                    // InternalMyDsl.g:735:2: ( '?' )
                    // InternalMyDsl.g:736:3: '?'
                    {
                     before(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:741:2: ( '*' )
                    {
                    // InternalMyDsl.g:741:2: ( '*' )
                    // InternalMyDsl.g:742:3: '*'
                    {
                     before(grammarAccess.getAddAccess().getAsteriskKeyword_3_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:751:1: rule__Copy__Alternatives_3 : ( ( '?' ) | ( '*' ) );
    public final void rule__Copy__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( '?' ) | ( '*' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:756:2: ( '?' )
                    {
                    // InternalMyDsl.g:756:2: ( '?' )
                    // InternalMyDsl.g:757:3: '?'
                    {
                     before(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:762:2: ( '*' )
                    {
                    // InternalMyDsl.g:762:2: ( '*' )
                    // InternalMyDsl.g:763:3: '*'
                    {
                     before(grammarAccess.getCopyAccess().getAsteriskKeyword_3_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:772:1: rule__IMAGE_TAG__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_TAG__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt12=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:777:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:777:2: ( RULE_ID )
                    // InternalMyDsl.g:778:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:783:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:783:2: ( RULE_INT )
                    // InternalMyDsl.g:784:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:789:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:789:2: ( RULE_STRING )
                    // InternalMyDsl.g:790:3: RULE_STRING
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
    // InternalMyDsl.g:799:1: rule__IMAGE_TAG__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_TAG__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
            int alt13=5;
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
            case 16:
                {
                alt13=4;
                }
                break;
            case 17:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:804:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:804:2: ( RULE_ID )
                    // InternalMyDsl.g:805:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:810:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:810:2: ( RULE_INT )
                    // InternalMyDsl.g:811:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:816:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:816:2: ( RULE_STRING )
                    // InternalMyDsl.g:817:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:822:2: ( '-' )
                    {
                    // InternalMyDsl.g:822:2: ( '-' )
                    // InternalMyDsl.g:823:3: '-'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:828:2: ( '.' )
                    {
                    // InternalMyDsl.g:828:2: ( '.' )
                    // InternalMyDsl.g:829:3: '.'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:838:1: rule__IMAGE_DIGEST__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_DIGEST__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
            int alt14=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:843:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:843:2: ( RULE_ID )
                    // InternalMyDsl.g:844:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:849:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:849:2: ( RULE_INT )
                    // InternalMyDsl.g:850:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:855:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:855:2: ( RULE_STRING )
                    // InternalMyDsl.g:856:3: RULE_STRING
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
    // InternalMyDsl.g:865:1: rule__IMAGE_DIGEST__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_DIGEST__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case RULE_STRING:
                {
                alt15=3;
                }
                break;
            case 16:
                {
                alt15=4;
                }
                break;
            case 17:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:870:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:870:2: ( RULE_ID )
                    // InternalMyDsl.g:871:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:876:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:876:2: ( RULE_INT )
                    // InternalMyDsl.g:877:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:882:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:882:2: ( RULE_STRING )
                    // InternalMyDsl.g:883:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:888:2: ( '-' )
                    {
                    // InternalMyDsl.g:888:2: ( '-' )
                    // InternalMyDsl.g:889:3: '-'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:894:2: ( '.' )
                    {
                    // InternalMyDsl.g:894:2: ( '.' )
                    // InternalMyDsl.g:895:3: '.'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:904:1: rule__Dockerfile__Group__0 : rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1 ;
    public final void rule__Dockerfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1 )
            // InternalMyDsl.g:909:2: rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1
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
    // InternalMyDsl.g:916:1: rule__Dockerfile__Group__0__Impl : ( ( rule__Dockerfile__StatementsAssignment_0 ) ) ;
    public final void rule__Dockerfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__Dockerfile__StatementsAssignment_0 ) ) )
            // InternalMyDsl.g:921:1: ( ( rule__Dockerfile__StatementsAssignment_0 ) )
            {
            // InternalMyDsl.g:921:1: ( ( rule__Dockerfile__StatementsAssignment_0 ) )
            // InternalMyDsl.g:922:2: ( rule__Dockerfile__StatementsAssignment_0 )
            {
             before(grammarAccess.getDockerfileAccess().getStatementsAssignment_0()); 
            // InternalMyDsl.g:923:2: ( rule__Dockerfile__StatementsAssignment_0 )
            // InternalMyDsl.g:923:3: rule__Dockerfile__StatementsAssignment_0
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
    // InternalMyDsl.g:931:1: rule__Dockerfile__Group__1 : rule__Dockerfile__Group__1__Impl ;
    public final void rule__Dockerfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__Dockerfile__Group__1__Impl )
            // InternalMyDsl.g:936:2: rule__Dockerfile__Group__1__Impl
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
    // InternalMyDsl.g:942:1: rule__Dockerfile__Group__1__Impl : ( RULE_NL ) ;
    public final void rule__Dockerfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( RULE_NL ) )
            // InternalMyDsl.g:947:1: ( RULE_NL )
            {
            // InternalMyDsl.g:947:1: ( RULE_NL )
            // InternalMyDsl.g:948:2: RULE_NL
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


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalMyDsl.g:958:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalMyDsl.g:963:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalMyDsl.g:970:1: rule__Statement__Group_0__0__Impl : ( ( 'ONBUILD ' )? ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( ( 'ONBUILD ' )? ) )
            // InternalMyDsl.g:975:1: ( ( 'ONBUILD ' )? )
            {
            // InternalMyDsl.g:975:1: ( ( 'ONBUILD ' )? )
            // InternalMyDsl.g:976:2: ( 'ONBUILD ' )?
            {
             before(grammarAccess.getStatementAccess().getONBUILDKeyword_0_0()); 
            // InternalMyDsl.g:977:2: ( 'ONBUILD ' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:977:3: 'ONBUILD '
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getONBUILDKeyword_0_0()); 

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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalMyDsl.g:985:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Statement__Group_0__1__Impl )
            // InternalMyDsl.g:990:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalMyDsl.g:996:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__StatementAssignment_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__Statement__StatementAssignment_0_1 ) ) )
            // InternalMyDsl.g:1001:1: ( ( rule__Statement__StatementAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__Statement__StatementAssignment_0_1 ) )
            // InternalMyDsl.g:1002:2: ( rule__Statement__StatementAssignment_0_1 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_0_1()); 
            // InternalMyDsl.g:1003:2: ( rule__Statement__StatementAssignment_0_1 )
            // InternalMyDsl.g:1003:3: rule__Statement__StatementAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementAssignment_0_1()); 

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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__From__Group__0"
    // InternalMyDsl.g:1012:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalMyDsl.g:1017:2: rule__From__Group__0__Impl rule__From__Group__1
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
    // InternalMyDsl.g:1024:1: rule__From__Group__0__Impl : ( 'FROM ' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( 'FROM ' ) )
            // InternalMyDsl.g:1029:1: ( 'FROM ' )
            {
            // InternalMyDsl.g:1029:1: ( 'FROM ' )
            // InternalMyDsl.g:1030:2: 'FROM '
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1039:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalMyDsl.g:1044:2: rule__From__Group__1__Impl rule__From__Group__2
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
    // InternalMyDsl.g:1051:1: rule__From__Group__1__Impl : ( ( rule__From__Platform_optionAssignment_1 )? ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( ( rule__From__Platform_optionAssignment_1 )? ) )
            // InternalMyDsl.g:1056:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            {
            // InternalMyDsl.g:1056:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            // InternalMyDsl.g:1057:2: ( rule__From__Platform_optionAssignment_1 )?
            {
             before(grammarAccess.getFromAccess().getPlatform_optionAssignment_1()); 
            // InternalMyDsl.g:1058:2: ( rule__From__Platform_optionAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_PLATFORM_OPTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1058:3: rule__From__Platform_optionAssignment_1
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
    // InternalMyDsl.g:1066:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalMyDsl.g:1071:2: rule__From__Group__2__Impl rule__From__Group__3
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
    // InternalMyDsl.g:1078:1: rule__From__Group__2__Impl : ( ( rule__From__NameAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( ( rule__From__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1083:1: ( ( rule__From__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1083:1: ( ( rule__From__NameAssignment_2 ) )
            // InternalMyDsl.g:1084:2: ( rule__From__NameAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1085:2: ( rule__From__NameAssignment_2 )
            // InternalMyDsl.g:1085:3: rule__From__NameAssignment_2
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
    // InternalMyDsl.g:1093:1: rule__From__Group__3 : rule__From__Group__3__Impl ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__From__Group__3__Impl )
            // InternalMyDsl.g:1098:2: rule__From__Group__3__Impl
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
    // InternalMyDsl.g:1104:1: rule__From__Group__3__Impl : ( ( rule__From__Tag_or_digestAssignment_3 )? ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( ( rule__From__Tag_or_digestAssignment_3 )? ) )
            // InternalMyDsl.g:1109:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            {
            // InternalMyDsl.g:1109:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            // InternalMyDsl.g:1110:2: ( rule__From__Tag_or_digestAssignment_3 )?
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAssignment_3()); 
            // InternalMyDsl.g:1111:2: ( rule__From__Tag_or_digestAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1111:3: rule__From__Tag_or_digestAssignment_3
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
    // InternalMyDsl.g:1120:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // InternalMyDsl.g:1125:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
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
    // InternalMyDsl.g:1132:1: rule__Cmd__Group__0__Impl : ( 'CMD' ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( 'CMD' ) )
            // InternalMyDsl.g:1137:1: ( 'CMD' )
            {
            // InternalMyDsl.g:1137:1: ( 'CMD' )
            // InternalMyDsl.g:1138:2: 'CMD'
            {
             before(grammarAccess.getCmdAccess().getCMDKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1147:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__Cmd__Group__1__Impl )
            // InternalMyDsl.g:1152:2: rule__Cmd__Group__1__Impl
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
    // InternalMyDsl.g:1158:1: rule__Cmd__Group__1__Impl : ( ( rule__Cmd__Alternatives_1 ) ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ( rule__Cmd__Alternatives_1 ) ) )
            // InternalMyDsl.g:1163:1: ( ( rule__Cmd__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1163:1: ( ( rule__Cmd__Alternatives_1 ) )
            // InternalMyDsl.g:1164:2: ( rule__Cmd__Alternatives_1 )
            {
             before(grammarAccess.getCmdAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1165:2: ( rule__Cmd__Alternatives_1 )
            // InternalMyDsl.g:1165:3: rule__Cmd__Alternatives_1
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
    // InternalMyDsl.g:1174:1: rule__Cmd__Group_1_1__0 : rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 ;
    public final void rule__Cmd__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1 )
            // InternalMyDsl.g:1179:2: rule__Cmd__Group_1_1__0__Impl rule__Cmd__Group_1_1__1
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
    // InternalMyDsl.g:1186:1: rule__Cmd__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Cmd__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( () ) )
            // InternalMyDsl.g:1191:1: ( () )
            {
            // InternalMyDsl.g:1191:1: ( () )
            // InternalMyDsl.g:1192:2: ()
            {
             before(grammarAccess.getCmdAccess().getCmdAction_1_1_0()); 
            // InternalMyDsl.g:1193:2: ()
            // InternalMyDsl.g:1193:3: 
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
    // InternalMyDsl.g:1201:1: rule__Cmd__Group_1_1__1 : rule__Cmd__Group_1_1__1__Impl ;
    public final void rule__Cmd__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__Cmd__Group_1_1__1__Impl )
            // InternalMyDsl.g:1206:2: rule__Cmd__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1212:1: rule__Cmd__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Cmd__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1217:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1217:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1218:2: RULE_SHELL_CMD
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
    // InternalMyDsl.g:1228:1: rule__Run__Group__0 : rule__Run__Group__0__Impl rule__Run__Group__1 ;
    public final void rule__Run__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__Run__Group__0__Impl rule__Run__Group__1 )
            // InternalMyDsl.g:1233:2: rule__Run__Group__0__Impl rule__Run__Group__1
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
    // InternalMyDsl.g:1240:1: rule__Run__Group__0__Impl : ( 'RUN' ) ;
    public final void rule__Run__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( ( 'RUN' ) )
            // InternalMyDsl.g:1245:1: ( 'RUN' )
            {
            // InternalMyDsl.g:1245:1: ( 'RUN' )
            // InternalMyDsl.g:1246:2: 'RUN'
            {
             before(grammarAccess.getRunAccess().getRUNKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1255:1: rule__Run__Group__1 : rule__Run__Group__1__Impl ;
    public final void rule__Run__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__Run__Group__1__Impl )
            // InternalMyDsl.g:1260:2: rule__Run__Group__1__Impl
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
    // InternalMyDsl.g:1266:1: rule__Run__Group__1__Impl : ( ( rule__Run__Alternatives_1 ) ) ;
    public final void rule__Run__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ( rule__Run__Alternatives_1 ) ) )
            // InternalMyDsl.g:1271:1: ( ( rule__Run__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1271:1: ( ( rule__Run__Alternatives_1 ) )
            // InternalMyDsl.g:1272:2: ( rule__Run__Alternatives_1 )
            {
             before(grammarAccess.getRunAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1273:2: ( rule__Run__Alternatives_1 )
            // InternalMyDsl.g:1273:3: rule__Run__Alternatives_1
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
    // InternalMyDsl.g:1282:1: rule__Run__Group_1_1__0 : rule__Run__Group_1_1__0__Impl rule__Run__Group_1_1__1 ;
    public final void rule__Run__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__Run__Group_1_1__0__Impl rule__Run__Group_1_1__1 )
            // InternalMyDsl.g:1287:2: rule__Run__Group_1_1__0__Impl rule__Run__Group_1_1__1
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
    // InternalMyDsl.g:1294:1: rule__Run__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Run__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( () ) )
            // InternalMyDsl.g:1299:1: ( () )
            {
            // InternalMyDsl.g:1299:1: ( () )
            // InternalMyDsl.g:1300:2: ()
            {
             before(grammarAccess.getRunAccess().getRunAction_1_1_0()); 
            // InternalMyDsl.g:1301:2: ()
            // InternalMyDsl.g:1301:3: 
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
    // InternalMyDsl.g:1309:1: rule__Run__Group_1_1__1 : rule__Run__Group_1_1__1__Impl ;
    public final void rule__Run__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__Run__Group_1_1__1__Impl )
            // InternalMyDsl.g:1314:2: rule__Run__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1320:1: rule__Run__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Run__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1325:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1325:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1326:2: RULE_SHELL_CMD
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
    // InternalMyDsl.g:1336:1: rule__Entrypoint__Group__0 : rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 ;
    public final void rule__Entrypoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 )
            // InternalMyDsl.g:1341:2: rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1
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
    // InternalMyDsl.g:1348:1: rule__Entrypoint__Group__0__Impl : ( 'ENTRYPOINT' ) ;
    public final void rule__Entrypoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( 'ENTRYPOINT' ) )
            // InternalMyDsl.g:1353:1: ( 'ENTRYPOINT' )
            {
            // InternalMyDsl.g:1353:1: ( 'ENTRYPOINT' )
            // InternalMyDsl.g:1354:2: 'ENTRYPOINT'
            {
             before(grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1363:1: rule__Entrypoint__Group__1 : rule__Entrypoint__Group__1__Impl ;
    public final void rule__Entrypoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__Entrypoint__Group__1__Impl )
            // InternalMyDsl.g:1368:2: rule__Entrypoint__Group__1__Impl
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
    // InternalMyDsl.g:1374:1: rule__Entrypoint__Group__1__Impl : ( ( rule__Entrypoint__Alternatives_1 ) ) ;
    public final void rule__Entrypoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( ( rule__Entrypoint__Alternatives_1 ) ) )
            // InternalMyDsl.g:1379:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1379:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            // InternalMyDsl.g:1380:2: ( rule__Entrypoint__Alternatives_1 )
            {
             before(grammarAccess.getEntrypointAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1381:2: ( rule__Entrypoint__Alternatives_1 )
            // InternalMyDsl.g:1381:3: rule__Entrypoint__Alternatives_1
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
    // InternalMyDsl.g:1390:1: rule__Entrypoint__Group_1_1__0 : rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1 ;
    public final void rule__Entrypoint__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1 )
            // InternalMyDsl.g:1395:2: rule__Entrypoint__Group_1_1__0__Impl rule__Entrypoint__Group_1_1__1
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
    // InternalMyDsl.g:1402:1: rule__Entrypoint__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Entrypoint__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( ( () ) )
            // InternalMyDsl.g:1407:1: ( () )
            {
            // InternalMyDsl.g:1407:1: ( () )
            // InternalMyDsl.g:1408:2: ()
            {
             before(grammarAccess.getEntrypointAccess().getEntrypointAction_1_1_0()); 
            // InternalMyDsl.g:1409:2: ()
            // InternalMyDsl.g:1409:3: 
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
    // InternalMyDsl.g:1417:1: rule__Entrypoint__Group_1_1__1 : rule__Entrypoint__Group_1_1__1__Impl ;
    public final void rule__Entrypoint__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( rule__Entrypoint__Group_1_1__1__Impl )
            // InternalMyDsl.g:1422:2: rule__Entrypoint__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1428:1: rule__Entrypoint__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Entrypoint__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1433:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1433:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1434:2: RULE_SHELL_CMD
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
    // InternalMyDsl.g:1444:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalMyDsl.g:1449:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
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
    // InternalMyDsl.g:1456:1: rule__Volume__Group__0__Impl : ( 'VOLUME' ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( 'VOLUME' ) )
            // InternalMyDsl.g:1461:1: ( 'VOLUME' )
            {
            // InternalMyDsl.g:1461:1: ( 'VOLUME' )
            // InternalMyDsl.g:1462:2: 'VOLUME'
            {
             before(grammarAccess.getVolumeAccess().getVOLUMEKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1471:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( rule__Volume__Group__1__Impl )
            // InternalMyDsl.g:1476:2: rule__Volume__Group__1__Impl
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
    // InternalMyDsl.g:1482:1: rule__Volume__Group__1__Impl : ( ( rule__Volume__Alternatives_1 ) ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( ( ( rule__Volume__Alternatives_1 ) ) )
            // InternalMyDsl.g:1487:1: ( ( rule__Volume__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1487:1: ( ( rule__Volume__Alternatives_1 ) )
            // InternalMyDsl.g:1488:2: ( rule__Volume__Alternatives_1 )
            {
             before(grammarAccess.getVolumeAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1489:2: ( rule__Volume__Alternatives_1 )
            // InternalMyDsl.g:1489:3: rule__Volume__Alternatives_1
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
    // InternalMyDsl.g:1498:1: rule__Volume__Group_1_1__0 : rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1 ;
    public final void rule__Volume__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1 )
            // InternalMyDsl.g:1503:2: rule__Volume__Group_1_1__0__Impl rule__Volume__Group_1_1__1
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
    // InternalMyDsl.g:1510:1: rule__Volume__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Volume__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( () ) )
            // InternalMyDsl.g:1515:1: ( () )
            {
            // InternalMyDsl.g:1515:1: ( () )
            // InternalMyDsl.g:1516:2: ()
            {
             before(grammarAccess.getVolumeAccess().getVolumeAction_1_1_0()); 
            // InternalMyDsl.g:1517:2: ()
            // InternalMyDsl.g:1517:3: 
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
    // InternalMyDsl.g:1525:1: rule__Volume__Group_1_1__1 : rule__Volume__Group_1_1__1__Impl ;
    public final void rule__Volume__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( rule__Volume__Group_1_1__1__Impl )
            // InternalMyDsl.g:1530:2: rule__Volume__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1536:1: rule__Volume__Group_1_1__1__Impl : ( RULE_SHELL_CMD ) ;
    public final void rule__Volume__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:1541:1: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:1541:1: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:1542:2: RULE_SHELL_CMD
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
    // InternalMyDsl.g:1552:1: rule__Maintainer__Group__0 : rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 ;
    public final void rule__Maintainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 )
            // InternalMyDsl.g:1557:2: rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1
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
    // InternalMyDsl.g:1564:1: rule__Maintainer__Group__0__Impl : ( 'MAINTAINER' ) ;
    public final void rule__Maintainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( 'MAINTAINER' ) )
            // InternalMyDsl.g:1569:1: ( 'MAINTAINER' )
            {
            // InternalMyDsl.g:1569:1: ( 'MAINTAINER' )
            // InternalMyDsl.g:1570:2: 'MAINTAINER'
            {
             before(grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1579:1: rule__Maintainer__Group__1 : rule__Maintainer__Group__1__Impl ;
    public final void rule__Maintainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( rule__Maintainer__Group__1__Impl )
            // InternalMyDsl.g:1584:2: rule__Maintainer__Group__1__Impl
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
    // InternalMyDsl.g:1590:1: rule__Maintainer__Group__1__Impl : ( ( rule__Maintainer__NameAssignment_1 ) ) ;
    public final void rule__Maintainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( ( ( rule__Maintainer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1595:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1595:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            // InternalMyDsl.g:1596:2: ( rule__Maintainer__NameAssignment_1 )
            {
             before(grammarAccess.getMaintainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1597:2: ( rule__Maintainer__NameAssignment_1 )
            // InternalMyDsl.g:1597:3: rule__Maintainer__NameAssignment_1
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
    // InternalMyDsl.g:1606:1: rule__Expose__Group__0 : rule__Expose__Group__0__Impl rule__Expose__Group__1 ;
    public final void rule__Expose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( rule__Expose__Group__0__Impl rule__Expose__Group__1 )
            // InternalMyDsl.g:1611:2: rule__Expose__Group__0__Impl rule__Expose__Group__1
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
    // InternalMyDsl.g:1618:1: rule__Expose__Group__0__Impl : ( 'EXPOSE' ) ;
    public final void rule__Expose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( ( 'EXPOSE' ) )
            // InternalMyDsl.g:1623:1: ( 'EXPOSE' )
            {
            // InternalMyDsl.g:1623:1: ( 'EXPOSE' )
            // InternalMyDsl.g:1624:2: 'EXPOSE'
            {
             before(grammarAccess.getExposeAccess().getEXPOSEKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1633:1: rule__Expose__Group__1 : rule__Expose__Group__1__Impl ;
    public final void rule__Expose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( rule__Expose__Group__1__Impl )
            // InternalMyDsl.g:1638:2: rule__Expose__Group__1__Impl
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
    // InternalMyDsl.g:1644:1: rule__Expose__Group__1__Impl : ( ( rule__Expose__PortsAssignment_1 ) ) ;
    public final void rule__Expose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( ( ( rule__Expose__PortsAssignment_1 ) ) )
            // InternalMyDsl.g:1649:1: ( ( rule__Expose__PortsAssignment_1 ) )
            {
            // InternalMyDsl.g:1649:1: ( ( rule__Expose__PortsAssignment_1 ) )
            // InternalMyDsl.g:1650:2: ( rule__Expose__PortsAssignment_1 )
            {
             before(grammarAccess.getExposeAccess().getPortsAssignment_1()); 
            // InternalMyDsl.g:1651:2: ( rule__Expose__PortsAssignment_1 )
            // InternalMyDsl.g:1651:3: rule__Expose__PortsAssignment_1
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
    // InternalMyDsl.g:1660:1: rule__Workdir__Group__0 : rule__Workdir__Group__0__Impl rule__Workdir__Group__1 ;
    public final void rule__Workdir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( rule__Workdir__Group__0__Impl rule__Workdir__Group__1 )
            // InternalMyDsl.g:1665:2: rule__Workdir__Group__0__Impl rule__Workdir__Group__1
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
    // InternalMyDsl.g:1672:1: rule__Workdir__Group__0__Impl : ( 'WORKDIR' ) ;
    public final void rule__Workdir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( ( 'WORKDIR' ) )
            // InternalMyDsl.g:1677:1: ( 'WORKDIR' )
            {
            // InternalMyDsl.g:1677:1: ( 'WORKDIR' )
            // InternalMyDsl.g:1678:2: 'WORKDIR'
            {
             before(grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1687:1: rule__Workdir__Group__1 : rule__Workdir__Group__1__Impl ;
    public final void rule__Workdir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( rule__Workdir__Group__1__Impl )
            // InternalMyDsl.g:1692:2: rule__Workdir__Group__1__Impl
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
    // InternalMyDsl.g:1698:1: rule__Workdir__Group__1__Impl : ( ( rule__Workdir__PathAssignment_1 ) ) ;
    public final void rule__Workdir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( ( ( rule__Workdir__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1703:1: ( ( rule__Workdir__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1703:1: ( ( rule__Workdir__PathAssignment_1 ) )
            // InternalMyDsl.g:1704:2: ( rule__Workdir__PathAssignment_1 )
            {
             before(grammarAccess.getWorkdirAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1705:2: ( rule__Workdir__PathAssignment_1 )
            // InternalMyDsl.g:1705:3: rule__Workdir__PathAssignment_1
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
    // InternalMyDsl.g:1714:1: rule__Env__Group__0 : rule__Env__Group__0__Impl rule__Env__Group__1 ;
    public final void rule__Env__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( rule__Env__Group__0__Impl rule__Env__Group__1 )
            // InternalMyDsl.g:1719:2: rule__Env__Group__0__Impl rule__Env__Group__1
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
    // InternalMyDsl.g:1726:1: rule__Env__Group__0__Impl : ( 'ENV ' ) ;
    public final void rule__Env__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( ( 'ENV ' ) )
            // InternalMyDsl.g:1731:1: ( 'ENV ' )
            {
            // InternalMyDsl.g:1731:1: ( 'ENV ' )
            // InternalMyDsl.g:1732:2: 'ENV '
            {
             before(grammarAccess.getEnvAccess().getENVKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1741:1: rule__Env__Group__1 : rule__Env__Group__1__Impl ;
    public final void rule__Env__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( rule__Env__Group__1__Impl )
            // InternalMyDsl.g:1746:2: rule__Env__Group__1__Impl
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
    // InternalMyDsl.g:1752:1: rule__Env__Group__1__Impl : ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Env__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1757:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1757:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1758:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1758:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1759:3: ( rule__Env__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1760:3: ( rule__Env__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1760:4: rule__Env__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__Env__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1763:2: ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1764:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1765:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_KV_PAIR_EQUALS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1765:4: rule__Env__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Env__Key_value_pairsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:1775:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:1780:2: rule__Label__Group__0__Impl rule__Label__Group__1
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
    // InternalMyDsl.g:1787:1: rule__Label__Group__0__Impl : ( 'LABEL ' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( ( 'LABEL ' ) )
            // InternalMyDsl.g:1792:1: ( 'LABEL ' )
            {
            // InternalMyDsl.g:1792:1: ( 'LABEL ' )
            // InternalMyDsl.g:1793:2: 'LABEL '
            {
             before(grammarAccess.getLabelAccess().getLABELKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1802:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( rule__Label__Group__1__Impl )
            // InternalMyDsl.g:1807:2: rule__Label__Group__1__Impl
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
    // InternalMyDsl.g:1813:1: rule__Label__Group__1__Impl : ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1818:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1818:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1819:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1819:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1820:3: ( rule__Label__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1821:3: ( rule__Label__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1821:4: rule__Label__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__Label__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1824:2: ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1825:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1826:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_KV_PAIR_EQUALS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1826:4: rule__Label__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Label__Key_value_pairsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:1836:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1840:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:1841:2: rule__Add__Group__0__Impl rule__Add__Group__1
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
    // InternalMyDsl.g:1848:1: rule__Add__Group__0__Impl : ( 'ADD ' ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( ( 'ADD ' ) )
            // InternalMyDsl.g:1853:1: ( 'ADD ' )
            {
            // InternalMyDsl.g:1853:1: ( 'ADD ' )
            // InternalMyDsl.g:1854:2: 'ADD '
            {
             before(grammarAccess.getAddAccess().getADDKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1863:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1867:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalMyDsl.g:1868:2: rule__Add__Group__1__Impl rule__Add__Group__2
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
    // InternalMyDsl.g:1875:1: rule__Add__Group__1__Impl : ( ( rule__Add__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ( rule__Add__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:1880:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:1880:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:1881:2: ( rule__Add__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getAddAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:1882:2: ( rule__Add__Chown_optionsAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_CHOWN_OPTION) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1882:3: rule__Add__Chown_optionsAssignment_1
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
    // InternalMyDsl.g:1890:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalMyDsl.g:1895:2: rule__Add__Group__2__Impl rule__Add__Group__3
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
    // InternalMyDsl.g:1902:1: rule__Add__Group__2__Impl : ( ( rule__Add__FileAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( ( ( rule__Add__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1907:1: ( ( rule__Add__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1907:1: ( ( rule__Add__FileAssignment_2 ) )
            // InternalMyDsl.g:1908:2: ( rule__Add__FileAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1909:2: ( rule__Add__FileAssignment_2 )
            // InternalMyDsl.g:1909:3: rule__Add__FileAssignment_2
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
    // InternalMyDsl.g:1917:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1921:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalMyDsl.g:1922:2: rule__Add__Group__3__Impl rule__Add__Group__4
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
    // InternalMyDsl.g:1929:1: rule__Add__Group__3__Impl : ( ( rule__Add__Alternatives_3 )? ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ( rule__Add__Alternatives_3 )? ) )
            // InternalMyDsl.g:1934:1: ( ( rule__Add__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1934:1: ( ( rule__Add__Alternatives_3 )? )
            // InternalMyDsl.g:1935:2: ( rule__Add__Alternatives_3 )?
            {
             before(grammarAccess.getAddAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1936:2: ( rule__Add__Alternatives_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=14 && LA22_0<=15)||LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1936:3: rule__Add__Alternatives_3
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
    // InternalMyDsl.g:1944:1: rule__Add__Group__4 : rule__Add__Group__4__Impl ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( rule__Add__Group__4__Impl )
            // InternalMyDsl.g:1949:2: rule__Add__Group__4__Impl
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
    // InternalMyDsl.g:1955:1: rule__Add__Group__4__Impl : ( ( rule__Add__DirectoryAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( ( ( rule__Add__DirectoryAssignment_4 ) ) )
            // InternalMyDsl.g:1960:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            {
            // InternalMyDsl.g:1960:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            // InternalMyDsl.g:1961:2: ( rule__Add__DirectoryAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getDirectoryAssignment_4()); 
            // InternalMyDsl.g:1962:2: ( rule__Add__DirectoryAssignment_4 )
            // InternalMyDsl.g:1962:3: rule__Add__DirectoryAssignment_4
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
    // InternalMyDsl.g:1971:1: rule__Add__Group_3_1__0 : rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 ;
    public final void rule__Add__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1975:1: ( rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 )
            // InternalMyDsl.g:1976:2: rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1
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
    // InternalMyDsl.g:1983:1: rule__Add__Group_3_1__0__Impl : ( '.' ) ;
    public final void rule__Add__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( '.' ) )
            // InternalMyDsl.g:1988:1: ( '.' )
            {
            // InternalMyDsl.g:1988:1: ( '.' )
            // InternalMyDsl.g:1989:2: '.'
            {
             before(grammarAccess.getAddAccess().getFullStopKeyword_3_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1998:1: rule__Add__Group_3_1__1 : rule__Add__Group_3_1__1__Impl ;
    public final void rule__Add__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( rule__Add__Group_3_1__1__Impl )
            // InternalMyDsl.g:2003:2: rule__Add__Group_3_1__1__Impl
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
    // InternalMyDsl.g:2009:1: rule__Add__Group_3_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Add__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2014:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2014:1: ( RULE_ID )
            // InternalMyDsl.g:2015:2: RULE_ID
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
    // InternalMyDsl.g:2025:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2029:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalMyDsl.g:2030:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
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
    // InternalMyDsl.g:2037:1: rule__Copy__Group__0__Impl : ( 'COPY ' ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( ( 'COPY ' ) )
            // InternalMyDsl.g:2042:1: ( 'COPY ' )
            {
            // InternalMyDsl.g:2042:1: ( 'COPY ' )
            // InternalMyDsl.g:2043:2: 'COPY '
            {
             before(grammarAccess.getCopyAccess().getCOPYKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2052:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2056:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalMyDsl.g:2057:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
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
    // InternalMyDsl.g:2064:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ( rule__Copy__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:2069:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:2069:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:2070:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getCopyAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:2071:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_CHOWN_OPTION) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2071:3: rule__Copy__Chown_optionsAssignment_1
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
    // InternalMyDsl.g:2079:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2083:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalMyDsl.g:2084:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
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
    // InternalMyDsl.g:2091:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__FileAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( ( ( rule__Copy__FileAssignment_2 ) ) )
            // InternalMyDsl.g:2096:1: ( ( rule__Copy__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:2096:1: ( ( rule__Copy__FileAssignment_2 ) )
            // InternalMyDsl.g:2097:2: ( rule__Copy__FileAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:2098:2: ( rule__Copy__FileAssignment_2 )
            // InternalMyDsl.g:2098:3: rule__Copy__FileAssignment_2
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
    // InternalMyDsl.g:2106:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalMyDsl.g:2111:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
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
    // InternalMyDsl.g:2118:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__Alternatives_3 )? ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__Copy__Alternatives_3 )? ) )
            // InternalMyDsl.g:2123:1: ( ( rule__Copy__Alternatives_3 )? )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__Copy__Alternatives_3 )? )
            // InternalMyDsl.g:2124:2: ( rule__Copy__Alternatives_3 )?
            {
             before(grammarAccess.getCopyAccess().getAlternatives_3()); 
            // InternalMyDsl.g:2125:2: ( rule__Copy__Alternatives_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=14 && LA24_0<=15)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2125:3: rule__Copy__Alternatives_3
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
    // InternalMyDsl.g:2133:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2137:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalMyDsl.g:2138:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
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
    // InternalMyDsl.g:2145:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__Group_4__0 )? ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( ( ( rule__Copy__Group_4__0 )? ) )
            // InternalMyDsl.g:2150:1: ( ( rule__Copy__Group_4__0 )? )
            {
            // InternalMyDsl.g:2150:1: ( ( rule__Copy__Group_4__0 )? )
            // InternalMyDsl.g:2151:2: ( rule__Copy__Group_4__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_4()); 
            // InternalMyDsl.g:2152:2: ( rule__Copy__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2152:3: rule__Copy__Group_4__0
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
    // InternalMyDsl.g:2160:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( rule__Copy__Group__5__Impl )
            // InternalMyDsl.g:2165:2: rule__Copy__Group__5__Impl
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
    // InternalMyDsl.g:2171:1: rule__Copy__Group__5__Impl : ( ( rule__Copy__DirectoryAssignment_5 ) ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( ( ( rule__Copy__DirectoryAssignment_5 ) ) )
            // InternalMyDsl.g:2176:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            {
            // InternalMyDsl.g:2176:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            // InternalMyDsl.g:2177:2: ( rule__Copy__DirectoryAssignment_5 )
            {
             before(grammarAccess.getCopyAccess().getDirectoryAssignment_5()); 
            // InternalMyDsl.g:2178:2: ( rule__Copy__DirectoryAssignment_5 )
            // InternalMyDsl.g:2178:3: rule__Copy__DirectoryAssignment_5
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
    // InternalMyDsl.g:2187:1: rule__Copy__Group_4__0 : rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 ;
    public final void rule__Copy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2191:1: ( rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 )
            // InternalMyDsl.g:2192:2: rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1
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
    // InternalMyDsl.g:2199:1: rule__Copy__Group_4__0__Impl : ( '.' ) ;
    public final void rule__Copy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( ( '.' ) )
            // InternalMyDsl.g:2204:1: ( '.' )
            {
            // InternalMyDsl.g:2204:1: ( '.' )
            // InternalMyDsl.g:2205:2: '.'
            {
             before(grammarAccess.getCopyAccess().getFullStopKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:2214:1: rule__Copy__Group_4__1 : rule__Copy__Group_4__1__Impl ;
    public final void rule__Copy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2218:1: ( rule__Copy__Group_4__1__Impl )
            // InternalMyDsl.g:2219:2: rule__Copy__Group_4__1__Impl
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
    // InternalMyDsl.g:2225:1: rule__Copy__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__Copy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2229:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2230:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2230:1: ( RULE_ID )
            // InternalMyDsl.g:2231:2: RULE_ID
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
    // InternalMyDsl.g:2241:1: rule__IMAGE_NAME__Group__0 : rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 ;
    public final void rule__IMAGE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2245:1: ( rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 )
            // InternalMyDsl.g:2246:2: rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1
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
    // InternalMyDsl.g:2253:1: rule__IMAGE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2258:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2258:1: ( RULE_ID )
            // InternalMyDsl.g:2259:2: RULE_ID
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
    // InternalMyDsl.g:2268:1: rule__IMAGE_NAME__Group__1 : rule__IMAGE_NAME__Group__1__Impl ;
    public final void rule__IMAGE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2272:1: ( rule__IMAGE_NAME__Group__1__Impl )
            // InternalMyDsl.g:2273:2: rule__IMAGE_NAME__Group__1__Impl
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
    // InternalMyDsl.g:2279:1: rule__IMAGE_NAME__Group__1__Impl : ( ( rule__IMAGE_NAME__Group_1__0 )* ) ;
    public final void rule__IMAGE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ( rule__IMAGE_NAME__Group_1__0 )* ) )
            // InternalMyDsl.g:2284:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            {
            // InternalMyDsl.g:2284:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            // InternalMyDsl.g:2285:2: ( rule__IMAGE_NAME__Group_1__0 )*
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup_1()); 
            // InternalMyDsl.g:2286:2: ( rule__IMAGE_NAME__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:2286:3: rule__IMAGE_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__IMAGE_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMyDsl.g:2295:1: rule__IMAGE_NAME__Group_1__0 : rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 ;
    public final void rule__IMAGE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 )
            // InternalMyDsl.g:2300:2: rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1
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
    // InternalMyDsl.g:2307:1: rule__IMAGE_NAME__Group_1__0__Impl : ( '/' ) ;
    public final void rule__IMAGE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( ( '/' ) )
            // InternalMyDsl.g:2312:1: ( '/' )
            {
            // InternalMyDsl.g:2312:1: ( '/' )
            // InternalMyDsl.g:2313:2: '/'
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2322:1: rule__IMAGE_NAME__Group_1__1 : rule__IMAGE_NAME__Group_1__1__Impl ;
    public final void rule__IMAGE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2326:1: ( rule__IMAGE_NAME__Group_1__1__Impl )
            // InternalMyDsl.g:2327:2: rule__IMAGE_NAME__Group_1__1__Impl
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
    // InternalMyDsl.g:2333:1: rule__IMAGE_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2337:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2338:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2338:1: ( RULE_ID )
            // InternalMyDsl.g:2339:2: RULE_ID
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
    // InternalMyDsl.g:2349:1: rule__IMAGE_TAG__Group__0 : rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 ;
    public final void rule__IMAGE_TAG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2353:1: ( rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 )
            // InternalMyDsl.g:2354:2: rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1
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
    // InternalMyDsl.g:2361:1: rule__IMAGE_TAG__Group__0__Impl : ( ':' ) ;
    public final void rule__IMAGE_TAG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( ( ':' ) )
            // InternalMyDsl.g:2366:1: ( ':' )
            {
            // InternalMyDsl.g:2366:1: ( ':' )
            // InternalMyDsl.g:2367:2: ':'
            {
             before(grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2376:1: rule__IMAGE_TAG__Group__1 : rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 ;
    public final void rule__IMAGE_TAG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2380:1: ( rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 )
            // InternalMyDsl.g:2381:2: rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2
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
    // InternalMyDsl.g:2388:1: rule__IMAGE_TAG__Group__1__Impl : ( ( rule__IMAGE_TAG__Alternatives_1 ) ) ;
    public final void rule__IMAGE_TAG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( ( ( rule__IMAGE_TAG__Alternatives_1 ) ) )
            // InternalMyDsl.g:2393:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2393:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            // InternalMyDsl.g:2394:2: ( rule__IMAGE_TAG__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2395:2: ( rule__IMAGE_TAG__Alternatives_1 )
            // InternalMyDsl.g:2395:3: rule__IMAGE_TAG__Alternatives_1
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
    // InternalMyDsl.g:2403:1: rule__IMAGE_TAG__Group__2 : rule__IMAGE_TAG__Group__2__Impl ;
    public final void rule__IMAGE_TAG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2407:1: ( rule__IMAGE_TAG__Group__2__Impl )
            // InternalMyDsl.g:2408:2: rule__IMAGE_TAG__Group__2__Impl
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
    // InternalMyDsl.g:2414:1: rule__IMAGE_TAG__Group__2__Impl : ( ( rule__IMAGE_TAG__Alternatives_2 )* ) ;
    public final void rule__IMAGE_TAG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( ( ( rule__IMAGE_TAG__Alternatives_2 )* ) )
            // InternalMyDsl.g:2419:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2419:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            // InternalMyDsl.g:2420:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2421:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||(LA27_0>=16 && LA27_0<=17)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2421:3: rule__IMAGE_TAG__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IMAGE_TAG__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyDsl.g:2430:1: rule__IMAGE_DIGEST__Group__0 : rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 ;
    public final void rule__IMAGE_DIGEST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2434:1: ( rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 )
            // InternalMyDsl.g:2435:2: rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1
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
    // InternalMyDsl.g:2442:1: rule__IMAGE_DIGEST__Group__0__Impl : ( '@' ) ;
    public final void rule__IMAGE_DIGEST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( '@' ) )
            // InternalMyDsl.g:2447:1: ( '@' )
            {
            // InternalMyDsl.g:2447:1: ( '@' )
            // InternalMyDsl.g:2448:2: '@'
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2457:1: rule__IMAGE_DIGEST__Group__1 : rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 ;
    public final void rule__IMAGE_DIGEST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2461:1: ( rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 )
            // InternalMyDsl.g:2462:2: rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2
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
    // InternalMyDsl.g:2469:1: rule__IMAGE_DIGEST__Group__1__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) ;
    public final void rule__IMAGE_DIGEST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) )
            // InternalMyDsl.g:2474:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2474:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            // InternalMyDsl.g:2475:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2476:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            // InternalMyDsl.g:2476:3: rule__IMAGE_DIGEST__Alternatives_1
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
    // InternalMyDsl.g:2484:1: rule__IMAGE_DIGEST__Group__2 : rule__IMAGE_DIGEST__Group__2__Impl ;
    public final void rule__IMAGE_DIGEST__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2488:1: ( rule__IMAGE_DIGEST__Group__2__Impl )
            // InternalMyDsl.g:2489:2: rule__IMAGE_DIGEST__Group__2__Impl
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
    // InternalMyDsl.g:2495:1: rule__IMAGE_DIGEST__Group__2__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) ;
    public final void rule__IMAGE_DIGEST__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) )
            // InternalMyDsl.g:2500:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2500:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            // InternalMyDsl.g:2501:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2502:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||(LA28_0>=16 && LA28_0<=17)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2502:3: rule__IMAGE_DIGEST__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__IMAGE_DIGEST__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMyDsl.g:2511:1: rule__EXEC_FORM__Group__0 : rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 ;
    public final void rule__EXEC_FORM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2515:1: ( rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 )
            // InternalMyDsl.g:2516:2: rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1
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
    // InternalMyDsl.g:2523:1: rule__EXEC_FORM__Group__0__Impl : ( ' [' ) ;
    public final void rule__EXEC_FORM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( ' [' ) )
            // InternalMyDsl.g:2528:1: ( ' [' )
            {
            // InternalMyDsl.g:2528:1: ( ' [' )
            // InternalMyDsl.g:2529:2: ' ['
            {
             before(grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2538:1: rule__EXEC_FORM__Group__1 : rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 ;
    public final void rule__EXEC_FORM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 )
            // InternalMyDsl.g:2543:2: rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2
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
    // InternalMyDsl.g:2550:1: rule__EXEC_FORM__Group__1__Impl : ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) ;
    public final void rule__EXEC_FORM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) )
            // InternalMyDsl.g:2555:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            {
            // InternalMyDsl.g:2555:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            // InternalMyDsl.g:2556:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getExecutableAssignment_1()); 
            // InternalMyDsl.g:2557:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            // InternalMyDsl.g:2557:3: rule__EXEC_FORM__ExecutableAssignment_1
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
    // InternalMyDsl.g:2565:1: rule__EXEC_FORM__Group__2 : rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 ;
    public final void rule__EXEC_FORM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2569:1: ( rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 )
            // InternalMyDsl.g:2570:2: rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3
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
    // InternalMyDsl.g:2577:1: rule__EXEC_FORM__Group__2__Impl : ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) ;
    public final void rule__EXEC_FORM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) )
            // InternalMyDsl.g:2582:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            {
            // InternalMyDsl.g:2582:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            // InternalMyDsl.g:2583:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            {
             before(grammarAccess.getEXEC_FORMAccess().getParametersAssignment_2()); 
            // InternalMyDsl.g:2584:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2584:3: rule__EXEC_FORM__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__EXEC_FORM__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMyDsl.g:2592:1: rule__EXEC_FORM__Group__3 : rule__EXEC_FORM__Group__3__Impl ;
    public final void rule__EXEC_FORM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2596:1: ( rule__EXEC_FORM__Group__3__Impl )
            // InternalMyDsl.g:2597:2: rule__EXEC_FORM__Group__3__Impl
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
    // InternalMyDsl.g:2603:1: rule__EXEC_FORM__Group__3__Impl : ( ']' ) ;
    public final void rule__EXEC_FORM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( ( ']' ) )
            // InternalMyDsl.g:2608:1: ( ']' )
            {
            // InternalMyDsl.g:2608:1: ( ']' )
            // InternalMyDsl.g:2609:2: ']'
            {
             before(grammarAccess.getEXEC_FORMAccess().getRightSquareBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2619:1: rule__Dockerfile__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__Dockerfile__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2623:1: ( ( ruleStatement ) )
            // InternalMyDsl.g:2624:2: ( ruleStatement )
            {
            // InternalMyDsl.g:2624:2: ( ruleStatement )
            // InternalMyDsl.g:2625:3: ruleStatement
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


    // $ANTLR start "rule__Statement__StatementAssignment_0_1"
    // InternalMyDsl.g:2634:1: rule__Statement__StatementAssignment_0_1 : ( ( rule__Statement__StatementAlternatives_0_1_0 ) ) ;
    public final void rule__Statement__StatementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2638:1: ( ( ( rule__Statement__StatementAlternatives_0_1_0 ) ) )
            // InternalMyDsl.g:2639:2: ( ( rule__Statement__StatementAlternatives_0_1_0 ) )
            {
            // InternalMyDsl.g:2639:2: ( ( rule__Statement__StatementAlternatives_0_1_0 ) )
            // InternalMyDsl.g:2640:3: ( rule__Statement__StatementAlternatives_0_1_0 )
            {
             before(grammarAccess.getStatementAccess().getStatementAlternatives_0_1_0()); 
            // InternalMyDsl.g:2641:3: ( rule__Statement__StatementAlternatives_0_1_0 )
            // InternalMyDsl.g:2641:4: rule__Statement__StatementAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__StatementAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementAlternatives_0_1_0()); 

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
    // $ANTLR end "rule__Statement__StatementAssignment_0_1"


    // $ANTLR start "rule__From__Platform_optionAssignment_1"
    // InternalMyDsl.g:2649:1: rule__From__Platform_optionAssignment_1 : ( RULE_PLATFORM_OPTION ) ;
    public final void rule__From__Platform_optionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( ( RULE_PLATFORM_OPTION ) )
            // InternalMyDsl.g:2654:2: ( RULE_PLATFORM_OPTION )
            {
            // InternalMyDsl.g:2654:2: ( RULE_PLATFORM_OPTION )
            // InternalMyDsl.g:2655:3: RULE_PLATFORM_OPTION
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
    // InternalMyDsl.g:2664:1: rule__From__NameAssignment_2 : ( ruleIMAGE_NAME ) ;
    public final void rule__From__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( ruleIMAGE_NAME ) )
            // InternalMyDsl.g:2669:2: ( ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:2669:2: ( ruleIMAGE_NAME )
            // InternalMyDsl.g:2670:3: ruleIMAGE_NAME
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
    // InternalMyDsl.g:2679:1: rule__From__Tag_or_digestAssignment_3 : ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) ;
    public final void rule__From__Tag_or_digestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) )
            // InternalMyDsl.g:2684:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            {
            // InternalMyDsl.g:2684:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            // InternalMyDsl.g:2685:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAlternatives_3_0()); 
            // InternalMyDsl.g:2686:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            // InternalMyDsl.g:2686:4: rule__From__Tag_or_digestAlternatives_3_0
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
    // InternalMyDsl.g:2694:1: rule__Maintainer__NameAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Maintainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2699:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2699:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2700:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2709:1: rule__Expose__PortsAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Expose__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2714:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2714:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2715:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2724:1: rule__Workdir__PathAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Workdir__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2729:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2729:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2730:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2739:1: rule__Env__Key_value_pairsAssignment_1 : ( RULE_KV_PAIR_EQUALS ) ;
    public final void rule__Env__Key_value_pairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( ( RULE_KV_PAIR_EQUALS ) )
            // InternalMyDsl.g:2744:2: ( RULE_KV_PAIR_EQUALS )
            {
            // InternalMyDsl.g:2744:2: ( RULE_KV_PAIR_EQUALS )
            // InternalMyDsl.g:2745:3: RULE_KV_PAIR_EQUALS
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
    // InternalMyDsl.g:2754:1: rule__Label__Key_value_pairsAssignment_1 : ( RULE_KV_PAIR_EQUALS ) ;
    public final void rule__Label__Key_value_pairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( RULE_KV_PAIR_EQUALS ) )
            // InternalMyDsl.g:2759:2: ( RULE_KV_PAIR_EQUALS )
            {
            // InternalMyDsl.g:2759:2: ( RULE_KV_PAIR_EQUALS )
            // InternalMyDsl.g:2760:3: RULE_KV_PAIR_EQUALS
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
    // InternalMyDsl.g:2769:1: rule__Add__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Add__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2773:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:2774:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:2774:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:2775:3: RULE_CHOWN_OPTION
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
    // InternalMyDsl.g:2784:1: rule__Add__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Add__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2789:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2789:2: ( RULE_ID )
            // InternalMyDsl.g:2790:3: RULE_ID
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
    // InternalMyDsl.g:2799:1: rule__Add__DirectoryAssignment_4 : ( RULE_SHELL_CMD ) ;
    public final void rule__Add__DirectoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2804:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2804:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2805:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2814:1: rule__Copy__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Copy__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:2819:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:2819:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:2820:3: RULE_CHOWN_OPTION
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
    // InternalMyDsl.g:2829:1: rule__Copy__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Copy__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2834:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2834:2: ( RULE_ID )
            // InternalMyDsl.g:2835:3: RULE_ID
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
    // InternalMyDsl.g:2844:1: rule__Copy__DirectoryAssignment_5 : ( RULE_SHELL_CMD ) ;
    public final void rule__Copy__DirectoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2849:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2849:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2850:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2859:1: rule__EXEC_FORM__ExecutableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EXEC_FORM__ExecutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2864:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2864:2: ( RULE_STRING )
            // InternalMyDsl.g:2865:3: RULE_STRING
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
    // InternalMyDsl.g:2874:1: rule__EXEC_FORM__ParametersAssignment_2 : ( RULE_EXEC_FORM_PARAMETER ) ;
    public final void rule__EXEC_FORM__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( ( RULE_EXEC_FORM_PARAMETER ) )
            // InternalMyDsl.g:2879:2: ( RULE_EXEC_FORM_PARAMETER )
            {
            // InternalMyDsl.g:2879:2: ( RULE_EXEC_FORM_PARAMETER )
            // InternalMyDsl.g:2880:3: RULE_EXEC_FORM_PARAMETER
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000007FFC0012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000007FFC0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000002C200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000300E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000300E2L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002002L});

}