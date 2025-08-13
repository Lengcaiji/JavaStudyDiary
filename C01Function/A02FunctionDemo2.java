package C01Function;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class A02FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collect);
    }
}
