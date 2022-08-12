import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.FlowLayout;

class panel1 extends JPanel
{
	String msg = " TYPED CHARACTERS ";
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(msg, 150, 150);
	}
}

class Frame1 extends JFrame {
	panel1 p1;
	Frame1()
	{
		super(" KEY EVENT HANDLING USING SWING @_@  ");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1=new panel1();
	    add(p1);
		addKeyListener(new MyKeyAdapter2(p1));
		setVisible(true);
	}
}

class MyKeyAdapter2 extends KeyAdapter {
	panel1 o1;
	MyKeyAdapter2(panel1 o2){
		o1=o2;
	}
	public void keyTyped(KeyEvent ke) {
		o1.msg+=ke.getKeyChar();
		o1.repaint();	
	}
}
public class keyAdapterPanel {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Frame1();
			}
		});
	}
}
