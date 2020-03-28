import java.util.Scanner;
class Main
{
	public static int square_of_num(int x)
    {
      int sq=x*x;
      return sq;
    }
  public static void main (String[] args)
    {
    Scanner in = new Scanner(System.in);
int n = in.nextInt();
    int k;
    k = square_of_num(n);
    System.out.println(k);
    
    // Type your code here   
	} 
}