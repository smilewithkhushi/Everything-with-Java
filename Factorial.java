//THIS PROGRAM CALCULATES THE FACTORIAL OF A GIVEN NUMBER ENTERED BY THE USER USING LOOPS
import java.io.*;
public class Factorial{
	
	public static void main(String[] args)throws IOException{
		System.out.println("*****************\nThis program calculates the factorial of a given number! \n*****************\n");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter the number here: ");
		num=Integer.parseInt(br1.readLine()); //used to convert entered input from string to integer
		int factorial=1;
		for (int i=1; i<=num; i++) {
			factorial*=i;			
		}
		System.out.println("Factorial of "+num+" is "+factorial);
	}
}
