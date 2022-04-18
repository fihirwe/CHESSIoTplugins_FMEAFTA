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

import java.util.Arrays;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Parameter;
import org.polarsys.chess.chessmlprofile.Predictability.RTComponentModel.CHRtPortSlot;
import org.polarsys.chess.chessmlprofile.Predictability.RTComponentModel.CHRtSpecification;
import org.polarsys.chess.multicore.utils.QueryUtils;


/**
 * The Class CHTask.
 *
 * @author Alessandro Zovi
 * 
 * CHTask represents the instance of a component operation.
 * The operation can also be seen as a task, a shared resource or a simple procedure call.
 */

public final class CHTask {
	
	/** The slot. */
	private CHRtPortSlot slot;
	
	/** The spec. */
	private CHRtSpecification spec;

	/**
	 * Instantiates a new CH task.
	 *
	 * @param slot the slot
	 * @param spec the spec
	 */
	public CHTask(CHRtPortSlot slot, CHRtSpecification spec) {
		this.slot = slot;
		this.spec = spec;
	}
	
	/**
	 * Gets the slot.
	 *
	 * @return the slot
	 */
	public CHRtPortSlot getSlot() {
		return slot;
	}
	
	/**
	 * Gets the CH rt specification.
	 *
	 * @return the CH rt specification
	 */
	public CHRtSpecification getCHRtSpecification() {
		return spec;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//TODO it should take into consideration the multiplicity of the instances in Inst_full package
		return slot.getBase_Slot().getOwningInstance().getName() + "_" 
				+ slot.getBase_Slot().getDefiningFeature().getName() 
				+ "_" + spec.getContext().getName() + "(" +getType()+")";
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		//TODO it should take into consideration the multiplicity of the instances in Inst_full package
		return slot.getBase_Slot().getOwningInstance().getName() + "_" 
				+ slot.getBase_Slot().getDefiningFeature().getName() 
				+ "_" + getOpName(spec.getContext())+"_task";
	}
	
	/**
	 * Gets the op name.
	 *
	 * @param op the op
	 * @return the op name
	 */
	private String getOpName(BehavioralFeature op){
		StringBuilder sb = new StringBuilder(op.getName());
		for (Parameter par : op.getOwnedParameters()) {
			sb.append('_').append(par.getType().getName());
		}
		return sb.toString();
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType(){
		String type = "simple_operation";
		if(QueryUtils.isOccKindSporadicOrPeriodic(spec.getOccKind())){
			type = "task";
		} else if (QueryUtils.isGuarded(spec)){
			type = "shared_resource";
		}
		return type;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CHTask)) return false;
		if(obj == this) return true;
		
		CHTask that = (CHTask) obj;
		return toString().equals(that.toString());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		 return Arrays.hashCode(new Object[] {
				 slot.getBase_Slot().getOwningInstance().getName(),
				 slot.getBase_Slot().getDefiningFeature().getName(),
				 spec.getContext().getName()
		    });
	}
}
