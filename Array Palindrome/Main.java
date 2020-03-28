import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int arr_size = Integer.parseInt(sc.nextLine());
      int a[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        a[i]=sc.nextInt();
      }
    int b[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        b[i]=a[arr_size-i-1];
      }
      if(Arrays.equals(a,b)==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }}