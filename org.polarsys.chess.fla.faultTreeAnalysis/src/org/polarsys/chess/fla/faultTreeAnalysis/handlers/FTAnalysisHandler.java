/*******************************************************************************
 * Copyright (c) 2021, Intecs Solutions Spa 
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 *   Contributors:
 *   Felicien Ihirwe
 *   Initial API and implementation and/or initial documentation
 *******************************************************************************/
/**
 */
package org.polarsys.chess.fla.faultTreeAnalysis.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import java.io.File;

import javax.swing.JFileChooser;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.polarsys.chess.fla.faultTreeAnalysis.visualization.FaultTreeVisualizer;



/**
 * The Class FTAnalysisHandler.
 */
public class FTAnalysisHandler extends AbstractHandler {
	
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		/*First we create a FileChooser in order to allow the user to select the input file that need to be transformed. The default directory will be the worskpace of the running instance of the user.*/
		IPath pat = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		File folder = new File (pat.toOSString());
		JFileChooser chooser = new JFileChooser();
	    chooser.setCurrentDirectory(folder);
	    chooser.setDialogTitle("Please select your Fault Tree (.emfta) results file");
	    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	    chooser.setAcceptAllFileFilterUsed(false);
	    
	    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	      System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
	      System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
	      String flaName = chooser.getSelectedFile().getName();
	      String flaName2 = flaName.replaceAll(".emfta", "");
	      
//	      File emfta = new File(chooser.getCurrentDirectory() + "/" + flaName2 + ".emfta");
//		    if(emfta.exists() && !emfta.isDirectory()){
//		    	
//				MessageDialog.openError(null, "Error in process", "The selected folder already contains a result of the transformation. Please, remove the existing one or change the .emfta file name.");
//				return null;
//		    }
		/*Now we call the transformation.*/
		Transformation transformation = new Transformation(event);
		ProgressMonitorDialog nombrequequiera = new ProgressMonitorDialog(null);
		nombrequequiera.open();
		IProgressMonitor pMonitor = nombrequequiera.getProgressMonitor();
		
		pMonitor.beginTask("Analysing the FT diagram. Please wait...", pMonitor.UNKNOWN);

		IPath modelLocation = transformation.execute(chooser); 
		if(modelLocation == null){
			pMonitor.done();
			nombrequequiera.close();
		}
		
		/*We get the file obtained as the result of the transformation process.*/
		
		IFile target = ResourcesPlugin.getWorkspace().getRoot().getFile(modelLocation);
		
		//If the file extension is the proper one, we create the representation.
		if(target.getFileExtension().equals("emfta")){
			IPath path2 = target.getFullPath();
			IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().getFile(path2);
			try {

				FaultTreeVisualizer.getInstance().openFTAViewerFromEmftaFile(file, new NullProgressMonitor());
				pMonitor.done();
				nombrequequiera.close();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				pMonitor.done();
				nombrequequiera.close();
			}
			MessageDialog.openInformation(null, "Process completed", "FTA diagram has been generated successfully.");
		}else{
			//If the extension is not the correct one, we show a message to the user and no further action is taken.
			pMonitor.done();
			nombrequequiera.close();
			MessageDialog.openError(null, "Error in process", "The selected file is not the result of a Failure Logic Analysis. Please select a proper one.");
		}
	   }else {
		      System.out.println("No Selection ");
	   }
		
		return null;
	}
}