package inputOutput;

import java.util.HashSet;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Does something
 * @author Toufik
 */

public class WordCounter {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("ERRORRRRR!");

            return;
        }

        String worthPath = args[0];
        String sentencePath = args[1];
        String worthPath2 = args[2];
        String sentencePath2 = args[3];

        HashSet<String> dictionary = new HashSet<String>();

        try {
            dictionaryBuilder(worthPath, dictionary);
            countWord(sentencePath, dictionary);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!!!");
            e.printStackTrace();
        }


    }
/**
 * 
 * @param path
 * @param dict
 * @throws FileNotFoundException
 */
    public static void dictionaryBuilder(String path, HashSet<String> dict) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new FileReader(path));
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            if (!word.isEmpty() && !word.startsWith("!") && !word.equals("")) {
                dict.add(word);
            }
        }
        List<String> sortedDict = new ArrayList<String>(dict);
        Collections.sort(sortedDict);

        System.out.println(sortedDict);
    }


    public static void countWord(String path, HashSet<String> dict) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(path));
        int counter = 0;
        while (sc.hasNext()) {
            String word = sc.next();
            word = word.replaceAll("\\p{Punct}", "").toLowerCase();
            if (dict.contains(word)) {
                counter++;
            }
        }

        System.out.println("Number of matchig words = " + counter);
    }
}
