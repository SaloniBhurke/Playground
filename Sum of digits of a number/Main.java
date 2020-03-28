import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
   int n = in.nextInt();
      int m = n%10;
int sum=0;

      while(n>=1)
{
        sum=sum + n%10;//0+5678%10=8
      n=n/10;//5678/10=567 567/10=56 56/10=5 5/10=0
   
}
      
       System.out.println(sum);
      
    }
}
