/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.core.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Vertex;
import org.polarsys.chess.checkers.core.checkerManager.Checker;
import org.polarsys.chess.checkers.core.checkerManager.CheckerMessage;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;

/**
 * Two checkers that detect unreachable states and states without transitions to other 
 * states, inside a StateMachine.
 * 
 * @author cristofo
 *
 */
public class StateStatus extends Checker {
	private Package systemViewPackage;
	protected static final Logger logger = Logger.getLogger(StateStatus.class);
	private final EntityUtil entityUtil = EntityUtil.getInstance();
	private static final String checkerName = "StateStatus";

	/**
	 * Creates a state checker
	 */
	public StateStatus() {
		super(checkerName, getTags());
	}

	/**
	 * Creates a state checker with the given priority
	 * @param priority the priority
	 */
	public StateStatus(int priority) {
		super(checkerName, getTags(), priority);
	}

	/**
	 * Constructor with explicit tags.
	 * @param tags the tags identifying this checker
	 */
	public StateStatus(Set<String> tags) {
		super(checkerName, tags);
	}

	/**
	 * Constructor with explicit tags and priority.
	 * @param tags the tags identifying this checker
	 * @param priority the priority
	 */
	public StateStatus(Set<String> tags, int priority) {
		super(checkerName, tags, priority);
	}

	private static Set<String> getTags() {
		Set<String> tags = new HashSet<String>();
		tags.add("fast");
		tags.add("errors");
		tags.add("state machine");
		return tags;
	}

	@Override
	public List<CheckerMessage> check(IProgressMonitor monitor) throws Exception {
		List<CheckerMessage> messages = new ArrayList<CheckerMessage>();
		Collection<Class> blocks = null;
		blocks = getBlocks(systemViewPackage);

		monitor.beginTask(unifiedName, blocks.size());
		for (Class block : blocks) {
//			warnings.addAll(checkForDeadAndUnreachableStates(block));
			messages.addAll(checkForDeadStates(block));
			messages.addAll(checkForUnreachableStates(block));
			if (monitor.isCanceled())
				throw new Exception("Checker interrupted");
			monitor.worked(1);
		}
		return messages;
	}

