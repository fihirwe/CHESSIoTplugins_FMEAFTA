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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.polarsys.chess.monitoring.monitoringxml.Activator;
import org.polarsys.chess.monitoring.preferences.PreferenceConstants;
import org.polarsys.chess.monitoring.traceanalyser.Event;
import org.polarsys.chess.monitoring.traceanalyser.EventType;
import org.polarsys.chess.monitoring.traceanalyser.ThreadEvents;
import org.polarsys.chess.monitoring.traceanalyser.TraceReader;

/**
 * The Class Parameters.
 */
public class Parameters
{ 
	
	/** The trace. */
	private TraceReader trace; 
	
	/** The thread I ds. */
	private ArrayList<String> threadIDs; 
	
	/** The thread specific events. */
	private ArrayList<ArrayList<Event>> threadSpecificEvents ; 

	/** The wcet of all threads. */
	private ArrayList<Long> wcetOfAllThreads; 
	
	/** The bcet of all threads. */
	private ArrayList<Long> bcetOfAllThreads; 
	
	/** The acet of all threads. */
	private ArrayList<Double> acetOfAllThreads; 

	/** The minimum inter arrival time of all threads. */
	private ArrayList<Long> minimumInterArrivalTimeOfAllThreads; 
	
	/** The maximum inter arrival time of all threads. */
	private ArrayList<Long> maximumInterArrivalTimeOfAllThreads; 
	
	/** The average inter arrival time of all threads. */
	private ArrayList<Double> averageInterArrivalTimeOfAllThreads; 
	
	/** The release jitter of all threads. */
	private ArrayList<Long> releaseJitterOfAllThreads; 

	/** The minimum blocking of all threads. */
	private ArrayList<Long> minimumBlockingOfAllThreads; 
	
	/** The maximum blocking of all threads. */
	private ArrayList<Long> maximumBlockingOfAllThreads; 
	
	/** The average blocking of all threads. */
	private ArrayList<Double> averageBlockingOfAllThreads; 

	/** The worst case response timet of all threads. */
	private ArrayList<Long> worstCaseResponseTimetOfAllThreads; 
	
	/** The best case response timet of all threads. */
	private ArrayList<Long> bestCaseResponseTimetOfAllThreads; 
	
	/** The jitter in response timet of all threads. */
	private ArrayList<Long> jitterInResponseTimetOfAllThreads; 
	
	/** The average case response timet of all threads. */
	private ArrayList<Double> averageCaseResponseTimetOfAllThreads; 

	/** The variance in execution time of all threads. */
	private ArrayList<Double> varianceInExecutionTimeOfAllThreads;
	
	/** The variance in arrival time of all threads. */
	private ArrayList<Double> varianceInArrivalTimeOfAllThreads;
	
	/** The variance in blocking of all threads. */
	private ArrayList<Double> varianceInBlockingOfAllThreads;
	
	/** The variance in response time of all threads. */
	private ArrayList<Double> varianceInResponseTimeOfAllThreads;
	
	/** The clock rate. */
	private double clockRate; 	
	
	/** The trace extraction path. */
	private IFolder traceExtractionPath; // This path is used to output files that contains all the values of execution time, inter-arrival time and response time
	
	/** The no of threads. */
	private int noOfThreads; 
	
	/** The counter scale factor. */
	private int counterScaleFactor = 1;

