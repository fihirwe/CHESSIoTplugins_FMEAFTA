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
  ------------------------------------------------------------------------------*/package org.polarsys.chess.multicore.partitioning;



/**
 * The Class Task.
 */
public class Task implements Comparable<Task> {
	
	/**
	 * The Enum Definition.
	 */
	private enum Definition{
		
		/** The defined c and t. */
		DEFINED_C_AND_T, 
 /** The defined u. */
 DEFINED_U
	}

	/** The id. */
	private String id;
	
	/** The definition. */
	private Definition definition;
	
	/** The c. */
	private Float c;
	
	/** The d. */
	private Float d;
	
	/** The t. */
	private Float t;
	
	/** The u. */
	private Float u;
	
	/** The offset. */
	private Float offset;
	
	/** The owner. */
	private Bin owner;
	
	/**
	 * Instantiates a new task.
	 *
	 * @param _name the name
	 * @param _c the c
	 * @param _d the d
	 * @param _t the t
	 * @param _offset the offset
	 * @param _owner the owner
	 */
	public Task(String _name,
			Float _c, Float _d, Float _t, Float _offset,
			Bin _owner) {
		

		this.id = _name;
		this.c = _c;
		this.d = _d;
		this.t = _t;
		this.definition = Definition.DEFINED_C_AND_T;
		this.offset = _offset;
		this.owner = _owner;
		
	}
	
	/**
	 * Instantiates a new task.
	 *
	 * @param _name the name
	 * @param _u the u
	 */
	// needed for RUN's supertasks
	public Task(String _name, Float _u){
		this.id = _name;
		this.u = _u;
		this.definition = Definition.DEFINED_U;
	}
	
//	public Task() {
//		super();
//	}
	
	/**
 * Sets the owner.
 *
 * @param owner the new owner
 */
public void setOwner(Bin owner) {
		this.owner = owner;
	}

	/**
	 * Sets the t.
	 *
	 * @param t the new t
	 */
	public void setT(Float t) {
		this.t = t;
	}

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	public Bin getOwner() {
		return owner;
	}

	/**
	 * Gets the t.
	 *
	 * @return the t
	 */
	public Float getT() {
		return t;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new String("(name, C, D, T, offset, owner)\n" +
				"("+ id +", "+ c +", "+ d +", "+ t +", "+ offset +", "+ owner +")");
	}
	
	/**
	 * Gets the u.
	 *
	 * @return the u
	 */
	public Float getU(){
		if(definition == Definition.DEFINED_U)
			return u;
		else
			return c/t;
	}
		
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Switch to dual.
	 */
	public void switchToDual(){
		if(definition == Definition.DEFINED_U)
			this.u = 1-u;
		else
			this.c = t-c;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Task o) {
		
		return this.getU().compareTo(o.getU());
	}


	

	

}

