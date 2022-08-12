import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonIconTest implements ActionListener{
	
	JLabel l1, l2,l3,l4;
	JButton b1,b2,b3,b4;
	
	public ButtonIconTest(){
		
		JFrame jfrm=new JFrame("Experimenting with Buttons Icons Etc");
		jfrm.setSize(1200,800);
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setBackground(Color.PINK);
		
		JLabel head=new JLabel("Displaying the Image Icons!", JLabel.CENTER);
		ImageIcon i1=new ImageIcon("anya.png");
		ImageIcon i2=new ImageIcon("bomb.png");
		ImageIcon i3=new ImageIcon("terror.png");
		ImageIcon i4=new ImageIcon("marco.png");
		ImageIcon i5=new ImageIcon("anya.png");
		
		l1=new JLabel(i1);
		l2=new JLabel(i2);
		l3=new JLabel(i3);
		l4=new JLabel(i4);
		JLabel l5=new JLabel(i5);
		
		head.setPreferredSize(new Dimension(1000,100));
		l1.setPreferredSize(new Dimension(250,250));
		l2.setPreferredSize(new Dimension(250,250));
		l3.setPreferredSize(new Dimension(250,250));
		l4.setPreferredSize(new Dimension(250,250));
		
		JTextField tf1=new JTextField(20);
		b1=new JButton("Click Here!");
		b2=new JButton("Button 2");
		JLabel status=new JLabel(" ");
		JLabel status2=new JLabel(" ");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String msg=tf1.getText();
				status.setText("You Entered "+msg);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=b2.getActionCommand();
				status2.setText(msg+" Pressed and Anya Comes here! hehehehehe");
				jfrm.add(l5);
		}		}
		);

		jfrm.addWindowListener(new WindowAdapter() {
			public void WindowClosing() {
				System.exit(0);;
			}
		});
			
		//adding all elements
		jfrm.add(head);
		jfrm.add(l1);
		jfrm.add(l2);
		jfrm.add(l3);
		jfrm.add(l4);
		jfrm.add(tf1);
		jfrm.add(b1);
		jfrm.add(status);
		jfrm.add(b2);
		jfrm.add(status2);
		jfrm.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonIconTest();
			}
		}
		);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
