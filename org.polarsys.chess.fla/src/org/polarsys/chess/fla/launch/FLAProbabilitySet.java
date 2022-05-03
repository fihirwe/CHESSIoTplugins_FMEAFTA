package org.polarsys.chess.fla.launch;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TypedElement;
import org.polarsys.chess.chessmlprofile.util.Constants;
import org.polarsys.chess.core.util.uml.ResourceUtils;
import org.polarsys.chess.service.gui.utils.CHESSEditorUtils;

public class FLAProbabilitySet {

	private static final String UML_SUFFIX = ".uml";
	private static final String DI_SUFFIX = ".di";
	private static IProject activeProject;
	private static final String FLAstereotype = "CHESS::Dependability::FailurePropagation::FLABehavior";
	public static final String FLOW_PORT = "SysML::PortAndFlows::FlowPort";
	public static final String FPTCBehavior ="CHESS::Dependability::FailurePropagation::FPTCSpecification";
	public static void checkSetProbability(PapyrusMultiDiagramEditor editor,ExecutionEvent event) {	
		MessageDialog md = new MessageDialog(editor.getSite().getShell(),
				"Set probabilities", null, "Do you want to set the failure rate probabilities from the start?", MessageDialog.CONFIRM,
				new String[] { "Yes", "No"}, 0);
		md.setBlockOnOpen(true);
		int res = md.open();

		if(res==0){

			//			File probilityFile = new File(FLAProbabilitySet.getTargetFolder(editor));
			////		    if(!probilityFile.exists()){		
			//		}
			Resource inResource = null;
			Shell activeShell = null;
			if ((CHESSEditorUtils.isCHESSProject(editor))){
				try {
					inResource = ResourceUtils.getUMLResource(((PapyrusMultiDiagramEditor) editor).getServicesRegistry());

				} catch (ServiceException e) {
					e.printStackTrace();
					MessageDialog.openError(activeShell, "CHESS", "Unable to load the model");
				}
				IWorkbenchWindow window = null;
				try {
					window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
					activeShell = window.getShell();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				final Model model = (Model) inResource.getContents().get(0);		
				//first get all the classes stereotyped as FLABehavior
				final List<String> devices = new ArrayList<String>();		
				EList<Element> elemList = model.allOwnedElements();

				for (Element prop : elemList) {
					if(prop instanceof Property){
						Property p= (Property) prop;
						if (p.getType()!=null && p.getType().getAppliedStereotype(FLAstereotype)!= null) {
							//					MessageDialog.openError(activeShell, "CHESS", p.getName()+" of Type "+p.getType().getName()+" under "+p.getNamespace().getName());

							Stereotype objStereo = p.getType().getAppliedStereotype(FLAstereotype);
							String ruleString= (String) p.getType().getValue(objStereo, "fptc");
							String rules[]= ruleString.split(";");

							for(String rule: rules){
								if (rule.trim().length()>0) {
									
								
								String expressions[]=rule.split("->");
								String outExp = null;
								
								try {
									outExp= expressions[1];
								} catch (Exception e) {
									MessageDialog.openError(activeShell, "CHESS", "Unable to load the probility set!!.. One rule is set incorrectly! "+rule);
								}
								 
								String[] outRule= outExp.split(",");
								for(String out:outRule){
									if (expressions[0].contains("*")) {
										devices.add(p.getName().toUpperCase()+": "+expressions[0]+"->"+out+";");
									}
									else{
										String []inExp= expressions[0].split(",");
										boolean internalFailure=true;
										for (String string : inExp) {
											if (!string.contains("noFailure")) {
												internalFailure=false;
												break;
											}
										}
										if (internalFailure) {
											devices.add(p.getName().toUpperCase()+": "+expressions[0]+"->"+out+";");
										} 
									}

								}
							}

							}


							//							S
							//							
							//							devices.add(p.getName()+" of type "+p.getType().getName()+" under "+p.getNamespace().getName());


						}

					}
					else if (prop instanceof Comment) {
						Comment com= (Comment) prop;
						Class owner = (Class)com.getOwner();
						List<Property> props= new ArrayList<>();

						for (Property property : owner.getOwnedAttributes()) {
							if(property instanceof Port){								
								Stereotype pStereo =((Port)property).getAppliedStereotype(FLOW_PORT);
								if((((Port)property).getValue(pStereo, "direction").toString()).equals("in")){
									if(!props.contains(property)){
										props.add(property);
									}
								}
							}
						}	


						for (Element element : com.getAnnotatedElements()) {
							if(props.contains((Property)element)){
								Stereotype commentStereo =com.getAppliedStereotype(FPTCBehavior);
								Object a= com.getValue(commentStereo, "failure");

								String failure= a.toString().substring(1, a.toString().length()-1);
								if(!failure.contains("noFailure")){
									devices.add(owner.getName().toUpperCase()+": injected <"+failure+"> failure at "+((Property)element).getName()+" port;");						
								}
							}
						}
					}
				}
				String path= getTargetFolder(editor);
				new MyFrame(devices,path);
				try {
					activeProject.refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	public static String getTargetFolder(PapyrusMultiDiagramEditor editor) {

		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput() ;

		IFile file = input.getFile();
		activeProject = file.getProject();
		Path path = new Path(activeProject.getName() + "/" + changeSuffix(input.getFile().getName(), DI_SUFFIX,UML_SUFFIX));
		IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		IContainer targetFolder = modelFile.getProject().getFolder("FLA_Analysis");

		String PATH = targetFolder.getLocation().toString();
		String activeProjectfileName = activeProject.getName();

		File directory = new File(PATH);
		if (! directory.exists()){
			directory.mkdir();
		}


		return targetFolder.getLocation().append(activeProjectfileName+"_Probability_"+new Date().getTime()+"_.xlsx").toString();
	}

	private static String changeSuffix(String string, String oldSuffix, String newSuffix){
		String newString = string;
		if (newString.endsWith(oldSuffix)){
			newString = newString.substring(0, newString.length() - oldSuffix.length());
			newString += newSuffix;
		}
		return newString;		
	}
}
