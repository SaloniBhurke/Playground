import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int k = Integer.parseInt(sc.nextLine());
	int arr[] = new int[n];
      	int k1[] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
      for(int i=1;i<=k;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i==arr[j])
          {
            k1[i-1]++;
          }
        }
      }
      for(int i=1;i<=k;i++)
      {
        
       		System.out.print(i+" ");
      
       		System.out.print(k1[i-1]);
        
        System.out.println();
      }
    }}