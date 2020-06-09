import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Class to perform binary search
 */
public class BinarySearch {
	
	  private static int[] ar=new int [20];
	  static Scanner in = new Scanner(System.in);
	  private static int size;
	 
	 //Methods
	  
	  /* This methods returns false if size is larger than 20
	   * Returns true if input is successful
	    */
	  
	 private static boolean getar()
	 {
		 System.out.println("Enter the number of elements");
		 size= in.nextInt();
		 
		 if(size>20)
		 {
			 System.out.println("Size exceeds array size");
			 return false;
			
			 
		 }
		 
		 System.out.println("Enter the array elements:\n");
		for (int i = 0; i < size; i++) 
		{
			ar[i]=in.nextInt();
		
		}//End of loop
		
			return true;
			
	 }//End of function
	 
	 private static void binarysearch()
	 {
		 /*
		  * Fields used in the method
		  * low to end front end and high to hold the last place in array
		  * mid show the middle value of the array
		  */
		 int key,low,high;
		 int mid ;
		 
		 low=0;
		 high=ar.length-1;
		 mid=(int) ((low+high)/2.0);
		 System.out.println("Enter the key to be searched");
		 key=in.nextInt();
		 
		 while(low!=high)
		 {
			 if(key==mid)
			 {
				 System.out.println("Element found");
				 return;
			 }
			 
			 if(key<mid)
			 {
				 high=mid;
			 }
			 if(key>mid)
			 {
				 low=mid;
			 }
			 mid=(int) ((low+high)/2.0);
		 }
		 
		 System.out.println("Element not found");
		 
		 
		 
	 }//End of the method
	

	public static void main(String[] args) {
		if(getar())
		{
			binarysearch();
		}
		else
			System.out.println("Size is too big");
		

	}

}
