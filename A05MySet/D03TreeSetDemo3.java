package A05MySet;

import java.util.Comparator;
import java.util.TreeSet;

public class D03TreeSetDemo3 {
    public static void main(String[] args) {
        //比较器排序
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                //按照长度排序
                int i = o1.length() - o2.length();
                //如果一样长则按照首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        //要按照长度排序，相同长度按照首字母排序

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}
