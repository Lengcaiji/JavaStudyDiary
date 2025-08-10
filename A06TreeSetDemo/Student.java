
package A06TreeSetDemo;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int Chinese;
    private int Math;
    private int English;


    public Student() {
    }

    public Student(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        Chinese = chinese;
        Math = math;
        English = english;
    }

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
        this.age = age;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    @Override
    public String toString() {
        int sum = 0;
        sum = Chinese + Math + English;
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                ", sum=" + sum +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int sum1 = o.Chinese + o.Math + o.English;
        int sum2 = this.Chinese + this.Math + this.English;

        int i = sum1 - sum2;//按照总分排序
        i = i == 0 ? o.getChinese() - this.Chinese : i;//如果总分一样按照语文分数排序
        i = i == 0 ? o.getMath() - this.getMath() : i;//如果语文分数一样按照数学分数排序
        i = i == 0 ? o.getEnglish() - this.getEnglish() : i;//如果数学分数一样按照英语分数排序
        i = i == 0 ? this.getAge() - o.getAge() : i;//如果英语分数一样按照年龄排序
        i = i == 0 ? o.getName().compareTo(this.getName()) : i;//如果年龄一样按照姓名首字母排序

        return i;
    }
}
