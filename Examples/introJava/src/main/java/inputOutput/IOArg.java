package inputOutput;

/**
 * Test Java Input and Output using args array of strings
 */
public class IOArg {

	public static void main(String[] args) {

		// reading in arguments
		String firstName = args[0];
		String lastName = args[1];

		// writing out argument
		System.out.println("First Name: " + firstName + ", LastName :" + lastName);

	}
}