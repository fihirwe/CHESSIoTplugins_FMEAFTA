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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.eclipse.core.resources.IFile;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.monitoring.traceanalyser.Event;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


/**
 * The Class TraceReader.
 */
public class TraceReader
{ 
	
	/** The time stamp column. */
	private int time_Stamp_Column = 0;
	
	/** The event I D column. */
	private int event_ID_Column   = 1; 	
	
	/** The thread I D column. */
	private int thread_ID_Column  = 2; 

	/** The clockrate. */
	private double clockrate = 1;
	
	/** The trace file name. */
	private String traceFileName; 
	
	/** The thread specific events. */
	private ArrayList<ArrayList<Event>> threadSpecificEvents; 
	
	/** The thread I ds. */
	private ArrayList<String> threadIDs; 
	
	/** The analysis context. */
	private String analysisContext;

	/**
	 * Instantiates a new trace reader.
	 *
	 * @param traceFile the trace file
	 * @param threadIDsFile the thread I ds file
	 * @param delimiter the delimiter
	 */
	public TraceReader(IFile traceFile, IFile threadIDsFile, String delimiter) 
	{
		traceFileName = traceFile.getLocation().toOSString(); 
		analysisContext = GetAnalysisContext(threadIDsFile.getLocation().toOSString());
		threadIDs = new ArrayList<String>();
		threadIDs = GetThreadIDs(threadIDsFile.getLocation().toOSString()); // the order in which threadIDs are provide will be used to maintain the events related that threadid in threadSpecificEvents 
		
		if(threadIDs.size() == 0)
		{
			CHESSProjectSupport.printlnToCHESSConsole("Error: No thread ID to analyze.");
			System.exit(0); 
		}
		
		threadSpecificEvents = new ArrayList<ArrayList<Event>>(); 

		for(int i=0; i<threadIDs.size(); i++)
		{
			threadSpecificEvents.add(new ArrayList<Event>());   
		}
		ReadTraceFile(delimiter); 
	}
	
