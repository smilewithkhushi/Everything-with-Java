// MOUSE EVENT HANDLING USING ADAPTERS


import java.awt.*;
import java.awt.event.*;


public class AdapterDemo extends Frame{
	String msg="";
	
	public AdapterDemo() {
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseAdapter(this));
		addWindowListener(new MyWindowAdapter());
	}
	
	//display the mouse information
	public void paint(Graphics g) {
		g.drawString(msg, 20 , 80);
	}
	
	public static void main(String[] args) {
		AdapterDemo appwin = new AdapterDemo();
		appwin.setSize(new Dimension(200, 150));
		appwin.setTitle("Adapter Demo");
		appwin.setVisible(true);
	}
}

//HANDLE ONLY MOSUE CLICK AND DRAG EVENTS
class MyMouseAdapter extends MouseAdapter{
	AdapterDemo adapterDemo;

public MyMouseAdapter(AdapterDemo adapterDemo) {
	this.adapterDemo = adapterDemo;
}

//HANDLE MOUSE CLICKED
public void mouseClicked(MouseEvent me) {
	adapterDemo.msg = "Mouse Clicked";
	adapterDemo.repaint();
}

//HANDLE MOUSE DRAGGED
public void mouseDragged(MouseEvent me) {
	adapterDemo.msg = "Mouse Dragged";
	adapterDemo.repaint();
}
}

//WHEN THE CLOSE BOX IN THE FRAME IS CLICKED, CLSOE THE WINDOW AND EXIT THE PROGRAM
class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
