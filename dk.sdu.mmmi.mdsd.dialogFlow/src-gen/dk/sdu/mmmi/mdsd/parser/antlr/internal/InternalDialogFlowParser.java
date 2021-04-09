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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDialogFlowParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'intent'", "'phrases'", "'expression'", "','", "'as'", "'responses'", "'reply'", "'actions'", "'param'", "'name'", "'type'", "'entity'", "'reference'", "'synonym'", "'synonyms'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDialogFlowParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDialogFlowParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDialogFlowParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDialogFlow.g"; }



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




    // $ANTLR start "entryRuleDialogFlowSystem"
    // InternalDialogFlow.g:64:1: entryRuleDialogFlowSystem returns [EObject current=null] : iv_ruleDialogFlowSystem= ruleDialogFlowSystem EOF ;
    public final EObject entryRuleDialogFlowSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogFlowSystem = null;


        try {
            // InternalDialogFlow.g:64:57: (iv_ruleDialogFlowSystem= ruleDialogFlowSystem EOF )
            // InternalDialogFlow.g:65:2: iv_ruleDialogFlowSystem= ruleDialogFlowSystem EOF
            {
             newCompositeNode(grammarAccess.getDialogFlowSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDialogFlowSystem=ruleDialogFlowSystem();

            state._fsp--;

             current =iv_ruleDialogFlowSystem; 
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
    // $ANTLR end "entryRuleDialogFlowSystem"


    // $ANTLR start "ruleDialogFlowSystem"
    // InternalDialogFlow.g:71:1: ruleDialogFlowSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleDialogFlowSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalDialogFlow.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalDialogFlow.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalDialogFlow.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDialogFlowSystemAccess().getSystemKeyword_0());
            		
            // InternalDialogFlow.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogFlow.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogFlow.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalDialogFlow.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDialogFlowSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDialogFlowSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogFlow.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDialogFlow.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalDialogFlow.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalDialogFlow.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getDialogFlowSystemAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDialogFlowSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"dk.sdu.mmmi.mdsd.DialogFlow.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDialogFlowSystem"


    // $ANTLR start "entryRuleDeclaration"
    // InternalDialogFlow.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalDialogFlow.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalDialogFlow.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDialogFlow.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Intent_0 = null;

        EObject this_Entity_1 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:137:2: ( (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity ) )
            // InternalDialogFlow.g:138:2: (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity )
            {
            // InternalDialogFlow.g:138:2: (this_Intent_0= ruleIntent | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDialogFlow.g:139:3: this_Intent_0= ruleIntent
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getIntentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Intent_0=ruleIntent();

                    state._fsp--;


                    			current = this_Intent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDialogFlow.g:148:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleIntent"
    // InternalDialogFlow.g:160:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // InternalDialogFlow.g:160:47: (iv_ruleIntent= ruleIntent EOF )
            // InternalDialogFlow.g:161:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalDialogFlow.g:167:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_phrase_2_0= rulePhrases ) ) ( (lv_response_3_0= ruleResponses ) ) ( (lv_action_4_0= ruleActions ) )? ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_phrase_2_0 = null;

        EObject lv_response_3_0 = null;

        EObject lv_action_4_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:173:2: ( (otherlv_0= 'intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_phrase_2_0= rulePhrases ) ) ( (lv_response_3_0= ruleResponses ) ) ( (lv_action_4_0= ruleActions ) )? ) )
            // InternalDialogFlow.g:174:2: (otherlv_0= 'intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_phrase_2_0= rulePhrases ) ) ( (lv_response_3_0= ruleResponses ) ) ( (lv_action_4_0= ruleActions ) )? )
            {
            // InternalDialogFlow.g:174:2: (otherlv_0= 'intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_phrase_2_0= rulePhrases ) ) ( (lv_response_3_0= ruleResponses ) ) ( (lv_action_4_0= ruleActions ) )? )
            // InternalDialogFlow.g:175:3: otherlv_0= 'intent' ( (lv_name_1_0= RULE_ID ) ) ( (lv_phrase_2_0= rulePhrases ) ) ( (lv_response_3_0= ruleResponses ) ) ( (lv_action_4_0= ruleActions ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getIntentKeyword_0());
            		
            // InternalDialogFlow.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogFlow.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogFlow.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalDialogFlow.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogFlow.g:197:3: ( (lv_phrase_2_0= rulePhrases ) )
            // InternalDialogFlow.g:198:4: (lv_phrase_2_0= rulePhrases )
            {
            // InternalDialogFlow.g:198:4: (lv_phrase_2_0= rulePhrases )
            // InternalDialogFlow.g:199:5: lv_phrase_2_0= rulePhrases
            {

            					newCompositeNode(grammarAccess.getIntentAccess().getPhrasePhrasesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_phrase_2_0=rulePhrases();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntentRule());
            					}
            					set(
            						current,
            						"phrase",
            						lv_phrase_2_0,
            						"dk.sdu.mmmi.mdsd.DialogFlow.Phrases");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDialogFlow.g:216:3: ( (lv_response_3_0= ruleResponses ) )
            // InternalDialogFlow.g:217:4: (lv_response_3_0= ruleResponses )
            {
            // InternalDialogFlow.g:217:4: (lv_response_3_0= ruleResponses )
            // InternalDialogFlow.g:218:5: lv_response_3_0= ruleResponses
            {

            					newCompositeNode(grammarAccess.getIntentAccess().getResponseResponsesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_response_3_0=ruleResponses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntentRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_3_0,
            						"dk.sdu.mmmi.mdsd.DialogFlow.Responses");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDialogFlow.g:235:3: ( (lv_action_4_0= ruleActions ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDialogFlow.g:236:4: (lv_action_4_0= ruleActions )
                    {
                    // InternalDialogFlow.g:236:4: (lv_action_4_0= ruleActions )
                    // InternalDialogFlow.g:237:5: lv_action_4_0= ruleActions
                    {

                    					newCompositeNode(grammarAccess.getIntentAccess().getActionActionsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_action_4_0=ruleActions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIntentRule());
                    					}
                    					set(
                    						current,
                    						"action",
                    						lv_action_4_0,
                    						"dk.sdu.mmmi.mdsd.DialogFlow.Actions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRulePhrases"
    // InternalDialogFlow.g:258:1: entryRulePhrases returns [EObject current=null] : iv_rulePhrases= rulePhrases EOF ;
    public final EObject entryRulePhrases() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrases = null;


        try {
            // InternalDialogFlow.g:258:48: (iv_rulePhrases= rulePhrases EOF )
            // InternalDialogFlow.g:259:2: iv_rulePhrases= rulePhrases EOF
            {
             newCompositeNode(grammarAccess.getPhrasesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhrases=rulePhrases();

            state._fsp--;

             current =iv_rulePhrases; 
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
    // $ANTLR end "entryRulePhrases"


    // $ANTLR start "rulePhrases"
    // InternalDialogFlow.g:265:1: rulePhrases returns [EObject current=null] : ( () otherlv_1= 'phrases' ( (lv_phrases_2_0= rulePhraseValue ) )* ) ;
    public final EObject rulePhrases() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_phrases_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:271:2: ( ( () otherlv_1= 'phrases' ( (lv_phrases_2_0= rulePhraseValue ) )* ) )
            // InternalDialogFlow.g:272:2: ( () otherlv_1= 'phrases' ( (lv_phrases_2_0= rulePhraseValue ) )* )
            {
            // InternalDialogFlow.g:272:2: ( () otherlv_1= 'phrases' ( (lv_phrases_2_0= rulePhraseValue ) )* )
            // InternalDialogFlow.g:273:3: () otherlv_1= 'phrases' ( (lv_phrases_2_0= rulePhraseValue ) )*
            {
            // InternalDialogFlow.g:273:3: ()
            // InternalDialogFlow.g:274:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhrasesAccess().getPhrasesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPhrasesAccess().getPhrasesKeyword_1());
            		
            // InternalDialogFlow.g:284:3: ( (lv_phrases_2_0= rulePhraseValue ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDialogFlow.g:285:4: (lv_phrases_2_0= rulePhraseValue )
            	    {
            	    // InternalDialogFlow.g:285:4: (lv_phrases_2_0= rulePhraseValue )
            	    // InternalDialogFlow.g:286:5: lv_phrases_2_0= rulePhraseValue
            	    {

            	    					newCompositeNode(grammarAccess.getPhrasesAccess().getPhrasesPhraseValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_phrases_2_0=rulePhraseValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhrasesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"phrases",
            	    						lv_phrases_2_0,
            	    						"dk.sdu.mmmi.mdsd.DialogFlow.PhraseValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "rulePhrases"


    // $ANTLR start "entryRulePhraseValue"
    // InternalDialogFlow.g:307:1: entryRulePhraseValue returns [EObject current=null] : iv_rulePhraseValue= rulePhraseValue EOF ;
    public final EObject entryRulePhraseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhraseValue = null;


        try {
            // InternalDialogFlow.g:307:52: (iv_rulePhraseValue= rulePhraseValue EOF )
            // InternalDialogFlow.g:308:2: iv_rulePhraseValue= rulePhraseValue EOF
            {
             newCompositeNode(grammarAccess.getPhraseValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhraseValue=rulePhraseValue();

            state._fsp--;

             current =iv_rulePhraseValue; 
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
    // $ANTLR end "entryRulePhraseValue"


    // $ANTLR start "rulePhraseValue"
    // InternalDialogFlow.g:314:1: rulePhraseValue returns [EObject current=null] : (otherlv_0= 'expression' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_mapping_3_0= ruleMapping ) ) )* ) ;
    public final EObject rulePhraseValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_mapping_1_0 = null;

        EObject lv_mapping_3_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:320:2: ( (otherlv_0= 'expression' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_mapping_3_0= ruleMapping ) ) )* ) )
            // InternalDialogFlow.g:321:2: (otherlv_0= 'expression' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_mapping_3_0= ruleMapping ) ) )* )
            {
            // InternalDialogFlow.g:321:2: (otherlv_0= 'expression' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_mapping_3_0= ruleMapping ) ) )* )
            // InternalDialogFlow.g:322:3: otherlv_0= 'expression' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_mapping_3_0= ruleMapping ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhraseValueAccess().getExpressionKeyword_0());
            		
            // InternalDialogFlow.g:326:3: ( (lv_mapping_1_0= ruleMapping ) )
            // InternalDialogFlow.g:327:4: (lv_mapping_1_0= ruleMapping )
            {
            // InternalDialogFlow.g:327:4: (lv_mapping_1_0= ruleMapping )
            // InternalDialogFlow.g:328:5: lv_mapping_1_0= ruleMapping
            {

            					newCompositeNode(grammarAccess.getPhraseValueAccess().getMappingMappingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_mapping_1_0=ruleMapping();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhraseValueRule());
            					}
            					add(
            						current,
            						"mapping",
            						lv_mapping_1_0,
            						"dk.sdu.mmmi.mdsd.DialogFlow.Mapping");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDialogFlow.g:345:3: (otherlv_2= ',' ( (lv_mapping_3_0= ruleMapping ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDialogFlow.g:346:4: otherlv_2= ',' ( (lv_mapping_3_0= ruleMapping ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPhraseValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDialogFlow.g:350:4: ( (lv_mapping_3_0= ruleMapping ) )
            	    // InternalDialogFlow.g:351:5: (lv_mapping_3_0= ruleMapping )
            	    {
            	    // InternalDialogFlow.g:351:5: (lv_mapping_3_0= ruleMapping )
            	    // InternalDialogFlow.g:352:6: lv_mapping_3_0= ruleMapping
            	    {

            	    						newCompositeNode(grammarAccess.getPhraseValueAccess().getMappingMappingParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_mapping_3_0=ruleMapping();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPhraseValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mapping",
            	    							lv_mapping_3_0,
            	    							"dk.sdu.mmmi.mdsd.DialogFlow.Mapping");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "rulePhraseValue"


    // $ANTLR start "entryRuleMapping"
    // InternalDialogFlow.g:374:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalDialogFlow.g:374:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalDialogFlow.g:375:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalDialogFlow.g:381:1: ruleMapping returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:387:2: ( ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalDialogFlow.g:388:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalDialogFlow.g:388:2: ( ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalDialogFlow.g:389:3: ( (lv_value_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalDialogFlow.g:389:3: ( (lv_value_0_0= RULE_STRING ) )
            // InternalDialogFlow.g:390:4: (lv_value_0_0= RULE_STRING )
            {
            // InternalDialogFlow.g:390:4: (lv_value_0_0= RULE_STRING )
            // InternalDialogFlow.g:391:5: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_value_0_0, grammarAccess.getMappingAccess().getValueSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDialogFlow.g:407:3: (otherlv_1= 'as' ( (otherlv_2= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDialogFlow.g:408:4: otherlv_1= 'as' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getAsKeyword_1_0());
                    			
                    // InternalDialogFlow.g:412:4: ( (otherlv_2= RULE_ID ) )
                    // InternalDialogFlow.g:413:5: (otherlv_2= RULE_ID )
                    {
                    // InternalDialogFlow.g:413:5: (otherlv_2= RULE_ID )
                    // InternalDialogFlow.g:414:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getEntityEntityCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleResponses"
    // InternalDialogFlow.g:430:1: entryRuleResponses returns [EObject current=null] : iv_ruleResponses= ruleResponses EOF ;
    public final EObject entryRuleResponses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponses = null;


        try {
            // InternalDialogFlow.g:430:50: (iv_ruleResponses= ruleResponses EOF )
            // InternalDialogFlow.g:431:2: iv_ruleResponses= ruleResponses EOF
            {
             newCompositeNode(grammarAccess.getResponsesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponses=ruleResponses();

            state._fsp--;

             current =iv_ruleResponses; 
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
    // $ANTLR end "entryRuleResponses"


    // $ANTLR start "ruleResponses"
    // InternalDialogFlow.g:437:1: ruleResponses returns [EObject current=null] : ( () otherlv_1= 'responses' ( (lv_responses_2_0= ruleResponseValue ) )* ) ;
    public final EObject ruleResponses() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_responses_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:443:2: ( ( () otherlv_1= 'responses' ( (lv_responses_2_0= ruleResponseValue ) )* ) )
            // InternalDialogFlow.g:444:2: ( () otherlv_1= 'responses' ( (lv_responses_2_0= ruleResponseValue ) )* )
            {
            // InternalDialogFlow.g:444:2: ( () otherlv_1= 'responses' ( (lv_responses_2_0= ruleResponseValue ) )* )
            // InternalDialogFlow.g:445:3: () otherlv_1= 'responses' ( (lv_responses_2_0= ruleResponseValue ) )*
            {
            // InternalDialogFlow.g:445:3: ()
            // InternalDialogFlow.g:446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResponsesAccess().getResponsesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getResponsesAccess().getResponsesKeyword_1());
            		
            // InternalDialogFlow.g:456:3: ( (lv_responses_2_0= ruleResponseValue ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDialogFlow.g:457:4: (lv_responses_2_0= ruleResponseValue )
            	    {
            	    // InternalDialogFlow.g:457:4: (lv_responses_2_0= ruleResponseValue )
            	    // InternalDialogFlow.g:458:5: lv_responses_2_0= ruleResponseValue
            	    {

            	    					newCompositeNode(grammarAccess.getResponsesAccess().getResponsesResponseValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_responses_2_0=ruleResponseValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResponsesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"responses",
            	    						lv_responses_2_0,
            	    						"dk.sdu.mmmi.mdsd.DialogFlow.ResponseValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleResponses"


    // $ANTLR start "entryRuleResponseValue"
    // InternalDialogFlow.g:479:1: entryRuleResponseValue returns [EObject current=null] : iv_ruleResponseValue= ruleResponseValue EOF ;
    public final EObject entryRuleResponseValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseValue = null;


        try {
            // InternalDialogFlow.g:479:54: (iv_ruleResponseValue= ruleResponseValue EOF )
            // InternalDialogFlow.g:480:2: iv_ruleResponseValue= ruleResponseValue EOF
            {
             newCompositeNode(grammarAccess.getResponseValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponseValue=ruleResponseValue();

            state._fsp--;

             current =iv_ruleResponseValue; 
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
    // $ANTLR end "entryRuleResponseValue"


    // $ANTLR start "ruleResponseValue"
    // InternalDialogFlow.g:486:1: ruleResponseValue returns [EObject current=null] : (otherlv_0= 'reply' ( (lv_response_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleResponseValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_response_1_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:492:2: ( (otherlv_0= 'reply' ( (lv_response_1_0= RULE_STRING ) ) ) )
            // InternalDialogFlow.g:493:2: (otherlv_0= 'reply' ( (lv_response_1_0= RULE_STRING ) ) )
            {
            // InternalDialogFlow.g:493:2: (otherlv_0= 'reply' ( (lv_response_1_0= RULE_STRING ) ) )
            // InternalDialogFlow.g:494:3: otherlv_0= 'reply' ( (lv_response_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseValueAccess().getReplyKeyword_0());
            		
            // InternalDialogFlow.g:498:3: ( (lv_response_1_0= RULE_STRING ) )
            // InternalDialogFlow.g:499:4: (lv_response_1_0= RULE_STRING )
            {
            // InternalDialogFlow.g:499:4: (lv_response_1_0= RULE_STRING )
            // InternalDialogFlow.g:500:5: lv_response_1_0= RULE_STRING
            {
            lv_response_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_response_1_0, grammarAccess.getResponseValueAccess().getResponseSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResponseValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"response",
            						lv_response_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleResponseValue"


    // $ANTLR start "entryRuleActions"
    // InternalDialogFlow.g:520:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalDialogFlow.g:520:48: (iv_ruleActions= ruleActions EOF )
            // InternalDialogFlow.g:521:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalDialogFlow.g:527:1: ruleActions returns [EObject current=null] : ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:533:2: ( ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* ) )
            // InternalDialogFlow.g:534:2: ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* )
            {
            // InternalDialogFlow.g:534:2: ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* )
            // InternalDialogFlow.g:535:3: () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )*
            {
            // InternalDialogFlow.g:535:3: ()
            // InternalDialogFlow.g:536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionsAccess().getActionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getActionsAccess().getActionsKeyword_1());
            		
            // InternalDialogFlow.g:546:3: ( (lv_actions_2_0= ruleActionValue ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDialogFlow.g:547:4: (lv_actions_2_0= ruleActionValue )
            	    {
            	    // InternalDialogFlow.g:547:4: (lv_actions_2_0= ruleActionValue )
            	    // InternalDialogFlow.g:548:5: lv_actions_2_0= ruleActionValue
            	    {

            	    					newCompositeNode(grammarAccess.getActionsAccess().getActionsActionValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_actions_2_0=ruleActionValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"dk.sdu.mmmi.mdsd.DialogFlow.ActionValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleActionValue"
    // InternalDialogFlow.g:569:1: entryRuleActionValue returns [EObject current=null] : iv_ruleActionValue= ruleActionValue EOF ;
    public final EObject entryRuleActionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionValue = null;


        try {
            // InternalDialogFlow.g:569:52: (iv_ruleActionValue= ruleActionValue EOF )
            // InternalDialogFlow.g:570:2: iv_ruleActionValue= ruleActionValue EOF
            {
             newCompositeNode(grammarAccess.getActionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionValue=ruleActionValue();

            state._fsp--;

             current =iv_ruleActionValue; 
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
    // $ANTLR end "entryRuleActionValue"


    // $ANTLR start "ruleActionValue"
    // InternalDialogFlow.g:576:1: ruleActionValue returns [EObject current=null] : (otherlv_0= 'param' otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ( (lv_value_5_0= RULE_STRING ) ) ( (lv_list_6_0= RULE_STRING ) )? ) ;
    public final EObject ruleActionValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token lv_list_6_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:582:2: ( (otherlv_0= 'param' otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ( (lv_value_5_0= RULE_STRING ) ) ( (lv_list_6_0= RULE_STRING ) )? ) )
            // InternalDialogFlow.g:583:2: (otherlv_0= 'param' otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ( (lv_value_5_0= RULE_STRING ) ) ( (lv_list_6_0= RULE_STRING ) )? )
            {
            // InternalDialogFlow.g:583:2: (otherlv_0= 'param' otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ( (lv_value_5_0= RULE_STRING ) ) ( (lv_list_6_0= RULE_STRING ) )? )
            // InternalDialogFlow.g:584:3: otherlv_0= 'param' otherlv_1= 'name' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ( (lv_value_5_0= RULE_STRING ) ) ( (lv_list_6_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getActionValueAccess().getParamKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActionValueAccess().getNameKeyword_1());
            		
            // InternalDialogFlow.g:592:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDialogFlow.g:593:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDialogFlow.g:593:4: (lv_name_2_0= RULE_ID )
            // InternalDialogFlow.g:594:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getActionValueAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getActionValueAccess().getTypeKeyword_3());
            		
            // InternalDialogFlow.g:614:3: ( (otherlv_4= RULE_ID ) )
            // InternalDialogFlow.g:615:4: (otherlv_4= RULE_ID )
            {
            // InternalDialogFlow.g:615:4: (otherlv_4= RULE_ID )
            // InternalDialogFlow.g:616:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionValueRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getActionValueAccess().getTypeEntityCrossReference_4_0());
            				

            }


            }

            // InternalDialogFlow.g:627:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalDialogFlow.g:628:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalDialogFlow.g:628:4: (lv_value_5_0= RULE_STRING )
            // InternalDialogFlow.g:629:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_value_5_0, grammarAccess.getActionValueAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDialogFlow.g:645:3: ( (lv_list_6_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDialogFlow.g:646:4: (lv_list_6_0= RULE_STRING )
                    {
                    // InternalDialogFlow.g:646:4: (lv_list_6_0= RULE_STRING )
                    // InternalDialogFlow.g:647:5: lv_list_6_0= RULE_STRING
                    {
                    lv_list_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_list_6_0, grammarAccess.getActionValueAccess().getListSTRINGTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"list",
                    						lv_list_6_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleActionValue"


    // $ANTLR start "entryRuleEntity"
    // InternalDialogFlow.g:667:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDialogFlow.g:667:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDialogFlow.g:668:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDialogFlow.g:674:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:680:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* ) )
            // InternalDialogFlow.g:681:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* )
            {
            // InternalDialogFlow.g:681:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* )
            // InternalDialogFlow.g:682:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDialogFlow.g:686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogFlow.g:687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogFlow.g:687:4: (lv_name_1_0= RULE_ID )
            // InternalDialogFlow.g:688:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogFlow.g:704:3: ( (lv_entities_2_0= ruleEntityValue ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDialogFlow.g:705:4: (lv_entities_2_0= ruleEntityValue )
            	    {
            	    // InternalDialogFlow.g:705:4: (lv_entities_2_0= ruleEntityValue )
            	    // InternalDialogFlow.g:706:5: lv_entities_2_0= ruleEntityValue
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getEntitiesEntityValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_entities_2_0=ruleEntityValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"dk.sdu.mmmi.mdsd.DialogFlow.EntityValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityValue"
    // InternalDialogFlow.g:727:1: entryRuleEntityValue returns [EObject current=null] : iv_ruleEntityValue= ruleEntityValue EOF ;
    public final EObject entryRuleEntityValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityValue = null;


        try {
            // InternalDialogFlow.g:727:52: (iv_ruleEntityValue= ruleEntityValue EOF )
            // InternalDialogFlow.g:728:2: iv_ruleEntityValue= ruleEntityValue EOF
            {
             newCompositeNode(grammarAccess.getEntityValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityValue=ruleEntityValue();

            state._fsp--;

             current =iv_ruleEntityValue; 
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
    // $ANTLR end "entryRuleEntityValue"


    // $ANTLR start "ruleEntityValue"
    // InternalDialogFlow.g:734:1: ruleEntityValue returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_values_1_0= RULE_STRING ) ) ( (otherlv_2= 'synonym' | otherlv_3= 'synonyms' ) ( (lv_synonyms_4_0= ruleEntitySynonyms ) )* )? ) ;
    public final EObject ruleEntityValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_synonyms_4_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:740:2: ( (otherlv_0= 'reference' ( (lv_values_1_0= RULE_STRING ) ) ( (otherlv_2= 'synonym' | otherlv_3= 'synonyms' ) ( (lv_synonyms_4_0= ruleEntitySynonyms ) )* )? ) )
            // InternalDialogFlow.g:741:2: (otherlv_0= 'reference' ( (lv_values_1_0= RULE_STRING ) ) ( (otherlv_2= 'synonym' | otherlv_3= 'synonyms' ) ( (lv_synonyms_4_0= ruleEntitySynonyms ) )* )? )
            {
            // InternalDialogFlow.g:741:2: (otherlv_0= 'reference' ( (lv_values_1_0= RULE_STRING ) ) ( (otherlv_2= 'synonym' | otherlv_3= 'synonyms' ) ( (lv_synonyms_4_0= ruleEntitySynonyms ) )* )? )
            // InternalDialogFlow.g:742:3: otherlv_0= 'reference' ( (lv_values_1_0= RULE_STRING ) ) ( (otherlv_2= 'synonym' | otherlv_3= 'synonyms' ) ( (lv_synonyms_4_0= ruleEntitySynonyms ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityValueAccess().getReferenceKeyword_0());
            		
            // InternalDialogFlow.g:746:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalDialogFlow.g:747:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalDialogFlow.g:747:4: (lv_values_1_0= RULE_STRING )
            // InternalDialogFlow.g:748:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_values_1_0, grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityValueRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDialogFlow.g:764:3: ( (otherlv_2= 'synonym' | otherlv_3= 'synonyms' ) ( (lv_synonyms_4_0= ruleEntitySynonyms ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=25 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDialogFlow.g:765:4: (otherlv_2= 'synonym' | otherlv_3= 'synonyms' ) ( (lv_synonyms_4_0= ruleEntitySynonyms ) )*
                    {
                    // InternalDialogFlow.g:765:4: (otherlv_2= 'synonym' | otherlv_3= 'synonyms' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==26) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDialogFlow.g:766:5: otherlv_2= 'synonym'
                            {
                            otherlv_2=(Token)match(input,25,FOLLOW_16); 

                            					newLeafNode(otherlv_2, grammarAccess.getEntityValueAccess().getSynonymKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDialogFlow.g:771:5: otherlv_3= 'synonyms'
                            {
                            otherlv_3=(Token)match(input,26,FOLLOW_16); 

                            					newLeafNode(otherlv_3, grammarAccess.getEntityValueAccess().getSynonymsKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDialogFlow.g:776:4: ( (lv_synonyms_4_0= ruleEntitySynonyms ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_STRING) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDialogFlow.g:777:5: (lv_synonyms_4_0= ruleEntitySynonyms )
                    	    {
                    	    // InternalDialogFlow.g:777:5: (lv_synonyms_4_0= ruleEntitySynonyms )
                    	    // InternalDialogFlow.g:778:6: lv_synonyms_4_0= ruleEntitySynonyms
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityValueAccess().getSynonymsEntitySynonymsParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_synonyms_4_0=ruleEntitySynonyms();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityValueRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"synonyms",
                    	    							lv_synonyms_4_0,
                    	    							"dk.sdu.mmmi.mdsd.DialogFlow.EntitySynonyms");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleEntityValue"


    // $ANTLR start "entryRuleEntitySynonyms"
    // InternalDialogFlow.g:800:1: entryRuleEntitySynonyms returns [EObject current=null] : iv_ruleEntitySynonyms= ruleEntitySynonyms EOF ;
    public final EObject entryRuleEntitySynonyms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySynonyms = null;


        try {
            // InternalDialogFlow.g:800:55: (iv_ruleEntitySynonyms= ruleEntitySynonyms EOF )
            // InternalDialogFlow.g:801:2: iv_ruleEntitySynonyms= ruleEntitySynonyms EOF
            {
             newCompositeNode(grammarAccess.getEntitySynonymsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySynonyms=ruleEntitySynonyms();

            state._fsp--;

             current =iv_ruleEntitySynonyms; 
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
    // $ANTLR end "entryRuleEntitySynonyms"


    // $ANTLR start "ruleEntitySynonyms"
    // InternalDialogFlow.g:807:1: ruleEntitySynonyms returns [EObject current=null] : ( () ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEntitySynonyms() throws RecognitionException {
        EObject current = null;

        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:813:2: ( ( () ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* ) )
            // InternalDialogFlow.g:814:2: ( () ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* )
            {
            // InternalDialogFlow.g:814:2: ( () ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* )
            // InternalDialogFlow.g:815:3: () ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            {
            // InternalDialogFlow.g:815:3: ()
            // InternalDialogFlow.g:816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntitySynonymsAccess().getEntitySynonymsAction_0(),
            					current);
            			

            }

            // InternalDialogFlow.g:822:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalDialogFlow.g:823:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalDialogFlow.g:823:4: (lv_values_1_0= RULE_STRING )
            // InternalDialogFlow.g:824:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_values_1_0, grammarAccess.getEntitySynonymsAccess().getValuesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntitySynonymsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDialogFlow.g:840:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDialogFlow.g:841:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEntitySynonymsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDialogFlow.g:845:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalDialogFlow.g:846:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalDialogFlow.g:846:5: (lv_values_3_0= RULE_STRING )
            	    // InternalDialogFlow.g:847:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getEntitySynonymsAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntitySynonymsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleEntitySynonyms"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000801002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000002L});

}