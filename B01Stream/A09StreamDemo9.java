package B01Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class A09StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "A", "B", "C");
        list.stream().forEach(System.out::println);

        System.out.println(list.stream().count());
        //System.out.println(list.stream().filter(s -> s.startsWith("D")).count());

        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));

        list.stream().toArray();


    }
}
