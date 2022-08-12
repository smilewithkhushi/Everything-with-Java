
import java.awt.*;
import java.awt.event.*;
		
public class Ques13iv extends Frame {
	
	String msg = " Typed character is  :- ";
	
	public Ques13iv()
	{
		setLayout(new FlowLayout());
		addKeyListener(new Ques13iv(this));
		addWindowListener(new MyWindowAdapter());
	}
      public void paint(Graphics g)
      {
    	  g.drawString(msg, 100, 100);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Key_Adapter o1 = new Key_Adapter();
      o1.setSize(new Dimension(150,200));
      o1.setTitle(" List question number 11 ");
		o1.setVisible(true);
	}

}

class MyKeyAdapter extends KeyAdapter{
	Ques13iv o2;
	public MyKeyAdapter(` o2) {
		this.o2=o2;
	}
	public void keyTyped(KeyEvent k) {
		o2.msg += k.getKeyChar();
		o2.repaint();
	}
}
class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

