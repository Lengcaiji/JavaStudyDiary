package A03mygenerics.MyGenericsD2;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        ListUtil.addAll(list, "aaa" , "bbb" , "ccc" , "ddd");
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        ListUtil.addAll(list1, 1,2,3,4);
        System.out.println(list1);
    }
}
