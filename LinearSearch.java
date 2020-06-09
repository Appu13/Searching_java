import java.util.Scanner;


public class LinearSearch 
{
  //Fields
	
	
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
 

 //Method to perform linear search
 
 private static void linearSearch()
 {

	 int key;
	 System.out.println("Enter the key to be searched");
	 key = in.nextInt();
	 
	 
	 for (int i : ar) 
	{
		 if(i==key)
		 {
			 System.out.println("Element found");
			 return;
		 }
		
	}//End of loop
	 
	 System.out.println("Element not found");
 }//End of function
 

	public static void main(String[] args) 
	
	{
		if(getar())
		{
			linearSearch();
		}
		else
			System.out.println("Size is too big");
		
	}//End of main

}//End of the class
