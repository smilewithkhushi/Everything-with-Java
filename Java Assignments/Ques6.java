import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ques6 {
	float CalculateFactorial(String a){
		float num=Float.parseFloat(a);
		float fact=1;
		for (int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	String CalculateFibonacci(Float a) {
		float terms=a;
		int n1=1;
		int n2=2;
		String str=" ";
		for (int i=1; i<=terms; ++i) {
			str+=n1+",";
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return str;
		
	}
	
	Ques6(){
	//Basic Frame Settings to set up display window
	JFrame jfrm=new JFrame("Java Application for Factorial & Fibonacci Series Calculation");
	jfrm.getContentPane().setBackground(Color.WHITE);
	jfrm.setSize(500,500);
	jfrm.setLayout(new FlowLayout());
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//text field settings
	JTextField textBox=new JTextField(15);

	JButton heading=new JButton("PROGRAM TO CALCULATE FACTORIAL AND FIBONACCI SERIES");
	heading.setBackground(Color.YELLOW);
	heading.setForeground(Color.BLACK);
	heading.setAlignmentX(50);
	
	//color and button settings for Factorial Button
	Color c=new Color(255,255,255);
	JButton CalcFact=new JButton("Calculate Factorial");
	CalcFact.setBackground(Color.PINK);
	CalcFact.setAlignmentY(60);
	CalcFact.setAlignmentX(90);

	//color and button settings for Fibonacci Button
	Color d=new Color(255,255,255);
	JButton CalcFib=new JButton("Calculate Fibonacci Series");
	CalcFib.setBackground(Color.PINK);
	CalcFib.setAlignmentY(60);
	CalcFib.setAlignmentX(90);

		
		//adding all components to the frame
	JLabel jlab=new JLabel("Enter a number : ");
	jlab.setPreferredSize(new Dimension(200,100));
	jlab.setHorizontalAlignment(JLabel.CENTER);
	
	JLabel outputBox1=new JLabel("");
	outputBox1.setPreferredSize(new Dimension(200,100));
	outputBox1.setHorizontalAlignment(JLabel.CENTER);
	JLabel outputBox2=new JLabel("");
	outputBox2.setPreferredSize(new Dimension(200,100));
	outputBox2.setHorizontalAlignment(JLabel.CENTER);
	
	//when button is clicked
	CalcFact.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			String input=textBox.getText();
			float outputFact=CalculateFactorial(input);
			outputBox1.setText("\n The Factorial is "+outputFact);
		}
	});
	
	CalcFib.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			String input=textBox.getText();
			float inputFloat=Float.parseFloat(input);
			String outputFib=CalculateFibonacci(inputFloat);
			outputBox2.setText("\n The Fibonacci Series is "+outputFib);
		}
	});
	//adding components and visibility
	jfrm.add(heading);
	jfrm.add(jlab);
	jfrm.add(textBox);
	jfrm.add(CalcFact);
	jfrm.add(CalcFib);
	jfrm.add(outputBox1);
	jfrm.add(outputBox2);
	jfrm.setVisible(true);

	}		

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ques6();
			}
		});
}
}