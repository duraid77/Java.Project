package day09_scanner_practice;
import java.util.Scanner;
public class temp_convert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit please: ");
        double tempF = scan.nextDouble();
        double tempC = (tempF - 32) *5 / 9;
        System.out.println("Convert temp in F " + tempF + " to celsius= " + tempC);



    }
}
