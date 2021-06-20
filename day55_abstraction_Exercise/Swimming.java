package day55_abstraction_Exercise;

public class Swimming extends Excercise{
    @Override
    public void perform() {
        System.out.println("person is swimming");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 10;
    }
}
