package A11Immutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        //不可变集合
        List<String> list = List.of("zero", "one", "two", "three", "four", "five", "six");

        //只能查询遍历不能修改删除增加
        System.out.println(list.get(0));

        //!!!set没索引!!!
        //set的不可变集合出现相同元素会报错
        Set<String> set = Set.of("zero", "one", "two", "three", "four", "five", "six");

        for (String s : set) {
            System.out.print(s + " ");
        }

        System.out.println();
        //map的不可变集合的键不能出现相同元素
        //map内的方法是有上限的，最多只能传递20个参数，即10个键值对对象
        Map<String, String> map = Map.of("zero", "zero", "one", "two", "three", "four", "five", "six");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.print(key + " : " + value + " ");
        }
        System.out.println();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + " ");
        }
    }
}
