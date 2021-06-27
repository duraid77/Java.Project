package day57_abstraction_polymorphism;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    //First child class of abstract class is called concrete

    @Override
    public void absMethodA(){
        System.out.println("Abstract methodA in concrete class");
    }

    @Override
    public void methodB(){
        System.out.println("overriding this method is optional.");
    }

    //@Override Can not override static method
    public static void staticMethodC(){
        System.out.println("Can not override static method");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("Method D from Interface A overridden at concrete class");
    }
}
