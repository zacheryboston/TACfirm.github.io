import java.util.Scanner;

/**
   This program simulates a stamp machine that receives dollar bills and dispenses
   first class and penny stamps.
*/
public class StampMachine
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final int FIRST_CLASS_STAMP_PRICE = 47; // Price in pennies

      System.out.print("Enter number of dollars: ");
      int dollars = in.nextInt();

      // Compute and print the number of stamps to dispense

      int firstClassStamps = 100 * dollars / FIRST_CLASS_STAMP_PRICE;
      int change = 100 * dollars - firstClassStamps * FIRST_CLASS_STAMP_PRICE;
      System.out.printf("First class stamps: %6d%n", firstClassStamps);
      System.out.printf("Penny stamps:       %6d%n", change);
   }
}
