import java.io.*;
import java.math.*;

class MyException extends Exception{
	private int num;
	MyException(int a){
		num=a; 
	}
	
	public String toString() {
		return "Error! Negative Number entered";
	}

}
public class Ques3 {

	public static float MySqrt(int a) throws MyException{
		float root;
		if (a<0) {
			throw new MyException(a);
		}
		root=(float) Math.sqrt(a);
		return root;
	}
	
	public  static void main(String[] args) throws IOException, MyException {
		System.out.println("\t **PROGRAM TO CALCULATE SQUARE ROOT OF A NUMBER\n\t\t WITH EXCEPTION HANDLING**");	

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int input;
		float result;
		String ch="y";
		while (ch.equals("y")) {
		System.out.print("\n-> Enter the number : ");
		input=Integer.parseInt(br.readLine());
		try {
		result=MySqrt(input);
		System.out.println("The Square Root of "+input+" is : "+result);	
		} catch(MyException e) {
			System.out.println("Exception Caught: "+e);
		}
		System.out.print("\nDo you want to continue(y/n) : ");
		ch=br.readLine();
		}
		System.out.println("\n*** PROGRAM ENDS HERE! ***");
	}
}
