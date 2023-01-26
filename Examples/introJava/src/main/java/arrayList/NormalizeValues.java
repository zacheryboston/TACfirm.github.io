package arrayList;

public class NormalizeValues{
   public static void main(String[] args) {
	 //declare and initialize and array
	 double[] sequence = {2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0};
	 int len =  sequence.length;    
     double maxDouble = sequence[0];
	 double average = 0.0; 
	 
	
    /* Normalize the output array by maximum value */	
	 // Find the maximum value  
     for (j = 0; j < len; ++j) {
         if (sequence[j] > maxDouble) {
            maxDouble = sequence[j];
         }
      }
      // Divide while outputting
      for (i = 0; i < sequence.length; ++i) {
         System.out.printf("%.2f", sequence[i] / maxDouble);
         System.out.print(" "); 
      }
      System.out.println();
	 
	 
	 /* Find average of the array */
     // access all elements using for each loop and add each element in sum
     for (double d: sequence) {
     average += number;
     }
	 
	 // convert the average from int to double
     average /= (double) len;

     
    
   }
}
