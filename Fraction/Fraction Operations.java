import java.io.*;
import static java.lang.Math.*;

class Fraction{
	int numerator, denominator;
	
	Fraction(){
	}
	
	Fraction(int a, int b){
		numerator=a;
		denominator=b;
	}
	
	int gcd(int x, int y) {
		int num = 1; 
		for(int i = 1; i <= x && i <= y; i++)  
		{  
		if(x%i==0 && y%i==0)  
		num = i;  
		}  
		
		return num;
	}
	
	void input()throws IOException{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		int num, denom;

		System.out.print("Enter the numerator : ");
		num=Integer.parseInt(br1.readLine());

		System.out.print("Enter the denominator : ");
		denom=Integer.parseInt(br1.readLine());
		numerator=num;
		denominator=denom;
	}
	
	void display()throws IOException{
		int commonDivisor;
		commonDivisor=gcd(Math.abs(numerator),Math.abs(denominator));
		
		numerator=numerator/commonDivisor;
		denominator=denominator/commonDivisor;
		
		if (denominator<0) {
			denominator=Math.abs(denominator);
		}
		System.out.println(numerator+"/"+denominator);
	}
	
	Fraction addition(Fraction o1, Fraction o2) {
		Fraction temp=new Fraction();
		temp.numerator=(o1.numerator*o2.denominator)+(o2.numerator*o1.denominator);
		temp.denominator=o1.denominator*o2.denominator;
		return temp;
	}
	
	Fraction subtract(Fraction o1, Fraction o2) {
		Fraction temp=new Fraction();
		temp.numerator=(o1.numerator*o2.denominator)-(o2.numerator*o1.denominator);
		temp.denominator=o2.denominator*o1.denominator;
		return temp;
		}
		

	Fraction multiply(Fraction o1, Fraction o2) {
		Fraction temp=new Fraction();
		temp.numerator=o1.numerator*o2.numerator;
		temp.denominator=o1.denominator*o2.denominator;
		return temp;
		}
		

	Fraction divide(Fraction o1, Fraction o2) {
		Fraction temp=new Fraction();
		temp.numerator=o1.numerator*o2.denominator;
		temp.denominator=o1.denominator*o2.numerator;
		return temp;
		}

}

public class FractionOperations{
	
	public static void main(String[] args)throws IOException{
		
		Fraction f1,f2,add,sub,mul,div;
		
		System.out.println("\t\n --> FRACTION 1 ---> ");
		f1=new Fraction();
		f1.input();

		System.out.print(" First Fraction in Standard Form : ");
		f1.display();
		
		System.out.println("\t\n --> FRACTION 2 ---> ");
		f2=new Fraction();
		f2.input();
		System.out.print(" Second Fraction in Standard Form : ");
		f2.display();

		
		System.out.println("\t\n -> PERFORMING ARITHMETIC OPERATIONS ON FRACTIONS	 ");
		
		System.out.print("Addition : ");
		add=new Fraction();
		add=add.addition(f1,f2);
		add.display();
		
		
		System.out.print("Subtraction : ");
		sub=new Fraction();
		sub=sub.subtract(f1,f2);
		sub.display();
		
		
		System.out.print("Multiplication : ");
		mul=new Fraction();
		mul=mul.multiply(f1,f2);
		mul.display();
		
		
		System.out.print("Division : ");
		div=new Fraction();
		div=div.divide(f1,f2);
		div.display();
	}

}
