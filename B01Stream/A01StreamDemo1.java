package B01Stream;

import java.util.ArrayList;
import java.util.Collections;

public class A01StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "赵强", "张三丰");
        //
        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(System.out::println);
    }
}
