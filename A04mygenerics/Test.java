package A04mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<LiHuaCat> list = new ArrayList<>();
    }
    public static void keepPet(ArrayList<? extends Cat> list){
        //遍历集合，调用eat方法
    }
}
