package file;

/** This method returns a stream of strings, which is a collection of all substrings split by lines.
*/

import java.util.stream.Collectors;

public class StringLines {
    public static void main(String[] args) throws Exception {
        
        String str = "CS3354\nis\nF2F\nin\nDerrick\n235\non\nThursday\n"; 
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
    }
}