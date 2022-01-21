package PracticeBeforeExam;

public class Dog {
    String name;
    int age;
    String color;

    Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public void setName(String name1){
        name = name1;
    }
    public void setAge(int age1){
        age = age1;
    }
    public void setColor(String color1){
        color = color1;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
