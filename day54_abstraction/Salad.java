package day54_abstraction;

public class Salad extends MenuItem{

    @Override
    public void prepare() {
        System.out.println("chop, mix, and then add dressing");
    }

    @Override
    public void serve() {
        System.out.println("serve it in a bowel with large tongues");
    }
}