	/**
	 * Returns the blocks that should be checked inside the model. Can be overwritter if necessary.
	 * @param systemViewPackage
	 * @return
	 */
	protected Collection<Class> getBlocks(Package systemViewPackage) {
		try {
			return (Collection<Class>) EntityUtil.getInstance().getAllClasses(systemViewPackage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * A dead state is a state with no transitions to other states.
	 * @param block
	 * @return list of errors
	 */
	protected List<CheckerMessage> checkForDeadStates(Class block) {
		List<CheckerMessage> errors = new ArrayList<CheckerMessage>();
		
		final Set<StateMachine> stateMachines = entityUtil.getNominalStateMachines(block);
		if (stateMachines.isEmpty()) {
			logger.error("No state machines are present in block " + block.getName());			
		}
		
		for (StateMachine stateMachine : stateMachines) {
			if (stateMachine == null) continue;
			final String stateMachineName = stateMachine.getName();
			final Region region = stateMachine.getRegion(null); // Assume that only one region is present
			if (region == null) {
				logger.error("State machine " + stateMachineName + " of block " + block.getName() + 
						" is not valid");
				continue;
			}
			
			// If there is only one intermediate state, don't do any check
			if (entityUtil.getIntermediateStates(stateMachine).size() <= 1) continue;
			
			final EList<Vertex> states = entityUtil.getStates(stateMachine);
			final List<String> deadStates = new ArrayList<String>(1);
			for (Vertex state : states) {
				if (entityUtil.isFinalState(state)) continue;
				boolean dead = true;
				final EList<Transition> outgoingTransitions = entityUtil.getOutgoingTransitions(state);
				for (Transition transition : outgoingTransitions) {
					if (entityUtil.getTransitionNextState(transition) != state) {
						dead = false;
						break;
					}
				}
				if (dead) {
					final String msg = deadMsg(state, block);
					errors.add(createMessage(msg, IMarker.SEVERITY_ERROR, state, unifiedName));

					deadStates.add(state.getName());
				}
			}
			if (deadStates.size() == 0) {
				logger.debug("State machine " + stateMachineName + ": all states are valid");
			} else {
				logger.error("State machine " + stateMachineName + ": the following states are dead: " + 
						String.join(", ", deadStates));
			}
		}
		
		return errors;
	}
	
	/**
	 * An unreachable state is a state that is no reachable from other states.
	 * @param block
	 * @return list of errors
	 */
	private List<CheckerMessage> checkForUnreachableStates(Class block) {
		List<CheckerMessage> errors = new ArrayList<CheckerMessage>();
		
		final Set<StateMachine> stateMachines = entityUtil.getNominalStateMachines(block);
		if (stateMachines.isEmpty()) {
			logger.error("No state machines are present in block " + block.getName());			
		}
		
		for (StateMachine stateMachine : stateMachines) {
			if (stateMachine == null) continue;
			final String stateMachineName = stateMachine.getName();
			final Region region = stateMachine.getRegion(null); // Assume that only one region is present
			if (region == null) {
				logger.error("State machine " + stateMachineName + " of block " + block.getName() + 
						" is not valid");
				continue;
			}
			final EList<Vertex> states = entityUtil.getIntermediateStates(stateMachine);
			final List<String> unreachableStates = new ArrayList<String>(1);
			for (Vertex state : states) {
				boolean unreachable = true;
				final EList<Transition> incomingTransitions = entityUtil.getIncomingTransitions(state);
				for (Transition transition : incomingTransitions) {
					if (entityUtil.getTransitionSourceState(transition) != state) {
						unreachable = false;
						break;
					}
				}
				if (unreachable) {
					final String msg = unreachableMsg(state, block);
					errors.add(createMessage(msg, IMarker.SEVERITY_ERROR, state, unifiedName));
					unreachableStates.add(state.getName());					
				}
			}
			if (unreachableStates.size() == 0) {
				logger.debug("State machine " + stateMachineName + ": all states are valid");
			} else {
				logger.error("State machine " + stateMachineName + ": the following states are not reachable: " + 
						String.join(", ", unreachableStates));
			}
		}
		
		return errors;
	}

	/**
	 * An unreachable state is a state that is no reachable from other states.
	 * @param block
	 * @return list of errors
	 */
	private List<CheckerMessage> checkForDeadAndUnreachableStates(Class block) {		
		List<CheckerMessage> errors = new ArrayList<CheckerMessage>();
		
		final Set<StateMachine> stateMachines = entityUtil.getNominalStateMachines(block);
		if (stateMachines.isEmpty()) {
			logger.error("No state machines are present in block " + block.getName());			
		}
		
		for (StateMachine stateMachine : stateMachines) {
			if (stateMachine == null) continue;
			final String stateMachineName = stateMachine.getName();
			final Region region = stateMachine.getRegion(null); // Assume that only one region is present
			if (region == null) {
				logger.error("State machine " + stateMachineName + " of block " + block.getName() + 
						" is not valid");
				continue;
			}
			final EList<Vertex> states = entityUtil.getStates(stateMachine);
			final List<String> deadStates = new ArrayList<String>(1);
			final List<String> unreachableStates = new ArrayList<String>(1);

			int stateCounter = 0;
			for (Vertex state : states) {
				if (!entityUtil.isFinalState(state)) {
					stateCounter++;
				}
			}
			
			for (Vertex state : states) {
				boolean dead = false;
				boolean unreachable = false;
				if (!entityUtil.isFinalState(state)) {
					dead = true;
					final EList<Transition> outgoingTransitions = entityUtil.getOutgoingTransitions(state);
					for (Transition transition : outgoingTransitions) {
						if (entityUtil.getTransitionNextState(transition) != state) {
							dead = false;
							break;
						}
					}					
				}

				if (!entityUtil.isInitialState(state)) {
					unreachable = true;
					final EList<Transition> incomingTransitions = entityUtil.getIncomingTransitions(state);
					for (Transition transition : incomingTransitions) {
						if (entityUtil.getTransitionSourceState(transition) != state) {
							unreachable = false;
							break;
						}
					}
				}

				if ((dead && stateCounter > 2)) {
					final String msg = deadMsg(state, block);
					errors.add(createMessage(msg, IMarker.SEVERITY_ERROR, state, unifiedName));
					deadStates.add(state.getName());
				}

				if ((unreachable)) {
					final String msg = unreachableMsg(state, block);
					errors.add(createMessage(msg, IMarker.SEVERITY_ERROR, state, unifiedName));
					unreachableStates.add(state.getName());
				}
			}
			if (deadStates.size() == 0) {
				logger.debug("State machine " + stateMachineName + ": all states are valid");
			} else {
				logger.error("State machine " + stateMachineName + ": the following states are dead: " + 
						String.join(", ", deadStates));
			}
			if (unreachableStates.size() == 0) {
				logger.debug("State machine " + stateMachineName + ": all states are valid");
			} else {
				logger.error("State machine " + stateMachineName + ": the following states are not reachable: " + 
						String.join(", ", unreachableStates));
			}
		}
		return errors;
	}
	
	protected CheckerMessage createMessage(String msg, int severity, EObject state, String unifiedName) {
		return new CheckerMessage(msg, severity, state, unifiedName);
	}
	
	protected String deadMsg(Vertex state, Class block) {
		return "The state '" + state.getName() + "' of block '" + 
				block.getName() + "' does not have any transitions to other states";
	}
	
	protected String unreachableMsg(Vertex state, Class block) {
		return "The state '" + state.getName() + "' of block '" + 
				block.getName() + "' is never reachable";
	}

	@Override
	public void init() throws Exception {
		systemViewPackage = EntityUtil.getInstance().getCurrentSystemView();
	}

	@Override
	public void initSync(Package systemViewPackage) throws Exception {
		this.systemViewPackage = systemViewPackage;
	}
}
