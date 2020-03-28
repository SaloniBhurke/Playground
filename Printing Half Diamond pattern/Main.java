import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int cur_row=1;cur_row<=n;cur_row++)
      {
        for(int cur_col=1;cur_col<=(n-cur_row);cur_col++)
        {
        System.out.print(" ");
        }
      
        for(int cur_col=1;cur_col<=cur_row;cur_col++)
        {
        System.out.print("*");
        }
        if(cur_row!=1)
        {
        
       			for(int cur_col=1;cur_col<=(cur_row-1);cur_col++)
       				 {
        				  System.out.print("*");
        			}
        }
        
        System.out.println();
      }
       
	    // Type your code here
	}
}