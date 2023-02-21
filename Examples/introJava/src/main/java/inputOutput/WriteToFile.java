package inputOutput;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Writes the stream into the file
 */
public class WriteToFile {
    public static void main(String[] args) throws Exception {

	  Scanner sc = new Scanner(System.in);
    System.out.print("Enter Tracking Number: ");
		String tracking = sc.nextLine();
		System.out.print("Enter Package Type: ");
		String type = sc.nextLine();
		System.out.print("\nEnter the volume: ");
    int volume = sc.nextInt();
		System.out.println("Tracking: "+tracking+"| Type : "+type+"| Volume: "+volume);

    //The second parameter to the FileWriter constructor will tell it to append to the file.
    FileWriter fw = new FileWriter("exampleFileOutNew.txt", true);
    PrintWriter outFile = new PrintWriter(fw);
	  outFile.println(tracking+" "+type+" "+volume);
    
	//redundant, but writes it to disc immediately
    outFile.flush();
    outFile.close();
    sc.close();
    }
}
