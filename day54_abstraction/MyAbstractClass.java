package day54_abstraction;

public abstract class MyAbstractClass {

    public void learn(){
        System.out.println("learning");
    }
public void close(){
    System.out.println("abstract method");

}
}

class Sub extends MyAbstractClass{
    public void close(){
        System.out.println("implementation for close method");

    }

}


class MyObjects{
    public static void main(String[] args) {
    Sub sub = new Sub();
    sub.learn();
    }
}