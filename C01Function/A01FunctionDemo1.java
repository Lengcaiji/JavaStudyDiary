package C01Function;

import java.util.Arrays;

public class A01FunctionDemo1 {
    public static void main(String[] args) {

        Integer[] arr = {3, 5, 4, 1, 6, 2};
        //方法引用
        Arrays.sort(arr,A01FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));

    }

    public static int subtraction(int a, int b) {
        return b - a;
    }
}
