import java.io.*;
import java.util.*;

public class Ques2{
	public static void main(String[] args)throws IOException{
		System.out.println("\t** PROGRAM TO READ FILE (INPUT FROM COMMAND LINE) & \n\t\t COPY TEXT IN NEW FILE AFTER REMOVING VOWELS + HANDLE EXCEPTIONS** ");
		
		//extracting source file name from commandline
		int i=0;
		String fileA=args[0];
		String fileB=args[1];
		
		System.out.println("\n-> Source File: "+fileA);
		System.out.println("-> Destination File: "+fileB);
		
		try (FileInputStream fin=new FileInputStream(args[0]);
				FileOutputStream fout=new FileOutputStream(args[1])) {
		do {
			i=fin.read();
			//if (i!=-1) {
				char x=(char)i;
				if (x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
				} else {
					fout.write(i);
				}
			//}
		}while(i!=-1);
		System.out.println("\n Text Copied from "+fileA+" copied to "+fileB);
		}catch(FileNotFoundException e) {
			System.out.println("Error Occured: File not found");
		}catch(IOException ee) {
			System.out.println("I/O Error Occured");
		}
	}
}