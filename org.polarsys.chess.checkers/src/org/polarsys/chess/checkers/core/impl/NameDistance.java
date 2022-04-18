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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.chess.checkers.core.checkerManager.Checker;
import org.polarsys.chess.checkers.core.checkerManager.CheckerMessage;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;

/**
 * Computes the minimum distance among properties inside SysML Blocks.
 * 
 * @author cristofo
 *
 */
public class NameDistance extends Checker {

	/** Minimum distance between two elements; below it, marks as suspect. */
	private int threshold = 2;
	private Package systemViewPackage;
	private static final Logger logger = Logger.getLogger(NameDistance.class);
	private static final String checkerName = "NameDistance";

	/**
	 * Creates a name distance checker with default threshold.
	 */
	public NameDistance() {
		super(checkerName, getTags());
	}

	/**
	 * Creates a name distance checker with the given priority.
	 * @param priority the priority
	 */
	public NameDistance(int priority) {
		super(checkerName, getTags(), priority);
	}

	/**
	 * Creates a name distance checker with the given priority and threshold.
	 * @param priority the priority
	 * @param threshold the threshold to use
	 */
	public NameDistance(int priority, int threshold) {
		super(checkerName, getTags(), priority);
		setThreshold(threshold);
	}

	/**
	 * Constructor with explicit tags.
	 * @param tags the tags identifying this checker
	 */
	public NameDistance(Set<String> tags) {
		super(checkerName, tags);
	}

	/**
	 * Constructor with explicit tags and priority.
	 * @param tags the tags identifying this checker
	 * @param priority the priority
	 */
	public NameDistance(Set<String> tags, int priority) {
		super(checkerName, tags, priority);
	}

	/**
	 * Constructor with explicit tags, priority and threshold.
	 * @param tags the tags identifying this checker
	 * @param priority the priority
	 * @param threshold the threshold to use
	 */
	public NameDistance(Set<String> tags, int priority, int threshold) {
		super(checkerName, tags, priority);
		setThreshold(threshold);
	}
	
	private static Set<String> getTags() {
		Set<String> tags = new HashSet<String>();
		tags.add("fast");
		tags.add("warnings");
		tags.add("errors");
		tags.add("sysml");
		return tags;
	}

