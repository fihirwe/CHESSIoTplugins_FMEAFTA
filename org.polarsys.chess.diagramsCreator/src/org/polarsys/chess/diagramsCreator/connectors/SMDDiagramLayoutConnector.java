/*******************************************************************************
 * Copyright (C) 2018 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 * Contributors:
 *     Luca Cristoforetti - initial API and implementation
 ******************************************************************************/
package org.polarsys.chess.diagramsCreator.connectors;

import org.eclipse.elk.conn.gmf.GmfDiagramLayoutConnector;
import org.eclipse.elk.core.math.ElkPadding;
import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.core.options.EdgeRouting;
import org.eclipse.elk.core.service.LayoutMapping;
import org.eclipse.elk.graph.ElkEdge;
import org.eclipse.elk.graph.ElkGraphElement;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This class extends the default connector adding specific settings for the State Machine Diagram.
 * @author cristofo
 *
 */
public class SMDDiagramLayoutConnector extends GmfDiagramLayoutConnector {
	
	private static final double topPad = 30;
	private static final double sidePad = 30;

	/**
	 * Adjusts some parameters of the layout.
	 * @param mapping the layout mapping to be modified
	 */
	private void adjustLayout(LayoutMapping mapping) {
		
		for (ElkGraphElement graphElement : mapping.getGraphMap().keySet()) {			
			if (graphElement instanceof ElkNode) {
				ElkNode node = (ElkNode) graphElement;
				if (node.isHierarchical() && node.getParent() != null) {

					// This is the root node, set the algorithm and some padding
					node.setProperty(CoreOptions.ALGORITHM, "org.eclipse.elk.graphviz.dot");
					node.setProperty(CoreOptions.PADDING, new ElkPadding(topPad, sidePad, sidePad, sidePad));					
				}
			}
		}		
	}	
	
    /**
     * {@inheritDoc}
     */
    public LayoutMapping buildLayoutGraph(final IWorkbenchPart workbenchPart, final Object diagramPart) {
       
    	final LayoutMapping mapping = super.buildLayoutGraph(workbenchPart, diagramPart);
        
        adjustLayout(mapping);
        
        return mapping;
    }
}
