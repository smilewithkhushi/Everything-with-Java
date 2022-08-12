import java.io.*;

class CaseException extends Exception{
	private String a;
	
	CaseException(String s){
		a=s;
	}
	public String toString() {
		return "Case Exception: First Letter of \""+a+"\" should be capital";

	}
}

class Ques4{
	public static void main(String[] args) {
		System.out.println("\t** PROGRAM TO READ NAME FROM COMMAND LINE\n\t\t THROW EXCEPTION IF FIRST LETTER ISN'T CAPITAL** ");
		
		int i=0;
		String s="";
		try {
		while (i<args.length) {
			s+=args[i];
			if (Character.isLowerCase(s.charAt(0))) {
				throw new CaseException(s);
			}
			i++;
		}
		System.out.print("\n-> Command Line Argument Entered By User : "+s);
		}
		catch(CaseException e) {
			System.out.println("\n Caught "+e);
		}
		
	
	}
}