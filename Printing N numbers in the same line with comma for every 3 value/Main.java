import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c=0;
    
    for(int i=1;i<=n;i++)
    {	
      
      System.out.print(i);
    	c++;
      if(c==3)
      {
        System.out.print(",");
        c=0;
      }
    }
    
   //Type your code here
  }
}