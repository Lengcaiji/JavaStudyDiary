package A02myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A02List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
        //增强for遍历
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();
        //lambda遍历
        list.forEach((String s2) -> System.out.print(s2 + " "));

        System.out.println();
        //普通for遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s + " ");
        }

        System.out.println();
        //列表迭代器
        ListIterator<String> it2 = list.listIterator();
        while(it2.hasNext()){
            String str = it2.next();
            if("BBB".equals(str)){
                it2.add("qqq");
            }

        }
        System.out.print(list);
    }
}
