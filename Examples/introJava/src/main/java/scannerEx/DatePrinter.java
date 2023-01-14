package scannerEx;

public class DatePrinter {

    public boolean checkDay(int currDay) {

        boolean temp = true;
        // Parameter error checking
        if ((currDay < 1) || (currDay > 31)) {
            temp = false;
        }
        return temp;
    }

    public void datePrint(int currDay, int currMonth, int currYear) {

        int tempDay = currDay;

        if (!this.checkDay(currDay)) {
            tempDay = 1;
        }
        System.out.print(currMonth + "/" + tempDay + "/" + currYear);
    }

    public void datePrint(int currDay, String currMonth, int currYear) {
        System.out.print(currMonth + " " + currDay + ", " + currYear);
    }

    public static void main(String[] args) {
        DatePrinter dailyPlanner = new DatePrinter();
        dailyPlanner.datePrint(40, 7, 2012);
        System.out.println();
        dailyPlanner.datePrint(30, "July", 2012);
        System.out.println();
    }

}
