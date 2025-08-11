package A07MyMap;

import java.util.HashMap;
import java.util.Map;

public class A04MapDemo4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "6");
        map.put("2", "7");
        map.put("3", "8");
        map.put("4", "9");
        map.put("5", "10");

        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
