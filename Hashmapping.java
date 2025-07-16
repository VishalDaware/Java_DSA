import java.util.*;

public class Hashmapping {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("chaina", 100);
        map.put("rus", 50);

        System.out.println(map);
        // update existing value of key
        map.put("chaina", 20);
        System.out.println(map);

        // searching
        if (map.containsKey("chaina")) {
            System.out.println("key is present in map");
        } else {
            System.out.println("key not present in map");
        }

        // get value of key
        // System.out.println(map.get("chaina")); // if key not present then it will
        // print null

        // Iterate in hashmap
        // int arr[] = { 12, 15, 13 };
        // for (int val : arr) {
        // System.out.print(val + " ");
        // }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        // another approach
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // delete
        map.remove("rus");
        System.out.println(map);

    }

}
