package day56_abstraction.greeting;

public abstract class Transportation {
    public abstract void transportPeople();
    public abstract void cost(int mile);
    public void start(){
        System.out.println("Start the engine");
    }
    public void stop(){
        System.out.println("shut off the engine");
    }

}
