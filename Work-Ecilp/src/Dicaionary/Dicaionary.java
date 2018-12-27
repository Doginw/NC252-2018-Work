package Dicaionary;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ReadFileExcel.ReadExcelFile;
import jxl.read.biff.BiffException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dicaionary {

	private JFrame frmDictionaryV;
	private JTextField textField;
	private JTable table;
	private ReadExcelFile excel = new ReadExcelFile();
	private JScrollPane scrollPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dicaionary window = new Dicaionary();
					window.frmDictionaryV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws BiffException 
	 */
	public Dicaionary() throws BiffException, IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 * @throws BiffException 
	 */
	private void initialize() throws BiffException, IOException {
		frmDictionaryV = new JFrame();
		frmDictionaryV.setForeground(Color.GRAY);
		frmDictionaryV.setTitle("Dictionary. V1.0");
		frmDictionaryV.setBounds(100, 100, 800, 600);
		frmDictionaryV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDictionaryV.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToDictionary = new JLabel("Welcome to Dictionary.");
		lblWelcomeToDictionary.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWelcomeToDictionary.setHorizontalAlignment(SwingConstants.LEFT);
		lblWelcomeToDictionary.setBounds(20, 24, 472, 43);
		frmDictionaryV.getContentPane().add(lblWelcomeToDictionary);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField.setBounds(20, 89, 619, 30);
		frmDictionaryV.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u0E04\u0E49\u0E19\u0E2B\u0E32");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					int num=0;
					String text = textField.getText();
					
					text.trim();
					text.toLowerCase();
					
					
						
					
					
					for(int i = 1;i<excel.getRow();i++) {
					table.setValueAt(null,i, 1);
					table.setValueAt(null, i, 0);
					}
					num = excel.find(text, excel);
					for(int i = 0;i<=10;i++) {
					table.setValueAt(excel.readWork(num+i), i+1, 0);
					table.setValueAt(excel.readDiscussion(num+i), i+1, 1);
					}
					textField.setText(null);
				
				
				
				
				
				} catch (BiffException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		button.setBounds(661, 85, 97, 34);
		frmDictionaryV.getContentPane().add(button);
		
		
		//
		
		String ex[]= new String[excel.getRow()];
		String ex2[] = new String[excel.getRow()];
		for(int i=0;i<excel.getRow();i++) {
			ex[i] = excel.readWork(i);
			ex2[i] = excel.readDiscussion(i);
		}
		String exAll [][] = new String[ex.length][ex2.length];
		for(int j=0;j<ex.length;j++) {
			int i=0;
				exAll[j][i] = ex[j];
				exAll[j][i+1] = ex2[j];
			}
			
		 
		
		//String fate[][]= {{"R1/1","R1/2"},{"R2/1","R2/2"}};
		String header []  = {"Work","Discussion"};
		//
		table = new JTable(exAll,header);
		table.setSurrendersFocusOnKeystroke(true);
		table.setEnabled(false);
		table.getTableHeader().setForeground(Color.black);
		table.setRowSelectionAllowed(false);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setBounds(22, 141, 735, 400);
		frmDictionaryV.getContentPane().add(table);
		
	}
}
