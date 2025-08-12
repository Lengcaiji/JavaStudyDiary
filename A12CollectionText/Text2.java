package A12CollectionText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Text2 {
    public static void main(String[] args) {
        /*班级有N个学生
        要求：70%随机到男生
             30%随机到女生
        **/
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0,0,0);

        Random r = new Random();
        int index = r.nextInt(list.size());
        Collections.shuffle(list);
        int number = list.get(index);
        System.out.println(list.get(index));

        ArrayList<String> boylist = new ArrayList<>();
        Collections.addAll(boylist, "A", "B", "C", "D", "E", "F", "G", "H", "I");
        ArrayList<String> girllist = new ArrayList<>();
        Collections.addAll(girllist, "L", "K", "J", "M", "N", "R", "S", "T");

        if(number == 1){
            int boyIndex = r.nextInt(boylist.size());
            System.out.println(boylist.get(boyIndex));
        }else{
            int girlIndex = r.nextInt(girllist.size());
            System.out.println(girllist.get(girlIndex));
        }

    }
}
