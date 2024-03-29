/*
-----------------------------------------------------------------------
--          			CHESS core plugin							 --
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

package org.polarsys.chess.core.views;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.polarsys.chess.core.profiles.CHESSProfileManager;

/**
 * A collection of constants that defines the association between diagrams and design views and a mapping
 * from Papyrus diagram names to UML names used internally by CHESS permissions.
 *
 */
public class ViewDiagramAssociations {

	/** The UML diagrams. */
	private static Set<String> UMLDiagrams = new HashSet<String>();
	
	/** The SYSML diagrams. */
	private static Set<String> SYSMLDiagrams = new HashSet<String>();

	/** The view diagrams association. */
	public static HashMap<String, HashSet<String>> viewDiagramsAssociation = new HashMap<String, HashSet<String>>();

	/** The anydiagram. */
	public static String ANYDIAGRAM = "*";
	
	/** The class diagram. */
	public static String classDiagram = "PapyrusUMLClassDiagram";
	
	/** The composite diagram. */
	public static String compositeDiagram = "CompositeStructure";
	
	/** The activity diagram. */
	public static String activityDiagram = "PapyrusUMLActivityDiagram";
	
	/** The communication diagram. */
	public static String communicationDiagram = "PapyrusUMLCommunicationDiagram";
	
	
	/** The profile diagram. */
	public static String profileDiagram = "PapyrusUMLProfileDiagram";
	
	/** The sequence diagram. */
	public static String sequenceDiagram = "PapyrusUMLSequenceDiagram";
	
	/** The state machine diagram. */
	public static String stateMachineDiagram = "PapyrusUMLStateMachineDiagram";
	
	/** The use case diagram. */
	public static String useCaseDiagram = "UseCase";
	
	/** The block diagram. */
	public static String blockDiagram = "BlockDefinition";
	
	/** The internal block diagram. */
	public static String internalBlockDiagram = "InternalBlock";
	
	/** The parametric diagram. */
	public static String parametricDiagram = "Parametric";
	
