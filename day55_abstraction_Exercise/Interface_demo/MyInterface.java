package day55_abstraction_Exercise.Interface_demo;

public interface MyInterface {
public abstract void learn();
}

class MyClass implements MyInterface{

    @Override
    public void learn() {

    }
}

class Main{
    public static void main(String[] args) {
     //   MyInterface myInterface = new MyInterface(); Error: Can not create object of interface

        MyClass myClass = new MyClass();





    }
}
