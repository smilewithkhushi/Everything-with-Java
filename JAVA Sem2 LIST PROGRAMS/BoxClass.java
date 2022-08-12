import java.io.*;

class Box{
	int length, width, height, volume;
	
	Box(){
		length=width=height=1;
	}
	Box(int l){
		length=l;
		width=height=1;
	}
	
	Box(int l, int b){
		length=l;
		width=b;
		height=1;
	}
	
	Box(int l, int b, int h){
		length=l;
		width=b;
		height=h;
	}
	
	void increment() {
		length+=+1;
		width+=1;
		height+=1;
	}
	
	Box inputObject()throws IOException{
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		Box temp=new Box();
		System.out.print("Enter the length : ");
		temp.length=Integer.parseInt(br2.readLine());
		System.out.print("Enter the breadth : ");
		temp.width=Integer.parseInt(br2.readLine());
		System.out.print("Enter the height : ");
		temp.height=Integer.parseInt(br2.readLine());
		
		return temp;
	}
	int objectEquality(Box o) {
		if (length==o.length && width==o.width && height==o.height) {
			return 1;
		}
		else
			return 0;
	}
	
	String volume() {
		int vol;
		vol=height*width*length;
		return ("The  Volume : "+vol);
	}
	
	void display() {
		System.out.println("Length : "+length + " ; Width : "+width+ " ; Height : "+height+"\n");
	}
	
	
}
public class BoxClass {
	public static void main(String[] args)throws IOException{
		
		System.out.println(" **BOX CLASS AND OPERATIONS ON OBJECTS **\n");
		
		System.out.println("1. Incrementing the values of Box Class ");
		System.out.println("2. Testing the Equality of two Box Objects ");
		System.out.println("3. Calculating the volume ");
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		
		String ch="y";
		while (ch.equals("y")) {
			
			System.out.print("\n -> Which operation do you want to perform (1,2,3) : ");
			choice=Integer.parseInt(br1.readLine());
			
		switch(choice) {
		case 1: {System.out.println("\n\t OPERATION CHOOOSEN : INCREMENTING VALUES OF BOX CLASS");
				Box b1=new Box();
				b1=b1.inputObject();
				System.out.println("-> Values of Box Oject : ");
				b1.display();
				
				b1.increment();
				System.out.println("-> The Incremented values are : ");
				b1.display();
				break;
		}
		
		case 2: {System.out.println("\n\t OPERATION CHOOOSEN : TESTING EQUALITY OF BOX OBJECTS ");
			Box b2=new Box();
			b2=b2.inputObject();
			System.out.println("-> Values of 1st Box Oject : ");
			b2.display();
			
			Box b3=new Box();
			b3=b3.inputObject();
			System.out.println("-> Values of 2nd Box Oject : ");
			b3.display();
			
			
			int equalityCheck=b2.objectEquality(b3);
			if (equalityCheck==1)
				System.out.println("Both the objects are completely equal");
			else
				System.out.println("Both the objects aren't equal");
				
			break;
}
		
		case 3: {System.out.println("\n\t OPERATION CHOOOSEN : VOLUME CALCULATION OF BOX OBJECT ");
			Box b4=new Box();
			b4=b4.inputObject();
			System.out.println("-> Values of Box Oject : ");
			b4.display();
			String vol=b4.volume();
			break;
}
		
		}
		System.out.print("\n Do you want to continue(y/n)? ");
		ch=br1.readLine();
		}
		System.out.println("\n \t ** PROGRAM ENDS HERE ** ");	
	}

}

