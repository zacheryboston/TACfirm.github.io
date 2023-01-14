package scannerEx;

import java.util.Scanner;


/** zyBook 8.6 variable scope example */
public class HeightConverter {
   final double CM_PER_IN = 2.54;
   final int IN_PER_FT = 12;

   /* Converts a height in feet/inches to centimeters */
   public double heightFtInToCm(int heightFt, int heightIn) {
      int totIn;
      double cmVal; // local scope of the variable

      totIn = (heightFt * IN_PER_FT) + heightIn; // Total inches
      cmVal = totIn * CM_PER_IN;                 // Conv inch to cm
      return cmVal;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      HeightConverter metricRuler = new HeightConverter();
      int userFeet;  
      int userInches;  

      // Prompt user for feet/inches
      System.out.print("Enter feet: ");
      userFeet = scnr.nextInt();

      System.out.print("Enter inches: ");
      userInches = scnr.nextInt();

      // Output the conversion result
      double userCentimeters = metricRuler.heightFtInToCm(userFeet, userInches);
      System.out.println("Centimeters: " + userCentimeters);
   }
}