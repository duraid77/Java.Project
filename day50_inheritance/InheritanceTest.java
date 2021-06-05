package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;
        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();
        t1.walk();
        t1.work("Teacher");
        t1.teach("java inheritance");

        Student st1 = new Student();
        st1.name = "Ali";
        st1.age = 33;
        st1.study("Java programming");
        st1.walk();
        st1.talk();


    }
}
