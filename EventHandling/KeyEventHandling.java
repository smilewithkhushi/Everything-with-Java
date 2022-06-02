//QUES 1 : KEY EVENT HANDLING USING KEY LISTENER INTERFACE

import java.awt.*;
import java.awt.event.*;

public class keyEventHandling extends Frame implements KeyListener {

	String msg = "";
	String keyState="";
	
	public keyEventHandling() {
		addKeyListener(this);
		addWindowListener(new MyWindowAdapter());
	}
	
	//HANDLIE A KEY RELEASE
	public void keyPressed(KeyEvent ke) {
		keyState="Key Down";
		repaint();
	}
	
	//HANDLE KEY TYPED
	public void keyTyped(KeyEvent ke) {
		msg+=ke.getKeyChar();
		repaint();
	}

	//Display Keystrokes
	public void paint(Graphics g) {
		g.drawString(msg,  20,  100);
		g.drawString(keyState, 20, 50);
	}
	
	public static void main (String[] args) {
		keyEventHandling appwin = new keyEventHandling();
		
		appwin.setSize(new Dimension(200,150));
		appwin.setTitle("Simple Key");
		appwin.setVisible(true);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

//WHEN THE CLOSE BOX IN THE FRAME IS CLICKED
//CLOSE THE WINDOW ADN EXIT THE PROGRAM
class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
