package D03ExceptionText;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        /*键盘录入一个人的姓名和年龄
          姓名的长度在3-10之间
          年龄的范围在18-40岁
          超出这个范围的异常数据不能赋值，需要重新录入，直到录入正确位置
        **/
        Scanner sc = new Scanner(System.in);
        Friend f = new Friend();

        while (true) {
            try {
                System.out.println("输入名字: ");
                String name = sc.nextLine();
                f.setName(name);
                System.out.println("输入年龄: ");
                int age = Integer.parseInt(sc.nextLine());
                f.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundException e) {
                e.printStackTrace();
            }
        }

        System.out.println(f);


    }
}
