import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int arr_size = Integer.parseInt(sc.nextLine());
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i] = sc.nextInt();
      }
     int[] a2 = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        a2[i] = arr[i];
      }
       for(int i=0;i<arr_size;i++)
      {
        for(int j=0;j<arr_size;j++)
        {
          if(a2[j]==(i+1))
          {
           arr[i]=0;
          }
        }
       }
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]!=0)
        {
          System.out.println(i+1);
        }
      }
    }}