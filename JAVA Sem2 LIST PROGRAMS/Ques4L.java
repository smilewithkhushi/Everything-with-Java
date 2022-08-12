import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class exceptionDemo extends Exception{
	private int num;
	
	public exceptionDemo(int a){
		num=a;
	}
	
	public String toString() {
		String op="Exception: UnderAge ; Age: "+num;
		return op;
	}
}

public class Ques4L{
	public static String test(int a) throws exceptionDemo{
		if (a<18) {
			throw new exceptionDemo(a);
		}
		return " Age: "+a;
	}

	public static void main(String[] args) throws IOException, Exception {
		System.out.println("\t **PROGRAM TO CHECK THE INPUT AGE \n\t\t WITH EXCEPTION HANDLING**");	

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int input;
		String result;
		
		String ch="y";
		while (ch.equals("y")) {
			System.out.print("\n-> Enter the Age : ");
			input=Integer.parseInt(br.readLine());
			
		try {
		result=test(input);
		System.out.println(result);	
		} catch(exceptionDemo e) {
			System.out.println("Caught "+e);
		}
		System.out.print("\nDo you want to continue(y/n) : ");
		ch=br.readLine();
		}
		System.out.println("\n*** PROGRAM ENDS HERE! ***");
	}
}
