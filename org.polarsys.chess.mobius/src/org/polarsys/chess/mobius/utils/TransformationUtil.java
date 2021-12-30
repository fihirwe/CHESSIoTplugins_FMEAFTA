/*********************************************************************
* Copyright (c) 2019 Intecs Solutions SpA
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors: 
*   Intecs Solutions - Initial API and implementation
*   
**********************************************************************/

package org.polarsys.chess.mobius.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Duration;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.DurationInterval;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.Vertex;
import org.polarsys.chess.chessmlprofile.Core.CHGaResourcePlatform;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.ErrorModelBehavior;
import org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis.SANAnalysis;
import org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.Attack;
import org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.AttackScenario;
import org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.ErrorModel;
import org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.InternalFault;
import org.polarsys.chess.chessmlprofile.Dependability.ThreatsPropagation.Vulnerability;
import org.polarsys.chess.mobius.model.SAN.Node;

/**
 * The Class TransformationUtil.
 */
public class TransformationUtil {
	
	/** The Constant OFFSET. */
	private static final int OFFSET = 15;
	
	/** The mobius components. */
	private static MobiusComponents mobiusComponents;
	
	/** The attacks. */
	private static List<Message> attacks;
	
	/** The vulnerable components. */
	private static Map<Classifier, List<Message>> vulnerableComponents;
	
	/** The scenarios. */
	private static List<Interaction> scenarios;
	
	/** The short global vars. */
	//used to store global variables in Mobius
	private List<String> shortGlobalVars = new ArrayList<>();
	
	/** The start place. */
	//used for sequence diagrams (sequence of messages/fragments/delays)
	private static String startPlace;
	
	/** The start X. */
	private static Integer startX;
	
	/** The start Y. */
	private static Integer startY;
	
	/** The ok X. */
	//used to store the "normal" state of an atomic block error model
	private static Integer okX;
	
	/** The ok Y. */
	private static Integer okY;
	
	/** The predicate list. */
	//use for "else" case in alt fragments
	private static List<String> predicateList = new ArrayList<>();
	
	/** The blockqn. */
	//several stereotypes qualified names
	private static String BLOCKQN = "SysML::Blocks::Block";
	
	/** The errormodelbehaviorqn. */
	private static String ERRORMODELBEHAVIORQN = "CHESS::Dependability::DependableComponent::ErrorModelBehavior";
	
	/** The normalstateqn. */
	private static String NORMALSTATEQN = "CHESS::Dependability::ThreatsPropagation::NormalState";
	
	/** The errorstateqn. */
	private static String ERRORSTATEQN = "CHESS::Dependability::ThreatsPropagation::ErrorState";
	
	/** The compromisedstateqn. */
	private static String COMPROMISEDSTATEQN = "CHESS::Dependability::ThreatsPropagation::DegradedState";
	
	/** The internalfaultqn. */
	private static String INTERNALFAULTQN = "CHESS::Dependability::ThreatsPropagation::InternalFault";
	
	/** The attackqn. */
	private static String ATTACKQN = "CHESS::Dependability::ThreatsPropagation::Attack";
	
	/** The attackscenarioqn. */
	private static String ATTACKSCENARIOQN = "CHESS::Dependability::ThreatsPropagation::AttackScenario";
	
	/** The cybersecurityanalysisqn. */
	private static String CYBERSECURITYANALYSISQN = "CHESS::Dependability::StateBased::StateBasedAnalysis::CyberSecurityAnalysis";

	/**
	 * Gets the mobius componenents.
	 *
	 * @param platform the platform
	 * @return the mobius componenents
	 */
	public static MobiusComponents getMobiusComponenents(CHGaResourcePlatform platform) {
		
		Classifier root = platform.getBase_InstanceSpecification().getClassifiers().get(0);
		MobiusComponents mobiusComponents = new MobiusComponents();
		if (platform.getResources().size() > 0){
			for (Resource res : platform.getResources()) {
				if(res.getBase_InstanceSpecification() != null){
					getMobiusComponents(res, mobiusComponents);
				}
			}
			mobiusComponents.getComposedBlocks().add(root);
//			System.out.println("ROOT block: " + root.getName() + " is COMPOSED");
		}else{
//			System.out.println("ROOT block: " + root.getName() + " is ATOMIC");
			mobiusComponents.getAtomicBlocks().add(root);
		}
		//save mobiusComponents for Acceleo
		TransformationUtil.mobiusComponents = mobiusComponents;
		return mobiusComponents;
	}

