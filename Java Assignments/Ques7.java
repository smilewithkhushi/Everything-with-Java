import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Ques7 extends JFrame{
   
	JTextField TextField;
     JButton Button1;
	String msg="";
     
public Ques7(){  	
    	setTitle("MyWindow");
    	setLayout(new FlowLayout());
    	setSize(new Dimension(400,400));
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	getContentPane().setBackground(Color.pink);
    	
    	JLabel label=new JLabel("Enter the name of the file : ");
    	TextField=new JTextField(15);
    	Button1=new JButton("Display");
    	JLabel label2=new JLabel();
    	add(label);
    	add(TextField);
    	add(Button1);
    	add(label2);
    	setVisible(true);
        	
    	Button1.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			int i = 0;
    			
    			String s=TextField.getText();
    			FileInputStream o1 = null;
				try {
					o1 = new FileInputStream(s);
				} catch (FileNotFoundException e1) {
				  System.out.println("Exception caught :"+ e1);
				}
    			do {
    				try {
						i=o1.read();
					    
					} catch (IOException e) {
					  System.out.println("Exception caught :"+ e);
					}
    				if(i!=-1) {
    					msg+=(char)i;
    				}
    				
    			}while(i!=-1);
    			label2.setText("The content of the file -> " + msg);
    		}
    	});
}
    
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ques7();
			}
		});
	}
}
