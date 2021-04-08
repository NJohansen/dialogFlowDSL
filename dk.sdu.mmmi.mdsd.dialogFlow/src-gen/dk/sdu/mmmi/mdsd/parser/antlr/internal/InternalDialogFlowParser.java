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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'intent'", "'phrases'", "'val'", "','", "'responses'", "'actions'", "'entity'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( (LA1_0==12||LA1_0==18) ) {
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
            else if ( (LA2_0==18) ) {
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

            if ( (LA3_0==17) ) {
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
    // InternalDialogFlow.g:314:1: rulePhraseValue returns [EObject current=null] : (otherlv_0= 'val' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_text_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? )* ) ;
    public final EObject rulePhraseValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:320:2: ( (otherlv_0= 'val' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_text_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? )* ) )
            // InternalDialogFlow.g:321:2: (otherlv_0= 'val' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_text_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? )* )
            {
            // InternalDialogFlow.g:321:2: (otherlv_0= 'val' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_text_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? )* )
            // InternalDialogFlow.g:322:3: otherlv_0= 'val' ( (lv_value_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_text_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPhraseValueAccess().getValKeyword_0());
            		
            // InternalDialogFlow.g:326:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDialogFlow.g:327:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDialogFlow.g:327:4: (lv_value_1_0= RULE_STRING )
            // InternalDialogFlow.g:328:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPhraseValueAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhraseValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDialogFlow.g:344:3: (otherlv_2= ',' ( (lv_text_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDialogFlow.g:345:4: otherlv_2= ',' ( (lv_text_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )?
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPhraseValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDialogFlow.g:349:4: ( (lv_text_3_0= RULE_STRING ) )
            	    // InternalDialogFlow.g:350:5: (lv_text_3_0= RULE_STRING )
            	    {
            	    // InternalDialogFlow.g:350:5: (lv_text_3_0= RULE_STRING )
            	    // InternalDialogFlow.g:351:6: lv_text_3_0= RULE_STRING
            	    {
            	    lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(lv_text_3_0, grammarAccess.getPhraseValueAccess().getTextSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPhraseValueRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"text",
            	    							lv_text_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }

            	    // InternalDialogFlow.g:367:4: ( (otherlv_4= RULE_ID ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_ID) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalDialogFlow.g:368:5: (otherlv_4= RULE_ID )
            	            {
            	            // InternalDialogFlow.g:368:5: (otherlv_4= RULE_ID )
            	            // InternalDialogFlow.g:369:6: otherlv_4= RULE_ID
            	            {

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getPhraseValueRule());
            	            						}
            	            					
            	            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPhraseValueAccess().getEntityEntityCrossReference_2_2_0());
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "entryRuleResponses"
    // InternalDialogFlow.g:385:1: entryRuleResponses returns [EObject current=null] : iv_ruleResponses= ruleResponses EOF ;
    public final EObject entryRuleResponses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponses = null;


        try {
            // InternalDialogFlow.g:385:50: (iv_ruleResponses= ruleResponses EOF )
            // InternalDialogFlow.g:386:2: iv_ruleResponses= ruleResponses EOF
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
    // InternalDialogFlow.g:392:1: ruleResponses returns [EObject current=null] : (otherlv_0= 'responses' ( (lv_responses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_responses_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleResponses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_responses_1_0=null;
        Token otherlv_2=null;
        Token lv_responses_3_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:398:2: ( (otherlv_0= 'responses' ( (lv_responses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_responses_3_0= RULE_STRING ) ) )* ) )
            // InternalDialogFlow.g:399:2: (otherlv_0= 'responses' ( (lv_responses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_responses_3_0= RULE_STRING ) ) )* )
            {
            // InternalDialogFlow.g:399:2: (otherlv_0= 'responses' ( (lv_responses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_responses_3_0= RULE_STRING ) ) )* )
            // InternalDialogFlow.g:400:3: otherlv_0= 'responses' ( (lv_responses_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_responses_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getResponsesAccess().getResponsesKeyword_0());
            		
            // InternalDialogFlow.g:404:3: ( (lv_responses_1_0= RULE_STRING ) )
            // InternalDialogFlow.g:405:4: (lv_responses_1_0= RULE_STRING )
            {
            // InternalDialogFlow.g:405:4: (lv_responses_1_0= RULE_STRING )
            // InternalDialogFlow.g:406:5: lv_responses_1_0= RULE_STRING
            {
            lv_responses_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_responses_1_0, grammarAccess.getResponsesAccess().getResponsesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResponsesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"responses",
            						lv_responses_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDialogFlow.g:422:3: (otherlv_2= ',' ( (lv_responses_3_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDialogFlow.g:423:4: otherlv_2= ',' ( (lv_responses_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getResponsesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDialogFlow.g:427:4: ( (lv_responses_3_0= RULE_STRING ) )
            	    // InternalDialogFlow.g:428:5: (lv_responses_3_0= RULE_STRING )
            	    {
            	    // InternalDialogFlow.g:428:5: (lv_responses_3_0= RULE_STRING )
            	    // InternalDialogFlow.g:429:6: lv_responses_3_0= RULE_STRING
            	    {
            	    lv_responses_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_responses_3_0, grammarAccess.getResponsesAccess().getResponsesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getResponsesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"responses",
            	    							lv_responses_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


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


    // $ANTLR start "entryRuleActions"
    // InternalDialogFlow.g:450:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalDialogFlow.g:450:48: (iv_ruleActions= ruleActions EOF )
            // InternalDialogFlow.g:451:2: iv_ruleActions= ruleActions EOF
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
    // InternalDialogFlow.g:457:1: ruleActions returns [EObject current=null] : ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:463:2: ( ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* ) )
            // InternalDialogFlow.g:464:2: ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* )
            {
            // InternalDialogFlow.g:464:2: ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* )
            // InternalDialogFlow.g:465:3: () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )*
            {
            // InternalDialogFlow.g:465:3: ()
            // InternalDialogFlow.g:466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionsAccess().getActionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActionsAccess().getActionsKeyword_1());
            		
            // InternalDialogFlow.g:476:3: ( (lv_actions_2_0= ruleActionValue ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDialogFlow.g:477:4: (lv_actions_2_0= ruleActionValue )
            	    {
            	    // InternalDialogFlow.g:477:4: (lv_actions_2_0= ruleActionValue )
            	    // InternalDialogFlow.g:478:5: lv_actions_2_0= ruleActionValue
            	    {

            	    					newCompositeNode(grammarAccess.getActionsAccess().getActionsActionValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
    // InternalDialogFlow.g:499:1: entryRuleActionValue returns [EObject current=null] : iv_ruleActionValue= ruleActionValue EOF ;
    public final EObject entryRuleActionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionValue = null;


        try {
            // InternalDialogFlow.g:499:52: (iv_ruleActionValue= ruleActionValue EOF )
            // InternalDialogFlow.g:500:2: iv_ruleActionValue= ruleActionValue EOF
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
    // InternalDialogFlow.g:506:1: ruleActionValue returns [EObject current=null] : (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleActionValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:512:2: ( (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? ) )
            // InternalDialogFlow.g:513:2: (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? )
            {
            // InternalDialogFlow.g:513:2: (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? )
            // InternalDialogFlow.g:514:3: otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionValueAccess().getValKeyword_0());
            		
            // InternalDialogFlow.g:518:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogFlow.g:519:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogFlow.g:519:4: (lv_name_1_0= RULE_ID )
            // InternalDialogFlow.g:520:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionValueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDialogFlow.g:536:3: ( (otherlv_2= RULE_ID ) )
            // InternalDialogFlow.g:537:4: (otherlv_2= RULE_ID )
            {
            // InternalDialogFlow.g:537:4: (otherlv_2= RULE_ID )
            // InternalDialogFlow.g:538:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionValueRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getActionValueAccess().getTypeEntityCrossReference_2_0());
            				

            }


            }

            // InternalDialogFlow.g:549:3: ( (lv_list_3_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDialogFlow.g:550:4: (lv_list_3_0= RULE_STRING )
                    {
                    // InternalDialogFlow.g:550:4: (lv_list_3_0= RULE_STRING )
                    // InternalDialogFlow.g:551:5: lv_list_3_0= RULE_STRING
                    {
                    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_list_3_0, grammarAccess.getActionValueAccess().getListSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"list",
                    						lv_list_3_0,
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
    // InternalDialogFlow.g:571:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDialogFlow.g:571:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDialogFlow.g:572:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalDialogFlow.g:578:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:584:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* ) )
            // InternalDialogFlow.g:585:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* )
            {
            // InternalDialogFlow.g:585:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* )
            // InternalDialogFlow.g:586:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDialogFlow.g:590:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogFlow.g:591:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogFlow.g:591:4: (lv_name_1_0= RULE_ID )
            // InternalDialogFlow.g:592:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalDialogFlow.g:608:3: ( (lv_entities_2_0= ruleEntityValue ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDialogFlow.g:609:4: (lv_entities_2_0= ruleEntityValue )
            	    {
            	    // InternalDialogFlow.g:609:4: (lv_entities_2_0= ruleEntityValue )
            	    // InternalDialogFlow.g:610:5: lv_entities_2_0= ruleEntityValue
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getEntitiesEntityValueParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
    // InternalDialogFlow.g:631:1: entryRuleEntityValue returns [EObject current=null] : iv_ruleEntityValue= ruleEntityValue EOF ;
    public final EObject entryRuleEntityValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityValue = null;


        try {
            // InternalDialogFlow.g:631:52: (iv_ruleEntityValue= ruleEntityValue EOF )
            // InternalDialogFlow.g:632:2: iv_ruleEntityValue= ruleEntityValue EOF
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
    // InternalDialogFlow.g:638:1: ruleEntityValue returns [EObject current=null] : (otherlv_0= 'val' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEntityValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:644:2: ( (otherlv_0= 'val' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* ) )
            // InternalDialogFlow.g:645:2: (otherlv_0= 'val' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* )
            {
            // InternalDialogFlow.g:645:2: (otherlv_0= 'val' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* )
            // InternalDialogFlow.g:646:3: otherlv_0= 'val' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityValueAccess().getValKeyword_0());
            		
            // InternalDialogFlow.g:650:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalDialogFlow.g:651:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalDialogFlow.g:651:4: (lv_values_1_0= RULE_STRING )
            // InternalDialogFlow.g:652:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            // InternalDialogFlow.g:668:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDialogFlow.g:669:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEntityValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDialogFlow.g:673:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalDialogFlow.g:674:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalDialogFlow.g:674:5: (lv_values_3_0= RULE_STRING )
            	    // InternalDialogFlow.g:675:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntityValueRule());
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
            	    break loop11;
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
    // $ANTLR end "ruleEntityValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});

}