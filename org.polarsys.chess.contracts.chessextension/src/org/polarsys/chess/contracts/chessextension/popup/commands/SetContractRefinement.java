/*******************************************************************************
 *
 * Copyright (c) 2013, 2015 Intecs SpA 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Nicholas Pacini nicholas.pacini@intecs.it 
 * Stefano Puri stefano.puri@intecs.it
 * Laura Baracchi  laura.baracchi@intecs.it  
 * Initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.polarsys.chess.contracts.chessextension.popup.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EObjectTreeElementImpl;
import org.eclipse.papyrus.sysml.diagram.common.edit.part.ConstraintPropertyChildLabelEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForClassEditPart;
import org.eclipse.papyrus.uml.diagram.clazz.edit.parts.PropertyForComponentEditPart;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.chess.contracts.chessextension.dialogs.SetContractRefinementDialog;
import org.polarsys.chess.contracts.chessextension.managers.CHESSContractProfileManager;
import org.polarsys.chess.contracts.profile.chesscontract.ContractProperty;
import org.polarsys.chess.contracts.profile.chesscontract.ContractRefinement;

import eu.fbk.eclipse.standardtools.utils.ui.utils.DialogUtil;

public class SetContractRefinement extends AbstractHandler {

	public static final String CONTRACT_PROPERTY = "CHESSContract::ContractProperty";
	protected static final String CONTRACT_REFINEMENt = "CHESSContract::ContractRefinement";
	public static final String COMPONENT_INSTANCE = "CHESSContract::ComponentInstance";
	private Shell shell;
	private TransactionalEditingDomain editdomain;
	private Property contrProp;

	public SetContractRefinement() {
		super();
	}

//	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
//		shell = targetPart.getSite().getShell();
//	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		shell = window.getShell();
		
		try {
			setSelection();

			if (contrProp != null) {
				Stereotype contrPropStereo = contrProp.getAppliedStereotype(CONTRACT_PROPERTY);
				if (contrPropStereo == null) {
					throw new Exception("Select the ContractProperty element to set the contract refinement");
				}
				Object refinedByList = contrProp.getValue(contrPropStereo, "RefinedBy");
				if (refinedByList instanceof EList<?>) {
					@SuppressWarnings("unchecked")
					final EList<ContractRefinement> refineList = (EList<ContractRefinement>) refinedByList;
					
					final Class ownerClass = (Class) contrProp.getOwner();
					final SetContractRefinementDialog dialog = new SetContractRefinementDialog(shell, ownerClass,refineList);
					dialog.populateRefineListAndCreateDialog();
					if (dialog.open() == Window.OK) {
						editdomain.getCommandStack().execute(new RecordingCommand(editdomain) {
							protected void doExecute() {	
						refineList.clear();
						
						if ((dialog.getSelected() != null)) {
													
									for (SetContractRefinementDialog.ContractRefinementObj currContractRefinementObj : dialog
											.getSelected()) {

										Classifier existingContractRefinement = ownerClass
												.getNestedClassifier(currContractRefinementObj.getID());
										if (existingContractRefinement == null) {
											DataType dt = UMLFactory.eINSTANCE.createDataType();
											ownerClass.getNestedClassifiers().add(dt);
											dt.setName(currContractRefinementObj.getID());
											Stereotype st = CHESSContractProfileManager.getContractRefinement();
											dt.applyStereotype(st);
											String partName = currContractRefinementObj.getSubComponentName();
											String contrName = currContractRefinementObj.getContractName();
											ContractRefinement contRef = (ContractRefinement) dt
													.getStereotypeApplication(st);
											Property instance = ownerClass.getPart(partName, null);
											contRef.setInstance(instance);
											Property contrProp = ((Classifier) instance.getType())
													.getAttribute(contrName, null);
											ContractProperty contract = (ContractProperty) contrProp
													.getStereotypeApplication(
															contrProp.getAppliedStereotype(CONTRACT_PROPERTY));
											contRef.setContract(contract);
											contRef.setLowerIndexOfInstance(currContractRefinementObj.getLower());
											contRef.setUpperIndexOfInstance(currContractRefinementObj.getUpper());
											refineList.add(contRef);
										} else {
											ContractRefinement cr = (ContractRefinement) existingContractRefinement
													.getStereotypeApplication(existingContractRefinement
															.getAppliedStereotype(CONTRACT_REFINEMENt));
											refineList.add(cr);
										}

									}
								}
						}
							});
						}
					}

				} else {
					// do nothing
				}
			
		} catch (Exception e) {
			e.printStackTrace();
			DialogUtil.getInstance().showMessage_ExceptionError(e);
		}
		return null;
	}

	private void setSelection() throws Exception {

		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
				.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			if (strucSelection.size() == 1) {
				Object partSelected = strucSelection.iterator().next();
				if (partSelected instanceof ConstraintPropertyChildLabelEditPart) {
					ConstraintPropertyChildLabelEditPart sysmlEditPart = (ConstraintPropertyChildLabelEditPart) partSelected;
					Node notationNode = (Node) sysmlEditPart.getModel();
					contrProp = (Property) notationNode.getElement();
					editdomain = sysmlEditPart.getEditingDomain();
				} else if (partSelected instanceof PropertyForClassEditPart) {
					PropertyForClassEditPart umlClassEditPart = (PropertyForClassEditPart) partSelected;
					Node notationNode = (Node) umlClassEditPart.getModel();
					contrProp = (Property) notationNode.getElement();
					editdomain = umlClassEditPart.getEditingDomain();
				} else if (partSelected instanceof PropertyForComponentEditPart) {
					PropertyForComponentEditPart umlCompEditPart = (PropertyForComponentEditPart) partSelected;
					Node notationNode = (Node) umlCompEditPart.getModel();
					contrProp = (Property) notationNode.getElement();
					editdomain = umlCompEditPart.getEditingDomain();
				} else if (partSelected instanceof EObjectTreeElementImpl) {
					EObjectTreeElementImpl eObjectTreeElementImpl = (EObjectTreeElementImpl) partSelected;
					System.out.println("--> " + eObjectTreeElementImpl.getEObject());
					if (!(eObjectTreeElementImpl.getEObject() instanceof Property)) {
						throw new Exception("Select the ContractProperty element to set the contract refinement");
					}
					contrProp = (Property) eObjectTreeElementImpl.getEObject();
					editdomain = TransactionUtil.getEditingDomain(contrProp);
				}
			}
		}

	}

//	public void selectionChanged(IAction action, ISelection selection) {
//	}

}