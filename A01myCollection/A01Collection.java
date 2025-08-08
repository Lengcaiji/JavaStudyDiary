package A01myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A01Collection {
    public static void main(String[] args) {
        //创建集合并添加元素
        Collection<String> coll = new ArrayList();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //获取迭代器对象
        Iterator<String> it = coll.iterator();
        //利用循环获取集合中的每一个元素
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + ' ');
        }
        //迭代器指针不会复位，如果要二次遍历需要获取第二个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()) {
            String str = it2.next();
            System.out.print(str + ' ');
        }
    }
}
