package arrayList;

import java.util.List;
import java.util.ArrayList; // Required to use ArrayList
import java.util.Collections; 

public class ArrayListTester
{
   public static void main(String[] args)
   {
     // int and string arrays, size 20 cannot be changed
     int[] a = new int[20]; //or int a[] = new int[20]
     String[] stArray = new String[20];

     //Array List
     //BaseClass must be a an object not a primitive
     ArrayList<Integer> numbers = new ArrayList<>();

     List<String> countries = new ArrayList<>();

     // add() method
     countries.add("Belgium");
     countries.add("Italy");
     countries.add("Thailand");

      System.out.println("\n \n Countries in the Array List: \n");
     for (String s : countries) //for (int i=0; i<list.size(); i++) ...
         System.out.println(s); //does this for each String in list

      //add() method extended
      countries.add(3, "Germany");
      System.out.println("\n \n Countries in the Array List: \n");
      for (String s : countries) //for (int i=0; i<list.size(); i++) ...
          System.out.println(s); //does this for each String in list

     // countries.remove(0);
     Collections.sort(countries);
      System.out.println("\n \n Countries in the Array List: \n");
      for (String s : countries) //for (int i=0; i<list.size(); i++) ...
          System.out.println(s); //does this for each String in list


    }
}
