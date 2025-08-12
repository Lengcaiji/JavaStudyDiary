package A12CollectionText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Text1 {
    public static void main(String[] args) {
        //班级里有n个学生，学生属性：姓名，年龄，性别
        //实现随机点名
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan","lisi","wangwu","zhaoliu");

        Random r =  new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));
    }
}
