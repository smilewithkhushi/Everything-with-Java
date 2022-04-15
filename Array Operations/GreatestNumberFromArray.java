import java.io.*;

public class MaximumElementFromArray{
	
	public static void main(String[] args)throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("THIS PROGRAM PERFORMS THE GREATEST NUMBER FROM AN ARRAY");
		
		int terms, max=0;
		System.out.print("\n -> How many elements do you want to enter? -");
		terms=Integer.parseInt(br1.readLine());
		
		int[] A=new int[terms];
		
		System.out.println("\n -> Enter the array elements here -");
		for (int i=0; i<terms; i++){
			System.out.print("Element at "+i+" index : ");
			A[i]=Integer.parseInt(br1.readLine());
		}
		
		
		for (int i=0; i<terms; i++) {
			if (A[i]>max) {
				max=A[i];
			}
		}
		
		System.out.println("\n -> The Greatest element from the array is "+max);
	}
}
