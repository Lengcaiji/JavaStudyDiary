package A04mygenerics;

public class HaShiQi extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫做"+ getName() + "的," + getAge() + "岁的哈士奇正在拆家");
    }
}
