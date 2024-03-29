/*------------------------------------------------------------------------------
 -
 - Copyright (c) 2013, 2015 Intecs SpA 
 - All rights reserved. This program and the accompanying materials
 - are made available under the terms of the Eclipse Public License v2.0
 - which accompanies this distribution, and is available at
 - http://www.eclipse.org/legal/epl-v20.html
 -
 - Contributors:
 - 
 - Stefano Puri stefano.puri@intecs.it
 -  
 - Initial API and implementation and/or initial documentation
 ------------------------------------------------------------------------------*/
package org.polarsys.chess.xtext.global.utils;


public class XtextUtils {
	
	/**
	 * context elements for XText grammar scope.
	 */

	private static Object contextElement;

	
	public static Object getContextElement() {
		return contextElement;
	}
	public static void setContextElement(Object element) {
//		System.err.println("---------------------"+element.toString());
		XtextUtils.contextElement = element;
	}
	
}
