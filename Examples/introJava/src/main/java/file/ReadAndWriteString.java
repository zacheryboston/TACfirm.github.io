package file;
 
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
@author dariawan
@see    https://www.dariawan.com/tutorials/java/java-11-new-methods-path-and-files/
*/
public class ReadAndWriteString {
 
    static Path createTempPath() throws IOException {
        Path tempPath = Files.createTempFile("test", ".txt");
        File tempFile = tempPath.toFile();
        tempFile.deleteOnExit();
        
        return tempPath;
    }
    
    public static void main(String[] args) throws IOException {
        String testString = "The price is £100 or about €120";
        
        Path path1 = Files.writeString(createTempPath(), testString);
        System.out.println(path1);
        System.out.println(Files.readString(path1));        
        
        Charset charset = Charset.forName("ISO-8859-3");
        Path path2 = Files.writeString(createTempPath(), testString, charset);
        System.out.println(path2);
        String s = Files.readString(path2, charset);
        System.out.println(s);
    }
}