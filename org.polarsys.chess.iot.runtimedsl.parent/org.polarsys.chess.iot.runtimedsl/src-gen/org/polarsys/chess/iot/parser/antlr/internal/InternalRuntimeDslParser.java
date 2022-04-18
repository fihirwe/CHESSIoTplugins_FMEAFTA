package org.polarsys.chess.iot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.chess.iot.services.RuntimeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuntimeDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Environment:'", "'--Begin-Module--'", "'name:'", "'action:'", "'--End-Module--'", "'START-service'", "'STOP-service'", "'RESTART-service'", "'REDEPLOY-service'", "'LOG-service'", "'MONITOR-service'", "'period:'", "'ms'", "'RUN-module'", "'use'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=5;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRuntimeDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuntimeDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuntimeDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuntimeDsl.g"; }



     	private RuntimeDslGrammarAccess grammarAccess;

        public InternalRuntimeDslParser(TokenStream input, RuntimeDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RuntimeDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRuntimeDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRuntimeDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRuntimeDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRuntimeDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Environment:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_module_2_0= ruleModule ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_module_2_0 = null;



        	enterRule();

        try {
            // InternalRuntimeDsl.g:77:2: ( (otherlv_0= 'Environment:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_module_2_0= ruleModule ) )* ) )
            // InternalRuntimeDsl.g:78:2: (otherlv_0= 'Environment:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_module_2_0= ruleModule ) )* )
            {
            // InternalRuntimeDsl.g:78:2: (otherlv_0= 'Environment:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_module_2_0= ruleModule ) )* )
            // InternalRuntimeDsl.g:79:3: otherlv_0= 'Environment:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_module_2_0= ruleModule ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getEnvironmentKeyword_0());
            		
            // InternalRuntimeDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRuntimeDsl.g:101:3: ( (lv_module_2_0= ruleModule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRuntimeDsl.g:102:4: (lv_module_2_0= ruleModule )
            	    {
            	    // InternalRuntimeDsl.g:102:4: (lv_module_2_0= ruleModule )
            	    // InternalRuntimeDsl.g:103:5: lv_module_2_0= ruleModule
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getModuleModuleParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_module_2_0=ruleModule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"module",
            	    						lv_module_2_0,
            	    						"org.polarsys.chess.iot.RuntimeDsl.Module");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModule"
    // InternalRuntimeDsl.g:124:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalRuntimeDsl.g:124:47: (iv_ruleModule= ruleModule EOF )
            // InternalRuntimeDsl.g:125:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalRuntimeDsl.g:131:1: ruleModule returns [EObject current=null] : (otherlv_0= '--Begin-Module--' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uses_3_0= ruleUses ) )* otherlv_4= 'action:' ( ( (lv_action_5_0= rulestart ) ) | ( (lv_action_6_0= rulestop ) ) | ( (lv_action_7_0= rulerestart ) ) | ( (lv_action_8_0= ruleredeploy ) ) | ( (lv_action_9_0= rulelog ) ) | ( (lv_action_10_0= rulemonitor ) ) | ( (lv_action_11_0= rulerun ) ) )* otherlv_12= '--End-Module--' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_12=null;
        EObject lv_uses_3_0 = null;

        EObject lv_action_5_0 = null;

        EObject lv_action_6_0 = null;

        EObject lv_action_7_0 = null;

        EObject lv_action_8_0 = null;

        EObject lv_action_9_0 = null;

        EObject lv_action_10_0 = null;

        EObject lv_action_11_0 = null;



        	enterRule();

        try {
            // InternalRuntimeDsl.g:137:2: ( (otherlv_0= '--Begin-Module--' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uses_3_0= ruleUses ) )* otherlv_4= 'action:' ( ( (lv_action_5_0= rulestart ) ) | ( (lv_action_6_0= rulestop ) ) | ( (lv_action_7_0= rulerestart ) ) | ( (lv_action_8_0= ruleredeploy ) ) | ( (lv_action_9_0= rulelog ) ) | ( (lv_action_10_0= rulemonitor ) ) | ( (lv_action_11_0= rulerun ) ) )* otherlv_12= '--End-Module--' ) )
            // InternalRuntimeDsl.g:138:2: (otherlv_0= '--Begin-Module--' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uses_3_0= ruleUses ) )* otherlv_4= 'action:' ( ( (lv_action_5_0= rulestart ) ) | ( (lv_action_6_0= rulestop ) ) | ( (lv_action_7_0= rulerestart ) ) | ( (lv_action_8_0= ruleredeploy ) ) | ( (lv_action_9_0= rulelog ) ) | ( (lv_action_10_0= rulemonitor ) ) | ( (lv_action_11_0= rulerun ) ) )* otherlv_12= '--End-Module--' )
            {
            // InternalRuntimeDsl.g:138:2: (otherlv_0= '--Begin-Module--' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uses_3_0= ruleUses ) )* otherlv_4= 'action:' ( ( (lv_action_5_0= rulestart ) ) | ( (lv_action_6_0= rulestop ) ) | ( (lv_action_7_0= rulerestart ) ) | ( (lv_action_8_0= ruleredeploy ) ) | ( (lv_action_9_0= rulelog ) ) | ( (lv_action_10_0= rulemonitor ) ) | ( (lv_action_11_0= rulerun ) ) )* otherlv_12= '--End-Module--' )
            // InternalRuntimeDsl.g:139:3: otherlv_0= '--Begin-Module--' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ( (lv_uses_3_0= ruleUses ) )* otherlv_4= 'action:' ( ( (lv_action_5_0= rulestart ) ) | ( (lv_action_6_0= rulestop ) ) | ( (lv_action_7_0= rulerestart ) ) | ( (lv_action_8_0= ruleredeploy ) ) | ( (lv_action_9_0= rulelog ) ) | ( (lv_action_10_0= rulemonitor ) ) | ( (lv_action_11_0= rulerun ) ) )* otherlv_12= '--End-Module--'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getBeginModuleKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getNameKeyword_1());
            		
            // InternalRuntimeDsl.g:147:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRuntimeDsl.g:148:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:148:4: (lv_name_2_0= RULE_ID )
            // InternalRuntimeDsl.g:149:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRuntimeDsl.g:165:3: ( (lv_uses_3_0= ruleUses ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRuntimeDsl.g:166:4: (lv_uses_3_0= ruleUses )
            	    {
            	    // InternalRuntimeDsl.g:166:4: (lv_uses_3_0= ruleUses )
            	    // InternalRuntimeDsl.g:167:5: lv_uses_3_0= ruleUses
            	    {

            	    					newCompositeNode(grammarAccess.getModuleAccess().getUsesUsesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_uses_3_0=ruleUses();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uses",
            	    						lv_uses_3_0,
            	    						"org.polarsys.chess.iot.RuntimeDsl.Uses");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getActionKeyword_4());
            		
            // InternalRuntimeDsl.g:188:3: ( ( (lv_action_5_0= rulestart ) ) | ( (lv_action_6_0= rulestop ) ) | ( (lv_action_7_0= rulerestart ) ) | ( (lv_action_8_0= ruleredeploy ) ) | ( (lv_action_9_0= rulelog ) ) | ( (lv_action_10_0= rulemonitor ) ) | ( (lv_action_11_0= rulerun ) ) )*
            loop3:
            do {
                int alt3=8;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                case 18:
                    {
                    alt3=2;
                    }
                    break;
                case 19:
                    {
                    alt3=3;
                    }
                    break;
                case 20:
                    {
                    alt3=4;
                    }
                    break;
                case 21:
                    {
                    alt3=5;
                    }
                    break;
                case 22:
                    {
                    alt3=6;
                    }
                    break;
                case 25:
                    {
                    alt3=7;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalRuntimeDsl.g:189:4: ( (lv_action_5_0= rulestart ) )
            	    {
            	    // InternalRuntimeDsl.g:189:4: ( (lv_action_5_0= rulestart ) )
            	    // InternalRuntimeDsl.g:190:5: (lv_action_5_0= rulestart )
            	    {
            	    // InternalRuntimeDsl.g:190:5: (lv_action_5_0= rulestart )
            	    // InternalRuntimeDsl.g:191:6: lv_action_5_0= rulestart
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getActionStartParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_action_5_0=rulestart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_5_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.start");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRuntimeDsl.g:209:4: ( (lv_action_6_0= rulestop ) )
            	    {
            	    // InternalRuntimeDsl.g:209:4: ( (lv_action_6_0= rulestop ) )
            	    // InternalRuntimeDsl.g:210:5: (lv_action_6_0= rulestop )
            	    {
            	    // InternalRuntimeDsl.g:210:5: (lv_action_6_0= rulestop )
            	    // InternalRuntimeDsl.g:211:6: lv_action_6_0= rulestop
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getActionStopParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_action_6_0=rulestop();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_6_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.stop");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRuntimeDsl.g:229:4: ( (lv_action_7_0= rulerestart ) )
            	    {
            	    // InternalRuntimeDsl.g:229:4: ( (lv_action_7_0= rulerestart ) )
            	    // InternalRuntimeDsl.g:230:5: (lv_action_7_0= rulerestart )
            	    {
            	    // InternalRuntimeDsl.g:230:5: (lv_action_7_0= rulerestart )
            	    // InternalRuntimeDsl.g:231:6: lv_action_7_0= rulerestart
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getActionRestartParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_action_7_0=rulerestart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_7_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.restart");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRuntimeDsl.g:249:4: ( (lv_action_8_0= ruleredeploy ) )
            	    {
            	    // InternalRuntimeDsl.g:249:4: ( (lv_action_8_0= ruleredeploy ) )
            	    // InternalRuntimeDsl.g:250:5: (lv_action_8_0= ruleredeploy )
            	    {
            	    // InternalRuntimeDsl.g:250:5: (lv_action_8_0= ruleredeploy )
            	    // InternalRuntimeDsl.g:251:6: lv_action_8_0= ruleredeploy
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getActionRedeployParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_action_8_0=ruleredeploy();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_8_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.redeploy");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRuntimeDsl.g:269:4: ( (lv_action_9_0= rulelog ) )
            	    {
            	    // InternalRuntimeDsl.g:269:4: ( (lv_action_9_0= rulelog ) )
            	    // InternalRuntimeDsl.g:270:5: (lv_action_9_0= rulelog )
            	    {
            	    // InternalRuntimeDsl.g:270:5: (lv_action_9_0= rulelog )
            	    // InternalRuntimeDsl.g:271:6: lv_action_9_0= rulelog
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getActionLogParserRuleCall_5_4_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_action_9_0=rulelog();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_9_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.log");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRuntimeDsl.g:289:4: ( (lv_action_10_0= rulemonitor ) )
            	    {
            	    // InternalRuntimeDsl.g:289:4: ( (lv_action_10_0= rulemonitor ) )
            	    // InternalRuntimeDsl.g:290:5: (lv_action_10_0= rulemonitor )
            	    {
            	    // InternalRuntimeDsl.g:290:5: (lv_action_10_0= rulemonitor )
            	    // InternalRuntimeDsl.g:291:6: lv_action_10_0= rulemonitor
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getActionMonitorParserRuleCall_5_5_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_action_10_0=rulemonitor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_10_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.monitor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRuntimeDsl.g:309:4: ( (lv_action_11_0= rulerun ) )
            	    {
            	    // InternalRuntimeDsl.g:309:4: ( (lv_action_11_0= rulerun ) )
            	    // InternalRuntimeDsl.g:310:5: (lv_action_11_0= rulerun )
            	    {
            	    // InternalRuntimeDsl.g:310:5: (lv_action_11_0= rulerun )
            	    // InternalRuntimeDsl.g:311:6: lv_action_11_0= rulerun
            	    {

            	    						newCompositeNode(grammarAccess.getModuleAccess().getActionRunParserRuleCall_5_6_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_action_11_0=rulerun();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_11_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.run");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getEndModuleKeyword_6());
            		

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulestart"
    // InternalRuntimeDsl.g:337:1: entryRulestart returns [EObject current=null] : iv_rulestart= rulestart EOF ;
    public final EObject entryRulestart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestart = null;


        try {
            // InternalRuntimeDsl.g:337:46: (iv_rulestart= rulestart EOF )
            // InternalRuntimeDsl.g:338:2: iv_rulestart= rulestart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestart=rulestart();

            state._fsp--;

             current =iv_rulestart; 
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
    // $ANTLR end "entryRulestart"


    // $ANTLR start "rulestart"
    // InternalRuntimeDsl.g:344:1: rulestart returns [EObject current=null] : (otherlv_0= 'START-service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulestart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:350:2: ( (otherlv_0= 'START-service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:351:2: (otherlv_0= 'START-service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:351:2: (otherlv_0= 'START-service' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRuntimeDsl.g:352:3: otherlv_0= 'START-service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStartAccess().getSTARTServiceKeyword_0());
            		
            // InternalRuntimeDsl.g:356:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:357:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:357:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:358:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulestart"


    // $ANTLR start "entryRulestop"
    // InternalRuntimeDsl.g:378:1: entryRulestop returns [EObject current=null] : iv_rulestop= rulestop EOF ;
    public final EObject entryRulestop() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestop = null;


        try {
            // InternalRuntimeDsl.g:378:45: (iv_rulestop= rulestop EOF )
            // InternalRuntimeDsl.g:379:2: iv_rulestop= rulestop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestop=rulestop();

            state._fsp--;

             current =iv_rulestop; 
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
    // $ANTLR end "entryRulestop"


    // $ANTLR start "rulestop"
    // InternalRuntimeDsl.g:385:1: rulestop returns [EObject current=null] : (otherlv_0= 'STOP-service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulestop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:391:2: ( (otherlv_0= 'STOP-service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:392:2: (otherlv_0= 'STOP-service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:392:2: (otherlv_0= 'STOP-service' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRuntimeDsl.g:393:3: otherlv_0= 'STOP-service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getSTOPServiceKeyword_0());
            		
            // InternalRuntimeDsl.g:397:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:398:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:398:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:399:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStopAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulestop"


    // $ANTLR start "entryRulerestart"
    // InternalRuntimeDsl.g:419:1: entryRulerestart returns [EObject current=null] : iv_rulerestart= rulerestart EOF ;
    public final EObject entryRulerestart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerestart = null;


        try {
            // InternalRuntimeDsl.g:419:48: (iv_rulerestart= rulerestart EOF )
            // InternalRuntimeDsl.g:420:2: iv_rulerestart= rulerestart EOF
            {
             newCompositeNode(grammarAccess.getRestartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerestart=rulerestart();

            state._fsp--;

             current =iv_rulerestart; 
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
    // $ANTLR end "entryRulerestart"


    // $ANTLR start "rulerestart"
    // InternalRuntimeDsl.g:426:1: rulerestart returns [EObject current=null] : (otherlv_0= 'RESTART-service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulerestart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:432:2: ( (otherlv_0= 'RESTART-service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:433:2: (otherlv_0= 'RESTART-service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:433:2: (otherlv_0= 'RESTART-service' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRuntimeDsl.g:434:3: otherlv_0= 'RESTART-service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRestartAccess().getRESTARTServiceKeyword_0());
            		
            // InternalRuntimeDsl.g:438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:439:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRestartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulerestart"


    // $ANTLR start "entryRuleredeploy"
    // InternalRuntimeDsl.g:460:1: entryRuleredeploy returns [EObject current=null] : iv_ruleredeploy= ruleredeploy EOF ;
    public final EObject entryRuleredeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleredeploy = null;


        try {
            // InternalRuntimeDsl.g:460:49: (iv_ruleredeploy= ruleredeploy EOF )
            // InternalRuntimeDsl.g:461:2: iv_ruleredeploy= ruleredeploy EOF
            {
             newCompositeNode(grammarAccess.getRedeployRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleredeploy=ruleredeploy();

            state._fsp--;

             current =iv_ruleredeploy; 
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
    // $ANTLR end "entryRuleredeploy"


    // $ANTLR start "ruleredeploy"
    // InternalRuntimeDsl.g:467:1: ruleredeploy returns [EObject current=null] : (otherlv_0= 'REDEPLOY-service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleredeploy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:473:2: ( (otherlv_0= 'REDEPLOY-service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:474:2: (otherlv_0= 'REDEPLOY-service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:474:2: (otherlv_0= 'REDEPLOY-service' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRuntimeDsl.g:475:3: otherlv_0= 'REDEPLOY-service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRedeployAccess().getREDEPLOYServiceKeyword_0());
            		
            // InternalRuntimeDsl.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:481:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRedeployAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedeployRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleredeploy"


    // $ANTLR start "entryRulelog"
    // InternalRuntimeDsl.g:501:1: entryRulelog returns [EObject current=null] : iv_rulelog= rulelog EOF ;
    public final EObject entryRulelog() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelog = null;


        try {
            // InternalRuntimeDsl.g:501:44: (iv_rulelog= rulelog EOF )
            // InternalRuntimeDsl.g:502:2: iv_rulelog= rulelog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelog=rulelog();

            state._fsp--;

             current =iv_rulelog; 
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
    // $ANTLR end "entryRulelog"


    // $ANTLR start "rulelog"
    // InternalRuntimeDsl.g:508:1: rulelog returns [EObject current=null] : (otherlv_0= 'LOG-service' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulelog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:514:2: ( (otherlv_0= 'LOG-service' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:515:2: (otherlv_0= 'LOG-service' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:515:2: (otherlv_0= 'LOG-service' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRuntimeDsl.g:516:3: otherlv_0= 'LOG-service' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLOGServiceKeyword_0());
            		
            // InternalRuntimeDsl.g:520:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:521:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:521:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:522:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulelog"


    // $ANTLR start "entryRulemonitor"
    // InternalRuntimeDsl.g:542:1: entryRulemonitor returns [EObject current=null] : iv_rulemonitor= rulemonitor EOF ;
    public final EObject entryRulemonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemonitor = null;


        try {
            // InternalRuntimeDsl.g:542:48: (iv_rulemonitor= rulemonitor EOF )
            // InternalRuntimeDsl.g:543:2: iv_rulemonitor= rulemonitor EOF
            {
             newCompositeNode(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemonitor=rulemonitor();

            state._fsp--;

             current =iv_rulemonitor; 
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
    // $ANTLR end "entryRulemonitor"


    // $ANTLR start "rulemonitor"
    // InternalRuntimeDsl.g:549:1: rulemonitor returns [EObject current=null] : (otherlv_0= 'MONITOR-service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'period:' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= 'ms' ) ;
    public final EObject rulemonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:555:2: ( (otherlv_0= 'MONITOR-service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'period:' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= 'ms' ) )
            // InternalRuntimeDsl.g:556:2: (otherlv_0= 'MONITOR-service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'period:' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= 'ms' )
            {
            // InternalRuntimeDsl.g:556:2: (otherlv_0= 'MONITOR-service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'period:' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= 'ms' )
            // InternalRuntimeDsl.g:557:3: otherlv_0= 'MONITOR-service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'period:' ( (lv_value_3_0= RULE_NUMBER ) ) otherlv_4= 'ms'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitorAccess().getMONITORServiceKeyword_0());
            		
            // InternalRuntimeDsl.g:561:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:562:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:562:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:563:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMonitorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMonitorAccess().getPeriodKeyword_2());
            		
            // InternalRuntimeDsl.g:583:3: ( (lv_value_3_0= RULE_NUMBER ) )
            // InternalRuntimeDsl.g:584:4: (lv_value_3_0= RULE_NUMBER )
            {
            // InternalRuntimeDsl.g:584:4: (lv_value_3_0= RULE_NUMBER )
            // InternalRuntimeDsl.g:585:5: lv_value_3_0= RULE_NUMBER
            {
            lv_value_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_10); 

            					newLeafNode(lv_value_3_0, grammarAccess.getMonitorAccess().getValueNUMBERTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.polarsys.chess.iot.RuntimeDsl.NUMBER");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMonitorAccess().getMsKeyword_4());
            		

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
    // $ANTLR end "rulemonitor"


    // $ANTLR start "entryRulerun"
    // InternalRuntimeDsl.g:609:1: entryRulerun returns [EObject current=null] : iv_rulerun= rulerun EOF ;
    public final EObject entryRulerun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerun = null;


        try {
            // InternalRuntimeDsl.g:609:44: (iv_rulerun= rulerun EOF )
            // InternalRuntimeDsl.g:610:2: iv_rulerun= rulerun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerun=rulerun();

            state._fsp--;

             current =iv_rulerun; 
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
    // $ANTLR end "entryRulerun"


    // $ANTLR start "rulerun"
    // InternalRuntimeDsl.g:616:1: rulerun returns [EObject current=null] : (otherlv_0= 'RUN-module' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulerun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:622:2: ( (otherlv_0= 'RUN-module' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:623:2: (otherlv_0= 'RUN-module' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:623:2: (otherlv_0= 'RUN-module' ( (otherlv_1= RULE_ID ) ) )
            // InternalRuntimeDsl.g:624:3: otherlv_0= 'RUN-module' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRUNModuleKeyword_0());
            		
            // InternalRuntimeDsl.g:628:3: ( (otherlv_1= RULE_ID ) )
            // InternalRuntimeDsl.g:629:4: (otherlv_1= RULE_ID )
            {
            // InternalRuntimeDsl.g:629:4: (otherlv_1= RULE_ID )
            // InternalRuntimeDsl.g:630:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRunAccess().getModuleModuleCrossReference_1_0());
            				

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
    // $ANTLR end "rulerun"


    // $ANTLR start "entryRuleUses"
    // InternalRuntimeDsl.g:645:1: entryRuleUses returns [EObject current=null] : iv_ruleUses= ruleUses EOF ;
    public final EObject entryRuleUses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUses = null;


        try {
            // InternalRuntimeDsl.g:645:45: (iv_ruleUses= ruleUses EOF )
            // InternalRuntimeDsl.g:646:2: iv_ruleUses= ruleUses EOF
            {
             newCompositeNode(grammarAccess.getUsesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUses=ruleUses();

            state._fsp--;

             current =iv_ruleUses; 
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
    // $ANTLR end "entryRuleUses"


    // $ANTLR start "ruleUses"
    // InternalRuntimeDsl.g:652:1: ruleUses returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleUses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:658:2: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:659:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:659:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) )
            // InternalRuntimeDsl.g:660:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUsesAccess().getUseKeyword_0());
            		
            // InternalRuntimeDsl.g:664:3: ( (otherlv_1= RULE_ID ) )
            // InternalRuntimeDsl.g:665:4: (otherlv_1= RULE_ID )
            {
            // InternalRuntimeDsl.g:665:4: (otherlv_1= RULE_ID )
            // InternalRuntimeDsl.g:666:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsesRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getUsesAccess().getModuleModuleCrossReference_1_0());
            				

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
    // $ANTLR end "ruleUses"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000027F0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});

}