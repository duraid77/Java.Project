package day55_abstraction_Exercise;

public class AtTheGym {
    public static void main(String[] args) {
    Excercise excercise = new Running();
    Running running = new Running();
    Swimming swimming = new Swimming();
    Lifting lifting = new FreeWeight();
    FreeWeight freeWeight = new FreeWeight();


    swimming.start();
    swimming.getCaloriesCount(30);
    swimming.perform();



    }
}
