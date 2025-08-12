package B01Stream;

import java.util.HashMap;

public class A03StreamDemo3 {
    public static void main(String[] args) {
        //双列集合获取stream流
        HashMap<String,String> map = new HashMap<>();
        map.put("A","B");
        map.put("B","C");
        map.put("C","D");
        map.put("D","E");
        //获取键->的stream流
        map.keySet().stream().forEach(System.out::println);
        //获取所有键值对对象->的stream流
        map.entrySet().stream().forEach(System.out::println);
    }
}
