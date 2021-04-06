package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.DialogFlowGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDialogFlowParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(DialogFlowGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDialogFlowSystem"
    // InternalDialogFlow.g:53:1: entryRuleDialogFlowSystem : ruleDialogFlowSystem EOF ;
    public final void entryRuleDialogFlowSystem() throws RecognitionException {
        try {
            // InternalDialogFlow.g:54:1: ( ruleDialogFlowSystem EOF )
            // InternalDialogFlow.g:55:1: ruleDialogFlowSystem EOF
            {
             before(grammarAccess.getDialogFlowSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleDialogFlowSystem();

            state._fsp--;

             after(grammarAccess.getDialogFlowSystemRule()); 
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
    // $ANTLR end "entryRuleDialogFlowSystem"


    // $ANTLR start "ruleDialogFlowSystem"
    // InternalDialogFlow.g:62:1: ruleDialogFlowSystem : ( ( rule__DialogFlowSystem__Group__0 ) ) ;
    public final void ruleDialogFlowSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:66:2: ( ( ( rule__DialogFlowSystem__Group__0 ) ) )
            // InternalDialogFlow.g:67:2: ( ( rule__DialogFlowSystem__Group__0 ) )
            {
            // InternalDialogFlow.g:67:2: ( ( rule__DialogFlowSystem__Group__0 ) )
            // InternalDialogFlow.g:68:3: ( rule__DialogFlowSystem__Group__0 )
            {
             before(grammarAccess.getDialogFlowSystemAccess().getGroup()); 
            // InternalDialogFlow.g:69:3: ( rule__DialogFlowSystem__Group__0 )
            // InternalDialogFlow.g:69:4: rule__DialogFlowSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DialogFlowSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDialogFlowSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDialogFlowSystem"


    // $ANTLR start "entryRuleDeclaration"
    // InternalDialogFlow.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalDialogFlow.g:79:1: ( ruleDeclaration EOF )
            // InternalDialogFlow.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDialogFlow.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalDialogFlow.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalDialogFlow.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalDialogFlow.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalDialogFlow.g:94:3: ( rule__Declaration__Alternatives )
            // InternalDialogFlow.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleIntent"
    // InternalDialogFlow.g:103:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // InternalDialogFlow.g:104:1: ( ruleIntent EOF )
            // InternalDialogFlow.g:105:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalDialogFlow.g:112:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:116:2: ( ( ( rule__Intent__Group__0 ) ) )
            // InternalDialogFlow.g:117:2: ( ( rule__Intent__Group__0 ) )
            {
            // InternalDialogFlow.g:117:2: ( ( rule__Intent__Group__0 ) )
            // InternalDialogFlow.g:118:3: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // InternalDialogFlow.g:119:3: ( rule__Intent__Group__0 )
            // InternalDialogFlow.g:119:4: rule__Intent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRulePhrases"
    // InternalDialogFlow.g:128:1: entryRulePhrases : rulePhrases EOF ;
    public final void entryRulePhrases() throws RecognitionException {
        try {
            // InternalDialogFlow.g:129:1: ( rulePhrases EOF )
            // InternalDialogFlow.g:130:1: rulePhrases EOF
            {
             before(grammarAccess.getPhrasesRule()); 
            pushFollow(FOLLOW_1);
            rulePhrases();

            state._fsp--;

             after(grammarAccess.getPhrasesRule()); 
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
    // $ANTLR end "entryRulePhrases"


    // $ANTLR start "rulePhrases"
    // InternalDialogFlow.g:137:1: rulePhrases : ( ( rule__Phrases__Group__0 ) ) ;
    public final void rulePhrases() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:141:2: ( ( ( rule__Phrases__Group__0 ) ) )
            // InternalDialogFlow.g:142:2: ( ( rule__Phrases__Group__0 ) )
            {
            // InternalDialogFlow.g:142:2: ( ( rule__Phrases__Group__0 ) )
            // InternalDialogFlow.g:143:3: ( rule__Phrases__Group__0 )
            {
             before(grammarAccess.getPhrasesAccess().getGroup()); 
            // InternalDialogFlow.g:144:3: ( rule__Phrases__Group__0 )
            // InternalDialogFlow.g:144:4: rule__Phrases__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Phrases__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhrasesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhrases"


    // $ANTLR start "entryRulePhraseValue"
    // InternalDialogFlow.g:153:1: entryRulePhraseValue : rulePhraseValue EOF ;
    public final void entryRulePhraseValue() throws RecognitionException {
        try {
            // InternalDialogFlow.g:154:1: ( rulePhraseValue EOF )
            // InternalDialogFlow.g:155:1: rulePhraseValue EOF
            {
             before(grammarAccess.getPhraseValueRule()); 
            pushFollow(FOLLOW_1);
            rulePhraseValue();

            state._fsp--;

             after(grammarAccess.getPhraseValueRule()); 
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
    // $ANTLR end "entryRulePhraseValue"


    // $ANTLR start "rulePhraseValue"
    // InternalDialogFlow.g:162:1: rulePhraseValue : ( ( rule__PhraseValue__Group__0 ) ) ;
    public final void rulePhraseValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:166:2: ( ( ( rule__PhraseValue__Group__0 ) ) )
            // InternalDialogFlow.g:167:2: ( ( rule__PhraseValue__Group__0 ) )
            {
            // InternalDialogFlow.g:167:2: ( ( rule__PhraseValue__Group__0 ) )
            // InternalDialogFlow.g:168:3: ( rule__PhraseValue__Group__0 )
            {
             before(grammarAccess.getPhraseValueAccess().getGroup()); 
            // InternalDialogFlow.g:169:3: ( rule__PhraseValue__Group__0 )
            // InternalDialogFlow.g:169:4: rule__PhraseValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PhraseValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhraseValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhraseValue"


    // $ANTLR start "entryRuleResponses"
    // InternalDialogFlow.g:178:1: entryRuleResponses : ruleResponses EOF ;
    public final void entryRuleResponses() throws RecognitionException {
        try {
            // InternalDialogFlow.g:179:1: ( ruleResponses EOF )
            // InternalDialogFlow.g:180:1: ruleResponses EOF
            {
             before(grammarAccess.getResponsesRule()); 
            pushFollow(FOLLOW_1);
            ruleResponses();

            state._fsp--;

             after(grammarAccess.getResponsesRule()); 
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
    // $ANTLR end "entryRuleResponses"


    // $ANTLR start "ruleResponses"
    // InternalDialogFlow.g:187:1: ruleResponses : ( ( rule__Responses__Group__0 ) ) ;
    public final void ruleResponses() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:191:2: ( ( ( rule__Responses__Group__0 ) ) )
            // InternalDialogFlow.g:192:2: ( ( rule__Responses__Group__0 ) )
            {
            // InternalDialogFlow.g:192:2: ( ( rule__Responses__Group__0 ) )
            // InternalDialogFlow.g:193:3: ( rule__Responses__Group__0 )
            {
             before(grammarAccess.getResponsesAccess().getGroup()); 
            // InternalDialogFlow.g:194:3: ( rule__Responses__Group__0 )
            // InternalDialogFlow.g:194:4: rule__Responses__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Responses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponsesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponses"


    // $ANTLR start "entryRuleActions"
    // InternalDialogFlow.g:203:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalDialogFlow.g:204:1: ( ruleActions EOF )
            // InternalDialogFlow.g:205:1: ruleActions EOF
            {
             before(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsRule()); 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalDialogFlow.g:212:1: ruleActions : ( ( rule__Actions__Group__0 ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:216:2: ( ( ( rule__Actions__Group__0 ) ) )
            // InternalDialogFlow.g:217:2: ( ( rule__Actions__Group__0 ) )
            {
            // InternalDialogFlow.g:217:2: ( ( rule__Actions__Group__0 ) )
            // InternalDialogFlow.g:218:3: ( rule__Actions__Group__0 )
            {
             before(grammarAccess.getActionsAccess().getGroup()); 
            // InternalDialogFlow.g:219:3: ( rule__Actions__Group__0 )
            // InternalDialogFlow.g:219:4: rule__Actions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleActionValue"
    // InternalDialogFlow.g:228:1: entryRuleActionValue : ruleActionValue EOF ;
    public final void entryRuleActionValue() throws RecognitionException {
        try {
            // InternalDialogFlow.g:229:1: ( ruleActionValue EOF )
            // InternalDialogFlow.g:230:1: ruleActionValue EOF
            {
             before(grammarAccess.getActionValueRule()); 
            pushFollow(FOLLOW_1);
            ruleActionValue();

            state._fsp--;

             after(grammarAccess.getActionValueRule()); 
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
    // $ANTLR end "entryRuleActionValue"


    // $ANTLR start "ruleActionValue"
    // InternalDialogFlow.g:237:1: ruleActionValue : ( ( rule__ActionValue__Group__0 ) ) ;
    public final void ruleActionValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:241:2: ( ( ( rule__ActionValue__Group__0 ) ) )
            // InternalDialogFlow.g:242:2: ( ( rule__ActionValue__Group__0 ) )
            {
            // InternalDialogFlow.g:242:2: ( ( rule__ActionValue__Group__0 ) )
            // InternalDialogFlow.g:243:3: ( rule__ActionValue__Group__0 )
            {
             before(grammarAccess.getActionValueAccess().getGroup()); 
            // InternalDialogFlow.g:244:3: ( rule__ActionValue__Group__0 )
            // InternalDialogFlow.g:244:4: rule__ActionValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionValue"


    // $ANTLR start "entryRuleEntity"
    // InternalDialogFlow.g:253:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDialogFlow.g:254:1: ( ruleEntity EOF )
            // InternalDialogFlow.g:255:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDialogFlow.g:262:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:266:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDialogFlow.g:267:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDialogFlow.g:267:2: ( ( rule__Entity__Group__0 ) )
            // InternalDialogFlow.g:268:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDialogFlow.g:269:3: ( rule__Entity__Group__0 )
            // InternalDialogFlow.g:269:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityValue"
    // InternalDialogFlow.g:278:1: entryRuleEntityValue : ruleEntityValue EOF ;
    public final void entryRuleEntityValue() throws RecognitionException {
        try {
            // InternalDialogFlow.g:279:1: ( ruleEntityValue EOF )
            // InternalDialogFlow.g:280:1: ruleEntityValue EOF
            {
             before(grammarAccess.getEntityValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityValue();

            state._fsp--;

             after(grammarAccess.getEntityValueRule()); 
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
    // $ANTLR end "entryRuleEntityValue"


    // $ANTLR start "ruleEntityValue"
    // InternalDialogFlow.g:287:1: ruleEntityValue : ( ( rule__EntityValue__Group__0 ) ) ;
    public final void ruleEntityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:291:2: ( ( ( rule__EntityValue__Group__0 ) ) )
            // InternalDialogFlow.g:292:2: ( ( rule__EntityValue__Group__0 ) )
            {
            // InternalDialogFlow.g:292:2: ( ( rule__EntityValue__Group__0 ) )
            // InternalDialogFlow.g:293:3: ( rule__EntityValue__Group__0 )
            {
             before(grammarAccess.getEntityValueAccess().getGroup()); 
            // InternalDialogFlow.g:294:3: ( rule__EntityValue__Group__0 )
            // InternalDialogFlow.g:294:4: rule__EntityValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityValue"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalDialogFlow.g:302:1: rule__Declaration__Alternatives : ( ( ruleIntent ) | ( ruleEntity ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:306:1: ( ( ruleIntent ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDialogFlow.g:307:2: ( ruleIntent )
                    {
                    // InternalDialogFlow.g:307:2: ( ruleIntent )
                    // InternalDialogFlow.g:308:3: ruleIntent
                    {
                     before(grammarAccess.getDeclarationAccess().getIntentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntent();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getIntentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDialogFlow.g:313:2: ( ruleEntity )
                    {
                    // InternalDialogFlow.g:313:2: ( ruleEntity )
                    // InternalDialogFlow.g:314:3: ruleEntity
                    {
                     before(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__DialogFlowSystem__Group__0"
    // InternalDialogFlow.g:323:1: rule__DialogFlowSystem__Group__0 : rule__DialogFlowSystem__Group__0__Impl rule__DialogFlowSystem__Group__1 ;
    public final void rule__DialogFlowSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:327:1: ( rule__DialogFlowSystem__Group__0__Impl rule__DialogFlowSystem__Group__1 )
            // InternalDialogFlow.g:328:2: rule__DialogFlowSystem__Group__0__Impl rule__DialogFlowSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DialogFlowSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DialogFlowSystem__Group__1();

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
    // $ANTLR end "rule__DialogFlowSystem__Group__0"


    // $ANTLR start "rule__DialogFlowSystem__Group__0__Impl"
    // InternalDialogFlow.g:335:1: rule__DialogFlowSystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__DialogFlowSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:339:1: ( ( 'system' ) )
            // InternalDialogFlow.g:340:1: ( 'system' )
            {
            // InternalDialogFlow.g:340:1: ( 'system' )
            // InternalDialogFlow.g:341:2: 'system'
            {
             before(grammarAccess.getDialogFlowSystemAccess().getSystemKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDialogFlowSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogFlowSystem__Group__0__Impl"


    // $ANTLR start "rule__DialogFlowSystem__Group__1"
    // InternalDialogFlow.g:350:1: rule__DialogFlowSystem__Group__1 : rule__DialogFlowSystem__Group__1__Impl rule__DialogFlowSystem__Group__2 ;
    public final void rule__DialogFlowSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:354:1: ( rule__DialogFlowSystem__Group__1__Impl rule__DialogFlowSystem__Group__2 )
            // InternalDialogFlow.g:355:2: rule__DialogFlowSystem__Group__1__Impl rule__DialogFlowSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DialogFlowSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DialogFlowSystem__Group__2();

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
    // $ANTLR end "rule__DialogFlowSystem__Group__1"


    // $ANTLR start "rule__DialogFlowSystem__Group__1__Impl"
    // InternalDialogFlow.g:362:1: rule__DialogFlowSystem__Group__1__Impl : ( ( rule__DialogFlowSystem__NameAssignment_1 ) ) ;
    public final void rule__DialogFlowSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:366:1: ( ( ( rule__DialogFlowSystem__NameAssignment_1 ) ) )
            // InternalDialogFlow.g:367:1: ( ( rule__DialogFlowSystem__NameAssignment_1 ) )
            {
            // InternalDialogFlow.g:367:1: ( ( rule__DialogFlowSystem__NameAssignment_1 ) )
            // InternalDialogFlow.g:368:2: ( rule__DialogFlowSystem__NameAssignment_1 )
            {
             before(grammarAccess.getDialogFlowSystemAccess().getNameAssignment_1()); 
            // InternalDialogFlow.g:369:2: ( rule__DialogFlowSystem__NameAssignment_1 )
            // InternalDialogFlow.g:369:3: rule__DialogFlowSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DialogFlowSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDialogFlowSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogFlowSystem__Group__1__Impl"


    // $ANTLR start "rule__DialogFlowSystem__Group__2"
    // InternalDialogFlow.g:377:1: rule__DialogFlowSystem__Group__2 : rule__DialogFlowSystem__Group__2__Impl ;
    public final void rule__DialogFlowSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:381:1: ( rule__DialogFlowSystem__Group__2__Impl )
            // InternalDialogFlow.g:382:2: rule__DialogFlowSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DialogFlowSystem__Group__2__Impl();

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
    // $ANTLR end "rule__DialogFlowSystem__Group__2"


    // $ANTLR start "rule__DialogFlowSystem__Group__2__Impl"
    // InternalDialogFlow.g:388:1: rule__DialogFlowSystem__Group__2__Impl : ( ( rule__DialogFlowSystem__DeclarationsAssignment_2 )* ) ;
    public final void rule__DialogFlowSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:392:1: ( ( ( rule__DialogFlowSystem__DeclarationsAssignment_2 )* ) )
            // InternalDialogFlow.g:393:1: ( ( rule__DialogFlowSystem__DeclarationsAssignment_2 )* )
            {
            // InternalDialogFlow.g:393:1: ( ( rule__DialogFlowSystem__DeclarationsAssignment_2 )* )
            // InternalDialogFlow.g:394:2: ( rule__DialogFlowSystem__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getDialogFlowSystemAccess().getDeclarationsAssignment_2()); 
            // InternalDialogFlow.g:395:2: ( rule__DialogFlowSystem__DeclarationsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDialogFlow.g:395:3: rule__DialogFlowSystem__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DialogFlowSystem__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDialogFlowSystemAccess().getDeclarationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogFlowSystem__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__0"
    // InternalDialogFlow.g:404:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:408:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalDialogFlow.g:409:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__1();

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
    // $ANTLR end "rule__Intent__Group__0"


    // $ANTLR start "rule__Intent__Group__0__Impl"
    // InternalDialogFlow.g:416:1: rule__Intent__Group__0__Impl : ( 'intent' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:420:1: ( ( 'intent' ) )
            // InternalDialogFlow.g:421:1: ( 'intent' )
            {
            // InternalDialogFlow.g:421:1: ( 'intent' )
            // InternalDialogFlow.g:422:2: 'intent'
            {
             before(grammarAccess.getIntentAccess().getIntentKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getIntentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0__Impl"


    // $ANTLR start "rule__Intent__Group__1"
    // InternalDialogFlow.g:431:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:435:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalDialogFlow.g:436:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__2();

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
    // $ANTLR end "rule__Intent__Group__1"


    // $ANTLR start "rule__Intent__Group__1__Impl"
    // InternalDialogFlow.g:443:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:447:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalDialogFlow.g:448:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalDialogFlow.g:448:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalDialogFlow.g:449:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalDialogFlow.g:450:2: ( rule__Intent__NameAssignment_1 )
            // InternalDialogFlow.g:450:3: rule__Intent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1__Impl"


    // $ANTLR start "rule__Intent__Group__2"
    // InternalDialogFlow.g:458:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:462:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalDialogFlow.g:463:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__3();

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
    // $ANTLR end "rule__Intent__Group__2"


    // $ANTLR start "rule__Intent__Group__2__Impl"
    // InternalDialogFlow.g:470:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__PhraseAssignment_2 ) ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:474:1: ( ( ( rule__Intent__PhraseAssignment_2 ) ) )
            // InternalDialogFlow.g:475:1: ( ( rule__Intent__PhraseAssignment_2 ) )
            {
            // InternalDialogFlow.g:475:1: ( ( rule__Intent__PhraseAssignment_2 ) )
            // InternalDialogFlow.g:476:2: ( rule__Intent__PhraseAssignment_2 )
            {
             before(grammarAccess.getIntentAccess().getPhraseAssignment_2()); 
            // InternalDialogFlow.g:477:2: ( rule__Intent__PhraseAssignment_2 )
            // InternalDialogFlow.g:477:3: rule__Intent__PhraseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Intent__PhraseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getPhraseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__3"
    // InternalDialogFlow.g:485:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:489:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalDialogFlow.g:490:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__4();

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
    // $ANTLR end "rule__Intent__Group__3"


    // $ANTLR start "rule__Intent__Group__3__Impl"
    // InternalDialogFlow.g:497:1: rule__Intent__Group__3__Impl : ( ( rule__Intent__ResponseAssignment_3 ) ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:501:1: ( ( ( rule__Intent__ResponseAssignment_3 ) ) )
            // InternalDialogFlow.g:502:1: ( ( rule__Intent__ResponseAssignment_3 ) )
            {
            // InternalDialogFlow.g:502:1: ( ( rule__Intent__ResponseAssignment_3 ) )
            // InternalDialogFlow.g:503:2: ( rule__Intent__ResponseAssignment_3 )
            {
             before(grammarAccess.getIntentAccess().getResponseAssignment_3()); 
            // InternalDialogFlow.g:504:2: ( rule__Intent__ResponseAssignment_3 )
            // InternalDialogFlow.g:504:3: rule__Intent__ResponseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Intent__ResponseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getResponseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3__Impl"


    // $ANTLR start "rule__Intent__Group__4"
    // InternalDialogFlow.g:512:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:516:1: ( rule__Intent__Group__4__Impl )
            // InternalDialogFlow.g:517:2: rule__Intent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__4__Impl();

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
    // $ANTLR end "rule__Intent__Group__4"


    // $ANTLR start "rule__Intent__Group__4__Impl"
    // InternalDialogFlow.g:523:1: rule__Intent__Group__4__Impl : ( ( rule__Intent__ActionAssignment_4 )? ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:527:1: ( ( ( rule__Intent__ActionAssignment_4 )? ) )
            // InternalDialogFlow.g:528:1: ( ( rule__Intent__ActionAssignment_4 )? )
            {
            // InternalDialogFlow.g:528:1: ( ( rule__Intent__ActionAssignment_4 )? )
            // InternalDialogFlow.g:529:2: ( rule__Intent__ActionAssignment_4 )?
            {
             before(grammarAccess.getIntentAccess().getActionAssignment_4()); 
            // InternalDialogFlow.g:530:2: ( rule__Intent__ActionAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDialogFlow.g:530:3: rule__Intent__ActionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__ActionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getActionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4__Impl"


    // $ANTLR start "rule__Phrases__Group__0"
    // InternalDialogFlow.g:539:1: rule__Phrases__Group__0 : rule__Phrases__Group__0__Impl rule__Phrases__Group__1 ;
    public final void rule__Phrases__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:543:1: ( rule__Phrases__Group__0__Impl rule__Phrases__Group__1 )
            // InternalDialogFlow.g:544:2: rule__Phrases__Group__0__Impl rule__Phrases__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Phrases__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrases__Group__1();

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
    // $ANTLR end "rule__Phrases__Group__0"


    // $ANTLR start "rule__Phrases__Group__0__Impl"
    // InternalDialogFlow.g:551:1: rule__Phrases__Group__0__Impl : ( () ) ;
    public final void rule__Phrases__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:555:1: ( ( () ) )
            // InternalDialogFlow.g:556:1: ( () )
            {
            // InternalDialogFlow.g:556:1: ( () )
            // InternalDialogFlow.g:557:2: ()
            {
             before(grammarAccess.getPhrasesAccess().getPhrasesAction_0()); 
            // InternalDialogFlow.g:558:2: ()
            // InternalDialogFlow.g:558:3: 
            {
            }

             after(grammarAccess.getPhrasesAccess().getPhrasesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrases__Group__0__Impl"


    // $ANTLR start "rule__Phrases__Group__1"
    // InternalDialogFlow.g:566:1: rule__Phrases__Group__1 : rule__Phrases__Group__1__Impl rule__Phrases__Group__2 ;
    public final void rule__Phrases__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:570:1: ( rule__Phrases__Group__1__Impl rule__Phrases__Group__2 )
            // InternalDialogFlow.g:571:2: rule__Phrases__Group__1__Impl rule__Phrases__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Phrases__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Phrases__Group__2();

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
    // $ANTLR end "rule__Phrases__Group__1"


    // $ANTLR start "rule__Phrases__Group__1__Impl"
    // InternalDialogFlow.g:578:1: rule__Phrases__Group__1__Impl : ( 'phrases' ) ;
    public final void rule__Phrases__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:582:1: ( ( 'phrases' ) )
            // InternalDialogFlow.g:583:1: ( 'phrases' )
            {
            // InternalDialogFlow.g:583:1: ( 'phrases' )
            // InternalDialogFlow.g:584:2: 'phrases'
            {
             before(grammarAccess.getPhrasesAccess().getPhrasesKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPhrasesAccess().getPhrasesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrases__Group__1__Impl"


    // $ANTLR start "rule__Phrases__Group__2"
    // InternalDialogFlow.g:593:1: rule__Phrases__Group__2 : rule__Phrases__Group__2__Impl ;
    public final void rule__Phrases__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:597:1: ( rule__Phrases__Group__2__Impl )
            // InternalDialogFlow.g:598:2: rule__Phrases__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Phrases__Group__2__Impl();

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
    // $ANTLR end "rule__Phrases__Group__2"


    // $ANTLR start "rule__Phrases__Group__2__Impl"
    // InternalDialogFlow.g:604:1: rule__Phrases__Group__2__Impl : ( ( rule__Phrases__PhrasesAssignment_2 )* ) ;
    public final void rule__Phrases__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:608:1: ( ( ( rule__Phrases__PhrasesAssignment_2 )* ) )
            // InternalDialogFlow.g:609:1: ( ( rule__Phrases__PhrasesAssignment_2 )* )
            {
            // InternalDialogFlow.g:609:1: ( ( rule__Phrases__PhrasesAssignment_2 )* )
            // InternalDialogFlow.g:610:2: ( rule__Phrases__PhrasesAssignment_2 )*
            {
             before(grammarAccess.getPhrasesAccess().getPhrasesAssignment_2()); 
            // InternalDialogFlow.g:611:2: ( rule__Phrases__PhrasesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDialogFlow.g:611:3: rule__Phrases__PhrasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Phrases__PhrasesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPhrasesAccess().getPhrasesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrases__Group__2__Impl"


    // $ANTLR start "rule__PhraseValue__Group__0"
    // InternalDialogFlow.g:620:1: rule__PhraseValue__Group__0 : rule__PhraseValue__Group__0__Impl rule__PhraseValue__Group__1 ;
    public final void rule__PhraseValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:624:1: ( rule__PhraseValue__Group__0__Impl rule__PhraseValue__Group__1 )
            // InternalDialogFlow.g:625:2: rule__PhraseValue__Group__0__Impl rule__PhraseValue__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PhraseValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhraseValue__Group__1();

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
    // $ANTLR end "rule__PhraseValue__Group__0"


    // $ANTLR start "rule__PhraseValue__Group__0__Impl"
    // InternalDialogFlow.g:632:1: rule__PhraseValue__Group__0__Impl : ( 'val' ) ;
    public final void rule__PhraseValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:636:1: ( ( 'val' ) )
            // InternalDialogFlow.g:637:1: ( 'val' )
            {
            // InternalDialogFlow.g:637:1: ( 'val' )
            // InternalDialogFlow.g:638:2: 'val'
            {
             before(grammarAccess.getPhraseValueAccess().getValKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPhraseValueAccess().getValKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhraseValue__Group__0__Impl"


    // $ANTLR start "rule__PhraseValue__Group__1"
    // InternalDialogFlow.g:647:1: rule__PhraseValue__Group__1 : rule__PhraseValue__Group__1__Impl rule__PhraseValue__Group__2 ;
    public final void rule__PhraseValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:651:1: ( rule__PhraseValue__Group__1__Impl rule__PhraseValue__Group__2 )
            // InternalDialogFlow.g:652:2: rule__PhraseValue__Group__1__Impl rule__PhraseValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PhraseValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhraseValue__Group__2();

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
    // $ANTLR end "rule__PhraseValue__Group__1"


    // $ANTLR start "rule__PhraseValue__Group__1__Impl"
    // InternalDialogFlow.g:659:1: rule__PhraseValue__Group__1__Impl : ( '\"' ) ;
    public final void rule__PhraseValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:663:1: ( ( '\"' ) )
            // InternalDialogFlow.g:664:1: ( '\"' )
            {
            // InternalDialogFlow.g:664:1: ( '\"' )
            // InternalDialogFlow.g:665:2: '\"'
            {
             before(grammarAccess.getPhraseValueAccess().getQuotationMarkKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPhraseValueAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhraseValue__Group__1__Impl"


    // $ANTLR start "rule__PhraseValue__Group__2"
    // InternalDialogFlow.g:674:1: rule__PhraseValue__Group__2 : rule__PhraseValue__Group__2__Impl rule__PhraseValue__Group__3 ;
    public final void rule__PhraseValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:678:1: ( rule__PhraseValue__Group__2__Impl rule__PhraseValue__Group__3 )
            // InternalDialogFlow.g:679:2: rule__PhraseValue__Group__2__Impl rule__PhraseValue__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__PhraseValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PhraseValue__Group__3();

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
    // $ANTLR end "rule__PhraseValue__Group__2"


    // $ANTLR start "rule__PhraseValue__Group__2__Impl"
    // InternalDialogFlow.g:686:1: rule__PhraseValue__Group__2__Impl : ( ( rule__PhraseValue__ValueAssignment_2 ) ) ;
    public final void rule__PhraseValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:690:1: ( ( ( rule__PhraseValue__ValueAssignment_2 ) ) )
            // InternalDialogFlow.g:691:1: ( ( rule__PhraseValue__ValueAssignment_2 ) )
            {
            // InternalDialogFlow.g:691:1: ( ( rule__PhraseValue__ValueAssignment_2 ) )
            // InternalDialogFlow.g:692:2: ( rule__PhraseValue__ValueAssignment_2 )
            {
             before(grammarAccess.getPhraseValueAccess().getValueAssignment_2()); 
            // InternalDialogFlow.g:693:2: ( rule__PhraseValue__ValueAssignment_2 )
            // InternalDialogFlow.g:693:3: rule__PhraseValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PhraseValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhraseValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhraseValue__Group__2__Impl"


    // $ANTLR start "rule__PhraseValue__Group__3"
    // InternalDialogFlow.g:701:1: rule__PhraseValue__Group__3 : rule__PhraseValue__Group__3__Impl ;
    public final void rule__PhraseValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:705:1: ( rule__PhraseValue__Group__3__Impl )
            // InternalDialogFlow.g:706:2: rule__PhraseValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PhraseValue__Group__3__Impl();

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
    // $ANTLR end "rule__PhraseValue__Group__3"


    // $ANTLR start "rule__PhraseValue__Group__3__Impl"
    // InternalDialogFlow.g:712:1: rule__PhraseValue__Group__3__Impl : ( '\"' ) ;
    public final void rule__PhraseValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:716:1: ( ( '\"' ) )
            // InternalDialogFlow.g:717:1: ( '\"' )
            {
            // InternalDialogFlow.g:717:1: ( '\"' )
            // InternalDialogFlow.g:718:2: '\"'
            {
             before(grammarAccess.getPhraseValueAccess().getQuotationMarkKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPhraseValueAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhraseValue__Group__3__Impl"


    // $ANTLR start "rule__Responses__Group__0"
    // InternalDialogFlow.g:728:1: rule__Responses__Group__0 : rule__Responses__Group__0__Impl rule__Responses__Group__1 ;
    public final void rule__Responses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:732:1: ( rule__Responses__Group__0__Impl rule__Responses__Group__1 )
            // InternalDialogFlow.g:733:2: rule__Responses__Group__0__Impl rule__Responses__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Responses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Responses__Group__1();

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
    // $ANTLR end "rule__Responses__Group__0"


    // $ANTLR start "rule__Responses__Group__0__Impl"
    // InternalDialogFlow.g:740:1: rule__Responses__Group__0__Impl : ( '\"' ) ;
    public final void rule__Responses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:744:1: ( ( '\"' ) )
            // InternalDialogFlow.g:745:1: ( '\"' )
            {
            // InternalDialogFlow.g:745:1: ( '\"' )
            // InternalDialogFlow.g:746:2: '\"'
            {
             before(grammarAccess.getResponsesAccess().getQuotationMarkKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getResponsesAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__Group__0__Impl"


    // $ANTLR start "rule__Responses__Group__1"
    // InternalDialogFlow.g:755:1: rule__Responses__Group__1 : rule__Responses__Group__1__Impl rule__Responses__Group__2 ;
    public final void rule__Responses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:759:1: ( rule__Responses__Group__1__Impl rule__Responses__Group__2 )
            // InternalDialogFlow.g:760:2: rule__Responses__Group__1__Impl rule__Responses__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Responses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Responses__Group__2();

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
    // $ANTLR end "rule__Responses__Group__1"


    // $ANTLR start "rule__Responses__Group__1__Impl"
    // InternalDialogFlow.g:767:1: rule__Responses__Group__1__Impl : ( ( rule__Responses__ResponsesAssignment_1 ) ) ;
    public final void rule__Responses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:771:1: ( ( ( rule__Responses__ResponsesAssignment_1 ) ) )
            // InternalDialogFlow.g:772:1: ( ( rule__Responses__ResponsesAssignment_1 ) )
            {
            // InternalDialogFlow.g:772:1: ( ( rule__Responses__ResponsesAssignment_1 ) )
            // InternalDialogFlow.g:773:2: ( rule__Responses__ResponsesAssignment_1 )
            {
             before(grammarAccess.getResponsesAccess().getResponsesAssignment_1()); 
            // InternalDialogFlow.g:774:2: ( rule__Responses__ResponsesAssignment_1 )
            // InternalDialogFlow.g:774:3: rule__Responses__ResponsesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Responses__ResponsesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResponsesAccess().getResponsesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__Group__1__Impl"


    // $ANTLR start "rule__Responses__Group__2"
    // InternalDialogFlow.g:782:1: rule__Responses__Group__2 : rule__Responses__Group__2__Impl rule__Responses__Group__3 ;
    public final void rule__Responses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:786:1: ( rule__Responses__Group__2__Impl rule__Responses__Group__3 )
            // InternalDialogFlow.g:787:2: rule__Responses__Group__2__Impl rule__Responses__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Responses__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Responses__Group__3();

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
    // $ANTLR end "rule__Responses__Group__2"


    // $ANTLR start "rule__Responses__Group__2__Impl"
    // InternalDialogFlow.g:794:1: rule__Responses__Group__2__Impl : ( '\"' ) ;
    public final void rule__Responses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:798:1: ( ( '\"' ) )
            // InternalDialogFlow.g:799:1: ( '\"' )
            {
            // InternalDialogFlow.g:799:1: ( '\"' )
            // InternalDialogFlow.g:800:2: '\"'
            {
             before(grammarAccess.getResponsesAccess().getQuotationMarkKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getResponsesAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__Group__2__Impl"


    // $ANTLR start "rule__Responses__Group__3"
    // InternalDialogFlow.g:809:1: rule__Responses__Group__3 : rule__Responses__Group__3__Impl ;
    public final void rule__Responses__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:813:1: ( rule__Responses__Group__3__Impl )
            // InternalDialogFlow.g:814:2: rule__Responses__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Responses__Group__3__Impl();

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
    // $ANTLR end "rule__Responses__Group__3"


    // $ANTLR start "rule__Responses__Group__3__Impl"
    // InternalDialogFlow.g:820:1: rule__Responses__Group__3__Impl : ( ( rule__Responses__Group_3__0 )* ) ;
    public final void rule__Responses__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:824:1: ( ( ( rule__Responses__Group_3__0 )* ) )
            // InternalDialogFlow.g:825:1: ( ( rule__Responses__Group_3__0 )* )
            {
            // InternalDialogFlow.g:825:1: ( ( rule__Responses__Group_3__0 )* )
            // InternalDialogFlow.g:826:2: ( rule__Responses__Group_3__0 )*
            {
             before(grammarAccess.getResponsesAccess().getGroup_3()); 
            // InternalDialogFlow.g:827:2: ( rule__Responses__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDialogFlow.g:827:3: rule__Responses__Group_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Responses__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getResponsesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__Group__3__Impl"


    // $ANTLR start "rule__Responses__Group_3__0"
    // InternalDialogFlow.g:836:1: rule__Responses__Group_3__0 : rule__Responses__Group_3__0__Impl rule__Responses__Group_3__1 ;
    public final void rule__Responses__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:840:1: ( rule__Responses__Group_3__0__Impl rule__Responses__Group_3__1 )
            // InternalDialogFlow.g:841:2: rule__Responses__Group_3__0__Impl rule__Responses__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Responses__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Responses__Group_3__1();

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
    // $ANTLR end "rule__Responses__Group_3__0"


    // $ANTLR start "rule__Responses__Group_3__0__Impl"
    // InternalDialogFlow.g:848:1: rule__Responses__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Responses__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:852:1: ( ( ',' ) )
            // InternalDialogFlow.g:853:1: ( ',' )
            {
            // InternalDialogFlow.g:853:1: ( ',' )
            // InternalDialogFlow.g:854:2: ','
            {
             before(grammarAccess.getResponsesAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResponsesAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__Group_3__0__Impl"


    // $ANTLR start "rule__Responses__Group_3__1"
    // InternalDialogFlow.g:863:1: rule__Responses__Group_3__1 : rule__Responses__Group_3__1__Impl ;
    public final void rule__Responses__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:867:1: ( rule__Responses__Group_3__1__Impl )
            // InternalDialogFlow.g:868:2: rule__Responses__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Responses__Group_3__1__Impl();

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
    // $ANTLR end "rule__Responses__Group_3__1"


    // $ANTLR start "rule__Responses__Group_3__1__Impl"
    // InternalDialogFlow.g:874:1: rule__Responses__Group_3__1__Impl : ( ( rule__Responses__ResponsesAssignment_3_1 ) ) ;
    public final void rule__Responses__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:878:1: ( ( ( rule__Responses__ResponsesAssignment_3_1 ) ) )
            // InternalDialogFlow.g:879:1: ( ( rule__Responses__ResponsesAssignment_3_1 ) )
            {
            // InternalDialogFlow.g:879:1: ( ( rule__Responses__ResponsesAssignment_3_1 ) )
            // InternalDialogFlow.g:880:2: ( rule__Responses__ResponsesAssignment_3_1 )
            {
             before(grammarAccess.getResponsesAccess().getResponsesAssignment_3_1()); 
            // InternalDialogFlow.g:881:2: ( rule__Responses__ResponsesAssignment_3_1 )
            // InternalDialogFlow.g:881:3: rule__Responses__ResponsesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Responses__ResponsesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResponsesAccess().getResponsesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__Group_3__1__Impl"


    // $ANTLR start "rule__Actions__Group__0"
    // InternalDialogFlow.g:890:1: rule__Actions__Group__0 : rule__Actions__Group__0__Impl rule__Actions__Group__1 ;
    public final void rule__Actions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:894:1: ( rule__Actions__Group__0__Impl rule__Actions__Group__1 )
            // InternalDialogFlow.g:895:2: rule__Actions__Group__0__Impl rule__Actions__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Actions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__1();

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
    // $ANTLR end "rule__Actions__Group__0"


    // $ANTLR start "rule__Actions__Group__0__Impl"
    // InternalDialogFlow.g:902:1: rule__Actions__Group__0__Impl : ( () ) ;
    public final void rule__Actions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:906:1: ( ( () ) )
            // InternalDialogFlow.g:907:1: ( () )
            {
            // InternalDialogFlow.g:907:1: ( () )
            // InternalDialogFlow.g:908:2: ()
            {
             before(grammarAccess.getActionsAccess().getActionsAction_0()); 
            // InternalDialogFlow.g:909:2: ()
            // InternalDialogFlow.g:909:3: 
            {
            }

             after(grammarAccess.getActionsAccess().getActionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__0__Impl"


    // $ANTLR start "rule__Actions__Group__1"
    // InternalDialogFlow.g:917:1: rule__Actions__Group__1 : rule__Actions__Group__1__Impl rule__Actions__Group__2 ;
    public final void rule__Actions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:921:1: ( rule__Actions__Group__1__Impl rule__Actions__Group__2 )
            // InternalDialogFlow.g:922:2: rule__Actions__Group__1__Impl rule__Actions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Actions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__2();

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
    // $ANTLR end "rule__Actions__Group__1"


    // $ANTLR start "rule__Actions__Group__1__Impl"
    // InternalDialogFlow.g:929:1: rule__Actions__Group__1__Impl : ( 'actions' ) ;
    public final void rule__Actions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:933:1: ( ( 'actions' ) )
            // InternalDialogFlow.g:934:1: ( 'actions' )
            {
            // InternalDialogFlow.g:934:1: ( 'actions' )
            // InternalDialogFlow.g:935:2: 'actions'
            {
             before(grammarAccess.getActionsAccess().getActionsKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActionsAccess().getActionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__1__Impl"


    // $ANTLR start "rule__Actions__Group__2"
    // InternalDialogFlow.g:944:1: rule__Actions__Group__2 : rule__Actions__Group__2__Impl ;
    public final void rule__Actions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:948:1: ( rule__Actions__Group__2__Impl )
            // InternalDialogFlow.g:949:2: rule__Actions__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group__2__Impl();

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
    // $ANTLR end "rule__Actions__Group__2"


    // $ANTLR start "rule__Actions__Group__2__Impl"
    // InternalDialogFlow.g:955:1: rule__Actions__Group__2__Impl : ( ( rule__Actions__ActionsAssignment_2 )* ) ;
    public final void rule__Actions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:959:1: ( ( ( rule__Actions__ActionsAssignment_2 )* ) )
            // InternalDialogFlow.g:960:1: ( ( rule__Actions__ActionsAssignment_2 )* )
            {
            // InternalDialogFlow.g:960:1: ( ( rule__Actions__ActionsAssignment_2 )* )
            // InternalDialogFlow.g:961:2: ( rule__Actions__ActionsAssignment_2 )*
            {
             before(grammarAccess.getActionsAccess().getActionsAssignment_2()); 
            // InternalDialogFlow.g:962:2: ( rule__Actions__ActionsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDialogFlow.g:962:3: rule__Actions__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Actions__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getActionsAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__Group__2__Impl"


    // $ANTLR start "rule__ActionValue__Group__0"
    // InternalDialogFlow.g:971:1: rule__ActionValue__Group__0 : rule__ActionValue__Group__0__Impl rule__ActionValue__Group__1 ;
    public final void rule__ActionValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:975:1: ( rule__ActionValue__Group__0__Impl rule__ActionValue__Group__1 )
            // InternalDialogFlow.g:976:2: rule__ActionValue__Group__0__Impl rule__ActionValue__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ActionValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionValue__Group__1();

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
    // $ANTLR end "rule__ActionValue__Group__0"


    // $ANTLR start "rule__ActionValue__Group__0__Impl"
    // InternalDialogFlow.g:983:1: rule__ActionValue__Group__0__Impl : ( 'val' ) ;
    public final void rule__ActionValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:987:1: ( ( 'val' ) )
            // InternalDialogFlow.g:988:1: ( 'val' )
            {
            // InternalDialogFlow.g:988:1: ( 'val' )
            // InternalDialogFlow.g:989:2: 'val'
            {
             before(grammarAccess.getActionValueAccess().getValKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getActionValueAccess().getValKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionValue__Group__0__Impl"


    // $ANTLR start "rule__ActionValue__Group__1"
    // InternalDialogFlow.g:998:1: rule__ActionValue__Group__1 : rule__ActionValue__Group__1__Impl rule__ActionValue__Group__2 ;
    public final void rule__ActionValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1002:1: ( rule__ActionValue__Group__1__Impl rule__ActionValue__Group__2 )
            // InternalDialogFlow.g:1003:2: rule__ActionValue__Group__1__Impl rule__ActionValue__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ActionValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionValue__Group__2();

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
    // $ANTLR end "rule__ActionValue__Group__1"


    // $ANTLR start "rule__ActionValue__Group__1__Impl"
    // InternalDialogFlow.g:1010:1: rule__ActionValue__Group__1__Impl : ( ( rule__ActionValue__NameAssignment_1 ) ) ;
    public final void rule__ActionValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1014:1: ( ( ( rule__ActionValue__NameAssignment_1 ) ) )
            // InternalDialogFlow.g:1015:1: ( ( rule__ActionValue__NameAssignment_1 ) )
            {
            // InternalDialogFlow.g:1015:1: ( ( rule__ActionValue__NameAssignment_1 ) )
            // InternalDialogFlow.g:1016:2: ( rule__ActionValue__NameAssignment_1 )
            {
             before(grammarAccess.getActionValueAccess().getNameAssignment_1()); 
            // InternalDialogFlow.g:1017:2: ( rule__ActionValue__NameAssignment_1 )
            // InternalDialogFlow.g:1017:3: rule__ActionValue__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionValue__Group__1__Impl"


    // $ANTLR start "rule__ActionValue__Group__2"
    // InternalDialogFlow.g:1025:1: rule__ActionValue__Group__2 : rule__ActionValue__Group__2__Impl rule__ActionValue__Group__3 ;
    public final void rule__ActionValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1029:1: ( rule__ActionValue__Group__2__Impl rule__ActionValue__Group__3 )
            // InternalDialogFlow.g:1030:2: rule__ActionValue__Group__2__Impl rule__ActionValue__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ActionValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionValue__Group__3();

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
    // $ANTLR end "rule__ActionValue__Group__2"


    // $ANTLR start "rule__ActionValue__Group__2__Impl"
    // InternalDialogFlow.g:1037:1: rule__ActionValue__Group__2__Impl : ( ( rule__ActionValue__TypeAssignment_2 ) ) ;
    public final void rule__ActionValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1041:1: ( ( ( rule__ActionValue__TypeAssignment_2 ) ) )
            // InternalDialogFlow.g:1042:1: ( ( rule__ActionValue__TypeAssignment_2 ) )
            {
            // InternalDialogFlow.g:1042:1: ( ( rule__ActionValue__TypeAssignment_2 ) )
            // InternalDialogFlow.g:1043:2: ( rule__ActionValue__TypeAssignment_2 )
            {
             before(grammarAccess.getActionValueAccess().getTypeAssignment_2()); 
            // InternalDialogFlow.g:1044:2: ( rule__ActionValue__TypeAssignment_2 )
            // InternalDialogFlow.g:1044:3: rule__ActionValue__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActionValue__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionValueAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionValue__Group__2__Impl"


    // $ANTLR start "rule__ActionValue__Group__3"
    // InternalDialogFlow.g:1052:1: rule__ActionValue__Group__3 : rule__ActionValue__Group__3__Impl ;
    public final void rule__ActionValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1056:1: ( rule__ActionValue__Group__3__Impl )
            // InternalDialogFlow.g:1057:2: rule__ActionValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionValue__Group__3__Impl();

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
    // $ANTLR end "rule__ActionValue__Group__3"


    // $ANTLR start "rule__ActionValue__Group__3__Impl"
    // InternalDialogFlow.g:1063:1: rule__ActionValue__Group__3__Impl : ( ( rule__ActionValue__ListAssignment_3 )? ) ;
    public final void rule__ActionValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1067:1: ( ( ( rule__ActionValue__ListAssignment_3 )? ) )
            // InternalDialogFlow.g:1068:1: ( ( rule__ActionValue__ListAssignment_3 )? )
            {
            // InternalDialogFlow.g:1068:1: ( ( rule__ActionValue__ListAssignment_3 )? )
            // InternalDialogFlow.g:1069:2: ( rule__ActionValue__ListAssignment_3 )?
            {
             before(grammarAccess.getActionValueAccess().getListAssignment_3()); 
            // InternalDialogFlow.g:1070:2: ( rule__ActionValue__ListAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDialogFlow.g:1070:3: rule__ActionValue__ListAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionValue__ListAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionValueAccess().getListAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionValue__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDialogFlow.g:1079:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1083:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDialogFlow.g:1084:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDialogFlow.g:1091:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1095:1: ( ( 'entity' ) )
            // InternalDialogFlow.g:1096:1: ( 'entity' )
            {
            // InternalDialogFlow.g:1096:1: ( 'entity' )
            // InternalDialogFlow.g:1097:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDialogFlow.g:1106:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1110:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDialogFlow.g:1111:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDialogFlow.g:1118:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1122:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDialogFlow.g:1123:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDialogFlow.g:1123:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDialogFlow.g:1124:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDialogFlow.g:1125:2: ( rule__Entity__NameAssignment_1 )
            // InternalDialogFlow.g:1125:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDialogFlow.g:1133:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1137:1: ( rule__Entity__Group__2__Impl )
            // InternalDialogFlow.g:1138:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2__Impl();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDialogFlow.g:1144:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__EntitiesAssignment_2 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1148:1: ( ( ( rule__Entity__EntitiesAssignment_2 )* ) )
            // InternalDialogFlow.g:1149:1: ( ( rule__Entity__EntitiesAssignment_2 )* )
            {
            // InternalDialogFlow.g:1149:1: ( ( rule__Entity__EntitiesAssignment_2 )* )
            // InternalDialogFlow.g:1150:2: ( rule__Entity__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getEntityAccess().getEntitiesAssignment_2()); 
            // InternalDialogFlow.g:1151:2: ( rule__Entity__EntitiesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDialogFlow.g:1151:3: rule__Entity__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getEntitiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__EntityValue__Group__0"
    // InternalDialogFlow.g:1160:1: rule__EntityValue__Group__0 : rule__EntityValue__Group__0__Impl rule__EntityValue__Group__1 ;
    public final void rule__EntityValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1164:1: ( rule__EntityValue__Group__0__Impl rule__EntityValue__Group__1 )
            // InternalDialogFlow.g:1165:2: rule__EntityValue__Group__0__Impl rule__EntityValue__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EntityValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityValue__Group__1();

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
    // $ANTLR end "rule__EntityValue__Group__0"


    // $ANTLR start "rule__EntityValue__Group__0__Impl"
    // InternalDialogFlow.g:1172:1: rule__EntityValue__Group__0__Impl : ( 'val' ) ;
    public final void rule__EntityValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1176:1: ( ( 'val' ) )
            // InternalDialogFlow.g:1177:1: ( 'val' )
            {
            // InternalDialogFlow.g:1177:1: ( 'val' )
            // InternalDialogFlow.g:1178:2: 'val'
            {
             before(grammarAccess.getEntityValueAccess().getValKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityValueAccess().getValKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__Group__0__Impl"


    // $ANTLR start "rule__EntityValue__Group__1"
    // InternalDialogFlow.g:1187:1: rule__EntityValue__Group__1 : rule__EntityValue__Group__1__Impl rule__EntityValue__Group__2 ;
    public final void rule__EntityValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1191:1: ( rule__EntityValue__Group__1__Impl rule__EntityValue__Group__2 )
            // InternalDialogFlow.g:1192:2: rule__EntityValue__Group__1__Impl rule__EntityValue__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EntityValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityValue__Group__2();

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
    // $ANTLR end "rule__EntityValue__Group__1"


    // $ANTLR start "rule__EntityValue__Group__1__Impl"
    // InternalDialogFlow.g:1199:1: rule__EntityValue__Group__1__Impl : ( '\"' ) ;
    public final void rule__EntityValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1203:1: ( ( '\"' ) )
            // InternalDialogFlow.g:1204:1: ( '\"' )
            {
            // InternalDialogFlow.g:1204:1: ( '\"' )
            // InternalDialogFlow.g:1205:2: '\"'
            {
             before(grammarAccess.getEntityValueAccess().getQuotationMarkKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityValueAccess().getQuotationMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__Group__1__Impl"


    // $ANTLR start "rule__EntityValue__Group__2"
    // InternalDialogFlow.g:1214:1: rule__EntityValue__Group__2 : rule__EntityValue__Group__2__Impl rule__EntityValue__Group__3 ;
    public final void rule__EntityValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1218:1: ( rule__EntityValue__Group__2__Impl rule__EntityValue__Group__3 )
            // InternalDialogFlow.g:1219:2: rule__EntityValue__Group__2__Impl rule__EntityValue__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__EntityValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityValue__Group__3();

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
    // $ANTLR end "rule__EntityValue__Group__2"


    // $ANTLR start "rule__EntityValue__Group__2__Impl"
    // InternalDialogFlow.g:1226:1: rule__EntityValue__Group__2__Impl : ( ( rule__EntityValue__ValuesAssignment_2 ) ) ;
    public final void rule__EntityValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1230:1: ( ( ( rule__EntityValue__ValuesAssignment_2 ) ) )
            // InternalDialogFlow.g:1231:1: ( ( rule__EntityValue__ValuesAssignment_2 ) )
            {
            // InternalDialogFlow.g:1231:1: ( ( rule__EntityValue__ValuesAssignment_2 ) )
            // InternalDialogFlow.g:1232:2: ( rule__EntityValue__ValuesAssignment_2 )
            {
             before(grammarAccess.getEntityValueAccess().getValuesAssignment_2()); 
            // InternalDialogFlow.g:1233:2: ( rule__EntityValue__ValuesAssignment_2 )
            // InternalDialogFlow.g:1233:3: rule__EntityValue__ValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityValue__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityValueAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__Group__2__Impl"


    // $ANTLR start "rule__EntityValue__Group__3"
    // InternalDialogFlow.g:1241:1: rule__EntityValue__Group__3 : rule__EntityValue__Group__3__Impl rule__EntityValue__Group__4 ;
    public final void rule__EntityValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1245:1: ( rule__EntityValue__Group__3__Impl rule__EntityValue__Group__4 )
            // InternalDialogFlow.g:1246:2: rule__EntityValue__Group__3__Impl rule__EntityValue__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__EntityValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityValue__Group__4();

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
    // $ANTLR end "rule__EntityValue__Group__3"


    // $ANTLR start "rule__EntityValue__Group__3__Impl"
    // InternalDialogFlow.g:1253:1: rule__EntityValue__Group__3__Impl : ( '\"' ) ;
    public final void rule__EntityValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1257:1: ( ( '\"' ) )
            // InternalDialogFlow.g:1258:1: ( '\"' )
            {
            // InternalDialogFlow.g:1258:1: ( '\"' )
            // InternalDialogFlow.g:1259:2: '\"'
            {
             before(grammarAccess.getEntityValueAccess().getQuotationMarkKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityValueAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__Group__3__Impl"


    // $ANTLR start "rule__EntityValue__Group__4"
    // InternalDialogFlow.g:1268:1: rule__EntityValue__Group__4 : rule__EntityValue__Group__4__Impl ;
    public final void rule__EntityValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1272:1: ( rule__EntityValue__Group__4__Impl )
            // InternalDialogFlow.g:1273:2: rule__EntityValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityValue__Group__4__Impl();

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
    // $ANTLR end "rule__EntityValue__Group__4"


    // $ANTLR start "rule__EntityValue__Group__4__Impl"
    // InternalDialogFlow.g:1279:1: rule__EntityValue__Group__4__Impl : ( ( rule__EntityValue__Group_4__0 )* ) ;
    public final void rule__EntityValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1283:1: ( ( ( rule__EntityValue__Group_4__0 )* ) )
            // InternalDialogFlow.g:1284:1: ( ( rule__EntityValue__Group_4__0 )* )
            {
            // InternalDialogFlow.g:1284:1: ( ( rule__EntityValue__Group_4__0 )* )
            // InternalDialogFlow.g:1285:2: ( rule__EntityValue__Group_4__0 )*
            {
             before(grammarAccess.getEntityValueAccess().getGroup_4()); 
            // InternalDialogFlow.g:1286:2: ( rule__EntityValue__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDialogFlow.g:1286:3: rule__EntityValue__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EntityValue__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityValueAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__Group__4__Impl"


    // $ANTLR start "rule__EntityValue__Group_4__0"
    // InternalDialogFlow.g:1295:1: rule__EntityValue__Group_4__0 : rule__EntityValue__Group_4__0__Impl rule__EntityValue__Group_4__1 ;
    public final void rule__EntityValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1299:1: ( rule__EntityValue__Group_4__0__Impl rule__EntityValue__Group_4__1 )
            // InternalDialogFlow.g:1300:2: rule__EntityValue__Group_4__0__Impl rule__EntityValue__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__EntityValue__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityValue__Group_4__1();

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
    // $ANTLR end "rule__EntityValue__Group_4__0"


    // $ANTLR start "rule__EntityValue__Group_4__0__Impl"
    // InternalDialogFlow.g:1307:1: rule__EntityValue__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EntityValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1311:1: ( ( ',' ) )
            // InternalDialogFlow.g:1312:1: ( ',' )
            {
            // InternalDialogFlow.g:1312:1: ( ',' )
            // InternalDialogFlow.g:1313:2: ','
            {
             before(grammarAccess.getEntityValueAccess().getCommaKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityValueAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__Group_4__0__Impl"


    // $ANTLR start "rule__EntityValue__Group_4__1"
    // InternalDialogFlow.g:1322:1: rule__EntityValue__Group_4__1 : rule__EntityValue__Group_4__1__Impl ;
    public final void rule__EntityValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1326:1: ( rule__EntityValue__Group_4__1__Impl )
            // InternalDialogFlow.g:1327:2: rule__EntityValue__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityValue__Group_4__1__Impl();

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
    // $ANTLR end "rule__EntityValue__Group_4__1"


    // $ANTLR start "rule__EntityValue__Group_4__1__Impl"
    // InternalDialogFlow.g:1333:1: rule__EntityValue__Group_4__1__Impl : ( ( rule__EntityValue__ValuesAssignment_4_1 ) ) ;
    public final void rule__EntityValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1337:1: ( ( ( rule__EntityValue__ValuesAssignment_4_1 ) ) )
            // InternalDialogFlow.g:1338:1: ( ( rule__EntityValue__ValuesAssignment_4_1 ) )
            {
            // InternalDialogFlow.g:1338:1: ( ( rule__EntityValue__ValuesAssignment_4_1 ) )
            // InternalDialogFlow.g:1339:2: ( rule__EntityValue__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEntityValueAccess().getValuesAssignment_4_1()); 
            // InternalDialogFlow.g:1340:2: ( rule__EntityValue__ValuesAssignment_4_1 )
            // InternalDialogFlow.g:1340:3: rule__EntityValue__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityValue__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityValueAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__Group_4__1__Impl"


    // $ANTLR start "rule__DialogFlowSystem__NameAssignment_1"
    // InternalDialogFlow.g:1349:1: rule__DialogFlowSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DialogFlowSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1353:1: ( ( RULE_ID ) )
            // InternalDialogFlow.g:1354:2: ( RULE_ID )
            {
            // InternalDialogFlow.g:1354:2: ( RULE_ID )
            // InternalDialogFlow.g:1355:3: RULE_ID
            {
             before(grammarAccess.getDialogFlowSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDialogFlowSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogFlowSystem__NameAssignment_1"


    // $ANTLR start "rule__DialogFlowSystem__DeclarationsAssignment_2"
    // InternalDialogFlow.g:1364:1: rule__DialogFlowSystem__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__DialogFlowSystem__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1368:1: ( ( ruleDeclaration ) )
            // InternalDialogFlow.g:1369:2: ( ruleDeclaration )
            {
            // InternalDialogFlow.g:1369:2: ( ruleDeclaration )
            // InternalDialogFlow.g:1370:3: ruleDeclaration
            {
             before(grammarAccess.getDialogFlowSystemAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDialogFlowSystemAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogFlowSystem__DeclarationsAssignment_2"


    // $ANTLR start "rule__Intent__NameAssignment_1"
    // InternalDialogFlow.g:1379:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1383:1: ( ( RULE_ID ) )
            // InternalDialogFlow.g:1384:2: ( RULE_ID )
            {
            // InternalDialogFlow.g:1384:2: ( RULE_ID )
            // InternalDialogFlow.g:1385:3: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__NameAssignment_1"


    // $ANTLR start "rule__Intent__PhraseAssignment_2"
    // InternalDialogFlow.g:1394:1: rule__Intent__PhraseAssignment_2 : ( rulePhrases ) ;
    public final void rule__Intent__PhraseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1398:1: ( ( rulePhrases ) )
            // InternalDialogFlow.g:1399:2: ( rulePhrases )
            {
            // InternalDialogFlow.g:1399:2: ( rulePhrases )
            // InternalDialogFlow.g:1400:3: rulePhrases
            {
             before(grammarAccess.getIntentAccess().getPhrasePhrasesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrases();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getPhrasePhrasesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__PhraseAssignment_2"


    // $ANTLR start "rule__Intent__ResponseAssignment_3"
    // InternalDialogFlow.g:1409:1: rule__Intent__ResponseAssignment_3 : ( ruleResponses ) ;
    public final void rule__Intent__ResponseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1413:1: ( ( ruleResponses ) )
            // InternalDialogFlow.g:1414:2: ( ruleResponses )
            {
            // InternalDialogFlow.g:1414:2: ( ruleResponses )
            // InternalDialogFlow.g:1415:3: ruleResponses
            {
             before(grammarAccess.getIntentAccess().getResponseResponsesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResponses();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getResponseResponsesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ResponseAssignment_3"


    // $ANTLR start "rule__Intent__ActionAssignment_4"
    // InternalDialogFlow.g:1424:1: rule__Intent__ActionAssignment_4 : ( ruleActions ) ;
    public final void rule__Intent__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1428:1: ( ( ruleActions ) )
            // InternalDialogFlow.g:1429:2: ( ruleActions )
            {
            // InternalDialogFlow.g:1429:2: ( ruleActions )
            // InternalDialogFlow.g:1430:3: ruleActions
            {
             before(grammarAccess.getIntentAccess().getActionActionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getActionActionsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ActionAssignment_4"


    // $ANTLR start "rule__Phrases__PhrasesAssignment_2"
    // InternalDialogFlow.g:1439:1: rule__Phrases__PhrasesAssignment_2 : ( rulePhraseValue ) ;
    public final void rule__Phrases__PhrasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1443:1: ( ( rulePhraseValue ) )
            // InternalDialogFlow.g:1444:2: ( rulePhraseValue )
            {
            // InternalDialogFlow.g:1444:2: ( rulePhraseValue )
            // InternalDialogFlow.g:1445:3: rulePhraseValue
            {
             before(grammarAccess.getPhrasesAccess().getPhrasesPhraseValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhraseValue();

            state._fsp--;

             after(grammarAccess.getPhrasesAccess().getPhrasesPhraseValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrases__PhrasesAssignment_2"


    // $ANTLR start "rule__PhraseValue__ValueAssignment_2"
    // InternalDialogFlow.g:1454:1: rule__PhraseValue__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PhraseValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1458:1: ( ( RULE_STRING ) )
            // InternalDialogFlow.g:1459:2: ( RULE_STRING )
            {
            // InternalDialogFlow.g:1459:2: ( RULE_STRING )
            // InternalDialogFlow.g:1460:3: RULE_STRING
            {
             before(grammarAccess.getPhraseValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPhraseValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PhraseValue__ValueAssignment_2"


    // $ANTLR start "rule__Responses__ResponsesAssignment_1"
    // InternalDialogFlow.g:1469:1: rule__Responses__ResponsesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Responses__ResponsesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1473:1: ( ( RULE_STRING ) )
            // InternalDialogFlow.g:1474:2: ( RULE_STRING )
            {
            // InternalDialogFlow.g:1474:2: ( RULE_STRING )
            // InternalDialogFlow.g:1475:3: RULE_STRING
            {
             before(grammarAccess.getResponsesAccess().getResponsesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResponsesAccess().getResponsesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__ResponsesAssignment_1"


    // $ANTLR start "rule__Responses__ResponsesAssignment_3_1"
    // InternalDialogFlow.g:1484:1: rule__Responses__ResponsesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Responses__ResponsesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1488:1: ( ( RULE_STRING ) )
            // InternalDialogFlow.g:1489:2: ( RULE_STRING )
            {
            // InternalDialogFlow.g:1489:2: ( RULE_STRING )
            // InternalDialogFlow.g:1490:3: RULE_STRING
            {
             before(grammarAccess.getResponsesAccess().getResponsesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResponsesAccess().getResponsesSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responses__ResponsesAssignment_3_1"


    // $ANTLR start "rule__Actions__ActionsAssignment_2"
    // InternalDialogFlow.g:1499:1: rule__Actions__ActionsAssignment_2 : ( ruleActionValue ) ;
    public final void rule__Actions__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1503:1: ( ( ruleActionValue ) )
            // InternalDialogFlow.g:1504:2: ( ruleActionValue )
            {
            // InternalDialogFlow.g:1504:2: ( ruleActionValue )
            // InternalDialogFlow.g:1505:3: ruleActionValue
            {
             before(grammarAccess.getActionsAccess().getActionsActionValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActionValue();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getActionsActionValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actions__ActionsAssignment_2"


    // $ANTLR start "rule__ActionValue__NameAssignment_1"
    // InternalDialogFlow.g:1514:1: rule__ActionValue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1518:1: ( ( RULE_ID ) )
            // InternalDialogFlow.g:1519:2: ( RULE_ID )
            {
            // InternalDialogFlow.g:1519:2: ( RULE_ID )
            // InternalDialogFlow.g:1520:3: RULE_ID
            {
             before(grammarAccess.getActionValueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionValueAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionValue__NameAssignment_1"


    // $ANTLR start "rule__ActionValue__TypeAssignment_2"
    // InternalDialogFlow.g:1529:1: rule__ActionValue__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ActionValue__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1533:1: ( ( ( RULE_ID ) ) )
            // InternalDialogFlow.g:1534:2: ( ( RULE_ID ) )
            {
            // InternalDialogFlow.g:1534:2: ( ( RULE_ID ) )
            // InternalDialogFlow.g:1535:3: ( RULE_ID )
            {
             before(grammarAccess.getActionValueAccess().getTypeEntityCrossReference_2_0()); 
            // InternalDialogFlow.g:1536:3: ( RULE_ID )
            // InternalDialogFlow.g:1537:4: RULE_ID
            {
             before(grammarAccess.getActionValueAccess().getTypeEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionValueAccess().getTypeEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getActionValueAccess().getTypeEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionValue__TypeAssignment_2"


    // $ANTLR start "rule__ActionValue__ListAssignment_3"
    // InternalDialogFlow.g:1548:1: rule__ActionValue__ListAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ActionValue__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1552:1: ( ( RULE_STRING ) )
            // InternalDialogFlow.g:1553:2: ( RULE_STRING )
            {
            // InternalDialogFlow.g:1553:2: ( RULE_STRING )
            // InternalDialogFlow.g:1554:3: RULE_STRING
            {
             before(grammarAccess.getActionValueAccess().getListSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionValueAccess().getListSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionValue__ListAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDialogFlow.g:1563:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1567:1: ( ( RULE_ID ) )
            // InternalDialogFlow.g:1568:2: ( RULE_ID )
            {
            // InternalDialogFlow.g:1568:2: ( RULE_ID )
            // InternalDialogFlow.g:1569:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__EntitiesAssignment_2"
    // InternalDialogFlow.g:1578:1: rule__Entity__EntitiesAssignment_2 : ( ruleEntityValue ) ;
    public final void rule__Entity__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1582:1: ( ( ruleEntityValue ) )
            // InternalDialogFlow.g:1583:2: ( ruleEntityValue )
            {
            // InternalDialogFlow.g:1583:2: ( ruleEntityValue )
            // InternalDialogFlow.g:1584:3: ruleEntityValue
            {
             before(grammarAccess.getEntityAccess().getEntitiesEntityValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityValue();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntitiesEntityValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntitiesAssignment_2"


    // $ANTLR start "rule__EntityValue__ValuesAssignment_2"
    // InternalDialogFlow.g:1593:1: rule__EntityValue__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EntityValue__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1597:1: ( ( RULE_STRING ) )
            // InternalDialogFlow.g:1598:2: ( RULE_STRING )
            {
            // InternalDialogFlow.g:1598:2: ( RULE_STRING )
            // InternalDialogFlow.g:1599:3: RULE_STRING
            {
             before(grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__ValuesAssignment_2"


    // $ANTLR start "rule__EntityValue__ValuesAssignment_4_1"
    // InternalDialogFlow.g:1608:1: rule__EntityValue__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__EntityValue__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDialogFlow.g:1612:1: ( ( RULE_STRING ) )
            // InternalDialogFlow.g:1613:2: ( RULE_STRING )
            {
            // InternalDialogFlow.g:1613:2: ( RULE_STRING )
            // InternalDialogFlow.g:1614:3: RULE_STRING
            {
             before(grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityValueAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityValue__ValuesAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});

}