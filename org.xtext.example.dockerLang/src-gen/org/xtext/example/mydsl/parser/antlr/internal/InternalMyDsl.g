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
			{
				newCompositeNode(grammarAccess.getDockerfileAccess().getStatementsStatementParserRuleCall_0());
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
		{
			newCompositeNode(grammarAccess.getStatementAccess().getFromParserRuleCall_0());
		}
		this_From_0=ruleFrom
		{
			$current = $this_From_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getCmdParserRuleCall_1());
		}
		this_Cmd_1=ruleCmd
		{
			$current = $this_Cmd_1.current;
			afterParserOrEnumRuleCall();
		}
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
				{
					newCompositeNode(grammarAccess.getFromAccess().getPlatform_optionPLATFORM_OPTIONParserRuleCall_1_0());
				}
				lv_platform_option_1_0=rulePLATFORM_OPTION
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFromRule());
					}
					set(
						$current,
						"platform_option",
						lv_platform_option_1_0,
						"org.xtext.example.mydsl.MyDsl.PLATFORM_OPTION");
					afterParserOrEnumRuleCall();
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
				{
					newCompositeNode(grammarAccess.getCmdAccess().getSHELL_FORMParserRuleCall_1_1_1());
				}
				ruleSHELL_FORM
				{
					afterParserOrEnumRuleCall();
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

// Entry rule entryRulePLATFORM_OPTION
entryRulePLATFORM_OPTION returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPLATFORM_OPTIONRule()); }
	iv_rulePLATFORM_OPTION=rulePLATFORM_OPTION
	{ $current=$iv_rulePLATFORM_OPTION.current.getText(); }
	EOF;

// Rule PLATFORM_OPTION
rulePLATFORM_OPTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='--platform='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getPLATFORM_OPTIONAccess().getPlatformKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getPLATFORM_OPTIONAccess().getIMAGE_NAMEParserRuleCall_1());
		}
		this_IMAGE_NAME_1=ruleIMAGE_NAME
		{
			$current.merge(this_IMAGE_NAME_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
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

// Entry rule entryRuleSHELL_FORM
entryRuleSHELL_FORM returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSHELL_FORMRule()); }
	iv_ruleSHELL_FORM=ruleSHELL_FORM
	{ $current=$iv_ruleSHELL_FORM.current.getText(); }
	EOF;

// Rule SHELL_FORM
ruleSHELL_FORM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SHELL_CMD_0=RULE_SHELL_CMD
		{
			$current.merge(this_SHELL_CMD_0);
		}
		{
			newLeafNode(this_SHELL_CMD_0, grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_0());
		}
		(
			this_CONTINUE_NL_1=RULE_CONTINUE_NL
			{
				$current.merge(this_CONTINUE_NL_1);
			}
			{
				newLeafNode(this_CONTINUE_NL_1, grammarAccess.getSHELL_FORMAccess().getCONTINUE_NLTerminalRuleCall_1_0());
			}
			this_SHELL_CMD_2=RULE_SHELL_CMD
			{
				$current.merge(this_SHELL_CMD_2);
			}
			{
				newLeafNode(this_SHELL_CMD_2, grammarAccess.getSHELL_FORMAccess().getSHELL_CMDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_CONTINUE_NL : '\\\n';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

RULE_EXEC_FORM_PARAMETER : ',' RULE_STRING;

RULE_SHELL_CMD : (' '|'\t') ~(('\n'|'\r'|'\\'))* ('\r'? '\n')?;
