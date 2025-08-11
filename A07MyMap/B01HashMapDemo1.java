package A07MyMap;

import A05MySet.Student;

import java.util.HashMap;
import java.util.Set;

public class B01HashMapDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",22);
        Student s2 = new Student("lisi",23);

        HashMap<Student, String> map = new HashMap<Student, String>();
        map.put(s1,"黑龙江");
        map.put(s2,"吉林");

        Set<Student> students = map.keySet();
        for(Student s : students){
            System.out.println(s + "=" + map.get(s));
        }
        System.out.println(map);
    }
}
