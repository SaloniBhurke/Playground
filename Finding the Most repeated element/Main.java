import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int arr_size=Integer.parseInt(sc.nextLine());
    int[] arr = new int[arr_size];
    int[] k = new int[10];
    for(int i=0;i<arr_size;i++)
    {
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr_size;i++)
    {
      k[arr[i]]++;
    }
    int c=0;
    for(int i=1;i<10;i++)//0 1 2 3 4 5 6 7 8 9
    {
		if(k[i]==1&&k[i-1]==1)
        {
          c=arr[0];
        }
      if(k[i]>k[i-1])//1 0 
      {
        c=k[i];
      }
    
    }
   System.out.println(c);
    // your code here
  }
}
