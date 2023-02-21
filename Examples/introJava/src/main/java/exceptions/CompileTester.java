package exceptions;
import java.io.FileReader;
import java.util.Scanner;
/**
   StringTester class demonstrates basic String class methods

*/
public class CompileTester {

  public static void main(final String[] args) {
    //length() and charAt() methods
    final String str = "abc";
    for (int i = 0; i < str.length(); i++)
      System.out.println(str.charAt(i));

    //Unhandled Exception
    //String firstName;
    final String firstName = "John";
    final String lastName = "Doe";
    final String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    // Unhandled Exception FileNot Found
    //FileReader fr = new FileReader("exampleFileOut.txt");

    try{
      final FileReader fr = new FileReader("exampleFileOut.txt");
      final Scanner inFile = new Scanner(fr);
      inFile.close();
    }catch(final Exception e) {
      System.out.println("File reading failed");
    }

    final String name = null;
    try{
      final int n = name.length();
    }
    catch (NullPointerException e){
      System.out.println(e);
      
    }
    finally{
      System.out.print("closing program");
    }
    

  }
}
