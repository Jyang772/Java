//Justin Yang
//Assignment #0
//Program #3
// 1/15/14

 
public class Pascal {
 
   public static void main(String[] args) {
       
      int n = 9;
       
      int[] row = new int[0];
       
      for (int i=0; i<n; i++) {
          
          
         row = TEHROW(row);

         //Add some spaces. First output is offset by n. 
         
         for (int j=0; j < n - i; j++) {
            System.out.print(" ");
         }
          
         // Outputing dem values. 
          
         for (int j=0; j< row.length; j++) {
            System.out.print(row[j]+" ");
         }
         System.out.println();
          
      }
   }

   //Previous = upper last
   public static int[] TEHROW(int[] previous) {
              
      int[] row = new int[previous.length + 1];
       
       
      //Set first value and last value to 1
      //Since it always will be
      row[0] = 1;
      row[row.length - 1] = 1;
       
      //Row after, is based on the two previous values..so:
      for (int i = 1; i< row.length-1; i++) {
         row[i] = previous[i-1] + previous[i];
      }
       
      return row;
   }
}
