package A02myList;

import java.util.ArrayList;
import java.util.List;

public class A01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //原元素会依次后移
        list.add(1,"qqq");

        //1.直接删除元素/2.根据索引删除
        String str = list.remove(2);
        System.out.println(str);

        String result = list.set(0,"qqq");
        System.out.println(result);

        System.out.println(list);
    }
}
