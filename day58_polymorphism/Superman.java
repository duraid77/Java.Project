package day58_polymorphism;

public class Superman extends Father implements Worker{
    @Override
    public void work() {
        System.out.println("superman is working");
    }

    @Override
    public void getPaid() {

    }
}
