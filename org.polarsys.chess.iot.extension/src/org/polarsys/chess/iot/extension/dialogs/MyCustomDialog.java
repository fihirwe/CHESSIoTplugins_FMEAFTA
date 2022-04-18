package org.polarsys.chess.iot.extension.dialogs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.w3c.dom.ls.LSInput;

public class MyCustomDialog extends TitleAreaDialog {

	private Text nameText;
	private Text latitudeText;
	private Text longitudeText;

	private String name;
	private String latitude;
	private String longitude;
	private String selected="OTHER";
	private List<String> listOptions;

	public MyCustomDialog(Shell parentShell, List<String> options, String newname) {
		super(parentShell);
		name=newname;
		listOptions=options;
	}

	@Override
	public void create() {
		super.create();
		setTitle(name.toUpperCase()+" Properties");
		setMessage("Setting up the "+name+" properties", IMessageProvider.INFORMATION);
	}

//	public static void main(String[] args) {
//		List<String> list = Arrays.asList("foo", "bar");
//		MyCustomDialog dialog1 = new MyCustomDialog(null,list,"test");
//		dialog1.create();
//		if (dialog1.open() == Window.OK) {
////			System.out.println(dialog1.getFirstName());
////			System.out.println(dialog1.getLastName());
//		}
//	}
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.RESIZE);
		parent.setSize(600, 400);

		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(1, false);
		container.setLayout(layout);


		Composite containerButton = new Composite(container, SWT.NONE);
		containerButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout2 = new GridLayout(listOptions.size()+1, false);
		containerButton.setLayout(layout2);

		Label lbtFirstName = new Label(containerButton, SWT.NONE);
		lbtFirstName.setText("Type:     ");

		for (String string : listOptions) {
			Button button = new Button(containerButton, SWT.PUSH);
			button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false,
					false));
			button.setText(" "+string+" ");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					selected=string;
				}
			});
		}


		Composite containerInput = new Composite(container, SWT.NONE);

		containerInput.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layoutInput = new GridLayout(2, false);
		containerInput.setLayout(layoutInput);

		createFirstName(containerInput);
		createLastName(containerInput);

		return area;
	}

	private void createFirstName(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("latitude");

		GridData dataFirstName = new GridData();
		dataFirstName.widthHint=200;

		latitudeText = new Text(container, SWT.BORDER);
		latitudeText.setLayoutData(dataFirstName);
	}

	private void createLastName(Composite container) {
		Label lbtLastName = new Label(container, SWT.NONE);
		lbtLastName.setText("Longitude");

		GridData dataLastName = new GridData();
		dataLastName.widthHint=200;
		longitudeText = new Text(container, SWT.BORDER);
		longitudeText.setLayoutData(dataLastName);
	}



	@Override
	protected boolean isResizable() {
		return true;
	}

	// save content of the Text fields because they get disposed
	// as soon as the Dialog closes
		private void saveInput() {
			if(latitudeText.getText()==null){
				latitude="0";
			}
			else{
				latitude = latitudeText.getText();
			}
			if(longitudeText.getText()==null){
				longitude="0";
			}
			else{
				longitude = longitudeText.getText();
			}
		}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public Text getNameText() {
		return nameText;
	}

	public void setNameText(Text nameText) {
		this.nameText = nameText;
	}

	public Text getLatitudeText() {
		return latitudeText;
	}

	public void setLatitudeText(Text latitudeText) {
		this.latitudeText = latitudeText;
	}

	public Text getLongitudeText() {
		return longitudeText;
	}

	public void setLongitudeText(Text longitudeText) {
		this.longitudeText = longitudeText;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public List<String> getListOptions() {
		return listOptions;
	}

	public void setListOptions(List<String> listOptions) {
		this.listOptions = listOptions;
	}
}
