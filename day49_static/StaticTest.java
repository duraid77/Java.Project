package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        StaticMethods.displayMessage("Hello World");
        StaticMethods.anotherStaticMethod();

        StaticMethods newMethod = new StaticMethods();
        System.out.println(newMethod.num);
       newMethod.instanceMethod();
    }
}
