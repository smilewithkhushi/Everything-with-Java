import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PanelClass extends JPanel  {
	public String msg1="";
	String msg2="";
	String msg3="";
	String msg4="";
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString(msg1,100,100);
		g.drawString(msg2,100,120);
		g.drawString(msg3,100,140);
		g.drawString(msg4,100,160);
	}
}

class Ques13v  extends JFrame  implements ActionListener{
	JLabel label;
	PanelClass panel;

	Ques13v (){
		panel=new PanelClass();
		getContentPane().add(panel);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1=new JButton("A");
		JButton b2=new JButton("B");
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		panel.setLayout(new FlowLayout());
		panel.add(b1);
		panel.add(b2);

		setVisible(true);
}

public void actionPerformed(ActionEvent ae){

String str=ae.getActionCommand();

	if(str.equals("A")){
	panel.msg1="Name : Khushi Panwar";
	panel.msg2="Course : BSc.(H) Computer Sciences.";
	panel.msg3="Roll no. : 2021334";
	panel.msg4 ="College : Shaheed Rajguru College of Apllied Siences for Women.";
	panel.repaint();
	}
	else{
	panel.msg1="CGPA : 9";
	panel.msg2="";
	panel.msg3="";
	panel. msg4="";
	panel.repaint();
	}
}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new Ques13v();
			}
		});
	}
}
