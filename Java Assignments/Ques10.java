import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ques10 extends JFrame implements ItemListener {

	Ques10(){
		JFrame frame=new JFrame("TOGGLEBUTTON");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,250);
		frame.getContentPane().setBackground(Color.red);
		
		JLabel label1=new JLabel ("Click the Button to change Background");
	    JToggleButton toggleBtn=new JToggleButton("RED/GREEN");
	    
		toggleBtn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if(toggleBtn.isSelected()) {
					label1.setText("-> Background Colour changed to  Green ");
					frame.getContentPane().setBackground(Color.green);
				}
				else {
					label1.setText("-> Background Colour changed to  Red ");
					frame.getContentPane().setBackground(Color.red);
				}
			}
		});
	
		frame.add(label1);
		frame.add(toggleBtn);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
SwingUtilities.invokeLater(
		new Runnable() {
			public void run() {
				new Ques10();
			}
		});
	}
}

