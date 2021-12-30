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
 * The Class Event.
 */
public class Event
{
	
	/** The time stamp. */
	private long timeStamp; 
	
	/** The event ID. */
	private int eventID;
	
	/** The thread ID. */
	private String threadID; 

	/**
	 * Instantiates a new event.
	 *
	 * @param inTimeStamp the in time stamp
	 * @param inEventId the in event id
	 * @param inThreadID the in thread ID
	 */
	public Event(long inTimeStamp, int inEventId, String inThreadID ) 
	{
		this.timeStamp = inTimeStamp; 
		this.eventID = inEventId; 
		this.threadID = inThreadID; 
	}
	
	/**
	 * Gets the time stamp.
	 *
	 * @return the long
	 */
	public long GetTimeStamp()
	{
		return timeStamp; 
	}
	
	/**
	 * Gets the event ID.
	 *
	 * @return the int
	 */
	public int GetEventID()
	{
		return eventID; 
	}
	
	/**
	 * Gets the thread ID.
	 *
	 * @return the string
	 */
	public String GetThreadID()
	{
		return threadID; 
	}	
	
	/**
	 * Prints the event.
	 */
	public void PrintEvent()
	{
		System.out.println("TimeStamp:"+timeStamp+"\tEventID:"+eventID+"\t ThreadID:"+threadID);
	}
	
}

