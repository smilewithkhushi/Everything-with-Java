//2.	Create a class TwoDim which contains private members as x and y coordinates in package P1. Define the default constructor, a parameterized constructor and override toString() method to display the co-ordinates. Now reuse this class and in package P2 create another class ThreeDim, adding a new dimension as z as its private member. Define the constructors for the subclass and override toString() method in the subclass also. Write appropriate methods to show dynamic method dispatch. The main() function should be in a package P.

//Package P1
package p1;
public class twodim {
	int x, y;
	
	public twodim() {
		x=y=0;
	}
	
	public twodim(int i, int j){
		x=i;
		y=j;
	}
	
	public String toString(){
		return ("\n\t-> THE COORDINATES ARE : "+x+" , "+y);
	}
}

//Package P2
package p2;
import p1.twodim;

public class threedim extends twodim{
	int z;
	
	public threedim(){
		super();
		z=0;
	}
	
	public threedim(int i, int j, int k){
		super(i,j);
		z=k;
	}
	
	public String toString() {
		return super.toString()+" and "+z;
	}
}

//Package P : main() function
package p;
import java.io.*;

import p1.twodim;
import p2.threedim;

public class coordMain {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t ================================================");
		System.out.println("\t THE PROGRAM STORES 2D & 3D COORDINATES  ");
		System.out.println("1. 2-Dimensional \n2. 3-Dimensional ");
		
		int choice;
		int a,b,c;
		String output;
		String ch="y";
		while (ch.equals("y")) {
			System.out.println("\t ================================================");
			System.out.print("-> Enter your choice(1,2) : ");
			choice=Integer.parseInt(br.readLine());
			
		switch(choice) {
		
		case 1: System.out.println("\n\t ** 2 DIMENSION CHOOSEN ** ");
				System.out.print("- Enter x coordinate: ");
				a=Integer.parseInt(br.readLine());
				System.out.print("- Enter y coordinate: ");
				b=Integer.parseInt(br.readLine());
				twodim o1=new twodim(a,b);
				output=o1.toString();
				System.out.println(output);
				break;
			
		case 2: System.out.println("\n\t ** 3 DIMENSION CHOOSEN ** ");
				System.out.print("- Enter x coordinate: ");
				a=Integer.parseInt(br.readLine());
				System.out.print("- Enter y coordinate: ");
				b=Integer.parseInt(br.readLine());
				System.out.print("- Enter z coordinate: ");
				c=Integer.parseInt(br.readLine());
				
				threedim o2=new threedim(a,b,c);
				output=o2.toString();
				System.out.println(output);
				break;
				
		default : System.out.println("Invalid Choice! Try again. \n");
		}
		
		System.out.print("\nDo you want to continue(y/n) : ");
		ch=br.readLine();	
		}

		System.out.print("\n PROGRAM ENDS HERE! ");
	}
	}
