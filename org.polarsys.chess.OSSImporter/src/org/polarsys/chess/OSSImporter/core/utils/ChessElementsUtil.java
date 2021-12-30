/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *   Alberto Debiasi - initial API and implementation
 *   Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.OSSImporter.core.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.navigation.service.ExtendedNavigableElement;
import org.eclipse.papyrus.infra.services.navigation.service.NavigableElement;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationService;
import org.eclipse.papyrus.infra.services.viewersearch.impl.ViewerSearchService;
import org.eclipse.papyrus.sysml.portandflows.FlowDirection;
import org.eclipse.papyrus.sysml.portandflows.FlowPort;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.polarsys.chess.contracts.profile.chesscontract.ContractProperty;
import org.polarsys.chess.contracts.profile.chesscontract.FormalProperty;
import org.polarsys.chess.contracts.profile.chesscontract.util.ContractEntityUtil;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;
import org.polarsys.chess.service.core.model.ChessSystemModel;

public class ChessElementsUtil {

	// Logger for messages
	private static final Logger logger = Logger.getLogger(ChessElementsUtil.class);

	private final ChessSystemModel chessSystemModel = ChessSystemModel.getInstance();
	private final EntityUtil entityUtil = EntityUtil.getInstance();
	private final ContractEntityUtil contractEntityUtil = ContractEntityUtil.getInstance();
	private static ChessElementsUtil chessElementsUtilInstance;

	/**
	 * Gets an instance of the class if already present, or a new one if not.
	 * 
	 * @return the instance of this class
	 */
	public static ChessElementsUtil getInstance() {
		if (chessElementsUtilInstance == null) {
			chessElementsUtilInstance = new ChessElementsUtil();
		}
		return chessElementsUtilInstance;
	}

	public void updateUmlFunctionBehaviour(FunctionBehavior functionBehavior, EList<Type> inputTypes,EList<String[]> inputMultiplicities,
			Type outputType,String[] outputMultiplicity, HashMap<String, Boolean> mapFunctionBehaviorsToKeep) {

		// Get all the existing parameters of the functionBehavior
		final EList<org.eclipse.uml2.uml.Parameter> existingFunctionBehaviorParameters = functionBehavior
				.getOwnedParameters();

		// Stategy here is a little different. Remove all the parameters
		// and add them from scratch

		final EList<org.eclipse.uml2.uml.Parameter> toRemoveFunctionBehaviorParameters = new BasicEList<org.eclipse.uml2.uml.Parameter>(
				existingFunctionBehaviorParameters);

		// Remove all the existing parameters
		for (org.eclipse.uml2.uml.Parameter parameter : toRemoveFunctionBehaviorParameters) {
			entityUtil.removeFunctionBehaviorParameter(existingFunctionBehaviorParameters,
					parameter.getQualifiedName());
		}
		entityUtil.createUmlFunctionBehaviorParameters(functionBehavior, inputTypes, inputMultiplicities, outputType, outputMultiplicity);
		

		// Old code that tries to solve it in a different manner
		// // Prepare the map to mark existing parameters
		// final HashMap<String, Boolean> mapFunctionBehaviorParameters
		// =
		// Maps.newHashMapWithExpectedSize(existingFunctionBehaviorParameters.size());
		// for (org.eclipse.uml2.uml.Parameter parameter :
		// existingFunctionBehaviorParameters) {
		// mapFunctionBehaviorParameters.put(parameter.getQualifiedName(),
		// null);
		// }
		//
		// org.eclipse.uml2.uml.Parameter parameter = null;
		//
		// // Check the input parameters
		// for (SimpleType parameterType : parameters) {
		// if ((parameter =
		// chessElementsUtil.getExistingFunctionBehaviorParameter(existingFunctionBehaviorParameters,
		// parameterType, true)) != null) {
		// mapFunctionBehaviorParameters.put(parameter.getQualifiedName(),
		// Boolean.TRUE);
		// logger.debug("functionBehavior input parameter already
		// present");
		// } else {
		// logger.debug("functionBehavior input parameter is not
		// present");
		//
		// // Create the input parameter
		// chessElementsUtil.createFunctionBehaviorParameter(functionBehavior,
		// parameterType, true);
		// }
		// }
		//
		// // Check the output parameter
		// if ((parameter =
		// chessElementsUtil.getExistingFunctionBehaviorParameter(existingFunctionBehaviorParameters,
		// dslVariableType, false)) != null) {
		// logger.debug("functionBehavior output parameter already
		// present");
		// mapFunctionBehaviorParameters.put(parameter.getQualifiedName(),
		// Boolean.TRUE);
		// } else {
		// logger.debug("functionBehavior output parameter is not
		// present");
		//
		// // Create the output parameter
		// chessElementsUtil.createFunctionBehaviorParameter(functionBehavior,
		// dslVariableType, false);
		// }
		//
		// // Parameters cleanup time
		// for (String qualifiedElement :
		// mapFunctionBehaviorParameters.keySet()) {
		// if (mapFunctionBehaviorParameters.get(qualifiedElement) ==
		// null) {
		// System.out.println("functionBehaviorParameter " +
		// qualifiedElement + " should be removed");
		// chessElementsUtil.removeFunctionBehaviorParameter(existingFunctionBehaviorParameters,
		// qualifiedElement);
		// }
		// }

		// Set the flag to signal the functionBehavior is still used
		mapFunctionBehaviorsToKeep.put(functionBehavior.getQualifiedName(), Boolean.TRUE);
	}

