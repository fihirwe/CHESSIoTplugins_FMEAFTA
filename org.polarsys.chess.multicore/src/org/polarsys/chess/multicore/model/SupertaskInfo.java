/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
/*------------------------------------------------------------------------------
  -
  - Copyright (c) 2015-2016 University of Padova, ITALY -  Intecs SpA 
  - All rights reserved. This program and the accompanying materials
  - are made available under the terms of the Eclipse Public License v2.0
  - which accompanies this distribution, and is available at
  - http://www.eclipse.org/legal/epl-v20.html
  -
  - Contributors:
  -
  - Alessandro Zovi azovi@math.unipd.it
  - Stefano Puri stefano.puri@intecs.it
  - Laura Baracchi laura.baracchi@intecs.it
  - Nicholas Pacini nicholas.pacini@intecs.it  
  -
  - Initial API and implementation and/or initial documentation
  ------------------------------------------------------------------------------*/package org.polarsys.chess.multicore.model;

import org.eclipse.uml2.uml.InstanceSpecification;

/**
 * The Class SupertaskInfo.
 */
public class SupertaskInfo {

	/** The name. */
	private String name;
	
	/** The capacity. */
	private int capacity;
	
	/** The processor instance. */
	private InstanceSpecification processorInstance;

	/**
	 * Instantiates a new supertask info.
	 *
	 * @param processorInstance the processor instance
	 * @param name the name
	 * @param capacity the capacity
	 */
	public SupertaskInfo(InstanceSpecification processorInstance, String name, float capacity) {
		super();
		this.setName(name);
		this.setCapacity(capacity);
		this.setProcessorInstance(processorInstance);
	}

	/**
	 * Gets the capacity.
	 *
	 * @return the capacity
	 */
	public float getCapacity() {
		return capacity;
	}

	/**
	 * Convert capacity from a float to a int value representing the percentage of
	 * utilization of the processor.
	 *
	 * @param capacity the new capacity
	 */
	public void setCapacity(float capacity) {
		this.capacity = Math.round(capacity*100);
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the processor instance.
	 *
	 * @return the processor instance
	 */
	public InstanceSpecification getProcessorInstance() {
		return processorInstance;
	}

	/**
	 * Sets the processor instance.
	 *
	 * @param processorInstance the new processor instance
	 */
	public void setProcessorInstance(InstanceSpecification processorInstance) {
		this.processorInstance = processorInstance;
	}

}
