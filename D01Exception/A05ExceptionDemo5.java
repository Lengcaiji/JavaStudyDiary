package D01Exception;

public class A05ExceptionDemo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = getMax(arr);
        System.out.println(max);

    }

    public static int getMax(int[] arr) /*throws NullPointerException, ArrayIndexOutOfBoundsException**/ {
        if (arr == null) {
            //手动创建一个异常对象，并把这个异常交给方法的调用者处理
            //此时方法会到此结束，下面的代码都不会再执行了
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
