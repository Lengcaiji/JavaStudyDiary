package A04mygenerics;

public class LiHuaCat extends Cat{

    @Override
    public void eat() {
        System.out.println("一只叫做"+ getName() + "的," + getAge() + "岁的狸花猫正在吃小鱼干");
    }
}
