/*******************************************************************************
 *                  CHESS monitoring plugin
 *
 *               Copyright (C) 2015-2016
 *            Mälardalen University, Sweden
 *
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License
 *  v1.0 which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *******************************************************************************/

package org.polarsys.chess.monitoring.traceanalyser;

/**
 * The Class EventType.
 */
public final class EventType {
	
	/** The Constant runningEventID. */
	public static final int runningEventID = 0; 
	
	/** The Constant readyEventID. */
	public static final int readyEventID   = 1; 
	
	/** The Constant blockedEventID. */
	public static final int blockedEventID = 2; 
	
	/** The Constant sleepEventID. */
	public static final int sleepEventID   = 3; 
	
	/** The Constant wakeupEventID. */
	public static final int wakeupEventID  = 4; 
}
