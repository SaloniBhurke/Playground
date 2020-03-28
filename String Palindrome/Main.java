import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
       StringBuilder s2 = new StringBuilder(str);
      s2.reverse();
      if(s2.toString().equals(sb.toString()))
      {
        System.out.println("Yes");
      }
      else 
      { System.out.println("No");
      }
        // Type your code here
    } 
}