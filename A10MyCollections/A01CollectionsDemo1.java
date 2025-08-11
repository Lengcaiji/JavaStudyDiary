package A10MyCollections;

import java.util.ArrayList;
import java.util.Collections;

public class A01CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //批量添加
        Collections.addAll(list, "A", "B", "C", "D", "E");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
