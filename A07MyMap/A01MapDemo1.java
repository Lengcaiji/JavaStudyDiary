package A07MyMap;

import java.util.HashMap;
import java.util.Map;

public class A01MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();

        //添加元素，键不能重复，值可以重复，方法返回null
        //在添加元素时，如果键存在，那么会把原有的键值对对象覆盖，会把被覆盖的值返回
        System.out.println(map1.put("zhao", "qian"));//null
        map1.put("sun","被覆盖");
        map1.put("zhou","wu");

        System.out.println(map1.put("sun", "覆盖"));//被覆盖

        System.out.println(map1);//{zhao=qian, sun=覆盖, zhou=wu}

        System.out.println("-------------------------------------");

        Map<String, String> map2 = new HashMap<>();
        map2.put("tom", "qian");
        map2.put("li", "si");
        map2.put("dog", "wu");
        map2.put("zheng", "wan");
        //删除元素,返回被删除的键值对的值
        System.out.println(map2.remove("li"));//si
        System.out.println(map2);//{tom=qian, zheng=wan, dog=wu}

        System.out.println("-------------------------------------");
        Map<String, String> map3 = new HashMap<>();
        map3.put("zhao", "qian");
        map3.put("li", "si");
        map3.put("dog", "wu");
        //清空集合
        map3.clear();
        //判断集合是否为空
        System.out.println(map3.isEmpty());//true

        System.out.println("-------------------------------------");

        Map<String, String> map4 = new HashMap<>();
        map4.put("zhao", "qian");
        map4.put("li", "si");
        map4.put("dog", "wu");
        map4.put("zheng", "wan");
        //判断是否包含 返回值是boolean类型的，存在返回true，不存在返回false
        //判断是否包含该键
        System.out.println(map4.containsKey("zhao"));//true
        System.out.println(map4.containsKey("sun"));//false
        //判断是否包含该值
        System.out.println(map4.containsValue("qian"));//true
        System.out.println(map4.containsValue("sun"));//false

        System.out.println("-------------------------------------");

        Map<String, String> map5 = new HashMap<>();
        map5.put("zhao", "qian");
        //判断集合是否为空
        System.out.println(map5.isEmpty());//false
        System.out.println(map5);

        System.out.println("-------------------------------------");

        Map<String, String> map6 = new HashMap<>();
        map6.put("zhao", "qian");
        map6.put("li", "si");
        map6.put("dog", "wu");
        map6.put("zheng", "wan");
        //集合的长度，返回一个整数类型
        System.out.println(map6.size());//4
    }
}
