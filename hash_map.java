import java.util.HashMap;
import java.util.Set;

public class hash_map{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 1);
        hm.put("London", 2);
        hm.put("Russia", 3);
        hm.put("China", 4);
        hm.put("US", 5);
        System.out.println(hm);
        System.out.println(hm.containsKey("L"));
        System.out.println(hm.get("US"));
        System.out.println(hm.remove("US"));
        System.out.println(hm);
        System.out.println(hm.hashCode());

        Set <String> keys = hm.keySet();
        System.out.println(keys);

    }
}