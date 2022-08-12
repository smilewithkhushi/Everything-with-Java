import java.io.*;
public class Ques12 {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Data : ");
		String str=br.readLine();
		
		String arr[]=str.split(" ");
		FileWriter f1=null;
		FileWriter f2=null;
		FileWriter f3=null;
		try {
			f1=new FileWriter("fileV.txt");
			f2=new FileWriter("fileD.txt");
			f3=new FileWriter("fileRest.txt");
			
			for(int i=0;i<arr.length;i++)
			{
				char w=arr[i].charAt(0);
				if(w=='a'||w=='e'||w=='i'||w=='o'||w=='u')
				{
					f1.write(arr[i]+" ");
					
				}
				else if(Character.isDigit(arr[i].charAt(0)))
				{
					f2.write(arr[i]+" ");
					
				}
				else
				{
					f3.write(arr[i]+" ");
					
				}
			}
			f1.close();
			f2.close();
			f3.close();
			System.out.println("Data stored successfully!");
		}
		catch(IOException e1)
		{
			System.out.println(e1);
		}
	}
}
