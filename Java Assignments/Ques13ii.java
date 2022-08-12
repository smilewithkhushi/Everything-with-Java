import java.awt.*;
import javax.swing.*;
public class Ques13ii extends JFrame {
     
	JLabel o1;
	Ques13ii()
	{
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.pink);
		setLayout(new FlowLayout());
		o1=new JLabel(" Hi There! This is a Java program @_@ ");
		getContentPane().add(o1);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SwingUtilities.invokeLater(new Runnable() {
    	public void run()
    	{
    		new Ques13ii();
    	}
    });
	}

}
