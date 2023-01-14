package inputOutput;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read from File
 */
public class ReadFromFile {
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("exampleFileOut.txt");
            Scanner inFile = new Scanner(fr);

            // Read one line
            String line = inFile.nextLine();

            // Split the line into words, using the space character as a separator
            String[] words = line.split(" ");

            String tracking = words[0];
            String type = words[1];
            int volume = Integer.parseInt(words[2]);

            System.out.println("Tracking: " + tracking + "| Type : " + type + "| Volume: " + volume);
            inFile.close(); // Close file

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
    }
}
