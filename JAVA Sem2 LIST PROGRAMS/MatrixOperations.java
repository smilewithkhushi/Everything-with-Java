
//THIS PROGRAM PERFORMS VARIOUS MATRIX OPERATIONS NAMELY ADDITION, SUBTRACTION, MULTIPLICATION AND TRANSPOSE OF A MATRIX IN JAVA

import java.io.*;

public class MatrixOperations {
	
	public static int[][] createMatrix()throws IOException {
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println( " =============================");
		int[][] array=new int[3][3];
		for (int r=0; r<3; r++){
		System.out.print("Enter the elements for row "+(r+1)+" : " );
		for(int c=0; c<3; c++) {
			array[r][c]=Integer.parseInt(br1.readLine());
		}
		}
		System.out.println( " =============================");
		return array;
	}
	
	public static void displayMatrix(int matrix[][])throws IOException{

		System.out.println( " =============================");
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++) {
				System.out.print("\t"+matrix[i][j]);
			}
		System.out.println();
		}
		System.out.println( " =============================");
	}
	
	public static int[][] matrixAddition(int A[][], int B[][])throws IOException {
		int[][] sum=new int[3][3];
		for (int r=0; r<3; r++){
		for(int c=0; c<3; c++) {
			sum[r][c]=A[r][c]+B[r][c];
		}
		}
		return sum;
	}
	
	public static int[][] matrixSubtraction(int A[][], int B[][])throws IOException {
		int[][] diff=new int[3][3];
		for (int r=0; r<3; r++){
		for(int c=0; c<3; c++) {
			diff[r][c]=A[r][c]-B[r][c];
		}
		}
		return diff;
	}
	public static int[][] matrixMultiply(int A[][], int num)throws IOException {
		int[][] product=new int[3][3];
		for (int r=0; r<3; r++){
		for(int c=0; c<3; c++) {
			product[r][c]=A[r][c]*num;
		}
		}
		return product;
	}
	public static int[][] matrixTranspose(int A[][])throws IOException {
		int[][] trans=new int[3][3];
		for (int r=0; r<3; r++){
		for(int c=0; c<3; c++) {
			trans[r][c]=A[c][r];
		}
		}
		return trans;
	}
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("** THIS PROGRAM PERFORMS MATRIX OPERATIONS ON 3*3 MATRIX **\n ");
		System.out.println(" 1. MATRIX ADDITION ");
		System.out.println(" 2. MATRIX SUBTRACTION ");
		System.out.println(" 3. MATRIX MULTIPLICATION ");
		System.out.println(" 4. MATRIX TRANSPOSE ");

		int choice;		
				
		String ch="y";
		while (ch=="y"){
	
		System.out.print("\n -> Enter your choice here : ");
		choice=Integer.parseInt(br1.readLine());
			
		switch(choice) {
		case 1: System.out.println( "\n\t*** OPERATION CHOOSEN : MATRIX ADDITION ***");
				System.out.println( "\n\t-> CREATING MATRIX ");
				int A[][] =createMatrix();
				int B[][]=createMatrix();
				
				int sumMatrix[][]=matrixAddition(A, B);
				System.out.println( "\t-> THE SUM OF TWO MATRIX IS : ");
				displayMatrix(sumMatrix);
				break;
				
		case 2: System.out.println( "\n\t*** OPERATION CHOOSEN : MATRIX SUBTRACTION ***");
				
				System.out.println( "\n\t-> CREATING MATRIX ");
				int A1[][] =createMatrix();
				int B1[][]=createMatrix();
				int diffMatrix[][]=matrixSubtraction(A1, B1);
				System.out.println( "\n\t-> THE DIFFERENCE OF TWO MATRIX IS : ");
				displayMatrix(diffMatrix);
				break;

		case 3: System.out.println( "\n\t*** OPERATION CHOOSEN : MATRIX MULTIPLICATION ***");
				System.out.println( "-> CREATING MATRIX ");
				int A2[][] =createMatrix();
				int num;
				System.out.print("Enter the integer for multiplication : ");
				num=Integer.parseInt(br1.readLine());
				int prodMatrix[][]=matrixMultiply(A2, num);
				System.out.println( "\n\t-> THE PRODUCT OF THE MATRIX IS : ");
				displayMatrix(prodMatrix);
				break;
				
		case 4: System.out.println( "\n\t *** OPERATION CHOOSEN : MATRIX TRANPOSE ***");
		System.out.println( "-> CREATING MATRIX ");
		int A3[][] =createMatrix();
		int transMatrix[][]=matrixTranspose(A3);
		System.out.println( "\n\t-> THE TRANPOSE OF THE MATRIX IS : ");
		displayMatrix(transMatrix);
		break;
		}
		System.out.print("Do you want to continue (y/n : ");
		ch=br1.readLine();
		}
		
	}

}

