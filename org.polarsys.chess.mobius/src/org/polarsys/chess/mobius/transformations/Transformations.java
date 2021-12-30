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
package org.polarsys.chess.mobius.transformations;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.polarsys.chess.chessmlprofile.Core.CHGaResourcePlatform;
import org.polarsys.chess.chessmlprofile.Dependability.StateBased.StateBasedAnalysis.SANAnalysis;
import org.polarsys.chess.core.views.DiagramStatus;
import org.polarsys.chess.mobius.handlers.CHESS2SANRunner;
import org.polarsys.chess.mobius.handlers.TransformationHandler;
import org.polarsys.chess.mobius.model.SAN.AtomicNode;
import org.polarsys.chess.mobius.model.SAN.Node;
import org.polarsys.chess.mobius.model.SAN.SANModel;
import org.polarsys.chess.mobius.preferences.Activator;
import org.polarsys.chess.mobius.templates.AtomicComponentTemplate_sanmodel;
import org.polarsys.chess.mobius.templates.ComposedComponentTemplate_sanmodel;
import org.polarsys.chess.mobius.templates.ProjectFileTemplate_sanmodel;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;

/**
 * The Class Transformations.
 */
public class Transformations {
	
	/** The Constant UML_EXT. */
	public static final String UML_EXT = ".uml";
	
	/** The Constant DI_SUFFIX. */
	private static final String DI_SUFFIX = ".di";
	
	/** The Constant NUM_SUB_TASKS. */
	public static final int NUM_SUB_TASKS = 6;
	
	/** The Constant PROJECT_SUBFOLDERS. */
	public static final String[] PROJECT_SUBFOLDERS = {"Atomic", "Composed", "Documentation", "Reward", "Solver", "Study", "Transformer"};

	/**
	 * Mobius transformation job.
	 *
	 * @param activeShell the active shell
	 * @param editor the editor
	 * @param args the args
	 * @param projectName the project name
	 * @param atomicBlocks the atomic blocks
	 * @param composedBlocks the composed blocks
	 * @param attackScenarios the attack scenarios
	 * @param vulnerableComponents the vulnerable components
	 * @param csa the csa
	 * @param sanRes the san res
	 * @param analysisContextQN the analysis context QN
	 * @param chessDiagramStatus the chess diagram status
	 * @param chessResource the chess resource
	 */
	public static void MobiusTransformationJob(Shell activeShell, IEditorPart editor, List<String> args, String projectName, List<Classifier> atomicBlocks, List<Classifier> composedBlocks, 
			List<Interaction> attackScenarios,  Map<Classifier, List<Message>> vulnerableComponents, SANAnalysis csa, Resource sanRes, String analysisContextQN,
			DiagramStatus chessDiagramStatus, Resource chessResource) {
		
		Job job = new Job("CHESS to Mobius Transformation Running"){

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("operation in progress ...", NUM_SUB_TASKS);
				Resource sanResource = null;
				monitor.subTask("generating SAN model...");
				
				try {
					sanResource = generateSANmodel(editor, csa, analysisContextQN, chessDiagramStatus, chessResource, monitor);
				} catch (ExecutionException e1) {
					e1.printStackTrace();
					PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
						public void run() {
							MessageDialog.openInformation(activeShell, "CHESS", "Error while generating the SAN model; please check the Error log");
						}
					});
					return Status.CANCEL_STATUS;
				}
				monitor.worked(1);
				//it seems that the QVT transformation calls done on the monitor... so I have to restart it
				monitor.beginTask("operation in progress ...", NUM_SUB_TASKS-1);
				
				monitor.subTask("setting up project folders...");
				IFileEditorInput input = (IFileEditorInput) editor.getEditorInput();
				IFile inputfile = input.getFile();
//				String ProjectName = inputfile.getName().substring(0, inputfile.getName().lastIndexOf("."));
				String ProjectRoot = TransformationHandler.MOBIUS_PROJECT_LOCATION + File.separator + projectName;
				new File(ProjectRoot).mkdirs();
				monitor.worked(1);
				
				for (String subfolder : PROJECT_SUBFOLDERS){
					new File(ProjectRoot + File.separator + subfolder).mkdirs();
				}
				
				String stringToURI = inputfile.getFullPath().toString();
				stringToURI = stringToURI.substring(0, stringToURI.lastIndexOf("."));
				stringToURI = stringToURI + UML_EXT;

				monitor.worked(1);
				
