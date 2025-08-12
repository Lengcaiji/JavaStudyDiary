package B02StreamText;

import java.util.ArrayList;
import java.util.Collections;

public class Text1 {
    public static void main(String[] args) {
        /*定义一个集合，并添加1，2，3，4，5，6，7，8，9，10
          过滤奇数，只留下偶数
          并将结果保存
        **/
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().filter(s->s%2==0).forEach(System.out::println);

    }
}
