package dataStructures;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> num = new LinkedList<String>();

        num.add("one");
        num.add("two");
        num.add("three");

        System.out.println(num);
        System.out.println(num.contains("one"));
        System.out.println(num.peek());
        num.poll();
        System.out.println(num);
        System.out.println(num.contains("one"));

    }
}
