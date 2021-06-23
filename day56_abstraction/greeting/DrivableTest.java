package day56_abstraction.greeting;

public class DrivableTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.start();
        plane.stop();
        plane.hi();
        plane.bye();
        plane.transportPeople();
        plane.land();
    }
}
