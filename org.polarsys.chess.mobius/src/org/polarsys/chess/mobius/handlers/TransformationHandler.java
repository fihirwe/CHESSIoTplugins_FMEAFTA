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

package org.polarsys.chess.mobius.handlers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.chess.chessmlprofile.Core.CHGaResourcePlatform;
import org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis.SANAnalysis;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.core.views.DiagramStatus;
import org.polarsys.chess.mobius.dialogs.AnalysisContextSelectionDialog;
import org.polarsys.chess.mobius.preferences.MobiusPreferencePage;
import org.polarsys.chess.mobius.transformations.Transformations;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;
import org.eclipse.swt.widgets.Shell;
import org.polarsys.chess.mobius.preferences.Activator;

/**
 * The Class TransformationHandler.
 */
public class TransformationHandler extends AbstractHandler {
	
	/** The Constant ANALYSISCONTEXTQN. */
	private static final String ANALYSISCONTEXTQN = "CHESS::Dependability::StateBased::StateBasedAnalysis::SANAnalysis";
	
	/** The mobius project location. */
	public static String MOBIUS_PROJECT_LOCATION =  "";
	
	/** The context class. */
	private Class contextClass;
	
	/** The atomic blocks. */
	private List<Classifier> atomicBlocks;
	
	/** The composed blocks. */
	private List<Classifier> composedBlocks;
	
	/** The attack scenarios. */
	private List<Interaction> attackScenarios;
	
	/** The project name. */
	private String projectName;
	
	/** The vulnerable components. */
	private Map<Classifier, List<Message>> vulnerableComponents;
	
		
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IEditorPart editor = HandlerUtil.getActiveEditor(event);
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final Shell activeShell = window.getShell();

		//first check that the Mobius project location is a valid one
		MOBIUS_PROJECT_LOCATION = Activator.getDefault().getPreferenceStore().getString(MobiusPreferencePage.MOBIUS_PROJECT_LOCATION_FIELD);
		File f = new File(MOBIUS_PROJECT_LOCATION);
		if (!f.exists() || !f.isDirectory()) {
			MessageDialog.openError(activeShell, "CHESS", "Mobius Project Location is not valid. Please check preference page");
			return null;
		}
		
		SANAnalysis csa = null;
		String contextQN = null;
		try {
			PapyrusMultiDiagramEditor editorPapyrus = CHESSEditorUtils.getCHESSEditor();
			Resource res = ResourceUtils.getUMLResource(editorPapyrus.getServicesRegistry());
			Model model = ResourceUtils.getModel(res);
			
			//open dialog window to select analysis context
			//first get all the classes stereotyped as CyberSecurityAnalysis
			final List<Class> selection = new ArrayList<Class>();
			EList<Element> elemList = model.allOwnedElements();
			for (Element elem : elemList) {
				//we're looking for a class stereotyped <<CyberSecurityAnalysis>>
				if(elem instanceof Class && elem.getAppliedStereotype(ANALYSISCONTEXTQN) != null){
					selection.add((Class) elem);
				}
			}
			if(selection.size() == 0){
				MessageDialog.openError(activeShell, "CHESS", "no suitable analysis contexts in the model");
				return null;
			}
			//then open the dialog
			
			AnalysisContextSelectionDialog dialog = new AnalysisContextSelectionDialog(activeShell, selection, "Select Security Analysis Context");
			if (dialog.open() == Window.OK) {
				contextQN = dialog.getContext();
				if(contextQN == null || contextQN.isEmpty()){
					return null;
				}
				for (Element elem : model.allOwnedElements()){
					if(elem.getAppliedStereotype(ANALYSISCONTEXTQN) != null &&
							((NamedElement) elem).getQualifiedName().equals(contextQN)){
						contextClass = (Class) elem;
					}
				}
			}else{
				return null;
			}
			
			//get "platform" from the selected analysis ctx
			Stereotype stereo = contextClass.getAppliedStereotype(ANALYSISCONTEXTQN);
			csa = (SANAnalysis) contextClass.getStereotypeApplication(stereo);
						
			if(csa.getPlatform().size() > 0){
				if(csa.getPlatform().get(0) instanceof  CHGaResourcePlatform){
					CHGaResourcePlatform platform = (CHGaResourcePlatform)csa.getPlatform().get(0);
					projectName = platform.getBase_InstanceSpecification().getClassifiers().get(0).getName();
//					mobiusComponents = TransformationUtil.getMobiusComponenents(platform);
//					//get Atomic blocks
//					atomicBlocks = mobiusComponents.getAtomicBlocks();
//					//get Composed blocks
//					composedBlocks = mobiusComponents.getComposedBlocks();
//					//get Attacks
//					attackScenarios = TransformationUtil.getModelAttackScenarios(model);
//					//get Vulnerable components
//					vulnerableComponents = TransformationUtil.getVulnerableComponents(model);
					
				}
			}else{
				MessageDialog.openError(activeShell, "CHESS", "no platform is defined in the selected analysis context");
				return null;
			}
	
		} catch (ServiceException e) {
			e.printStackTrace();
			return null;
		}
			
		//Resource sanRes = generateSANmodel(editor, csa, contextQN);
		final PapyrusMultiDiagramEditor papyrusEditor = org.polarsys.chess.service.gui.utils.CHESSEditorUtils.getCHESSEditor();
		final DiagramStatus ds = CHESSEditorUtils.getDiagramStatus(papyrusEditor);
	
		Resource resource = null;
		try {
			resource = ResourceUtils.getUMLResource(papyrusEditor.getServicesRegistry());
		} catch (ServiceException e) {
			e.printStackTrace();
			MessageDialog.openError(activeShell, "CHESS", "Problems with the Papyrus registry editor");
			return null;
		}
		
		List<String> args = new ArrayList<String>();
		Transformations.MobiusTransformationJob(activeShell, editor, args, projectName, atomicBlocks, 
				composedBlocks, attackScenarios, vulnerableComponents, csa, null, contextQN, ds, resource);

		return null;
	}
	
}
