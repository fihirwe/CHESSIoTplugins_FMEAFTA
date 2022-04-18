/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.core.checkerManager;

import java.util.List;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class CheckerTriggerManager {
	Table<String, String, Integer> targetIdHashMap = HashBasedTable.create();

	public void loadCheckersRegistry() {
		// TODO Auto-generated method stub

	}

	public void saveCheckersRegistry() {
		// TODO Auto-generated method stub

	}

	public boolean isTriggered(String checkerUnifiedName, String targetId, int targetCurrentHashCode) {
		Integer lastTargetHashCode = targetIdHashMap.get(checkerUnifiedName, targetId);
		if ((lastTargetHashCode != null) && (!lastTargetHashCode.equals(targetCurrentHashCode))) {
			return true;
		}
		return false;
	}

	public void updateCheckersRegistryEntry(String checkerUnifiedName, String targetId, int targetCurrentHashCode) {
		targetIdHashMap.put(checkerUnifiedName, targetId, targetCurrentHashCode);

	}

	public void updateCheckersRegistry(List<?> targets) {
		// TODO Auto-generated method stub

	}
}
