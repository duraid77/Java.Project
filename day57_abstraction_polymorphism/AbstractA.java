package day57_abstraction_polymorphism;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String type= "abstract";
    public static final String LANGUAGE = "java";

    public abstract void absMethodA();
    public void methodB(){
        System.out.println("methodB");
    }
    public static void staticMethodC(){
        System.out.println("Static methodC is called");
    }




}
