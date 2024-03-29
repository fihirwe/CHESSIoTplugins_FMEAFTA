/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *   Alberto Debiasi - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.verificationService.ui.services;


import java.io.File;

import eu.fbk.eclipse.standardtools.utils.ui.utils.CommandBuilder;

public class ExecCommandService {

	private static ExecCommandService execCommandService;

	public static ExecCommandService getInstance() {
		if (execCommandService == null) {
			execCommandService = new ExecCommandService();
		}
		return execCommandService;
	}
	
	public boolean execModelChecking(String isProgrExec, String isTimeDiscrete,String workspacePath, String projectName, String modelName, String elementURI,
			String property, String algorithm_type, String check_type,String resultFilePath) throws Exception {

		String ID_COMMAND = "org.polarsys.chess.verificationService.commands.ModelCheckingCommand2";
		String ID_PARAMETER_PROJECT_PATH = "projectPath";
		String ID_PARAMETER_PROGR_EXEC = "isProgrExec";		
		String ID_PARAMETER_IS_TIME_DISCRETE = "isDiscrete";
		String ID_PARAMETER_ELEMENT_URI = "elementURI";
		String ID_PARAMETER_PROJECT_NAME = "projectName";
		String ID_PARAMETER_MODEL_NAME = "modelName";
		String ID_PARAMETER_PROPERTY = "property";
		String ID_PARAMETER_ALGORITHM_TYPE = "algorithm_type";
		String ID_PARAMETER_CHECK_TYPE = "check_type";
		String ID_PARAMETER_RESULT_PATH= "resultFilePath";
		
		CommandBuilder checkContractImplementation = CommandBuilder.build(ID_COMMAND);
		checkContractImplementation.setParameter(ID_PARAMETER_IS_TIME_DISCRETE, isTimeDiscrete);
		checkContractImplementation.setParameter(ID_PARAMETER_PROJECT_PATH, workspacePath);
		checkContractImplementation.setParameter(ID_PARAMETER_PROGR_EXEC, isProgrExec);
		checkContractImplementation.setParameter(ID_PARAMETER_ELEMENT_URI, elementURI);
		checkContractImplementation.setParameter(ID_PARAMETER_PROJECT_NAME, projectName);
		checkContractImplementation.setParameter(ID_PARAMETER_MODEL_NAME, modelName);
		checkContractImplementation.setParameter(ID_PARAMETER_PROPERTY, property);
		checkContractImplementation.setParameter(ID_PARAMETER_ALGORITHM_TYPE, algorithm_type);
		checkContractImplementation.setParameter(ID_PARAMETER_CHECK_TYPE, check_type);
		checkContractImplementation.setParameter(ID_PARAMETER_RESULT_PATH, resultFilePath);
		
		checkContractImplementation.execute();
		
		return isCheckResultFileOK(new File(resultFilePath));
		
	}
	
	
	private boolean isCheckResultFileOK(File file){
		return(file.exists());
	}
	
}
