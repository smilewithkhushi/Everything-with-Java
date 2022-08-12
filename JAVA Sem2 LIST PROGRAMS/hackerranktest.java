
public class hackerranktest {
	public static void main(String[] args) {
		try {
			Float f1=new Float("3.0");
			int x=f1.intValue();
			byte b=f1.byteValue();
			double d=f1.doubleValue();
			System.out.print(x+b+d);
		}
		catch(NumberFormatException e){
			System.out.println("bad number");
		}
		/*
		 * int i=010;
		int j=07;
		System.out.println(i);
		System.out.println(j);
		
		int mask= 0x000F;
		int value = 0x2222;
		System.out.println(value & mask);*/
}

}
