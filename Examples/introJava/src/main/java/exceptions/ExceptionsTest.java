package exceptions;
import java.lang.ArrayIndexOutOfBoundsException;

public class ExceptionsTest{
	
  public static void main(final String args[]) {
		try {
			final int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
			System.out.println("After element access");
		} catch (ArrayIndexOutOfBoundsException e) {
		  System.out.println("Exception thrown  :" + e);
	  }
	  
	  System.out.println("Out of the block");
  }
}
