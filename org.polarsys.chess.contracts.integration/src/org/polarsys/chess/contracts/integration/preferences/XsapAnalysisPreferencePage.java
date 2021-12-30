/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.contracts.integration.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.polarsys.chess.contracts.integration.Activator;

public class XsapAnalysisPreferencePage extends FieldEditorPreferencePage 
implements IWorkbenchPreferencePage{
	
	public static final String XSAP_PATH = "XSAP_PATH";

	public XsapAnalysisPreferencePage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {
		DirectoryFieldEditor xsapPathDirEditor = new DirectoryFieldEditor(XSAP_PATH, "xSAP scripts directory:",
		getFieldEditorParent());	
		addField(xsapPathDirEditor);
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences page for xSAP Analysis Tool");
	}

}
