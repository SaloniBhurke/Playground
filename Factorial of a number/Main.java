import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int product=1,a;
      for(int i=1;i<=n;i++)
   {
     a=i;
   product=product*i;
   
   }
       System.out.println(product);
	}
}    // Type your code here
	