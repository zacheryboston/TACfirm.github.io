package exceptions;

import java.util.Scanner;

public class Salary {
   public static void main(String [] args) {
      int wage;

      System.out.println("Enter integer numbers!!!");
      Scanner scnr = new Scanner(System.in);
      wage = scnr.nextInt();

         System.out.print("Salary is ");
         System.out.println(wage * 40 * 50);
     
   }
}