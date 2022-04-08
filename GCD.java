import java.io.*;

public class GCD{
	
	public static void main(String[] args)throws IOException{
		System.out.println("*****************\nThis program calculates the Greatest Common Divisor of two numbers! \n*****************\n");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,gcd=1;
		
		System.out.println("Enter the first number here: ");
		num1=Integer.parseInt(br1.readLine()); //used to convert entered input from string to integer
		
		System.out.println("Enter the second number here : ");
		num2=Integer.parseInt(br1.readLine());
		
		for (int i=1; i<=num1 && i<=num2; i++) {
			if (num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		System.out.println("-> The Greatest Common Divisor of "+num1+" and "+num2+" is "+gcd);
	}
}
