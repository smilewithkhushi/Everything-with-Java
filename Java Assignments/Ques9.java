import java.awt.*;
import java.awt.event.*;

public class Ques9 extends Frame{

	int XX[]=new int[5];
	int YY[]=new int[5];
	
	public Ques9() {
		addMouseListener(new MyMouseAdapter(this));
		addWindowListener(new MyWindowAdapterNew());
	}
	public static void main(String[] args) {
		Ques9 o1=new Ques9();
		o1.setTitle("Ques 9 : Polygon Program");
		o1.setSize(400,400);
		o1.setLayout(new FlowLayout());
		o1.setVisible(true);
		o1.setBackground(Color.pink);

	}
	public void paint(Graphics g) {
		g.drawPolygon(XX, YY, 5);
	}

}
class MyMouseAdapter extends MouseAdapter {
	int x;
	int y;
	int i=0;
	Ques9 o1;
	MyMouseAdapter(Ques9 o1){
		this.o1=o1;
	}
	public void mouseClicked(MouseEvent me) {
		x=me.getX();
		y=me.getY();
		System.out.println("x = "+x+" & "+"y = "+y );
		o1.XX[i]=x;
		o1.YY[i]=y;
		i++;
		
		if(i==5) {
			o1.repaint();
		}		
	}		
}

class MyWindowAdapterNew extends WindowAdapter{
	public void windowClosing(WindowEvent w) {
		System.exit(0);
	}
}