				try {
					
					SANModel sanModel = (SANModel) sanResource.getContents().get(0);
					
					monitor.subTask("transforming SAN model...");
					monitor.worked(1);

//NIK's work
//					// currently I need the generation via AtomicComponentTemplate otherwise the generation of the attack scenario fails. Once the generation of attack scenario will be done via the SAN metamodel, then the invocation of AtomicComponentTemplate can be removed
//					monitor.subTask("generating atomic models...");
//					for (Classifier atomic : atomicBlocks) {
//						String targetFolder = ProjectRoot + File.separator + "Atomic" + File.separator + atomic.getName();
//						File targetFolderFile = new File(targetFolder);
//						targetFolderFile.mkdirs();
//						File target = new File(targetFolder);
//						args.add(atomic.getQualifiedName());
//						AtomicComponentTemplate san = new AtomicComponentTemplate(modelURI, target, args);
//						san.doGenerate(null);
//						
//						// actually the generated files are not needed, see AtomicComponentTemplate_sanmodel below
//						File toDelete = new File(targetFolder+File.separator+atomic.getName()+".san");
//						toDelete.delete();
//						targetFolderFile.delete();
//						
//						args.remove(atomic.getQualifiedName());
//					}
//					monitor.worked(1);
					
					monitor.subTask("generating atomic models...");
					EList<Node> nodes = sanModel.getAllNodes();
					for (Node node : nodes) {
						if (node instanceof AtomicNode) {
							String targetFolder = ProjectRoot + File.separator + "Atomic" + File.separator + node.getName().replaceAll("\\.", "_");
							new File(targetFolder).mkdirs();
							File target = new File(targetFolder);
							args.add(node.getName());
							AtomicComponentTemplate_sanmodel san = new AtomicComponentTemplate_sanmodel(sanResource.getURI(), target, args);
							san.doGenerate(null);
							args.remove(node.getName());
						}
					}
					monitor.worked(1);
					
//					monitor.subTask("generating attack scenario models...");
//					for (Interaction scenario : attackScenarios){
//						String targetFolder = ProjectRoot + File.separator + "Atomic" + File.separator + scenario.getName();
//						new File(targetFolder).mkdirs();
//						File target = new File(targetFolder);
//						args.add(scenario.getQualifiedName());
//						AttackScenarioTemplate san = new AttackScenarioTemplate(modelURI, target, args);
//						san.doGenerate(null);
//						args.remove(scenario.getQualifiedName());
//					}
					
//NICHOLAS WORK
//					monitor.worked(1);
//					monitor.subTask("generating composed models...");
//					for (Classifier composed : composedBlocks) {
//						String targetFolder = ProjectRoot + File.separator + "Composed" + File.separator + composed.getName();
//						new File(targetFolder).mkdirs();
//						File target = new File(targetFolder);
//						args.add(composed.getQualifiedName());
//						ComposedComponentTemplate cmp = new ComposedComponentTemplate(modelURI, target, args);
//						cmp.doGenerate(null);
//						args.remove(composed.getQualifiedName());
//					}
//					monitor.worked(1);
					
					monitor.subTask("generating composed model...");
					if (sanModel.getNode() != null) {
						Node rootNode = sanModel.getNode();
						//for (Classifier composed : composedBlocks) {
						String targetFolder = ProjectRoot + File.separator + "Composed" + File.separator + rootNode.getName();
						new File(targetFolder).mkdirs();
						File target = new File(targetFolder);
						args.add("");
						ComposedComponentTemplate_sanmodel cmp = new ComposedComponentTemplate_sanmodel(sanResource.getURI(), target, args);
						cmp.doGenerate(null);
						args.remove("");
						//}
						monitor.worked(1);
					}

//NIK's work
//					monitor.subTask("generating vulnerable component models...");
//					for (Classifier vulnerable : vulnerableComponents.keySet()) {
//						String targetFolder = ProjectRoot + File.separator + "Composed" + File.separator + "Vulnerable" + vulnerable.getName();
//						new File(targetFolder).mkdirs();
//						File target = new File(targetFolder);
//						args.add(vulnerable.getQualifiedName());
//						VulnerableComponentsTemplate cmp = new VulnerableComponentsTemplate(modelURI, target, args);
//						cmp.doGenerate(null);
//						args.remove(vulnerable.getQualifiedName());
//					}
//					monitor.worked(1);
					

//NICHOLAS WORK
//					monitor.subTask("generating project file...");
//					File target = new File(ProjectRoot);
//					args.add(projectName);
//					ProjectFileTemplate prj = new ProjectFileTemplate(modelURI, target, args);
//					prj.doGenerate(null);
//					monitor.worked(1);
					
					monitor.subTask("generating Mobius project file...");
					File target = new File(ProjectRoot);
					args.add(projectName);
					ProjectFileTemplate_sanmodel prj = new ProjectFileTemplate_sanmodel(sanResource.getURI(), target, args);
					prj.doGenerate(null);
					monitor.worked(1);
					
					
					PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
						public void run() {
							MessageDialog.openInformation(activeShell, "CHESS", "Mobius project " + projectName + " has been generated at: " + ProjectRoot);
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
					PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
						public void run() {
							MessageDialog.openInformation(activeShell, "CHESS", "Unexpected problem: check the error log.");
						}
					});
				} 
				monitor.done();
				if (monitor.isCanceled())
					return Status.CANCEL_STATUS;
				return Status.OK_STATUS;
			}
		};
		
		job.setUser(true);
		job.setPriority(Job.SHORT);
		job.schedule();
	}

