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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'intent'", "'phrases'", "'val'", "'\"'", "','", "'actions'", "'entity'"
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
    // InternalDialogFlow.g:314:1: rulePhraseValue returns [EObject current=null] : (otherlv_0= 'val' otherlv_1= '\"' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\"' ) ;
    public final EObject rulePhraseValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:320:2: ( (otherlv_0= 'val' otherlv_1= '\"' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\"' ) )
            // InternalDialogFlow.g:321:2: (otherlv_0= 'val' otherlv_1= '\"' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\"' )
            {
            // InternalDialogFlow.g:321:2: (otherlv_0= 'val' otherlv_1= '\"' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\"' )
            // InternalDialogFlow.g:322:3: otherlv_0= 'val' otherlv_1= '\"' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= '\"'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPhraseValueAccess().getValKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPhraseValueAccess().getQuotationMarkKeyword_1());
            		
            // InternalDialogFlow.g:330:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDialogFlow.g:331:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDialogFlow.g:331:4: (lv_value_2_0= RULE_STRING )
            // InternalDialogFlow.g:332:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_value_2_0, grammarAccess.getPhraseValueAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhraseValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPhraseValueAccess().getQuotationMarkKeyword_3());
            		

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
    // InternalDialogFlow.g:356:1: entryRuleResponses returns [EObject current=null] : iv_ruleResponses= ruleResponses EOF ;
    public final EObject entryRuleResponses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponses = null;


        try {
            // InternalDialogFlow.g:356:50: (iv_ruleResponses= ruleResponses EOF )
            // InternalDialogFlow.g:357:2: iv_ruleResponses= ruleResponses EOF
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
    // InternalDialogFlow.g:363:1: ruleResponses returns [EObject current=null] : (otherlv_0= '\"' ( (lv_responses_1_0= RULE_STRING ) ) otherlv_2= '\"' (otherlv_3= ',' ( (lv_responses_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleResponses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_responses_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_responses_4_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:369:2: ( (otherlv_0= '\"' ( (lv_responses_1_0= RULE_STRING ) ) otherlv_2= '\"' (otherlv_3= ',' ( (lv_responses_4_0= RULE_STRING ) ) )* ) )
            // InternalDialogFlow.g:370:2: (otherlv_0= '\"' ( (lv_responses_1_0= RULE_STRING ) ) otherlv_2= '\"' (otherlv_3= ',' ( (lv_responses_4_0= RULE_STRING ) ) )* )
            {
            // InternalDialogFlow.g:370:2: (otherlv_0= '\"' ( (lv_responses_1_0= RULE_STRING ) ) otherlv_2= '\"' (otherlv_3= ',' ( (lv_responses_4_0= RULE_STRING ) ) )* )
            // InternalDialogFlow.g:371:3: otherlv_0= '\"' ( (lv_responses_1_0= RULE_STRING ) ) otherlv_2= '\"' (otherlv_3= ',' ( (lv_responses_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getResponsesAccess().getQuotationMarkKeyword_0());
            		
            // InternalDialogFlow.g:375:3: ( (lv_responses_1_0= RULE_STRING ) )
            // InternalDialogFlow.g:376:4: (lv_responses_1_0= RULE_STRING )
            {
            // InternalDialogFlow.g:376:4: (lv_responses_1_0= RULE_STRING )
            // InternalDialogFlow.g:377:5: lv_responses_1_0= RULE_STRING
            {
            lv_responses_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getResponsesAccess().getQuotationMarkKeyword_2());
            		
            // InternalDialogFlow.g:397:3: (otherlv_3= ',' ( (lv_responses_4_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDialogFlow.g:398:4: otherlv_3= ',' ( (lv_responses_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getResponsesAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDialogFlow.g:402:4: ( (lv_responses_4_0= RULE_STRING ) )
            	    // InternalDialogFlow.g:403:5: (lv_responses_4_0= RULE_STRING )
            	    {
            	    // InternalDialogFlow.g:403:5: (lv_responses_4_0= RULE_STRING )
            	    // InternalDialogFlow.g:404:6: lv_responses_4_0= RULE_STRING
            	    {
            	    lv_responses_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_responses_4_0, grammarAccess.getResponsesAccess().getResponsesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getResponsesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"responses",
            	    							lv_responses_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

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
    // $ANTLR end "ruleResponses"


    // $ANTLR start "entryRuleActions"
    // InternalDialogFlow.g:425:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalDialogFlow.g:425:48: (iv_ruleActions= ruleActions EOF )
            // InternalDialogFlow.g:426:2: iv_ruleActions= ruleActions EOF
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
    // InternalDialogFlow.g:432:1: ruleActions returns [EObject current=null] : ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:438:2: ( ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* ) )
            // InternalDialogFlow.g:439:2: ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* )
            {
            // InternalDialogFlow.g:439:2: ( () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )* )
            // InternalDialogFlow.g:440:3: () otherlv_1= 'actions' ( (lv_actions_2_0= ruleActionValue ) )*
            {
            // InternalDialogFlow.g:440:3: ()
            // InternalDialogFlow.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionsAccess().getActionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActionsAccess().getActionsKeyword_1());
            		
            // InternalDialogFlow.g:451:3: ( (lv_actions_2_0= ruleActionValue ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDialogFlow.g:452:4: (lv_actions_2_0= ruleActionValue )
            	    {
            	    // InternalDialogFlow.g:452:4: (lv_actions_2_0= ruleActionValue )
            	    // InternalDialogFlow.g:453:5: lv_actions_2_0= ruleActionValue
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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleActionValue"
    // InternalDialogFlow.g:474:1: entryRuleActionValue returns [EObject current=null] : iv_ruleActionValue= ruleActionValue EOF ;
    public final EObject entryRuleActionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionValue = null;


        try {
            // InternalDialogFlow.g:474:52: (iv_ruleActionValue= ruleActionValue EOF )
            // InternalDialogFlow.g:475:2: iv_ruleActionValue= ruleActionValue EOF
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
    // InternalDialogFlow.g:481:1: ruleActionValue returns [EObject current=null] : (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleActionValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:487:2: ( (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? ) )
            // InternalDialogFlow.g:488:2: (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? )
            {
            // InternalDialogFlow.g:488:2: (otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )? )
            // InternalDialogFlow.g:489:3: otherlv_0= 'val' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_list_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionValueAccess().getValKeyword_0());
            		
            // InternalDialogFlow.g:493:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogFlow.g:494:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogFlow.g:494:4: (lv_name_1_0= RULE_ID )
            // InternalDialogFlow.g:495:5: lv_name_1_0= RULE_ID
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

            // InternalDialogFlow.g:511:3: ( (otherlv_2= RULE_ID ) )
            // InternalDialogFlow.g:512:4: (otherlv_2= RULE_ID )
            {
            // InternalDialogFlow.g:512:4: (otherlv_2= RULE_ID )
            // InternalDialogFlow.g:513:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionValueRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getActionValueAccess().getTypeEntityCrossReference_2_0());
            				

            }


            }

            // InternalDialogFlow.g:524:3: ( (lv_list_3_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDialogFlow.g:525:4: (lv_list_3_0= RULE_STRING )
                    {
                    // InternalDialogFlow.g:525:4: (lv_list_3_0= RULE_STRING )
                    // InternalDialogFlow.g:526:5: lv_list_3_0= RULE_STRING
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
    // InternalDialogFlow.g:546:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDialogFlow.g:546:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDialogFlow.g:547:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalDialogFlow.g:553:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;



        	enterRule();

        try {
            // InternalDialogFlow.g:559:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* ) )
            // InternalDialogFlow.g:560:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* )
            {
            // InternalDialogFlow.g:560:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )* )
            // InternalDialogFlow.g:561:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntityValue ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDialogFlow.g:565:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDialogFlow.g:566:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDialogFlow.g:566:4: (lv_name_1_0= RULE_ID )
            // InternalDialogFlow.g:567:5: lv_name_1_0= RULE_ID
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

            // InternalDialogFlow.g:583:3: ( (lv_entities_2_0= ruleEntityValue ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDialogFlow.g:584:4: (lv_entities_2_0= ruleEntityValue )
            	    {
            	    // InternalDialogFlow.g:584:4: (lv_entities_2_0= ruleEntityValue )
            	    // InternalDialogFlow.g:585:5: lv_entities_2_0= ruleEntityValue
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityValue"
    // InternalDialogFlow.g:606:1: entryRuleEntityValue returns [EObject current=null] : iv_ruleEntityValue= ruleEntityValue EOF ;
    public final EObject entryRuleEntityValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityValue = null;


        try {
            // InternalDialogFlow.g:606:52: (iv_ruleEntityValue= ruleEntityValue EOF )
            // InternalDialogFlow.g:607:2: iv_ruleEntityValue= ruleEntityValue EOF
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
    // InternalDialogFlow.g:613:1: ruleEntityValue returns [EObject current=null] : (otherlv_0= 'val' otherlv_1= '\"' ( (lv_values_2_0= RULE_STRING ) ) otherlv_3= '\"' (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEntityValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;


        	enterRule();

        try {
            // InternalDialogFlow.g:619:2: ( (otherlv_0= 'val' otherlv_1= '\"' ( (lv_values_2_0= RULE_STRING ) ) otherlv_3= '\"' (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* ) )
            // InternalDialogFlow.g:620:2: (otherlv_0= 'val' otherlv_1= '\"' ( (lv_values_2_0= RULE_STRING ) ) otherlv_3= '\"' (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )
            {
            // InternalDialogFlow.g:620:2: (otherlv_0= 'val' otherlv_1= '\"' ( (lv_values_2_0= RULE_STRING ) ) otherlv_3= '\"' (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )
            // InternalDialogFlow.g:621:3: otherlv_0= 'val' otherlv_1= '\"' ( (lv_values_2_0= RULE_STRING ) ) otherlv_3= '\"' (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityValueAccess().getValKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityValueAccess().getQuotationMarkKeyword_1());
            		
            // InternalDialogFlow.g:629:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalDialogFlow.g:630:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalDialogFlow.g:630:4: (lv_values_2_0= RULE_STRING )
            // InternalDialogFlow.g:631:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_values_2_0, grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityValueRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityValueAccess().getQuotationMarkKeyword_3());
            		
            // InternalDialogFlow.g:651:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDialogFlow.g:652:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEntityValueAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDialogFlow.g:656:4: ( (lv_values_5_0= RULE_STRING ) )
            	    // InternalDialogFlow.g:657:5: (lv_values_5_0= RULE_STRING )
            	    {
            	    // InternalDialogFlow.g:657:5: (lv_values_5_0= RULE_STRING )
            	    // InternalDialogFlow.g:658:6: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_values_5_0, grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntityValueRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});

}