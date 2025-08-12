package B02StreamText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text3 {
    public static void main(String[] args) {
        /*现在有两个ArrayList集合，
          第一个集合中：存储6名男演员的名字和年龄。
          第二个集合中：存储6名女演员的名字和年龄
          姓名和年龄中间用逗号隔开
          要求：
          1，男演员只要名字3个字的前两人
          2，女演员只要姓邓的，且只要邓紫棋
          3，把过滤后的男演员和女演员合并到一起
          4，将上一步的演员信息封装成Actor对象
          5，将所有演员都保存到List集合中
          备注：演员类Actor，属性只有name，age
        **/
        ArrayList<String> maleActors = new ArrayList<>();
        Collections.addAll(maleActors, "张译,45", "张若昀,35", "李现,32", "邓超,44", "张艺兴,31", "胡歌,40");

        ArrayList<String> femaleActors = new ArrayList<>();
        Collections.addAll(femaleActors, "邓紫棋,31", "杨幂,36", "迪丽热巴,30", "邓婕,65", "邓紫怡,28", "杨紫,30");

        //处理男演员
        Stream<String> filteredmales = maleActors.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        //处理女演员，只留解解
        Stream<String> filteredFemales = femaleActors.stream().filter(s -> s.split(",")[0].equals("邓紫棋"));

        List<Actor> collect = Stream.concat(filteredmales, filteredFemales).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());

        Iterator<Actor> iterator = collect.iterator();
        while (iterator.hasNext()) {
            Actor actor = iterator.next();
            System.out.println(actor);
        }

    }
}
