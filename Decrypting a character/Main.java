import java.util.Scanner;
public class Main{
  
  //97 122 y 121 //2 - 50
  //121 - 97 = 24 + 1 = 25
  static void decrypt(char ch, int key)
  {
    if(ch>='a'&&ch<='z')
    {int a = (int) ch;
    
    char digit = (char) (key+'0');
//    System.out.println(digit);
    int unicode = digit;
  //  System.out.println(unicode);
    int sum =a + digit - 25 - key;
   // System.out.println(sum);
    char sum1 = (char) sum;
    System.out.println(sum1);
    }
    else{
    int a = (int) ch;
    //ut.println(unicode);
    int sum =a - key;
   // System.out.println(sum);
    char sum1 = (char) sum;
    System.out.println(sum1);
      
    }
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);
      int key = sc.nextInt();
      decrypt(ch,key);
      
        // Type your code here
    }
}