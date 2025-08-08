package A05MySet;

public class B01HashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("zhangsan", 22);

        //如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
        //重写了hashCode方法，不同对象属性值相同，计算出来的哈希值也是一样的
        //在小部分情况下，不同属性值或者不同地址值计算出来的哈希值也可能一样（哈希碰撞）
        System.out.println(s1.hashCode());//未重写990368553 重写后-1461067293
        System.out.println(s2.hashCode());//未重写1096979270重写后-1461067293

        //哈希碰撞举例
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354

    }
}