	// checked methods
	public void updateUmlStaticPort(org.eclipse.uml2.uml.Port port, String[] newMultiplicityRange,
			HashMap<String, Boolean> mapPortsToKeep) {

		// Update its multiplicity if needed
		entityUtil.updateUmlStaticPort(port, newMultiplicityRange);

		// Set the flag to signal the port is still used
		mapPortsToKeep.put(port.getQualifiedName(), Boolean.TRUE);
	}

	public void updateUmlNonStaticPort(org.eclipse.uml2.uml.Port port, eu.fbk.tools.editor.oss.oss.Port ossPort,
			Type newType, String[] newMultiplicityRange, FlowDirection portDirection, Stereotype flowPortStereotype,
			HashMap<String, Boolean> mapPortsToKeep) {

		// Port found, update its direction if needed
		final FlowPort flowPort = (FlowPort) port.getStereotypeApplication(flowPortStereotype);
		if (flowPort.getDirection() != portDirection) {
			flowPort.setDirection(portDirection);
		}

		// Update its type if needed
		entityUtil.updateUmlNonStaticPort(port, newType, newMultiplicityRange);
		
		// Set the flag to signal the port is still used
		mapPortsToKeep.put(port.getQualifiedName(), Boolean.TRUE);

		// Add the port to the list of changes NOT NEEDED BECAUSE
		// DIAGRAMS ARE AUTO-UPDATING
		// addedElements.add(port);
	}

	public void updateUmlRefinementFormalProperty(Constraint umlConstraint, String updatedText, String language,
			HashMap<String, Boolean> mapFormalPropertiesToKeep) {

		// Update the formal property if needed
		entityUtil.updateUmlConstraint(umlConstraint, updatedText, language);

		// Set the flag to signal the formal property is
		// still used
		mapFormalPropertiesToKeep.put(umlConstraint.getQualifiedName(), Boolean.TRUE);
	}

	public void updateUmlFormalProperty(Constraint umlConstraint, String assertionText,String language,
			HashMap<String, FormalProperty> hashFormalProperties, HashMap<String, Boolean> mapFormalPropertiesToKeep) {

		// Update the formal property if needed
		final String formalPropertyText = entityUtil.getConstraintBodyStr(umlConstraint,language);

		// If the expression is different, save it, otherwise go on
		if (!assertionText.equals(formalPropertyText)) {
			entityUtil.setTextInUMLConstraint(umlConstraint, assertionText, language);
		}

		// Set the flag to signal the formal property is still used
		mapFormalPropertiesToKeep.put(umlConstraint.getQualifiedName(), Boolean.TRUE);
	}

