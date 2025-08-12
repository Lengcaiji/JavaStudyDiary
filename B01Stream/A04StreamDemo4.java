package B01Stream;

import java.util.Arrays;

public class A04StreamDemo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //数组获取stream流
        Arrays.stream(arr).forEach(System.out::println);
        /*
            Stream接口中的静态方法of的细节
            方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
            但是数组必须是引用数据类型的，如果传递基本数据类型，
            会把整个数据当作一个元素放到stream流中
        **/
    }
}
