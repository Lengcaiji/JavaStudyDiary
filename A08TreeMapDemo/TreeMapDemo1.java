package A08TreeMapDemo;



import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",22);
        Student s2 = new Student("lisi",23);
        Student s3 = new Student("wangwu",21);
        Student s4 = new Student("zhaoliu",22);
        Student s5 = new Student("zhaoliu",22);

        TreeMap<Student,String> tm = new TreeMap<>();
        tm.put(s1,"黑龙江");
        tm.put(s2,"吉林");
        tm.put(s3,"四川");
        tm.put(s4,"云南");
        tm.put(s5,"天津");

        Set<Map.Entry<Student, String>> entries = tm.entrySet();
        System.out.println(tm.size());
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }

    }
}
