import java.awt.*;
import java.awt.event.*;

public class awtStudentInfo extends Frame implements ActionListener  {
	Button A,B;
	String msg1 = "",msg2="",msg3="",msg4="";
	
	public awtStudentInfo() {
		setLayout(new FlowLayout());
		A=new Button("A");
		B=new Button("B");
		add(A);
		add(B);
		A.addActionListener(this);
		B.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we ) {
				System.exit(0);
			}
		});	
	}
	public void actionPerformed(ActionEvent e2) {
		String s=e2.getActionCommand();
		if(s.equals("A"))
		{
			msg1= " NAME - KHUSHI PANWAR ";
			msg2 = " COURSE - COMPUTER SCIENCE ";
			msg3 = " ROLL NUMBER - 2021334";
			msg4 = " COLLEGE NAME - SRCAS-W";
		}
		
		else if(s.equals("B"))
			{msg1= " CGPA in previous semester :- 9 ";
			msg2= "";
			msg3= "";
			msg4= "";
		}
		repaint();
	}
	 public void paint(Graphics g)
     {
   	  g.drawString(msg1, 20, 100);
   	 g.drawString(msg2, 20, 130);
   	 g.drawString(msg3, 20, 160);
   	 g.drawString(msg4, 20, 190);
     }

   
	public static void main(String[] args) {
		
	awtStudentInfo o1=new awtStudentInfo();
		o1.setSize(new Dimension(300, 300));
		o1.setTitle(" List question number 12 ");
		o1.setVisible(true);
	}
}
