import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int a=n%10;
   int b=n/100;
    n=n/10;
   n=n%10;
   int l=a*100;
   int m=n*10;
   int p=b;
   int k = l + m + p;
    System.out.println(k);
  }
}