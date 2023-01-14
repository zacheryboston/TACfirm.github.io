package tacos.tacoSpecial;

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
   public static void main(String[] args){
	   
     TacoSpecial special = new TacoSpecial("Banh Mi");
     System.out.println("\n \n Taco Specials of the day (Tuesday): \n");
     System.out.println(special.getName()); 

    }
}
