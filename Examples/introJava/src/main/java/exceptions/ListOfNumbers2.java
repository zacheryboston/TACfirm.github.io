package exceptions;

import java.util.Vector;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

//Fix for ListOfNumbers to compile
public class ListOfNumbers2{

//constructor
	public ListOfNumbers2 () {
		vector = new Vector<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			Integer integer = Integer.valueOf(i);
			vector.addElement(integer);
		}
	}

	public void writeList() {
		PrintWriter out = null;
		try{
			out = new PrintWriter(new FileWriter("OutFile2.txt",true));
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + vector.elementAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (out != null)
		  out.close();
	}

	private Vector<Integer> vector;
	private static final int SIZE = 10;
}
