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

package org.polarsys.chess.mobius.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.polarsys.chess.mobius.preferences.Activator;

/**
 * The Class MobiusPreferencePage.
 */
public class MobiusPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	
	/** The Constant MOBIUS_PROJECT_LOCATION_FIELD. */
	public static final String MOBIUS_PROJECT_LOCATION_FIELD = "Mobius Project Location";

	/**
	 * Instantiates a new mobius preference page.
	 */
	public MobiusPreferencePage(){
		super(GRID);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences page for Mobius project generation");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		
		DirectoryFieldEditor xsapPathDirEditor = new DirectoryFieldEditor(MOBIUS_PROJECT_LOCATION_FIELD, "Mobius Project Location:",
				getFieldEditorParent());	
				addField(xsapPathDirEditor);
		
	}

}
