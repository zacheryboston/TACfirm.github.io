package file;
 
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
@author tesic
@author dariawan
@see    https://www.dariawan.com/tutorials/java/java-11-new-methods-path-and-files/
*/
public class ReadMultilineString {
 
    public static void main(String[] args) throws IOException, URISyntaxException {

        var path = Path.of(System.getProperty("java.io.tmpdir"), "wordsFile.txt");
        System.out.println(path);
        System.out.println(Files.exists(path));
		
		//Read the entire string at once 
		String test = Files.readString(path);
        System.out.println(test);
    }
}