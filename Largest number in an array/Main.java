import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
     int idx;
     for( idx = 0; idx <= arr_size - 1; idx++)
      {
         
       arr[idx] = in.nextInt();
      }
    int temp;
     for(idx = 1; idx <= arr_size - 1; idx++)//1 to 4 
      {
        if(arr[idx]<arr[idx-1])//7,3
        {
    temp=arr[idx-1];//temp=7
         arr[idx-1]=arr[idx];//7=3
          arr[idx]=temp;
        }
       }
     System.out.print(arr[arr_size-1]);
        
}
   }