	public int getThreshold() {
		return threshold;
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	/**
	 * Returns the blocks that should be checked inside the model. Can be overwritten if necessary.
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

	@Override
	public List<CheckerMessage> check(IProgressMonitor monitor) throws Exception {
		List<CheckerMessage> messages = new ArrayList<CheckerMessage>();
		Collection<Class> blocks = getBlocks(systemViewPackage);

		monitor.beginTask(unifiedName, blocks.size());
		for (Class block : blocks) {
			messages.addAll(processBlock(block));
			if (monitor.isCanceled())
				throw new Exception("Checker interrupted");
			monitor.worked(1);
		}
		return messages;
	}

	/**
	 * Processes the given block.
	 * 
	 * @param block
	 *            the block to process
	 * @return a list of warnings
	 */
	private List<CheckerMessage> processBlock(Class block) {
		final EList<NamedElement> elements = filterElements(block);
		return processElements(elements);
	}

	/**
	 * Creates the list of elements to be analized. Can be overridden if necessary.
	 * @param elements
	 * @return the filtered elements
	 */
	protected EList<NamedElement> filterElements(Class block) {
		final EList<Property> attributes = block.getOwnedAttributes();
		final EList<Operation> operations = block.getOwnedOperations();
		final EList<Behavior> behaviors = block.getOwnedBehaviors();
		final EList<Port> ports = block.getOwnedPorts();

		final EList<NamedElement> elements = new BasicEList<NamedElement>(attributes.size() + 
				operations.size() + behaviors.size() + ports.size());
		elements.addAll(attributes);
		elements.addAll(operations);
		elements.addAll(behaviors);
		elements.addAll(ports);
		return elements;
	}
	
	/**
	 * Processes the given list of elements.
	 * 
	 * @param block
	 *            the list to process
	 * @return a list of warnings
	 */
	private List<CheckerMessage> processElements(EList<NamedElement> elements) {
		List<CheckerMessage> messages = new ArrayList<CheckerMessage>();

		for (int i = 0; i < elements.size(); i++) {
			final NamedElement first = elements.get(i);
			final String firstName = normalizeName(first.getName());
			ArrayList<String> similarNames = new ArrayList<String>(2);
			for (int j = 0; j < elements.size(); j++) {
				if (j == i)
					continue;
				final NamedElement second = elements.get(j);

				final String secondName = normalizeName(second.getName());
				final int distance = levenshteinDistance(firstName, secondName);
				logger.debug(firstName + " and " + secondName + " distance = " + distance);

				if (distance == 0) {
					final String msg = equalsMsg(first, second);
					messages.add(createMessage(msg, IMarker.SEVERITY_ERROR, first, unifiedName));
				}
				if (distance <= threshold) {
					similarNames.add(second.getName());
				}
			}

			// If some similarities are found, store the entry in the warnings
			if (similarNames.size() > 0) {
				final String msg = similarMsg(first, similarNames);
				messages.add(createMessage(msg, IMarker.SEVERITY_WARNING, first, unifiedName));
			}
		}
		return messages;
	}
	
	protected String equalsMsg(NamedElement first, NamedElement second) {
		return "The term '" + first.getName() + "' is equal to '" + second.getName()  + 
				"' in block '" + ((Class) first.getOwner()).getName() + "'";
	}

	protected String similarMsg(NamedElement first, ArrayList<String> similarNames) {
		return "The term '" + first.getName() + "' is very similar to '"
				+ String.join("' and '", similarNames) + "' in block '" + ((Class) first.getOwner()).getName() + "'";
	}
	
	/**
	 * Removes macro and event prefixes from the name, and put it in lowercase.
	 * 
	 * @param name
	 * @return
	 */
	private String normalizeName(String name) {
		// if (name.startsWith(RfiAccEntityUtil.MACRO_PREFIX) &&
		// Character.isUpperCase(name.charAt(RfiAccEntityUtil.MACRO_PREFIX.length())))
		// {
		// name = name.substring(RfiAccEntityUtil.MACRO_PREFIX.length());
		// } else if (name.startsWith(RfiAccEntityUtil.EVENT_PREFIX) &&
		// Character.isUpperCase(name.charAt(RfiAccEntityUtil.EVENT_PREFIX.length())))
		// {
		// name = name.substring(RfiAccEntityUtil.EVENT_PREFIX.length());
		// }

		return name.toLowerCase();
	}

	/**
	 * Computes the Levenshtein distance. Code taken from
	 * https://en.wikibooks.org/wiki/Algorithm_Implementation/Strings/Levenshtein_distance#Java
	 * 
	 * @param lhs
	 * @param rhs
	 * @return the distance
	 */
	private static int levenshteinDistance(CharSequence lhs, CharSequence rhs) {
		int len0 = lhs.length() + 1;
		int len1 = rhs.length() + 1;

		// the array of distances
		int[] cost = new int[len0];
		int[] newcost = new int[len0];

		// initial cost of skipping prefix in String s0
		for (int i = 0; i < len0; i++)
			cost[i] = i;

		// dynamically computing the array of distances

		// transformation cost for each letter in s1
		for (int j = 1; j < len1; j++) {
			// initial cost of skipping prefix in String s1
			newcost[0] = j;

			// transformation cost for each letter in s0
			for (int i = 1; i < len0; i++) {
				// matching current letters in both strings
				int match = (lhs.charAt(i - 1) == rhs.charAt(j - 1)) ? 0 : 1;

				// computing cost for each transformation
				int cost_replace = cost[i - 1] + match;
				int cost_insert = cost[i] + 1;
				int cost_delete = newcost[i - 1] + 1;

				// keep minimum cost
				newcost[i] = Math.min(Math.min(cost_insert, cost_delete), cost_replace);
			}

			// swap cost/newcost arrays
			int[] swap = cost;
			cost = newcost;
			newcost = swap;
		}

		// the distance is the cost for transforming all letters in both strings
		return cost[len0 - 1];
	}

	protected CheckerMessage createMessage(String msg, int severity, EObject element, String unifiedName) {
		return new CheckerMessage(msg, severity, element, unifiedName);
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
