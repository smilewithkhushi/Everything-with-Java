
//BINARY SEARCH USING CLASSES IN JAVA
package javaproject;
import java.io.*;

class binsearch
{
	int A[],terms;
	binsearch(int k)
	{
		A= new int[k];
		terms=k;
	}
	
	void input() throws IOException
	{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n -> Enter the ordered array elements here -");
		for (int i=0; i<terms; i++){
			System.out.print("Element at "+i+" index : ");
			A[i]=Integer.parseInt(br1.readLine());
		}
	}
	void search(int searchNum)
	{
		int flag=0, start=0, end=terms-1, mid;
		//binary search program here
		while(start<=end){
			mid=(start+end)/2;
			if (searchNum>A[mid]) {
				start=mid+1;	
			}
			else if(A[mid]>searchNum) {
				end=mid-1;
			}
			else {
				flag=1;
				break;
			}
		}
		
		if (flag!=0)
			System.out.println("Element found!");
		else{
			System.out.println("Element not found!");
		}
		
		
	}
	
}

public class BinarySearch{
	
	public static void main(String[] args)throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int terms;
		System.out.println("THIS PROGRAM PERFORMS THE BINARY SEARCH ON AN ARRAY");
		System.out.print("\n -> How many elements do you want to enter? -");
		terms=Integer.parseInt(br1.readLine());
		
		binsearch o1;
		
		o1= new binsearch(terms);
		o1.input();
		int searchNum;
			
		System.out.print("\nEnter the element you want to search : ");
		searchNum=Integer.parseInt(br1.readLine());
		o1.search(searchNum);		
	}
}
