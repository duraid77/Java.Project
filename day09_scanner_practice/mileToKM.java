package day09_scanner_practice;
import java.util.Scanner;
//1.60934
public class mileToKM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double distMiles = scan.nextDouble();

        double distinKM = distMiles * 1.60934;

        System.out.println("Distance in KM = " + distinKM + "KM");
    }
}
