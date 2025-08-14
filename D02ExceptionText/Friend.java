package D02ExceptionText;

public class Friend {
    private String name;
    private int age;

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public Friend() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<3||name.length()>10){
            throw new RuntimeException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18||age>30){
            throw new RuntimeException();
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
