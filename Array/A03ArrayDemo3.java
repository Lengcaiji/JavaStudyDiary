public class A03ArrayDemo3 {
    public static void main(String[] args) {
        //数组求最值
        int[] arr = {15,9000,10000,20000,9500,-5};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > max) {
               max = arr[i];
           }
        }
        System.out.println(max);
    }
}
