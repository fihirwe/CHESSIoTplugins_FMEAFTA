/*******************************************************************************
 * Copyright (C) 2019 Fondazione Bruno Kessler.
 * All rights reserved. 
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.polarsys.chess.checkers.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.polarsys.chess.checkers.Activator;

public class ModelCheckingPreferencePage extends CommonPreferencePage {
	
	@Override
	public void createFieldEditors() {
		final Composite parent = getFieldEditorParent();
		parent.setLayout(new GridLayout(1, false));
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	
		{
			final Composite composite = new Composite(parent, SWT.NONE);
			composite.setLayoutData(new GridData(400, SWT.DEFAULT));

			for (String tag : Activator.getCheckerManager().getTags()) {
				BooleanFieldEditor booleanFieldEditor = new BooleanFieldEditor(tag, tag, composite);
				addField(booleanFieldEditor);
			}

			widgets.add(composite);
		}
	}

	@Override
	public void init(IWorkbench workbench) {
	}
}
