package org.polarsys.chess.fla.faultTreeGenerator.handlers;

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import eu.fbk.eclipse.standardtools.faultTreeViewer.emfta.Event;
import eu.fbk.eclipse.standardtools.faultTreeViewer.emfta.FTAModel;

public class UpdatePobabilities {

	public static  void update( File path, IFile file2) throws Exception {

		if(file2.getFileExtension().equals("emfta")){
			IPath path2 = file2.getFullPath();
			IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().getFile(path2);


			String activeProjectName=file.getProject().getName();			
			String pathName = file.getFullPath().toOSString();
			URI ftaResourceFileURI = URI.createPlatformResourceURI(pathName, true);
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(ftaResourceFileURI, true);

			int nFTs=0;
			for (EObject iterable_element : resource.getContents()) {
				if (iterable_element instanceof FTAModel) {
					nFTs++;
				}

			}
			File[] files = path.listFiles();
			long max=0;
			for(File prob : files) {
				if(prob.isFile() && prob.getName().contains("xlsx")) {

					String[] name= prob.getName().split("_");
					long id= Long.valueOf(name[name.length-2]);
					if(id>max){
						max=id;
					}
				}
			}
			File probFile= new File(path+"/"+activeProjectName+"_Probability_"+max+"_.xlsx");
			System.err.println("PARSING "+probFile+" probability file");
			if(probFile.exists()){
				List<FailureData> excelData=ParseExcel.parse(probFile);
				for (int i = 0; i < nFTs; i++) {
					FTAModel ftmodel=(FTAModel) resource.getContents().get(i);
//					System.out.println("Processing "+ftmodel.toString());
					for (Event iterable_element : ftmodel.getEvents()) {
						String type=iterable_element.getType().name();
						if (!type.equalsIgnoreCase("Intermediate")){
							String name= iterable_element.getName().replaceAll("\n", "").replaceAll("-", "");
							if(name!=null){
								String[] cellKeys=null;
								if(type.equalsIgnoreCase("Basic")){
									cellKeys= getInternalFailureKeys(name);
								}else{
									cellKeys= getExternalFailureKeys(name);
								}
								
								String newName=ParseExcel.getDescriptionByName(excelData,cellKeys);
								if(!newName.equals("NULL")){
									iterable_element.setName(newName);
								}

								iterable_element.setProbability(ParseExcel.getProbabilityByName(excelData,cellKeys));	
							}
							//System.out.println("After "+iterable_element.getName());
						}
//						else if(type.equalsIgnoreCase("External")){
//							String name= iterable_element.getName().replaceAll("\n", "").replaceAll("-", "");
//							if(name!=null){
//								String[] 
//								String newName=ParseExcel.getDescriptionByName(excelData,cellKeys);
//								if(!newName.equals("NULL")){
//									iterable_element.setName(newName);
//								}
//
//								iterable_element.setProbability(ParseExcel.getProbabilityByName(excelData,cellKeys));	
//							}
//
//
//						}

					}
					//			resource2 = resourceSet.createResource(ftaResourceFileURI);
					//				resource.getContents().add(bb);
				}
				resource.save(Collections.EMPTY_MAP);
			}
			else{
				System.out.println("No probaility file found");
			}

		}
	}


	private static String[] getInternalFailureKeys(String eventName) {
		String [] keys= new String[3];
		String[] a = eventName.split("==>")[0].split(" ");
		keys[0]=a[0].split("\\+")[0];
		keys[1]=a[0].split("\\+")[1];
		keys[2]=a[a.length-1];		
		return keys;
	}

	private static String[] getExternalFailureKeys(String eventName) {
		String [] keys= new String[3];
		String[] a = eventName.split(" ");
		keys[0]=a[0].split("\\+")[0];
		keys[1]=a[0].split("\\+")[1];
		keys[2]=a[a.length-1];		
		return keys;
	}

}


