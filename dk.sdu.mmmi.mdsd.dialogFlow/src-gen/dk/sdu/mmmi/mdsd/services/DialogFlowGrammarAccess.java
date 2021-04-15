/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DialogFlowGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DialogFlowSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.DialogFlowSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDeclarationsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeclarationsDeclarationParserRuleCall_2_0 = (RuleCall)cDeclarationsAssignment_2.eContents().get(0);
		
		//DialogFlowSystem:
		//    'system' name=ID declarations+=Declaration*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'system' name=ID declarations+=Declaration*
		public Group getGroup() { return cGroup; }
		
		//'system'
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//declarations+=Declaration*
		public Assignment getDeclarationsAssignment_2() { return cDeclarationsAssignment_2; }
		
		//Declaration
		public RuleCall getDeclarationsDeclarationParserRuleCall_2_0() { return cDeclarationsDeclarationParserRuleCall_2_0; }
	}
	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.Declaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Declaration:
		//    Intent | Entity
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Intent | Entity
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Intent
		public RuleCall getIntentParserRuleCall_0() { return cIntentParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}
	public class IntentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.Intent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIntentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cPhraseAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPhrasePhrasesParserRuleCall_2_0 = (RuleCall)cPhraseAssignment_2.eContents().get(0);
		private final Assignment cResponseAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cResponseResponsesParserRuleCall_3_0 = (RuleCall)cResponseAssignment_3.eContents().get(0);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionActionsParserRuleCall_4_0 = (RuleCall)cActionAssignment_4.eContents().get(0);
		
		//Intent:
		//    'intent' name=ID phrase=Phrases response=Responses (action=Actions)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'intent' name=ID phrase=Phrases response=Responses (action=Actions)?
		public Group getGroup() { return cGroup; }
		
		//'intent'
		public Keyword getIntentKeyword_0() { return cIntentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//phrase=Phrases
		public Assignment getPhraseAssignment_2() { return cPhraseAssignment_2; }
		
		//Phrases
		public RuleCall getPhrasePhrasesParserRuleCall_2_0() { return cPhrasePhrasesParserRuleCall_2_0; }
		
		//response=Responses
		public Assignment getResponseAssignment_3() { return cResponseAssignment_3; }
		
		//Responses
		public RuleCall getResponseResponsesParserRuleCall_3_0() { return cResponseResponsesParserRuleCall_3_0; }
		
		//(action=Actions)?
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//Actions
		public RuleCall getActionActionsParserRuleCall_4_0() { return cActionActionsParserRuleCall_4_0; }
	}
	public class PhrasesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.Phrases");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPhrasesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPhrasesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPhrasesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPhrasesPhraseValueParserRuleCall_2_0 = (RuleCall)cPhrasesAssignment_2.eContents().get(0);
		
		//Phrases:
		//    {Phrases} 'phrases' phrases+=PhraseValue* //require min 10 N's
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Phrases} 'phrases' phrases+=PhraseValue*
		public Group getGroup() { return cGroup; }
		
		//{Phrases}
		public Action getPhrasesAction_0() { return cPhrasesAction_0; }
		
		//'phrases'
		public Keyword getPhrasesKeyword_1() { return cPhrasesKeyword_1; }
		
		//phrases+=PhraseValue*
		public Assignment getPhrasesAssignment_2() { return cPhrasesAssignment_2; }
		
		//PhraseValue
		public RuleCall getPhrasesPhraseValueParserRuleCall_2_0() { return cPhrasesPhraseValueParserRuleCall_2_0; }
	}
	public class PhraseValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.PhraseValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExpressionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMappingAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMappingMappingParserRuleCall_1_0 = (RuleCall)cMappingAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMappingAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMappingMappingParserRuleCall_2_1_0 = (RuleCall)cMappingAssignment_2_1.eContents().get(0);
		
		//PhraseValue:
		//    'expression' mapping+=Mapping (',' mapping+=Mapping)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'expression' mapping+=Mapping (',' mapping+=Mapping)*
		public Group getGroup() { return cGroup; }
		
		//'expression'
		public Keyword getExpressionKeyword_0() { return cExpressionKeyword_0; }
		
		//mapping+=Mapping
		public Assignment getMappingAssignment_1() { return cMappingAssignment_1; }
		
		//Mapping
		public RuleCall getMappingMappingParserRuleCall_1_0() { return cMappingMappingParserRuleCall_1_0; }
		
		//(',' mapping+=Mapping)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//mapping+=Mapping
		public Assignment getMappingAssignment_2_1() { return cMappingAssignment_2_1; }
		
		//Mapping
		public RuleCall getMappingMappingParserRuleCall_2_1_0() { return cMappingMappingParserRuleCall_2_1_0; }
	}
	public class MappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.Mapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEntityAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cEntityEntityCrossReference_1_1_0 = (CrossReference)cEntityAssignment_1_1.eContents().get(0);
		private final RuleCall cEntityEntityIDTerminalRuleCall_1_1_0_1 = (RuleCall)cEntityEntityCrossReference_1_1_0.eContents().get(1);
		
		//Mapping:
		//    value=STRING ('as' entity=[Entity])?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING ('as' entity=[Entity])?
		public Group getGroup() { return cGroup; }
		
		//value=STRING
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0_0() { return cValueSTRINGTerminalRuleCall_0_0; }
		
		//('as' entity=[Entity])?
		public Group getGroup_1() { return cGroup_1; }
		
		//'as'
		public Keyword getAsKeyword_1_0() { return cAsKeyword_1_0; }
		
		//entity=[Entity]
		public Assignment getEntityAssignment_1_1() { return cEntityAssignment_1_1; }
		
		//[Entity]
		public CrossReference getEntityEntityCrossReference_1_1_0() { return cEntityEntityCrossReference_1_1_0; }
		
		//ID
		public RuleCall getEntityEntityIDTerminalRuleCall_1_1_0_1() { return cEntityEntityIDTerminalRuleCall_1_1_0_1; }
	}
	public class ResponsesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.Responses");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cResponsesAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cResponsesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cResponsesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cResponsesResponseValueParserRuleCall_2_0 = (RuleCall)cResponsesAssignment_2.eContents().get(0);
		
		//Responses:
		//    {Responses} 'responses' responses+=ResponseValue*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Responses} 'responses' responses+=ResponseValue*
		public Group getGroup() { return cGroup; }
		
		//{Responses}
		public Action getResponsesAction_0() { return cResponsesAction_0; }
		
		//'responses'
		public Keyword getResponsesKeyword_1() { return cResponsesKeyword_1; }
		
		//responses+=ResponseValue*
		public Assignment getResponsesAssignment_2() { return cResponsesAssignment_2; }
		
		//ResponseValue
		public RuleCall getResponsesResponseValueParserRuleCall_2_0() { return cResponsesResponseValueParserRuleCall_2_0; }
	}
	public class ResponseValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.ResponseValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReplyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cResponseAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cResponseSTRINGTerminalRuleCall_1_0 = (RuleCall)cResponseAssignment_1.eContents().get(0);
		
		//ResponseValue:
		//    'reply' response=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'reply' response=STRING
		public Group getGroup() { return cGroup; }
		
		//'reply'
		public Keyword getReplyKeyword_0() { return cReplyKeyword_0; }
		
		//response=STRING
		public Assignment getResponseAssignment_1() { return cResponseAssignment_1; }
		
		//STRING
		public RuleCall getResponseSTRINGTerminalRuleCall_1_0() { return cResponseSTRINGTerminalRuleCall_1_0; }
	}
	public class ActionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.Actions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cActionsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cActionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionsActionValueParserRuleCall_2_0 = (RuleCall)cActionsAssignment_2.eContents().get(0);
		
		//Actions:
		//     {Actions} 'actions' actions+=ActionValue*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Actions} 'actions' actions+=ActionValue*
		public Group getGroup() { return cGroup; }
		
		//{Actions}
		public Action getActionsAction_0() { return cActionsAction_0; }
		
		//'actions'
		public Keyword getActionsKeyword_1() { return cActionsKeyword_1; }
		
		//actions+=ActionValue*
		public Assignment getActionsAssignment_2() { return cActionsAssignment_2; }
		
		//ActionValue
		public RuleCall getActionsActionValueParserRuleCall_2_0() { return cActionsActionValueParserRuleCall_2_0; }
	}
	public class ActionValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.ActionValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParamKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNameKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTypeEntityCrossReference_4_0 = (CrossReference)cTypeAssignment_4.eContents().get(0);
		private final RuleCall cTypeEntityIDTerminalRuleCall_4_0_1 = (RuleCall)cTypeEntityCrossReference_4_0.eContents().get(1);
		private final Assignment cValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cValueSTRINGTerminalRuleCall_5_0 = (RuleCall)cValueAssignment_5.eContents().get(0);
		private final Assignment cListAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cListSTRINGTerminalRuleCall_6_0 = (RuleCall)cListAssignment_6.eContents().get(0);
		
		//ActionValue:
		//    'param' 'name' name=ID 'type' type=[Entity] value=STRING (list=STRING)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'param' 'name' name=ID 'type' type=[Entity] value=STRING (list=STRING)?
		public Group getGroup() { return cGroup; }
		
		//'param'
		public Keyword getParamKeyword_0() { return cParamKeyword_0; }
		
		//'name'
		public Keyword getNameKeyword_1() { return cNameKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'type'
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }
		
		//type=[Entity]
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//[Entity]
		public CrossReference getTypeEntityCrossReference_4_0() { return cTypeEntityCrossReference_4_0; }
		
		//ID
		public RuleCall getTypeEntityIDTerminalRuleCall_4_0_1() { return cTypeEntityIDTerminalRuleCall_4_0_1; }
		
		//value=STRING
		public Assignment getValueAssignment_5() { return cValueAssignment_5; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_5_0() { return cValueSTRINGTerminalRuleCall_5_0; }
		
		//(list=STRING)?
		public Assignment getListAssignment_6() { return cListAssignment_6; }
		
		//STRING
		public RuleCall getListSTRINGTerminalRuleCall_6_0() { return cListSTRINGTerminalRuleCall_6_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cEntitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEntitiesEntityValueParserRuleCall_2_0 = (RuleCall)cEntitiesAssignment_2.eContents().get(0);
		
		//Entity:
		//    'entity' name=ID entities+=EntityValue*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID entities+=EntityValue*
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//entities+=EntityValue*
		public Assignment getEntitiesAssignment_2() { return cEntitiesAssignment_2; }
		
		//EntityValue
		public RuleCall getEntitiesEntityValueParserRuleCall_2_0() { return cEntitiesEntityValueParserRuleCall_2_0; }
	}
	public class EntityValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.EntityValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReferenceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_2_0 = (Alternatives)cGroup_2.eContents().get(0);
		private final Keyword cSynonymKeyword_2_0_0 = (Keyword)cAlternatives_2_0.eContents().get(0);
		private final Keyword cSynonymsKeyword_2_0_1 = (Keyword)cAlternatives_2_0.eContents().get(1);
		private final Assignment cSynonymsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cSynonymsEntitySynonymsParserRuleCall_2_1_0 = (RuleCall)cSynonymsAssignment_2_1.eContents().get(0);
		
		//EntityValue:
		//    'reference' value=STRING (('synonym'|'synonyms') synonyms=EntitySynonyms)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'reference' value=STRING (('synonym'|'synonyms') synonyms=EntitySynonyms)?
		public Group getGroup() { return cGroup; }
		
		//'reference'
		public Keyword getReferenceKeyword_0() { return cReferenceKeyword_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
		
		//(('synonym'|'synonyms') synonyms=EntitySynonyms)?
		public Group getGroup_2() { return cGroup_2; }
		
		//('synonym'|'synonyms')
		public Alternatives getAlternatives_2_0() { return cAlternatives_2_0; }
		
		//'synonym'
		public Keyword getSynonymKeyword_2_0_0() { return cSynonymKeyword_2_0_0; }
		
		//'synonyms'
		public Keyword getSynonymsKeyword_2_0_1() { return cSynonymsKeyword_2_0_1; }
		
		//synonyms=EntitySynonyms
		public Assignment getSynonymsAssignment_2_1() { return cSynonymsAssignment_2_1; }
		
		//EntitySynonyms
		public RuleCall getSynonymsEntitySynonymsParserRuleCall_2_1_0() { return cSynonymsEntitySynonymsParserRuleCall_2_1_0; }
	}
	public class EntitySynonymsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.DialogFlow.EntitySynonyms");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEntitySynonymsAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_1_0 = (RuleCall)cValuesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValuesAssignment_2_1.eContents().get(0);
		
		//EntitySynonyms:
		//    {EntitySynonyms} values+=STRING (',' values+=STRING )*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{EntitySynonyms} values+=STRING (',' values+=STRING )*
		public Group getGroup() { return cGroup; }
		
		//{EntitySynonyms}
		public Action getEntitySynonymsAction_0() { return cEntitySynonymsAction_0; }
		
		//values+=STRING
		public Assignment getValuesAssignment_1() { return cValuesAssignment_1; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_1_0() { return cValuesSTRINGTerminalRuleCall_1_0; }
		
		//(',' values+=STRING )*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//values+=STRING
		public Assignment getValuesAssignment_2_1() { return cValuesAssignment_2_1; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_2_1_0() { return cValuesSTRINGTerminalRuleCall_2_1_0; }
	}
	
	
	private final DialogFlowSystemElements pDialogFlowSystem;
	private final DeclarationElements pDeclaration;
	private final IntentElements pIntent;
	private final PhrasesElements pPhrases;
	private final PhraseValueElements pPhraseValue;
	private final MappingElements pMapping;
	private final ResponsesElements pResponses;
	private final ResponseValueElements pResponseValue;
	private final ActionsElements pActions;
	private final ActionValueElements pActionValue;
	private final EntityElements pEntity;
	private final EntityValueElements pEntityValue;
	private final EntitySynonymsElements pEntitySynonyms;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DialogFlowGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDialogFlowSystem = new DialogFlowSystemElements();
		this.pDeclaration = new DeclarationElements();
		this.pIntent = new IntentElements();
		this.pPhrases = new PhrasesElements();
		this.pPhraseValue = new PhraseValueElements();
		this.pMapping = new MappingElements();
		this.pResponses = new ResponsesElements();
		this.pResponseValue = new ResponseValueElements();
		this.pActions = new ActionsElements();
		this.pActionValue = new ActionValueElements();
		this.pEntity = new EntityElements();
		this.pEntityValue = new EntityValueElements();
		this.pEntitySynonyms = new EntitySynonymsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.DialogFlow".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DialogFlowSystem:
	//    'system' name=ID declarations+=Declaration*
	//;
	public DialogFlowSystemElements getDialogFlowSystemAccess() {
		return pDialogFlowSystem;
	}
	
	public ParserRule getDialogFlowSystemRule() {
		return getDialogFlowSystemAccess().getRule();
	}
	
	//Declaration:
	//    Intent | Entity
	//;
	public DeclarationElements getDeclarationAccess() {
		return pDeclaration;
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}
	
	//Intent:
	//    'intent' name=ID phrase=Phrases response=Responses (action=Actions)?
	//;
	public IntentElements getIntentAccess() {
		return pIntent;
	}
	
	public ParserRule getIntentRule() {
		return getIntentAccess().getRule();
	}
	
	//Phrases:
	//    {Phrases} 'phrases' phrases+=PhraseValue* //require min 10 N's
	//;
	public PhrasesElements getPhrasesAccess() {
		return pPhrases;
	}
	
	public ParserRule getPhrasesRule() {
		return getPhrasesAccess().getRule();
	}
	
	//PhraseValue:
	//    'expression' mapping+=Mapping (',' mapping+=Mapping)*
	//;
	public PhraseValueElements getPhraseValueAccess() {
		return pPhraseValue;
	}
	
	public ParserRule getPhraseValueRule() {
		return getPhraseValueAccess().getRule();
	}
	
	//Mapping:
	//    value=STRING ('as' entity=[Entity])?
	//;
	public MappingElements getMappingAccess() {
		return pMapping;
	}
	
	public ParserRule getMappingRule() {
		return getMappingAccess().getRule();
	}
	
	//Responses:
	//    {Responses} 'responses' responses+=ResponseValue*
	//;
	public ResponsesElements getResponsesAccess() {
		return pResponses;
	}
	
	public ParserRule getResponsesRule() {
		return getResponsesAccess().getRule();
	}
	
	//ResponseValue:
	//    'reply' response=STRING
	//;
	public ResponseValueElements getResponseValueAccess() {
		return pResponseValue;
	}
	
	public ParserRule getResponseValueRule() {
		return getResponseValueAccess().getRule();
	}
	
	//Actions:
	//     {Actions} 'actions' actions+=ActionValue*
	//;
	public ActionsElements getActionsAccess() {
		return pActions;
	}
	
	public ParserRule getActionsRule() {
		return getActionsAccess().getRule();
	}
	
	//ActionValue:
	//    'param' 'name' name=ID 'type' type=[Entity] value=STRING (list=STRING)?
	//;
	public ActionValueElements getActionValueAccess() {
		return pActionValue;
	}
	
	public ParserRule getActionValueRule() {
		return getActionValueAccess().getRule();
	}
	
	//Entity:
	//    'entity' name=ID entities+=EntityValue*
	//;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//EntityValue:
	//    'reference' value=STRING (('synonym'|'synonyms') synonyms=EntitySynonyms)?
	//;
	public EntityValueElements getEntityValueAccess() {
		return pEntityValue;
	}
	
	public ParserRule getEntityValueRule() {
		return getEntityValueAccess().getRule();
	}
	
	//EntitySynonyms:
	//    {EntitySynonyms} values+=STRING (',' values+=STRING )*
	//;
	public EntitySynonymsElements getEntitySynonymsAccess() {
		return pEntitySynonyms;
	}
	
	public ParserRule getEntitySynonymsRule() {
		return getEntitySynonymsAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}