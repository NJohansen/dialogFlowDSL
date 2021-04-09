/*
 * generated by Xtext 2.25.0
 */
grammar InternalDialogFlow;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.DialogFlowGrammarAccess;

}

@parser::members {

 	private DialogFlowGrammarAccess grammarAccess;

    public InternalDialogFlowParser(TokenStream input, DialogFlowGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DialogFlowSystem";
   	}

   	@Override
   	protected DialogFlowGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDialogFlowSystem
entryRuleDialogFlowSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialogFlowSystemRule()); }
	iv_ruleDialogFlowSystem=ruleDialogFlowSystem
	{ $current=$iv_ruleDialogFlowSystem.current; }
	EOF;

// Rule DialogFlowSystem
ruleDialogFlowSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getDialogFlowSystemAccess().getSystemKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDialogFlowSystemAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDialogFlowSystemRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDialogFlowSystemAccess().getDeclarationsDeclarationParserRuleCall_2_0());
				}
				lv_declarations_2_0=ruleDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialogFlowSystemRule());
					}
					add(
						$current,
						"declarations",
						lv_declarations_2_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.Declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getIntentParserRuleCall_0());
		}
		this_Intent_0=ruleIntent
		{
			$current = $this_Intent_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_1());
		}
		this_Entity_1=ruleEntity
		{
			$current = $this_Entity_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntent
entryRuleIntent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntentRule()); }
	iv_ruleIntent=ruleIntent
	{ $current=$iv_ruleIntent.current; }
	EOF;

// Rule Intent
ruleIntent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='intent'
		{
			newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getIntentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIntentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIntentAccess().getPhrasePhrasesParserRuleCall_2_0());
				}
				lv_phrase_2_0=rulePhrases
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntentRule());
					}
					set(
						$current,
						"phrase",
						lv_phrase_2_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.Phrases");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIntentAccess().getResponseResponsesParserRuleCall_3_0());
				}
				lv_response_3_0=ruleResponses
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntentRule());
					}
					set(
						$current,
						"response",
						lv_response_3_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.Responses");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getIntentAccess().getActionActionsParserRuleCall_4_0());
				}
				lv_action_4_0=ruleActions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntentRule());
					}
					set(
						$current,
						"action",
						lv_action_4_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.Actions");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRulePhrases
entryRulePhrases returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPhrasesRule()); }
	iv_rulePhrases=rulePhrases
	{ $current=$iv_rulePhrases.current; }
	EOF;

// Rule Phrases
rulePhrases returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPhrasesAccess().getPhrasesAction_0(),
					$current);
			}
		)
		otherlv_1='phrases'
		{
			newLeafNode(otherlv_1, grammarAccess.getPhrasesAccess().getPhrasesKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPhrasesAccess().getPhrasesPhraseValueParserRuleCall_2_0());
				}
				lv_phrases_2_0=rulePhraseValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPhrasesRule());
					}
					add(
						$current,
						"phrases",
						lv_phrases_2_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.PhraseValue");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePhraseValue
entryRulePhraseValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPhraseValueRule()); }
	iv_rulePhraseValue=rulePhraseValue
	{ $current=$iv_rulePhraseValue.current; }
	EOF;

// Rule PhraseValue
rulePhraseValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='expression'
		{
			newLeafNode(otherlv_0, grammarAccess.getPhraseValueAccess().getExpressionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPhraseValueAccess().getMappingMappingParserRuleCall_1_0());
				}
				lv_mapping_1_0=ruleMapping
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPhraseValueRule());
					}
					add(
						$current,
						"mapping",
						lv_mapping_1_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.Mapping");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getPhraseValueAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPhraseValueAccess().getMappingMappingParserRuleCall_2_1_0());
					}
					lv_mapping_3_0=ruleMapping
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPhraseValueRule());
						}
						add(
							$current,
							"mapping",
							lv_mapping_3_0,
							"dk.sdu.mmmi.mdsd.DialogFlow.Mapping");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMapping
entryRuleMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMappingRule()); }
	iv_ruleMapping=ruleMapping
	{ $current=$iv_ruleMapping.current; }
	EOF;

// Rule Mapping
ruleMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_0=RULE_STRING
				{
					newLeafNode(lv_value_0_0, grammarAccess.getMappingAccess().getValueSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMappingRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_1='as'
			{
				newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getAsKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMappingRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getEntityEntityCrossReference_1_1_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleResponses
entryRuleResponses returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResponsesRule()); }
	iv_ruleResponses=ruleResponses
	{ $current=$iv_ruleResponses.current; }
	EOF;

// Rule Responses
ruleResponses returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getResponsesAccess().getResponsesAction_0(),
					$current);
			}
		)
		otherlv_1='responses'
		{
			newLeafNode(otherlv_1, grammarAccess.getResponsesAccess().getResponsesKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getResponsesAccess().getResponsesResponseValueParserRuleCall_2_0());
				}
				lv_responses_2_0=ruleResponseValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResponsesRule());
					}
					add(
						$current,
						"responses",
						lv_responses_2_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.ResponseValue");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleResponseValue
entryRuleResponseValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResponseValueRule()); }
	iv_ruleResponseValue=ruleResponseValue
	{ $current=$iv_ruleResponseValue.current; }
	EOF;

