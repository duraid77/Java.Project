package day55_abstraction_Exercise;

public class Running extends Excercise{


    @Override
    public void perform() {
        System.out.println("Running exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 17;
    }
}
