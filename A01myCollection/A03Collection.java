package A01myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class A03Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("ZHANGSAN");
        coll.add("LISI");
        coll.add("WANGWU");

        //lambda表达式
        coll.forEach((String s) -> System.out.println(s) );
    }
}
