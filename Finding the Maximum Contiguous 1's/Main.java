import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int arr_size = Integer.parseInt(sc.nextLine());
      int[] arr = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
      }
      int c=0;
      int k=0;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]==1)
        {
          c++;
          if(c>k)
          {
          k=c;
          }
        }
        if(arr[i]==0)
        {
        
          c=1;
        }
      }
      System.out.println(k);
    	// type your code here
    }
}