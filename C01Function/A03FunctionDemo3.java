package C01Function;

import java.util.ArrayList;
import java.util.Collections;

public class A03FunctionDemo3 {
    public static void main(String[] args) {
        /*
        集合中有一些名字，只要张开头的三个字的名字
        **/
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        //stream流方法
        list.stream().filter(s -> s.length() == 3 && s.startsWith("张")).forEach(System.out::println);
        //方法引用方法
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);
    }

}
