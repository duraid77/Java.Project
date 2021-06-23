package day56_abstraction.greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting{
    @Override
    public void transportPeople() {
        System.out.println("Tesla tansports 5 people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("The cost for driving a tesla for miles = " + mile *.25 + "$");
    }

    @Override
    public void autoDrive() {
        System.out.println("Tesla implements autoDrive, but you can lose your life if you use it.");
    }

    @Override
    public void autoPiloting() {

    }

    @Override
    public void hi() {
        System.out.println("Hello Tesla");
    }

    @Override
    public void bye() {
        System.out.println("You are too expensive. Bye Bye");
    }
}
