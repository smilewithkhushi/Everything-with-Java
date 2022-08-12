import java.io.FileInputStream;
import java.io.*;
import java.math.*;

public class PYQ1{
	
	
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a=1;
		int b=2;
		int c, d;
		c=++b;
		d=a++;
		c++;
		System.out.println(a+""+b+""+c+""+d+""+ ++d);
		int size;
		Boolean stat=true;
		while (stat==true) {
			System.out.print("Enter a name : ");
			String name=br.readLine();
			if (name.length()>10) {
				break;
			}
			System.out.print("Enter the height : ");
			float h=Float.parseFloat(br.readLine());			
			
			if(h>6) {
				break;
			}
			System.out.println("Name : "+name);
			System.out.println("Height : "+h*12+" inches");
			
		}
		
		String file1=args[0];
		String file2=args[1];
		
		double n=Math.pow(2,3);
		System.out.println(n);
		int x, y;
		try {
		FileInputStream fin1=new FileInputStream(file1);
		FileInputStream fin2=new FileInputStream(file1);
		
		FileOutputStream fout1=new FileOutputStream(file2);
		System.out.println("\n CONTENTS OF "+file1);
		do {
			 x=fin1.read();
			char ch=(char) x;
			System.out.print(ch);
		}while(x!=-1);
		fin1.close();

		System.out.println("\n CONTENTS OF "+file2);
		do {
			 y=fin2.read();
			char ch=(char) y;
			System.out.print(ch);
		}while(y!=-1);
			
		fin2.close();
		}catch(Exception e) {
			System.out.println("Exception Caught : "+e);
		}
		}
}




/*import java.io.*;
public class PYQ1 {
	
	public static int sums(int a) {
		if (a==0) {
			return 0;
		}
		return (sums(a/10) + a%10);
	}
	
	public static void main(String[] args)throws Exception{
		try {
			double c=5/2.0;
		}
		catch(ArithmeticException e) {}

		for (int i=0;i>0;i++) 
			System.out.println("Looping");
		
		int i=3, j=5;
		System.out.println(i++ + ++j);
		System.out.println(i+j);
		System.out.println(++i + j++);
		System.out.println("i="+i+"j="+j);
		int a=356;
		int rem;
		int sum=0;
		System.out.println(a/10);
		System.out.println("Digit sum here : "+sums(123));
		
	}
}
*/