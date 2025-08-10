package A06TreeSetDemo;

import A06TreeSetDemo.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudent {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22, 64, 89, 50);
        Student s2 = new Student("lisi", 23, 88, 78, 50);
        Student s3 = new Student("wangwu", 21, 64, 89, 50);
        Student s4 = new Student("zhaoliu", 23, 99, 70, 70);
        Student s5 = new Student("qianqi", 25, 97, 80, 90);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        Iterator<Student> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
