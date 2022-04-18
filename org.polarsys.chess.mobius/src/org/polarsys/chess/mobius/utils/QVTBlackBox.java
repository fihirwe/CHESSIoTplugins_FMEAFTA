
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
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DurationConstraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.GeneralOrdering;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.NamedElement;

/**
 * The Class QVTBlackBox.
 */
public class QVTBlackBox {
	
	/** The attackqn. */
	private static String ATTACKQN = "CHESS::Dependability::ThreatsPropagation::Attack";
	
	/**
	 * Sets the ceiling 2.
	 *
	 * @param context the context
	 * @param self the self
	 * @param ceiling the ceiling
	 */
	public static void setCeiling2(IContext context,
			org.eclipse.uml2.uml.Class self, String ceiling) {
		
	}
	
	
/**
 * Gets the ordered attacks and fragments.
 *
 * @param context the context
 * @param scenario the scenario
 * @return the ordered attacks and fragments
 */
@Operation(kind = Kind.OPERATION, contextual = true, withExecutionContext = true)
public List<NamedElement> getOrderedAttacksAndFragments(IContext context, Interaction scenario) {
		
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
	
}
