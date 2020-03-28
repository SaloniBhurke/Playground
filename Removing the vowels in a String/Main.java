import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] b = new char[s.length()];
    int k=0;
    for(int i=0;i<s.length();i++)
    {
      if(((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')))
      {
        
      }
      else
      {
                b[k] = s.charAt(i);
				k++;
      }
    }
    for(int i=0;i<k;i++)
    {
      System.out.print(b[i]);
    }
    //type your code here
  }
}