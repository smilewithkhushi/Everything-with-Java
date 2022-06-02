//QUES 2 : MOUSE EVENT HANDLING USING LISTENER

import java.awt.*;
import java.awt.event.*;


public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
		String msg="";
		int mouseX=0, mouseY=0; //coordinates of mouse
		
		public MouseEventsDemo() {
			addMouseListener(this);
			addMouseMotionListener(this);
			addWindowListener(new MyWindowAdapter());			
		}
		
		//HANDLE MOUSE WHEN CLICKED
		public void mouseClicked(MouseEvent me) {
			msg=msg+ " -- click received";
			repaint();		
		}
		
		//HANDLE MOUSE ENTERED
		public void mouseEntered(MouseEvent me) {
			mouseX=100;
			mouseY=100;
			msg="Mouse exited";
			repaint();
		}
		
		//HANDLE BUTTON PRESSED
		public void mousePressed(MouseEvent me) {
			//SAVE COORDINATES
			mouseX=me.getX();
			mouseY=me.getY();
			msg="Button down";
			repaint();
		}
		
		//HANDLE BUTTON RELEASED
		public void mouseReleased(MouseEvent me) {
			//SAVE COORDINATES
			mouseX=me.getX();
			mouseY=me.getY();
			msg="Button Released";
			repaint();
		}
		
		//MOUSE HANDLE DRAGGED
		public void mouseDrageed(MouseEvent me) {
			//SAVE COORDINATES
			mouseX=me.getX();
			mouseY=me.getY();
			msg="*"+" mouse at "+ mouseX + ", "+ me.getY();
			repaint();
		}
		
		//MOUSE HANDLE DRAGGED
		public void mouseMoved(MouseEvent me) {
			msg="Moving mouse at "+ me.getX()+ ", "+ me.getY();
			repaint();
		}
		
		//DISPLAY MSG IN THE WINDOW AT CURRENT X,Y LOCATION
		public void paint(Graphics g) {
			g.drawString(msg, mouseX, mouseY);
		}
		
		//main function
		public static void main (String[] args) {
			MouseEventsDemo appwin = new MouseEventsDemo();
			
			appwin.setSize(new Dimension(300,300));
			appwin.setTitle("MouseEventsDemo");
			appwin.setVisible(true);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
}

//WHEN THE CLOSE BOX IN THE fRAME IS CLICKED, CLOSE THE WINDOW ADN EXIT THE PROGRAM

	class MyWindowAdapter extends WindowAdapter{
		public void windowClosig(WindowEvent we) {
			System.exit(0);
		}
	}
