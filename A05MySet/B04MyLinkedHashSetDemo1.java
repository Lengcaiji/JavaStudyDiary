package A05MySet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class B04MyLinkedHashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhaoliu", 22);
        Student s5 = new Student("zhaoliu", 22);

        //LinkedHashSet有序
        //如果去重默认使用HashSet,如果要求去重且存储有序使用LinkedHashSet
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s4));
        System.out.println(lhs.add(s5));

        System.out.println(lhs);

    }
}
