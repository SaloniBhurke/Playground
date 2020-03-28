import java.util.Scanner;
class Main
{
    static int[] rotatezero(int arr_size, int[] arr)
    {
        int[] b= new int[arr_size];
        int k=0;
        for(int i=0;i<=arr_size-1;i++)
        {
            
            if(arr[i]!=0)
            {
                b[k]=arr[i];
                k++;
            }
        }
        return b;
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr_size = Integer.parseInt(sc.nextLine());
        int arr[] = new int[arr_size];
        for(int i=0;i<=arr_size-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int a[] = new int[arr_size];
        a = rotatezero(arr_size,arr);
        
        for(int i=0;i<=arr_size-1;i++)
        {
            System.out.print(a[i]+" ");//=sc.nextInt();
        }
        
        
    }
}