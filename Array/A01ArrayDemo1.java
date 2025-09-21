public class A01ArrayDemo1 {
    public static void main(String[] args) {
        //某部门5名员工的销售额分别是：16，26，36，6，100
        //算总销售额
        int[] arr = {16, 26, 36, 6, 100};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        System.out.println(temp);
    }
}
