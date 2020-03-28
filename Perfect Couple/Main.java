import java.util.Scanner;
class Main{
  
  public static void pair(int arr_size, int[] arr, int val)
  {
    for(int i=0;i<arr_size;i++)
    {
      for(int j =i+1; j<arr_size;j++)
      {
        if((arr[i]+arr[j])==val)
        {
          System.out.println(arr[i]+", "+arr[j]);
        }
      }
    }
  }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int arr_size = Integer.parseInt(sc.nextLine());
      int arr[] = new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int value = sc.nextInt();

   
      pair(arr_size,arr,value);
      
      // Type your code here
    }
}