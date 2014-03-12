//Assignment 6 Program 1
//Justin Yang
//2/19/14
//.....
//.....
//.............
//Testing


public class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Input in array
		
		;int array[] = new int [100000];
		int array2[] = {3,2,4,6,1,0};

		for (int i = 0 ; i < 100000 ; i++)
		{
			array [i] = (int) (Math.random () * 100);
		} 
		
		
		System.out.println("Printing: ");
		//binarySort(array2);
		bubbleSort(array2);
		for(int i=0; i < array2.length; i++)
		System.out.println(array2[i]);
		//selectionSort(array);
		

	}

	private static void selectionSort(int[] array) {
		
		      int i, j, first, temp; 
		      for ( i = array.length - 1; i > 0; i -- ) 
		      {
		           first = 0;   
		           for(j = 1; j <= i; j ++)   
		           {
		                if( array[j] < array[first] )         
		                  first = j;
		           }
		           temp = array[first];  
		           array[first] = array[i];
		           array[i] = temp; 
		       }           
		 }
	
	
	private static void binarySort(int[] array){
		
		        for (int i=0;i<array.length - 1;++i){
		            int temp=array[i];
		            int left=0;
		            int right=i;
		            
		            
		            while (left<right){
		                int middle=(left+right)/2;
		                if (temp>=array[middle])
		                    left=right+1;
		                else
		                     right=middle;
		            
		            
		            }
		            for (int j=i;j>left;--j){
		                swap(array,j-1,j);
		            }
		        }
		    }

		//Function to swap array elements from binarySort()
	  public static void swap(int array[],int i,int j){
	        int k=array[i];
	        array[i]=array[j];
	        array[j]=k;
	    }
	
	 
	  public static void bubbleSort(int[] array)
	  {
		  int j, tmp;
		  boolean f= true;
		  while(f)
		  {
			  f = false;
			  for(j = 0; j < array.length - 1; j++)
			  {
				  if(array[j+1] < array[j])
				  {
					  tmp = array[j+1];
					  array[j+1] = array[j];
					  array[j] = tmp;
					  f = true;
				  }
			  }
		  }
	  }
	
}

	


