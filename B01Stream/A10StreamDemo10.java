package B01Stream;

import java.util.*;
import java.util.stream.Collectors;

public class A10StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "A-1-1", "B-0-2", "H-0-8", "D-1-4", "F-1-6");

        //toList方法
        List<String> collect1 = list.stream().filter(s -> "1".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(collect1);
//                Iterator<String> iterator = collect1.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        System.out.println("=============================");

        //toSet方法
        //适用于去重
        Set<String> collect2 = list.stream().filter(s -> "1".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(collect2);
//        Iterator<String> iterator2 = collect2.iterator();
//        while(iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }


        System.out.println("=============================");
        //如果我们要收集数据到map集合中，键不能重复，否则会报错
        Map<String, Integer> collect3 = list.stream().filter(s -> "1".equals(s.split("-")[1])).collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(collect3);
    }
}
