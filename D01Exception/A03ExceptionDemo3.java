package D01Exception;

public class A03ExceptionDemo3 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }

        System.out.println("我是否还会执行");
    }
}
