import java.util.Arrays;
import java.util.Scanner;


public class JumpSearch {

	  //Fields
	  private static int[] ar=new int [20];
	  static Scanner in = new Scanner(System.in);
	  private static int size;
	  private static int  key;
		
	
	 
	 //Methods
	  
	  /* This method is to input array and key
	   *  Returns false if size is larger than 20
	   * Returns true if input is successful
	   * It sort array 
	   * calls the jumpSearch method
	   * Returns true 
	   */
	  
	 private static void start()
	 {
		 System.out.println("Enter the number of elements");
		 size= in.nextInt();
		 
		 if(size>20)
		  {
			 System.out.println("Size exceeds array size");
			 return ;
		  }
		 
		 System.out.println("Enter the array elements:\n");
		 for (int i = 0; i < size; i++) 
		  {
			  ar[i]=in.nextInt();
		
		  }//End of loop
		 Arrays.sort(ar);
		
		 System.out.println("Enter the key");
		 key=in.nextInt();
		
		 jumpSearch();
	     return;
	 }//End of function
	
	
	 /*
	  * This method performs linear search on the array in the range:
	  * low, high  
	  */
	 
	 private static void linearSearch(int low)
	 {
		 for (int j= low; j < ar.length; j++) 
		  {
			 if(ar[j]==key)
			  {
				System.out.println("Element found");
				return;
		  	  }//End of if
			
		   }//End of for
		 System.out.println("Element not found");
		 return;
		 
	  }//End of method
	 
	
	 /*
	  * Method to perform jump search
	  */
	 
	 private static void jumpSearch()
	 
	 {
		 
		 int jump=(int)Math.sqrt(size);
		 int previous=0;
		 
		 for (int i = 0; i < ar.length; i+=jump) 
		 {
			 if(ar[i]>key)
			 {
				 break;
			 }
			 previous=i;
			
		}
		 
		 //Calling linear-search
		linearSearch(previous);
		 
	 }
	 

	public static void main(String[] args) 
	{
		start();

	}

}// By appu13