	/**
	 * Gets the mobius components.
	 *
	 * @param res the res
	 * @param mobiusComponents the mobius components
	 * @return the mobius components
	 */
	private static MobiusComponents getMobiusComponents(Resource res, MobiusComponents mobiusComponents) {
		
		//instances of connector have no classifier
		if (res.getBase_InstanceSpecification().getClassifiers().isEmpty())
			return null;
		
		Classifier block = res.getBase_InstanceSpecification().getClassifiers().get(0);
		//check slots
		EList<Slot> slots = res.getBase_InstanceSpecification().getSlots();
		if(slots.size() > 0){
			boolean composed = false;
			for (Slot slot : slots) {
				if(!(slot.getDefiningFeature() instanceof Port)){
					//at least one slots which is not a Port
					composed = true;
				}
			}
			if(composed){
				//at least one slots which is not a Port
//				System.out.println("Block " + block.getName() + " is COMPOSED");
				
				//TODO: currently if a component has errorModel attached than it is considered terminal, we should also support internal components with error model
				if (getErrorModelStateMachine(block) != null){
					mobiusComponents.getAtomicBlocks().add(block);
				}else{
				mobiusComponents.getComposedBlocks().add(block);
				}
			}else{
				//no slots which are not Ports
//				System.out.println("Block " + block.getName() + " is ATOMIC");
				if (getErrorModelStateMachine(block) != null)
					mobiusComponents.getAtomicBlocks().add(block);
			}
			
		}else{
			//if the instanceSpecification has no slots, its block is Atomic
//			System.out.println("Block " + block.getName() + " is ATOMIC");
			if (getErrorModelStateMachine(block) != null)
				mobiusComponents.getAtomicBlocks().add(block);
		}
		return null;
	}

	/**
	 * Gets the atomic blocks.
	 *
	 * @return the atomic blocks
	 */
	public List<Classifier> getAtomicBlocks(){
		return TransformationUtil.mobiusComponents.getAtomicBlocks();
	}

	/**
	 * Gets the composed blocks.
	 *
	 * @return the composed blocks
	 */
	public List<Classifier> getComposedBlocks(){
		return TransformationUtil.mobiusComponents.getComposedBlocks();
	}
	
	/**
	 * Gets the model attack scenarios.
	 *
	 * @param model the model
	 * @return the model attack scenarios
	 */
	public static List<Interaction> getModelAttackScenarios(Model model){
		List<Interaction> result = new ArrayList<>();
		for(Element elem : model.allOwnedElements()) {
			if(elem instanceof Interaction && elem.getAppliedStereotype(ATTACKSCENARIOQN) != null){
				Interaction scenario = (Interaction) elem;
				//an Interaction containing at least one attack is an attack scenario
				boolean test = false;
				for(Message msg : scenario.getMessages()){
					if(msg.getAppliedStereotype(ATTACKQN) != null){
						test = true;
					}
				}
				if(test){
					result.add(scenario);
				}
			}
		}
		//save attacks for Acceleo
		TransformationUtil.scenarios = result;
		
		return result;
	}
	
	/**
	 * Gets the attack scenarios.
	 *
	 * @return the attack scenarios
	 */
	public List<Interaction> getAttackScenarios(){
		return TransformationUtil.scenarios;
	}
	
	/**
	 * Gets the model attacks.
	 *
	 * @param model the model
	 * @return the model attacks
	 */
	public static List<Message> getModelAttacks(Model model){
		List<Message> result = new ArrayList<>();
		//attacks are Messages of an Interaction stereotyped as "Attack"
		for(Element elem : model.allOwnedElements()) {
			if(elem instanceof Interaction){
				Interaction scenario = (Interaction) elem;
				for(Message msg : getAttacksForScenario(scenario)){
					result.add(msg);
				}
			}
		}
		//save attacks for Acceleo
		TransformationUtil.attacks = result;
		
		return result;
	}
	
	/**
	 * Gets the attacks.
	 *
	 * @return the attacks
	 */
	public List<Message> getAttacks(){
		return TransformationUtil.attacks;
	}
	