// Rule ResponseValue
ruleResponseValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='reply'
		{
			newLeafNode(otherlv_0, grammarAccess.getResponseValueAccess().getReplyKeyword_0());
		}
		(
			(
				lv_response_1_0=RULE_STRING
				{
					newLeafNode(lv_response_1_0, grammarAccess.getResponseValueAccess().getResponseSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResponseValueRule());
					}
					setWithLastConsumed(
						$current,
						"response",
						lv_response_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleActions
entryRuleActions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionsRule()); }
	iv_ruleActions=ruleActions
	{ $current=$iv_ruleActions.current; }
	EOF;

// Rule Actions
ruleActions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionsAccess().getActionsAction_0(),
					$current);
			}
		)
		otherlv_1='actions'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionsAccess().getActionsKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionsAccess().getActionsActionValueParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleActionValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionsRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.ActionValue");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleActionValue
entryRuleActionValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionValueRule()); }
	iv_ruleActionValue=ruleActionValue
	{ $current=$iv_ruleActionValue.current; }
	EOF;

// Rule ActionValue
ruleActionValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='param'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionValueAccess().getParamKeyword_0());
		}
		otherlv_1='name'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionValueAccess().getNameKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getActionValueAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='type'
		{
			newLeafNode(otherlv_3, grammarAccess.getActionValueAccess().getTypeKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionValueRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getActionValueAccess().getTypeEntityCrossReference_4_0());
				}
			)
		)
		(
			(
				lv_value_5_0=RULE_STRING
				{
					newLeafNode(lv_value_5_0, grammarAccess.getActionValueAccess().getValueSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionValueRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_list_6_0=RULE_STRING
				{
					newLeafNode(lv_list_6_0, grammarAccess.getActionValueAccess().getListSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionValueRule());
					}
					setWithLastConsumed(
						$current,
						"list",
						lv_list_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getEntitiesEntityValueParserRuleCall_2_0());
				}
				lv_entities_2_0=ruleEntityValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"entities",
						lv_entities_2_0,
						"dk.sdu.mmmi.mdsd.DialogFlow.EntityValue");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleEntityValue
entryRuleEntityValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityValueRule()); }
	iv_ruleEntityValue=ruleEntityValue
	{ $current=$iv_ruleEntityValue.current; }
	EOF;

// Rule EntityValue
ruleEntityValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='reference'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityValueAccess().getReferenceKeyword_0());
		}
		(
			(
				lv_values_1_0=RULE_STRING
				{
					newLeafNode(lv_values_1_0, grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityValueRule());
					}
					addWithLastConsumed(
						$current,
						"values",
						lv_values_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				otherlv_2='synonym'
				{
					newLeafNode(otherlv_2, grammarAccess.getEntityValueAccess().getSynonymKeyword_2_0_0());
				}
				    |
				otherlv_3='synonyms'
				{
					newLeafNode(otherlv_3, grammarAccess.getEntityValueAccess().getSynonymsKeyword_2_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityValueAccess().getSynonymsEntitySynonymsParserRuleCall_2_1_0());
					}
					lv_synonyms_4_0=ruleEntitySynonyms
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityValueRule());
						}
						add(
							$current,
							"synonyms",
							lv_synonyms_4_0,
							"dk.sdu.mmmi.mdsd.DialogFlow.EntitySynonyms");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
	)
;

// Entry rule entryRuleEntitySynonyms
entryRuleEntitySynonyms returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntitySynonymsRule()); }
	iv_ruleEntitySynonyms=ruleEntitySynonyms
	{ $current=$iv_ruleEntitySynonyms.current; }
	EOF;

// Rule EntitySynonyms
ruleEntitySynonyms returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntitySynonymsAccess().getEntitySynonymsAction_0(),
					$current);
			}
		)
		(
			(
				lv_values_1_0=RULE_STRING
				{
					newLeafNode(lv_values_1_0, grammarAccess.getEntitySynonymsAccess().getValuesSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntitySynonymsRule());
					}
					addWithLastConsumed(
						$current,
						"values",
						lv_values_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getEntitySynonymsAccess().getCommaKeyword_2_0());
			}
			(
				(
					lv_values_3_0=RULE_STRING
					{
						newLeafNode(lv_values_3_0, grammarAccess.getEntitySynonymsAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntitySynonymsRule());
						}
						addWithLastConsumed(
							$current,
							"values",
							lv_values_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
