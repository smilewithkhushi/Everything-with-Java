import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RGBBackgroundSwing implements ActionListener {
	JFrame jfrm;
	public RGBBackgroundSwing ()
	{
	  jfrm = new JFrame(" Red Green Blue Background Program using Swing ");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(500,500);
		
		JButton Red=new JButton("Red");
		JButton Blue=new JButton("Blue");
		JButton Green=new JButton("Green");
		
		jfrm.getContentPane().add(Red);
		jfrm.getContentPane().add(Blue);
		jfrm.getContentPane().add(Green);
		
		jfrm.setVisible(true);
		
		Red.addActionListener(this);
		Blue.addActionListener(this);
		Green.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent ae)
		{ String st=ae.getActionCommand(); 
			if(st.equals("Red")) 
				jfrm.getContentPane().setBackground(Color.red);
			else if(st.equals("Blue")) 
				jfrm.getContentPane().setBackground(Color.blue);
			else if(st.equals("Green")) 
				jfrm.getContentPane().setBackground(Color.green);
		
		}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new RGBBackgroundSwing();
			}
		});
	}

}
