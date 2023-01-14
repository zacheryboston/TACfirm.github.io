package inputOutput;

import java.io.PrintWriter;

/**
 * Writes the stream into the file
 */
public class WriteToFile2 {

    public static void main(String[] args) throws Exception {

    //print it to the file
    PrintWriter outFile = new PrintWriter("exampleFileOut.txt");

	//initializes the values
    String tracking = "AAAAA";
	String type = "Package";
    int volume = 5;

	//writes the line to the file output
    outFile.println(tracking+" "+type+" "+volume);

    //close does flush
    outFile.close();

    }
}
