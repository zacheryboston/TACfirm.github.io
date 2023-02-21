package dataStructures;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> color = new Stack<String>();

        color.push("Red");
        color.push("Green");
        color.push("Blue");

        System.out.println(color);
        System.out.println(color.pop());
        System.out.println(color);
        color.push("Yellow");
        System.out.println(color);
        System.out.println(color.pop());
        System.out.println(color);
        System.out.println(color.size());

    }
}
