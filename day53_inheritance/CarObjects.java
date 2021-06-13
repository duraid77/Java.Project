package day53_inheritance;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("tesla", "type S", 99999.99,2021,350);
        tesla.drive(50);
        System.out.println(tesla);

        System.out.println("tesla make = " + tesla.getMake());
        System.out.println("tesla year = " + tesla.getYear());

        if(tesla.getPrice()> 10000){
            System.out.println("It is out of my budges");
            }

        Roadster roadster = new Roadster("Roadstr", "es50", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        System.out.println("roadster.getCount() = " + roadster.getCount());

        ModelX modelX = new ModelX("Tesla", "Model X", 89900.00, 2022, 350);
        System.out.println(modelX.toString());
        modelX.drive(10);
        System.out.println(modelX.getCount());

    }
}
