package exceptions;

/** Example on how to handle safe division */
public class DivideNumbersSafe{
	public static void main(String[] args) {
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			System.out.println(number1+ "/" + number2 + " = " + number1 / number2);
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.err.println("Error: Incorrect number of arguments."+ "\nUsage is: java DivideNumbersSafe <number1> <number2>");
		}
		catch (NumberFormatException ex){
			System.err.println("Error: Malformed number entered.");
		}
		catch (ArithmeticException ex){
			System.err.println("The numbered entered cannot be divided. " + "Possible division by zero attempted.");
		} 
		catch (Exception ex){
			System.err.println("Unknown error occurred.");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}