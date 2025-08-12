package B01Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class A02StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");

//        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);
        //单列数组获取stream流
        list.stream().forEach(System.out::println);
    }
}
