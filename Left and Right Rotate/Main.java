import java.util.Scanner;
 class Main 
{
  public static void rotate(int arr_size, int[] arr, int no_of_rotation)
  {
         if((arr_size%2)==0)
    {
        int temp = 0;
    	for(int rot =1;rot<=no_of_rotation;rot++)
    		{
      			temp = arr[1];
      			for(int i=1;i<=arr_size-3;i=i+2)//12345678
      				{
      				arr[i]=arr[i+2];
        	      	}
      			arr[arr.length-1]=temp;
    		}
        
        
    
    	for(int rot =1;rot<=no_of_rotation;rot++)
    		{
            	int temp1 = arr[arr_size-2];
      		    for(int i=(arr_size-2);i>0;i=i-2)//12345678//0 5
                    {  			
            			arr[i]=arr[i-2];
      
      			}
      			arr[0]=temp1;
	          }
    }
     else
    {
       
        int temp = 0;
    	for(int rot =1;rot<=no_of_rotation;rot++)
    		{
      			temp = arr[1];
      			for(int i=1;i<=arr_size-3;i=i+2)//1234567
      				{
      				arr[i]=arr[i+2];
        	      	}
      			arr[arr.length-2]=temp;
    		}
        
        
    
    	for(int rot =1;rot<=no_of_rotation;rot++)
    		{
            	int temp1 = arr[arr_size-1];
      		    for(int i=(arr_size-1);i>0;i=i-2)//12345678//0 5
                    {  			
            			arr[i]=arr[i-2];
      
      			}
      			arr[0]=temp1;
	          }}
  }
  
  public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
int arr_size = Integer.parseInt(sc.nextLine());
int arr[] = new int[arr_size];
	for(int i=0;i<=arr_size-1;i++)
	{
	 arr[i]=Integer.parseInt(sc.nextLine());
	}
int no_of_rotation = Integer.parseInt(sc.nextLine());
rotate(arr_size,arr,no_of_rotation);
	for(int i=0;i<=arr_size-1;i++)
	                         {
                        	System.out.print(arr[i]+" ");
	                         }
	//Try out your code here
	    }
    
    	}//Try your code here
  	
