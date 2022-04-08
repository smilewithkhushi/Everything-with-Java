import java.io.*;

public class Maximum_Number {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br1 =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("**********\nThis program finds the MAXIMUM/GREATEST number from the given list of numbers!\n**********");
		int term, num, max=0;
		
		System.out.print("How many terms/numbers do you want to enter : ");
		term=Integer.parseInt(br1.readLine());
		
		for (int i=1; i<=term; i++) {
			System.out.print("Enter the "+i+" term here : ");
			num=Integer.parseInt(br1.readLine());
			if (num>max)
				max=num;		
		}
		System.out.println("The Maximum/Greatest Number found is "+max);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		
	}
}
