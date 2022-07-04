//import java.awt.*;
import java.awt.event.*;
public class typedCharAWT extends Frame {
	
	String msg = " Typed character is  :- ";
	
	public typedCharAWT()
	{
		setLayout(new FlowLayout());
		addKeyListener(new MyKeyAdapter(this));
		addWindowListener(new MyWindowAdapter());
	}
      public void paint(Graphics g)
      {
    	  g.drawString(msg, 100, 100);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typedCharAWT o1 = new typedCharAWT();
        o1.setSize(new Dimension(500,200));
        o1.setTitle(" List question number 11 ");
		o1.setVisible(true);
	}

}

class MyKeyAdapter extends KeyAdapter{
	typedCharAWT o2;
	public MyKeyAdapter(typedCharAWT o2) {
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



import java.awt.*;
import java.awt.event.*;
public class typedCharAWT extends Frame {
	
	String msg = " Typed character is  :- ";
	
	public typedCharAWT()
	{
		setLayout(new FlowLayout());
		addKeyListener(new MyKeyAdapter(this));
		addWindowListener(new MyWindowAdapter());
	}
      public void paint(Graphics g)
      {
    	  g.drawString(msg, 100, 100);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typedCharAWT o1 = new typedCharAWT();
        o1.setSize(new Dimension(500,200));
        o1.setTitle(" List question number 11 ");
		o1.setVisible(true);
	}

}

class MyKeyAdapter extends KeyAdapter{
	typedCharAWT o2;
	public MyKeyAdapter(typedCharAWT o2) {
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

