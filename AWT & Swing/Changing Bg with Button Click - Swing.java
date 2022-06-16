import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swingRedBlueBtn {
	JLabel jlab;
	JFrame jfrm;
	JButton jbtnRed, jbtnBlue;
	
	swingRedBlueBtn(){
	//Basic Frame Settings to set up display window
	JFrame jfrm=new JFrame("Java Application for Red Blue Button");
	JPanel panel=new JPanel();
	jfrm.getContentPane().setBackground(Color.WHITE);
	jfrm.setSize(500,500);
	jfrm.setVisible(true);
	jfrm.setLayout(new FlowLayout());
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	//color and button settings
	Color c=new Color(255,255,255);
	JButton jbtnRed=new JButton("RED");
	jbtnRed.setBackground(Color.WHITE);
	JButton jbtnBlue=new JButton("BLUE");
	jbtnBlue.setBackground(Color.WHITE);

	//adding all components to the frame
	jfrm.add(jbtnRed);
	jfrm.add(jbtnBlue);
	jlab=new JLabel("Press a button");
	jfrm.add(jlab);
	
	//action listener for red and blue
	//jbtnRed.addActionListener((ActionListener) this);
	jbtnRed.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jfrm.getContentPane().setBackground(Color.RED);
			jlab.setText("\nRED Button pressed!");
		}
	});
	
	jbtnBlue.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jfrm.getContentPane().setBackground(Color.BLUE);
			jlab.setText("\nBLUE Button pressed!");
		}
	});

	jbtnRed.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			jfrm.getContentPane().setBackground(Color.BLUE);
			jlab.setText("BLUE Button pressed!");
		}
	});
	}

	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new swingRedBlueBtn();
			}
		});
}
}
