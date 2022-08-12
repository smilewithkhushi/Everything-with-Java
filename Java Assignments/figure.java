import java.io.*;
import P1.Polygon;
import P2.Square;
import P3.Cone;

public class figure {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\t ================================================");
		System.out.println("\t THE PROGRAM CALCULATES THE AREA OF POLYGON  ");
		System.out.println("1. Square \n2. Cone ");
		
		int choice;
		Polygon obj;
		String ch="y";
		while (ch.equals("y")) {
			System.out.println("\t ================================================");
			System.out.print("-> Enter your choice(1,2) : ");
			choice=Integer.parseInt(br.readLine());
			
		switch(choice) {
		
		case 1: System.out.println("\n\t ** SHAPE CHOOSEN : Square ** ");
				Square o1=new Square();
				o1.input();
				obj=o1;
				obj.computeArea();
				obj.display();
				break;
			
		case 2: System.out.println("\n\t ** SHAPE CHOOSEN : Cone ** ");
				Cone o2=new Cone();
				o2.input();
				obj=o2;
				obj.computeArea();
				obj.display();
				break;
		default : System.out.println("Invalid Choice! Try again. \n");
		}
		
		System.out.print("\nDo you want to continue(y/n) : ");
		ch=br.readLine();	
		}

		System.out.print("\n PROGRAM ENDS HERE! ");
	}
	}

