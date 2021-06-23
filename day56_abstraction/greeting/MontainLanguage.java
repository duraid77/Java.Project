package day56_abstraction.greeting;

public class MontainLanguage implements Greeting {
    @Override
    public void hi() {
        System.out.println("Zee");
    }

    @Override
    public void bye() {
        System.out.println("Boaa");
    }
}
