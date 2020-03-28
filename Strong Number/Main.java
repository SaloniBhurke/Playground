import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	 Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int product=1,a,count=0,m,i=1,sum=0;
      count=n;
      while(n>0)
      {
        product=1;
        m=n%10; //123 result 3
        for(i=1;i<=m;i++)
        {
         
          product=product*i;  // 2*3
      
       
        }
        sum=sum+product;
        
          n=n/10;
      }
      
      if(count==sum)
       System.out.println("Yes");
	else
      System.out.println("No");
    }
}    // Type your code here
	
    