package day47_constructors;

public class Student {
    // no_args constructor
    public Student(){
        System.out.println("No-Args Constructor initialized");
    }


    public Student(String name) {
        System.out.println("Student name: " + name);
    }

    public Student(String name, int age) {
        System.out.println("Student " + name + " is " + age);
    }
}
