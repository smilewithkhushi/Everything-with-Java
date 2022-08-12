import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ques8 extends Frame{
	
	public String addContentToFile(String s){
		int i=0;
		try (FileOutputStream fout=new FileOutputStream("A1.txt")){
			byte[] mybytes=s.getBytes();
			fout.write(mybytes);
			return "Content Successfully added to file!";
		}
		
		catch(FileNotFoundException e) {
			return "Exception Raisede: File Not Found";
		} catch(IOException e) {
			return "Exception Raised: I/O Error";
		}
	}
		
	Ques8(){
		JFrame jfrm=new JFrame("Java Application to Input File Content");
		jfrm.getContentPane().setBackground(Color.WHITE);
		jfrm.setSize(450,500);
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//text field settings
	JTextField textBox=new JTextField(40);
	
	//color and button settings
	Color c=new Color(255,255,255);
	JButton CalcFact=new JButton("Add to File");
	CalcFact.setBackground(Color.PINK);
	CalcFact.setAlignmentY(60);
	CalcFact.setAlignmentX(90);

	//adding all components to the frame
	JLabel jlab=new JLabel("Enter the content for file : ");
	jlab.setAlignmentX(50);
	JLabel status1=new JLabel("");
	JLabel outputBox=new JLabel("");
	
	//when button is clicked
	CalcFact.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			status1.setText("\nThe Content entered :"+textBox.getText());
			String input=textBox.getText();
			String output=addContentToFile(input);
			outputBox.setText(output);
		}
	});
	
	//adding components and visibility
	jfrm.add(status1);
	jfrm.add(jlab);
	jfrm.add(textBox);
	jfrm.add(CalcFact);
	jfrm.add(outputBox);
	jfrm.setVisible(true);
	
	}
	public static void main(String[] args) throws IOException{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ques8();
			}
		});

	}
}