	public void updateUmlContract(Class umlContract, String ossAssumptionText, String ossGuaranteeText, String language,
			HashMap<String, FormalProperty> hashFormalProperties, HashMap<String, Boolean> mapContractPropertiesToKeep, 
			HashMap<String, Boolean> mapFormalPropertiesToKeep, Class owner) {

		final org.polarsys.chess.contracts.profile.chesscontract.Contract contract = 
				contractEntityUtil.getContract(umlContract);		
		final FormalProperty contractAssumption = contract.getAssume();
		final FormalProperty contractGuarantee = contract.getGuarantee();

		// Check if the assumption formal property is already present in the hash
		final FormalProperty hashAssumption = hashFormalProperties.get(ossAssumptionText);
		if (hashAssumption != null) {
			logger.debug("assumption already present in the hash = " + hashAssumption);

			// Check if the assumption is different from the one already set
			if (hashAssumption != contractAssumption) {
				
				// Check if the current assumption is child of the contract. If so, it can be removed
				if (contractAssumption.getBase_Constraint().getOwner() == contract.getBase_Class()) {			
				
					// The old assumption needs to be removed from the contract
					final EList<Constraint> fpList = new BasicEList<Constraint>();
					fpList.add(contractAssumption.getBase_Constraint());
					entityUtil.removeFormalProperty(fpList, contractAssumption.getBase_Constraint().getQualifiedName());
				}
								
				// Set the new assumption
				contract.setAssume(hashAssumption);
			}
		} else {
			logger.debug("assumption not present in the hash");
			
			// Check if the current assumption is child of the contract. If so, it can be edited
			if (contractAssumption.getBase_Constraint().getOwner() == contract.getBase_Class()) {
			
				// The assumption is the same, update it if needed				
				entityUtil.updateUmlConstraint(contractAssumption.getBase_Constraint(), ossAssumptionText, language);
			} else {
				
				// The assumption is a block formal property, cannot be modified or removed
				// A new one has to be created
				contractEntityUtil.createAssumptionToUmlContract(umlContract);
				final FormalProperty assumptionFormalProperty = contractEntityUtil.getAssumeFromUmlContract(umlContract);
				entityUtil.setTextInUMLConstraint(assumptionFormalProperty.getBase_Constraint(), ossAssumptionText, language);
			}			
		}
		
		// Check if the guarantee formal property is already present in the hash
		final FormalProperty hashGuarantee = hashFormalProperties.get(ossGuaranteeText);
		if (hashGuarantee != null) {
			logger.debug("guarantee already present in the hash = " + hashGuarantee);

			// Check if the guarantee is different from the one already set
			if (hashGuarantee != contractGuarantee) {
				
				// Check if the current guarantee is child of the contract. If so, it can be removed
				if (contractGuarantee.getBase_Constraint().getOwner() == contract.getBase_Class()) {			
				
					// The old guarantee needs to be removed from the contract
					final EList<Constraint> fpList = new BasicEList<Constraint>();
					fpList.add(contractGuarantee.getBase_Constraint());
					entityUtil.removeFormalProperty(fpList, contractGuarantee.getBase_Constraint().getQualifiedName());
				}
								
				// Set the new guarantee
				contract.setGuarantee(hashGuarantee);
			}
		} else {
			logger.debug("guarantee not present in the hash");
			
			// Check if the current guarantee is child of the contract. If so, it can be edited
			if (contractGuarantee.getBase_Constraint().getOwner() == contract.getBase_Class()) {
			
				// The guarantee is the same, update it if needed
				entityUtil.updateUmlConstraint(contractGuarantee.getBase_Constraint(), ossGuaranteeText, language);
			} else {
				
				// The guarantee is a block formal property, cannot be modified or removed
				// A new one has to be created
				contractEntityUtil.createGuaranteeToUmlContract(umlContract);
				final FormalProperty guaranteeFormalProperty = contractEntityUtil.getGuaranteeFromUmlContract(umlContract);
				entityUtil.setTextInUMLConstraint(guaranteeFormalProperty.getBase_Constraint(), ossGuaranteeText, language);
			}			
		}

		// Set the flag to signal the contractProperty is still used
		final ContractProperty contractProperty = (ContractProperty) chessSystemModel.getContract(owner,
				// dslContract.getName() should be the same
				umlContract.getName());
		mapContractPropertiesToKeep.put(contractProperty.getBase_Property().getQualifiedName(), Boolean.TRUE);
	}

