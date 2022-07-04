//Package P1
package P1;
public abstract class Shape {

	public double area;
	public abstract void computeArea();
	public void display() {
		System.out.println(area);
	}
	}
//Package P2

package P2;
import P1.Shape;
import java.io.*;

public class Rectangle extends Shape {
	double length, breadth;
	
	public void input() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the length and breadth : ");
		length=Integer.parseInt(br.readLine());
		breadth=Integer.parseInt(br.readLine());
	}
	
	public Rectangle() {
		length=breadth=0;
	}
	public Rectangle(double a, double b) {
		length=a;
		breadth=b;
	}
	
	public void computeArea() {
		area=length*breadth;
	}
	
	public void display() {
		System.out.print("Rectange Area is as follows : ");
		super.display();
	}
}

//Package P3
package P3;

import java.io.*;
import P1.Shape;

public class Circle extends Shape{
	double radius;
	
	public Circle() {
		radius=0;
	}
	public Circle(double r) {
		radius=r;
	}
	
	public void input() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the radius : ");
		radius=Integer.parseInt(br.readLine());
	}
	
	public void computeArea() {
		area=22/7*radius*radius;
	}
	
	public void display() {
		System.out.print("Circle Area is as follows : ");
		super.display();
	}
}

//MAIN() FUNCTION :

import P1.Shape;
import P2.Rectangle;
import P3.Circle;

import java.io.*;

public class mainClass {

	public static void main(String[] args)throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\t ================================================");
	System.out.println("\t THE PROGRAM CALCULATES THE AREA OF SHAPES  ");
	System.out.println("1. Rectangle \n2. Circle ");
	
	int choice;
	Shape obj;
	String ch="y";
	while (ch.equals("y")) {
		System.out.println("\t ================================================");
		System.out.print("-> Enter your choice(1,2) : ");
		choice=Integer.parseInt(br.readLine());
		
	switch(choice) {
	
	case 1: System.out.println("\n\t ** SHAPE CHOOSEN : RECTANGLE ** ");
			Rectangle o1=new Rectangle();
			o1.input();
			obj=o1;
			obj.computeArea();
			obj.display();
			break;
		
	case 2: System.out.println("\n\t ** SHAPE CHOOSEN : CIRCLE ** ");
			Circle o2=new Circle();
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

