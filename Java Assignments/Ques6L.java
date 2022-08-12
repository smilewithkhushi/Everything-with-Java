import java.io.*;
public class Ques6L {

	public static void main(String[] args) throws IOException
	{
		System.out.println("\t** PROGRAM TO COPY THE CONTENTS OF FILE **\n ");
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		if(args.length != 2) {
			System.out.println("Enter the arguments");
			return;
		}
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do {
				i= fin.read();
				if(i != -1) 
				{ 
					fout.write(i);
			    }
				}while(i != -1);
		System.out.println("-> SOURCE FILE (Using CommandLine): "+args[0]);
		System.out.println("-> DESTINATION FILE (Using CommandLine): "+args[1]);
			
		System.out.println("\n-> File copied Successfully!");
		}
		catch(IOException e)
		{
			System.out.println("-> I/O Error :"+e);
		}
	
	}

}
