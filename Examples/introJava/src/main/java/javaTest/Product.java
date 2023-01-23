package javaTest;
public class Product{
    public static void main(String[] args) {
        int x = 5, y = 55, prod = 0;

        while (x > 0) {
            prod = prod + y;
            x--;
        }
        System.out.println(x + "*" + y + "=" + prod);
    }
}