package org.polarsys.chess.patterns.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.polarsys.chess.patterns.profile.PatternsProfile.Pattern;

/**
 * The Class AbstractMappingDialog.
 */
public abstract class AbstractMappingDialog extends TitleAreaDialog {

	/** The Constant BACK. */
	public static final int BACK = -1;
	
	/** The chess model. */
	protected Model chessModel;
	
	/** The pattern. */
	protected Pattern pattern;
	
	/** The model ctx. */
	protected Class modelCtx;
	
	/** The mappings. */
	protected Map<NamedElement, NamedElement> mappings;
	
	/** The pattern elem. */
	protected NamedElement patternElem;
	
	/** The model elem. */
	protected NamedElement modelElem;
	
	/** The candidates. */
	protected List<NamedElement> candidates;
	
	/** The pattern elments table. */
	private TableViewer patternElmentsTable;
	
	/** The model elements table. */
	private TableViewer modelElementsTable;
	
	/** The map label provider. */
	private MappingLabelProvider mapLabelProvider;
	
	/** The map button. */
	private Button mapButton;
	
	/** The un map button. */
	private Button unMapButton;
	
	/** The clear map button. */
	private Button clearMapButton;

	/** The pattern preview group. */
	private Group patternPreviewGroup;
	
	/** The image label. */
	private Label imageLabel;
	
	/** The pattern preview. */
	private Image patternPreview;
	
	/**
	 * Instantiates a new abstract mapping dialog.
	 *
	 * @param shell the shell
	 * @param chessModel the chess model
	 * @param modelCtx the model ctx
	 * @param pattern the pattern
	 * @param patternPreview the pattern preview
	 */
	public AbstractMappingDialog(Shell shell, Model chessModel, Class modelCtx, Pattern pattern, Image patternPreview) {
		super(shell);
		this.chessModel = chessModel;
		this.pattern = pattern;
		this.patternPreview = patternPreview;
		this.modelCtx = modelCtx;
		this.mappings = new HashMap<NamedElement, NamedElement>();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#create()
	 */
	@Override
	public void create() {
        setHelpAvailable(false);
        super.create();
		setTitle("Apply Design Pattern");
        getButton(IDialogConstants.OK_ID).setText("Next");
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// Add "back" button
		createButton(parent, IDialogConstants.BACK_ID, IDialogConstants.BACK_LABEL, false);
		super.createButtonsForButtonBar(parent);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		
		GridLayout gridLayout = (GridLayout) parent.getLayout();
		gridLayout.numColumns = 3;
		gridLayout.makeColumnsEqualWidth = true;
		parent.setLayout(gridLayout);

		GridData gd = new GridData();
		gd.widthHint = 400;
		gd.heightHint = 300;
		gd.grabExcessVerticalSpace = true;
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		gd.verticalAlignment = GridData.FILL;
		gd.horizontalSpan = 3;
		
		Group mappingGroup = new Group(parent, SWT.BORDER);
		mappingGroup.setText("binding of pattern types");
		mappingGroup.setLayout(new GridLayout(1, false));
		mappingGroup.setLayoutData(gd);
//		mappingGroup.setSize(400, 300);

		patternElmentsTable = new TableViewer(mappingGroup, SWT.BORDER);
		// Add a column header named "Column 2" that's left justified
		TableViewerColumn c1Viewer = new TableViewerColumn(patternElmentsTable, SWT.LEFT);
		TableColumn column1 = c1Viewer.getColumn();
		column1.setText("Element");
		column1.setWidth(200);
		TableViewerColumn c2Viewer = new TableViewerColumn(patternElmentsTable, SWT.LEFT);
		TableColumn column2 = c2Viewer.getColumn();
		column2.setText("Bound to");
		column2.setWidth(200);

		// Show the column headers
		patternElmentsTable.getTable().setHeaderVisible(true);
		
		GridData data = new GridData(GridData.FILL_BOTH);
		data.widthHint = 400;
		data.heightHint = 200;
		patternElmentsTable.setContentProvider(new ArrayContentProvider());
		
		c1Viewer.setLabelProvider(new MappingLabelProvider(1, mappings));
		mapLabelProvider = new MappingLabelProvider(2, mappings);
		c2Viewer.setLabelProvider(mapLabelProvider);
		patternElmentsTable.getTable().setLayoutData(data);
		patternElmentsTable.setInput(getPatternInput().toArray());
		
		patternElmentsTable.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = patternElmentsTable.getSelection();
				if(selection instanceof StructuredSelection) {
					Object[] selected = ((StructuredSelection)selection).toArray();
					if((selected.length == 1) && (selected[0] instanceof NamedElement)) {
						patternElem = (NamedElement) selected[0];
						candidates.clear();
						updateCandidates();
						modelElementsTable.setInput(candidates.toArray());
					}
				}
			}
		});
			
		mapButton = new Button(parent, SWT.NONE);
		mapButton.setText("Create mapping");
		mapButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				mappings.put(patternElem, modelElem);
				patternElmentsTable.refresh();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		unMapButton = new Button(parent, SWT.NONE);
		unMapButton.setText("Delete mapping");
		unMapButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				mappings.put(patternElem, null);
				patternElmentsTable.refresh();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		clearMapButton = new Button(parent, SWT.NONE);
		clearMapButton.setText("Clear all mappings");
		clearMapButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				for (NamedElement patternType : mappings.keySet()) {
					if(mappings.get(patternType) != null){
						mappings.put(patternType, null);
					}
				}
				patternElmentsTable.refresh();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		GridData buttonData = new GridData();
		mapButton.setLayoutData(buttonData);
		unMapButton.setLayoutData(buttonData);
		clearMapButton.setLayoutData(buttonData);
				
		Group candidatesGroup = new Group(parent, SWT.BORDER);
		candidatesGroup.setText("Available candidates for mapping from the model");
		candidatesGroup.setLayout(new GridLayout(1, false));
		candidatesGroup.setLayoutData(gd);
