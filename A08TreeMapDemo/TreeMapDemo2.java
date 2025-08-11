package A08TreeMapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm1 = new TreeMap<>();
        tm1.put(1,"A商品");
        tm1.put(3,"B商品");
        tm1.put(2,"C商品");
        tm1.put(4,"D商品");
        //升序，默认升序
        System.out.println(tm1);

        System.out.println("-------------------------------------");
        //降序，调用comparator接口
        TreeMap<Integer,String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2-o1;
            }
        });
        tm2.put(1,"A商品");
        tm2.put(3,"B商品");
        tm2.put(2,"C商品");
        tm2.put(4,"D商品");
        System.out.println(tm2);
    }
}
