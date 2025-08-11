package A07MyMap;

import java.util.LinkedHashMap;

public class C01LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        //LinkedHashMap和他爹一样
        //可以保证存取顺序一致
        System.out.println(map);
    }
}
