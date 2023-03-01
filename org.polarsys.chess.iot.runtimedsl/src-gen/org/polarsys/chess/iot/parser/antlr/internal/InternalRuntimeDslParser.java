package org.polarsys.chess.iot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DepPlan:'", "'{'", "'setup:'", "'re-use-plan:'", "'Description:'", "'}'", "'agent:'", "'extends'", "'RULE:'", "'create'", "'=>'", "'on:'", "'start'", "'stop'", "'re-start'", "'re-deploy'", "'log'", "'log_type:'", "'filename:'", "'location:'", "'rerun-agent'", "'machine'", "'service'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
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
        	return "Deployment";
       	}

       	@Override
       	protected RuntimeDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDeployment"
    // InternalRuntimeDsl.g:65:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalRuntimeDsl.g:65:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalRuntimeDsl.g:66:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalRuntimeDsl.g:72:1: ruleDeployment returns [EObject current=null] : ( (lv_plan_0_0= ruleExpression ) )* ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        EObject lv_plan_0_0 = null;



        	enterRule();

        try {
            // InternalRuntimeDsl.g:78:2: ( ( (lv_plan_0_0= ruleExpression ) )* )
            // InternalRuntimeDsl.g:79:2: ( (lv_plan_0_0= ruleExpression ) )*
            {
            // InternalRuntimeDsl.g:79:2: ( (lv_plan_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRuntimeDsl.g:80:3: (lv_plan_0_0= ruleExpression )
            	    {
            	    // InternalRuntimeDsl.g:80:3: (lv_plan_0_0= ruleExpression )
            	    // InternalRuntimeDsl.g:81:4: lv_plan_0_0= ruleExpression
            	    {

            	    				newCompositeNode(grammarAccess.getDeploymentAccess().getPlanExpressionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_plan_0_0=ruleExpression();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"plan",
            	    					lv_plan_0_0,
            	    					"org.polarsys.chess.iot.RuntimeDsl.Expression");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleExpression"
    // InternalRuntimeDsl.g:101:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRuntimeDsl.g:101:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRuntimeDsl.g:102:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRuntimeDsl.g:108:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'DepPlan:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'setup:' ( (lv_setup_4_0= ruleBOOLEAN ) ) )? (otherlv_5= 're-use-plan:' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= 'Description:' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_agent_9_0= ruleAbstractAgent ) )* otherlv_10= '}' ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_10=null;
        Enumerator lv_setup_4_0 = null;

        EObject lv_agent_9_0 = null;



        	enterRule();

        try {
            // InternalRuntimeDsl.g:114:2: ( (otherlv_0= 'DepPlan:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'setup:' ( (lv_setup_4_0= ruleBOOLEAN ) ) )? (otherlv_5= 're-use-plan:' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= 'Description:' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_agent_9_0= ruleAbstractAgent ) )* otherlv_10= '}' ) )
            // InternalRuntimeDsl.g:115:2: (otherlv_0= 'DepPlan:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'setup:' ( (lv_setup_4_0= ruleBOOLEAN ) ) )? (otherlv_5= 're-use-plan:' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= 'Description:' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_agent_9_0= ruleAbstractAgent ) )* otherlv_10= '}' )
            {
            // InternalRuntimeDsl.g:115:2: (otherlv_0= 'DepPlan:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'setup:' ( (lv_setup_4_0= ruleBOOLEAN ) ) )? (otherlv_5= 're-use-plan:' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= 'Description:' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_agent_9_0= ruleAbstractAgent ) )* otherlv_10= '}' )
            // InternalRuntimeDsl.g:116:3: otherlv_0= 'DepPlan:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'setup:' ( (lv_setup_4_0= ruleBOOLEAN ) ) )? (otherlv_5= 're-use-plan:' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= 'Description:' ( (lv_description_8_0= RULE_STRING ) ) ( (lv_agent_9_0= ruleAbstractAgent ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getDepPlanKeyword_0());
            		
            // InternalRuntimeDsl.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRuntimeDsl.g:142:3: (otherlv_3= 'setup:' ( (lv_setup_4_0= ruleBOOLEAN ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuntimeDsl.g:143:4: otherlv_3= 'setup:' ( (lv_setup_4_0= ruleBOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getSetupKeyword_3_0());
                    			
                    // InternalRuntimeDsl.g:147:4: ( (lv_setup_4_0= ruleBOOLEAN ) )
                    // InternalRuntimeDsl.g:148:5: (lv_setup_4_0= ruleBOOLEAN )
                    {
                    // InternalRuntimeDsl.g:148:5: (lv_setup_4_0= ruleBOOLEAN )
                    // InternalRuntimeDsl.g:149:6: lv_setup_4_0= ruleBOOLEAN
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getSetupBOOLEANEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_setup_4_0=ruleBOOLEAN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"setup",
                    							lv_setup_4_0,
                    							"org.polarsys.chess.iot.RuntimeDsl.BOOLEAN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRuntimeDsl.g:167:3: (otherlv_5= 're-use-plan:' ( (otherlv_6= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuntimeDsl.g:168:4: otherlv_5= 're-use-plan:' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getReUsePlanKeyword_4_0());
                    			
                    // InternalRuntimeDsl.g:172:4: ( (otherlv_6= RULE_ID ) )
                    // InternalRuntimeDsl.g:173:5: (otherlv_6= RULE_ID )
                    {
                    // InternalRuntimeDsl.g:173:5: (otherlv_6= RULE_ID )
                    // InternalRuntimeDsl.g:174:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpressionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getPlanExpressionCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getExpressionAccess().getDescriptionKeyword_5());
            		
            // InternalRuntimeDsl.g:190:3: ( (lv_description_8_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:191:4: (lv_description_8_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:191:4: (lv_description_8_0= RULE_STRING )
            // InternalRuntimeDsl.g:192:5: lv_description_8_0= RULE_STRING
            {
            lv_description_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_8_0, grammarAccess.getExpressionAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRuntimeDsl.g:208:3: ( (lv_agent_9_0= ruleAbstractAgent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRuntimeDsl.g:209:4: (lv_agent_9_0= ruleAbstractAgent )
            	    {
            	    // InternalRuntimeDsl.g:209:4: (lv_agent_9_0= ruleAbstractAgent )
            	    // InternalRuntimeDsl.g:210:5: lv_agent_9_0= ruleAbstractAgent
            	    {

            	    					newCompositeNode(grammarAccess.getExpressionAccess().getAgentAbstractAgentParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_agent_9_0=ruleAbstractAgent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"agent",
            	    						lv_agent_9_0,
            	    						"org.polarsys.chess.iot.RuntimeDsl.AbstractAgent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getExpressionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAbstractAgent"
    // InternalRuntimeDsl.g:235:1: entryRuleAbstractAgent returns [EObject current=null] : iv_ruleAbstractAgent= ruleAbstractAgent EOF ;
    public final EObject entryRuleAbstractAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAgent = null;


        try {
            // InternalRuntimeDsl.g:235:54: (iv_ruleAbstractAgent= ruleAbstractAgent EOF )
            // InternalRuntimeDsl.g:236:2: iv_ruleAbstractAgent= ruleAbstractAgent EOF
            {
             newCompositeNode(grammarAccess.getAbstractAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAgent=ruleAbstractAgent();

            state._fsp--;

             current =iv_ruleAbstractAgent; 
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
    // $ANTLR end "entryRuleAbstractAgent"


    // $ANTLR start "ruleAbstractAgent"
    // InternalRuntimeDsl.g:242:1: ruleAbstractAgent returns [EObject current=null] : (otherlv_0= 'agent:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'RULE:' ( (lv_rule_6_0= rulerule ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleAbstractAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_rule_6_0 = null;



        	enterRule();

        try {
            // InternalRuntimeDsl.g:248:2: ( (otherlv_0= 'agent:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'RULE:' ( (lv_rule_6_0= rulerule ) ) )* otherlv_7= '}' ) )
            // InternalRuntimeDsl.g:249:2: (otherlv_0= 'agent:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'RULE:' ( (lv_rule_6_0= rulerule ) ) )* otherlv_7= '}' )
            {
            // InternalRuntimeDsl.g:249:2: (otherlv_0= 'agent:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'RULE:' ( (lv_rule_6_0= rulerule ) ) )* otherlv_7= '}' )
            // InternalRuntimeDsl.g:250:3: otherlv_0= 'agent:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'RULE:' ( (lv_rule_6_0= rulerule ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractAgentAccess().getAgentKeyword_0());
            		
            // InternalRuntimeDsl.g:254:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuntimeDsl.g:255:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuntimeDsl.g:255:4: (lv_name_1_0= RULE_ID )
            // InternalRuntimeDsl.g:256:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbstractAgentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRuntimeDsl.g:272:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuntimeDsl.g:273:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbstractAgentAccess().getExtendsKeyword_2_0());
                    			
                    // InternalRuntimeDsl.g:277:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRuntimeDsl.g:278:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRuntimeDsl.g:278:5: (otherlv_3= RULE_ID )
                    // InternalRuntimeDsl.g:279:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractAgentRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getAbstractAgentAccess().getSuperTypeAbstractAgentCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAbstractAgentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRuntimeDsl.g:295:3: (otherlv_5= 'RULE:' ( (lv_rule_6_0= rulerule ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRuntimeDsl.g:296:4: otherlv_5= 'RULE:' ( (lv_rule_6_0= rulerule ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAbstractAgentAccess().getRULEKeyword_4_0());
            	    			
            	    // InternalRuntimeDsl.g:300:4: ( (lv_rule_6_0= rulerule ) )
            	    // InternalRuntimeDsl.g:301:5: (lv_rule_6_0= rulerule )
            	    {
            	    // InternalRuntimeDsl.g:301:5: (lv_rule_6_0= rulerule )
            	    // InternalRuntimeDsl.g:302:6: lv_rule_6_0= rulerule
            	    {

            	    						newCompositeNode(grammarAccess.getAbstractAgentAccess().getRuleRuleParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_rule_6_0=rulerule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAbstractAgentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rule",
            	    							lv_rule_6_0,
            	    							"org.polarsys.chess.iot.RuntimeDsl.rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAbstractAgentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAbstractAgent"


    // $ANTLR start "entryRulerule"
    // InternalRuntimeDsl.g:328:1: entryRulerule returns [EObject current=null] : iv_rulerule= rulerule EOF ;
    public final EObject entryRulerule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerule = null;


        try {
            // InternalRuntimeDsl.g:328:45: (iv_rulerule= rulerule EOF )
            // InternalRuntimeDsl.g:329:2: iv_rulerule= rulerule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerule=rulerule();

            state._fsp--;

             current =iv_rulerule; 
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
    // $ANTLR end "entryRulerule"


    // $ANTLR start "rulerule"
    // InternalRuntimeDsl.g:335:1: rulerule returns [EObject current=null] : (this_create_0= rulecreate | this_start_1= rulestart | this_stop_2= rulestop | this_restart_3= rulerestart | this_redeploy_4= ruleredeploy | this_log_5= rulelog | this_rerunAgent_6= rulererunAgent ) ;
    public final EObject rulerule() throws RecognitionException {
        EObject current = null;

        EObject this_create_0 = null;

        EObject this_start_1 = null;

        EObject this_stop_2 = null;

        EObject this_restart_3 = null;

        EObject this_redeploy_4 = null;

        EObject this_log_5 = null;

        EObject this_rerunAgent_6 = null;



        	enterRule();

        try {
            // InternalRuntimeDsl.g:341:2: ( (this_create_0= rulecreate | this_start_1= rulestart | this_stop_2= rulestop | this_restart_3= rulerestart | this_redeploy_4= ruleredeploy | this_log_5= rulelog | this_rerunAgent_6= rulererunAgent ) )
            // InternalRuntimeDsl.g:342:2: (this_create_0= rulecreate | this_start_1= rulestart | this_stop_2= rulestop | this_restart_3= rulerestart | this_redeploy_4= ruleredeploy | this_log_5= rulelog | this_rerunAgent_6= rulererunAgent )
            {
            // InternalRuntimeDsl.g:342:2: (this_create_0= rulecreate | this_start_1= rulestart | this_stop_2= rulestop | this_restart_3= rulerestart | this_redeploy_4= ruleredeploy | this_log_5= rulelog | this_rerunAgent_6= rulererunAgent )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 32:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRuntimeDsl.g:343:3: this_create_0= rulecreate
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_create_0=rulecreate();

                    state._fsp--;


                    			current = this_create_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuntimeDsl.g:352:3: this_start_1= rulestart
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getStartParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_start_1=rulestart();

                    state._fsp--;


                    			current = this_start_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRuntimeDsl.g:361:3: this_stop_2= rulestop
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getStopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_stop_2=rulestop();

                    state._fsp--;


                    			current = this_stop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRuntimeDsl.g:370:3: this_restart_3= rulerestart
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getRestartParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_restart_3=rulerestart();

                    state._fsp--;


                    			current = this_restart_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRuntimeDsl.g:379:3: this_redeploy_4= ruleredeploy
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getRedeployParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_redeploy_4=ruleredeploy();

                    state._fsp--;


                    			current = this_redeploy_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRuntimeDsl.g:388:3: this_log_5= rulelog
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getLogParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_log_5=rulelog();

                    state._fsp--;


                    			current = this_log_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRuntimeDsl.g:397:3: this_rerunAgent_6= rulererunAgent
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getRerunAgentParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_rerunAgent_6=rulererunAgent();

                    state._fsp--;


                    			current = this_rerunAgent_6;
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
    // $ANTLR end "rulerule"


    // $ANTLR start "entryRulecreate"
    // InternalRuntimeDsl.g:409:1: entryRulecreate returns [EObject current=null] : iv_rulecreate= rulecreate EOF ;
    public final EObject entryRulecreate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecreate = null;


        try {
            // InternalRuntimeDsl.g:409:47: (iv_rulecreate= rulecreate EOF )
            // InternalRuntimeDsl.g:410:2: iv_rulecreate= rulecreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecreate=rulecreate();

            state._fsp--;

             current =iv_rulecreate; 
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
    // $ANTLR end "entryRulecreate"


    // $ANTLR start "rulecreate"
    // InternalRuntimeDsl.g:416:1: rulecreate returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) ;
    public final EObject rulecreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_name_2_0=null;
        Token otherlv_3=null;
        Token lv_machine_name_4_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:422:2: ( (otherlv_0= 'create' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) )
            // InternalRuntimeDsl.g:423:2: (otherlv_0= 'create' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            {
            // InternalRuntimeDsl.g:423:2: (otherlv_0= 'create' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            // InternalRuntimeDsl.g:424:3: otherlv_0= 'create' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRuntimeDsl.g:432:3: ( (lv_service_name_2_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:433:4: (lv_service_name_2_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:433:4: (lv_service_name_2_0= RULE_STRING )
            // InternalRuntimeDsl.g:434:5: lv_service_name_2_0= RULE_STRING
            {
            lv_service_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_service_name_2_0, grammarAccess.getCreateAccess().getService_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service_name",
            						lv_service_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getOnKeyword_3());
            		
            // InternalRuntimeDsl.g:454:3: ( (lv_machine_name_4_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:455:4: (lv_machine_name_4_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:455:4: (lv_machine_name_4_0= RULE_STRING )
            // InternalRuntimeDsl.g:456:5: lv_machine_name_4_0= RULE_STRING
            {
            lv_machine_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_machine_name_4_0, grammarAccess.getCreateAccess().getMachine_nameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"machine_name",
            						lv_machine_name_4_0,
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
    // $ANTLR end "rulecreate"


    // $ANTLR start "entryRulestart"
    // InternalRuntimeDsl.g:476:1: entryRulestart returns [EObject current=null] : iv_rulestart= rulestart EOF ;
    public final EObject entryRulestart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestart = null;


        try {
            // InternalRuntimeDsl.g:476:46: (iv_rulestart= rulestart EOF )
            // InternalRuntimeDsl.g:477:2: iv_rulestart= rulestart EOF
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
    // InternalRuntimeDsl.g:483:1: rulestart returns [EObject current=null] : (otherlv_0= 'start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) ;
    public final EObject rulestart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_name_2_0=null;
        Token otherlv_3=null;
        Token lv_machine_name_4_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:489:2: ( (otherlv_0= 'start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) )
            // InternalRuntimeDsl.g:490:2: (otherlv_0= 'start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            {
            // InternalRuntimeDsl.g:490:2: (otherlv_0= 'start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            // InternalRuntimeDsl.g:491:3: otherlv_0= 'start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStartAccess().getStartKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStartAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRuntimeDsl.g:499:3: ( (lv_service_name_2_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:500:4: (lv_service_name_2_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:500:4: (lv_service_name_2_0= RULE_STRING )
            // InternalRuntimeDsl.g:501:5: lv_service_name_2_0= RULE_STRING
            {
            lv_service_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_service_name_2_0, grammarAccess.getStartAccess().getService_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service_name",
            						lv_service_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getStartAccess().getOnKeyword_3());
            		
            // InternalRuntimeDsl.g:521:3: ( (lv_machine_name_4_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:522:4: (lv_machine_name_4_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:522:4: (lv_machine_name_4_0= RULE_STRING )
            // InternalRuntimeDsl.g:523:5: lv_machine_name_4_0= RULE_STRING
            {
            lv_machine_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_machine_name_4_0, grammarAccess.getStartAccess().getMachine_nameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"machine_name",
            						lv_machine_name_4_0,
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
    // $ANTLR end "rulestart"


    // $ANTLR start "entryRulestop"
    // InternalRuntimeDsl.g:543:1: entryRulestop returns [EObject current=null] : iv_rulestop= rulestop EOF ;
    public final EObject entryRulestop() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestop = null;


        try {
            // InternalRuntimeDsl.g:543:45: (iv_rulestop= rulestop EOF )
            // InternalRuntimeDsl.g:544:2: iv_rulestop= rulestop EOF
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
    // InternalRuntimeDsl.g:550:1: rulestop returns [EObject current=null] : (otherlv_0= 'stop' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) ;
    public final EObject rulestop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_name_2_0=null;
        Token otherlv_3=null;
        Token lv_machine_name_4_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:556:2: ( (otherlv_0= 'stop' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) )
            // InternalRuntimeDsl.g:557:2: (otherlv_0= 'stop' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            {
            // InternalRuntimeDsl.g:557:2: (otherlv_0= 'stop' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            // InternalRuntimeDsl.g:558:3: otherlv_0= 'stop' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStopAccess().getStopKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRuntimeDsl.g:566:3: ( (lv_service_name_2_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:567:4: (lv_service_name_2_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:567:4: (lv_service_name_2_0= RULE_STRING )
            // InternalRuntimeDsl.g:568:5: lv_service_name_2_0= RULE_STRING
            {
            lv_service_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_service_name_2_0, grammarAccess.getStopAccess().getService_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service_name",
            						lv_service_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getStopAccess().getOnKeyword_3());
            		
            // InternalRuntimeDsl.g:588:3: ( (lv_machine_name_4_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:589:4: (lv_machine_name_4_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:589:4: (lv_machine_name_4_0= RULE_STRING )
            // InternalRuntimeDsl.g:590:5: lv_machine_name_4_0= RULE_STRING
            {
            lv_machine_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_machine_name_4_0, grammarAccess.getStopAccess().getMachine_nameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"machine_name",
            						lv_machine_name_4_0,
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
    // $ANTLR end "rulestop"


    // $ANTLR start "entryRulerestart"
    // InternalRuntimeDsl.g:610:1: entryRulerestart returns [EObject current=null] : iv_rulerestart= rulerestart EOF ;
    public final EObject entryRulerestart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerestart = null;


        try {
            // InternalRuntimeDsl.g:610:48: (iv_rulerestart= rulerestart EOF )
            // InternalRuntimeDsl.g:611:2: iv_rulerestart= rulerestart EOF
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
    // InternalRuntimeDsl.g:617:1: rulerestart returns [EObject current=null] : (otherlv_0= 're-start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) ;
    public final EObject rulerestart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_name_2_0=null;
        Token otherlv_3=null;
        Token lv_machine_name_4_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:623:2: ( (otherlv_0= 're-start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) ) )
            // InternalRuntimeDsl.g:624:2: (otherlv_0= 're-start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            {
            // InternalRuntimeDsl.g:624:2: (otherlv_0= 're-start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) ) )
            // InternalRuntimeDsl.g:625:3: otherlv_0= 're-start' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_name_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRestartAccess().getReStartKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRestartAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRuntimeDsl.g:633:3: ( (lv_service_name_2_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:634:4: (lv_service_name_2_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:634:4: (lv_service_name_2_0= RULE_STRING )
            // InternalRuntimeDsl.g:635:5: lv_service_name_2_0= RULE_STRING
            {
            lv_service_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_service_name_2_0, grammarAccess.getRestartAccess().getService_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service_name",
            						lv_service_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRestartAccess().getOnKeyword_3());
            		
            // InternalRuntimeDsl.g:655:3: ( (lv_machine_name_4_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:656:4: (lv_machine_name_4_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:656:4: (lv_machine_name_4_0= RULE_STRING )
            // InternalRuntimeDsl.g:657:5: lv_machine_name_4_0= RULE_STRING
            {
            lv_machine_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_machine_name_4_0, grammarAccess.getRestartAccess().getMachine_nameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"machine_name",
            						lv_machine_name_4_0,
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
    // $ANTLR end "rulerestart"


    // $ANTLR start "entryRuleredeploy"
    // InternalRuntimeDsl.g:677:1: entryRuleredeploy returns [EObject current=null] : iv_ruleredeploy= ruleredeploy EOF ;
    public final EObject entryRuleredeploy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleredeploy = null;


        try {
            // InternalRuntimeDsl.g:677:49: (iv_ruleredeploy= ruleredeploy EOF )
            // InternalRuntimeDsl.g:678:2: iv_ruleredeploy= ruleredeploy EOF
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
    // InternalRuntimeDsl.g:684:1: ruleredeploy returns [EObject current=null] : (otherlv_0= 're-deploy' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_address_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleredeploy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_name_2_0=null;
        Token otherlv_3=null;
        Token lv_machine_address_4_0=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:690:2: ( (otherlv_0= 're-deploy' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_address_4_0= RULE_STRING ) ) ) )
            // InternalRuntimeDsl.g:691:2: (otherlv_0= 're-deploy' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_address_4_0= RULE_STRING ) ) )
            {
            // InternalRuntimeDsl.g:691:2: (otherlv_0= 're-deploy' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_address_4_0= RULE_STRING ) ) )
            // InternalRuntimeDsl.g:692:3: otherlv_0= 're-deploy' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'on:' ( (lv_machine_address_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRedeployAccess().getReDeployKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRedeployAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRuntimeDsl.g:700:3: ( (lv_service_name_2_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:701:4: (lv_service_name_2_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:701:4: (lv_service_name_2_0= RULE_STRING )
            // InternalRuntimeDsl.g:702:5: lv_service_name_2_0= RULE_STRING
            {
            lv_service_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_service_name_2_0, grammarAccess.getRedeployAccess().getService_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedeployRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service_name",
            						lv_service_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRedeployAccess().getOnKeyword_3());
            		
            // InternalRuntimeDsl.g:722:3: ( (lv_machine_address_4_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:723:4: (lv_machine_address_4_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:723:4: (lv_machine_address_4_0= RULE_STRING )
            // InternalRuntimeDsl.g:724:5: lv_machine_address_4_0= RULE_STRING
            {
            lv_machine_address_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_machine_address_4_0, grammarAccess.getRedeployAccess().getMachine_addressSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedeployRule());
            					}
            					setWithLastConsumed(
            						current,
            						"machine_address",
            						lv_machine_address_4_0,
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
    // $ANTLR end "ruleredeploy"


    // $ANTLR start "entryRulelog"
    // InternalRuntimeDsl.g:744:1: entryRulelog returns [EObject current=null] : iv_rulelog= rulelog EOF ;
    public final EObject entryRulelog() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelog = null;


        try {
            // InternalRuntimeDsl.g:744:44: (iv_rulelog= rulelog EOF )
            // InternalRuntimeDsl.g:745:2: iv_rulelog= rulelog EOF
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
    // InternalRuntimeDsl.g:751:1: rulelog returns [EObject current=null] : (otherlv_0= 'log' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'log_type:' ( (lv_log_type_4_0= ruleLogType ) ) otherlv_5= 'filename:' ( (lv_filename_6_0= RULE_STRING ) ) otherlv_7= 'location:' ( (lv_location_8_0= RULE_STRING ) ) otherlv_9= 'on:' ( (lv_machine_name_10_0= RULE_STRING ) ) ) ;
    public final EObject rulelog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_filename_6_0=null;
        Token otherlv_7=null;
        Token lv_location_8_0=null;
        Token otherlv_9=null;
        Token lv_machine_name_10_0=null;
        Enumerator lv_log_type_4_0 = null;



        	enterRule();

        try {
            // InternalRuntimeDsl.g:757:2: ( (otherlv_0= 'log' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'log_type:' ( (lv_log_type_4_0= ruleLogType ) ) otherlv_5= 'filename:' ( (lv_filename_6_0= RULE_STRING ) ) otherlv_7= 'location:' ( (lv_location_8_0= RULE_STRING ) ) otherlv_9= 'on:' ( (lv_machine_name_10_0= RULE_STRING ) ) ) )
            // InternalRuntimeDsl.g:758:2: (otherlv_0= 'log' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'log_type:' ( (lv_log_type_4_0= ruleLogType ) ) otherlv_5= 'filename:' ( (lv_filename_6_0= RULE_STRING ) ) otherlv_7= 'location:' ( (lv_location_8_0= RULE_STRING ) ) otherlv_9= 'on:' ( (lv_machine_name_10_0= RULE_STRING ) ) )
            {
            // InternalRuntimeDsl.g:758:2: (otherlv_0= 'log' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'log_type:' ( (lv_log_type_4_0= ruleLogType ) ) otherlv_5= 'filename:' ( (lv_filename_6_0= RULE_STRING ) ) otherlv_7= 'location:' ( (lv_location_8_0= RULE_STRING ) ) otherlv_9= 'on:' ( (lv_machine_name_10_0= RULE_STRING ) ) )
            // InternalRuntimeDsl.g:759:3: otherlv_0= 'log' otherlv_1= '=>' ( (lv_service_name_2_0= RULE_STRING ) ) otherlv_3= 'log_type:' ( (lv_log_type_4_0= ruleLogType ) ) otherlv_5= 'filename:' ( (lv_filename_6_0= RULE_STRING ) ) otherlv_7= 'location:' ( (lv_location_8_0= RULE_STRING ) ) otherlv_9= 'on:' ( (lv_machine_name_10_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getLogAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRuntimeDsl.g:767:3: ( (lv_service_name_2_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:768:4: (lv_service_name_2_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:768:4: (lv_service_name_2_0= RULE_STRING )
            // InternalRuntimeDsl.g:769:5: lv_service_name_2_0= RULE_STRING
            {
            lv_service_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_service_name_2_0, grammarAccess.getLogAccess().getService_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service_name",
            						lv_service_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getLogAccess().getLog_typeKeyword_3());
            		
            // InternalRuntimeDsl.g:789:3: ( (lv_log_type_4_0= ruleLogType ) )
            // InternalRuntimeDsl.g:790:4: (lv_log_type_4_0= ruleLogType )
            {
            // InternalRuntimeDsl.g:790:4: (lv_log_type_4_0= ruleLogType )
            // InternalRuntimeDsl.g:791:5: lv_log_type_4_0= ruleLogType
            {

            					newCompositeNode(grammarAccess.getLogAccess().getLog_typeLogTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_log_type_4_0=ruleLogType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogRule());
            					}
            					set(
            						current,
            						"log_type",
            						lv_log_type_4_0,
            						"org.polarsys.chess.iot.RuntimeDsl.LogType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getLogAccess().getFilenameKeyword_5());
            		
            // InternalRuntimeDsl.g:812:3: ( (lv_filename_6_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:813:4: (lv_filename_6_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:813:4: (lv_filename_6_0= RULE_STRING )
            // InternalRuntimeDsl.g:814:5: lv_filename_6_0= RULE_STRING
            {
            lv_filename_6_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_filename_6_0, grammarAccess.getLogAccess().getFilenameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filename",
            						lv_filename_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getLogAccess().getLocationKeyword_7());
            		
            // InternalRuntimeDsl.g:834:3: ( (lv_location_8_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:835:4: (lv_location_8_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:835:4: (lv_location_8_0= RULE_STRING )
            // InternalRuntimeDsl.g:836:5: lv_location_8_0= RULE_STRING
            {
            lv_location_8_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_location_8_0, grammarAccess.getLogAccess().getLocationSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getLogAccess().getOnKeyword_9());
            		
            // InternalRuntimeDsl.g:856:3: ( (lv_machine_name_10_0= RULE_STRING ) )
            // InternalRuntimeDsl.g:857:4: (lv_machine_name_10_0= RULE_STRING )
            {
            // InternalRuntimeDsl.g:857:4: (lv_machine_name_10_0= RULE_STRING )
            // InternalRuntimeDsl.g:858:5: lv_machine_name_10_0= RULE_STRING
            {
            lv_machine_name_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_machine_name_10_0, grammarAccess.getLogAccess().getMachine_nameSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"machine_name",
            						lv_machine_name_10_0,
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
    // $ANTLR end "rulelog"


    // $ANTLR start "entryRulererunAgent"
    // InternalRuntimeDsl.g:878:1: entryRulererunAgent returns [EObject current=null] : iv_rulererunAgent= rulererunAgent EOF ;
    public final EObject entryRulererunAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulererunAgent = null;


        try {
            // InternalRuntimeDsl.g:878:51: (iv_rulererunAgent= rulererunAgent EOF )
            // InternalRuntimeDsl.g:879:2: iv_rulererunAgent= rulererunAgent EOF
            {
             newCompositeNode(grammarAccess.getRerunAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulererunAgent=rulererunAgent();

            state._fsp--;

             current =iv_rulererunAgent; 
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
    // $ANTLR end "entryRulererunAgent"


    // $ANTLR start "rulererunAgent"
    // InternalRuntimeDsl.g:885:1: rulererunAgent returns [EObject current=null] : (otherlv_0= 'rerun-agent' otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulererunAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:891:2: ( (otherlv_0= 'rerun-agent' otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRuntimeDsl.g:892:2: (otherlv_0= 'rerun-agent' otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRuntimeDsl.g:892:2: (otherlv_0= 'rerun-agent' otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalRuntimeDsl.g:893:3: otherlv_0= 'rerun-agent' otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRerunAgentAccess().getRerunAgentKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRerunAgentAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalRuntimeDsl.g:901:3: ( (otherlv_2= RULE_ID ) )
            // InternalRuntimeDsl.g:902:4: (otherlv_2= RULE_ID )
            {
            // InternalRuntimeDsl.g:902:4: (otherlv_2= RULE_ID )
            // InternalRuntimeDsl.g:903:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRerunAgentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRerunAgentAccess().getAgentAbstractAgentCrossReference_2_0());
            				

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
    // $ANTLR end "rulererunAgent"


    // $ANTLR start "ruleLogType"
    // InternalRuntimeDsl.g:918:1: ruleLogType returns [Enumerator current=null] : ( (enumLiteral_0= 'machine' ) | (enumLiteral_1= 'service' ) ) ;
    public final Enumerator ruleLogType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:924:2: ( ( (enumLiteral_0= 'machine' ) | (enumLiteral_1= 'service' ) ) )
            // InternalRuntimeDsl.g:925:2: ( (enumLiteral_0= 'machine' ) | (enumLiteral_1= 'service' ) )
            {
            // InternalRuntimeDsl.g:925:2: ( (enumLiteral_0= 'machine' ) | (enumLiteral_1= 'service' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            else if ( (LA8_0==34) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRuntimeDsl.g:926:3: (enumLiteral_0= 'machine' )
                    {
                    // InternalRuntimeDsl.g:926:3: (enumLiteral_0= 'machine' )
                    // InternalRuntimeDsl.g:927:4: enumLiteral_0= 'machine'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getLogTypeAccess().getMACHINEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogTypeAccess().getMACHINEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRuntimeDsl.g:934:3: (enumLiteral_1= 'service' )
                    {
                    // InternalRuntimeDsl.g:934:3: (enumLiteral_1= 'service' )
                    // InternalRuntimeDsl.g:935:4: enumLiteral_1= 'service'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getLogTypeAccess().getSERVICEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogTypeAccess().getSERVICEEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleLogType"


    // $ANTLR start "ruleBOOLEAN"
    // InternalRuntimeDsl.g:945:1: ruleBOOLEAN returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRuntimeDsl.g:951:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalRuntimeDsl.g:952:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalRuntimeDsl.g:952:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRuntimeDsl.g:953:3: (enumLiteral_0= 'true' )
                    {
                    // InternalRuntimeDsl.g:953:3: (enumLiteral_0= 'true' )
                    // InternalRuntimeDsl.g:954:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRuntimeDsl.g:961:3: (enumLiteral_1= 'false' )
                    {
                    // InternalRuntimeDsl.g:961:3: (enumLiteral_1= 'false' )
                    // InternalRuntimeDsl.g:962:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000011F200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});

}