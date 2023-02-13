package dataStructures;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        
        h.put("b", 20);
        h.put("c", 30);
        h.put("a", 10);
        System.out.println(h);

        HashMap<String,String> h2 = new HashMap<String,String>();

        h2.put("a", "Accord");
        h2.put("b", "Camry");
        h2.put("c", "Civic");

        
        System.out.println(h2);
        System.out.println(h2.keySet());
        System.out.println(h2.values());
        
        h2.remove("c");
        System.out.println(h2);
        System.out.println(h2.containsValue("Civic"));
        //System.out.println(h2.get("a"));
        
    }
}
