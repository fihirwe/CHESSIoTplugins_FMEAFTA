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

import java.util.ArrayList;

import org.polarsys.chess.monitoring.traceanalyser.Event;
import org.polarsys.chess.monitoring.traceanalyser.EventType;

/**
 * The Class ThreadEvents.
 */
public class ThreadEvents
{		
	
	/** The thread ID. */
	private String threadID; 
	
	/** The running events. */
	private ArrayList<Event> runningEvents; 
	
	/** The ready events. */
	private ArrayList<Event> readyEvents;
	
	/** The blocked events. */
	private ArrayList<Event> blockedEvents;
	
	/** The sleep events. */
	private ArrayList<Event> sleepEvents;
	
	/** The wakeup events. */
	private ArrayList<Event> wakeupEvents;

	/**
	 * Instantiates a new thread events.
	 *
	 * @param inThreadID the in thread ID
	 * @param inThreadEvents the in thread events
	 */
	public ThreadEvents(String inThreadID, final ArrayList<Event> inThreadEvents) 
	{	
		this.threadID = inThreadID; 		
		runningEvents = new ArrayList<Event>(); 
		readyEvents   = new ArrayList<Event>();
		blockedEvents = new ArrayList<Event>(); 
		sleepEvents   = new ArrayList<Event>(); 
		wakeupEvents  = new ArrayList<Event>(); 
		
		for(Event event : inThreadEvents)
		{
			if(event.GetEventID() == EventType.runningEventID)
				runningEvents.add(event); 
			else if(event.GetEventID() == EventType.readyEventID)
				readyEvents.add(event);
			else if(event.GetEventID() == EventType.blockedEventID)
				blockedEvents.add(event);
			else if(event.GetEventID() == EventType.sleepEventID)
				sleepEvents.add(event);
			else if(event.GetEventID() == EventType.wakeupEventID)
				wakeupEvents.add(event);
			else 
				System.out.println("Invalid event ID in " + event); 	
		} 
	}
	
	/**
	 * Gets the running events.
	 *
	 * @return the array list
	 */
	public ArrayList<Event> GetRunningEvents()
	{
		return runningEvents; 
	}
	
	/**
	 * Gets the ready events.
	 *
	 * @return the array list
	 */
	public ArrayList<Event> GetReadyEvents()
	{
		return readyEvents; 
	}
	
	/**
	 * Gets the blocked events.
	 *
	 * @return the array list
	 */
	public ArrayList<Event> GetBlockedEvents()
	{
		return blockedEvents; 
	}
	
	/**
	 * Gets the sleep events.
	 *
	 * @return the array list
	 */
	public ArrayList<Event> GetSleepEvents()
	{
		return sleepEvents; 
	}
	
	/**
	 * Gets the wakeup events.
	 *
	 * @return the array list
	 */
	public ArrayList<Event> GetWakeupEvents()
	{
		return wakeupEvents; 
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
	 * Gets the first ready event in given interval.
	 *
	 * @param timeStart the time start
	 * @param timeEnd the time end
	 * @return the long
	 */
	public long GetFirstReadyEventInGivenInterval(long timeStart, long timeEnd)
	{ 
		for(Event event: readyEvents)
		{
			if(event.GetTimeStamp() >= timeStart && event.GetTimeStamp() <= timeEnd)
			{
				return event.GetTimeStamp();  
			}
			else if(event.GetTimeStamp() > timeEnd)
			{
				return -1; 
			}
		}		
		return -1; 
	}
	
	/**
	 * Gets the first running event in given interval.
	 *
	 * @param timeStart the time start
	 * @param timeEnd the time end
	 * @return the long
	 */
	public long GetFirstRunningEventInGivenInterval(long timeStart, long timeEnd)
	{ 
		for(Event event: runningEvents)
		{
			if(event.GetTimeStamp()>=timeStart && event.GetTimeStamp()<=timeEnd)
			{
				return event.GetTimeStamp();  
			}
			else if(event.GetTimeStamp()>timeEnd)
			{
				return -1; 
			}		
		}
		return -1; 
	}
	
	
	/**
	 * Gets the last sleep event in given interval.
	 *
	 * @param timeStart the time start
	 * @param timeEnd the time end
	 * @return the long
	 */
	public long GetLastSleepEventInGivenInterval(long timeStart, long timeEnd)
	{ 
		long prev = -1; 
		
		for(Event event: sleepEvents)
		{
			if(event.GetTimeStamp()>=timeStart && event.GetTimeStamp()<=timeEnd)
			{
				prev = event.GetTimeStamp();  
			}
			else if(event.GetTimeStamp()>timeEnd)
			{
				break; 
			}		
		}		
		return prev; 
	}

	/**
	 * Find last sleep if any available.
	 *
	 * @param currentWakeupTime the current wakeup time
	 * @return the long
	 */
	public long FindLastSleepIfAnyAvailable(long currentWakeupTime) 
	{
		for(Event event: sleepEvents)
		{
			if(event.GetTimeStamp()>=currentWakeupTime)
				return event.GetTimeStamp();  
		}	
		return -1; 
	}
}

