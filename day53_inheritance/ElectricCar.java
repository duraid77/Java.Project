package day53_inheritance;

public class ElectricCar {
    private String make:
    private String model;
    private double price;
    private int year;
    private int range;

    public ElectricCar(String make, String model, double price, int year, int range) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
    }

    protected void drive(int miles){
    if(range == 0 || range- miles <0){
        System.out.println("Error: Can not drive that far. Charge please");
    }else{
        System.out.println("have a safe trip");
    }
    }


    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }
}
