package exceptions;

import java.util.Vector;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


//Fix for ListOfNumbers to compile
public class ListOfNumbers1{

//constructor
	public ListOfNumbers1() {
		vector = new Vector<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			Integer integer = Integer.valueOf(i);
			vector.addElement(integer);
		}
	}

	public void writeList() throws IOException  {
		PrintWriter out = new PrintWriter(new FileWriter("OutFile1.txt"));
		for (int i = 0; i < SIZE; i++) {
			    out.println("Value at: " + i + " = " +vector.elementAt(i));
		}
		out.close();
	}

	private Vector<Integer> vector;
	private static final int SIZE = 10;

}
