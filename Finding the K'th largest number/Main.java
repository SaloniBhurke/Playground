import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      // Type your code here
    }  
      int k = sc.nextInt();
    Arrays.sort(arr);//0 1 2 3 4 5 
      System.out.println(arr[n-k]);
}}