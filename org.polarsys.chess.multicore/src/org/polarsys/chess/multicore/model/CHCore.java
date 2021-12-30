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

import org.eclipse.uml2.uml.InstanceSpecification;
import org.polarsys.chess.chessmlprofile.Predictability.DeploymentConfiguration.HardwareBaseline.CH_HwProcessor;


/**
 * The Class CHCore.
 *
 * @author Alessandro Zovi
 * 
 * CHCore represents the tuple <processor, core>.
 */
public final class CHCore {

	/** The processor. */
	private CH_HwProcessor processor;
	
	/** The name. */
	private String name;

	/**
	 * Instantiates a new CH core.
	 *
	 * @param processor the processor
	 * @param coreName the core name
	 */
	public CHCore(CH_HwProcessor processor, String coreName) {
		
		if (processor.getBase_InstanceSpecification() == null)
			throw new RuntimeException("Core can be instanced only by an InstanceSpecification!");
		
		this.processor = processor;
		this.name = coreName;
	}

	
	/**
	 * Gets the processor.
	 *
	 * @return the processor
	 */
	public CH_HwProcessor getProcessor() {
		return processor;
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
	 * Gets the qualified name.
	 *
	 * @return the qualified name
	 */
	public String getQualifiedName() {
		
		StringBuilder sb = new StringBuilder();
		return sb.append(processor.getBase_InstanceSpecification().getName()).append('_').append(name).toString();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CHCore)) return false;
		if(obj == this) return true;
		
		CHCore that = (CHCore) obj;
		return processor.getBase_InstanceSpecification().getName().equals(that.processor.getBase_InstanceSpecification().getName()) && name.equals(that.name);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getQualifiedName();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		 return Arrays.hashCode(new Object[] {
				 processor.getBase_InstanceSpecification().getName().hashCode(),
		         name.hashCode(),
		    });
	}


	/**
	 * Gets the processor instance.
	 *
	 * @return the processor instance
	 */
	public InstanceSpecification getProcessorInstance() {
		return processor.getBase_InstanceSpecification();
	}
}
