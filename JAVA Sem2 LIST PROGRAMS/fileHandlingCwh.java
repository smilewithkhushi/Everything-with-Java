import java.io.*;
import java.util.Scanner;

public class fileHandlingCwh {

	public static void main(String[] args) throws IOException{
		File myFile=new File("doc2.txt");
		try {
			myFile.createNewFile();
		}
		catch(IOException e) {
			System.out.println("Unable to create new file in java");
			e.printStackTrace();
		}
	//writing to a file	
		try {
		FileWriter fileWriter1= new FileWriter("doc2.txt");
		fileWriter1.write("this is our first file form this java course");
		fileWriter1.close();
	}catch(Exception e) {
		System.out.println("Unable to write new file in java");
		e.printStackTrace();
	}
		
		//reading a file
		File myFile2=new File("doc1.txt");
		
		try {
			Scanner sc=new Scanner(myFile2);
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			
		}catch(Exception e){
			System.out.println("Unable to create new file and read from file");
		}
	}
}
//code to write to a file