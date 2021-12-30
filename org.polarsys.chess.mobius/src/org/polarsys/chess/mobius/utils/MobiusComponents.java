/*********************************************************************
* Copyright (c) 2019 Intecs Solutions SpA
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors: 
*   Intecs Solutions - Initial API and implementation
*   
**********************************************************************/

package org.polarsys.chess.mobius.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Classifier;

/**
 * The Class MobiusComponents.
 */
public class MobiusComponents {

	/** The atomic blocks. */
	private List<Classifier> atomicBlocks;
	
	/** The composed blocks. */
	private List<Classifier> composedBlocks;
	
	/**
	 * Instantiates a new mobius components.
	 */
	public MobiusComponents(){
		atomicBlocks = new ArrayList<>();
		composedBlocks = new ArrayList<>();
	}
	
	/**
	 * Gets the atomic blocks.
	 *
	 * @return the atomic blocks
	 */
	public List<Classifier> getAtomicBlocks() {
		return atomicBlocks;
	}
	
	/**
	 * Sets the atomic blocks.
	 *
	 * @param atomicBlocks the new atomic blocks
	 */
	public void setAtomicBlocks(List<Classifier> atomicBlocks) {
		this.atomicBlocks = atomicBlocks;
	}
	
	/**
	 * Gets the composed blocks.
	 *
	 * @return the composed blocks
	 */
	public List<Classifier> getComposedBlocks() {
		return composedBlocks;
	}
	
	/**
	 * Sets the composed blocks.
	 *
	 * @param composedBlocks the new composed blocks
	 */
	public void setComposedBlocks(List<Classifier> composedBlocks) {
		this.composedBlocks = composedBlocks;
	}
}
