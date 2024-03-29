/*
 * generated by Xtext 2.12.0
 */
package org.polarsys.chess.iot.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RuntimeDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DeploymentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.Deployment");
		private final Assignment cPlanAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPlanExpressionParserRuleCall_0 = (RuleCall)cPlanAssignment.eContents().get(0);
		
		//Deployment:
		//	plan+=Expression*;
		@Override public ParserRule getRule() { return rule; }
		
		//plan+=Expression*
		public Assignment getPlanAssignment() { return cPlanAssignment; }
		
		//Expression
		public RuleCall getPlanExpressionParserRuleCall_0() { return cPlanExpressionParserRuleCall_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.Expression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDepPlanKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSetupKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSetupAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSetupBOOLEANEnumRuleCall_3_1_0 = (RuleCall)cSetupAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cReUsePlanKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPlanAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cPlanExpressionCrossReference_4_1_0 = (CrossReference)cPlanAssignment_4_1.eContents().get(0);
		private final RuleCall cPlanExpressionIDTerminalRuleCall_4_1_0_1 = (RuleCall)cPlanExpressionCrossReference_4_1_0.eContents().get(1);
		private final Keyword cDescriptionKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cDescriptionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_6_0 = (RuleCall)cDescriptionAssignment_6.eContents().get(0);
		private final Assignment cAgentAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAgentAbstractAgentParserRuleCall_7_0 = (RuleCall)cAgentAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Expression:
		//	'DepPlan:' name=ID '{' ('setup:' setup=BOOLEAN)? ('re-use-plan:' plan=[Expression])?
		//	'Description:' description=STRING
		//	agent+=AbstractAgent*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'DepPlan:' name=ID '{' ('setup:' setup=BOOLEAN)? ('re-use-plan:' plan=[Expression])? 'Description:' description=STRING
		//agent+=AbstractAgent* '}'
		public Group getGroup() { return cGroup; }
		
		//'DepPlan:'
		public Keyword getDepPlanKeyword_0() { return cDepPlanKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('setup:' setup=BOOLEAN)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'setup:'
		public Keyword getSetupKeyword_3_0() { return cSetupKeyword_3_0; }
		
		//setup=BOOLEAN
		public Assignment getSetupAssignment_3_1() { return cSetupAssignment_3_1; }
		
		//BOOLEAN
		public RuleCall getSetupBOOLEANEnumRuleCall_3_1_0() { return cSetupBOOLEANEnumRuleCall_3_1_0; }
		
		//('re-use-plan:' plan=[Expression])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'re-use-plan:'
		public Keyword getReUsePlanKeyword_4_0() { return cReUsePlanKeyword_4_0; }
		
		//plan=[Expression]
		public Assignment getPlanAssignment_4_1() { return cPlanAssignment_4_1; }
		
		//[Expression]
		public CrossReference getPlanExpressionCrossReference_4_1_0() { return cPlanExpressionCrossReference_4_1_0; }
		
		//ID
		public RuleCall getPlanExpressionIDTerminalRuleCall_4_1_0_1() { return cPlanExpressionIDTerminalRuleCall_4_1_0_1; }
		
		//'Description:'
		public Keyword getDescriptionKeyword_5() { return cDescriptionKeyword_5; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_6() { return cDescriptionAssignment_6; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_6_0() { return cDescriptionSTRINGTerminalRuleCall_6_0; }
		
		//agent+=AbstractAgent*
		public Assignment getAgentAssignment_7() { return cAgentAssignment_7; }
		
		//AbstractAgent
		public RuleCall getAgentAbstractAgentParserRuleCall_7_0() { return cAgentAbstractAgentParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class AbstractAgentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.AbstractAgent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAgentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeAbstractAgentCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeAbstractAgentIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeAbstractAgentCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRULEKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRuleAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cRuleRuleParserRuleCall_4_1_0 = (RuleCall)cRuleAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//AbstractAgent:
		//	'agent:' name=ID ('extends' superType=[AbstractAgent])? '{' ('RULE:' rule+=rule)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'agent:' name=ID ('extends' superType=[AbstractAgent])? '{' ('RULE:' rule+=rule)* '}'
		public Group getGroup() { return cGroup; }
		
		//'agent:'
		public Keyword getAgentKeyword_0() { return cAgentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[AbstractAgent])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[AbstractAgent]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[AbstractAgent]
		public CrossReference getSuperTypeAbstractAgentCrossReference_2_1_0() { return cSuperTypeAbstractAgentCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeAbstractAgentIDTerminalRuleCall_2_1_0_1() { return cSuperTypeAbstractAgentIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('RULE:' rule+=rule)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'RULE:'
		public Keyword getRULEKeyword_4_0() { return cRULEKeyword_4_0; }
		
		//rule+=rule
		public Assignment getRuleAssignment_4_1() { return cRuleAssignment_4_1; }
		
		//rule
		public RuleCall getRuleRuleParserRuleCall_4_1_0() { return cRuleRuleParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.rule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCreateParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStartParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cStopParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRestartParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cRedeployParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cLogParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cRerunAgentParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//rule:
		//	create | start | stop | restart | redeploy | log | rerunAgent;
		@Override public ParserRule getRule() { return rule; }
		
		//create | start | stop | restart | redeploy | log | rerunAgent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//create
		public RuleCall getCreateParserRuleCall_0() { return cCreateParserRuleCall_0; }
		
		//start
		public RuleCall getStartParserRuleCall_1() { return cStartParserRuleCall_1; }
		
		//stop
		public RuleCall getStopParserRuleCall_2() { return cStopParserRuleCall_2; }
		
		//restart
		public RuleCall getRestartParserRuleCall_3() { return cRestartParserRuleCall_3; }
		
		//redeploy
		public RuleCall getRedeployParserRuleCall_4() { return cRedeployParserRuleCall_4; }
		
		//log
		public RuleCall getLogParserRuleCall_5() { return cLogParserRuleCall_5; }
		
		//rerunAgent
		public RuleCall getRerunAgentParserRuleCall_6() { return cRerunAgentParserRuleCall_6; }
	}
	public class CreateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.create");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCreateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cService_nameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cService_nameSTRINGTerminalRuleCall_2_0 = (RuleCall)cService_nameAssignment_2.eContents().get(0);
		private final Keyword cOnKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMachine_nameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMachine_nameSTRINGTerminalRuleCall_4_0 = (RuleCall)cMachine_nameAssignment_4.eContents().get(0);
		
		//create:
		//	'create' '=>' service_name=STRING
		//	'on:' machine_name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'create' '=>' service_name=STRING 'on:' machine_name=STRING
		public Group getGroup() { return cGroup; }
		
		//'create'
		public Keyword getCreateKeyword_0() { return cCreateKeyword_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//service_name=STRING
		public Assignment getService_nameAssignment_2() { return cService_nameAssignment_2; }
		
		//STRING
		public RuleCall getService_nameSTRINGTerminalRuleCall_2_0() { return cService_nameSTRINGTerminalRuleCall_2_0; }
		
		//'on:'
		public Keyword getOnKeyword_3() { return cOnKeyword_3; }
		
		//machine_name=STRING
		public Assignment getMachine_nameAssignment_4() { return cMachine_nameAssignment_4; }
		
		//STRING
		public RuleCall getMachine_nameSTRINGTerminalRuleCall_4_0() { return cMachine_nameSTRINGTerminalRuleCall_4_0; }
	}
	public class StartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.start");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cService_nameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cService_nameSTRINGTerminalRuleCall_2_0 = (RuleCall)cService_nameAssignment_2.eContents().get(0);
		private final Keyword cOnKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMachine_nameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMachine_nameSTRINGTerminalRuleCall_4_0 = (RuleCall)cMachine_nameAssignment_4.eContents().get(0);
		
		////drafted based on scope	
		//start:
		//	'start' '=>' service_name=STRING
		//	'on:' machine_name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'start' '=>' service_name=STRING 'on:' machine_name=STRING
		public Group getGroup() { return cGroup; }
		
		//'start'
		public Keyword getStartKeyword_0() { return cStartKeyword_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//service_name=STRING
		public Assignment getService_nameAssignment_2() { return cService_nameAssignment_2; }
		
		//STRING
		public RuleCall getService_nameSTRINGTerminalRuleCall_2_0() { return cService_nameSTRINGTerminalRuleCall_2_0; }
		
		//'on:'
		public Keyword getOnKeyword_3() { return cOnKeyword_3; }
		
		//machine_name=STRING
		public Assignment getMachine_nameAssignment_4() { return cMachine_nameAssignment_4; }
		
		//STRING
		public RuleCall getMachine_nameSTRINGTerminalRuleCall_4_0() { return cMachine_nameSTRINGTerminalRuleCall_4_0; }
	}
	public class StopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.stop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStopKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cService_nameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cService_nameSTRINGTerminalRuleCall_2_0 = (RuleCall)cService_nameAssignment_2.eContents().get(0);
		private final Keyword cOnKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMachine_nameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMachine_nameSTRINGTerminalRuleCall_4_0 = (RuleCall)cMachine_nameAssignment_4.eContents().get(0);
		
		////drafted based on scope	;
		//stop:
		//	'stop' '=>' service_name=STRING
		//	'on:' machine_name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'stop' '=>' service_name=STRING 'on:' machine_name=STRING
		public Group getGroup() { return cGroup; }
		
		//'stop'
		public Keyword getStopKeyword_0() { return cStopKeyword_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//service_name=STRING
		public Assignment getService_nameAssignment_2() { return cService_nameAssignment_2; }
		
		//STRING
		public RuleCall getService_nameSTRINGTerminalRuleCall_2_0() { return cService_nameSTRINGTerminalRuleCall_2_0; }
		
		//'on:'
		public Keyword getOnKeyword_3() { return cOnKeyword_3; }
		
		//machine_name=STRING
		public Assignment getMachine_nameAssignment_4() { return cMachine_nameAssignment_4; }
		
		//STRING
		public RuleCall getMachine_nameSTRINGTerminalRuleCall_4_0() { return cMachine_nameSTRINGTerminalRuleCall_4_0; }
	}
	public class RestartElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.restart");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReStartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cService_nameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cService_nameSTRINGTerminalRuleCall_2_0 = (RuleCall)cService_nameAssignment_2.eContents().get(0);
		private final Keyword cOnKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMachine_nameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMachine_nameSTRINGTerminalRuleCall_4_0 = (RuleCall)cMachine_nameAssignment_4.eContents().get(0);
		
		////drafted based on scope	;
		//restart:
		//	're-start' '=>' service_name=STRING
		//	'on:' machine_name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'re-start' '=>' service_name=STRING 'on:' machine_name=STRING
		public Group getGroup() { return cGroup; }
		
		//'re-start'
		public Keyword getReStartKeyword_0() { return cReStartKeyword_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//service_name=STRING
		public Assignment getService_nameAssignment_2() { return cService_nameAssignment_2; }
		
		//STRING
		public RuleCall getService_nameSTRINGTerminalRuleCall_2_0() { return cService_nameSTRINGTerminalRuleCall_2_0; }
		
		//'on:'
		public Keyword getOnKeyword_3() { return cOnKeyword_3; }
		
		//machine_name=STRING
		public Assignment getMachine_nameAssignment_4() { return cMachine_nameAssignment_4; }
		
		//STRING
		public RuleCall getMachine_nameSTRINGTerminalRuleCall_4_0() { return cMachine_nameSTRINGTerminalRuleCall_4_0; }
	}
	public class RedeployElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.redeploy");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReDeployKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cService_nameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cService_nameSTRINGTerminalRuleCall_2_0 = (RuleCall)cService_nameAssignment_2.eContents().get(0);
		private final Keyword cOnKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMachine_addressAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMachine_addressSTRINGTerminalRuleCall_4_0 = (RuleCall)cMachine_addressAssignment_4.eContents().get(0);
		
		////drafted based on scope	;
		//redeploy:
		//	're-deploy' '=>' service_name=STRING 'on:' machine_address=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'re-deploy' '=>' service_name=STRING 'on:' machine_address=STRING
		public Group getGroup() { return cGroup; }
		
		//'re-deploy'
		public Keyword getReDeployKeyword_0() { return cReDeployKeyword_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//service_name=STRING
		public Assignment getService_nameAssignment_2() { return cService_nameAssignment_2; }
		
		//STRING
		public RuleCall getService_nameSTRINGTerminalRuleCall_2_0() { return cService_nameSTRINGTerminalRuleCall_2_0; }
		
		//'on:'
		public Keyword getOnKeyword_3() { return cOnKeyword_3; }
		
		//machine_address=STRING
		public Assignment getMachine_addressAssignment_4() { return cMachine_addressAssignment_4; }
		
		//STRING
		public RuleCall getMachine_addressSTRINGTerminalRuleCall_4_0() { return cMachine_addressSTRINGTerminalRuleCall_4_0; }
	}
	public class LogElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.log");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLogKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cService_nameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cService_nameSTRINGTerminalRuleCall_2_0 = (RuleCall)cService_nameAssignment_2.eContents().get(0);
		private final Keyword cLog_typeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLog_typeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLog_typeLogTypeEnumRuleCall_4_0 = (RuleCall)cLog_typeAssignment_4.eContents().get(0);
		private final Keyword cFilenameKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFilenameAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFilenameSTRINGTerminalRuleCall_6_0 = (RuleCall)cFilenameAssignment_6.eContents().get(0);
		private final Keyword cLocationKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cLocationAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLocationSTRINGTerminalRuleCall_8_0 = (RuleCall)cLocationAssignment_8.eContents().get(0);
		private final Keyword cOnKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cMachine_nameAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cMachine_nameSTRINGTerminalRuleCall_10_0 = (RuleCall)cMachine_nameAssignment_10.eContents().get(0);
		
		////drafted based on scope
		//log:
		//	'log' '=>' service_name=STRING
		//	'log_type:' log_type=LogType
		//	'filename:' filename=STRING
		//	'location:' location=STRING
		//	'on:' machine_name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'log' '=>' service_name=STRING 'log_type:' log_type=LogType 'filename:' filename=STRING 'location:' location=STRING
		//'on:' machine_name=STRING
		public Group getGroup() { return cGroup; }
		
		//'log'
		public Keyword getLogKeyword_0() { return cLogKeyword_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//service_name=STRING
		public Assignment getService_nameAssignment_2() { return cService_nameAssignment_2; }
		
		//STRING
		public RuleCall getService_nameSTRINGTerminalRuleCall_2_0() { return cService_nameSTRINGTerminalRuleCall_2_0; }
		
		//'log_type:'
		public Keyword getLog_typeKeyword_3() { return cLog_typeKeyword_3; }
		
		//log_type=LogType
		public Assignment getLog_typeAssignment_4() { return cLog_typeAssignment_4; }
		
		//LogType
		public RuleCall getLog_typeLogTypeEnumRuleCall_4_0() { return cLog_typeLogTypeEnumRuleCall_4_0; }
		
		//'filename:'
		public Keyword getFilenameKeyword_5() { return cFilenameKeyword_5; }
		
		//filename=STRING
		public Assignment getFilenameAssignment_6() { return cFilenameAssignment_6; }
		
		//STRING
		public RuleCall getFilenameSTRINGTerminalRuleCall_6_0() { return cFilenameSTRINGTerminalRuleCall_6_0; }
		
		//'location:'
		public Keyword getLocationKeyword_7() { return cLocationKeyword_7; }
		
		//location=STRING
		public Assignment getLocationAssignment_8() { return cLocationAssignment_8; }
		
		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_8_0() { return cLocationSTRINGTerminalRuleCall_8_0; }
		
		//'on:'
		public Keyword getOnKeyword_9() { return cOnKeyword_9; }
		
		//machine_name=STRING
		public Assignment getMachine_nameAssignment_10() { return cMachine_nameAssignment_10; }
		
		//STRING
		public RuleCall getMachine_nameSTRINGTerminalRuleCall_10_0() { return cMachine_nameSTRINGTerminalRuleCall_10_0; }
	}
	public class RerunAgentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.rerunAgent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRerunAgentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAgentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cAgentAbstractAgentCrossReference_2_0 = (CrossReference)cAgentAssignment_2.eContents().get(0);
		private final RuleCall cAgentAbstractAgentIDTerminalRuleCall_2_0_1 = (RuleCall)cAgentAbstractAgentCrossReference_2_0.eContents().get(1);
		
		////drafted based on scope	;
		//rerunAgent:
		//	'rerun-agent' '=>' agent=[AbstractAgent];
		@Override public ParserRule getRule() { return rule; }
		
		//'rerun-agent' '=>' agent=[AbstractAgent]
		public Group getGroup() { return cGroup; }
		
		//'rerun-agent'
		public Keyword getRerunAgentKeyword_0() { return cRerunAgentKeyword_0; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_1() { return cEqualsSignGreaterThanSignKeyword_1; }
		
		//agent=[AbstractAgent]
		public Assignment getAgentAssignment_2() { return cAgentAssignment_2; }
		
		//[AbstractAgent]
		public CrossReference getAgentAbstractAgentCrossReference_2_0() { return cAgentAbstractAgentCrossReference_2_0; }
		
		//ID
		public RuleCall getAgentAbstractAgentIDTerminalRuleCall_2_0_1() { return cAgentAbstractAgentIDTerminalRuleCall_2_0_1; }
	}
	
	public class LogTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.LogType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMACHINEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMACHINEMachineKeyword_0_0 = (Keyword)cMACHINEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSERVICEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSERVICEServiceKeyword_1_0 = (Keyword)cSERVICEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum LogType:
		//	MACHINE='machine' | SERVICE='service';
		public EnumRule getRule() { return rule; }
		
		//MACHINE='machine' | SERVICE='service'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MACHINE='machine'
		public EnumLiteralDeclaration getMACHINEEnumLiteralDeclaration_0() { return cMACHINEEnumLiteralDeclaration_0; }
		
		//'machine'
		public Keyword getMACHINEMachineKeyword_0_0() { return cMACHINEMachineKeyword_0_0; }
		
		//SERVICE='service'
		public EnumLiteralDeclaration getSERVICEEnumLiteralDeclaration_1() { return cSERVICEEnumLiteralDeclaration_1; }
		
		//'service'
		public Keyword getSERVICEServiceKeyword_1_0() { return cSERVICEServiceKeyword_1_0; }
	}
	public class BOOLEANElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.BOOLEAN");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTRUEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTRUETrueKeyword_0_0 = (Keyword)cTRUEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFALSEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFALSEFalseKeyword_1_0 = (Keyword)cFALSEEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum BOOLEAN:
		//	TRUE='true' | FALSE='false';
		public EnumRule getRule() { return rule; }
		
		//TRUE='true' | FALSE='false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TRUE='true'
		public EnumLiteralDeclaration getTRUEEnumLiteralDeclaration_0() { return cTRUEEnumLiteralDeclaration_0; }
		
		//'true'
		public Keyword getTRUETrueKeyword_0_0() { return cTRUETrueKeyword_0_0; }
		
		//FALSE='false'
		public EnumLiteralDeclaration getFALSEEnumLiteralDeclaration_1() { return cFALSEEnumLiteralDeclaration_1; }
		
		//'false'
		public Keyword getFALSEFalseKeyword_1_0() { return cFALSEFalseKeyword_1_0; }
	}
	
	private final DeploymentElements pDeployment;
	private final ExpressionElements pExpression;
	private final AbstractAgentElements pAbstractAgent;
	private final RuleElements pRule;
	private final CreateElements pCreate;
	private final StartElements pStart;
	private final StopElements pStop;
	private final RestartElements pRestart;
	private final RedeployElements pRedeploy;
	private final LogElements pLog;
	private final RerunAgentElements pRerunAgent;
	private final LogTypeElements eLogType;
	private final TerminalRule tNUMBER;
	private final BOOLEANElements eBOOLEAN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RuntimeDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDeployment = new DeploymentElements();
		this.pExpression = new ExpressionElements();
		this.pAbstractAgent = new AbstractAgentElements();
		this.pRule = new RuleElements();
		this.pCreate = new CreateElements();
		this.pStart = new StartElements();
		this.pStop = new StopElements();
		this.pRestart = new RestartElements();
		this.pRedeploy = new RedeployElements();
		this.pLog = new LogElements();
		this.pRerunAgent = new RerunAgentElements();
		this.eLogType = new LogTypeElements();
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.polarsys.chess.iot.RuntimeDsl.NUMBER");
		this.eBOOLEAN = new BOOLEANElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.polarsys.chess.iot.RuntimeDsl".equals(grammar.getName())) {
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

	
	//Deployment:
	//	plan+=Expression*;
	public DeploymentElements getDeploymentAccess() {
		return pDeployment;
	}
	
	public ParserRule getDeploymentRule() {
		return getDeploymentAccess().getRule();
	}
	
	//Expression:
	//	'DepPlan:' name=ID '{' ('setup:' setup=BOOLEAN)? ('re-use-plan:' plan=[Expression])?
	//	'Description:' description=STRING
	//	agent+=AbstractAgent*
	//	'}';
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//AbstractAgent:
	//	'agent:' name=ID ('extends' superType=[AbstractAgent])? '{' ('RULE:' rule+=rule)*
	//	'}';
	public AbstractAgentElements getAbstractAgentAccess() {
		return pAbstractAgent;
	}
	
	public ParserRule getAbstractAgentRule() {
		return getAbstractAgentAccess().getRule();
	}
	
	//rule:
	//	create | start | stop | restart | redeploy | log | rerunAgent;
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//create:
	//	'create' '=>' service_name=STRING
	//	'on:' machine_name=STRING;
	public CreateElements getCreateAccess() {
		return pCreate;
	}
	
	public ParserRule getCreateRule() {
		return getCreateAccess().getRule();
	}
	
	////drafted based on scope	
	//start:
	//	'start' '=>' service_name=STRING
	//	'on:' machine_name=STRING;
	public StartElements getStartAccess() {
		return pStart;
	}
	
	public ParserRule getStartRule() {
		return getStartAccess().getRule();
	}
	
	////drafted based on scope	;
	//stop:
	//	'stop' '=>' service_name=STRING
	//	'on:' machine_name=STRING;
	public StopElements getStopAccess() {
		return pStop;
	}
	
	public ParserRule getStopRule() {
		return getStopAccess().getRule();
	}
	
	////drafted based on scope	;
	//restart:
	//	're-start' '=>' service_name=STRING
	//	'on:' machine_name=STRING;
	public RestartElements getRestartAccess() {
		return pRestart;
	}
	
	public ParserRule getRestartRule() {
		return getRestartAccess().getRule();
	}
	
	////drafted based on scope	;
	//redeploy:
	//	're-deploy' '=>' service_name=STRING 'on:' machine_address=STRING;
	public RedeployElements getRedeployAccess() {
		return pRedeploy;
	}
	
	public ParserRule getRedeployRule() {
		return getRedeployAccess().getRule();
	}
	
	////drafted based on scope
	//log:
	//	'log' '=>' service_name=STRING
	//	'log_type:' log_type=LogType
	//	'filename:' filename=STRING
	//	'location:' location=STRING
	//	'on:' machine_name=STRING;
	public LogElements getLogAccess() {
		return pLog;
	}
	
	public ParserRule getLogRule() {
		return getLogAccess().getRule();
	}
	
	////drafted based on scope	;
	//rerunAgent:
	//	'rerun-agent' '=>' agent=[AbstractAgent];
	public RerunAgentElements getRerunAgentAccess() {
		return pRerunAgent;
	}
	
	public ParserRule getRerunAgentRule() {
		return getRerunAgentAccess().getRule();
	}
	
	//enum LogType:
	//	MACHINE='machine' | SERVICE='service';
	public LogTypeElements getLogTypeAccess() {
		return eLogType;
	}
	
	public EnumRule getLogTypeRule() {
		return getLogTypeAccess().getRule();
	}
	
	//terminal NUMBER returns ecore::EBigDecimal:
	//	'0'..'9'* ('.' '0'..'9'+)?;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	}
	
	//enum BOOLEAN:
	//	TRUE='true' | FALSE='false';
	public BOOLEANElements getBOOLEANAccess() {
		return eBOOLEAN;
	}
	
	public EnumRule getBOOLEANRule() {
		return getBOOLEANAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
