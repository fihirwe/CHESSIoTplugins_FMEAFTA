package org.polarsys.chess.patterns.dialogs;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.uml2.uml.NamedElement;

/**
 * The Class QNameLabelProvider.
 */
public class QNameLabelProvider extends ColumnLabelProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
		if(element instanceof NamedElement) {
			return ((NamedElement)element).getQualifiedName();
		}
		else {
			return element.toString();
		}
	}

}
