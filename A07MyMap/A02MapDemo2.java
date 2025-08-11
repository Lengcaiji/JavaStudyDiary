package A07MyMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "6");
        map.put("2", "7");
        map.put("3", "8");
        map.put("4", "9");
        map.put("5", "10");

        //通过键找值
        //获取所有键，把键存在一个单列集合中
        Set<String> keys = map.keySet();
        for (String s : keys) {
            //System.out.println(s);
            //利用键获取对应的值
            System.out.println(s + " = " + map.get(s));
        }

        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {

            String key = it.next(); // 只调用一次next
            System.out.println(key + "=" + map.get(key));

        }
//        在同一个循环迭代中多次调用 it.next()
//        每次循环实际消耗两个键（但只处理一个键值对）
//        当键的数量为奇数时，最后一次循环会尝试获取不存在的第二个键
//        打印的键值对不匹配（例如"1=7"而不是"1=6"）
    }
}
