// Java program to demonstrate working of HashSet
//https://www.geeksforgeeks.org/hashset-in-java/
package collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class HashSetTester{

    public static void main(final String[] args) {

        final Set<String> h = new HashSet<>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// adding duplicate elements

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:" + h.contains("India"));

        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        final Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
