import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr_size = Integer.parseInt(sc.nextLine());
    int arr[] = new int[arr_size];
    for(int i=0;i<arr_size;i++)
    {
      arr[i] = sc.nextInt();
    }
    int sum =arr[0];
     for(int i=1;i<arr_size;i++)
    {
     if(arr[i]>arr[i-1])
      {
        sum = sum + arr[i];
      }
       else
       {
         sum = arr[i];
       }
     }
    System.out.println(sum);
  }}
    