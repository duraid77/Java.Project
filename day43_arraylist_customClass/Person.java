package day43_arraylist_customClass;

public class Person {
    String firstname;
    int age;
    char gender;
    public void speak(){
        System.out.println("Person is speaking");
    }

}
class people{
    public static void main(String[] args) {
        // create object from Person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstname = "Duraid";
        person1.age = 44;
        person1.gender= 'm';
        System.out.println(person1.firstname);
        System.out.println(person1.age);
        person1.speak();


        // create another object
        Person person2 = new Person();
        person2.firstname = "mike";
        person2.age = 12;
        person2.gender ='f';
        person2.speak();
        System.out.println("person2 = " + person2.firstname);
        System.out.println("person2.age = " + person2.age);
    }
}