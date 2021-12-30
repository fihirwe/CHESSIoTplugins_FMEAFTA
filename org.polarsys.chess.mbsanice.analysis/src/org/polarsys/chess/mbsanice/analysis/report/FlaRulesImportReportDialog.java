package org.polarsys.chess.mbsanice.analysis.report;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.services.openelement.service.OpenElementService;
import org.eclipse.papyrus.views.search.scope.ScopeEntry;
import org.eclipse.papyrus.views.search.utils.DefaultServiceRegistryTracker;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PartInitException;

public class FlaRulesImportReportDialog extends TitleAreaDialog {
	
	private FlaRulesImportReportProvider reportProvider;
	private TableViewer viewer;

	public FlaRulesImportReportDialog(Shell parentShell, FlaRulesImportReportProvider reportProvider) {
		super(parentShell);
		this.reportProvider = reportProvider;
	}
	
	@Override
	protected void setShellStyle(int newShellStyle) {           
	    super.setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE);
	    setBlockOnOpen(false);
	}
	
	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
    public void create() {
        setHelpAvailable(false);
        super.create();
        setTitle("Import FLA Rules from Excel Report");
        setMessage("Details:");
        getButton(IDialogConstants.CANCEL_ID).setVisible(false);
        getButton(IDialogConstants.OK_ID).setText("Close");
    }
	
	@Override
    protected Control createDialogArea(Composite parent) {        
        
    	//define the TableViewer
        viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);

        // create the columns
        createColumns();

        // make lines and header visible
        final Table table = viewer.getTable();
        table.setHeaderVisible(true);
        table.setLinesVisible(true);
        
        viewer.setContentProvider(new ArrayContentProvider());
        viewer.setInput(reportProvider.getReports());
        
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
                if(selection.size() == 1){
                	ImportReport selReport = (ImportReport) selection.getFirstElement();
                	if(selReport.getBlock() != null){
                		org.eclipse.uml2.uml.Class block = selReport.getBlock();
                		URI umlUri = block.eResource().getURI();
                		ScopeEntry scopeEntry = new ScopeEntry(umlUri, new DefaultServiceRegistryTracker());
						OpenElementService service;
						try {
							service = scopeEntry.getServicesRegistry().getService(OpenElementService.class);
							service.openSemanticElement(block);
						} catch (ServiceException | PartInitException e) {
							e.printStackTrace();
						}

                	}
                }
            }
        });
        
        // define layout for the viewer
        GridData gridData = new GridData();
        gridData.verticalAlignment = GridData.FILL;
        gridData.horizontalSpan = 2;
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = true;
        gridData.horizontalAlignment = GridData.FILL;
        viewer.getControl().setLayoutData(gridData);
        
        return super.createDialogArea(parent);
    }
	
	private void createColumns() {
		
		int[] bounds = {100, 150, 450};
		String[] titles = new String[3];
		titles[0] = "Category";
		titles[1] = "Block";
		titles[2] = "Message";

		//first column
		TableViewerColumn firstCol = createTableViewerColumn(titles[0], bounds[0], 0);		
		// set label provider
		firstCol.setLabelProvider(new StyledCellLabelProvider() {
		    @Override
		    public void update(ViewerCell cell) {
		    	ImportReport report = (ImportReport) cell.getElement();
                String cellText = report.getCategory();
                cell.setText(cellText);
		    	
		    	if(cell.getText().equals("INFO")){
		    		StyleRange infoStyledRange = new StyleRange(0, 4, null, Display.getCurrent().getSystemColor(SWT.COLOR_CYAN));
		    		StyleRange[] range = {infoStyledRange};
		    		cell.setStyleRanges(range);
		    	}
		    	if(cell.getText().equals("WARNING")){
		    		StyleRange warnStyledRange = new StyleRange(0, 7, null, Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW));
		    		StyleRange[] range = {warnStyledRange};
		    		cell.setStyleRanges(range);
		    	}
		    	
		    	if(cell.getText().equals("ERROR")){
		    		StyleRange errStyledRange = new StyleRange(0, 5, null, Display.getCurrent().getSystemColor(SWT.COLOR_MAGENTA));
		    		StyleRange[] range = {errStyledRange};
		    		cell.setStyleRanges(range);
		    	}
		        super.update(cell);
		    }
		});
		

		//second column
		TableViewerColumn secondCol = createTableViewerColumn(titles[1], bounds[1], 1);
		secondCol.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object obj) {
				String text = "N/A";
				org.eclipse.uml2.uml.Class block = ((ImportReport) obj).getBlock();
				if(block != null){
					text = block.getName();
				}
				return text;
			}
		});
		
		//second column
		TableViewerColumn thirdCol = createTableViewerColumn(titles[2], bounds[2], 2);
		thirdCol.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object obj) {
				return ((ImportReport)obj).getMessage();
			}
		});
		
	}
	
	 private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
	        final TableViewerColumn viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
	        final TableColumn column = viewerColumn.getColumn();
	        column.setText(title);
	        column.setWidth(bound);
	        column.setResizable(true);
	        column.setMoveable(true);
	        return viewerColumn;
	    }
	
	public TableViewer getViewer() {
		return viewer;
	}
}
