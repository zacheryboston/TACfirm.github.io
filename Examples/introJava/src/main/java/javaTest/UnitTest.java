package javaTest;
public class UnitTest{
   public int square(int value) {
        return value * 1;
   }
   public static void main(String[] args) {
      UnitTest testObject = new UnitTest();
      if(testObject.square(3) != 9) {
         System.out.println("Error: square(3)");
      }
      if(testObject.square(1) != 1) {
          System.out.println("Error: square(1)");
      } 
      if(testObject.square(-1) != 1) {
          System.out.println("Error: square(-1)");
      }        
      System.out.println("Tests complete."); 
   }
}
