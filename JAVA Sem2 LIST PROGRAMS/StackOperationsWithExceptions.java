import java.io.*;

class STACK1 {
	int list[], size;
	int tos=-1;
	
	STACK1(int num){
		size=num;
		list= new int[size];
	}
	void push(int n){
		try {
			if (tos==size-1)
				throw new Exception("STACK OVERFLOW");
					list[++tos]=n;
		}
		catch (Exception o1) {
			System.out.println("Element added to stack is :"+o1);
		}
	}
	
	int pop(){
		try {
			if (tos==-1)
				throw new Exception("STACK UNDERFLOW");
				return list[tos--];
		}
		catch(Exception o1) {
			return -1;
		}
}

	void displayStack(){
		System.out.println("\t -> THE STACK ELEMENTS ARE : ");
		for (int i=0; i<size; i++) {
			System.out.print("\t"+list[i]);
		}
	}
	
}
public class StackOperationsWithExceptions {
	
	public static void main(String[] args) throws IOException {
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	
	int stackSize, choice, num;
	System.out.println("\t ** STACK AND STACK OPERATIONS ** \n");
	System.out.println("CREATING A EMPTY STACK");
	System.out.print("Enter the size of the Stack : ");
	stackSize=Integer.parseInt(br1.readLine());
	
	System.out.println("\n -> A Stack with "+stackSize+" integers will be created!");	
	STACK1 s1;
	s1= new STACK1(stackSize);
	
	System.out.println("\nPERFORMING STACK OPERATIONS\n");
	System.out.println("1. PUSH the elements in Stack ");
	System.out.println("2. POP the elements from Stack ");
	System.out.println("3. Display all the elements from Stack ");
	
	String ch="y";
	while (ch.equals("y")) {
	System.out.print("\n ** Enter the stack operation you want to perform (1,2,3) : ");
	choice=Integer.parseInt(br1.readLine());
	
	switch(choice){
	case 1 : System.out.println("\n\t -> OPERATION CHOOSEN : PUSH ");
			for (int i=1; i<=stackSize; i++) {
				System.out.print("Enter the "+i+" element : ");
				num=Integer.parseInt(br1.readLine());
				s1.push(num);
			}
			break;

	case 2 : System.out.println("\n\t -> OPERATION CHOOSEN : POP ");
			for (int i=1; i<=stackSize; i++) {
				int x=s1.pop();
				System.out.println("The popped element : "+x);
			}
			break;
			
	case 3 : System.out.println("\n\t -> OPERATION CHOOSEN : DISPLAY STACK ");
			s1.displayStack();
	}
	System.out.print("\n Do you want to continue(y/n)? ");
	ch=br1.readLine();
	}
	System.out.println("\n \t ** PROGRAM ENDS HERE ** ");
	}	
	}
