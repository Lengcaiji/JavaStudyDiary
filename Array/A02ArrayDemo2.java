import java.util.Scanner;

public class A02ArrayDemo2 {
    public static void main(String[] args) {
        //某比赛，录入六个评委打分，后计算平均分
        int[] score = new int[6];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score: ");
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        sum = sum / score.length;
        System.out.println(sum);
    }
}
