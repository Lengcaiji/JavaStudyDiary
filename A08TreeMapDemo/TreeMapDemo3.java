package A08TreeMapDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (tm.containsKey(ch)) {
                tm.put(ch, tm.get(ch) + 1);
            } else {
                tm.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey() + " (" + entry.getValue() + ") ");
        }
    }

}
