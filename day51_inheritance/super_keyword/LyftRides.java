package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftxlRide = new LyftXL();
        Lux luxRide = new Lux();

        System.out.println("Lyftride for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("LyftXLride for 5 miles = $" + Math.round(lyftxlRide.calculateRate(5)));
        System.out.println("LUX for 5 miles = $" + luxRide.calculateRate(5));


    }
}
