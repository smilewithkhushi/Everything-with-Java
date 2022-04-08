import java.io.*;

public class Fibonacci_Series{
	
	public static void main(String[] args)throws IOException{
		System.out.println("*****************\nThis program prints the Fibonacci Series from the number entered by user! \n*****************\n");
		
		int a=1, b=1, c;
		
		System.out.print("The Basic Fibonacci Series is as -> \n"+a+","+b);
		for (int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(","+c);
			a++;
			b++;
		}
		
		System.out.println("\n\n \t*USER DEFINED FIBONACCI SERIES* \n");
		
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num1, num2, num3, terms;
		System.out.println("How many terms do you want to print: ");
		terms=Integer.parseInt(br1.readLine()); //used to convert entered input from string to integer
		
		System.out.println("Enter the first number here: ");
		num1=Integer.parseInt(br1.readLine()); //used to convert entered input from string to integer
		
		System.out.println("Enter the second number here: ");
		num2=Integer.parseInt(br1.readLine()); //used to convert entered input from string to integer
		
		System.out.print("The Fibonacci Series is as -> \n"+num1+","+num2);
		for (int i=1; i<=terms; i++) {
			num3=num1+num2;
			System.out.print(","+num3);
			num1++;
			num2++;
		}
	}
}