	/** The requirement diagram. */
	public static String requirementDiagram = "RequirementDiagram";
	
	
	/** ADDED LATER The component diagram. */
	public static String componentDiagram = "PapyrusUMLComponentDiagram";
	
	
	/**
	 * Maps Papyrus diagram names to UML names used internally by CHESS permissions.
	 */
	public static HashMap<String, String> papyrusNames2Standard = new HashMap<String, String>(12);
	
	
	static {
		papyrusNames2Standard.put(classDiagram, "Class");
		papyrusNames2Standard.put(compositeDiagram, "Composite");
		papyrusNames2Standard.put(activityDiagram, "Activity");
		papyrusNames2Standard.put(communicationDiagram, "Communication");
		papyrusNames2Standard.put(profileDiagram, "Profile");
		papyrusNames2Standard.put(sequenceDiagram, "Sequence");
		papyrusNames2Standard.put(stateMachineDiagram, "StateMachine");
		papyrusNames2Standard.put(useCaseDiagram, "UseCase");
		papyrusNames2Standard.put(blockDiagram, "Block");
		papyrusNames2Standard.put(internalBlockDiagram, "InternalBlock");
		papyrusNames2Standard.put(parametricDiagram, "Parametric");
		papyrusNames2Standard.put(requirementDiagram, "Requirement");
		papyrusNames2Standard.put(componentDiagram, "Component");
		
		UMLDiagrams.add(activityDiagram);
		UMLDiagrams.add(communicationDiagram);
		UMLDiagrams.add("Package");//???
		UMLDiagrams.add(profileDiagram);
		UMLDiagrams.add(sequenceDiagram);
		UMLDiagrams.add(stateMachineDiagram);
		UMLDiagrams.add(classDiagram);
		UMLDiagrams.add(compositeDiagram);
		UMLDiagrams.add(useCaseDiagram);
		UMLDiagrams.add(componentDiagram);

		SYSMLDiagrams.add(blockDiagram);
		SYSMLDiagrams.add(internalBlockDiagram);
		SYSMLDiagrams.add(parametricDiagram);
		SYSMLDiagrams.add(requirementDiagram);

		// Diagrams allowed in Functional view , now Component View
		HashSet<String> componentViewDiagrams = new HashSet<String>();
		componentViewDiagrams.add(classDiagram);
		componentViewDiagrams.add(compositeDiagram);
		componentViewDiagrams.add(stateMachineDiagram);
		componentViewDiagrams.add(activityDiagram);
		componentViewDiagrams.add(sequenceDiagram);
		componentViewDiagrams.add(componentDiagram);
		
		//TODO DEBUG
		//componentViewDiagrams.add(communicationDiagram);
		
		viewDiagramsAssociation.put(CHESSProfileManager.COMPONENT_VIEW,
				componentViewDiagrams);

		// Diagrams allowed in Extra-functional view
//		viewDiagramsAssociation.put(CHESSProfileManager.EXTRAFUNCTIONAL_VIEW,
//				new HashSet<String>());

		// Diagrams allowed in Requirement view
		HashSet<String> requirementDiagrams = new HashSet<String>();
		requirementDiagrams.add(requirementDiagram);
		viewDiagramsAssociation.put(CHESSProfileManager.REQUIREMENT_VIEW,
				requirementDiagrams);

		// Diagrams allowed in Deployment view
		HashSet<String> deploymentDiagrams = new HashSet<String>();
		deploymentDiagrams.add(classDiagram);
		deploymentDiagrams.add(compositeDiagram);
		deploymentDiagrams.add(componentDiagram);
		deploymentDiagrams.add(stateMachineDiagram);
		viewDiagramsAssociation.put(CHESSProfileManager.DEPLOYMENT_VIEW,
				deploymentDiagrams);

		// TODO diagrams for RtAnalysisView to be defined
		HashSet<String> rtAnalysisDiagrams = new HashSet<String>();
		rtAnalysisDiagrams.add("PapyrusUMLActivityDiagram");
		// rtAnalysisDiagrams.add("PapyrusUMLCommunicationDiagram");
		rtAnalysisDiagrams.add("Package");
		// rtAnalysisDiagrams.add("PapyrusUMLProfileDiagram");
		rtAnalysisDiagrams.add("PapyrusUMLSequenceDiagram");
		rtAnalysisDiagrams.add("PapyrusUMLStateMachineDiagram");
		rtAnalysisDiagrams.add("PapyrusUMLClassDiagram");
		rtAnalysisDiagrams.add("CompositeStructure");
		rtAnalysisDiagrams.add("UseCase");
		viewDiagramsAssociation.put(CHESSProfileManager.RT_ANALYSIS_VIEW,
				rtAnalysisDiagrams);

		// TODO diagrams for DepAnalysisView to be defined
		HashSet<String> depAnalysisDiagrams = new HashSet<String>();
		depAnalysisDiagrams.add("PapyrusUMLActivityDiagram");
		// depAnalysisDiagrams("PapyrusUMLCommunicationDiagram");
		depAnalysisDiagrams.add("Package");
		// depAnalysisDiagrams("PapyrusUMLProfileDiagram");
		depAnalysisDiagrams.add("PapyrusUMLSequenceDiagram");
		depAnalysisDiagrams.add("PapyrusUMLStateMachineDiagram");
		depAnalysisDiagrams.add("PapyrusUMLClassDiagram");
		//depAnalysisDiagrams.add("classDiagramKind");
		depAnalysisDiagrams.add("CompositeStructure");
		depAnalysisDiagrams.add("UseCase");
		viewDiagramsAssociation.put(
				CHESSProfileManager.DEPENDABILITY_ANALYSIS_VIEW,
				depAnalysisDiagrams);

		// TODO diagrams for TimingDataFlowView to be defined
		HashSet<String> timingDataFlowDiagrams = new HashSet<String>();
		timingDataFlowDiagrams.addAll(UMLDiagrams);
		viewDiagramsAssociation.put(CHESSProfileManager.TIMING_DATAFLOW_VIEW,
				timingDataFlowDiagrams);
		
		//SystemView
		HashSet<String> systemDiagrams = new HashSet<String>();
		systemDiagrams.add(blockDiagram);
		systemDiagrams.add(internalBlockDiagram);
		systemDiagrams.add(stateMachineDiagram);
		systemDiagrams.add("CompositeStructure");
		viewDiagramsAssociation.put(CHESSProfileManager.SYSTEM_VIEW,
				systemDiagrams);
	}
}