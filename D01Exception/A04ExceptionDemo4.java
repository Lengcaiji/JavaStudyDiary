package D01Exception;

public class A04ExceptionDemo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
            //Index 10 out of bounds for length 5
            String string = e.toString();
            System.out.println(string);
            //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
            e.printStackTrace();
            //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
            //	at D01Exception.A04ExceptionDemo4.main(A04ExceptionDemo4.java:8)
        }

        System.out.println("walawalawa");
    }
}
