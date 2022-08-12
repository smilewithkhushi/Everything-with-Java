import java.io.*;

public class Ques1 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("\t **PROGRAM TO CACULATE SUM OF NUMBERS ENTERED BY USER**\n");	

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		int numCount;
		float num;
		float sum=0;
		System.out.print("-> How many number do you want to enter: ");
		numCount=Integer.parseInt(br.readLine());
		System.out.println("-> Enter the numbers below : ");
		for (int i=0; i<numCount; i++) {
			num=Float.parseFloat(br.readLine());
			sum+=num;
		}
		System.out.println("-> Sum of above numbers is "+sum);

	}

}
