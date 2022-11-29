package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> voterMap = new TreeMap<>();
        voterMap.put(100, "Vikram");
        voterMap.put(101, "Gopi");
        voterMap.put(102, "Uppi");
        voterMap.put(200, "ahalya");
        voterMap.put(202, "vamshi");
        voterMap.put(300, "manju");
        voterMap.put(400, "nani");
        voterMap.put(400, "manohar");
        voterMap.put(500, "vikram");

        System.out.println(voterMap.get(200));
        System.out.println(voterMap.get(400));
        voterMap.remove(300);
        System.out.println(voterMap.get(300));
        System.out.println(voterMap.containsKey(300));
        System.out.println(voterMap.containsKey(100));
        System.out.println(voterMap.get(400));

    }
}