	public void updateUmlAssociation(Property componentInstance, Type type, String[] ossSubComponentMultiplicity,
			HashMap<String, Boolean> mapComponentInstancesToKeep) throws Exception {

		entityUtil.updateUmlAssociation(componentInstance, type, ossSubComponentMultiplicity);

		// Set the flag to signal the componentInstance is still used
		mapComponentInstancesToKeep.put(componentInstance.getQualifiedName(), Boolean.TRUE);
	}

	public Constraint createUmlInterfaceFormalProperty(String assertionName, String assertionText,
			HashMap<String, FormalProperty> hashFormalProperties, Class owner) {

		Constraint umlConstraint = entityUtil.createInterfaceFormalProperty(owner, assertionName, assertionText);

		// Add the formal property to the hash
		hashFormalProperties.put(assertionName, entityUtil.getFormalProperty(umlConstraint));
		return umlConstraint;
	}

	public Class createUmlContract(String contractName, String ossAssumptionText, String ossGuaranteeText,
			HashMap<String, FormalProperty> hashFormalProperties, Class owner, Stereotype contractStereotype) {

		// Create an empty Contract
		Class umlContract = contractEntityUtil.createContract(owner, contractName, contractStereotype);
		org.polarsys.chess.contracts.profile.chesscontract.Contract contract = 
				contractEntityUtil.getContract(umlContract);

		// Check if the assumption formal property is already defined
		final FormalProperty assumption = hashFormalProperties.get(ossAssumptionText);
		if (assumption != null) {
			logger.debug("assumption already present = " + assumption);

			// Add the assume formal property
			contract.setAssume(assumption);
		} else {
			logger.debug("assumption not present");

			// Create a new formal property
			contractEntityUtil.setTextToAssumeOrCreateAssume(ossAssumptionText, umlContract);
		}

		// Check if the guarantee formal property is already defined
		final FormalProperty guarantee = hashFormalProperties.get(ossGuaranteeText);
		if (guarantee != null) {
			logger.debug("guarantee already present = " + guarantee);

			// Add the assume formal property
			contract.setGuarantee(guarantee);
		} else {
			logger.debug("guarantee not present");

			// Create a new formal property
			contractEntityUtil.setTextToGuaranteeOrCreateGuarantee(ossGuaranteeText, umlContract);
		}
		return umlContract;
	}
	
	/**
	 * Updates the expression of the given Macro Definition, if needed.
	 * @param umlConstraint the Macro Definition as Constraint
	 * @param macroDefinitionExpression the new expression
	 * @param mapMacroDefinitionsToKeep the map of existing Macro Definitions
	 */
	public void updateMacroDefinition(Constraint umlConstraint, String macroDefinitionExpression, String language,
			HashMap<String, Boolean> mapMacroDefinitionsToKeep) {

		entityUtil.updateMacroDefinition(umlConstraint, macroDefinitionExpression,language);

		// Set the flag to signal the macro definition is still used
		mapMacroDefinitionsToKeep.put(umlConstraint.getQualifiedName(), Boolean.TRUE);
	}
	
