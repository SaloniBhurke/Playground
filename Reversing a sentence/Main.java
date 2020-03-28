import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      
     int start_idx = 0;
      int end_idx = str.length();
      
      reverse_string(sb,start_idx,end_idx);
        
        // Type your code here
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        
        
        String[] critical = sb.toString().split(" ");
        
        for(int i=critical.length-1;i>=0;i--)
        {
              System.out.print(critical[i]+" ");
        }
        
        // Type your code here
    }
}