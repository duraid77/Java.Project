package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        startMoving();
    }
    public static void seatInCar(){

        System.out.println("1. Open the door and seat in the driver seat");
    }
    public static void startTheCar(){
        System.out.println(("2. press the breaks and push the start button"));
    }
    public static void startMoving(){
        System.out.println("3. Put shift to D and start driving");
    }
}
