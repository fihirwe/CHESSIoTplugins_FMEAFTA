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
 * The Class Bin.
 */
public class Bin {
	
	/** The id. */
	private Integer id;
	
	/** The size. */
	private Float size = 1.0f; // only homogeneous multiprocessing in CONCERTO
	
	/** The capacity. */
	private Float capacity = 0.0f;
	
	/** The level. */
	private Integer level = new Integer(-1); // needed for RUN packing, default is leaf node
	
	/**
	 * Gets the level.
	 *
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * Sets the level.
	 *
	 * @param level the new level
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the capacity.
	 *
	 * @param capacity the new capacity
	 */
	public void setCapacity(Float capacity) {
		this.capacity = capacity;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public Float getSize() {
		return size;
	}

	/**
	 * Gets the capacity.
	 *
	 * @return the capacity
	 */
	public Float getCapacity() {
		return capacity;
	}

	/**
	 * Instantiates a new bin.
	 *
	 * @param id the id
	 */
	public Bin(Integer id) {
		super();
		this.id = id;
	}

}
