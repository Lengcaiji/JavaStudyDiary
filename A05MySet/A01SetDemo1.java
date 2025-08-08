package A05MySet;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01SetDemo1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        //当前元素第一次添加则添加成功返回true
        //当前元素第二次添加则添加失败返回false
        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");

        //set集合无索引
        //set集合是无序的
        //System.out.println(s);

        //迭代器遍历
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //增强for遍历
        for (String str1 : s) {
            System.out.println(str1);
        }
        //lambda表达式遍历
        s.forEach((String str2) -> System.out.println(str2) );
    }
}
