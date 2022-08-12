import java.awt.*;
import java.awt.event.*;
public class awtRBButton extends Frame implements ActionListener {
	Button red,blue;
	public awtRBButton()
	{
		
		setLayout(new FlowLayout());
		red=new Button("RED");
		blue=new Button("BLUE");
		add(red);
		add(blue);
		red.addActionListener(this);
		blue.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we ) {
				System.exit(0);
			}
		});
		
	}
	
	public void actionPerformed(ActionEvent e1) {
		String s=e1.getActionCommand();
		if(s.equals("RED"))
		{
			setBackground(Color.red);
		}
		
		else
			if(s.equals("BLUE"))
			{
				setBackground(Color.blue);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		awtRBButton o1=new awtRBButton();
		o1.setSize(new Dimension(500,500));
		o1.setTitle("Question 10 : Red Blue Button ");
		o1.setVisible(true);
	}
}
