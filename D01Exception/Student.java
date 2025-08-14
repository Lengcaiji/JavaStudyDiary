package D01Exception;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            throw new RuntimeException();
        }else{
            this.age = age;
        }

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