	/**
	 * Gets the analysis context.
	 *
	 * @param fileName the file name
	 * @return the string
	 */
	private String GetAnalysisContext(String fileName)
	{
		String analContext = null;
		try
		{
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();
			
			NodeList contexts = doc.getElementsByTagName("analysisContext");			
			Node context = contexts.item(0);
			if(context.getNodeType() == Node.ELEMENT_NODE)
			{
				Element elem = (Element)context;
				analContext = elem.getAttribute("name");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return analContext;
	}
	
	/**
	 * Gets the thread I ds.
	 *
	 * @param fileName the file name
	 * @return the array list
	 */
	private ArrayList<String> GetThreadIDs(String fileName) 
	{
		ArrayList<String> threadNames = new ArrayList<String>();
		try
		{
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();
			
			NodeList contexts = doc.getElementsByTagName("analysisContext");			
			Node context = contexts.item(0);
			if(context.getNodeType() == Node.ELEMENT_NODE)
			{
				Element elem = (Element)context;
				this.analysisContext = elem.getAttribute("name");
			}
			
			NodeList allthreads = doc.getElementsByTagName("ThreadNames");

			for (int i = 0; i < allthreads.getLength(); i++) 
			{
				Node thread = allthreads.item(i);
				if (thread.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) thread;
					threadNames.add(eElement.getAttribute("name"));//.getElementsByTagName("name").item(0).getTextContent()); 
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return threadNames;
	}


	/**
	 * Read trace file.
	 *
	 * @param delimiter the delimiter
	 */
	private void ReadTraceFile(String delimiter) 
	{
		try 
		{
			FileReader file = new FileReader(traceFileName);
			BufferedReader br = new BufferedReader(file); 
			String strLine; 
			Event event ;  
			Boolean firstLine = true;
			
//			strLine = br.readLine();
//			if(strLine != null)
//			{
//				strLine = strLine.trim();
//				String[] strEvent = strLine.split(delimiter);
//				
//				if(strEvent.length == 2 && strEvent[0].equals("clockrate"))
//				{
//					clockrate=Double.parseDouble(strEvent[1]);
//				}
//				else
//				{
//					//assume rate=1
//					clockrate=1;
//					CHESSProjectSupport.printlnToCHESSConsole("Clockrate is not available: 1 will be assumed");
//					br.close();
//					return;
//				}
//			}

			while ((strLine = br.readLine()) != null) 
			{
				
				strLine = strLine.trim();
				String[] strEvent = strLine.split(delimiter); 
				
				if (firstLine){
					if(strEvent.length == 2 && strEvent[0].equals("clockrate"))
					{
						clockrate=Double.parseDouble(strEvent[1]);
						continue;
					}
					else
					{
						//assume rate=1
						clockrate=1;
						CHESSProjectSupport.printlnToCHESSConsole("Clockrate is not available: 1 will be assumed");
					}
					firstLine = false;
				}
				
				if(strEvent.length ==3)
				{	
					event = new Event(Long.parseLong(strEvent[time_Stamp_Column]), Integer.parseInt(strEvent[event_ID_Column]), strEvent[thread_ID_Column]); 

					if(threadIDs.contains(event.GetThreadID()))
						threadSpecificEvents.get(threadIDs.indexOf(event.GetThreadID())).add(event);
				}
				else
				{
					CHESSProjectSupport.printlnToCHESSConsole("Error: Some events do not follow the expected trace format.");
					br.close();
					return;
				}
			}
			br.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}

	/**
	 * Prints the thread specific events.
	 *
	 * @param tid the tid
	 */
	public void PrintThreadSpecificEvents(String tid)
	{
		int indexOfThread = threadIDs.indexOf(tid); 

		CHESSProjectSupport.printlnToCHESSConsole("Time Stamp \t EventID \t ThreadID");
		for(Event event : threadSpecificEvents.get(indexOfThread))
			CHESSProjectSupport.printlnToCHESSConsole(event.GetTimeStamp()+"\t"+event.GetEventID() +"\t"+ event.GetThreadID());		
	}

	/**
	 * Write thread specific events into file.
	 *
	 * @param tid the tid
	 */
	public void WriteThreadSpecificEventsIntoFile(String tid)
	{
		int indexOfThread = threadIDs.indexOf(tid); 

		FileWriter filewrite;
		try {
			filewrite = new FileWriter(tid.concat(".txt"), false);
			BufferedWriter out = new BufferedWriter(filewrite); 

			for(Event event : threadSpecificEvents.get(indexOfThread))
				out.write(event.GetTimeStamp()+"\t"+event.GetEventID() +"\t"+ event.GetThreadID()+"\n");		

			out.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}  
	}

	/**
	 * ***********
	 *  Getters
	 * **********.
	 *
	 * @return the array list
	 */
	public ArrayList<String> GetThreadIDs()
	{
		return threadIDs; 
	}
	
	/**
	 * Gets the analysis context.
	 *
	 * @return the string
	 */
	public String GetAnalysisContext()
	{
		return this.analysisContext;
	}

	/**
	 * Gets the thread specific events.
	 *
	 * @return the array list
	 */
	public ArrayList<ArrayList<Event>> GetThreadSpecificEvents()
	{
		return threadSpecificEvents; 
	}

	/**
	 * Gets the thread id of given events.
	 *
	 * @param eventsList the events list
	 * @return the string
	 */
	public String GetThreadIdOfGivenEvents(ArrayList<ArrayList<Integer>> eventsList)
	{
		if(threadSpecificEvents.contains(eventsList))
			return threadIDs.get(threadSpecificEvents.indexOf(eventsList));
		else 
			return null; 
	}

	/**
	 * Gets the thread ID column.
	 *
	 * @return the int
	 */
	public int GetThreadIDColumn()
	{
		return thread_ID_Column; 
	}

	/**
	 * Gets the event ID column.
	 *
	 * @return the int
	 */
	public int GetEventIDColumn()
	{
		return event_ID_Column; 
	}

	/**
	 * Gets the time stamp column.
	 *
	 * @return the int
	 */
	public int GetTimeStampColumn()
	{
		return time_Stamp_Column; 
	}
	
	/**
	 * Gets the clock rate.
	 *
	 * @return the double
	 */
	public double GetClockRate()
	{
		return clockrate; 
	}
}





