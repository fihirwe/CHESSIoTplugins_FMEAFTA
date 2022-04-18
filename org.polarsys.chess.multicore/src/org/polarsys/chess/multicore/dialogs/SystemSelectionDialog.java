/*******************************************************************************
 * Copyright (C) 2020 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
/*------------------------------------------------------------------------------
  -
  - Copyright (c) 2015-2016 University of Padova, ITALY -  Intecs SpA 
  - All rights reserved. This program and the accompanying materials
  - are made available under the terms of the Eclipse Public License v2.0
  - which accompanies this distribution, and is available at
  - http://www.eclipse.org/legal/epl-v20.html
  -
  - Contributors:
  -
  - Alessandro Zovi azovi@math.unipd.it
  - Stefano Puri stefano.puri@intecs.it
  - Laura Baracchi laura.baracchi@intecs.it
  - Nicholas Pacini nicholas.pacini@intecs.it  
  -
  - Initial API and implementation and/or initial documentation
  ------------------------------------------------------------------------------*/package org.polarsys.chess.multicore.dialogs;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Package;

/**
 * The Class SystemSelectionDialog.
 */
public class SystemSelectionDialog extends Dialog {

	/** The choose system field. */
	private Combo chooseSystemField;
	
	/** The selected system name. */
	private String selectedSystemName;
	
	/** The selected system. */
	private InstanceSpecification selectedSystem;
	
	/** The title. */
	private String title;
	
	/** The systems list. */
	private List<InstanceSpecification> systemsList;
	
	/**
	 * Instantiates a new system selection dialog.
	 *
	 * @param parentShell the parent shell
	 * @param systemSelection the system selection
	 * @param title the title
	 */
	public SystemSelectionDialog(Shell parentShell, List<InstanceSpecification> systemSelection, String title) {
		super(parentShell);
		systemsList = systemSelection;
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout(1, false);

		layout.horizontalSpacing = 4;
		layout.verticalSpacing = 4;
		layout.marginBottom = 5;
		layout.marginTop = 5;
	
		parent.setLayout(layout);
		new Label(parent, SWT.NONE).setText("Systems found in model: ");
		
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		chooseSystemField = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
		for(InstanceSpecification theSystem : systemsList){
			chooseSystemField.add(theSystem.getQualifiedName());
		}
		chooseSystemField.setLayoutData(gridData);
		
		new Label(parent, SWT.NONE).setText("");
		
		return parent;	
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText(title);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		setSystemName(chooseSystemField.getText());		
		super.okPressed();
	}
	
	/**
	 * Sets the system name.
	 *
	 * @param qname the new system name
	 */
	public void setSystemName(String qname) {
		this.selectedSystemName = qname;
	}

	/**
	 * Gets the system name.
	 *
	 * @return the system name
	 */
	public String getSystemName() {
		return selectedSystemName;
	}

	/**
	 * Gets the selected system.
	 *
	 * @return the selected system
	 */
	public InstanceSpecification getSelectedSystem() {
		return selectedSystem;
	}

	/**
	 * Sets the selected system.
	 *
	 * @param selectedSystem the new selected system
	 */
	public void setSelectedSystem(InstanceSpecification selectedSystem) {
		this.selectedSystem = selectedSystem;
	}
}
