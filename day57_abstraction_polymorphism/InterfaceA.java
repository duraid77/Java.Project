package day57_abstraction_polymorphism;

public interface InterfaceA {

    //interface can only have final classes
    public static final String TYPE = "interface";
    double MAX_COUNT = 500.0; //This is also public static final by default
    //private int num;  not allowed only public static final parameters can be declared inside interface

    //Can not have constructor in interface class
//    public InterfaceA(){
//        System.out.println("interface does not accept constructors");
//    }

    public abstract void absMethodD(int num);

    public static void staticMethodE(String str){
        //can not override this method in concrete class
        System.out.println("Static method E is called with str - " + str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called from interfaceA class");
    }

}
