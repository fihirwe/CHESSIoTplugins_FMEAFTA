/*
 * generated by Xtext 2.12.0
 */
package org.polarsys.chess.iot.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.polarsys.chess.iot.runtimeDsl.AbstractAgent;
import org.polarsys.chess.iot.runtimeDsl.Deployment;
import org.polarsys.chess.iot.runtimeDsl.Expression;
import org.polarsys.chess.iot.runtimeDsl.RuntimeDslPackage;
import org.polarsys.chess.iot.runtimeDsl.create;
import org.polarsys.chess.iot.runtimeDsl.log;
import org.polarsys.chess.iot.runtimeDsl.redeploy;
import org.polarsys.chess.iot.runtimeDsl.rerunAgent;
import org.polarsys.chess.iot.runtimeDsl.restart;
import org.polarsys.chess.iot.runtimeDsl.start;
import org.polarsys.chess.iot.runtimeDsl.stop;
import org.polarsys.chess.iot.services.RuntimeDslGrammarAccess;

@SuppressWarnings("all")
public class RuntimeDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RuntimeDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RuntimeDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RuntimeDslPackage.ABSTRACT_AGENT:
				sequence_AbstractAgent(context, (AbstractAgent) semanticObject); 
				return; 
			case RuntimeDslPackage.DEPLOYMENT:
				sequence_Deployment(context, (Deployment) semanticObject); 
				return; 
			case RuntimeDslPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case RuntimeDslPackage.CREATE:
				sequence_create(context, (create) semanticObject); 
				return; 
			case RuntimeDslPackage.LOG:
				sequence_log(context, (log) semanticObject); 
				return; 
			case RuntimeDslPackage.REDEPLOY:
				sequence_redeploy(context, (redeploy) semanticObject); 
				return; 
			case RuntimeDslPackage.RERUN_AGENT:
				sequence_rerunAgent(context, (rerunAgent) semanticObject); 
				return; 
			case RuntimeDslPackage.RESTART:
				sequence_restart(context, (restart) semanticObject); 
				return; 
			case RuntimeDslPackage.START:
				sequence_start(context, (start) semanticObject); 
				return; 
			case RuntimeDslPackage.STOP:
				sequence_stop(context, (stop) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractAgent returns AbstractAgent
	 *
	 * Constraint:
	 *     (name=ID superType=[AbstractAgent|ID]? rule+=rule*)
	 */
	protected void sequence_AbstractAgent(ISerializationContext context, AbstractAgent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Deployment returns Deployment
	 *
	 * Constraint:
	 *     plan+=Expression+
	 */
	protected void sequence_Deployment(ISerializationContext context, Deployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (name=ID setup=BOOLEAN? plan=[Expression|ID]? description=STRING agent+=AbstractAgent*)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     rule returns create
	 *     create returns create
	 *
	 * Constraint:
	 *     (service_name=STRING machine_name=STRING)
	 */
	protected void sequence_create(ISerializationContext context, create semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.CREATE__SERVICE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.CREATE__SERVICE_NAME));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.CREATE__MACHINE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.CREATE__MACHINE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCreateAccess().getService_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getService_name());
		feeder.accept(grammarAccess.getCreateAccess().getMachine_nameSTRINGTerminalRuleCall_4_0(), semanticObject.getMachine_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     rule returns log
	 *     log returns log
	 *
	 * Constraint:
	 *     (service_name=STRING log_type=LogType filename=STRING location=STRING machine_name=STRING)
	 */
	protected void sequence_log(ISerializationContext context, log semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.LOG__SERVICE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.LOG__SERVICE_NAME));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.LOG__LOG_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.LOG__LOG_TYPE));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.LOG__FILENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.LOG__FILENAME));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.LOG__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.LOG__LOCATION));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.LOG__MACHINE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.LOG__MACHINE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogAccess().getService_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getService_name());
		feeder.accept(grammarAccess.getLogAccess().getLog_typeLogTypeEnumRuleCall_4_0(), semanticObject.getLog_type());
		feeder.accept(grammarAccess.getLogAccess().getFilenameSTRINGTerminalRuleCall_6_0(), semanticObject.getFilename());
		feeder.accept(grammarAccess.getLogAccess().getLocationSTRINGTerminalRuleCall_8_0(), semanticObject.getLocation());
		feeder.accept(grammarAccess.getLogAccess().getMachine_nameSTRINGTerminalRuleCall_10_0(), semanticObject.getMachine_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     rule returns redeploy
	 *     redeploy returns redeploy
	 *
	 * Constraint:
	 *     (service_name=STRING machine_address=STRING)
	 */
	protected void sequence_redeploy(ISerializationContext context, redeploy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.REDEPLOY__SERVICE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.REDEPLOY__SERVICE_NAME));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.REDEPLOY__MACHINE_ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.REDEPLOY__MACHINE_ADDRESS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRedeployAccess().getService_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getService_name());
		feeder.accept(grammarAccess.getRedeployAccess().getMachine_addressSTRINGTerminalRuleCall_4_0(), semanticObject.getMachine_address());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     rule returns rerunAgent
	 *     rerunAgent returns rerunAgent
	 *
	 * Constraint:
	 *     agent=[AbstractAgent|ID]
	 */
	protected void sequence_rerunAgent(ISerializationContext context, rerunAgent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.RERUN_AGENT__AGENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.RERUN_AGENT__AGENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRerunAgentAccess().getAgentAbstractAgentIDTerminalRuleCall_2_0_1(), semanticObject.eGet(RuntimeDslPackage.Literals.RERUN_AGENT__AGENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     rule returns restart
	 *     restart returns restart
	 *
	 * Constraint:
	 *     (service_name=STRING machine_name=STRING)
	 */
	protected void sequence_restart(ISerializationContext context, restart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.RESTART__SERVICE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.RESTART__SERVICE_NAME));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.RESTART__MACHINE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.RESTART__MACHINE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRestartAccess().getService_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getService_name());
		feeder.accept(grammarAccess.getRestartAccess().getMachine_nameSTRINGTerminalRuleCall_4_0(), semanticObject.getMachine_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     rule returns start
	 *     start returns start
	 *
	 * Constraint:
	 *     (service_name=STRING machine_name=STRING)
	 */
	protected void sequence_start(ISerializationContext context, start semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.START__SERVICE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.START__SERVICE_NAME));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.START__MACHINE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.START__MACHINE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartAccess().getService_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getService_name());
		feeder.accept(grammarAccess.getStartAccess().getMachine_nameSTRINGTerminalRuleCall_4_0(), semanticObject.getMachine_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     rule returns stop
	 *     stop returns stop
	 *
	 * Constraint:
	 *     (service_name=STRING machine_name=STRING)
	 */
	protected void sequence_stop(ISerializationContext context, stop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.STOP__SERVICE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.STOP__SERVICE_NAME));
			if (transientValues.isValueTransient(semanticObject, RuntimeDslPackage.Literals.STOP__MACHINE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuntimeDslPackage.Literals.STOP__MACHINE_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStopAccess().getService_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getService_name());
		feeder.accept(grammarAccess.getStopAccess().getMachine_nameSTRINGTerminalRuleCall_4_0(), semanticObject.getMachine_name());
		feeder.finish();
	}
	
	
}
