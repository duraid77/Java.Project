package day57_abstraction_polymorphism;

public abstract class AbstractA {

    int num1;
    private double price;
    static int count;
    public final String type= "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA(){
        System.out.println("Abstracter class constructor");
    }
    //Abstract method can not be private or static or final
    //Abstract methods are created to be overridden in concrete/child classes
    public abstract void absMethodA();

    public void methodB(){
        System.out.println("methodB");
    }
    public static void staticMethodC(){
        System.out.println("Static methodC is called");
    }




}
