
import java.io.*;

public class Solution1_b {
	
	public static int recMeth(int n) {
		if (n==1) {
			return 1;
		}
		return (n%10 * recMeth(n/10));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num,result;
		System.out.print("Enter the number : ");
		num=Integer.parseInt(br.readLine());
		result=recMeth(num);
		System.out.println("\n -> The product of digits of "+num+" is "+result);	
		
	}

}
