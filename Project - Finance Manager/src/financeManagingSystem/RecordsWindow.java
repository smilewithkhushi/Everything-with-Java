package financeManagingSystem;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.*;
import java.awt.event.*;

public class RecordsWindow implements ActionListener {
	
	JTable jt_incomeRecords, jt_expenseRecords, table;
	JLabel status;
	JFrame jfrm;
	JButton jb_clear, jb_back, jb_expense , jb_income;
	JScrollPane scrollPane1, scrollPane2;
	String[] colName, data;
	DefaultTableModel model;
	
	public RecordsWindow() {
		
		jfrm=new JFrame(" FinBud : FINANCIAL RECORDS ");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(430,680);
		jfrm.setLayout(null);
		jfrm.getContentPane().setBackground(Color.pink);

		JPanel panel=new JPanel();
		jfrm.add(panel);
		
		//border settings
		Border blackline=BorderFactory.createLineBorder(Color.black);
		Border blueline=BorderFactory.createLineBorder(Color.white);
		
		//font settings
		Font head1=new Font(Font.SERIF, Font.BOLD, 23);   //top head 
		Font head2=new Font(Font.DIALOG, Font.BOLD, 20);   //head 2 
		Font f2=new Font(Font.MONOSPACED, Font.BOLD, 13);   //calc screen
		Font f3=new Font(Font.DIALOG, Font.BOLD, 12);
		Font f0=new Font(Font.DIALOG, Font.BOLD, 16);	//calc buttons
		Font btn=new Font(Font.MONOSPACED, Font.BOLD, 16);   //for buttons
		
		//heading back button
		Icon i_back = new ImageIcon("back.PNG");
		jb_back=new JButton(i_back);
		jb_back.setBounds(0,0,65,64);
		jb_back.setForeground(Color.white);
		jb_back.setBackground(Color.black);
		jb_back.addActionListener(this);
		jfrm.add(jb_back);
		
		//heading  Personal Expense 
		JToggleButton head=new JToggleButton("FINANCIAL RECORDS    ");
		head.setBounds(64,0,360,65);
		head.setForeground(Color.white);
		head.setBackground(Color.black);
		head.setBorder(blueline);
		head.setFont(head2);
		jfrm.add(head);
		
		
		//table 1 : income records
		jt_incomeRecords= new JTable();
       jt_incomeRecords.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JTableHeader header1 = jt_incomeRecords.getTableHeader();
		header1.setBackground(Color.yellow);
		scrollPane1 = new JScrollPane(jt_incomeRecords);
		scrollPane1.setBounds(10,130,390,300);

		//table 2 : expense records
		table= new JTable();
		JTableHeader header = table.getTableHeader();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		header.setBackground(Color.yellow);
		scrollPane2 = new JScrollPane(table);
		scrollPane2.setBounds(10,130,390,300);
		
		//buttons: back , clear and save
		jb_expense=new JButton("Expenses");
		jb_expense.setBounds(100,80,90,40);
		jb_expense.setBorder(blueline);
		jb_expense.setFont(f2);
		jb_expense.setForeground(Color.white);
		jb_expense.setBackground(Color.BLUE);
		jb_expense.setActionCommand("clear");
		jb_expense.addActionListener(this);
		jfrm.add(jb_expense);
		
		jb_income=new JButton("Income");
		jb_income.setBounds(240,80,90,40);
		jb_income.setBorder(blueline);
		jb_income.setFont(f2);
		jb_income.setForeground(Color.white);
		jb_income.setBackground(Color.BLUE);
		jb_income.setActionCommand("clear");
		jb_income.addActionListener(this);
		jfrm.add(jb_income);
		
		
		status=new JLabel(" ");
		status.setBounds(100,520,300,40);
	    jfrm.add(status);
	    jfrm.setVisible(true);		
		
	jb_back.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			HomeWindow HomeWindow=new HomeWindow();
			HomeWindow.setVisible(true);
			status.setText(" ");
		}			
	});
	
	jb_expense.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			DefaultTableModel model2 = (DefaultTableModel) table.getModel();
			model2.setRowCount(0);
			scrollPane1.setVisible(false);
			scrollPane2.setVisible(true);
			jfrm.add(scrollPane2);					
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_data","root","unbroken2003");
				Statement st=con.createStatement();
				String query="SELECT * FROM Expense_Record";
				ResultSet rs=st.executeQuery(query);
				ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
				DefaultTableModel model=(DefaultTableModel) table.getModel(); 
				
				int cols=rsmd.getColumnCount();
				colName=new String[cols];
				for (int i=0; i<cols; i++) {
					colName[i]=rsmd.getColumnName(i+1);
				}
				model.setColumnIdentifiers(colName); 
				String id;
				String amount;
				String payee, category, payment_method, payment_status, payment_description;
				while(rs.next()) {
					id=rs.getString(1);
					amount=rs.getString(2);
					payee=rs.getString(3);
					category=rs.getString(4);
					payment_method=rs.getString(5);
					payment_status=rs.getString(6);
					payment_description=rs.getString(7);
					String[] row= {id, amount, payee,category, payment_method, payment_status, payment_description};

					model.addRow(row);
				}
				st.close();
				con.close();
  
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			status.setText("Displaying all the expenses made");

		}			
	});
	
	jb_income.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			DefaultTableModel model1 = (DefaultTableModel) jt_incomeRecords.getModel();
			model1.setRowCount(0);

			scrollPane2.setVisible(false);
			scrollPane1.setVisible(true);
			jfrm.add(scrollPane1);					
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_data","root","unbroken2003");
				Statement st=con.createStatement();
				String query="SELECT * FROM Income_Record";
				ResultSet rs=st.executeQuery(query);
				ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
				DefaultTableModel model=(DefaultTableModel) jt_incomeRecords.getModel(); 
				
				int cols=rsmd.getColumnCount();
				colName=new String[cols];
				for (int i=0; i<cols; i++) {
					colName[i]=rsmd.getColumnName(i+1);
				}
				model.setColumnIdentifiers(colName); 
				String id;
				String amount;
				String payer, category, payment_method, payment_status, payment_description;
				while(rs.next()) {
					id=rs.getString(1);
					amount=rs.getString(2);
					payer=rs.getString(3);
					category=rs.getString(4);
					payment_method=rs.getString(5);
					payment_status=rs.getString(6);
					payment_description=rs.getString(7);
					String[] row= {id, amount, payer,category, payment_method, payment_status, payment_description};

					model.addRow(row);
				}
				st.close();
				con.close();
  
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			status.setText("Displaying the income made");
		}			
	});

	jb_clear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			JOptionPane.showMessageDialog(jb_clear, "Record Cleared!");
			status.setText(" ");
		}			
	});
	
		
}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new RecordsWindow();
			}
		});
	}
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		jfrm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}