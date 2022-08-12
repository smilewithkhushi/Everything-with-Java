
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PanelK extends JPanel
{
	String msg1= "TYPED CHARACTERS : ";
	protected void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		g.drawString(msg1,  150, 150);
	}
}


class MyKeyAdapter1 extends KeyAdapter{
	PanelK o1;
	MyKeyAdapter1(PanelK o2){
		o1=o2;
	}
	public void keyTyped(KeyEvent ke)
	{
		o1.msg1+=ke.getKeyChar();
		o1.repaint();
	}
}


class FrameK extends JFrame
{
	PanelK panel;
	FrameK(){
		super("Key Event Handling Swings" );
		setSize(450,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.pink);

		panel= new PanelK();
		add(panel);
		addKeyListener(new MyKeyAdapter1(panel));
		setVisible(true);
	}
}
public class Ques13iv{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new FrameK();
				}
		});
	}
}

