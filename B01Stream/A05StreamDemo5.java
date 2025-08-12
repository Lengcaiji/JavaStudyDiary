package B01Stream;

import java.util.stream.Stream;

public class A05StreamDemo5 {
    public static void main(String[] args) {
        //零散数据获取stream流，需要数据是同一种数据类型
        Stream.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);
    }
}
