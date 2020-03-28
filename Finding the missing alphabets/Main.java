import java.util.Scanner;
 class Main{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         
         String a = s.toLowerCase();
         int ref[] = new int[26];
         
        // System.out.println(ref[23]);
         for(int i=0;i<a.length();i++)
         {
            // System.out.println(a.charAt(i));
         //    System.out.println();
                if(a.charAt(i)>='a'&&a.charAt(i)<='z')
             {
              
          //    System.out.println(a.charAt(i));
              int b = (int) a.charAt(i);
          //    System.out.println(b);
              int c = b - 97;
          //       System.out.println(c);
                 ref[c]++;
                }
         }
         for(int i=0;i<=25;i++)
         {
           //  System.out.println(ref[i]);
       
             if(ref[i]==0)//0
             {
                 
                 
              // System.out.print(ref[i]);//a l y z
             
              System.out.print((char) (i + 97) + " ");//a l y z
             }
             else{
                 
             }
         }
         
         
         }
}