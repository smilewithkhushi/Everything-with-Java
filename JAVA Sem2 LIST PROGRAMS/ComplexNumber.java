//complex class program
//THIS PROGRAM PERFORMS ARITHMETIC OPERATIONS NAMELY ADDITION, SUBTRACTION AND MULTIPLICATNION ON COMPLEX NUMBERS USING CLASSES IN JAVA
import java.io.*;

class Complex{
	
	int real, imag;
	
	Complex(){
		
	}
	
	Complex(int realPart, int imagPart){
		real=realPart;
		imag=imagPart;
	}
	Complex createNum() throws IOException {
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
		Complex temp=new Complex();
		System.out.print("Enter the real part : ");
		temp.real=Integer.parseInt(br1.readLine());
		System.out.print("Enter the imaginary part : ");
		temp.imag=Integer.parseInt(br1.readLine());		
		return temp;	
	}
	
	public String toString() {
		System.out.println("-> OUTPUT : "+real+" + "+imag+"i");
		System.out.println("======================================================");
		return null;
	}

	Complex sum(Complex c1, Complex c2){
		Complex temp=new Complex();
		temp.real=c1.real+c2.real;
		temp.imag=c1.imag+c2.imag;
	return temp;
	}	
	
	Complex multiply(Complex c1, Complex c2){
		Complex temp=new Complex();
		temp.real=(c1.real*c2.real)-(c1.imag*c2.imag);
		temp.imag=(c1.real*c2.imag)+(c2.real*c1.imag);
	return temp;
	}
}

public class ComplexNumber {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\t ** THIS PROGRAM PERFORMS ARITHMETIC OPERATIONS ON COMPLEX NUMBERS **\n");
		
		System.out.println(" 1. ADDITION ");
		System.out.println(" 2. MULTIPLICATION ");
		System.out.println(" 3. DISPLAY THE COMPLEX NUMBER");
	
		int choice;	
        String ch="y";
        while (ch=="y") {
        	System.out.print("\n -> Enter your choice here : ");
    	    choice=Integer.parseInt(br1.readLine());
    	    
        	System.out.println("\t -> 1st COMPLEX NUMBER ");
    		Complex o1=new Complex();
    		o1=o1.createNum();
    	
    		System.out.println("\t -> 2nd COMPLEX NUMBER ");
    		Complex o2=new Complex();
    		o2=o2.createNum();
 
    		
		switch (choice) {
		case 1: System.out.println( "\n\t*** OPERATION CHOOSEN : ADDITION ***");				
		        Complex add = new Complex();
		        add=add.sum(o1, o2);
		        add.toString();
				break;
        		
		case 2: System.out.println( "\n\t*** OPERATION CHOOSEN : MULTIPLICATION ***");				
				Complex prod = new Complex();
				prod=prod.multiply(o1, o2);
				prod.toString();
				break;
		
		case 3: System.out.println( "\n\t*** DISPLAY THE COMPLEX NUMBER ***");				
				o1.toString();
				o2.toString();
				break;
		}
		//System.out.print("\n Do you want to continue (y/n) : ");
       // ch=br1.readLine();
       }
        
	}

}