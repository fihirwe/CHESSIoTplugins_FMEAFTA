package org.polarsys.chess.patterns.dialogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.polarsys.chess.patterns.profile.PatternsProfile.Pattern;

/**
 * The Class ConnectorMappingDialog.
 */
public class ConnectorMappingDialog extends AbstractMappingDialog {

	/**
	 * Instantiates a new connector mapping dialog.
	 *
	 * @param shell the shell
	 * @param chessModel the chess model
	 * @param pattern the pattern
	 * @param modelCtx the model ctx
	 * @param mappings the mappings
	 * @param patternPreview the pattern preview
	 */
	public ConnectorMappingDialog(Shell shell, Model chessModel, Pattern pattern, Class modelCtx, Map<NamedElement, NamedElement> mappings, Image patternPreview) {
		super(shell, chessModel, modelCtx, pattern, patternPreview);
		this.mappings = mappings;
	}
	
	/* (non-Javadoc)
	 * @see org.polarsys.chess.patterns.dialogs.AbstractMappingDialog#create()
	 */
	@Override
	public void create() {
		super.create();
		setMessage("Map Connectors");
		getButton(IDialogConstants.OK_ID).setText("OK");
	}
	
	/* (non-Javadoc)
	 * @see org.polarsys.chess.patterns.dialogs.AbstractMappingDialog#getPatternInput()
	 */
	@Override
	protected List<NamedElement> getPatternInput() {
		List<NamedElement> result = new ArrayList<>();
		for(Connector conn : pattern.getBase_Collaboration().getOwnedConnectors()){
			if(!result.contains(conn)){
				result.add(conn);
				mappings.put(conn, null);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.chess.patterns.dialogs.AbstractMappingDialog#updateCandidates()
	 */
	@Override
	protected void updateCandidates() {
		//get all connectors in the model context
		for(Element elem : modelCtx.allOwnedElements()){
			if(elem instanceof Connector){
				candidates.add((Connector)elem);
			}
		}

	}

}
