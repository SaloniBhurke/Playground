import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in = new Scanner(System.in);
   int n = in.nextInt();
      int m = n%10;
while(n>=10)
{
      n=n/10;//5678/10=567 567/10=56 56/10=5 5/10=0
  
}
      int sum = n + m;
      System.out.println(sum);
      
    }
}
