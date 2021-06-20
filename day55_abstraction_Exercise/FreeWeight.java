package day55_abstraction_Exercise;

public class FreeWeight extends Lifting{
    @Override
    public void perform() {
        System.out.println("performaing freeweight lifting");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*5;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}
