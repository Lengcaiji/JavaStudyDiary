package D01Exception;

public class A01ExceptionDemo1 {
    public static void main(String[] args) {

        Student[] arr = new Student[3];
        String name = arr[0].getName();
        System.out.println(name);
        //NullPointerException空指针异常
    }
}
