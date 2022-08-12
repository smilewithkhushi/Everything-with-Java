import java.io.IOException;

public class nestedException {
   static void nest_try(int a)
   {
	   try
	   {
		  System.out.println(" Now we are in nest try function "); 
		  if(a==1)
		  {
			  a=a/(a-a);
		  }
		  if(a==2)
		  {
			  int array[]= {5};
			  array[4]=8;
			  
		  }
	   }
	   catch(ArrayIndexOutOfBoundsException o1)
	   {
		   System.out.println(" Array index out of bounds :- "+o1);
	   }
	   finally
	   {
		   System.out.println(" Finally block in nest_try function ");
	   }
	   System.out.println(" End of nest_try Function @_@ ");
   }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     try
     {
    	int x=args.length;
    	System.out.println(" x = "+ x);
    	int y=34/x;
    	System.out.println(" y = "+ y);
    	nest_try(x);
    	 System.out.println("After nest_try Function return ");
     }
     catch(ArithmeticException o1)
     {
    	 System.out.println(" Arithmetic Exception "+o1);
     }
     System.out.println(" End of main ");
	}

}
