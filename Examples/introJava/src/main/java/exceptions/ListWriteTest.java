package exceptions;

import java.io.IOException;

/**
 * Writes the stream into the file
 */
public class ListWriteTest{

    public static void main(String[] args) throws IOException{

      (new ListOfNumbers1()).writeList();
      (new ListOfNumbers2()).writeList();
  
    }
}
