import java.io.*; 

public class callsum { 

static int sum(int[] x){ 

int j=x.length; 

int a=0; 

for(int k=0;k<j;k++) { 

a=a+x[k]; 

} 

System.out.println("The sum of all the numbers entered is: "+a); 

return a; 

} 

public static void main(String[] args) { 

try{ 

BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 

System.out.println("How many numbers do you wish to add?"); 

int y= Integer.parseInt(br.readLine()); 

int[] x=new int[y]; 

for(int i=0;i<y;i++) { 

System.out.println("Enter "+ (i+1)+" number: "); 

x[i]= Integer.parseInt(br.readLine()); 

} 

sum(x); 

} 

catch (Exception e) { 

     System.out.println(e); 

} 

} 

}