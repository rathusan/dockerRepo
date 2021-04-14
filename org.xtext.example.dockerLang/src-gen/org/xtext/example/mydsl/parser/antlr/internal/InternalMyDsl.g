/*
 * generated by Xtext 2.20.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDockerfile
entryRuleDockerfile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDockerfileRule()); }
	iv_ruleDockerfile=ruleDockerfile
	{ $current=$iv_ruleDockerfile.current; }
	EOF;

// Rule Dockerfile
ruleDockerfile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0_0());
				}
				lv_statements_0_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDockerfileRule());
					}
					add(
						$current,
						"statements",
						lv_statements_0_0,
						"org.xtext.example.mydsl.MyDsl.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_NL_1=RULE_NL
		{
			newLeafNode(this_NL_1, grammarAccess.getDockerfileAccess().getNLTerminalRuleCall_1());
		}
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='ONBUILD '
			{
				newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getONBUILDKeyword_0());
			}
		)?
		(
			{
				newCompositeNode(grammarAccess.getStatementAccess().getFromParserRuleCall_1_0());
			}
			this_From_1=ruleFrom
			{
				$current = $this_From_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getCmdParserRuleCall_1_1());
			}
			this_Cmd_2=ruleCmd
			{
				$current = $this_Cmd_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getEntrypointParserRuleCall_1_2());
			}
			this_Entrypoint_3=ruleEntrypoint
			{
				$current = $this_Entrypoint_3.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getVolumeParserRuleCall_1_3());
			}
			this_Volume_4=ruleVolume
			{
				$current = $this_Volume_4.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getMaintainerParserRuleCall_1_4());
			}
			this_Maintainer_5=ruleMaintainer
			{
				$current = $this_Maintainer_5.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getExposeParserRuleCall_1_5());
			}
			this_Expose_6=ruleExpose
			{
				$current = $this_Expose_6.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getWorkdirParserRuleCall_1_6());
			}
			this_Workdir_7=ruleWorkdir
			{
				$current = $this_Workdir_7.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getRunParserRuleCall_1_7());
			}
			this_Run_8=ruleRun
			{
				$current = $this_Run_8.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getEnvParserRuleCall_1_8());
			}
			this_Env_9=ruleEnv
			{
				$current = $this_Env_9.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getLabelParserRuleCall_1_9());
			}
			this_Label_10=ruleLabel
			{
				$current = $this_Label_10.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getAddParserRuleCall_1_10());
			}
			this_Add_11=ruleAdd
			{
				$current = $this_Add_11.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getCopyParserRuleCall_1_11());
			}
			this_Copy_12=ruleCopy
			{
				$current = $this_Copy_12.current;
				afterParserOrEnumRuleCall();
			}
			    |
			this_COMMENT_13=RULE_COMMENT
			{
				newLeafNode(this_COMMENT_13, grammarAccess.getStatementAccess().getCOMMENTTerminalRuleCall_1_12());
			}
		)
	)
;

// Entry rule entryRuleFrom
entryRuleFrom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFromRule()); }
	iv_ruleFrom=ruleFrom
	{ $current=$iv_ruleFrom.current; }
	EOF;

// Rule From
ruleFrom returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FROM '
		{
			newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
		}
		(
			(
				lv_platform_option_1_0=RULE_PLATFORM_OPTION
				{
					newLeafNode(lv_platform_option_1_0, grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFromRule());
					}
					setWithLastConsumed(
						$current,
						"platform_option",
						lv_platform_option_1_0,
						"org.xtext.example.mydsl.MyDsl.PLATFORM_OPTION");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFromAccess().getNameIMAGE_NAMEParserRuleCall_2_0());
				}
				lv_name_2_0=ruleIMAGE_NAME
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFromRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.IMAGE_NAME");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFromAccess().getTag_or_digestIMAGE_TAGParserRuleCall_3_0_0());
					}
					lv_tag_or_digest_3_1=ruleIMAGE_TAG
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFromRule());
						}
						set(
							$current,
							"tag_or_digest",
							lv_tag_or_digest_3_1,
							"org.xtext.example.mydsl.MyDsl.IMAGE_TAG");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getFromAccess().getTag_or_digestIMAGE_DIGESTParserRuleCall_3_0_1());
					}
					lv_tag_or_digest_3_2=ruleIMAGE_DIGEST
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFromRule());
						}
						set(
							$current,
							"tag_or_digest",
							lv_tag_or_digest_3_2,
							"org.xtext.example.mydsl.MyDsl.IMAGE_DIGEST");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCmd
entryRuleCmd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCmdRule()); }
	iv_ruleCmd=ruleCmd
	{ $current=$iv_ruleCmd.current; }
	EOF;

// Rule Cmd
ruleCmd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CMD'
		{
			newLeafNode(otherlv_0, grammarAccess.getCmdAccess().getCMDKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getCmdAccess().getEXEC_FORMParserRuleCall_1_0());
			}
			this_EXEC_FORM_1=ruleEXEC_FORM
			{
				$current = $this_EXEC_FORM_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getCmdAccess().getCmdAction_1_1_0(),
							$current);
					}
				)
				this_SHELL_CMD_3=RULE_SHELL_CMD
				{
					newLeafNode(this_SHELL_CMD_3, grammarAccess.getCmdAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleRun
entryRuleRun returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRunRule()); }
	iv_ruleRun=ruleRun
	{ $current=$iv_ruleRun.current; }
	EOF;

// Rule Run
ruleRun returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RUN'
		{
			newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRUNKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getRunAccess().getEXEC_FORMParserRuleCall_1_0());
			}
			this_EXEC_FORM_1=ruleEXEC_FORM
			{
				$current = $this_EXEC_FORM_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getRunAccess().getRunAction_1_1_0(),
							$current);
					}
				)
				this_SHELL_CMD_3=RULE_SHELL_CMD
				{
					newLeafNode(this_SHELL_CMD_3, grammarAccess.getRunAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleEntrypoint
entryRuleEntrypoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntrypointRule()); }
	iv_ruleEntrypoint=ruleEntrypoint
	{ $current=$iv_ruleEntrypoint.current; }
	EOF;

// Rule Entrypoint
ruleEntrypoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ENTRYPOINT'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntrypointAccess().getENTRYPOINTKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getEntrypointAccess().getEXEC_FORMParserRuleCall_1_0());
			}
			this_EXEC_FORM_1=ruleEXEC_FORM
			{
				$current = $this_EXEC_FORM_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getEntrypointAccess().getEntrypointAction_1_1_0(),
							$current);
					}
				)
				this_SHELL_CMD_3=RULE_SHELL_CMD
				{
					newLeafNode(this_SHELL_CMD_3, grammarAccess.getEntrypointAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleVolume
entryRuleVolume returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVolumeRule()); }
	iv_ruleVolume=ruleVolume
	{ $current=$iv_ruleVolume.current; }
	EOF;

// Rule Volume
ruleVolume returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='VOLUME'
		{
			newLeafNode(otherlv_0, grammarAccess.getVolumeAccess().getVOLUMEKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getVolumeAccess().getEXEC_FORMParserRuleCall_1_0());
			}
			this_EXEC_FORM_1=ruleEXEC_FORM
			{
				$current = $this_EXEC_FORM_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getVolumeAccess().getVolumeAction_1_1_0(),
							$current);
					}
				)
				this_SHELL_CMD_3=RULE_SHELL_CMD
				{
					newLeafNode(this_SHELL_CMD_3, grammarAccess.getVolumeAccess().getSHELL_CMDTerminalRuleCall_1_1_1());
				}
			)
		)
	)
;

// Entry rule entryRuleMaintainer
entryRuleMaintainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMaintainerRule()); }
	iv_ruleMaintainer=ruleMaintainer
	{ $current=$iv_ruleMaintainer.current; }
	EOF;

// Rule Maintainer
ruleMaintainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MAINTAINER'
		{
			newLeafNode(otherlv_0, grammarAccess.getMaintainerAccess().getMAINTAINERKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_SHELL_CMD
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMaintainerAccess().getNameSHELL_CMDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMaintainerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
				}
			)
		)
	)
;

// Entry rule entryRuleExpose
entryRuleExpose returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExposeRule()); }
	iv_ruleExpose=ruleExpose
	{ $current=$iv_ruleExpose.current; }
	EOF;

// Rule Expose
ruleExpose returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='EXPOSE'
		{
			newLeafNode(otherlv_0, grammarAccess.getExposeAccess().getEXPOSEKeyword_0());
		}
		(
			(
				lv_ports_1_0=RULE_SHELL_CMD
				{
					newLeafNode(lv_ports_1_0, grammarAccess.getExposeAccess().getPortsSHELL_CMDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExposeRule());
					}
					setWithLastConsumed(
						$current,
						"ports",
						lv_ports_1_0,
						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
				}
			)
		)
	)
;

// Entry rule entryRuleWorkdir
entryRuleWorkdir returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkdirRule()); }
	iv_ruleWorkdir=ruleWorkdir
	{ $current=$iv_ruleWorkdir.current; }
	EOF;

// Rule Workdir
ruleWorkdir returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WORKDIR'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkdirAccess().getWORKDIRKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_SHELL_CMD
				{
					newLeafNode(lv_path_1_0, grammarAccess.getWorkdirAccess().getPathSHELL_CMDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkdirRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
				}
			)
		)
	)
;

// Entry rule entryRuleEnv
entryRuleEnv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvRule()); }
	iv_ruleEnv=ruleEnv
	{ $current=$iv_ruleEnv.current; }
	EOF;

// Rule Env
ruleEnv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ENV '
		{
			newLeafNode(otherlv_0, grammarAccess.getEnvAccess().getENVKeyword_0());
		}
		(
			(
				lv_key_value_pairs_1_0=RULE_KV_PAIR_EQUALS
				{
					newLeafNode(lv_key_value_pairs_1_0, grammarAccess.getEnvAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnvRule());
					}
					addWithLastConsumed(
						$current,
						"key_value_pairs",
						lv_key_value_pairs_1_0,
						"org.xtext.example.mydsl.MyDsl.KV_PAIR_EQUALS");
				}
			)
		)+
	)
;

// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	iv_ruleLabel=ruleLabel
	{ $current=$iv_ruleLabel.current; }
	EOF;

// Rule Label
ruleLabel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LABEL '
		{
			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLABELKeyword_0());
		}
		(
			(
				lv_key_value_pairs_1_0=RULE_KV_PAIR_EQUALS
				{
					newLeafNode(lv_key_value_pairs_1_0, grammarAccess.getLabelAccess().getKey_value_pairsKV_PAIR_EQUALSTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLabelRule());
					}
					addWithLastConsumed(
						$current,
						"key_value_pairs",
						lv_key_value_pairs_1_0,
						"org.xtext.example.mydsl.MyDsl.KV_PAIR_EQUALS");
				}
			)
		)+
	)
;

// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	iv_ruleAdd=ruleAdd
	{ $current=$iv_ruleAdd.current; }
	EOF;

// Rule Add
ruleAdd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ADD '
		{
			newLeafNode(otherlv_0, grammarAccess.getAddAccess().getADDKeyword_0());
		}
		(
			(
				lv_chown_options_1_0=RULE_CHOWN_OPTION
				{
					newLeafNode(lv_chown_options_1_0, grammarAccess.getAddAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"chown_options",
						lv_chown_options_1_0,
						"org.xtext.example.mydsl.MyDsl.CHOWN_OPTION");
				}
			)
		)?
		(
			(
				lv_file_2_0=RULE_ID
				{
					newLeafNode(lv_file_2_0, grammarAccess.getAddAccess().getFileIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"file",
						lv_file_2_0,
						"org.xtext.example.mydsl.MyDsl.ID");
				}
			)
		)
		(
			(
				otherlv_3='?'
				{
					newLeafNode(otherlv_3, grammarAccess.getAddAccess().getQuestionMarkKeyword_3_0_0());
				}
				    |
				otherlv_4='*'
				{
					newLeafNode(otherlv_4, grammarAccess.getAddAccess().getAsteriskKeyword_3_0_1());
				}
			)
			    |
			(
				otherlv_5='.'
				{
					newLeafNode(otherlv_5, grammarAccess.getAddAccess().getFullStopKeyword_3_1_0());
				}
				this_ID_6=RULE_ID
				{
					newLeafNode(this_ID_6, grammarAccess.getAddAccess().getIDTerminalRuleCall_3_1_1());
				}
			)
		)?
		(
			(
				lv_directory_7_0=RULE_SHELL_CMD
				{
					newLeafNode(lv_directory_7_0, grammarAccess.getAddAccess().getDirectorySHELL_CMDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAddRule());
					}
					setWithLastConsumed(
						$current,
						"directory",
						lv_directory_7_0,
						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
				}
			)
		)
	)
;

// Entry rule entryRuleCopy
entryRuleCopy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCopyRule()); }
	iv_ruleCopy=ruleCopy
	{ $current=$iv_ruleCopy.current; }
	EOF;

// Rule Copy
ruleCopy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='COPY '
		{
			newLeafNode(otherlv_0, grammarAccess.getCopyAccess().getCOPYKeyword_0());
		}
		(
			(
				lv_chown_options_1_0=RULE_CHOWN_OPTION
				{
					newLeafNode(lv_chown_options_1_0, grammarAccess.getCopyAccess().getChown_optionsCHOWN_OPTIONTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCopyRule());
					}
					setWithLastConsumed(
						$current,
						"chown_options",
						lv_chown_options_1_0,
						"org.xtext.example.mydsl.MyDsl.CHOWN_OPTION");
				}
			)
		)?
		(
			(
				lv_file_2_0=RULE_ID
				{
					newLeafNode(lv_file_2_0, grammarAccess.getCopyAccess().getFileIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCopyRule());
					}
					setWithLastConsumed(
						$current,
						"file",
						lv_file_2_0,
						"org.xtext.example.mydsl.MyDsl.ID");
				}
			)
		)
		(
			otherlv_3='?'
			{
				newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getQuestionMarkKeyword_3_0());
			}
			    |
			otherlv_4='*'
			{
				newLeafNode(otherlv_4, grammarAccess.getCopyAccess().getAsteriskKeyword_3_1());
			}
		)?
		(
			otherlv_5='.'
			{
				newLeafNode(otherlv_5, grammarAccess.getCopyAccess().getFullStopKeyword_4_0());
			}
			this_ID_6=RULE_ID
			{
				newLeafNode(this_ID_6, grammarAccess.getCopyAccess().getIDTerminalRuleCall_4_1());
			}
		)?
		(
			(
				lv_directory_7_0=RULE_SHELL_CMD
				{
					newLeafNode(lv_directory_7_0, grammarAccess.getCopyAccess().getDirectorySHELL_CMDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCopyRule());
					}
					setWithLastConsumed(
						$current,
						"directory",
						lv_directory_7_0,
						"org.xtext.example.mydsl.MyDsl.SHELL_CMD");
				}
			)
		)
	)
;

// Entry rule entryRuleIMAGE_NAME
entryRuleIMAGE_NAME returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIMAGE_NAMERule()); }
	iv_ruleIMAGE_NAME=ruleIMAGE_NAME
	{ $current=$iv_ruleIMAGE_NAME.current.getText(); }
	EOF;

// Rule IMAGE_NAME
ruleIMAGE_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='/'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIMAGE_NAMEAccess().getSolidusKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getIMAGE_NAMEAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleIMAGE_TAG
entryRuleIMAGE_TAG returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIMAGE_TAGRule()); }
	iv_ruleIMAGE_TAG=ruleIMAGE_TAG
	{ $current=$iv_ruleIMAGE_TAG.current.getText(); }
	EOF;

// Rule IMAGE_TAG
ruleIMAGE_TAG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getColonKeyword_0());
		}
		(
			this_ID_1=RULE_ID
			{
				$current.merge(this_ID_1);
			}
			{
				newLeafNode(this_ID_1, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_1_0());
			}
			    |
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_1_1());
			}
			    |
			this_STRING_3=RULE_STRING
			{
				$current.merge(this_STRING_3);
			}
			{
				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_1_2());
			}
		)
		(
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getIMAGE_TAGAccess().getIDTerminalRuleCall_2_0());
			}
			    |
			this_INT_5=RULE_INT
			{
				$current.merge(this_INT_5);
			}
			{
				newLeafNode(this_INT_5, grammarAccess.getIMAGE_TAGAccess().getINTTerminalRuleCall_2_1());
			}
			    |
			this_STRING_6=RULE_STRING
			{
				$current.merge(this_STRING_6);
			}
			{
				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_TAGAccess().getSTRINGTerminalRuleCall_2_2());
			}
			    |
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getHyphenMinusKeyword_2_3());
			}
			    |
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIMAGE_TAGAccess().getFullStopKeyword_2_4());
			}
		)*
	)
;

// Entry rule entryRuleIMAGE_DIGEST
entryRuleIMAGE_DIGEST returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIMAGE_DIGESTRule()); }
	iv_ruleIMAGE_DIGEST=ruleIMAGE_DIGEST
	{ $current=$iv_ruleIMAGE_DIGEST.current.getText(); }
	EOF;

// Rule IMAGE_DIGEST
ruleIMAGE_DIGEST returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='@'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getCommercialAtKeyword_0());
		}
		(
			this_ID_1=RULE_ID
			{
				$current.merge(this_ID_1);
			}
			{
				newLeafNode(this_ID_1, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_1_0());
			}
			    |
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_1_1());
			}
			    |
			this_STRING_3=RULE_STRING
			{
				$current.merge(this_STRING_3);
			}
			{
				newLeafNode(this_STRING_3, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_1_2());
			}
		)
		(
			this_ID_4=RULE_ID
			{
				$current.merge(this_ID_4);
			}
			{
				newLeafNode(this_ID_4, grammarAccess.getIMAGE_DIGESTAccess().getIDTerminalRuleCall_2_0());
			}
			    |
			this_INT_5=RULE_INT
			{
				$current.merge(this_INT_5);
			}
			{
				newLeafNode(this_INT_5, grammarAccess.getIMAGE_DIGESTAccess().getINTTerminalRuleCall_2_1());
			}
			    |
			this_STRING_6=RULE_STRING
			{
				$current.merge(this_STRING_6);
			}
			{
				newLeafNode(this_STRING_6, grammarAccess.getIMAGE_DIGESTAccess().getSTRINGTerminalRuleCall_2_2());
			}
			    |
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getHyphenMinusKeyword_2_3());
			}
			    |
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIMAGE_DIGESTAccess().getFullStopKeyword_2_4());
			}
		)*
	)
;

// Entry rule entryRuleEXEC_FORM
entryRuleEXEC_FORM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEXEC_FORMRule()); }
	iv_ruleEXEC_FORM=ruleEXEC_FORM
	{ $current=$iv_ruleEXEC_FORM.current; }
	EOF;

// Rule EXEC_FORM
ruleEXEC_FORM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=' ['
		{
			newLeafNode(otherlv_0, grammarAccess.getEXEC_FORMAccess().getSpaceLeftSquareBracketKeyword_0());
		}
		(
			(
				lv_executable_1_0=RULE_STRING
				{
					newLeafNode(lv_executable_1_0, grammarAccess.getEXEC_FORMAccess().getExecutableSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEXEC_FORMRule());
					}
					setWithLastConsumed(
						$current,
						"executable",
						lv_executable_1_0,
						"org.xtext.example.mydsl.MyDsl.STRING");
				}
			)
		)
		(
			(
				lv_parameters_2_0=RULE_EXEC_FORM_PARAMETER
				{
					newLeafNode(lv_parameters_2_0, grammarAccess.getEXEC_FORMAccess().getParametersEXEC_FORM_PARAMETERTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEXEC_FORMRule());
					}
					addWithLastConsumed(
						$current,
						"parameters",
						lv_parameters_2_0,
						"org.xtext.example.mydsl.MyDsl.EXEC_FORM_PARAMETER");
				}
			)
		)*
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getEXEC_FORMAccess().getRightSquareBracketKeyword_3());
		}
	)
;

RULE_PLATFORM_OPTION : '--platform=' (RULE_ID|RULE_INT) ':' ((RULE_ID|RULE_INT|RULE_STRING) (RULE_ID|RULE_INT|RULE_STRING|'-'|'.')*)? ' ';

RULE_CHOWN_OPTION : '--chown=' (RULE_ID|RULE_INT) ':' ((RULE_ID|RULE_INT|RULE_STRING) (RULE_ID|RULE_INT|RULE_STRING|'-'|'.')*)? ' ';

RULE_KV_PAIR_EQUALS : (RULE_ID|RULE_STRING) '=' (RULE_ID|RULE_STRING|RULE_INT) ' '?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_CONTINUE_NL : '\\\n';

RULE_NL : '\n'+;

RULE_ANY_OTHER : .;

RULE_EXEC_FORM_PARAMETER : ',' RULE_STRING;

RULE_SHELL_CMD : (' '|'\t') (~(('\n'|'\r'|'\\'))|'\\\n')*;

RULE_COMMENT : '#' ~(('\n'|'\r'))*;
