/*******************************************************************************
 * Copyright (C) 2019 Fondazione Bruno Kessler.
 * All rights reserved. 
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.polarsys.chess.checkers;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.polarsys.chess.checkers.core.checkerManager.CheckerManager;
import org.polarsys.chess.checkers.core.checkerManager.CheckersContainer;
import org.polarsys.chess.checkers.core.impl.IdentifiersChecker;
import org.polarsys.chess.checkers.core.impl.NameDistance;
import org.polarsys.chess.checkers.core.impl.StateStatus;
import org.polarsys.chess.checkers.core.impl.TestChecker1;
import org.polarsys.chess.checkers.core.impl.TestChecker2;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.chess.checkers";

	// The system property that contains the log level to use
	public static final String LOG4J_LOG_LEVEL = "Log4jLogLevel";

	// The shared instance
	private static Activator plugin;

	private static CheckerManager checkerManager;

	boolean started;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		System.out.println("Activator: " + this);
		checkerManager = getCheckerManager();
/*
		Set<String> tags1 = new HashSet<String>();
		tags1.add("fast");
		tags1.add("errors");
		tags1.add("sysml");
		new TestChecker2("SysMLChecker1", tags1);

		Set<String> tags2 = new HashSet<String>();
		tags2.add("slow");
		tags2.add("warnings");
		tags2.add("state machine");
		tags2.add("sysml");
		new TestChecker1("StateMachineChecker2", tags2, 4);

		new TestChecker1("StateMachineChecker2", tags2, 1);

		new TestChecker1("StateMachineChecker2", tags2, 10);

		new TestChecker1("StateMachineChecker2", tags2, 2);*/

		new NameDistance(1, 1);
		new StateStatus();
		new IdentifiersChecker();

		started = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		started = false;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 *
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static CheckerManager getCheckerManager() {
		if (checkerManager == null) {
			checkerManager = new CheckerManager();
		}
		return checkerManager;
	}

	public Set<String> getTags() {
		Set<String> selectedTags = new HashSet<String>();

		for (String tag : checkerManager.getTags()) {
			if (getPreferenceStore().getBoolean(tag)) {
				selectedTags.add(tag);
			}
		}
		return selectedTags;
	}
}
