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
package org.polarsys.chess.paramArchConfigurator.ui.wizard.page;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class BasicWizardPage extends WizardPage {

	protected EList<EList<String>> prevParametersList;

	protected BasicWizardPage(String pageName) {
		super(pageName);
	}

	protected BasicWizardPage(String pageName, EList<EList<String>> prevParametersList) {
		super(pageName);
		this.prevParametersList = prevParametersList;
	}

	@Override
	public void createControl(Composite parent) {

	}

/*	protected void createViewPrevParametersArea2(Composite parent) {

		ScrolledComposite sc = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.widthHint = 35;
		gd.heightHint = 200;
		sc.setLayoutData(gd);

		Composite scrolledContent = new Composite(sc, SWT.BORDER);
		scrolledContent.setLayout(new GridLayout(10, false));
		for (int i = 0; i < 300; i++) {
			Button b = new Button(scrolledContent, SWT.PUSH);
			b.setText("Button " + i);
		}
		scrolledContent.setSize(scrolledContent.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		sc.setContent(scrolledContent);

	}*/

	protected void createViewPrevParametersArea(Composite parent) {

		ScrolledComposite sc = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.widthHint = 35;
		gd.heightHint = 200;
		sc.setLayoutData(gd);

		Composite scrolledContent = new Composite(sc, SWT.BORDER);
		scrolledContent.setLayout(new GridLayout(1, false));
		scrolledContent.setLayoutData(gd);

		if (prevParametersList.size() == 0) {
			Label tableLabel = new Label(scrolledContent, SWT.NONE);
			tableLabel.setText("No parameter is already assigned.");
		} else {
			int numIterations = 1;
			for (EList<String> prevParametersGroup : prevParametersList) {

				Table table = new Table(scrolledContent, SWT.BORDER | SWT.NO_SCROLL);
				table.setHeaderVisible(true);
				table.setLinesVisible(true);

				TableColumn columnParNames = new TableColumn(table, SWT.NONE);

				for (String parameter : prevParametersGroup) {

					TableItem parameterNameItem = new TableItem(table, SWT.NONE);
					parameterNameItem.setText(0, parameter);

				}

				columnParNames.setText("Assigned Parameters at iteration " + numIterations + ":");
				columnParNames.pack();
				columnParNames.setWidth(500);

				GridData tableGridData = new GridData(SWT.FILL, SWT.NONE, true, false);
				table.setLayoutData(tableGridData);
				numIterations++;
			}
		}

		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setContent(scrolledContent);
		sc.setMinSize(scrolledContent.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}
}