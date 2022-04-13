import java.io.*;

public class LinearSearchInArrays {
	
	public static void main(String[] args)throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("THIS PROGRAM PERFORMS THE LINEAR SEARCH ON AN ARRAY");
		
		int terms, searchNum, flag=0;
		System.out.print("\n -> How many elements do you want to enter? -");
		terms=Integer.parseInt(br1.readLine());
		
		int[] A=new int[terms];
		
		System.out.println("\n -> Enter the array elements here -");
		for (int i=0; i<terms; i++){
			System.out.print("Element at "+i+" index : ");
			A[i]=Integer.parseInt(br1.readLine());
		}
		
		System.out.print("\nEnter the element you want to search : ");
		searchNum=Integer.parseInt(br1.readLine());
		
		for (int i=0; i<terms; i++) {
			if (A[i]==searchNum)
				flag++;
		}
		
		if (flag!=0)
			System.out.println("Element found!");
		else{
			System.out.println("Element not found!");
		}
		
		
	}
}
