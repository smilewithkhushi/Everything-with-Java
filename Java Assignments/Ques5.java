import java.awt.*;
import java.awt.event.*;

public class Ques5 extends Frame implements MouseListener, MouseMotionListener, KeyListener, ComponentListener {
		String msgM="";
		String msgK="";
		int mouseX=0, mouseY=0; //coordinates of mouse
		String state="";
		Dimension o1;

		public Ques5() {
			setSize(new Dimension(300,300));
			o1=getSize();
			
			addMouseListener(this);
			addMouseMotionListener(this);
			addKeyListener(this);
			addComponentListener(this);
			addWindowListener(new MyWindowAdapter());			
		}
		
		//HANDLE MOUSE WHEN CLICKED
		public void mouseClicked(MouseEvent me) {
			state="MOUSE CLICKED";
			repaint();		
		}
		
		//HANDLE BUTTON PRESSED
		public void mousePressed(MouseEvent me) {
			//SAVE COORDINATES
			mouseX=me.getX();
			mouseY=me.getY();
			state="MOUSE PRESSED";
			repaint();
		}
		//KEY PRESSED
		public void keyPressed(KeyEvent ke) {
			state="KEY PRESSED";
			repaint();
		}
		
		//DISPLAY KEY PRESSED BY USER
		public void keyTyped(KeyEvent ke) {
			msgK+=ke.getKeyChar();
			repaint();
		}
		//COMPONENT RESIZED
		public void componentResized(ComponentEvent e) {
			state="COMPONENT RESIZED";
			repaint();
		}
		
		//DISPLAY MSG IN THE WINDOW AT CURRENT X,Y LOCATION
		public void paint(Graphics g) {
			g.drawString(msgM,  80,  80);
			g.drawString(state, 80, 80);
			//types the text by user
			g.drawString(msgK,  40,  150);
			
		}

		//main function
		public static void main (String[] args) {
			Ques5 appwin = new Ques5();		
			appwin.setSize(new Dimension(300,300));
			appwin.setTitle("Listener Interface Program");
			appwin.setVisible(true);
		}
}

//WHEN THE CLOSE BOX IN THE fRAME IS CLICKED, CLOSE THE WINDOW ADN EXIT THE PROGRAM
	class MyWindowAdapter extends WindowAdapter{
		public void windowClosig(WindowEvent we) {
			System.exit(0);
		}
	}
