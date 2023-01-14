package tacos.tacoDaily;

import java.util.ArrayList; // Required to use ArrayList

/**
   A wrapper class for finding a daily taco special
   @author Jelena Tesic
*/
public class TacoMain
{
  /**
     Display daily taco special
	 @param args Main executable
  */
   public static void main(String[] args)
   {

     ArrayList<String> daily = new ArrayList<String>(20);
     daily.add("El Conquistador");
     daily.add("Papadulce");
     TacoDaily daily1 = new TacoDaily("The Vaquero");
     daily.add(daily1.getName());

     System.out.println("\n \n Taco Specials of the day: \n");
     for (String s : daily ) //for (int i=0; i<list.size(); i++) ...
         System.out.println(s); //does this for each String in list

    }
}
