package methodEx;
import java.util.Scanner;

/** zyBook method scope example */
public class TimeConverter {

   public String convertTime (int timeVal) {
      
      return (timeVal / 60 + " hrs " + timeVal % 60 + " mins");
   }
 
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      TimeConverter myWatch = new TimeConverter();
      int totTime = 0;
      //int userHr = 0;
      //int userMin = 0;
 
      System.out.print("Enter total minutes: ");
      totTime = scnr.nextInt();
      
      // convert total minutes to hours and minutes
      myWatch.convertTime(totTime);
      //System.out.print(totTime + " minutes equals: ");
      //System.out.print(myWatch.hrVal + " hrs ");
      System.out.println(myWatch.convertTime(totTime));
   }

   //int minVal;
   //int hrVal;
}