/**
   StringTester class demonstrates basic String class methods

*/
public class StringTester {
  public static void main(String[] args) {
    //length() and charAt() methods
    String str = "abc";
    for (int i = 0; i < str.length(); i++)
      System.out.println(str.charAt(i));

    //concatenation
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    String greeting = "Hello";
    System.out.println(greeting);

    //equals to compare strings
    if (greeting.equals("Hello")) {
      System.out.println("Hello to you too ");
    } else {
      System.out.println("Not what I expected!");
    }

    //substring
    System.out.println("Hello".substring(1, 3));

    // == only tests whether the object references are identical:
    if ("Hello".substring(1, 3).equals("el"))
      System.out.println("Hello".substring(1, 3));
  }
}
