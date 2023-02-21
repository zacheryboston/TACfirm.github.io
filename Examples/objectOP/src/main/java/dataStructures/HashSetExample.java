package dataStructures;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(12);
        h.add(24);
        h.add(6);
        Object[] ob = h.toArray();
        System.out.println(ob[2]);
        System.out.println(h);

        Iterator<Integer> it = h.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        

    }
}