/**
 * Generate SA nmodel.
 *
 * @param editor the editor
 * @param csa the csa
 * @param analysisContextQN the analysis context QN
 * @param chessDiagramStatus the chess diagram status
 * @param resource the resource
 * @param monitor the monitor
 * @return the resource
 * @throws ExecutionException the execution exception
 */
private static Resource generateSANmodel(IEditorPart editor, SANAnalysis csa, String analysisContextQN, DiagramStatus chessDiagramStatus,
		Resource resource, IProgressMonitor monitor) throws ExecutionException{
		
		IContainer targetFolder;
	
		//final DiagramStatus ds = CHESSEditorUtils.getDiagramStatus(papyrusEditor);

		DiagramEditPart diagramEditPart = null;
		try {
			Object editPart = getEditPart();
			
			final DiagramEditPart csd_ep = (DiagramEditPart) editPart;
			diagramEditPart = csd_ep;

		} catch (Exception e) {
			e.printStackTrace();
		}
		//		
		
		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput() ;
		
		IFile file = input.getFile();
		IProject activeProject = file.getProject();
		Path path = new Path(activeProject.getName() + "/" + changeSuffix(input.getFile().getName(), DI_SUFFIX,UML_EXT));
		URI modelURI = URI.createPlatformResourceURI(changeSuffix(input.getFile().getFullPath().toString(), DI_SUFFIX,UML_EXT), true);
		IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		CHESS2SANRunner analysisRunner = new CHESS2SANRunner();
		long startTime = System.currentTimeMillis();
		//Shell shell = new Shell();	
		try {
			chessDiagramStatus.setUserAction(false);
			//ProgressMonitorDialog pmDialog = new ProgressMonitorDialog(shell);
			
			analysisRunner.setModelURI(modelURI);
			targetFolder = modelFile.getProject().getFolder("SAN");
			analysisRunner.setTargetFolder(targetFolder);
			analysisRunner.setDiagramEditPart(diagramEditPart);
			
			CHGaResourcePlatform platform = (CHGaResourcePlatform)csa.getPlatform().get(0);
			
			analysisRunner.setRootComponent(((PackageImpl) platform.getBase_InstanceSpecification().getOwner()).getQualifiedName());
			analysisRunner.setAnalysisContextQualifiedName(analysisContextQN);
			analysisRunner.setChessResource(resource);
			analysisRunner.run(monitor);
			
			//pmDialog.run(true, true, analysisRunner);
			
			activeProject.refreshLocal(IResource.DEPTH_INFINITE, null);
			
		} catch (InvocationTargetException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			throw new ExecutionException("Error during SAN transformation", e);
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			throw new ExecutionException("Error during FLA analysis", e);
		} catch (InterruptedException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		} finally {
			chessDiagramStatus.setUserAction(true);
		}
		long endTime = System.currentTimeMillis();
		org.polarsys.chess.core.util.CHESSProjectSupport.printlnToCHESSConsole("*** Elapsed time " + (endTime - startTime) / 1e3 + " s ***");
		return analysisRunner.getSANResource();
	}
	
	
	/**
	 * Gets the edits the part.
	 *
	 * @return the edits the part
	 */
	private static Object getEditPart() {
		Object ep = null;
		try {
				ep = CHESSEditorUtils.getDiagramGraphicalViewer().getRootEditPart().getChildren().get(0);	
		} catch (Exception e) {
			//Catch NPE
			return null;
		}
		return ep;
	}
	
	/**
	 * Change suffix.
	 *
	 * @param string the string
	 * @param oldSuffix the old suffix
	 * @param newSuffix the new suffix
	 * @return the string
	 */
	private static String changeSuffix(String string, String oldSuffix, String newSuffix){
		String newString = string;
		if (newString.endsWith(oldSuffix)){
			newString = newString.substring(0, newString.length() - oldSuffix.length());
			newString += newSuffix;
		}
		return newString;		
	}
	
}
