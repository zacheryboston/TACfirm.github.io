package format; 

import java.util.List;
import java.util.ArrayList; // Required to use ArrayList
public class ValidateDemo {

    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        input.add("123-45-6789");
        input.add("9876-5-4321");
        input.add("987-65-4321 (attack)");
        input.add("987-65-4321 ");
        input.add("192-83-7465");

        for (String ssn : input) {
            if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{4})$")) {
                System.out.println("Found good SSN: " + ssn);
            }
        }
    }
}
