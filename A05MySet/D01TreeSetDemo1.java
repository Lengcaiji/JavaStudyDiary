package A05MySet;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class D01TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet();

        ts.add(4);
        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(5);
        //TreeSet可排序
        System.out.println(ts);//[1, 2, 3, 4, 5]

        //再刷遍历方法
        //迭代器
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();
        //增强for
        for (Integer t : ts) {
            System.out.print(t + " ");
        }

        System.out.println();
        //lambda表达式
        ts.forEach((Integer t) -> System.out.print(t + " "));
    }
}
