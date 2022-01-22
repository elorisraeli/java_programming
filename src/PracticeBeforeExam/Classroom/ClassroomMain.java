package PracticeBeforeExam.Classroom;

public class ClassroomMain {
    public static void main(String[] args) {

        Classroom classroom = new Classroom();
        Student s1 = new Student(123456789, "david");
        Student s2 = new Student(24680, "shaul");
        Student s3 = new Student(13579, "yoel");
        Student s4 = new Student(123123123, "ben");
        Student s5 = new Student(456456456, "nitzan");
        Student s6 = new Student(789789789, "eitan");

        classroom.add(s1);
        classroom.add(s2);
        classroom.add(s3);
        classroom.add(s4);
        classroom.add(s5);
        classroom.add(s6);

        System.out.println(classroom.getSize());

        classroom.remove(s5);
        System.out.println(classroom.getSize());
    }
}
