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
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.polarsys.chess.checkers.core.checkerManager.Checker;
import org.polarsys.chess.checkers.core.checkerManager.CheckerMessage;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;

public class IdentifiersChecker extends Checker {
	protected Package systemViewPackage;
	private static final Logger logger = Logger.getLogger(IdentifiersChecker.class);
	private static final String checkerName = "IdentifierChecker";

	/**
	 * Default constructor
	 */
	public IdentifiersChecker() {
		super(checkerName, getTags());
	}

	/**
	 * Creates the checker with the given priority.
	 * @param priority the priority
	 */
	public IdentifiersChecker(int priority) {
		super(checkerName, getTags(), priority);
	}

	/**
	 * Constructor with explicit tags.
	 * @param tags the tags identifying this checker
	 */
	public IdentifiersChecker(Set<String> tags) {
		super(checkerName, tags);
	}

	/**
	 * Constructor with explicit tags and priority.
	 * @param tags the tags identifying this checker
	 * @param priority the priority
	 */
	public IdentifiersChecker(Set<String> tags, int priority) {
		super(checkerName, tags, priority);
	}

	@Override
	public List<CheckerMessage> check(IProgressMonitor monitor) throws Exception {
		List<CheckerMessage> messages = new ArrayList<CheckerMessage>();
		Collection<Class> blocks = null;
		try {
			blocks = (Collection<Class>) EntityUtil.getInstance().getAllClasses(systemViewPackage);
		} catch (Exception e) {
			e.printStackTrace();
		}

		monitor.beginTask(checkerName, blocks.size());
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
	 * @return a list of messages
	 */
	protected List<CheckerMessage> processBlock(Class block) {
		final EList<NamedElement> elements = filterElements(block);
		return processElements(elements);
	}

	/**
	 * Processes the given list of elements.
	 * 
	 * @param block
	 *            the list to process
	 * @return a list of warnings
	 */
	protected List<CheckerMessage> processElements(EList<NamedElement> elements) {
		List<CheckerMessage> messages = new ArrayList<CheckerMessage>();

		for (NamedElement element : elements) {
			final String name = element.getName();
			logger.debug("Processing " + name);
			if (!isValidId(name)) {
				logger.debug("The element name is not a valid identifier: " + name);
				final String msg = "The element name is not a valid identifier: " + name;
				messages.add(new CheckerMessage(msg, IMarker.SEVERITY_WARNING, element, checkerName));
			}
		}
		return messages;
	}

	protected boolean isValidId(String id) {
		return javax.lang.model.SourceVersion.isIdentifier(id) && (!javax.lang.model.SourceVersion.isKeyword(id));
	}
	
	/**
	 * Creates the list of elements to be analized (incuding the block itself). Can be overridden if necessary.
	 * @param elements
	 * @return the filtered elements
	 */
	protected EList<NamedElement> filterElements(Class block) {
		final EList<Property> attributes = block.getOwnedAttributes();
		final EList<Operation> operations = block.getOwnedOperations();
		final EList<Behavior> behaviors = block.getOwnedBehaviors();
		final EList<Port> ports = block.getOwnedPorts();

		final EList<NamedElement> elements = new BasicEList<NamedElement>(attributes.size() + 
				operations.size() + behaviors.size() + ports.size() + 1);
		elements.addAll(attributes);
		elements.addAll(operations);
		elements.addAll(behaviors);
		elements.addAll(ports);
		elements.add(block);
		return elements;
	}

	private static Set<String> getTags() {
		Set<String> tags = new HashSet<String>();
		tags.add("fast");
		tags.add("warnings");
		tags.add("sysml");
		return tags;
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
