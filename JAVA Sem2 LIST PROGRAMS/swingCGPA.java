import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

 class student_info extends JPanel {
	
	Button A,B;
	String msg1="",msg2="",msg3="",msg4="";
	
	public student_info()
	{  setBackground(Color.gray);}
		
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(msg1, 20, 100);
		g.drawString(msg2, 20, 130);
		g.drawString(msg3, 20, 160);
		g.drawString(msg4, 20, 190);
	}
	
	}



public class swingCGPA extends JFrame implements ActionListener
{
	JLabel jl;
	student_info si;
	swingCGPA()
	{
		setTitle(" Swing Frame panel @_@ ");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		si=new student_info();
		getContentPane().add(si);
		JButton A=new JButton("A");
		JButton B=new JButton("B");
		si.setLayout(new FlowLayout());
		si.add(A);
		si.add(B);
		A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String str = e1.getActionCommand();
				if(str.equals("A"))
				
					si.msg1=" NAME - KHUSHI PANWAR";
					si.msg2=" COURSE - BSC(H) COMPUTER SCIENCE ";
					si.msg3=" ROLL NUMBER - 2021334";
					si.msg4=" COLLEGE NAME - SRCASW ";
					
				
				si.repaint();
				
			} });
		
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				String str = e1.getActionCommand();
				if(str.equals("B"))
				
					si.msg1=" CGPA IN PREVIOUS SEMESTER :- 9.0 ";
					si.msg2="";
					si.msg3="";
					si.msg4="";
						
					
				
				si.repaint();
				
			} });
		
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{ new swingCGPA();}
		});

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
