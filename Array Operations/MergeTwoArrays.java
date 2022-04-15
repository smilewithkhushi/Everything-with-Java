import java.io.*;
public class MergeArrays {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n********\n THIS PROGRAM MERGES AND DISPLAYS TWO 1-D ARRAYS\n********");
		
		int size1, size2, term;
		System.out.print("-> Enter the size of first Array: ");
		size1=Integer.parseInt(br1.readLine());
		System.out.print("-> Enter the size of second Array: ");
		size2=Integer.parseInt(br1.readLine());
		
		int[] Array1=new int[size1];
		int[] Array2=new int[size2];
		
		System.out.println("\n-> Enter Elements of first Array : ");
		for (int i=0; i<size1; i++) {
			System.out.print("Element at "+i+" index : ");
			term=Integer.parseInt(br1.readLine());
			Array1[i]=term;
		}
		System.out.println("\n-> Enter Elements of second Array : ");
		for (int i=0; i<size2; i++) {
			System.out.print("Element at "+i+" index : ");
			term=Integer.parseInt(br1.readLine());
			Array2[i]=term;
		}
		
		int mergeSize=size1+size2;
		int[] mergedArray= new int[mergeSize];
		
		for(int i=0; i<mergeSize; i++){
			if(i<size1) {
			mergedArray[i]=Array1[i];
			}
			else {
			mergedArray[i]=Array2[i-size1];
			}
		}
		System.out.println("\n-> THE MERGED ARRAY (array1+array2) : ");
		for (int i=0; i<mergeSize; i++) {
			System.out.print(mergedArray[i]+",");
		}
}
}
