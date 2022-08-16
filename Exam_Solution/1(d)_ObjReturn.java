import java.io.*;
import java.math.*;
class ObjReturn{
	Float a;
	
	ObjReturn(float n){
		a=n;
	}
	
	public ObjReturn decOb() {
		int temp=Math.round(a);
		float diff=(float) (a-temp);
		System.out.println(diff);
		ObjReturn o2=new ObjReturn(diff);
		return o2;
	}
}

public class Solution1_c {
	
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Float num;
	System.out.println("Enter the floating point number : ");
	num=Float.parseFloat(br.readLine());
	ObjReturn o1=new ObjReturn(num);
	o1.decOb();
}
}

