import java.io.*;

class sampleBox{
	double height;
	double width;
	double length;
	double volume;
	
	sampleBox(sampleBox o1){
		width=o1.width;
		height=o1.height;
		length=o1.length;
	}
	
	sampleBox(double l, double w ,double h){
		width=w;
		height=h;
		length=l;
	}
	
	sampleBox(){
		width=-1;
		height=-1;
		length=-1;
	}
	
	
	double volume() {
		volume=width*height*length;
		return volume;
	}
	void display() {
		System.out.println("The height = "+height);	
		System.out.println("The width = "+width);
		System.out.println("The length = "+length);
		System.out.println("The volume = "+volume);
	}
}

class BoxWeight extends sampleBox{
	double boxWeight;
	
	BoxWeight(double l, double w, double h,double wt){
		super(l, w,h);
		boxWeight=wt;	
	}//constructor for the sub class 
	
	void display() {
	System.out.println("The height = "+height);	
	System.out.println("The width = "+width);
	System.out.println("The length = "+length);
	System.out.println("The Weight = "+boxWeight);
	}
}

class A{
	A(){
		System.out.println("Inside A constructor");
	}
}
class B extends A{
	B(){
		System.out.println("Inside B constructor");
	}
}
class C extends B{
	C(){
		System.out.println("Inside C constructor");
	}
}
public class boxInheritance {
	public static void main(String[] args) {
		sampleBox b1=new sampleBox(5,10,15);
		BoxWeight b2=new BoxWeight(2,4,6,8);
		
		System.out.println("Volume of the box is "+b2.volume());
		System.out.println("Volume of the box is "+b2.boxWeight);
		b1.display();
		b2.display();

		System.out.println("\n SHOWING THE CONSTRUCTOR CALL : ");
		C cObject=new C();
	}
}
