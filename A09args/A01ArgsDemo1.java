package A09args;

public class A01ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5));
    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
