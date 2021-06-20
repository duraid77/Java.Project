package day55_abstraction_Exercise;

public abstract class Excercise {
    public void start(){
        System.out.println("Warming up and starting the excercise");
    }

    public abstract void perform();
    public abstract int getCaloriesCount(int minutes);
}
