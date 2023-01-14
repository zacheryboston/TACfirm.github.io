package file;

import java.nio.file.Files;
import java.nio.file.Path;

/** Java 11 String Methods demo
*/
public class StringIO{
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        String str = " In person class is scheduled for Feb 16th   "; 
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
		
		//how to read and write files now 
		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Midterm is next Tuesday");
		System.out.println(path);
		String s = Files.readString(path);
		System.out.println(s); 
    }
}