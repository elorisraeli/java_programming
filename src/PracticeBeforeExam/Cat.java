package PracticeBeforeExam;

public class Cat implements Animal{
    private int age;
    private String name;
    private String color;

    Cat(int age, String name, String color){
        this.age = age;
        this.color = color;
        this.name =name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getColor() {
        return color;
    }
}
