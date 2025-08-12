package B01Stream;

import java.util.ArrayList;
import java.util.Collections;

public class A08StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"A-1","B-2","C-3","D-4");
        //转换流中的数据类型
        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
    }
}
