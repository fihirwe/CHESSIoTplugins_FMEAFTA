/*******************************************************************************
 * Copyright (C) 2020 Fondazione Bruno Kessler.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 ******************************************************************************/
package org.polarsys.chess.checkers.core.utils;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.polarsys.chess.contracts.profile.chesscontract.util.EntityUtil;

public class HashCodeUtils {
	private static final Logger logger = Logger.getLogger(HashCodeUtils.class);

	public int hashCodeStructuralPart(Package mainPackage) throws Exception {
		int hash = 0;
		for (Class clazz : EntityUtil.getInstance().getAllClasses(mainPackage)) {
			int hashClass = hashCodeClassStructuralPart(clazz);
			hash = Objects.hash(hash, hashClass);
		}

		logger.warn("hash for classes: " + hash);

		int hashEnums = Objects.hash(EntityUtil.getInstance().getAllEnumeratives(mainPackage));
		for (Enumeration enumeration : EntityUtil.getInstance().getAllEnumeratives(mainPackage)) {
			int hashEnum = hashCodeEnumeration(enumeration);
			hash = Objects.hash(hash, hashEnum);
		}

		logger.warn("hash for enums: " + hashEnums);

		hash = Objects.hash(hash, hashEnums);

		return hash;
	}

	public int hashCodeClassStructuralPart(Class clazz) {
		int hash = clazz.getName().hashCode();
		for (Property property : clazz.allAttributes()) {
			int hashProperty = hashCodeAttribute(property);
			hash = Objects.hash(hash, hashProperty);
		}

		logger.warn("hash for class " + clazz.getName() + ": " + hash);

		return hash;
	}

	public int hashCodeAttribute(Property property) {

		int hash = Objects.hash(property.getName(), property.getType().getName());
		logger.warn("hash for property " + property.getName() + ": " + hash);

		return hash;
	}

	public int hashCodeEnumeration(Enumeration enumeration) {

		int hash = enumeration.hashCode();
		for (EnumerationLiteral literal : enumeration.getOwnedLiterals()) {
			int hashLiteral = hashCodeLiteral(literal);
			hash = Objects.hash(hash, hashLiteral);
		}

		logger.warn("hash for enum " + enumeration.getName() + ": " + hash);

		return hash;
	}

	public int hashCodeLiteral(EnumerationLiteral literal) {

		int hash = literal.getName().hashCode();
		logger.warn("hash for literal " + literal.getName() + ": " + hash);

		return hash;
	}
}
