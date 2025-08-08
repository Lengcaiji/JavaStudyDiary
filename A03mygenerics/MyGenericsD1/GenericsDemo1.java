package A03mygenerics.MyGenericsD1;

public class GenericsDemo1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        System.out.println(list);

        String str = list.get(1);
        System.out.println(str);
    }
}
