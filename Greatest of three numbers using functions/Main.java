import java.util.Scanner;

class Main{
public static int largest(int x, int y)
  {int a=x,b=y,result;
  if(a>b)
  { result = a;  
  }
   else 
  {
    result = b;
  } 
return result;
}
  public static void main (String[] args){
	    // Type your code here
Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int result1 = largest(n1,n2);
    if(result1>n3)
System.out.println(result1);
 else
 System.out.println(n3);
 
  }
}