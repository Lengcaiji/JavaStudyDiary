package E01File;

import java.io.File;

public class A01FileDemo1 {
    public static void main(String[] args) {
        String str = "D:\\NewCode\\A01Collection\\src\\E01File\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);

        String parent = "D:\\NewCode\\A01Collection\\src\\E01File";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File parent1 = new File("D:\\NewCode\\A01Collection\\src\\E01File");
        String child1 = "a.txt";
        File f3 = new File(parent1, child1);
        System.out.println(f3);

        File f4 = new File("D:\\NewCode\\A01Collection\\src");
        File[] files = f4.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
