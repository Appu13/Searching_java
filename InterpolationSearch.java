import java.util.Arrays;
import java.util.Scanner;
public class InterpolationSearch {

	  //Fields
	  private static int[] ar=new int [20];
	  static Scanner in = new Scanner(System.in);
	  private static int size;
	  private static int key;
	 
	 //Methods
	  
	  /* This methods:
	   *  returns false if size is larger than 20
	   *  Receives array input
	   *  gets key
	   *  sorts array
	   *  calls the interpolationSearch method
	   * Returns true if input is successful
	    */
	  
	 private static void start()
	 {
		 System.out.println("Enter the number of elements");
		 size= in.nextInt();
		 
		 if(size>20)
		 {
			 System.out.println("Size exceeds array size");
			 return;						 
		 }
		 
		 System.out.println("Enter the array elements:\n");
		 for (int i = 0; i < size; i++) 
		     {
		       ar[i]=in.nextInt();
		
		     }//End of loop
		     
		 System.out.println("Enter the key to be searched");
		 key= in.nextInt();
		
		 Arrays.sort(ar);
		 interpolationSearch();
	
	 }//End of function
	 
    private static void interpolationSearch() 
    {
    	int low=0,high=ar.length-1;
    	int pos;
    	while(low <= high && key >= ar[low] && key <= ar[high])
    	{
    		pos  = low+((key-ar[low])*(high-low)/(ar[high]-ar[low]));
    		
    		if(ar[pos]==key) 
    		{ 
    			System.out.println("Element found");
    			return;
    			
    		}
    		else if(ar[pos]<key)
    		{
    			high-=1;
    		}
    		
    		else 
    		{
				low+=1;
			}
    		
    	}//End of while loop
    		
    	System.out.println("Element not found");
    	
		
	}
	 

	public static void main(String[] args)
	
	{
		start();
	}

}//By appu13
