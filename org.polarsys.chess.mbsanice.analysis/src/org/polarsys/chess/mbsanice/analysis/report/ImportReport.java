package org.polarsys.chess.mbsanice.analysis.report;

import org.eclipse.uml2.uml.Class;

public class ImportReport {
	
	private String category;
	private Class block;
	private String message;
	
	//constructor for warning/error messages
	public ImportReport(String category, String message) {
		this.category = category;
		this.block = null;
		this.message = message;
	}

	//constructor for info messages
	public ImportReport(String category, Class block, String message) {
		this.category = category;
		this.block = block;
		this.message = message;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Class getBlock() {
		return block;
	}

	public void setBlock(Class block) {
		this.block = block;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
