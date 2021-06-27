package day57_abstraction_polymorphism;

public interface InterfaceA {
    public abstract void absMethodD(int num);

    public static void staticMethodE(String str){
        //can not override this method in concrete class
        System.out.println("Static method E is called with str - " + str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called from interfaceA class");
    }

}
