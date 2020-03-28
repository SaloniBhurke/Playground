import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  	int n = in.nextInt();	
int i,j,c=0;
      for(i=1;i<=n;i++)
      {
       //c=1
        for(j=1;j<=i;j++)
        {
           c=++c;
          if(c%2==0)
            System.out.print("#");
            else
           System.out.print("*");
       
    }
        System.out.println();
}
    }
}
