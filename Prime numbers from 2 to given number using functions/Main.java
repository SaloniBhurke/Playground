import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
  
  int n,i,fact,j;
  n = in.nextInt();
  
  for(i=1; i<=n; i++)
    {
        fact=0;
        for(j=1; j<=n; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
                 System.out.println(i);
    }
  }
}