	/**
	 * Gets the all block attacks.
	 *
	 * @param block the block
	 * @return the all block attacks
	 */
	public List<String> getAllBlockAttacks(Classifier block){
		List<String> result = new ArrayList<>();
		//get all the attacks
		for(Message msg : TransformationUtil.attacks){
			Stereotype stereo = msg.getAppliedStereotype(ATTACKQN);
			Attack attack = (Attack) msg.getStereotypeApplication(stereo);
			//find those who exploit a vulnerability of the block
			if(attack.getVulnerability() != null){
				if(block.getOwnedElements().contains(attack.getVulnerability().getBase_Port())){
					result.add(msg.getName());
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the block attacks.
	 *
	 * @param block the block
	 * @param scenarioName the scenario name
	 * @return the block attacks
	 */
	public List<String> getBlockAttacks(Classifier block, String scenarioName){
		List<String> result = new ArrayList<>();
		//get all the attacks
		for(Message msg : TransformationUtil.attacks){
			//get only those of the given scenario
			if(msg.getInteraction().getName().equals(scenarioName)){
				Stereotype stereo = msg.getAppliedStereotype(ATTACKQN);
				Attack attack = (Attack) msg.getStereotypeApplication(stereo);
				//get those who exploit a vulnerability of the given block
				if(attack.getVulnerability() != null){
					if(block.getOwnedElements().contains(attack.getVulnerability().getBase_Port())){
						result.add(msg.getName());
					}
				}
			}
		}
		return result;
	}
	
	
	/**
	 * Gets the block attack scenarios.
	 *
	 * @param block the block
	 * @return the block attack scenarios
	 */
	public List<String> getBlockAttackScenarios(Classifier block){
		List<String> result = new ArrayList<>();
		//get all the interactions
		for(Interaction scenario : TransformationUtil.scenarios){
			//check if the block is represented by any lifeline of the current scenario
			EList<Lifeline> lifelines = scenario.getLifelines();
			for (Lifeline lifeline : lifelines) {
				if (lifeline.getRepresents().getType().equals(block)){
					result.add(scenario.getName());
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the vulnerable components.
	 *
	 * @param model the model
	 * @return the vulnerable components
	 */
	//TODO review this method to reflect the new return type;
	public static Map<Classifier, List<Message>> getVulnerableComponents(Model model) {
		Map<Classifier, List<Message>> result = new HashMap<>();
		for(Interaction scenario :TransformationUtil.scenarios){
			EList<Lifeline> lifelines = scenario.getLifelines();
			for(Message msg : getAttacksForScenario(scenario)){
				//we need to get this message's receiver, i.e the component vulnerable to the attack
				for (Lifeline lifeline : lifelines) {
					if (lifeline.getCoveredBys().contains(msg.getReceiveEvent())) {
						if (lifeline.getRepresents().getType() instanceof Classifier){
							Classifier comp = (Classifier) lifeline.getRepresents().getType();
							List<Message> msgList = result.get(comp);
							if(msgList == null){
								msgList = new ArrayList<>();
							}
							msgList.add(msg);
							result.put(comp, msgList);
						}
					}
				}
			}
		}
		
		//save VulnerableComponents for Acceleo
		TransformationUtil.vulnerableComponents = result;
		
		return result;
	}
	
	/**
	 * Gets the attacks for scenario.
	 *
	 * @param scenario the scenario
	 * @return the attacks for scenario
	 */
	private static List<Message> getAttacksForScenario(Interaction scenario) {
		List<Message> result = new ArrayList<>();
		// get all the attacks in the given scenario (at any depth level)
		for (Element elem : scenario.allOwnedElements()) {
			if(elem.getAppliedStereotype(ATTACKQN) != null){
				result.add((Message) elem);
			}
		}
		return result;
	}

	/**
	 * Gets the vulnerable components.
	 *
	 * @return the vulnerable components
	 */
	public Set<Classifier> getVulnerableComponents(){
		return TransformationUtil.vulnerableComponents.keySet();
	}
	

	/**
	 * Gets the block from QN.
	 *
	 * @param blocks the blocks
	 * @param qualifiedName the qualified name
	 * @return the block from QN
	 */
	public Classifier getBlockFromQN(List<Classifier> blocks, String qualifiedName){	
		Classifier result = null;
		for(Classifier cl : blocks){
			if(cl.getQualifiedName().equals(qualifiedName)){
				result = cl;
			}
		}
		return result;
	}
	
	/**
	 * Gets the node from QN.
	 *
	 * @param nodes the nodes
	 * @param qualifiedName the qualified name
	 * @return the node from QN
	 */
	public Node getNodeFromQN(List<Node> nodes, String qualifiedName){	
		Node result = null;
		for(Node cl : nodes){
			if(cl.getName().equals(qualifiedName)){
				result = cl;
			}
		}
		return result;
	}
	
	/**
	 * Gets the normal state.
	 *
	 * @param block the block
	 * @return the normal state
	 */
	public State getNormalState(Classifier block) {
		State result = null;
		for (State state : getPlaces(block)) {
			if(state.getAppliedStereotype(NORMALSTATEQN) != null){
				result = state;
			}
		}
		return result;
	}
	
	/**
	 * Gets the places.
	 *
	 * @param block the block
	 * @return the places
	 */
	public List<State> getPlaces(Classifier block){
		List<State> result = new ArrayList<>();
		StateMachine sm = getErrorModelStateMachine(block);
		if(sm != null){
			EList<Vertex> vertices = sm.getRegions().get(0).getSubvertices();
			for (Vertex vertex : vertices) {
				if(vertex instanceof State){
					if(vertex.getAppliedStereotype(NORMALSTATEQN) != null){
						result.add((State) vertex);
					}else if(vertex.getAppliedStereotype(ERRORSTATEQN) != null){
						result.add((State) vertex);
					}else if(vertex.getAppliedStereotype(COMPROMISEDSTATEQN) != null){
						result.add((State) vertex);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the activities.
	 *
	 * @param block the block
	 * @return the activities
	 */
	public List<Transition> getActivities(Classifier block){
		List<Transition> result = new ArrayList<>();
		StateMachine sm = getErrorModelStateMachine(block);
		if(sm != null){
			//TODO
			EList<Transition> transitions = sm.getRegions().get(0).getTransitions();
			for (Transition transition : transitions) {
				if(transition.getAppliedStereotype(INTERNALFAULTQN) != null){
					result.add(transition);
				}else if(transition.getAppliedStereotype(ATTACKQN) != null){
					result.add(transition);
				}
//				else if(transition.getAppliedStereotype(REPAIRQN) != null){
//					result.add(transition);
//				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the error model state machine.
	 *
	 * @param block the block
	 * @return the error model state machine
	 */
	private static StateMachine getErrorModelStateMachine(Classifier block){
		StateMachine sm =  null;
		//block should be stereotyped as ErrorModelBehavior
		Stereotype stereo = block.getAppliedStereotype(ERRORMODELBEHAVIORQN);
		ErrorModelBehavior behavior = (ErrorModelBehavior) block.getStereotypeApplication(stereo);
		//get the first ErrorModel (TODO: what to do with multiple ErrorModels?)
		if(behavior!= null && behavior.getErrorModel().size() > 0){
			ErrorModel errorModel = behavior.getErrorModel().get(0);
			sm = errorModel.getBase_StateMachine();
		}
		return sm;
	}
	
	/**
	 * Gets the rate.
	 *
	 * @param tr the tr
	 * @return the rate
	 */
	public String getRate(Transition tr){
		String rate = "";
		Stereotype stereo = tr.getAppliedStereotype(INTERNALFAULTQN);
		if(stereo != null){
			InternalFault intF = (InternalFault) tr.getStereotypeApplication(stereo);
			if (intF.getOccurrence() != null){
				rate = intF.getOccurrence();
			}
		}
		return rate;
	}
	
	/**
	 * Gets the subsystems.
	 *
	 * @param parent the parent
	 * @return the subsystems
	 */
	public List<Classifier> getSubsystems(Classifier parent){
		List<Classifier> result = new ArrayList<>();
		for(Element elem : parent.getOwnedElements()){
			if (elem instanceof Property && !(elem instanceof Port)){
				Property prop = (Property) elem;
				if(prop.getType() instanceof Classifier){
					Classifier cl = (Classifier) prop.getType();
					if(prop.getType().getAppliedStereotype(BLOCKQN) != null){
						result.add(cl);
					}	
				}
			}
		}
		return result;
	}
	
	/**
	 * Checks if is replicated.
	 *
	 * @param block the block
	 * @param parent the parent
	 * @return true, if is replicated
	 */
	public boolean isReplicated(Classifier block, Classifier parent){
		boolean result = false;
		for(Element elem : parent.getOwnedElements()){
			if (elem instanceof Property && !(elem instanceof Port)){
				Property prop = (Property) elem;
				if(prop.getType() instanceof Classifier){
					Classifier cl = (Classifier) prop.getType();
					if (cl.getQualifiedName().equals(block.getQualifiedName())){
						//if multiplicity's upper bound is greater than 1 or equal to -1(*)
//						System.out.println(prop.getName() + " [" + prop.getLower() + "..." + prop.getUpper() + "]");
						if(prop.getUpper() > 1 || prop.getUpper() == -1){
							result = true;
						}
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the replication.
	 *
	 * @param block the block
	 * @param parent the parent
	 * @return the replication
	 */
	//probably not needed
	public String getReplication(Classifier block, Classifier parent){
		String result = "";
		for(Element elem : parent.getOwnedElements()){
			if (elem instanceof Property && !(elem instanceof Port)){
				Property prop = (Property) elem;
				if(prop.getType() instanceof Classifier){
					Classifier cl = (Classifier) prop.getType();
					if (cl.getQualifiedName().equals(block.getQualifiedName())){
						//TODO: work in progress, at the moment we replicate only if multiplicity is a constant > 1
//						System.out.println(prop.getName() + " [" + prop.getLower() + "..." + prop.getUpper() + "]");
						if(prop.getLower() == prop.getUpper() && prop.getUpper() > 1){
							result = Integer.toString(prop.getUpper());
						}
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the empty string set.
	 *
	 * @return the empty string set
	 */
	public Set<String> getEmptyStringSet() {
		return new HashSet<String>();
	}
	
	/**
	 * Adds the to global vars.
	 *
	 * @param name the name
	 * @param globalvars the globalvars
	 */
	public void addToGlobalVars(String name, Set<String> globalvars){
		if(!name.startsWith("1.0")){
			globalvars.add(name);
		}
	}
	
	/**
	 * Gets the attack succ name.
	 *
	 * @param tr the tr
	 * @return the attack succ name
	 */
	//returns the names of the attack messages associated (through vulnerability) to transition
	public List<String> getAttackSuccName(Transition tr){
		List<String> result = new ArrayList<>();
		String name = "";
		Stereotype stereo = tr.getAppliedStereotype(ATTACKQN);
		Attack attack = (Attack) tr.getStereotypeApplication(stereo);
		Vulnerability vuln = attack.getVulnerability();
		if(vuln != null){
			for(Message msg : getModelAttacks(tr.getModel())){
				stereo = msg.getAppliedStereotype(ATTACKQN);
				Attack msgAttack = (Attack) msg.getStereotypeApplication(stereo);
				if(msgAttack.getVulnerability() != null && msgAttack.getVulnerability().equals(vuln)){
					name = msgAttack.getBase_Message().getName();
//					name += "_success";
					result.add(name);
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the scenario.
	 *
	 * @param model the model
	 * @param scenarioName the scenario name
	 * @return the scenario
	 */
	public Interaction getScenario(Model model, String scenarioName) {
		Interaction scenario = null;
		for (Interaction interaction : scenarios) {
			if(interaction.getName().equals(scenarioName)){
				scenario = interaction;
			}
		}
		return scenario;
	}
	
	/**
	 * Sets the ceiling 2.
	 *
	 * @param context the context
	 * @param self the self
	 * @param ceiling the ceiling
	 */
	@Operation(kind = Kind.OPERATION, contextual = true, withExecutionContext = true)
	public static void setCeiling2(IContext context,
			org.eclipse.uml2.uml.Class self, String ceiling) {
		
	}
	
	

/**
 * Gets the ordered attacks and fragments.
 *
 * @param scenario the scenario
 * @return the ordered attacks and fragments
 */
public List<NamedElement> getOrderedAttacksAndFragments(Interaction scenario) {
		
		//duration constraints List
		List<DurationConstraint> durConstrList = getDurConstrList(scenario);
		
		//fragments (message occurrence) List
		List<MessageOccurrenceSpecification> msgOccList = getMsgOccSpecs(scenario); 

		//general ordering list
		List<GeneralOrdering> genOrderList = new ArrayList<>(); 
		
		for (MessageOccurrenceSpecification msgOcc : msgOccList) {
			//general ordering inside message occurrence fragment
			for (GeneralOrdering order : msgOcc.getGeneralOrderings()) {
				genOrderList.add(order);
			}
		}
		//general order at interaction (scenario) level, if any
		for (GeneralOrdering order : scenario.getGeneralOrderings()) {
			genOrderList.add(order);
		}
		
		//order the messages (order based on GeneralOrdering)
		List<Message> orderedMsgList = new ArrayList<>();
		//TODO: we might need to review this code for unusual GeneralOrdering modeling
		boolean start = true;
		for (GeneralOrdering order : genOrderList) {
			Message beforeMsg, afterMsg;
			beforeMsg = ((MessageOccurrenceSpecification) order.getBefore()).getMessage();
			afterMsg = ((MessageOccurrenceSpecification) order.getAfter()).getMessage();
			if(start){
				orderedMsgList.add(beforeMsg);
				if(!beforeMsg.equals(afterMsg)){
					orderedMsgList.add(afterMsg);
				}
				start = false;
			}else{
				if(orderedMsgList.contains(beforeMsg) && !orderedMsgList.contains(afterMsg)){
					orderedMsgList.add(afterMsg);
				}
				if(orderedMsgList.contains(afterMsg) && !orderedMsgList.contains(beforeMsg)){
					orderedMsgList.add(0, beforeMsg);
				}
			}
		}
		
		//not using general ordering of messages is NOT recommended.
		//if not used, as a workaround, we simply get the messages
		//TODO if the user put some kind of alphanumeric ordering (0,1,2...) we could use it.
		if(orderedMsgList.isEmpty()){
			orderedMsgList.addAll(scenario.getMessages());
		}
		
		//the real ordered list of elements ;)
		List<NamedElement> orderedElemList = new ArrayList<>();
		
		//put messages (if owned by the interaction) or the CombinedFragment who owns it.
		for (Message message : orderedMsgList) {
			if(message.getAppliedStereotype(ATTACKQN) != null){
				//get message "owner" (interaction/combined fragment)
				if(message.getSendEvent() instanceof MessageOccurrenceSpecification){
					MessageOccurrenceSpecification msgOcc = (MessageOccurrenceSpecification) message.getSendEvent();
					if(msgOcc.getEnclosingInteraction() != null){
						//message is "owned" directly by the interaction -> simple attack
						orderedElemList.add(message);
					}else if (msgOcc.getEnclosingOperand() != null){
						//message is "owned" by an interaction operand, get its owner (CombinedFragment)
						InteractionOperand operand = msgOcc.getEnclosingOperand();
						CombinedFragment combfrag = (CombinedFragment) operand.getOwner();
						//add it to the elem list but only one (otherwise the "alt" fragment will do a mess)
						if(!orderedElemList.contains(combfrag)){
							orderedElemList.add(combfrag);
						}
					}
				}
			}
		}
		
		//finally set the delays in their right position...
		//delays can be put in between msg or fragments. 
		//the modeller should always set exactly one constrained element.
		for (DurationConstraint durConstr : durConstrList) {
			EList<Element> constrElems = durConstr.getConstrainedElements();
			if(constrElems.size() == 0){
				//TODO log an error/warning
			} else{
				//we'll consider the delay BEFORE the (first) constrained element
				Element constrElem = constrElems.get(0);
				if(orderedElemList.contains(constrElem)){
					int index = orderedElemList.indexOf(constrElem);
					orderedElemList.add(index, (NamedElement) durConstr);
				}
			}
		}
		
		return orderedElemList;
	}

	/**
	 * Gets the msg occ specs.
	 *
	 * @param scenario the scenario
	 * @return the msg occ specs
	 */
	private List<MessageOccurrenceSpecification> getMsgOccSpecs(Interaction scenario) {
		
		List<MessageOccurrenceSpecification> msgOccList = new ArrayList<>(); 

		EList<InteractionFragment> fragments = scenario.getFragments();

		for (InteractionFragment fragment : fragments) {
			//fragments (opt/loop)
			if(fragment instanceof CombinedFragment){
				CombinedFragment combFrag = (CombinedFragment) fragment;
				EList<InteractionOperand> operands = combFrag.getOperands();
				//inner fragments
				for (InteractionOperand intOp : operands) {
					for (InteractionFragment intOpFrag : intOp.getFragments()) {
						if(intOpFrag instanceof MessageOccurrenceSpecification){
							msgOccList.add((MessageOccurrenceSpecification) intOpFrag);
						}
					}
				}	
			}
			//fragments (message occurrence)
			if(fragment instanceof MessageOccurrenceSpecification){
				msgOccList.add((MessageOccurrenceSpecification) fragment);
			}
		}
		return msgOccList;
	}
	
	/**
	 * Gets the dur constr list.
	 *
	 * @param scenario the scenario
	 * @return the dur constr list
	 */
	private static List<DurationConstraint> getDurConstrList(Interaction scenario) {
		List<DurationConstraint> durConstrList = new ArrayList<>(); 
		
		EList<Constraint> rules = scenario.getOwnedRules();
		for (Constraint constraint : rules) {
			if(constraint instanceof DurationConstraint){
				durConstrList.add((DurationConstraint) constraint);
			}
		}
		return durConstrList;
	}
	
	/**
	 * Gets the combined fragment.
	 *
	 * @param message the message
	 * @return the combined fragment
	 */
	public static CombinedFragment getCombinedFragment(Message message){
		CombinedFragment result = null;
		if(message.getSendEvent() instanceof MessageOccurrenceSpecification){
			MessageOccurrenceSpecification msgOcc = (MessageOccurrenceSpecification) message.getSendEvent();
			if (msgOcc.getEnclosingOperand() != null){
				InteractionOperand operand = msgOcc.getEnclosingOperand();
				result = (CombinedFragment) operand.getOwner();
			}
		}
		return result;
	}
	
	/**
	 * Gets the delay.
	 *
	 * @param constraint the constraint
	 * @return the delay
	 */
	public static String getDelay(DurationConstraint constraint){
		String result = "delay";
		DurationConstraint duration = (DurationConstraint) constraint;
		DurationInterval durInt = (DurationInterval) duration.getSpecification();
		// min/max duration interval
		LiteralString litStrMin, litStrMax;
//		LiteralInteger litIntMin, litIntMax;
		Duration durMin = (Duration) durInt.getMin();
		Duration durMax = (Duration) durInt.getMax();
		if(durMin.getExpr() instanceof LiteralString && durMax.getExpr() instanceof LiteralString){
			litStrMin = (LiteralString) durMin.getExpr();
			litStrMax = (LiteralString) durMin.getExpr();
			if(litStrMin.getValue().equals(litStrMax.getValue())){
				result = litStrMin.getValue();
			}
		}
//		else if(durMin.getExpr() instanceof LiteralInteger && durMax.getExpr() instanceof LiteralInteger){
//			litIntMin = (LiteralInteger) durMin.getExpr();
//			litIntMax = (LiteralInteger) durMin.getExpr();
//			if(litIntMin.getValue() == (litIntMax.getValue())){
//				result = Integer.toString(litIntMin.getValue());
//			}
//		}
		return result;
	}
	
	/**
	 * Gets the attack scenario frequency.
	 *
	 * @param model the model
	 * @param scenarioName the scenario name
	 * @return the attack scenario frequency
	 */
	public String getAttackScenarioFrequency(Model model, String scenarioName) {
		String result = "";
		for (Interaction scenario : scenarios) {
			if(scenario.getName().equals(scenarioName)){
				Stereotype stereo = scenario.getAppliedStereotype(ATTACKSCENARIOQN);
				AttackScenario attackScenario = (AttackScenario) scenario.getStereotypeApplication(stereo);
				String freq = attackScenario.getFrequency();
				if(freq != null && !freq.isEmpty()){
					result = freq;
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the attack scenario prob success.
	 *
	 * @param model the model
	 * @param scenarioName the scenario name
	 * @return the attack scenario prob success
	 */
	public String getAttackScenarioProbSuccess(Model model, String scenarioName) {
		String result = "";
		for (Interaction scenario : scenarios) {
			if(scenario.getName().equals(scenarioName)){
				Stereotype stereo = scenario.getAppliedStereotype(ATTACKSCENARIOQN);
				AttackScenario attackScenario = (AttackScenario) scenario.getStereotypeApplication(stereo);
				String prob = attackScenario.getProbSuccess();
				if(prob != null && !prob.isEmpty()){
					result = prob;
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the attack scenario prob unsuccess.
	 *
	 * @param model the model
	 * @param probSuccess the prob success
	 * @return the attack scenario prob unsuccess
	 */
	public String getAttackScenarioProbUnsuccess(Model model, String probSuccess) {
		String result = "";
		double prob = Double.parseDouble(probSuccess);
		double prob2 = 1.0 - prob;
		result = Double.toString(prob2);
		return result;
	}
	
	/**
	 * Gets the predicate.
	 *
	 * @param operand the operand
	 * @return the predicate
	 */
	public String getPredicate(InteractionOperand operand) {
		String result = operand.getName();
		ValueSpecification valSpec = operand.getGuard().getSpecification();
		if(valSpec instanceof LiteralString){
			LiteralString litStr = (LiteralString) valSpec;
			if(litStr.getValue().equalsIgnoreCase("else") && predicateList.size() > 0 ){
				result = "1.0 - (";
				boolean first = true;
				for (String predicate : predicateList) {
					if(first){
						result += predicate;
						first = false;
					}else{
						result += " + " + predicate;
					}
				}
				result += ')';
			}else{
				result = litStr.getValue();
				//add it to current predicate list:
				predicateList.add(result);
			}
		}		
		return result;
	}
	
	/**
	 * Reset predicate list.
	 */
	//to be called for each alt/opt fragment after computing predicates and optional else case
	public void resetPredicateList(){
		predicateList.clear();
	}
	
	/**
	 * Gets the alt offset.
	 *
	 * @param index the index
	 * @param size the size
	 * @return the alt offset
	 */
	//this assumes that index starts at 0
	public Integer getAltOffset(Integer index, Integer size){
		Integer result = (index +1 - size/2)*OFFSET; //size is even
		if(size % 2 != 0){ //size is odd
			result = (index - size/2)*OFFSET;
		}
//		System.out.println(result);
		return result;
	}
	
	/**
	 * Gets the operand attack.
	 *
	 * @param operand the operand
	 * @return the operand attack
	 */
	public Message getOperandAttack(InteractionOperand operand){
		Message result = null;
		for (Message message : attacks) {
			if(message.getSendEvent() instanceof MessageOccurrenceSpecification){
				MessageOccurrenceSpecification msgOcc = (MessageOccurrenceSpecification) message.getSendEvent();
				if (msgOcc.getEnclosingOperand() != null && msgOcc.getEnclosingOperand().equals(operand)){
					result = message;
				}
			}
		}
		return result;
	}
	
	/**
	 * Gets the loop counter.
	 *
	 * @param operand the operand
	 * @return the loop counter
	 */
	public String getLoopCounter(InteractionOperand operand) {
		String result = "counter";
		//maxint can be literal string or int
		ValueSpecification valSpec = operand.getGuard().getMaxint();
		if(valSpec instanceof LiteralString){
			LiteralString litStr = (LiteralString) valSpec;
			result = litStr.getValue();
		}else if(valSpec instanceof LiteralInteger){
			LiteralInteger litInt = (LiteralInteger) valSpec;
			result = Integer.toString(litInt.getValue());
		}
		//minint is expected to be = 1
		//moreover: the loop counter should be a short variable in Mobius
		if(!shortGlobalVars.contains(result)){
			shortGlobalVars.add(result);
		}
		
		return result;
	}

	/**
	 * Gets the start place.
	 *
	 * @return the start place
	 */
	public static String getStartPlace() {
		return startPlace;
	}

	/**
	 * Sets the start place.
	 *
	 * @param startPlace the new start place
	 */
	public static void setStartPlace(String startPlace) {
		TransformationUtil.startPlace = startPlace;
	}

	/**
	 * Gets the start X.
	 *
	 * @return the start X
	 */
	public static Integer getStartX() {
		return startX;
	}

	/**
	 * Sets the start X.
	 *
	 * @param startX the new start X
	 */
	public static void setStartX(Integer startX) {
		TransformationUtil.startX = startX;
	}

	/**
	 * Gets the start Y.
	 *
	 * @return the start Y
	 */
	public static Integer getStartY() {
		return startY;
	}

	/**
	 * Sets the start Y.
	 *
	 * @param startY the new start Y
	 */
	public static void setStartY(Integer startY) {
		TransformationUtil.startY = startY;
	}
	
	/**
	 * Gets the var type.
	 *
	 * @param model the model
	 * @param globalvar the globalvar
	 * @return the var type
	 */
	public String getVarType(Model model, String globalvar) {
		String result = "double";
		if(shortGlobalVars.contains(globalvar)){
			result = "short";
		}
		return result;
	}

	/**
	 * Gets the ok X.
	 *
	 * @return the ok X
	 */
	public static Integer getOkX() {
		return okX;
	}

	/**
	 * Sets the ok X.
	 *
	 * @param okX the new ok X
	 */
	public static void setOkX(Integer okX) {
		TransformationUtil.okX = okX;
	}

	/**
	 * Gets the ok Y.
	 *
	 * @return the ok Y
	 */
	public static Integer getOkY() {
		return okY;
	}

	/**
	 * Sets the ok Y.
	 *
	 * @param okY the new ok Y
	 */
	public static void setOkY(Integer okY) {
		TransformationUtil.okY = okY;
	}
	
	/**
	 * Gets the rewards.
	 *
	 * @param analysisContext the analysis context
	 * @return the rewards
	 */
	//returns the names of the attack messages associated (through vulnerability) to transition
	public List<String> getRewards(Classifier analysisContext){
		Stereotype stereo = analysisContext.getAppliedStereotype(CYBERSECURITYANALYSISQN);
		SANAnalysis csa = (SANAnalysis) analysisContext.getStereotypeApplication(stereo);
		List<String> result = new ArrayList<>();
		String conditions = csa.getCondition();
		//TODO current assumption: just one reference to <atomic_component_instance_path>.<errorStateName>
		result.add(conditions);
		return result;
	}
}
