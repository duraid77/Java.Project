package day50_inheritance;

public class Person {
    String name;
    int age;
    public void walk(){
        System.out.println("person is walking");
    }
    public void talk(){
        System.out.println("person is talking");
    }
    public void work(String job){
        System.out.println(name + " is working as " + job);
    }
}
