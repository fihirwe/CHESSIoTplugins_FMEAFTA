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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.polarsys.chess.checkers.Activator;


/**
 * The Class CommonPreferencePage.
 */
public abstract class CommonPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{
	protected boolean isEnabled = true;

	private boolean restartRequired = false;

	final protected List<Widget> widgets = new ArrayList<Widget>();

	public CommonPreferencePage()
	{
		super();

		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	public CommonPreferencePage(int style)
	{
		super(style);

		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	public void setRestartRequired(boolean restartRequired)
	{
		this.restartRequired = restartRequired;
	}
	
	@Override
	public void dispose()
	{
		for( final Widget widget : widgets )
		{
			widget.dispose();
		}

		super.dispose();
	}

	@Override
	public boolean performOk()
	{
		if( restartRequired )
		{
			MessageDialog.openWarning(getShell(), "Warning", "The application needs to be restarted");

			restartRequired = false;
		}

		return super.performOk();
	}
	
	@Override
	protected void performApply()
	{
		adjustGridLayout();
		
		super.performApply();
	}
}
