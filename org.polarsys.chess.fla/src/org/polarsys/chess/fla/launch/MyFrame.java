package org.polarsys.chess.fla.launch;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

// Java program to implement
// a Simple Registration Form
// using Java Swing
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



class MyFrame extends JFrame implements TableModelListener, ActionListener {
	private Container c;
	private JLabel title;
	private JButton sub;
	private JButton cancel;
	private JTable jt;
	private String path;
	
	protected TableModel model = null;

	private String data[][]; 

	public String[][] getData() {
		return data;
	}

	public void setData(String[][] data) {
		this.data = data;
	}

	String columns[]={"Name","Probability","Failure description"};         

	public MyFrame(List<String> devices, String newPath )
	{
		path=newPath;
		setTitle("Probability registration form");
		setBounds(300, 90, 1400, 600);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setResizable(true);
		c = getContentPane();
		c.setLayout(null);
		title = new JLabel("Probability Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 20));
		title.setSize(300, 30);
		title.setLocation(300, 5);
		c.add(title);

		data= new String[devices.size()][3];
		for(int i=0; i<devices.size(); i++){
			data[i][0]=devices.get(i);
		}

		jt=new JTable(new MyTableModel());   		
		jt.setFont(new Font("Arial", Font.PLAIN, 15));
		jt.setCellSelectionEnabled(true);  
		jt.setLocation(50, 50);
		jt.setSize(1300, 450);
		jt.getColumnModel().getColumn(0).setPreferredWidth(600);
		jt.getColumnModel().getColumn(1).setPreferredWidth(120);
		jt.getColumnModel().getColumn(2).setPreferredWidth(520);
		jt.setRowHeight(30);
		jt.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 18));
		JScrollPane scrollPane = new JScrollPane(jt);
		scrollPane.setBounds(50, 50, 1300, 450);
		scrollPane.setFont(new Font("Arial", Font.PLAIN, 15));

		c.add(scrollPane);

		sub = new JButton("SUBMIT");
		sub.setSize(100, 30);
		sub.setBackground(Color.GREEN);
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setLocation(550, 500);
		sub.addActionListener(this);
		c.add(sub);	
		
		cancel = new JButton("CANCEL");
		cancel.setSize(100, 30);
		cancel.setBackground(Color.red);
		cancel.setFont(new Font("Arial", Font.PLAIN, 15));
		cancel.setLocation(700, 500);
		cancel.addActionListener(this);
		c.add(cancel);	
		
		

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {

			TableModel model = jt.getModel();
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet();
			XSSFRow row;
			XSSFCell cell;

			// write the column headers
			row = sheet.createRow(0);
			for (int c = 0; c < model.getColumnCount(); c++) {
				cell = row.createCell(c);
				cell.setCellValue(model.getColumnName(c));
			}

			// write the data rows
			for (int r = 0; r < model.getRowCount(); r++) {
				row = sheet.createRow(r+1);
				for (int c = 0; c < model.getColumnCount(); c++) {
					cell = row.createCell(c);
					Object value = model.getValueAt(r, c);
					if (value instanceof String) {
						cell.setCellValue((String)value);
					} else if (value instanceof Double) {
						cell.setCellValue((Double)value);
					}
				}
			}

			FileOutputStream out;
			try {
//				URI.createPlatformResourceURI(path, false);
				out = new FileOutputStream(path);
				workbook.write(out);
				out.close();
				workbook.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setVisible(false);

		}
		
		else if(e.getSource() == cancel) {
			this.setVisible(false);
		}
	}
	
    class MyTableModel extends AbstractTableModel {

        private String[] columnNames = {"Name","Probability","Failure description"};
        private String[][] data = getData();

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public int getRowCount() {
            return data.length;
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        @Override
        public Class getColumnClass(int c) {
            return String.class;
        }

        @Override
        public boolean isCellEditable(int row, int col) {
            return true;
        }

        @Override
        public void setValueAt(Object value, int row, int col) {
            data[row][col] = (String) value;
            fireTableCellUpdated(row, col);
        }
    }

	@Override
	public void tableChanged(TableModelEvent e) {
		//TO BE IMPLEMENTED
	}
	
	
}
