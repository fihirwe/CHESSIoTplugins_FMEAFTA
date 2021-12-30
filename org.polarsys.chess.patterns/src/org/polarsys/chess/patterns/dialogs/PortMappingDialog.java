package org.polarsys.chess.patterns.dialogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Port;
import org.polarsys.chess.patterns.profile.PatternsProfile.Pattern;

/**
 * The Class PortMappingDialog.
 */
public class PortMappingDialog extends AbstractMappingDialog {

	/**
	 * Instantiates a new port mapping dialog.
	 *
	 * @param shell the shell
	 * @param chessModel the chess model
	 * @param pattern the pattern
	 * @param modelCtx the model ctx
	 * @param mappings the mappings
	 * @param patternPreview the pattern preview
	 */
	public PortMappingDialog(Shell shell, Model chessModel, Pattern pattern, Class modelCtx, Map<NamedElement, NamedElement> mappings, Image patternPreview) {
		super(shell, chessModel, modelCtx, pattern, patternPreview);
		this.mappings = mappings;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.chess.patterns.dialogs.AbstractMappingDialog#create()
	 */
	@Override
	public void create() {
		super.create();
		setMessage("Map Ports");
	}
	
	/* (non-Javadoc)
	 * @see org.polarsys.chess.patterns.dialogs.AbstractMappingDialog#getPatternInput()
	 */
	@Override
	protected List<NamedElement> getPatternInput() {

		List<NamedElement> result = new ArrayList<>();
		for(ConnectableElement collRole : pattern.getBase_Collaboration().getCollaborationRoles()){
			if(collRole.getType() instanceof Class){
				Class type = (Class) collRole.getType();
				for(Port port : type.getOwnedPorts()){
					if(!result.contains(port)){
						result.add(port);
						mappings.put(port, null);
					}
				}
			}
		}		
		return result;
	}

	/* (non-Javadoc)
	 * @see org.polarsys.chess.patterns.dialogs.AbstractMappingDialog#updateCandidates()
	 */
	@Override
	protected void updateCandidates() {
		// get the owner
		Class owner = null;
		if(patternElem.getOwner() instanceof Class){
			owner = (Class) patternElem.getOwner();
		}
		if(owner != null){
			// search for existing mapping for the owner
			Class mappedClass = null;
			boolean found = false;
			for (NamedElement key : mappings.keySet()) {
				if(key.equals(owner) && ! found){
					mappedClass = (Class) mappings.get(key);
					found = true;
				}
			}
			if(mappedClass != null){
				//if so, updates candidates with ports of the elem mapped to the owner 
				candidates.addAll(mappedClass.getOwnedPorts());
			}
//			else{
//				//otherwise... get all the ports of all classes
//				for(Element elem : chessModel.allOwnedElements()){
//					if(elem instanceof Port){
//						candidates.add((Port) elem);
//					}
//				}
//			}
		}
	}

}
