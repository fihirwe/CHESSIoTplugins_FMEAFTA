package org.polarsys.chess.mbsanice.analysis.report;

import java.util.ArrayList;
import java.util.List;

public class FlaRulesImportReportProvider {
	
	private List<ImportReport> reports;
	
	public FlaRulesImportReportProvider(){
		reports = new ArrayList<ImportReport>();
	}

	public  List<ImportReport> getReports() {
		return reports;
	}
	public void addReport(ImportReport report) {
		reports.add(report);
	}

}
