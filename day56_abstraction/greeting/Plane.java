package day56_abstraction.greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting{
    @Override
    public void hi() {
        System.out.println("Hello from the skies");
    }

    @Override
    public void bye() {
        System.out.println("Hope you have enjoyed the flight. Bye");
    }

    @Override
    public void autoDrive() {
        System.out.println("Plane Auto pilot is engaged");
    }

    @Override
    public void autoPiloting() {

    }

    @Override
    public void transportPeople() {
        System.out.println("Airbus 380 can transport up to 500 people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Cost for the flight is " + mile * .23 + "$");
    }

    public void land() {
        System.out.println("smooth landing");
    }
}
