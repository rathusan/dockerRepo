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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_NL", "RULE_COMMENT", "RULE_PLATFORM_OPTION", "RULE_SHELL_CMD", "RULE_KV_PAIR_EQUALS", "RULE_CHOWN_OPTION", "RULE_EXEC_FORM_PARAMETER", "'?'", "'*'", "'-'", "'.'", "'/'", "':'", "'@'", "' ['", "']'", "'FROM '", "'CMD'", "'RUN'", "'ENTRYPOINT'", "'VOLUME'", "'MAINTAINER'", "'EXPOSE'", "'WORKDIR'", "'ENV '", "'LABEL '", "'ADD '", "'COPY '", "'ONBUILD '"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_SHELL_CMD=10;
    public static final int RULE_COMMENT=8;
    public static final int RULE_CHOWN_OPTION=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_KV_PAIR_EQUALS=11;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=7;
    public static final int RULE_EXEC_FORM_PARAMETER=13;
    public static final int T__20=20;
    public static final int RULE_PLATFORM_OPTION=9;
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
    // InternalMyDsl.g:62:1: ruleDockerfile : ( ( rule__Dockerfile__Alternatives )* ) ;
    public final void ruleDockerfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Dockerfile__Alternatives )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Dockerfile__Alternatives )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Dockerfile__Alternatives )* )
            // InternalMyDsl.g:68:3: ( rule__Dockerfile__Alternatives )*
            {
             before(grammarAccess.getDockerfileAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Dockerfile__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT||(LA1_0>=23 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Dockerfile__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Dockerfile__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDockerfileAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleInstruction EOF )
            // InternalMyDsl.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:87:1: ruleInstruction : ( ( rule__Instruction__StatementAssignment ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Instruction__StatementAssignment ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Instruction__StatementAssignment ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Instruction__StatementAssignment ) )
            // InternalMyDsl.g:93:3: ( rule__Instruction__StatementAssignment )
            {
             before(grammarAccess.getInstructionAccess().getStatementAssignment()); 
            // InternalMyDsl.g:94:3: ( rule__Instruction__StatementAssignment )
            // InternalMyDsl.g:94:4: rule__Instruction__StatementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__StatementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getStatementAssignment()); 

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
    // $ANTLR end "ruleInstruction"


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


    // $ANTLR start "entryRuleOnbuild"
    // InternalMyDsl.g:403:1: entryRuleOnbuild : ruleOnbuild EOF ;
    public final void entryRuleOnbuild() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleOnbuild EOF )
            // InternalMyDsl.g:405:1: ruleOnbuild EOF
            {
             before(grammarAccess.getOnbuildRule()); 
            pushFollow(FOLLOW_1);
            ruleOnbuild();

            state._fsp--;

             after(grammarAccess.getOnbuildRule()); 
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
    // $ANTLR end "entryRuleOnbuild"


    // $ANTLR start "ruleOnbuild"
    // InternalMyDsl.g:412:1: ruleOnbuild : ( ( rule__Onbuild__Group__0 ) ) ;
    public final void ruleOnbuild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Onbuild__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Onbuild__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Onbuild__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Onbuild__Group__0 )
            {
             before(grammarAccess.getOnbuildAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Onbuild__Group__0 )
            // InternalMyDsl.g:419:4: rule__Onbuild__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getGroup()); 

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
    // $ANTLR end "ruleOnbuild"


    // $ANTLR start "entryRuleIMAGE_NAME"
    // InternalMyDsl.g:428:1: entryRuleIMAGE_NAME : ruleIMAGE_NAME EOF ;
    public final void entryRuleIMAGE_NAME() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleIMAGE_NAME EOF )
            // InternalMyDsl.g:430:1: ruleIMAGE_NAME EOF
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
    // InternalMyDsl.g:437:1: ruleIMAGE_NAME : ( ( rule__IMAGE_NAME__Group__0 ) ) ;
    public final void ruleIMAGE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__IMAGE_NAME__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__IMAGE_NAME__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__IMAGE_NAME__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__IMAGE_NAME__Group__0 )
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__IMAGE_NAME__Group__0 )
            // InternalMyDsl.g:444:4: rule__IMAGE_NAME__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleIMAGE_TAG : ruleIMAGE_TAG EOF ;
    public final void entryRuleIMAGE_TAG() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleIMAGE_TAG EOF )
            // InternalMyDsl.g:455:1: ruleIMAGE_TAG EOF
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
    // InternalMyDsl.g:462:1: ruleIMAGE_TAG : ( ( rule__IMAGE_TAG__Group__0 ) ) ;
    public final void ruleIMAGE_TAG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__IMAGE_TAG__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__IMAGE_TAG__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__IMAGE_TAG__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__IMAGE_TAG__Group__0 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__IMAGE_TAG__Group__0 )
            // InternalMyDsl.g:469:4: rule__IMAGE_TAG__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleIMAGE_DIGEST : ruleIMAGE_DIGEST EOF ;
    public final void entryRuleIMAGE_DIGEST() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleIMAGE_DIGEST EOF )
            // InternalMyDsl.g:480:1: ruleIMAGE_DIGEST EOF
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
    // InternalMyDsl.g:487:1: ruleIMAGE_DIGEST : ( ( rule__IMAGE_DIGEST__Group__0 ) ) ;
    public final void ruleIMAGE_DIGEST() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__IMAGE_DIGEST__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__IMAGE_DIGEST__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__IMAGE_DIGEST__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__IMAGE_DIGEST__Group__0 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__IMAGE_DIGEST__Group__0 )
            // InternalMyDsl.g:494:4: rule__IMAGE_DIGEST__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleEXEC_FORM : ruleEXEC_FORM EOF ;
    public final void entryRuleEXEC_FORM() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleEXEC_FORM EOF )
            // InternalMyDsl.g:505:1: ruleEXEC_FORM EOF
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
    // InternalMyDsl.g:512:1: ruleEXEC_FORM : ( ( rule__EXEC_FORM__Group__0 ) ) ;
    public final void ruleEXEC_FORM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__EXEC_FORM__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__EXEC_FORM__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__EXEC_FORM__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__EXEC_FORM__Group__0 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__EXEC_FORM__Group__0 )
            // InternalMyDsl.g:519:4: rule__EXEC_FORM__Group__0
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


    // $ANTLR start "rule__Dockerfile__Alternatives"
    // InternalMyDsl.g:527:1: rule__Dockerfile__Alternatives : ( ( ( rule__Dockerfile__Group_0__0 ) ) | ( ( rule__Dockerfile__Group_1__0 ) ) );
    public final void rule__Dockerfile__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( ( ( rule__Dockerfile__Group_0__0 ) ) | ( ( rule__Dockerfile__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=23 && LA2_0<=35)) ) {
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
                    // InternalMyDsl.g:532:2: ( ( rule__Dockerfile__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:532:2: ( ( rule__Dockerfile__Group_0__0 ) )
                    // InternalMyDsl.g:533:3: ( rule__Dockerfile__Group_0__0 )
                    {
                     before(grammarAccess.getDockerfileAccess().getGroup_0()); 
                    // InternalMyDsl.g:534:3: ( rule__Dockerfile__Group_0__0 )
                    // InternalMyDsl.g:534:4: rule__Dockerfile__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dockerfile__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDockerfileAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:538:2: ( ( rule__Dockerfile__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:538:2: ( ( rule__Dockerfile__Group_1__0 ) )
                    // InternalMyDsl.g:539:3: ( rule__Dockerfile__Group_1__0 )
                    {
                     before(grammarAccess.getDockerfileAccess().getGroup_1()); 
                    // InternalMyDsl.g:540:3: ( rule__Dockerfile__Group_1__0 )
                    // InternalMyDsl.g:540:4: rule__Dockerfile__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dockerfile__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDockerfileAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Dockerfile__Alternatives"


    // $ANTLR start "rule__Instruction__StatementAlternatives_0"
    // InternalMyDsl.g:548:1: rule__Instruction__StatementAlternatives_0 : ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) | ( ruleOnbuild ) );
    public final void rule__Instruction__StatementAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:552:1: ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) | ( ruleOnbuild ) )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            case 25:
                {
                alt3=8;
                }
                break;
            case 31:
                {
                alt3=9;
                }
                break;
            case 32:
                {
                alt3=10;
                }
                break;
            case 33:
                {
                alt3=11;
                }
                break;
            case 34:
                {
                alt3=12;
                }
                break;
            case 35:
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
                    // InternalMyDsl.g:553:2: ( ruleFrom )
                    {
                    // InternalMyDsl.g:553:2: ( ruleFrom )
                    // InternalMyDsl.g:554:3: ruleFrom
                    {
                     before(grammarAccess.getInstructionAccess().getStatementFromParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFrom();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementFromParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:559:2: ( ruleCmd )
                    {
                    // InternalMyDsl.g:559:2: ( ruleCmd )
                    // InternalMyDsl.g:560:3: ruleCmd
                    {
                     before(grammarAccess.getInstructionAccess().getStatementCmdParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCmd();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementCmdParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:565:2: ( ruleEntrypoint )
                    {
                    // InternalMyDsl.g:565:2: ( ruleEntrypoint )
                    // InternalMyDsl.g:566:3: ruleEntrypoint
                    {
                     before(grammarAccess.getInstructionAccess().getStatementEntrypointParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEntrypoint();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementEntrypointParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:571:2: ( ruleVolume )
                    {
                    // InternalMyDsl.g:571:2: ( ruleVolume )
                    // InternalMyDsl.g:572:3: ruleVolume
                    {
                     before(grammarAccess.getInstructionAccess().getStatementVolumeParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVolume();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementVolumeParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:577:2: ( ruleMaintainer )
                    {
                    // InternalMyDsl.g:577:2: ( ruleMaintainer )
                    // InternalMyDsl.g:578:3: ruleMaintainer
                    {
                     before(grammarAccess.getInstructionAccess().getStatementMaintainerParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMaintainer();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementMaintainerParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:583:2: ( ruleExpose )
                    {
                    // InternalMyDsl.g:583:2: ( ruleExpose )
                    // InternalMyDsl.g:584:3: ruleExpose
                    {
                     before(grammarAccess.getInstructionAccess().getStatementExposeParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpose();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementExposeParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:589:2: ( ruleWorkdir )
                    {
                    // InternalMyDsl.g:589:2: ( ruleWorkdir )
                    // InternalMyDsl.g:590:3: ruleWorkdir
                    {
                     before(grammarAccess.getInstructionAccess().getStatementWorkdirParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkdir();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementWorkdirParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:595:2: ( ruleRun )
                    {
                    // InternalMyDsl.g:595:2: ( ruleRun )
                    // InternalMyDsl.g:596:3: ruleRun
                    {
                     before(grammarAccess.getInstructionAccess().getStatementRunParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRun();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementRunParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:601:2: ( ruleEnv )
                    {
                    // InternalMyDsl.g:601:2: ( ruleEnv )
                    // InternalMyDsl.g:602:3: ruleEnv
                    {
                     before(grammarAccess.getInstructionAccess().getStatementEnvParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleEnv();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementEnvParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:607:2: ( ruleLabel )
                    {
                    // InternalMyDsl.g:607:2: ( ruleLabel )
                    // InternalMyDsl.g:608:3: ruleLabel
                    {
                     before(grammarAccess.getInstructionAccess().getStatementLabelParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementLabelParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:613:2: ( ruleAdd )
                    {
                    // InternalMyDsl.g:613:2: ( ruleAdd )
                    // InternalMyDsl.g:614:3: ruleAdd
                    {
                     before(grammarAccess.getInstructionAccess().getStatementAddParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementAddParserRuleCall_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:619:2: ( ruleCopy )
                    {
                    // InternalMyDsl.g:619:2: ( ruleCopy )
                    // InternalMyDsl.g:620:3: ruleCopy
                    {
                     before(grammarAccess.getInstructionAccess().getStatementCopyParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementCopyParserRuleCall_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:625:2: ( ruleOnbuild )
                    {
                    // InternalMyDsl.g:625:2: ( ruleOnbuild )
                    // InternalMyDsl.g:626:3: ruleOnbuild
                    {
                     before(grammarAccess.getInstructionAccess().getStatementOnbuildParserRuleCall_0_12()); 
                    pushFollow(FOLLOW_2);
                    ruleOnbuild();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementOnbuildParserRuleCall_0_12()); 

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
    // $ANTLR end "rule__Instruction__StatementAlternatives_0"


    // $ANTLR start "rule__From__Tag_or_digestAlternatives_3_0"
    // InternalMyDsl.g:635:1: rule__From__Tag_or_digestAlternatives_3_0 : ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) );
    public final void rule__From__Tag_or_digestAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:640:2: ( ruleIMAGE_TAG )
                    {
                    // InternalMyDsl.g:640:2: ( ruleIMAGE_TAG )
                    // InternalMyDsl.g:641:3: ruleIMAGE_TAG
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
                    // InternalMyDsl.g:646:2: ( ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:646:2: ( ruleIMAGE_DIGEST )
                    // InternalMyDsl.g:647:3: ruleIMAGE_DIGEST
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
    // InternalMyDsl.g:656:1: rule__Cmd__Alternatives_1 : ( ( ( rule__Cmd__Exec_formAssignment_1_0 ) ) | ( ( rule__Cmd__Shell_formAssignment_1_1 ) ) );
    public final void rule__Cmd__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:660:1: ( ( ( rule__Cmd__Exec_formAssignment_1_0 ) ) | ( ( rule__Cmd__Shell_formAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
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
                    // InternalMyDsl.g:661:2: ( ( rule__Cmd__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:661:2: ( ( rule__Cmd__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:662:3: ( rule__Cmd__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getCmdAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:663:3: ( rule__Cmd__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:663:4: rule__Cmd__Exec_formAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cmd__Exec_formAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCmdAccess().getExec_formAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:667:2: ( ( rule__Cmd__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:667:2: ( ( rule__Cmd__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:668:3: ( rule__Cmd__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getCmdAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:669:3: ( rule__Cmd__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:669:4: rule__Cmd__Shell_formAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cmd__Shell_formAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCmdAccess().getShell_formAssignment_1_1()); 

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
    // InternalMyDsl.g:677:1: rule__Run__Alternatives_1 : ( ( ( rule__Run__Exec_formAssignment_1_0 ) ) | ( ( rule__Run__Shell_formAssignment_1_1 ) ) );
    public final void rule__Run__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( ( rule__Run__Exec_formAssignment_1_0 ) ) | ( ( rule__Run__Shell_formAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
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
                    // InternalMyDsl.g:682:2: ( ( rule__Run__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:682:2: ( ( rule__Run__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:683:3: ( rule__Run__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getRunAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:684:3: ( rule__Run__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:684:4: rule__Run__Exec_formAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Run__Exec_formAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRunAccess().getExec_formAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:688:2: ( ( rule__Run__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:688:2: ( ( rule__Run__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:689:3: ( rule__Run__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getRunAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:690:3: ( rule__Run__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:690:4: rule__Run__Shell_formAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Run__Shell_formAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRunAccess().getShell_formAssignment_1_1()); 

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
    // InternalMyDsl.g:698:1: rule__Entrypoint__Alternatives_1 : ( ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) ) | ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) ) );
    public final void rule__Entrypoint__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) ) | ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
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
                    // InternalMyDsl.g:703:2: ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:703:2: ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:704:3: ( rule__Entrypoint__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getEntrypointAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:705:3: ( rule__Entrypoint__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:705:4: rule__Entrypoint__Exec_formAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrypoint__Exec_formAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntrypointAccess().getExec_formAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:709:2: ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:709:2: ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:710:3: ( rule__Entrypoint__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getEntrypointAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:711:3: ( rule__Entrypoint__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:711:4: rule__Entrypoint__Shell_formAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrypoint__Shell_formAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntrypointAccess().getShell_formAssignment_1_1()); 

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
    // InternalMyDsl.g:719:1: rule__Volume__Alternatives_1 : ( ( ( rule__Volume__Exec_formAssignment_1_0 ) ) | ( ( rule__Volume__Shell_formAssignment_1_1 ) ) );
    public final void rule__Volume__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ( rule__Volume__Exec_formAssignment_1_0 ) ) | ( ( rule__Volume__Shell_formAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
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
                    // InternalMyDsl.g:724:2: ( ( rule__Volume__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:724:2: ( ( rule__Volume__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:725:3: ( rule__Volume__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getVolumeAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:726:3: ( rule__Volume__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:726:4: rule__Volume__Exec_formAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Exec_formAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVolumeAccess().getExec_formAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:730:2: ( ( rule__Volume__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:730:2: ( ( rule__Volume__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:731:3: ( rule__Volume__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getVolumeAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:732:3: ( rule__Volume__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:732:4: rule__Volume__Shell_formAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Shell_formAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVolumeAccess().getShell_formAssignment_1_1()); 

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
    // InternalMyDsl.g:740:1: rule__Add__Alternatives_3 : ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) );
    public final void rule__Add__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) )
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
                    // InternalMyDsl.g:745:2: ( ( rule__Add__Alternatives_3_0 ) )
                    {
                    // InternalMyDsl.g:745:2: ( ( rule__Add__Alternatives_3_0 ) )
                    // InternalMyDsl.g:746:3: ( rule__Add__Alternatives_3_0 )
                    {
                     before(grammarAccess.getAddAccess().getAlternatives_3_0()); 
                    // InternalMyDsl.g:747:3: ( rule__Add__Alternatives_3_0 )
                    // InternalMyDsl.g:747:4: rule__Add__Alternatives_3_0
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
                    // InternalMyDsl.g:751:2: ( ( rule__Add__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:751:2: ( ( rule__Add__Group_3_1__0 ) )
                    // InternalMyDsl.g:752:3: ( rule__Add__Group_3_1__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:753:3: ( rule__Add__Group_3_1__0 )
                    // InternalMyDsl.g:753:4: rule__Add__Group_3_1__0
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
    // InternalMyDsl.g:761:1: rule__Add__Alternatives_3_0 : ( ( '?' ) | ( '*' ) );
    public final void rule__Add__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( ( '?' ) | ( '*' ) )
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
                    // InternalMyDsl.g:766:2: ( '?' )
                    {
                    // InternalMyDsl.g:766:2: ( '?' )
                    // InternalMyDsl.g:767:3: '?'
                    {
                     before(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:772:2: ( '*' )
                    {
                    // InternalMyDsl.g:772:2: ( '*' )
                    // InternalMyDsl.g:773:3: '*'
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
    // InternalMyDsl.g:782:1: rule__Copy__Alternatives_3 : ( ( '?' ) | ( '*' ) );
    public final void rule__Copy__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( ( '?' ) | ( '*' ) )
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
                    // InternalMyDsl.g:787:2: ( '?' )
                    {
                    // InternalMyDsl.g:787:2: ( '?' )
                    // InternalMyDsl.g:788:3: '?'
                    {
                     before(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:793:2: ( '*' )
                    {
                    // InternalMyDsl.g:793:2: ( '*' )
                    // InternalMyDsl.g:794:3: '*'
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
    // InternalMyDsl.g:803:1: rule__IMAGE_TAG__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_TAG__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
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
                    // InternalMyDsl.g:808:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:808:2: ( RULE_ID )
                    // InternalMyDsl.g:809:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:814:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:814:2: ( RULE_INT )
                    // InternalMyDsl.g:815:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:820:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:820:2: ( RULE_STRING )
                    // InternalMyDsl.g:821:3: RULE_STRING
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
    // InternalMyDsl.g:830:1: rule__IMAGE_TAG__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_TAG__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:834:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
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
                    // InternalMyDsl.g:835:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:835:2: ( RULE_ID )
                    // InternalMyDsl.g:836:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:841:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:841:2: ( RULE_INT )
                    // InternalMyDsl.g:842:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:847:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:847:2: ( RULE_STRING )
                    // InternalMyDsl.g:848:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:853:2: ( '-' )
                    {
                    // InternalMyDsl.g:853:2: ( '-' )
                    // InternalMyDsl.g:854:3: '-'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:859:2: ( '.' )
                    {
                    // InternalMyDsl.g:859:2: ( '.' )
                    // InternalMyDsl.g:860:3: '.'
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
    // InternalMyDsl.g:869:1: rule__IMAGE_DIGEST__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_DIGEST__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
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
                    // InternalMyDsl.g:874:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:874:2: ( RULE_ID )
                    // InternalMyDsl.g:875:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:880:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:880:2: ( RULE_INT )
                    // InternalMyDsl.g:881:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:886:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:886:2: ( RULE_STRING )
                    // InternalMyDsl.g:887:3: RULE_STRING
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
    // InternalMyDsl.g:896:1: rule__IMAGE_DIGEST__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_DIGEST__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
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
                    // InternalMyDsl.g:901:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:901:2: ( RULE_ID )
                    // InternalMyDsl.g:902:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:907:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:907:2: ( RULE_INT )
                    // InternalMyDsl.g:908:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:913:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:913:2: ( RULE_STRING )
                    // InternalMyDsl.g:914:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:919:2: ( '-' )
                    {
                    // InternalMyDsl.g:919:2: ( '-' )
                    // InternalMyDsl.g:920:3: '-'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:925:2: ( '.' )
                    {
                    // InternalMyDsl.g:925:2: ( '.' )
                    // InternalMyDsl.g:926:3: '.'
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


    // $ANTLR start "rule__Dockerfile__Group_0__0"
    // InternalMyDsl.g:935:1: rule__Dockerfile__Group_0__0 : rule__Dockerfile__Group_0__0__Impl rule__Dockerfile__Group_0__1 ;
    public final void rule__Dockerfile__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( rule__Dockerfile__Group_0__0__Impl rule__Dockerfile__Group_0__1 )
            // InternalMyDsl.g:940:2: rule__Dockerfile__Group_0__0__Impl rule__Dockerfile__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Dockerfile__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dockerfile__Group_0__1();

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
    // $ANTLR end "rule__Dockerfile__Group_0__0"


    // $ANTLR start "rule__Dockerfile__Group_0__0__Impl"
    // InternalMyDsl.g:947:1: rule__Dockerfile__Group_0__0__Impl : ( ( rule__Dockerfile__StatementsAssignment_0_0 ) ) ;
    public final void rule__Dockerfile__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( ( rule__Dockerfile__StatementsAssignment_0_0 ) ) )
            // InternalMyDsl.g:952:1: ( ( rule__Dockerfile__StatementsAssignment_0_0 ) )
            {
            // InternalMyDsl.g:952:1: ( ( rule__Dockerfile__StatementsAssignment_0_0 ) )
            // InternalMyDsl.g:953:2: ( rule__Dockerfile__StatementsAssignment_0_0 )
            {
             before(grammarAccess.getDockerfileAccess().getStatementsAssignment_0_0()); 
            // InternalMyDsl.g:954:2: ( rule__Dockerfile__StatementsAssignment_0_0 )
            // InternalMyDsl.g:954:3: rule__Dockerfile__StatementsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Dockerfile__StatementsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDockerfileAccess().getStatementsAssignment_0_0()); 

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
    // $ANTLR end "rule__Dockerfile__Group_0__0__Impl"


    // $ANTLR start "rule__Dockerfile__Group_0__1"
    // InternalMyDsl.g:962:1: rule__Dockerfile__Group_0__1 : rule__Dockerfile__Group_0__1__Impl ;
    public final void rule__Dockerfile__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( rule__Dockerfile__Group_0__1__Impl )
            // InternalMyDsl.g:967:2: rule__Dockerfile__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dockerfile__Group_0__1__Impl();

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
    // $ANTLR end "rule__Dockerfile__Group_0__1"


    // $ANTLR start "rule__Dockerfile__Group_0__1__Impl"
    // InternalMyDsl.g:973:1: rule__Dockerfile__Group_0__1__Impl : ( RULE_NL ) ;
    public final void rule__Dockerfile__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( ( RULE_NL ) )
            // InternalMyDsl.g:978:1: ( RULE_NL )
            {
            // InternalMyDsl.g:978:1: ( RULE_NL )
            // InternalMyDsl.g:979:2: RULE_NL
            {
             before(grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_0_1()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__Dockerfile__Group_0__1__Impl"


    // $ANTLR start "rule__Dockerfile__Group_1__0"
    // InternalMyDsl.g:989:1: rule__Dockerfile__Group_1__0 : rule__Dockerfile__Group_1__0__Impl rule__Dockerfile__Group_1__1 ;
    public final void rule__Dockerfile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( rule__Dockerfile__Group_1__0__Impl rule__Dockerfile__Group_1__1 )
            // InternalMyDsl.g:994:2: rule__Dockerfile__Group_1__0__Impl rule__Dockerfile__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Dockerfile__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dockerfile__Group_1__1();

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
    // $ANTLR end "rule__Dockerfile__Group_1__0"


    // $ANTLR start "rule__Dockerfile__Group_1__0__Impl"
    // InternalMyDsl.g:1001:1: rule__Dockerfile__Group_1__0__Impl : ( ( rule__Dockerfile__CommentsAssignment_1_0 ) ) ;
    public final void rule__Dockerfile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( ( ( rule__Dockerfile__CommentsAssignment_1_0 ) ) )
            // InternalMyDsl.g:1006:1: ( ( rule__Dockerfile__CommentsAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1006:1: ( ( rule__Dockerfile__CommentsAssignment_1_0 ) )
            // InternalMyDsl.g:1007:2: ( rule__Dockerfile__CommentsAssignment_1_0 )
            {
             before(grammarAccess.getDockerfileAccess().getCommentsAssignment_1_0()); 
            // InternalMyDsl.g:1008:2: ( rule__Dockerfile__CommentsAssignment_1_0 )
            // InternalMyDsl.g:1008:3: rule__Dockerfile__CommentsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Dockerfile__CommentsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDockerfileAccess().getCommentsAssignment_1_0()); 

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
    // $ANTLR end "rule__Dockerfile__Group_1__0__Impl"


    // $ANTLR start "rule__Dockerfile__Group_1__1"
    // InternalMyDsl.g:1016:1: rule__Dockerfile__Group_1__1 : rule__Dockerfile__Group_1__1__Impl ;
    public final void rule__Dockerfile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( rule__Dockerfile__Group_1__1__Impl )
            // InternalMyDsl.g:1021:2: rule__Dockerfile__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dockerfile__Group_1__1__Impl();

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
    // $ANTLR end "rule__Dockerfile__Group_1__1"


    // $ANTLR start "rule__Dockerfile__Group_1__1__Impl"
    // InternalMyDsl.g:1027:1: rule__Dockerfile__Group_1__1__Impl : ( RULE_NL ) ;
    public final void rule__Dockerfile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( ( RULE_NL ) )
            // InternalMyDsl.g:1032:1: ( RULE_NL )
            {
            // InternalMyDsl.g:1032:1: ( RULE_NL )
            // InternalMyDsl.g:1033:2: RULE_NL
            {
             before(grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_1_1()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Dockerfile__Group_1__1__Impl"


    // $ANTLR start "rule__From__Group__0"
    // InternalMyDsl.g:1043:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1047:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalMyDsl.g:1048:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1055:1: rule__From__Group__0__Impl : ( ( rule__From__KeyAssignment_0 ) ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1059:1: ( ( ( rule__From__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1060:1: ( ( rule__From__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1060:1: ( ( rule__From__KeyAssignment_0 ) )
            // InternalMyDsl.g:1061:2: ( rule__From__KeyAssignment_0 )
            {
             before(grammarAccess.getFromAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1062:2: ( rule__From__KeyAssignment_0 )
            // InternalMyDsl.g:1062:3: rule__From__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__From__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1070:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalMyDsl.g:1075:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:1082:1: rule__From__Group__1__Impl : ( ( rule__From__Platform_optionAssignment_1 )? ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( ( ( rule__From__Platform_optionAssignment_1 )? ) )
            // InternalMyDsl.g:1087:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            {
            // InternalMyDsl.g:1087:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            // InternalMyDsl.g:1088:2: ( rule__From__Platform_optionAssignment_1 )?
            {
             before(grammarAccess.getFromAccess().getPlatform_optionAssignment_1()); 
            // InternalMyDsl.g:1089:2: ( rule__From__Platform_optionAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_PLATFORM_OPTION) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1089:3: rule__From__Platform_optionAssignment_1
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
    // InternalMyDsl.g:1097:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalMyDsl.g:1102:2: rule__From__Group__2__Impl rule__From__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1109:1: rule__From__Group__2__Impl : ( ( rule__From__NameAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1113:1: ( ( ( rule__From__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1114:1: ( ( rule__From__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1114:1: ( ( rule__From__NameAssignment_2 ) )
            // InternalMyDsl.g:1115:2: ( rule__From__NameAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1116:2: ( rule__From__NameAssignment_2 )
            // InternalMyDsl.g:1116:3: rule__From__NameAssignment_2
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
    // InternalMyDsl.g:1124:1: rule__From__Group__3 : rule__From__Group__3__Impl ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( rule__From__Group__3__Impl )
            // InternalMyDsl.g:1129:2: rule__From__Group__3__Impl
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
    // InternalMyDsl.g:1135:1: rule__From__Group__3__Impl : ( ( rule__From__Tag_or_digestAssignment_3 )? ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( ( ( rule__From__Tag_or_digestAssignment_3 )? ) )
            // InternalMyDsl.g:1140:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            {
            // InternalMyDsl.g:1140:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            // InternalMyDsl.g:1141:2: ( rule__From__Tag_or_digestAssignment_3 )?
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAssignment_3()); 
            // InternalMyDsl.g:1142:2: ( rule__From__Tag_or_digestAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=19 && LA17_0<=20)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1142:3: rule__From__Tag_or_digestAssignment_3
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
    // InternalMyDsl.g:1151:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // InternalMyDsl.g:1156:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1163:1: rule__Cmd__Group__0__Impl : ( ( rule__Cmd__KeyAssignment_0 ) ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1167:1: ( ( ( rule__Cmd__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1168:1: ( ( rule__Cmd__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1168:1: ( ( rule__Cmd__KeyAssignment_0 ) )
            // InternalMyDsl.g:1169:2: ( rule__Cmd__KeyAssignment_0 )
            {
             before(grammarAccess.getCmdAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1170:2: ( rule__Cmd__KeyAssignment_0 )
            // InternalMyDsl.g:1170:3: rule__Cmd__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1178:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( rule__Cmd__Group__1__Impl )
            // InternalMyDsl.g:1183:2: rule__Cmd__Group__1__Impl
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
    // InternalMyDsl.g:1189:1: rule__Cmd__Group__1__Impl : ( ( rule__Cmd__Alternatives_1 ) ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( ( ( rule__Cmd__Alternatives_1 ) ) )
            // InternalMyDsl.g:1194:1: ( ( rule__Cmd__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1194:1: ( ( rule__Cmd__Alternatives_1 ) )
            // InternalMyDsl.g:1195:2: ( rule__Cmd__Alternatives_1 )
            {
             before(grammarAccess.getCmdAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1196:2: ( rule__Cmd__Alternatives_1 )
            // InternalMyDsl.g:1196:3: rule__Cmd__Alternatives_1
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


    // $ANTLR start "rule__Run__Group__0"
    // InternalMyDsl.g:1205:1: rule__Run__Group__0 : rule__Run__Group__0__Impl rule__Run__Group__1 ;
    public final void rule__Run__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( rule__Run__Group__0__Impl rule__Run__Group__1 )
            // InternalMyDsl.g:1210:2: rule__Run__Group__0__Impl rule__Run__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1217:1: rule__Run__Group__0__Impl : ( ( rule__Run__KeyAssignment_0 ) ) ;
    public final void rule__Run__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( ( ( rule__Run__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1222:1: ( ( rule__Run__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1222:1: ( ( rule__Run__KeyAssignment_0 ) )
            // InternalMyDsl.g:1223:2: ( rule__Run__KeyAssignment_0 )
            {
             before(grammarAccess.getRunAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1224:2: ( rule__Run__KeyAssignment_0 )
            // InternalMyDsl.g:1224:3: rule__Run__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Run__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRunAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1232:1: rule__Run__Group__1 : rule__Run__Group__1__Impl ;
    public final void rule__Run__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( rule__Run__Group__1__Impl )
            // InternalMyDsl.g:1237:2: rule__Run__Group__1__Impl
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
    // InternalMyDsl.g:1243:1: rule__Run__Group__1__Impl : ( ( rule__Run__Alternatives_1 ) ) ;
    public final void rule__Run__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( ( ( rule__Run__Alternatives_1 ) ) )
            // InternalMyDsl.g:1248:1: ( ( rule__Run__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1248:1: ( ( rule__Run__Alternatives_1 ) )
            // InternalMyDsl.g:1249:2: ( rule__Run__Alternatives_1 )
            {
             before(grammarAccess.getRunAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1250:2: ( rule__Run__Alternatives_1 )
            // InternalMyDsl.g:1250:3: rule__Run__Alternatives_1
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


    // $ANTLR start "rule__Entrypoint__Group__0"
    // InternalMyDsl.g:1259:1: rule__Entrypoint__Group__0 : rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 ;
    public final void rule__Entrypoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1263:1: ( rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 )
            // InternalMyDsl.g:1264:2: rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1271:1: rule__Entrypoint__Group__0__Impl : ( ( rule__Entrypoint__KeyAssignment_0 ) ) ;
    public final void rule__Entrypoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1275:1: ( ( ( rule__Entrypoint__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1276:1: ( ( rule__Entrypoint__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1276:1: ( ( rule__Entrypoint__KeyAssignment_0 ) )
            // InternalMyDsl.g:1277:2: ( rule__Entrypoint__KeyAssignment_0 )
            {
             before(grammarAccess.getEntrypointAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1278:2: ( rule__Entrypoint__KeyAssignment_0 )
            // InternalMyDsl.g:1278:3: rule__Entrypoint__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1286:1: rule__Entrypoint__Group__1 : rule__Entrypoint__Group__1__Impl ;
    public final void rule__Entrypoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( rule__Entrypoint__Group__1__Impl )
            // InternalMyDsl.g:1291:2: rule__Entrypoint__Group__1__Impl
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
    // InternalMyDsl.g:1297:1: rule__Entrypoint__Group__1__Impl : ( ( rule__Entrypoint__Alternatives_1 ) ) ;
    public final void rule__Entrypoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( ( ( rule__Entrypoint__Alternatives_1 ) ) )
            // InternalMyDsl.g:1302:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1302:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            // InternalMyDsl.g:1303:2: ( rule__Entrypoint__Alternatives_1 )
            {
             before(grammarAccess.getEntrypointAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1304:2: ( rule__Entrypoint__Alternatives_1 )
            // InternalMyDsl.g:1304:3: rule__Entrypoint__Alternatives_1
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


    // $ANTLR start "rule__Volume__Group__0"
    // InternalMyDsl.g:1313:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1317:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalMyDsl.g:1318:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1325:1: rule__Volume__Group__0__Impl : ( ( rule__Volume__KeyAssignment_0 ) ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( ( ( rule__Volume__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1330:1: ( ( rule__Volume__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1330:1: ( ( rule__Volume__KeyAssignment_0 ) )
            // InternalMyDsl.g:1331:2: ( rule__Volume__KeyAssignment_0 )
            {
             before(grammarAccess.getVolumeAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1332:2: ( rule__Volume__KeyAssignment_0 )
            // InternalMyDsl.g:1332:3: rule__Volume__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1340:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( rule__Volume__Group__1__Impl )
            // InternalMyDsl.g:1345:2: rule__Volume__Group__1__Impl
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
    // InternalMyDsl.g:1351:1: rule__Volume__Group__1__Impl : ( ( rule__Volume__Alternatives_1 ) ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( ( ( rule__Volume__Alternatives_1 ) ) )
            // InternalMyDsl.g:1356:1: ( ( rule__Volume__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1356:1: ( ( rule__Volume__Alternatives_1 ) )
            // InternalMyDsl.g:1357:2: ( rule__Volume__Alternatives_1 )
            {
             before(grammarAccess.getVolumeAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1358:2: ( rule__Volume__Alternatives_1 )
            // InternalMyDsl.g:1358:3: rule__Volume__Alternatives_1
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


    // $ANTLR start "rule__Maintainer__Group__0"
    // InternalMyDsl.g:1367:1: rule__Maintainer__Group__0 : rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 ;
    public final void rule__Maintainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 )
            // InternalMyDsl.g:1372:2: rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1379:1: rule__Maintainer__Group__0__Impl : ( ( rule__Maintainer__KeyAssignment_0 ) ) ;
    public final void rule__Maintainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( ( ( rule__Maintainer__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1384:1: ( ( rule__Maintainer__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1384:1: ( ( rule__Maintainer__KeyAssignment_0 ) )
            // InternalMyDsl.g:1385:2: ( rule__Maintainer__KeyAssignment_0 )
            {
             before(grammarAccess.getMaintainerAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1386:2: ( rule__Maintainer__KeyAssignment_0 )
            // InternalMyDsl.g:1386:3: rule__Maintainer__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1394:1: rule__Maintainer__Group__1 : rule__Maintainer__Group__1__Impl ;
    public final void rule__Maintainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( rule__Maintainer__Group__1__Impl )
            // InternalMyDsl.g:1399:2: rule__Maintainer__Group__1__Impl
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
    // InternalMyDsl.g:1405:1: rule__Maintainer__Group__1__Impl : ( ( rule__Maintainer__NameAssignment_1 ) ) ;
    public final void rule__Maintainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( ( rule__Maintainer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1410:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1410:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            // InternalMyDsl.g:1411:2: ( rule__Maintainer__NameAssignment_1 )
            {
             before(grammarAccess.getMaintainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1412:2: ( rule__Maintainer__NameAssignment_1 )
            // InternalMyDsl.g:1412:3: rule__Maintainer__NameAssignment_1
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
    // InternalMyDsl.g:1421:1: rule__Expose__Group__0 : rule__Expose__Group__0__Impl rule__Expose__Group__1 ;
    public final void rule__Expose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( rule__Expose__Group__0__Impl rule__Expose__Group__1 )
            // InternalMyDsl.g:1426:2: rule__Expose__Group__0__Impl rule__Expose__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1433:1: rule__Expose__Group__0__Impl : ( ( rule__Expose__KeyAssignment_0 ) ) ;
    public final void rule__Expose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1437:1: ( ( ( rule__Expose__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1438:1: ( ( rule__Expose__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1438:1: ( ( rule__Expose__KeyAssignment_0 ) )
            // InternalMyDsl.g:1439:2: ( rule__Expose__KeyAssignment_0 )
            {
             before(grammarAccess.getExposeAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1440:2: ( rule__Expose__KeyAssignment_0 )
            // InternalMyDsl.g:1440:3: rule__Expose__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expose__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1448:1: rule__Expose__Group__1 : rule__Expose__Group__1__Impl ;
    public final void rule__Expose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( rule__Expose__Group__1__Impl )
            // InternalMyDsl.g:1453:2: rule__Expose__Group__1__Impl
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
    // InternalMyDsl.g:1459:1: rule__Expose__Group__1__Impl : ( ( rule__Expose__PortsAssignment_1 ) ) ;
    public final void rule__Expose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( ( rule__Expose__PortsAssignment_1 ) ) )
            // InternalMyDsl.g:1464:1: ( ( rule__Expose__PortsAssignment_1 ) )
            {
            // InternalMyDsl.g:1464:1: ( ( rule__Expose__PortsAssignment_1 ) )
            // InternalMyDsl.g:1465:2: ( rule__Expose__PortsAssignment_1 )
            {
             before(grammarAccess.getExposeAccess().getPortsAssignment_1()); 
            // InternalMyDsl.g:1466:2: ( rule__Expose__PortsAssignment_1 )
            // InternalMyDsl.g:1466:3: rule__Expose__PortsAssignment_1
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
    // InternalMyDsl.g:1475:1: rule__Workdir__Group__0 : rule__Workdir__Group__0__Impl rule__Workdir__Group__1 ;
    public final void rule__Workdir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( rule__Workdir__Group__0__Impl rule__Workdir__Group__1 )
            // InternalMyDsl.g:1480:2: rule__Workdir__Group__0__Impl rule__Workdir__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1487:1: rule__Workdir__Group__0__Impl : ( ( rule__Workdir__KeyAssignment_0 ) ) ;
    public final void rule__Workdir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1491:1: ( ( ( rule__Workdir__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1492:1: ( ( rule__Workdir__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1492:1: ( ( rule__Workdir__KeyAssignment_0 ) )
            // InternalMyDsl.g:1493:2: ( rule__Workdir__KeyAssignment_0 )
            {
             before(grammarAccess.getWorkdirAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1494:2: ( rule__Workdir__KeyAssignment_0 )
            // InternalMyDsl.g:1494:3: rule__Workdir__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1502:1: rule__Workdir__Group__1 : rule__Workdir__Group__1__Impl ;
    public final void rule__Workdir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( rule__Workdir__Group__1__Impl )
            // InternalMyDsl.g:1507:2: rule__Workdir__Group__1__Impl
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
    // InternalMyDsl.g:1513:1: rule__Workdir__Group__1__Impl : ( ( rule__Workdir__PathAssignment_1 ) ) ;
    public final void rule__Workdir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( ( ( rule__Workdir__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1518:1: ( ( rule__Workdir__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1518:1: ( ( rule__Workdir__PathAssignment_1 ) )
            // InternalMyDsl.g:1519:2: ( rule__Workdir__PathAssignment_1 )
            {
             before(grammarAccess.getWorkdirAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1520:2: ( rule__Workdir__PathAssignment_1 )
            // InternalMyDsl.g:1520:3: rule__Workdir__PathAssignment_1
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
    // InternalMyDsl.g:1529:1: rule__Env__Group__0 : rule__Env__Group__0__Impl rule__Env__Group__1 ;
    public final void rule__Env__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( rule__Env__Group__0__Impl rule__Env__Group__1 )
            // InternalMyDsl.g:1534:2: rule__Env__Group__0__Impl rule__Env__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1541:1: rule__Env__Group__0__Impl : ( ( rule__Env__KeyAssignment_0 ) ) ;
    public final void rule__Env__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( ( ( rule__Env__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1546:1: ( ( rule__Env__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1546:1: ( ( rule__Env__KeyAssignment_0 ) )
            // InternalMyDsl.g:1547:2: ( rule__Env__KeyAssignment_0 )
            {
             before(grammarAccess.getEnvAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1548:2: ( rule__Env__KeyAssignment_0 )
            // InternalMyDsl.g:1548:3: rule__Env__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Env__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1556:1: rule__Env__Group__1 : rule__Env__Group__1__Impl ;
    public final void rule__Env__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( rule__Env__Group__1__Impl )
            // InternalMyDsl.g:1561:2: rule__Env__Group__1__Impl
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
    // InternalMyDsl.g:1567:1: rule__Env__Group__1__Impl : ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Env__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1572:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1572:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1573:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1573:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1574:3: ( rule__Env__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1575:3: ( rule__Env__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1575:4: rule__Env__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__Env__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1578:2: ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1579:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1580:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_KV_PAIR_EQUALS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1580:4: rule__Env__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1590:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:1595:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1602:1: rule__Label__Group__0__Impl : ( ( rule__Label__KeyAssignment_0 ) ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( ( ( rule__Label__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1607:1: ( ( rule__Label__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1607:1: ( ( rule__Label__KeyAssignment_0 ) )
            // InternalMyDsl.g:1608:2: ( rule__Label__KeyAssignment_0 )
            {
             before(grammarAccess.getLabelAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1609:2: ( rule__Label__KeyAssignment_0 )
            // InternalMyDsl.g:1609:3: rule__Label__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Label__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1617:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( rule__Label__Group__1__Impl )
            // InternalMyDsl.g:1622:2: rule__Label__Group__1__Impl
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
    // InternalMyDsl.g:1628:1: rule__Label__Group__1__Impl : ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1632:1: ( ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1633:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1633:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1634:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1634:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1635:3: ( rule__Label__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1636:3: ( rule__Label__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1636:4: rule__Label__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__Label__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1639:2: ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1640:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1641:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_KV_PAIR_EQUALS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1641:4: rule__Label__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1651:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1655:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:1656:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1663:1: rule__Add__Group__0__Impl : ( ( rule__Add__KeyAssignment_0 ) ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( ( ( rule__Add__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1668:1: ( ( rule__Add__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1668:1: ( ( rule__Add__KeyAssignment_0 ) )
            // InternalMyDsl.g:1669:2: ( rule__Add__KeyAssignment_0 )
            {
             before(grammarAccess.getAddAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1670:2: ( rule__Add__KeyAssignment_0 )
            // InternalMyDsl.g:1670:3: rule__Add__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Add__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1678:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalMyDsl.g:1683:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1690:1: rule__Add__Group__1__Impl : ( ( rule__Add__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1694:1: ( ( ( rule__Add__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:1695:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:1695:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:1696:2: ( rule__Add__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getAddAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:1697:2: ( rule__Add__Chown_optionsAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_CHOWN_OPTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1697:3: rule__Add__Chown_optionsAssignment_1
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
    // InternalMyDsl.g:1705:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1709:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalMyDsl.g:1710:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1717:1: rule__Add__Group__2__Impl : ( ( rule__Add__FileAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1721:1: ( ( ( rule__Add__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1722:1: ( ( rule__Add__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1722:1: ( ( rule__Add__FileAssignment_2 ) )
            // InternalMyDsl.g:1723:2: ( rule__Add__FileAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1724:2: ( rule__Add__FileAssignment_2 )
            // InternalMyDsl.g:1724:3: rule__Add__FileAssignment_2
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
    // InternalMyDsl.g:1732:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalMyDsl.g:1737:2: rule__Add__Group__3__Impl rule__Add__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1744:1: rule__Add__Group__3__Impl : ( ( rule__Add__Alternatives_3 )? ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1748:1: ( ( ( rule__Add__Alternatives_3 )? ) )
            // InternalMyDsl.g:1749:1: ( ( rule__Add__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1749:1: ( ( rule__Add__Alternatives_3 )? )
            // InternalMyDsl.g:1750:2: ( rule__Add__Alternatives_3 )?
            {
             before(grammarAccess.getAddAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1751:2: ( rule__Add__Alternatives_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=14 && LA21_0<=15)||LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1751:3: rule__Add__Alternatives_3
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
    // InternalMyDsl.g:1759:1: rule__Add__Group__4 : rule__Add__Group__4__Impl ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( rule__Add__Group__4__Impl )
            // InternalMyDsl.g:1764:2: rule__Add__Group__4__Impl
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
    // InternalMyDsl.g:1770:1: rule__Add__Group__4__Impl : ( ( rule__Add__DirectoryAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1774:1: ( ( ( rule__Add__DirectoryAssignment_4 ) ) )
            // InternalMyDsl.g:1775:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            {
            // InternalMyDsl.g:1775:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            // InternalMyDsl.g:1776:2: ( rule__Add__DirectoryAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getDirectoryAssignment_4()); 
            // InternalMyDsl.g:1777:2: ( rule__Add__DirectoryAssignment_4 )
            // InternalMyDsl.g:1777:3: rule__Add__DirectoryAssignment_4
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
    // InternalMyDsl.g:1786:1: rule__Add__Group_3_1__0 : rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 ;
    public final void rule__Add__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 )
            // InternalMyDsl.g:1791:2: rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1798:1: rule__Add__Group_3_1__0__Impl : ( '.' ) ;
    public final void rule__Add__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1802:1: ( ( '.' ) )
            // InternalMyDsl.g:1803:1: ( '.' )
            {
            // InternalMyDsl.g:1803:1: ( '.' )
            // InternalMyDsl.g:1804:2: '.'
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
    // InternalMyDsl.g:1813:1: rule__Add__Group_3_1__1 : rule__Add__Group_3_1__1__Impl ;
    public final void rule__Add__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( rule__Add__Group_3_1__1__Impl )
            // InternalMyDsl.g:1818:2: rule__Add__Group_3_1__1__Impl
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
    // InternalMyDsl.g:1824:1: rule__Add__Group_3_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Add__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1828:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1829:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1829:1: ( RULE_ID )
            // InternalMyDsl.g:1830:2: RULE_ID
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
    // InternalMyDsl.g:1840:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1844:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalMyDsl.g:1845:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1852:1: rule__Copy__Group__0__Impl : ( ( rule__Copy__KeyAssignment_0 ) ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1856:1: ( ( ( rule__Copy__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1857:1: ( ( rule__Copy__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1857:1: ( ( rule__Copy__KeyAssignment_0 ) )
            // InternalMyDsl.g:1858:2: ( rule__Copy__KeyAssignment_0 )
            {
             before(grammarAccess.getCopyAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1859:2: ( rule__Copy__KeyAssignment_0 )
            // InternalMyDsl.g:1859:3: rule__Copy__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getKeyAssignment_0()); 

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
    // InternalMyDsl.g:1867:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalMyDsl.g:1872:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1879:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( ( ( rule__Copy__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:1884:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:1884:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:1885:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getCopyAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:1886:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_CHOWN_OPTION) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1886:3: rule__Copy__Chown_optionsAssignment_1
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
    // InternalMyDsl.g:1894:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalMyDsl.g:1899:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1906:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__FileAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1910:1: ( ( ( rule__Copy__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1911:1: ( ( rule__Copy__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1911:1: ( ( rule__Copy__FileAssignment_2 ) )
            // InternalMyDsl.g:1912:2: ( rule__Copy__FileAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1913:2: ( rule__Copy__FileAssignment_2 )
            // InternalMyDsl.g:1913:3: rule__Copy__FileAssignment_2
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
    // InternalMyDsl.g:1921:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalMyDsl.g:1926:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1933:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__Alternatives_3 )? ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1937:1: ( ( ( rule__Copy__Alternatives_3 )? ) )
            // InternalMyDsl.g:1938:1: ( ( rule__Copy__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1938:1: ( ( rule__Copy__Alternatives_3 )? )
            // InternalMyDsl.g:1939:2: ( rule__Copy__Alternatives_3 )?
            {
             before(grammarAccess.getCopyAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1940:2: ( rule__Copy__Alternatives_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=14 && LA23_0<=15)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1940:3: rule__Copy__Alternatives_3
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
    // InternalMyDsl.g:1948:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1952:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalMyDsl.g:1953:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1960:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__Group_4__0 )? ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1964:1: ( ( ( rule__Copy__Group_4__0 )? ) )
            // InternalMyDsl.g:1965:1: ( ( rule__Copy__Group_4__0 )? )
            {
            // InternalMyDsl.g:1965:1: ( ( rule__Copy__Group_4__0 )? )
            // InternalMyDsl.g:1966:2: ( rule__Copy__Group_4__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_4()); 
            // InternalMyDsl.g:1967:2: ( rule__Copy__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1967:3: rule__Copy__Group_4__0
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
    // InternalMyDsl.g:1975:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( rule__Copy__Group__5__Impl )
            // InternalMyDsl.g:1980:2: rule__Copy__Group__5__Impl
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
    // InternalMyDsl.g:1986:1: rule__Copy__Group__5__Impl : ( ( rule__Copy__DirectoryAssignment_5 ) ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( ( ( rule__Copy__DirectoryAssignment_5 ) ) )
            // InternalMyDsl.g:1991:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            {
            // InternalMyDsl.g:1991:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            // InternalMyDsl.g:1992:2: ( rule__Copy__DirectoryAssignment_5 )
            {
             before(grammarAccess.getCopyAccess().getDirectoryAssignment_5()); 
            // InternalMyDsl.g:1993:2: ( rule__Copy__DirectoryAssignment_5 )
            // InternalMyDsl.g:1993:3: rule__Copy__DirectoryAssignment_5
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
    // InternalMyDsl.g:2002:1: rule__Copy__Group_4__0 : rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 ;
    public final void rule__Copy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 )
            // InternalMyDsl.g:2007:2: rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2014:1: rule__Copy__Group_4__0__Impl : ( '.' ) ;
    public final void rule__Copy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2018:1: ( ( '.' ) )
            // InternalMyDsl.g:2019:1: ( '.' )
            {
            // InternalMyDsl.g:2019:1: ( '.' )
            // InternalMyDsl.g:2020:2: '.'
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
    // InternalMyDsl.g:2029:1: rule__Copy__Group_4__1 : rule__Copy__Group_4__1__Impl ;
    public final void rule__Copy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( rule__Copy__Group_4__1__Impl )
            // InternalMyDsl.g:2034:2: rule__Copy__Group_4__1__Impl
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
    // InternalMyDsl.g:2040:1: rule__Copy__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__Copy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2044:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2045:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2045:1: ( RULE_ID )
            // InternalMyDsl.g:2046:2: RULE_ID
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


    // $ANTLR start "rule__Onbuild__Group__0"
    // InternalMyDsl.g:2056:1: rule__Onbuild__Group__0 : rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1 ;
    public final void rule__Onbuild__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1 )
            // InternalMyDsl.g:2061:2: rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Onbuild__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__1();

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
    // $ANTLR end "rule__Onbuild__Group__0"


    // $ANTLR start "rule__Onbuild__Group__0__Impl"
    // InternalMyDsl.g:2068:1: rule__Onbuild__Group__0__Impl : ( ( rule__Onbuild__KeyAssignment_0 ) ) ;
    public final void rule__Onbuild__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2072:1: ( ( ( rule__Onbuild__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:2073:1: ( ( rule__Onbuild__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:2073:1: ( ( rule__Onbuild__KeyAssignment_0 ) )
            // InternalMyDsl.g:2074:2: ( rule__Onbuild__KeyAssignment_0 )
            {
             before(grammarAccess.getOnbuildAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:2075:2: ( rule__Onbuild__KeyAssignment_0 )
            // InternalMyDsl.g:2075:3: rule__Onbuild__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getKeyAssignment_0()); 

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
    // $ANTLR end "rule__Onbuild__Group__0__Impl"


    // $ANTLR start "rule__Onbuild__Group__1"
    // InternalMyDsl.g:2083:1: rule__Onbuild__Group__1 : rule__Onbuild__Group__1__Impl ;
    public final void rule__Onbuild__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( rule__Onbuild__Group__1__Impl )
            // InternalMyDsl.g:2088:2: rule__Onbuild__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__1__Impl();

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
    // $ANTLR end "rule__Onbuild__Group__1"


    // $ANTLR start "rule__Onbuild__Group__1__Impl"
    // InternalMyDsl.g:2094:1: rule__Onbuild__Group__1__Impl : ( ( rule__Onbuild__StatementAssignment_1 ) ) ;
    public final void rule__Onbuild__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( ( ( rule__Onbuild__StatementAssignment_1 ) ) )
            // InternalMyDsl.g:2099:1: ( ( rule__Onbuild__StatementAssignment_1 ) )
            {
            // InternalMyDsl.g:2099:1: ( ( rule__Onbuild__StatementAssignment_1 ) )
            // InternalMyDsl.g:2100:2: ( rule__Onbuild__StatementAssignment_1 )
            {
             before(grammarAccess.getOnbuildAccess().getStatementAssignment_1()); 
            // InternalMyDsl.g:2101:2: ( rule__Onbuild__StatementAssignment_1 )
            // InternalMyDsl.g:2101:3: rule__Onbuild__StatementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__StatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getStatementAssignment_1()); 

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
    // $ANTLR end "rule__Onbuild__Group__1__Impl"


    // $ANTLR start "rule__IMAGE_NAME__Group__0"
    // InternalMyDsl.g:2110:1: rule__IMAGE_NAME__Group__0 : rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 ;
    public final void rule__IMAGE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 )
            // InternalMyDsl.g:2115:2: rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1
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
    // InternalMyDsl.g:2122:1: rule__IMAGE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2126:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2127:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2127:1: ( RULE_ID )
            // InternalMyDsl.g:2128:2: RULE_ID
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
    // InternalMyDsl.g:2137:1: rule__IMAGE_NAME__Group__1 : rule__IMAGE_NAME__Group__1__Impl ;
    public final void rule__IMAGE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( rule__IMAGE_NAME__Group__1__Impl )
            // InternalMyDsl.g:2142:2: rule__IMAGE_NAME__Group__1__Impl
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
    // InternalMyDsl.g:2148:1: rule__IMAGE_NAME__Group__1__Impl : ( ( rule__IMAGE_NAME__Group_1__0 )* ) ;
    public final void rule__IMAGE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2152:1: ( ( ( rule__IMAGE_NAME__Group_1__0 )* ) )
            // InternalMyDsl.g:2153:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            {
            // InternalMyDsl.g:2153:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            // InternalMyDsl.g:2154:2: ( rule__IMAGE_NAME__Group_1__0 )*
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup_1()); 
            // InternalMyDsl.g:2155:2: ( rule__IMAGE_NAME__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2155:3: rule__IMAGE_NAME__Group_1__0
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
    // InternalMyDsl.g:2164:1: rule__IMAGE_NAME__Group_1__0 : rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 ;
    public final void rule__IMAGE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 )
            // InternalMyDsl.g:2169:2: rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2176:1: rule__IMAGE_NAME__Group_1__0__Impl : ( '/' ) ;
    public final void rule__IMAGE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2180:1: ( ( '/' ) )
            // InternalMyDsl.g:2181:1: ( '/' )
            {
            // InternalMyDsl.g:2181:1: ( '/' )
            // InternalMyDsl.g:2182:2: '/'
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2191:1: rule__IMAGE_NAME__Group_1__1 : rule__IMAGE_NAME__Group_1__1__Impl ;
    public final void rule__IMAGE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( rule__IMAGE_NAME__Group_1__1__Impl )
            // InternalMyDsl.g:2196:2: rule__IMAGE_NAME__Group_1__1__Impl
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
    // InternalMyDsl.g:2202:1: rule__IMAGE_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2206:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2207:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2207:1: ( RULE_ID )
            // InternalMyDsl.g:2208:2: RULE_ID
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
    // InternalMyDsl.g:2218:1: rule__IMAGE_TAG__Group__0 : rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 ;
    public final void rule__IMAGE_TAG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2222:1: ( rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 )
            // InternalMyDsl.g:2223:2: rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1
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
    // InternalMyDsl.g:2230:1: rule__IMAGE_TAG__Group__0__Impl : ( ':' ) ;
    public final void rule__IMAGE_TAG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2234:1: ( ( ':' ) )
            // InternalMyDsl.g:2235:1: ( ':' )
            {
            // InternalMyDsl.g:2235:1: ( ':' )
            // InternalMyDsl.g:2236:2: ':'
            {
             before(grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2245:1: rule__IMAGE_TAG__Group__1 : rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 ;
    public final void rule__IMAGE_TAG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 )
            // InternalMyDsl.g:2250:2: rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2
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
    // InternalMyDsl.g:2257:1: rule__IMAGE_TAG__Group__1__Impl : ( ( rule__IMAGE_TAG__Alternatives_1 ) ) ;
    public final void rule__IMAGE_TAG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2261:1: ( ( ( rule__IMAGE_TAG__Alternatives_1 ) ) )
            // InternalMyDsl.g:2262:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2262:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            // InternalMyDsl.g:2263:2: ( rule__IMAGE_TAG__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2264:2: ( rule__IMAGE_TAG__Alternatives_1 )
            // InternalMyDsl.g:2264:3: rule__IMAGE_TAG__Alternatives_1
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
    // InternalMyDsl.g:2272:1: rule__IMAGE_TAG__Group__2 : rule__IMAGE_TAG__Group__2__Impl ;
    public final void rule__IMAGE_TAG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2276:1: ( rule__IMAGE_TAG__Group__2__Impl )
            // InternalMyDsl.g:2277:2: rule__IMAGE_TAG__Group__2__Impl
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
    // InternalMyDsl.g:2283:1: rule__IMAGE_TAG__Group__2__Impl : ( ( rule__IMAGE_TAG__Alternatives_2 )* ) ;
    public final void rule__IMAGE_TAG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( ( ( rule__IMAGE_TAG__Alternatives_2 )* ) )
            // InternalMyDsl.g:2288:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2288:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            // InternalMyDsl.g:2289:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2290:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||(LA26_0>=16 && LA26_0<=17)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:2290:3: rule__IMAGE_TAG__Alternatives_2
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
    // InternalMyDsl.g:2299:1: rule__IMAGE_DIGEST__Group__0 : rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 ;
    public final void rule__IMAGE_DIGEST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 )
            // InternalMyDsl.g:2304:2: rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1
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
    // InternalMyDsl.g:2311:1: rule__IMAGE_DIGEST__Group__0__Impl : ( '@' ) ;
    public final void rule__IMAGE_DIGEST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2315:1: ( ( '@' ) )
            // InternalMyDsl.g:2316:1: ( '@' )
            {
            // InternalMyDsl.g:2316:1: ( '@' )
            // InternalMyDsl.g:2317:2: '@'
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:2326:1: rule__IMAGE_DIGEST__Group__1 : rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 ;
    public final void rule__IMAGE_DIGEST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 )
            // InternalMyDsl.g:2331:2: rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2
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
    // InternalMyDsl.g:2338:1: rule__IMAGE_DIGEST__Group__1__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) ;
    public final void rule__IMAGE_DIGEST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2342:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) )
            // InternalMyDsl.g:2343:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2343:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            // InternalMyDsl.g:2344:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2345:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            // InternalMyDsl.g:2345:3: rule__IMAGE_DIGEST__Alternatives_1
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
    // InternalMyDsl.g:2353:1: rule__IMAGE_DIGEST__Group__2 : rule__IMAGE_DIGEST__Group__2__Impl ;
    public final void rule__IMAGE_DIGEST__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2357:1: ( rule__IMAGE_DIGEST__Group__2__Impl )
            // InternalMyDsl.g:2358:2: rule__IMAGE_DIGEST__Group__2__Impl
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
    // InternalMyDsl.g:2364:1: rule__IMAGE_DIGEST__Group__2__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) ;
    public final void rule__IMAGE_DIGEST__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2368:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) )
            // InternalMyDsl.g:2369:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2369:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            // InternalMyDsl.g:2370:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2371:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_STRING)||(LA27_0>=16 && LA27_0<=17)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2371:3: rule__IMAGE_DIGEST__Alternatives_2
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
    // InternalMyDsl.g:2380:1: rule__EXEC_FORM__Group__0 : rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 ;
    public final void rule__EXEC_FORM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 )
            // InternalMyDsl.g:2385:2: rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1
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
    // InternalMyDsl.g:2392:1: rule__EXEC_FORM__Group__0__Impl : ( ' [' ) ;
    public final void rule__EXEC_FORM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2396:1: ( ( ' [' ) )
            // InternalMyDsl.g:2397:1: ( ' [' )
            {
            // InternalMyDsl.g:2397:1: ( ' [' )
            // InternalMyDsl.g:2398:2: ' ['
            {
             before(grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:2407:1: rule__EXEC_FORM__Group__1 : rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 ;
    public final void rule__EXEC_FORM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 )
            // InternalMyDsl.g:2412:2: rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2
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
    // InternalMyDsl.g:2419:1: rule__EXEC_FORM__Group__1__Impl : ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) ;
    public final void rule__EXEC_FORM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2423:1: ( ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) )
            // InternalMyDsl.g:2424:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            {
            // InternalMyDsl.g:2424:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            // InternalMyDsl.g:2425:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getExecutableAssignment_1()); 
            // InternalMyDsl.g:2426:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            // InternalMyDsl.g:2426:3: rule__EXEC_FORM__ExecutableAssignment_1
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
    // InternalMyDsl.g:2434:1: rule__EXEC_FORM__Group__2 : rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 ;
    public final void rule__EXEC_FORM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 )
            // InternalMyDsl.g:2439:2: rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3
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
    // InternalMyDsl.g:2446:1: rule__EXEC_FORM__Group__2__Impl : ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) ;
    public final void rule__EXEC_FORM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2450:1: ( ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) )
            // InternalMyDsl.g:2451:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            {
            // InternalMyDsl.g:2451:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            // InternalMyDsl.g:2452:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            {
             before(grammarAccess.getEXEC_FORMAccess().getParametersAssignment_2()); 
            // InternalMyDsl.g:2453:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2453:3: rule__EXEC_FORM__ParametersAssignment_2
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
    // InternalMyDsl.g:2461:1: rule__EXEC_FORM__Group__3 : rule__EXEC_FORM__Group__3__Impl ;
    public final void rule__EXEC_FORM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( rule__EXEC_FORM__Group__3__Impl )
            // InternalMyDsl.g:2466:2: rule__EXEC_FORM__Group__3__Impl
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
    // InternalMyDsl.g:2472:1: rule__EXEC_FORM__Group__3__Impl : ( ']' ) ;
    public final void rule__EXEC_FORM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( ( ']' ) )
            // InternalMyDsl.g:2477:1: ( ']' )
            {
            // InternalMyDsl.g:2477:1: ( ']' )
            // InternalMyDsl.g:2478:2: ']'
            {
             before(grammarAccess.getEXEC_FORMAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Dockerfile__StatementsAssignment_0_0"
    // InternalMyDsl.g:2488:1: rule__Dockerfile__StatementsAssignment_0_0 : ( ruleInstruction ) ;
    public final void rule__Dockerfile__StatementsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2492:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2493:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2493:2: ( ruleInstruction )
            // InternalMyDsl.g:2494:3: ruleInstruction
            {
             before(grammarAccess.getDockerfileAccess().getStatementsInstructionParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getDockerfileAccess().getStatementsInstructionParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Dockerfile__StatementsAssignment_0_0"


    // $ANTLR start "rule__Dockerfile__CommentsAssignment_1_0"
    // InternalMyDsl.g:2503:1: rule__Dockerfile__CommentsAssignment_1_0 : ( RULE_COMMENT ) ;
    public final void rule__Dockerfile__CommentsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( ( RULE_COMMENT ) )
            // InternalMyDsl.g:2508:2: ( RULE_COMMENT )
            {
            // InternalMyDsl.g:2508:2: ( RULE_COMMENT )
            // InternalMyDsl.g:2509:3: RULE_COMMENT
            {
             before(grammarAccess.getDockerfileAccess().getCommentsCOMMENTTerminalRuleCall_1_0_0()); 
            match(input,RULE_COMMENT,FOLLOW_2); 
             after(grammarAccess.getDockerfileAccess().getCommentsCOMMENTTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Dockerfile__CommentsAssignment_1_0"


    // $ANTLR start "rule__Instruction__StatementAssignment"
    // InternalMyDsl.g:2518:1: rule__Instruction__StatementAssignment : ( ( rule__Instruction__StatementAlternatives_0 ) ) ;
    public final void rule__Instruction__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( ( ( rule__Instruction__StatementAlternatives_0 ) ) )
            // InternalMyDsl.g:2523:2: ( ( rule__Instruction__StatementAlternatives_0 ) )
            {
            // InternalMyDsl.g:2523:2: ( ( rule__Instruction__StatementAlternatives_0 ) )
            // InternalMyDsl.g:2524:3: ( rule__Instruction__StatementAlternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getStatementAlternatives_0()); 
            // InternalMyDsl.g:2525:3: ( rule__Instruction__StatementAlternatives_0 )
            // InternalMyDsl.g:2525:4: rule__Instruction__StatementAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__StatementAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getStatementAlternatives_0()); 

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
    // $ANTLR end "rule__Instruction__StatementAssignment"


    // $ANTLR start "rule__From__KeyAssignment_0"
    // InternalMyDsl.g:2533:1: rule__From__KeyAssignment_0 : ( ( 'FROM ' ) ) ;
    public final void rule__From__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2537:1: ( ( ( 'FROM ' ) ) )
            // InternalMyDsl.g:2538:2: ( ( 'FROM ' ) )
            {
            // InternalMyDsl.g:2538:2: ( ( 'FROM ' ) )
            // InternalMyDsl.g:2539:3: ( 'FROM ' )
            {
             before(grammarAccess.getFromAccess().getKeyFROMKeyword_0_0()); 
            // InternalMyDsl.g:2540:3: ( 'FROM ' )
            // InternalMyDsl.g:2541:4: 'FROM '
            {
             before(grammarAccess.getFromAccess().getKeyFROMKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getKeyFROMKeyword_0_0()); 

            }

             after(grammarAccess.getFromAccess().getKeyFROMKeyword_0_0()); 

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
    // $ANTLR end "rule__From__KeyAssignment_0"


    // $ANTLR start "rule__From__Platform_optionAssignment_1"
    // InternalMyDsl.g:2552:1: rule__From__Platform_optionAssignment_1 : ( RULE_PLATFORM_OPTION ) ;
    public final void rule__From__Platform_optionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2556:1: ( ( RULE_PLATFORM_OPTION ) )
            // InternalMyDsl.g:2557:2: ( RULE_PLATFORM_OPTION )
            {
            // InternalMyDsl.g:2557:2: ( RULE_PLATFORM_OPTION )
            // InternalMyDsl.g:2558:3: RULE_PLATFORM_OPTION
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
    // InternalMyDsl.g:2567:1: rule__From__NameAssignment_2 : ( ruleIMAGE_NAME ) ;
    public final void rule__From__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2571:1: ( ( ruleIMAGE_NAME ) )
            // InternalMyDsl.g:2572:2: ( ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:2572:2: ( ruleIMAGE_NAME )
            // InternalMyDsl.g:2573:3: ruleIMAGE_NAME
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
    // InternalMyDsl.g:2582:1: rule__From__Tag_or_digestAssignment_3 : ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) ;
    public final void rule__From__Tag_or_digestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2586:1: ( ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) )
            // InternalMyDsl.g:2587:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            {
            // InternalMyDsl.g:2587:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            // InternalMyDsl.g:2588:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAlternatives_3_0()); 
            // InternalMyDsl.g:2589:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            // InternalMyDsl.g:2589:4: rule__From__Tag_or_digestAlternatives_3_0
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


    // $ANTLR start "rule__Cmd__KeyAssignment_0"
    // InternalMyDsl.g:2597:1: rule__Cmd__KeyAssignment_0 : ( ( 'CMD' ) ) ;
    public final void rule__Cmd__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( ( ( 'CMD' ) ) )
            // InternalMyDsl.g:2602:2: ( ( 'CMD' ) )
            {
            // InternalMyDsl.g:2602:2: ( ( 'CMD' ) )
            // InternalMyDsl.g:2603:3: ( 'CMD' )
            {
             before(grammarAccess.getCmdAccess().getKeyCMDKeyword_0_0()); 
            // InternalMyDsl.g:2604:3: ( 'CMD' )
            // InternalMyDsl.g:2605:4: 'CMD'
            {
             before(grammarAccess.getCmdAccess().getKeyCMDKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCmdAccess().getKeyCMDKeyword_0_0()); 

            }

             after(grammarAccess.getCmdAccess().getKeyCMDKeyword_0_0()); 

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
    // $ANTLR end "rule__Cmd__KeyAssignment_0"


    // $ANTLR start "rule__Cmd__Exec_formAssignment_1_0"
    // InternalMyDsl.g:2616:1: rule__Cmd__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Cmd__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2620:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2621:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2621:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2622:3: ruleEXEC_FORM
            {
             before(grammarAccess.getCmdAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEXEC_FORM();

            state._fsp--;

             after(grammarAccess.getCmdAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Cmd__Exec_formAssignment_1_0"


    // $ANTLR start "rule__Cmd__Shell_formAssignment_1_1"
    // InternalMyDsl.g:2631:1: rule__Cmd__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Cmd__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2636:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2636:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2637:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getCmdAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getCmdAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Cmd__Shell_formAssignment_1_1"


    // $ANTLR start "rule__Run__KeyAssignment_0"
    // InternalMyDsl.g:2646:1: rule__Run__KeyAssignment_0 : ( ( 'RUN' ) ) ;
    public final void rule__Run__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2650:1: ( ( ( 'RUN' ) ) )
            // InternalMyDsl.g:2651:2: ( ( 'RUN' ) )
            {
            // InternalMyDsl.g:2651:2: ( ( 'RUN' ) )
            // InternalMyDsl.g:2652:3: ( 'RUN' )
            {
             before(grammarAccess.getRunAccess().getKeyRUNKeyword_0_0()); 
            // InternalMyDsl.g:2653:3: ( 'RUN' )
            // InternalMyDsl.g:2654:4: 'RUN'
            {
             before(grammarAccess.getRunAccess().getKeyRUNKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRunAccess().getKeyRUNKeyword_0_0()); 

            }

             after(grammarAccess.getRunAccess().getKeyRUNKeyword_0_0()); 

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
    // $ANTLR end "rule__Run__KeyAssignment_0"


    // $ANTLR start "rule__Run__Exec_formAssignment_1_0"
    // InternalMyDsl.g:2665:1: rule__Run__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Run__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2670:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2670:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2671:3: ruleEXEC_FORM
            {
             before(grammarAccess.getRunAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEXEC_FORM();

            state._fsp--;

             after(grammarAccess.getRunAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Run__Exec_formAssignment_1_0"


    // $ANTLR start "rule__Run__Shell_formAssignment_1_1"
    // InternalMyDsl.g:2680:1: rule__Run__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Run__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2685:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2685:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2686:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getRunAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getRunAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Run__Shell_formAssignment_1_1"


    // $ANTLR start "rule__Entrypoint__KeyAssignment_0"
    // InternalMyDsl.g:2695:1: rule__Entrypoint__KeyAssignment_0 : ( ( 'ENTRYPOINT' ) ) ;
    public final void rule__Entrypoint__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2699:1: ( ( ( 'ENTRYPOINT' ) ) )
            // InternalMyDsl.g:2700:2: ( ( 'ENTRYPOINT' ) )
            {
            // InternalMyDsl.g:2700:2: ( ( 'ENTRYPOINT' ) )
            // InternalMyDsl.g:2701:3: ( 'ENTRYPOINT' )
            {
             before(grammarAccess.getEntrypointAccess().getKeyENTRYPOINTKeyword_0_0()); 
            // InternalMyDsl.g:2702:3: ( 'ENTRYPOINT' )
            // InternalMyDsl.g:2703:4: 'ENTRYPOINT'
            {
             before(grammarAccess.getEntrypointAccess().getKeyENTRYPOINTKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntrypointAccess().getKeyENTRYPOINTKeyword_0_0()); 

            }

             after(grammarAccess.getEntrypointAccess().getKeyENTRYPOINTKeyword_0_0()); 

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
    // $ANTLR end "rule__Entrypoint__KeyAssignment_0"


    // $ANTLR start "rule__Entrypoint__Exec_formAssignment_1_0"
    // InternalMyDsl.g:2714:1: rule__Entrypoint__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Entrypoint__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2718:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2719:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2719:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2720:3: ruleEXEC_FORM
            {
             before(grammarAccess.getEntrypointAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEXEC_FORM();

            state._fsp--;

             after(grammarAccess.getEntrypointAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Entrypoint__Exec_formAssignment_1_0"


    // $ANTLR start "rule__Entrypoint__Shell_formAssignment_1_1"
    // InternalMyDsl.g:2729:1: rule__Entrypoint__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Entrypoint__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2733:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2734:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2734:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2735:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getEntrypointAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getEntrypointAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Entrypoint__Shell_formAssignment_1_1"


    // $ANTLR start "rule__Volume__KeyAssignment_0"
    // InternalMyDsl.g:2744:1: rule__Volume__KeyAssignment_0 : ( ( 'VOLUME' ) ) ;
    public final void rule__Volume__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2748:1: ( ( ( 'VOLUME' ) ) )
            // InternalMyDsl.g:2749:2: ( ( 'VOLUME' ) )
            {
            // InternalMyDsl.g:2749:2: ( ( 'VOLUME' ) )
            // InternalMyDsl.g:2750:3: ( 'VOLUME' )
            {
             before(grammarAccess.getVolumeAccess().getKeyVOLUMEKeyword_0_0()); 
            // InternalMyDsl.g:2751:3: ( 'VOLUME' )
            // InternalMyDsl.g:2752:4: 'VOLUME'
            {
             before(grammarAccess.getVolumeAccess().getKeyVOLUMEKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getKeyVOLUMEKeyword_0_0()); 

            }

             after(grammarAccess.getVolumeAccess().getKeyVOLUMEKeyword_0_0()); 

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
    // $ANTLR end "rule__Volume__KeyAssignment_0"


    // $ANTLR start "rule__Volume__Exec_formAssignment_1_0"
    // InternalMyDsl.g:2763:1: rule__Volume__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Volume__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2768:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2768:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2769:3: ruleEXEC_FORM
            {
             before(grammarAccess.getVolumeAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEXEC_FORM();

            state._fsp--;

             after(grammarAccess.getVolumeAccess().getExec_formEXEC_FORMParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Volume__Exec_formAssignment_1_0"


    // $ANTLR start "rule__Volume__Shell_formAssignment_1_1"
    // InternalMyDsl.g:2778:1: rule__Volume__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Volume__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2783:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2783:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2784:3: RULE_SHELL_CMD
            {
             before(grammarAccess.getVolumeAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 
            match(input,RULE_SHELL_CMD,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getShell_formSHELL_CMDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Volume__Shell_formAssignment_1_1"


    // $ANTLR start "rule__Maintainer__KeyAssignment_0"
    // InternalMyDsl.g:2793:1: rule__Maintainer__KeyAssignment_0 : ( ( 'MAINTAINER' ) ) ;
    public final void rule__Maintainer__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( ( ( 'MAINTAINER' ) ) )
            // InternalMyDsl.g:2798:2: ( ( 'MAINTAINER' ) )
            {
            // InternalMyDsl.g:2798:2: ( ( 'MAINTAINER' ) )
            // InternalMyDsl.g:2799:3: ( 'MAINTAINER' )
            {
             before(grammarAccess.getMaintainerAccess().getKeyMAINTAINERKeyword_0_0()); 
            // InternalMyDsl.g:2800:3: ( 'MAINTAINER' )
            // InternalMyDsl.g:2801:4: 'MAINTAINER'
            {
             before(grammarAccess.getMaintainerAccess().getKeyMAINTAINERKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMaintainerAccess().getKeyMAINTAINERKeyword_0_0()); 

            }

             after(grammarAccess.getMaintainerAccess().getKeyMAINTAINERKeyword_0_0()); 

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
    // $ANTLR end "rule__Maintainer__KeyAssignment_0"


    // $ANTLR start "rule__Maintainer__NameAssignment_1"
    // InternalMyDsl.g:2812:1: rule__Maintainer__NameAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Maintainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2817:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2817:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2818:3: RULE_SHELL_CMD
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


    // $ANTLR start "rule__Expose__KeyAssignment_0"
    // InternalMyDsl.g:2827:1: rule__Expose__KeyAssignment_0 : ( ( 'EXPOSE' ) ) ;
    public final void rule__Expose__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ( 'EXPOSE' ) ) )
            // InternalMyDsl.g:2832:2: ( ( 'EXPOSE' ) )
            {
            // InternalMyDsl.g:2832:2: ( ( 'EXPOSE' ) )
            // InternalMyDsl.g:2833:3: ( 'EXPOSE' )
            {
             before(grammarAccess.getExposeAccess().getKeyEXPOSEKeyword_0_0()); 
            // InternalMyDsl.g:2834:3: ( 'EXPOSE' )
            // InternalMyDsl.g:2835:4: 'EXPOSE'
            {
             before(grammarAccess.getExposeAccess().getKeyEXPOSEKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExposeAccess().getKeyEXPOSEKeyword_0_0()); 

            }

             after(grammarAccess.getExposeAccess().getKeyEXPOSEKeyword_0_0()); 

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
    // $ANTLR end "rule__Expose__KeyAssignment_0"


    // $ANTLR start "rule__Expose__PortsAssignment_1"
    // InternalMyDsl.g:2846:1: rule__Expose__PortsAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Expose__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2851:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2851:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2852:3: RULE_SHELL_CMD
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


    // $ANTLR start "rule__Workdir__KeyAssignment_0"
    // InternalMyDsl.g:2861:1: rule__Workdir__KeyAssignment_0 : ( ( 'WORKDIR' ) ) ;
    public final void rule__Workdir__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2865:1: ( ( ( 'WORKDIR' ) ) )
            // InternalMyDsl.g:2866:2: ( ( 'WORKDIR' ) )
            {
            // InternalMyDsl.g:2866:2: ( ( 'WORKDIR' ) )
            // InternalMyDsl.g:2867:3: ( 'WORKDIR' )
            {
             before(grammarAccess.getWorkdirAccess().getKeyWORKDIRKeyword_0_0()); 
            // InternalMyDsl.g:2868:3: ( 'WORKDIR' )
            // InternalMyDsl.g:2869:4: 'WORKDIR'
            {
             before(grammarAccess.getWorkdirAccess().getKeyWORKDIRKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWorkdirAccess().getKeyWORKDIRKeyword_0_0()); 

            }

             after(grammarAccess.getWorkdirAccess().getKeyWORKDIRKeyword_0_0()); 

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
    // $ANTLR end "rule__Workdir__KeyAssignment_0"


    // $ANTLR start "rule__Workdir__PathAssignment_1"
    // InternalMyDsl.g:2880:1: rule__Workdir__PathAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Workdir__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2884:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2885:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2885:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2886:3: RULE_SHELL_CMD
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


    // $ANTLR start "rule__Env__KeyAssignment_0"
    // InternalMyDsl.g:2895:1: rule__Env__KeyAssignment_0 : ( ( 'ENV ' ) ) ;
    public final void rule__Env__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( ( ( 'ENV ' ) ) )
            // InternalMyDsl.g:2900:2: ( ( 'ENV ' ) )
            {
            // InternalMyDsl.g:2900:2: ( ( 'ENV ' ) )
            // InternalMyDsl.g:2901:3: ( 'ENV ' )
            {
             before(grammarAccess.getEnvAccess().getKeyENVKeyword_0_0()); 
            // InternalMyDsl.g:2902:3: ( 'ENV ' )
            // InternalMyDsl.g:2903:4: 'ENV '
            {
             before(grammarAccess.getEnvAccess().getKeyENVKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnvAccess().getKeyENVKeyword_0_0()); 

            }

             after(grammarAccess.getEnvAccess().getKeyENVKeyword_0_0()); 

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
    // $ANTLR end "rule__Env__KeyAssignment_0"


    // $ANTLR start "rule__Env__Key_value_pairsAssignment_1"
    // InternalMyDsl.g:2914:1: rule__Env__Key_value_pairsAssignment_1 : ( RULE_KV_PAIR_EQUALS ) ;
    public final void rule__Env__Key_value_pairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( ( RULE_KV_PAIR_EQUALS ) )
            // InternalMyDsl.g:2919:2: ( RULE_KV_PAIR_EQUALS )
            {
            // InternalMyDsl.g:2919:2: ( RULE_KV_PAIR_EQUALS )
            // InternalMyDsl.g:2920:3: RULE_KV_PAIR_EQUALS
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


    // $ANTLR start "rule__Label__KeyAssignment_0"
    // InternalMyDsl.g:2929:1: rule__Label__KeyAssignment_0 : ( ( 'LABEL ' ) ) ;
    public final void rule__Label__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( ( ( 'LABEL ' ) ) )
            // InternalMyDsl.g:2934:2: ( ( 'LABEL ' ) )
            {
            // InternalMyDsl.g:2934:2: ( ( 'LABEL ' ) )
            // InternalMyDsl.g:2935:3: ( 'LABEL ' )
            {
             before(grammarAccess.getLabelAccess().getKeyLABELKeyword_0_0()); 
            // InternalMyDsl.g:2936:3: ( 'LABEL ' )
            // InternalMyDsl.g:2937:4: 'LABEL '
            {
             before(grammarAccess.getLabelAccess().getKeyLABELKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getKeyLABELKeyword_0_0()); 

            }

             after(grammarAccess.getLabelAccess().getKeyLABELKeyword_0_0()); 

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
    // $ANTLR end "rule__Label__KeyAssignment_0"


    // $ANTLR start "rule__Label__Key_value_pairsAssignment_1"
    // InternalMyDsl.g:2948:1: rule__Label__Key_value_pairsAssignment_1 : ( RULE_KV_PAIR_EQUALS ) ;
    public final void rule__Label__Key_value_pairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2952:1: ( ( RULE_KV_PAIR_EQUALS ) )
            // InternalMyDsl.g:2953:2: ( RULE_KV_PAIR_EQUALS )
            {
            // InternalMyDsl.g:2953:2: ( RULE_KV_PAIR_EQUALS )
            // InternalMyDsl.g:2954:3: RULE_KV_PAIR_EQUALS
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


    // $ANTLR start "rule__Add__KeyAssignment_0"
    // InternalMyDsl.g:2963:1: rule__Add__KeyAssignment_0 : ( ( 'ADD ' ) ) ;
    public final void rule__Add__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2967:1: ( ( ( 'ADD ' ) ) )
            // InternalMyDsl.g:2968:2: ( ( 'ADD ' ) )
            {
            // InternalMyDsl.g:2968:2: ( ( 'ADD ' ) )
            // InternalMyDsl.g:2969:3: ( 'ADD ' )
            {
             before(grammarAccess.getAddAccess().getKeyADDKeyword_0_0()); 
            // InternalMyDsl.g:2970:3: ( 'ADD ' )
            // InternalMyDsl.g:2971:4: 'ADD '
            {
             before(grammarAccess.getAddAccess().getKeyADDKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getKeyADDKeyword_0_0()); 

            }

             after(grammarAccess.getAddAccess().getKeyADDKeyword_0_0()); 

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
    // $ANTLR end "rule__Add__KeyAssignment_0"


    // $ANTLR start "rule__Add__Chown_optionsAssignment_1"
    // InternalMyDsl.g:2982:1: rule__Add__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Add__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:2987:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:2987:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:2988:3: RULE_CHOWN_OPTION
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
    // InternalMyDsl.g:2997:1: rule__Add__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Add__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3002:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3002:2: ( RULE_ID )
            // InternalMyDsl.g:3003:3: RULE_ID
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
    // InternalMyDsl.g:3012:1: rule__Add__DirectoryAssignment_4 : ( RULE_SHELL_CMD ) ;
    public final void rule__Add__DirectoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3016:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:3017:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:3017:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:3018:3: RULE_SHELL_CMD
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


    // $ANTLR start "rule__Copy__KeyAssignment_0"
    // InternalMyDsl.g:3027:1: rule__Copy__KeyAssignment_0 : ( ( 'COPY ' ) ) ;
    public final void rule__Copy__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( ( ( 'COPY ' ) ) )
            // InternalMyDsl.g:3032:2: ( ( 'COPY ' ) )
            {
            // InternalMyDsl.g:3032:2: ( ( 'COPY ' ) )
            // InternalMyDsl.g:3033:3: ( 'COPY ' )
            {
             before(grammarAccess.getCopyAccess().getKeyCOPYKeyword_0_0()); 
            // InternalMyDsl.g:3034:3: ( 'COPY ' )
            // InternalMyDsl.g:3035:4: 'COPY '
            {
             before(grammarAccess.getCopyAccess().getKeyCOPYKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getKeyCOPYKeyword_0_0()); 

            }

             after(grammarAccess.getCopyAccess().getKeyCOPYKeyword_0_0()); 

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
    // $ANTLR end "rule__Copy__KeyAssignment_0"


    // $ANTLR start "rule__Copy__Chown_optionsAssignment_1"
    // InternalMyDsl.g:3046:1: rule__Copy__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Copy__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3050:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:3051:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:3051:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:3052:3: RULE_CHOWN_OPTION
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
    // InternalMyDsl.g:3061:1: rule__Copy__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Copy__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3066:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3066:2: ( RULE_ID )
            // InternalMyDsl.g:3067:3: RULE_ID
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
    // InternalMyDsl.g:3076:1: rule__Copy__DirectoryAssignment_5 : ( RULE_SHELL_CMD ) ;
    public final void rule__Copy__DirectoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:3081:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:3081:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:3082:3: RULE_SHELL_CMD
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


    // $ANTLR start "rule__Onbuild__KeyAssignment_0"
    // InternalMyDsl.g:3091:1: rule__Onbuild__KeyAssignment_0 : ( ( 'ONBUILD ' ) ) ;
    public final void rule__Onbuild__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( ( ( 'ONBUILD ' ) ) )
            // InternalMyDsl.g:3096:2: ( ( 'ONBUILD ' ) )
            {
            // InternalMyDsl.g:3096:2: ( ( 'ONBUILD ' ) )
            // InternalMyDsl.g:3097:3: ( 'ONBUILD ' )
            {
             before(grammarAccess.getOnbuildAccess().getKeyONBUILDKeyword_0_0()); 
            // InternalMyDsl.g:3098:3: ( 'ONBUILD ' )
            // InternalMyDsl.g:3099:4: 'ONBUILD '
            {
             before(grammarAccess.getOnbuildAccess().getKeyONBUILDKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOnbuildAccess().getKeyONBUILDKeyword_0_0()); 

            }

             after(grammarAccess.getOnbuildAccess().getKeyONBUILDKeyword_0_0()); 

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
    // $ANTLR end "rule__Onbuild__KeyAssignment_0"


    // $ANTLR start "rule__Onbuild__StatementAssignment_1"
    // InternalMyDsl.g:3110:1: rule__Onbuild__StatementAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Onbuild__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3114:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:3115:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:3115:2: ( ruleInstruction )
            // InternalMyDsl.g:3116:3: ruleInstruction
            {
             before(grammarAccess.getOnbuildAccess().getStatementInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getOnbuildAccess().getStatementInstructionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Onbuild__StatementAssignment_1"


    // $ANTLR start "rule__EXEC_FORM__ExecutableAssignment_1"
    // InternalMyDsl.g:3125:1: rule__EXEC_FORM__ExecutableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EXEC_FORM__ExecutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3129:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3130:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3130:2: ( RULE_STRING )
            // InternalMyDsl.g:3131:3: RULE_STRING
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
    // InternalMyDsl.g:3140:1: rule__EXEC_FORM__ParametersAssignment_2 : ( RULE_EXEC_FORM_PARAMETER ) ;
    public final void rule__EXEC_FORM__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3144:1: ( ( RULE_EXEC_FORM_PARAMETER ) )
            // InternalMyDsl.g:3145:2: ( RULE_EXEC_FORM_PARAMETER )
            {
            // InternalMyDsl.g:3145:2: ( RULE_EXEC_FORM_PARAMETER )
            // InternalMyDsl.g:3146:3: RULE_EXEC_FORM_PARAMETER
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FFF800102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000002C400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000FFF800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000030070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000030072L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002002L});

}