package helloworld;
/**
   GreeterTester is used as a wrap class for testing Greeter class
   @author Jelena Tesic
   @version 1.1
   @see Greeter
*/
public class GreeterTester {
  /** main method to test Greeter class
      @param args  Input arguments
  */
  public static void main(String[] args) {
    Greeter worldGreeter = new Greeter("CS3354 ... ");
    String greeting = worldGreeter.sayHello();
    System.out.println(greeting);
  }
}
