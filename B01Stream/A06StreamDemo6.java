package B01Stream;

import java.util.ArrayList;
import java.util.Collections;

public class A06StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"张无忌","周芷若","张二麻子","张三丰","周报","张飞","谢广坤");

        list.stream().limit(4).skip(2).filter(name -> name.startsWith("张")).forEach(System.out::println);

    }
}
