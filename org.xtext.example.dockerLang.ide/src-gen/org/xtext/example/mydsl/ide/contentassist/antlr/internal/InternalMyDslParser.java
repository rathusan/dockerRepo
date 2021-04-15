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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_NL", "RULE_PLATFORM_OPTION", "RULE_SHELL_CMD", "RULE_KV_PAIR_EQUALS", "RULE_CHOWN_OPTION", "RULE_EXEC_FORM_PARAMETER", "RULE_COMMENT", "'?'", "'*'", "'-'", "'.'", "'/'", "':'", "'@'", "' ['", "']'", "'FROM '", "'CMD'", "'RUN'", "'ENTRYPOINT'", "'VOLUME'", "'MAINTAINER'", "'EXPOSE'", "'WORKDIR'", "'ENV '", "'LABEL '", "'ADD '", "'COPY '"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_SHELL_CMD=9;
    public static final int RULE_COMMENT=13;
    public static final int RULE_CHOWN_OPTION=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_KV_PAIR_EQUALS=10;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=7;
    public static final int RULE_EXEC_FORM_PARAMETER=12;
    public static final int T__20=20;
    public static final int RULE_PLATFORM_OPTION=8;
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

                if ( ((LA1_0>=23 && LA1_0<=34)) ) {
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


    // $ANTLR start "rule__Instruction__StatementAlternatives_0"
    // InternalMyDsl.g:502:1: rule__Instruction__StatementAlternatives_0 : ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) );
    public final void rule__Instruction__StatementAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( ruleFrom ) | ( ruleCmd ) | ( ruleEntrypoint ) | ( ruleVolume ) | ( ruleMaintainer ) | ( ruleExpose ) | ( ruleWorkdir ) | ( ruleRun ) | ( ruleEnv ) | ( ruleLabel ) | ( ruleAdd ) | ( ruleCopy ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            case 29:
                {
                alt2=6;
                }
                break;
            case 30:
                {
                alt2=7;
                }
                break;
            case 25:
                {
                alt2=8;
                }
                break;
            case 31:
                {
                alt2=9;
                }
                break;
            case 32:
                {
                alt2=10;
                }
                break;
            case 33:
                {
                alt2=11;
                }
                break;
            case 34:
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
                    // InternalMyDsl.g:507:2: ( ruleFrom )
                    {
                    // InternalMyDsl.g:507:2: ( ruleFrom )
                    // InternalMyDsl.g:508:3: ruleFrom
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
                    // InternalMyDsl.g:513:2: ( ruleCmd )
                    {
                    // InternalMyDsl.g:513:2: ( ruleCmd )
                    // InternalMyDsl.g:514:3: ruleCmd
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
                    // InternalMyDsl.g:519:2: ( ruleEntrypoint )
                    {
                    // InternalMyDsl.g:519:2: ( ruleEntrypoint )
                    // InternalMyDsl.g:520:3: ruleEntrypoint
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
                    // InternalMyDsl.g:525:2: ( ruleVolume )
                    {
                    // InternalMyDsl.g:525:2: ( ruleVolume )
                    // InternalMyDsl.g:526:3: ruleVolume
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
                    // InternalMyDsl.g:531:2: ( ruleMaintainer )
                    {
                    // InternalMyDsl.g:531:2: ( ruleMaintainer )
                    // InternalMyDsl.g:532:3: ruleMaintainer
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
                    // InternalMyDsl.g:537:2: ( ruleExpose )
                    {
                    // InternalMyDsl.g:537:2: ( ruleExpose )
                    // InternalMyDsl.g:538:3: ruleExpose
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
                    // InternalMyDsl.g:543:2: ( ruleWorkdir )
                    {
                    // InternalMyDsl.g:543:2: ( ruleWorkdir )
                    // InternalMyDsl.g:544:3: ruleWorkdir
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
                    // InternalMyDsl.g:549:2: ( ruleRun )
                    {
                    // InternalMyDsl.g:549:2: ( ruleRun )
                    // InternalMyDsl.g:550:3: ruleRun
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
                    // InternalMyDsl.g:555:2: ( ruleEnv )
                    {
                    // InternalMyDsl.g:555:2: ( ruleEnv )
                    // InternalMyDsl.g:556:3: ruleEnv
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
                    // InternalMyDsl.g:561:2: ( ruleLabel )
                    {
                    // InternalMyDsl.g:561:2: ( ruleLabel )
                    // InternalMyDsl.g:562:3: ruleLabel
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
                    // InternalMyDsl.g:567:2: ( ruleAdd )
                    {
                    // InternalMyDsl.g:567:2: ( ruleAdd )
                    // InternalMyDsl.g:568:3: ruleAdd
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
                    // InternalMyDsl.g:573:2: ( ruleCopy )
                    {
                    // InternalMyDsl.g:573:2: ( ruleCopy )
                    // InternalMyDsl.g:574:3: ruleCopy
                    {
                     before(grammarAccess.getInstructionAccess().getStatementCopyParserRuleCall_0_11()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStatementCopyParserRuleCall_0_11()); 

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
    // InternalMyDsl.g:583:1: rule__From__Tag_or_digestAlternatives_3_0 : ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) );
    public final void rule__From__Tag_or_digestAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( ruleIMAGE_TAG ) | ( ruleIMAGE_DIGEST ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:588:2: ( ruleIMAGE_TAG )
                    {
                    // InternalMyDsl.g:588:2: ( ruleIMAGE_TAG )
                    // InternalMyDsl.g:589:3: ruleIMAGE_TAG
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
                    // InternalMyDsl.g:594:2: ( ruleIMAGE_DIGEST )
                    {
                    // InternalMyDsl.g:594:2: ( ruleIMAGE_DIGEST )
                    // InternalMyDsl.g:595:3: ruleIMAGE_DIGEST
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
    // InternalMyDsl.g:604:1: rule__Cmd__Alternatives_1 : ( ( ( rule__Cmd__Exec_formAssignment_1_0 ) ) | ( ( rule__Cmd__Shell_formAssignment_1_1 ) ) );
    public final void rule__Cmd__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:608:1: ( ( ( rule__Cmd__Exec_formAssignment_1_0 ) ) | ( ( rule__Cmd__Shell_formAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
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
                    // InternalMyDsl.g:609:2: ( ( rule__Cmd__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:609:2: ( ( rule__Cmd__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:610:3: ( rule__Cmd__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getCmdAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:611:3: ( rule__Cmd__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:611:4: rule__Cmd__Exec_formAssignment_1_0
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
                    // InternalMyDsl.g:615:2: ( ( rule__Cmd__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:615:2: ( ( rule__Cmd__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:616:3: ( rule__Cmd__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getCmdAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:617:3: ( rule__Cmd__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:617:4: rule__Cmd__Shell_formAssignment_1_1
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
    // InternalMyDsl.g:625:1: rule__Run__Alternatives_1 : ( ( ( rule__Run__Exec_formAssignment_1_0 ) ) | ( ( rule__Run__Shell_formAssignment_1_1 ) ) );
    public final void rule__Run__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( ( rule__Run__Exec_formAssignment_1_0 ) ) | ( ( rule__Run__Shell_formAssignment_1_1 ) ) )
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
                    // InternalMyDsl.g:630:2: ( ( rule__Run__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:630:2: ( ( rule__Run__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:631:3: ( rule__Run__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getRunAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:632:3: ( rule__Run__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:632:4: rule__Run__Exec_formAssignment_1_0
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
                    // InternalMyDsl.g:636:2: ( ( rule__Run__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:636:2: ( ( rule__Run__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:637:3: ( rule__Run__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getRunAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:638:3: ( rule__Run__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:638:4: rule__Run__Shell_formAssignment_1_1
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
    // InternalMyDsl.g:646:1: rule__Entrypoint__Alternatives_1 : ( ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) ) | ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) ) );
    public final void rule__Entrypoint__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) ) | ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) ) )
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
                    // InternalMyDsl.g:651:2: ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:651:2: ( ( rule__Entrypoint__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:652:3: ( rule__Entrypoint__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getEntrypointAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:653:3: ( rule__Entrypoint__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:653:4: rule__Entrypoint__Exec_formAssignment_1_0
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
                    // InternalMyDsl.g:657:2: ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:657:2: ( ( rule__Entrypoint__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:658:3: ( rule__Entrypoint__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getEntrypointAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:659:3: ( rule__Entrypoint__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:659:4: rule__Entrypoint__Shell_formAssignment_1_1
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
    // InternalMyDsl.g:667:1: rule__Volume__Alternatives_1 : ( ( ( rule__Volume__Exec_formAssignment_1_0 ) ) | ( ( rule__Volume__Shell_formAssignment_1_1 ) ) );
    public final void rule__Volume__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( ( rule__Volume__Exec_formAssignment_1_0 ) ) | ( ( rule__Volume__Shell_formAssignment_1_1 ) ) )
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
                    // InternalMyDsl.g:672:2: ( ( rule__Volume__Exec_formAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:672:2: ( ( rule__Volume__Exec_formAssignment_1_0 ) )
                    // InternalMyDsl.g:673:3: ( rule__Volume__Exec_formAssignment_1_0 )
                    {
                     before(grammarAccess.getVolumeAccess().getExec_formAssignment_1_0()); 
                    // InternalMyDsl.g:674:3: ( rule__Volume__Exec_formAssignment_1_0 )
                    // InternalMyDsl.g:674:4: rule__Volume__Exec_formAssignment_1_0
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
                    // InternalMyDsl.g:678:2: ( ( rule__Volume__Shell_formAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:678:2: ( ( rule__Volume__Shell_formAssignment_1_1 ) )
                    // InternalMyDsl.g:679:3: ( rule__Volume__Shell_formAssignment_1_1 )
                    {
                     before(grammarAccess.getVolumeAccess().getShell_formAssignment_1_1()); 
                    // InternalMyDsl.g:680:3: ( rule__Volume__Shell_formAssignment_1_1 )
                    // InternalMyDsl.g:680:4: rule__Volume__Shell_formAssignment_1_1
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
    // InternalMyDsl.g:688:1: rule__Add__Alternatives_3 : ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) );
    public final void rule__Add__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( ( rule__Add__Alternatives_3_0 ) ) | ( ( rule__Add__Group_3_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=14 && LA8_0<=15)) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:693:2: ( ( rule__Add__Alternatives_3_0 ) )
                    {
                    // InternalMyDsl.g:693:2: ( ( rule__Add__Alternatives_3_0 ) )
                    // InternalMyDsl.g:694:3: ( rule__Add__Alternatives_3_0 )
                    {
                     before(grammarAccess.getAddAccess().getAlternatives_3_0()); 
                    // InternalMyDsl.g:695:3: ( rule__Add__Alternatives_3_0 )
                    // InternalMyDsl.g:695:4: rule__Add__Alternatives_3_0
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
                    // InternalMyDsl.g:699:2: ( ( rule__Add__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:699:2: ( ( rule__Add__Group_3_1__0 ) )
                    // InternalMyDsl.g:700:3: ( rule__Add__Group_3_1__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:701:3: ( rule__Add__Group_3_1__0 )
                    // InternalMyDsl.g:701:4: rule__Add__Group_3_1__0
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
    // InternalMyDsl.g:709:1: rule__Add__Alternatives_3_0 : ( ( '?' ) | ( '*' ) );
    public final void rule__Add__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( '?' ) | ( '*' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:714:2: ( '?' )
                    {
                    // InternalMyDsl.g:714:2: ( '?' )
                    // InternalMyDsl.g:715:3: '?'
                    {
                     before(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:720:2: ( '*' )
                    {
                    // InternalMyDsl.g:720:2: ( '*' )
                    // InternalMyDsl.g:721:3: '*'
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
    // InternalMyDsl.g:730:1: rule__Copy__Alternatives_3 : ( ( '?' ) | ( '*' ) );
    public final void rule__Copy__Alternatives_3() throws RecognitionException {

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
                     before(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:741:2: ( '*' )
                    {
                    // InternalMyDsl.g:741:2: ( '*' )
                    // InternalMyDsl.g:742:3: '*'
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
    // InternalMyDsl.g:751:1: rule__IMAGE_TAG__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_TAG__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
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
                    // InternalMyDsl.g:756:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:756:2: ( RULE_ID )
                    // InternalMyDsl.g:757:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:762:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:762:2: ( RULE_INT )
                    // InternalMyDsl.g:763:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:768:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:768:2: ( RULE_STRING )
                    // InternalMyDsl.g:769:3: RULE_STRING
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
    // InternalMyDsl.g:778:1: rule__IMAGE_TAG__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_TAG__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
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
            case 16:
                {
                alt12=4;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:783:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:783:2: ( RULE_ID )
                    // InternalMyDsl.g:784:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:789:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:789:2: ( RULE_INT )
                    // InternalMyDsl.g:790:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:795:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:795:2: ( RULE_STRING )
                    // InternalMyDsl.g:796:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:801:2: ( '-' )
                    {
                    // InternalMyDsl.g:801:2: ( '-' )
                    // InternalMyDsl.g:802:3: '-'
                    {
                     before(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:807:2: ( '.' )
                    {
                    // InternalMyDsl.g:807:2: ( '.' )
                    // InternalMyDsl.g:808:3: '.'
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
    // InternalMyDsl.g:817:1: rule__IMAGE_DIGEST__Alternatives_1 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__IMAGE_DIGEST__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) )
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
                    // InternalMyDsl.g:822:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:822:2: ( RULE_ID )
                    // InternalMyDsl.g:823:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:828:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:828:2: ( RULE_INT )
                    // InternalMyDsl.g:829:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:834:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:834:2: ( RULE_STRING )
                    // InternalMyDsl.g:835:3: RULE_STRING
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
    // InternalMyDsl.g:844:1: rule__IMAGE_DIGEST__Alternatives_2 : ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) );
    public final void rule__IMAGE_DIGEST__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( RULE_ID ) | ( RULE_INT ) | ( RULE_STRING ) | ( '-' ) | ( '.' ) )
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
            case 16:
                {
                alt14=4;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:849:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:849:2: ( RULE_ID )
                    // InternalMyDsl.g:850:3: RULE_ID
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:855:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:855:2: ( RULE_INT )
                    // InternalMyDsl.g:856:3: RULE_INT
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:861:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:861:2: ( RULE_STRING )
                    // InternalMyDsl.g:862:3: RULE_STRING
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:867:2: ( '-' )
                    {
                    // InternalMyDsl.g:867:2: ( '-' )
                    // InternalMyDsl.g:868:3: '-'
                    {
                     before(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:873:2: ( '.' )
                    {
                    // InternalMyDsl.g:873:2: ( '.' )
                    // InternalMyDsl.g:874:3: '.'
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
    // InternalMyDsl.g:883:1: rule__Dockerfile__Group__0 : rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1 ;
    public final void rule__Dockerfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1 )
            // InternalMyDsl.g:888:2: rule__Dockerfile__Group__0__Impl rule__Dockerfile__Group__1
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
    // InternalMyDsl.g:895:1: rule__Dockerfile__Group__0__Impl : ( ( rule__Dockerfile__StatementsAssignment_0 ) ) ;
    public final void rule__Dockerfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ( rule__Dockerfile__StatementsAssignment_0 ) ) )
            // InternalMyDsl.g:900:1: ( ( rule__Dockerfile__StatementsAssignment_0 ) )
            {
            // InternalMyDsl.g:900:1: ( ( rule__Dockerfile__StatementsAssignment_0 ) )
            // InternalMyDsl.g:901:2: ( rule__Dockerfile__StatementsAssignment_0 )
            {
             before(grammarAccess.getDockerfileAccess().getStatementsAssignment_0()); 
            // InternalMyDsl.g:902:2: ( rule__Dockerfile__StatementsAssignment_0 )
            // InternalMyDsl.g:902:3: rule__Dockerfile__StatementsAssignment_0
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
    // InternalMyDsl.g:910:1: rule__Dockerfile__Group__1 : rule__Dockerfile__Group__1__Impl ;
    public final void rule__Dockerfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( rule__Dockerfile__Group__1__Impl )
            // InternalMyDsl.g:915:2: rule__Dockerfile__Group__1__Impl
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
    // InternalMyDsl.g:921:1: rule__Dockerfile__Group__1__Impl : ( RULE_NL ) ;
    public final void rule__Dockerfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( ( RULE_NL ) )
            // InternalMyDsl.g:926:1: ( RULE_NL )
            {
            // InternalMyDsl.g:926:1: ( RULE_NL )
            // InternalMyDsl.g:927:2: RULE_NL
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


    // $ANTLR start "rule__From__Group__0"
    // InternalMyDsl.g:937:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalMyDsl.g:942:2: rule__From__Group__0__Impl rule__From__Group__1
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
    // InternalMyDsl.g:949:1: rule__From__Group__0__Impl : ( ( rule__From__KeyAssignment_0 ) ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( ( rule__From__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:954:1: ( ( rule__From__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:954:1: ( ( rule__From__KeyAssignment_0 ) )
            // InternalMyDsl.g:955:2: ( rule__From__KeyAssignment_0 )
            {
             before(grammarAccess.getFromAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:956:2: ( rule__From__KeyAssignment_0 )
            // InternalMyDsl.g:956:3: rule__From__KeyAssignment_0
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
    // InternalMyDsl.g:964:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // InternalMyDsl.g:969:2: rule__From__Group__1__Impl rule__From__Group__2
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
    // InternalMyDsl.g:976:1: rule__From__Group__1__Impl : ( ( rule__From__Platform_optionAssignment_1 )? ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( ( rule__From__Platform_optionAssignment_1 )? ) )
            // InternalMyDsl.g:981:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            {
            // InternalMyDsl.g:981:1: ( ( rule__From__Platform_optionAssignment_1 )? )
            // InternalMyDsl.g:982:2: ( rule__From__Platform_optionAssignment_1 )?
            {
             before(grammarAccess.getFromAccess().getPlatform_optionAssignment_1()); 
            // InternalMyDsl.g:983:2: ( rule__From__Platform_optionAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_PLATFORM_OPTION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:983:3: rule__From__Platform_optionAssignment_1
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
    // InternalMyDsl.g:991:1: rule__From__Group__2 : rule__From__Group__2__Impl rule__From__Group__3 ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( rule__From__Group__2__Impl rule__From__Group__3 )
            // InternalMyDsl.g:996:2: rule__From__Group__2__Impl rule__From__Group__3
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
    // InternalMyDsl.g:1003:1: rule__From__Group__2__Impl : ( ( rule__From__NameAssignment_2 ) ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( ( rule__From__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1008:1: ( ( rule__From__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1008:1: ( ( rule__From__NameAssignment_2 ) )
            // InternalMyDsl.g:1009:2: ( rule__From__NameAssignment_2 )
            {
             before(grammarAccess.getFromAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1010:2: ( rule__From__NameAssignment_2 )
            // InternalMyDsl.g:1010:3: rule__From__NameAssignment_2
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
    // InternalMyDsl.g:1018:1: rule__From__Group__3 : rule__From__Group__3__Impl ;
    public final void rule__From__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( rule__From__Group__3__Impl )
            // InternalMyDsl.g:1023:2: rule__From__Group__3__Impl
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
    // InternalMyDsl.g:1029:1: rule__From__Group__3__Impl : ( ( rule__From__Tag_or_digestAssignment_3 )? ) ;
    public final void rule__From__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( ( ( rule__From__Tag_or_digestAssignment_3 )? ) )
            // InternalMyDsl.g:1034:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            {
            // InternalMyDsl.g:1034:1: ( ( rule__From__Tag_or_digestAssignment_3 )? )
            // InternalMyDsl.g:1035:2: ( rule__From__Tag_or_digestAssignment_3 )?
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAssignment_3()); 
            // InternalMyDsl.g:1036:2: ( rule__From__Tag_or_digestAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=19 && LA16_0<=20)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1036:3: rule__From__Tag_or_digestAssignment_3
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
    // InternalMyDsl.g:1045:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // InternalMyDsl.g:1050:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
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
    // InternalMyDsl.g:1057:1: rule__Cmd__Group__0__Impl : ( ( rule__Cmd__KeyAssignment_0 ) ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( ( rule__Cmd__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1062:1: ( ( rule__Cmd__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1062:1: ( ( rule__Cmd__KeyAssignment_0 ) )
            // InternalMyDsl.g:1063:2: ( rule__Cmd__KeyAssignment_0 )
            {
             before(grammarAccess.getCmdAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1064:2: ( rule__Cmd__KeyAssignment_0 )
            // InternalMyDsl.g:1064:3: rule__Cmd__KeyAssignment_0
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
    // InternalMyDsl.g:1072:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__Cmd__Group__1__Impl )
            // InternalMyDsl.g:1077:2: rule__Cmd__Group__1__Impl
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
    // InternalMyDsl.g:1083:1: rule__Cmd__Group__1__Impl : ( ( rule__Cmd__Alternatives_1 ) ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( ( ( rule__Cmd__Alternatives_1 ) ) )
            // InternalMyDsl.g:1088:1: ( ( rule__Cmd__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1088:1: ( ( rule__Cmd__Alternatives_1 ) )
            // InternalMyDsl.g:1089:2: ( rule__Cmd__Alternatives_1 )
            {
             before(grammarAccess.getCmdAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1090:2: ( rule__Cmd__Alternatives_1 )
            // InternalMyDsl.g:1090:3: rule__Cmd__Alternatives_1
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
    // InternalMyDsl.g:1099:1: rule__Run__Group__0 : rule__Run__Group__0__Impl rule__Run__Group__1 ;
    public final void rule__Run__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__Run__Group__0__Impl rule__Run__Group__1 )
            // InternalMyDsl.g:1104:2: rule__Run__Group__0__Impl rule__Run__Group__1
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
    // InternalMyDsl.g:1111:1: rule__Run__Group__0__Impl : ( ( rule__Run__KeyAssignment_0 ) ) ;
    public final void rule__Run__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ( rule__Run__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1116:1: ( ( rule__Run__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1116:1: ( ( rule__Run__KeyAssignment_0 ) )
            // InternalMyDsl.g:1117:2: ( rule__Run__KeyAssignment_0 )
            {
             before(grammarAccess.getRunAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1118:2: ( rule__Run__KeyAssignment_0 )
            // InternalMyDsl.g:1118:3: rule__Run__KeyAssignment_0
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
    // InternalMyDsl.g:1126:1: rule__Run__Group__1 : rule__Run__Group__1__Impl ;
    public final void rule__Run__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__Run__Group__1__Impl )
            // InternalMyDsl.g:1131:2: rule__Run__Group__1__Impl
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
    // InternalMyDsl.g:1137:1: rule__Run__Group__1__Impl : ( ( rule__Run__Alternatives_1 ) ) ;
    public final void rule__Run__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( ( ( rule__Run__Alternatives_1 ) ) )
            // InternalMyDsl.g:1142:1: ( ( rule__Run__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1142:1: ( ( rule__Run__Alternatives_1 ) )
            // InternalMyDsl.g:1143:2: ( rule__Run__Alternatives_1 )
            {
             before(grammarAccess.getRunAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1144:2: ( rule__Run__Alternatives_1 )
            // InternalMyDsl.g:1144:3: rule__Run__Alternatives_1
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
    // InternalMyDsl.g:1153:1: rule__Entrypoint__Group__0 : rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 ;
    public final void rule__Entrypoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 )
            // InternalMyDsl.g:1158:2: rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1
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
    // InternalMyDsl.g:1165:1: rule__Entrypoint__Group__0__Impl : ( ( rule__Entrypoint__KeyAssignment_0 ) ) ;
    public final void rule__Entrypoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( ( rule__Entrypoint__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1170:1: ( ( rule__Entrypoint__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1170:1: ( ( rule__Entrypoint__KeyAssignment_0 ) )
            // InternalMyDsl.g:1171:2: ( rule__Entrypoint__KeyAssignment_0 )
            {
             before(grammarAccess.getEntrypointAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1172:2: ( rule__Entrypoint__KeyAssignment_0 )
            // InternalMyDsl.g:1172:3: rule__Entrypoint__KeyAssignment_0
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
    // InternalMyDsl.g:1180:1: rule__Entrypoint__Group__1 : rule__Entrypoint__Group__1__Impl ;
    public final void rule__Entrypoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__Entrypoint__Group__1__Impl )
            // InternalMyDsl.g:1185:2: rule__Entrypoint__Group__1__Impl
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
    // InternalMyDsl.g:1191:1: rule__Entrypoint__Group__1__Impl : ( ( rule__Entrypoint__Alternatives_1 ) ) ;
    public final void rule__Entrypoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( ( ( rule__Entrypoint__Alternatives_1 ) ) )
            // InternalMyDsl.g:1196:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1196:1: ( ( rule__Entrypoint__Alternatives_1 ) )
            // InternalMyDsl.g:1197:2: ( rule__Entrypoint__Alternatives_1 )
            {
             before(grammarAccess.getEntrypointAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1198:2: ( rule__Entrypoint__Alternatives_1 )
            // InternalMyDsl.g:1198:3: rule__Entrypoint__Alternatives_1
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
    // InternalMyDsl.g:1207:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalMyDsl.g:1212:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
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
    // InternalMyDsl.g:1219:1: rule__Volume__Group__0__Impl : ( ( rule__Volume__KeyAssignment_0 ) ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( ( rule__Volume__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1224:1: ( ( rule__Volume__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1224:1: ( ( rule__Volume__KeyAssignment_0 ) )
            // InternalMyDsl.g:1225:2: ( rule__Volume__KeyAssignment_0 )
            {
             before(grammarAccess.getVolumeAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1226:2: ( rule__Volume__KeyAssignment_0 )
            // InternalMyDsl.g:1226:3: rule__Volume__KeyAssignment_0
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
    // InternalMyDsl.g:1234:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__Volume__Group__1__Impl )
            // InternalMyDsl.g:1239:2: rule__Volume__Group__1__Impl
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
    // InternalMyDsl.g:1245:1: rule__Volume__Group__1__Impl : ( ( rule__Volume__Alternatives_1 ) ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( ( ( rule__Volume__Alternatives_1 ) ) )
            // InternalMyDsl.g:1250:1: ( ( rule__Volume__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1250:1: ( ( rule__Volume__Alternatives_1 ) )
            // InternalMyDsl.g:1251:2: ( rule__Volume__Alternatives_1 )
            {
             before(grammarAccess.getVolumeAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1252:2: ( rule__Volume__Alternatives_1 )
            // InternalMyDsl.g:1252:3: rule__Volume__Alternatives_1
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
    // InternalMyDsl.g:1261:1: rule__Maintainer__Group__0 : rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 ;
    public final void rule__Maintainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 )
            // InternalMyDsl.g:1266:2: rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1
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
    // InternalMyDsl.g:1273:1: rule__Maintainer__Group__0__Impl : ( ( rule__Maintainer__KeyAssignment_0 ) ) ;
    public final void rule__Maintainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( ( ( rule__Maintainer__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1278:1: ( ( rule__Maintainer__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1278:1: ( ( rule__Maintainer__KeyAssignment_0 ) )
            // InternalMyDsl.g:1279:2: ( rule__Maintainer__KeyAssignment_0 )
            {
             before(grammarAccess.getMaintainerAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1280:2: ( rule__Maintainer__KeyAssignment_0 )
            // InternalMyDsl.g:1280:3: rule__Maintainer__KeyAssignment_0
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
    // InternalMyDsl.g:1288:1: rule__Maintainer__Group__1 : rule__Maintainer__Group__1__Impl ;
    public final void rule__Maintainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__Maintainer__Group__1__Impl )
            // InternalMyDsl.g:1293:2: rule__Maintainer__Group__1__Impl
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
    // InternalMyDsl.g:1299:1: rule__Maintainer__Group__1__Impl : ( ( rule__Maintainer__NameAssignment_1 ) ) ;
    public final void rule__Maintainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( ( ( rule__Maintainer__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1304:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1304:1: ( ( rule__Maintainer__NameAssignment_1 ) )
            // InternalMyDsl.g:1305:2: ( rule__Maintainer__NameAssignment_1 )
            {
             before(grammarAccess.getMaintainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1306:2: ( rule__Maintainer__NameAssignment_1 )
            // InternalMyDsl.g:1306:3: rule__Maintainer__NameAssignment_1
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
    // InternalMyDsl.g:1315:1: rule__Expose__Group__0 : rule__Expose__Group__0__Impl rule__Expose__Group__1 ;
    public final void rule__Expose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( rule__Expose__Group__0__Impl rule__Expose__Group__1 )
            // InternalMyDsl.g:1320:2: rule__Expose__Group__0__Impl rule__Expose__Group__1
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
    // InternalMyDsl.g:1327:1: rule__Expose__Group__0__Impl : ( ( rule__Expose__KeyAssignment_0 ) ) ;
    public final void rule__Expose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( ( ( rule__Expose__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1332:1: ( ( rule__Expose__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1332:1: ( ( rule__Expose__KeyAssignment_0 ) )
            // InternalMyDsl.g:1333:2: ( rule__Expose__KeyAssignment_0 )
            {
             before(grammarAccess.getExposeAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1334:2: ( rule__Expose__KeyAssignment_0 )
            // InternalMyDsl.g:1334:3: rule__Expose__KeyAssignment_0
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
    // InternalMyDsl.g:1342:1: rule__Expose__Group__1 : rule__Expose__Group__1__Impl ;
    public final void rule__Expose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__Expose__Group__1__Impl )
            // InternalMyDsl.g:1347:2: rule__Expose__Group__1__Impl
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
    // InternalMyDsl.g:1353:1: rule__Expose__Group__1__Impl : ( ( rule__Expose__PortsAssignment_1 ) ) ;
    public final void rule__Expose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( ( ( rule__Expose__PortsAssignment_1 ) ) )
            // InternalMyDsl.g:1358:1: ( ( rule__Expose__PortsAssignment_1 ) )
            {
            // InternalMyDsl.g:1358:1: ( ( rule__Expose__PortsAssignment_1 ) )
            // InternalMyDsl.g:1359:2: ( rule__Expose__PortsAssignment_1 )
            {
             before(grammarAccess.getExposeAccess().getPortsAssignment_1()); 
            // InternalMyDsl.g:1360:2: ( rule__Expose__PortsAssignment_1 )
            // InternalMyDsl.g:1360:3: rule__Expose__PortsAssignment_1
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
    // InternalMyDsl.g:1369:1: rule__Workdir__Group__0 : rule__Workdir__Group__0__Impl rule__Workdir__Group__1 ;
    public final void rule__Workdir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__Workdir__Group__0__Impl rule__Workdir__Group__1 )
            // InternalMyDsl.g:1374:2: rule__Workdir__Group__0__Impl rule__Workdir__Group__1
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
    // InternalMyDsl.g:1381:1: rule__Workdir__Group__0__Impl : ( ( rule__Workdir__KeyAssignment_0 ) ) ;
    public final void rule__Workdir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ( rule__Workdir__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1386:1: ( ( rule__Workdir__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1386:1: ( ( rule__Workdir__KeyAssignment_0 ) )
            // InternalMyDsl.g:1387:2: ( rule__Workdir__KeyAssignment_0 )
            {
             before(grammarAccess.getWorkdirAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1388:2: ( rule__Workdir__KeyAssignment_0 )
            // InternalMyDsl.g:1388:3: rule__Workdir__KeyAssignment_0
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
    // InternalMyDsl.g:1396:1: rule__Workdir__Group__1 : rule__Workdir__Group__1__Impl ;
    public final void rule__Workdir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__Workdir__Group__1__Impl )
            // InternalMyDsl.g:1401:2: rule__Workdir__Group__1__Impl
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
    // InternalMyDsl.g:1407:1: rule__Workdir__Group__1__Impl : ( ( rule__Workdir__PathAssignment_1 ) ) ;
    public final void rule__Workdir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( ( ( rule__Workdir__PathAssignment_1 ) ) )
            // InternalMyDsl.g:1412:1: ( ( rule__Workdir__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:1412:1: ( ( rule__Workdir__PathAssignment_1 ) )
            // InternalMyDsl.g:1413:2: ( rule__Workdir__PathAssignment_1 )
            {
             before(grammarAccess.getWorkdirAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:1414:2: ( rule__Workdir__PathAssignment_1 )
            // InternalMyDsl.g:1414:3: rule__Workdir__PathAssignment_1
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
    // InternalMyDsl.g:1423:1: rule__Env__Group__0 : rule__Env__Group__0__Impl rule__Env__Group__1 ;
    public final void rule__Env__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__Env__Group__0__Impl rule__Env__Group__1 )
            // InternalMyDsl.g:1428:2: rule__Env__Group__0__Impl rule__Env__Group__1
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
    // InternalMyDsl.g:1435:1: rule__Env__Group__0__Impl : ( ( rule__Env__KeyAssignment_0 ) ) ;
    public final void rule__Env__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( ( rule__Env__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1440:1: ( ( rule__Env__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1440:1: ( ( rule__Env__KeyAssignment_0 ) )
            // InternalMyDsl.g:1441:2: ( rule__Env__KeyAssignment_0 )
            {
             before(grammarAccess.getEnvAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1442:2: ( rule__Env__KeyAssignment_0 )
            // InternalMyDsl.g:1442:3: rule__Env__KeyAssignment_0
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
    // InternalMyDsl.g:1450:1: rule__Env__Group__1 : rule__Env__Group__1__Impl ;
    public final void rule__Env__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__Env__Group__1__Impl )
            // InternalMyDsl.g:1455:2: rule__Env__Group__1__Impl
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
    // InternalMyDsl.g:1461:1: rule__Env__Group__1__Impl : ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Env__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1466:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1466:1: ( ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1467:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) ) ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1467:2: ( ( rule__Env__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1468:3: ( rule__Env__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1469:3: ( rule__Env__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1469:4: rule__Env__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__Env__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1472:2: ( ( rule__Env__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1473:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getEnvAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1474:3: ( rule__Env__Key_value_pairsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_KV_PAIR_EQUALS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1474:4: rule__Env__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Env__Key_value_pairsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:1484:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDsl.g:1489:2: rule__Label__Group__0__Impl rule__Label__Group__1
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
    // InternalMyDsl.g:1496:1: rule__Label__Group__0__Impl : ( ( rule__Label__KeyAssignment_0 ) ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1500:1: ( ( ( rule__Label__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1501:1: ( ( rule__Label__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1501:1: ( ( rule__Label__KeyAssignment_0 ) )
            // InternalMyDsl.g:1502:2: ( rule__Label__KeyAssignment_0 )
            {
             before(grammarAccess.getLabelAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1503:2: ( rule__Label__KeyAssignment_0 )
            // InternalMyDsl.g:1503:3: rule__Label__KeyAssignment_0
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
    // InternalMyDsl.g:1511:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( rule__Label__Group__1__Impl )
            // InternalMyDsl.g:1516:2: rule__Label__Group__1__Impl
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
    // InternalMyDsl.g:1522:1: rule__Label__Group__1__Impl : ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) ) )
            // InternalMyDsl.g:1527:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1527:1: ( ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* ) )
            // InternalMyDsl.g:1528:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) ) ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            {
            // InternalMyDsl.g:1528:2: ( ( rule__Label__Key_value_pairsAssignment_1 ) )
            // InternalMyDsl.g:1529:3: ( rule__Label__Key_value_pairsAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1530:3: ( rule__Label__Key_value_pairsAssignment_1 )
            // InternalMyDsl.g:1530:4: rule__Label__Key_value_pairsAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__Label__Key_value_pairsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 

            }

            // InternalMyDsl.g:1533:2: ( ( rule__Label__Key_value_pairsAssignment_1 )* )
            // InternalMyDsl.g:1534:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            {
             before(grammarAccess.getLabelAccess().getKey_value_pairsAssignment_1()); 
            // InternalMyDsl.g:1535:3: ( rule__Label__Key_value_pairsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_KV_PAIR_EQUALS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1535:4: rule__Label__Key_value_pairsAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Label__Key_value_pairsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1545:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:1550:2: rule__Add__Group__0__Impl rule__Add__Group__1
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
    // InternalMyDsl.g:1557:1: rule__Add__Group__0__Impl : ( ( rule__Add__KeyAssignment_0 ) ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( ( ( rule__Add__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1562:1: ( ( rule__Add__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1562:1: ( ( rule__Add__KeyAssignment_0 ) )
            // InternalMyDsl.g:1563:2: ( rule__Add__KeyAssignment_0 )
            {
             before(grammarAccess.getAddAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1564:2: ( rule__Add__KeyAssignment_0 )
            // InternalMyDsl.g:1564:3: rule__Add__KeyAssignment_0
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
    // InternalMyDsl.g:1572:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalMyDsl.g:1577:2: rule__Add__Group__1__Impl rule__Add__Group__2
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
    // InternalMyDsl.g:1584:1: rule__Add__Group__1__Impl : ( ( rule__Add__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( ( ( rule__Add__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:1589:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:1589:1: ( ( rule__Add__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:1590:2: ( rule__Add__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getAddAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:1591:2: ( rule__Add__Chown_optionsAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_CHOWN_OPTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1591:3: rule__Add__Chown_optionsAssignment_1
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
    // InternalMyDsl.g:1599:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalMyDsl.g:1604:2: rule__Add__Group__2__Impl rule__Add__Group__3
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
    // InternalMyDsl.g:1611:1: rule__Add__Group__2__Impl : ( ( rule__Add__FileAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( ( ( rule__Add__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1616:1: ( ( rule__Add__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1616:1: ( ( rule__Add__FileAssignment_2 ) )
            // InternalMyDsl.g:1617:2: ( rule__Add__FileAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1618:2: ( rule__Add__FileAssignment_2 )
            // InternalMyDsl.g:1618:3: rule__Add__FileAssignment_2
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
    // InternalMyDsl.g:1626:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalMyDsl.g:1631:2: rule__Add__Group__3__Impl rule__Add__Group__4
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
    // InternalMyDsl.g:1638:1: rule__Add__Group__3__Impl : ( ( rule__Add__Alternatives_3 )? ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1642:1: ( ( ( rule__Add__Alternatives_3 )? ) )
            // InternalMyDsl.g:1643:1: ( ( rule__Add__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1643:1: ( ( rule__Add__Alternatives_3 )? )
            // InternalMyDsl.g:1644:2: ( rule__Add__Alternatives_3 )?
            {
             before(grammarAccess.getAddAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1645:2: ( rule__Add__Alternatives_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=14 && LA20_0<=15)||LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1645:3: rule__Add__Alternatives_3
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
    // InternalMyDsl.g:1653:1: rule__Add__Group__4 : rule__Add__Group__4__Impl ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( rule__Add__Group__4__Impl )
            // InternalMyDsl.g:1658:2: rule__Add__Group__4__Impl
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
    // InternalMyDsl.g:1664:1: rule__Add__Group__4__Impl : ( ( rule__Add__DirectoryAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( ( ( rule__Add__DirectoryAssignment_4 ) ) )
            // InternalMyDsl.g:1669:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            {
            // InternalMyDsl.g:1669:1: ( ( rule__Add__DirectoryAssignment_4 ) )
            // InternalMyDsl.g:1670:2: ( rule__Add__DirectoryAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getDirectoryAssignment_4()); 
            // InternalMyDsl.g:1671:2: ( rule__Add__DirectoryAssignment_4 )
            // InternalMyDsl.g:1671:3: rule__Add__DirectoryAssignment_4
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
    // InternalMyDsl.g:1680:1: rule__Add__Group_3_1__0 : rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 ;
    public final void rule__Add__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1 )
            // InternalMyDsl.g:1685:2: rule__Add__Group_3_1__0__Impl rule__Add__Group_3_1__1
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
    // InternalMyDsl.g:1692:1: rule__Add__Group_3_1__0__Impl : ( '.' ) ;
    public final void rule__Add__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( ( '.' ) )
            // InternalMyDsl.g:1697:1: ( '.' )
            {
            // InternalMyDsl.g:1697:1: ( '.' )
            // InternalMyDsl.g:1698:2: '.'
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
    // InternalMyDsl.g:1707:1: rule__Add__Group_3_1__1 : rule__Add__Group_3_1__1__Impl ;
    public final void rule__Add__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( rule__Add__Group_3_1__1__Impl )
            // InternalMyDsl.g:1712:2: rule__Add__Group_3_1__1__Impl
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
    // InternalMyDsl.g:1718:1: rule__Add__Group_3_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Add__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1723:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1723:1: ( RULE_ID )
            // InternalMyDsl.g:1724:2: RULE_ID
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
    // InternalMyDsl.g:1734:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalMyDsl.g:1739:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
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
    // InternalMyDsl.g:1746:1: rule__Copy__Group__0__Impl : ( ( rule__Copy__KeyAssignment_0 ) ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( ( ( rule__Copy__KeyAssignment_0 ) ) )
            // InternalMyDsl.g:1751:1: ( ( rule__Copy__KeyAssignment_0 ) )
            {
            // InternalMyDsl.g:1751:1: ( ( rule__Copy__KeyAssignment_0 ) )
            // InternalMyDsl.g:1752:2: ( rule__Copy__KeyAssignment_0 )
            {
             before(grammarAccess.getCopyAccess().getKeyAssignment_0()); 
            // InternalMyDsl.g:1753:2: ( rule__Copy__KeyAssignment_0 )
            // InternalMyDsl.g:1753:3: rule__Copy__KeyAssignment_0
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
    // InternalMyDsl.g:1761:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalMyDsl.g:1766:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
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
    // InternalMyDsl.g:1773:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__Chown_optionsAssignment_1 )? ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( ( rule__Copy__Chown_optionsAssignment_1 )? ) )
            // InternalMyDsl.g:1778:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            {
            // InternalMyDsl.g:1778:1: ( ( rule__Copy__Chown_optionsAssignment_1 )? )
            // InternalMyDsl.g:1779:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            {
             before(grammarAccess.getCopyAccess().getChown_optionsAssignment_1()); 
            // InternalMyDsl.g:1780:2: ( rule__Copy__Chown_optionsAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_CHOWN_OPTION) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1780:3: rule__Copy__Chown_optionsAssignment_1
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
    // InternalMyDsl.g:1788:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalMyDsl.g:1793:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
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
    // InternalMyDsl.g:1800:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__FileAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( ( rule__Copy__FileAssignment_2 ) ) )
            // InternalMyDsl.g:1805:1: ( ( rule__Copy__FileAssignment_2 ) )
            {
            // InternalMyDsl.g:1805:1: ( ( rule__Copy__FileAssignment_2 ) )
            // InternalMyDsl.g:1806:2: ( rule__Copy__FileAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getFileAssignment_2()); 
            // InternalMyDsl.g:1807:2: ( rule__Copy__FileAssignment_2 )
            // InternalMyDsl.g:1807:3: rule__Copy__FileAssignment_2
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
    // InternalMyDsl.g:1815:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalMyDsl.g:1820:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
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
    // InternalMyDsl.g:1827:1: rule__Copy__Group__3__Impl : ( ( rule__Copy__Alternatives_3 )? ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( ( ( rule__Copy__Alternatives_3 )? ) )
            // InternalMyDsl.g:1832:1: ( ( rule__Copy__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1832:1: ( ( rule__Copy__Alternatives_3 )? )
            // InternalMyDsl.g:1833:2: ( rule__Copy__Alternatives_3 )?
            {
             before(grammarAccess.getCopyAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1834:2: ( rule__Copy__Alternatives_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=14 && LA22_0<=15)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1834:3: rule__Copy__Alternatives_3
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
    // InternalMyDsl.g:1842:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalMyDsl.g:1847:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
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
    // InternalMyDsl.g:1854:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__Group_4__0 )? ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( ( ( rule__Copy__Group_4__0 )? ) )
            // InternalMyDsl.g:1859:1: ( ( rule__Copy__Group_4__0 )? )
            {
            // InternalMyDsl.g:1859:1: ( ( rule__Copy__Group_4__0 )? )
            // InternalMyDsl.g:1860:2: ( rule__Copy__Group_4__0 )?
            {
             before(grammarAccess.getCopyAccess().getGroup_4()); 
            // InternalMyDsl.g:1861:2: ( rule__Copy__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1861:3: rule__Copy__Group_4__0
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
    // InternalMyDsl.g:1869:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( rule__Copy__Group__5__Impl )
            // InternalMyDsl.g:1874:2: rule__Copy__Group__5__Impl
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
    // InternalMyDsl.g:1880:1: rule__Copy__Group__5__Impl : ( ( rule__Copy__DirectoryAssignment_5 ) ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1884:1: ( ( ( rule__Copy__DirectoryAssignment_5 ) ) )
            // InternalMyDsl.g:1885:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            {
            // InternalMyDsl.g:1885:1: ( ( rule__Copy__DirectoryAssignment_5 ) )
            // InternalMyDsl.g:1886:2: ( rule__Copy__DirectoryAssignment_5 )
            {
             before(grammarAccess.getCopyAccess().getDirectoryAssignment_5()); 
            // InternalMyDsl.g:1887:2: ( rule__Copy__DirectoryAssignment_5 )
            // InternalMyDsl.g:1887:3: rule__Copy__DirectoryAssignment_5
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
    // InternalMyDsl.g:1896:1: rule__Copy__Group_4__0 : rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 ;
    public final void rule__Copy__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1 )
            // InternalMyDsl.g:1901:2: rule__Copy__Group_4__0__Impl rule__Copy__Group_4__1
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
    // InternalMyDsl.g:1908:1: rule__Copy__Group_4__0__Impl : ( '.' ) ;
    public final void rule__Copy__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( ( '.' ) )
            // InternalMyDsl.g:1913:1: ( '.' )
            {
            // InternalMyDsl.g:1913:1: ( '.' )
            // InternalMyDsl.g:1914:2: '.'
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
    // InternalMyDsl.g:1923:1: rule__Copy__Group_4__1 : rule__Copy__Group_4__1__Impl ;
    public final void rule__Copy__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( rule__Copy__Group_4__1__Impl )
            // InternalMyDsl.g:1928:2: rule__Copy__Group_4__1__Impl
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
    // InternalMyDsl.g:1934:1: rule__Copy__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__Copy__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1938:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1939:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1939:1: ( RULE_ID )
            // InternalMyDsl.g:1940:2: RULE_ID
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
    // InternalMyDsl.g:1950:1: rule__IMAGE_NAME__Group__0 : rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 ;
    public final void rule__IMAGE_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1 )
            // InternalMyDsl.g:1955:2: rule__IMAGE_NAME__Group__0__Impl rule__IMAGE_NAME__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1962:1: rule__IMAGE_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1967:1: ( RULE_ID )
            {
            // InternalMyDsl.g:1967:1: ( RULE_ID )
            // InternalMyDsl.g:1968:2: RULE_ID
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
    // InternalMyDsl.g:1977:1: rule__IMAGE_NAME__Group__1 : rule__IMAGE_NAME__Group__1__Impl ;
    public final void rule__IMAGE_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( rule__IMAGE_NAME__Group__1__Impl )
            // InternalMyDsl.g:1982:2: rule__IMAGE_NAME__Group__1__Impl
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
    // InternalMyDsl.g:1988:1: rule__IMAGE_NAME__Group__1__Impl : ( ( rule__IMAGE_NAME__Group_1__0 )* ) ;
    public final void rule__IMAGE_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1992:1: ( ( ( rule__IMAGE_NAME__Group_1__0 )* ) )
            // InternalMyDsl.g:1993:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            {
            // InternalMyDsl.g:1993:1: ( ( rule__IMAGE_NAME__Group_1__0 )* )
            // InternalMyDsl.g:1994:2: ( rule__IMAGE_NAME__Group_1__0 )*
            {
             before(grammarAccess.getIMAGE_NAMEAccess().getGroup_1()); 
            // InternalMyDsl.g:1995:2: ( rule__IMAGE_NAME__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1995:3: rule__IMAGE_NAME__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__IMAGE_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:2004:1: rule__IMAGE_NAME__Group_1__0 : rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 ;
    public final void rule__IMAGE_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1 )
            // InternalMyDsl.g:2009:2: rule__IMAGE_NAME__Group_1__0__Impl rule__IMAGE_NAME__Group_1__1
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
    // InternalMyDsl.g:2016:1: rule__IMAGE_NAME__Group_1__0__Impl : ( '/' ) ;
    public final void rule__IMAGE_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( ( '/' ) )
            // InternalMyDsl.g:2021:1: ( '/' )
            {
            // InternalMyDsl.g:2021:1: ( '/' )
            // InternalMyDsl.g:2022:2: '/'
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
    // InternalMyDsl.g:2031:1: rule__IMAGE_NAME__Group_1__1 : rule__IMAGE_NAME__Group_1__1__Impl ;
    public final void rule__IMAGE_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__IMAGE_NAME__Group_1__1__Impl )
            // InternalMyDsl.g:2036:2: rule__IMAGE_NAME__Group_1__1__Impl
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
    // InternalMyDsl.g:2042:1: rule__IMAGE_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__IMAGE_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2046:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2047:1: ( RULE_ID )
            {
            // InternalMyDsl.g:2047:1: ( RULE_ID )
            // InternalMyDsl.g:2048:2: RULE_ID
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
    // InternalMyDsl.g:2058:1: rule__IMAGE_TAG__Group__0 : rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 ;
    public final void rule__IMAGE_TAG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1 )
            // InternalMyDsl.g:2063:2: rule__IMAGE_TAG__Group__0__Impl rule__IMAGE_TAG__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2070:1: rule__IMAGE_TAG__Group__0__Impl : ( ':' ) ;
    public final void rule__IMAGE_TAG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( ( ':' ) )
            // InternalMyDsl.g:2075:1: ( ':' )
            {
            // InternalMyDsl.g:2075:1: ( ':' )
            // InternalMyDsl.g:2076:2: ':'
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
    // InternalMyDsl.g:2085:1: rule__IMAGE_TAG__Group__1 : rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 ;
    public final void rule__IMAGE_TAG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2 )
            // InternalMyDsl.g:2090:2: rule__IMAGE_TAG__Group__1__Impl rule__IMAGE_TAG__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2097:1: rule__IMAGE_TAG__Group__1__Impl : ( ( rule__IMAGE_TAG__Alternatives_1 ) ) ;
    public final void rule__IMAGE_TAG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( ( rule__IMAGE_TAG__Alternatives_1 ) ) )
            // InternalMyDsl.g:2102:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2102:1: ( ( rule__IMAGE_TAG__Alternatives_1 ) )
            // InternalMyDsl.g:2103:2: ( rule__IMAGE_TAG__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2104:2: ( rule__IMAGE_TAG__Alternatives_1 )
            // InternalMyDsl.g:2104:3: rule__IMAGE_TAG__Alternatives_1
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
    // InternalMyDsl.g:2112:1: rule__IMAGE_TAG__Group__2 : rule__IMAGE_TAG__Group__2__Impl ;
    public final void rule__IMAGE_TAG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( rule__IMAGE_TAG__Group__2__Impl )
            // InternalMyDsl.g:2117:2: rule__IMAGE_TAG__Group__2__Impl
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
    // InternalMyDsl.g:2123:1: rule__IMAGE_TAG__Group__2__Impl : ( ( rule__IMAGE_TAG__Alternatives_2 )* ) ;
    public final void rule__IMAGE_TAG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2127:1: ( ( ( rule__IMAGE_TAG__Alternatives_2 )* ) )
            // InternalMyDsl.g:2128:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2128:1: ( ( rule__IMAGE_TAG__Alternatives_2 )* )
            // InternalMyDsl.g:2129:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_TAGAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2130:2: ( rule__IMAGE_TAG__Alternatives_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||(LA25_0>=16 && LA25_0<=17)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2130:3: rule__IMAGE_TAG__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__IMAGE_TAG__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMyDsl.g:2139:1: rule__IMAGE_DIGEST__Group__0 : rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 ;
    public final void rule__IMAGE_DIGEST__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1 )
            // InternalMyDsl.g:2144:2: rule__IMAGE_DIGEST__Group__0__Impl rule__IMAGE_DIGEST__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2151:1: rule__IMAGE_DIGEST__Group__0__Impl : ( '@' ) ;
    public final void rule__IMAGE_DIGEST__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( ( '@' ) )
            // InternalMyDsl.g:2156:1: ( '@' )
            {
            // InternalMyDsl.g:2156:1: ( '@' )
            // InternalMyDsl.g:2157:2: '@'
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
    // InternalMyDsl.g:2166:1: rule__IMAGE_DIGEST__Group__1 : rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 ;
    public final void rule__IMAGE_DIGEST__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2 )
            // InternalMyDsl.g:2171:2: rule__IMAGE_DIGEST__Group__1__Impl rule__IMAGE_DIGEST__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2178:1: rule__IMAGE_DIGEST__Group__1__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) ;
    public final void rule__IMAGE_DIGEST__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_1 ) ) )
            // InternalMyDsl.g:2183:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2183:1: ( ( rule__IMAGE_DIGEST__Alternatives_1 ) )
            // InternalMyDsl.g:2184:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2185:2: ( rule__IMAGE_DIGEST__Alternatives_1 )
            // InternalMyDsl.g:2185:3: rule__IMAGE_DIGEST__Alternatives_1
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
    // InternalMyDsl.g:2193:1: rule__IMAGE_DIGEST__Group__2 : rule__IMAGE_DIGEST__Group__2__Impl ;
    public final void rule__IMAGE_DIGEST__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( rule__IMAGE_DIGEST__Group__2__Impl )
            // InternalMyDsl.g:2198:2: rule__IMAGE_DIGEST__Group__2__Impl
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
    // InternalMyDsl.g:2204:1: rule__IMAGE_DIGEST__Group__2__Impl : ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) ;
    public final void rule__IMAGE_DIGEST__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2208:1: ( ( ( rule__IMAGE_DIGEST__Alternatives_2 )* ) )
            // InternalMyDsl.g:2209:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            {
            // InternalMyDsl.g:2209:1: ( ( rule__IMAGE_DIGEST__Alternatives_2 )* )
            // InternalMyDsl.g:2210:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            {
             before(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_2()); 
            // InternalMyDsl.g:2211:2: ( rule__IMAGE_DIGEST__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||(LA26_0>=16 && LA26_0<=17)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:2211:3: rule__IMAGE_DIGEST__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__IMAGE_DIGEST__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMyDsl.g:2220:1: rule__EXEC_FORM__Group__0 : rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 ;
    public final void rule__EXEC_FORM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1 )
            // InternalMyDsl.g:2225:2: rule__EXEC_FORM__Group__0__Impl rule__EXEC_FORM__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2232:1: rule__EXEC_FORM__Group__0__Impl : ( ' [' ) ;
    public final void rule__EXEC_FORM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2236:1: ( ( ' [' ) )
            // InternalMyDsl.g:2237:1: ( ' [' )
            {
            // InternalMyDsl.g:2237:1: ( ' [' )
            // InternalMyDsl.g:2238:2: ' ['
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
    // InternalMyDsl.g:2247:1: rule__EXEC_FORM__Group__1 : rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 ;
    public final void rule__EXEC_FORM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2 )
            // InternalMyDsl.g:2252:2: rule__EXEC_FORM__Group__1__Impl rule__EXEC_FORM__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2259:1: rule__EXEC_FORM__Group__1__Impl : ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) ;
    public final void rule__EXEC_FORM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) ) )
            // InternalMyDsl.g:2264:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            {
            // InternalMyDsl.g:2264:1: ( ( rule__EXEC_FORM__ExecutableAssignment_1 ) )
            // InternalMyDsl.g:2265:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            {
             before(grammarAccess.getEXEC_FORMAccess().getExecutableAssignment_1()); 
            // InternalMyDsl.g:2266:2: ( rule__EXEC_FORM__ExecutableAssignment_1 )
            // InternalMyDsl.g:2266:3: rule__EXEC_FORM__ExecutableAssignment_1
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
    // InternalMyDsl.g:2274:1: rule__EXEC_FORM__Group__2 : rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 ;
    public final void rule__EXEC_FORM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3 )
            // InternalMyDsl.g:2279:2: rule__EXEC_FORM__Group__2__Impl rule__EXEC_FORM__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2286:1: rule__EXEC_FORM__Group__2__Impl : ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) ;
    public final void rule__EXEC_FORM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( ( rule__EXEC_FORM__ParametersAssignment_2 )* ) )
            // InternalMyDsl.g:2291:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            {
            // InternalMyDsl.g:2291:1: ( ( rule__EXEC_FORM__ParametersAssignment_2 )* )
            // InternalMyDsl.g:2292:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            {
             before(grammarAccess.getEXEC_FORMAccess().getParametersAssignment_2()); 
            // InternalMyDsl.g:2293:2: ( rule__EXEC_FORM__ParametersAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_EXEC_FORM_PARAMETER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2293:3: rule__EXEC_FORM__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EXEC_FORM__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyDsl.g:2301:1: rule__EXEC_FORM__Group__3 : rule__EXEC_FORM__Group__3__Impl ;
    public final void rule__EXEC_FORM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( rule__EXEC_FORM__Group__3__Impl )
            // InternalMyDsl.g:2306:2: rule__EXEC_FORM__Group__3__Impl
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
    // InternalMyDsl.g:2312:1: rule__EXEC_FORM__Group__3__Impl : ( ']' ) ;
    public final void rule__EXEC_FORM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2316:1: ( ( ']' ) )
            // InternalMyDsl.g:2317:1: ( ']' )
            {
            // InternalMyDsl.g:2317:1: ( ']' )
            // InternalMyDsl.g:2318:2: ']'
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


    // $ANTLR start "rule__Dockerfile__StatementsAssignment_0"
    // InternalMyDsl.g:2328:1: rule__Dockerfile__StatementsAssignment_0 : ( ruleInstruction ) ;
    public final void rule__Dockerfile__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:2333:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:2333:2: ( ruleInstruction )
            // InternalMyDsl.g:2334:3: ruleInstruction
            {
             before(grammarAccess.getDockerfileAccess().getStatementsInstructionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getDockerfileAccess().getStatementsInstructionParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Instruction__StatementAssignment"
    // InternalMyDsl.g:2343:1: rule__Instruction__StatementAssignment : ( ( rule__Instruction__StatementAlternatives_0 ) ) ;
    public final void rule__Instruction__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( ( rule__Instruction__StatementAlternatives_0 ) ) )
            // InternalMyDsl.g:2348:2: ( ( rule__Instruction__StatementAlternatives_0 ) )
            {
            // InternalMyDsl.g:2348:2: ( ( rule__Instruction__StatementAlternatives_0 ) )
            // InternalMyDsl.g:2349:3: ( rule__Instruction__StatementAlternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getStatementAlternatives_0()); 
            // InternalMyDsl.g:2350:3: ( rule__Instruction__StatementAlternatives_0 )
            // InternalMyDsl.g:2350:4: rule__Instruction__StatementAlternatives_0
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
    // InternalMyDsl.g:2358:1: rule__From__KeyAssignment_0 : ( ( 'FROM ' ) ) ;
    public final void rule__From__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( ( ( 'FROM ' ) ) )
            // InternalMyDsl.g:2363:2: ( ( 'FROM ' ) )
            {
            // InternalMyDsl.g:2363:2: ( ( 'FROM ' ) )
            // InternalMyDsl.g:2364:3: ( 'FROM ' )
            {
             before(grammarAccess.getFromAccess().getKeyFROMKeyword_0_0()); 
            // InternalMyDsl.g:2365:3: ( 'FROM ' )
            // InternalMyDsl.g:2366:4: 'FROM '
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
    // InternalMyDsl.g:2377:1: rule__From__Platform_optionAssignment_1 : ( RULE_PLATFORM_OPTION ) ;
    public final void rule__From__Platform_optionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( ( RULE_PLATFORM_OPTION ) )
            // InternalMyDsl.g:2382:2: ( RULE_PLATFORM_OPTION )
            {
            // InternalMyDsl.g:2382:2: ( RULE_PLATFORM_OPTION )
            // InternalMyDsl.g:2383:3: RULE_PLATFORM_OPTION
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
    // InternalMyDsl.g:2392:1: rule__From__NameAssignment_2 : ( ruleIMAGE_NAME ) ;
    public final void rule__From__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2396:1: ( ( ruleIMAGE_NAME ) )
            // InternalMyDsl.g:2397:2: ( ruleIMAGE_NAME )
            {
            // InternalMyDsl.g:2397:2: ( ruleIMAGE_NAME )
            // InternalMyDsl.g:2398:3: ruleIMAGE_NAME
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
    // InternalMyDsl.g:2407:1: rule__From__Tag_or_digestAssignment_3 : ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) ;
    public final void rule__From__Tag_or_digestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( ( rule__From__Tag_or_digestAlternatives_3_0 ) ) )
            // InternalMyDsl.g:2412:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            {
            // InternalMyDsl.g:2412:2: ( ( rule__From__Tag_or_digestAlternatives_3_0 ) )
            // InternalMyDsl.g:2413:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            {
             before(grammarAccess.getFromAccess().getTag_or_digestAlternatives_3_0()); 
            // InternalMyDsl.g:2414:3: ( rule__From__Tag_or_digestAlternatives_3_0 )
            // InternalMyDsl.g:2414:4: rule__From__Tag_or_digestAlternatives_3_0
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
    // InternalMyDsl.g:2422:1: rule__Cmd__KeyAssignment_0 : ( ( 'CMD' ) ) ;
    public final void rule__Cmd__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( ( ( 'CMD' ) ) )
            // InternalMyDsl.g:2427:2: ( ( 'CMD' ) )
            {
            // InternalMyDsl.g:2427:2: ( ( 'CMD' ) )
            // InternalMyDsl.g:2428:3: ( 'CMD' )
            {
             before(grammarAccess.getCmdAccess().getKeyCMDKeyword_0_0()); 
            // InternalMyDsl.g:2429:3: ( 'CMD' )
            // InternalMyDsl.g:2430:4: 'CMD'
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
    // InternalMyDsl.g:2441:1: rule__Cmd__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Cmd__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2446:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2446:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2447:3: ruleEXEC_FORM
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
    // InternalMyDsl.g:2456:1: rule__Cmd__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Cmd__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2461:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2461:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2462:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2471:1: rule__Run__KeyAssignment_0 : ( ( 'RUN' ) ) ;
    public final void rule__Run__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( ( ( 'RUN' ) ) )
            // InternalMyDsl.g:2476:2: ( ( 'RUN' ) )
            {
            // InternalMyDsl.g:2476:2: ( ( 'RUN' ) )
            // InternalMyDsl.g:2477:3: ( 'RUN' )
            {
             before(grammarAccess.getRunAccess().getKeyRUNKeyword_0_0()); 
            // InternalMyDsl.g:2478:3: ( 'RUN' )
            // InternalMyDsl.g:2479:4: 'RUN'
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
    // InternalMyDsl.g:2490:1: rule__Run__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Run__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2495:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2495:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2496:3: ruleEXEC_FORM
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
    // InternalMyDsl.g:2505:1: rule__Run__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Run__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2510:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2510:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2511:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2520:1: rule__Entrypoint__KeyAssignment_0 : ( ( 'ENTRYPOINT' ) ) ;
    public final void rule__Entrypoint__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( ( ( 'ENTRYPOINT' ) ) )
            // InternalMyDsl.g:2525:2: ( ( 'ENTRYPOINT' ) )
            {
            // InternalMyDsl.g:2525:2: ( ( 'ENTRYPOINT' ) )
            // InternalMyDsl.g:2526:3: ( 'ENTRYPOINT' )
            {
             before(grammarAccess.getEntrypointAccess().getKeyENTRYPOINTKeyword_0_0()); 
            // InternalMyDsl.g:2527:3: ( 'ENTRYPOINT' )
            // InternalMyDsl.g:2528:4: 'ENTRYPOINT'
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
    // InternalMyDsl.g:2539:1: rule__Entrypoint__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Entrypoint__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2544:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2544:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2545:3: ruleEXEC_FORM
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
    // InternalMyDsl.g:2554:1: rule__Entrypoint__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Entrypoint__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2558:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2559:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2559:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2560:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2569:1: rule__Volume__KeyAssignment_0 : ( ( 'VOLUME' ) ) ;
    public final void rule__Volume__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( ( 'VOLUME' ) ) )
            // InternalMyDsl.g:2574:2: ( ( 'VOLUME' ) )
            {
            // InternalMyDsl.g:2574:2: ( ( 'VOLUME' ) )
            // InternalMyDsl.g:2575:3: ( 'VOLUME' )
            {
             before(grammarAccess.getVolumeAccess().getKeyVOLUMEKeyword_0_0()); 
            // InternalMyDsl.g:2576:3: ( 'VOLUME' )
            // InternalMyDsl.g:2577:4: 'VOLUME'
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
    // InternalMyDsl.g:2588:1: rule__Volume__Exec_formAssignment_1_0 : ( ruleEXEC_FORM ) ;
    public final void rule__Volume__Exec_formAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( ( ruleEXEC_FORM ) )
            // InternalMyDsl.g:2593:2: ( ruleEXEC_FORM )
            {
            // InternalMyDsl.g:2593:2: ( ruleEXEC_FORM )
            // InternalMyDsl.g:2594:3: ruleEXEC_FORM
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
    // InternalMyDsl.g:2603:1: rule__Volume__Shell_formAssignment_1_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Volume__Shell_formAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2608:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2608:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2609:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2618:1: rule__Maintainer__KeyAssignment_0 : ( ( 'MAINTAINER' ) ) ;
    public final void rule__Maintainer__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2622:1: ( ( ( 'MAINTAINER' ) ) )
            // InternalMyDsl.g:2623:2: ( ( 'MAINTAINER' ) )
            {
            // InternalMyDsl.g:2623:2: ( ( 'MAINTAINER' ) )
            // InternalMyDsl.g:2624:3: ( 'MAINTAINER' )
            {
             before(grammarAccess.getMaintainerAccess().getKeyMAINTAINERKeyword_0_0()); 
            // InternalMyDsl.g:2625:3: ( 'MAINTAINER' )
            // InternalMyDsl.g:2626:4: 'MAINTAINER'
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
    // InternalMyDsl.g:2637:1: rule__Maintainer__NameAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Maintainer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2642:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2642:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2643:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2652:1: rule__Expose__KeyAssignment_0 : ( ( 'EXPOSE' ) ) ;
    public final void rule__Expose__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( ( 'EXPOSE' ) ) )
            // InternalMyDsl.g:2657:2: ( ( 'EXPOSE' ) )
            {
            // InternalMyDsl.g:2657:2: ( ( 'EXPOSE' ) )
            // InternalMyDsl.g:2658:3: ( 'EXPOSE' )
            {
             before(grammarAccess.getExposeAccess().getKeyEXPOSEKeyword_0_0()); 
            // InternalMyDsl.g:2659:3: ( 'EXPOSE' )
            // InternalMyDsl.g:2660:4: 'EXPOSE'
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
    // InternalMyDsl.g:2671:1: rule__Expose__PortsAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Expose__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2676:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2676:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2677:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2686:1: rule__Workdir__KeyAssignment_0 : ( ( 'WORKDIR' ) ) ;
    public final void rule__Workdir__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( ( ( 'WORKDIR' ) ) )
            // InternalMyDsl.g:2691:2: ( ( 'WORKDIR' ) )
            {
            // InternalMyDsl.g:2691:2: ( ( 'WORKDIR' ) )
            // InternalMyDsl.g:2692:3: ( 'WORKDIR' )
            {
             before(grammarAccess.getWorkdirAccess().getKeyWORKDIRKeyword_0_0()); 
            // InternalMyDsl.g:2693:3: ( 'WORKDIR' )
            // InternalMyDsl.g:2694:4: 'WORKDIR'
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
    // InternalMyDsl.g:2705:1: rule__Workdir__PathAssignment_1 : ( RULE_SHELL_CMD ) ;
    public final void rule__Workdir__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2710:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2710:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2711:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2720:1: rule__Env__KeyAssignment_0 : ( ( 'ENV ' ) ) ;
    public final void rule__Env__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( ( ( 'ENV ' ) ) )
            // InternalMyDsl.g:2725:2: ( ( 'ENV ' ) )
            {
            // InternalMyDsl.g:2725:2: ( ( 'ENV ' ) )
            // InternalMyDsl.g:2726:3: ( 'ENV ' )
            {
             before(grammarAccess.getEnvAccess().getKeyENVKeyword_0_0()); 
            // InternalMyDsl.g:2727:3: ( 'ENV ' )
            // InternalMyDsl.g:2728:4: 'ENV '
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


    // $ANTLR start "rule__Label__KeyAssignment_0"
    // InternalMyDsl.g:2754:1: rule__Label__KeyAssignment_0 : ( ( 'LABEL ' ) ) ;
    public final void rule__Label__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2758:1: ( ( ( 'LABEL ' ) ) )
            // InternalMyDsl.g:2759:2: ( ( 'LABEL ' ) )
            {
            // InternalMyDsl.g:2759:2: ( ( 'LABEL ' ) )
            // InternalMyDsl.g:2760:3: ( 'LABEL ' )
            {
             before(grammarAccess.getLabelAccess().getKeyLABELKeyword_0_0()); 
            // InternalMyDsl.g:2761:3: ( 'LABEL ' )
            // InternalMyDsl.g:2762:4: 'LABEL '
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
    // InternalMyDsl.g:2773:1: rule__Label__Key_value_pairsAssignment_1 : ( RULE_KV_PAIR_EQUALS ) ;
    public final void rule__Label__Key_value_pairsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( ( RULE_KV_PAIR_EQUALS ) )
            // InternalMyDsl.g:2778:2: ( RULE_KV_PAIR_EQUALS )
            {
            // InternalMyDsl.g:2778:2: ( RULE_KV_PAIR_EQUALS )
            // InternalMyDsl.g:2779:3: RULE_KV_PAIR_EQUALS
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
    // InternalMyDsl.g:2788:1: rule__Add__KeyAssignment_0 : ( ( 'ADD ' ) ) ;
    public final void rule__Add__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2792:1: ( ( ( 'ADD ' ) ) )
            // InternalMyDsl.g:2793:2: ( ( 'ADD ' ) )
            {
            // InternalMyDsl.g:2793:2: ( ( 'ADD ' ) )
            // InternalMyDsl.g:2794:3: ( 'ADD ' )
            {
             before(grammarAccess.getAddAccess().getKeyADDKeyword_0_0()); 
            // InternalMyDsl.g:2795:3: ( 'ADD ' )
            // InternalMyDsl.g:2796:4: 'ADD '
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
    // InternalMyDsl.g:2807:1: rule__Add__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Add__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2811:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:2812:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:2812:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:2813:3: RULE_CHOWN_OPTION
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
    // InternalMyDsl.g:2822:1: rule__Add__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Add__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2826:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2827:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2827:2: ( RULE_ID )
            // InternalMyDsl.g:2828:3: RULE_ID
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
    // InternalMyDsl.g:2837:1: rule__Add__DirectoryAssignment_4 : ( RULE_SHELL_CMD ) ;
    public final void rule__Add__DirectoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2841:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2842:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2842:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2843:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2852:1: rule__Copy__KeyAssignment_0 : ( ( 'COPY ' ) ) ;
    public final void rule__Copy__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2856:1: ( ( ( 'COPY ' ) ) )
            // InternalMyDsl.g:2857:2: ( ( 'COPY ' ) )
            {
            // InternalMyDsl.g:2857:2: ( ( 'COPY ' ) )
            // InternalMyDsl.g:2858:3: ( 'COPY ' )
            {
             before(grammarAccess.getCopyAccess().getKeyCOPYKeyword_0_0()); 
            // InternalMyDsl.g:2859:3: ( 'COPY ' )
            // InternalMyDsl.g:2860:4: 'COPY '
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
    // InternalMyDsl.g:2871:1: rule__Copy__Chown_optionsAssignment_1 : ( RULE_CHOWN_OPTION ) ;
    public final void rule__Copy__Chown_optionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( ( RULE_CHOWN_OPTION ) )
            // InternalMyDsl.g:2876:2: ( RULE_CHOWN_OPTION )
            {
            // InternalMyDsl.g:2876:2: ( RULE_CHOWN_OPTION )
            // InternalMyDsl.g:2877:3: RULE_CHOWN_OPTION
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
    // InternalMyDsl.g:2886:1: rule__Copy__FileAssignment_2 : ( RULE_ID ) ;
    public final void rule__Copy__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2891:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2891:2: ( RULE_ID )
            // InternalMyDsl.g:2892:3: RULE_ID
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
    // InternalMyDsl.g:2901:1: rule__Copy__DirectoryAssignment_5 : ( RULE_SHELL_CMD ) ;
    public final void rule__Copy__DirectoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( ( RULE_SHELL_CMD ) )
            // InternalMyDsl.g:2906:2: ( RULE_SHELL_CMD )
            {
            // InternalMyDsl.g:2906:2: ( RULE_SHELL_CMD )
            // InternalMyDsl.g:2907:3: RULE_SHELL_CMD
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
    // InternalMyDsl.g:2916:1: rule__EXEC_FORM__ExecutableAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EXEC_FORM__ExecutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2921:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2921:2: ( RULE_STRING )
            // InternalMyDsl.g:2922:3: RULE_STRING
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
    // InternalMyDsl.g:2931:1: rule__EXEC_FORM__ParametersAssignment_2 : ( RULE_EXEC_FORM_PARAMETER ) ;
    public final void rule__EXEC_FORM__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2935:1: ( ( RULE_EXEC_FORM_PARAMETER ) )
            // InternalMyDsl.g:2936:2: ( RULE_EXEC_FORM_PARAMETER )
            {
            // InternalMyDsl.g:2936:2: ( RULE_EXEC_FORM_PARAMETER )
            // InternalMyDsl.g:2937:3: RULE_EXEC_FORM_PARAMETER
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000007FF800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000002C200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000030070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000030072L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001002L});

}