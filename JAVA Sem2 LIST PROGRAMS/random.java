import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n1,n2,result;
   Random o1=new Random();
   for(int i=0;i<=5;i++)
   {
	   try
	   {
		   n1=o1.nextInt();
		   n2=o1.nextInt();
		   System.out.println(" number 1 :- "+n1 );
		   System.out.println(" number 2 :- "+n2 );
		   result = 12345/(n1/n2);
		   
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(" Divide by zero :- "+o1 );
		   result=0;
	   }
	   System.out.println(" Result :-  "+result );
   }
	}

}
