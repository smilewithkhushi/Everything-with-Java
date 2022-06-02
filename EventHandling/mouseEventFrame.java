/* QUES 8 : WRITE A PROGRAM TO CREATE A FRAME USING AWT. IMPLEMENT mouseClicked(), mouseEntered() and mouseExited() events such that:
a.	Size of the frame should be tripled when mouse enters it
b.	Frame should reduce to its original size when mouse is clicked in it
c.	Close the frame when mouse exits it
*/

import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame{
	Dimension o1;
	
	public MouseEvents() {
		setSize(new Dimension(300,300));
		o1=getSize();
		addMouseListener(new MyMouseAdapter(this));
	}
	
	public static void main(String[] args) {
		MouseEvents o1 = new MouseEvents();
		o1.setTitle("Mouse Events Frame : Ques 8");
		o1.setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter{
		MouseEvents f1;
		
	public MyMouseAdapter(MouseEvents o1) {
			f1=o1;
		}
		
	public void mouseEntered(MouseEvent me) {
		int h,w;
		Dimension dl=f1.getSize();
		h=dl.height*3;
		w=dl.width*3;
		f1.setSize(h,w);
	}

	public void mouseClicked(MouseEvent me) {
		f1.setSize(o1.height, o1.width);
	}

	public void mouseExited(MouseEvent me) {
	System.exit(0);
	}
	}
}
