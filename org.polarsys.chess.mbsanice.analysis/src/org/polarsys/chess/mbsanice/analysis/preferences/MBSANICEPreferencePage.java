package org.polarsys.chess.mbsanice.analysis.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.polarsys.chess.mbsanice.analysis.Activator;

public class MBSANICEPreferencePage extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage {
	
	public final static String FILTERFMEA = "FILTERFMEA";

	public MBSANICEPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
        //setDescription("Preferences for Generation of XSLX Template for FLA");
	
	}

	@Override
	protected void createFieldEditors() {

		StringFieldEditor portOrder = new StringFieldEditor(
				"PORTORDER",
				"&Order of ports for generation of XSLX template (comma separated list):",
				getFieldEditorParent());
		addField(portOrder);	

//		IntegerFieldEditor numberOfRows = new IntegerFieldEditor(
//				"ROWNUMBER",
//				"&Number of pre-formatted rows:",
//				getFieldEditorParent());
//		addField(numberOfRows);	
		
		BooleanFieldEditor filterFMEArows = new BooleanFieldEditor(FILTERFMEA, "Filter FMEA rows", getFieldEditorParent());
		addField(filterFMEArows);
		
	}
	
	@Override
	public IPreferenceStore doGetPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}
	

	@Override
	protected void performDefaults() {
		
		super.performDefaults();
		 IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		 store.setDefault(MBSANICEPreferencePage.FILTERFMEA, false);
	}

}
