package inputOutput;

import java.util.Scanner;

/**
 * Test Java Input and Output using Scanner class
 */
public class IOScan {

  public static void main(String[] args) {

    //new Scanner object
    // System.in is the InputStream associated with the keyboard
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Tracking Number: ");
    String tracking = sc.nextLine();

    System.out.print("\nEnter Package Type: ");
    String type = sc.nextLine();

    System.out.print("\nEnter the volume: ");
    int volume = sc.nextInt();

    //test the output
    System.out.println("Tracking: " + tracking + "| Type : " + type + "| Volume: " + volume);

  }
}
