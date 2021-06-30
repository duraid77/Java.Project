package day58_polymorphism;

public class Superman extends Father implements Worker{
    @Override
    public void work(String str) {
        System.out.println("superman is working " + str);
    }

    @Override
    public void getPaid() {
        System.out.println("Superman is getting paid a lot");
    }
}