	/**
	 * Instantiates a new parameters.
	 *
	 * @param inTrace the in trace
	 * @param inTraceExtractionPath the in trace extraction path
	 */
	public Parameters(TraceReader inTrace, IFolder inTraceExtractionPath) 
	{
		this.trace = inTrace; 
		threadSpecificEvents = trace.GetThreadSpecificEvents();
		threadIDs = trace.GetThreadIDs(); 
		noOfThreads = threadIDs.size();
		//clock rate can be passed through the log file (optional value), in the first line; the trace analyzed is in charge to retrieve it, if available
		clockRate = trace.GetClockRate(); 

		this.traceExtractionPath = inTraceExtractionPath; 

		/* Execution related parameters */
		wcetOfAllThreads = new ArrayList<Long>(noOfThreads);
		bcetOfAllThreads = new ArrayList<Long>(noOfThreads);
		acetOfAllThreads = new ArrayList<Double>(noOfThreads);

		/* Arrival time related parameters */
		minimumInterArrivalTimeOfAllThreads = new ArrayList<Long>(noOfThreads);
		maximumInterArrivalTimeOfAllThreads = new ArrayList<Long>(noOfThreads);
		averageInterArrivalTimeOfAllThreads = new ArrayList<Double>(noOfThreads); 
		releaseJitterOfAllThreads = new ArrayList<Long>(noOfThreads);

		/* Block related parameters */
		minimumBlockingOfAllThreads  = new ArrayList<Long>(noOfThreads); 
		maximumBlockingOfAllThreads  = new ArrayList<Long>(noOfThreads); 
		averageBlockingOfAllThreads  = new ArrayList<Double>(noOfThreads); 

		/* Response time related parameters */
		worstCaseResponseTimetOfAllThreads = new ArrayList<Long>(noOfThreads); 
		bestCaseResponseTimetOfAllThreads = new ArrayList<Long>(noOfThreads);
		jitterInResponseTimetOfAllThreads = new ArrayList<Long>(noOfThreads);
		averageCaseResponseTimetOfAllThreads = new ArrayList<Double>(noOfThreads);

		/* Variance related parameters */
		varianceInExecutionTimeOfAllThreads = new ArrayList<Double>(noOfThreads); 
		varianceInArrivalTimeOfAllThreads = new ArrayList<Double>(noOfThreads); 
		varianceInBlockingOfAllThreads = new ArrayList<Double>(noOfThreads); 
		varianceInResponseTimeOfAllThreads = new ArrayList<Double>(noOfThreads); 
		
		counterScaleFactor = Integer.parseInt(Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.COUNTER_SCALE_FACTOR_INT));
		
