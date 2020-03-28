import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int c=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==' ')
      {
        c++;
      }
    }
    String str[] = new String[c+1];
        str = s.split(" ");
String str1[] = new String[c+1];
int k=0;
    int count[] = new int[c+1];
 for(int i=0;i<(c+1);i++)
 {
     int d=0;
   for(int j=i+1;j<(c+1);j++)
   {
     if(str[i]!=null)
     {
     if(str[i].equals(str[j]))
     {
     str[i]=null;
     }
     }
   }
   k++;
 }
    for(int i=0;i<k;i++)
    {
      if(str[i]!=null)
      System.out.print(str[i]+' ');
    }
  
  
  
  
  
  
  }}