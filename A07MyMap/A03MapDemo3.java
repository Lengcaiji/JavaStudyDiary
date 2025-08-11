package A07MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "6");
        map.put("2", "7");
        map.put("3", "8");
        map.put("4", "9");
        map.put("5", "10");

        //通过键值对对象进行遍历
        //通过一个方法获取键值对，返回一个键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //entry调用get方法获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