		clockRate = clockRate*counterScaleFactor;
		
	}

	/**
	 * Compute parameters.
	 */
	public void ComputeParameters()
	{
		ComputeArrivalTimeRelatedParameters();
		ComputeExecutionTimeRelatedParameters();
	}
	
	/**
	 * Compute arrival time related parameters.
	 */
	private void ComputeArrivalTimeRelatedParameters() 
	{
		ArrayList<Long> arrivalTimeOfThread = new ArrayList<Long>(); 
		ArrayList<Long> responseTimeOfThread = new ArrayList<Long>(); 

		long previousWakeupTime = -1, currentWakeupTime = -1, lastSleepTime = -1 ;
		String threadID = null; 

		for(ArrayList<Event> threadEvents : threadSpecificEvents) // check each task 
		{
			threadID = threadIDs.get(threadSpecificEvents.indexOf(threadEvents));  
			ThreadEvents events = new ThreadEvents(threadID,threadEvents);

			for(Event event : events.GetWakeupEvents()) // check blocked events of a task 
			{
				currentWakeupTime = event.GetTimeStamp();  

				if(previousWakeupTime != (long)-1)
				{
					arrivalTimeOfThread.add(currentWakeupTime - previousWakeupTime); 

					lastSleepTime = events.GetLastSleepEventInGivenInterval(previousWakeupTime, currentWakeupTime);

					if(lastSleepTime !=-1)
					{
						responseTimeOfThread.add(lastSleepTime - previousWakeupTime);

						if(events.GetWakeupEvents().indexOf(event) == events.GetWakeupEvents().size()-1) // if there exists any sleep event after the last wakeup event 
						{
							lastSleepTime = events.FindLastSleepIfAnyAvailable(currentWakeupTime); 
							if(lastSleepTime != -1)
							{
								responseTimeOfThread.add(lastSleepTime - currentWakeupTime);
							}
						}
					}
					else 
						System.out.println("Warning: No Ready event and/or sleep event exists between two wakeup events \t "+ previousWakeupTime + "\t"+ currentWakeupTime);
				}
				previousWakeupTime = currentWakeupTime; 
			}

			// Writing all values in the file
			try 
			{
				WriteAllValuesInFile(arrivalTimeOfThread, traceExtractionPath, "InterArrivalTime_"+ threadID +".txt");
				WriteAllValuesInFile(responseTimeOfThread, traceExtractionPath, "ResponseTime_"+ threadID +".txt");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

			if(arrivalTimeOfThread.isEmpty())
			{
				minimumInterArrivalTimeOfAllThreads.add((long) 0.0);
				maximumInterArrivalTimeOfAllThreads.add((long) 0.0);
				averageInterArrivalTimeOfAllThreads.add(0.0);
				releaseJitterOfAllThreads.add((long) 0.0); 
				varianceInArrivalTimeOfAllThreads.add(0.0); 
			}
			else
			{
				minimumInterArrivalTimeOfAllThreads.add(Collections.min(arrivalTimeOfThread));
				maximumInterArrivalTimeOfAllThreads.add(Collections.max(arrivalTimeOfThread));
				averageInterArrivalTimeOfAllThreads.add( (double)Sum(arrivalTimeOfThread)/(double)arrivalTimeOfThread.size() );
				releaseJitterOfAllThreads.add(Collections.max(arrivalTimeOfThread)-Collections.min(arrivalTimeOfThread)); 
				varianceInArrivalTimeOfAllThreads.add(ComputeVariance(arrivalTimeOfThread)); 
			}

			if(responseTimeOfThread.isEmpty())
			{
				worstCaseResponseTimetOfAllThreads.add((long) 0.0); 
				bestCaseResponseTimetOfAllThreads.add((long) 0.0); 
				averageCaseResponseTimetOfAllThreads.add(0.0); 
				jitterInResponseTimetOfAllThreads.add((long)0.0);
				varianceInResponseTimeOfAllThreads.add(0.0); 
			}
			else 
			{
				worstCaseResponseTimetOfAllThreads.add(Collections.max(responseTimeOfThread)); 
				bestCaseResponseTimetOfAllThreads.add(Collections.min(responseTimeOfThread)); 
				averageCaseResponseTimetOfAllThreads.add(((double)Sum(responseTimeOfThread)/(double)responseTimeOfThread.size())); 
				jitterInResponseTimetOfAllThreads.add(Collections.max(responseTimeOfThread)-Collections.min(responseTimeOfThread)); 
				varianceInResponseTimeOfAllThreads.add(ComputeVariance(responseTimeOfThread)); 
			}
			previousWakeupTime = -1;
			currentWakeupTime = -1; 
			arrivalTimeOfThread.clear();
			responseTimeOfThread.clear();
		}
	}

	/**
	 * Compute execution time related parameters.
	 */
	private void ComputeExecutionTimeRelatedParameters()
	{
		boolean flag = false; 
		long blockedTime = 0, executionTime = 0; 

		Event currentEvent = null, previousEvent = null; 

		ArrayList<Long> executionTimeOfThread = new ArrayList<Long>();
		ArrayList<Long> blockingTimeOfThread = new ArrayList<Long>();

		for(ArrayList<Event> threadEvents : threadSpecificEvents) // check each task 
		{
			for(Event event: threadEvents)
			{ 
				currentEvent = event; 

				if(currentEvent.GetEventID() == EventType.wakeupEventID || (currentEvent.GetEventID() == EventType.readyEventID && flag == false))
				{
					flag = true;
					blockedTime = 0; 
					executionTime = 0; 
				}
				else if(currentEvent.GetEventID() == EventType.runningEventID && flag == true)
				{
					if(previousEvent.GetEventID() == EventType.readyEventID || previousEvent.GetEventID() == EventType.blockedEventID || previousEvent.GetEventID() == EventType.wakeupEventID)
					{
						blockedTime+= (currentEvent.GetTimeStamp() - previousEvent.GetTimeStamp()); 
					}
					else if(previousEvent.GetEventID() == EventType.runningEventID)
					{
						executionTime += (currentEvent.GetTimeStamp() -previousEvent.GetTimeStamp()); 
					}
					else if(blockedTime!=0 )
					{
						System.out.print("Warning: Strange previous event: \t");
						previousEvent.PrintEvent();
						System.out.print("before current event: \t");
						currentEvent.PrintEvent();
					}
				}
				else if((currentEvent.GetEventID() == EventType.readyEventID || currentEvent.GetEventID() == EventType.blockedEventID) && flag == true)
				{
					if(previousEvent.GetEventID() == EventType.runningEventID)
					{
						executionTime+= (currentEvent.GetTimeStamp() -previousEvent.GetTimeStamp()); 
					}
					else if( (previousEvent.GetEventID() == EventType.readyEventID || previousEvent.GetEventID() == EventType.blockedEventID || previousEvent.GetEventID() == EventType.wakeupEventID))
					{
						blockedTime+= (currentEvent.GetTimeStamp() -previousEvent.GetTimeStamp()); 
					}
					else
					{
						System.out.print("Warning: Strange previous event:");
						previousEvent.PrintEvent();
						System.out.print("before current event:");
						currentEvent.PrintEvent();
					}
				}
				else if(currentEvent.GetEventID() == EventType.sleepEventID && flag == true)
				{
					if(previousEvent.GetEventID() == EventType.runningEventID)
					{
						executionTime += (currentEvent.GetTimeStamp() -previousEvent.GetTimeStamp()); 
					}
					else if((executionTime!=0) && (previousEvent.GetEventID() == EventType.readyEventID || previousEvent.GetEventID() == EventType.blockedEventID))
					{
						//blockedTime+= (currentEvent.GetTimeStamp() -previousEvent.GetTimeStamp()); // rescheduling followed by completion of job is not included in blocking
					}
					else
					{
						System.out.print("Warning: Strange previous event:");
						previousEvent.PrintEvent();
						System.out.print("before current event:");
						currentEvent.PrintEvent();
						//let's consider wakeup and sleep events...
						executionTime += (currentEvent.GetTimeStamp() -previousEvent.GetTimeStamp()); 
					} 
					executionTimeOfThread.add(executionTime); 
					blockingTimeOfThread.add(blockedTime); 

					blockedTime = 0; 
					executionTime = 0; 
					flag = false; 
				}
				previousEvent = currentEvent; 
			}

			// Writing all values in the file
			try 
			{
				WriteAllValuesInFile(blockingTimeOfThread,  traceExtractionPath, "BlockingTime_"+threadIDs.get(threadSpecificEvents.indexOf(threadEvents))+".txt");
				WriteAllValuesInFile(executionTimeOfThread, traceExtractionPath, "Executiontime_"+threadIDs.get(threadSpecificEvents.indexOf(threadEvents))+".txt");
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

			if(executionTimeOfThread.isEmpty())
			{
				wcetOfAllThreads.add((long) 0.0);
				bcetOfAllThreads.add((long) 0.0);
				acetOfAllThreads.add(0.0);
				varianceInExecutionTimeOfAllThreads.add(0.0); 
			}
			else 
			{
				wcetOfAllThreads.add(Collections.max(executionTimeOfThread));
				bcetOfAllThreads.add(Collections.min(executionTimeOfThread));
				acetOfAllThreads.add(((double)Sum(executionTimeOfThread)/(double)executionTimeOfThread.size()));
				varianceInExecutionTimeOfAllThreads.add(ComputeVariance(executionTimeOfThread)); 
			}

			if(blockingTimeOfThread.isEmpty())
			{
				maximumBlockingOfAllThreads.add((long) 0.0); 
				minimumBlockingOfAllThreads.add((long) 0.0); 
				averageBlockingOfAllThreads.add(0.0);
				varianceInBlockingOfAllThreads.add(0.0);
			}
			else 
			{
				maximumBlockingOfAllThreads.add(Collections.max(blockingTimeOfThread)); 
				minimumBlockingOfAllThreads.add(Collections.min(blockingTimeOfThread)); 
				averageBlockingOfAllThreads.add(((double)Sum(blockingTimeOfThread)/(double)blockingTimeOfThread.size()));
				varianceInBlockingOfAllThreads.add(ComputeVariance(blockingTimeOfThread)); 
			}

			//	Initializing all variables 
			executionTimeOfThread.clear();
			blockingTimeOfThread.clear();
			blockedTime = -1; 
			executionTime = -1; 
			currentEvent = null; 
			previousEvent = null;
			flag = false; 
		}
	}

	/**
	 * Compute variance.
	 *
	 * @param listOfValues the list of values
	 * @return the double
	 */
	private double ComputeVariance(ArrayList<Long> listOfValues) 
	{
		double variance = 0;
		double sumOfSquaredValues = 0, sumValues = 0;
		double size = (double) listOfValues.size(); 
		for(double x: listOfValues)
		{
			sumOfSquaredValues += Math.pow(x,2); 
			sumValues += x; 
		}
		variance = ((1/size)*sumOfSquaredValues) - (Math.pow(((1/size)*sumValues),2)); 
		return variance ;
	}

	/**
	 * Sum.
	 *
	 * @param values the values
	 * @return the long
	 */
	private long Sum(ArrayList<Long> values) 
	{
		long total = 0; 
		for(long v : values)
		{
			total += v;
		}
		return total;
	}
	
	/**
	 * Write all values in file.
	 *
	 * @param parameter the parameter
	 * @param path the path
	 * @param fileName the file name
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void WriteAllValuesInFile(ArrayList<Long> parameter, IFolder path, String fileName) throws IOException
	{

		IFile outputFile = path.getProject().getFile(path.getProjectRelativePath()+ File.separator +fileName);
		FileWriter fstream = new FileWriter(outputFile.getLocation().toOSString());
		BufferedWriter out = new BufferedWriter(fstream);

		for(long element : parameter)
		{ 
			out.write((double)element/clockRate+"\n"); 
		}
		out.close();	
	}
	
	/**
	 * ***************
	 *  Getters
	 * **************.
	 *
	 * @return the array list
	 */

	public ArrayList<Long> GetMinimumInterArrivalTimeOfAllThreads()
	{
		return minimumInterArrivalTimeOfAllThreads; 
	}

	/**
	 * Gets the maximum inter arrival time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetMaximumInterArrivalTimeOfAllThreads()
	{
		return maximumInterArrivalTimeOfAllThreads; 
	}

	/**
	 * Gets the release jitter of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetReleaseJitterOfAllThreads()
	{
		return releaseJitterOfAllThreads; 
	}

	/**
	 * Gets the WCET of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetWCETOfAllThreads()
	{
		return wcetOfAllThreads; 
	}

	/**
	 * Gets the BCET of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetBCETOfAllThreads()
	{
		return bcetOfAllThreads; 
	}

	/**
	 * Gets the ACET of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetACETOfAllThreads()
	{
		return acetOfAllThreads; 
	}

	/**
	 * Gets the worst case response time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetWorstCaseResponseTimeOfAllThreads()
	{
		return worstCaseResponseTimetOfAllThreads;  
	}

	/**
	 * Gets the best case response time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetBestCaseResponseTimeOfAllThreads()
	{
		return bestCaseResponseTimetOfAllThreads;  
	}

	/**
	 * Gets the average case response time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetAverageCaseResponseTimeOfAllThreads()
	{
		return averageCaseResponseTimetOfAllThreads;  
	}

	/**
	 * Gets the maximum blocking time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetMaximumBlockingTimeOfAllThreads()
	{
		return maximumBlockingOfAllThreads;   
	}

	/**
	 * Gets the minimum blocking time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetMinimumBlockingTimeOfAllThreads()
	{
		return minimumBlockingOfAllThreads;  
	}

	/**
	 * Gets the average blocking time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetAverageBlockingTimeOfAllThreads()
	{
		return averageBlockingOfAllThreads;  
	}

	/**
	 * Gets the variance in blocking time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetVarianceInBlockingTimeOfAllThreads()
	{
		return varianceInBlockingOfAllThreads;  
	}

	/**
	 * Gets the variance in execution time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetVarianceInExecutionTimeOfAllThreads()
	{
		return varianceInExecutionTimeOfAllThreads;  
	}

	/**
	 * Gets the variance in arrival time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetVarianceInArrivalTimeOfAllThreads()
	{
		return varianceInArrivalTimeOfAllThreads;  
	}

	/**
	 * Gets the variance in response time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetVarianceInResponseTimeOfAllThreads()
	{
		return varianceInResponseTimeOfAllThreads;  
	}

	/**
	 * Gets the jitter in response timet of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Long> GetJitterInResponseTimetOfAllThreads()
	{
		return jitterInResponseTimetOfAllThreads; 
	}

	/**
	 * Gets the average inter arrival time of all threads.
	 *
	 * @return the array list
	 */
	public ArrayList<Double> GetAverageInterArrivalTimeOfAllThreads() {
		return averageInterArrivalTimeOfAllThreads;
	}
	
	/**
	 * Gets the counter scale factor.
	 *
	 * @return the counter scale factor
	 */
	public Integer getCounterScaleFactor(){
		return counterScaleFactor;
	}
}