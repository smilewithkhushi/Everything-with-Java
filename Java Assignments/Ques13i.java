import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ques13i{
	JFrame o1;
	Dimension d;
	
	Ques13i(){
		o1=new JFrame("QUES 13: MOUSE EVENT HANDLING USING SWING");
		o1.setSize(300,300);
		d=o1.getSize();
		o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		o1.addMouseListener(new MyMouseAdapter1(this));
		o1.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				new Ques13i();
			}
		});
	}
}
class MyMouseAdapter1 extends MouseAdapter
{
	Ques13i o2;
	MyMouseAdapter1(Ques13i o2)
	{
		this.o2=o2;
	}
	public void mouseClicked(MouseEvent m1)
	{
		o2.o1.setSize(o2.d.width,o2.d.height);
	}
	public void mouseEntered(MouseEvent m)
	{
		Dimension d;
		d=o2.o1.getSize();
		o2.o1.setSize(d.width*3,d.height*3);
	}
	public void mouseExited(MouseEvent m)
	{
		System.exit(0);
	}
}


