package arrayList;


public class ReverseArray{
   public static void main(String[] args) {
	 //declare and initialize and array
	 int[] sequence = {1, 3, 5, 7, 9, 11, 13, 15};
 

      // Now output those integers in reverse
      for (i = sequence.length - 1; i >= 0; --i) {
         System.out.print(sequence[i] + ",");
      }
      System.out.println();
   }
}
