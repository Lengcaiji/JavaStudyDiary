package B01Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class A07StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "A", "A", "B", "C", "D", "E");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "D", "E", "F");

        list1.stream().distinct().forEach(s -> System.out.print(s + " "));//去重

        System.out.println();

        System.out.println("======================================");

        //合并两个流 concat()
        Stream.concat(list1.stream(), list2.stream()).distinct().forEach(s -> System.out.print(s + " "));


    }
}
