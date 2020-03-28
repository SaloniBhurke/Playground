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
     int element_1 = in.nextInt();
     int element_2 = in.nextInt();
     int flag = 0;
      for(idx = 0; idx <= arr_size - 1; idx++)
      {
        if(element_1==arr[idx])
        {
         System.out.println(idx);
        flag = ++flag;
  
        }
       }
        for(idx = 0; idx <= arr_size - 1; idx++)
      {
        if(element_2==arr[idx])
        {
    System.out.println(idx);
   flag = ++flag;
        }
   }
     if(flag<2)
     {
   System.out.println(-1);
       
     }
}
   }
