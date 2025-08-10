package A05MySet;

import java.util.TreeSet;

public class D02TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",22);
        Student s2 = new Student("lisi",23);
        Student s3 = new Student("zhangsan",22);

        TreeSet<Student> ts = new TreeSet<>();
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));

        System.out.println(ts);

    }
}
