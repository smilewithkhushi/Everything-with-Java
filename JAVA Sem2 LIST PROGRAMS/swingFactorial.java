import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swingFactorial {
	float CalculateFactorial(String a){
		float num=Float.parseFloat(a);
		float fact=1;
		for (int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	swingFactorial(){
	//Basic Frame Settings to set up display window
	JFrame jfrm=new JFrame("Java Application for Factorial");
	jfrm.getContentPane().setBackground(Color.WHITE);
	jfrm.setSize(500,500);
	jfrm.setLayout(new FlowLayout());
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//text field settings
	JTextField textBox=new JTextField(15);
	
	//color and button settings
	Color c=new Color(255,255,255);
	JButton CalcFact=new JButton("Calculate Factorial");
	CalcFact.setBackground(Color.PINK);
	CalcFact.setAlignmentY(60);
	CalcFact.setAlignmentX(90);

	//adding all components to the frame
	JLabel jlab=new JLabel("Enter a number : ");
	jlab.setAlignmentX(50);
	JLabel status1=new JLabel("");
	JLabel status2=new JLabel("");
	JLabel outputBox=new JLabel("");
	
	//when button is clicked
	CalcFact.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			status1.setText("\nThe Value entered :"+textBox.getText());
			String input=textBox.getText();
			float output=CalculateFactorial(input);
			outputBox.setText("\n The Factorial is "+output);
		}
	});
	
	//adding components and visibility
	jfrm.add(jlab);
	jfrm.add(textBox);
	jfrm.add(CalcFact);
	jfrm.add(status1);
	jfrm.add(status2);
	jfrm.add(outputBox);
	jfrm.setVisible(true);

	}		

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new swingFactorial();
			}
		});
}
}