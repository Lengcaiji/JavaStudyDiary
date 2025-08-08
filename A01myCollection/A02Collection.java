package A01myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class A02Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("ZHANGSAN");
        coll.add("LISI");
        coll.add("WANGWU");

        //s是第三方变量，在循环过程中依次表示集合中的每一个数据
        for(String s : coll){
            System.out.print(s + " ");
        }
        //快捷生成方式 coll for
    }
}
