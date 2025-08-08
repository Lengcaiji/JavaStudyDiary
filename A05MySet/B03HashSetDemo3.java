package A05MySet;

import java.util.HashSet;

public class B03HashSetDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 22);
        Student s4 = new Student("zhangsan", 22);

        HashSet<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}
