import java.util.Scanner;
 class Main{
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();
    String str2 = sc.nextLine();
    //String a[] =  new String[str.length()];
   // a = str.split(""); 
    int c =0;
    for(int i=0;i<str.length();i++)
    {
        for(int j=i+2;j<=str.length();j++)
        {
            if(str.substring(i,j).equals(str2))
            {
                
          
            
             c++;
            }  
        }
      
    }
        System.out.println(c);
    // Type your code here
  } 
}