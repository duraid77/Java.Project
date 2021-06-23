package day56_abstraction.greeting;

public interface SelfDrivable {

    void autoDrive();
    void autoPiloting();
    public default void selfPark(){
        System.out.println("Performaing self park steps");
    }
}
