
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {5,3,7,1,4,9,6,11,10,13,2,19,23,45,19,30};
		int indexFound;
		
		
		
		selectionSort(array);
		indexFound = binarySearch(array,0, array.length - 1, 3 );
		
		//for(int i=0; i < array.length; i++)
		//System.out.println(array[i]);
		System.out.println("Found at: " + indexFound);
	}
	
	
	private static void selectionSort(int[] array) {
		
	      int i, j, first, temp; 
	      for ( i = array.length - 1; i > 0; i -- ) 
	      {
	           first = 0;   
	           for(j = 1; j <= i; j ++)   
	           {
	                if( array[j] > array[first] )         
	                  first = j;
	           }
	           temp = array[i];  
	           array[i] = array[first];
	           array[first] = temp; 
	       }           
	 }

	
	
	/**
	 * Search in the array A in positions numbered loIndex to hiIndex,
	 * inclusive, for the specified value.   If the value is found, return 
	 * the index in the array where it occurs. If the value is not found, 
	 * return -1.  Precondition:  The array must be sorted into increasing 
	 * order.
	 */
	public static int binarySearch(int[] A, int low, int high, int value) {
	      
	   if (low > high) {
	      return -1;
	   }
	   
	   else {
	         // Look at the middle position in the list.  If the
	         // value occurs at that position, return that position.
	         // Otherwise, search recursively in either the first
	         // half or the second half of the list.
	      int middle = (low + high) / 2;
	      if (value == A[middle])
	         return middle;
	      else if (value < A[middle])
	         return binarySearch(A, low, middle - 1, value);
	      else   // value must be > A[middle]
	         return binarySearch(A, middle + 1, high, value);
	   }

	} // end binarySearch()

}
