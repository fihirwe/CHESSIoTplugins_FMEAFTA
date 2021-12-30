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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.polarsys.chess.checkers.Activator;


public class ModelCheckingPreferenceInitializer extends AbstractPreferenceInitializer
{
	@Override
	public void initializeDefaultPreferences()
	{
		final IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		for(String tag : Activator.getCheckerManager().getTags()){
			store.setDefault(tag,true);
		}
	}
}