//		candidatesGroup.setSize(400, 300);

		modelElementsTable = new TableViewer(candidatesGroup, SWT.BORDER);
		modelElementsTable.setContentProvider(new ArrayContentProvider());

		candidates = new ArrayList<>();

		modelElementsTable.setInput(candidates.toArray());
		modelElementsTable.getTable().setLayoutData(data);
		modelElementsTable.setLabelProvider(new QNameLabelProvider());

		modelElementsTable.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = modelElementsTable.getSelection();
				if(selection instanceof StructuredSelection) {
					Object[] selected = ((StructuredSelection)selection).toArray();
					if((selected.length == 1) && (selected[0] instanceof NamedElement)) {
						modelElem = (NamedElement) selected[0];
					}
				}
			}
		});
		
		//preview
		GridData gdPreview = new GridData();
		gdPreview.widthHint = 800;
		gdPreview.heightHint = 400;
		gdPreview.grabExcessVerticalSpace = true;
		gdPreview.grabExcessHorizontalSpace = true;
		gdPreview.horizontalAlignment = GridData.FILL;
		gdPreview.verticalAlignment = GridData.FILL;
		gdPreview.horizontalSpan = 3;
		
		patternPreviewGroup = new Group(parent, SWT.BORDER);
		patternPreviewGroup.setText("Pattern Preview");
		patternPreviewGroup.setLayout(new FillLayout());
		patternPreviewGroup.setLayoutData(gdPreview);
		
		imageLabel = new Label(patternPreviewGroup, SWT.CENTER);
		if(patternPreview != null){
			imageLabel.setImage(patternPreview);
			
		}else{
			imageLabel.setText("preview not available");
			imageLabel.setImage(null);
		}

		return super.createDialogArea(parent);
	}

	/**
	 * Gets the pattern input.
	 *
	 * @return the pattern input
	 */
	abstract protected List<NamedElement> getPatternInput();

	/**
	 * Update candidates.
	 */
	abstract protected void updateCandidates();

	
	/**
	 * Gets the mappings.
	 *
	 * @return the mappings
	 */
	public Map<NamedElement, NamedElement> getMappings() {
		return mappings;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#buttonPressed(int)
	 */
	@Override
	protected void buttonPressed(int buttonId) {
		if (IDialogConstants.BACK_ID == buttonId) {
			backPressed();
		}else{
			super.buttonPressed(buttonId);
		}
	}
	
	/**
	 * Back pressed.
	 */
	protected void backPressed() {
		setReturnCode(BACK);
		close();
	}

}