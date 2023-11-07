import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

class PanelClass extends JPanel  {
	public String msg1="";
	String msg2="";
	String msg3="";
	String msg4="";
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString(msg1,100,100);
		g.drawString(msg2,100,120);
		g.drawString(msg3,100,140);
		g.drawString(msg4,100,160);
	}
}


public class Calculator implements ActionListener {
	JLabel menu, status;
	
	public Calculator() {
		JFrame jfrm=new JFrame("Calculator");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(450,600);
		jfrm.setLayout(null);
		jfrm.getContentPane().setBackground(Color.pink);
		
		//border settings
		Border blackline=BorderFactory.createLineBorder(Color.black);
		Border blueline=BorderFactory.createLineBorder(Color.blue);
		
		//font settings
		Font f1=new Font(Font.SERIF, Font.BOLD, 20);   //top head
		Font f2=new Font(Font.MONOSPACED, Font.BOLD, 20);   //calc screen
		Font f3=new Font(Font.DIALOG, Font.BOLD, 12);
		Font f0=new Font(Font.DIALOG, Font.BOLD, 15);	//calc buttons
		
		//heading calculator
		JToggleButton head=new JToggleButton("_ Calculator Program _");
		head.setBounds(80,20,300,45);
		head.setBorder(blackline);
		head.setBorder(blueline);
		head.setFont(f2);
		
		menu=new JLabel(" ", JLabel.RIGHT);
		menu.setBounds(100,80,250,40);
		menu.setBackground(Color.white);
		menu.setBorder(blackline);	
		menu.setFont(f1);
		
		status=new JLabel("Click the buttons to get started",JLabel.CENTER);
		status.setBounds(100, 450, 250,50);
		status.setBorder(blueline);
		status.setFont(f3);
		
		//first row : C, %, x , divide
		JButton jb_c=new JButton("C");
		jb_c.setBounds(100,140,55,55);	
		jb_c.setFont(f0);
		JButton jb_percent=new JButton("%");
		jb_percent.setBounds(165,140,55,55);
		jb_percent.setFont(f0);
		JButton jb_backspace=new JButton("<-x");
		jb_backspace.setBounds(230,140,55,55);
		
		
		JButton jb_divide=new JButton("/");
		jb_divide.setBounds(295,140,55,55);
		jb_divide.setFont(f0);
				
		jfrm.add(jb_c);
		jfrm.add(jb_percent);
		jfrm.add(jb_backspace);
		jfrm.add(jb_divide);
		
		//second row 7 , 8, 9, x

		JButton jb7=new JButton("7");
		jb7.setBounds(100,200,55,55);
		jb7.setFont(f0);
		JButton jb8=new JButton("8");
		jb8.setBounds(165,200,55,55);
		jb8.setFont(f0);
		JButton jb9=new JButton("9");
		jb9.setBounds(230,200,55,55);
		jb9.setFont(f0);
		JButton jb_multiply=new JButton("x");
		jb_multiply.setBounds(295,200,55,55);
		jb_multiply.setFont(f0);
		
		jfrm.add(jb7);
		jfrm.add(jb8);
		jfrm.add(jb9);
		jfrm.add(jb_multiply);
		
		//row 3 : 4 ,5 ,6, -

		JButton jb4=new JButton("4");
		jb4.setBounds(100,260,55,55);
		jb4.setFont(f0);
		JButton jb5=new JButton("5");
		jb5.setBounds(165,260,55,55);
		jb5.setFont(f0);
		JButton jb6=new JButton("6");
		jb6.setBounds(230,260,55,55);
		jb6.setFont(f0);
		JButton jb_minus=new JButton("-");
		jb_minus.setBounds(295,260,55,55);
		jb_minus.setFont(f0);
		
		jfrm.add(jb4);
		jfrm.add(jb5);
		jfrm.add(jb6);
		jfrm.add(jb_minus);

		//ROW four : 1 ,2 ,3 , +
		JButton jb1=new JButton("1");
		jb1.setBounds(100,320,55,55);
		jb1.setFont(f0);
		JButton jb2=new JButton("2");
		jb2.setBounds(165, 320,55,55);
		jb2.setFont(f0);
		JButton jb3=new JButton("3");
		jb3.setBounds(230,320,55,55);
		jb3.setFont(f0);
		JButton jb_plus=new JButton("+");
		jb_plus.setBounds(295,320,55,55);
		jb_plus.setFont(f0);
		
		jfrm.add(jb1);
		jfrm.add(jb2);
		jfrm.add(jb3);
		jfrm.add(jb_plus);

		//ROW 5 : 00, 0 , . , =
		JButton jb_00=new JButton("00");
		jb_00.setFont(f0);
		jb_00.setBounds(100,380,55,55);
		JButton jb0=new JButton("0");
		jb0.setBounds(165, 380,55,55);
		jb0.setFont(f0);
		JButton jb_point=new JButton(".");
		jb_point.setBounds(230,380,55,55);
		jb_point.setFont(f0);
		JButton jb_equal=new JButton("=");
		jb_equal.setBounds(295,380,55,55);
		jb_equal.setFont(f0);
		
		jfrm.add(jb_00);
		jfrm.add(jb0);
		jfrm.add(jb_point);
		jfrm.add(jb_equal);

		//adding action button listeners
		jb_c.addActionListener(this);

		jb0.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb_00.addActionListener(this);
		jb_point.addActionListener(this);
		
		jb_plus.addActionListener(this);
		jb_minus.addActionListener(this);
		jb_percent.addActionListener(this);
		jb_divide.addActionListener(this);
		jb_multiply.addActionListener(this);
		jb_equal.addActionListener(this);
		jb_backspace.addActionListener(this);
		
		jfrm.add(head);
		jfrm.add(menu);
		jfrm.add(status);
		jfrm.add(jb_c);
		jfrm.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent e) {
		String str=e.getActionCommand();
		String msg=menu.getText();
	
		if (str=="C") {
			menu.setText(" ");
			status.setText("Input Cleared!");
		}
		else if (str=="0" || str=="1" || str=="2" || str=="3" || str=="4" || str=="5" || str=="6" || str=="7"|| str=="8"|| str=="9" || str=="00") {
			menu.setText(msg+str);
			status.setText(str+" Entered");
		}
		else if (str=="+") {
			menu.setText(msg+str);
			status.setText("Addition");
		}
		else if (str=="-") {
			menu.setText(msg+str);
			status.setText("Subtraction");
		}
		else if (str=="x") {
			menu.setText(msg+"*");
			status.setText("Multiplication");
		}
		else if (str=="/") {
			menu.setText(msg+str);
			status.setText("Division");
		}
		else if (str=="%") {
			menu.setText(msg+str);
			status.setText("Percentage");
		}
		else if (str==".") {
			menu.setText(msg+str);
			status.setText("Decimal");
		}
		else if (str=="<-x") {
			String m=msg.substring(0,msg.length()-1);
			String output=m;
			menu.setText(output);
			status.setText("Backspace");
		}
		else if (str=="=") {
			String input=menu.getText();
			int output=calculate(input);
			String op=Integer.toString(output);
			menu.setText(op);
			status.setText("Expression Evaluated");
		}else {
			status.setText("Invalid Operation. Program couldn't identify");
		}
	}
	
	public int calculate(String s) {
	    int md=-1; // 0 is m, 1 is d
	    int sign=1; // 1 is +, -1 is -
	    int prev=0;
	    int result=0;
	 
	    for(int i=0; i<s.length(); i++){
	        char c = s.charAt(i);
	        if(Character.isDigit(c)){
	            int num = c-'0';
	            while(++i<s.length() && Character.isDigit(s.charAt(i))){
	                num = num*10+s.charAt(i)-'0';
	            }
	            i--; // back to last digit of number
	 
	            if(md==0){
	                prev = prev * num;
	                md=-1;
	            }else if(md==1){
	                prev = prev / num;
	                md=-1;
	            }else{
	                prev = num;
	            }
	        }else if(c=='/'){
	            md=1;
	        }else if(c=='*'){
	            md=0;
	        }else if(c=='+'){
	            result = result + sign*prev;
	            sign=1;
	        }else if(c=='-'){
	            result = result + sign*prev;
	            sign=-1;
	        }
	    }
	 
	    result = result + sign*prev;
	    return result;
	}
	
	
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new Calculator();
			}
		});
	}
}
