import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

public class Ques1{
	
	public int powerY(String num1, String num2) {
		int y=Integer.parseInt(num2);
		int x=Integer.parseInt(num1);
		int res=1;
		for (int i=1; i<=y; i++) {
			res=res*x;
		}
		return res;
	}
	public float logx(String num1) {
		int x=Integer.parseInt(num1);
		float res=(float) Math.log(x);
		return res;
	}
	
	public Ques1() {
		JFrame jfrm=new JFrame("Question 1 ");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(400,400);
		jfrm.setBackground(Color.pink);
		
		JLabel l1=new JLabel("Enter Value of X : ");
		JLabel l2=new JLabel("Enter Value of Y : ");
		TextField x1=new TextField(30);
		TextField y1=new TextField(30);
		JLabel status=new JLabel(" ");
		JLabel output1=new JLabel(" ");
		JLabel output2=new JLabel(" :-) ");
		
		
		JToggleButton btn=new JToggleButton("x^y / log(x)");
		btn.setBounds(100, 100, 100, 100);
		
		btn.addItemListener(new ItemListener (){
				public void itemStateChanged(ItemEvent ie) {
					if (btn.isSelected()) {
						String x=x1.getText();
						String y=y1.getText();
						
						int result=powerY(x,y);
						status.setText("TOGGLE BUTTON SELECTED : Calculate x to power y.           ");
						output1.setText("x^y = "+result);
					}
					else {
						String x=x1.getText();						
						float result=logx(x);
						status.setText("TOGGLE BUTTON RELEASED : Calculate log of x.                ");
						output1.setText("log(x) = "+result);
					}
		}
		});
		
		jfrm.add(l1);
		jfrm.add(x1);
		jfrm.add(l2);
		jfrm.add(y1);
		jfrm.add(btn);
		jfrm.add(status);
		jfrm.add(output1);
		jfrm.add(output2);
		
		jfrm.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new Ques1(); 
			}
		});
	}

}
