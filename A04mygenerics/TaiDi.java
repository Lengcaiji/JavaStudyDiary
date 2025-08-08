package A04mygenerics;

public class TaiDi extends Dog{

    @Override
    public void eat() {
        System.out.println("一只叫做"+ getName() + "的," + getAge() + "岁的泰迪正在吃小骨头，边吃边蹭");
    }
}
