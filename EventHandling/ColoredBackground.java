/*
QUES 9 : USING AWT, WIRTE A PROGRAM TO DISPLAY A STRING IN FRAME WINDOW WITH PINK COLOR AS BACKGROUND
*/

import java.awt.*;
import java.awt.event.*;

public class StringBackground extends Frame{
	Dimension o1;
	
	public StringBackground() {
		setSize(800,800);
		setBackground(Color.pink);
		addWindowListener(new MyWindowAdapter());
	}
	
	public void paint(Graphics g) {
		g.drawString("Hello World!", 300 , 300);
	}
	
	public static void main(String[] args) {
		StringBackground o1 = new StringBackground();
		o1.setTitle("QUESTION 9");
		o1.setVisible(true);
	}

	class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent o1) {
		System.exit(0);
	}
}
}
