package A03mygenerics.MyGenericsD2;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}
    public static <E> void addAll(ArrayList list,E e,E e2,E e3,E e4){
        list.add(e);
        list.add(e2);
        list.add(e3);
        list.add(e4);

    }
}