	/**
	 * Returns the list of diagrams in which the given element is present.
	 * @param members the list of members in which the element is present
	 * @param qualifiedElement the qualified name of element
	 * @return names of the diagrams
	 */
	public Set<String> getInvolvedDiagrams(EList<?> members, String qualifiedElement) {		
		final Set<String> diagramNames = new HashSet<String>();
		
		for (Object object : members) {
			NamedElement element = null;
			if (object instanceof NamedElement) {
				element = (NamedElement) object;
			} else if (object instanceof ContractProperty) {
				element = ((ContractProperty) object).getBase_Property();
			}
			if (element != null && element instanceof NamedElement) {
				if (element.getQualifiedName().equals(qualifiedElement)) {
					try {					
						NavigationService navigationService = null;
						try {
							final ServicesRegistry registry = ServiceUtilsForEObject.getInstance().getServiceRegistry(element);
							if (registry != null) {
								navigationService = registry.getService(NavigationService.class);
							}
						} catch (ServiceException e) {
							e.printStackTrace();
						}

						if (navigationService != null) {
							final List<NavigableElement> navigableElements = navigationService.getNavigableElements(element);
							if (navigableElements != null) {
								for (NavigableElement navigableElement : navigableElements) {
									final List<Object> viewsToSelect = getViewsToSelect(navigableElement, false);
									for (Object view : viewsToSelect) {
										diagramNames.add(getText(view));
									}
								}
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			} else {
				logger.debug("cannot find a reprentation for " + qualifiedElement);
			}
		}
		return diagramNames;	
	}
	
// The following code has been taken from these classes:
//	org.eclipse.papyrus.infra.gmfdiag.navigation.ui.DynamicNavigateLabelProvider
//	org.eclipse.papyrus.infra.gmfdiag.navigation.ui.DynamicNavigate
	
	protected static boolean isLocalLabelProvider;
	
	private static String getText(Object element) {
		if (element instanceof NavigableElement) {
			return ((NavigableElement) element).getLabel();
		} else if (element instanceof EObject) {
			return getName((EObject) element);
		}
		
		return element.toString();
	}
	
	private static String getName(EObject element) {
		ILabelProvider labelProvider = getLabelProvider((EObject) element);

		String name = labelProvider.getText(element);

		if (isLocalLabelProvider) {
			labelProvider.dispose();
		}
		
		if (name != null) {
			return name;
		} else {
			return element.toString();
		}
	}

	private static ILabelProvider getLabelProvider(EObject element) {
		ILabelProvider labelProvider = null;

		try {
			labelProvider = ServiceUtilsForEObject.getInstance().getService(LabelProviderService.class, element).getLabelProvider("org.eclipse.papyrus.infra.services.navigation.menu.labelprovider");
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		if (labelProvider == null) {
			labelProvider = new LabelProvider();
			isLocalLabelProvider = true;
		} else {
			isLocalLabelProvider = false;
		}
		
		return labelProvider;
	}
		
	/**
	 * Get views representing a navigable element
	 * 
	 * @param navElement
	 *        The navigable element represented in views
	 * @param onlyOpened
	 *        Only opened views are returned
	 * @return
	 *        List of views representing the navigable element
	 */
	private List<Object> getViewsToSelect(NavigableElement navElement, boolean onlyOpened) {
		if (navElement == null) {
			return null;
		}
		
		EObject element = null;
		if (navElement instanceof ExtendedNavigableElement
				&& ((ExtendedNavigableElement) navElement).getSemanticElement() instanceof EObject) {
			element = (EObject) ((ExtendedNavigableElement) navElement).getSemanticElement();
		}
		
		if (element != null) {
			ViewerSearchService viewerSearchService = null;
			
			try {
				viewerSearchService = ServiceUtilsForEObject.getInstance().getService(ViewerSearchService.class, element);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (viewerSearchService != null) {
				return viewerSearchService.getViewersInCurrentModel(element, null, false, onlyOpened);
			}
		}

		return new LinkedList<Object>();
	}	
}
