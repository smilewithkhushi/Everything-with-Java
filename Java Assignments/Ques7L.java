import java.io.*;
public class Ques7L {

	public static void main(String[] args)throws IOException 
	{
		FileInputStream o1= new FileInputStream("doc1.txt");
		int x= o1.read();
		while(x!=-1) {
			char x1=(char)x;
			char y=(char)o1.read();
			char ch=(char)o1.read();
			
			if(x1=='/' && y=='/')
			{
				while(ch!='\n')
				{
					System.out.print(ch);
					ch=(char)o1.read();
				}
				System.out.print(ch);
			}
			else
			{
				while(ch!='\n')
				{
					ch=(char) o1.read();
				}
			}
			x=o1.read();
		}
		o1.close();

	}

}
