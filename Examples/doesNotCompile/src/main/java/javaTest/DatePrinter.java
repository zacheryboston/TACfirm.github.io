package javaTest;
public class DatePrinter{
   public void datePrint(int month, int year) {
      System.out.println("1");
   }

  public void datePrint(int day, int month, int year) {
      System.out.println("2");
   }
  public void datePrint(int day, String month, int year) {
      System.out.println("3");
   }

  public static void main(String[] args){

    DatePrinter dailyPlanner = new DatePrinter();
    dailyPlanner.datePrint(06, 06, 2012);
  }
}