package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car honda = new Car();
        honda.setModel("civic");
        honda.setYear(2020);
        honda.setMilage(79.8);

        System.out.println(honda.getModel());
        System.out.println(honda.getYear());
        System.out.println(honda.getMilage());

        System.out.println(honda.toString());

        System.out.println(honda);

        Car Toyota = new Car();
        Toyota.setModel("Camry");
        Toyota.setYear(2021);
        Toyota.setMilage(5000.4);
        System.out.println(Toyota);

    }
}
