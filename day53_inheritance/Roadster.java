package day53_inheritance;

public class Roadster extends ElectricCar{

    public Roadster(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
        System.out.println("congrats on your new Roadster");
    }
}
