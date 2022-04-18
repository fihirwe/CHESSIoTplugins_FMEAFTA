/*
-----------------------------------------------------------------------
--          			CHESS validator plugin					     --
--                                                                   --
--                    Copyright (C) 2011-2012                        --
--                 University of Padova, ITALY                       --
--                                                                   --
-- Author: Alessandro Zovi         azovi@math.unipd.it 		         --
--                                                                   --
-- All rights reserved. This program and the accompanying materials  --
-- are made available under the terms of the Eclipse Public License  --
-- v1.0 which accompanies this distribution, and is available at     --
-- http://www.eclipse.org/legal/epl-v20.html                         --
-----------------------------------------------------------------------
*/

package org.polarsys.chess.validator.managers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.core.constraint.PreferenceProperties;
import org.polarsys.chess.core.util.CHESSProjectSupport;
import org.polarsys.chess.core.views.DiagramStatus.DesignView;
import org.polarsys.chess.validator.Activator;
import org.polarsys.chess.validator.messages.Messages;

// TODO: Auto-generated Javadoc
/**
 * ViewManager is a singleton class which provides the data structure which
 * contains the view-diagram association. Each CHESS view owns a list of types
 * of diagram that view is allowed to expose and modify.
 */
public class DiagramChecker {

	Set<String> supportedDiagrams = new HashSet<String>(Arrays.asList("BlockDefinition","RequirementDiagram","InternalBlock","PapyrusUMLStateMachineDiagram")); 
	
	/** The class diagram kind. */
	public static String classDiagramKind = "PapyrusUMLClassDiagram";

	/** The instance. */
	private static DiagramChecker instance = new DiagramChecker();

	/**
	 * Load view manager.
	 *
	 * @return the single ViewManager instance
	 */
	public static DiagramChecker loadDiagramChecker() {
		return instance;
	}

	/**
	 * Check constraints concerning view ownership of diagrams. A diagram must
	 * be created as a child of a view which allows its creation
	 *
	 * @param diagram
	 *            the Diagram about to be created
	 * @param s
	 *            the StringBuffer used to store messages to be printed to the
	 *            CHESSConsole
	 * @param currentView
	 *            the CHESS current view
	 * @param domain
	 *            the TransactionalEditingDomain domain of the diagram
	 * @throws RollbackException
	 *             in case of DynamicConstraint failure
	 */
	public void check(Diagram diagram, StringBuffer s, DesignView currentView, TransactionalEditingDomain domain)
			throws RollbackException {

		
		Boolean checkDiagramType = org.polarsys.chess.core.Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceProperties.SUPPORTED_DIAGRAM);
		
		if(checkDiagramType){
			if (!hasSupportedType(diagram)) {
				s.append(Messages.error_diagramSupportType);
				throw new RollbackException(
						new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.error_diagramSupportType));
			}
		}
		
		Boolean checkDiagramInView = org.polarsys.chess.core.Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceProperties.DIAGRAM_IN_VIEW);

		System.out.println("diagram: "+diagram);
		
		if (checkDiagramInView) {
			/*
			 * @dynamicConstraint D_1 if the diagram is created in the root of
			 * the model
			 */
			if (diagram.getElement() instanceof Model) {
				//s.append(Messages.error_diagramInView);
				throw new RollbackException(
						new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.error_diagramInView));
			} else {
				/*
				 * dynamicConstraint D_2 A diagram must be created as a child of
				 * a view which allows its creation
				 */
				if (!currentView.isDiagramAllowed(diagram)) {
					//CHESSProjectSupport.printlnToCHESSConsole(s.toString());
					throw new RollbackException(
							new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.error_diagramCurrentView)); // $NON-NLS-1$
				}
				//
			}
		}

	}

	private boolean hasSupportedType(Diagram diagram) {
		String diagramType = diagram.getType();
		System.out.println("diagramType: "+diagramType);
		return supportedDiagrams.contains(diagramType);
	}

};