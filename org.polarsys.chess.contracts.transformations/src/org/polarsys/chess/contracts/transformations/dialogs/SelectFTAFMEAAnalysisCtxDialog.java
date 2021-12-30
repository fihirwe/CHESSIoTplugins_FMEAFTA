/*******************************************************************************
 *
 * Copyright (c) 2013, 2015 Intecs SpA 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Nicholas Pacini nicholas.pacini@intecs.it 
 * Stefano Puri stefano.puri@intecs.it
 * Laura Baracchi  laura.baracchi@intecs.it  
 * Initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.polarsys.chess.contracts.transformations.dialogs;

import java.util.List;
import org.eclipse.uml2.uml.Class;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;

import eu.fbk.eclipse.standardtools.utils.ui.widgets.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Model;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.Analysis;
import org.polarsys.chess.chessmlprofile.Dependability.DependableComponent.AnalysisContextElement;
import org.polarsys.chess.chessmlprofile.ParameterizedArchitecture.InstantiatedArchitectureConfiguration;
import org.polarsys.chess.service.core.utils.AnalysisResultUtil;

import eu.fbk.eclipse.standardtools.utils.core.utils.StringArrayUtil;

public class SelectFTAFMEAAnalysisCtxDialog extends Dialog {

	// private static final String FTAANALYSIS =
	// "MARTE::MARTE_AnalysisModel::GQAM::GaAnalysisContext";
	// private static final String FTAANALYSIS =
	// "CHESS::Dependability::DependableComponent::ContextAnalysisElement";
	private CCombo chooseAnalysisCtxField;
	private StyledText rootSystemText;
	private StyledText ftaConditionText;
	private Model model;
	private Class selectedComponent;
	private String system;
	private String ftaCondition;
	// private List<GaAnalysisContext> contextList;
	private SelectionListener modAnalysisCtxListener;
	// private GaAnalysisContext analysisContext;
	private AnalysisContextElement analysisContext;
	private List<AnalysisContextElement> contextList;
	private Analysis analysis;
	private InstantiatedArchitectureConfiguration instantiatedArchitecture;

	public SelectFTAFMEAAnalysisCtxDialog(Shell shell, Class selectedComponent, InstantiatedArchitectureConfiguration instantiatedArchitecture, Model model, Analysis analysis) {
		super(shell);
		this.model = model;
		this.selectedComponent = selectedComponent;
		this.instantiatedArchitecture = instantiatedArchitecture;
		this.analysis = analysis;
		this.modAnalysisCtxListener = new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			
			
			
		//this.modAnalysisCtxListener = new ModifyListener() {
		//	public void modifyText(ModifyEvent e) {
				/*String selectedCtx = chooseAnalysisCtxField.getText();
				for (AnalysisContextElement ctx : contextList) {

					if (ctx.getBase_Component().getQualifiedName().equals(selectedCtx)) {
						ftaConditionText.setText(
								StringArrayUtil.getConditionValue(ctx.getConditions(), AnalysisResultUtil.PROPERTY));
						setAnalysisContext(ctx);
					}
			
				}*/
				int selIndex = chooseAnalysisCtxField.getSelectionIndex();
				if(selIndex!=-1){
				AnalysisContextElement selAnalysisContext = contextList.get(selIndex);
					ftaConditionText.setText(
							StringArrayUtil.getConditionValue(selAnalysisContext.getConditions(), AnalysisResultUtil.PROPERTY));
					setAnalysisContext(selAnalysisContext);
				}
			}
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
		};
			
		};
//	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridLayout layout = new GridLayout(2, false);

		layout.horizontalSpacing = 4;
		layout.verticalSpacing = 4;
		layout.marginBottom = 5;
		layout.marginTop = 5;

		parent.setLayout(layout);
		new Label(parent, SWT.NONE).setText("Analysis contexts found in model:");

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		chooseAnalysisCtxField = new CCombo(parent, SWT.DROP_DOWN | SWT.READ_ONLY| SWT.BORDER);
		chooseAnalysisCtxField.setBackground(
				(Display.getDefault().getSystemColor(SWT.COLOR_WHITE)));
		contextList = AnalysisResultUtil.getInstance().getAnalysisContexts(selectedComponent,instantiatedArchitecture, analysis, model);
		EList<String> configs = new BasicEList<String>();
		for (AnalysisContextElement ctx : contextList) {
			if (ctx.getRoot() != null) {
				configs.add(ctx.getBase_Component().getQualifiedName());
			}
		}
		chooseAnalysisCtxField.setItems(configs.toArray(new String[0]));
		chooseAnalysisCtxField.addSelectionListener(modAnalysisCtxListener);
		chooseAnalysisCtxField.setLayoutData(gridData);

		new Label(parent, SWT.NONE).setText("Root element:");

		gridData = new GridData(GridData.FILL_HORIZONTAL);
		rootSystemText = new StyledText(parent, SWT.SINGLE | SWT.READ_ONLY | SWT.BORDER);
		rootSystemText.setText(selectedComponent.getQualifiedName());

		rootSystemText.setLayoutData(gridData);

		String labelText = "";
		switch (analysis) {
		case FTA_ANALYSIS:
			labelText = "FTA condition:";
			break;
		case FMEA_ANALYSIS:
			labelText = "FMEA conditions: (use ',' as delimiter)";
			break;
		default:
			break;
		}
		new Label(parent, SWT.NONE).setText(labelText);

		gridData = new GridData(GridData.FILL_HORIZONTAL);
		ftaConditionText = new StyledText(parent, SWT.SINGLE | SWT.BORDER);
		ftaConditionText.setText("");
		ftaConditionText.setLayoutData(gridData);
		new Label(parent, SWT.NONE).setText("");

		return parent;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		String shellText = "";
		switch (analysis) {
		case FTA_ANALYSIS:
			shellText = "Select Analysis Context for FTA analysis";
			break;
		case FMEA_ANALYSIS:
			shellText = "Select Analysis Context for FMEA analysis";
			break;
		default:
			break;
		}
		shell.setText(shellText);

	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected void okPressed() {
		setSystem(rootSystemText.getText());
		setFtaCondition(ftaConditionText.getText());
		super.okPressed();
	}

	public String getSystem() {
		return system;
	}

	private void setSystem(String system) {
		this.system = system;
	}

	public String getFtaCondition() {
		return ftaCondition;
	}

	private void setFtaCondition(String ftaCondition) {
		this.ftaCondition = ftaCondition;
	}

	public AnalysisContextElement getAnalysisContext() {
		return analysisContext;
	}

	public void setAnalysisContext(AnalysisContextElement analysisContext) {
		this.analysisContext = analysisContext;
	}

	/*
	 * private List<GaAnalysisContext> getAnalysisContexts(Model model) {
	 * List<GaAnalysisContext> result = new ArrayList<GaAnalysisContext>(); for
	 * (Element elem : model.allOwnedElements()){ Stereotype stereo =
	 * elem.getAppliedStereotype(FTAANALYSIS); if(stereo != null){
	 * result.add((GaAnalysisContext) elem.getStereotypeApplication(stereo)); }
	 * } return result; }
	 * 
	 * public GaAnalysisContext getAnalysisContext() { return analysisContext; }
	 * 
	 * public void setAnalysisContext(GaAnalysisContext analysisContext) {
	 * this.analysisContext = analysisContext; }
	 */
}
