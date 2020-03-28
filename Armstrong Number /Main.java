import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here	
     Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int i = n, sum=0, a,b , count=0;
   count=n;
      while(n>0)
   {
        a=n%10;//123 3
    b= a*a*a;// 3 raised to 4
         
        sum = sum+b;//sum

        n=n/10;//123/10 12 
     }
   
    
      if(count==sum)
     System.out.println("Armstrong Number");
    
   else     System.out.println("Not a Armstrong Number");
   
	}
}