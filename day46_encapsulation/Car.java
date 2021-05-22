package day46_encapsulation;

public class Car {

    private String model;
    private int year;
    private double milage;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setMilage(double milage){
        this.milage = milage;
    }
    public double getMilage(){
        return milage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", milage=" + milage +
                '}';
    }
}